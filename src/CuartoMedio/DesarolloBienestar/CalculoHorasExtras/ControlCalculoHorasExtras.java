package CuartoMedio.DesarolloBienestar.CalculoHorasExtras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoRepository;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.VistaAplicacionPresupuesto;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir.PanelImprimirAplicPresup;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir.VistaImprimirAplicacionPresup;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlCalculoHorasExtras implements ActionListener {

	private VistaCalculoHorasExtras vap;
	private CargarDatosRepository repository;
	private HorasTrabajadasRepository repositoryHorasTrabajadas;

	public ControlCalculoHorasExtras(VistaCalculoHorasExtras vche) {
		this.repository = new CargarDatosRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.repositoryHorasTrabajadas = new HorasTrabajadasRepository();
		this.repositoryHorasTrabajadas.setEm(ManagerDB.getEntityManager());
		this.vap = vche;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(vap.getBtnGuardarCargaDatos())) {

			// GUARDAR

			if (vap.getTxtId().getText().length() <= 0) {
				if (vap.camposVacios()) {
					CargarDatosEntity ape = new CargarDatosEntity();

					ape.setJornadaLabAlmuerzo(vap.getTxtHorasMasAlmuerzo().getText());
					ape.setJornadaLabSabado(vap.getTxtHorasSabado().getText());
					ape.setJornadaLabDomingo(vap.getTxtHorasDomingo().getText());
					ape.setValorHoraExtra(Integer.parseInt(vap.getTxtValorHoraExtraNormal().getText()));
					ape.setValorHoraExtraExtrao(Integer.parseInt(vap.getTxtValorHoraExtraExtrao().getText()));
					ape.setPrecioHoraNormal(Integer.parseInt(vap.getTxtPrecioHora().getText()));

					CargarDatosEntity db = this.repository.create(ape);
					if (db != null) {
						Mensajes.Creacion();
						vap.ActualizarVista();
					}
				} else {
					Mensajes.CamposVacios();
				}

				// ACTUALIZAR (MODIFICAR)
			} else {
				if (vap.camposVacios()) {

					CargarDatosEntity ape = new CargarDatosEntity();

					ape.setId(Long.parseLong(vap.getTxtId().getText()));
					ape.setJornadaLabAlmuerzo(vap.getTxtHorasMasAlmuerzo().getText());
					ape.setJornadaLabSabado(vap.getTxtHorasSabado().getText());
					ape.setJornadaLabDomingo(vap.getTxtHorasDomingo().getText());
					ape.setValorHoraExtra(Integer.parseInt(vap.getTxtValorHoraExtraNormal().getText()));
					ape.setValorHoraExtraExtrao(Integer.parseInt(vap.getTxtValorHoraExtraExtrao().getText()));
					ape.setPrecioHoraNormal(Integer.parseInt(vap.getTxtPrecioHora().getText()));

					CargarDatosEntity db = this.repository.update(ape);
					if (db != null) {
						Mensajes.Actualizacion();
						vap.ActualizarVista();
					}
				} else {
					Mensajes.CamposVacios();
				}
			}

		} else if (e.getSource().equals(vap.getBtnModificarDatos())) {
			int row = vap.getTableCargarDatos().getSelectedRow();
			if (row >= 0) {

				Long id = Long.parseLong(String.valueOf(vap.getModel().getValueAt(row, 0)));
				CargarDatosEntity ape = repository.find(id);
				vap.CargarForm(ape);

			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}

		} else if (e.getSource().equals(vap.getBtnEliminarDatos())) {
			int row = vap.getTableCargarDatos().getSelectedRow();
			if (row >= 0) {
				Long id = Long.parseLong(String.valueOf(vap.getModel().getValueAt(row, 0)));
				CargarDatosEntity ape = repository.find(id);
				repository.delete(ape);
				vap.ActualizarVista();
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}

		} else if (e.getSource().equals(vap.getBtnUsarDatos())) {

			int filaSeleccionada = vap.getTableCargarDatos().getSelectedRow();

			if (filaSeleccionada >= 0) {

				vap.getTxtHorasLaboralesCalc().setText(String.valueOf(vap.getModel().getValueAt(filaSeleccionada, 1)));
				vap.getTxtHorasLabSabCalc().setText(String.valueOf(vap.getModel().getValueAt(filaSeleccionada, 2)));
				vap.getTxtHorasLabDominCalc().setText(String.valueOf(vap.getModel().getValueAt(filaSeleccionada, 3)));
				vap.getTxtValorHoraExtrCalc().setText(String.valueOf(vap.getModel().getValueAt(filaSeleccionada, 6)));
				vap.getTxtPorcHoraExtNormCalc().setText(String.valueOf(vap.getModel().getValueAt(filaSeleccionada, 4)));
				vap.getTxtPorcHoraExtExtCalc().setText(String.valueOf(vap.getModel().getValueAt(filaSeleccionada, 5)));

			}

		} else if (e.getSource().equals(vap.getBtnCalcularTotal())) {

			CalcularTotHorasExtras();
			CalcularTotHorasExtrasE();

		}else if(e.getSource().equals(vap.getBtnCalcularTotal())) {
			
			if(vap.camposVaciosCalcular()) {
				CalcularTotHorasExtras();
				CalcularTotHorasExtrasE();
			}else {
				
				Mensajes.CamposVacios();
			}
			
		}else if(e.getSource().equals(vap.getBtnGuardarRegistroHoras())) {
			
			// GUARDAR

			if (vap.getTxtIdRH().getText().length() <= 0) {
				if (vap.camposVaciosHorasTrabajadas()) {

					HorasTrabajadasEntity ape = new HorasTrabajadasEntity();

					ape.setNombre(vap.getTxtNombre().getText());
					ape.setFechaHoraRegistrada(vap.getFechaRegistrarHoras().getCalendar());
					ape.setHoraEntradaHora(vap.getTxtHorasEntrada().getText());
					ape.setHoraEntradaMinuto(vap.getTxtMinutosEntrada().getText());
					ape.setHoraSalidaHora(vap.getTxtHoraSalida().getText());
					ape.setHoraSalidaMinuto(vap.getTxtMinutosSalida().getText());
					ape.setTotalHorasHora(vap.getTxtHorasTotHoras().getText());
					ape.setTotalHorasMinuto(vap.getTxtMinutosTotHoras().getText());
					ape.setTotalHorasExtrasHora(vap.getTxtHoraTotHorExt().getText());
					ape.setTotalHorasExtrasMinuto(vap.getTxtMinutosTotHorExt().getText());
					
					

					HorasTrabajadasEntity db = this.repositoryHorasTrabajadas.create(ape);
					if (db != null) {
						Mensajes.Creacion();
						vap.ActualizarVistaHR();
					}
				} else {
					Mensajes.CamposVacios();
				}

				// ACTUALIZAR (MODIFICAR)
			} else {
				if (vap.camposVaciosHorasTrabajadas()) {

					HorasTrabajadasEntity ape = new HorasTrabajadasEntity();

					ape.setId(Long.parseLong(vap.getTxtIdRH().getText()));

					ape.setNombre(vap.getTxtNombre().getText());
					ape.setFechaHoraRegistrada(vap.getFechaRegistrarHoras().getCalendar());
			        ape.setHoraEntradaHora(vap.getTxtHorasEntrada().getText());
					ape.setHoraEntradaMinuto(vap.getTxtMinutosEntrada().getText());
					ape.setHoraSalidaHora(vap.getTxtHoraSalida().getText());
					ape.setHoraSalidaMinuto(vap.getTxtMinutosSalida().getText());
					ape.setTotalHorasHora(vap.getTxtHorasTotHoras().getText());
					ape.setTotalHorasMinuto(vap.getTxtMinutosTotHoras().getText());
					ape.setTotalHorasExtrasHora(vap.getTxtHoraTotHorExt().getText());
					ape.setTotalHorasExtrasMinuto(vap.getTxtMinutosTotHorExt().getText());
					
					HorasTrabajadasEntity db = this.repositoryHorasTrabajadas.update(ape);
					if (db != null) {
						Mensajes.Actualizacion();
						vap.ActualizarVistaHR();
					}
				} else {
					Mensajes.CamposVacios();
				}
			}

		} else if (e.getSource().equals(vap.getBtnModificarHR())) {
			int row = vap.getTableRegistrarHoras().getSelectedRow();
			if (row >= 0) {

				Long id = Long.parseLong(String.valueOf(vap.getModelRH().getValueAt(row, 0)));
				HorasTrabajadasEntity ape = repositoryHorasTrabajadas.find(id);
				vap.CargarFormRH(ape);

			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}

		} else if (e.getSource().equals(vap.getBtnEliminarDatos())) {
			int row = vap.getTableRegistrarHoras().getSelectedRow();
			if (row >= 0) {
				Long id = Long.parseLong(String.valueOf(vap.getModelRH().getValueAt(row, 0)));
				HorasTrabajadasEntity ape = repositoryHorasTrabajadas.find(id);
				repositoryHorasTrabajadas.delete(ape);
				vap.ActualizarVistaHR();
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}

		} else if (e.getSource().equals(vap.getBtnBuscarPorFecha())) {

			if (vap.getFechaDesdeRegistroHoraExtra().getCalendar() != null
					&& vap.getFechaHastaRegistroHoraExtra().getCalendar() != null) {

				Calendar desde = vap.getFechaDesdeRegistroHoraExtra().getCalendar();
				Calendar hasta =vap.getFechaHastaRegistroHoraExtra().getCalendar();

				try {
					Iterator<HorasTrabajadasEntity> lista = repositoryHorasTrabajadas.findAllBeetwenBydates(desde, hasta)
							.iterator();

					this.vap.getModelRH().getDataVector().removeAllElements();
					this.vap.getModelRH().fireTableDataChanged();
					
					while (lista.hasNext()) {
						HorasTrabajadasEntity ape = lista.next();

						this.vap.getModelRH().addRow(new Object[] {

								ape.getId(), 
								ape.getNombre(), 
								Helpers.getFechaFormat(ape.getFechaHoraRegistrada()),
								ape.getHoraEntradaHora() + ":" + ape.getHoraEntradaMinuto(),
								ape.getHoraSalidaHora() + ":" + ape.getHoraSalidaMinuto(),
								ape.getTotalHorasHora() + ":" + ape.getTotalHorasMinuto(),
								ape.getTotalHorasExtrasHora() + ":" + ape.getTotalHorasExtrasMinuto()

						});

					}

				} catch (ParseException e1) {
					System.out.println("error al buscar");
					e1.printStackTrace();
				}

			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar el rango de fechas", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}

		}

	}

	public void CalcularTotHorasExtras() {

		int CampoPorcentajeHorasExtrasNormal = Integer.parseInt(vap.getTxtPorcHoraExtNormCalc().getText());
		int ValorHoraExtra = Integer.parseInt(vap.getTxtValorHoraExtrCalc().getText());
		int CalculandoPorcentaje = (ValorHoraExtra * CampoPorcentajeHorasExtrasNormal) / 100;
		int ValorRealHoraExtra = ValorHoraExtra + CalculandoPorcentaje;

		int NumeroHorasExtras = Integer.parseInt(vap.getTxtHoraExtraNormalMultip().getText());

		int TotalHorasExtras = ValorRealHoraExtra * NumeroHorasExtras;

		vap.getTxtTotalHorasExtrasNormal().setText("" + TotalHorasExtras);

	}

	public void CalcularTotHorasExtrasE() {

		int CampoPorcentajeHorasExtrasE = Integer.parseInt(vap.getTxtPorcHoraExtExtCalc().getText());
		int ValorHoraExtraE = Integer.parseInt(vap.getTxtValorHoraExtrCalc().getText());
		int CalculandoPorcentaje = (ValorHoraExtraE * CampoPorcentajeHorasExtrasE) / 100;
		int ValorRealHoraExtraE = ValorHoraExtraE + CalculandoPorcentaje;

		int NumeroHorasExtrasE = Integer.parseInt(vap.getTxtHoraExtraExtraordMultip().getText());

		int TotalHorasExtrasE = ValorRealHoraExtraE * NumeroHorasExtrasE;

		vap.getTxtTotalHorasExtrExtrao().setText("" + TotalHorasExtrasE);

	}

	public void LlenarTabla() {

		Iterator<CargarDatosEntity> lista = this.repository.findAll().iterator();
		this.vap.getModel().getDataVector().removeAllElements();
		this.vap.getModel().fireTableDataChanged();

		while (lista.hasNext()) {
			CargarDatosEntity ape = lista.next();

			this.vap.getModel().addRow(new Object[] {

					ape.getId(), 
					ape.getJornadaLabAlmuerzo(), 
					ape.getJornadaLabSabado(),
					ape.getJornadaLabDomingo(),
					ape.getValorHoraExtra(), 
					ape.getValorHoraExtraExtrao(), 
					ape.getPrecioHoraNormal()

			});
		}

	}

	public void LlenarTablaRH() {

		Iterator<HorasTrabajadasEntity> lista = this.repositoryHorasTrabajadas.findAll().iterator();
		this.vap.getModelRH().getDataVector().removeAllElements();
		this.vap.getModelRH().fireTableDataChanged();

		while (lista.hasNext()) {
			HorasTrabajadasEntity ape = lista.next();

			this.vap.getModelRH().addRow(new Object[] {

					ape.getId(), 
					ape.getNombre(), 
					Helpers.getFechaFormat(ape.getFechaHoraRegistrada()),
					ape.getHoraEntradaHora() + ":" + ape.getHoraEntradaMinuto(),
					ape.getHoraSalidaHora() + ":" + ape.getHoraSalidaMinuto(),
					ape.getTotalHorasHora() + ":" + ape.getTotalHorasMinuto(),
					ape.getTotalHorasExtrasHora() + ":" + ape.getTotalHorasExtrasMinuto()

			});
		}

	}
}
