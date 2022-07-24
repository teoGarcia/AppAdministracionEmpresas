package CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.LiquidacionSueldo;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlCaja implements ActionListener {

	private VistaFlujoCaja vista;
	private CajaRepository repository;

	public ControlCaja(VistaFlujoCaja vista) {
		this.repository = new CajaRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(vista.getBtnGuardar())) {
			if (vista.camposVaciosRegistro()) {
				Caja record = new Caja();

				record.setNumero(Integer.parseInt(vista.getTxtResponsable().getText()));
				record.setTipo(vista.getTxtNumero().getText());
				record.setResponsable(vista.getTxtTipo().getText());

				// guarda
				if (vista.getIdCaja() <= 0 && vista.getIdCaja() != null) {
					this.guardar(record);
					// actualiza
				} else {
					this.actualizar(record);
				}

			} else {
				Mensajes.CamposVacios();
			}
		}else if(e.getSource().equals(vista.getBtnModificar())) {
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

	public void LlenarTablaRegistro() {
		// TODO Auto-generated method stub
		Iterator<Caja> lista = this.repository.findAll().iterator();
		this.vista.getModelRegistro().getDataVector().removeAllElements();
		this.vista.getModelRegistro().fireTableDataChanged();

		while (lista.hasNext()) {
			Caja records = lista.next();
			this.vista.getModelRegistro()
					.addRow(new Object[] { 
							records.getId(), 
							records.getNumero(), 
							records.getTipo(),
							records.getResponsable()
					});
		}
	}

	public void LlenarTablaFlujo() {
		// TODO Auto-generated method stub

	}

}
