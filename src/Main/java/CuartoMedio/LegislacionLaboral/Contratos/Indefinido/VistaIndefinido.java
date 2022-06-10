package main.java.CuartoMedio.LegislacionLaboral.Contratos.Indefinido;

import java.awt.event.ActionListener;

import main.java.ui.TabContent.TabContent;

public class VistaIndefinido extends TabContent {

	ControladorIndefinido ci;
	
	public VistaIndefinido(String def) {
		super(def);
		ci = new ControladorIndefinido(this);
		addControllerBtn(ci);
	}

	

	
}
