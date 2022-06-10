/**
 * 
 */
package main.java.CuartoMedio.LegislacionLaboral.Contratos.Honorarios;

import main.java.ui.TabContent.TabContent;

/**
 * @author Dead
 *
 */
public class VistaHonorarios extends TabContent {

	
	ControladorHonorarios ch;
	
	/**
	 * @param def
	 */
	public VistaHonorarios(String def) {
		super(def);
		ch = new ControladorHonorarios(this);
		addControllerBtn(ch);
		// TODO Auto-generated constructor stub
	}

}
