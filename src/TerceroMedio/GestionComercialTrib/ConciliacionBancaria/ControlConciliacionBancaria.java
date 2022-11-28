package TerceroMedio.GestionComercialTrib.ConciliacionBancaria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import TerceroMedio.GestionComercialTrib.Cotizacion.EmpresaPersonaEntity;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlConciliacionBancaria implements ActionListener {
	
	private VistaConciliacionBancaria vista;
	private ChequesTerceroRepository repositoryCheTer;
	private ChequesPropiosRepository repositoryChePro;

	public ControlConciliacionBancaria(VistaConciliacionBancaria vista) {
		this.repositoryCheTer = new ChequesTerceroRepository();
		this.repositoryCheTer.setEm(ManagerDB.getEntityManager());
		this.repositoryChePro = new ChequesPropiosRepository();
		this.repositoryChePro.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		////////COMIENZO GUARDAR ///////////////
		if(e.getSource().equals(vista.getBtnGuardarChequesTercero())) {
			
			if(vista.getTxtIdCheTer().getText().length() <= 0) {
				if(vista.camposVaciosCheTer()) {
					
					ChequesTerceroEntity ie = new ChequesTerceroEntity();
					
					ie.setNumeroFactura(vista.getTxtNumFacturaCheTer().getText());
					ie.setFechaDeposito(vista.getFechaDeposito().getCalendar());
					ie.setBancoEmision(vista.getTxtBancoEmisionCheTer().getText());
					ie.setNumeroCheque(vista.getTxtNumChequeCheTer().getText());
					ie.setTitularCheque(vista.getTxtTitularChequeCheTer().getText());
					ie.setMonto(Integer.parseInt(vista.getTxtMontoCheTer().getText()));
					ie.setEstado(vista.getComboBoxEstadoCheTer().getSelectedIndex());
					ie.setDepositadoEn(vista.getTxtDepositadoEn().getText());
					ie.setFechaEndoso(vista.getFechaEndoso().getCalendar());
					ie.setDestinatarioEndoso(vista.getTxtDestinatarioEndoso().getText());
					ie.setObservacion(vista.getTxtObservacionCheTer().getText());
					
					ChequesTerceroEntity db = this.repositoryCheTer.create(ie);
					
					if(db != null) {
						Mensajes.Creacion();
						vista.ActualizarVistaCheTer();
					}
				}else {
					Mensajes.CamposVacios();
				}
		////////FIN GUARDAR ///////////////	
				
		////////COMIENZO // ACTUALIZAR (MODIFICAR)  ///////////////
			
			}else{
				if(vista.camposVaciosCheTer()) {
					
					ChequesTerceroEntity ie = new ChequesTerceroEntity();
					
					ie.setId(Long.parseLong(vista.getTxtIdCheTer().getText()));
					ie.setNumeroFactura(vista.getTxtNumFacturaCheTer().getText());
					ie.setFechaDeposito(vista.getFechaDeposito().getCalendar());
					ie.setBancoEmision(vista.getTxtBancoEmisionCheTer().getText());
					ie.setNumeroCheque(vista.getTxtNumChequeCheTer().getText());
					ie.setTitularCheque(vista.getTxtTitularChequeCheTer().getText());
					ie.setMonto(Integer.parseInt(vista.getTxtMontoCheTer().getText()));
					ie.setEstado(vista.getComboBoxEstadoCheTer().getSelectedIndex());
					ie.setDepositadoEn(vista.getTxtDepositadoEn().getText());
					ie.setFechaEndoso(vista.getFechaEndoso().getCalendar());
					ie.setDestinatarioEndoso(vista.getTxtDestinatarioEndoso().getText());
					ie.setObservacion(vista.getTxtObservacionCheTer().getText());
					
					ChequesTerceroEntity db = this.repositoryCheTer.update(ie);
					
					if(db != null) {
						Mensajes.Actualizacion();
						vista.ActualizarVistaCheTer();
					}
				}else {
					Mensajes.CamposVacios();
				}
			}	
			
		}
		
		
		else if(e.getSource().equals(vista.getBtnModificarCheTer())) {
			int row = vista.getTableChequesTerceros().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vista.getModelTableChequesTerceros().getValueAt(row, 0)));
				ChequesTerceroEntity ape = repositoryCheTer.find(id);
				vista.CargarFormCheTer(ape);
			
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
		//////// FIN ACTUALIZAR (MODIFICAR)    ///////////////
			
		//////// COMIENZO ELIMINAR    ///////////////
		}else if(e.getSource().equals(vista.getBtnEliminarCheTer())) {
			int row = vista.getTableChequesTerceros().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelTableChequesTerceros().getValueAt(row, 0)));
				ChequesTerceroEntity ape = repositoryCheTer.find(id);
				repositoryCheTer.delete(ape);
				vista.ActualizarVistaCheTer();
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		//////// FIN ELIMINAR    ///////////
			
		/////// BUSCAR CHEQUES TERCEROS POR ESTADO //////////
		}else if(e.getSource().equals(vista.getBtnBuscarCheTer())) {
			
			LlenarTablaEstadoCheTer();
			
		}
		/////// BUSCAR CHEQUES TERCEROS POR ESTADO //////////
		
		
		////////COMIENZO GUARDAR ///////////////
		else if(e.getSource().equals(vista.getBtnGuardarChequesPropios())) {
			
			if(vista.getTxtIdChePro().getText().length() <= 0) {
				if(vista.camposVaciosChePro()) {
					
					ChequesPropiosEntity ie = new ChequesPropiosEntity();
					
					ie.setFechaSalida(vista.getFechaSalida().getCalendar());
					ie.setProveedor(vista.getTxtProveedor().getText());
					ie.setNumeroFactura(vista.getTxtNumFacturaChePro().getText());
					ie.setFechaPago(vista.getFechaPago().getCalendar());
					ie.setBancoEmision(vista.getTxtBancoEmisionChePro().getText());
					ie.setNumeroCheque(vista.getTxtNumChequeChePro().getText());
					ie.setTitularCheque(vista.getTxtTitularChequeChePro().getText());
					ie.setMonto(Integer.parseInt(vista.getTxtMontoChePro().getText()));
					ie.setEstado(vista.getComboBoxEstadoChePro().getSelectedIndex());
					ie.setObservacion(vista.getTxtObservacionChePro().getText());
					
					ChequesPropiosEntity db = this.repositoryChePro.create(ie);
					
					if(db != null) {
						Mensajes.Creacion();
						vista.ActualizarVistaChePro();
					}
				}else {
					Mensajes.CamposVacios();
				}
		////////FIN GUARDAR ///////////////	
				
		////////COMIENZO // ACTUALIZAR (MODIFICAR)  ///////////////
			
			}else{
				if(vista.camposVaciosChePro()) {
					
					ChequesPropiosEntity ie = new ChequesPropiosEntity();
		
					ie.setId(Long.parseLong(vista.getTxtIdChePro().getText()));
					ie.setFechaSalida(vista.getFechaSalida().getCalendar());
					ie.setProveedor(vista.getTxtProveedor().getText());
					ie.setNumeroFactura(vista.getTxtNumFacturaChePro().getText());
					ie.setFechaPago(vista.getFechaPago().getCalendar());
					ie.setBancoEmision(vista.getTxtBancoEmisionChePro().getText());
					ie.setNumeroCheque(vista.getTxtNumChequeChePro().getText());
					ie.setTitularCheque(vista.getTxtTitularChequeChePro().getText());
					ie.setMonto(Integer.parseInt(vista.getTxtMontoChePro().getText()));
					ie.setEstado(vista.getComboBoxEstadoChePro().getSelectedIndex());
					ie.setObservacion(vista.getTxtObservacionChePro().getText());
					
					ChequesPropiosEntity db = this.repositoryChePro.update(ie);
					
					if(db != null) {
						Mensajes.Actualizacion();
						vista.ActualizarVistaChePro();
					}
				}else {
					Mensajes.CamposVacios();
				}
			}	
			
		}
		
		
		else if(e.getSource().equals(vista.getBtnModificarChePro())) {
			int row = vista.getTableChequesPropios().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vista.getModelTableChequesPropios().getValueAt(row, 0)));
				ChequesPropiosEntity ape = repositoryChePro.find(id);
				vista.CargarFormChePro(ape);
			
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
		//////// FIN ACTUALIZAR (MODIFICAR)    ///////////////
			
		//////// COMIENZO ELIMINAR    ///////////////
		}else if(e.getSource().equals(vista.getBtnEliminarChePro())) {
			int row = vista.getTableChequesPropios().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelTableChequesPropios().getValueAt(row, 0)));
				ChequesPropiosEntity ape = repositoryChePro.find(id);
				repositoryChePro.delete(ape);
				vista.ActualizarVistaChePro();
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		//////// FIN ELIMINAR    ///////////
			
		}else if(e.getSource().equals(vista.getBtnBuscarChePro())) {
			
			
			LlenarTablaEstadoChePro();
			
		}
	
	}
	///////////////LLENAR TABLA BUSCAR CHEQUES TERCEROS /////////////////
	
	public void LlenarTablaEstadoCheTer() {
		
			Iterator<ChequesTerceroEntity> lista = this.repositoryCheTer.findForCheTer(vista.getComboBoxBuscarCheTer().getSelectedIndex()).iterator();
			this.vista.getModelTableChequesTerceros().getDataVector().removeAllElements();
			this.vista.getModelTableChequesTerceros().fireTableDataChanged();
			
			while(lista.hasNext()) {
				ChequesTerceroEntity record = lista.next();
				int cbEstado = record.getEstado();
				String Estado = vista.getComboBoxEstadoCheTer().getItemAt(cbEstado).toString();
					this.vista.getModelTableChequesTerceros().addRow(new  Object[] {
							record.getId(),
							record.getNumeroFactura(),
							Helpers.getFechaFormat(record.getFechaDeposito()),
							record.getBancoEmision(),
							record.getNumeroCheque(),
							record.getTitularCheque(),
							record.getMonto(),
							Estado,
							record.getDepositadoEn(),
							Helpers.getFechaFormat(record.getFechaEndoso()),
							record.getDestinatarioEndoso(),
							record.getObservacion(),
							
					});
				
			}
			vista.calcularTotalCheTer();
		
		
	}
	///////////////FIN LLENAR TABLA BUSCAR CHEQUES TERCEROS /////////////////
	
	///////////////LLENAR TABLA BUSCAR CHEQUES PROPIOS /////////////////
	
	
	public void LlenarTablaEstadoChePro() {
		
		Iterator<ChequesPropiosEntity> lista = this.repositoryChePro.findForChePro(vista.getComboBoxBuscarChePro().getSelectedIndex()).iterator();
		this.vista.getModelTableChequesPropios().getDataVector().removeAllElements();
		this.vista.getModelTableChequesPropios().fireTableDataChanged();
		
		while(lista.hasNext()) {
			ChequesPropiosEntity record = lista.next();
			int cbEstado = record.getEstado();
			String Estado = vista.getComboBoxEstadoChePro().getItemAt(cbEstado).toString();
				this.vista.getModelTableChequesPropios().addRow(new  Object[] {
						record.getId(),
						Helpers.getFechaFormat(record.getFechaSalida()),
						record.getProveedor(),
						record.getNumeroFactura(),
						Helpers.getFechaFormat(record.getFechaPago()),
						record.getBancoEmision(),
						record.getNumeroCheque(),
						record.getTitularCheque(),
						record.getMonto(),
						Estado,
						record.getObservacion()
				});
			}
			
			vista.calcularTotalChePro();
	
	
	}
	///////////////FIN LLENAR TABLA BUSCAR CHEQUES PROPIOS /////////////////
	
	public void LlenarTablaChePro() {
		
		Iterator<ChequesPropiosEntity> lista = this.repositoryChePro.findAll().iterator();
		this.vista.getModelTableChequesPropios().getDataVector().removeAllElements();
		this.vista.getModelTableChequesPropios().fireTableDataChanged();
			
		while(lista.hasNext()) {
			ChequesPropiosEntity record = lista.next();
			int cbEstado = record.getEstado();
			String Estado = vista.getComboBoxEstadoChePro().getItemAt(cbEstado).toString();
			this.vista.getModelTableChequesPropios().addRow(new  Object[] {
					record.getId(),
					Helpers.getFechaFormat(record.getFechaSalida()),
					record.getProveedor(),
					record.getNumeroFactura(),
					Helpers.getFechaFormat(record.getFechaPago()),
					record.getBancoEmision(),
					record.getNumeroCheque(),
					record.getTitularCheque(),
					record.getMonto(),
					Estado,
					record.getObservacion()
			});
		}
		
		vista.calcularTotalChePro();
		
	}
	
	////////COMIENZO LLENAR TABLA CHEQUES TERCEROS ///////////////
	
	public void LlenarTablaCheTer() {
			
		Iterator<ChequesTerceroEntity> lista = this.repositoryCheTer.findAll().iterator();
		this.vista.getModelTableChequesTerceros().getDataVector().removeAllElements();
		this.vista.getModelTableChequesTerceros().fireTableDataChanged();
			
		while(lista.hasNext()) {
			ChequesTerceroEntity record = lista.next();
			int cbEstado = record.getEstado();
			String Estado = vista.getComboBoxEstadoCheTer().getItemAt(cbEstado).toString();
			this.vista.getModelTableChequesTerceros().addRow(new  Object[] {
					record.getId(),
					record.getNumeroFactura(),
					Helpers.getFechaFormat(record.getFechaDeposito()),
					record.getBancoEmision(),
					record.getNumeroCheque(),
					record.getTitularCheque(),
					record.getMonto(),
					Estado,
					record.getDepositadoEn(),
					Helpers.getFechaFormat(record.getFechaEndoso()),
					record.getDestinatarioEndoso(),
					record.getObservacion(),
					
			});
		}
		
		vista.calcularTotalCheTer();
			
	//////// FIN LLENAR TABLA///////////////	
	}

}
