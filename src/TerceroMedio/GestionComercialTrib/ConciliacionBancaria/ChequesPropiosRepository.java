package TerceroMedio.GestionComercialTrib.ConciliacionBancaria;

import core.CrudRepositoryJPA;

public class ChequesPropiosRepository extends CrudRepositoryJPA<ChequesPropiosEntity, Long>{
	
	public Iterable<ChequesPropiosEntity> findForChePro(int estado) {
		return em.createQuery("FROM ChequesPropiosEntity AS c WHERE c.estado ="+ estado)
		.getResultList();
	
	} 

}
