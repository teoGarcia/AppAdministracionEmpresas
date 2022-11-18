package TerceroMedio.GestionComercialTrib.Cotizacion;

import core.CrudRepositoryJPA;

public class RealizarCotizacionRepository extends CrudRepositoryJPA<RealizarCotizacionEntity, Long> {
	
	public Iterable<RealizarCotizacionEntity> findForReaCot(Long idReaCot) {
		return em.createQuery("FROM RealizarCotizacionEntity AS c WHERE c.idCotizacion ="+ idReaCot)
		.getResultList();
	
	}

}
