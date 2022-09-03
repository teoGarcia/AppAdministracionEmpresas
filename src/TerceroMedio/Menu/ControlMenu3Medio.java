package TerceroMedio.Menu;

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
import Menu.Side.SideMenu;

public class ControlMenu3Medio implements ActionListener, MouseListener {
	
	private VistaMenu3Medio vm3m;

	public ControlMenu3Medio(VistaMenu3Medio vm3m) {
		this.vm3m = vm3m;
		SideMenu.getInstance();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		if(!SideMenu.isMenuPanel(name)) lazinLoadView(e.getSource());
		SideMenu.changeMenuPanel(name);
	}
	
	private void lazinLoadView(Object btn){
		
		if(btn.equals(vm3m.getBtnProAdm())) {
			SideMenu.registerMenuPanel(new VistaMenuLegislacionLaboral(), vm3m.getBtnProAdm().getText());
		}else if(btn.equals(vm3m.getBtnUtiInfCon())) {
			SideMenu.registerMenuPanel(new VistaMenuCalculoDeRemuneraciones(), vm3m.getBtnUtiInfCon().getText());
		}else if(btn.equals(vm3m.getBtnOrgOfi())) {
			SideMenu.registerMenuPanel(new VistaMenuDotacionPersonal(), vm3m.getBtnOrgOfi().getText());
		}else if(btn.equals(vm3m.getBtnGesComTri())) {
			SideMenu.registerMenuPanel(new VistaMenuDesarrolloBienestar(), vm3m.getBtnGesComTri().getText());
		}else if(btn.equals(vm3m.getBtnAteCli())) {
			SideMenu.registerMenuPanel(new VistaMenuEyE(), vm3m.getBtnAteCli().getText());
		}else if(btn.equals(vm3m.getBtnGesBode())) {
			SideMenu.registerMenuPanel(new VistaMenuGestionBodega(), vm3m.getBtnGesBode().getText());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vm3m.getBtnExit())) 
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
