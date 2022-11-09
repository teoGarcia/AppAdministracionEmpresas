package TerceroMedio.GestionComercialTrib.Cotizacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import TerceroMedio.GestionComercialTrib.Inventario.InventarioRepository3;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlCotizacion implements ActionListener {
	
	private VistaCotizacion vista;
	private EmpresaPersonaRepository repository;

	public ControlCotizacion(VistaCotizacion vista) {
		this.repository = new EmpresaPersonaRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
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
			
			
			//////// FIN EMPRESA o PERSONA    ///////////////
		
		}
		
		
	}

}
