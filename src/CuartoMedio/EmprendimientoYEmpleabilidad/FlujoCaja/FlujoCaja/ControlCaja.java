package CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.LiquidacionSueldo;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlCaja implements ActionListener {

	private VistaFlujoCaja vista;
	private CajaRepository repository;
	private FlujoRepository fRepository;

	public ControlCaja(VistaFlujoCaja vista) {
		this.repository = new CajaRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.fRepository = new FlujoRepository();
		this.fRepository.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(vista.getBtnGuardar())) {
			if (vista.camposVaciosRegistro()) {
				Caja record = new Caja();

				record.setNumero(Integer.parseInt(vista.getTxtNumero().getText()));
				record.setTipo(vista.getTxtTipo().getText());
				record.setResponsable(vista.getTxtResponsable().getText());

				// guarda
				if (vista.getIdCaja() <= 0 && vista.getIdCaja() != null) {
					this.guardar(record);
					// actualiza
				} else {
					record.setId(vista.getIdCaja());
					this.actualizar(record);
				}

				vista.actualizarVistaRegistro();

			} else {
				Mensajes.CamposVacios();
			}
		} else if (e.getSource().equals(vista.getBtnModificar())) {
			Long id = getRowRegistro();
			if (id >= 0) {
				Caja record = repository.find(id);
				vista.cargarFormRegistro(record);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource().equals(vista.getBtnEliminar())) {
			Long id = getRowRegistro();
			if (id != null) {
				Caja record = repository.find(id);
				repository.delete(record);
				vista.actualizarVistaRegistro();
			}
		} else if (e.getSource().equals(vista.getBtnUsarCaja())) {
			int row = vista.getTableRegistro().getSelectedRow();

			if (row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelRegistro().getValueAt(row, 0)));
				String numero = String.valueOf(vista.getModelRegistro().getValueAt(row, 1));
				String tipo = String.valueOf(vista.getModelRegistro().getValueAt(row, 2));
				
				vista.setIdSeledCaja(id);
				vista.getTxtNumCaja().setText(numero);
				vista.getTxtCaja().setText(tipo);
				
				vista.actualizarVistaFlujo();

			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource().equals(vista.getBtnCambiarCaja())) {
			vista.cambiarCaja();
		} else if (e.getSource().equals(vista.getBtnAgregar())) {
			if (vista.camposVaciosFlujo()) {
				Flujo record = new Flujo();

				record.setNumero(Integer.parseInt(vista.getTxtNumCaja().getText()));
				record.setCaja(vista.getTxtCaja().getText());
				record.setIdCaja(vista.getIdSeledCaja());
				record.setFecha(vista.getDateFecha().getCalendar());
				record.setConcepto(vista.getTxtConcepto().getText());
				record.setCodigo(vista.getTxtCodigo().getText());
				record.setEntrada(Integer.parseInt(vista.getTxtEntrada().getText()));
				record.setSalida(Integer.parseInt(vista.getTxtSalida().getText()));

				// guarda
				if (vista.getIdFlujo() <= 0 && vista.getIdFlujo() != null) {
					this.guardarFlujo(record);
					// actualiza
				} else {
					record.setId(vista.getIdFlujo());
					this.actualizarFlujo(record);
				}

				vista.actualizarVistaFlujo();

			} else {
				Mensajes.CamposVacios();
			}
		} else if (e.getSource().equals(vista.getBtnModificarFlujo())) {
			Long id = getRowFlujo();
			if (id >= 0) {
				Flujo record = fRepository.find(id);
				vista.cargarFormFlujo(record);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource().equals(vista.getBtnEliminarFlujo())) {
			Long id = getRowFlujo();
			if (id != null) {
				Flujo record = fRepository.find(id);
				fRepository.delete(record);
				vista.actualizarVistaFlujo();
			}
		}
	}

	private Long getRowRegistro() {
		int row = vista.getTableRegistro().getSelectedRow();
		if (row >= 0) {
			Long id = Long.parseLong(String.valueOf(vista.getModelRegistro().getValueAt(row, 0)));
			return id;
		} else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);
			return null;
		}

	}

	private Long getRowFlujo() {
		int row = vista.getTableFlujo().getSelectedRow();
		if (row >= 0) {
			Long id = Long.parseLong(String.valueOf(vista.getModelFlujo().getValueAt(row, 0)));
			return id;
		} else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);
			return null;
		}

	}

	private void guardar(Caja record) {

		Caja db = this.repository.create(record);

		if (db != null) {
			vista.vaciarFormRegistro();
			Mensajes.Creacion();
		}
	}

	private void actualizar(Caja record) {

		Caja db = this.repository.update(record);

		if (db != null) {
			vista.vaciarFormRegistro();
			Mensajes.Actualizacion();
		}
	}

	private void guardarFlujo(Flujo record) {

		Flujo db = this.fRepository.create(record);

		if (db != null) {
			vista.vaciarFormRegistro();
			Mensajes.Creacion();
		}
	}

	private void actualizarFlujo(Flujo record) {

		Flujo db = this.fRepository.update(record);

		if (db != null) {
			vista.vaciarFormRegistro();
			Mensajes.Actualizacion();
		}
	}

	public void LlenarTablaRegistro() {

		// TODO Auto-generated method stub
		Iterator<Caja> lista = this.repository.findAll().iterator();
		this.vista.getModelRegistro().getDataVector().removeAllElements();
		this.vista.getModelRegistro().fireTableDataChanged();

		while (lista.hasNext()) {
			Caja records = lista.next();
			this.vista.getModelRegistro().addRow(
					new Object[] { records.getId(), records.getNumero(), records.getTipo(), records.getResponsable() });
		}
	}

	public void LlenarTablaFlujo() {
		
		if(vista.getIdSeledCaja() > 0 && vista.getIdSeledCaja() != null) {
			Iterator<Flujo> lista = this.fRepository.findForCaja(vista.getIdSeledCaja()).iterator();
			this.vista.getModelFlujo().getDataVector().removeAllElements();
			this.vista.getModelFlujo().fireTableDataChanged();

			while (lista.hasNext()) {
				Flujo records = lista.next();
				this.vista.getModelFlujo()
						.addRow(new Object[] { 
								records.getId(), 
								records.getCodigo(), 
								records.getConcepto(),
								Helpers.getFechaFormat(records.getFecha()), 
								Helpers.currency(""+records.getEntrada()), 
								Helpers.currency(""+records.getSalida())
								});
			}
			
			vista.calcularTotal();
		}
		
	
	}
	
	

}
