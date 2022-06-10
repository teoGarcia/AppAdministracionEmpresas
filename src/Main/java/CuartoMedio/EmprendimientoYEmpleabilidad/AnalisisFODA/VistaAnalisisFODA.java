/**
 * 
 */
package main.java.CuartoMedio.EmprendimientoYEmpleabilidad.AnalisisFODA;

import java.awt.Color;

import main.java.CuartoMedio.LegislacionLaboral.Contratos.Honorarios.ControladorHonorarios;
import main.java.ui.SingleAsignature.SingleAsignature;


public class VistaAnalisisFODA extends SingleAsignature {

	ControladorAnalisisFODA controlador;
	
	/**
	 * 
	 */
	public VistaAnalisisFODA() {
		// TODO Auto-generated constructor stub
		super();
		inicialize();
	}
	
	private void inicialize() {
		
		controlador = new ControladorAnalisisFODA(this);
		addControllerBtn(controlador);
		setTitulo("Analisis FODA o DAFO");
		setDefinicion("El análisis FODA, también llamado análisis DAFO o DOFA, consiste en un proceso donde se estudian debilidades, amenazas, fortalezas y oportunidades de una empresa. De ahí, el nombre que adquiere");
		
	}

}
