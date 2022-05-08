package CuartoMedio.LegislacionLaboral.PermisosLaborales.Vacaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.ModeloHonorarios;
import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.VistaHonorarios;
import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;
import ui.ImageGalery.VistaImageGalery;

public class ControladorVacaciones implements ActionListener {

	private VistaVacaciones vista;
	private ModeloVacaciones modelo = new ModeloVacaciones();
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();  
	private VistaImageGalery galery;

	public ControladorVacaciones(VistaVacaciones vista) {
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
			mvd.VerDocumento(Urls.url4Doc, modelo.getDocument());
		}
	}

}
