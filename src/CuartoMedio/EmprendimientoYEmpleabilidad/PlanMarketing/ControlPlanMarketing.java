package CuartoMedio.EmprendimientoYEmpleabilidad.PlanMarketing;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.CalculoDeRemuneraciones.AsientoContable.AsientoContable;
import CuartoMedio.EmprendimientoYEmpleabilidad.PlanMarketing.Imprimir.PanelImprimir;
import CuartoMedio.EmprendimientoYEmpleabilidad.PlanMarketing.Imprimir.VistaImprimir;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlPlanMarketing implements ActionListener {
	
	private VistaPlanMarketing vista;
	private PlanMarketingRepository repository;
	private VistaImprimir vi;
	private PanelImprimir pi;

	public ControlPlanMarketing(VistaPlanMarketing vpm) {
		this.vista = vpm;
		repository = new PlanMarketingRepository();
		repository.setEm(ManagerDB.getEntityManager());
		// TODO Auto-generated constructor stub
	}

	public void llenarTabla() {
		// TODO Auto-generated method stub
		Iterator<PlanMarketing> lista = this.repository.findAll().iterator();
		this.vista.getModel().getDataVector().removeAllElements();
		this.vista.getModel().fireTableDataChanged();

		while (lista.hasNext()) {
			PlanMarketing records = lista.next();
			this.vista.getModel().addRow(new Object[] { 
					records.getId(), 
					records.getProyecto(),
					records.getProducto(), 
					records.getPrecio(),
					records.getPlaza(),  
					records.getPromocion(),
					records.getPersona(),  
					records.getPostVenta() 
			});
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(vista.getBtnModificar())) {
			Long id = getRow();
			if (id >= 0) {
				PlanMarketing record = repository.find(id);
				vista.cargarForm(record);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource().equals(vista.getBtnEliminiar())) {
			Long id = getRow();
			if (id != null) {
				PlanMarketing record = repository.find(id);
				repository.delete(record);
				vista.actualizarVista();
			}
		} if (e.getSource().equals(vista.getBtnGuardar())) {

			if (vista.camposVacios()) { // vista.camposVacios()

				PlanMarketing record = new PlanMarketing();

				record.setProyecto(vista.getTxtNomPro().getText());
				record.setObjetivo(vista.getTxtObjPro().getText());
				record.setGrupo(vista.getTxtGruObj().getText());
				record.setProducto(vista.getTxtPro().getText());
				record.setPrecio(Integer.parseInt(vista.getTxtPre().getText()));
				record.setPlaza(vista.getTxtPla().getText());
				record.setPromocion(vista.getTxtProm().getText());
				record.setPersona(vista.getTxtPer().getText());
				record.setPostVenta(vista.getTxtPosVen().getText());

				// guarda
				if (vista.getId() <= 0 && vista.getId() != null) {
					PlanMarketing db = this.repository.create(record);

					if (db != null) {
						Mensajes.Creacion();
						vista.actualizarVista();
					}

					// actualiza
				} else {
					record.setId(vista.getId());
					PlanMarketing db = this.repository.update(record);
					if (db != null) {
						Mensajes.Actualizacion();
						vista.actualizarVista();
					}
				}

			} else {
				Mensajes.CamposVacios();
			}

		}else if(e.getSource().equals(vista.getBtnImprimir())) {
			
			int row = vista.getTable().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
				
				vi = new VistaImprimir();
				
				PlanMarketing ape = repository.find(id);		   
			    
				pi = vi.getPi();
				pi.CargarForm(ape);
				
				vi.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	
	public Long getRow() {
		int row = vista.getTable().getSelectedRow();
		if (row >= 0) {
			Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
			return id;
		} else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);
			return null;
		}

	}
	

}
