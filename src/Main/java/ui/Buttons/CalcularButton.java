package main.java.ui.Buttons;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import main.java.CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.VistaLiquidacionSueldo;

public class CalcularButton extends JButton {
	
	public CalcularButton() {
		
		this.setBorder(null);
		this.setBackground(new Color(56,56,56));
		this.setForeground(Color.WHITE);
		this.setIcon(new ImageIcon(VistaLiquidacionSueldo.class.getResource("/Imagenes/Icons/calcular.png")));
		this.setBounds(0, 0, 33, 33);
		
	}

}
