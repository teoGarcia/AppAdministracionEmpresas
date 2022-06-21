package CuartoMedio.DesarolloBienestar.EvaluacionDesempeno;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CuartoMedio.LegislacionLaboral.CertificadoVacaciones.ModeloCertificadoVacaciones;
import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;

public class ControlEvaluacionDesempeno implements ActionListener{
	
	private VistaEvaluacionDesempe�o ved;
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();
	private ModeloEvaluacionDesempeno modelo = new ModeloEvaluacionDesempeno();

	public ControlEvaluacionDesempeno(VistaEvaluacionDesempe�o ved) {
		this.ved = ved;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(ved.getStndrbtnVerDocumento())) {
			
			mvd.VerDocumento(Urls.url1PDF, modelo.getDocument());
			
		}
		// TODO Auto-generated method stub
		
	}

}