package CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Color;

public class VistaPresupuestoCapacitacion extends JPanel {
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public VistaPresupuestoCapacitacion() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Presupuesto de Capacitacion  ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 60, 774, 35);
		add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsItemGlosario = new LabelSubtitulos((String) null);
		lblsbtlsItemGlosario.setText("Item / Glosario");
		lblsbtlsItemGlosario.setBounds(63, 161, 103, 23);
		add(lblsbtlsItemGlosario);
		
		textField = new JTextField();
		textField.setBounds(176, 163, 447, 23);
		add(textField);
		textField.setColumns(10);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos((String) null);
		lblsbtlsFecha.setText("Fecha");
		lblsbtlsFecha.setBounds(63, 208, 103, 23);
		add(lblsbtlsFecha);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(176, 208, 165, 23);
		add(dateChooser);
		
		LabelSubtitulos lblsbtlsMontoACancela = new LabelSubtitulos((String) null);
		lblsbtlsMontoACancela.setText("Monto a Cancelar");
		lblsbtlsMontoACancela.setBounds(361, 208, 127, 23);
		add(lblsbtlsMontoACancela);
		
		TextSoloNumeros textSoloNumeros = new TextSoloNumeros();
		textSoloNumeros.setBounds(481, 208, 124, 23);
		add(textSoloNumeros);
		
		StandarButton stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(615, 208, 103, 23);
		add(stndrbtnGuardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(63, 256, 655, 312);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Glosario", "Fecha", "Monto a Cancelar"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		table.getColumnModel().getColumn(2).setPreferredWidth(50);
		scrollPane.setViewportView(table);
		
		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("TOTAL");
		lblsbtlsTotal.setBounds(515, 579, 62, 23);
		add(lblsbtlsTotal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(602, 579, 116, 23);
		add(textField_1);
		textField_1.setColumns(10);
		
		StandarButton stndrbtnEliminar = new StandarButton((String) null);
		stndrbtnEliminar.setText("Eliminar");
		stndrbtnEliminar.setBounds(63, 579, 103, 23);
		add(stndrbtnEliminar);
		
		StandarButton stndrbtnModificar = new StandarButton((String) null);
		stndrbtnModificar.setText("Modificar");
		stndrbtnModificar.setBounds(188, 579, 103, 23);
		add(stndrbtnModificar);

	}
}
