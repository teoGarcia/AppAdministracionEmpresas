package CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import ui.Labels.LabelSubtitulos;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import ui.Buttons.StandarButton;
import javax.swing.DefaultComboBoxModel;

public class VistaRegistrarPermiso extends JPanel {

	/**
	 * Create the panel.
	 */
	public VistaRegistrarPermiso() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrar Permiso");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 60, 774, 30);
		add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsNombreDelEmpleado = new LabelSubtitulos("Nombre del Empleado");
		lblsbtlsNombreDelEmpleado.setBounds(74, 158, 148, 23);
		add(lblsbtlsNombreDelEmpleado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(217, 159, 454, 23);
		add(comboBox);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos("Fecha");
		lblsbtlsFecha.setBounds(74, 222, 126, 23);
		add(lblsbtlsFecha);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(217, 222, 148, 23);
		add(dateChooser);
		
		LabelSubtitulos lblsbtlsTipoDePermiso = new LabelSubtitulos("Tipo de Permiso");
		lblsbtlsTipoDePermiso.setBounds(386, 222, 110, 23);
		add(lblsbtlsTipoDePermiso);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"E", "V", "M", "T", "MD"}));
		comboBox_1.setBounds(497, 223, 75, 23);
		add(comboBox_1);
		
		StandarButton stndrbtnGuardar = new StandarButton("Guardar");
		stndrbtnGuardar.setBounds(334, 652, 110, 30);
		add(stndrbtnGuardar);

	}
}
