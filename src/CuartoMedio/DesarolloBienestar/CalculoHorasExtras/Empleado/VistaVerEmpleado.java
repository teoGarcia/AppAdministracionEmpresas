package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Empleado;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;

public class VistaVerEmpleado extends JPanel {

	/**
	 * Create the panel.
	 */
	public VistaVerEmpleado() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Listado de Empleados");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 55, 774, 30);
		add(lblNewLabel);
		
		StandarButton stndrbtnEliminar = new StandarButton((String) null);
		stndrbtnEliminar.setLocation(417, 647);
		stndrbtnEliminar.setText("Eliminar");
		add(stndrbtnEliminar);
		
		StandarButton stndrbtnModificar = new StandarButton((String) null);
		stndrbtnModificar.setText("Modificar");
		stndrbtnModificar.setLocation(600, 647);
		add(stndrbtnModificar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(121, 183, 513, 451);
		add(scrollPane);

	}
}
