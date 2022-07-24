package CuartoMedio.DesarolloBienestar.CalculoHorasExtras;

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
import javax.swing.table.DefaultTableModel;

import ui.Labels.LabelSubtitulos;
import ui.TablaUi.TableStandard;

import com.toedter.calendar.JDateChooser;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import com.toedter.calendar.JDayChooser;

import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import ui.Buttons.CalcularButton;

public class VistaCalculoHorasExtras extends JPanel {
	
	private ControlCalculoHorasExtras cche;

	private TableStandard tableCargarDatos;
	private JTextField txtNombre;
	private TableStandard tableRegistrarHoras;
	private JTextField txtHorasLaboralesCalc;
	private TextSoloNumeros txtHoraExtraNormalMultip;
	private TextSoloNumeros txtHorasLabDominCalc;
	private TextSoloNumeros txtHorasLabSabCalc;
	private StandarButton btnUsarDatos;
	private StandarButton btnModificarDatos;
	private StandarButton btnEliminarDatos;
	private TextSoloNumeros txtPrecioHora;
	private TextSoloNumeros txtValorHoraExtraExtrao;
	private TextSoloNumeros txtValorHoraExtraNormal;
	private TextSoloNumeros txtHorasDomingo;
	private TextSoloNumeros txtHorasSabado;
	private TextSoloNumeros txtHorasMasAlmuerzo;
	private JTextField txtId;
	private StandarButton btnGuardarCargaDatos;
	private TextSoloNumeros txtValorHoraExtrCalc;
	private TextSoloNumeros txtPorcHoraExtNormCalc;
	private TextSoloNumeros txtPorcHoraExtExtCalc;
	private CalcularButton btnCalcularTotal;
	private JDateChooser FechaRegistrarHoras;
	private TextSoloNumeros txtMinutosSalida;
	private TextSoloNumeros txtMinutosEntrada;
	private TextSoloNumeros txtHoraSalida;
	private TextSoloNumeros txtHorasEntrada;
	private TextSoloNumeros txtMinutosTotHorExt;
	private TextSoloNumeros txtHoraTotHorExt;
	private TextSoloNumeros txtMinutosTotHoras;
	private TextSoloNumeros txtHorasTotHoras;
	private StandarButton btnGuardarRegistroHoras;
	private TextSoloNumeros txtTotalHorasExtrasNormal;
	private TextSoloNumeros txtTotalHorasExtrExtrao;
	private TextSoloNumeros txtHoraExtraExtraordMultip;
	private JTextField txtIdRH;
	private StandarButton btnEliminarHR;
	private StandarButton btnModificarHR;
	private JDateChooser FechaHastaRegistroHoraExtra;
	private JDateChooser FechaDesdeRegistroHoraExtra;
	private StandarButton btnBuscarPorFecha;

