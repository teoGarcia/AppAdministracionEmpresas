package ui.Texts;


import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class TextRutFormatted extends JFormattedTextField{
	
	public TextRutFormatted() throws ParseException {
		
			MaskFormatter mascara = new MaskFormatter("##.###.###-A");
			this.setFormatter(mascara); //JFormattedTextField(mascara);
			this.setColumns(10);
			this.setBounds(551, 106, 189, 24);
			
	}

}
