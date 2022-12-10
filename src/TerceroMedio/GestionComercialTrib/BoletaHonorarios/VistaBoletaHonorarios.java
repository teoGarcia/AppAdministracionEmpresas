package TerceroMedio.GestionComercialTrib.BoletaHonorarios;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import TerceroMedio.GestionComercialTrib.Formulario22.ControlFormulario;
import ui.Buttons.TittleButton;

public class VistaBoletaHonorarios extends JPanel {

	private TittleButton stndrbtnVerDocumento;
	//private ControlB
	/**
	 * Create the panel.
	 */
	public VistaBoletaHonorarios() {
		
	//	control = new ControlFormulario(this);
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Formulario 22");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 53, 774, 30);
		add(lblNewLabel);
		
		stndrbtnVerDocumento = new TittleButton("Ver Documento");
		stndrbtnVerDocumento.setBounds(194, 344, 400, 120);
		//stndrbtnVerDocumento.addActionListener(control);
		add(stndrbtnVerDocumento);

	}

	public TittleButton getStndrbtnVerDocumento() {
		return stndrbtnVerDocumento;
	}

	public void setStndrbtnVerDocumento(TittleButton stndrbtnVerDocumento) {
		this.stndrbtnVerDocumento = stndrbtnVerDocumento;
	}


}
