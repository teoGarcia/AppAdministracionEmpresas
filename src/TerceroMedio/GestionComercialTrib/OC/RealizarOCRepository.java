package TerceroMedio.GestionComercialTrib.OC;

import core.CrudRepositoryJPA;

public class RealizarOCRepository extends CrudRepositoryJPA<RealizarOCEntity, Long>{
	
	public Iterable<RealizarOCEntity> findForReaCot(Long idReaOC) {
		return em.createQuery("FROM RealizarOCEntity AS c WHERE c.idOC ="+ idReaOC)
		.getResultList();
	
	} 

}
