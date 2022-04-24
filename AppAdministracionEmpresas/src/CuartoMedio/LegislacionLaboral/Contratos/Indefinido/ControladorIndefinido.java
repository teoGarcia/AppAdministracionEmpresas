/**
 * 
 */
package CuartoMedio.LegislacionLaboral.Contratos.Indefinido;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.LegislacionLaboral.Contratos.Modelo.ModeloVerDocumentos;

/**
 * @author Dead
 *
 */
public class ControladorIndefinido implements ActionListener {

	private static final String url = "MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1.docx";
	private VistaIndefinido vi;
	private ModeloVerDocumentos mvd = ModeloVerDocumentos.getInstance();

	public ControladorIndefinido(VistaIndefinido vi) {
		this.vi = vi;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(vi.isBtnEjemplo(e.getSource())) {
			System.out.println("isBtnEjemplo");
		}else if(vi.isBtnPracticar(e.getSource())) {
			mvd.VerDocumento(url);
		}
	}

}
