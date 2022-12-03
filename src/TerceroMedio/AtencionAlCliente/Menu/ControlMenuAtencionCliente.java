package TerceroMedio.AtencionAlCliente.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Menu.Side.SideMenu;
import TerceroMedio.AtencionAlCliente.Quejas.VistaQuejas;
import TerceroMedio.AtencionAlCliente.RegClientes.VistaRegClientes;

public class ControlMenuAtencionCliente implements ActionListener {
	
	private VistaMenuAtencionCliente vista;

	public ControlMenuAtencionCliente(VistaMenuAtencionCliente vista) {
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = e.getActionCommand();
		if(!SideMenu.isContentPanel(name)) lazinLoadView(e.getSource());
		SideMenu.changeContentPanel(name);
		
	}
	
	private void lazinLoadView(Object btn) {
		// TODO Auto-generated method stub
		
		if(btn.equals(vista.getBtnQuejas())) {
			SideMenu.registerContentPanel(new VistaQuejas(), vista.getBtnQuejas().getText()); 
		}else if(btn.equals(vista.getBtnResgClientes())) {
			SideMenu.registerContentPanel(new VistaRegClientes(), vista.getBtnResgClientes().getText()); 
		}
		 
	}

}
