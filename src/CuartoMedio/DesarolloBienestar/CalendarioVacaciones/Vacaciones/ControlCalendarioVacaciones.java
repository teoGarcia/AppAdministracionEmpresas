package CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.DesarolloBienestar.CalculoHorasExtras.CargarDatosEntity;
import CuartoMedio.DesarolloBienestar.CalculoHorasExtras.CargarDatosRepository;
import CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones.Imprimir.PanelImprimirCalendarioVacaciones;
import CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones.Imprimir.VistaImprimirCalendarioVacaciones;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir.PanelImprimirAplicPresup;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir.VistaImprimirAplicacionPresup;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlCalendarioVacaciones implements ActionListener{
	
	private VistaImprimirCalendarioVacaciones viap;
	private PanelImprimirCalendarioVacaciones piap;
	private VistaCalendarioVacaciones vap;
	private CalendarioVacacionesRepository repository;

	public ControlCalendarioVacaciones(VistaCalendarioVacaciones vap) {
		this.repository = new CalendarioVacacionesRepository();
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
					CalendarioVacacionesEntity ape = new CalendarioVacacionesEntity();
			
					ape.setNombreEmpleado(vap.getTxtNombreEmpleado().getText());
					ape.setFecha(vap.getFechaRegistrarPermiso().getCalendar());
					ape.setTipoPermiso(vap.getComboPermiso().getSelectedIndex());
					ape.setDiasTomados(Integer.parseInt(vap.getTxtDiasTomados().getText()));
					
					
					CalendarioVacacionesEntity db = this.repository.create(ape);
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
					
					CalendarioVacacionesEntity ape = new CalendarioVacacionesEntity();
					
					ape.setId(Long.parseLong(vap.getTxtId().getText()));
					
					ape.setNombreEmpleado(vap.getTxtNombreEmpleado().getText());
					ape.setFecha(vap.getFechaRegistrarPermiso().getCalendar());
					ape.setTipoPermiso(vap.getComboPermiso().getSelectedIndex());
					ape.setDiasTomados(Integer.parseInt(vap.getTxtDiasTomados().getText()));
					
					CalendarioVacacionesEntity db = this.repository.update(ape);
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
					CalendarioVacacionesEntity ape = repository.find(id);
					vap.CargarForm(ape);
				
					
				}else {
					JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				}	
			
		}else if(e.getSource().equals(vap.getBtnEliminar())) {
			int row = vap.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vap.getModel().getValueAt(row, 0)));
				CalendarioVacacionesEntity ape = repository.find(id);
				repository.delete(ape);
				vap.ActualizarVista();
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
	
	
		}else if(e.getSource().equals(vap.getBtnCalcular())) {
			
			int Resultado = 0;
			
			int DiasPorAno = Integer.parseInt(vap.getTxtDiasPorAno().getText());
			int DiasAcumPorAnosPrev = Integer.parseInt(vap.getTxtDiasAcumAnoPrev().getText());
			int DiasAcumRangoFecha = Integer.parseInt(vap.getTxtDiasAcumuladosRangoFecha().getText());
			
			Resultado = (DiasPorAno + DiasAcumPorAnosPrev) - DiasAcumRangoFecha;
			
			vap.getTxtDiasPendientes().setText(""+Resultado);
			
		}else if(e.getSource().equals(vap.getBtnImprimir())) {
			
			if(vap.camposVaciosImprimir()) {
			
				int row = vap.getTable().getSelectedRow();
				if(row >= 0) {
				
					Long id = Long.parseLong(String.valueOf(vap.getModel().getValueAt(row, 0)));
					
					viap = new VistaImprimirCalendarioVacaciones();
					viap.setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
				    viap.setResizable(false); //Que no se pueda cambiar el tamaño
				    
				    CalendarioVacacionesEntity ape = repository.find(id);
				    
					piap = viap.getPiap();
					piap.CargarForm(ape);
					piap.getLblFechaDesde().setText(Helpers.getFechaFormat(vap.getFechaDesde().getCalendar()));
					piap.getLblHasta().setText(Helpers.getFechaFormat(vap.getFechaHasta().getCalendar()));
					piap.getLblDiasPorAno().setText(vap.getTxtDiasPorAno().getText());
					piap.getLblDiasAcumAnosPrev().setText(vap.getTxtDiasAcumAnoPrev().getText());
					piap.getLblDiasAcumFechaDef().setText(vap.getTxtDiasAcumuladosRangoFecha().getText());
					piap.getLblDiasPendientes().setText(vap.getTxtDiasPendientes().getText());
					viap.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				}
			
			}else {
			
				Mensajes.CamposVacios();
				
			}
			
		}
	}
	
	public void LlenarTabla() {
		
		Iterator<CalendarioVacacionesEntity> lista = this.repository.findAll().iterator();
		this.vap.getModel().getDataVector().removeAllElements();
		this.vap.getModel().fireTableDataChanged();
		
		while(lista.hasNext()) {
			
			CalendarioVacacionesEntity ape = lista.next();
			int ComboTipoPermiso = ape.getTipoPermiso();
			String TipoPermiso = vap.getComboPermiso().getItemAt(ComboTipoPermiso).toString();
			
			this.vap.getModel().addRow(new  Object[] {
				
					ape.getId(),
					ape.getNombreEmpleado(),
					Helpers.getFechaFormat(ape.getFecha()),
					TipoPermiso,
					ape.getDiasTomados()
					
			});
		}
		
	}

}
