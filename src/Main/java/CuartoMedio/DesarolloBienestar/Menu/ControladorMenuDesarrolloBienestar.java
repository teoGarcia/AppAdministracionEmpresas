/**
 * 
 */
package main.java.CuartoMedio.DesarolloBienestar.Menu;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import main.java.CuartoMedio.LegislacionLaboral.CertificadoVacaciones.VistaCertificadoVacaciones;
import main.java.CuartoMedio.LegislacionLaboral.Finiquitos.VistaFiniquito;
import main.java.CuartoMedio.LegislacionLaboral.PermisosLaborales.VistaPermisosLaborales;
import main.java.Menu.Side.SideMenu;

/**
 * @author Dead
 *
 */
public class ControladorMenuDesarrolloBienestar implements ActionListener {

	private VistaMenuDesarrolloBienestar vmll;

	public ControladorMenuDesarrolloBienestar(VistaMenuDesarrolloBienestar vmll) {
		this.vmll = vmll;
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
		/*
		 * if(btn.equals(vmll.getBtnLiqSue())) { //SideMenu.registerContentPanel(new
		 * VistaMenuLegislacionLaboral(), vm4m.getBtnLegisLabo().getText()); }else
		 * if(btn.equals(vmll.getBtnPagCot())) { //SideMenu.registerContentPanel(new
		 * VistaPermisosLaborales(), vmll.getBtnPerLab().getText()); }else
		 * if(btn.equals(vmll.getBtnLibRem())) { //SideMenu.registerContentPanel(new
		 * VistaCertificadoVacaciones(), vmll.getBtnCerVac().getText()); }else
		 * if(btn.equals(vmll.getBtnAsiConRem())) { //SideMenu.registerContentPanel(new
		 * VistaFiniquito(), vmll.getBtnFinTrab().getText()); }
		 */
	}

}
