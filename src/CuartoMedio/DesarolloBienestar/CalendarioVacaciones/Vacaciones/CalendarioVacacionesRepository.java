package CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones;

import java.text.ParseException;
import java.util.Calendar;

import CuartoMedio.DesarolloBienestar.CalculoHorasExtras.HorasTrabajadasEntity;
import core.CrudRepositoryJPA;

public class CalendarioVacacionesRepository extends CrudRepositoryJPA<CalendarioVacacionesEntity, Long>{
	
	public Iterable<CalendarioVacacionesEntity> findAllBeetwenBydates(Calendar starDate, Calendar endDate) throws ParseException {

		return  em
				.createQuery("FROM CalendarioVacacionesEntity AS c WHERE c.Fecha BETWEEN :requesteddate AND :agreeddate")
				.setParameter("requesteddate", starDate).setParameter("agreeddate", endDate)
				.getResultList();

	}

}
