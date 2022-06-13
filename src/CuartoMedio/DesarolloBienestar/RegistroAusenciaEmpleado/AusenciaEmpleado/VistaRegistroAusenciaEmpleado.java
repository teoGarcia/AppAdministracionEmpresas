package CuartoMedio.DesarolloBienestar.RegistroAusenciaEmpleado.AusenciaEmpleado;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import ui.Labels.LabelSubtitulos;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import ui.Texts.TextSoloNumeros;
import javax.swing.table.DefaultTableModel;

public class VistaRegistroAusenciaEmpleado extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public VistaRegistroAusenciaEmpleado() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro de Ausencia de Empleado");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 60, 774, 30);
		add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsNombre = new LabelSubtitulos((String) null);
		lblsbtlsNombre.setText("Nombre");
		lblsbtlsNombre.setBounds(66, 152, 95, 23);
		add(lblsbtlsNombre);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(171, 153, 533, 23);
		add(comboBox);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos((String) null);
		lblsbtlsFecha.setText("Fecha");
		lblsbtlsFecha.setBounds(66, 220, 95, 23);
		add(lblsbtlsFecha);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(171, 220, 160, 23);
		add(dateChooser);
		
		LabelSubtitulos lblsbtlsMotivo = new LabelSubtitulos((String) null);
		lblsbtlsMotivo.setText("Motivo");
		lblsbtlsMotivo.setBounds(386, 219, 114, 23);
		add(lblsbtlsMotivo);
		
		textField = new JTextField();
		textField.setBounds(467, 221, 237, 23);
		add(textField);
		textField.setColumns(10);
		
		StandarButton stndrbtnAgregar = new StandarButton((String) null);
		stndrbtnAgregar.setText("Guardar");
		stndrbtnAgregar.setBounds(340, 629, 100, 30);
		add(stndrbtnAgregar);

	}
}
