package TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.swing.JOptionPane;

import TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Imprimir.PanelImprimir;
import TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Mayoreo.*;
import Menu.Side.SideMenu;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;
import ui.imprimir.VistaImprimir;

public class ControlLibroDiarioYMayor implements ActionListener, ItemListener  {
	
	private LibroDiarioRepository lRepository;
	private AsientosRepository Repository;
	private VistaLibroDiarioYMayor vista;
	
	private PanelImprimir pi;
	
	private VistaImprimir imprimir;
	

	public ControlLibroDiarioYMayor(VistaLibroDiarioYMayor vista) {
		this.lRepository = new LibroDiarioRepository();
		this.lRepository.setEm(ManagerDB.getEntityManager());
		
		this.Repository = new AsientosRepository();
		this.Repository.setEm(ManagerDB.getEntityManager());
		
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(vista.getBtnAgregarLibro())) {
			if (vista.camposVaciosLibro()) {
				LibroDiario record = new LibroDiario();

				record.setMes(vista.getMonthMesPeriodo().getMonth());
				record.setAnio(vista.getYearChooserPeriodo().getYear());
				record.setDenominacion(vista.getTxtDenominacion().getText());

				// guarda
				if (vista.getIdLibro() <= 0 && vista.getIdLibro() != null) {
					this.guardarLibro(record);
					// actualiza
				} else {
					record.setId(vista.getIdLibro());
					this.actualizarLibro(record);
				}

				vista.actualizarVistaLibro();

			} else {
				Mensajes.CamposVacios();
			}
		} else if (e.getSource().equals(vista.getBtnModificarLibro())) {
			Long id = getRowLibro();
			if (id >= 0) {
				LibroDiario record = lRepository.find(id);
				vista.cargarFormLibro(record);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource().equals(vista.getBtnEliminarLibro())) {
			Long id = getRowLibro();
			if (id != null) {
				LibroDiario record = lRepository.find(id);
				lRepository.delete(record);
				vista.actualizarVistaLibro();
			}
		} else if(e.getSource().equals(vista.getBtnUsarLibro())) {
			Long id = getRowLibro();
			vista.setIdSelectLibro(id);
			int row = vista.getTableLibro().getSelectedRow();
			String libro = String.valueOf(vista.getModelLibro().getValueAt(row, 2));
			vista.getLblLibro().setText(libro);
			
			vista.actualizarVista();
			
		} else if(e.getSource().equals(vista.getStndrbtnCambiarLibro())) {
			vista.setIdSelectLibro(0l);
			vista.getLblLibro().setText("Seleccione el Libro Diario");
			vista.actualizarVista();
		}else if (e.getSource().equals(vista.getBtnAgregar())) {
			
			
			if(vista.getIdSelectLibro() > 0L ) {
				
				if (vista.camposVacios()) {
					Asientos record = new Asientos();

					record.setIdLibro(vista.getIdSelectLibro());
					record.setAsiento(vista.getTxtAsiento().getText());
					record.setFecha(vista.getDateFecha().getCalendar());
					record.setDefinicion(vista.getTxtDefinicion().getText());
					record.setCodigo(vista.getTxtCodigo().getSelectedIndex()+1);
					record.setDesglose(vista.getTxtDesglose().getSelectedItem().toString());
					record.setDebe(Integer.parseInt(vista.getTxtDebe().getText()));
					record.setHaber(Integer.parseInt(vista.getTxtHaber().getText()));
					
					// guarda
					if (vista.getId() <= 0 && vista.getId() != null) {
						this.guardar(record);
						// actualiza
					} else {
						record.setId(vista.getId());
						this.actualizar(record);
					}

					vista.actualizarVista();

				} else {
					Mensajes.CamposVacios();
				}
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Debe selecionar un Libro Diario", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
			
		} else if (e.getSource().equals(vista.getBtnModificar())) {
			Long id = getRow();
			if (id >= 0) {
				Asientos record = Repository.find(id);
				vista.cargarForm(record);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource().equals(vista.getBtnEliminar())) {
			Long id = getRow();
			if (id != null) {
				Asientos record = Repository.find(id);
				Repository.delete(record);
				vista.actualizarVista();
			}
		}  else if(e.getSource().equals(vista.getBtnImprimir())) {
			
			if(imprimir == null) imprimir = VistaImprimir.instance();
			
			imprimir.resetImprimir();
			
			Long id = getRowLibro();
			
			if(id > 0) {
				
				vista.setIdSelectLibro(id);
				int row = vista.getTableLibro().getSelectedRow();
				
				pi = new PanelImprimir();
					
				String periodo = String.valueOf(vista.getModelLibro().getValueAt(row, 1));;
				String razonS = String.valueOf(vista.getModelLibro().getValueAt(row, 2));;
				

				pi.getTxtPeriodo().setText(periodo);
				pi.getTxtDenominacinORazn().setText(razonS);
				
				Iterator<Asientos> lista = this.Repository.findForLibroDiario(vista.getIdSelectLibro()).iterator();
				
				while (lista.hasNext()) {
					Asientos records = lista.next();
					
					pi.getModel().addRow(new Object[] { 
							records.getId(), 
							records.getAsiento(),
							Helpers.getFechaFormat(records.getFecha()),
							records.getDefinicion(),
							records.getCodigo(),
							records.getDesglose(),
							records.getDebe(),
							records.getHaber(),
						});
					
					
				}
				
				imprimir.registerPanel(pi, "pi");
				
				imprimir.setVisible(true);
			}
			
	
		} else if(e.getSource().equals(vista.getBtnMayoreo())) { 
			
			if(imprimir == null) imprimir = VistaImprimir.instance();
			
			imprimir.resetImprimir();
			
			if(vista.getIdSelectLibro()>0L) {
				
				

				Iterator<Asientos> list = this.Repository.findForLibroDiario(vista.getIdSelectLibro()).iterator();
				
				Pagina1 p1 = new Pagina1();
				Pagina2 p2 = new Pagina2();
				Pagina3 p3 = new Pagina3();
				Pagina4 p4 = new Pagina4();
				
				while (list.hasNext()) {
					Asientos record = list.next();
					p1.CargarData(record);
					p2.CargarData(record);
					p3.CargarData(record);
					p4.CargarData(record);
				}
				
				
			
					
				imprimir.registerPanel(p1, "1");
				imprimir.registerPanel(p2, "2");
				imprimir.registerPanel(p3, "3");
				imprimir.registerPanel(p4, "4");
					
				imprimir.setVisible(true);
				
			}
		}
		
	}

	public void LlenarTablaLibro() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Iterator<LibroDiario> lista = this.lRepository.findAll().iterator();
		this.vista.getModelLibro().getDataVector().removeAllElements();
		this.vista.getModelLibro().fireTableDataChanged();

		while (lista.hasNext()) {
			LibroDiario records = lista.next();
			this.vista.getModelLibro().addRow(
					new Object[] { records.getId(), Helpers.getnombreMes(records.getMes())+" "+records.getAnio(), records.getDenominacion()});
			}
	}

	public void LlenarTabla() {
		
		
		this.vista.getModel().getDataVector().removeAllElements();
		this.vista.getModel().fireTableDataChanged();
		 
		if(vista.getIdSelectLibro() > 0 && vista.getIdSelectLibro() != null) {
			
			Iterator<Asientos> lista = this.Repository.findForLibroDiario(vista.getIdSelectLibro()).iterator();

			while (lista.hasNext()) {
				Asientos records = lista.next();
				
				
				this.vista.getModel().addRow(
						new Object[] { 
								records.getId(), 
								records.getAsiento(),
								Helpers.getFechaFormat(records.getFecha()),
								records.getDefinicion(),
								records.getCodigo(),
								records.getDesglose(),
								records.getDebe(),
								records.getHaber(),
						});
				}
		}
		// TODO Auto-generated method stub
		
	}
	
	private Long getRowLibro() {
		int row = vista.getTableLibro().getSelectedRow();
		if (row >= 0) {
			Long id = Long.parseLong(String.valueOf(vista.getModelLibro().getValueAt(row, 0)));
			return id;
		} else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);
			return null;
		}

	}
	
	private Long getRow() {
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
	
	private void guardarLibro(LibroDiario record) {

		LibroDiario db = this.lRepository.create(record);

		if (db != null) {
			vista.VaciarFormLibro();
			Mensajes.Creacion();
		}
	}
	
	private void guardar(Asientos record) {

		Asientos db = this.Repository.create(record);

		if (db != null) {
			vista.vaciarForm();
			Mensajes.Creacion();
		}
	}
	
	private void actualizarLibro(LibroDiario record) {

		LibroDiario db = this.lRepository.update(record);

		if (db != null) {
			vista.VaciarFormLibro();
			Mensajes.Actualizacion();
		}
	}
	
	private void actualizar(Asientos record) {

		Asientos db = this.Repository.update(record);

		if (db != null) {
			vista.vaciarForm();
			Mensajes.Actualizacion();
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		vista.getTxtDesglose().setSelectedIndex(Integer.parseInt(e.getItem().toString())-1);
	}

}
