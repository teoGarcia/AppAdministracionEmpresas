package CuartoMedio.DesarolloBienestar.RegistroAusenciaEmpleado.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Menu.VistaMenuPrincipalHorsExt;
import CuartoMedio.DesarolloBienestar.RegistroAusenciaEmpleado.AusenciaEmpleado.VistaRegistroAusenciaEmpleado;
import CuartoMedio.DesarolloBienestar.RegistroAusenciaEmpleado.AusenciaEmpleado.VistaVerAusenciaEmpleado;
import Menu.Side.SideMenu;

public class ControlMenuRegistroAusenciaEmp implements ActionListener {
	
	private VistaMenuRegistroAusenciaEmp vmrae;

	public ControlMenuRegistroAusenciaEmp(VistaMenuRegistroAusenciaEmp vmrae) {
		this.vmrae = vmrae;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = e.getActionCommand();
		if(!SideMenu.isContentPanel(name)) lazinLoadView(e.getSource());
		SideMenu.changeContentPanel(name);
	}

	private void lazinLoadView(Object btn) {
		// TODO Auto-generated method stub
		
		 if(btn.equals(vmrae.getStndrbtnRegistarAusenciaDel())) { 
			 SideMenu.registerContentPanel (new VistaRegistroAusenciaEmpleado(), vmrae.getStndrbtnRegistarAusenciaDel().getText()); 
		 
		 }else if(btn.equals(vmrae.getStndrbtnVerAusencia())) { 
			 SideMenu.registerContentPanel (new VistaVerAusenciaEmpleado(), vmrae.getStndrbtnVerAusencia().getText()); 
		 
		 }
	}

}
