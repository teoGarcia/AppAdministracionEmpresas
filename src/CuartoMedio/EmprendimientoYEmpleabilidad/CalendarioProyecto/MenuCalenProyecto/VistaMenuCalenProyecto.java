package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.MenuCalenProyecto;

import javax.swing.JPanel;
import ui.Buttons.TittleButton;

public class VistaMenuCalenProyecto extends JPanel {
	
	private ControlMenuCalenProyecto cmcp;
	
	private TittleButton tlbtnCalendarioProyecto;
	private TittleButton tlbtnRegistrarProyecto;

	/**
	 * Create the panel.
	 */
	public VistaMenuCalenProyecto() {
		
		cmcp = new ControlMenuCalenProyecto(this);
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		tlbtnRegistrarProyecto = new TittleButton("Registrar Proyecto");
		tlbtnRegistrarProyecto.setBounds(177, 139, 375, 100);
		tlbtnRegistrarProyecto.addActionListener(cmcp);
		add(tlbtnRegistrarProyecto);
		
		tlbtnCalendarioProyecto = new TittleButton("Calendario Proyecto");
		tlbtnCalendarioProyecto.setBounds(177, 537, 375, 100);
		tlbtnCalendarioProyecto.addActionListener(cmcp);
		add(tlbtnCalendarioProyecto);

	}

	public TittleButton getTlbtnCalendarioProyecto() {
		return tlbtnCalendarioProyecto;
	}

	public void setTlbtnCalendarioProyecto(TittleButton tlbtnCalendarioProyecto) {
		this.tlbtnCalendarioProyecto = tlbtnCalendarioProyecto;
	}

	public TittleButton getTlbtnRegistrarProyecto() {
		return tlbtnRegistrarProyecto;
	}

	public void setTlbtnRegistrarProyecto(TittleButton tlbtnRegistrarProyecto) {
		this.tlbtnRegistrarProyecto = tlbtnRegistrarProyecto;
	}

	
}
