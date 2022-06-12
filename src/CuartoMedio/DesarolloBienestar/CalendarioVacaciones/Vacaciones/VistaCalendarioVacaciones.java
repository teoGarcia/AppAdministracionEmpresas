package CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import ui.Labels.LabelSubtitulos;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import ui.Texts.TextSoloNumeros;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class VistaCalendarioVacaciones extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public VistaCalendarioVacaciones() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calendario Vacaciones");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 60, 774, 30);
		add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsNombre = new LabelSubtitulos("Nombre");
		lblsbtlsNombre.setBounds(73, 133, 93, 23);
		add(lblsbtlsNombre);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(166, 134, 406, 23);
		add(comboBox);
		
		LabelSubtitulos lblsbtlsDesde = new LabelSubtitulos("Desde");
		lblsbtlsDesde.setBounds(73, 167, 80, 23);
		add(lblsbtlsDesde);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(166, 167, 150, 23);
		add(dateChooser);
		
		LabelSubtitulos lblsbtlsHasta = new LabelSubtitulos("Hasta");
		lblsbtlsHasta.setText("Hasta");
		lblsbtlsHasta.setBounds(340, 167, 72, 23);
		add(lblsbtlsHasta);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(422, 167, 150, 23);
		add(dateChooser_1);
		
		StandarButton stndrbtnBuscar = new StandarButton((String) null);
		stndrbtnBuscar.setText("Buscar");
		stndrbtnBuscar.setBounds(612, 167, 93, 23);
		add(stndrbtnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(73, 206, 632, 312);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Fecha", "Motivo", "Dias Tomados"
			}
		));
		scrollPane.setViewportView(table);
		
		LabelSubtitulos lblNewLabel_1 = new LabelSubtitulos("Dias acumulados en el rango de la fecha");
		lblNewLabel_1.setText("Dias Acum en el rango de fecha");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(378, 541, 205, 23);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(605, 541, 100, 23);
		add(textField);
		textField.setColumns(10);
		
		LabelSubtitulos lblNewLabel_1_1 = new LabelSubtitulos("Dias acumulados en el rango de la fecha");
		lblNewLabel_1_1.setText("Dias Acum. A\u00F1os previos");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setBounds(73, 575, 167, 23);
		add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(605, 576, 100, 23);
		add(textField_1);
		
		LabelSubtitulos lblNewLabel_1_2 = new LabelSubtitulos("Dias acumulados en el rango de la fecha");
		lblNewLabel_1_2.setText("Dias Por A\u00F1o");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setBounds(73, 541, 167, 23);
		add(lblNewLabel_1_2);
		
		TextSoloNumeros textSoloNumeros = new TextSoloNumeros();
		textSoloNumeros.setBounds(250, 541, 100, 23);
		add(textSoloNumeros);
		
		TextSoloNumeros textSoloNumeros_1 = new TextSoloNumeros();
		textSoloNumeros_1.setBounds(250, 575, 100, 23);
		add(textSoloNumeros_1);
		
		LabelSubtitulos lblNewLabel_1_3 = new LabelSubtitulos("Dias acumulados en el rango de la fecha");
		lblNewLabel_1_3.setText("Dias Pendientes");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setBounds(378, 575, 205, 23);
		add(lblNewLabel_1_3);
		
		StandarButton stndrbtnCalcular = new StandarButton((String) null);
		stndrbtnCalcular.setText("Calcular");
		stndrbtnCalcular.setBounds(73, 609, 100, 23);
		add(stndrbtnCalcular);
		
		StandarButton stndrbtnImprimir = new StandarButton((String) null);
		stndrbtnImprimir.setText("Imprimir");
		stndrbtnImprimir.setBounds(612, 653, 93, 30);
		add(stndrbtnImprimir);

	}
}
