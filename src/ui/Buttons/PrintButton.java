package ui.Buttons;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.Imprimir.VistaImprimir;

public class PrintButton extends JButton{
	
	public PrintButton() {
		
		setBackground(Color.WHITE);
		setText("");
		setIcon(new ImageIcon(VistaImprimir.class.getResource("/Imagenes/Icons/impresora.png")));
		setBounds(0, 0, 40, 40);
		
	}

}
