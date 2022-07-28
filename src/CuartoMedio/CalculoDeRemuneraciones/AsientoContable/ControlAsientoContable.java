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

				record.setSueldo(Integer.parseInt(vista.getTxtSue().getText()));
				record.setGratificaciones(Integer.parseInt(vista.getTxtGra().getText()));
				record.sethExtra(Integer.parseInt(vista.getTxtHorExt().getText()));
				record.setComisones(Integer.parseInt(vista.getTxtCom().getText()));
				record.setBonus(Integer.parseInt(vista.getTxtBon().getText()));
				record.setMovili(Integer.parseInt(vista.getTxtMov().getText()));
				record.setColacion(Integer.parseInt(vista.getTxtCol().getText()));
				record.setViaticos(Integer.parseInt(vista.getTxtVia().getText()));
				record.setAsigfami(Integer.parseInt(vista.getTxtAsiFam().getText()));

				// haber

				record.setAfp(Integer.parseInt(vista.getTxtAFP().getText()));
				record.setFonasa(Integer.parseInt(vista.getTxtFonasa().getText()));
				record.setIsapre(Integer.parseInt(vista.getTxtIsa().getText()));
				record.setDifIsapre(Integer.parseInt(vista.getTxtDifIsa().getText()));
				record.setSegSesan(Integer.parseInt(vista.getTxtSegCes().getText()));
				record.setImpUni(Integer.parseInt(vista.getTxtImpUni().getText()));
				record.setCuotSind(Integer.parseInt(vista.getTxtCuoSin().getText()));
				record.setCuotBiene(Integer.parseInt(vista.getTxtCuoBie().getText()));
				record.setAntSuel(Integer.parseInt(vista.getTxtAntSue().getText()));

				// remuneraciones
				record.setSulpagRem(Integer.parseInt(vista.getTxtSulPagoRemun().getText()));
				record.setCajaBancoRem(vista.getTxtCajaBanRemu().getText());
				record.setGlosaRem(vista.getTxtGlosaRemu().getText());

				// patronal
				record.setSulpagPatro(Integer.parseInt(vista.getTxtAportePatronal().getText()));
				record.setCajaBancoPatro(vista.getTxtCajaBancoAportePatronal().getText());
				record.setGlosaPatro(vista.getTxtGlosaAportePatronal().getText());

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
			int sueBase = Integer.parseInt(vista.getTxtSue().getText());
			int grati = Integer.parseInt(vista.getTxtGra().getText());
			int horExtras = Integer.parseInt(vista.getTxtHorExt().getText());
			int comisiones = Integer.parseInt(vista.getTxtCom().getText());
			int bonus = Integer.parseInt(vista.getTxtBon().getText());
			int movilizacion = Integer.parseInt(vista.getTxtMov().getText());
			int colacion = Integer.parseInt(vista.getTxtCol().getText());
			int viaticos = Integer.parseInt(vista.getTxtVia().getText());
			int asigFamiliar= Integer.parseInt(vista.getTxtAsiFam().getText());

			int suma = sueBase + grati + horExtras + comisiones + bonus + movilizacion + colacion
					+ viaticos + asigFamiliar;
			
			vista.getTxtTotDeb().setText("" + suma);
		} catch (Exception e) {
			
		}
		
		


	}
	
	public void sumarHaber() {

		try {
			int afp = Integer.parseInt(vista.getTxtAFP().getText());
			int fonasa = Integer.parseInt(vista.getTxtFonasa().getText());
			int isapre = Integer.parseInt(vista.getTxtIsa().getText());
			int difIsapre = Integer.parseInt(vista.getTxtDifIsa().getText());
			int segCesan = Integer.parseInt(vista.getTxtSegCes().getText());
			int impUnico = Integer.parseInt(vista.getTxtImpUni().getText());
			int cuotaSind = Integer.parseInt(vista.getTxtCuoSin().getText());
			int cuotaBie = Integer.parseInt(vista.getTxtCuoBie().getText());
			int antSuel= Integer.parseInt(vista.getTxtAntSue().getText());

			int suma = afp + fonasa + isapre + difIsapre + segCesan + impUnico + cuotaSind
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
