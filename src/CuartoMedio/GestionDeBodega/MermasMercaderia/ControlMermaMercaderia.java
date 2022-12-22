package CuartoMedio.GestionDeBodega.MermasMercaderia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;
import CuartoMedio.GestionDeBodega.MermasMercaderia.Imprimir.*;

public class ControlMermaMercaderia implements ActionListener {
	
	private VistaImprimir vi;
	private PanelImprimir pi;
	
	private VistaMermaMercaderia vmm;
	private MermaMercaderiaRepository repository;

	public ControlMermaMercaderia(VistaMermaMercaderia vmm) {
		this.repository = new MermaMercaderiaRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vmm = vmm;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {


		if(e.getSource().equals(vmm.getBtnGuardar())) {
			
			// GUARDAR
			
			if(vmm.getTxtId().getText().length() <= 0) {
				if(vmm.camposVacios()) {
					MermaMercaderiaEntity mme = new MermaMercaderiaEntity();
					
					mme.setTipoMovString(vmm.getComboBoxTMov().getSelectedIndex());
					mme.setMotivo(vmm.getComboBoxMotivo().getSelectedIndex());
					mme.setFolio(vmm.getTxtFolio().getText());
					mme.setLocal(vmm.getTxtLocal().getText());
					mme.setTienda(vmm.getTxtTienda().getText());
					mme.setAlmacen(vmm.getTxtAlmacen().getText());
					mme.setCentroCosto(vmm.getTxtCentroCosto().getText());
					mme.setSeccion(vmm.getTxtSeccion().getText());
					mme.setFecha(vmm.getFecha().getCalendar());
					mme.setCodSAPBARRAS(vmm.getTxtCodSapBarras().getText());
					mme.setDescripcionMaterial(vmm.getTxtDescripcionMaterial().getText());
					mme.setUnidadMedida(vmm.getComboBoxMotivo().getSelectedIndex());
					mme.setCodigoMotivo(vmm.getTxtMotivo().getText());
					mme.setCantidad(vmm.getTxtCantidad().getText());
					
					MermaMercaderiaEntity db = this.repository.create(mme);
					if(db != null) {
						Mensajes.Creacion();
						vmm.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
				
			// ACTUALIZAR (MODIFICAR)
			}else{
				if(vmm.camposVacios()) {
					
					MermaMercaderiaEntity mme = new MermaMercaderiaEntity();
					
					mme.setId(Long.parseLong(vmm.getTxtId().getText()));
					mme.setTipoMovString(vmm.getComboBoxTMov().getSelectedIndex());
					mme.setMotivo(vmm.getComboBoxMotivo().getSelectedIndex());
					mme.setFolio(vmm.getTxtFolio().getText());
					mme.setLocal(vmm.getTxtLocal().getText());
					mme.setTienda(vmm.getTxtTienda().getText());
					mme.setAlmacen(vmm.getTxtAlmacen().getText());
					mme.setCentroCosto(vmm.getTxtCentroCosto().getText());
					mme.setSeccion(vmm.getTxtSeccion().getText());
					mme.setFecha(vmm.getFecha().getCalendar());
					mme.setCodSAPBARRAS(vmm.getTxtCodSapBarras().getText());
					mme.setDescripcionMaterial(vmm.getTxtDescripcionMaterial().getText());
					mme.setUnidadMedida(vmm.getComboBoxUnidadMedida().getSelectedIndex());
					mme.setCodigoMotivo(vmm.getTxtMotivo().getText());
					mme.setCantidad(vmm.getTxtCantidad().getText());
					
					MermaMercaderiaEntity db = this.repository.update(mme);
					if(db != null) {
						Mensajes.Actualizacion();
						vmm.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
			}
			
		}else if(e.getSource().equals(vmm.getBtnModificar())) {
			int row = vmm.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vmm.getModel().getValueAt(row, 0)));
				
				MermaMercaderiaEntity mme = repository.find(id);
				
				int ComboTipoMovimiento = mme.getTipoMovString();
				int ComboMotivo = mme.getMotivo();
				int UM = mme.getUnidadMedida();
				
				vmm.CargarForm(mme, ComboTipoMovimiento, ComboMotivo, UM);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
		}else if(e.getSource().equals(vmm.getBtnEliminar())) {
			int row = vmm.getTable().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vmm.getModel().getValueAt(row, 0)));
				MermaMercaderiaEntity mme = repository.find(id);
				repository.delete(mme);
				vmm.ActualizarVista();
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource().equals(vmm.getBtnImprimir())) {
			int row = vmm.getTable().getSelectedRow();
			if(row >= 0) {
				
				Long id = Long.parseLong(String.valueOf(vmm.getModel().getValueAt(row, 0)));
				MermaMercaderiaEntity cpe = repository.find(id);
				
				String TipoMovimiento = vmm.getComboBoxTMov().getItemAt(cpe.getTipoMovString()).toString();
				String Motivo = vmm.getComboBoxMotivo().getItemAt(cpe.getMotivo()).toString();
				String UMedida = vmm.getComboBoxUnidadMedida().getItemAt(cpe.getUnidadMedida()).toString();

				vi = new VistaImprimir();
			    
				pi = vi.getPi();
				
				pi.cargarForm(cpe, TipoMovimiento, Motivo, UMedida);
				
				vi.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}
	
	public void LlenarTabla() {
		
		Iterator<MermaMercaderiaEntity> lista = this.repository.findAll().iterator();
		this.vmm.getModel().getDataVector().removeAllElements();
		this.vmm.getModel().fireTableDataChanged();
		
		while(lista.hasNext()) {
			MermaMercaderiaEntity mme = lista.next();
			
			int ComboTipoMovimiento = mme.getTipoMovString();
			int ComboMotivo = mme.getMotivo();
			int UM = mme.getUnidadMedida();
			
			String TipoMovimiento = vmm.getComboBoxTMov().getItemAt(ComboTipoMovimiento).toString();
			String Motivo = vmm.getComboBoxMotivo().getItemAt(ComboMotivo).toString();
			String UMedida = vmm.getComboBoxUnidadMedida().getItemAt(UM).toString();		
			
			this.vmm.getModel().addRow(new  Object[] {
					mme.getId(),
					mme.getCodSAPBARRAS(),
					mme.getDescripcionMaterial(),
					Motivo,
					UMedida,
					mme.getCantidad(),
					TipoMovimiento,
					mme.getFolio(),
					mme.getCentroCosto(),
					Helpers.getFechaFormat(mme.getFecha()),
					mme.getSeccion(),
					mme.getLocal(),
					mme.getTienda(),
					mme.getAlmacen(),
					
			});
		}
		
		
	}

}
