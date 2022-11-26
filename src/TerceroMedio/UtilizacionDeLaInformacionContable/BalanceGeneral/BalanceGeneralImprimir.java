package TerceroMedio.UtilizacionDeLaInformacionContable.BalanceGeneral;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import ui.imprimir.PanelImprimirI;

public class BalanceGeneralImprimir extends PanelImprimirI<BalanceGeneralEntity> {

	private JLabel txtNomEmpre;
	private JLabel dateFecha;
	private JLabel txtCaja;
	private JLabel txtBancos;
	private JLabel txtInvCorPla;
	private JLabel txtCuentasCobrar;
	private JLabel txtInventario;
	private JLabel txtTotalActCir;
	private JLabel txtEdificios;
	private JLabel txtTerreno;
	private JLabel txtDepAcum;
	private JLabel txtMobYEq;
	private JLabel txtDepA2;
	private JLabel txtEqTrans;
	private JLabel txtDepA3;
	private JLabel txtEqCompu;
	private JLabel txtDepA4;
	private JLabel txtTotalActivoFijo;
	private JLabel txtRentPag;
	private JLabel txtOactDif;
	private JLabel txtTotalActDif;
	private JLabel txtSumaAct;
	private JLabel txtProveedores;
	private JLabel txtAcreedores;
	private JLabel txtInteresesPorPagar;
	private JLabel txtISRPorPagar;
	private JLabel txtAnticipoCliente;
	private JLabel txtTotalPasCir;
	private JLabel txtDocPorPagar;
	private JLabel txtTotPasALargoPlas;
	private JLabel txtSumaDelPasivo;
	private JLabel txtCapSoc;
	private JLabel txtReser;
	private JLabel txtResEjeAnt;
	private JLabel txtReslEje;
	private JLabel txtCapCon;
	private JLabel txtSumaCapCon;

