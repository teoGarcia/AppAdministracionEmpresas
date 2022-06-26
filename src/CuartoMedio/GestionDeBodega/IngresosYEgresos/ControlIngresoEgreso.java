package CuartoMedio.GestionDeBodega.IngresosYEgresos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import org.hibernate.internal.build.AllowSysOut;

import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlIngresoEgreso implements ActionListener {

	private VistaIngresosYEgresos vista;
	private IngresoRepository repositoryIngreso;
	private EgresoRepository repositoryEgreso;
	
	public ControlIngresoEgreso(VistaIngresosYEgresos vista) {
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
		}
	}
	
	public void guardarIngreso() {
		if(vista.camposIngresoVacios()) {
			
			Ingreso record = new Ingreso();
			
			record.setDesc(vista.getTxtDescIngreso().getText());
			record.setFecha(vista.getFechaIngreso().getCalendar());
			record.setMonto(Double.parseDouble(vista.getTxtMontoIngreso().getText()));
			
			Ingreso db = this.repositoryIngreso.create(record);
			
			System.out.println(db.toString());
			
			if(db != null) {
				Mensajes.Creacion();
				vista.ActualizarVista();
			}
		}else {
			Mensajes.CamposVacios();
		}
	}
	
	public void actualizarIngreso() {
		
	}

	public void LlenarTablas() {
		 
		Iterator<Ingreso> lista = this.repositoryIngreso.findAll().iterator();
		this.vista.getModelIngreso().getDataVector().removeAllElements();
		this.vista.getModelIngreso().fireTableDataChanged();
		
		while(lista.hasNext()) {
			Ingreso record = lista.next();
			System.out.println("Ingreso :"+record);
			this.vista.getModelIngreso().addRow(new  Object[] {
					record.getId(),
					record.getDesc(),
					Helpers.getFechaFormat(record.getFecha()),
					record.getMonto()
			});
		}
		
		
		
		Iterator<Egreso> listaEgreso = this.repositoryEgreso.findAll().iterator();
		this.vista.getModelEgreso().getDataVector().removeAllElements();
		this.vista.getModelEgreso().fireTableDataChanged();
		
		while(listaEgreso.hasNext()) {
			Egreso red = listaEgreso.next();
			System.out.println("Egreso :"+red);
			this.vista.getModelEgreso().addRow(new  Object[] {
					red.getId(),
					red.getDesc(),
					Helpers.getFechaFormat(red.getFecha()),
					red.getMonto()
			});
		}
		
	}
	
}
