package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Menu.Side.SideMenu;

public class ControlMenuPrinciparHorExt implements ActionListener {

	private VistaMenuPrincipalHorsExt vmphe;
	
	public ControlMenuPrinciparHorExt(VistaMenuPrincipalHorsExt vmphe) {		
		this.vmphe = vmphe;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = e.getActionCommand();
		if(!SideMenu.isContentPanel(name)) lazinLoadView(e.getSource());
		SideMenu.changeContentPanel(name);
		
		//if(e.getSource().equals(vmphe.getbtnEmp())) {
			//JOptionPane.showMessageDialog(null, "HOLAA!");
			//SideMenu.registerContentPanel(new VistaSubMenuCalcHorExt(), "C");
			
		//}
	}
	
	private void lazinLoadView(Object btn) {
		// TODO Auto-generated method stub
		
		 if(btn.equals(vmphe.getbtnEmp())) { 
			 SideMenu.registerContentPanel (new VistaSubMenuCalcHorExt(), vmphe.getbtnEmp().getText()); 
		 }

	}

}