	public BalanceGeneralImprimir(){
		super("Balance General");
		
		JLabel lblNomEmp = new JLabel("Nombre de Empresa");
		lblNomEmp.setForeground(Color.WHITE);
		lblNomEmp.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNomEmp.setBounds(20, 104, 153, 24);
		add(lblNomEmp);
		
		txtNomEmpre = new JLabel();
		txtNomEmpre.setBounds(183, 107, 296, 24);
		add(txtNomEmpre);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblFecha.setBounds(502, 104, 39, 24);
		add(lblFecha);
		
		dateFecha = new JLabel();
		dateFecha.setBounds(551, 104, 140, 27);
		add(dateFecha);
		
		
		// activos
		
		JLabel lblNewLabel_2 = new JLabel("ACTIVOS");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2.setBounds(79, 154, 215, 24);
		add(lblNewLabel_2);
		
		// activo circulante
		
		JLabel lblRemuneracion = new JLabel("Activo Circulante");
		lblRemuneracion.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemuneracion.setForeground(Color.WHITE);
		lblRemuneracion.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRemuneracion.setBounds(110, 188, 166, 24);
		add(lblRemuneracion);
		
		JLabel lblSueBas = new JLabel("Caja");
		lblSueBas.setForeground(Color.WHITE);
		lblSueBas.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSueBas.setBounds(20, 222, 153, 24);
		add(lblSueBas);
		
		txtCaja = new JLabel();
		txtCaja.setBounds(171, 222, 199, 24);
		add(txtCaja);
		
		JLabel lblHorExt = new JLabel("Bancos");
		lblHorExt.setForeground(Color.WHITE);
		lblHorExt.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblHorExt.setBounds(20, 257, 153, 24);
		add(lblHorExt);
		
		txtBancos = new JLabel();
		txtBancos.setBounds(171, 256, 199, 24);
		add(txtBancos);
		
		JLabel lblBonGes = new JLabel("Inversiones a corto plazo");
		lblBonGes.setForeground(Color.WHITE);
		lblBonGes.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBonGes.setBounds(20, 292, 153, 24);
		add(lblBonGes);
		
		txtInvCorPla = new JLabel();
		txtInvCorPla.setBounds(171, 292, 199, 24);
		add(txtInvCorPla);
		
		JLabel lblPar = new JLabel("Cuentas por Cobrar");
		lblPar.setForeground(Color.WHITE);
		lblPar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPar.setBounds(20, 327, 153, 24);
		add(lblPar);
		
		txtCuentasCobrar = new JLabel();
		txtCuentasCobrar.setBounds(171, 327, 199, 24);
		add(txtCuentasCobrar);
		
		JLabel lblCom = new JLabel("Inventario");
		lblCom.setForeground(Color.WHITE);
		lblCom.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCom.setBounds(20, 362, 153, 24);
		add(lblCom);
		
		txtInventario = new JLabel();
		txtInventario.setBounds(171, 362, 199, 24);
		add(txtInventario);
		
		JLabel lblTotalActCir = new JLabel("Total Activo Circulante");
		lblTotalActCir.setForeground(Color.WHITE);
		lblTotalActCir.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalActCir.setBounds(20, 396, 136, 24);
		add(lblTotalActCir);
		
		txtTotalActCir = new JLabel();
		txtTotalActCir.setBounds(171, 396, 148, 24);
		add(txtTotalActCir);
		
		// Fin activo circulante
		
		
		// Activo Fijo
		
		JLabel lblActivoFijo = new JLabel("Activo Fijo");
		lblActivoFijo.setHorizontalAlignment(SwingConstants.CENTER);
		lblActivoFijo.setForeground(Color.WHITE);
		lblActivoFijo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblActivoFijo.setBounds(110, 449, 166, 24);
		add(lblActivoFijo);
		
		JLabel lblEdic = new JLabel("Edificios");
		lblEdic.setForeground(Color.WHITE);
		lblEdic.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEdic.setBounds(20, 483, 124, 24);
		add(lblEdic);
		
		txtEdificios = new JLabel();
		txtEdificios.setBounds(171, 483, 199, 24);
		add(txtEdificios);
		
		JLabel lblTerreno = new JLabel("Terrenos");
		lblTerreno.setForeground(Color.WHITE);
		lblTerreno.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTerreno.setBounds(20, 517, 136, 24);
		add(lblTerreno);
		
		txtTerreno = new JLabel();
		txtTerreno.setBounds(171, 517, 199, 24);
		add(txtTerreno);
		
		JLabel lblDepAcum = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepAcum.setForeground(Color.WHITE);
		lblDepAcum.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepAcum.setBounds(20, 551, 153, 24);
		add(lblDepAcum);
		
		txtDepAcum = new JLabel();
		txtDepAcum.setBounds(171, 551, 199, 24);
		add(txtDepAcum);
		
		JLabel lblMobYEq = new JLabel("Mobiliario y equipo");
		lblMobYEq.setForeground(Color.WHITE);
		lblMobYEq.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMobYEq.setBounds(20, 585, 124, 24);
		add(lblMobYEq);
		
		txtMobYEq = new JLabel();
		txtMobYEq.setBounds(171, 585, 199, 24);
		add(txtMobYEq);
		
		JLabel lblDepA2 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA2.setForeground(Color.WHITE);
		lblDepA2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA2.setBounds(20, 619, 153, 24);
		add(lblDepA2);
		
		txtDepA2 = new JLabel();
		txtDepA2.setBounds(171, 619, 199, 24);
		add(txtDepA2);
		
		JLabel lblEqTrans = new JLabel("Equipo de transporte");
		lblEqTrans.setForeground(Color.WHITE);
		lblEqTrans.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEqTrans.setBounds(20, 653, 153, 24);
		add(lblEqTrans);
		
		txtEqTrans = new JLabel();
		txtEqTrans.setBounds(171, 653, 199, 24);
		add(txtEqTrans);
		
		JLabel lblDepA3 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA3.setForeground(Color.WHITE);
		lblDepA3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA3.setBounds(20, 687, 153, 24);
		add(lblDepA3);
		
		txtDepA3 = new JLabel();
		txtDepA3.setBounds(171, 687, 199, 24);
		add(txtDepA3);
		
		JLabel lblEqCompu = new JLabel("Equipo de computo");
		lblEqCompu.setForeground(Color.WHITE);
		lblEqCompu.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEqCompu.setBounds(20, 722, 153, 24);
		add(lblEqCompu);
		
		txtEqCompu = new JLabel();
		txtEqCompu.setBounds(171, 722, 199, 24);
		add(txtEqCompu);
		
		JLabel lblDepA4 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA4.setForeground(Color.WHITE);
		lblDepA4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA4.setBounds(20, 757, 153, 24);
		add(lblDepA4);
		
		txtDepA4 = new JLabel();
		txtDepA4.setBounds(171, 757, 199, 24);
		add(txtDepA4);
		
		JLabel lblTotalActivoFijo = new JLabel("Total Activo Fijo");
		lblTotalActivoFijo.setForeground(Color.WHITE);
		lblTotalActivoFijo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalActivoFijo.setBounds(20, 792, 136, 24);
		add(lblTotalActivoFijo);
		
		txtTotalActivoFijo = new JLabel();
		txtTotalActivoFijo.setBounds(171, 792, 148, 24);
		add(txtTotalActivoFijo);
		
		
		/// Fin de activo Fijo
		
		
		// activo diferido
		
		JLabel lblActivoDiferido = new JLabel("Activo Diferido");
		lblActivoDiferido.setHorizontalAlignment(SwingConstants.CENTER);
		lblActivoDiferido.setForeground(Color.WHITE);
		lblActivoDiferido.setFont(new Font("Dialog", Font.BOLD, 12));
		lblActivoDiferido.setBounds(110, 842, 166, 24);
		add(lblActivoDiferido);
		
		JLabel lblRentPag = new JLabel("Rentas pagadas por anticipado");
		lblRentPag.setForeground(Color.WHITE);
		lblRentPag.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblRentPag.setBounds(20, 877, 153, 24);
		add(lblRentPag);
		
		txtRentPag = new JLabel();
		txtRentPag.setBounds(171, 877, 199, 24);
		add(txtRentPag);
		
		JLabel lblOactDif = new JLabel("Otros activos diferidos");
		lblOactDif.setForeground(Color.WHITE);
		lblOactDif.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblOactDif.setBounds(20, 912, 153, 24);
		add(lblOactDif);
		
		txtOactDif = new JLabel();
		txtOactDif.setBounds(171, 912, 199, 24);
		add(txtOactDif);
		
		JLabel lblTotalActDif = new JLabel("Total Activo Diferido");
		lblTotalActDif.setForeground(Color.WHITE);
		lblTotalActDif.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalActDif.setBounds(20, 947, 136, 24);
		add(lblTotalActDif);
		
		txtTotalActDif = new JLabel();
		txtTotalActDif.setBounds(171, 947, 148, 24);
		add(txtTotalActDif);
		
		// Fin activo diferido
		
		// SUMA DEL ACTIVO
		
		JLabel lblSumaAct = new JLabel("SUMA DEL ACTIVO");
		lblSumaAct.setForeground(Color.WHITE);
		lblSumaAct.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSumaAct.setBounds(20, 982, 141, 24);
		add(lblSumaAct);
		
		txtSumaAct = new JLabel();
		txtSumaAct.setBounds(171, 982, 144, 24);
		add(txtSumaAct);
		
		// FIN SUMA DEL ACTIVO
		
		
		// FIN ACTIVOS
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBounds(383, 141, 9, 900);
		add(separator);
		
		
		// arriba de los botones
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(0, 1060, 748, 10);
		add(separator_1_1);
		
		
		// PASIVOS
		
		JLabel lblPasivos = new JLabel("PASIVOS");
		lblPasivos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasivos.setForeground(Color.WHITE);
		lblPasivos.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPasivos.setBounds(435, 154, 215, 24);
		add(lblPasivos);
		
		// pasivo circulante
		
		JLabel lblPasivoCirculante = new JLabel("Pasivo Circulante");
		lblPasivoCirculante.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasivoCirculante.setForeground(Color.WHITE);
		lblPasivoCirculante.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPasivoCirculante.setBounds(472, 188, 166, 24);
		add(lblPasivoCirculante);
		
		JLabel lblCarAsiFam = new JLabel("Proveedores");
		lblCarAsiFam.setForeground(Color.WHITE);
		lblCarAsiFam.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCarAsiFam.setBounds(401, 222, 153, 24);
		add(lblCarAsiFam);
		
		txtProveedores = new JLabel();
		txtProveedores.setBounds(552, 222, 189, 24);
		add(txtProveedores);
		
		JLabel lblCol = new JLabel("Acreedores");
		lblCol.setForeground(Color.WHITE);
		lblCol.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCol.setBounds(401, 257, 153, 24);
		add(lblCol);
		
		txtAcreedores = new JLabel();
		txtAcreedores.setBounds(552, 257, 189, 24);
		add(txtAcreedores);
		
		JLabel lblMov = new JLabel("Intereses por pagar");
		lblMov.setForeground(Color.WHITE);
		lblMov.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMov.setBounds(401, 292, 153, 24);
		add(lblMov);
		
		txtInteresesPorPagar = new JLabel();
		txtInteresesPorPagar.setBounds(552, 292, 189, 24);
		add(txtInteresesPorPagar);
		
		JLabel lblISRPorPagar = new JLabel("ISR por pagar");
		lblISRPorPagar.setForeground(Color.WHITE);
		lblISRPorPagar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblISRPorPagar.setBounds(401, 327, 153, 24);
		add(lblISRPorPagar);
		
		txtISRPorPagar = new JLabel();
		txtISRPorPagar.setBounds(552, 327, 189, 24);
		add(txtISRPorPagar);
		
		JLabel lblAnticipoCliente = new JLabel("Anticipo de clientes");
		lblAnticipoCliente.setForeground(Color.WHITE);
		lblAnticipoCliente.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAnticipoCliente.setBounds(401, 362, 140, 24);
		add(lblAnticipoCliente);
		
		txtAnticipoCliente = new JLabel();
		txtAnticipoCliente.setBounds(552, 362, 189, 24);
		add(txtAnticipoCliente);
		
		JLabel lblTotHab = new JLabel("Total Pasivo Circulante");
		lblTotHab.setForeground(Color.WHITE);
		lblTotHab.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotHab.setBounds(400, 398, 141, 24);
		add(lblTotHab);
		
		txtTotalPasCir = new JLabel();
		txtTotalPasCir.setBounds(552, 398, 144, 24);
		add(txtTotalPasCir);
		// fin pasivo circulante
		
		
		// pasivo a largo plazo
		JLabel lblPasivoALargo = new JLabel("Pasivo a largo plazo");
		lblPasivoALargo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasivoALargo.setForeground(Color.WHITE);
		lblPasivoALargo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPasivoALargo.setBounds(471, 450, 166, 24);
		add(lblPasivoALargo);
		
		JLabel lblDocumentosPorPagar = new JLabel("Documentos por pagar");
		lblDocumentosPorPagar.setForeground(Color.WHITE);
		lblDocumentosPorPagar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDocumentosPorPagar.setBounds(400, 484, 153, 24);
		add(lblDocumentosPorPagar);
		
		txtDocPorPagar = new JLabel();
		txtDocPorPagar.setBounds(551, 484, 189, 24);
		add(txtDocPorPagar);
	
		JLabel lblTotalPasivoA = new JLabel("Total Pasivo a largo plazo");
		lblTotalPasivoA.setForeground(Color.WHITE);
		lblTotalPasivoA.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalPasivoA.setBounds(399, 518, 141, 24);
		add(lblTotalPasivoA);
		
		txtTotPasALargoPlas = new JLabel();
		txtTotPasALargoPlas.setBounds(551, 518, 144, 24);
		add(txtTotPasALargoPlas);
		
		
		// fin pasivo a largo plazo
		
		// Suma del pasivo
		
		JLabel lblSumaDelPasivo = new JLabel("SUMA DEL PASIVO");
		lblSumaDelPasivo.setForeground(Color.WHITE);
		lblSumaDelPasivo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSumaDelPasivo.setBounds(399, 577, 141, 24);
		add(lblSumaDelPasivo);
		
		txtSumaDelPasivo = new JLabel();
		txtSumaDelPasivo.setBounds(551, 577, 144, 24);
		add(txtSumaDelPasivo);
		// fin Suma del pasivo
		
		// CAPITAL CONTABLE
		
				JLabel lblCapCont = new JLabel("CAPITAL CONTABLE");
				lblCapCont.setHorizontalAlignment(SwingConstants.CENTER);
				lblCapCont.setForeground(Color.WHITE);
				lblCapCont.setFont(new Font("Dialog", Font.BOLD, 12));
				lblCapCont.setBounds(472, 612, 166, 24);
				add(lblCapCont);
				
				JLabel lblCapSoc = new JLabel("Capital social");
				lblCapSoc.setForeground(Color.WHITE);
				lblCapSoc.setFont(new Font("Dialog", Font.PLAIN, 12));
				lblCapSoc.setBounds(401, 647, 153, 24);
				add(lblCapSoc);
				
				txtCapSoc = new JLabel();
				txtCapSoc.setBounds(552, 647, 189, 24);
				add(txtCapSoc);
				
				JLabel lblReser = new JLabel("Reservas");
				lblReser.setForeground(Color.WHITE);
				lblReser.setFont(new Font("Dialog", Font.PLAIN, 12));
				lblReser.setBounds(401, 682, 153, 24);
				add(lblReser);
				
				txtReser = new JLabel();
				txtReser.setBounds(552, 682, 189, 24);
				add(txtReser);
				
				JLabel lblResEjeAnt = new JLabel("Resultados de ejercicios anteriores");
				lblResEjeAnt.setForeground(Color.WHITE);
				lblResEjeAnt.setFont(new Font("Dialog", Font.PLAIN, 12));
				lblResEjeAnt.setBounds(401, 717, 153, 24);
				add(lblResEjeAnt);
				
				txtResEjeAnt = new JLabel();
				txtResEjeAnt.setBounds(552, 717, 189, 24);
				add(txtResEjeAnt);
				
				JLabel lblReslEje = new JLabel("Resultados del ejercicio");
				lblReslEje.setForeground(Color.WHITE);
				lblReslEje.setFont(new Font("Dialog", Font.PLAIN, 12));
				lblReslEje.setBounds(401, 752, 153, 24);
				add(lblReslEje);
				
				txtReslEje = new JLabel();
				txtReslEje.setBounds(552, 752, 189, 24);
				add(txtReslEje);
				
				JLabel lblCapCon = new JLabel("Total Capital contable");
				lblCapCon.setForeground(Color.WHITE);
				lblCapCon.setFont(new Font("Dialog", Font.BOLD, 12));
				lblCapCon.setBounds(400, 787, 141, 24);
				add(lblCapCon);
				
				txtCapCon = new JLabel();
				txtCapCon.setBounds(552, 787, 144, 24);
				add(txtCapCon);
				
				// fin CAPITAL CONTABLE
		
				// suma del capital contable
				
				JLabel lblSumaCapCon = new JLabel("SUMA DEL CAPITAL CONTABLE");
				lblSumaCapCon.setForeground(Color.WHITE);
				lblSumaCapCon.setFont(new Font("Dialog", Font.BOLD, 14));
				lblSumaCapCon.setBounds(399, 822, 285, 24);
				add(lblSumaCapCon);
				
				txtSumaCapCon = new JLabel();
				txtSumaCapCon.setBounds(399, 857, 285, 24);
				add(txtSumaCapCon);
				
	}
	
	@Override
	public void CargarData(BalanceGeneralEntity t) {
		// TODO Auto-generated method stub
		
	}

}
