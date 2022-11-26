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
import javax.swing.table.DefaultTableModel;
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
	private TextSoloNumeros txtProveedores;
	private TextSoloNumeros txtAcreedores;
	private TextSoloNumeros txtInteresesPorPagar;
	private TextSoloNumeros txtTotalPasCir;
	private TextSoloNumeros txtEdificios;
	private TextSoloNumeros txtTerreno;
	private TextSoloNumeros txtDepAcum;
	
	
	private StandarButton btnGuardar;
	private StandarButton btnImprimir;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	private StandarButton btnVaciarCampos;
	private StandarButton btnVerTodosLos;

	private TableStandard table;

	private TextSoloNumeros txtTotalActCir;

	private TextSoloNumeros txtISRPorPagar;

	private TextSoloNumeros txtAnticipoCliente;

	private TextSoloNumeros txtCapSoc;

	private TextSoloNumeros txtReser;

	private TextSoloNumeros txtResEjeAnt;

	private TextSoloNumeros txtReslEje;

	private TextSoloNumeros txtCapCon;

	private TextSoloNumeros txtMobYEq;

	private TextSoloNumeros txtDepA2;

	private TextSoloNumeros txtEqTrans;

	private TextSoloNumeros txtDepA3;

	private TextSoloNumeros txtEqCompu;

	private TextSoloNumeros txtDepA4;

	private TextSoloNumeros txtTotalActivoFijo;

	private CalcularButton btnTotalActivoFijo;

	private TextSoloNumeros txtRentPag;

	private TextSoloNumeros txtOactDif;

	private TextSoloNumeros txtTotalActDif;

	private CalcularButton btnTotalActDif;

	private TextSoloNumeros txtSumaAct;

	private CalcularButton btnSumaAct;

	private CalcularButton btnTotaPasCirc;

	private TextSoloNumeros txtDocPorPagar;

	private TextSoloNumeros txtTotPasALargoPlas;

	private CalcularButton btnTotaPasALargPlaz;

	private TextSoloNumeros txtSumaDelPasivo;

	private CalcularButton btnSumaDelPasivo;

	private CalcularButton btnTotaCapCon;

	private TextSoloNumeros txtSumaCapCon;

	private CalcularButton btnSumaCapCon;

	private TextSoloNumeros txtSumaCapConPas;

	private CalcularButton btnSumaCapConPas;
	private JDateChooser dateFecha;

	private CalcularButton btnTotalActCir;

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
		panel.setPreferredSize(new Dimension(748, 1500));
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
		
		txtNomEmpre = new JTextField();
		txtNomEmpre.setBounds(183, 107, 296, 24);
		panel.add(txtNomEmpre);
		txtNomEmpre.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblFecha.setBounds(502, 104, 39, 24);
		panel.add(lblFecha);
		
		dateFecha = new JDateChooser();
		dateFecha.setBounds(551, 104, 140, 27);
		panel.add(dateFecha);
		
		
		
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
		
		
		
		// activos
		
		JLabel lblNewLabel_2 = new JLabel("ACTIVOS");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2.setBounds(79, 154, 215, 24);
		panel.add(lblNewLabel_2);
		
		// activo circulante
		
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
		
		btnTotalActCir = new CalcularButton();
		btnTotalActCir.setBounds(329, 396, 33, 33);
		btnTotalActCir.addActionListener(control);
		panel.add(btnTotalActCir);
		
		
		// Fin activo circulante
		
		
		// Activo Fijo
		
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
		
		JLabel lblMobYEq = new JLabel("Mobiliario y equipo");
		lblMobYEq.setForeground(Color.WHITE);
		lblMobYEq.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMobYEq.setBounds(20, 585, 124, 24);
		panel.add(lblMobYEq);
		
		txtMobYEq = new TextSoloNumeros();
		txtMobYEq.setColumns(10);
		txtMobYEq.setBounds(171, 585, 199, 24);
		panel.add(txtMobYEq);
		
		JLabel lblDepA2 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA2.setForeground(Color.WHITE);
		lblDepA2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA2.setBounds(20, 619, 153, 24);
		panel.add(lblDepA2);
		
		txtDepA2 = new TextSoloNumeros();
		txtDepA2.setColumns(10);
		txtDepA2.setBounds(171, 619, 199, 24);
		panel.add(txtDepA2);
		
		JLabel lblEqTrans = new JLabel("Equipo de transporte");
		lblEqTrans.setForeground(Color.WHITE);
		lblEqTrans.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEqTrans.setBounds(20, 653, 153, 24);
		panel.add(lblEqTrans);
		
		txtEqTrans = new TextSoloNumeros();
		txtEqTrans.setColumns(10);
		txtEqTrans.setBounds(171, 653, 199, 24);
		panel.add(txtEqTrans);
		
		JLabel lblDepA3 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA3.setForeground(Color.WHITE);
		lblDepA3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA3.setBounds(20, 687, 153, 24);
		panel.add(lblDepA3);
		
		txtDepA3 = new TextSoloNumeros();
		txtDepA3.setColumns(10);
		txtDepA3.setBounds(171, 687, 199, 24);
		panel.add(txtDepA3);
		
		JLabel lblEqCompu = new JLabel("Equipo de computo");
		lblEqCompu.setForeground(Color.WHITE);
		lblEqCompu.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEqCompu.setBounds(20, 722, 153, 24);
		panel.add(lblEqCompu);
		
		txtEqCompu = new TextSoloNumeros();
		txtEqCompu.setColumns(10);
		txtEqCompu.setBounds(171, 722, 199, 24);
		panel.add(txtEqCompu);
		
		JLabel lblDepA4 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA4.setForeground(Color.WHITE);
		lblDepA4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA4.setBounds(20, 757, 153, 24);
		panel.add(lblDepA4);
		
		txtDepA4 = new TextSoloNumeros();
		txtDepA4.setColumns(10);
		txtDepA4.setBounds(171, 757, 199, 24);
		panel.add(txtDepA4);
		
		JLabel lblTotalActivoFijo = new JLabel("Total Activo Fijo");
		lblTotalActivoFijo.setForeground(Color.WHITE);
		lblTotalActivoFijo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalActivoFijo.setBounds(20, 792, 136, 24);
		panel.add(lblTotalActivoFijo);
		
		txtTotalActivoFijo = new TextSoloNumeros();
		txtTotalActivoFijo.setText("");
		txtTotalActivoFijo.setEditable(false);
		txtTotalActivoFijo.setColumns(10);
		txtTotalActivoFijo.setBounds(171, 792, 148, 24);
		panel.add(txtTotalActivoFijo);
		
		btnTotalActivoFijo = new CalcularButton();
		btnTotalActivoFijo.setBounds(329, 792, 33, 33);
		btnTotalActivoFijo.addActionListener(control);
		panel.add(btnTotalActivoFijo);
		
		
		/// Fin de activo Fijo
		
		
		// activo diferido
		
		JLabel lblActivoDiferido = new JLabel("Activo Diferido");
		lblActivoDiferido.setHorizontalAlignment(SwingConstants.CENTER);
		lblActivoDiferido.setForeground(Color.WHITE);
		lblActivoDiferido.setFont(new Font("Dialog", Font.BOLD, 12));
		lblActivoDiferido.setBounds(110, 842, 166, 24);
		panel.add(lblActivoDiferido);
		
		JLabel lblRentPag = new JLabel("Rentas pagadas por anticipado");
		lblRentPag.setForeground(Color.WHITE);
		lblRentPag.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblRentPag.setBounds(20, 877, 153, 24);
		panel.add(lblRentPag);
		
		txtRentPag = new TextSoloNumeros();
		txtRentPag.setColumns(10);
		txtRentPag.setBounds(171, 877, 199, 24);
		panel.add(txtRentPag);
		
		JLabel lblOactDif = new JLabel("Otros activos diferidos");
		lblOactDif.setForeground(Color.WHITE);
		lblOactDif.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblOactDif.setBounds(20, 912, 153, 24);
		panel.add(lblOactDif);
		
		txtOactDif = new TextSoloNumeros();
		txtOactDif.setColumns(10);
		txtOactDif.setBounds(171, 912, 199, 24);
		panel.add(txtOactDif);
		
		JLabel lblTotalActDif = new JLabel("Total Activo Diferido");
		lblTotalActDif.setForeground(Color.WHITE);
		lblTotalActDif.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalActDif.setBounds(20, 947, 136, 24);
		panel.add(lblTotalActDif);
		
		txtTotalActDif = new TextSoloNumeros();
		txtTotalActDif.setText("");
		txtTotalActDif.setEditable(false);
		txtTotalActDif.setColumns(10);
		txtTotalActDif.setBounds(171, 947, 148, 24);
		panel.add(txtTotalActDif);
		
		btnTotalActDif = new CalcularButton();
		btnTotalActDif.setBounds(329, 947, 33, 33);
		btnTotalActDif.addActionListener(control);
		panel.add(btnTotalActDif);
		
		// Fin activo diferido
		
		// SUMA DEL ACTIVO
		
		JLabel lblSumaAct = new JLabel("SUMA DEL ACTIVO");
		lblSumaAct.setForeground(Color.WHITE);
		lblSumaAct.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSumaAct.setBounds(20, 982, 141, 24);
		panel.add(lblSumaAct);
		
		txtSumaAct = new TextSoloNumeros();
		txtSumaAct.setEditable(false);
		txtSumaAct.setColumns(10);
		txtSumaAct.setBounds(171, 982, 144, 24);
		panel.add(txtSumaAct);
		
		btnSumaAct = new CalcularButton();
		btnSumaAct.setBounds(329, 982, 33, 33);
		btnSumaAct.addActionListener(control);
		panel.add(btnSumaAct);
		
		// FIN SUMA DEL ACTIVO
		
		
		// FIN ACTIVOS
		
		// centro
		/*JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(383, 581, 9, 400);
		panel.add(separator_2); */
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBounds(383, 141, 9, 900);
		panel.add(separator);
		
		
		// arriba de los botones
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(0, 1060, 748, 10);
		panel.add(separator_1_1);
		
		// PASIVOS
		

		JLabel lblPasivos = new JLabel("PASIVOS");
		lblPasivos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasivos.setForeground(Color.WHITE);
		lblPasivos.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPasivos.setBounds(435, 154, 215, 24);
		panel.add(lblPasivos);
		
		// pasivo circulante
		
		JLabel lblPasivoCirculante = new JLabel("Pasivo Circulante");
		lblPasivoCirculante.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasivoCirculante.setForeground(Color.WHITE);
		lblPasivoCirculante.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPasivoCirculante.setBounds(472, 188, 166, 24);
		panel.add(lblPasivoCirculante);
		
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
		
		txtInteresesPorPagar = new TextSoloNumeros();
		txtInteresesPorPagar.setColumns(10);
		txtInteresesPorPagar.setBounds(552, 292, 189, 24);
		panel.add(txtInteresesPorPagar);
		
		JLabel lblISRPorPagar = new JLabel("ISR por pagar");
		lblISRPorPagar.setForeground(Color.WHITE);
		lblISRPorPagar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblISRPorPagar.setBounds(401, 327, 153, 24);
		panel.add(lblISRPorPagar);
		
		txtISRPorPagar = new TextSoloNumeros();
		txtISRPorPagar.setColumns(10);
		txtISRPorPagar.setBounds(552, 327, 189, 24);
		panel.add(txtISRPorPagar);
		
		JLabel lblAnticipoCliente = new JLabel("Anticipo de clientes");
		lblAnticipoCliente.setForeground(Color.WHITE);
		lblAnticipoCliente.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAnticipoCliente.setBounds(401, 362, 140, 24);
		panel.add(lblAnticipoCliente);
		
		txtAnticipoCliente = new TextSoloNumeros();
		txtAnticipoCliente.setColumns(10);
		txtAnticipoCliente.setBounds(552, 362, 189, 24);
		panel.add(txtAnticipoCliente);
		
		JLabel lblTotHab = new JLabel("Total Pasivo Circulante");
		lblTotHab.setForeground(Color.WHITE);
		lblTotHab.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotHab.setBounds(400, 398, 141, 24);
		panel.add(lblTotHab);
		
		txtTotalPasCir = new TextSoloNumeros();
		txtTotalPasCir.setEditable(false);
		txtTotalPasCir.setColumns(10);
		txtTotalPasCir.setBounds(552, 398, 144, 24);
		panel.add(txtTotalPasCir);
		
		btnTotaPasCirc = new CalcularButton();
		btnTotaPasCirc.setBounds(704, 398, 33, 33);
		btnTotaPasCirc.addActionListener(control);
		panel.add(btnTotaPasCirc);
		
		// fin pasivo circulante
		
		
		// pasivo a largo plazo
		
		
		JLabel lblPasivoALargo = new JLabel("Pasivo a largo plazo");
		lblPasivoALargo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasivoALargo.setForeground(Color.WHITE);
		lblPasivoALargo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPasivoALargo.setBounds(471, 450, 166, 24);
		panel.add(lblPasivoALargo);
		
		JLabel lblDocumentosPorPagar = new JLabel("Documentos por pagar");
		lblDocumentosPorPagar.setForeground(Color.WHITE);
		lblDocumentosPorPagar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDocumentosPorPagar.setBounds(400, 484, 153, 24);
		panel.add(lblDocumentosPorPagar);
		
		txtDocPorPagar = new TextSoloNumeros();
		txtDocPorPagar.setColumns(10);
		txtDocPorPagar.setBounds(551, 484, 189, 24);
		panel.add(txtDocPorPagar);
		
		
		JLabel lblTotalPasivoA = new JLabel("Total Pasivo a largo plazo");
		lblTotalPasivoA.setForeground(Color.WHITE);
		lblTotalPasivoA.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalPasivoA.setBounds(399, 518, 141, 24);
		panel.add(lblTotalPasivoA);
		
		txtTotPasALargoPlas = new TextSoloNumeros();
		txtTotPasALargoPlas.setEditable(false);
		txtTotPasALargoPlas.setColumns(10);
		txtTotPasALargoPlas.setBounds(551, 518, 144, 24);
		panel.add(txtTotPasALargoPlas);
		

		btnTotaPasALargPlaz = new CalcularButton();
		btnTotaPasALargPlaz.setBounds(708, 517, 33, 33);
		btnTotaPasALargPlaz.addActionListener(control);
		panel.add(btnTotaPasALargPlaz);
		
		
		// fin pasivo a largo plazo
		
		// Suma del pasivo
		
		JLabel lblSumaDelPasivo = new JLabel("SUMA DEL PASIVO");
		lblSumaDelPasivo.setForeground(Color.WHITE);
		lblSumaDelPasivo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSumaDelPasivo.setBounds(399, 577, 141, 24);
		panel.add(lblSumaDelPasivo);
		
		txtSumaDelPasivo = new TextSoloNumeros();
		txtSumaDelPasivo.setEditable(false);
		txtSumaDelPasivo.setColumns(10);
		txtSumaDelPasivo.setBounds(551, 577, 144, 24);
		panel.add(txtSumaDelPasivo);
		
		btnSumaDelPasivo = new CalcularButton();
		btnSumaDelPasivo.setBounds(708, 577, 33, 33);
		btnSumaDelPasivo.addActionListener(control);
		panel.add(btnSumaDelPasivo);
		
		// fin Suma del pasivo
		
		// CAPITAL CONTABLE
		
				JLabel lblCapCont = new JLabel("CAPITAL CONTABLE");
				lblCapCont.setHorizontalAlignment(SwingConstants.CENTER);
				lblCapCont.setForeground(Color.WHITE);
				lblCapCont.setFont(new Font("Dialog", Font.BOLD, 12));
				lblCapCont.setBounds(472, 612, 166, 24);
				panel.add(lblCapCont);
				
				JLabel lblCapSoc = new JLabel("Capital social");
				lblCapSoc.setForeground(Color.WHITE);
				lblCapSoc.setFont(new Font("Dialog", Font.PLAIN, 12));
				lblCapSoc.setBounds(401, 647, 153, 24);
				panel.add(lblCapSoc);
				
				txtCapSoc = new TextSoloNumeros();
				txtCapSoc.setColumns(10);
				txtCapSoc.setBounds(552, 647, 189, 24);
				panel.add(txtCapSoc);
				
				JLabel lblReser = new JLabel("Reservas");
				lblReser.setForeground(Color.WHITE);
				lblReser.setFont(new Font("Dialog", Font.PLAIN, 12));
				lblReser.setBounds(401, 682, 153, 24);
				panel.add(lblReser);
				
				txtReser = new TextSoloNumeros();
				txtReser.setColumns(10);
				txtReser.setBounds(552, 682, 189, 24);
				panel.add(txtReser);
				
				JLabel lblResEjeAnt = new JLabel("Resultados de ejercicios anteriores");
				lblResEjeAnt.setForeground(Color.WHITE);
				lblResEjeAnt.setFont(new Font("Dialog", Font.PLAIN, 12));
				lblResEjeAnt.setBounds(401, 717, 153, 24);
				panel.add(lblResEjeAnt);
				
				txtResEjeAnt = new TextSoloNumeros();
				txtResEjeAnt.setColumns(10);
				txtResEjeAnt.setBounds(552, 717, 189, 24);
				panel.add(txtResEjeAnt);
				
				JLabel lblReslEje = new JLabel("Resultados del ejercicio");
				lblReslEje.setForeground(Color.WHITE);
				lblReslEje.setFont(new Font("Dialog", Font.PLAIN, 12));
				lblReslEje.setBounds(401, 752, 153, 24);
				panel.add(lblReslEje);
				
				txtReslEje = new TextSoloNumeros();
				txtReslEje.setColumns(10);
				txtReslEje.setBounds(552, 752, 189, 24);
				panel.add(txtReslEje);
				
				JLabel lblCapCon = new JLabel("Total Capital contable");
				lblCapCon.setForeground(Color.WHITE);
				lblCapCon.setFont(new Font("Dialog", Font.BOLD, 12));
				lblCapCon.setBounds(400, 787, 141, 24);
				panel.add(lblCapCon);
				
				txtCapCon = new TextSoloNumeros();
				txtCapCon.setEditable(false);
				txtCapCon.setColumns(10);
				txtCapCon.setBounds(552, 787, 144, 24);
				panel.add(txtCapCon);
				
				btnTotaCapCon = new CalcularButton();
				btnTotaCapCon.setBounds(704, 787, 33, 33);
				btnTotaCapCon.addActionListener(control);
				panel.add(btnTotaCapCon);
				
				// fin CAPITAL CONTABLE
		
				// suma del capital contable
				
				JLabel lblSumaCapCon = new JLabel("SUMA DEL CAPITAL CONTABLE");
				lblSumaCapCon.setForeground(Color.WHITE);
				lblSumaCapCon.setFont(new Font("Dialog", Font.BOLD, 14));
				lblSumaCapCon.setBounds(399, 822, 285, 24);
				panel.add(lblSumaCapCon);
				
				txtSumaCapCon = new TextSoloNumeros();
				txtSumaCapCon.setEditable(false);
				txtSumaCapCon.setColumns(10);
				txtSumaCapCon.setBounds(399, 857, 285, 24);
				panel.add(txtSumaCapCon);
				
				btnSumaCapCon = new CalcularButton();
				btnSumaCapCon.setBounds(708, 857, 33, 33);
				btnSumaCapCon.addActionListener(control);
				panel.add(btnSumaCapCon);
				

				// suma del capital contable
				
				// SUMA DEL PASIVO + CAPITAL CONTABLE
				
				JLabel lblSumaCapConPas = new JLabel("SUMA DEL PASIVO + CAPITAL CONTABLE");
				lblSumaCapConPas.setForeground(Color.WHITE);
				lblSumaCapConPas.setFont(new Font("Dialog", Font.BOLD, 14));
				lblSumaCapConPas.setBounds(399, 892, 285, 24);
				panel.add(lblSumaCapConPas);
				
				txtSumaCapConPas = new TextSoloNumeros();
				txtSumaCapConPas.setEditable(false);
				txtSumaCapConPas.setColumns(10);
				txtSumaCapConPas.setBounds(399, 927, 285, 24);
				panel.add(txtSumaCapConPas);
				
				btnSumaCapConPas = new CalcularButton();
				btnSumaCapConPas.setBounds(708, 927, 33, 33);
				btnSumaCapConPas.addActionListener(control);
				panel.add(btnSumaCapConPas);
				

				// suma del capital contable
		
		// BOTONES
		
		btnGuardar = new StandarButton("Guardar");
		btnGuardar.setSize(85, 30);
		btnGuardar.setLocation(653, 1000);
		btnGuardar.addActionListener(control);
		panel.add(btnGuardar);
		
		btnVaciarCampos = new StandarButton((String) null);
		btnVaciarCampos.setText("Vaciar Campos");
		btnVaciarCampos.setBounds(463, 1000, 143, 30);
		btnVaciarCampos.addActionListener(control);
		panel.add(btnVaciarCampos);
		
		
		// seccion de tabla 
		
		LabelSubtitulos lblsbtlsListado = new LabelSubtitulos("Listado");
		lblsbtlsListado.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsListado.setBounds(0, 1130, 748, 23);
		panel.add(lblsbtlsListado);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 1180, 728, 200);
		panel.add(scrollPane_1);
		
		table = new TableStandard();
		String columns[] = new String[] {
			"Id",
			"Nombre",
			"Fecha"
		};
		table.setColums(columns);
		scrollPane_1.setViewportView(table);
		
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
		
		actualizarVista();
		
	}
	
	
	public TextSoloNumeros getTxtCapCon() {
		return txtCapCon;
	}


	public CalcularButton getBtnTotaCapCon() {
		return btnTotaCapCon;
	}


	public TextSoloNumeros getTxtSumaCapCon() {
		return txtSumaCapCon;
	}


	public CalcularButton getBtnSumaCapCon() {
		return btnSumaCapCon;
	}


	public TextSoloNumeros getTxtSumaCapConPas() {
		return txtSumaCapConPas;
	}


	public CalcularButton getBtnSumaCapConPas() {
		return btnSumaCapConPas;
	}


	public void setTxtCapCon(TextSoloNumeros txtCapCon) {
		this.txtCapCon = txtCapCon;
	}


	public void setBtnTotaCapCon(CalcularButton btnTotaCapCon) {
		this.btnTotaCapCon = btnTotaCapCon;
	}


	public void setTxtSumaCapCon(TextSoloNumeros txtSumaCapCon) {
		this.txtSumaCapCon = txtSumaCapCon;
	}


	public void setBtnSumaCapCon(CalcularButton btnSumaCapCon) {
		this.btnSumaCapCon = btnSumaCapCon;
	}


	public void setTxtSumaCapConPas(TextSoloNumeros txtSumaCapConPas) {
		this.txtSumaCapConPas = txtSumaCapConPas;
	}


	public void setBtnSumaCapConPas(CalcularButton btnSumaCapConPas) {
		this.btnSumaCapConPas = btnSumaCapConPas;
	}


	public CalcularButton getBtnSumaDelPasivo() {
		return btnSumaDelPasivo;
	}


	public void setBtnSumaDelPasivo(CalcularButton btnSumaDelPasivo) {
		this.btnSumaDelPasivo = btnSumaDelPasivo;
	}


	public TextSoloNumeros getTxtSumaDelPasivo() {
		return txtSumaDelPasivo;
	}


	public void setTxtSumaDelPasivo(TextSoloNumeros txtSumaDelPasivo) {
		this.txtSumaDelPasivo = txtSumaDelPasivo;
	}


	public CalcularButton getBtnTotaPasALargPlaz() {
		return btnTotaPasALargPlaz;
	}


	public void setBtnTotaPasALargPlaz(CalcularButton btnTotaPasALargPlaz) {
		this.btnTotaPasALargPlaz = btnTotaPasALargPlaz;
	}


	public TextSoloNumeros getTxtTotPasALargoPlas() {
		return txtTotPasALargoPlas;
	}


	public void setTxtTotPasALargoPlas(TextSoloNumeros txtTotPasALargoPlas) {
		this.txtTotPasALargoPlas = txtTotPasALargoPlas;
	}


	public CalcularButton getBtnTotaPasCirc() {
		return btnTotaPasCirc;
	}


	public void setBtnTotaPasCirc(CalcularButton btnTotaPasCirc) {
		this.btnTotaPasCirc = btnTotaPasCirc;
	}


	public TextSoloNumeros getTxtTotalPasCir() {
		return txtTotalPasCir;
	}


	public void setTxtTotalPasCir(TextSoloNumeros txtTotalPasCir) {
		this.txtTotalPasCir = txtTotalPasCir;
	}


	public void actualizarVista() {
		vaciarAllForm();
		control.LlenarTabla();
	}
	
	public void cargarForm(BalanceGeneralEntity record) {
		
		vaciarAllForm();
		
		id = record.getId();
		
		txtNomEmpre.setText(record.getNomEmp());
		dateFecha.setCalendar(record.getFecha());
		
		// Activo Circulante
		txtCaja.setText(""+record.getCaja());
		txtBancos.setText(""+record.getBancos());
		txtInvCorPla.setText(""+record.getInvCorPla());
		txtCuentasCobrar.setText(""+record.getCuenPorCob());
		txtInventario.setText(""+record.getInventario());
		
		// Activo Fijo
		txtEdificios.setText(""+record.getEdificio());
		txtTerreno.setText(""+record.getTerreno());
		txtDepAcum.setText(""+record.getDepAcu1());
		txtMobYEq.setText(""+record.getMobEq());
		txtDepA2.setText(""+record.getDepAcu2());
		txtEqTrans.setText(""+record.getEqTransp());
		txtDepA3.setText(""+record.getDepAcu3());
		txtEqCompu.setText(""+record.getEqComp());
		txtDepA4.setText(""+record.getDepAcu4());
		
		// Activo Diferido
		txtRentPag.setText(""+record.getRentPagAnt());
		txtOactDif.setText(""+record.getDepAcu5());
		
		// Pasivo circulante
		txtProveedores.setText(""+record.getProveedores());
		txtAcreedores.setText(""+record.getAcreedores());
		txtInteresesPorPagar.setText(""+record.getIntPorPagar());
		txtISRPorPagar.setText(""+record.getISRporPagar());
		txtAnticipoCliente.setText(""+record.getAntiCliente());
		
		
		// pasivo a largo plazo
		txtDocPorPagar.setText(""+record.getDocPorPagar());
		
		
		// capital contable
		txtCapSoc.setText(""+record.getCapSoc());
		txtReser.setText(""+record.getReservas());
		txtResEjeAnt.setText(""+record.getResEjeAnt());
		txtReslEje.setText(""+record.getResEje());
		
		
		
	}
	
	public void vaciarAllForm() {
		
		id = 0L;
		
		txtNomEmpre.setText(" ");
		dateFecha.setCalendar(null);
		vaciarForm(getFormActivoCirculante());
		vaciarForm(getFormActivoFijo());
		vaciarForm(getFormActivoDiferido());
		vaciarForm(getFormPasivoCiculante());
		vaciarForm(getFormPasivoLargoPlazo());
		vaciarForm(getFormCapitalContable());
		
		txtTotalActCir.setText("");
		txtTotalActivoFijo.setText("");
		txtTotalActDif.setText("");
		txtSumaAct.setText("");
		txtTotalPasCir.setText("");
		txtTotPasALargoPlas.setText("");
		txtSumaDelPasivo.setText("");
		txtCapCon.setText("");
		txtSumaCapCon.setText("");
		txtSumaCapConPas.setText("");
		
	}


	public boolean camposVacios(){
		
		if(
			txtNomEmpre.getText().length() > 0 &&
			dateFecha.getCalendar() != null &&
			ValidarForm(getFormActivoCirculante()) &&
			ValidarForm(getFormActivoFijo()) &&
			ValidarForm(getFormActivoDiferido()) &&
			ValidarForm(getFormPasivoCiculante()) &&
			ValidarForm(getFormPasivoLargoPlazo()) &&
			ValidarForm(getFormCapitalContable())
				) return true;
		
		return false;
	}
	
	public TextSoloNumeros[] getFormActivoCirculante() {
		TextSoloNumeros[] form = {txtCaja, txtBancos,  txtInvCorPla, txtCuentasCobrar, txtInventario};
		return form; 
	}
	
	public TextSoloNumeros[] getFormActivoFijo() {
		TextSoloNumeros[] form = {txtEdificios, txtTerreno,  txtDepAcum, txtMobYEq, txtDepA2, txtEqTrans, txtDepA3, txtEqCompu, txtDepA4 };
		return form; 
	}
	
	public TextSoloNumeros[] getFormActivoDiferido() {
		TextSoloNumeros[] form = {txtRentPag, txtOactDif};
		return form; 
	}
	
	public TextSoloNumeros[] getFormPasivoCiculante() {
		TextSoloNumeros[] form = {txtProveedores, txtAcreedores,  txtInteresesPorPagar, txtISRPorPagar, txtAnticipoCliente};
		return form; 
	}
	
	public TextSoloNumeros[] getFormPasivoLargoPlazo() {
		TextSoloNumeros[] form = {txtDocPorPagar};
		return form; 
	}
	
	public TextSoloNumeros[] getFormCapitalContable() {
		TextSoloNumeros[] form = {txtCapSoc, txtReser,  txtResEjeAnt, txtReslEje};
		return form; 
	}
	
	
	public void vaciarForm(TextSoloNumeros[] form) {
		
		for(TextSoloNumeros text: form) {
			text.setText("");
		}
		
	}
	
	public boolean ValidarForm(TextSoloNumeros[] form) {
		
		for(TextSoloNumeros text: form) {
			if(text.getText().length() <= 0) return false;
		}

		return true;
	}
	
	public int CalcularTotal(TextSoloNumeros[] form) {
		
		int total = 0;
		
		for(TextSoloNumeros text: form) {
			total += Integer.parseInt(text.getText());
		}
		
		return total;
	}
	

	
	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public StandarButton getBtnImprimir() {
		return btnImprimir;
	}

	public StandarButton getBtnModificar() {
		return btnModificar;
	}
	
	public TextSoloNumeros getTxtEdificios() {
		return txtEdificios;
	}


	public TextSoloNumeros getTxtTerreno() {
		return txtTerreno;
	}


	public TextSoloNumeros getTxtDepAcum() {
		return txtDepAcum;
	}


	public TextSoloNumeros getTxtMobYEq() {
		return txtMobYEq;
	}


	public TextSoloNumeros getTxtDepA2() {
		return txtDepA2;
	}


	public TextSoloNumeros getTxtEqTrans() {
		return txtEqTrans;
	}


	public TextSoloNumeros getTxtDepA3() {
		return txtDepA3;
	}


	public TextSoloNumeros getTxtEqCompu() {
		return txtEqCompu;
	}


	public TextSoloNumeros getTxtDepA4() {
		return txtDepA4;
	}


	public void setTxtEdificios(TextSoloNumeros txtEdificios) {
		this.txtEdificios = txtEdificios;
	}


	public void setTxtTerreno(TextSoloNumeros txtTerreno) {
		this.txtTerreno = txtTerreno;
	}


	public void setTxtDepAcum(TextSoloNumeros txtDepAcum) {
		this.txtDepAcum = txtDepAcum;
	}


	public void setTxtMobYEq(TextSoloNumeros txtMobYEq) {
		this.txtMobYEq = txtMobYEq;
	}


	public void setTxtDepA2(TextSoloNumeros txtDepA2) {
		this.txtDepA2 = txtDepA2;
	}


	public void setTxtEqTrans(TextSoloNumeros txtEqTrans) {
		this.txtEqTrans = txtEqTrans;
	}


	public void setTxtDepA3(TextSoloNumeros txtDepA3) {
		this.txtDepA3 = txtDepA3;
	}


	public void setTxtEqCompu(TextSoloNumeros txtEqCompu) {
		this.txtEqCompu = txtEqCompu;
	}


	public void setTxtDepA4(TextSoloNumeros txtDepA4) {
		this.txtDepA4 = txtDepA4;
	}


	public TextSoloNumeros getTxtCaja() {
		return txtCaja;
	}


	public TextSoloNumeros getTxtBancos() {
		return txtBancos;
	}


	public TextSoloNumeros getTxtInvCorPla() {
		return txtInvCorPla;
	}


	public TextSoloNumeros getTxtCuentasCobrar() {
		return txtCuentasCobrar;
	}


	public TextSoloNumeros getTxtInventario() {
		return txtInventario;
	}


	public void setTxtCaja(TextSoloNumeros txtCaja) {
		this.txtCaja = txtCaja;
	}


	public void setTxtBancos(TextSoloNumeros txtBancos) {
		this.txtBancos = txtBancos;
	}


	public void setTxtInvCorPla(TextSoloNumeros txtInvCorPla) {
		this.txtInvCorPla = txtInvCorPla;
	}


	public void setTxtCuentasCobrar(TextSoloNumeros txtCuentasCobrar) {
		this.txtCuentasCobrar = txtCuentasCobrar;
	}


	public void setTxtInventario(TextSoloNumeros txtInventario) {
		this.txtInventario = txtInventario;
	}

	public StandarButton getBtnEliminar() {
		return btnEliminar;
	}

	public StandarButton getBtnVaciarCampos() {
		return btnVaciarCampos;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public void setBtnImprimir(StandarButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}
	 
		
	public void setBtnModificar(StandarButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public void setBtnEliminar(StandarButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public void setBtnVaciarCampos(StandarButton btnVaciarCampos) {
		this.btnVaciarCampos = btnVaciarCampos;
	}


	public JDateChooser getDateFecha() {
		return dateFecha;
	}


	public void setDateFecha(JDateChooser dateFecha) {
		this.dateFecha = dateFecha;
	}


	public JTextField getTxtNomEmpre() {
		return txtNomEmpre;
	}


	public void setTxtNomEmpre(JTextField txtNomEmpre) {
		this.txtNomEmpre = txtNomEmpre;
	}


	public TextSoloNumeros getTxtRentPag() {
		return txtRentPag;
	}


	public TextSoloNumeros getTxtOactDif() {
		return txtOactDif;
	}


	public void setTxtRentPag(TextSoloNumeros txtRentPag) {
		this.txtRentPag = txtRentPag;
	}


	public void setTxtOactDif(TextSoloNumeros txtOactDif) {
		this.txtOactDif = txtOactDif;
	}


	public TextSoloNumeros getTxtISRPorPagar() {
		return txtISRPorPagar;
	}


	public void setTxtISRPorPagar(TextSoloNumeros txtISRPorPagar) {
		this.txtISRPorPagar = txtISRPorPagar;
	}
	
	public TextSoloNumeros getTxtProveedores() {
		return txtProveedores;
	}


	public TextSoloNumeros getTxtAcreedores() {
		return txtAcreedores;
	}


	public TextSoloNumeros getTxtInteresesPorPagar() {
		return txtInteresesPorPagar;
	}


	public TextSoloNumeros getTxtAnticipoCliente() {
		return txtAnticipoCliente;
	}


	public void setTxtProveedores(TextSoloNumeros txtProveedores) {
		this.txtProveedores = txtProveedores;
	}


	public void setTxtAcreedores(TextSoloNumeros txtAcreedores) {
		this.txtAcreedores = txtAcreedores;
	}


	public void setTxtInteresesPorPagar(TextSoloNumeros txtInteresesPorPagar) {
		this.txtInteresesPorPagar = txtInteresesPorPagar;
	}


	public void setTxtAnticipoCliente(TextSoloNumeros txtAnticipoCliente) {
		this.txtAnticipoCliente = txtAnticipoCliente;
	}


	public TextSoloNumeros getTxtDocPorPagar() {
		return txtDocPorPagar;
	}


	public void setTxtDocPorPagar(TextSoloNumeros txtDocPorPagar) {
		this.txtDocPorPagar = txtDocPorPagar;
	}


	public TextSoloNumeros getTxtCapSoc() {
		return txtCapSoc;
	}


	public TextSoloNumeros getTxtReser() {
		return txtReser;
	}


	public TextSoloNumeros getTxtResEjeAnt() {
		return txtResEjeAnt;
	}


	public TextSoloNumeros getTxtReslEje() {
		return txtReslEje;
	}


	public void setTxtCapSoc(TextSoloNumeros txtCapSoc) {
		this.txtCapSoc = txtCapSoc;
	}


	public void setTxtReser(TextSoloNumeros txtReser) {
		this.txtReser = txtReser;
	}


	public void setTxtResEjeAnt(TextSoloNumeros txtResEjeAnt) {
		this.txtResEjeAnt = txtResEjeAnt;
	}


	public void setTxtReslEje(TextSoloNumeros txtReslEje) {
		this.txtReslEje = txtReslEje;
	}

	public DefaultTableModel getModel() {
		return table.getModel();
	}
	

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	public TableStandard getTable() {
		return table;
	}


	public void setTable(TableStandard table) {
		this.table = table;
	}


	public StandarButton getBtnVerTodosLos() {
		return btnVerTodosLos;
	}


	public void setBtnVerTodosLos(StandarButton btnVerTodosLos) {
		this.btnVerTodosLos = btnVerTodosLos;
	}


	public TextSoloNumeros getTxtTotalActCir() {
		return txtTotalActCir;
	}


	public void setTxtTotalActCir(TextSoloNumeros txtTotalActCir) {
		this.txtTotalActCir = txtTotalActCir;
	}


	public CalcularButton getBtnTotalActCir() {
		return btnTotalActCir;
	}


	public void setBtnTotalActCir(CalcularButton btnTotalActCir) {
		this.btnTotalActCir = btnTotalActCir;
	}


	public CalcularButton getBtnTotalActivoFijo() {
		return btnTotalActivoFijo;
	}


	public void setBtnTotalActivoFijo(CalcularButton btnTotalActivoFijo) {
		this.btnTotalActivoFijo = btnTotalActivoFijo;
	}


	public CalcularButton getBtnTotalActDif() {
		return btnTotalActDif;
	}


	public void setBtnTotalActDif(CalcularButton btnTotalActDif) {
		this.btnTotalActDif = btnTotalActDif;
	}


	public CalcularButton getBtnSumaAct() {
		return btnSumaAct;
	}


	public void setBtnSumaAct(CalcularButton btnSumaAct) {
		this.btnSumaAct = btnSumaAct;
	}


	public TextSoloNumeros getTxtSumaAct() {
		return txtSumaAct;
	}


	public void setTxtSumaAct(TextSoloNumeros txtSumaAct) {
		this.txtSumaAct = txtSumaAct;
	}


	public TextSoloNumeros getTxtTotalActDif() {
		return txtTotalActDif;
	}


	public void setTxtTotalActDif(TextSoloNumeros txtTotalActDif) {
		this.txtTotalActDif = txtTotalActDif;
	}


	public TextSoloNumeros getTxtTotalActivoFijo() {
		return txtTotalActivoFijo;
	}


	public void setTxtTotalActivoFijo(TextSoloNumeros txtTotalActivoFijo) {
		this.txtTotalActivoFijo = txtTotalActivoFijo;
	}


	
}
