package TerceroMedio.GestionDeBodega.ControlIngresosEgresos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JOptionPane;

import TerceroMedio.GestionDeBodega.ControlIngresosEgresos.Imprimir.PanelImprimir;
import TerceroMedio.GestionDeBodega.ControlIngresosEgresos.Imprimir.VistaImprimir;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControladorControlIngresoEgreso implements ActionListener {

	private VistaControlIngresosYEgresos vista;
	private IngresoRepository repositoryIngreso;
	private EgresoRepository repositoryEgreso;
	
	private VistaImprimir vi;
	private PanelImprimir pi;
	
	public ControladorControlIngresoEgreso(VistaControlIngresosYEgresos vista) {
		this.vista = vista;
		this.repositoryIngreso = new IngresoRepository();
		this.repositoryIngreso.setEm(ManagerDB.getEntityManager());
		
		this.repositoryEgreso = new EgresoRepository();
		this.repositoryEgreso.setEm(ManagerDB.getEntityManager());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vista.getBtnGuardarIngreso())) {
			if(vista.getIdIngreso() <= 0 && vista.getIdIngreso() != null) {
				guardarIngreso();
			}else{
				actualizarIngreso(); 
			}
		}else if(e.getSource().equals(vista.getBtnModificarIngreso())) {
			
			int row = vista.getTableIngreso().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelIngreso().getValueAt(row, 0)));
				ControlIngreso iEntity = repositoryIngreso.find(id);
				vista.cargarFormIngreso(iEntity);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}else if(e.getSource().equals(vista.getBtnEliminarIngreso())) {
			int row = vista.getTableIngreso().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelIngreso().getValueAt(row, 0)));
				ControlIngreso iEntity = repositoryIngreso.find(id);
				repositoryIngreso.delete(iEntity);
				vista.ActualizarVista();
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource().equals(vista.getBtnGuardarEgreso())) {
			if(vista.getIdEgreso() <= 0 && vista.getIdEgreso() != null) {
				guardarEgresos();
			}else{
				
			}
		}else if(e.getSource().equals(vista.getBtnModificarEgreso())) {
			
			int row = vista.getTableEgreso().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelEgreso().getValueAt(row, 0)));
				ControlEgreso eEntity = repositoryEgreso.find(id);
				vista.cargarFormEgreso(eEntity);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}else if(e.getSource().equals(vista.getBtnEliminarEgreso())) {
			int row = vista.getTableEgreso().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelEgreso().getValueAt(row, 0)));
				ControlEgreso eEntity = repositoryEgreso.find(id);
				repositoryEgreso.delete(eEntity);
				vista.ActualizarVista();
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource().equals(vista.getBtnImprimir())) {
			vi = new VistaImprimir();
			
			pi = vi.getPi();

			Iterator<ControlIngreso> listaIngresos = this.repositoryIngreso.findAll().iterator();
			Iterator<ControlEgreso> listaEgresos = this.repositoryEgreso.findAll().iterator();
			
			
			pi.getModelEgresos().getDataVector().removeAllElements();
			pi.getModelEgresos().fireTableDataChanged();
			
			while(listaEgresos.hasNext()) {
				ControlEgreso red = listaEgresos.next();
				pi.getModelEgresos().addRow(new  Object[] {
						red.getId(),
						red.getDesc(),
						Helpers.getFechaFormat(red.getFecha()),
						red.getMonto()
				});
			}
			
			pi.getModelIngresos().getDataVector().removeAllElements();
			pi.getModelIngresos().fireTableDataChanged();
			
			
			while(listaIngresos.hasNext()) {
				ControlIngreso record = listaIngresos.next();
				pi.getModelIngresos().addRow(new  Object[] {
						record.getId(),
						record.getDesc(),
						Helpers.getFechaFormat(record.getFecha()),
						record.getMonto()
				});
			}
			
			String totalI = vista.getTxtTotalIngreso().getText();
			String totalE = vista.getTxtTotalEgreso().getText();
			
			pi.getLblTotalIngresos().setText(Helpers.ponerPuntos(totalI));
			pi.getLblTotalEgresos().setText(Helpers.ponerPuntos(totalE));
			
			vi.setVisible(true);
		}
	}
	
	
	// Guardado de Egresos
	
	public void guardarEgresos() {
		
		if(vista.getTxtIdEgreso().getText().length() <= 0) {
			
			if(vista.camposEgresosVacios() == true) {
				
				ControlEgreso eEntity = new ControlEgreso();
				
				eEntity.setDesc(vista.getTxtDescEgreso().getText());
				eEntity.setFecha(vista.getFechaEgresso().getCalendar());
				eEntity.setMonto(Integer.parseInt(vista.getTxtMontoEgreso().getText()));
				
				ControlEgreso db = this.repositoryEgreso.create(eEntity);
				
				if(db != null) {
					Mensajes.Creacion();
					vista.ActualizarVista();
				}
			}else {
				Mensajes.CamposVacios();
			}
			// MODIFICAR EGRESOS
		}else{
			
			if(vista.camposEgresosVacios()) {
				
				ControlEgreso eEntity = new ControlEgreso();
				
				eEntity.setId(Long.parseLong(vista.getTxtIdEgreso().getText()));
				eEntity.setDesc(vista.getTxtDescEgreso().getText());
				eEntity.setFecha(vista.getFechaEgresso().getCalendar());
				eEntity.setMonto(Integer.parseInt(vista.getTxtMontoEgreso().getText()));
				
				ControlEgreso db = this.repositoryEgreso.update(eEntity);
				if(db != null) {
					Mensajes.Actualizacion();
					vista.ActualizarVista();
				}
			}else {
				Mensajes.CamposVacios();
			}
		}
	}

	public void LlenarTablaEgreso() {
		
		Iterator<ControlEgreso> listaEgreso = this.repositoryEgreso.findAll().iterator();
		this.vista.getModelEgreso().getDataVector().removeAllElements();
		this.vista.getModelEgreso().fireTableDataChanged();
		
		while(listaEgreso.hasNext()) {
			ControlEgreso red = listaEgreso.next();
			this.vista.getModelEgreso().addRow(new  Object[] {
					red.getId(),
					red.getDesc(),
					Helpers.getFechaFormat(red.getFecha()),
					red.getMonto()
			});
		}
		
	}
	
	
	// Guardado de Ingresos
	
	public void guardarIngreso() {
		
		if(vista.getTxtIdIngreso().getText().length() <= 0) {
			if(vista.camposIngresoVacios()) {
				
				ControlIngreso record = new ControlIngreso();
				
				record.setDesc(vista.getTxtDescIngreso().getText());
				record.setFecha(vista.getFechaIngreso().getCalendar());
				record.setMonto(Integer.parseInt(vista.getTxtMontoIngreso().getText()));
				
				ControlIngreso db = this.repositoryIngreso.create(record);
				
				if(db != null) {
					Mensajes.Creacion();
					vista.ActualizarVista();
				}
			}else {
				Mensajes.CamposVacios();
			}
			// MODIFICAR 
		}else{
			if(vista.camposIngresoVacios()) {
				
				ControlIngreso record = new ControlIngreso();
				
				record.setId(Long.parseLong(vista.getTxtIdIngreso().getText()));
				record.setDesc(vista.getTxtDescIngreso().getText());
				record.setFecha(vista.getFechaIngreso().getCalendar());
				record.setMonto(Integer.parseInt(vista.getTxtMontoIngreso().getText()));
				
				ControlIngreso db = this.repositoryIngreso.update(record);
				if(db != null) {
					Mensajes.Actualizacion();
					vista.ActualizarVista();
				}
			}else {
				Mensajes.CamposVacios();
			}
		}
	}
	
	public void actualizarIngreso() {
		
	}

	public void LlenarTablaIngreso() {
		 
		Iterator<ControlIngreso> lista = this.repositoryIngreso.findAll().iterator();
		this.vista.getModelIngreso().getDataVector().removeAllElements();
		this.vista.getModelIngreso().fireTableDataChanged();
		
		while(lista.hasNext()) {
			ControlIngreso record = lista.next();
			this.vista.getModelIngreso().addRow(new  Object[] {
					record.getId(),
					record.getDesc(),
					Helpers.getFechaFormat(record.getFecha()),
					record.getMonto()
			});
		}
		
	}
	
}
