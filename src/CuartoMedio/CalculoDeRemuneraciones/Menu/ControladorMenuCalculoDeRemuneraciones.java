/**
 * 
 */
package CuartoMedio.CalculoDeRemuneraciones.Menu;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.VistaLiquidacionSueldo;
import CuartoMedio.LegislacionLaboral.CertificadoVacaciones.VistaCertificadoVacaciones;
import CuartoMedio.LegislacionLaboral.Finiquitos.VistaFiniquito;
import CuartoMedio.LegislacionLaboral.PermisosLaborales.VistaPermisosLaborales;
import Menu.Side.SideMenu;

/**
 * @author Dead
 *
 */
public class ControladorMenuCalculoDeRemuneraciones implements ActionListener {

	private VistaMenuCalculoDeRemuneraciones vmcr;

	public ControladorMenuCalculoDeRemuneraciones(VistaMenuCalculoDeRemuneraciones vmcr) {
		this.vmcr = vmcr;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = e.getActionCommand();
		if(!SideMenu.isContentPanel(name)) lazinLoadView(e.getSource());
		SideMenu.changeContentPanel(name);
	}

	private void lazinLoadView(Object btn) {
		
		if(btn.equals(vmcr.getBtnLiqSue())) {
			JOptionPane.showMessageDialog(null, "Liquidacion de sueldo");
			SideMenu.registerContentPanel(new VistaLiquidacionSueldo(), vmcr.getBtnLiqSue().getText());
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
