package TerceroMedio.GestionComercialTrib.DocumentacionMercantil;

import TerceroMedio.GestionComercialTrib.Cotizacion.RealizarCotizacionEntity;
import core.CrudRepositoryJPA;

public class RealizarDocumentosRepository extends CrudRepositoryJPA<RealizarDocumentosEntity, Long> {
	
	public Iterable<RealizarDocumentosEntity> findForReaDoc(Long idReaDoc) {
		return em.createQuery("FROM RealizarDocumentosEntity AS c WHERE c.idDocumento ="+ idReaDoc)
		.getResultList();
	
	}
	
}
