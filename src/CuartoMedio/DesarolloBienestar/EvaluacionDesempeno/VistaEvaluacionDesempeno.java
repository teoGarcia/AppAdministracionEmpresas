package CuartoMedio.DesarolloBienestar.EvaluacionDesempeno;

import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Buttons.StandarButton;
import java.awt.Color;
import ui.Buttons.TittleButton;

public class VistaEvaluacionDesempeno extends JPanel {

	
	private ControlEvaluacionDesempeno ced;
	private TittleButton stndrbtnVerDocumento;

	/**
	 * Create the panel.
	 */
	
	public VistaEvaluacionDesempeno() {
		
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
		
		stndrbtnVerDocumento = new TittleButton("Ver Documento");
		stndrbtnVerDocumento.setBounds(194, 344, 400, 120);
		stndrbtnVerDocumento.addActionListener(ced);
		add(stndrbtnVerDocumento);

	}

	public TittleButton getStndrbtnVerDocumento() {
		return stndrbtnVerDocumento;
	}

	public void setStndrbtnVerDocumento(TittleButton stndrbtnVerDocumento) {
		this.stndrbtnVerDocumento = stndrbtnVerDocumento;
	}
}
