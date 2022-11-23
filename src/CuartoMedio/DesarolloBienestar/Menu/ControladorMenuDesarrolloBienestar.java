/**
 * 
 */
package CuartoMedio.DesarolloBienestar.Menu;

import java.awt.event.ActionEvent;





import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CuartoMedio.DesarolloBienestar.CalculoHorasExtras.VistaCalculoHorasExtras;
import CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones.VistaCalendarioVacaciones;
import CuartoMedio.DesarolloBienestar.EvaluacionDesempeno.VistaEvaluacionDesempenio;
import CuartoMedio.DesarolloBienestar.FichaTrabajador.VistaFichaTrabajador;
import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.VistaPresupuestoCapacitacion;
import CuartoMedio.DesarolloBienestar.RegistroAusenciaEmpleado.AusenciaEmpleado.VistaVerAusenciaEmpleado;
import CuartoMedio.DesarolloBienestar.RegistroCapacEmpleado.VistaRegistroCapacEmpleado;
import Menu.Side.SideMenu;

/**
 * @author Dead
 *
 */
public class ControladorMenuDesarrolloBienestar implements ActionListener {

	private VistaMenuDesarrolloBienestar vmdb;

	public ControladorMenuDesarrolloBienestar(VistaMenuDesarrolloBienestar vmdb) {
		this.vmdb = vmdb;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = e.getActionCommand();
		if(!SideMenu.isContentPanel(name)) lazinLoadView(e.getSource());
		SideMenu.changeContentPanel(name);
	}

	private void lazinLoadView(Object btn) {
		// TODO Auto-generated method stub
		
		 if(btn.equals(vmdb.getBtnCalHorExt())) { 
			 SideMenu.registerContentPanel (new VistaCalculoHorasExtras(), vmdb.getBtnCalHorExt().getText()); 
		 
		 }else if(btn.equals(vmdb.getBtnCalDeVac())) { 
			 SideMenu.registerContentPanel (new VistaCalendarioVacaciones() , vmdb.getBtnCalDeVac().getText()); 
		
		 }else if(btn.equals(vmdb.getBtnPreCap())) { 
			 SideMenu.registerContentPanel(new VistaPresupuestoCapacitacion(), vmdb.getBtnPreCap().getText()); 
		 
		 }else if(btn.equals(vmdb.getBtnRegAusEmp())) { 
			 SideMenu.registerContentPanel(new VistaVerAusenciaEmpleado(), vmdb.getBtnRegAusEmp().getText()); 
			 
		 }else if(btn.equals(vmdb.getBtnEvaDes())) { 
			 SideMenu.registerContentPanel(new VistaEvaluacionDesempenio(), vmdb.getBtnEvaDes().getText()); 
		 }else if(btn.equals(vmdb.getBtnRegCap())) { 
			 SideMenu.registerContentPanel(new VistaRegistroCapacEmpleado(), vmdb.getBtnRegCap().getText()); 
		 
		 }else if(btn.equals(vmdb.getBtnFicTra())) { 
			 SideMenu.registerContentPanel(new VistaFichaTrabajador(), vmdb.getBtnFicTra().getText()); 
		 
		 }
		 
		 /*else
		 * if(btn.equals(vmll.getBtnLibRem())) { //SideMenu.registerContentPanel(new
		 * VistaCertificadoVacaciones(), vmll.getBtnCerVac().getText()); }else
		 * if(btn.equals(vmll.getBtnAsiConRem())) { //SideMenu.registerContentPanel(new
		 * VistaFiniquito(), vmll.getBtnFinTrab().getText()); }
		 */
	}

}
