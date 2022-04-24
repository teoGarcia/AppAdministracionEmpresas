/**
 * 
 */
package CuartoMedio.LegislacionLaboral.Contratos.Indefinido;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;

import CuartoMedio.LegislacionLaboral.Contratos.Modelo.ModeloVerDocumentos;
import Main.Window;
import ui.ImageGalery.VistaImageGalery;

/**
 * @author Dead
 *
 */
public class ControladorIndefinido implements ActionListener {

	private VistaIndefinido vi;
	private ModeloIndefinido mi = new ModeloIndefinido();
	private ModeloVerDocumentos mvd = ModeloVerDocumentos.getInstance();  
	VistaImageGalery galery;

	public ControladorIndefinido(VistaIndefinido vi) {
		this.vi = vi;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(vi.isBtnEjemplo(e.getSource())) {
			if(galery == null) {
				galery = new VistaImageGalery(mi.getImages());
			}
			galery.setVisible(true);
		}else if(vi.isBtnPracticar(e.getSource())) {
			mvd.VerDocumento(mi.getDocument());
		}
	}

}
