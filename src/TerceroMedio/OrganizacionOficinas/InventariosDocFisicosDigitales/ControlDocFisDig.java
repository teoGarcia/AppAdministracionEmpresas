package TerceroMedio.OrganizacionOficinas.InventariosDocFisicosDigitales;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;
import TerceroMedio.OrganizacionOficinas.InventariosDocFisicosDigitales.Imprimir.PanelImprimir;
import TerceroMedio.OrganizacionOficinas.InventariosDocFisicosDigitales.Imprimir.VistaImprimir;
import TerceroMedio.ProcesosAdministrativos.CalendarioProduccion.CalendarioProduccion3;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlDocFisDig implements ActionListener {
	
	private VistaImprimir vi;
	private PanelImprimir pi;
	
	private InventarioDocFisDigRepository repository;
	private VistaInvDocFisDig vista;

	public ControlDocFisDig(VistaInvDocFisDig vista) {
		this.repository = new InventarioDocFisDigRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vista.getBtnGuardar())) {
			
			// GUARDAR
			
			if(vista.getTxtId().getText().length() <= 0) {
				if(vista.camposVacios()) {
					
					InventarioDocFisDigEntity spe = new InventarioDocFisDigEntity();
					
					spe.setDocumento(vista.getComboBoxDocumento().getSelectedIndex());
					spe.setNumeroDocumento(vista.getTxtNumDocumento().getText());
					spe.setTipoDocumento(vista.getTxtTipoDocumento().getText());
					spe.setMotivo(vista.getTxtMotivo().getText());
					spe.setRecibidoPor(vista.getTxtRecibidoPor().getText());
					spe.setFecha(vista.getFecha().getCalendar());
					spe.setCopiaArchivada(vista.getTxtCopiaArchivadaEn().getText());
					spe.setUbicacionArchivo(vista.getTxtUbicacionArchivo().getText());
					spe.setPersonaAreaRespon(vista.getTextPersonaAreaResp().getText());
					spe.setHora(vista.getTxtHora().getText());
					
					
					InventarioDocFisDigEntity db = this.repository.create(spe);
					if(db != null) {
						Mensajes.Creacion();
						vista.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
				
			// ACTUALIZAR (MODIFICAR)
			}else{
				if(vista.camposVacios()) {
					
					InventarioDocFisDigEntity spe = new InventarioDocFisDigEntity();
					
					spe.setId(Long.parseLong(vista.getTxtId().getText()));
					
					spe.setDocumento(vista.getComboBoxDocumento().getSelectedIndex());
					spe.setNumeroDocumento(vista.getTxtNumDocumento().getText());
					spe.setTipoDocumento(vista.getTxtTipoDocumento().getText());
					spe.setMotivo(vista.getTxtMotivo().getText());
					spe.setRecibidoPor(vista.getTxtRecibidoPor().getText());
					spe.setFecha(vista.getFecha().getCalendar());
					spe.setCopiaArchivada(vista.getTxtCopiaArchivadaEn().getText());
					spe.setUbicacionArchivo(vista.getTxtUbicacionArchivo().getText());
					spe.setPersonaAreaRespon(vista.getTextPersonaAreaResp().getText());
					spe.setHora(vista.getTxtHora().getText());
					
					InventarioDocFisDigEntity db = this.repository.update(spe);
					if(db != null) {
						Mensajes.Actualizacion();
						vista.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
			}
			
		}else if(e.getSource().equals(vista.getBtnModificar())) {
			int row = vista.getTable().getSelectedRow();
				if(row >= 0) {
				
					Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
					InventarioDocFisDigEntity spe = repository.find(id);
					vista.CargarForm(spe);
				
					
				}else {
					JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				}	
			
		}else if(e.getSource().equals(vista.getBtnEliminar())) {
			int row = vista.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
				InventarioDocFisDigEntity spe = repository.find(id);
				repository.delete(spe);
				vista.ActualizarVista();
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}else if(e.getSource().equals(vista.getBtnVerDatos())) {
			
			int row = vista.getTable().getSelectedRow();
			if(row >= 0) {
				
				vista.getTxtId().setText("");
				Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
				InventarioDocFisDigEntity spe = repository.find(id);
				vista.CargarFormSinID(spe);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
			
		}else if(e.getSource().equals(vista.getBtnVaciarCampos())) {
			
			vista.VaciarForm();
			
			
		}else if(e.getSource().equals(vista.getBtnBuscar())) {
			
			LlenarTabla();
		
		
		}else if(e.getSource().equals(vista.getBtnImprimir())) {
			
			int row = vista.getTable().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
				
				vi = new VistaImprimir();
				
				InventarioDocFisDigEntity ape = repository.find(id);		   
			    
				pi = vi.getPi();
				pi.CargarForm(ape);
				
				vi.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		
	}
	
	public void LlenarTabla() {
		
		
			Iterator<InventarioDocFisDigEntity> lista = this.repository.findAll().iterator();
			this.vista.getModel().getDataVector().removeAllElements();
			this.vista.getModel().fireTableDataChanged();
			
			while (lista.hasNext()) {
				
				InventarioDocFisDigEntity record = lista.next();
				
				if(vista.getComboBoxEstadoDocumento().getSelectedIndex() == 0) {
					
					if(record.getDocumento() == 0) {
						this.vista.getModel().addRow(new Object[] { 
							record.getId(),
							record.getNumeroDocumento(),
							record.getTipoDocumento(),
							record.getRecibidoPor(),
							Helpers.getFechaFormat(record.getFecha()) 
						});
					}
					
				}else if(vista.getComboBoxEstadoDocumento().getSelectedIndex() == 1) {	
					
					if(record.getDocumento() == 1) {
						this.vista.getModel().addRow(new Object[] { 
							record.getId(),
							record.getNumeroDocumento(),
							record.getTipoDocumento(),
							record.getRecibidoPor(),
							Helpers.getFechaFormat(record.getFecha()) });
					}
					
				}
			}
		
	}

}
