package CuartoMedio.EmprendimientoYEmpleabilidad.ControlGastos;

import java.util.Calendar;

import CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja.Flujo;
import core.CrudRepositoryJPA;

public class ControlGastosRepository extends CrudRepositoryJPA<ControlGastosEntity, Long> {
	
	public Iterable<ControlGastosEntity> findForAnio(int anio) {
		return em.createQuery("FROM ControlGastosEntity AS c WHERE c.anio ="+ anio)
		.getResultList();
	
	}

}
