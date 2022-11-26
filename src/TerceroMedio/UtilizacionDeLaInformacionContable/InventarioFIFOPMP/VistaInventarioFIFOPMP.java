package TerceroMedio.UtilizacionDeLaInformacionContable.InventarioFIFOPMP;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VistaInventarioFIFOPMP extends JPanel {

	
	public VistaInventarioFIFOPMP() {
		JLabel lblNewLabel = new JLabel("InventarioFIFOPMP");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 34, 722, 48);
		add(lblNewLabel);
	}
}
