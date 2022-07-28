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

				record.setSueldo(Integer.parseInt(vista.getTxtSueBas().getText()));
				record.setHrasExtra(Integer.parseInt(vista.getTxtHorExt().getText()));
				record.setBonoGesMen(Integer.parseInt(vista.getTxtBonGesMen().getText()));
				record.setParticipacion(Integer.parseInt(vista.getTxtPar().getText()));
				record.setComisiones(Integer.parseInt(vista.getTxtCom().getText()));
				record.setGratificacion(Integer.parseInt(vista.getTxtGra().getText()));
				record.setCargFami(Integer.parseInt(vista.getTxtAsiFam().getText()));
				record.setAsigCola(Integer.parseInt(vista.getTxtCol().getText()));
				record.setAsigMovi(Integer.parseInt(vista.getTxtAsiMov().getText()));
				record.setAfp(Integer.parseInt(vista.getTxtAFP().getText()));
				record.setSeguroCesantia(Integer.parseInt(vista.getTxtSegCes().getText()));
				record.setSalud(Integer.parseInt(vista.getTxtSal().getText()));
				record.setDifIsap(Integer.parseInt(vista.getTxtDifIsa().getText()));
				record.setImpUni(Integer.parseInt(vista.getTxtImpUni().getText()));
				record.setCuoBie(Integer.parseInt(vista.getTxtCuoBie().getText()));
				record.setCuoAhorrLibr(Integer.parseInt(vista.getTxtCuoAhoLib().getText()));
				record.setCredCCFAAra(Integer.parseInt(vista.getTxtCCFA().getText()));
				record.setSulLiqLetras(vista.getTxtSueLiqLet().getText());
				record.setValesAnticipos(Integer.parseInt(vista.getTxtValAnt().getText()));

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
			if(id != null) {
				LiquidacionSueldo record = repository.find(id);
				vista.cargarForm(record);
				calcularTodosLosTotales();
			}
			
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
					.addRow(new Object[] { 
							records.getId(),
							records.getRutTrabajador(), 
							records.getNomTrabajador(),
							records.getRutEmpresa(), 
							records.getNomEmpresa(), 
							records.getSueldo() 
						});
		}

	}

	public void sumarHaberes() {

		int sueBase = Integer.parseInt(vista.getTxtSueBas().getText());
		int HorExtras = Integer.parseInt(vista.getTxtHorExt().getText());
		int BonoGestionMen = Integer.parseInt(vista.getTxtBonGesMen().getText());
		int Participacion = Integer.parseInt(vista.getTxtPar().getText());
		int Comisiones = Integer.parseInt(vista.getTxtCom().getText());
		int Gratificacion = Integer.parseInt(vista.getTxtGra().getText());
		int CargaAsigFam = Integer.parseInt(vista.getTxtAsiFam().getText());
		int AsigColacion = Integer.parseInt(vista.getTxtCol().getText());
		int AsigMovilizacion = Integer.parseInt(vista.getTxtAsiMov().getText());

		int suma = sueBase + HorExtras + BonoGestionMen + Participacion + Comisiones + Gratificacion + CargaAsigFam
				+ AsigColacion + AsigMovilizacion;

		vista.getTxtTotHab().setText("" + suma);

	}

	public void Descuentos() {

		int AFP = Integer.parseInt(vista.getTxtAFP().getText());
		int SeguroCesantia = Integer.parseInt(vista.getTxtSegCes().getText());
		int Salud = Integer.parseInt(vista.getTxtSal().getText());
		int DifIsapre = Integer.parseInt(vista.getTxtDifIsa().getText());
		int ImpuestoUnico = Integer.parseInt(vista.getTxtImpUni().getText());
		int CuotaBienestar = Integer.parseInt(vista.getTxtCuoBie().getText());
		int CuotaAhorroLibreta = Integer.parseInt(vista.getTxtCuoAhoLib().getText());
		int CreditoCCFA = Integer.parseInt(vista.getTxtCCFA().getText());

		int suma = AFP + SeguroCesantia + Salud + DifIsapre + ImpuestoUnico + CuotaBienestar + CuotaAhorroLibreta
				+ CreditoCCFA;

		vista.getTxtTotDes().setText("" + suma);

	}

	public void sumaTotal() {

		int TotalHaber = Integer.parseInt(vista.getTxtTotHab().getText());
		int TotalDescuentos = Integer.parseInt(vista.getTxtTotDes().getText());
		
		int AlcanceLiquido = TotalHaber - TotalDescuentos;
		
		int ValeAnticipo = Integer.parseInt(vista.getTxtValAnt().getText());

		int Total = AlcanceLiquido - ValeAnticipo;

		vista.getTxtAlcLiq().setText("" + AlcanceLiquido);
		vista.getTxtTotSueLiq().setText("" + Total);

	}

	private void calcularTodosLosTotales() {
		sumarHaberes();
		Descuentos();
		sumaTotal();
	}

}
