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
		setTitulo("Certificado Vacaciones");
		setDefinicion("Los trabajadores chilenos con m\u00E1s de un a\u00F1o de servicio tienen derecho a 15  d\u00EDas  h\u00E1biles de  vacaciones  al\r\na\u00F1o, lo que en la pr\u00E1ctica son 21 d\u00EDas corridos, o tres semanas. La  ley  se\u00F1ala  que  las vacaciones  laborales\r\ndeben concederse de preferencia en primavera o verano, consider\u00E1ndose las necesidades del servicio.");
		
	}

}
