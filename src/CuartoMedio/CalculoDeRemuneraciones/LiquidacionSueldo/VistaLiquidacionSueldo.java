package CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo;

import java.awt.Dimension;


import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import javax.swing.JSeparator;
import javax.swing.JTable;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import ui.Buttons.StandarButton;
import ui.Labels.LabelSubtitulos;
import ui.TablaUi.TableStandard;
import ui.Buttons.CalcularButton;
import ui.Texts.TextSoloNumeros;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;

public class VistaLiquidacionSueldo extends JPanel {
	
	private ControlLiquidacionSueldo control;
	
	private Long id = 0L;
	
	private JTextField txtNomEmpre;
	private JTextField txtNomTrab;
	private JFormattedTextField txtRutEmpre;
	private JFormattedTextField txtRutTrab;
	private TextSoloNumeros txtSueBas;
	private TextSoloNumeros txtHorExt;
	private TextSoloNumeros txtBonGesMen;
	private TextSoloNumeros txtPar;
	private TextSoloNumeros txtCom;
	private TextSoloNumeros txtGra;
	private TextSoloNumeros txtAsiFam;
	private TextSoloNumeros txtCol;
	private TextSoloNumeros txtAsiMov;
	private TextSoloNumeros txtTotHab;
	private TextSoloNumeros txtAFP;
	private TextSoloNumeros txtSegCes;
	private TextSoloNumeros txtSal;
	private TextSoloNumeros txtDifIsa;
	private TextSoloNumeros txtImpUni;
	private TextSoloNumeros txtCuoBie;
	private TextSoloNumeros txtCuoAhoLib;
	private TextSoloNumeros txtCCFA;
	private TextSoloNumeros txtTotDes;
	private JTextField txtSueLiqLet;
	private TextSoloNumeros txtAlcLiq;
	private TextSoloNumeros txtValAnt;
	private TextSoloNumeros txtTotSueLiq;
	
	private CalcularButton btnCalcularHaberes;
	private CalcularButton btnCalcularDescuentos;
	private CalcularButton btnCalcularTotal;
	
	private StandarButton btnGuardar;
	private StandarButton btnImprimir;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	private StandarButton btnVaciarCampos;
	private StandarButton btnVerTodosLos;
	
	private JYearChooser yearChooserPago;
	private JMonthChooser monthChooserPago;

	private TableStandard table;
	private TextSoloNumeros txtTotImponible;

	
	
