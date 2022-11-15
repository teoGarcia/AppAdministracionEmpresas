package TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor;

import CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja.Flujo;
import core.CrudRepositoryJPA;

public class AsientosRepository extends CrudRepositoryJPA<Asientos, Long> {

	public Iterable<Asientos> findForLibroDiario(Long idLibro) {
		return em.createQuery("FROM Asientos AS c WHERE c.idLibro ="+ idLibro)
		.getResultList();
	}
	
}
