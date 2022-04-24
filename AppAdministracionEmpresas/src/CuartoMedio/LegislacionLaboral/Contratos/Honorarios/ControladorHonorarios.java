/**
 * 
 */
package CuartoMedio.LegislacionLaboral.Contratos.Honorarios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Dead
 *
 */
public class ControladorHonorarios implements ActionListener {

	private VistaHonorarios vh;

	/**
	 * 
	 */
	public ControladorHonorarios(VistaHonorarios vh) {
		// TODO Auto-generated constructor stub
		this.vh = vh;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ControladorHonorarios"+ e.getActionCommand());
	}

}
