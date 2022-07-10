package CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.Imprimir.ImprimirLiquidacion;
import CuartoMedio.GestionDeBodega.Inventario.InventarioEntity;
import CuartoMedio.GestionDeBodega.Inventario.InventarioRepository;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlLiquidacionSueldo implements ActionListener {

	private VistaLiquidacionSueldo vista;
	private LiquidacionSueldoRepository repository;
	private ImprimirLiquidacion il;
	
	public ControlLiquidacionSueldo(VistaLiquidacionSueldo vista) {
		this.repository = new LiquidacionSueldoRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vista.getBtnCalcularHaberes())) {	
			
			sumarHaberes();
			
		}else if(e.getSource().equals(vista.getBtnCalcularDescuentos())) {
			Descuentos();
			
		}else if (e.getSource().equals(vista.getBtnCalcularTotal())) {	
			sumaTotal();
			
		}else if(e.getSource().equals(vista.getBtnImprimir())) {
			il = new ImprimirLiquidacion();
			
		}else if(e.getSource().equals(vista.getBtnGuardar())) {
			
			System.out.println("Guardar");
			
			/*
			 * LiquidacionSueldo liqSul = new LiquidacionSueldo();
			 * 
			 * liqSul.setNomEmpresa(vista.getTxtNomEmpre().getText());
			 * liqSul.setRutEmpresa(vista.getTxtRutEmpre().getText());
			 * 
			 * liqSul.setNomTrabajador(vista.getTxtNomTrab().getText());
			 * liqSul.setRutTrabajador(vista.getTxtRutTrab().getText());
			 * 
			 * liqSul.setYear(vista.getYearChooserPago().getYear());
			 * liqSul.setMon(vista.getMonthChooserPago().getMonth());
			 * 
			 * liqSul.setSueldo(Double.parseDouble(vista.getTxtSueBas().getText()));
			 * liqSul.setHrasExtra(Double.parseDouble(vista.getTxtHorExt().getText()));
			 * liqSul.setBonoGesMen(Double.parseDouble(vista.getTxtBonGesMen().getText()));
			 * liqSul.setParticipacion(Double.parseDouble(vista.getTxtPar().getText()));
			 * liqSul.setComisiones(Double.parseDouble(vista.getTxtCom().getText()));
			 * liqSul.setGratificacion(Double.parseDouble(vista.getTxtGra().getText()));
			 * liqSul.setCargFami(Double.parseDouble(vista.getTxtAsiFam().getText()));
			 * liqSul.setAsigCola(Double.parseDouble(vista.getTxtCol().getText()));
			 * liqSul.setAsigMovi(Double.parseDouble(vista.getTxtAsiMov().getText()));
			 * liqSul.setAfp(Double.parseDouble(vista.getTxtAFP().getText()));
			 * liqSul.setSeguroCesantia(Double.parseDouble(vista.getTxtSegCes().getText()));
			 * liqSul.setSalud(Double.parseDouble(vista.getTxtSal().getText()));
			 * liqSul.setDifIsap(Double.parseDouble(vista.getTxtDifIsa().getText()));
			 * liqSul.setImpUni(Double.parseDouble(vista.getTxtImpUni().getText()));
			 * liqSul.setCuoBie(Double.parseDouble(vista.getTxtCuoBie().getText()));
			 * 
			 * liqSul.setCuoAhorrLibr(Double.parseDouble(vista.getTxtCuoAhoLib().getText()))
			 * ; liqSul.setCredCCFAAra(Double.parseDouble(vista.getTxtCCFA().getText()));
			 * 
			 * liqSul.setSulLiqLetras(Double.parseDouble(vista.getTxtSueLiqLet().getText()))
			 * ;
			 * liqSul.setValesAnticipos(Double.parseDouble(vista.getTxtValAnt().getText()));
			 * 
			 * LiquidacionSueldo db = this.repository.create(liqSul);
			 * 
			 * if(db != null) { Mensajes.Creacion(); vista.ActualizarVista(); }
			 */
		}
			
		// TODO Auto-generated method stub
		
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
		
		float suma = sueBase+HorExtras+BonoGestionMen+Participacion+Comisiones+Gratificacion+CargaAsigFam+AsigColacion+AsigMovilizacion;
		
		vista.getTxtTotHab().setText(""+suma);

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
		
		float suma = AFP+SeguroCesantia+Salud+DifIsapre+ImpuestoUnico+CuotaBienestar+CuotaAhorroLibreta+CreditoCCFA;
		
		vista.getTxtTotDes().setText(""+suma);

	}
	
	public void sumaTotal() {
		
		float TotalHaber = Float.parseFloat(vista.getTxtTotHab().getText());
		float TotalDescuentos = Float.parseFloat(vista.getTxtTotDes().getText());
		float AlcanceLiquido = TotalHaber - TotalDescuentos;
		float ValeAnticipo = Float.parseFloat(vista.getTxtValAnt().getText());
		
		float Total = AlcanceLiquido - ValeAnticipo;
		
		vista.getTxtAlcLiq().setText(""+AlcanceLiquido);
		vista.getTxtTotSueLiq().setText(""+Total);
		
	}

}
