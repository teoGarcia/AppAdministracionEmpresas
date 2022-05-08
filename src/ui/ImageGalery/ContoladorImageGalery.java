package ui.ImageGalery;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import Main.Window;

public class ContoladorImageGalery implements ActionListener, WindowListener {

	private VistaImageGalery vig;
	private int index = 0;
	private int length  = 1;

	public ContoladorImageGalery(VistaImageGalery vig) {
		this.vig = vig;
		length = vig.getFotos().size();
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		if(ev.getSource().equals(vig.getBtnFlechaDerecha())){
			
			CambiarImagenHaciaDerecha();
			
		}else if(ev.getSource().equals(vig.getBtnFlechaIzquierda())) {

			CambiarImagenHaciaIzquierda();
		}
		// TODO Auto-generated method stub
		
	}
	
	
	public void CambiarImagenHaciaDerecha() {
			if(index < (length-1)) {
				index++;
			}else {
				index=0;
			}
			vig.changeImage(index);
	}
	
	public void CambiarImagenHaciaIzquierda() {
			if(index > 0) {
				index--;
			}else if(index == 0){
				index= length-1;
			}
			vig.changeImage(index);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowClosing(WindowEvent e) {
		Window.getInstance().setEnabled(true);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		Window.getInstance().setEnabled(false);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	


}
