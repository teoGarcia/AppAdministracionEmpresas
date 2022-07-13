package CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.Imprimir.VistaImprimir;
import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacion;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir.PanelImprimirAplicPresup;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir.VistaImprimirAplicacionPresup;
import CuartoMedio.GestionDeBodega.MermasMercaderia.MermaMercaderiaEntity;
import CuartoMedio.GestionDeBodega.MermasMercaderia.MermaMercaderiaRepository;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlAplicacionPresupuesto implements ActionListener {

	private VistaAplicacionPresupuesto vap;
	private VistaImprimirAplicacionPresup viap;
	private PanelImprimirAplicPresup piap;
	private AplicacionPresupuestoRepository repository;
	
	public ControlAplicacionPresupuesto(VistaAplicacionPresupuesto vap) {
		this.repository = new AplicacionPresupuestoRepository();
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
					AplicacionPresupuestoEntity ape = new AplicacionPresupuestoEntity();
					
					ape.setPuesto(vap.getTxtPuesto().getText());
					ape.setCategoria(vap.getTxtCategoria().getText());
					ape.setDptoGrupo(vap.getTxtDptoGrupo().getText());
					ape.setCodPuesto(vap.getTxtCodPuesto().getText());
					ape.setUbicacion(vap.getTxtUbicacion().getText());
					ape.setNecesarioViajar(vap.getComboBoxNecesarioViajar().getSelectedIndex());
					ape.setRangoSalario(vap.getTxtRangoSalario().getText());
					ape.setTipoPosicion(vap.getComboBoxTipoPosicion().getSelectedIndex());
					ape.setContactoRRHH(vap.getTxtContactoRRHH().getText());
					ape.setFechaPublicacion(vap.getFechaPublicacion().getCalendar());
					ape.setFormatoSolicitud(vap.getTxtFormacionSolicitud().getText());
					ape.setFechaExpiracion(vap.getFechaExpiracion().getCalendar());
					ape.setURLExt(vap.getTxtURLExt().getText());
					ape.setURLInt(vap.getTxtURLInt().getText());
					ape.setNombreEmpresa(vap.getTxtNombreEmpresa().getText());
					ape.setDireccion(vap.getTxtDireccion().getText());
					ape.setFaxCorreo(vap.getTxtFaxCorreo().getText());
					ape.setCodigoPostal(vap.getTxtCodPostal().getText());
					ape.setRolResponsabilidad(vap.getTxtRolResponsabilidades().getText());
					ape.setRequisitosCualifFormacion(vap.getTxtReqCualifFormacion().getText());
					ape.setAptitudesDeseables(vap.getTxtAptitudesDeseables().getText());
					ape.setNotasAdicionales(vap.getTxtNotasAdicionales().getText());
					ape.setRevisadoPor(vap.getTxtRevisadoPor().getText());
					ape.setAprobadoPor(vap.getTxtAprobadoPor().getText());
					ape.setUltimaActuaPor(vap.getTxtUltimaActualizacion().getText());
					ape.setFechaRevisado(vap.getFechaRevisado().getCalendar());
					ape.setFechaAprobado(vap.getFechaAprobado().getCalendar());
					ape.setFechaActualizacion(vap.getFechaActualizacion().getCalendar());
					
					AplicacionPresupuestoEntity db = this.repository.create(ape);
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
					
					AplicacionPresupuestoEntity ape = new AplicacionPresupuestoEntity();
					
					ape.setId(Long.parseLong(vap.getTxtId().getText()));
					
					ape.setPuesto(vap.getTxtPuesto().getText());
					ape.setCategoria(vap.getTxtCategoria().getText());
					ape.setDptoGrupo(vap.getTxtDptoGrupo().getText());
					ape.setCodPuesto(vap.getTxtCodPuesto().getText());
					ape.setUbicacion(vap.getTxtUbicacion().getText());
					ape.setNecesarioViajar(vap.getComboBoxNecesarioViajar().getSelectedIndex());
					ape.setRangoSalario(vap.getTxtRangoSalario().getText());
					ape.setTipoPosicion(vap.getComboBoxTipoPosicion().getSelectedIndex());
					ape.setContactoRRHH(vap.getTxtContactoRRHH().getText());
					ape.setFechaPublicacion(vap.getFechaPublicacion().getCalendar());
					ape.setFormatoSolicitud(vap.getTxtFormacionSolicitud().getText());
					ape.setFechaExpiracion(vap.getFechaExpiracion().getCalendar());
					ape.setURLExt(vap.getTxtURLExt().getText());
					ape.setURLInt(vap.getTxtURLInt().getText());
					ape.setNombreEmpresa(vap.getTxtNombreEmpresa().getText());
					ape.setDireccion(vap.getTxtDireccion().getText());
					ape.setFaxCorreo(vap.getTxtFaxCorreo().getText());
					ape.setCodigoPostal(vap.getTxtCodPostal().getText());
					ape.setRolResponsabilidad(vap.getTxtRolResponsabilidades().getText());
					ape.setRequisitosCualifFormacion(vap.getTxtReqCualifFormacion().getText());
					ape.setAptitudesDeseables(vap.getTxtAptitudesDeseables().getText());
					ape.setNotasAdicionales(vap.getTxtNotasAdicionales().getText());
					ape.setRevisadoPor(vap.getTxtRevisadoPor().getText());
					ape.setAprobadoPor(vap.getTxtAprobadoPor().getText());
					ape.setUltimaActuaPor(vap.getTxtUltimaActualizacion().getText());
					ape.setFechaRevisado(vap.getFechaRevisado().getCalendar());
					ape.setFechaAprobado(vap.getFechaAprobado().getCalendar());
					ape.setFechaActualizacion(vap.getFechaActualizacion().getCalendar());
					
					AplicacionPresupuestoEntity db = this.repository.update(ape);
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
					AplicacionPresupuestoEntity ape = repository.find(id);
					vap.CargarForm(ape);
				
					
				}else {
					JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				}	
			
		}else if(e.getSource().equals(vap.getBtnEliminar())) {
			int row = vap.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vap.getModel().getValueAt(row, 0)));
				AplicacionPresupuestoEntity ape = repository.find(id);
				repository.delete(ape);
				vap.ActualizarVista();
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}else if(e.getSource().equals(vap.getBtnVerTodosLos())) {
			
			int row = vap.getTable().getSelectedRow();
			if(row >= 0) {
				
				vap.getTxtId().setText("");
				Long id = Long.parseLong(String.valueOf(vap.getModel().getValueAt(row, 0)));
				AplicacionPresupuestoEntity ape = repository.find(id);
				vap.VerTodosDatos(ape);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}else if(e.getSource().equals(vap.getBtnVaciarCampos())) {
			
			vap.VaciarForm();
			
			
		}else if(e.getSource().equals(vap.getBtnImprimir())) {
			JOptionPane.showMessageDialog(null, "OJITo");
			
			int row = vap.getTable().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vap.getModel().getValueAt(row, 0)));
				
				System.out.println("ID"+ id);
				
				viap = new VistaImprimirAplicacionPresup();
				viap.setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
			    viap.setResizable(false); //Que no se pueda cambiar el tamaño
			    
			    AplicacionPresupuestoEntity ape = repository.find(id);
			    
			    System.out.println("APE:"+ ape.toString());
			    
				piap = viap.getPiap();
				piap.CargarForm(ape);
				
				viap.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
		}
		
	}
	
	public void LlenarTabla() {
		
		Iterator<AplicacionPresupuestoEntity> lista = this.repository.findAll().iterator();
		this.vap.getModel().getDataVector().removeAllElements();
		this.vap.getModel().fireTableDataChanged();
		
		while(lista.hasNext()) {
			AplicacionPresupuestoEntity ape = lista.next();
			
			int ComboViajar = ape.getNecesarioViajar();
			int ComboTipoPosicion = ape.getTipoPosicion();
			//int UM = mme.getUnidadMedida();
			
			String NecesarioViajar = vap.getComboBoxNecesarioViajar().getItemAt(ComboViajar).toString();
			String TipoPosicion = vap.getComboBoxTipoPosicion().getItemAt(ComboTipoPosicion).toString();
			//String UMedida = vmm.getComboBoxUnidadMedida().getItemAt(UM).toString();		
			
			this.vap.getModel().addRow(new  Object[] {
					ape.getId(),
					ape.getPuesto(),
					ape.getCategoria(),
					ape.getCodPuesto(),
					NecesarioViajar,
					ape.getRangoSalario(),
					TipoPosicion,
					ape.getNombreEmpresa(),
					ape.getRevisadoPor(),
					ape.getAprobadoPor()
					
			});
		}
		
		// TODO Auto-generated method stub
		
	}

}
