package CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlPresupuesto implements ActionListener {

	private VistaPresupSimple vp;
	private PresupuestoRepository repository;

	public ControlPresupuesto(VistaPresupSimple vp) {
		this.repository = new PresupuestoRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vp = vp;
	}
	
	//@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vp.getBtnGuardar())) {
			
			// guarda
			if(vp.getId() <= 0 && vp.getId() != null) {
				if(vp.camposVacios()) {
					PresupuestoEntity pc = new PresupuestoEntity();
					
					pc.setFecha(vp.getTxtFecha().getCalendar());
					pc.setApartado(vp.getTxtApartado().getText());
					
					if(vp.getComboTipo().getSelectedIndex() == 0) {
						pc.setIngreso(Double.parseDouble(vp.getTxtMonto().getText()));
						pc.setEgreso(0.0);
					}else if(vp.getComboTipo().getSelectedIndex() == 1){
						pc.setIngreso(0.0);
						pc.setEgreso(Double.parseDouble(vp.getTxtMonto().getText()));
					}
					
					PresupuestoEntity db = this.repository.create(pc);
					
					if(db != null) {
						Mensajes.Creacion();
						vp.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
				
			// actualiza
			}else{
				if(vp.camposVacios()) {
					PresupuestoEntity pc = new PresupuestoEntity();
					pc.setId(vp.getId());
					pc.setApartado(vp.getTxtApartado().getText());
					pc.setFecha(vp.getTxtFecha().getCalendar());
					
					if(vp.getComboTipo().getSelectedIndex() == 0) {
						pc.setIngreso(Double.parseDouble(vp.getTxtMonto().getText()));
						pc.setEgreso(0.0);
					}else if(vp.getComboTipo().getSelectedIndex() == 1){
						pc.setIngreso(0.0);
						pc.setEgreso(Double.parseDouble(vp.getTxtMonto().getText()));
					}
					
					PresupuestoEntity db = this.repository.update(pc);
					if(db != null) {
						Mensajes.Actualizacion();
						vp.ActualizarVista();
					}
					
				}else {
					Mensajes.CamposVacios();
				}
			}
			
		}else if(e.getSource().equals(vp.getBtnModificar())) {
			Long id  = getRow();
			if(id >= 0) {
				PresupuestoEntity pc = repository.find(id);
				vp.CargarForm(pc);
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource().equals(vp.getBtnEliminiar())) {
			Long id  = getRow();
			if(id >= 0) {
				PresupuestoEntity pc = repository.find(id);
				repository.delete(pc);
				vp.ActualizarVista();
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	public Long getRow() {
		int row = vp.getTable().getSelectedRow();
		Long id = Long.parseLong(String.valueOf(vp.getModel().getValueAt(row, 0)));
		return id;
	}
	
	public void LlenarTabla() {
		
		Iterator<PresupuestoEntity> lista = this.repository.findAll().iterator();
		this.vp.getModel().getDataVector().removeAllElements();
		this.vp.getModel().fireTableDataChanged();
		
		while(lista.hasNext()) {
			PresupuestoEntity pc = lista.next();
			this.vp.getModel().addRow(new  Object[] {
					pc.getId(),
					pc.getApartado(),
					Helpers.getFechaFormat(pc.getFecha()),
					pc.getIngreso(),
					pc.getEgreso()
			});
		}
		
		
	}
	
}
