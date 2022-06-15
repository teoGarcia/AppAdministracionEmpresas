package CuartoMedio.EmprendimientoYEmpleabilidad.Gastos;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.Color;

public class VistaGastos extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public VistaGastos() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gastos de la Empresa");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 60, 774, 30);
		add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsGastos = new LabelSubtitulos((String) null);
		lblsbtlsGastos.setText("Gastos");
		lblsbtlsGastos.setBounds(52, 141, 73, 23);
		add(lblsbtlsGastos);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"De Oficina", "De Tienda", "De Ventas", "Publicidad"}));
		comboBox.setBounds(147, 142, 301, 23);
		add(comboBox);
		
		LabelSubtitulos lblsbtlsTipoDeGasto = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeGasto.setText("Tipo de Gasto");
		lblsbtlsTipoDeGasto.setBounds(481, 141, 116, 23);
		add(lblsbtlsTipoDeGasto);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Empleado", "Operativo"}));
		comboBox_1.setBounds(594, 142, 128, 22);
		add(comboBox_1);
		
		LabelSubtitulos lblsbtlsPresupuesto = new LabelSubtitulos((String) null);
		lblsbtlsPresupuesto.setText("Presupuesto");
		lblsbtlsPresupuesto.setBounds(52, 197, 95, 23);
		add(lblsbtlsPresupuesto);
		
		TextSoloNumeros textSoloNumeros = new TextSoloNumeros();
		textSoloNumeros.setBounds(147, 197, 150, 23);
		add(textSoloNumeros);
		
		LabelSubtitulos lblsbtlsReal = new LabelSubtitulos((String) null);
		lblsbtlsReal.setText("Real");
		lblsbtlsReal.setBounds(333, 197, 65, 23);
		add(lblsbtlsReal);
		
		TextSoloNumeros textSoloNumeros_1 = new TextSoloNumeros();
		textSoloNumeros_1.setBounds(396, 197, 150, 23);
		add(textSoloNumeros_1);
		
		StandarButton stndrbtnAgregar = new StandarButton((String) null);
		stndrbtnAgregar.setText("Guardar");
		stndrbtnAgregar.setBounds(606, 197, 116, 23);
		add(stndrbtnAgregar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 248, 670, 363);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Gasto", "Tipo Gasto", "Presupuesto", "Real", "Dif. $", "Dif. %"
			}
		));
		scrollPane.setViewportView(table);
		
		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("TOTAL");
		lblsbtlsTotal.setBounds(256, 622, 78, 23);
		add(lblsbtlsTotal);
		
		textField = new JTextField();
		textField.setBounds(324, 622, 86, 23);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(430, 622, 86, 23);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(534, 622, 86, 23);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(636, 622, 86, 23);
		add(textField_3);
		
		StandarButton stndrbtnEliminar = new StandarButton((String) null);
		stndrbtnEliminar.setText("Eliminar");
		stndrbtnEliminar.setBounds(52, 622, 100, 30);
		add(stndrbtnEliminar);

	}
}
