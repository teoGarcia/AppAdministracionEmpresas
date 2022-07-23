package CuartoMedio.CalculoDeRemuneraciones.AsientoContable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.CalculoDeRemuneraciones.AsientoContable.Imprimir.ImprimirPanel;
import CuartoMedio.CalculoDeRemuneraciones.AsientoContable.Imprimir.VistaImprimir;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlAsientoContable implements ActionListener {

	private VistaAsientoContable vista;
	private AsientoContableRepository repository;
	private ImprimirPanel panelI;
	private VistaImprimir imprimir;

	public ControlAsientoContable(VistaAsientoContable vista) {
		this.repository = new AsientoContableRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(vista.getBtnGuardar())) {

			if (vista.camposVacios()) { // vista.camposVacios()

				AsientoContable record = new AsientoContable();

				record.setNomEmple(vista.getTxtNomEmp().getText());
				record.setRut(vista.getTxtRut().getText());
				record.setCargo(vista.getTxtCargo().getText());
				record.setFecha(vista.getFechaEntrega().getCalendar());

				/// debe

				record.setSueldo(Double.parseDouble(vista.getTxtSue().getText()));
				record.setGratificaciones(Double.parseDouble(vista.getTxtGra().getText()));
				record.sethExtra(Double.parseDouble(vista.getTxtHorExt().getText()));
				record.setComisones(Double.parseDouble(vista.getTxtCom().getText()));
				record.setBonus(Double.parseDouble(vista.getTxtBon().getText()));
				record.setMovili(Double.parseDouble(vista.getTxtMov().getText()));
				record.setColacion(Double.parseDouble(vista.getTxtCol().getText()));
				record.setViaticos(Double.parseDouble(vista.getTxtVia().getText()));
				record.setAsigfami(Double.parseDouble(vista.getTxtAsiFam().getText()));

				// haber

				record.setAfp(Double.parseDouble(vista.getTxtAFP().getText()));
				record.setFonasa(Double.parseDouble(vista.getTxtFonasa().getText()));
				record.setIsapre(Double.parseDouble(vista.getTxtIsa().getText()));
				record.setDifIsapre(Double.parseDouble(vista.getTxtDifIsa().getText()));
				record.setSegSesan(Double.parseDouble(vista.getTxtSegCes().getText()));
				record.setImpUni(Double.parseDouble(vista.getTxtImpUni().getText()));
				record.setCuotSind(Double.parseDouble(vista.getTxtCuoSin().getText()));
				record.setCuotBiene(Double.parseDouble(vista.getTxtCuoBie().getText()));
				record.setAntSuel(Double.parseDouble(vista.getTxtAntSue().getText()));

				// remuneraciones
				record.setSulpagRem(Double.parseDouble(vista.getTxtSulPagoRemun().getText()));
				record.setCajaBancoRem(Double.parseDouble(vista.getTxtCajaBanRemu().getText()));
				record.setGlosaRem(Double.parseDouble(vista.getTxtGlosaRemu().getText()));

				// patronal
				record.setSulpagPatro(Double.parseDouble(vista.getTxtAportePatronal().getText()));
				record.setCajaBancoPatro(Double.parseDouble(vista.getTxtCajaBancoAportePatronal().getText()));
				record.setGlosaPatro(Double.parseDouble(vista.getTxtGlosaAportePatronal().getText()));

				// guarda
				if (vista.getId() <= 0 && vista.getId() != null) {
					AsientoContable db = this.repository.create(record);

					if (db != null) {
						Mensajes.Creacion();
						vista.actualizarVista();
					}

					// actualiza
				} else {
					record.setId(vista.getId());
					AsientoContable db = this.repository.update(record);
					if (db != null) {
						Mensajes.Actualizacion();
						vista.actualizarVista();
					}
				}

			} else {
				Mensajes.CamposVacios();
			}

		} else if (e.getSource().equals(vista.getBtnDebe())) {
			
			sumarDebe();
			
		} else if (e.getSource().equals(vista.getBtnHaber())) {
			
			sumarHaber();
			
		} else if (e.getSource().equals(vista.getBtnModificar())) {
			Long id = getRow();
			if (id >= 0) {
				AsientoContable record = repository.find(id);
				vista.cargarForm(record);
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
				AsientoContable record = repository.find(id);
				repository.delete(record);
				vista.actualizarVista();
			}
		}  else if(e.getSource().equals(vista.getBtnVerTodosLos())) {
			
			Long id = getRow();
			if(id != null) {
				AsientoContable record = repository.find(id);
				vista.cargarForm(record);
				calcularTodosLosTotales();
			}
		} else if(e.getSource().equals(vista.getBtnImprimir())) {
			
			Long id = getRow();
			if(id != null) {
				if(imprimir == null) imprimir = new VistaImprimir();
				
				AsientoContable record = repository.find(id);
				
				panelI = imprimir.getPanel();
				panelI.cargarForm(record);
				imprimir.setVisible(true);
			}
		}
	}
	
	public void calcularTodosLosTotales() {
		sumarDebe();
		sumarHaber();
	}
	
	public void sumarDebe() {

		try {
			double sueBase = Double.parseDouble(vista.getTxtSue().getText());
			double grati = Double.parseDouble(vista.getTxtGra().getText());
			double horExtras = Double.parseDouble(vista.getTxtHorExt().getText());
			double comisiones = Double.parseDouble(vista.getTxtCom().getText());
			double bonus = Double.parseDouble(vista.getTxtBon().getText());
			double movilizacion = Double.parseDouble(vista.getTxtMov().getText());
			double colacion = Double.parseDouble(vista.getTxtCol().getText());
			double viaticos = Double.parseDouble(vista.getTxtVia().getText());
			double asigFamiliar= Double.parseDouble(vista.getTxtAsiFam().getText());

			double suma = sueBase + grati + horExtras + comisiones + bonus + movilizacion + colacion
					+ viaticos + asigFamiliar;
			
			vista.getTxtTotDeb().setText("" + suma);
		} catch (Exception e) {
			
		}
		
		


	}
	
	public void sumarHaber() {

		try {
			double afp = Double.parseDouble(vista.getTxtAFP().getText());
			double fonasa = Double.parseDouble(vista.getTxtFonasa().getText());
			double isapre = Double.parseDouble(vista.getTxtIsa().getText());
			double difIsapre = Double.parseDouble(vista.getTxtDifIsa().getText());
			double segCesan = Double.parseDouble(vista.getTxtSegCes().getText());
			double impUnico = Double.parseDouble(vista.getTxtImpUni().getText());
			double cuotaSind = Double.parseDouble(vista.getTxtCuoSin().getText());
			double cuotaBie = Double.parseDouble(vista.getTxtCuoBie().getText());
			double antSuel= Double.parseDouble(vista.getTxtAntSue().getText());

			double suma = afp + fonasa + isapre + difIsapre + segCesan + impUnico + cuotaSind
					+ cuotaBie + antSuel;
			
			vista.getTxtTotHab().setText("" + suma);
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

	public void llenarTabla() {

		Iterator<AsientoContable> lista = this.repository.findAll().iterator();
		this.vista.getModel().getDataVector().removeAllElements();
		this.vista.getModel().fireTableDataChanged();

		while (lista.hasNext()) {
			AsientoContable records = lista.next();
			this.vista.getModel().addRow(new Object[] { records.getId(), records.getRut(), records.getNomEmple(),
					records.getCargo(), Helpers.getFechaFormat(records.getFecha()), records.getSueldo() });
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
