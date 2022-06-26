package CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto.PresupuestoEntity;
import CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto.PresupuestoRepository;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlListaPrecio implements ActionListener {
	
	private VistaListaPrecio vista;
	private ProductoRepository repository;
	
	public ControlListaPrecio(VistaListaPrecio vlp) {
		this.repository = new ProductoRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vista = vlp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(vista.getBtnAgregar())) {
			if(vista.getId() <= 0 && vista.getId() != null) {
				agregarProducto();
			}else{
				actualizarProducto();
			}
		}else if(e.getSource().equals(vista.getBtnModificar())) {
			int row = vista.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
				Producto pc = repository.find(id);
				vista.CargarForm(pc);
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource().equals(vista.getBtnEliminar())) {
			eliminar();
		}
	}
	
	public void agregarProducto() {
		if(vista.camposVacios()) {
			Producto pc = new Producto();
			
			pc.setCodigo(vista.getTxtCodPro().getText());
			pc.setNombre(vista.getTxtNom().getText());
			pc.setProveedor(vista.getTxtPro().getText());
			pc.setPrecio(Double.parseDouble(vista.getTxtPreUni().getText()));
			pc.setCantidad(Integer.parseInt(vista.getTxtCan().getText()));
			
			Producto db = this.repository.create(pc);
			
			if(db != null) {
				Mensajes.Creacion();
				vista.ActualizarVista();
			}
		}else {
			Mensajes.CamposVacios();
		}
	}
	
	public void actualizarProducto() {
		if(vista.camposVacios()) {
			Producto pc = new Producto();
			pc.setId(vista.getId());
			pc.setCodigo(vista.getTxtCodPro().getText());
			pc.setNombre(vista.getTxtNom().getText());
			pc.setProveedor(vista.getTxtPro().getText());
			pc.setPrecio(Double.parseDouble(vista.getTxtPreUni().getText()));
			pc.setCantidad(Integer.parseInt(vista.getTxtCan().getText()));
			
			Producto db = this.repository.update(pc);
			if(db != null) {
				Mensajes.Actualizacion();
				vista.ActualizarVista();
			}
			
		}else {
			Mensajes.CamposVacios();
		}
	}
	
	public void eliminar() {
		int row = vista.getTable().getSelectedRow();
		if(row >= 0) {
			Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
			Producto pc = repository.find(id);
			repository.delete(pc);
			vista.ActualizarVista();
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void LlenarTabla() {
		
		Iterator<Producto> lista = this.repository.findAll().iterator();
		this.vista.getModel().getDataVector().removeAllElements();
		this.vista.getModel().fireTableDataChanged();
		
		while(lista.hasNext()) {
			Producto pc = lista.next();
			this.vista.getModel().addRow(new  Object[] {
					pc.getId(),
					pc.getCodigo(),
					pc.getNombre(),
					pc.getProveedor(),
					pc.getPrecio(),
					pc.getCantidad(),
					(pc.getCantidad() * pc.getPrecio())
			});
		}
		
		
	}

	
	

}
