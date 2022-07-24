package CuartoMedio.DesarolloBienestar.CalculoHorasExtras;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.TypedQuery;

import core.CrudRepositoryJPA;

public class HorasTrabajadasRepository extends CrudRepositoryJPA<HorasTrabajadasEntity, Long> {

	public Iterable<HorasTrabajadasEntity> findAllBeetwenBydates(Calendar starDate, Calendar endDate) throws ParseException {

		return  em
				.createQuery("FROM HorasTrabajadasEntity AS c WHERE c.FechaHoraRegistrada BETWEEN :requesteddate AND :agreeddate")
				.setParameter("requesteddate", starDate).setParameter("agreeddate", endDate)
				.getResultList();

	}

}
