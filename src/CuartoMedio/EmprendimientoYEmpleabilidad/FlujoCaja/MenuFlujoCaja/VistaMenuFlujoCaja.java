package CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.MenuFlujoCaja;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import ui.Buttons.TittleButton;

public class VistaMenuFlujoCaja extends JPanel {
	
	private ControlMenuFlujoCaja cmfc;
	
	private TittleButton btnRegCaj;
	private TittleButton btnCaj;

	/**
	 * Create the panel.
	 */
	public VistaMenuFlujoCaja() {
		
		cmfc = new ControlMenuFlujoCaja(this);
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		btnRegCaj = new TittleButton("Registrar Caja");
		btnRegCaj.setBounds(178, 136, 388, 103);
		btnRegCaj.addActionListener(cmfc);
		add(btnRegCaj);
		
		btnCaj = new TittleButton("Caja");
		btnCaj.setBounds(178, 539, 388, 103);
		btnCaj.addActionListener(cmfc);
		add(btnCaj);

	}

	public TittleButton getBtnRegCaj() {
		return btnRegCaj;
	}

	public void setBtnRegCaj(TittleButton btnRegCaj) {
		this.btnRegCaj = btnRegCaj;
	}

	public TittleButton getBtnCaj() {
		return btnCaj;
	}

	public void setBtnCaj(TittleButton btnCaj) {
		this.btnCaj = btnCaj;
	}
}
