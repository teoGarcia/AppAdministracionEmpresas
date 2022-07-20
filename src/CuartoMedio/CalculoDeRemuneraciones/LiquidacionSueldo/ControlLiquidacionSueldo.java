package CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.Imprimir.ImprimirLiquidacion;
import CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.Imprimir.VistaImprimir;
import CuartoMedio.DotacionPersonal.PerfilEmpleado.PerfilEmpleadoEntity;
import CuartoMedio.DotacionPersonal.PerfilEmpleado.Imprimir.PanelImprimirPerfilEmpleado;
import CuartoMedio.DotacionPersonal.PerfilEmpleado.Imprimir.VistaImprimirPerfilEmpleado;
import CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto.PresupuestoEntity;
import CuartoMedio.GestionDeBodega.Inventario.InventarioEntity;
import CuartoMedio.GestionDeBodega.Inventario.InventarioRepository;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlLiquidacionSueldo implements ActionListener {

	private VistaLiquidacionSueldo vista;
	private LiquidacionSueldoRepository repository;
	private ImprimirLiquidacion panelI;
	private VistaImprimir imprimir;

	public ControlLiquidacionSueldo(VistaLiquidacionSueldo vista) {
		this.repository = new LiquidacionSueldoRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(vista.getBtnCalcularHaberes())) {

			sumarHaberes();

		} else if (e.getSource().equals(vista.getBtnCalcularDescuentos())) {
			Descuentos();

		} else if (e.getSource().equals(vista.getBtnCalcularTotal())) {
			sumaTotal();

		} else if (e.getSource().equals(vista.getBtnImprimir())) {
			
			Long id = getRow();
			
			if(id != null) {
				if(imprimir == null) imprimir = new VistaImprimir();
				
				LiquidacionSueldo record = repository.find(id);
				
				panelI = imprimir.getPanel();
				panelI.cargarForm(record);
				//piap.getLblEstadoCivil().setText(EstadoCivil);
				//piap.getLblSexo().setText(Sexo);
				imprimir.setVisible(true);
			}
			


		} else if (e.getSource().equals(vista.getBtnGuardar())) {

			if (vista.camposVacios()) {

				LiquidacionSueldo record = new LiquidacionSueldo();

				record.setNomEmpresa(vista.getTxtNomEmpre().getText());
				record.setRutEmpresa(vista.getTxtRutEmpre().getText());

				record.setNomTrabajador(vista.getTxtNomTrab().getText());
				record.setRutTrabajador(vista.getTxtRutTrab().getText());

				record.setMes(vista.getMonthChooserPago().getMonth());
				record.setAnio(vista.getYearChooserPago().getYear());

				record.setSueldo(Double.parseDouble(vista.getTxtSueBas().getText()));
				record.setHrasExtra(Double.parseDouble(vista.getTxtHorExt().getText()));
				record.setBonoGesMen(Double.parseDouble(vista.getTxtBonGesMen().getText()));
				record.setParticipacion(Double.parseDouble(vista.getTxtPar().getText()));
				record.setComisiones(Double.parseDouble(vista.getTxtCom().getText()));
				record.setGratificacion(Double.parseDouble(vista.getTxtGra().getText()));
				record.setCargFami(Double.parseDouble(vista.getTxtAsiFam().getText()));
				record.setAsigCola(Double.parseDouble(vista.getTxtCol().getText()));
				record.setAsigMovi(Double.parseDouble(vista.getTxtAsiMov().getText()));
				record.setAfp(Double.parseDouble(vista.getTxtAFP().getText()));
				record.setSeguroCesantia(Double.parseDouble(vista.getTxtSegCes().getText()));
				record.setSalud(Double.parseDouble(vista.getTxtSal().getText()));
				record.setDifIsap(Double.parseDouble(vista.getTxtDifIsa().getText()));
				record.setImpUni(Double.parseDouble(vista.getTxtImpUni().getText()));
				record.setCuoBie(Double.parseDouble(vista.getTxtCuoBie().getText()));
				record.setCuoAhorrLibr(Double.parseDouble(vista.getTxtCuoAhoLib().getText()));
				record.setCredCCFAAra(Double.parseDouble(vista.getTxtCCFA().getText()));
				record.setSulLiqLetras(Double.parseDouble(vista.getTxtSueLiqLet().getText()));
				record.setValesAnticipos(Double.parseDouble(vista.getTxtValAnt().getText()));

				// guarda
				if (vista.getId() <= 0 && vista.getId() != null) {
					LiquidacionSueldo db = this.repository.create(record);

					if (db != null) {
						Mensajes.Creacion();
						vista.actualizarVista();
					}

					// actualiza
				} else {
					record.setId(vista.getId());
					LiquidacionSueldo db = this.repository.update(record);
					if (db != null) {
						Mensajes.Actualizacion();
						vista.actualizarVista();
					}
				}

			} else {
				Mensajes.CamposVacios();
			}

		} else if (e.getSource().equals(vista.getBtnModificar())) {
			Long id = getRow();
			if (id >= 0) {
				LiquidacionSueldo record = repository.find(id);
				vista.cargarForm(record);
				calcularTodosLosTotales();
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource().equals(vista.getBtnVaciarCampos())) {
			vista.vaciarFormulario();

			// eliminar
		} else if (e.getSource().equals(vista.getBtnEliminar())) {
			Long id = getRow();
			if (id != null) {
				LiquidacionSueldo record = repository.find(id);
				repository.delete(record);
				vista.actualizarVista();
			}
		} else if (e.getSource().equals(vista.getBtnVerTodosLos())) {

			Long id = getRow();
			LiquidacionSueldo record = repository.find(id);
			vista.cargarForm(record);
			calcularTodosLosTotales();
		}

		// TODO Auto-generated method stub

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

	public void LlenarTabla() {

		Iterator<LiquidacionSueldo> lista = this.repository.findAll().iterator();
		this.vista.getModel().getDataVector().removeAllElements();
		this.vista.getModel().fireTableDataChanged();

		while (lista.hasNext()) {
			LiquidacionSueldo records = lista.next();
			this.vista.getModel()
					.addRow(new Object[] { records.getId(), records.getRutTrabajador(), records.getNomTrabajador(),
							records.getRutEmpresa(), records.getNomEmpresa(), records.getSueldo() });
		}

	}

	public void sumarHaberes() {

		float sueBase = Float.parseFloat(vista.getTxtSueBas().getText());
		float HorExtras = Float.parseFloat(vista.getTxtHorExt().getText());
		float BonoGestionMen = Float.parseFloat(vista.getTxtBonGesMen().getText());
		float Participacion = Float.parseFloat(vista.getTxtPar().getText());
		float Comisiones = Float.parseFloat(vista.getTxtCom().getText());
		float Gratificacion = Float.parseFloat(vista.getTxtGra().getText());
		float CargaAsigFam = Float.parseFloat(vista.getTxtAsiFam().getText());
		float AsigColacion = Float.parseFloat(vista.getTxtCol().getText());
		float AsigMovilizacion = Float.parseFloat(vista.getTxtAsiMov().getText());

		float suma = sueBase + HorExtras + BonoGestionMen + Participacion + Comisiones + Gratificacion + CargaAsigFam
				+ AsigColacion + AsigMovilizacion;

		vista.getTxtTotHab().setText("" + suma);

	}

	public void Descuentos() {

		float AFP = Float.parseFloat(vista.getTxtAFP().getText());
		float SeguroCesantia = Float.parseFloat(vista.getTxtSegCes().getText());
		float Salud = Float.parseFloat(vista.getTxtSal().getText());
		float DifIsapre = Float.parseFloat(vista.getTxtDifIsa().getText());
		float ImpuestoUnico = Float.parseFloat(vista.getTxtImpUni().getText());
		float CuotaBienestar = Float.parseFloat(vista.getTxtCuoBie().getText());
		float CuotaAhorroLibreta = Float.parseFloat(vista.getTxtCuoAhoLib().getText());
		float CreditoCCFA = Float.parseFloat(vista.getTxtCCFA().getText());

		float suma = AFP + SeguroCesantia + Salud + DifIsapre + ImpuestoUnico + CuotaBienestar + CuotaAhorroLibreta
				+ CreditoCCFA;

		vista.getTxtTotDes().setText("" + suma);

	}

	public void sumaTotal() {

		float TotalHaber = Float.parseFloat(vista.getTxtTotHab().getText());
		float TotalDescuentos = Float.parseFloat(vista.getTxtTotDes().getText());
		
		float AlcanceLiquido = TotalHaber - TotalDescuentos;
		
		float ValeAnticipo = Float.parseFloat(vista.getTxtValAnt().getText());

		float Total = AlcanceLiquido - ValeAnticipo;

		vista.getTxtAlcLiq().setText("" + AlcanceLiquido);
		vista.getTxtTotSueLiq().setText("" + Total);

	}

	private void calcularTodosLosTotales() {
		sumarHaberes();
		Descuentos();
		sumaTotal();
	}

}
