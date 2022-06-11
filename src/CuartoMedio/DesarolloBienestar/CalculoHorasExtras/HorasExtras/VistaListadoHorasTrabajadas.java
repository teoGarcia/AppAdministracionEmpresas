package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.HorasExtras;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import ui.Texts.TextSoloNumeros;
import java.awt.Color;

public class VistaListadoHorasTrabajadas extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public VistaListadoHorasTrabajadas() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de Horas Trabajadas");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 50, 774, 31);
		add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsBuscar = new LabelSubtitulos();
		lblsbtlsBuscar.setText("Buscar");
		lblsbtlsBuscar.setBounds(62, 99, 158, 23);
		add(lblsbtlsBuscar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(183, 99, 418, 23);
		add(comboBox);
		
		LabelSubtitulos lblsbtlsDesde = new LabelSubtitulos();
		lblsbtlsDesde.setText("desde");
		lblsbtlsDesde.setBounds(62, 139, 81, 23);
		add(lblsbtlsDesde);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(183, 139, 148, 23);
		add(dateChooser);
		
		LabelSubtitulos lblsbtlsHasta = new LabelSubtitulos();
		lblsbtlsHasta.setText("Hasta");
		lblsbtlsHasta.setBounds(372, 139, 67, 23);
		add(lblsbtlsHasta);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(441, 139, 148, 23);
		add(dateChooser_1);
		
		StandarButton stndrbtnBuscar = new StandarButton((String) null);
		stndrbtnBuscar.setText("Buscar");
		stndrbtnBuscar.setBounds(621, 139, 99, 25);
		add(stndrbtnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(62, 182, 658, 328);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Fecha", "Dia", "Hora Entrada", "Hora Salida", "Total Horas"
			}
		));
		scrollPane.setViewportView(table);
		
		LabelSubtitulos lblsbtlsTotalDeHoras = new LabelSubtitulos();
		lblsbtlsTotalDeHoras.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsTotalDeHoras.setText("Total de Horas en el rango de Fecha elegido");
		lblsbtlsTotalDeHoras.setBounds(353, 521, 258, 23);
		add(lblsbtlsTotalDeHoras);
		
		textField = new JTextField();
		textField.setBounds(620, 521, 100, 23);
		add(textField);
		textField.setColumns(10);
		
		LabelSubtitulos lblsbtlsHorasLaborales = new LabelSubtitulos();
		lblsbtlsHorasLaborales.setText("Horas Laborales");
		lblsbtlsHorasLaborales.setBounds(62, 521, 135, 23);
		add(lblsbtlsHorasLaborales);
		
		LabelSubtitulos lblsbtlsHorasLaboralesSbado = new LabelSubtitulos();
		lblsbtlsHorasLaboralesSbado.setText("Horas Lab. S\u00E1bado");
		lblsbtlsHorasLaboralesSbado.setBounds(62, 551, 123, 23);
		add(lblsbtlsHorasLaboralesSbado);
		
		LabelSubtitulos lblsbtlsHorasLabDomingo = new LabelSubtitulos();
		lblsbtlsHorasLabDomingo.setText("Horas Lab. Domingo");
		lblsbtlsHorasLabDomingo.setBounds(62, 581, 128, 23);
		add(lblsbtlsHorasLabDomingo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 521, 100, 23);
		add(textField_1);
		textField_1.setColumns(10);
		
		TextSoloNumeros textSoloNumeros = new TextSoloNumeros();
		textSoloNumeros.setBounds(183, 551, 100, 23);
		add(textSoloNumeros);
		
		TextSoloNumeros textSoloNumeros_1 = new TextSoloNumeros();
		textSoloNumeros_1.setBounds(183, 581, 100, 23);
		add(textSoloNumeros_1);
		
		LabelSubtitulos lblsbtlsHorasExtrasNormal = new LabelSubtitulos();
		lblsbtlsHorasExtrasNormal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsHorasExtrasNormal.setText("Horas Extras Normal");
		lblsbtlsHorasExtrasNormal.setBounds(454, 551, 157, 23);
		add(lblsbtlsHorasExtrasNormal);
		
		LabelSubtitulos lblsbtlsHorasXtras_2_1 = new LabelSubtitulos();
		lblsbtlsHorasXtras_2_1.setText("Horas Extras Extraordinarias");
		lblsbtlsHorasXtras_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsHorasXtras_2_1.setBounds(428, 581, 183, 23);
		add(lblsbtlsHorasXtras_2_1);
		
		TextSoloNumeros textSoloNumeros_2 = new TextSoloNumeros();
		textSoloNumeros_2.setBounds(621, 551, 99, 23);
		add(textSoloNumeros_2);
		
		TextSoloNumeros textSoloNumeros_2_1 = new TextSoloNumeros();
		textSoloNumeros_2_1.setBounds(621, 581, 99, 23);
		add(textSoloNumeros_2_1);
		
		LabelSubtitulos lblsbtlsHorasXtras_2_1_1 = new LabelSubtitulos();
		lblsbtlsHorasXtras_2_1_1.setText("Total a pagar Horas Extras Normal");
		lblsbtlsHorasXtras_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsHorasXtras_2_1_1.setBounds(372, 651, 239, 23);
		add(lblsbtlsHorasXtras_2_1_1);
		
		StandarButton stndrbtnCalcular = new StandarButton((String) null);
		stndrbtnCalcular.setText("Calcular");
		stndrbtnCalcular.setBounds(621, 615, 99, 25);
		add(stndrbtnCalcular);
		
		LabelSubtitulos lblsbtlsHorasXtras_2_1_1_1 = new LabelSubtitulos();
		lblsbtlsHorasXtras_2_1_1_1.setText("Total a pagar Horas Extras Extraordinarias");
		lblsbtlsHorasXtras_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsHorasXtras_2_1_1_1.setBounds(330, 681, 281, 23);
		add(lblsbtlsHorasXtras_2_1_1_1);
		
		TextSoloNumeros textSoloNumeros_2_1_1 = new TextSoloNumeros();
		textSoloNumeros_2_1_1.setBounds(621, 651, 99, 23);
		add(textSoloNumeros_2_1_1);
		
		TextSoloNumeros textSoloNumeros_2_1_2 = new TextSoloNumeros();
		textSoloNumeros_2_1_2.setBounds(621, 681, 99, 23);
		add(textSoloNumeros_2_1_2);

	}
}
