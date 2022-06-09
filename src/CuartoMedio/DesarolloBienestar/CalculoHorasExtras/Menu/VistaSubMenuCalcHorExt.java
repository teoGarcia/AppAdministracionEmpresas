package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Menu;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class VistaSubMenuCalcHorExt extends JPanel {
	
	private ControlSubMenuCalcHorExt csmche;
	private JButton btnHorasSemana;
	private JButton btnCargarDatos;

	/**
	 * Create the panel.
	 */
	public VistaSubMenuCalcHorExt() {
		
		csmche = new ControlSubMenuCalcHorExt(this);
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		btnCargarDatos = new JButton("Cargar Datos");
		btnCargarDatos.setFont(new Font("Dialog", Font.BOLD, 14));
		btnCargarDatos.setBounds(177, 185, 408, 88);
		btnCargarDatos.addActionListener(csmche);
		add(btnCargarDatos);
		
		btnHorasSemana = new JButton("Horas Semana");
		btnHorasSemana.setFont(new Font("Dialog", Font.BOLD, 14));
		btnHorasSemana.setBounds(177, 466, 408, 88);
		btnHorasSemana.addActionListener(csmche);
		add(btnHorasSemana);

	}

	public JButton getBtnHorasSemana() {
		return btnHorasSemana;
	}

	public void setBtnHorasSemana(JButton btnHorasSemana) {
		this.btnHorasSemana = btnHorasSemana;
	}

	public JButton getBtnCargarDatos() {
		return btnCargarDatos;
	}

	public void setBtnCargarDatos(JButton btnCargarDatos) {
		this.btnCargarDatos = btnCargarDatos;
	}

}
