package main.java.CuartoMedio.LegislacionLaboral.PermisosLaborales.Comprobante;

import main.java.ui.TabContent.TabContent;

public class VistaComprobante extends TabContent {
	
	ControladorComprobante ch;
	
	/**
	 * @param def
	 */
	public VistaComprobante(String def) {
		super(def);
		ch = new ControladorComprobante(this);
		addControllerBtn(ch);
		// TODO Auto-generated constructor stub
	}

}
