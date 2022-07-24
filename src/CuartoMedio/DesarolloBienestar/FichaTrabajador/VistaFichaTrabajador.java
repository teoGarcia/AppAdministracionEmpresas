package CuartoMedio.DesarolloBienestar.FichaTrabajador;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import ui.Buttons.StandarButton;
import ui.Buttons.TittleButton;

public class VistaFichaTrabajador extends JPanel {
	
	private ControlFichaTrabajador cft;
	private TittleButton stndrbtnVerDocumento;

	/**
	 * Create the panel.
	 */
	public VistaFichaTrabajador() {
		
		cft = new ControlFichaTrabajador(this);
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ficha de Trabajador");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 53, 774, 30);
		add(lblNewLabel);
		
		stndrbtnVerDocumento = new TittleButton("Ver Documento");
		stndrbtnVerDocumento.setBounds(194, 344, 400, 120);
		add(stndrbtnVerDocumento);

	}

	public TittleButton getStndrbtnVerDocumento() {
		return stndrbtnVerDocumento;
	}

	public void setStndrbtnVerDocumento(TittleButton stndrbtnVerDocumento) {
		this.stndrbtnVerDocumento = stndrbtnVerDocumento;
	}

	
}
