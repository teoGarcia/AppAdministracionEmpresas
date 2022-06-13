package CuartoMedio.DesarolloBienestar.FichaTrabajador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.DesarolloBienestar.RegistroCapacEmpleado.ModeloRegCapacEmpleado;
import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;

public class ControlFichaTrabajador implements ActionListener {

	private VistaFichaTrabajador vft;
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();
	private ModeloFichaTrabajador modelo = new ModeloFichaTrabajador();
	
	public ControlFichaTrabajador(VistaFichaTrabajador vft) {
		this.vft = vft;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vft.getStndrbtnVerDocumento())) {
			mvd.VerDocumento(Urls.url1PDF, modelo.getDocument());	
		}
		
	}

}
