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

	private TextSoloNumeros txtISRPorPagar;

	private TextSoloNumeros txtAnticipoCliente;

	private TextSoloNumeros txtCapSoc;

	private TextSoloNumeros txtReser;

	private TextSoloNumeros txtResEjeAnt;

	private TextSoloNumeros txtReslEje;

	private TextSoloNumeros txtCapCon;

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
		
		JDateChooser dateFecha = new JDateChooser();
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
		
		CalcularButton btnTotalActCir = new CalcularButton();
		btnTotalActCir.setBounds(329, 396, 33, 33);
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
		
		JLabel lblEqCompu = new JLabel("Equipo de c�mputo");
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
		
		
		/// Fin de activo Fijo
		
		
		// activo diferido
		
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
		
		// Fin activo diferido
		
		// SUMA DEL ACTIVO
		
		JLabel lblSumaAct = new JLabel("SUMA DEL ACTIVO");
		lblSumaAct.setForeground(Color.WHITE);
		lblSumaAct.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSumaAct.setBounds(20, 909, 141, 24);
		panel.add(lblSumaAct);
		
		TextSoloNumeros txtSumaAct = new TextSoloNumeros();
		txtSumaAct.setEditable(false);
		txtSumaAct.setColumns(10);
		txtSumaAct.setBounds(171, 909, 144, 24);
		panel.add(txtSumaAct);
		
		CalcularButton btnSumaAct = new CalcularButton();
		btnSumaAct.setBounds(329, 909, 33, 33);
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
		
		txtIntereses = new TextSoloNumeros();
		txtIntereses.setColumns(10);
		txtIntereses.setBounds(552, 292, 189, 24);
		panel.add(txtIntereses);
		
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
		
		txtTotHab = new TextSoloNumeros();
		txtTotHab.setEditable(false);
		txtTotHab.setColumns(10);
		txtTotHab.setBounds(552, 398, 144, 24);
		panel.add(txtTotHab);
		
		CalcularButton btnTotaPasCirc = new CalcularButton();
		btnTotaPasCirc.setBounds(704, 398, 33, 33);
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
		
		TextSoloNumeros txtDocPorPagar = new TextSoloNumeros();
		txtDocPorPagar.setColumns(10);
		txtDocPorPagar.setBounds(551, 484, 189, 24);
		panel.add(txtDocPorPagar);
		
		
		JLabel lblTotalPasivoA = new JLabel("Total Pasivo a largo plazo");
		lblTotalPasivoA.setForeground(Color.WHITE);
		lblTotalPasivoA.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalPasivoA.setBounds(399, 518, 141, 24);
		panel.add(lblTotalPasivoA);
		
		TextSoloNumeros txtTotPasALargoPlas = new TextSoloNumeros();
		txtTotPasALargoPlas.setEditable(false);
		txtTotPasALargoPlas.setColumns(10);
		txtTotPasALargoPlas.setBounds(551, 518, 144, 24);
		panel.add(txtTotPasALargoPlas);
		

		CalcularButton btnTotaPasALargPlaz = new CalcularButton();
		btnTotaPasALargPlaz.setBounds(708, 517, 33, 33);
		panel.add(btnTotaPasALargPlaz);
		
		
		// fin pasivo a largo plazo
		
		// Suma del pasivo
		
		JLabel lblSumaDelPasivo = new JLabel("SUMA DEL PASIVO");
		lblSumaDelPasivo.setForeground(Color.WHITE);
		lblSumaDelPasivo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSumaDelPasivo.setBounds(399, 577, 141, 24);
		panel.add(lblSumaDelPasivo);
		
		TextSoloNumeros txtSumaDelPasivo = new TextSoloNumeros();
		txtSumaDelPasivo.setEditable(false);
		txtSumaDelPasivo.setColumns(10);
		txtSumaDelPasivo.setBounds(551, 577, 144, 24);
		panel.add(txtSumaDelPasivo);
		
		CalcularButton btnSumaDelPasivo = new CalcularButton();
		btnSumaDelPasivo.setBounds(708, 577, 33, 33);
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
				
				CalcularButton btnTotaCapCon = new CalcularButton();
				btnTotaCapCon.setBounds(704, 787, 33, 33);
				panel.add(btnTotaCapCon);
				
				// fin CAPITAL CONTABLE
		
				// suma del capital contable
				
				JLabel lblSumaCapCon = new JLabel("SUMA DEL CAPITAL CONTABLE");
				lblSumaCapCon.setForeground(Color.WHITE);
				lblSumaCapCon.setFont(new Font("Dialog", Font.BOLD, 14));
				lblSumaCapCon.setBounds(399, 822, 285, 24);
				panel.add(lblSumaCapCon);
				
				TextSoloNumeros txtSumaCapCon = new TextSoloNumeros();
				txtSumaCapCon.setEditable(false);
				txtSumaCapCon.setColumns(10);
				txtSumaCapCon.setBounds(399, 857, 285, 24);
				panel.add(txtSumaCapCon);
				
				CalcularButton btnSumaCapCon = new CalcularButton();
				btnSumaCapCon.setBounds(708, 857, 33, 33);
				panel.add(btnSumaCapCon);
				

				// suma del capital contable
				
				// SUMA DEL PASIVO + CAPITAL CONTABLE
				
				JLabel lblSumaCapConPas = new JLabel("SUMA DEL PASIVO + CAPITAL CONTABLE");
				lblSumaCapConPas.setForeground(Color.WHITE);
				lblSumaCapConPas.setFont(new Font("Dialog", Font.BOLD, 14));
				lblSumaCapConPas.setBounds(399, 892, 285, 24);
				panel.add(lblSumaCapConPas);
				
				TextSoloNumeros txtSumaCapConPas = new TextSoloNumeros();
				txtSumaCapConPas.setEditable(false);
				txtSumaCapConPas.setColumns(10);
				txtSumaCapConPas.setBounds(399, 927, 285, 24);
				panel.add(txtSumaCapConPas);
				
				CalcularButton btnSumaCapConPas = new CalcularButton();
				btnSumaCapConPas.setBounds(708, 927, 33, 33);
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
		
		
		
	}
}
