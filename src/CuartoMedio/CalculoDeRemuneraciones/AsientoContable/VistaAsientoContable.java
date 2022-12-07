package CuartoMedio.CalculoDeRemuneraciones.AsientoContable;

import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import javax.swing.JSeparator;
import javax.swing.JTable;
import ui.Buttons.StandarButton;
import ui.Labels.LabelSubtitulos;
import ui.TablaUi.TableStandard;
import ui.Buttons.CalcularButton;
import ui.Texts.TextSoloNumeros;
import javax.swing.JFormattedTextField;

public class VistaAsientoContable extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 290221273055648484L;

	private Long id = 0l;

	private JTextField txtNomEmp;
	private JTextField txtCargo;
	
	private JFormattedTextField txtRut;
	private TextSoloNumeros txtSue;
	private TextSoloNumeros txtGra;
	private TextSoloNumeros txtHorExt;
	private TextSoloNumeros txtCom;
	private TextSoloNumeros txtBon;
	private TextSoloNumeros txtMov;
	private TextSoloNumeros txtCol;
	private TextSoloNumeros txtVia;
	private TextSoloNumeros txtAsiFam;
	private TextSoloNumeros txtTotDeb;
	private TextSoloNumeros txtAFP;
	private TextSoloNumeros txtFonasa;
	private TextSoloNumeros txtIsa;
	private TextSoloNumeros txtDifIsa;
	private TextSoloNumeros txtSegCes;
	private TextSoloNumeros txtImpUni;
	private TextSoloNumeros txtCuoSin;
	private TextSoloNumeros txtCuoBie;
	private TextSoloNumeros txtAntSue;
	private TextSoloNumeros txtTotHab;
	private TextSoloNumeros txtSulPagoRemun;
	private JTextField txtCajaBanRemu;
	private JTextField txtGlosaRemu;
	private TextSoloNumeros txtAportePatronal;
	private JTextField txtCajaBancoAportePatronal;
	private JTextField txtGlosaAportePatronal;

	private StandarButton btnGuardar;
	private StandarButton btnVaciarCampos;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	private StandarButton btnVerTodosLos;
	private StandarButton btnImprimir;

	private JDateChooser fechaEntrega;

	private TableStandard table;

	private ControlAsientoContable control;
	private CalcularButton btnDebe;
	private CalcularButton btnHaber;

	/**
	 * Create the panel.
	 */
	public VistaAsientoContable() {

		control = new ControlAsientoContable(this);

		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1120));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Asiento Contable de Remuneraciones");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 36, 748, 35);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre del Empleado");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1.setBounds(25, 74, 164, 20);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Rut");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(491, 74, 48, 20);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Cargo");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(25, 117, 164, 20);
		panel.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha Entrega");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(491, 117, 81, 20);
		panel.add(lblNewLabel_1_1_1);

		txtNomEmp = new JTextField();
		txtNomEmp.setBounds(169, 75, 314, 20);
		panel.add(txtNomEmp);
		txtNomEmp.setColumns(10);

		txtCargo = new JTextField();
		txtCargo.setColumns(10);
		txtCargo.setBounds(169, 118, 314, 20);
		panel.add(txtCargo);

		
		try {
			MaskFormatter mascaraR = new MaskFormatter("##.###.###-A");
			txtRut = new JFormattedTextField(mascaraR);
			txtRut.setColumns(10);
			txtRut.setBounds(582, 75, 150, 20);
			panel.add(txtRut);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		fechaEntrega = new JDateChooser();
		fechaEntrega.setBounds(582, 118, 150, 20);
		panel.add(fechaEntrega);

		JLabel lblNewLabel_1_2_1 = new JLabel("DEBE");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(0, 160, 375, 20);
		panel.add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("HABER");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_2_1_1.setBounds(373, 160, 375, 20);
		panel.add(lblNewLabel_1_2_1_1);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(370, 167, 7, 350);
		panel.add(separator);

		JLabel lblNewLabel_1_3 = new JLabel("Sueldos");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(25, 197, 164, 20);
		panel.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("Gratificaciones");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(25, 228, 164, 20);
		panel.add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel("Horas Extraordinarias");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5.setBounds(25, 259, 164, 20);
		panel.add(lblNewLabel_1_5);

		JLabel lblNewLabel_1_3_1 = new JLabel("Comisiones");
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1.setBounds(25, 290, 164, 20);
		panel.add(lblNewLabel_1_3_1);

		JLabel lblNewLabel_1_4_1 = new JLabel("Bonos");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1.setBounds(25, 321, 164, 20);
		panel.add(lblNewLabel_1_4_1);

		JLabel lblNewLabel_1_5_1 = new JLabel("Movilizacion");
		lblNewLabel_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1.setBounds(25, 352, 164, 20);
		panel.add(lblNewLabel_1_5_1);

		txtSue = new TextSoloNumeros();
		txtSue.setColumns(10);
		txtSue.setBounds(187, 197, 173, 20);
		panel.add(txtSue);

		txtGra = new TextSoloNumeros();
		txtGra.setColumns(10);
		txtGra.setBounds(187, 228, 173, 20);
		panel.add(txtGra);

		txtHorExt = new TextSoloNumeros();
		txtHorExt.setColumns(10);
		txtHorExt.setBounds(187, 259, 173, 20);
		panel.add(txtHorExt);

		JLabel lblNewLabel_1_3_1_1 = new JLabel("Colacion");
		lblNewLabel_1_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1_1.setBounds(25, 383, 164, 20);
		panel.add(lblNewLabel_1_3_1_1);

		JLabel lblNewLabel_1_4_1_1 = new JLabel("Viaticos");
		lblNewLabel_1_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1_1.setBounds(25, 414, 164, 20);
		panel.add(lblNewLabel_1_4_1_1);

		JLabel lblNewLabel_1_5_1_1 = new JLabel("Asignacion Familiar");
		lblNewLabel_1_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_1.setBounds(25, 445, 164, 20);
		panel.add(lblNewLabel_1_5_1_1);

		txtCom = new TextSoloNumeros();
		txtCom.setColumns(10);
		txtCom.setBounds(187, 290, 173, 20);
		panel.add(txtCom);

		txtBon = new TextSoloNumeros();
		txtBon.setColumns(10);
		txtBon.setBounds(187, 321, 173, 20);
		panel.add(txtBon);

		txtMov = new TextSoloNumeros();
		txtMov.setColumns(10);
		txtMov.setBounds(187, 352, 173, 20);
		panel.add(txtMov);

		txtCol = new TextSoloNumeros();
		txtCol.setColumns(10);
		txtCol.setBounds(187, 383, 173, 20);
		panel.add(txtCol);

		txtVia = new TextSoloNumeros();
		txtVia.setColumns(10);
		txtVia.setBounds(187, 414, 173, 20);
		panel.add(txtVia);

		txtAsiFam = new TextSoloNumeros();
		txtAsiFam.setColumns(10);
		txtAsiFam.setBounds(187, 445, 173, 20);
		panel.add(txtAsiFam);

		JLabel lblNewLabel_1_5_1_1_1 = new JLabel("TOTAL");
		lblNewLabel_1_5_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_1_1.setBounds(90, 487, 96, 20);
		panel.add(lblNewLabel_1_5_1_1_1);

		txtTotDeb = new TextSoloNumeros();
		txtTotDeb.setEditable(false);
		txtTotDeb.setColumns(10);
		txtTotDeb.setBounds(151, 487, 150, 20);
		panel.add(txtTotDeb);

		JLabel lblNewLabel_1_3_2 = new JLabel("AFP");
		lblNewLabel_1_3_2.setForeground(Color.WHITE);
		lblNewLabel_1_3_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_2.setBounds(387, 197, 164, 20);
		panel.add(lblNewLabel_1_3_2);

		txtAFP = new TextSoloNumeros();
		txtAFP.setColumns(10);
		txtAFP.setBounds(558, 197, 174, 20);
		panel.add(txtAFP);

		JLabel lblNewLabel_1_4_2 = new JLabel("FONASA");
		lblNewLabel_1_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_2.setBounds(387, 228, 164, 20);
		panel.add(lblNewLabel_1_4_2);

		txtFonasa = new TextSoloNumeros();
		txtFonasa.setColumns(10);
		txtFonasa.setBounds(558, 228, 174, 20);
		panel.add(txtFonasa);

		JLabel lblNewLabel_1_5_2 = new JLabel("ISAPRE");
		lblNewLabel_1_5_2.setForeground(Color.WHITE);
		lblNewLabel_1_5_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_2.setBounds(387, 259, 164, 20);
		panel.add(lblNewLabel_1_5_2);

		txtIsa = new TextSoloNumeros();
		txtIsa.setColumns(10);
		txtIsa.setBounds(558, 259, 174, 20);
		panel.add(txtIsa);

		JLabel lblNewLabel_1_3_1_2 = new JLabel("Diferencia de ISAPRE");
		lblNewLabel_1_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1_2.setBounds(387, 290, 135, 20);
		panel.add(lblNewLabel_1_3_1_2);

		txtDifIsa = new TextSoloNumeros();
		txtDifIsa.setColumns(10);
		txtDifIsa.setBounds(558, 290, 174, 20);
		panel.add(txtDifIsa);

		JLabel lblNewLabel_1_4_1_2 = new JLabel("Seguro de Cesantia");
		lblNewLabel_1_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1_2.setBounds(387, 321, 164, 20);
		panel.add(lblNewLabel_1_4_1_2);

		txtSegCes = new TextSoloNumeros();
		txtSegCes.setColumns(10);
		txtSegCes.setBounds(558, 321, 174, 20);
		panel.add(txtSegCes);

		JLabel lblNewLabel_1_5_1_2 = new JLabel("Impuesto Unico");
		lblNewLabel_1_5_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_2.setBounds(387, 352, 164, 20);
		panel.add(lblNewLabel_1_5_1_2);

		txtImpUni = new TextSoloNumeros();
		txtImpUni.setColumns(10);
		txtImpUni.setBounds(558, 352, 174, 20);
		panel.add(txtImpUni);

		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Cuota Sindical");
		lblNewLabel_1_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1_1_1.setBounds(387, 383, 164, 20);
		panel.add(lblNewLabel_1_3_1_1_1);

		txtCuoSin = new TextSoloNumeros();
		txtCuoSin.setColumns(10);
		txtCuoSin.setBounds(558, 383, 174, 20);
		panel.add(txtCuoSin);

		JLabel lblNewLabel_1_4_1_1_1 = new JLabel("Cuota Bienestar");
		lblNewLabel_1_4_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1_1_1.setBounds(387, 414, 164, 20);
		panel.add(lblNewLabel_1_4_1_1_1);

		txtCuoBie = new TextSoloNumeros();
		txtCuoBie.setColumns(10);
		txtCuoBie.setBounds(558, 414, 174, 20);
		panel.add(txtCuoBie);

		JLabel lblNewLabel_1_5_1_1_2 = new JLabel("Anticipo de Sueldo");
		lblNewLabel_1_5_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_1_2.setBounds(387, 445, 164, 20);
		panel.add(lblNewLabel_1_5_1_1_2);

		txtAntSue = new TextSoloNumeros();
		txtAntSue.setColumns(10);
		txtAntSue.setBounds(558, 445, 174, 20);
		panel.add(txtAntSue);

		JLabel lblNewLabel_1_5_1_1_1_1 = new JLabel("TOTAL");
		lblNewLabel_1_5_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_1_1_1.setBounds(465, 487, 96, 20);
		panel.add(lblNewLabel_1_5_1_1_1_1);

		txtTotHab = new TextSoloNumeros();
		txtTotHab.setEditable(false);
		txtTotHab.setColumns(10);
		txtTotHab.setBounds(526, 487, 150, 20);
		panel.add(txtTotHab);

		LabelSubtitulos lblTitulo2 = new LabelSubtitulos("Asien. cont. de pago de remuneraciones");
		lblTitulo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo2.setForeground(Color.WHITE);
		lblTitulo2.setBounds(0, 529, 375, 35);
		panel.add(lblTitulo2);

		JLabel lblNewLabel_1_3_3 = new JLabel("Sueldos Pagado");
		lblNewLabel_1_3_3.setForeground(Color.WHITE);
		lblNewLabel_1_3_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_3.setBounds(25, 575, 164, 20);
		panel.add(lblNewLabel_1_3_3);

		txtSulPagoRemun = new TextSoloNumeros();
		txtSulPagoRemun.setColumns(10);
		txtSulPagoRemun.setBounds(187, 575, 173, 20);
		panel.add(txtSulPagoRemun);

		JLabel lblNewLabel_1_4_3 = new JLabel("Caja o Banco");
		lblNewLabel_1_4_3.setForeground(Color.WHITE);
		lblNewLabel_1_4_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_3.setBounds(25, 606, 164, 20);
		panel.add(lblNewLabel_1_4_3);

		txtCajaBanRemu = new JTextField();
		txtCajaBanRemu.setColumns(10);
		txtCajaBanRemu.setBounds(187, 606, 173, 20);
		panel.add(txtCajaBanRemu);

		JLabel lblNewLabel_1_5_3 = new JLabel("Glosa");
		lblNewLabel_1_5_3.setForeground(Color.WHITE);
		lblNewLabel_1_5_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_3.setBounds(25, 637, 164, 20);
		panel.add(lblNewLabel_1_5_3);

		txtGlosaRemu = new JTextField();
		txtGlosaRemu.setColumns(10);
		txtGlosaRemu.setBounds(187, 637, 173, 20);
		panel.add(txtGlosaRemu);

		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(370, 555, 7, 112);
		panel.add(separator_1);

		JLabel lblNewLabel_1_3_3_1 = new JLabel("Aporte patronal");
		lblNewLabel_1_3_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_3_1.setBounds(387, 575, 164, 20);
		panel.add(lblNewLabel_1_3_3_1);

		txtAportePatronal = new TextSoloNumeros();
		txtAportePatronal.setColumns(10);
		txtAportePatronal.setBounds(558, 575, 174, 20);
		panel.add(txtAportePatronal);

		JLabel lblNewLabel_1_4_3_1 = new JLabel("Caja o Banco");
		lblNewLabel_1_4_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_3_1.setBounds(387, 606, 164, 20);
		panel.add(lblNewLabel_1_4_3_1);

		txtCajaBancoAportePatronal = new JTextField();
		txtCajaBancoAportePatronal.setColumns(10);
		txtCajaBancoAportePatronal.setBounds(558, 606, 174, 20);
		panel.add(txtCajaBancoAportePatronal);

		JLabel lblNewLabel_1_5_3_1 = new JLabel("Glosa");
		lblNewLabel_1_5_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_3_1.setBounds(387, 637, 164, 20);
		panel.add(lblNewLabel_1_5_3_1);

		txtGlosaAportePatronal = new JTextField();
		txtGlosaAportePatronal.setColumns(10);
		txtGlosaAportePatronal.setBounds(558, 637, 174, 20);
		panel.add(txtGlosaAportePatronal);

		LabelSubtitulos lblAsienContDe = new LabelSubtitulos("Asien. cont. de pago de aporte patronal");
		lblAsienContDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblAsienContDe.setForeground(Color.WHITE);
		lblAsienContDe.setBounds(373, 527, 375, 35);
		panel.add(lblAsienContDe);

		btnGuardar = new StandarButton("New button");
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(627, 685, 105, 30);
		btnGuardar.addActionListener(control);
		panel.add(btnGuardar);

		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(10, 526, 738, 7);
		panel.add(separator_2);

		JSeparator separator_ = new JSeparator();
		separator_.setForeground(Color.WHITE);
		separator_.setBounds(0, 733, 748, 12);
		panel.add(separator_);

		JSeparator separator1 = new JSeparator();
		separator1.setForeground(Color.WHITE);
		separator1.setBounds(0, 740, 748, 12);
		panel.add(separator1);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 845, 728, 200);
		panel.add(scrollPane_1);

		table = new TableStandard();
		String columns[] = new String[] { "Id", "Rut", "Nombre del empleado", "Cargo", "Fecha Entrega", "Sueldo"};
		table.setColums(columns);
		scrollPane_1.setViewportView(table);

		LabelSubtitulos lblsbtlsListado = new LabelSubtitulos((String) null);
		lblsbtlsListado.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsListado.setText("Listado");
		lblsbtlsListado.setBounds(0, 785, 748, 23);
		panel.add(lblsbtlsListado);

		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(10, 1080, 105, 30);
		btnModificar.addActionListener(control);
		panel.add(btnModificar);

		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(140, 1080, 105, 30);
		btnEliminar.addActionListener(control);
		panel.add(btnEliminar);

		btnVerTodosLos = new StandarButton((String) null);
		btnVerTodosLos.setText("Ver todos los Datos");
		btnVerTodosLos.setBounds(273, 1080, 150, 30);
		btnVerTodosLos.addActionListener(control);
		panel.add(btnVerTodosLos);

		btnImprimir = new StandarButton((String) null);
		btnImprimir.setText("Imprimir");
		btnImprimir.setBounds(445, 1080, 126, 30);
		btnImprimir.addActionListener(control);
		panel.add(btnImprimir);

		btnVaciarCampos = new StandarButton((String) null);
		btnVaciarCampos.setText("Vaciar Campos");
		btnVaciarCampos.setBounds(465, 685, 143, 30);
		btnVaciarCampos.addActionListener(control);
		panel.add(btnVaciarCampos);

		btnDebe = new CalcularButton();
		btnDebe.setBounds(328, 485, 32, 32);
		btnDebe.addActionListener(control);
		panel.add(btnDebe);

		btnHaber = new CalcularButton();
		btnHaber.setBounds(700, 487, 32, 32);
		btnHaber.addActionListener(control);
		panel.add(btnHaber);

		actualizarVista();

	}

	public void actualizarVista() {
		vaciarFormulario();
		control.llenarTabla();
	}

	public boolean camposVacios() {

		if (txtNomEmp.getText().length() <= 0 || txtRut.getText().length() <= 0 || txtCargo.getText().length() <= 0
				|| fechaEntrega.getCalendar() == null ||

				txtSue.getText().length() <= 0 || txtGra.getText().length() <= 0 || txtHorExt.getText().length() <= 0
				|| txtCom.getText().length() <= 0 || txtBon.getText().length() <= 0 || txtMov.getText().length() <= 0
				|| txtCol.getText().length() <= 0 || txtVia.getText().length() <= 0 || txtAsiFam.getText().length() <= 0
				||

				txtAFP.getText().length() <= 0 || txtFonasa.getText().length() <= 0 || txtIsa.getText().length() <= 0
				|| txtDifIsa.getText().length() <= 0 || txtSegCes.getText().length() <= 0
				|| txtImpUni.getText().length() <= 0 || txtCuoSin.getText().length() <= 0
				|| txtCuoBie.getText().length() <= 0 || txtAntSue.getText().length() <= 0 ||

				txtSulPagoRemun.getText().length() <= 0 || txtCajaBanRemu.getText().length() <= 0
				|| txtGlosaRemu.getText().length() <= 0 ||

				txtAportePatronal.getText().length() <= 0 || txtCajaBancoAportePatronal.getText().length() <= 0
				|| txtGlosaAportePatronal.getText().length() <= 0) {
			return false;
		}

		return true;
	}

	public void vaciarFormulario() {
		
		this.id = 0L;
		
		txtNomEmp.setText("");
		txtRut.setText("");
		txtCargo.setText("");
		fechaEntrega.setCalendar(null);

		txtSue.setText("");
		txtGra.setText("");
		txtHorExt.setText("");
		txtCom.setText("");
		txtBon.setText("");
		txtMov.setText("");
		txtCol.setText("");
		txtVia.setText("");
		txtAsiFam.setText("");

		txtAFP.setText("");
		txtFonasa.setText("");
		txtIsa.setText("");
		txtDifIsa.setText("");
		txtSegCes.setText("");
		txtImpUni.setText("");
		txtCuoSin.setText("");
		txtCuoBie.setText("");
		txtAntSue.setText("");

		txtSulPagoRemun.setText("");
		txtCajaBanRemu.setText("");
		txtGlosaRemu.setText("");

		txtAportePatronal.setText("");
		txtCajaBancoAportePatronal.setText("");
		txtGlosaAportePatronal.setText("");
		
		txtTotDeb.setText("");
		txtTotHab.setText("");
	}

	public void cargarForm(AsientoContable record) {

		this.id = record.getId();

		txtNomEmp.setText(record.getNomEmple());
		txtRut.setText(record.getRut());
		txtCargo.setText(record.getCargo());
		fechaEntrega.setCalendar(record.getFecha());  

		txtSue.setText("" + record.getSueldo());
		txtGra.setText("" + record.getGratificaciones());
		txtHorExt.setText("" + record.gethExtra());
		txtCom.setText("" + record.getComisones());
		txtBon.setText("" + record.getBonus());
		txtMov.setText("" + record.getMovili());
		txtCol.setText("" + record.getColacion());
		txtVia.setText("" + record.getViaticos());
		txtAsiFam.setText("" + record.getAsigfami());

		txtAFP.setText("" + record.getAfp());
		txtFonasa.setText("" + record.getFonasa());
		txtIsa.setText("" + record.getIsapre());
		txtDifIsa.setText("" + record.getDifIsapre());
		txtSegCes.setText("" + record.getSegSesan());
		txtImpUni.setText("" + record.getImpUni());
		txtCuoSin.setText("" + record.getCuotSind());
		txtCuoBie.setText("" + record.getCuotBiene());
		txtAntSue.setText("" + record.getAntSuel());

		txtSulPagoRemun.setText("" + record.getSulpagRem());
		txtCajaBanRemu.setText("" + record.getCajaBancoRem());
		txtGlosaRemu.setText("" + record.getGlosaRem());

		txtAportePatronal.setText("" + record.getSulpagPatro());
		txtCajaBancoAportePatronal.setText("" + record.getCajaBancoPatro());
		txtGlosaAportePatronal.setText("" + record.getGlosaPatro());

	}

	
	public DefaultTableModel getModel() {
		return table.getModel();
	}
	
	public JTextField getTxtNomEmp() {
		return txtNomEmp;
	}

	public void setTxtNomEmp(JTextField txtNomEmp) {
		this.txtNomEmp = txtNomEmp;
	}

	public JTextField getTxtCargo() {
		return txtCargo;
	}

	public void setTxtCargo(JTextField txtCargo) {
		this.txtCargo = txtCargo;
	}

	public JTextField getTextRut() {
		return txtRut;
	}

	

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JTextField getTxtFonasa() {
		return txtFonasa;
	}


	public JDateChooser getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(JDateChooser fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StandarButton getBtnVaciarCampos() {
		return btnVaciarCampos;
	}

	public void setBtnVaciarCampos(StandarButton btnVaciarCampos) {
		this.btnVaciarCampos = btnVaciarCampos;
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

	public StandarButton getBtnVerTodosLos() {
		return btnVerTodosLos;
	}

	public void setBtnVerTodosLos(StandarButton btnVerTodosLos) {
		this.btnVerTodosLos = btnVerTodosLos;
	}

	public StandarButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(StandarButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public TableStandard getTable() {
		return table;
	}

	public CalcularButton getBtnDebe() {
		return btnDebe;
	}

	public void setBtnDebe(CalcularButton btnDebe) {
		this.btnDebe = btnDebe;
	}

	public CalcularButton getBtnHaber() {
		return btnHaber;
	}

	public void setBtnHaber(CalcularButton btnHaber) {
		this.btnHaber = btnHaber;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public TextSoloNumeros getTxtSue() {
		return txtSue;
	}

	public void setTxtSue(TextSoloNumeros txtSue) {
		this.txtSue = txtSue;
	}

	public TextSoloNumeros getTxtGra() {
		return txtGra;
	}

	public void setTxtGra(TextSoloNumeros txtGra) {
		this.txtGra = txtGra;
	}

	public TextSoloNumeros getTxtHorExt() {
		return txtHorExt;
	}

	public void setTxtHorExt(TextSoloNumeros txtHorExt) {
		this.txtHorExt = txtHorExt;
	}

	public TextSoloNumeros getTxtCom() {
		return txtCom;
	}

	public void setTxtCom(TextSoloNumeros txtCom) {
		this.txtCom = txtCom;
	}

	public TextSoloNumeros getTxtBon() {
		return txtBon;
	}

	public void setTxtBon(TextSoloNumeros txtBon) {
		this.txtBon = txtBon;
	}

	public TextSoloNumeros getTxtMov() {
		return txtMov;
	}

	public void setTxtMov(TextSoloNumeros txtMov) {
		this.txtMov = txtMov;
	}

	public TextSoloNumeros getTxtCol() {
		return txtCol;
	}

	public void setTxtCol(TextSoloNumeros txtCol) {
		this.txtCol = txtCol;
	}

	public TextSoloNumeros getTxtVia() {
		return txtVia;
	}

	public void setTxtVia(TextSoloNumeros txtVia) {
		this.txtVia = txtVia;
	}

	public TextSoloNumeros getTxtAsiFam() {
		return txtAsiFam;
	}

	public void setTxtAsiFam(TextSoloNumeros txtAsiFam) {
		this.txtAsiFam = txtAsiFam;
	}

	public TextSoloNumeros getTxtTotDeb() {
		return txtTotDeb;
	}

	public void setTxtTotDeb(TextSoloNumeros txtTotDeb) {
		this.txtTotDeb = txtTotDeb;
	}

	public TextSoloNumeros getTxtAFP() {
		return txtAFP;
	}

	public void setTxtAFP(TextSoloNumeros txtAFP) {
		this.txtAFP = txtAFP;
	}

	public TextSoloNumeros getTxtIsa() {
		return txtIsa;
	}

	public void setTxtIsa(TextSoloNumeros txtIsa) {
		this.txtIsa = txtIsa;
	}

	public TextSoloNumeros getTxtDifIsa() {
		return txtDifIsa;
	}

	public void setTxtDifIsa(TextSoloNumeros txtDifIsa) {
		this.txtDifIsa = txtDifIsa;
	}

	public TextSoloNumeros getTxtSegCes() {
		return txtSegCes;
	}

	public void setTxtSegCes(TextSoloNumeros txtSegCes) {
		this.txtSegCes = txtSegCes;
	}

	public TextSoloNumeros getTxtImpUni() {
		return txtImpUni;
	}

	public void setTxtImpUni(TextSoloNumeros txtImpUni) {
		this.txtImpUni = txtImpUni;
	}

	public TextSoloNumeros getTxtCuoSin() {
		return txtCuoSin;
	}

	public void setTxtCuoSin(TextSoloNumeros txtCuoSin) {
		this.txtCuoSin = txtCuoSin;
	}

	public TextSoloNumeros getTxtCuoBie() {
		return txtCuoBie;
	}

	public void setTxtCuoBie(TextSoloNumeros txtCuoBie) {
		this.txtCuoBie = txtCuoBie;
	}

	public TextSoloNumeros getTxtAntSue() {
		return txtAntSue;
	}

	public void setTxtAntSue(TextSoloNumeros txtAntSue) {
		this.txtAntSue = txtAntSue;
	}

	public TextSoloNumeros getTxtTotHab() {
		return txtTotHab;
	}

	public void setTxtTotHab(TextSoloNumeros txtTotHab) {
		this.txtTotHab = txtTotHab;
	}

	public TextSoloNumeros getTxtSulPagoRemun() {
		return txtSulPagoRemun;
	}

	public void setTxtSulPagoRemun(TextSoloNumeros txtSulPagoRemun) {
		this.txtSulPagoRemun = txtSulPagoRemun;
	}

	public void setTxtCajaBanRemu(TextSoloNumeros txtCajaBanRemu) {
		this.txtCajaBanRemu = txtCajaBanRemu;
	}


	public void setTxtGlosaRemu(TextSoloNumeros txtGlosaRemu) {
		this.txtGlosaRemu = txtGlosaRemu;
	}

	public TextSoloNumeros getTxtAportePatronal() {
		return txtAportePatronal;
	}

	public void setTxtAportePatronal(TextSoloNumeros txtAportePatronal) {
		this.txtAportePatronal = txtAportePatronal;
	}

	
	public void setTxtCajaBancoAportePatronal(TextSoloNumeros txtCajaBancoAportePatronal) {
		this.txtCajaBancoAportePatronal = txtCajaBancoAportePatronal;
	}


	public void setTxtGlosaAportePatronal(TextSoloNumeros txtGlosaAportePatronal) {
		this.txtGlosaAportePatronal = txtGlosaAportePatronal;
	}

	public ControlAsientoContable getControl() {
		return control;
	}

	public void setControl(ControlAsientoContable control) {
		this.control = control;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setTxtFonasa(TextSoloNumeros txtFonasa) {
		this.txtFonasa = txtFonasa;
	}

	public JFormattedTextField getTxtRut() {
		return txtRut;
	}

	public void setTxtRut(JFormattedTextField txtRut) {
		this.txtRut = txtRut;
	}

	public JTextField getTxtCajaBanRemu() {
		return txtCajaBanRemu;
	}

	public JTextField getTxtGlosaRemu() {
		return txtGlosaRemu;
	}

	public JTextField getTxtCajaBancoAportePatronal() {
		return txtCajaBancoAportePatronal;
	}

	public JTextField getTxtGlosaAportePatronal() {
		return txtGlosaAportePatronal;
	}

	public void setTxtCajaBanRemu(JTextField txtCajaBanRemu) {
		this.txtCajaBanRemu = txtCajaBanRemu;
	}

	public void setTxtGlosaRemu(JTextField txtGlosaRemu) {
		this.txtGlosaRemu = txtGlosaRemu;
	}

	public void setTxtCajaBancoAportePatronal(JTextField txtCajaBancoAportePatronal) {
		this.txtCajaBancoAportePatronal = txtCajaBancoAportePatronal;
	}

	public void setTxtGlosaAportePatronal(JTextField txtGlosaAportePatronal) {
		this.txtGlosaAportePatronal = txtGlosaAportePatronal;
	}
}
