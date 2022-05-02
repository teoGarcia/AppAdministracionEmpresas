package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import CuartoMedio.Menu.VistaMenu4Medio;
import Main.Window;
import TerceroMedio.Menu.VistaMenu3Medio;


public class ControladorMenu implements ActionListener, MouseListener {
	
	private VistaMenu vm;

	public ControladorMenu(VistaMenu vm) {
		this.vm = vm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		if(!Window.isPanel(name)) lazinLoadView(e.getSource());
		Window.changeContent(name);
	}
	
	
	private void lazinLoadView(Object btn){
		if(btn.equals(vm.getBtn3Medio())) {
			Window.registerPanel(new VistaMenu3Medio(), vm.getBtn3Medio().getText());
		}else if(btn.equals(vm.getBtn4Medio())) {
			Window.registerPanel(new VistaMenu4Medio(),  vm.getBtn4Medio().getText());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vm.getBtnExit())) 
			System.exit(0);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
