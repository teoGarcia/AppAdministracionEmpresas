package CuartoMedio.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import CuartoMedio.DotacionPersonal.Menu.VistaMenuDotacionPersonal;
import CuartoMedio.LegislacionLaboral.Menu.VistaMenuLegislacionLaboral;
import Main.Window;
import Menu.SideMenu;
import TerceroMedio.Menu.VistaMenu3Medio;

public class ControladorMenu4Medio implements ActionListener, MouseListener {
	
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
			SideMenu.registerMenuPanel(new VistaMenuDotacionPersonal(), vm4m.getBtnDotPer().getText());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vm4m.getBtnExit())) 
			System.exit(0);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