	/**
	 * Create the panel.
	 */
	public VistaCalculoHorasExtras() {
		
		cche = new ControlCalculoHorasExtras(this);
		
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
		lblsbtlsCantidadDeHoras.setBounds(57, 140, 356, 21);
		panel.add(lblsbtlsCantidadDeHoras);
		
		
		LabelSubtitulos lblsbtlsCantidadDeHoras_6 = new LabelSubtitulos("Cantidad de Horas Jornada Laboral Sabado (Regular)");
		lblsbtlsCantidadDeHoras_6.setBounds(57, 171, 356, 21);
		panel.add(lblsbtlsCantidadDeHoras_6);
		
		LabelSubtitulos lblsbtlsCantidadDeHoras_1 = new LabelSubtitulos("Cantidad de Horas Jornada Laboral Domingo (Regular)");
		lblsbtlsCantidadDeHoras_1.setBounds(57, 201, 356, 21);
		panel.add(lblsbtlsCantidadDeHoras_1);
		
		LabelSubtitulos lblsbtlsValorHoraExtra = new LabelSubtitulos("Valor Hora Extra Normal");
		lblsbtlsValorHoraExtra.setBounds(57, 231, 356, 21);
		panel.add(lblsbtlsValorHoraExtra);
		
		LabelSubtitulos lblsbtlsValorHoraExtra_1 = new LabelSubtitulos("Valor Hora Extra Extraordinaria (Solo aplica los Domingos)");
		lblsbtlsValorHoraExtra_1.setBounds(57, 261, 356, 21);
		panel.add(lblsbtlsValorHoraExtra_1);
		
		LabelSubtitulos lblsbtlsPrecioPorHora = new LabelSubtitulos("Precio por Hora Normal");
		lblsbtlsPrecioPorHora.setBounds(57, 291, 356, 21);
		panel.add(lblsbtlsPrecioPorHora);
		
		txtValorHoraExtraNormal = new TextSoloNumeros();
		txtValorHoraExtraNormal.setBounds(535, 231, 87, 20);
		panel.add(txtValorHoraExtraNormal);
		
		txtValorHoraExtraExtrao = new TextSoloNumeros();
		txtValorHoraExtraExtrao.setBounds(535, 261, 87, 20);
		panel.add(txtValorHoraExtraExtrao);
		
		txtPrecioHora = new TextSoloNumeros();
		txtPrecioHora.setBounds(535, 291, 87, 20);
		panel.add(txtPrecioHora);
		
		btnGuardarCargaDatos = new StandarButton((String) null);
		btnGuardarCargaDatos.setText("Guardar");
		btnGuardarCargaDatos.setBounds(333, 342, 105, 30);
		btnGuardarCargaDatos.addActionListener(cche);
		panel.add(btnGuardarCargaDatos);
		
		txtHorasMasAlmuerzo = new TextSoloNumeros();
		txtHorasMasAlmuerzo.setBounds(535, 141, 87, 20);
		panel.add(txtHorasMasAlmuerzo);
		
		LabelSubtitulos lblsbtlsHoras = new LabelSubtitulos("Horas");
		lblsbtlsHoras.setBounds(629, 140, 77, 21);
		panel.add(lblsbtlsHoras);
		
		txtHorasSabado = new TextSoloNumeros();
		txtHorasSabado.setBounds(535, 171, 87, 20);
		panel.add(txtHorasSabado);
		
		LabelSubtitulos lblsbtlsHoras_1 = new LabelSubtitulos("Horas");
		lblsbtlsHoras_1.setBounds(629, 171, 77, 21);
		panel.add(lblsbtlsHoras_1);
		
		txtHorasDomingo = new TextSoloNumeros();
		txtHorasDomingo.setBounds(535, 201, 87, 20);
		panel.add(txtHorasDomingo);
		
		LabelSubtitulos lblsbtlsHoras_1_1 = new LabelSubtitulos("Horas");
		lblsbtlsHoras_1_1.setBounds(629, 201, 77, 21);
		panel.add(lblsbtlsHoras_1_1);
		
		LabelSubtitulos lblsbtlsHoras_1_1_1 = new LabelSubtitulos("% (Porcentaje)");
		lblsbtlsHoras_1_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblsbtlsHoras_1_1_1.setBounds(629, 231, 95, 21);
		panel.add(lblsbtlsHoras_1_1_1);
		
		LabelSubtitulos labelSubtitulos = new LabelSubtitulos("$");
		labelSubtitulos.setBounds(632, 291, 28, 21);
		panel.add(labelSubtitulos);
		
		LabelSubtitulos lblsbtlsHoras_1_1_1_1 = new LabelSubtitulos("% (Porcentaje)");
		lblsbtlsHoras_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblsbtlsHoras_1_1_1_1.setBounds(629, 261, 95, 21);
		panel.add(lblsbtlsHoras_1_1_1_1);
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 400, 728, 200);
		panel.add(scrollPane_1);
		
		tableCargarDatos = new TableStandard();
		tableCargarDatos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String columns[] = new String[] {
			"Id",
			"Jornada Lab + Alm(Regular)",
			"Jornada Lab Sabado(Regular)",
			"Jornada Lab Domingo(Regular)",
			"Valor Hora Extra",
			"Valor Hora Extra - Extraord.",
			"Precio por Hora Normal",
		};
		tableCargarDatos.setColums(columns);
		
		tableCargarDatos.getColumnModel().getColumn(0).setPreferredWidth(40);
		tableCargarDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
		tableCargarDatos.getColumnModel().getColumn(2).setPreferredWidth(150);
		tableCargarDatos.getColumnModel().getColumn(3).setPreferredWidth(150);
		tableCargarDatos.getColumnModel().getColumn(4).setPreferredWidth(100);
		tableCargarDatos.getColumnModel().getColumn(5).setPreferredWidth(160);
		tableCargarDatos.getColumnModel().getColumn(6).setPreferredWidth(150);
		
		scrollPane_1.setViewportView(tableCargarDatos);
		
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
		
		FechaRegistrarHoras = new JDateChooser();
		FechaRegistrarHoras.setBounds(120, 785, 158, 20);
		panel.add(FechaRegistrarHoras);
		
		LabelSubtitulos lblsbtlsHoraEntrada = new LabelSubtitulos("Hora Entrada");
		lblsbtlsHoraEntrada.setBounds(310, 785, 99, 20);
		panel.add(lblsbtlsHoraEntrada);
		
		LabelSubtitulos lblsbtlsHoraSalida = new LabelSubtitulos("Hora Salida");
		lblsbtlsHoraSalida.setBounds(488, 785, 99, 20);
		panel.add(lblsbtlsHoraSalida);
		
