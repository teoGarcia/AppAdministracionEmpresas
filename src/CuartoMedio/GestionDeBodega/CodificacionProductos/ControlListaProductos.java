package CuartoMedio.GestionDeBodega.CodificacionProductos;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacion;
import Menu.Side.SideMenu;
import core.Helpers;
import core.ManagerDB;

public class ControlListaProductos implements ActionListener {
	
	
	private VistaListaProductos vlp;
	private CodificacionProdRepository repository;
	private VistaCodificacionProductos vcp;
	
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


		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource().equals(vlp.getBtnEliminar())) {
				int row = vlp.getTable().getSelectedRow();
				if(row >= 0) {
					Long id = Long.parseLong(String.valueOf(vlp.getModel().getValueAt(row, 0)));
					CodificacionProdEntity cpe = repository.find(id);
					repository.delete(cpe);
					vlp.ActualizarVista();
				}else {
					JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}else if(e.getSource().equals(vlp.getStndrbtnActualizar())) {
				
				vlp.ActualizarVista();
			}
			// TODO Auto-generated method stub
			
		}

}
