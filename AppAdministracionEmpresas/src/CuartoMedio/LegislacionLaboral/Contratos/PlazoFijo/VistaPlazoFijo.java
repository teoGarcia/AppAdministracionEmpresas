/**
 * 
 */
package CuartoMedio.LegislacionLaboral.Contratos.PlazoFijo;

import ui.TabContent.TabContent;

/**
 * @author Dead
 *
 */
public class VistaPlazoFijo extends TabContent {

	
	
	ControladorPlazoFijo cpf;
	
	/**
	 * @param def
	 */
	public VistaPlazoFijo(String def) {
		super(def);
		cpf = new ControladorPlazoFijo(this);
		addControllerBtn(cpf);
	}

}
