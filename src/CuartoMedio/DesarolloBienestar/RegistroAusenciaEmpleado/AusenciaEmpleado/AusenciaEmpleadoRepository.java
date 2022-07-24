package CuartoMedio.DesarolloBienestar.RegistroAusenciaEmpleado.AusenciaEmpleado;

import java.text.ParseException;
import java.util.Calendar;

import CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones.CalendarioVacacionesEntity;
import core.CrudRepositoryJPA;

public class AusenciaEmpleadoRepository extends CrudRepositoryJPA <AusenciaEmpleadoEntity, Long> {
	
	public Iterable<AusenciaEmpleadoEntity> findAllBeetwenBydates(Calendar starDate, Calendar endDate) throws ParseException {

		return  em
				.createQuery("FROM AusenciaEmpleadoEntity AS c WHERE c.Fecha BETWEEN :requesteddate AND :agreeddate")
				.setParameter("requesteddate", starDate).setParameter("agreeddate", endDate)
				.getResultList();

	}

}
