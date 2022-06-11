package CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Menu;

import javax.swing.JPanel;
import javax.swing.JButton;

public class VistaMenuVacaciones extends JPanel {
	private JButton btnRegistrarPermiso;
	private JButton btnCalendarioVacaciones;

	/**
	 * Create the panel.
	 */
	public VistaMenuVacaciones() {

		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		btnRegistrarPermiso = new JButton("Registrar Permiso");
		btnRegistrarPermiso.setBounds(215, 170, 373, 86);
		add(btnRegistrarPermiso);
		
		btnCalendarioVacaciones = new JButton("Calendario Vacaciones");
		btnCalendarioVacaciones.setBounds(215, 488, 373, 86);
		add(btnCalendarioVacaciones);
	}

}
