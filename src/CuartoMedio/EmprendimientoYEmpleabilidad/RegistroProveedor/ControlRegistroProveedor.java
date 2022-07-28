package CuartoMedio.EmprendimientoYEmpleabilidad.RegistroProveedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.Producto;
import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.ProductoRepository;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlRegistroProveedor implements ActionListener {
	
	private float total = 0, subTot = 0, Iva = 0;
	
	public VistaRegistroProveedor vista;
	private ProveedorRepository repository;
	
	public ControlRegistroProveedor(VistaRegistroProveedor vista) {
		this.repository = new ProveedorRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vista.getBtnAgregar())) {
			if(vista.getId() <= 0 && vista.getId() != null) {
				agregar();
			}else{
				actualizar();
			}
		}else if(e.getSource().equals(vista.getBtnModificar())) {
			int row = vista.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
				Proveedores pc = repository.find(id);
				vista.CargarForm(pc);
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource().equals(vista.getBtnEliminar())) {
			eliminar();
		}
		// TODO Auto-generated method stub
		
	}
	
	
	public void agregar() {
		if(vista.camposVacios()) {
			Proveedores pc = new Proveedores();
			
			pc.setNombre(vista.getTxtNom().getText());
			pc.setDireccion(vista.getTxtDir().getText());
			pc.setCorreo(vista.getTxtCor().getText());
			pc.setRubro(vista.getTxtRub().getText());
			pc.setAreaDeContecto(vista.getTxtAreCon().getText());
			
			Proveedores db = this.repository.create(pc);
			
			if(db != null) {
				Mensajes.Creacion();
				vista.ActualizarVista();
			}
		}else {
			Mensajes.CamposVacios();
		}
	}
	
	public void actualizar() {
		if(vista.camposVacios()) {
			Proveedores pc = new Proveedores();
			pc.setId(vista.getId());
			pc.setNombre(vista.getTxtNom().getText());
			pc.setDireccion(vista.getTxtDir().getText());
			pc.setCorreo(vista.getTxtCor().getText());
			pc.setRubro(vista.getTxtCor().getText());
			pc.setAreaDeContecto(vista.getTxtAreCon().getText());
			
			Proveedores db = this.repository.update(pc);
			if(db != null) {
				Mensajes.Actualizacion();
				vista.ActualizarVista();
			}
			
		}else {
			Mensajes.CamposVacios();
		}
	}
	
	public void LlenarTabla() {
		
		Iterator<Proveedores> lista = this.repository.findAll().iterator();
		this.vista.getModel().getDataVector().removeAllElements();
		this.vista.getModel().fireTableDataChanged();
		
		while(lista.hasNext()) {
			Proveedores pc = lista.next();
			this.vista.getModel().addRow(new  Object[] {
					pc.getId(),
					pc.getNombre(),
					pc.getDireccion(),
					pc.getCorreo(),
					pc.getRubro(),
					pc.getAreaDeContecto()
			});
		}
		
		
	}
	
	public void eliminar() {
		int row = vista.getTable().getSelectedRow();
		if(row >= 0) {
			Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
			Proveedores pc = repository.find(id);
			repository.delete(pc);
			vista.ActualizarVista();
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
