package CuartoMedio.LegislacionLaboral.Contratos.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import CuartoMedio.LegislacionLaboral.Contratos.Vista.VistaContratoIndefinido;
import CuartoMedio.LegislacionLaboral.Contratos.Vista.VistaContratoPlazoFijo;

public class ControladorContratoPlazoFijo implements ActionListener {
	
	private VistaContratoPlazoFijo vcpf;
	private String Imagenes[] = new String[2];
	private int TotalImagenes = Imagenes.length;
	private int total = 0;

	public ControladorContratoPlazoFijo(VistaContratoPlazoFijo vcpf) {
		this.vcpf = vcpf;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		if(ev.getSource().equals(vcpf.getBtnFlechaDerecha())) {
			CambiarImagenHaciaDerecha();
			
		}else if(ev.getSource().equals(vcpf.getBtnFlechaIzquierda())) {
			CambiarImagenHaciaIzquierda();
			
		}
		// TODO Auto-generated method stub
		
	}
	
public void CambiarImagenHaciaDerecha() {
		
		Imagenes[0] = "/Imagenes/MODELO DE CONTRATO PLAZO FIJO_00001.jpg";
		Imagenes[1] = "/Imagenes/MODELO DE CONTRATO PLAZO FIJO_00002.jpg";
			
			if(total < TotalImagenes-1) {
				
				total++;
				vcpf.getLblImagenes().setIcon(new ImageIcon(VistaContratoIndefinido.class.getResource(Imagenes[total])));
				
				
			}else {
				total=0;
				vcpf.getLblImagenes().setIcon(new ImageIcon(VistaContratoIndefinido.class.getResource(Imagenes[total])));
			}
		
	}
	
	public void CambiarImagenHaciaIzquierda() {
		
		Imagenes[0] = "/Imagenes/MODELO DE CONTRATO PLAZO FIJO_00001.jpg";
		Imagenes[1] = "/Imagenes/MODELO DE CONTRATO PLAZO FIJO_00002.jpg";
			
			if(total >= TotalImagenes-1) {
				total--;
				System.out.println("hola"+ TotalImagenes);
				System.out.println("hola"+ total);
				vcpf.getLblImagenes().setIcon(new ImageIcon(VistaContratoIndefinido.class.getResource(Imagenes[total])));
				
				
			}else if(total<=0){
				System.out.println("hola");
				total=1;
				vcpf.getLblImagenes().setIcon(new ImageIcon(VistaContratoIndefinido.class.getResource(Imagenes[total])));

			}
		
	}

}
