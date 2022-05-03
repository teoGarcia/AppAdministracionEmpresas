package CuartoMedio.LegislacionLaboral.Finiquitos;

import ui.SingleAsignature.SingleAsignature;

public class VistaFiniquito extends SingleAsignature {

	private ControlFiniquito controlador;

	public VistaFiniquito() {
		// TODO Auto-generated constructor stub
		super();
		inicialize();
	}
	
	private void inicialize() {
		
		controlador = new ControlFiniquito(this);
		addControllerBtn(controlador);
		setTitulo("Finiquito de Contrato");
		setDefinicion("Es un acto por el cual un trabajador y un empleador ratifican o aprueban ante un Ministro de Fe el \u00E9rmino  de la relaci\u00F3n laboral y su acuerdo con lo estipulado en un documento escrito denominado finiquito. Si alguna de las partes tuviese dudas sobre alg\u00FAn o  algunos  aspectos  del  documento (finiquito),  las  partes pueden solicitar ratificar el finiquito ante un ministro de fe de la Inspecci\u00F3n del Trabajo respectiva.");
		
	}

}
