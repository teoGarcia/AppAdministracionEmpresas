package CuartoMedio.DotacionPersonal.SeleccionPersonal;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class VistaSeleccionPersonal extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public VistaSeleccionPersonal() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 731);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reclutamiento de personal operativo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 40, 774, 38);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(183, 111, 546, 20);
		add(textField);
		textField.setColumns(10);

	}
}
