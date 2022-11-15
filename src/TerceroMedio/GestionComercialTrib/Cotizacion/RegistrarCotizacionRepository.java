package TerceroMedio.GestionComercialTrib.Cotizacion;

import CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja.Flujo;
import core.CrudRepositoryJPA;

public class RegistrarCotizacionRepository extends CrudRepositoryJPA<RegistrarCotizacionEntity, Long>{
	
	public Iterable<RegistrarCotizacionEntity> findForRegCot(Long idRegCot) {
		return em.createQuery("FROM RegistrarCotizacionEntity AS c WHERE c.idEmpresa ="+ idRegCot)
		.getResultList();
	
	}

}
