package CuartoMedio.DesarolloBienestar.EvaluacionDesempeno;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Buttons.StandarButton;
import java.awt.Color;

public class VistaEvaluacionDesempeño extends JPanel {
	
	private ControlEvaluacionDesempeno ced;
	private StandarButton stndrbtnVerDocumento;

	/**
	 * Create the panel.
	 */
	public VistaEvaluacionDesempeño() {
		
		ced = new ControlEvaluacionDesempeno(this);
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Evaluacion de Desempe\u00F1o");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 60, 774, 30);
		add(lblNewLabel);
		
		stndrbtnVerDocumento = new StandarButton("Ver Documento");
		stndrbtnVerDocumento.setBounds(552, 645, 137, 30);
		stndrbtnVerDocumento.addActionListener(ced);
		add(stndrbtnVerDocumento);

	}

	public StandarButton getStndrbtnVerDocumento() {
		return stndrbtnVerDocumento;
	}

	public void setStndrbtnVerDocumento(StandarButton stndrbtnVerDocumento) {
		this.stndrbtnVerDocumento = stndrbtnVerDocumento;
	}
}
