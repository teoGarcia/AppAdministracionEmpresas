package CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlPresupuestoCapacitacion implements ActionListener{

	
	private VistaPresupuestoCapacitacion vpc;
	private PresupuestoCapacitacionRepository repository;

	public ControlPresupuestoCapacitacion(VistaPresupuestoCapacitacion vpc) {
		this.repository = new PresupuestoCapacitacionRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vpc = vpc;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vpc.getGuardar())) {
			
			// guarda
			if(vpc.getTxtId().getText().length() <= 0) {
				if(vpc.camposVacios()) {
					PresupuestoCapacitacion pc = new PresupuestoCapacitacion();
					pc.setGlosario(vpc.getTxtGlosario().getText());
					pc.setFecha(vpc.getTxtFecha().getCalendar());
					pc.setCancelar(Double.parseDouble(vpc.getTxtCancelar().getText()));
					PresupuestoCapacitacion db = this.repository.create(pc);
					if(db != null) {
						Mensajes.Creacion();
						vpc.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
				
			// actualiza
			}else{
				if(vpc.camposVacios()) {
					PresupuestoCapacitacion pc = new PresupuestoCapacitacion();
					pc.setId(Long.parseLong(vpc.getTxtId().getText()));
					pc.setGlosario(vpc.getTxtGlosario().getText());
					pc.setFecha(vpc.getTxtFecha().getCalendar());
					pc.setCancelar(Double.parseDouble(vpc.getTxtCancelar().getText()));
					PresupuestoCapacitacion db = this.repository.update(pc);
					if(db != null) {
						Mensajes.Actualizacion();
						vpc.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
			}
			
		}else if(e.getSource().equals(vpc.getBtnModificar())) {
			int row = vpc.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vpc.getModel().getValueAt(row, 0)));
				PresupuestoCapacitacion pc = repository.find(id);
				vpc.CargarForm(pc);
				System.out.println("teo"+pc);
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource().equals(vpc.getBtnEliminar())) {
			int row = vpc.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vpc.getModel().getValueAt(row, 0)));
				PresupuestoCapacitacion pc = repository.find(id);
				repository.delete(pc);
				vpc.ActualizarVista();
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	public void LlenarTabla() {
		
		Iterator<PresupuestoCapacitacion> lista = this.repository.findAll().iterator();
		this.vpc.getModel().getDataVector().removeAllElements();
		this.vpc.getModel().fireTableDataChanged();
		
		while(lista.hasNext()) {
			PresupuestoCapacitacion pc = lista.next();
			this.vpc.getModel().addRow(new  Object[] {
					pc.getId(),
					pc.getGlosario(),
					Helpers.getFechaFormat(pc.getFecha()),
					pc.getCancelar()
			});
		}
		
		
	}

	
	

}
