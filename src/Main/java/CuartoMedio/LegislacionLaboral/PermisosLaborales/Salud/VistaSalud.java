package main.java.CuartoMedio.LegislacionLaboral.PermisosLaborales.Salud;

import main.java.ui.TabContent.TabContent;

public class VistaSalud extends TabContent {
	
	ControladorSalud ch;
	
	/**
	 * @param def
	 */
	public VistaSalud(String def) {
		super(def);
		ch = new ControladorSalud(this);
		addControllerBtn(ch);
		// TODO Auto-generated constructor stub
	}

}
