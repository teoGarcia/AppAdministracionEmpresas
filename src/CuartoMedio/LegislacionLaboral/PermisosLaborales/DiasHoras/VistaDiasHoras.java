package CuartoMedio.LegislacionLaboral.PermisosLaborales.DiasHoras;

import ui.TabContent.TabContent;

public class VistaDiasHoras extends TabContent {
	
	ControladorDiasHoras ch;
	
	/**
	 * @param def
	 */
	public VistaDiasHoras(String def) {
		super(def);
		ch = new ControladorDiasHoras(this);
		addControllerBtn(ch);
		// TODO Auto-generated constructor stub
	}

}
