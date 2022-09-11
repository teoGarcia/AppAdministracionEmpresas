package TerceroMedio.UtilizacionDeLaInformacionContable.BalanceGeneral;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VistaBalanceGeneral extends JPanel {

	public VistaBalanceGeneral() {
		JLabel lblNewLabel = new JLabel("VistaBalanceGeneral");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 34, 722, 48);
		add(lblNewLabel);
	}
	
}
