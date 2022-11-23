package CuartoMedio.DesarolloBienestar.EvaluacionDesempeno;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Buttons.StandarButton;
import java.awt.Color;
import ui.Buttons.TittleButton;

<<<<<<< HEAD:src/CuartoMedio/DesarolloBienestar/EvaluacionDesempeno/VistaEvaluacionDesempenio.java
public class VistaEvaluacionDesempenio extends JPanel {
=======
public class VistaEvaluacionDesempeño extends JPanel {
>>>>>>> 990048b365f10e53aa46d08d6df6a0e2ec51a741:src/CuartoMedio/DesarolloBienestar/EvaluacionDesempeno/VistaEvaluacionDesempeño.java
	
	private ControlEvaluacionDesempeno ced;
	private TittleButton stndrbtnVerDocumento;

	/**
	 * Create the panel.
	 */
<<<<<<< HEAD:src/CuartoMedio/DesarolloBienestar/EvaluacionDesempeno/VistaEvaluacionDesempenio.java
	public VistaEvaluacionDesempenio() {
=======
	public VistaEvaluacionDesempeño() {
>>>>>>> 990048b365f10e53aa46d08d6df6a0e2ec51a741:src/CuartoMedio/DesarolloBienestar/EvaluacionDesempeno/VistaEvaluacionDesempeño.java
		
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
