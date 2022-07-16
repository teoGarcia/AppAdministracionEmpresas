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
		
		LabelSubtitulos lblsbtlsBuscar = new LabelSubtitulos("Buscar");
		lblsbtlsBuscar.setBounds(62, 99, 158, 23);
		add(lblsbtlsBuscar);
		
		LabelSubtitulos lblsbtlsDesde = new LabelSubtitulos("desde");
		lblsbtlsDesde.setBounds(62, 139, 81, 23);
		add(lblsbtlsDesde);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(183, 139, 148, 23);
		add(dateChooser);
		
		LabelSubtitulos lblsbtlsHasta = new LabelSubtitulos("Hasta");
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
		
		LabelSubtitulos lblsbtlsHorasLaborales = new LabelSubtitulos("Horas Laborales");
		lblsbtlsHorasLaborales.setBounds(62, 521, 135, 23);
		add(lblsbtlsHorasLaborales);
		
		LabelSubtitulos lblsbtlsHorasLaboralesSbado = new LabelSubtitulos("Horas Lab. S\u00E1bado");
		lblsbtlsHorasLaboralesSbado.setBounds(62, 551, 123, 23);
		add(lblsbtlsHorasLaboralesSbado);
		
		LabelSubtitulos lblsbtlsHorasLabDomingo = new LabelSubtitulos("Horas Lab. Domingo");
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
		
		LabelSubtitulos lblsbtlsHorasExtrasNormal = new LabelSubtitulos("Horas Extras Normal");
		lblsbtlsHorasExtrasNormal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsHorasExtrasNormal.setBounds(451, 521, 157, 23);
		add(lblsbtlsHorasExtrasNormal);
		
		LabelSubtitulos lblsbtlsHorasXtras_2_1 = new LabelSubtitulos("Horas Extras Extraordinarias");
		lblsbtlsHorasXtras_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsHorasXtras_2_1.setBounds(425, 551, 183, 23);
		add(lblsbtlsHorasXtras_2_1);
		
		TextSoloNumeros textSoloNumeros_2 = new TextSoloNumeros();
		textSoloNumeros_2.setBounds(621, 521, 99, 23);
		add(textSoloNumeros_2);
		
		TextSoloNumeros textSoloNumeros_2_1 = new TextSoloNumeros();
		textSoloNumeros_2_1.setBounds(621, 551, 99, 23);
		add(textSoloNumeros_2_1);
		
		LabelSubtitulos lblsbtlsHorasXtras_2_1_1 = new LabelSubtitulos("Total a pagar Horas Extras Normal");
		lblsbtlsHorasXtras_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsHorasXtras_2_1_1.setBounds(372, 621, 239, 23);
		add(lblsbtlsHorasXtras_2_1_1);
		
		StandarButton stndrbtnCalcular = new StandarButton((String) null);
		stndrbtnCalcular.setText("Calcular");
		stndrbtnCalcular.setBounds(621, 585, 99, 25);
		add(stndrbtnCalcular);
		
		LabelSubtitulos lblsbtlsHorasXtras_2_1_1_1 = new LabelSubtitulos("Total a pagar Horas Extras Extraordinarias");
		lblsbtlsHorasXtras_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsHorasXtras_2_1_1_1.setBounds(330, 651, 281, 23);
		add(lblsbtlsHorasXtras_2_1_1_1);
		
		TextSoloNumeros textSoloNumeros_2_1_1 = new TextSoloNumeros();
		textSoloNumeros_2_1_1.setBounds(621, 621, 99, 23);
		add(textSoloNumeros_2_1_1);
		
		TextSoloNumeros textSoloNumeros_2_1_2 = new TextSoloNumeros();
		textSoloNumeros_2_1_2.setBounds(621, 651, 99, 23);
		add(textSoloNumeros_2_1_2);
		
		LabelSubtitulos lblsbtlsValorHoraNormal = new LabelSubtitulos("Horas Lab. Domingo");
		lblsbtlsValorHoraNormal.setText("Valor Hora Normal");
		lblsbtlsValorHoraNormal.setBounds(62, 615, 128, 23);
		add(lblsbtlsValorHoraNormal);
		
		TextSoloNumeros textSoloNumeros_1_1 = new TextSoloNumeros();
		textSoloNumeros_1_1.setBounds(183, 615, 100, 23);
		add(textSoloNumeros_1_1);
		
		LabelSubtitulos lblsbtlsGhf = new LabelSubtitulos("Horas Lab. Domingo");
		lblsbtlsGhf.setText("% Hora Extra Normal");
		lblsbtlsGhf.setBounds(62, 651, 128, 23);
		add(lblsbtlsGhf);
		
		TextSoloNumeros textSoloNumeros_1_2 = new TextSoloNumeros();
		textSoloNumeros_1_2.setBounds(183, 651, 100, 23);
		add(textSoloNumeros_1_2);
		
		LabelSubtitulos lblsbtlsHoraExtra = new LabelSubtitulos("Horas Lab. Domingo");
		lblsbtlsHoraExtra.setText("% Hora Extra Extrao.");
		lblsbtlsHoraExtra.setBounds(62, 681, 123, 23);
		add(lblsbtlsHoraExtra);
		
		TextSoloNumeros textSoloNumeros_1_3 = new TextSoloNumeros();
		textSoloNumeros_1_3.setBounds(183, 681, 100, 23);
		add(textSoloNumeros_1_3);
		
		
	}
}
