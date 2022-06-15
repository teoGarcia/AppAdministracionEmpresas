package CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultComboBoxModel;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class VistaPresupSimple extends JPanel {
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public VistaPresupSimple() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Presupuesto Simple");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 60, 774, 30);
		add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsApartado = new LabelSubtitulos((String) null);
		lblsbtlsApartado.setText("Apartado");
		lblsbtlsApartado.setBounds(66, 132, 87, 23);
		add(lblsbtlsApartado);
		
		textField = new JTextField();
		textField.setBounds(144, 133, 375, 23);
		add(textField);
		textField.setColumns(10);
		
		LabelSubtitulos lblsbtlsTipo = new LabelSubtitulos((String) null);
		lblsbtlsTipo.setText("Tipo");
		lblsbtlsTipo.setBounds(529, 132, 61, 23);
		add(lblsbtlsTipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ingreso", "Egreso"}));
		comboBox.setBounds(587, 133, 116, 23);
		add(comboBox);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos((String) null);
		lblsbtlsFecha.setText("Fecha");
		lblsbtlsFecha.setBounds(66, 185, 71, 23);
		add(lblsbtlsFecha);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(144, 185, 160, 23);
		add(dateChooser);
		
		LabelSubtitulos lblsbtlsMonto = new LabelSubtitulos((String) null);
		lblsbtlsMonto.setText("Monto");
		lblsbtlsMonto.setBounds(334, 185, 77, 23);
		add(lblsbtlsMonto);
		
		TextSoloNumeros textSoloNumeros = new TextSoloNumeros();
		textSoloNumeros.setBounds(401, 185, 160, 23);
		add(textSoloNumeros);
		
		StandarButton stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(603, 185, 100, 23);
		add(stndrbtnGuardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(66, 244, 638, 333);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Apartado", "Fecha", "Ingreso", "Egreso"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(180);
		scrollPane.setViewportView(table);
		
		StandarButton stndrbtnEliminiar = new StandarButton((String) null);
		stndrbtnEliminiar.setText("Eliminiar");
		stndrbtnEliminiar.setBounds(66, 588, 100, 30);
		add(stndrbtnEliminiar);
		
		StandarButton stndrbtnModificar = new StandarButton((String) null);
		stndrbtnModificar.setText("Modificar");
		stndrbtnModificar.setBounds(188, 588, 100, 30);
		add(stndrbtnModificar);
		
		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("TOTAL");
		lblsbtlsTotal.setBounds(373, 594, 100, 23);
		add(lblsbtlsTotal);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(461, 594, 100, 23);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(603, 594, 100, 23);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(603, 638, 100, 23);
		add(textField_3);
		textField_3.setColumns(10);
		
		LabelSubtitulos lblsbtlsResultado = new LabelSubtitulos((String) null);
		lblsbtlsResultado.setText("Resultado");
		lblsbtlsResultado.setBounds(503, 637, 87, 23);
		add(lblsbtlsResultado);

	}
}