		txtHorasEntrada = new TextSoloNumeros();
		txtHorasEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		txtHorasEntrada.setText("00");
		txtHorasEntrada.setBounds(400, 785, 25, 20);
		panel.add(txtHorasEntrada);
		
		txtMinutosEntrada = new TextSoloNumeros();
		txtMinutosEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinutosEntrada.setText("00");
		txtMinutosEntrada.setBounds(435, 785, 25, 20);
		panel.add(txtMinutosEntrada);
		
		LabelSubtitulos lblsbtlsPp = new LabelSubtitulos(":");
		lblsbtlsPp.setForeground(Color.WHITE);
		lblsbtlsPp.setFont(new Font("Dialog", Font.BOLD, 14));
		lblsbtlsPp.setBounds(428, 785, 10, 20);
		panel.add(lblsbtlsPp);
		
		txtHoraSalida = new TextSoloNumeros();
		txtHoraSalida.setText("00");
		txtHoraSalida.setHorizontalAlignment(SwingConstants.CENTER);
		txtHoraSalida.setBounds(570, 785, 25, 20);
		panel.add(txtHoraSalida);
		
		LabelSubtitulos lblsbtlsPp_1 = new LabelSubtitulos(":");
		lblsbtlsPp_1.setForeground(Color.WHITE);
		lblsbtlsPp_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblsbtlsPp_1.setBounds(597, 785, 10, 20);
		panel.add(lblsbtlsPp_1);
		
		txtMinutosSalida = new TextSoloNumeros();
		txtMinutosSalida.setText("00");
		txtMinutosSalida.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinutosSalida.setBounds(604, 785, 25, 20);
		panel.add(txtMinutosSalida);
		
		btnGuardarRegistroHoras = new StandarButton((String) null);
		btnGuardarRegistroHoras.setText("Guardar");
		btnGuardarRegistroHoras.setBounds(333, 885, 105, 30);
		btnGuardarRegistroHoras.addActionListener(cche);
		panel.add(btnGuardarRegistroHoras);
		
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
		
		txtHorasTotHoras = new TextSoloNumeros();
		txtHorasTotHoras.setText("00");
		txtHorasTotHoras.setHorizontalAlignment(SwingConstants.CENTER);
		txtHorasTotHoras.setBounds(120, 825, 25, 20);
		panel.add(txtHorasTotHoras);
		
		LabelSubtitulos lblsbtlsPp_1_1 = new LabelSubtitulos(":");
		lblsbtlsPp_1_1.setForeground(Color.WHITE);
		lblsbtlsPp_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblsbtlsPp_1_1.setBounds(148, 825, 10, 20);
		panel.add(lblsbtlsPp_1_1);
		
		txtMinutosTotHoras = new TextSoloNumeros();
		txtMinutosTotHoras.setText("00");
		txtMinutosTotHoras.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinutosTotHoras.setBounds(155, 825, 25, 20);
		panel.add(txtMinutosTotHoras);
		
		txtHoraTotHorExt = new TextSoloNumeros();
		txtHoraTotHorExt.setText("00");
		txtHoraTotHorExt.setHorizontalAlignment(SwingConstants.CENTER);
		txtHoraTotHorExt.setBounds(401, 825, 25, 20);
		panel.add(txtHoraTotHorExt);
		
		LabelSubtitulos lblsbtlsPp_1_2 = new LabelSubtitulos(":");
		lblsbtlsPp_1_2.setForeground(Color.WHITE);
		lblsbtlsPp_1_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblsbtlsPp_1_2.setBounds(428, 825, 10, 20);
		panel.add(lblsbtlsPp_1_2);
		
		txtMinutosTotHorExt = new TextSoloNumeros();
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
		
		FechaDesdeRegistroHoraExtra = new JDateChooser();
		FechaDesdeRegistroHoraExtra.setBounds(183, 945, 148, 23);
		panel.add(FechaDesdeRegistroHoraExtra);
		
		LabelSubtitulos lblsbtlsHasta = new LabelSubtitulos("Hasta");
		lblsbtlsHasta.setBounds(372, 945, 67, 23);
		panel.add(lblsbtlsHasta);
		
		FechaHastaRegistroHoraExtra = new JDateChooser();
		FechaHastaRegistroHoraExtra.setBounds(441, 945, 148, 23);
		panel.add(FechaHastaRegistroHoraExtra);
		
