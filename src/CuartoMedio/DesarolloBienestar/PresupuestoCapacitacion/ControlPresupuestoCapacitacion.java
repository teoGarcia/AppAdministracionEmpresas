package CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.Imprimir.PanelImprimir;
import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.Imprimir.VistaImprimir;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir.VistaImprimirAplicacionPresup;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlPresupuestoCapacitacion implements ActionListener{

	private PanelImprimir pi;
	private VistaImprimir vi;
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
			
			// GUARDAR
			
			if(vpc.getTxtId().getText().length() <= 0) {
				if(vpc.camposVacios()) {
					PresupuestoCapacitacion pc = new PresupuestoCapacitacion();
					pc.setGlosario(vpc.getTxtGlosario().getText());
					pc.setFecha(vpc.getTxtFecha().getCalendar());
					pc.setCancelar(Integer.parseInt(vpc.getTxtCancelar().getText()));
					PresupuestoCapacitacion db = this.repository.create(pc);
					if(db != null) {
						Mensajes.Creacion();
						vpc.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
				
			// ACTUALIZAR (MODIFICAR)
			}else{
				if(vpc.camposVacios()) {
					PresupuestoCapacitacion pc = new PresupuestoCapacitacion();
					pc.setId(Long.parseLong(vpc.getTxtId().getText()));
					pc.setGlosario(vpc.getTxtGlosario().getText());
					pc.setFecha(vpc.getTxtFecha().getCalendar());
					pc.setCancelar(Integer.parseInt(vpc.getTxtCancelar().getText()));
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
		}else if(e.getSource().equals(vpc.getBtnImprimir())) {
			
			int row = vpc.getTable().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vpc.getModel().getValueAt(row, 0)));
				
				vi = new VistaImprimir();
				
				PresupuestoCapacitacion ape = repository.find(id);		   
			    
				pi = vi.getPi();
				pi.CargarForm(ape);
				
				vi.setVisible(true);
				
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
