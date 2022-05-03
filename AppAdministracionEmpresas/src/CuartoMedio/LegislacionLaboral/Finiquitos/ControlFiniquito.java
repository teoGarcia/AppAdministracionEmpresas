package CuartoMedio.LegislacionLaboral.Finiquitos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.LegislacionLaboral.CertificadoVacaciones.ModeloCertificadoVacaciones;
import CuartoMedio.LegislacionLaboral.CertificadoVacaciones.VistaCertificadoVacaciones;
import Helpers.AbrirDocumentos;
import ui.ImageGalery.VistaImageGalery;

public class ControlFiniquito implements ActionListener {

	private VistaFiniquito vista;
	private ModeloFiniquitos modelo = new ModeloFiniquitos();
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();  
	private VistaImageGalery galery;
	
	public ControlFiniquito(VistaFiniquito vista) {
		// TODO Auto-generated constructor stub
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(vista.isBtnEjemplo(e.getSource())) {
			if(galery == null) {
				galery = new VistaImageGalery(modelo.getImages());
			}
			galery.setVisible(true);
		}else if(vista.isBtnPracticar(e.getSource())) {
			mvd.VerDocumento(modelo.getDocument());
		}
	}

}
