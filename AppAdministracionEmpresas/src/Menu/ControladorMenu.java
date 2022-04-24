package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.Menu.VistaMenu4Medio;
import Main.Window;
import TerceroMedio.Menu.VistaMenu3Medio;


public class ControladorMenu implements ActionListener {
	
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

}
