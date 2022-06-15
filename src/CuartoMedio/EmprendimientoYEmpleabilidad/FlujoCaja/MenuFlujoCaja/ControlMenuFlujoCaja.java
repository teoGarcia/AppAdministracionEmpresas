package CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.MenuFlujoCaja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.EmprendimientoYEmpleabilidad.AnalisisFODA.VistaAnalisisFODA;
import CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja.VistaFlujoCaja;
import CuartoMedio.EmprendimientoYEmpleabilidad.Menu.VistaMenuEyE;
import Menu.Side.SideMenu;

public class ControlMenuFlujoCaja implements ActionListener {
	
	private VistaMenuFlujoCaja vmfc;
	
	public ControlMenuFlujoCaja(VistaMenuFlujoCaja vmfc) {
		this.vmfc = vmfc;
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
		if(btn.equals(vmfc.getBtnRegCaj())) {
			//SideMenu.registerContentPanel(new VistaRe, vmee.getBtnPlaNeg().getText());
		}else if(btn.equals(vmfc.getBtnCaj())) {		
			SideMenu.registerContentPanel(new VistaFlujoCaja(), vmfc.getBtnCaj().getText());
		}
	}
}
