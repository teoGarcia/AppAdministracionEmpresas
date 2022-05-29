package CuartoMedio.CalculoDeRemuneraciones.PagoCotizaciones;

import CuartoMedio.LegislacionLaboral.CertificadoVacaciones.ControladorCertificadoVacaciones;
import ui.SingleAsignature.SingleAsignature;

	public class VistaPagoCotizaciones extends SingleAsignature {
		
		ControlPagoCotizaciones cpc;
	
	
		public VistaPagoCotizaciones() {
			// TODO Auto-generated constructor stub
			super();
			inicialize();
		}
		
		private void inicialize() {
			
			SinBtnEjemplo();
			cpc = new ControlPagoCotizaciones(this);
			addControllerBtn(cpc);
			setTitulo("Pago de Cotizaciones");
			setDefinicion("Es El aporte que el empleador o la empleadora realiza por concepto de cotizaciones se suma al que cada trabajador o trabajadora realiza mensualmente para: Tener derecho a una pensión de vejez cuando jubile (cotizaciones previsionales). Acceder al sistema público o privado de salud (Fonasa o Isapres).");
			
		}
	

}
