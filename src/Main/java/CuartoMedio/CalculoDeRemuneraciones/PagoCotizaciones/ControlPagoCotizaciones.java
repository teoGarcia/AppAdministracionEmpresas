package main.java.CuartoMedio.CalculoDeRemuneraciones.PagoCotizaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.java.CuartoMedio.LegislacionLaboral.CertificadoVacaciones.ModeloCertificadoVacaciones;
import main.java.Helpers.AbrirDocumentos;
import main.java.Helpers.AbrirDocumentos.Urls;
import main.java.ui.ImageGalery.VistaImageGalery;

public class ControlPagoCotizaciones implements ActionListener {
	
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();
	private ModeloPagoCotizaciones modelo = new ModeloPagoCotizaciones();
	private VistaPagoCotizaciones vpc;

	public ControlPagoCotizaciones(VistaPagoCotizaciones vpc) {
		this.vpc = vpc;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(vpc.isBtnPracticar(e.getSource())) {
			mvd.VerDocumento(Urls.url4Exc, modelo.getDocument());
			
		}
		// TODO Auto-generated method stub
		
	}

}
