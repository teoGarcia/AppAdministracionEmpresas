package CuartoMedio.LegislacionLaboral.PermisosLaborales.Solicitud;

import ui.TabContent.TabContent;

public class VistaSolicitud extends TabContent {
	
	ControladorSolicitud ch;
	
	/**
	 * @param def
	 */
	public VistaSolicitud(String def) {
		super(def);
		ch = new ControladorSolicitud(this);
		addControllerBtn(ch);
	}

}
