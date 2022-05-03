package Menu.Side;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Main.Window;

public class ControladorSideMenu implements ActionListener {

	private SideMenu vista;
	
	public ControladorSideMenu(SideMenu vista) {
		// TODO Auto-generated constructor stub
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Window.changeContent("menu");
	}

}
