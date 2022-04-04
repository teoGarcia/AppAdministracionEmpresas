package CuartoMedio.LegislacionLaboral.Contratos.Controlador;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import CuartoMedio.LegislacionLaboral.Contratos.Vista.VistaContratoIndefinido;

public class ControladorContratoIndefinido implements ActionListener {
	
	private VistaContratoIndefinido vci;
	private String Imagenes[] = new String[4];
	private int TotalImagenes = Imagenes.length;
	private int total = 0;

	public ControladorContratoIndefinido(VistaContratoIndefinido vci) {
		this.vci = vci;
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		if(ev.getSource().equals(vci.getBtnFlechaDerecha())){
			
			CambiarImagenHaciaDerecha();
			
		}else if(ev.getSource().equals(vci.getBtnFlechaIzquierda())) {

			CambiarImagenHaciaIzquierda();
		}
		// TODO Auto-generated method stub
		
	}
	
	
	public void CambiarImagenHaciaDerecha() {
		
		Imagenes[0] = "/Imagenes/MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1_00001.jpg";
		Imagenes[1] = "/Imagenes/MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1_00002.jpg";
		Imagenes[2] = "/Imagenes/MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1_00003.jpg";
		Imagenes[3] = "/Imagenes/MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1_00004.jpg";
			
			if(total < TotalImagenes-1) {
				
				total++;
				vci.getLblImagenes().setIcon(new ImageIcon(VistaContratoIndefinido.class.getResource(Imagenes[total])));
				
				
			}else {
				total=0;
				vci.getLblImagenes().setIcon(new ImageIcon(VistaContratoIndefinido.class.getResource(Imagenes[total])));
			}
		
	}
	
	public void CambiarImagenHaciaIzquierda() {
		
		Imagenes[0] = "/Imagenes/MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1_00001.jpg";
		Imagenes[1] = "/Imagenes/MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1_00002.jpg";
		Imagenes[2] = "/Imagenes/MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1_00003.jpg";
		Imagenes[3] = "/Imagenes/MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1_00004.jpg";
			
			if(total >= TotalImagenes-3) {
				total--;
				System.out.println("hola"+ TotalImagenes);
				System.out.println("hola"+ total);
				vci.getLblImagenes().setIcon(new ImageIcon(VistaContratoIndefinido.class.getResource(Imagenes[total])));
				
				
			}else if(total<=0){
				System.out.println("hola");
				total=3;
				vci.getLblImagenes().setIcon(new ImageIcon(VistaContratoIndefinido.class.getResource(Imagenes[total])));

			}
		
	}

}
