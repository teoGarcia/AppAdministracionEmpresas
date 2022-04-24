package CuartoMedio.LegislacionLaboral.CertificadoVacaciones.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.LegislacionLaboral.CertificadoVacaciones.Vista.VistaCertificadoVacaciones;
import Helpers.AbrirDocumentos;

public class ControlCertificadoVacaciones implements ActionListener {

	private VistaCertificadoVacaciones vcv;
	private AbrirDocumentos ad = new AbrirDocumentos();
	
	public ControlCertificadoVacaciones(VistaCertificadoVacaciones vcv) {
		this.vcv = vcv;
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		if(ev.getSource().equals(vcv.getBtnPracticarVacaciones())) {
			System.out.println("heyy");
			String url = "src/DocumentosWord/SOLICITUD DE PERMISO POR VACACIONES.docx";
			ad.VerDocumento(url);
			
		}
		
	}

}
