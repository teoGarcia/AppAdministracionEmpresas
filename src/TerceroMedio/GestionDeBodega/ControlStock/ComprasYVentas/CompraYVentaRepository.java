package TerceroMedio.GestionDeBodega.ControlStock.ComprasYVentas;

import core.CrudRepositoryJPA;

public class CompraYVentaRepository extends CrudRepositoryJPA<CompraYVentaEntity, Long>{

	
	public Iterable<CompraYVentaEntity> findForProducto(Long idProducto) {
		return em.createQuery("FROM CompraYVentaEntity AS c WHERE c.idProducto ="+ idProducto)
		.getResultList();
	
	}
	
}
