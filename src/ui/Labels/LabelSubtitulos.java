package ui.Labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class LabelSubtitulos extends JLabel {

	public LabelSubtitulos(String text) {
		
		super(text);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Dialog", Font.BOLD, 12));
		
	}
}
