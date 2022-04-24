package TerceroMedio.Menu;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class VistaMenu3Medio extends JPanel {
	

	public VistaMenu3Medio() {
		inicialize();
	}
	
	public void inicialize() {
		setBounds(0, 0, 790, 729);
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("3ro medio");
		add(lblNewLabel);
	}
	
}
