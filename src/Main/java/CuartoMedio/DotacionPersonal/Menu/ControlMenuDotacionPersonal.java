package main.java.CuartoMedio.DotacionPersonal.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import main.java.CuartoMedio.DotacionPersonal.PerfilEmpleado.VistaPerfilEmpleado;
import main.java.CuartoMedio.DotacionPersonal.SeleccionPersonal.VistaSeleccionPersonal;
import main.java.CuartoMedio.LegislacionLaboral.CertificadoVacaciones.VistaCertificadoVacaciones;
import main.java.CuartoMedio.LegislacionLaboral.Finiquitos.VistaFiniquito;
import main.java.Menu.Side.SideMenu;

public class ControlMenuDotacionPersonal implements ActionListener {
	
	private VistaMenuDotacionPersonal vmdp;
	private VistaPerfilEmpleado vpe;

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
			SideMenu.registerContentPanel(new VistaPerfilEmpleado(), vmdp.getBtnPerEmp().getText());
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
