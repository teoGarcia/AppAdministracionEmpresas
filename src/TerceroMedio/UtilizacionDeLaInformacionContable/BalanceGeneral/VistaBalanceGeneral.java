package TerceroMedio.UtilizacionDeLaInformacionContable.BalanceGeneral;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;

import ui.Buttons.CalcularButton;
import ui.Buttons.StandarButton;
import ui.Labels.LabelSubtitulos;
import ui.TablaUi.TableStandard;
import ui.Texts.TextSoloNumeros;
import com.toedter.calendar.JDateChooser;
import java.awt.Rectangle;

public class VistaBalanceGeneral extends JPanel {
	
	private Long id = 0L;
	
	private ControlBalanceGeneral control;
	
	private JTextField txtNomEmpre;
	private TextSoloNumeros txtCaja;
	private TextSoloNumeros txtBancos;
	private TextSoloNumeros txtInvCorPla;
	private TextSoloNumeros txtCuentasCobrar;
	private TextSoloNumeros txtInventario;
	private TextSoloNumeros txtISR;
	private TextSoloNumeros txtProveedores;
	private TextSoloNumeros txtAcreedores;
	private TextSoloNumeros txtIntereses;
	private TextSoloNumeros txtTotHab;
	private TextSoloNumeros txtEdificios;
	private TextSoloNumeros txtTerreno;
	private TextSoloNumeros txtDepAcum;
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

	private TableStandard table;

	private TextSoloNumeros txtTotalActCir;
	private TextSoloNumeros txtCuoSindical;
	private JComboBox comboBoxCajaCompensacion;

