package CuartoMedio.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.LegislacionLaboral.Menu.VistaMenuLegislacionLaboral;
import Main.Window;
import Menu.SideMenu;
import TerceroMedio.Menu.VistaMenu3Medio;

public class ControladorMenu4Medio implements ActionListener {

	private VistaMenu4Medio vm4m;

	public ControladorMenu4Medio(VistaMenu4Medio vm4m) {
		this.vm4m = vm4m;
		SideMenu.getInstance();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		if(!SideMenu.isMenuPanel(name)) lazinLoadView(e.getSource());
		SideMenu.changeMenuPanel(name);
	}
	
	private void lazinLoadView(Object btn){
		if(btn.equals(vm4m.getBtnLegisLabo())) {
			SideMenu.registerMenuPanel(new VistaMenuLegislacionLaboral(), vm4m.getBtnLegisLabo().getText());
			
		}else if(btn.equals(vm4m.getBtnDotPer())) {
			SideMenu.registerMenuPanel(new VistaMenuLegislacionLaboral(), vm4m.getBtnLegisLabo().getText());
		}
	}

}
