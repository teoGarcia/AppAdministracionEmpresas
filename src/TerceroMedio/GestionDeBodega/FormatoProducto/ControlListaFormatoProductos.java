package TerceroMedio.GestionDeBodega.FormatoProducto;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JOptionPane;
import Menu.Side.SideMenu;
import TerceroMedio.GestionDeBodega.FormatoProducto.Imprimir.*;
import core.Helpers;
import core.ManagerDB;

public class ControlListaFormatoProductos implements ActionListener {
	
	private VistaImprimir vi;
	private PanelImprimir pi;
	
	private VistaListaFormatoProductos vlp;
	private CodificacionFormProdRepository repository;
	
		public ControlListaFormatoProductos(VistaListaFormatoProductos vlp) {
			this.repository = new CodificacionFormProdRepository();
			this.repository.setEm(ManagerDB.getEntityManager());
			this.vlp = vlp;
	}


		public void LlenarTabla() {
			
			Iterator<CodificacionFormProdEntity> lista = this.repository.findAll().iterator();
			this.vlp.getModel().getDataVector().removeAllElements();
			this.vlp.getModel().fireTableDataChanged();
			
			while(lista.hasNext()) {
				CodificacionFormProdEntity cpe = lista.next();
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
					CodificacionFormProdEntity cpe = repository.find(id);
					repository.delete(cpe);
					vlp.ActualizarVista();
				}else {
					JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}else if(e.getSource().equals(vlp.getStndrbtnActualizar())) {
				
				vlp.ActualizarVista();
			}else if(e.getSource().equals(vlp.getBtnModificar())) {
				int row = vlp.getTable().getSelectedRow();
				if(row >= 0) {
					Long id = Long.parseLong(String.valueOf(vlp.getModel().getValueAt(row, 0)));
					CodificacionFormProdEntity cpe = repository.find(id);
					vlp.getCcp().getVcp().cargarForm(cpe);
					SideMenu.changeContentPanel("Formato de Productos");
				}else {
					JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				}
			}else if(e.getSource().equals(vlp.getBtnImprimir())) {
				int row = vlp.getTable().getSelectedRow();
				if(row >= 0) {
					Long id = Long.parseLong(String.valueOf(vlp.getModel().getValueAt(row, 0)));
					CodificacionFormProdEntity cpe = repository.find(id);

					vi = new VistaImprimir();
				    
					pi = vi.getPi();
					
					pi.cargarForm(cpe);
					
					vi.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		}

}
