/**
 * 
 */
package CuartoMedio.GestionDeBodega.Inventario;

import ui.SingleAsignature.SingleAsignature;
import java.awt.Color;

import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.ControladorHonorarios;


public class VistaInventario extends SingleAsignature {

	ControladorInventario controlador;
	
	/**
	 * 
	 */
	public VistaInventario() {
		// TODO Auto-generated constructor stub
		super();
		inicialize();
	}
	
	private void inicialize() {
		
		controlador = new ControladorInventario(this);
		addControllerBtn(controlador);
		setTitulo("Inventario");
		setDefinicion("Es un documento donde se anotan todas las pertenencias del individuo o empresa. Esto, con fines contables o de otra naturaleza.\r\n"
				+ "\r\n"
				+ "Usualmente se hace alusi�n al inventario de existencias de una compa��a, donde se registran las materias primas, los bienes intermedios y los bienes finales que ofrece la firma a sus clientes.");
		
		SinBtnEjemplo();
	}

}
