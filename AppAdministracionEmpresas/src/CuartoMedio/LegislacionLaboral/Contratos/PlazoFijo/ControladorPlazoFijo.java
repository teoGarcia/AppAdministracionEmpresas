/**
 * 
 */
package CuartoMedio.LegislacionLaboral.Contratos.PlazoFijo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.LegislacionLaboral.Contratos.Modelo.ModeloVerDocumentos;
import ui.ImageGalery.VistaImageGalery;

/**
 * @author Dead
 *
 */
public class ControladorPlazoFijo implements ActionListener {

	private VistaPlazoFijo vpf;
	private ModeloPlazoFijo mpf = new ModeloPlazoFijo();
	private ModeloVerDocumentos mvd = ModeloVerDocumentos.getInstance();  
	private VistaImageGalery galery;

	public ControladorPlazoFijo(VistaPlazoFijo vpf) {
		// TODO Auto-generated constructor stub
		this.vpf = vpf;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(vpf.isBtnEjemplo(e.getSource())) {
			if(galery == null) {
				galery = new VistaImageGalery(mpf.getImages());
			}
			galery.setVisible(true);
		}else if(vpf.isBtnPracticar(e.getSource())) {
			mvd.VerDocumento(mpf.getDocument());
		}
	}

}
