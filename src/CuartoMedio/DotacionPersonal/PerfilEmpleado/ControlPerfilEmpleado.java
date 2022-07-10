package CuartoMedio.DotacionPersonal.PerfilEmpleado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoRepository;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir.PanelImprimirAplicPresup;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir.VistaImprimirAplicacionPresup;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlPerfilEmpleado implements ActionListener {
	
	private PerfilEmpleadoRepository repository;
	private VistaPerfilEmpleado vpe;

	public ControlPerfilEmpleado(VistaPerfilEmpleado vpe) {
		this.repository = new PerfilEmpleadoRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vpe = vpe;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(vpe.getBtnGuardar())) {
			
			// GUARDAR
			
			if(vpe.getTxtId().getText().length() <= 0) {
				if(vpe.camposVacios()) {
					PerfilEmpleadoEntity pee = new PerfilEmpleadoEntity();
					
					pee.setSede(vpe.getTxtSede().getText());
					pee.setNivel(vpe.getTxtNivel().getText());
					pee.setDenominacionEmpleo(vpe.getTxtDenominacionEmpleo().getText());
					pee.setCodigo(vpe.getTxtCodigo().getText());
					pee.setGrado(vpe.getTxtGrado().getText());
					pee.setDependencia(vpe.getTxtDependencia().getText());
					pee.setCargoJefeInmediato(vpe.getTxtCargoJefeInmediato().getText());
					pee.setDedicacion(vpe.getTxtDedicacion().getText());
					pee.setClaseCargo(vpe.getTxtClaseCargo().getText());
					pee.setGrupoOcasional(vpe.getTxtGrupoOcasional().getText());
					pee.setPropositoPrincipal(vpe.getTxtPropositoPrincipal().getText());
					pee.setFuncionesEsenciales(vpe.getTxtFuncionesEsenciales().getText());
					pee.setCriteriosDesempeño(vpe.getTxtCriterioDesempeno().getText());
					pee.setConocimientosBasicos(vpe.getTxtConocBasicos().getText());
					pee.setOrganizacionales(vpe.getTxtOrganizacionales().getText());
					pee.setIndividuales(vpe.getTxtIndividual().getText());
					
					
					PerfilEmpleadoEntity db = this.repository.create(pee);
					if(db != null) {
						Mensajes.Creacion();
						vpe.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
				
			// ACTUALIZAR (MODIFICAR)
			}else{
				if(vpe.camposVacios()) {
					
					PerfilEmpleadoEntity pee = new PerfilEmpleadoEntity();
					
					pee.setId(Long.parseLong(vpe.getTxtId().getText()));
					
					pee.setSede(vpe.getTxtSede().getText());
					pee.setNivel(vpe.getTxtNivel().getText());
					pee.setDenominacionEmpleo(vpe.getTxtDenominacionEmpleo().getText());
					pee.setCodigo(vpe.getTxtCodigo().getText());
					pee.setGrado(vpe.getTxtGrado().getText());
					pee.setDependencia(vpe.getTxtDependencia().getText());
					pee.setCargoJefeInmediato(vpe.getTxtCargoJefeInmediato().getText());
					pee.setDedicacion(vpe.getTxtDedicacion().getText());
					pee.setClaseCargo(vpe.getTxtClaseCargo().getText());
					pee.setGrupoOcasional(vpe.getTxtGrupoOcasional().getText());
					pee.setPropositoPrincipal(vpe.getTxtPropositoPrincipal().getText());
					pee.setFuncionesEsenciales(vpe.getTxtFuncionesEsenciales().getText());
					pee.setCriteriosDesempeño(vpe.getTxtCriterioDesempeno().getText());
					pee.setConocimientosBasicos(vpe.getTxtConocBasicos().getText());
					pee.setOrganizacionales(vpe.getTxtOrganizacionales().getText());
					pee.setIndividuales(vpe.getTxtIndividual().getText());
					
					PerfilEmpleadoEntity db = this.repository.update(pee);
					if(db != null) {
						Mensajes.Actualizacion();
						vpe.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
			}
			
		}else if(e.getSource().equals(vpe.getBtnModificar())) {
			int row = vpe.getTable().getSelectedRow();
				if(row >= 0) {
				
					Long id = Long.parseLong(String.valueOf(vpe.getModel().getValueAt(row, 0)));
					PerfilEmpleadoEntity pee = repository.find(id);
					vpe.CargarForm(pee);
				
					
				}else {
					JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				}	
			
		}else if(e.getSource().equals(vpe.getBtnEliminar())) {
			int row = vpe.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vpe.getModel().getValueAt(row, 0)));
				PerfilEmpleadoEntity pee = repository.find(id);
				repository.delete(pee);
				vpe.ActualizarVista();
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}else if(e.getSource().equals(vpe.getBtnVerTodosLos())) {
			
			int row = vpe.getTable().getSelectedRow();
			if(row >= 0) {
				
				vpe.getTxtId().setText("");
				Long id = Long.parseLong(String.valueOf(vpe.getModel().getValueAt(row, 0)));
				PerfilEmpleadoEntity pee = repository.find(id);
				vpe.VerTodosDatos(pee);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}else if(e.getSource().equals(vpe.getBtnVaciarCampos())) {
			
			vpe.VaciarForm();
			
			
		}/*else if(e.getSource().equals(vpe.getBtnImprimir())) {
			JOptionPane.showMessageDialog(null, "OJITo");
			
			int row = vap.getTable().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vap.getModel().getValueAt(row, 0)));
				
				viap = new VistaImprimirAplicacionPresup();
				viap.setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
			    viap.setResizable(false); //Que no se pueda cambiar el tamaño
			    
			    AplicacionPresupuestoEntity ape = repository.find(id);
			    
				piap = new PanelImprimirAplicPresup();
				piap.getLblAprobadoPor().setText("CAMBIADO TOTALMENTE");
				piap.CargarForm(ape);
				
				piap = new PanelImprimirAplicPresup(); 
				viap.setVisible(true);
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
		}*/
		
	}
	
	public void LlenarTabla() {
		
		Iterator<PerfilEmpleadoEntity> lista = this.repository.findAll().iterator();
		this.vpe.getModel().getDataVector().removeAllElements();
		this.vpe.getModel().fireTableDataChanged();
		
		while(lista.hasNext()) {
			
			PerfilEmpleadoEntity pee = lista.next();
			
			this.vpe.getModel().addRow(new  Object[] {
					pee.getId(),
					pee.getCodigo(),
					pee.getDenominacionEmpleo(),
					pee.getSede(),
					pee.getNivel(),
					pee.getClaseCargo(),
					pee.getCargoJefeInmediato(),			
			});
		}
		
		// TODO Auto-generated method stub
		
	}

}
