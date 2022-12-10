package TerceroMedio.GestionComercialTrib.Formulario29;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;

public class ControlFormulario implements ActionListener {
	
	private VistaFormulario vpc;
	private ModeloFormulario modelo = new ModeloFormulario();
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();
	
	

	public ControlFormulario(VistaFormulario vpc) {
		this.vpc = vpc;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vpc.getStndrbtnVerDocumento())) {
			mvd.VerDocumento(Urls.url3Exc, modelo.getDocument());
		}
		
	}

}
