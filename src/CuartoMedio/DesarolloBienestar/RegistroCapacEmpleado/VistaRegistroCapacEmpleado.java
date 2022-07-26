package CuartoMedio.DesarolloBienestar.RegistroCapacEmpleado;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Buttons.StandarButton;
import java.awt.Color;
import ui.Buttons.TittleButton;

public class VistaRegistroCapacEmpleado extends JPanel {
	
	private ControlRegCapacEmpleado crce;
	
	private TittleButton stndrbtnVerDocumento;

	/**
	 * Create the panel.
	 */
	public VistaRegistroCapacEmpleado() {
		
		crce = new ControlRegCapacEmpleado(this);
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Capacitacion Empleado");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 60, 774, 30);
		add(lblNewLabel);
		
		stndrbtnVerDocumento = new TittleButton((String) null);
		stndrbtnVerDocumento.setText("Ver Documento");
		stndrbtnVerDocumento.setBounds(194, 344, 400, 120);
		stndrbtnVerDocumento.addActionListener(crce);
		add(stndrbtnVerDocumento);
		

	}

	public TittleButton getStndrbtnVerDocumento() {
		return stndrbtnVerDocumento;
	}

	public void setStndrbtnVerDocumento(TittleButton stndrbtnVerDocumento) {
		this.stndrbtnVerDocumento = stndrbtnVerDocumento;
	}
}
