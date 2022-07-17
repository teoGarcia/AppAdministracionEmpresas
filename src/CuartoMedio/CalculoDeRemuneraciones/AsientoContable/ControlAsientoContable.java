package CuartoMedio.CalculoDeRemuneraciones.AsientoContable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
				System.out.println("Guardar Asiento Contable");
				
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
				
				
				AsientoContable db = this.repository.create(record);
				
				if(db != null) {
					Mensajes.Creacion();
					vista.vaciarFormulario();
				}
			}else {
				Mensajes.CamposVacios();
			}
			
		}
	}

	public void llenarTabla() {
		
	}

}
