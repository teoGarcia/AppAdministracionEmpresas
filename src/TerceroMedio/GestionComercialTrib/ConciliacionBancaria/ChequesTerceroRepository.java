package TerceroMedio.GestionComercialTrib.ConciliacionBancaria;

import TerceroMedio.GestionComercialTrib.OC.RealizarOCEntity;
import core.CrudRepositoryJPA;

public class ChequesTerceroRepository extends CrudRepositoryJPA<ChequesTerceroEntity, Long>{
	
	public Iterable<ChequesTerceroEntity> findForCheTer(int estado) {
		return em.createQuery("FROM ChequesTerceroEntity AS c WHERE c.estado ="+ estado)
		.getResultList();
	
	} 

}
