package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.MenuCalenProyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto.VistaCalendarioProyectos;
import CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto.VistaRegistrarProyecto;
import CuartoMedio.EmprendimientoYEmpleabilidad.Menu.VistaMenuEyE;
import Menu.Side.SideMenu;

public class ControlMenuCalenProyecto implements ActionListener {
	
	private VistaMenuCalenProyecto vmcp;

	public ControlMenuCalenProyecto(VistaMenuCalenProyecto vmcp){
		this.vmcp = vmcp;
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
		if(btn.equals(vmcp.getTlbtnRegistrarProyecto())) {
			SideMenu.registerContentPanel(new VistaRegistrarProyecto(), vmcp.getTlbtnRegistrarProyecto().getText());
		}else if(btn.equals(vmcp.getTlbtnCalendarioProyecto())) {
			SideMenu.registerContentPanel(new VistaCalendarioProyectos(), vmcp.getTlbtnCalendarioProyecto().getText());
		}
	}
}
