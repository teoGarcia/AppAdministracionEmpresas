package TerceroMedio.GestionComercialTrib.Formulario22;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;

public class ControlFormulario implements ActionListener {
	
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();
	private ModeloFormulario modelo = new ModeloFormulario();
	private VistaFormulario vista;

	public ControlFormulario(VistaFormulario vista) {
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vista.getStndrbtnVerDocumento())) {
			mvd.VerDocumento(Urls.url3Exc, modelo.getDocument());	
		}
		
	}

}
