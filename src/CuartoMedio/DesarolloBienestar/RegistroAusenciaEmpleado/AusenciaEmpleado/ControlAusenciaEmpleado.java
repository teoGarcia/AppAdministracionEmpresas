package CuartoMedio.DesarolloBienestar.RegistroAusenciaEmpleado.AusenciaEmpleado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones.CalendarioVacacionesEntity;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoRepository;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlAusenciaEmpleado implements ActionListener{
	
	private VistaVerAusenciaEmpleado vap;
	private AusenciaEmpleadoRepository repository;
	
	public ControlAusenciaEmpleado(VistaVerAusenciaEmpleado vap) {
		
		this.repository = new AusenciaEmpleadoRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vap = vap;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vap.getBtnGuardar())) {
			
			// GUARDAR
			
			if(vap.getTxtId().getText().length() <= 0) {
				if(vap.camposVacios()) {
					AusenciaEmpleadoEntity ape = new AusenciaEmpleadoEntity();
					
					ape.setNombre(vap.getTxtNombre().getText());
					ape.setFecha(vap.getFechaRegistroAusEmpleado().getCalendar());
					ape.setMotivo(vap.getTxtMotivo().getText());
					ape.setTotalDias(Integer.parseInt(vap.getTxtTotalDias().getText()));
					
					
					AusenciaEmpleadoEntity db = this.repository.create(ape);
					if(db != null) {
						Mensajes.Creacion();
						vap.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
				
			// ACTUALIZAR (MODIFICAR)
			}else{
				if(vap.camposVacios()) {
					
					AusenciaEmpleadoEntity ape = new AusenciaEmpleadoEntity();
					
					ape.setId(Long.parseLong(vap.getTxtId().getText()));
					
					ape.setNombre(vap.getTxtNombre().getText());
					ape.setFecha(vap.getFechaRegistroAusEmpleado().getCalendar());
					ape.setMotivo(vap.getTxtMotivo().getText());
					ape.setTotalDias(Integer.parseInt(vap.getTxtTotalDias().getText()));
					
					AusenciaEmpleadoEntity db = this.repository.update(ape);
					if(db != null) {
						Mensajes.Actualizacion();
						vap.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
			}
			
		}else if(e.getSource().equals(vap.getBtnModificar())) {
			int row = vap.getTable().getSelectedRow();
				if(row >= 0) {
				
					Long id = Long.parseLong(String.valueOf(vap.getModel().getValueAt(row, 0)));
					AusenciaEmpleadoEntity ape = repository.find(id);
					vap.CargarForm(ape);
				
					
				}else {
					JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				}	
			
		}else if(e.getSource().equals(vap.getBtnEliminar())) {
			int row = vap.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vap.getModel().getValueAt(row, 0)));
				AusenciaEmpleadoEntity ape = repository.find(id);
				repository.delete(ape);
				vap.ActualizarVista();
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}else if (e.getSource().equals(vap.getBtnBuscar())) {

			if (vap.getFechaDesde().getCalendar() != null
					&& vap.getFechaHasta().getCalendar() != null) {

				Calendar desde = vap.getFechaDesde().getCalendar();
				Calendar hasta =vap.getFechaHasta().getCalendar();

				try {
					Iterator<AusenciaEmpleadoEntity> lista = repository.findAllBeetwenBydates(desde, hasta)
							.iterator();

					this.vap.getModel().getDataVector().removeAllElements();
					this.vap.getModel().fireTableDataChanged();
					
					while (lista.hasNext()) {
						AusenciaEmpleadoEntity ape = lista.next();

						this.vap.getModel().addRow(new Object[] {

								ape.getId(),
								ape.getNombre(),
								ape.getMotivo(),
								Helpers.getFechaFormat(ape.getFecha()),
								ape.getTotalDias()
						});

					}

				} catch (ParseException e1) {
					System.out.println("error al buscar");
					e1.printStackTrace();
				}

			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar el rango de fechas", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}
	
	
	
	public void LlenarTabla() {
		
		Iterator<AusenciaEmpleadoEntity> lista = this.repository.findAll().iterator();
		this.vap.getModel().getDataVector().removeAllElements();
		this.vap.getModel().fireTableDataChanged();
		
		while(lista.hasNext()) {
		
			AusenciaEmpleadoEntity ape = lista.next();	
			
			this.vap.getModel().addRow(new  Object[] {
					ape.getId(),
					ape.getNombre(),
					ape.getMotivo(),
					Helpers.getFechaFormat(ape.getFecha()),
					ape.getTotalDias()
					
			});
		}
	}

}
