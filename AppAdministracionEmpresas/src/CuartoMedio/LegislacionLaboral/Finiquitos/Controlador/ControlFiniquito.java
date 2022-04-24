package CuartoMedio.LegislacionLaboral.Finiquitos.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.LegislacionLaboral.Finiquitos.Vista.Finiquito;
import Helpers.AbrirDocumentos;

public class ControlFiniquito implements ActionListener {
	
	private Finiquito f;
	private AbrirDocumentos ad = new AbrirDocumentos();
	
	public ControlFiniquito(Finiquito f) {
		this.f = f;
		
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		if(ev.getSource().equals(f.getBtnFlechaDerecha())) {
			
			String url = "src/DocumentosWord/MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1.docx";
			ad.VerDocumento(url);
			
			
		}
		// TODO Auto-generated method stub
		
	}

}