	/**
	 * Create the panel.
	 */
	public VistaLiquidacionSueldo() {
		
		control = new ControlLiquidacionSueldo(this);
		
		setOpaque(false);
		setBounds(0, 0, 748, 722);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1500));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Liquidaci\u00F3n de sueldo");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitulo.setBounds(0, 36, 748, 45);
		panel.add(lblTitulo);
		
		JLabel lblNomEmp = new JLabel("Nombre de Empresa");
		lblNomEmp.setForeground(Color.WHITE);
		lblNomEmp.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNomEmp.setBounds(20, 104, 153, 24);
		panel.add(lblNomEmp);
		
		JLabel lblRutEmp = new JLabel("Rut");
		lblRutEmp.setForeground(Color.WHITE);
		lblRutEmp.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblRutEmp.setBounds(502, 104, 39, 24);
		panel.add(lblRutEmp);
		
		JLabel lblNomTra = new JLabel("Nombre de Trabajador");
		lblNomTra.setForeground(Color.WHITE);
		lblNomTra.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNomTra.setBounds(20, 145, 136, 24);
		panel.add(lblNomTra);
		
		JLabel lblRutTra = new JLabel("Rut");
		lblRutTra.setForeground(Color.WHITE);
		lblRutTra.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblRutTra.setBounds(502, 145, 39, 24);
		panel.add(lblRutTra);
		
		txtNomEmpre = new JTextField();
		txtNomEmpre.setBounds(183, 107, 296, 24);
		panel.add(txtNomEmpre);
		txtNomEmpre.setColumns(10);
		
		txtNomTrab = new JTextField();
		txtNomTrab.setColumns(10);
		txtNomTrab.setBounds(183, 146, 296, 24);
		panel.add(txtNomTrab);
		
		try {
			MaskFormatter mascara = new MaskFormatter("##.###.###-A");
			txtRutEmpre = new JFormattedTextField(mascara);
			txtRutEmpre.setColumns(10);
			txtRutEmpre.setBounds(551, 106, 189, 24);
			panel.add(txtRutEmpre);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			MaskFormatter mascaraR = new MaskFormatter("##.###.###-A");
			txtRutTrab = new JFormattedTextField(mascaraR);
			txtRutTrab.setColumns(10);
			txtRutTrab.setBounds(551, 145, 189, 24);
			panel.add(txtRutTrab);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		JLabel lblNewLabel_2 = new JLabel("Detalles de la Remuneraci\u00F3n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2.setBounds(20, 194, 215, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblPagSue = new JLabel("Pago de sueldo del mes de ");
		lblPagSue.setForeground(Color.WHITE);
		lblPagSue.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPagSue.setBounds(20, 229, 166, 24);
		panel.add(lblPagSue);
		
		monthChooserPago = new JMonthChooser();
		monthChooserPago.getComboBox().setFont(new Font("Dialog", Font.PLAIN, 12));
		monthChooserPago.setBounds(203, 228, 112, 25);
		panel.add(monthChooserPago);
		
		JLabel lblNewLabel_3 = new JLabel("de");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(335, 229, 26, 24);
		panel.add(lblNewLabel_3);
		
		yearChooserPago = new JYearChooser();
		yearChooserPago.getSpinner().setFont(new Font("Dialog", Font.PLAIN, 12));
		yearChooserPago.setBounds(373, 229, 72, 24);
		panel.add(yearChooserPago);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBounds(383, 274, 9, 239);
		panel.add(separator);
		
		JLabel lblRemuneracion = new JLabel("Remuneraci\u00F3n Imponible");
		lblRemuneracion.setForeground(Color.WHITE);
		lblRemuneracion.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRemuneracion.setBounds(110, 268, 166, 24);
		panel.add(lblRemuneracion);
		
		JLabel lblRemuneracion2 = new JLabel("Remuneraci\u00F3n no Imponible");
		lblRemuneracion2.setForeground(Color.WHITE);
		lblRemuneracion2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRemuneracion2.setBounds(493, 268, 177, 24);
		panel.add(lblRemuneracion2);
		
		JLabel lblSueBas = new JLabel("Sueldo Base");
		lblSueBas.setForeground(Color.WHITE);
		lblSueBas.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSueBas.setBounds(20, 314, 153, 24);
		panel.add(lblSueBas);
		
		txtSueBas = new TextSoloNumeros();
		txtSueBas.setColumns(10);
		txtSueBas.setBounds(171, 314, 199, 24);
		panel.add(txtSueBas);
		
		JLabel lblHorExt = new JLabel("Horas Extraordinarias");
		lblHorExt.setForeground(Color.WHITE);
		lblHorExt.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblHorExt.setBounds(20, 349, 153, 24);
		panel.add(lblHorExt);
		
		txtHorExt = new TextSoloNumeros();
		txtHorExt.setColumns(10);
		txtHorExt.setBounds(171, 349, 199, 24);
		panel.add(txtHorExt);
		
		JLabel lblBonGes = new JLabel("Bono de Gestion Mensual");
		lblBonGes.setForeground(Color.WHITE);
		lblBonGes.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBonGes.setBounds(20, 384, 153, 24);
		panel.add(lblBonGes);
		
		txtBonGesMen = new TextSoloNumeros();
		txtBonGesMen.setColumns(10);
		txtBonGesMen.setBounds(171, 384, 199, 24);
		panel.add(txtBonGesMen);
		
		JLabel lblPar = new JLabel("Participaci\u00F3n");
		lblPar.setForeground(Color.WHITE);
		lblPar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPar.setBounds(20, 419, 153, 24);
		panel.add(lblPar);
		
		txtPar = new TextSoloNumeros();
		txtPar.setColumns(10);
		txtPar.setBounds(171, 419, 199, 24);
		panel.add(txtPar);
		
		JLabel lblCom = new JLabel("Comisiones");
		lblCom.setForeground(Color.WHITE);
		lblCom.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCom.setBounds(20, 454, 153, 24);
		panel.add(lblCom);
		
		txtCom = new TextSoloNumeros();
		txtCom.setColumns(10);
		txtCom.setBounds(171, 454, 199, 24);
		panel.add(txtCom);
		
		JLabel lblGra = new JLabel("Gratificaci\u00F3n");
		lblGra.setForeground(Color.WHITE);
		lblGra.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblGra.setBounds(20, 489, 153, 24);
		panel.add(lblGra);
		
		txtGra = new TextSoloNumeros();
		txtGra.setColumns(10);
		txtGra.setBounds(171, 489, 199, 24);
		panel.add(txtGra);
		
		JLabel lblCarAsiFam = new JLabel("Cargas Asig. Familiar");
		lblCarAsiFam.setForeground(Color.WHITE);
		lblCarAsiFam.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCarAsiFam.setBounds(400, 314, 153, 24);
		panel.add(lblCarAsiFam);
		
		txtAsiFam = new TextSoloNumeros();
		txtAsiFam.setColumns(10);
		txtAsiFam.setBounds(551, 314, 189, 24);
		panel.add(txtAsiFam);
		
		JLabel lblCol = new JLabel("Asignaci\u00F3n de Colaci\u00F3n");
		lblCol.setForeground(Color.WHITE);
		lblCol.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCol.setBounds(400, 349, 153, 24);
		panel.add(lblCol);
		
		txtCol = new TextSoloNumeros();
		txtCol.setColumns(10);
		txtCol.setBounds(551, 349, 189, 24);
		panel.add(txtCol);
		
		JLabel lblMov = new JLabel("Asignaci\u00F3n de Movilizaci\u00F3n");
		lblMov.setForeground(Color.WHITE);
		lblMov.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMov.setBounds(400, 384, 153, 24);
		panel.add(lblMov);
		
		txtAsiMov = new TextSoloNumeros();
		txtAsiMov.setColumns(10);
		txtAsiMov.setBounds(551, 384, 189, 24);
		panel.add(txtAsiMov);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 575, 748, 10);
		panel.add(separator_1);
		
		JLabel lblTotHab = new JLabel("Total Haberes");
		lblTotHab.setForeground(Color.WHITE);
		lblTotHab.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotHab.setBounds(383, 540, 97, 24);
		panel.add(lblTotHab);
		
		txtTotHab = new TextSoloNumeros();
		txtTotHab.setEditable(false);
		txtTotHab.setColumns(10);
		txtTotHab.setBounds(481, 540, 148, 24);
		panel.add(txtTotHab);
		
		JLabel lblDescuentos = new JLabel("Descuentos Previsionales");
		lblDescuentos.setForeground(Color.WHITE);
		lblDescuentos.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDescuentos.setBounds(110, 586, 166, 24);
		panel.add(lblDescuentos);
		
		JLabel lblAFP = new JLabel("AFP");
		lblAFP.setForeground(Color.WHITE);
		lblAFP.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAFP.setBounds(20, 621, 153, 24);
		panel.add(lblAFP);
		
		txtAFP = new TextSoloNumeros();
		txtAFP.setColumns(10);
		txtAFP.setBounds(171, 621, 199, 24);
		panel.add(txtAFP);
		
		JLabel lblSegCes = new JLabel("Seguro de Cesantia");
		lblSegCes.setForeground(Color.WHITE);
		lblSegCes.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSegCes.setBounds(20, 656, 136, 24);
		panel.add(lblSegCes);
		
		txtSegCes = new TextSoloNumeros();
		txtSegCes.setColumns(10);
		txtSegCes.setBounds(171, 656, 199, 24);
		panel.add(txtSegCes);
		
		JLabel lblSal = new JLabel("Salud (7%)");
		lblSal.setForeground(Color.WHITE);
		lblSal.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSal.setBounds(20, 691, 153, 24);
		panel.add(lblSal);
		
		txtSal = new TextSoloNumeros();
		txtSal.setColumns(10);
		txtSal.setBounds(171, 691, 199, 24);
		panel.add(txtSal);
		
		JLabel lblDifIsa = new JLabel("Diferencia de Isapre");
		lblDifIsa.setForeground(Color.WHITE);
		lblDifIsa.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDifIsa.setBounds(20, 726, 153, 24);
		panel.add(lblDifIsa);
		
		txtDifIsa = new TextSoloNumeros();
		txtDifIsa.setColumns(10);
		txtDifIsa.setBounds(171, 726, 199, 24);
		panel.add(txtDifIsa);
		
		JLabel lblImpUni = new JLabel("Impuesto Unico");
		lblImpUni.setForeground(Color.WHITE);
		lblImpUni.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblImpUni.setBounds(20, 761, 153, 24);
		panel.add(lblImpUni);
		
		txtImpUni = new TextSoloNumeros();
		txtImpUni.setColumns(10);
		txtImpUni.setBounds(171, 761, 199, 24);
		panel.add(txtImpUni);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(383, 581, 9, 239);
		panel.add(separator_2);
		
		JLabel lblDescuentos2 = new JLabel("Otros descuentos");
		lblDescuentos2.setForeground(Color.WHITE);
		lblDescuentos2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDescuentos2.setBounds(536, 586, 116, 24);
		panel.add(lblDescuentos2);
		
		JLabel lblCuoBie = new JLabel("Cuota Bienestar");
		lblCuoBie.setForeground(Color.WHITE);
		lblCuoBie.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCuoBie.setBounds(400, 621, 153, 24);
		panel.add(lblCuoBie);
		
		txtCuoBie = new TextSoloNumeros();
		txtCuoBie.setColumns(10);
		txtCuoBie.setBounds(551, 621, 189, 24);
		panel.add(txtCuoBie);
		
		JLabel lblAhoLib = new JLabel("Cuota Ahorro Libreta");
		lblAhoLib.setForeground(Color.WHITE);
		lblAhoLib.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAhoLib.setBounds(400, 656, 153, 24);
		panel.add(lblAhoLib);
		
		txtCuoAhoLib = new TextSoloNumeros();
		txtCuoAhoLib.setColumns(10);
		txtCuoAhoLib.setBounds(551, 656, 189, 24);
		panel.add(txtCuoAhoLib);
		
		JLabel lblCCFA = new JLabel("Cr\u00E9dito CCFA La Araucana");
		lblCCFA.setForeground(Color.WHITE);
		lblCCFA.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCCFA.setBounds(400, 691, 153, 24);
		panel.add(lblCCFA);
		
		txtCCFA = new TextSoloNumeros();
		txtCCFA.setColumns(10);
		txtCCFA.setBounds(551, 691, 189, 24);
		panel.add(txtCCFA);
		
		JLabel lblTotDes = new JLabel("Total Descuentos");
		lblTotDes.setForeground(Color.WHITE);
		lblTotDes.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotDes.setBounds(245, 846, 124, 24);
		panel.add(lblTotDes);
		
		txtTotDes = new TextSoloNumeros();
		txtTotDes.setEditable(false);
		txtTotDes.setColumns(10);
		txtTotDes.setBounds(374, 847, 166, 24);
		panel.add(txtTotDes);
		
		JLabel lblSueLiqLet = new JLabel("Sueldo L\u00EDquido en Letras");
		lblSueLiqLet.setForeground(Color.WHITE);
		lblSueLiqLet.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSueLiqLet.setBounds(20, 910, 189, 24);
		panel.add(lblSueLiqLet);
		
		txtSueLiqLet = new JTextField();
		txtSueLiqLet.setColumns(10);
		txtSueLiqLet.setBounds(190, 910, 550, 24);
		panel.add(txtSueLiqLet);
		
		JLabel lblAlcLiq = new JLabel("Alcance L\u00EDquido");
		lblAlcLiq.setForeground(Color.WHITE);
		lblAlcLiq.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAlcLiq.setBounds(400, 945, 153, 24);
		panel.add(lblAlcLiq);
		
		txtAlcLiq = new TextSoloNumeros();
		txtAlcLiq.setEditable(false);
		txtAlcLiq.setColumns(10);
		txtAlcLiq.setBounds(551, 945, 189, 24);
		panel.add(txtAlcLiq);
		
		JLabel lblValAnt = new JLabel("Vales o Anticipos");
		lblValAnt.setForeground(Color.WHITE);
		lblValAnt.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblValAnt.setBounds(402, 980, 153, 24);
		panel.add(lblValAnt);
		
		txtValAnt = new TextSoloNumeros();
		txtValAnt.setText("0");
		txtValAnt.setColumns(10);
		txtValAnt.setBounds(553, 980, 189, 24);
		panel.add(txtValAnt);
		
		JLabel lblSueLiq = new JLabel("Sueldo L\u00EDquido");
		lblSueLiq.setForeground(Color.WHITE);
		lblSueLiq.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSueLiq.setBounds(402, 1015, 153, 24);
		panel.add(lblSueLiq);
		
		txtTotSueLiq = new TextSoloNumeros();
		txtTotSueLiq.setEditable(false);
		txtTotSueLiq.setColumns(10);
		txtTotSueLiq.setBounds(553, 1015, 189, 24);
		panel.add(txtTotSueLiq);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(0, 885, 748, 10);
		panel.add(separator_1_1);
		
		btnCalcularHaberes = new CalcularButton();
		btnCalcularHaberes.setLocation(653, 531);
		btnCalcularHaberes.addActionListener(control);
		panel.add(btnCalcularHaberes);
		
		btnCalcularDescuentos = new CalcularButton();
		btnCalcularDescuentos.setLocation(565, 839);
		btnCalcularDescuentos.addActionListener(control);
		panel.add(btnCalcularDescuentos);
		
		btnGuardar = new StandarButton("Guardar");
		btnGuardar.setSize(85, 30);
		btnGuardar.setLocation(653, 1060);
		btnGuardar.addActionListener(control);
		panel.add(btnGuardar);
		
		btnCalcularTotal = new CalcularButton();
		btnCalcularTotal.setLocation(365, 1000);
		btnCalcularTotal.addActionListener(control);
		panel.add(btnCalcularTotal);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 1180, 728, 200);
		panel.add(scrollPane_1);
		
		table = new TableStandard();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String columns[] = new String[] {
			"Id",
			"Rut de Trabajador",
			"Nombre de Trabajador",
			"Rut Empresa",
			"Nombre Empresa",
			"Sueldo Base",
		};
		table.setColums(columns);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setPreferredWidth(110);
		table.getColumnModel().getColumn(2).setPreferredWidth(180);
		table.getColumnModel().getColumn(3).setPreferredWidth(110);
		table.getColumnModel().getColumn(4).setPreferredWidth(180);
		table.getColumnModel().getColumn(5).setPreferredWidth(140);
		
		
		scrollPane_1.setViewportView(table);
		
		LabelSubtitulos lblsbtlsListado = new LabelSubtitulos((String) null);
		lblsbtlsListado.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsListado.setText("Listado");
		lblsbtlsListado.setBounds(0, 1130, 748, 23);
		panel.add(lblsbtlsListado);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(10, 1410, 105, 30);
		btnModificar.addActionListener(control);
		panel.add(btnModificar);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(140, 1410, 105, 30);
		btnEliminar.addActionListener(control);
		panel.add(btnEliminar);
		
		btnVerTodosLos = new StandarButton((String) null);
		btnVerTodosLos.setText("Ver todos los Datos");
		btnVerTodosLos.setBounds(273, 1410, 150, 30);
		btnVerTodosLos.addActionListener(control);
		panel.add(btnVerTodosLos);
		
		btnImprimir = new StandarButton((String) null);
		btnImprimir.setText("Imprimir");
		btnImprimir.setBounds(445, 1410, 126, 30);
		btnImprimir.addActionListener(control);
		panel.add(btnImprimir);
		
		btnVaciarCampos = new StandarButton((String) null);
		btnVaciarCampos.setText("Vaciar Campos");
		btnVaciarCampos.setBounds(463, 1060, 143, 30);
		btnVaciarCampos.addActionListener(control);
		panel.add(btnVaciarCampos);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(Color.BLACK);
		separator_1_2.setBounds(0, 1100, 748, 10);
		panel.add(separator_1_2);
		
		LabelSubtitulos lblsbtlssiElRut = new LabelSubtitulos((String) null);
		lblsbtlssiElRut.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlssiElRut.setFont(new Font("Dialog", Font.BOLD, 9));
		lblsbtlssiElRut.setText("(Si el rut es menor a 10 Millones ubicar un 0)");
		lblsbtlssiElRut.setBounds(502, 174, 238, 15);
		panel.add(lblsbtlssiElRut);
		
		LabelSubtitulos lblsbtlsEjk = new LabelSubtitulos((String) null);
		lblsbtlsEjk.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsEjk.setText("Ej: 09.999.999-K");
		lblsbtlsEjk.setFont(new Font("Dialog", Font.BOLD, 9));
		lblsbtlsEjk.setBounds(505, 187, 233, 15);
		panel.add(lblsbtlsEjk);
		
		txtTotImponible = new TextSoloNumeros();
		txtTotImponible.setText("");
		txtTotImponible.setEditable(false);
		txtTotImponible.setColumns(10);
		txtTotImponible.setBounds(222, 540, 148, 24);
		panel.add(txtTotImponible);
		
		JLabel lblTotalImponible = new JLabel("Total Imponible");
		lblTotalImponible.setForeground(Color.WHITE);
		lblTotalImponible.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalImponible.setBounds(102, 540, 110, 24);
		panel.add(lblTotalImponible);
		
	
		actualizarVista();

	}
	
	public void actualizarVista() {
		vaciarFormulario();
		control.LlenarTabla();
	}
	
	public boolean camposVacios() {
		
		if(txtNomEmpre.getText().length()<=0) {
			return false;		
		}else if(txtRutEmpre.getText().length()<=0) {
			return false;		
		}else if(txtNomTrab.getText().length()<=0) {
			return false;		
		}else if(txtRutTrab.getText().length()<=0) {
			return false;		
		}else if(txtSueBas.getText().length()<=0) {
			return false;		
		}else if(txtHorExt.getText().length()<=0) {
			return false;		
		}else if(txtBonGesMen.getText().length()<=0) {
			return false;		
		}else if(txtPar.getText().length()<=0) {
			return false;		
		}else if(txtCom.getText().length()<=0) {
			return false;		
		}else if(txtGra.getText().length()<=0) {
			return false;		
		}else if(txtAsiFam.getText().length()<=0) {
			return false;		
		}else if(txtCol.getText().length()<=0) {
			return false;		
		}else if(txtAsiMov.getText().length()<=0) {
			return false;		
		}else if(txtAFP.getText().length()<=0) {
			return false;		
		}else if(txtSegCes.getText().length()<=0) {
			return false;		
		}else if(txtSal.getText().length()<=0) {
			return false;		
		}else if(txtDifIsa.getText().length()<=0) {
			return false;		
		}else if(txtImpUni.getText().length()<=0) {
			return false;		
		}else if(txtCuoBie.getText().length()<=0) {
			return false;		
		}else if(txtCuoAhoLib.getText().length()<=0) {
			return false;		
		}else if(txtCCFA.getText().length()<=0) {
			return false;		
		}else if(txtSueLiqLet.getText().length()<=0) {
			return false;		
		}else if(txtValAnt.getText().length()<=0) {
			return false;		
		}
	
		return true;
	}
	
	public void vaciarFormulario() {
		
		this.id = 0L;
		
		txtNomEmpre.setText("");
		txtRutEmpre.setText("");
		txtNomTrab.setText("");
		txtRutTrab.setText("");
		getYearChooserPago().setYear(2022);
		monthChooserPago.setMonth(0);
		txtSueBas.setText("");
		txtHorExt.setText("");
		txtBonGesMen.setText("");
		txtPar.setText("");
		txtCom.setText("");
		txtGra.setText("");
		txtAsiFam.setText("");
		txtCol.setText("");
		txtAsiMov.setText("");
		txtAFP.setText("");
		txtSegCes.setText("");
		txtSal.setText("");
		txtDifIsa.setText("");
		txtImpUni.setText("");
		txtCuoBie.setText("");
		txtCuoAhoLib.setText("");
		txtCCFA.setText("");
		
		txtSueLiqLet.setText("");
		txtValAnt.setText("");
		
		txtTotDes.setText("");
		txtTotHab.setText("");
		
		txtAlcLiq.setText("");
		txtTotSueLiq.setText("");
		
		txtTotImponible.setText("");
		
	}
	
	public void cargarForm(LiquidacionSueldo record) {
		
		this.id = record.getId();
		
		txtNomEmpre.setText(record.getNomEmpresa());
		txtRutEmpre.setText(record.getRutEmpresa());
		txtNomTrab.setText(record.getNomTrabajador());
		txtRutTrab.setText(record.getRutTrabajador());
		getYearChooserPago().setYear(record.getAnio());
		monthChooserPago.setMonth(record.getMes());
		txtSueBas.setText(""+record.getSueldo());
		txtHorExt.setText(""+record.getHrasExtra());
		txtBonGesMen.setText(""+record.getBonoGesMen());
		txtPar.setText(""+record.getParticipacion());
		txtCom.setText(""+record.getComisiones());
		txtGra.setText(""+record.getGratificacion());
		txtAsiFam.setText(""+record.getCargFami());
		txtCol.setText(""+record.getAsigCola());
		txtAsiMov.setText(""+record.getAsigMovi());
		txtAFP.setText(""+record.getAfp());
		txtSegCes.setText(""+record.getSeguroCesantia());
		txtSal.setText(""+record.getSalud());
		txtDifIsa.setText(""+record.getDifIsap());
		txtImpUni.setText(""+record.getImpUni());
		txtCuoBie.setText(""+record.getCuoBie());
		txtCuoAhoLib.setText(""+record.getCuoAhorrLibr());
		txtCCFA.setText(""+record.getCredCCFAAra());
		
		txtSueLiqLet.setText(""+record.getSulLiqLetras());
		txtValAnt.setText(""+record.getValesAnticipos());
		
	}
	
	public DefaultTableModel getModel() {
		return table.getModel();
	}

	public JTextField getTxtSueBas() {
		return txtSueBas;
	}

	public ControlLiquidacionSueldo getControl() {
		return control;
	}

	public void setControl(ControlLiquidacionSueldo control) {
		this.control = control;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public JTextField getTxtNomEmpre() {
		return txtNomEmpre;
	}

	public void setTxtNomEmpre(JTextField txtNomEmpre) {
		this.txtNomEmpre = txtNomEmpre;
	}

	public JTextField getTxtNomTrab() {
		return txtNomTrab;
	}

	public void setTxtNomTrab(JTextField txtNomTrab) {
		this.txtNomTrab = txtNomTrab;
	}

	public TextSoloNumeros getTxtHorExt() {
		return txtHorExt;
	}

	public void setTxtHorExt(TextSoloNumeros txtHorExt) {
		this.txtHorExt = txtHorExt;
	}

	public TextSoloNumeros getTxtBonGesMen() {
		return txtBonGesMen;
	}

	public void setTxtBonGesMen(TextSoloNumeros txtBonGesMen) {
		this.txtBonGesMen = txtBonGesMen;
	}

	public TextSoloNumeros getTxtPar() {
		return txtPar;
	}

	public void setTxtPar(TextSoloNumeros txtPar) {
		this.txtPar = txtPar;
	}

	public TextSoloNumeros getTxtCom() {
		return txtCom;
	}

	public void setTxtCom(TextSoloNumeros txtCom) {
		this.txtCom = txtCom;
	}

	public TextSoloNumeros getTxtGra() {
		return txtGra;
	}

	public void setTxtGra(TextSoloNumeros txtGra) {
		this.txtGra = txtGra;
	}

	public TextSoloNumeros getTxtAsiFam() {
		return txtAsiFam;
	}

	public void setTxtAsiFam(TextSoloNumeros txtAsiFam) {
		this.txtAsiFam = txtAsiFam;
	}

	public TextSoloNumeros getTxtCol() {
		return txtCol;
	}

	public void setTxtCol(TextSoloNumeros txtCol) {
		this.txtCol = txtCol;
	}

	public TextSoloNumeros getTxtAsiMov() {
		return txtAsiMov;
	}

	public void setTxtAsiMov(TextSoloNumeros txtAsiMov) {
		this.txtAsiMov = txtAsiMov;
	}

	public JTextField getTxtTotHab() {
		return txtTotHab;
	}

	public void setTxtTotHab(TextSoloNumeros txtTotHab) {
		this.txtTotHab = txtTotHab;
	}

	public JTextField getTxtAFP() {
		return txtAFP;
	}

	public void setTxtAFP(TextSoloNumeros txtAFP) {
		this.txtAFP = txtAFP;
	}

	public TextSoloNumeros getTxtSegCes() {
		return txtSegCes;
	}

	public void setTxtSegCes(TextSoloNumeros txtSegCes) {
		this.txtSegCes = txtSegCes;
	}

	public TextSoloNumeros getTxtSal() {
		return txtSal;
	}

	public void setTxtSal(TextSoloNumeros txtSal) {
		this.txtSal = txtSal;
	}

	public JTextField getTxtDifIsa() {
		return txtDifIsa;
	}

	public void setTxtDifIsa(TextSoloNumeros txtDifIsa) {
		this.txtDifIsa = txtDifIsa;
	}

	public JTextField getTxtImpUni() {
		return txtImpUni;
	}

	public void setTxtImpUni(TextSoloNumeros txtImpUni) {
		this.txtImpUni = txtImpUni;
	}

	public TextSoloNumeros getTxtCuoBie() {
		return txtCuoBie;
	}

	public void setTxtCuoBie(TextSoloNumeros txtCuoBie) {
		this.txtCuoBie = txtCuoBie;
	}

	public TextSoloNumeros getTxtCuoAhoLib() {
		return txtCuoAhoLib;
	}

	public void setTxtCuoAhoLib(TextSoloNumeros txtCuoAhoLib) {
		this.txtCuoAhoLib = txtCuoAhoLib;
	}

	public TextSoloNumeros getTxtCCFA() {
		return txtCCFA;
	}

	public void setTxtCCFA(TextSoloNumeros txtCCFA) {
		this.txtCCFA = txtCCFA;
	}

	public TextSoloNumeros getTxtTotDes() {
		return txtTotDes;
	}

	public void setTxtTotDes(TextSoloNumeros txtTotDes) {
		this.txtTotDes = txtTotDes;
	}

	public JTextField getTxtSueLiqLet() {
		return txtSueLiqLet;
	}

	public void setTxtSueLiqLet(TextSoloNumeros txtSueLiqLet) {
		this.txtSueLiqLet = txtSueLiqLet;
	}

	public JTextField getTxtAlcLiq() {
		return txtAlcLiq;
	}

	public void setTxtAlcLiq(TextSoloNumeros txtAlcLiq) {
		this.txtAlcLiq = txtAlcLiq;
	}

	public JTextField getTxtValAnt() {
		return txtValAnt;
	}

	public void setTxtValAnt(TextSoloNumeros txtValAnt) {
		this.txtValAnt = txtValAnt;
	}

	public TextSoloNumeros getTxtTotSueLiq() {
		return txtTotSueLiq;
	}

	public void setTxtTotSueLiq(TextSoloNumeros txtTotSueLiq) {
		this.txtTotSueLiq = txtTotSueLiq;
	}

	public CalcularButton getBtnCalcularHaberes() {
		return btnCalcularHaberes;
	}

	public void setBtnCalcularHaberes(CalcularButton btnCalcularHaberes) {
		this.btnCalcularHaberes = btnCalcularHaberes;
	}

	public CalcularButton getBtnCalcularDescuentos() {
		return btnCalcularDescuentos;
	}

	public void setBtnCalcularDescuentos(CalcularButton btnCalcularDescuentos) {
		this.btnCalcularDescuentos = btnCalcularDescuentos;
	}

	public CalcularButton getBtnCalcularTotal() {
		return btnCalcularTotal;
	}

	public void setBtnCalcularTotal(CalcularButton btnCalcularTotal) {
		this.btnCalcularTotal = btnCalcularTotal;
	}

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public StandarButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(StandarButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public StandarButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(StandarButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public StandarButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(StandarButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public StandarButton getBtnVaciarCampos() {
		return btnVaciarCampos;
	}

	public void setBtnVaciarCampos(StandarButton btnVaciarCampos) {
		this.btnVaciarCampos = btnVaciarCampos;
	}

	public StandarButton getBtnVerTodosLos() {
		return btnVerTodosLos;
	}

	public void setBtnVerTodosLos(StandarButton btnVerTodosLos) {
		this.btnVerTodosLos = btnVerTodosLos;
	}

	public JYearChooser getYearChooserPago() {
		return yearChooserPago;
	}

	public void setYearChooserPago(JYearChooser yearChooserPago) {
		this.yearChooserPago = yearChooserPago;
	}

	public JMonthChooser getMonthChooserPago() {
		return monthChooserPago;
	}

	public void setMonthChooserPago(JMonthChooser monthChooserPago) {
		this.monthChooserPago = monthChooserPago;
	}

	public TableStandard getTable() {
		return table;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public void setTxtSueBas(TextSoloNumeros txtSueBas) {
		this.txtSueBas = txtSueBas;
	}

	public JFormattedTextField getTxtRutEmpre() {
		return txtRutEmpre;
	}

	public JFormattedTextField getTxtRutTrab() {
		return txtRutTrab;
	}

	public void setTxtRutEmpre(JFormattedTextField txtRutEmpre) {
		this.txtRutEmpre = txtRutEmpre;
	}

	public void setTxtRutTrab(JFormattedTextField txtRutTrab) {
		this.txtRutTrab = txtRutTrab;
	}

	public TextSoloNumeros getTxtTotImponible() {
		return txtTotImponible;
	}

	public void setTxtTotImponible(TextSoloNumeros txtTotImponible) {
		this.txtTotImponible = txtTotImponible;
	}
}
