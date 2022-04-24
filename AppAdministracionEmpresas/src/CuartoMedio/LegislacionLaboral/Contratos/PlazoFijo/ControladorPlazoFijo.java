/**
 * 
 */
package CuartoMedio.LegislacionLaboral.Contratos.PlazoFijo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Dead
 *
 */
public class ControladorPlazoFijo implements ActionListener {

	private VistaPlazoFijo vpf;

	public ControladorPlazoFijo(VistaPlazoFijo vpf) {
		// TODO Auto-generated constructor stub
		this.vpf = vpf;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ControladorPlazoFijo"+ e.getActionCommand());
	}

}
