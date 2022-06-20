package CuartoMedio.DesarolloBienestar.RegistroAusenciaEmpleado.Menu;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import ui.Buttons.StandarButton;
import ui.Labels.LabelSubtitulos;

public class VistaMenuRegistroAusenciaEmp extends JPanel {
	
	private ControlMenuRegistroAusenciaEmp cmrae;
	private StandarButton stndrbtnRegistarAusenciaDel;
	private StandarButton stndrbtnVerAusencia;

	/**
	 * Create the panel.
	 */
	public VistaMenuRegistroAusenciaEmp() {
		
		cmrae = new ControlMenuRegistroAusenciaEmp(this);
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		stndrbtnVerAusencia = new StandarButton((String) null);
		stndrbtnVerAusencia.setText("Ver Ausencias de Empleados");
		stndrbtnVerAusencia.setBounds(211, 518, 386, 91);
		stndrbtnVerAusencia.addActionListener(cmrae);
		add(stndrbtnVerAusencia);
		
		stndrbtnRegistarAusenciaDel = new StandarButton((String) null);
		stndrbtnRegistarAusenciaDel.setText("Registar Ausencia del Empleado");
		stndrbtnRegistarAusenciaDel.setBounds(211, 132, 386, 91);
		stndrbtnRegistarAusenciaDel.addActionListener(cmrae);
		add(stndrbtnRegistarAusenciaDel);

	}

	public StandarButton getStndrbtnRegistarAusenciaDel() {
		return stndrbtnRegistarAusenciaDel;
	}

	public void setStndrbtnRegistarAusenciaDel(StandarButton stndrbtnRegistarAusenciaDel) {
		this.stndrbtnRegistarAusenciaDel = stndrbtnRegistarAusenciaDel;
	}

	public StandarButton getStndrbtnVerAusencia() {
		return stndrbtnVerAusencia;
	}

	public void setStndrbtnVerAusencia(StandarButton stndrbtnVerAusencia) {
		this.stndrbtnVerAusencia = stndrbtnVerAusencia;
	}
}
