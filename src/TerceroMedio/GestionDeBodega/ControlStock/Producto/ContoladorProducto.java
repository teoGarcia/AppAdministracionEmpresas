package TerceroMedio.GestionDeBodega.ControlStock.Producto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import TerceroMedio.AtencionAlCliente.RegClientes.ModeloRegClientes;
import TerceroMedio.GestionDeBodega.ControlStock.ComprasYVentas.CompraYVentaEntity;
import TerceroMedio.GestionDeBodega.ControlStock.ComprasYVentas.CompraYVentaRepository;
import TerceroMedio.GestionDeBodega.ControlStock.Stock.StockPanel;
import core.ManagerDB;
import ui.Mensejes.Mensajes;
import ui.imprimir.VistaImprimir;

public class ContoladorProducto implements ActionListener {

	private VistaProducto vista;
	private ProductoRepository repository;
	private VistaImprimir imprimir;
	private CompraYVentaRepository repositoryCV;

	ContoladorProducto(VistaProducto vista) {
		this.repository = new ProductoRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		
		this.repositoryCV = new CompraYVentaRepository();
		this.repositoryCV.setEm(ManagerDB.getEntityManager());
		
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		// btnGuardar
		if (e.getSource().equals(vista.getCrud().getBtnAgregar())) {

			if (vista.CamposVacios()) {

				ProductoEntity record = new ProductoEntity();

				record.setCodigo(vista.getTxtCodigo().getText());
				record.setProducto(vista.getTxtProducto().getText());
				record.setCategoria(vista.getTxtCategoria().getText());

				// guarda
				if (vista.getId() <= 0 && vista.getId() != null) {
					this.guardar(record);

					// actualiza
				} else {
					record.setId(vista.getId());
					this.actualizar(record);
				}

				vista.actualizarVista();

			} else {
				Mensajes.CamposVacios();
			}

		} else if (e.getSource().equals(vista.getCrud().getBtnModificar())) {
			Long id = vista.getCrud().getRowId();
			if (id >= 0) {
				ProductoEntity record = repository.find(id);
				vista.cargarForm(record);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource().equals(vista.getCrud().getBtnEliminar())) {
			Long id = vista.getCrud().getRowId();
			if (id != null) {
				ProductoEntity record = repository.find(id);
				repository.delete(record);
				vista.actualizarVista();
			}
		} else if(e.getSource().equals(vista.getCrud().getBtnImprimir())) {
			
			if(imprimir == null) imprimir = VistaImprimir.instance();
			
			imprimir.resetImprimir();
			
			imprimir();
			
			
		}
	}
	
	
	private void imprimir() {
		
		Long productoId = vista.getCrud().getRowId();
		
		if (productoId != null) {
			
			String name = vista.getCrud().getSeledRow(2);
			
			StockPanel pi = new StockPanel();
			
			pi.getTxtProducto().setText(name);;
			
			Iterator<CompraYVentaEntity> lista = this.repositoryCV.findForProducto(productoId).iterator();
			
			pi.CargarTabla(lista);
			
			imprimir.registerPanel(pi, "stock");
			
			imprimir.setVisible(true);
			
		}
		
	}

	private void actualizar(ProductoEntity record) {
		// TODO Auto-generated method stub
		ProductoEntity db = this.repository.update(record);

		if (db != null) {
			vista.vaciarForm();
			Mensajes.Actualizacion();
		}
	}

	private void guardar(ProductoEntity record) {
		// TODO Auto-generated method stub
		ProductoEntity db = this.repository.create(record);

		if (db != null) {
			vista.vaciarForm();
			Mensajes.Creacion();
		}
	}

	public void LlenarTabla() {

		Iterator<ProductoEntity> lista = this.repository.findAll().iterator();

		this.vista.getCrud().getTable().getModel().getDataVector().removeAllElements();
		this.vista.getCrud().getTable().getModel().fireTableDataChanged();

		while (lista.hasNext()) {
			ProductoEntity records = lista.next();
			this.vista.getCrud().getTable().getModel().addRow(
					new Object[] { records.getId(), records.getCodigo(), records.getProducto(), records.getCategoria()

					});
		}
	}
}