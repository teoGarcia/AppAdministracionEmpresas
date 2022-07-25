package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja.Caja;
import CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja.CajaRepository;
import CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja.Flujo;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlCalendarioDeProyecto implements ActionListener {
	
	private VistaCalendarioProyectos vista;
	private ProyectoRepository pRepository;

	public ControlCalendarioDeProyecto(VistaCalendarioProyectos vista) {
		this.vista = vista;
		this.pRepository = new ProyectoRepository();
		this.pRepository.setEm(ManagerDB.getEntityManager());
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
		
	}

}
