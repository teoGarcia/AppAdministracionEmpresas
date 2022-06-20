package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.MenuCalenProyecto;

import javax.swing.JPanel;
import ui.Buttons.TittleButton;

public class VistaMenuCalenProyecto extends JPanel {
	private TittleButton tlbtnCalendarioProyectp;
	private TittleButton tlbtnRegistrarProyecto;

	/**
	 * Create the panel.
	 */
	public VistaMenuCalenProyecto() {
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		tlbtnRegistrarProyecto = new TittleButton((String) null);
		tlbtnRegistrarProyecto.setText("Registrar Proyecto");
		tlbtnRegistrarProyecto.setBounds(177, 139, 375, 100);
		add(tlbtnRegistrarProyecto);
		
		tlbtnCalendarioProyectp = new TittleButton((String) null);
		tlbtnCalendarioProyectp.setText("Calendario Proyecto");
		tlbtnCalendarioProyectp.setBounds(177, 537, 375, 100);
		add(tlbtnCalendarioProyectp);

	}

	public TittleButton getTlbtnCalendarioProyectp() {
		return tlbtnCalendarioProyectp;
	}

	public void setTlbtnCalendarioProyectp(TittleButton tlbtnCalendarioProyectp) {
		this.tlbtnCalendarioProyectp = tlbtnCalendarioProyectp;
	}

	public TittleButton getTlbtnRegistrarProyecto() {
		return tlbtnRegistrarProyecto;
	}

	public void setTlbtnRegistrarProyecto(TittleButton tlbtnRegistrarProyecto) {
		this.tlbtnRegistrarProyecto = tlbtnRegistrarProyecto;
	}
}
