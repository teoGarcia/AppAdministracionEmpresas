package CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlCaja implements ActionListener {

	private VistaRegistrarCaja vista;
	private CajaRepository repository;


	public ControlCaja(VistaRegistrarCaja vista) {
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
		if(vista.camposVacios()) {
			Caja record = new Caja();
			
			record.setNumero(Integer.parseInt(vista.getTxtResponsable().getText()));
			record.setTipo(vista.getTxtNumero().getText());
			record.setResponsable(vista.getTxtTipo().getText());
			
			Caja db = this.repository.create(record);
			
			vista.VaciarForm();
			if(db != null) {
				Mensajes.Creacion();
			}
		}else {
			Mensajes.CamposVacios();
		}
	}

	
}
