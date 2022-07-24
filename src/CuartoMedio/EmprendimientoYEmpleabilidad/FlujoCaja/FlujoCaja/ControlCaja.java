package CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlCaja implements ActionListener {

	private VistaFlujoCaja vista;
	private CajaRepository repository;

	public ControlCaja(VistaFlujoCaja vista) {
		this.repository = new CajaRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 guardar();
	}
	
	private void guardar() {
		if(vista.camposVaciosRegistro()) {
			Caja record = new Caja();
			
			record.setNumero(Integer.parseInt(vista.getTxtResponsable().getText()));
			record.setTipo(vista.getTxtNumero().getText());
			record.setResponsable(vista.getTxtTipo().getText());
			
			Caja db = this.repository.create(record);
			
			vista.VaciarFormRegistro();
			if(db != null) {
				Mensajes.Creacion();
			}
		}else {
			Mensajes.CamposVacios();
		}
	}

	public void LlenarTablaRegistro() {
		// TODO Auto-generated method stub
		
	}

	public void LlenarTablaFlujo() {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
