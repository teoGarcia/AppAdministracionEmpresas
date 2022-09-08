package TerceroMedio.ProcesosAdministrativos.CartaGantt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JOptionPane;

import TerceroMedio.ProcesosAdministrativos.CartaGantt.Imprimir.PanelImprimir;
import TerceroMedio.ProcesosAdministrativos.CartaGantt.Imprimir.VistaImprimir;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlCartaGantt implements ActionListener{
	
	private VistaCartaGantt vista;
	private CartaGanttRepository repository;
	private VistaImprimir vi;
	private PanelImprimir pi;
	
	public ControlCartaGantt(VistaCartaGantt vista) {
		this.vista = vista;
		this.repository = new CartaGanttRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vista.getBtnGuardar())) {
			if(vista.getId() <= 0 && vista.getId() != null) {
				agregar();
			}else{
				actualizar();
			}
		}else if(e.getSource().equals(vista.getBtnModificar())) {
			int row = vista.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
				CartaGantt3 record = repository.find(id);
				vista.CargarForm(record);
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource().equals(vista.getBtnEliminar())) {
			eliminar();
			
		}else if(e.getSource().equals(vista.getBtnImprimir())) {
			
			int row = vista.getTable().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
				
				vi = new VistaImprimir();
				
				CartaGantt3 ape = repository.find(id);		   
			    
				pi = vi.getPi();
				pi.CargarForm(ape);
				
				vi.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	public void agregar() {
		if(vista.camposVacios()) {
			CartaGantt3 record = new CartaGantt3();
			
			record.setProyecto(vista.getTxtProyecto().getText());
			record.setActividad(vista.getTxtActividad().getText());
			record.setResponsable(vista.getTxtResponsable().getText());
			record.setFechaI(vista.getFechaI().getCalendar());
			record.setFechaT(vista.getFechaT().getCalendar());
			
			CartaGantt3 db = this.repository.create(record);
			
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
			CartaGantt3 record = new CartaGantt3();
			
			record.setId(vista.getId());
			record.setProyecto(vista.getTxtProyecto().getText());
			record.setActividad(vista.getTxtActividad().getText());
			record.setResponsable(vista.getTxtResponsable().getText());
			record.setFechaI(vista.getFechaI().getCalendar());
			record.setFechaT(vista.getFechaT().getCalendar());
			
			CartaGantt3 db = this.repository.update(record);
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
			CartaGantt3 record = repository.find(id);
			repository.delete(record);
			vista.ActualizarVista();
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void LlenarTabla() {
		// TODO Auto-generated method stub
		Iterator<CartaGantt3> lista = this.repository.findAll().iterator();
		this.vista.getModel().getDataVector().removeAllElements();
		this.vista.getModel().fireTableDataChanged();
		
		while(lista.hasNext()) {
			CartaGantt3 record = lista.next();
			
			this.vista.getModel().addRow(new  Object[] {
					record.getId(),
					record.getProyecto(),
					record.getActividad(),
					record.getResponsable(),
					Helpers.getFechaFormat(record.getFechaI()),
					Helpers.getFechaFormat(record.getFechaT())
			});
		}
	}

}
