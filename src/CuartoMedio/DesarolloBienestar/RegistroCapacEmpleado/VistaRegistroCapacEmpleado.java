package CuartoMedio.DesarolloBienestar.RegistroCapacEmpleado;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Buttons.StandarButton;
import java.awt.Color;

public class VistaRegistroCapacEmpleado extends JPanel {
	
	private ControlRegCapacEmpleado crce;
	
	private StandarButton stndrbtnVerDocumento;

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
		
		stndrbtnVerDocumento = new StandarButton((String) null);
		stndrbtnVerDocumento.setText("Ver Documento");
		stndrbtnVerDocumento.setBounds(552, 645, 137, 30);
		stndrbtnVerDocumento.addActionListener(crce);
		add(stndrbtnVerDocumento);
		

	}

	public StandarButton getStndrbtnVerDocumento() {
		return stndrbtnVerDocumento;
	}

	public void setStndrbtnVerDocumento(StandarButton stndrbtnVerDocumento) {
		this.stndrbtnVerDocumento = stndrbtnVerDocumento;
	}
}
