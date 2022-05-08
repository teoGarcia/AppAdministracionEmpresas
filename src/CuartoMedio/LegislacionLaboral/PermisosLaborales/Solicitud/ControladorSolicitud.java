package CuartoMedio.LegislacionLaboral.PermisosLaborales.Solicitud;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.ModeloHonorarios;
import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.VistaHonorarios;
import Helpers.AbrirDocumentos;
import ui.ImageGalery.VistaImageGalery;

public class ControladorSolicitud implements ActionListener {

	private VistaSolicitud vista;
	private ModeloSolicitud modelo = new ModeloSolicitud();
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();  
	private VistaImageGalery galery;

	public ControladorSolicitud(VistaSolicitud vista) {
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
