package CuartoMedio.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import CuartoMedio.CalculoDeRemuneraciones.Menu.VistaMenuCalculoDeRemuneraciones;
import CuartoMedio.DesarolloBienestar.Menu.VistaMenuDesarrolloBienestar;
import CuartoMedio.DotacionPersonal.Menu.VistaMenuDotacionPersonal;
import CuartoMedio.EmprendimientoYEmpleabilidad.Menu.VistaMenuEyE;
import CuartoMedio.GestionDeBodega.Menu.VistaMenuGestionBodega;
import CuartoMedio.LegislacionLaboral.Menu.VistaMenuLegislacionLaboral;
import Main.Window;
import Menu.Side.SideMenu;
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
		}else if(btn.equals(vm4m.getBtnCalRemFinObli())) {
			SideMenu.registerMenuPanel(new VistaMenuCalculoDeRemuneraciones(), vm4m.getBtnCalRemFinObli().getText());
		}else if(btn.equals(vm4m.getBtnDotPer())) {
			SideMenu.registerMenuPanel(new VistaMenuDotacionPersonal(), vm4m.getBtnDotPer().getText());
		}else if(btn.equals(vm4m.getBtnDesBinePer())) {
			SideMenu.registerMenuPanel(new VistaMenuDesarrolloBienestar(), vm4m.getBtnDesBinePer().getText());
		}else if(btn.equals(vm4m.getBtnEmpreEmple())) {
			SideMenu.registerMenuPanel(new VistaMenuEyE(), vm4m.getBtnEmpreEmple().getText());
		}else if(btn.equals(vm4m.getBtnGesBode())) {
			SideMenu.registerMenuPanel(new VistaMenuGestionBodega(), vm4m.getBtnGesBode().getText());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vm4m.getBtnExit())) {
			System.exit(0);
		}else if(e.getSource().equals(vm4m.getBtnBack())) {
			Window.changeContent("menu");
		}
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
