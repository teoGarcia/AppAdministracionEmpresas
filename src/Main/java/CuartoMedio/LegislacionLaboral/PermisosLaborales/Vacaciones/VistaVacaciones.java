package main.java.CuartoMedio.LegislacionLaboral.PermisosLaborales.Vacaciones;

import main.java.ui.TabContent.TabContent;

public class VistaVacaciones extends TabContent {
	
	ControladorVacaciones ch;
	
	/**
	 * @param def
	 */
	public VistaVacaciones(String def) {
		super(def);
		ch = new ControladorVacaciones(this);
		addControllerBtn(ch);
		// TODO Auto-generated constructor stub
	}

}
