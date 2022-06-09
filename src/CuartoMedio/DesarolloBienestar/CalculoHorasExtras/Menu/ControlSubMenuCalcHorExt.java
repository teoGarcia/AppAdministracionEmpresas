package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Empleado.VistaRegistrarEmpleado;
import CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Empleado.VistaVerEmpleado;
import Menu.Side.SideMenu;

public class ControlSubMenuCalcHorExt implements ActionListener {

	private VistaSubMenuCalcHorExt vsmche;
	
	public ControlSubMenuCalcHorExt(VistaSubMenuCalcHorExt vsmche) {
		this.vsmche = vsmche;
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
		
		 if(btn.equals(vsmche.getBtnCargarDatos())) { 
			 //SideMenu.registerContentPanel (new VistaRegistrarEmpleado(), vsmche.getBtnRegEmp().getText()); 
			 
		 }else if(btn.equals(vsmche.getBtnHorasSemana())) { 
			 //SideMenu.registerContentPanel (new VistaVerEmpleado(), vsmche.getBtnVerEmp().getText()); 
		 }

	}

}