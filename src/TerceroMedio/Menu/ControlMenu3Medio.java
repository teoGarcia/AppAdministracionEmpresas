package TerceroMedio.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Main.Window;
import Menu.Side.SideMenu;

import TerceroMedio.AtencionAlCliente.Menu.VistaMenuAtencionCliente;
import TerceroMedio.GestionComercialTrib.Menu.VistaMenuGestionComTri;
import TerceroMedio.GestionDeBodega.Menu.VistaMenuGestionBodega;
import TerceroMedio.OrganizacionOficinas.Menu.VistaMenuInvDocFisDig;
import TerceroMedio.ProcesosAdministrativos.Menu.VistaMenuProcesosAdministrativos;
import TerceroMedio.UtilizacionDeLaInformacionContable.Menu.VistaMenuUtilizacionDeLaInformacionContable;

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
			SideMenu.registerMenuPanel(new VistaMenuProcesosAdministrativos(), vm3m.getBtnProAdm().getText());
		}else if(btn.equals(vm3m.getBtnUtiInfCon())) {
			SideMenu.registerMenuPanel(new VistaMenuUtilizacionDeLaInformacionContable(), vm3m.getBtnUtiInfCon().getText());
		}else if(btn.equals(vm3m.getBtnOrgOfi())) {
			SideMenu.registerMenuPanel(new VistaMenuInvDocFisDig(), vm3m.getBtnOrgOfi().getText());
		}else if(btn.equals(vm3m.getBtnGesComTri())) {
			SideMenu.registerMenuPanel(new VistaMenuGestionComTri(), vm3m.getBtnGesComTri().getText());
		}else if(btn.equals(vm3m.getBtnAteCli())) {
			SideMenu.registerMenuPanel(new VistaMenuAtencionCliente(), vm3m.getBtnAteCli().getText());
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
		if(e.getSource().equals(vm3m.getBtnExit())) {
			System.exit(0);
		}else if(e.getSource().equals(vm3m.getBtnBack())) {
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
