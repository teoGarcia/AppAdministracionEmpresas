package CuartoMedio.LegislacionLaboral.Contratos.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import CuartoMedio.LegislacionLaboral.Contratos.Vista.VistaContratoHonorarios;
import CuartoMedio.LegislacionLaboral.Contratos.Vista.VistaContratoIndefinido;

public class ControladorContratoHonorarios implements ActionListener {
	
	private VistaContratoHonorarios vch;
	private String Imagenes[] = new String[3];
	private int TotalImagenes = Imagenes.length;
	private int total = 0;

	public ControladorContratoHonorarios(VistaContratoHonorarios vch) {
		this.vch = vch;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource().equals(vch.getBtnFlechaDerecha())){
			
			CambiarImagenHaciaDerecha();
			
		}else if(ev.getSource().equals(vch.getBtnFlechaIzquierda())) {

			CambiarImagenHaciaIzquierda();
		}
		
	}
	
public void CambiarImagenHaciaDerecha() {
		
		Imagenes[0] = "/Imagenes/MODELO DE CONTRATO HONORARIO_00001.jpg";
		Imagenes[1] = "/Imagenes/MODELO DE CONTRATO HONORARIO_00002.jpg";
		Imagenes[2] = "/Imagenes/MODELO DE CONTRATO HONORARIO_00003.jpg";
			
			if(total < TotalImagenes-1) {
				
				total++;
				vch.getLblImagenes().setIcon(new ImageIcon(VistaContratoIndefinido.class.getResource(Imagenes[total])));
				
				
			}else {
				total=0;
				vch.getLblImagenes().setIcon(new ImageIcon(VistaContratoIndefinido.class.getResource(Imagenes[total])));
			}
		
	}
	
	public void CambiarImagenHaciaIzquierda() {
		
		Imagenes[0] = "/Imagenes/MODELO DE CONTRATO HONORARIO_00001.jpg";
		Imagenes[1] = "/Imagenes/MODELO DE CONTRATO HONORARIO_00002.jpg";
		Imagenes[2] = "/Imagenes/MODELO DE CONTRATO HONORARIO_00003.jpg";
		
			
			if(total >= TotalImagenes-2) {
				total--;
				vch.getLblImagenes().setIcon(new ImageIcon(VistaContratoIndefinido.class.getResource(Imagenes[total])));
				
				
			}else if(total<=0){
				total=2;
				vch.getLblImagenes().setIcon(new ImageIcon(VistaContratoIndefinido.class.getResource(Imagenes[total])));

			}
		
	}
	

}
