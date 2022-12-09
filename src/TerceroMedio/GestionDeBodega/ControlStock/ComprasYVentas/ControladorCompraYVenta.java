package TerceroMedio.GestionDeBodega.ControlStock.ComprasYVentas;

import java.awt.event.ActionEvent;
import java.util.Iterator;

import javax.swing.JOptionPane;

import TerceroMedio.AtencionAlCliente.RegClientes.ModeloRegClientes;
import core.Controller;
import core.CrudRepository;
import core.Helpers;
import core.ManagerDB;
import core.Vista;
import ui.Mensejes.Mensajes;

public class ControladorCompraYVenta implements Controller {
	
	private VistaCompraYVenta vista; 
	private CompraYVentaRepository repository;

	public ControladorCompraYVenta(VistaCompraYVenta vista){
		this.vista = vista;
		
		this.repository = new CompraYVentaRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vista.getCrud().getBtnAgregar())) {
			
			if (vista.isCamposVacios()) {
				
				CompraYVentaEntity record = new CompraYVentaEntity();
				
				String[] product = vista.getTxtProducto().getText().split(",");
				
				record.setFecha(vista.getDateFecha().getCalendar());
				record.setOperacion(vista.getComboBoxOperacion().getSelectedItem().toString());
				record.setComprobante(vista.getTxtComprobante().getText());
				record.setCodigo(product[0]);
				record.setProducto(product[1]);
				record.setCategoria(product[2]);
				record.setCantidad(Integer.parseInt(vista.getTxtCantidad().getText()));

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
			
		}else if (e.getSource().equals(vista.getCrud().getBtnModificar())) {
			Long id = vista.getCrud().getRowId();
			if (id >= 0) {
				CompraYVentaEntity record = repository.find(id);
				vista.cargarForm(record);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource().equals(vista.getCrud().getBtnEliminar())) {
			Long id = vista.getCrud().getRowId();
			if (id != null) {
				CompraYVentaEntity record = repository.find(id);
				repository.delete(record);
				vista.actualizarVista();
			}
		}
		
	}

	private void actualizar(CompraYVentaEntity record) {
		// TODO Auto-generated method stub
		CompraYVentaEntity db = this.repository.update(record);

		if (db != null) {
			vista.vaciarForm();
			Mensajes.Actualizacion();
		}
	}

	private void guardar(CompraYVentaEntity record) {
		// TODO Auto-generated method stub
		CompraYVentaEntity db = this.repository.create(record);

		if (db != null) {
			vista.vaciarForm();
			Mensajes.Creacion();
		}
	}

	@Override
	public void LlenarTabla() {
		Iterator<CompraYVentaEntity> lista = this.repository.findAll().iterator();
		
		
		this.vista.getCrud().getTable().getModel().getDataVector().removeAllElements();
		this.vista.getCrud().getTable().getModel().fireTableDataChanged();

		while (lista.hasNext()) {
			CompraYVentaEntity records = lista.next();
			this.vista.getCrud().getTable().getModel().addRow(
					new Object[] { 
							records.getId(), 
							Helpers.getFechaFormat(records.getFecha()),
							records.getOperacion(),
							records.getComprobante(),
							records.getProducto(),
							records.getCantidad()
					});
			}
	}

}
