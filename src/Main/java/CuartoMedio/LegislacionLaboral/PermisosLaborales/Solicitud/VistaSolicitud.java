package main.java.CuartoMedio.LegislacionLaboral.PermisosLaborales.Solicitud;

import main.java.ui.TabContent.TabContent;

public class VistaSolicitud extends TabContent {
	
	ControladorSolicitud ch;
	
	/**
	 * @param def
	 */
	public VistaSolicitud(String def) {
		super(def);
		ch = new ControladorSolicitud(this);
		addControllerBtn(ch);
		// TODO Auto-generated constructor stub
	}

}
