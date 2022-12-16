package TerceroMedio.GestionComercialTrib.BoletaHonorarios;

import TerceroMedio.GestionComercialTrib.OC.RealizarOCEntity;
import core.CrudRepositoryJPA;

public class ReaBoletaHonorariosRepository extends CrudRepositoryJPA<ReaBoletaHonorariosEntity, Long>{
	
	public Iterable<ReaBoletaHonorariosEntity> findForReaBH(Long idReaBH) {
		return em.createQuery("FROM ReaBoletaHonorariosEntity AS c WHERE c.idDatos ="+ idReaBH)
		.getResultList();
	
	} 

}
