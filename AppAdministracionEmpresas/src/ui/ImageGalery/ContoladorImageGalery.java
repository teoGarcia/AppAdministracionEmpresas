package ui.ImageGalery;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import CuartoMedio.LegislacionLaboral.Contratos.Vista.VistaContratoIndefinido;

public class ContoladorImageGalery implements ActionListener {

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

}
