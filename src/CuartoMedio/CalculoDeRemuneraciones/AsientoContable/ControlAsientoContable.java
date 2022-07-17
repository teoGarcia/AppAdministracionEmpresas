package CuartoMedio.CalculoDeRemuneraciones.AsientoContable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.LiquidacionSueldo;
import CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.Imprimir.ImprimirLiquidacion;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlAsientoContable implements ActionListener  {

	private VistaAsientoContable vista;
	private AsientoContableRepository repository;
	private ImprimirLiquidacion il;
	
	public ControlAsientoContable(VistaAsientoContable vista) {
		this.repository = new AsientoContableRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vista.getBtnGuardar())) {
			
			if(vista.camposVacios()) {
				
				AsientoContable record = new AsientoContable();
				
				record.setNomEmple(vista.getTxtNomEmp().getText());
				record.setRut(vista.getTxtRut().getText());
				record.setCargo(vista.getTxtCargo().getText());
				record.setFechaEntrega(vista.getFechaEntrega().getJCalendar());
				
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
					System.out.println("guarda");
					AsientoContable db = this.repository.create(record);
					
					if (db != null) {
						Mensajes.Creacion();
						vista.actualizarVista();
					}
					
					// actualiza
				}else {
					System.out.println("actualiza");
					record.setId(vista.getId());
					AsientoContable db = this.repository.update(record);
					if (db != null) {
						Mensajes.Actualizacion();
						vista.actualizarVista();
					}
				}
				
			}else {
				Mensajes.CamposVacios();
			}
			
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
		}else if(e.getSource().equals(vista.getBtnEliminar())) {
			Long id  = getRow();
			if(id != null) {
				AsientoContable record = repository.find(id);
				repository.delete(record);
				vista.actualizarVista();
			}
		}
	}

	public void llenarTabla() {
		
	}
	
	public Long getRow() {
		int row = vista.getTable().getSelectedRow();
		if(row >= 0) {
			Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
			return id;
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			return null;
		}
		
	}

}
