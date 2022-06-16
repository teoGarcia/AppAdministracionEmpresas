package ui.Labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class LabelTitulos extends JLabel {

	public LabelTitulos(String text) {
		
		super(text);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Dialog", Font.BOLD, 18));
		
	}

}
