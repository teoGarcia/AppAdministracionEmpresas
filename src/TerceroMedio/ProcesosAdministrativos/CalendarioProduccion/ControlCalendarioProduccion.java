package TerceroMedio.ProcesosAdministrativos.CalendarioProduccion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import TerceroMedio.ProcesosAdministrativos.CalendarioProduccion.Imprimir.PanelImprimir;
import TerceroMedio.ProcesosAdministrativos.CalendarioProduccion.Imprimir.VistaImprimir;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlCalendarioProduccion implements ActionListener {
	
	private VistaImprimir vi;
	private PanelImprimir pi;
	
	private VistaCalendarioProduccion vista;
	private CalendarioProduccionRepository repository;

	public ControlCalendarioProduccion(VistaCalendarioProduccion vista) {
		this.vista = vista;
		this.repository = new CalendarioProduccionRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vista.getBtnGuardar())) {
			if(vista.getId() <= 0 && vista.getId() != null) {
				agregarProducto();
			}else{
				actualizarProducto();
			}
		}else if(e.getSource().equals(vista.getBtnModificar())) {
			int row = vista.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
				CalendarioProduccion3 record = repository.find(id);
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
				
				CalendarioProduccion3 ape = repository.find(id);		   
			    
				pi = vi.getPi();
				pi.CargarForm(ape);
				
				vi.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	public void agregarProducto() {
		if(vista.camposVacios()) {
			CalendarioProduccion3 record = new CalendarioProduccion3();
			
			record.setProjecto(vista.getTxtProyecto().getText());
			record.setEtapa(vista.getTxtEtapa().getText());
			record.setFechaI(vista.getFechaInicio().getCalendar());
			record.setFechaT(vista.getFechaTermino().getCalendar());
			
			CalendarioProduccion3 db = this.repository.create(record);
			
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
			CalendarioProduccion3 record = new CalendarioProduccion3();
			
			record.setId(vista.getId());
			record.setProjecto(vista.getTxtProyecto().getText());
			record.setEtapa(vista.getTxtEtapa().getText());
			record.setFechaI(vista.getFechaInicio().getCalendar());
			record.setFechaT(vista.getFechaTermino().getCalendar());
			
			CalendarioProduccion3 db = this.repository.update(record);
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
			CalendarioProduccion3 record = repository.find(id);
			repository.delete(record);
			vista.ActualizarVista();
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void LlenarTabla() {
		
		Iterator<CalendarioProduccion3> lista = this.repository.findAll().iterator();
		this.vista.getModel().getDataVector().removeAllElements();
		this.vista.getModel().fireTableDataChanged();
		
		while(lista.hasNext()) {
			CalendarioProduccion3 record = lista.next();
			this.vista.getModel().addRow(new  Object[] {
					record.getId(),
					record.getProjecto(),
					record.getEtapa(),
					Helpers.getFechaFormat(record.getFechaI()),
					Helpers.getFechaFormat(record.getFechaT())
			});
		}
		
		
	}

}
