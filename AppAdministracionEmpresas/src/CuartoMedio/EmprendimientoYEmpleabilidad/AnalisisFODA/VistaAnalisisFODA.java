/**
 * 
 */
package CuartoMedio.EmprendimientoYEmpleabilidad.AnalisisFODA;

import ui.SingleAsignature.SingleAsignature;
import java.awt.Color;

import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.ControladorHonorarios;


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
		setDefinicion("El an�lisis FODA, tambi�n llamado an�lisis DAFO o DOFA, consiste en un proceso donde se estudian debilidades, amenazas, fortalezas y oportunidades de una empresa. De ah�, el nombre que adquiere");
		
	}

}
