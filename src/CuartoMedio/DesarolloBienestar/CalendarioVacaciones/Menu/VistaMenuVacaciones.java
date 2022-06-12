package CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Menu;

import javax.swing.JPanel;
import javax.swing.JButton;

public class VistaMenuVacaciones extends JPanel {
	
	private ControlMenuVacaciones cmv;
	
	private JButton btnRegistrarPermiso;
	private JButton btnCalendarioVacaciones;

	/**
	 * Create the panel.
	 */
	public VistaMenuVacaciones() {
		
		cmv = new ControlMenuVacaciones(this);

		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		btnRegistrarPermiso = new JButton("Registrar Permiso");
		btnRegistrarPermiso.setBounds(215, 170, 373, 86);
		btnRegistrarPermiso.addActionListener(cmv);
		add(btnRegistrarPermiso);
		
		btnCalendarioVacaciones = new JButton("Calendario Vacaciones");
		btnCalendarioVacaciones.setBounds(215, 488, 373, 86);
		btnCalendarioVacaciones.addActionListener(cmv);
		add(btnCalendarioVacaciones);
	}

	public JButton getBtnRegistrarPermiso() {
		return btnRegistrarPermiso;
	}

	public void setBtnRegistrarPermiso(JButton btnRegistrarPermiso) {
		this.btnRegistrarPermiso = btnRegistrarPermiso;
	}

	public JButton getBtnCalendarioVacaciones() {
		return btnCalendarioVacaciones;
	}

	public void setBtnCalendarioVacaciones(JButton btnCalendarioVacaciones) {
		this.btnCalendarioVacaciones = btnCalendarioVacaciones;
	}

}
