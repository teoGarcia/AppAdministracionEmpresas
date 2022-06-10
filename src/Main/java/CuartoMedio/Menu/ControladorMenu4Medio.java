package main.java.CuartoMedio.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import main.java.CuartoMedio.CalculoDeRemuneraciones.Menu.VistaMenuCalculoDeRemuneraciones;
import main.java.CuartoMedio.DesarolloBienestar.Menu.VistaMenuDesarrolloBienestar;
import main.java.CuartoMedio.DotacionPersonal.Menu.VistaMenuDotacionPersonal;
import main.java.CuartoMedio.EmprendimientoYEmpleabilidad.Menu.VistaMenuEyE;
import main.java.CuartoMedio.GestionDeBodega.Menu.VistaMenuGestionBodega;
import main.java.CuartoMedio.LegislacionLaboral.Menu.VistaMenuLegislacionLaboral;
import main.java.Main.Window;
import main.java.Menu.Side.SideMenu;
import main.java.TerceroMedio.Menu.VistaMenu3Medio;

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
