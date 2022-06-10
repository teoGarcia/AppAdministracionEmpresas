/**
 * 
 */
package main.java.CuartoMedio.CalculoDeRemuneraciones.Menu;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import main.java.CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.VistaLiquidacionSueldo;
import main.java.CuartoMedio.CalculoDeRemuneraciones.PagoCotizaciones.VistaPagoCotizaciones;
import main.java.CuartoMedio.LegislacionLaboral.CertificadoVacaciones.VistaCertificadoVacaciones;
import main.java.CuartoMedio.LegislacionLaboral.Finiquitos.VistaFiniquito;
import main.java.CuartoMedio.LegislacionLaboral.PermisosLaborales.VistaPermisosLaborales;
import main.java.Menu.Side.SideMenu;

/**
 * @author Dead
 *
 */
public class ControladorMenuCalculoDeRemuneraciones implements ActionListener {

	private VistaMenuCalculoDeRemuneraciones vmcr;

	public ControladorMenuCalculoDeRemuneraciones(VistaMenuCalculoDeRemuneraciones vmcr) {
		this.vmcr = vmcr;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = e.getActionCommand();
		if(!SideMenu.isContentPanel(name)) lazinLoadView(e.getSource());
		SideMenu.changeContentPanel(name);
		
	}

	private void lazinLoadView(Object btn) {
		
		if(btn.equals(vmcr.getBtnLiqSue())) {
			SideMenu.registerContentPanel(new VistaLiquidacionSueldo(), vmcr.getBtnLiqSue().getText());
			
		}else if(btn.equals(vmcr.getBtnPagCot())) {
			SideMenu.registerContentPanel(new VistaPagoCotizaciones(), vmcr.getBtnPagCot().getText());
		}
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
