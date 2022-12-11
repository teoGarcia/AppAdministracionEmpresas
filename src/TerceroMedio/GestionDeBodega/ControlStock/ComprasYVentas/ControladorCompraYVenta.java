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
	
				int cantidad = Integer.parseInt(vista.getTxtCantidad().getText());
				String operacion = vista.getComboBoxOperacion().getSelectedItem().toString();
				
				record.setIdProducto(Long.parseLong(product[0]));
				record.setFecha(vista.getDateFecha().getCalendar());
				record.setOperacion(operacion);
				record.setComprobante(vista.getTxtComprobante().getText());
				record.setCodigo(product[1]);
				record.setProducto(product[2]);
				record.setCategoria(product[3]);
				
			
				if(operacion.equals("Venta")) {
					record.setCantidad(cantidad-(cantidad*2));
				}else {
					record.setCantidad(cantidad);
				}
				

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
		} else if(e.getSource().equals(vista.getCrud().getBtnImprimir())) {
			
			vista.getTxtProducto().setText("Selecione un producto...");
			vista.actualizarVista();
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
		
		
		this.vista.getCrud().getTable().getModel().getDataVector().removeAllElements();
		this.vista.getCrud().getTable().getModel().fireTableDataChanged();
		
		if(vista.isProduct()) {
			
			String[] product = vista.getTxtProducto().getText().split(",");
			Long productoId = Long.parseLong(product[0]);
			
			
			Iterator<CompraYVentaEntity> lista = this.repository.findForProducto(productoId).iterator();
			

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

}
