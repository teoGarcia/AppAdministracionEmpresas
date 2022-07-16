package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.HorasExtras;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import ui.TablaUi.TableStandard;

import com.toedter.calendar.JDateChooser;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import com.toedter.calendar.JDayChooser;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class VistaCargarDatos extends JPanel {

	private TableStandard table;
	private JTextField txtNombre;
	private TableStandard table2;
	private JTextField txtHorasLaboralesCalc;
	private TextSoloNumeros txtHoraExtraNormalMultip;
	private TextSoloNumeros txtHorasLabDominCalc;
	private TextSoloNumeros txtHorasLabSabCalc;
	private StandarButton btnUsarDatos;
	private StandarButton btnModificarDatos;
	private StandarButton btnEliminarDatos;

	/**
	 * Create the panel.
	 */
	public VistaCargarDatos() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1800));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cargar Datos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 55, 774, 30);
		panel.add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsCantidadDeHoras = new LabelSubtitulos("Cantidad de Horas Jornada Laboral + Almuerzo (Regular)");
		lblsbtlsCantidadDeHoras.setBounds(82, 139, 356, 21);
		panel.add(lblsbtlsCantidadDeHoras);
		
		
		LabelSubtitulos lblsbtlsCantidadDeHoras_6 = new LabelSubtitulos("Cantidad de Horas Jornada Laboral Sabado (Regular)");
		lblsbtlsCantidadDeHoras_6.setBounds(82, 170, 356, 21);
		panel.add(lblsbtlsCantidadDeHoras_6);
		
		LabelSubtitulos lblsbtlsCantidadDeHoras_1 = new LabelSubtitulos("Cantidad de Horas Jornada Laboral Domingo (Regular)");
		lblsbtlsCantidadDeHoras_1.setBounds(82, 200, 356, 21);
		panel.add(lblsbtlsCantidadDeHoras_1);
		
		LabelSubtitulos lblsbtlsValorHoraExtra = new LabelSubtitulos("Valor Hora Extra Normal");
		lblsbtlsValorHoraExtra.setBounds(82, 230, 356, 21);
		panel.add(lblsbtlsValorHoraExtra);
		
		LabelSubtitulos lblsbtlsValorHoraExtra_1 = new LabelSubtitulos("Valor Hora Extra Extraordinaria (Solo aplica los Domingos)");
		lblsbtlsValorHoraExtra_1.setBounds(82, 260, 356, 21);
		panel.add(lblsbtlsValorHoraExtra_1);
		
		LabelSubtitulos lblsbtlsPrecioPorHora = new LabelSubtitulos("Precio por Hora Normal");
		lblsbtlsPrecioPorHora.setBounds(82, 290, 356, 21);
		panel.add(lblsbtlsPrecioPorHora);
		
		TextSoloNumeros textSoloNumeros = new TextSoloNumeros();
		textSoloNumeros.setBounds(560, 230, 87, 20);
		panel.add(textSoloNumeros);
		
		TextSoloNumeros textSoloNumeros_1 = new TextSoloNumeros();
		textSoloNumeros_1.setBounds(560, 260, 87, 20);
		panel.add(textSoloNumeros_1);
		
		TextSoloNumeros textSoloNumeros_2 = new TextSoloNumeros();
		textSoloNumeros_2.setBounds(560, 290, 87, 20);
		panel.add(textSoloNumeros_2);
		
		StandarButton stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(333, 342, 105, 30);
		panel.add(stndrbtnGuardar);
		
		TextSoloNumeros textSoloNumeros_3 = new TextSoloNumeros();
		textSoloNumeros_3.setBounds(560, 140, 87, 20);
		panel.add(textSoloNumeros_3);
		
		LabelSubtitulos lblsbtlsHoras = new LabelSubtitulos("Horas");
		lblsbtlsHoras.setBounds(654, 139, 77, 21);
		panel.add(lblsbtlsHoras);
		
		TextSoloNumeros textSoloNumeros_3_1 = new TextSoloNumeros();
		textSoloNumeros_3_1.setBounds(560, 170, 87, 20);
		panel.add(textSoloNumeros_3_1);
		
		LabelSubtitulos lblsbtlsHoras_1 = new LabelSubtitulos("Horas");
		lblsbtlsHoras_1.setBounds(654, 170, 77, 21);
		panel.add(lblsbtlsHoras_1);
		
		TextSoloNumeros textSoloNumeros_3_1_1 = new TextSoloNumeros();
		textSoloNumeros_3_1_1.setBounds(560, 200, 87, 20);
		panel.add(textSoloNumeros_3_1_1);
		
		LabelSubtitulos lblsbtlsHoras_1_1 = new LabelSubtitulos("Horas");
		lblsbtlsHoras_1_1.setBounds(654, 200, 77, 21);
		panel.add(lblsbtlsHoras_1_1);
		
		LabelSubtitulos lblsbtlsHoras_1_1_1 = new LabelSubtitulos("% (Porcentaje)");
		lblsbtlsHoras_1_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblsbtlsHoras_1_1_1.setBounds(654, 230, 95, 21);
		panel.add(lblsbtlsHoras_1_1_1);
		
		LabelSubtitulos labelSubtitulos = new LabelSubtitulos("$");
		labelSubtitulos.setBounds(657, 290, 28, 21);
		panel.add(labelSubtitulos);
		
		LabelSubtitulos lblsbtlsHoras_1_1_1_1 = new LabelSubtitulos("% (Porcentaje)");
		lblsbtlsHoras_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblsbtlsHoras_1_1_1_1.setBounds(654, 260, 95, 21);
		panel.add(lblsbtlsHoras_1_1_1_1);
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 400, 728, 200);
		panel.add(scrollPane_1);
		
		table = new TableStandard();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String columns[] = new String[] {
			"Id",
			"Jornada Lab + Alm(Regular)",
			"Jornada Lab Sabado(Regular)",
			"Jornada Lab Domingo(Regular)",
			"Valor Hora Extra",
			"Valor Hora Extra - Extraord.",
			"Precio por Hora Normal",
		};
		table.setColums(columns);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setPreferredWidth(160);
		table.getColumnModel().getColumn(6).setPreferredWidth(150);
		
		scrollPane_1.setViewportView(table);
		
		JLabel lblNewLabel1 = new JLabel("Registrar Horas Trabajadas");
		lblNewLabel1.setForeground(Color.WHITE);
		lblNewLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel1.setBounds(0, 689, 748, 30);
		panel.add(lblNewLabel1);
		
		LabelSubtitulos lblsbtlsNombre = new LabelSubtitulos("Nombre");
		lblsbtlsNombre.setBounds(10, 740, 99, 20);
		panel.add(lblsbtlsNombre);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos("Fecha");
		lblsbtlsFecha.setBounds(10, 785, 99, 20);
		panel.add(lblsbtlsFecha);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(120, 785, 158, 20);
		panel.add(dateChooser);
		
		LabelSubtitulos lblsbtlsHoraEntrada = new LabelSubtitulos("Hora Entrada");
		lblsbtlsHoraEntrada.setBounds(310, 785, 99, 20);
		panel.add(lblsbtlsHoraEntrada);
		
		LabelSubtitulos lblsbtlsHoraSalida = new LabelSubtitulos("Hora Salida");
		lblsbtlsHoraSalida.setBounds(488, 785, 99, 20);
		panel.add(lblsbtlsHoraSalida);
		
		TextSoloNumeros txtHorasEntrada = new TextSoloNumeros();
		txtHorasEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		txtHorasEntrada.setText("00");
		txtHorasEntrada.setBounds(400, 785, 25, 20);
		panel.add(txtHorasEntrada);
		
		TextSoloNumeros txtMinutosEntrada = new TextSoloNumeros();
		txtMinutosEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinutosEntrada.setText("00");
		txtMinutosEntrada.setBounds(435, 785, 25, 20);
		panel.add(txtMinutosEntrada);
		
		LabelSubtitulos lblsbtlsPp = new LabelSubtitulos(":");
		lblsbtlsPp.setForeground(Color.WHITE);
		lblsbtlsPp.setFont(new Font("Dialog", Font.BOLD, 14));
		lblsbtlsPp.setBounds(428, 785, 10, 20);
		panel.add(lblsbtlsPp);
		
		TextSoloNumeros txtHoraSalida = new TextSoloNumeros();
		txtHoraSalida.setText("00");
		txtHoraSalida.setHorizontalAlignment(SwingConstants.CENTER);
		txtHoraSalida.setBounds(570, 785, 25, 20);
		panel.add(txtHoraSalida);
		
		LabelSubtitulos lblsbtlsPp_1 = new LabelSubtitulos(":");
		lblsbtlsPp_1.setForeground(Color.WHITE);
		lblsbtlsPp_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblsbtlsPp_1.setBounds(597, 785, 10, 20);
		panel.add(lblsbtlsPp_1);
		
		TextSoloNumeros txtMinutosSalida = new TextSoloNumeros();
		txtMinutosSalida.setText("00");
		txtMinutosSalida.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinutosSalida.setBounds(604, 785, 25, 20);
		panel.add(txtMinutosSalida);
		
		StandarButton btnGuardarRegist = new StandarButton((String) null);
		btnGuardarRegist.setText("Guardar");
		btnGuardarRegist.setBounds(333, 885, 105, 30);
		panel.add(btnGuardarRegist);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 670, 749, 8);
		panel.add(separator);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(120, 740, 494, 21);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		LabelSubtitulos lblsbtlsTotalHoras = new LabelSubtitulos((String) null);
		lblsbtlsTotalHoras.setText("Total Horas");
		lblsbtlsTotalHoras.setBounds(10, 825, 136, 21);
		panel.add(lblsbtlsTotalHoras);
		
		LabelSubtitulos lblsbtlsTotalHorasExtras = new LabelSubtitulos((String) null);
		lblsbtlsTotalHorasExtras.setText("Total Horas Extras");
		lblsbtlsTotalHorasExtras.setBounds(263, 825, 136, 21);
		panel.add(lblsbtlsTotalHorasExtras);
		
		TextSoloNumeros txtHorasTotHoras = new TextSoloNumeros();
		txtHorasTotHoras.setText("00");
		txtHorasTotHoras.setHorizontalAlignment(SwingConstants.CENTER);
		txtHorasTotHoras.setBounds(120, 825, 25, 20);
		panel.add(txtHorasTotHoras);
		
		LabelSubtitulos lblsbtlsPp_1_1 = new LabelSubtitulos(":");
		lblsbtlsPp_1_1.setForeground(Color.WHITE);
		lblsbtlsPp_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblsbtlsPp_1_1.setBounds(148, 825, 10, 20);
		panel.add(lblsbtlsPp_1_1);
		
		TextSoloNumeros txtMinutosTotHoras = new TextSoloNumeros();
		txtMinutosTotHoras.setText("00");
		txtMinutosTotHoras.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinutosTotHoras.setBounds(155, 825, 25, 20);
		panel.add(txtMinutosTotHoras);
		
		TextSoloNumeros txtHoraTotHorExt = new TextSoloNumeros();
		txtHoraTotHorExt.setText("00");
		txtHoraTotHorExt.setHorizontalAlignment(SwingConstants.CENTER);
		txtHoraTotHorExt.setBounds(401, 825, 25, 20);
		panel.add(txtHoraTotHorExt);
		
		LabelSubtitulos lblsbtlsPp_1_2 = new LabelSubtitulos(":");
		lblsbtlsPp_1_2.setForeground(Color.WHITE);
		lblsbtlsPp_1_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblsbtlsPp_1_2.setBounds(428, 825, 10, 20);
		panel.add(lblsbtlsPp_1_2);
		
		TextSoloNumeros txtMinutosTotHorExt = new TextSoloNumeros();
		txtMinutosTotHorExt.setText("00");
		txtMinutosTotHorExt.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinutosTotHorExt.setBounds(435, 825, 25, 20);
		panel.add(txtMinutosTotHorExt);
		
		LabelSubtitulos lblsbtlsBuscar = new LabelSubtitulos("Buscar");
		lblsbtlsBuscar.setBounds(10, 945, 158, 23);
		panel.add(lblsbtlsBuscar);
		
		LabelSubtitulos lblsbtlsDesde = new LabelSubtitulos("desde");
		lblsbtlsDesde.setBounds(130, 945, 81, 23);
		panel.add(lblsbtlsDesde);
		
		JDateChooser FechaDesdeRegistroHoraExtra = new JDateChooser();
		FechaDesdeRegistroHoraExtra.setBounds(183, 945, 148, 23);
		panel.add(FechaDesdeRegistroHoraExtra);
		
		LabelSubtitulos lblsbtlsHasta = new LabelSubtitulos("Hasta");
		lblsbtlsHasta.setBounds(372, 945, 67, 23);
		panel.add(lblsbtlsHasta);
		
		JDateChooser FechaHastaRegistroHoraExtra = new JDateChooser();
		FechaHastaRegistroHoraExtra.setBounds(441, 945, 148, 23);
		panel.add(FechaHastaRegistroHoraExtra);
		
		StandarButton stndrbtnBuscar = new StandarButton((String) null);
		stndrbtnBuscar.setText("Buscar");
		stndrbtnBuscar.setBounds(621, 945, 99, 25);
		panel.add(stndrbtnBuscar);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 990, 728, 400);
		panel.add(scrollPane_2);
		
		table2 = new TableStandard();
		table2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String columns2[] = new String[] {
			"Id",
			"Nombre",
			"Fecha",
			"Hora Entrada",
			"Hora Salida",
			"Total Horas",
			"Total Horas Extras"
		};
		table2.setColums(columns2);
		
		table2.getColumnModel().getColumn(0).setPreferredWidth(40);
		table2.getColumnModel().getColumn(1).setPreferredWidth(200);
		table2.getColumnModel().getColumn(2).setPreferredWidth(120);
		table2.getColumnModel().getColumn(3).setPreferredWidth(120);
		table2.getColumnModel().getColumn(4).setPreferredWidth(120);
		table2.getColumnModel().getColumn(5).setPreferredWidth(120);
		table2.getColumnModel().getColumn(6).setPreferredWidth(150);
		
		scrollPane_2.setViewportView(table2);
		
		LabelSubtitulos lblsbtlsHorasLaborales = new LabelSubtitulos("Horas Laborales");
		lblsbtlsHorasLaborales.setBounds(10, 1470, 135, 23);
		panel.add(lblsbtlsHorasLaborales);
		
		LabelSubtitulos lblsbtlsHorasLaboralesSbado = new LabelSubtitulos("Horas Lab. S\u00E1bado");
		lblsbtlsHorasLaboralesSbado.setBounds(10, 1500, 123, 23);
		panel.add(lblsbtlsHorasLaboralesSbado);
		
		LabelSubtitulos lblsbtlsHorasLabDomingo = new LabelSubtitulos("Horas Lab. Domingo");
		lblsbtlsHorasLabDomingo.setBounds(10, 1530, 128, 23);
		panel.add(lblsbtlsHorasLabDomingo);
		
		txtHorasLaboralesCalc = new JTextField();
		txtHorasLaboralesCalc.setBounds(183, 1470, 100, 23);
		panel.add(txtHorasLaboralesCalc);
		txtHorasLaboralesCalc.setColumns(10);
		
		txtHorasLabSabCalc = new TextSoloNumeros();
		txtHorasLabSabCalc.setBounds(183, 1500, 100, 23);
		panel.add(txtHorasLabSabCalc);
		
		txtHorasLabDominCalc = new TextSoloNumeros();
		txtHorasLabDominCalc.setBounds(183, 1530, 100, 23);
		panel.add(txtHorasLabDominCalc);
		
		LabelSubtitulos lblsbtlsHorasExtrasNormal = new LabelSubtitulos("Horas Extras Normal");
		lblsbtlsHorasExtrasNormal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsHorasExtrasNormal.setBounds(451, 1470, 157, 23);
		panel.add(lblsbtlsHorasExtrasNormal);
		
		LabelSubtitulos lblsbtlsHorasXtras_2_1 = new LabelSubtitulos("Horas Extras Extraordinarias");
		lblsbtlsHorasXtras_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsHorasXtras_2_1.setBounds(425, 1500, 183, 23);
		panel.add(lblsbtlsHorasXtras_2_1);
		
		txtHoraExtraNormalMultip = new TextSoloNumeros();
		txtHoraExtraNormalMultip.setBounds(621, 1470, 99, 23);
		panel.add(txtHoraExtraNormalMultip);
		
		TextSoloNumeros txtHoraExtraExtraordMultip = new TextSoloNumeros();
		txtHoraExtraExtraordMultip.setBounds(621, 1500, 99, 23);
		panel.add(txtHoraExtraExtraordMultip);
		
		LabelSubtitulos lblsbtlsHorasXtras_2_1_1 = new LabelSubtitulos("Total a pagar Horas Extras Normal");
		lblsbtlsHorasXtras_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsHorasXtras_2_1_1.setBounds(372, 1590, 239, 23);
		panel.add(lblsbtlsHorasXtras_2_1_1);
		
		StandarButton stndrbtnCalcular = new StandarButton((String) null);
		stndrbtnCalcular.setText("Calcular");
		stndrbtnCalcular.setBounds(621, 1530, 99, 25);
		panel.add(stndrbtnCalcular);
		
		LabelSubtitulos lblsbtlsHorasXtras_2_1_1_1 = new LabelSubtitulos("Total a pagar Horas Extras Extraordinarias");
		lblsbtlsHorasXtras_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsHorasXtras_2_1_1_1.setBounds(330, 1560, 281, 23);
		panel.add(lblsbtlsHorasXtras_2_1_1_1);
		
		TextSoloNumeros txtTotalHorasExtrasNormal = new TextSoloNumeros();
		txtTotalHorasExtrasNormal.setBounds(621, 1560, 99, 23);
		panel.add(txtTotalHorasExtrasNormal);
		
		TextSoloNumeros txtTotalHorasExtrExtrao = new TextSoloNumeros();
		txtTotalHorasExtrExtrao.setBounds(621, 1590, 99, 23);
		panel.add(txtTotalHorasExtrExtrao);
		
		LabelSubtitulos lblsbtlsValorHoraNormal = new LabelSubtitulos("Horas Lab. Domingo");
		lblsbtlsValorHoraNormal.setText("Valor Hora Normal");
		lblsbtlsValorHoraNormal.setBounds(10, 1560, 128, 23);
		panel.add(lblsbtlsValorHoraNormal);
		
		TextSoloNumeros txtValorHoraExtrCalc = new TextSoloNumeros();
		txtValorHoraExtrCalc.setBounds(183, 1560, 100, 23);
		panel.add(txtValorHoraExtrCalc);
		
		LabelSubtitulos lblsbtlsGhf = new LabelSubtitulos("Horas Lab. Domingo");
		lblsbtlsGhf.setText("% Hora Extra Normal");
		lblsbtlsGhf.setBounds(10, 1590, 128, 23);
		panel.add(lblsbtlsGhf);
		
		TextSoloNumeros txtPorcHoraExtNormCalc = new TextSoloNumeros();
		txtPorcHoraExtNormCalc.setBounds(183, 1590, 100, 23);
		panel.add(txtPorcHoraExtNormCalc);
		
		LabelSubtitulos lblsbtlsHoraExtra = new LabelSubtitulos("Horas Lab. Domingo");
		lblsbtlsHoraExtra.setText("% Hora Extra Extrao.");
		lblsbtlsHoraExtra.setBounds(10, 1620, 123, 23);
		panel.add(lblsbtlsHoraExtra);
		
		TextSoloNumeros txtHoraExtExtCalc = new TextSoloNumeros();
		txtHoraExtExtCalc.setBounds(183, 1620, 100, 23);
		panel.add(txtHoraExtExtCalc);
		
		btnUsarDatos = new StandarButton((String) null);
		btnUsarDatos.setText("Usar");
		btnUsarDatos.setBounds(10, 611, 105, 30);
		panel.add(btnUsarDatos);
		
		btnModificarDatos = new StandarButton((String) null);
		btnModificarDatos.setText("Modificar");
		btnModificarDatos.setBounds(139, 611, 105, 30);
		panel.add(btnModificarDatos);
		
		btnEliminarDatos = new StandarButton((String) null);
		btnEliminarDatos.setText("Eliminar");
		btnEliminarDatos.setBounds(263, 611, 105, 30);
		panel.add(btnEliminarDatos);
		
		StandarButton btnModificarDatos_1 = new StandarButton((String) null);
		btnModificarDatos_1.setText("Modificar");
		btnModificarDatos_1.setBounds(10, 1410, 105, 30);
		panel.add(btnModificarDatos_1);
		
		StandarButton btnEliminarDatos_1 = new StandarButton((String) null);
		btnEliminarDatos_1.setText("Eliminar");
		btnEliminarDatos_1.setBounds(139, 1410, 105, 30);
		panel.add(btnEliminarDatos_1);
		
	}
}
