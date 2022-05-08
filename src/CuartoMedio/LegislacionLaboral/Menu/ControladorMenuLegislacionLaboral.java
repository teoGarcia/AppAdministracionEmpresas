/**
 * 
 */
package CuartoMedio.LegislacionLaboral.Menu;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import CuartoMedio.LegislacionLaboral.CertificadoVacaciones.VistaCertificadoVacaciones;
import CuartoMedio.LegislacionLaboral.Finiquitos.VistaFiniquito;
import CuartoMedio.LegislacionLaboral.PermisosLaborales.VistaPermisosLaborales;
//import CuartoMedio.LegislacionLaboral.PermisosLaborales.VistaPermisosLaborales;
import Menu.Side.SideMenu;

/**
 * @author Dead
 *
 */
public class ControladorMenuLegislacionLaboral implements ActionListener {

	private VistaMenuLegislacionLaboral vmll;

	public ControladorMenuLegislacionLaboral(VistaMenuLegislacionLaboral vmll) {
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
		if(btn.equals(vmll.getBtnConTra())) {
			//SideMenu.registerContentPanel(new VistaMenuLegislacionLaboral(), vm4m.getBtnLegisLabo().getText());
		}else if(btn.equals(vmll.getBtnPerLab())) {		
			SideMenu.registerContentPanel(new VistaPermisosLaborales(), vmll.getBtnPerLab().getText());
		}else if(btn.equals(vmll.getBtnCerVac())) {		
			SideMenu.registerContentPanel(new VistaCertificadoVacaciones(), vmll.getBtnCerVac().getText());
		}else if(btn.equals(vmll.getBtnFinTrab())) {
			SideMenu.registerContentPanel(new VistaFiniquito(), vmll.getBtnFinTrab().getText());
		}
	}

}
