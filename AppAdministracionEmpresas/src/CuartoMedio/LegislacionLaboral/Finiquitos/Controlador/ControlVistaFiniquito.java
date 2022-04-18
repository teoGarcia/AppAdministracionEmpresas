package CuartoMedio.LegislacionLaboral.Finiquitos.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.LegislacionLaboral.Finiquitos.Vista.VistaFiniquito;
import Modelo.AbrirDocumentos;

public class ControlVistaFiniquito implements ActionListener {
	
	private VistaFiniquito vf;
	private AbrirDocumentos ad = new AbrirDocumentos();
	
	public ControlVistaFiniquito(VistaFiniquito vf) {
		this.vf = vf;
		
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		if(ev.getSource().equals(vf.getBtnPracticar())) {
			
			String url = "src/DocumentosWord/MODELO DE FINIQUITO DE CONTRATO.docx";
			ad.VerDocumento(url);
		}
		// TODO Auto-generated method stub
		
	}
	

}
