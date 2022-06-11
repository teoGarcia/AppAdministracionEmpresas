/**
 * 
 */
package CuartoMedio.DesarolloBienestar.Menu;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Menu.VistaMenuPrincipalHorsExt;
import CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Menu.VistaMenuVacaciones;
import CuartoMedio.LegislacionLaboral.CertificadoVacaciones.VistaCertificadoVacaciones;
import CuartoMedio.LegislacionLaboral.Finiquitos.VistaFiniquito;
import CuartoMedio.LegislacionLaboral.PermisosLaborales.VistaPermisosLaborales;
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
			 SideMenu.registerContentPanel (new VistaMenuPrincipalHorsExt(), vmdb.getBtnCalHorExt().getText()); 
		 
		 }else if(btn.equals(vmdb.getBtnCalDeVac())) { 
			 SideMenu.registerContentPanel (new VistaMenuVacaciones() , vmdb.getBtnCalDeVac().getText()); 
		 }
		 /*}else
		 * if(btn.equals(vmll.getBtnPagCot())) { //SideMenu.registerContentPanel(new
		 * VistaPermisosLaborales(), vmll.getBtnPerLab().getText()); }else
		 * if(btn.equals(vmll.getBtnLibRem())) { //SideMenu.registerContentPanel(new
		 * VistaCertificadoVacaciones(), vmll.getBtnCerVac().getText()); }else
		 * if(btn.equals(vmll.getBtnAsiConRem())) { //SideMenu.registerContentPanel(new
		 * VistaFiniquito(), vmll.getBtnFinTrab().getText()); }
		 */
	}

}
