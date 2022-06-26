package CuartoMedio.GestionDeBodega.CodificacionProductos;

import java.util.Iterator;

import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacion;
import core.Helpers;
import core.ManagerDB;

public class ControlListaProductos {
	
	
	private VistaListaProductos vlp;
	private CodificacionProdRepository repository;
	
		public ControlListaProductos(VistaListaProductos vlp) {
			this.repository = new CodificacionProdRepository();
			this.repository.setEm(ManagerDB.getEntityManager());
			this.vlp = vlp;
		// TODO Auto-generated constructor stub
	}


		public void LlenarTabla() {
			
			Iterator<CodificacionProdEntity> lista = this.repository.findAll().iterator();
			this.vlp.getModel().getDataVector().removeAllElements();
			this.vlp.getModel().fireTableDataChanged();
			
			
			
			while(lista.hasNext()) {
				CodificacionProdEntity cpe = lista.next();
				System.out.println(cpe.toString());
				this.vlp.getModel().addRow(new  Object[] {
						cpe.getId(),
						cpe.getProveedor(),
						cpe.getDescripProducto(),
						cpe.getCodIntProducto(),
						cpe.getCodBarrasEAN13(),
						cpe.getCodBarrasEAN14(),
						cpe.getMarca(),
						cpe.getDescripProducto(),
						cpe.getPaisAbastecimiento(),
						cpe.getPaisFabricacion(),
						cpe.getPrecioSinImpuestos(),
						cpe.getDescuentoPermanente(),
						cpe.getPrecioNeto(),
						cpe.getDescuentoIntro(),
						cpe.getIVA(),
						cpe.getPVP(),
						cpe.getPrecioSugerido(),
						cpe.getUnidadEmbalaje(),
						cpe.getRegistroSanitario(),
						cpe.getVidaUtil(),
						cpe.getCajasxPlanchas(),
						cpe.getPlanchasxPallet(),
						cpe.getTipoEmbalaje(),
						cpe.getPesoBrutoCaja(),
						cpe.getPesoNetoCaja(),
						cpe.getProfundidadCaja(),
						cpe.getAnchoCaja(),
						cpe.getAltoCaja(),
						cpe.getVolumenCaja(),
						cpe.getPesoBrutoUnidad(),
						cpe.getPesoNeto(),
						cpe.getProfundidadUnidad(),
						cpe.getAnchoUnidad(),
						cpe.getAltoUnidad(),
						cpe.getVolumenUnidad(),
				});
			}
			
			
		}

}
