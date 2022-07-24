package CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import core.CrudRepositoryJPA;

public class FlujoRepository extends CrudRepositoryJPA<Flujo, Long>{

	public Iterable<Flujo> findForCaja(Long idCaja) {
		return em.createQuery("FROM Flujo AS c WHERE c.idCaja ="+ idCaja)
		.getResultList();
	
	}
	
}
