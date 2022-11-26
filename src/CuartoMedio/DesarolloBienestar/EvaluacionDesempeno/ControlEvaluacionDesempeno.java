package CuartoMedio.DesarolloBienestar.EvaluacionDesempeno;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import CuartoMedio.LegislacionLaboral.CertificadoVacaciones.ModeloCertificadoVacaciones;
import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;

public class ControlEvaluacionDesempeno implements ActionListener{
	
	private VistaEvaluacionDesempeno ved;
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();
	private ModeloEvaluacionDesempeno modelo = new ModeloEvaluacionDesempeno();
	
	public ControlEvaluacionDesempeno(VistaEvaluacionDesempeno ved) {
		this.ved = ved;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(ved.getStndrbtnVerDocumento())) {
			System.out.println(modelo.getDocument());
			mvd.VerDocumento(Urls.url1PDF, modelo.getDocument());
			
		}
		// TODO Auto-generated method stub
		
	}

}
