package CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Menu;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones.VistaCalendarioVacaciones;
import CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones.VistaRegistrarPermiso;
import Menu.Side.SideMenu;

public class ControlMenuVacaciones implements ActionListener {
	
	private VistaMenuVacaciones vmv;

	public ControlMenuVacaciones(VistaMenuVacaciones vmv) {
		this.vmv = vmv;
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = e.getActionCommand();
		if(!SideMenu.isContentPanel(name)) lazinLoadView(e.getSource());
		SideMenu.changeContentPanel(name);
	}

	private void lazinLoadView(Object btn) {
		// TODO Auto-generated method stub
		
		 if(btn.equals(vmv.getBtnRegistrarPermiso())) { 
			 SideMenu.registerContentPanel (new VistaRegistrarPermiso(), vmv.getBtnRegistrarPermiso().getText()); 
		 
		 }else if(btn.equals(vmv.getBtnCalendarioVacaciones())) { 
			 SideMenu.registerContentPanel (new VistaCalendarioVacaciones() , vmv.getBtnCalendarioVacaciones().getText()); 
		 }
		 
	}

}
