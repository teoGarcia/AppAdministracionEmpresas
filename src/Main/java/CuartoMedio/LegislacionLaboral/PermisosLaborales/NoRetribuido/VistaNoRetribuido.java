package main.java.CuartoMedio.LegislacionLaboral.PermisosLaborales.NoRetribuido;

import main.java.ui.TabContent.TabContent;

public class VistaNoRetribuido extends TabContent {
	
	ControladorNoRetribuido ch;
	
	/**
	 * @param def
	 */
	public VistaNoRetribuido(String def) {
		super(def);
		ch = new ControladorNoRetribuido(this);
		addControllerBtn(ch);
		// TODO Auto-generated constructor stub
	}

}
