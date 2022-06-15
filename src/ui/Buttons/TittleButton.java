package ui.Buttons;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class TittleButton extends JButton {
	
	public TittleButton(String texto) {
		super(texto);
		
		setFont(new Font("Dialog", Font.BOLD, 16));
		setBackground(new Color(54, 54, 54));
		setForeground(Color.WHITE);
		
	}

}
