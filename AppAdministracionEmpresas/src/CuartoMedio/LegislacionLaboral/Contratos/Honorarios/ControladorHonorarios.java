/**
 * 
 */
package CuartoMedio.LegislacionLaboral.Contratos.Honorarios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.LegislacionLaboral.Contratos.Indefinido.ModeloIndefinido;
import Helpers.AbrirDocumentos;
import ui.ImageGalery.VistaImageGalery;

/**
 * @author Dead
 *
 */
public class ControladorHonorarios implements ActionListener {

	private VistaHonorarios vista;
	private ModeloHonorarios modelo = new ModeloHonorarios();
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();  
	private VistaImageGalery galery;

	/**
	 * 
	 */
	public ControladorHonorarios(VistaHonorarios vh) {
		// TODO Auto-generated constructor stub
		this.vista = vh;
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
