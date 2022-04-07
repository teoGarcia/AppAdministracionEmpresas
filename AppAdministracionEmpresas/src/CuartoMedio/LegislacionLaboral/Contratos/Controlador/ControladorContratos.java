package CuartoMedio.LegislacionLaboral.Contratos.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import CuartoMedio.LegislacionLaboral.Contratos.Vista.VistaContratos;

public class ControladorContratos implements ActionListener {

	private VistaContratos vc; 
	
	public ControladorContratos(VistaContratos vc) {
		
		this.vc = vc;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		if(ev.getSource().equals(vc.getBtnPracticarIndefinido())) {
			
			try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:/Mi archivo.pdf");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		// TODO Auto-generated method stub
		
	}

}
