package CuartoMedio.DotacionPersonal.SeleccionPersonal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoRepository;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir.PanelImprimirAplicPresup;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir.VistaImprimirAplicacionPresup;
import CuartoMedio.DotacionPersonal.SeleccionPersonal.Imprimir.PanelImprimirSeleccionPersonal;
import CuartoMedio.DotacionPersonal.SeleccionPersonal.Imprimir.VistaImprimirSeleccionPersonal;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlSeleccionPersonal implements ActionListener {
	
	private SeleccionPersonalRepository repository;
	private VistaSeleccionPersonal vsp;
	private VistaImprimirSeleccionPersonal viap;
	private PanelImprimirSeleccionPersonal piap;

	public ControlSeleccionPersonal(VistaSeleccionPersonal vsp) {
		this.repository = new SeleccionPersonalRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vsp = vsp;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(vsp.getBtnGuardar())) {
			
			// GUARDAR
			
			if(vsp.getTxtId().getText().length() <= 0) {
				if(vsp.camposVacios()) {
					SeleccionPersonalEntity spe = new SeleccionPersonalEntity();
					
					spe.setNombres(vsp.getTxtNombres().getText());
					spe.setApellidoPaterno(vsp.getTxtApePat().getText());
					spe.setApellidoMaterno(vsp.getTxtApeMat().getText());
					spe.setCURP(vsp.getTxtCur().getText());
					spe.setNumIMSS(vsp.getTxtNumIMSS().getText());
					spe.setDomicilio(vsp.getTxtDom().getText());
					spe.setCasoAccion(vsp.getTxtCasAccLla().getText());
					spe.setEstadoCivil(vsp.getComboBoxEstCiv().getSelectedIndex());
					spe.setSexo(vsp.getComboBoxSex().getSelectedIndex());
					spe.setInstitucion(vsp.getTxtIns().getText());
					spe.setCarrera(vsp.getTxtCar().getText());
					spe.setAno(vsp.getTxtAno().getYear());
					spe.setIdioma(vsp.getComboBoxIdiomas().getSelectedIndex());
					spe.setNivel(vsp.getComboBoxNivel().getSelectedIndex());
					spe.setPractica(vsp.getComboBoxPractica().getSelectedIndex());
					spe.setCurso1(vsp.getTxtCur1().getText());
					spe.setCurso2(vsp.getTxtCur2().getText());
					spe.setCurso3(vsp.getTxtCur3().getText());
					spe.setCurso4(vsp.getTxtCur4().getText());
					spe.setNombreCompania(vsp.getTxtNomCom().getText());
					spe.setAreaOcupaba(vsp.getTxtAreOcu().getText());
					spe.setPuestoAntiguo(vsp.getTxtPueAnt().getText());
					spe.setOcupacion(vsp.getTxtOcu().getText());
					spe.setJefe(vsp.getTxtJef().getText());
					spe.setSueldo(Integer.parseInt(vsp.getTxtSue().getText()));
					spe.setTelefono(vsp.getTxtTel().getText());
					spe.setFechaIngreso(vsp.getFecIng().getCalendar());
					spe.setFechaTermino(vsp.getFecTer().getCalendar());
					spe.setPremio(vsp.getTxtPre().getText());
					spe.setReconocimiento(vsp.getTxtRec().getText());
					spe.setLogros(vsp.getTxtLog().getText());
					
					SeleccionPersonalEntity db = this.repository.create(spe);
					if(db != null) {
						Mensajes.Creacion();
						vsp.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
				
			// ACTUALIZAR (MODIFICAR)
			}else{
				if(vsp.camposVacios()) {
					
					SeleccionPersonalEntity spe = new SeleccionPersonalEntity();
					
					spe.setId(Long.parseLong(vsp.getTxtId().getText()));
					
					spe.setNombres(vsp.getTxtNombres().getText());
					spe.setApellidoPaterno(vsp.getTxtApePat().getText());
					spe.setApellidoMaterno(vsp.getTxtApeMat().getText());
					spe.setCURP(vsp.getTxtCur().getText());
					spe.setNumIMSS(vsp.getTxtNumIMSS().getText());
					spe.setDomicilio(vsp.getTxtDom().getText());
					spe.setCasoAccion(vsp.getTxtCasAccLla().getText());
					spe.setEstadoCivil(vsp.getComboBoxEstCiv().getSelectedIndex());
					spe.setSexo(vsp.getComboBoxSex().getSelectedIndex());
					spe.setInstitucion(vsp.getTxtIns().getText());
					spe.setCarrera(vsp.getTxtCar().getText());
					spe.setAno(vsp.getTxtAno().getYear());
					spe.setIdioma(vsp.getComboBoxIdiomas().getSelectedIndex());
					spe.setNivel(vsp.getComboBoxNivel().getSelectedIndex());
					spe.setPractica(vsp.getComboBoxPractica().getSelectedIndex());
					spe.setCurso1(vsp.getTxtCur1().getText());
					spe.setCurso2(vsp.getTxtCur2().getText());
					spe.setCurso3(vsp.getTxtCur3().getText());
					spe.setCurso4(vsp.getTxtCur4().getText());
					spe.setNombreCompania(vsp.getTxtNomCom().getText());
					spe.setAreaOcupaba(vsp.getTxtAreOcu().getText());
					spe.setPuestoAntiguo(vsp.getTxtPueAnt().getText());
					spe.setOcupacion(vsp.getTxtOcu().getText());
					spe.setJefe(vsp.getTxtJef().getText());
					spe.setSueldo(Integer.parseInt(vsp.getTxtSue().getText()));
					spe.setTelefono(vsp.getTxtTel().getText());
					spe.setFechaIngreso(vsp.getFecIng().getCalendar());
					spe.setFechaTermino(vsp.getFecTer().getCalendar());
					spe.setPremio(vsp.getTxtPre().getText());
					spe.setReconocimiento(vsp.getTxtRec().getText());
					spe.setLogros(vsp.getTxtLog().getText());
					
					SeleccionPersonalEntity db = this.repository.update(spe);
					if(db != null) {
						Mensajes.Actualizacion();
						vsp.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
			}
			
		}else if(e.getSource().equals(vsp.getBtnModificar())) {
			int row = vsp.getTable().getSelectedRow();
				if(row >= 0) {
				
					Long id = Long.parseLong(String.valueOf(vsp.getModel().getValueAt(row, 0)));
					SeleccionPersonalEntity spe = repository.find(id);
					vsp.CargarForm(spe);
				
					
				}else {
					JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				}	
			
		}else if(e.getSource().equals(vsp.getBtnEliminar())) {
			int row = vsp.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vsp.getModel().getValueAt(row, 0)));
				SeleccionPersonalEntity spe = repository.find(id);
				repository.delete(spe);
				vsp.ActualizarVista();
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}else if(e.getSource().equals(vsp.getBtnVerTodosLos())) {
			
			int row = vsp.getTable().getSelectedRow();
			if(row >= 0) {
				
				vsp.getTxtId().setText("");
				Long id = Long.parseLong(String.valueOf(vsp.getModel().getValueAt(row, 0)));
				SeleccionPersonalEntity spe = repository.find(id);
				vsp.VerTodosDatos(spe);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}else if(e.getSource().equals(vsp.getBtnVaciarCampos())) {
			
			vsp.VaciarForm();
			
			
		}else if(e.getSource().equals(vsp.getBtnImprimir())) {
			
			int row = vsp.getTable().getSelectedRow();
			if(row >= 0) {
				
				Long id = Long.parseLong(String.valueOf(vsp.getModel().getValueAt(row, 0)));
				
				System.out.println("ID"+ id);
				
				viap = new VistaImprimirSeleccionPersonal();
			    
			    SeleccionPersonalEntity spe = repository.find(id);
			    
			    int seleccion1 = spe.getEstadoCivil();
				String EstadoCivil = vsp.getComboBoxEstCiv().getItemAt(seleccion1).toString();
				
				int seleccion2 = spe.getSexo();
				String Sexo = vsp.getComboBoxSex().getItemAt(seleccion2).toString();
				
				piap = viap.getPiap();
				piap.CargarForm(spe);
				piap.getLblEstadoCivil().setText(EstadoCivil);
				piap.getLblSexo().setText(Sexo);
				viap.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
		}
		
	}
	
	public void LlenarTabla() {
		
		Iterator<SeleccionPersonalEntity> lista = this.repository.findAll().iterator();
		this.vsp.getModel().getDataVector().removeAllElements();
		this.vsp.getModel().fireTableDataChanged();
		
		while(lista.hasNext()) {
			SeleccionPersonalEntity spe = lista.next();
			
			int EstadoCivil = spe.getEstadoCivil();
			int Sexo = spe.getSexo();
			int Idioma = spe.getIdioma();
			int Nivel = spe.getNivel();
			int Practica = spe.getPractica();
			
			String ComboEstadoCivil = vsp.getComboBoxEstCiv().getItemAt(EstadoCivil).toString();
			String ComboSexo = vsp.getComboBoxSex().getItemAt(Sexo).toString();
			String ComboIdioma = vsp.getComboBoxIdiomas().getItemAt(Idioma).toString();	
			String ComboNivel = vsp.getComboBoxNivel().getItemAt(Nivel).toString();
			String ComboPractica = vsp.getComboBoxPractica().getItemAt(Practica).toString();	
			
			this.vsp.getModel().addRow(new  Object[] {
					spe.getId(),
					spe.getNombres(),
					spe.getApellidoPaterno(),
					spe.getApellidoMaterno(),
					spe.getDomicilio(),
					ComboEstadoCivil,
					ComboSexo,
					spe.getCURP(),
					spe.getNumIMSS(),
					ComboIdioma
					
			});
		}
		
		// TODO Auto-generated method stub
		
	}

}
