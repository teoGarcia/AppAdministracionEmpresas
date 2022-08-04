package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto.Imprimir.PanelImprimir;
import CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto.Imprimir.VistaImprimir;
import CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja.Flujo;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlCalendarioDeProyecto implements ActionListener {
	
	private VistaImprimir vi;
	private PanelImprimir pi;
	
	private VistaCalendarioProyectos vista;
	private ProyectoRepository pRepository;
	private CalendarioRepository cRepository;

	public ControlCalendarioDeProyecto(VistaCalendarioProyectos vista) {
		this.vista = vista;
		this.pRepository = new ProyectoRepository();
		this.pRepository.setEm(ManagerDB.getEntityManager());
		this.cRepository = new CalendarioRepository();
		this.cRepository.setEm(ManagerDB.getEntityManager());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(vista.getBtnGuardarProyecto())) {
			if (vista.camposVaciosProyecto()) {
				Proyecto record = new Proyecto();

				record.setNombre(vista.getTxtNomPro().getText());
				record.setDias(vista.getTxtDiaPla().getText());
				record.setInicio(vista.getDateInicio().getCalendar());
				record.setFin(vista.getDateFinal().getCalendar());

				// guarda
				if (vista.getIdProyecto() <= 0 && vista.getIdProyecto() != null) {
					this.guardarProyecto(record);
					// actualiza
				} else {
					record.setId(vista.getIdProyecto());
					this.actualizarProyecto(record);
				}

				vista.actualizarVistaProyecto();

			} else {
				Mensajes.CamposVacios();
			}
		} else if (e.getSource().equals(vista.getBtnModificarProyecto())) {
			Long id = getRowProyecto();
			if (id >= 0) {
				Proyecto record = pRepository.find(id);
				vista.cargarFormProyecto(record);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}  else if (e.getSource().equals(vista.getBtnEliminarProyecto())) {
			Long id = getRowProyecto();
			if (id != null) {
				Proyecto record = pRepository.find(id);
				pRepository.delete(record);
				vista.actualizarVistaProyecto();
			}
		} else if(e.getSource().equals(vista.getBtnUsarProyecto())) {
			int row = vista.getTableProyecto().getSelectedRow();

			if (row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelProyecto().getValueAt(row, 0)));
				String nombre = String.valueOf(vista.getModelProyecto().getValueAt(row, 1));
				
				vista.setIdSeledProyecto(id);
				vista.getTxtNombreEnCalendario().setText(nombre);
				
				vista.actualizarVistaCalendario();

			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}	
		} else if(e.getSource().equals(vista.getBtnGuardarCaledario())) {
			if (vista.camposVaciosCalendario()) {
				Calendario record = new Calendario();

				record.setIdProyecto(vista.getIdSeledProyecto());
				record.setNombreProyecto(vista.getTxtNombreEnCalendario().getText());
				record.setDuracion(Integer.parseInt(vista.getTxtDuracion().getText()));
				record.setEtapa(vista.getTxtDescripcionEtapa().getText());
				record.setTareaPendiente(vista.getComboBoxTareaPendiente().getSelectedItem().toString());
				record.setDiasDependencia(Integer.parseInt(vista.getTxtDiasDependencia().getText()));
				record.setComenzo(vista.getDateComienzo().getCalendar());
				record.setFin(vista.getDateFin().getCalendar());
				record.setResponsable(vista.getTxtResponsable().getText());
				record.setDependencia(vista.getComboDependencia().getSelectedItem().toString());
				record.setEstado(vista.getComboStatus().getSelectedItem().toString());

				// guarda
				if (vista.getIdCalendario() <= 0 && vista.getIdCalendario() != null) {
					this.guardarCalendario(record);
					// actualiza
				} else {
					record.setId(vista.getIdCalendario());
					this.actualizarCalendario(record);
				}

				vista.actualizarVistaCalendario();

			} else {
				Mensajes.CamposVacios();
			}
		}	else if (e.getSource().equals(vista.getBtnModificarCalendario())) {
			Long id = getRowCalendario();
			if (id >= 0) {
				Calendario record = cRepository.find(id);
				vista.cargarFormCalendario(record);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource().equals(vista.getBtnEliminarCalendario())) {
			Long id = getRowCalendario();
			if (id != null) {
				Calendario record = cRepository.find(id);
				cRepository.delete(record);
				vista.actualizarVistaCalendario();
			}
		}else if(e.getSource().equals(vista.getBtnImprimir())) {
			
			int row = vista.getTableProyecto().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vista.getModelProyecto().getValueAt(row, 0)));
				
				vi = new VistaImprimir();
				
				Proyecto ape = pRepository.find(id);		   
			    
				pi = vi.getPi();
				pi.CargarForm(ape);
				
				vi.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	private Long getRowProyecto() {
		int row = vista.getTableProyecto().getSelectedRow();
		if (row >= 0) {
			Long id = Long.parseLong(String.valueOf(vista.getModelProyecto().getValueAt(row, 0)));
			return id;
		} else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);
			return null;
		}

	}
	
	private Long getRowCalendario() {
		int row = vista.getTableCalendario().getSelectedRow();
		if (row >= 0) {
			Long id = Long.parseLong(String.valueOf(vista.getModelCalendario().getValueAt(row, 0)));
			return id;
		} else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);
			return null;
		}

	}
	
	private void guardarProyecto(Proyecto record) {

		Proyecto db = this.pRepository.create(record);

		if (db != null) {
			vista.vaciarFormProyecto();
			Mensajes.Creacion();
		}
	}

	private void actualizarProyecto(Proyecto record) {

		Proyecto db = this.pRepository.update(record);

		if (db != null) {
			vista.vaciarFormProyecto();
			Mensajes.Actualizacion();
		}
	}
	
	private void guardarCalendario(Calendario record) {

		Calendario db = this.cRepository.create(record);

		if (db != null) {
			vista.vaciarFormCalendario();
			Mensajes.Creacion();
		}
	}

	private void actualizarCalendario(Calendario record) {

		Calendario db = this.cRepository.update(record);

		if (db != null) {
			vista.vaciarFormCalendario();
			Mensajes.Actualizacion();
		}
	}

	public void LlenarTablaProyecto() {
		Iterator<Proyecto> lista = this.pRepository.findAll().iterator();
		this.vista.getModelProyecto().getDataVector().removeAllElements();
		this.vista.getModelProyecto().fireTableDataChanged();

		while (lista.hasNext()) {
			Proyecto records = lista.next();
			this.vista.getModelProyecto().addRow(
					new Object[] { 
							records.getId(), 
							records.getNombre(), 
							records.getDias(), 
							Helpers.getFechaFormat(records.getInicio()),
							Helpers.getFechaFormat(records.getFin())
					});
		}
	}

	public void LlenarTablaCalendario() {
		// TODO Auto-generated method stub
		if(vista.getIdSeledProyecto() > 0 && vista.getIdSeledProyecto() != null) {
			Iterator<Calendario> lista = this.cRepository.findForProyect(vista.getIdSeledProyecto()).iterator();
			this.vista.getModelCalendario().getDataVector().removeAllElements();
			this.vista.getModelCalendario().fireTableDataChanged();

			while (lista.hasNext()) {
				Calendario records = lista.next();
				this.vista.getModelCalendario()
						.addRow(new Object[] { 
								records.getId(), 
								records.getNombreProyecto(),
								records.getEtapa(),
								records.getDuracion(),
								records.getTareaPendiente(),
								records.getDiasDependencia(),
								Helpers.getFechaFormat(records.getComenzo()), 
								Helpers.getFechaFormat(records.getFin()), 
								records.getResponsable(),
								records.getDependencia(),
								records.getEstado()
								});
			}
			
		}
	}

}
