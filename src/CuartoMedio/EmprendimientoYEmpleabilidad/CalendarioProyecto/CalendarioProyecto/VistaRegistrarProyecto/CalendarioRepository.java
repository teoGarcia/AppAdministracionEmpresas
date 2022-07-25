package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto;

import core.CrudRepositoryJPA;

public class CalendarioRepository extends CrudRepositoryJPA<Calendario, Long> {

	public Iterable<Calendario> findForProyect(Long idProyecto) {
		return em.createQuery("FROM Calendario AS c WHERE c.idProyecto ="+ idProyecto)
				.getResultList();
	}

}
