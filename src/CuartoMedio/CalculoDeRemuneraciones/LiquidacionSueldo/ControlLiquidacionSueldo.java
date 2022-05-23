package CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ControlLiquidacionSueldo extends ModeloLiquidacionSueldo implements ActionListener {

	private VistaLiquidacionSueldo vls;
	
	public ControlLiquidacionSueldo(VistaLiquidacionSueldo vls) {
		this.vls = vls;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vls.getBtnCalcularHaberes())) {
			
			sumarHaberes();
			
		}else if(e.getSource().equals(vls.getBtnCalcularDescuentos())) {
			
			Descuentos();
			
		}
		// TODO Auto-generated method stub
		
	}
	
	public void sumarHaberes() {
		
		float sueBase = Float.parseFloat(vls.getTxtSueBas().getText());
		float HorExtras = Float.parseFloat(vls.getTxtHorExt().getText());
		float BonoGestionMen = Float.parseFloat(vls.getTxtBonGesMen().getText());
		float Participacion = Float.parseFloat(vls.getTxtPar().getText());
		float Comisiones = Float.parseFloat(vls.getTxtCom().getText());
		float Gratificacion = Float.parseFloat(vls.getTxtGra().getText());
		float CargaAsigFam = Float.parseFloat(vls.getTxtAsiFam().getText());
		float AsigColacion = Float.parseFloat(vls.getTxtCol().getText());
		float AsigMovilizacion = Float.parseFloat(vls.getTxtAsiMov().getText());
		
		float suma = sueBase+HorExtras+BonoGestionMen+Participacion+Comisiones+Gratificacion+CargaAsigFam+AsigColacion+AsigMovilizacion;
		
		vls.getTxtTotHab().setText(""+suma);

	}
	
	public void Descuentos() {
		
		float AFP = Float.parseFloat(vls.getTxtAFP().getText());
		float SeguroCesantia = Float.parseFloat(vls.getTxtSegCes().getText());
		float Salud = Float.parseFloat(vls.getTxtSal().getText());
		float DifIsapre = Float.parseFloat(vls.getTxtDifIsa().getText());
		float ImpuestoUnico = Float.parseFloat(vls.getTxtImpUni().getText());
		float CuotaBienestar = Float.parseFloat(vls.getTxtCuoBie().getText());
		float CuotaAhorroLibreta = Float.parseFloat(vls.getTxtCuoAhoLib().getText());
		float CreditoCCFA = Float.parseFloat(vls.getTxtCCFA().getText());
		
		float suma = AFP+SeguroCesantia+Salud+DifIsapre+ImpuestoUnico+CuotaBienestar+CuotaAhorroLibreta+CreditoCCFA;
		
		vls.getTxtTotDes().setText(""+suma);

	}

}
