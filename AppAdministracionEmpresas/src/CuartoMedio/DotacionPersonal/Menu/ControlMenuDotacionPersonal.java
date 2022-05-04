package CuartoMedio.DotacionPersonal.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CuartoMedio.DotacionPersonal.SeleccionPersonal.VistaSeleccionPersonal;
import CuartoMedio.LegislacionLaboral.CertificadoVacaciones.VistaCertificadoVacaciones;
import CuartoMedio.LegislacionLaboral.Finiquitos.VistaFiniquito;
import Menu.Side.SideMenu;

public class ControlMenuDotacionPersonal implements ActionListener {
	
	private VistaMenuDotacionPersonal vmdp;

	public ControlMenuDotacionPersonal(VistaMenuDotacionPersonal vmdp) {
		this.vmdp = vmdp;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = e.getActionCommand();
		if(!SideMenu.isContentPanel(name)) lazinLoadView(e.getSource());
		SideMenu.changeContentPanel(name);
		
	}
	
	private void lazinLoadView(Object btn) {
		// TODO Auto-generated method stub
		if(btn.equals(vmdp.getBtnAplPueTra())) {
			//SideMenu.registerContentPanel(new VistaMenuLegislacionLaboral(), vm4m.getBtnLegisLabo().getText());
		}else if(btn.equals(vmdp.getBtnSelPer())) {		
			SideMenu.registerContentPanel(new VistaSeleccionPersonal(), vmdp.getBtnSelPer().getText());
		}else if(btn.equals(vmdp.getBtnPerEmp())) {
			//SideMenu.registerContentPanel(new VistaFiniquito(), vmll.getBtnFinTrab().getText());
		}
	}

	/*public void actionPerformed(ActionEvent e) {

		if(e.getSource().equals(vmdp.getBtnSelPer())){
			
			JOptionPane.showMessageDialog(null, "prue - prueba");
			SideMenu.registerContentPanel(new VistaMenuDotacionPersonal(), vmdp.getBtnSelPer().getText());
			JOptionPane.showMessageDialog(null, "prue - prueba");
			
		}
		
	}*/

}
