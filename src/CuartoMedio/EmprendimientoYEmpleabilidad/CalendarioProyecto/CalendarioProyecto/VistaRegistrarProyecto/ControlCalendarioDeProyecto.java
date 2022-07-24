package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja.CajaRepository;
import core.ManagerDB;

public class ControlCalendarioDeProyecto implements ActionListener {
	
	private VistaCalendarioProyectos vista;
	private ProyectoRepository pRepository;

	public ControlCalendarioDeProyecto(VistaCalendarioProyectos vista) {
		this.vista = vista;
		this.pRepository = new ProyectoRepository();
		this.pRepository.setEm(ManagerDB.getEntityManager());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void LlenarTablaProyecto() {
		// TODO Auto-generated method stub
		
	}

	public void LlenarTablaCalendario() {
		// TODO Auto-generated method stub
		
	}

}
