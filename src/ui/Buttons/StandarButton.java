package ui.Buttons;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class StandarButton extends JButton {
	
	public StandarButton(String text) {
		super(text);
		this.setBounds(0, 0, 85, 32);
		this.setBackground(new Color(135, 130, 135));
		this.setFont(new Font("Dialog", Font.BOLD, 12));
		this.setForeground(Color.WHITE);
		
		
	}

}
