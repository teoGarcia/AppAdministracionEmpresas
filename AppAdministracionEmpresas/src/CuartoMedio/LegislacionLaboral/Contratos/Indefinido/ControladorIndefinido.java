/**
 * 
 */
package CuartoMedio.LegislacionLaboral.Contratos.Indefinido;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Dead
 *
 */
public class ControladorIndefinido implements ActionListener {

	private VistaIndefinido vi;

	public ControladorIndefinido(VistaIndefinido vi) {
		this.vi = vi;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ControladorIndefinido"+ e.getActionCommand());
	}

}