	public VistaBalanceGeneral() {
		
		control = new ControlBalanceGeneral(this);
		
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
		
		
		JLabel lblTitulo = new JLabel("Balance General");
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
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblFecha.setBounds(502, 104, 39, 24);
		panel.add(lblFecha);
		
		txtNomEmpre = new JTextField();
		txtNomEmpre.setBounds(183, 107, 296, 24);
		panel.add(txtNomEmpre);
		txtNomEmpre.setColumns(10);
		
		try {
			MaskFormatter mascara = new MaskFormatter("##.###.###-A");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			MaskFormatter mascaraR = new MaskFormatter("##.###.###-A");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		JLabel lblNewLabel_2 = new JLabel("ACTIVOS");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2.setBounds(79, 154, 215, 24);
		panel.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBounds(383, 141, 9, 444);
		panel.add(separator);
		
		JLabel lblRemuneracion = new JLabel("Activo Circulante");
		lblRemuneracion.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemuneracion.setForeground(Color.WHITE);
		lblRemuneracion.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRemuneracion.setBounds(110, 188, 166, 24);
		panel.add(lblRemuneracion);
		
		JLabel lblSueBas = new JLabel("Caja");
		lblSueBas.setForeground(Color.WHITE);
		lblSueBas.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSueBas.setBounds(20, 222, 153, 24);
		panel.add(lblSueBas);
		
		txtCaja = new TextSoloNumeros();
		txtCaja.setColumns(10);
		txtCaja.setBounds(171, 222, 199, 24);
		panel.add(txtCaja);
		
		JLabel lblHorExt = new JLabel("Bancos");
		lblHorExt.setForeground(Color.WHITE);
		lblHorExt.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblHorExt.setBounds(20, 257, 153, 24);
		panel.add(lblHorExt);
		
		txtBancos = new TextSoloNumeros();
		txtBancos.setColumns(10);
		txtBancos.setBounds(171, 256, 199, 24);
		panel.add(txtBancos);
		
		JLabel lblBonGes = new JLabel("Inversiones a corto plazo");
		lblBonGes.setForeground(Color.WHITE);
		lblBonGes.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBonGes.setBounds(20, 292, 153, 24);
		panel.add(lblBonGes);
		
		txtInvCorPla = new TextSoloNumeros();
		txtInvCorPla.setColumns(10);
		txtInvCorPla.setBounds(171, 292, 199, 24);
		panel.add(txtInvCorPla);
		
		JLabel lblPar = new JLabel("Cuentas por Cobrar");
		lblPar.setForeground(Color.WHITE);
		lblPar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPar.setBounds(20, 327, 153, 24);
		panel.add(lblPar);
		
		txtCuentasCobrar = new TextSoloNumeros();
		txtCuentasCobrar.setColumns(10);
		txtCuentasCobrar.setBounds(171, 327, 199, 24);
		panel.add(txtCuentasCobrar);
		
		JLabel lblCom = new JLabel("Inventario");
		lblCom.setForeground(Color.WHITE);
		lblCom.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCom.setBounds(20, 362, 153, 24);
		panel.add(lblCom);
		
		txtInventario = new TextSoloNumeros();
		txtInventario.setColumns(10);
		txtInventario.setBounds(171, 362, 199, 24);
		panel.add(txtInventario);
		
		JLabel lblGra = new JLabel("ISR por pagar");
		lblGra.setForeground(Color.WHITE);
		lblGra.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblGra.setBounds(399, 326, 153, 24);
		panel.add(lblGra);
		
		txtISR = new TextSoloNumeros();
		txtISR.setColumns(10);
		txtISR.setBounds(552, 326, 189, 24);
		panel.add(txtISR);
		
		JLabel lblCarAsiFam = new JLabel("Proveedores");
		lblCarAsiFam.setForeground(Color.WHITE);
		lblCarAsiFam.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCarAsiFam.setBounds(401, 222, 153, 24);
		panel.add(lblCarAsiFam);
		
		txtProveedores = new TextSoloNumeros();
		txtProveedores.setColumns(10);
		txtProveedores.setBounds(552, 222, 189, 24);
		panel.add(txtProveedores);
		
		JLabel lblCol = new JLabel("Acreedores");
		lblCol.setForeground(Color.WHITE);
		lblCol.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCol.setBounds(401, 257, 153, 24);
		panel.add(lblCol);
		
		txtAcreedores = new TextSoloNumeros();
		txtAcreedores.setColumns(10);
		txtAcreedores.setBounds(552, 257, 189, 24);
		panel.add(txtAcreedores);
		
		JLabel lblMov = new JLabel("Intereses por pagar");
		lblMov.setForeground(Color.WHITE);
		lblMov.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMov.setBounds(401, 292, 153, 24);
		panel.add(lblMov);
		
		txtIntereses = new TextSoloNumeros();
		txtIntereses.setColumns(10);
		txtIntereses.setBounds(552, 292, 189, 24);
		panel.add(txtIntereses);
		
		JLabel lblTotHab = new JLabel("Total Pasivo Circulante");
		lblTotHab.setForeground(Color.WHITE);
		lblTotHab.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotHab.setBounds(400, 398, 141, 24);
		panel.add(lblTotHab);
		
		txtTotHab = new TextSoloNumeros();
		txtTotHab.setEditable(false);
		txtTotHab.setColumns(10);
		txtTotHab.setBounds(552, 398, 144, 24);
		panel.add(txtTotHab);
		
		JLabel lblActivoFijo = new JLabel("Activo Fijo");
		lblActivoFijo.setHorizontalAlignment(SwingConstants.CENTER);
		lblActivoFijo.setForeground(Color.WHITE);
		lblActivoFijo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblActivoFijo.setBounds(110, 449, 166, 24);
		panel.add(lblActivoFijo);
		
		JLabel lblEdic = new JLabel("Edificios");
		lblEdic.setForeground(Color.WHITE);
		lblEdic.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEdic.setBounds(20, 483, 124, 24);
		panel.add(lblEdic);
		
		txtEdificios = new TextSoloNumeros();
		txtEdificios.setColumns(10);
		txtEdificios.setBounds(171, 483, 199, 24);
		panel.add(txtEdificios);
		
		JLabel lblTerreno = new JLabel("Terrenos");
		lblTerreno.setForeground(Color.WHITE);
		lblTerreno.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTerreno.setBounds(20, 517, 136, 24);
		panel.add(lblTerreno);
		
		txtTerreno = new TextSoloNumeros();
		txtTerreno.setColumns(10);
		txtTerreno.setBounds(171, 517, 199, 24);
		panel.add(txtTerreno);
		
		JLabel lblDepAcum = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepAcum.setForeground(Color.WHITE);
		lblDepAcum.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepAcum.setBounds(20, 551, 153, 24);
		panel.add(lblDepAcum);
		
		txtDepAcum = new TextSoloNumeros();
		txtDepAcum.setColumns(10);
		txtDepAcum.setBounds(171, 551, 199, 24);
		panel.add(txtDepAcum);
		
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
		lblDescuentos2.setBounds(522, 449, 116, 24);
		panel.add(lblDescuentos2);
		
		JLabel lblCuoBie = new JLabel("Cuota Bienestar");
		lblCuoBie.setForeground(Color.WHITE);
		lblCuoBie.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCuoBie.setBounds(400, 586, 153, 24);
		panel.add(lblCuoBie);
		
		txtCuoBie = new TextSoloNumeros();
		txtCuoBie.setColumns(10);
		txtCuoBie.setBounds(551, 586, 189, 24);
		panel.add(txtCuoBie);
		
		JLabel lblAhoLib = new JLabel("Cuota Ahorro Libreta");
		lblAhoLib.setForeground(Color.WHITE);
		lblAhoLib.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAhoLib.setBounds(400, 621, 153, 24);
		panel.add(lblAhoLib);
		
		txtCuoAhoLib = new TextSoloNumeros();
		txtCuoAhoLib.setColumns(10);
		txtCuoAhoLib.setBounds(551, 621, 189, 24);
		panel.add(txtCuoAhoLib);
		
		JLabel lblCCFA = new JLabel("Caja de Compensaci\u00F3n");
		lblCCFA.setForeground(Color.WHITE);
		lblCCFA.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCCFA.setBounds(400, 669, 148, 24);
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
		btnCalcularHaberes.setLocation(706, 398);
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
		
		JLabel lblTotalActCir = new JLabel("Total Activo Circulante");
		lblTotalActCir.setForeground(Color.WHITE);
		lblTotalActCir.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalActCir.setBounds(20, 396, 136, 24);
		panel.add(lblTotalActCir);
		
		txtTotalActCir = new TextSoloNumeros();
		txtTotalActCir.setText("");
		txtTotalActCir.setEditable(false);
		txtTotalActCir.setColumns(10);
		txtTotalActCir.setBounds(171, 396, 148, 24);
		panel.add(txtTotalActCir);
		
		CalcularButton btnTotalActCir = new CalcularButton();
		btnTotalActCir.setBounds(329, 396, 33, 33);
		panel.add(btnTotalActCir);
		
		
		JLabel lblCuotaSindical = new JLabel("Cuota Sindical");
		lblCuotaSindical.setForeground(Color.WHITE);
		lblCuotaSindical.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCuotaSindical.setBounds(400, 726, 153, 24);
		panel.add(lblCuotaSindical);
		
		txtCuoSindical = new TextSoloNumeros();
		txtCuoSindical.setText("");
		txtCuoSindical.setColumns(10);
		txtCuoSindical.setBounds(551, 726, 189, 24);
		panel.add(txtCuoSindical);
		
		comboBoxCajaCompensacion = new JComboBox();
		comboBoxCajaCompensacion.setFont(new Font("Dialog", Font.PLAIN, 12));
		comboBoxCajaCompensacion.setModel(new DefaultComboBoxModel(new String[] {"Caja Los Andes", "Caja 18 Septiembre", "Caja Compensaci\u00F3n los Heroes", "La Araucana", "Caja Gabriela Mistral"}));
		comboBoxCajaCompensacion.setBounds(551, 656, 189, 23);
		panel.add(comboBoxCajaCompensacion);
		
		JDateChooser FechaPublicacion = new JDateChooser();
		FechaPublicacion.setBounds(551, 106, 135, 22);
		panel.add(FechaPublicacion);
		
		JLabel lblNewLabel_2_1 = new JLabel("PASIVOS");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(435, 154, 215, 24);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblPasivoCirculante = new JLabel("Pasivo Circulante");
		lblPasivoCirculante.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasivoCirculante.setForeground(Color.WHITE);
		lblPasivoCirculante.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPasivoCirculante.setBounds(472, 188, 166, 24);
		panel.add(lblPasivoCirculante);
		
		TextSoloNumeros txtAnticipo = new TextSoloNumeros();
		txtAnticipo.setColumns(10);
		txtAnticipo.setBounds(552, 364, 189, 24);
		panel.add(txtAnticipo);
		
		JLabel lblAnticipoDeCliente = new JLabel("Anticipo de cliente");
		lblAnticipoDeCliente.setForeground(Color.WHITE);
		lblAnticipoDeCliente.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAnticipoDeCliente.setBounds(399, 364, 153, 24);
		panel.add(lblAnticipoDeCliente);
		
		
		
		JLabel lblMobYEq = new JLabel("Mobiliario y equipo");
		lblMobYEq.setForeground(Color.WHITE);
		lblMobYEq.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMobYEq.setBounds(20, 585, 124, 24);
		panel.add(lblMobYEq);
		
		TextSoloNumeros txtMobYEq = new TextSoloNumeros();
		txtMobYEq.setColumns(10);
		txtMobYEq.setBounds(171, 585, 199, 24);
		panel.add(txtMobYEq);
		
		JLabel lblDepA2 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA2.setForeground(Color.WHITE);
		lblDepA2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA2.setBounds(20, 619, 153, 24);
		panel.add(lblDepA2);
		
		TextSoloNumeros txtDepA2 = new TextSoloNumeros();
		txtDepA2.setColumns(10);
		txtDepA2.setBounds(171, 619, 199, 24);
		panel.add(txtDepA2);
		
		JLabel lblEqTrans = new JLabel("Equipo de transporte");
		lblEqTrans.setForeground(Color.WHITE);
		lblEqTrans.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEqTrans.setBounds(20, 653, 153, 24);
		panel.add(lblEqTrans);
		
		TextSoloNumeros txtEqTrans = new TextSoloNumeros();
		txtEqTrans.setColumns(10);
		txtEqTrans.setBounds(171, 653, 199, 24);
		panel.add(txtEqTrans);
		
		JLabel lblDepA3 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA3.setForeground(Color.WHITE);
		lblDepA3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA3.setBounds(20, 687, 153, 24);
		panel.add(lblDepA3);
		
		TextSoloNumeros txtDepA3 = new TextSoloNumeros();
		txtDepA3.setColumns(10);
		txtDepA3.setBounds(171, 687, 199, 24);
		panel.add(txtDepA3);
		
		JLabel lblEqCompu = new JLabel("Equipo de cómputo");
		lblEqCompu.setForeground(Color.WHITE);
		lblEqCompu.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEqCompu.setBounds(20, 653, 153, 24);
		panel.add(lblEqCompu);
		
		TextSoloNumeros txtEqCompu = new TextSoloNumeros();
		txtEqCompu.setColumns(10);
		txtEqCompu.setBounds(171, 653, 199, 24);
		panel.add(txtEqCompu);
		
		JLabel lblDepA4 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA4.setForeground(Color.WHITE);
		lblDepA4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA4.setBounds(20, 687, 153, 24);
		panel.add(lblDepA4);
		
		TextSoloNumeros txtDepA4 = new TextSoloNumeros();
		txtDepA4.setColumns(10);
		txtDepA4.setBounds(171, 687, 199, 24);
		panel.add(txtDepA4);
		
		JLabel lblTotalActivoFijo = new JLabel("Total Activo Circulante");
		lblTotalActivoFijo.setForeground(Color.WHITE);
		lblTotalActivoFijo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalActivoFijo.setBounds(20, 721, 136, 24);
		panel.add(lblTotalActivoFijo);
		
		TextSoloNumeros txtTotalActivoFijo = new TextSoloNumeros();
		txtTotalActivoFijo.setText("");
		txtTotalActivoFijo.setEditable(false);
		txtTotalActivoFijo.setColumns(10);
		txtTotalActivoFijo.setBounds(171, 721, 148, 24);
		panel.add(txtTotalActivoFijo);
		
		CalcularButton btnTotalActivoFijo = new CalcularButton();
		btnTotalActivoFijo.setBounds(329, 721, 33, 33);
		panel.add(btnTotalActivoFijo);
		
		JLabel lblActivoDiferido = new JLabel("Activo Diferido");
		lblActivoDiferido.setHorizontalAlignment(SwingConstants.CENTER);
		lblActivoDiferido.setForeground(Color.WHITE);
		lblActivoDiferido.setFont(new Font("Dialog", Font.BOLD, 12));
		lblActivoDiferido.setBounds(110, 772, 166, 24);
		panel.add(lblActivoDiferido);
		
		JLabel lblRentPag = new JLabel("Rentas pagadas por anticipado");
		lblRentPag.setForeground(Color.WHITE);
		lblRentPag.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblRentPag.setBounds(20, 806, 153, 24);
		panel.add(lblRentPag);
		
		TextSoloNumeros txtRentPag = new TextSoloNumeros();
		txtRentPag.setColumns(10);
		txtRentPag.setBounds(171, 806, 199, 24);
		panel.add(txtRentPag);
		
		JLabel lblOactDif = new JLabel("Otros activos diferidos");
		lblOactDif.setForeground(Color.WHITE);
		lblOactDif.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblOactDif.setBounds(20, 840, 153, 24);
		panel.add(lblOactDif);
		
		TextSoloNumeros txtOactDif = new TextSoloNumeros();
		txtOactDif.setColumns(10);
		txtOactDif.setBounds(171, 840, 199, 24);
		panel.add(txtOactDif);
		
		JLabel lblTotalActDif = new JLabel("Total Activo Circulante");
		lblTotalActDif.setForeground(Color.WHITE);
		lblTotalActDif.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalActDif.setBounds(20, 874, 136, 24);
		panel.add(lblTotalActDif);
		
		TextSoloNumeros txtTotalActDif = new TextSoloNumeros();
		txtTotalActDif.setText("");
		txtTotalActDif.setEditable(false);
		txtTotalActDif.setColumns(10);
		txtTotalActDif.setBounds(171, 874, 148, 24);
		panel.add(txtTotalActDif);
		
		CalcularButton btnTotalActDif = new CalcularButton();
		btnTotalActDif.setBounds(329, 874, 33, 33);
		panel.add(btnTotalActDif);
		
	}
}
