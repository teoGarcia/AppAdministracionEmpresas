package main.java.CuartoMedio.LegislacionLaboral.PermisosLaborales.DiasHoras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.java.CuartoMedio.LegislacionLaboral.Contratos.Honorarios.ModeloHonorarios;
import main.java.CuartoMedio.LegislacionLaboral.Contratos.Honorarios.VistaHonorarios;
import main.java.Helpers.AbrirDocumentos;
import main.java.Helpers.AbrirDocumentos.Urls;
import main.java.ui.ImageGalery.VistaImageGalery;

public class ControladorDiasHoras implements ActionListener {

	private VistaDiasHoras vista;
	private ModeloDiasHoras modelo = new ModeloDiasHoras();
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();  
	private VistaImageGalery galery;

	public ControladorDiasHoras(VistaDiasHoras vista) {
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
