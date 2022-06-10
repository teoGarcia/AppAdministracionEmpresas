/**
 * 
 */
package main.java.CuartoMedio.GestionDeBodega.Inventario;

import java.awt.Color;

import main.java.CuartoMedio.LegislacionLaboral.Contratos.Honorarios.ControladorHonorarios;
import main.java.ui.SingleAsignature.SingleAsignature;


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
				+ "Usualmente se hace alusión al inventario de existencias de una compañía, donde se registran las materias primas, los bienes intermedios y los bienes finales que ofrece la firma a sus clientes.");
		
		SinBtnEjemplo();
	}

}
