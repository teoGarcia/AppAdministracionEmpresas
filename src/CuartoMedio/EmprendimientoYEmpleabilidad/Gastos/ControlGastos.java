package CuartoMedio.EmprendimientoYEmpleabilidad.Gastos;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.CalculoDeRemuneraciones.LibroRemuneraciones.LibroRemuneraciones;
import CuartoMedio.EmprendimientoYEmpleabilidad.Gastos.Imprimir.PanelImprimir;
import CuartoMedio.EmprendimientoYEmpleabilidad.Gastos.Imprimir.VistaImprimir;
import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.Producto;
import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.ProductoRepository;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlGastos implements ActionListener {

	private VistaImprimir vi;
	private PanelImprimir pi;
	
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
			
			if(vista.camposVacios()) {
				Gastos record = new Gastos();
				
				record.setGasto(vista.getComboBoxGastos().getSelectedItem().toString());
				record.setTgasto(vista.getComboBoxTipoGasto().getSelectedItem().toString());
				record.setPresupuesto(Integer.parseInt(vista.getTxtPresupuesto().getText()));
				record.setReal(Integer.parseInt(vista.getTxtReal().getText()));
				
				
				// guarda
				if (vista.getId() <= 0 && vista.getId() != null) {
					this.agregar(record);
					// actualiza
				} else {
					record.setId(vista.getId());
					this.modificar(record);
				}

				vista.ActualizarVista();
				
				
			}else {
				Mensajes.CamposVacios();
			}
			
			
			
		}else if(e.getSource().equals(vista.getBtnModificar())) {
			
			int row = vista.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
				Gastos record = repository.find(id);
				vista.CargarForm(record);
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource().equals(vista.getBtnImprimir())) {
			
			int row = vista.getTable().getRowCount();
			if(row > 0) {
			
				//Long id = Long.parseLong(String.valueOf(vp.getModel().getValueAt(row, 0)));
				
				vi = new VistaImprimir();
				
				//PresupuestoEntity ape = repository.find(id);		   
			    String TotalPresupuesto = vista.getTxtTotalPres().getText();
			    String TotalReal = vista.getTxtTotalReal().getText();
			    String TotalDif = vista.getTxtDif$().getText();
				
			    
				pi = vi.getPi();
				LlenarTablaImprimir();
				pi.getLblTotalPresup().setText(Helpers.ponerPuntos(TotalPresupuesto));
				pi.getLblTotalReal().setText(Helpers.ponerPuntos(TotalReal));
				pi.getLblTotalDiferencia().setText(Helpers.ponerPuntos(TotalDif));
				
				vi.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe Tener al menos un Item en la Tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	private void modificar(Gastos record) {
		Gastos db = this.repository.update(record);

		if (db != null) {
			vista.VaciarForm();
			Mensajes.Actualizacion();
		}
		
	}

	private void agregar(Gastos record) {
		Gastos db = this.repository.create(record);
		
		if(db != null) {
			Mensajes.Creacion();
			vista.ActualizarVista();
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
	
	public void LlenarTablaImprimir() {
		
		Iterator<Gastos> lista = this.repository.findAll().iterator();
		pi.getModel().getDataVector().removeAllElements();
		pi.getModel().fireTableDataChanged();
		
		while(lista.hasNext()) {
			Gastos record = lista.next();
			pi.getModel().addRow(new  Object[] {
					record.getGasto(),
					record.getTgasto(),
					record.getPresupuesto(),
					record.getReal(),
					(record.getPresupuesto() - record.getReal())
			});
		}
		
		
	}
	
	

	
}