		btnBuscarPorFecha = new StandarButton((String) null);
		btnBuscarPorFecha.setText("Buscar");
		btnBuscarPorFecha.setBounds(621, 945, 99, 25);
		btnBuscarPorFecha.addActionListener(cche);
		panel.add(btnBuscarPorFecha);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 990, 728, 400);
		panel.add(scrollPane_2);
		
		tableRegistrarHoras = new TableStandard();
		tableRegistrarHoras.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String columns2[] = new String[] {
			"Id",
			"Nombre",
			"Fecha",
			"Hora Entrada",
			"Hora Salida",
			"Total Horas",
			"Total Horas Extras"
		};
		tableRegistrarHoras.setColums(columns2);
		
		tableRegistrarHoras.getColumnModel().getColumn(0).setPreferredWidth(40);
		tableRegistrarHoras.getColumnModel().getColumn(1).setPreferredWidth(200);
		tableRegistrarHoras.getColumnModel().getColumn(2).setPreferredWidth(120);
		tableRegistrarHoras.getColumnModel().getColumn(3).setPreferredWidth(120);
		tableRegistrarHoras.getColumnModel().getColumn(4).setPreferredWidth(120);
		tableRegistrarHoras.getColumnModel().getColumn(5).setPreferredWidth(120);
		tableRegistrarHoras.getColumnModel().getColumn(6).setPreferredWidth(150);
		
		scrollPane_2.setViewportView(tableRegistrarHoras);
		
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
		txtHorasLaboralesCalc.setEditable(false);
		txtHorasLaboralesCalc.setBounds(183, 1470, 100, 23);
		panel.add(txtHorasLaboralesCalc);
		txtHorasLaboralesCalc.setColumns(10);
		
		txtHorasLabSabCalc = new TextSoloNumeros();
		txtHorasLabSabCalc.setEditable(false);
		txtHorasLabSabCalc.setBounds(183, 1500, 100, 23);
		panel.add(txtHorasLabSabCalc);
		
		txtHorasLabDominCalc = new TextSoloNumeros();
		txtHorasLabDominCalc.setEditable(false);
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
		
		txtHoraExtraExtraordMultip = new TextSoloNumeros();
		txtHoraExtraExtraordMultip.setBounds(621, 1500, 99, 23);
		panel.add(txtHoraExtraExtraordMultip);
		
		LabelSubtitulos lblsbtlsHorasXtras_2_1_1 = new LabelSubtitulos("Total a pagar Horas Extras Normal");
		lblsbtlsHorasXtras_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsHorasXtras_2_1_1.setBounds(372, 1590, 239, 23);
		panel.add(lblsbtlsHorasXtras_2_1_1);
		
		btnCalcularTotal = new CalcularButton();
		btnCalcularTotal.setText("Calcular");
		btnCalcularTotal.setBounds(621, 1530, 99, 25);
		btnCalcularTotal.addActionListener(cche);
		panel.add(btnCalcularTotal);
		
		LabelSubtitulos lblsbtlsHorasXtras_2_1_1_1 = new LabelSubtitulos("Total a pagar Horas Extras Extraordinarias");
		lblsbtlsHorasXtras_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsHorasXtras_2_1_1_1.setBounds(330, 1560, 281, 23);
		panel.add(lblsbtlsHorasXtras_2_1_1_1);
		
		txtTotalHorasExtrasNormal = new TextSoloNumeros();
		txtTotalHorasExtrasNormal.setBounds(621, 1560, 99, 23);
		panel.add(txtTotalHorasExtrasNormal);
		
		txtTotalHorasExtrExtrao = new TextSoloNumeros();
		txtTotalHorasExtrExtrao.setBounds(621, 1590, 99, 23);
		panel.add(txtTotalHorasExtrExtrao);
		
		LabelSubtitulos lblsbtlsValorHoraNormal = new LabelSubtitulos("Horas Lab. Domingo");
		lblsbtlsValorHoraNormal.setText("Valor Hora Normal");
		lblsbtlsValorHoraNormal.setBounds(10, 1560, 128, 23);
		panel.add(lblsbtlsValorHoraNormal);
		
		txtValorHoraExtrCalc = new TextSoloNumeros();
		txtValorHoraExtrCalc.setEditable(false);
		txtValorHoraExtrCalc.setBounds(183, 1560, 100, 23);
		panel.add(txtValorHoraExtrCalc);
		
		LabelSubtitulos lblsbtlsGhf = new LabelSubtitulos("Horas Lab. Domingo");
		lblsbtlsGhf.setText("% Hora Extra Normal");
		lblsbtlsGhf.setBounds(10, 1590, 128, 23);
		panel.add(lblsbtlsGhf);
		
		txtPorcHoraExtNormCalc = new TextSoloNumeros();
		txtPorcHoraExtNormCalc.setEditable(false);
		txtPorcHoraExtNormCalc.setBounds(183, 1590, 100, 23);
		panel.add(txtPorcHoraExtNormCalc);
		
		LabelSubtitulos lblsbtlsHoraExtra = new LabelSubtitulos("Horas Lab. Domingo");
		lblsbtlsHoraExtra.setText("% Hora Extra Extrao.");
		lblsbtlsHoraExtra.setBounds(10, 1620, 123, 23);
		panel.add(lblsbtlsHoraExtra);
		
		txtPorcHoraExtExtCalc = new TextSoloNumeros();
		txtPorcHoraExtExtCalc.setEditable(false);
		txtPorcHoraExtExtCalc.setBounds(183, 1620, 100, 23);
		panel.add(txtPorcHoraExtExtCalc);
		
		btnUsarDatos = new StandarButton((String) null);
		btnUsarDatos.setText("Usar");
		btnUsarDatos.setBounds(10, 611, 105, 30);
		btnUsarDatos.addActionListener(cche);
		panel.add(btnUsarDatos);
		
		btnModificarDatos = new StandarButton((String) null);
		btnModificarDatos.setText("Modificar");
		btnModificarDatos.setBounds(139, 611, 105, 30);
		btnModificarDatos.addActionListener(cche);
		panel.add(btnModificarDatos);
		
		btnEliminarDatos = new StandarButton((String) null);
		btnEliminarDatos.setText("Eliminar");
		btnEliminarDatos.setBounds(263, 611, 105, 30);
		btnEliminarDatos.addActionListener(cche);
		panel.add(btnEliminarDatos);
		
		btnModificarHR = new StandarButton((String) null);
		btnModificarHR.setText("Modificar");
		btnModificarHR.setBounds(10, 1410, 105, 30);
		btnModificarHR.addActionListener(cche);
		panel.add(btnModificarHR);
		
		btnEliminarHR = new StandarButton((String) null);
		btnEliminarHR.setText("Eliminar");
		btnEliminarHR.setBounds(139, 1410, 105, 30);
		btnEliminarHR.addActionListener(cche);
		panel.add(btnEliminarHR);
		
		txtId = new JTextField();
		txtId.setBounds(57, 348, 86, 20);
		panel.add(txtId);
		txtId.setVisible(false);
		txtId.setColumns(10);
		
		txtIdRH = new JTextField();
		txtIdRH.setText("");
		txtIdRH.setColumns(10);
		txtIdRH.setBounds(57, 860, 86, 20);
		txtIdRH.setVisible(false);
		panel.add(txtIdRH);
		
		ActualizarVista();
		ActualizarVistaHR();
		
	}
	
	public void VaciarForm() {
		
		txtHorasMasAlmuerzo.setText("");
		txtHorasSabado.setText("");
		txtHorasDomingo.setText("");
		txtValorHoraExtraNormal.setText("");
		txtValorHoraExtraExtrao.setText("");
		txtPrecioHora.setText("");
		txtId.setText("");
		
	}
	
	public void VaciarFormHR() {
		
		txtNombre.setText("");
		FechaRegistrarHoras.setCalendar(null);
		txtHorasEntrada.setText("00");
		txtMinutosEntrada.setText("00");
		txtHoraSalida.setText("00");
		txtMinutosSalida.setText("00");
		
		txtHorasTotHoras.setText("00");
		txtMinutosTotHoras.setText("00");
		
		txtHoraTotHorExt.setText("00");
		txtMinutosTotHorExt.setText("00");
		
		
		txtIdRH.setText("");
		
	}
	
	public void ActualizarVista() {
		VaciarForm();
		cche.LlenarTabla();
		
	}
	
	public void ActualizarVistaHR() {
		VaciarFormHR();
		cche.LlenarTablaRH();
		
	}
	
	
	public boolean camposVacios() {
		
		if(txtHorasMasAlmuerzo.getText().length() <= 0) {
			return false;
		}else if(txtHorasSabado.getText().length() <= 0) {
			return false;
		}else if(txtHorasDomingo.getText().length() <= 0) {
			return false;
		}else if(txtValorHoraExtraNormal.getText().length() <= 0) {
			return false;
		}else if(txtValorHoraExtraExtrao.getText().length() <= 0) {
			return false;
		}else if(txtPrecioHora.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	public boolean camposVaciosHorasTrabajadas() {
		
		if(txtNombre.getText().length() <= 0) {
			return false;
		}else if(FechaRegistrarHoras.getCalendar() == null) {
			return false;
		}else if(txtHorasEntrada.getText().length() <= 0) {
			return false;
		}else if(txtMinutosEntrada.getText().length() <= 0) {
			return false;
		}else if(txtHoraSalida.getText().length() <= 0) {
			return false;
		}else if(txtMinutosSalida.getText().length() <= 0) {
			return false;
		}else if(txtHorasTotHoras.getText().length() <= 0) {
			return false;
		}else if(txtMinutosTotHoras.getText().length() <= 0) {
			return false;
		}else if(txtHoraTotHorExt.getText().length() <= 0) {
			return false;
		}else if(txtMinutosTotHorExt.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}

	public boolean camposVaciosCalcular() {
		
		if(txtHorasLaboralesCalc.getText().length() <= 0) {
			return false;
		}else if(txtHorasLabSabCalc.getText().length() <= 0) {
			return false;
		}else if(txtHorasLabDominCalc.getText().length() <= 0) {
			return false;
		}else if(txtValorHoraExtrCalc.getText().length() <= 0) {
			return false;
		}else if(txtPorcHoraExtNormCalc.getText().length() <= 0) {
			return false;
		}else if(txtPorcHoraExtExtCalc.getText().length() <= 0) {
			return false;
		}else if(txtHoraExtraNormalMultip.getText().length() <= 0) {
			return false;
		}else if(txtHoraExtraExtraordMultip.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	public void CargarForm(CargarDatosEntity ape) {
	
		txtId.setText(""+ape.getId());
		
		txtHorasMasAlmuerzo.setText(String.valueOf(ape.getJornadaLabAlmuerzo()));
		txtHorasSabado.setText(String.valueOf(ape.getJornadaLabSabado()));
		txtHorasDomingo.setText(String.valueOf(ape.getJornadaLabDomingo()));
		txtValorHoraExtraNormal.setText(String.valueOf(ape.getValorHoraExtra()));
		txtValorHoraExtraExtrao.setText(String.valueOf(ape.getValorHoraExtraExtrao()));
		txtPrecioHora.setText(String.valueOf(ape.getPrecioHoraNormal()));
		
	}
	
	public void CargarFormRH(HorasTrabajadasEntity ape) {
		
		txtIdRH.setText(""+ape.getId());
		
		txtNombre.setText(String.valueOf(ape.getNombre()));
		FechaRegistrarHoras.setCalendar(ape.getFechaHoraRegistrada());
		txtHorasEntrada.setText(String.valueOf(ape.getHoraEntradaHora()));
		txtMinutosEntrada.setText(String.valueOf(ape.getHoraEntradaMinuto()));
		txtHoraSalida.setText(String.valueOf(ape.getHoraSalidaHora()));
		txtMinutosSalida.setText(String.valueOf(ape.getHoraSalidaMinuto()));
		
		txtHorasTotHoras.setText(String.valueOf(ape.getTotalHorasHora()));
		txtMinutosTotHoras.setText(String.valueOf(ape.getTotalHorasMinuto()));
		
		txtHoraTotHorExt.setText(String.valueOf(ape.getTotalHorasExtrasHora()));
		txtMinutosTotHorExt.setText(String.valueOf(ape.getTotalHorasExtrasMinuto()));
		
	}
	
	
	public DefaultTableModel getModel() {
		return tableCargarDatos.getModel();
	}
	
	public DefaultTableModel getModelRH() {
		return tableRegistrarHoras.getModel();
	}

	public StandarButton getBtnModificarDatos() {
		return btnModificarDatos;
	}

	public StandarButton getBtnEliminarDatos() {
		return btnEliminarDatos;
	}

	public StandarButton getBtnGuardarCargaDatos() {
		return btnGuardarCargaDatos;
	}

	public void setBtnModificarDatos(StandarButton btnModificarDatos) {
		this.btnModificarDatos = btnModificarDatos;
	}

	public void setBtnEliminarDatos(StandarButton btnEliminarDatos) {
		this.btnEliminarDatos = btnEliminarDatos;
	}

	public void setBtnGuardarCargaDatos(StandarButton btnGuardarCargaDatos) {
		this.btnGuardarCargaDatos = btnGuardarCargaDatos;
	}

	public TextSoloNumeros getTxtPrecioHora() {
		return txtPrecioHora;
	}

	public TextSoloNumeros getTxtValorHoraExtraExtrao() {
		return txtValorHoraExtraExtrao;
	}

	public TextSoloNumeros getTxtValorHoraExtraNormal() {
		return txtValorHoraExtraNormal;
	}

	public TextSoloNumeros getTxtHorasSabado() {
		return txtHorasSabado;
	}

	public TextSoloNumeros getTxtHorasMasAlmuerzo() {
		return txtHorasMasAlmuerzo;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtPrecioHora(TextSoloNumeros txtPrecioHora) {
		this.txtPrecioHora = txtPrecioHora;
	}

	public void setTxtValorHoraExtraExtrao(TextSoloNumeros txtValorHoraExtraExtrao) {
		this.txtValorHoraExtraExtrao = txtValorHoraExtraExtrao;
	}

	public void setTxtValorHoraExtraNormal(TextSoloNumeros txtValorHoraExtraNormal) {
		this.txtValorHoraExtraNormal = txtValorHoraExtraNormal;
	}

	public void setTxtHorasSabado(TextSoloNumeros txtHorasSabado) {
		this.txtHorasSabado = txtHorasSabado;
	}

	public void setTxtHorasMasAlmuerzo(TextSoloNumeros txtHorasMasAlmuerzo) {
		this.txtHorasMasAlmuerzo = txtHorasMasAlmuerzo;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public StandarButton getBtnUsarDatos() {
		return btnUsarDatos;
	}

	public void setBtnUsarDatos(StandarButton btnUsarDatos) {
		this.btnUsarDatos = btnUsarDatos;
	}

	public JTextField getTxtHorasLaboralesCalc() {
		return txtHorasLaboralesCalc;
	}

	public TextSoloNumeros getTxtHoraExtraNormalMultip() {
		return txtHoraExtraNormalMultip;
	}

	public TextSoloNumeros getTxtHorasLabDominCalc() {
		return txtHorasLabDominCalc;
	}

	public TextSoloNumeros getTxtHorasLabSabCalc() {
		return txtHorasLabSabCalc;
	}

	public TextSoloNumeros getTxtHorasDomingo() {
		return txtHorasDomingo;
	}

	public void setTxtHorasLaboralesCalc(JTextField txtHorasLaboralesCalc) {
		this.txtHorasLaboralesCalc = txtHorasLaboralesCalc;
	}

	public void setTxtHoraExtraNormalMultip(TextSoloNumeros txtHoraExtraNormalMultip) {
		this.txtHoraExtraNormalMultip = txtHoraExtraNormalMultip;
	}

	public void setTxtHorasLabDominCalc(TextSoloNumeros txtHorasLabDominCalc) {
		this.txtHorasLabDominCalc = txtHorasLabDominCalc;
	}

	public void setTxtHorasLabSabCalc(TextSoloNumeros txtHorasLabSabCalc) {
		this.txtHorasLabSabCalc = txtHorasLabSabCalc;
	}

	public void setTxtHorasDomingo(TextSoloNumeros txtHorasDomingo) {
		this.txtHorasDomingo = txtHorasDomingo;
	}

	public TableStandard getTableCargarDatos() {
		return tableCargarDatos;
	}

	public void setTableCargarDatos(TableStandard tableCargarDatos) {
		this.tableCargarDatos = tableCargarDatos;
	}

	public TextSoloNumeros getTxtValorHoraExtrCalc() {
		return txtValorHoraExtrCalc;
	}

	public TextSoloNumeros getTxtPorcHoraExtNormCalc() {
		return txtPorcHoraExtNormCalc;
	}

	public TextSoloNumeros getTxtPorcHoraExtExtCalc() {
		return txtPorcHoraExtExtCalc;
	}

	public void setTxtValorHoraExtrCalc(TextSoloNumeros txtValorHoraExtrCalc) {
		this.txtValorHoraExtrCalc = txtValorHoraExtrCalc;
	}

	public void setTxtPorcHoraExtNormCalc(TextSoloNumeros txtPorcHoraExtNormCalc) {
		this.txtPorcHoraExtNormCalc = txtPorcHoraExtNormCalc;
	}

	public void setTxtPorcHoraExtExtCalc(TextSoloNumeros txtPorcHoraExtExtCalc) {
		this.txtPorcHoraExtExtCalc = txtPorcHoraExtExtCalc;
	}

	public CalcularButton getBtnCalcularTotal() {
		return btnCalcularTotal;
	}

	public void setBtnCalcularTotal(CalcularButton btnCalcularTotal) {
		this.btnCalcularTotal = btnCalcularTotal;
	}

	public JDateChooser getFechaRegistrarHoras() {
		return FechaRegistrarHoras;
	}

	public void setFechaRegistrarHoras(JDateChooser fechaRegistrarHoras) {
		FechaRegistrarHoras = fechaRegistrarHoras;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public TextSoloNumeros getTxtMinutosSalida() {
		return txtMinutosSalida;
	}

	public TextSoloNumeros getTxtMinutosEntrada() {
		return txtMinutosEntrada;
	}

	public TextSoloNumeros getTxtHoraSalida() {
		return txtHoraSalida;
	}

	public TextSoloNumeros getTxtHorasEntrada() {
		return txtHorasEntrada;
	}

	public TextSoloNumeros getTxtMinutosTotHorExt() {
		return txtMinutosTotHorExt;
	}

	public TextSoloNumeros getTxtHoraTotHorExt() {
		return txtHoraTotHorExt;
	}

	public TextSoloNumeros getTxtMinutosTotHoras() {
		return txtMinutosTotHoras;
	}

	public TextSoloNumeros getTxtHorasTotHoras() {
		return txtHorasTotHoras;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public void setTxtMinutosSalida(TextSoloNumeros txtMinutosSalida) {
		this.txtMinutosSalida = txtMinutosSalida;
	}

	public void setTxtMinutosEntrada(TextSoloNumeros txtMinutosEntrada) {
		this.txtMinutosEntrada = txtMinutosEntrada;
	}

	public void setTxtHoraSalida(TextSoloNumeros txtHoraSalida) {
		this.txtHoraSalida = txtHoraSalida;
	}

	public void setTxtHorasEntrada(TextSoloNumeros txtHorasEntrada) {
		this.txtHorasEntrada = txtHorasEntrada;
	}

	public void setTxtMinutosTotHorExt(TextSoloNumeros txtMinutosTotHorExt) {
		this.txtMinutosTotHorExt = txtMinutosTotHorExt;
	}

	public void setTxtHoraTotHorExt(TextSoloNumeros txtHoraTotHorExt) {
		this.txtHoraTotHorExt = txtHoraTotHorExt;
	}

	public void setTxtMinutosTotHoras(TextSoloNumeros txtMinutosTotHoras) {
		this.txtMinutosTotHoras = txtMinutosTotHoras;
	}

	public void setTxtHorasTotHoras(TextSoloNumeros txtHorasTotHoras) {
		this.txtHorasTotHoras = txtHorasTotHoras;
	}

	public StandarButton getBtnGuardarRegistroHoras() {
		return btnGuardarRegistroHoras;
	}

	public void setBtnGuardarRegistroHoras(StandarButton btnGuardarRegistroHoras) {
		this.btnGuardarRegistroHoras = btnGuardarRegistroHoras;
	}

	public TextSoloNumeros getTxtTotalHorasExtrasNormal() {
		return txtTotalHorasExtrasNormal;
	}

	public TextSoloNumeros getTxtTotalHorasExtrExtrao() {
		return txtTotalHorasExtrExtrao;
	}

	public void setTxtTotalHorasExtrasNormal(TextSoloNumeros txtTotalHorasExtrasNormal) {
		this.txtTotalHorasExtrasNormal = txtTotalHorasExtrasNormal;
	}

	public void setTxtTotalHorasExtrExtrao(TextSoloNumeros txtTotalHorasExtrExtrao) {
		this.txtTotalHorasExtrExtrao = txtTotalHorasExtrExtrao;
	}

	public TextSoloNumeros getTxtHoraExtraExtraordMultip() {
		return txtHoraExtraExtraordMultip;
	}

	public void setTxtHoraExtraExtraordMultip(TextSoloNumeros txtHoraExtraExtraordMultip) {
		this.txtHoraExtraExtraordMultip = txtHoraExtraExtraordMultip;
	}

	public JTextField getTxtIdRH() {
		return txtIdRH;
	}

	public void setTxtIdRH(JTextField txtIdRH) {
		this.txtIdRH = txtIdRH;
	}

	public StandarButton getBtnEliminarHR() {
		return btnEliminarHR;
	}

	public StandarButton getBtnModificarHR() {
		return btnModificarHR;
	}

	public void setBtnEliminarHR(StandarButton btnEliminarHR) {
		this.btnEliminarHR = btnEliminarHR;
	}

	public void setBtnModificarHR(StandarButton btnModificarHR) {
		this.btnModificarHR = btnModificarHR;
	}

	public TableStandard getTableRegistrarHoras() {
		return tableRegistrarHoras;
	}

	public void setTableRegistrarHoras(TableStandard tableRegistrarHoras) {
		this.tableRegistrarHoras = tableRegistrarHoras;
	}

	public JDateChooser getFechaHastaRegistroHoraExtra() {
		return FechaHastaRegistroHoraExtra;
	}

	public void setFechaHastaRegistroHoraExtra(JDateChooser fechaHastaRegistroHoraExtra) {
		FechaHastaRegistroHoraExtra = fechaHastaRegistroHoraExtra;
	}

	public JDateChooser getFechaDesdeRegistroHoraExtra() {
		return FechaDesdeRegistroHoraExtra;
	}

	public void setFechaDesdeRegistroHoraExtra(JDateChooser fechaDesdeRegistroHoraExtra) {
		FechaDesdeRegistroHoraExtra = fechaDesdeRegistroHoraExtra;
	}

	public StandarButton getBtnBuscarPorFecha() {
		return btnBuscarPorFecha;
	}

	public void setBtnBuscarPorFecha(StandarButton btnBuscarPorFecha) {
		this.btnBuscarPorFecha = btnBuscarPorFecha;
	}
}
