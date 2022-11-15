package TerceroMedio.GestionComercialTrib.Cotizacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja.Flujo;
import TerceroMedio.GestionComercialTrib.Inventario.InventarioRepository3;
import TerceroMedio.ProcesosAdministrativos.CalendarioProduccion.CalendarioProduccion3;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlCotizacion implements ActionListener {
	
	private VistaCotizacion vista;
	private EmpresaPersonaRepository repository;
	private RegistrarCotizacionRepository repositoryRegCot;

	public ControlCotizacion(VistaCotizacion vista) {
		this.repository = new EmpresaPersonaRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.repositoryRegCot = new RegistrarCotizacionRepository();
		this.repositoryRegCot.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		////////  COMIENZO EMPRESA o PERSONA    ///////////////
		
		////////COMIENZO GUARDAR EMPRESA o PERSONA    ///////////////
		if(e.getSource().equals(vista.getBtnGuardarEmp())) {
			
			if(vista.getTxtId().getText().length() <= 0) {
				if(vista.camposVacios()) {
					
					EmpresaPersonaEntity ie = new EmpresaPersonaEntity();
					
					ie.setRazonSocial(vista.getTxtRazonSocial().getText());
					ie.setRut(vista.getTxtRut().getText());
					ie.setGiro(vista.getTxtGiro().getText());
					ie.setDireccion(vista.getTxtDireccion().getText());
					ie.setComuna(vista.getTxtComuna().getText());
					ie.setTelefono(vista.getTxtTelefono().getText());
					ie.setSitioWeb(vista.getTxtSitioWeb().getText());
					ie.seteMail(vista.getTxtEmail().getText());
					
					EmpresaPersonaEntity db = this.repository.create(ie);
					
					if(db != null) {
						Mensajes.Creacion();
						vista.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
		////////FIN GUARDAR EMPRESA o PERSONA    ///////////////	
				
		////////COMIENZO // ACTUALIZAR (MODIFICAR)  ///////////////
			
			}else{
				if(vista.camposVacios()) {
					
					EmpresaPersonaEntity ie = new EmpresaPersonaEntity();
					
					ie.setId(Long.parseLong(vista.getTxtId().getText()));
					ie.setRazonSocial(vista.getTxtRazonSocial().getText());
					ie.setRut(vista.getTxtRut().getText());
					ie.setGiro(vista.getTxtGiro().getText());
					ie.setDireccion(vista.getTxtDireccion().getText());
					ie.setComuna(vista.getTxtComuna().getText());
					ie.setTelefono(vista.getTxtTelefono().getText());
					ie.setSitioWeb(vista.getTxtSitioWeb().getText());
					ie.seteMail(vista.getTxtEmail().getText());
					
					EmpresaPersonaEntity db = this.repository.update(ie);
					
					if(db != null) {
						Mensajes.Actualizacion();
						vista.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
			}	
			
		}
		
		
		else if(e.getSource().equals(vista.getBtnModificarEmpresa())) {
			int row = vista.getTableEmpresas().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vista.getModelTableEmpresaPersona().getValueAt(row, 0)));
				EmpresaPersonaEntity ape = repository.find(id);
				vista.CargarFormEmpresaPersona(ape);
			
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
		//////// FIN ACTUALIZAR (MODIFICAR)    ///////////////
			
		//////// COMIENZO ELIMINAR    ///////////////
		}else if(e.getSource().equals(vista.getBtnEliminarEmpresa())) {
			int row = vista.getTableEmpresas().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelTableEmpresaPersona().getValueAt(row, 0)));
				EmpresaPersonaEntity ape = repository.find(id);
				repository.delete(ape);
				vista.ActualizarVista();
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		//////// FIN ELIMINAR    ///////////
		
		//////// COMIENZO USAR DATOS EMP o PER /////////////////////
		
		}else if(e.getSource().equals(vista.getBtnUsarDatosEmpresa())) {
			
			vista.getTxtIDCot().setText("");
			usarDatosEmpPer();
			LlenarTablaRegCot();
			
		}
		
		
		
		//////////********************************//////////////	
		////////COMIENZO GUARDAR COTIZACION    ///////////////
		else if(e.getSource().equals(vista.getBtnGuardarCotizacion())) {
			
			if(vista.getTxtIDCot().getText().length() <= 0) {
				if(vista.camposVaciosRegistroCotizacion()) {
					
					RegistrarCotizacionEntity ie = new RegistrarCotizacionEntity();
					
					ie.setIdEmpresa(Long.parseLong(vista.getTxtIDEmpCot().getText()));
					ie.setFechaEmision(vista.getFechaEmision().getCalendar());
					ie.setValidaHasta(vista.getFechaValidaHasta().getCalendar());
					ie.setNumeroCotizacion(Long.parseLong(vista.getTxtNumCotizacionEmpCot().getText()));
					ie.setTerminoCondiciones(vista.getTxtTerminosyCondiciones().getText());
					
					RegistrarCotizacionEntity db = this.repositoryRegCot.create(ie);
					
					if(db != null) {
						Mensajes.Creacion();
						vista.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
		////////FIN GUARDAR COTIZACION    ///////////////	
				
		////////COMIENZO // ACTUALIZAR (MODIFICAR) COTIZACION ///////////////
			
			}else{
				if(vista.camposVaciosRegistroCotizacion()) {
					
					RegistrarCotizacionEntity ie = new RegistrarCotizacionEntity();
					
					ie.setId(Long.parseLong(vista.getTxtIDCot().getText()));
					ie.setIdEmpresa(Long.parseLong(vista.getTxtIDEmpCot().getText()));
					ie.setFechaEmision(vista.getFechaEmision().getCalendar());
					ie.setValidaHasta(vista.getFechaValidaHasta().getCalendar());
					ie.setNumeroCotizacion(Long.parseLong(vista.getTxtNumCotizacionEmpCot().getText()));
					ie.setTerminoCondiciones(vista.getTxtTerminosyCondiciones().getText());
					
					RegistrarCotizacionEntity db = this.repositoryRegCot.update(ie);
					
					if(db != null) {
						Mensajes.Actualizacion();
						vista.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
			}	
			
		}
		
		
		else if(e.getSource().equals(vista.getBtnModificarCotizacion())) {
			int row = vista.getTableRegistrarCotizacion().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vista.getModelTableRegistrarCotizacion().getValueAt(row, 0)));
				RegistrarCotizacionEntity ape = repositoryRegCot.find(id);
				vista.CargarFormRegistroCotizacion(ape);
			
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
		//////// FIN ACTUALIZAR (MODIFICAR)    ///////////////
			
		//////// COMIENZO ELIMINAR  COTIZACION  ///////////////
		}else if(e.getSource().equals(vista.getBtnEliminarEmpresa())) {
			int row = vista.getTableRegistrarCotizacion().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelTableEmpresaPersona().getValueAt(row, 0)));
				RegistrarCotizacionEntity ape = repositoryRegCot.find(id);
				repositoryRegCot.delete(ape);
				vista.ActualizarVista();
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		//////// FIN ELIMINAR   COTIZACION ///////////
			
		}
		
	}		
	
		////////COMIENZO LLENAR TABLA EMPRESA ///////////////
	
		public void LlenarTablaEmpresa() {
				
			Iterator<EmpresaPersonaEntity> lista = this.repository.findAll().iterator();
			this.vista.getModelTableEmpresaPersona().getDataVector().removeAllElements();
			this.vista.getModelTableEmpresaPersona().fireTableDataChanged();
				
			while(lista.hasNext()) {
				EmpresaPersonaEntity record = lista.next();
				this.vista.getModelTableEmpresaPersona().addRow(new  Object[] {
						record.getId(),
						record.getRazonSocial(),
						record.getRut(),
						record.getGiro(),
						record.getDireccion(),
						record.getComuna(),
						record.getTelefono(),
						record.getSitioWeb(),
						record.geteMail()
				});
			}
				
		//////// FIN LLENAR TABLA EMPRESA ///////////////	
		}
		
		////////COMIENZO LLENAR TABLA REGISTRO COTIZACION ///////////////
		
		/*public void LlenarTablaRegCotizacion() {
				
			Iterator<RegistrarCotizacionEntity> lista = this.repositoryRegCot.findAll().iterator();
			this.vista.getModelTableRegistrarCotizacion().getDataVector().removeAllElements();
			this.vista.getModelTableRegistrarCotizacion().fireTableDataChanged();
			
			
			
			int row = vista.getTableEmpresas().getSelectedRow();
			
				
				
				
				while(lista.hasNext()) {
					RegistrarCotizacionEntity record = lista.next();
					
					Long id = record.getIdEmpresa();
					EmpresaPersonaEntity ape = repository.find(id);
					
					this.vista.getModelTableRegistrarCotizacion().addRow(new  Object[] {
							record.getId(),
							record.getIdEmpresa(),
							ape.getRazonSocial(),
							record.getNumeroCotizacion(),
							Helpers.getFechaFormat(record.getFechaEmision()),
							Helpers.getFechaFormat(record.getValidaHasta())
							
					});
				}
				
				
			
			
				
		//////// FIN LLENAR TABLA REGISTRO COTIZACION ///////////////	
		}*/
		
		
		////////////////// USAR DATOS EMP o PERSONA /////////////////////////
		
		public void usarDatosEmpPer() {
			
			int row = vista.getTableEmpresas().getSelectedRow();
			
			if(row >= 0) {
				String id = String.valueOf(vista.getModelTableEmpresaPersona().getValueAt(row, 0));
				String RazonSocial = String.valueOf(vista.getModelTableEmpresaPersona().getValueAt(row, 1));
				String Rut = String.valueOf(vista.getModelTableEmpresaPersona().getValueAt(row, 2));
				
				vista.getTxtIDEmpCot().setText(id);
				vista.getTxtRazonSocialEmpCot().setText(RazonSocial);
				vista.getTxtRutEmpCot().setText(Rut);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		//////////////////FIN USAR DATOS EMP o PERSONA /////////////////////////
	
		
		////////////////// LLENANDO LA TABLA DE REGISTRO COTIZACION //////////////
		
		
		public void LlenarTablaRegCot() {
			
			int row = vista.getTableEmpresas().getSelectedRow();
			
			if(row >= 0) {
				
				String idStr = String.valueOf(vista.getModelTableEmpresaPersona().getValueAt(row, 0));
				Long id = Long.parseLong(idStr);
				Iterator<RegistrarCotizacionEntity> lista = this.repositoryRegCot.findForRegCot(id).iterator();
				vista.getModelTableRegistrarCotizacion().getDataVector().removeAllElements();
				vista.getModelTableRegistrarCotizacion().fireTableDataChanged();
				
				while (lista.hasNext()) {
					
					RegistrarCotizacionEntity record = lista.next();
					Long idEmpPer = record.getIdEmpresa();
					EmpresaPersonaEntity ape = repository.find(idEmpPer);
					vista.getModelTableRegistrarCotizacion()
							.addRow(new Object[] { 
									record.getId(),
									record.getIdEmpresa(),
									ape.getRazonSocial(),
									record.getNumeroCotizacion(),
									Helpers.getFechaFormat(record.getFechaEmision()),
									Helpers.getFechaFormat(record.getValidaHasta())
									});
				}
				
				//vista.calcularTotal();
			}
			
		
		}

}
