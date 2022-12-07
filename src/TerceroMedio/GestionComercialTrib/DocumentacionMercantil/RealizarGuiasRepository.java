package TerceroMedio.GestionComercialTrib.DocumentacionMercantil;

import core.CrudRepositoryJPA;

public class RealizarGuiasRepository extends CrudRepositoryJPA<RealizarGuiasEntity, Long>{
	
	public Iterable<RealizarGuiasEntity> findForReaGui(Long idReaGui) {
		return em.createQuery("FROM RealizarGuiasEntity AS c WHERE c.idGuia ="+ idReaGui)
		.getResultList();
	
	}

}
