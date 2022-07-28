package CuartoMedio.EmprendimientoYEmpleabilidad.Gastos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.Producto;
import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.ProductoRepository;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlGastos implements ActionListener {

	
	private VistaGastos vista;
	private GastosRepository repository;

	public ControlGastos(VistaGastos vista) {
		this.vista = vista;
		this.repository = new GastosRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vista.getBtnAgregar())) {
			agregar();
		}else if(e.getSource().equals(vista.getBtnEliminar())) {
			eliminar();
		}
	}
	
	public void agregar() {
		if(vista.camposVacios()) {
			Gastos record = new Gastos();
			
			record.setGasto(vista.getComboBoxGastos().getSelectedItem().toString());
			record.setTgasto(vista.getComboBoxTipoGasto().getSelectedItem().toString());
			record.setPresupuesto(Integer.parseInt(vista.getTxtPresupuesto().getText()));
			record.setReal(Integer.parseInt(vista.getTxtReal().getText()));
			
			Gastos db = this.repository.create(record);
			
			if(db != null) {
				Mensajes.Creacion();
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
			Gastos record = repository.find(id);
			repository.delete(record);
			vista.ActualizarVista();
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void LlenarTabla() {
		
		Iterator<Gastos> lista = this.repository.findAll().iterator();
		this.vista.getModel().getDataVector().removeAllElements();
		this.vista.getModel().fireTableDataChanged();
		
		while(lista.hasNext()) {
			Gastos record = lista.next();
			this.vista.getModel().addRow(new  Object[] {
					record.getId(),
					record.getGasto(),
					record.getTgasto(),
					record.getPresupuesto(),
					record.getReal(),
					(record.getPresupuesto() - record.getReal())
			});
		}
		
		
	}
	
	

	
}
