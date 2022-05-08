package CuartoMedio.GestionDeBodega.Inventario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.ModeloHonorarios;
import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.VistaHonorarios;
import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;
import ui.ImageGalery.VistaImageGalery;

public class ControladorInventario implements ActionListener {

	private VistaInventario vista;
	private ModeloInventario modelo = new ModeloInventario();
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();  
	
	public ControladorInventario(VistaInventario vista) {
		// TODO Auto-generated constructor stub
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(vista.isBtnPracticar(e.getSource())) {
			mvd.VerDocumento(Urls.url4Exc, modelo.getDocument());
		}
	}

}
