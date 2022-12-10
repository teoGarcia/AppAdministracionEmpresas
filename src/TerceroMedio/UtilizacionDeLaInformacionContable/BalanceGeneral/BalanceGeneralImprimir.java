package TerceroMedio.UtilizacionDeLaInformacionContable.BalanceGeneral;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import core.Helpers;
import ui.Texts.TextSoloNumeros;
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
	
	private Color FontColor = Color.BLACK;

	public BalanceGeneralImprimir(){
		
		super("Balance General");
		
		int disminuir = 70;
		
		JLabel lblNomEmp = new JLabel("Nombre de Empresa");
		lblNomEmp.setForeground(FontColor);
		lblNomEmp.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNomEmp.setBounds(20, 104, 153, 24);
		add(lblNomEmp);
		
		txtNomEmpre = new JLabel();
		txtNomEmpre.setForeground(FontColor);
		txtNomEmpre.setBounds(183, 107, 296, 24);
		add(txtNomEmpre);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setForeground(FontColor);
		lblFecha.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblFecha.setBounds(502-disminuir, 104, 39, 24);
		add(lblFecha);
		
		dateFecha = new JLabel();
		dateFecha.setForeground(FontColor);
		dateFecha.setBounds(551-disminuir, 104, 140, 27);
		add(dateFecha);
		
		
		// activos
		
		JLabel lblNewLabel_2 = new JLabel("ACTIVOS");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(FontColor);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2.setBounds(79, 154, 215, 24);
		add(lblNewLabel_2);
		
		// activo circulante
		
		JLabel lblRemuneracion = new JLabel("Activo Circulante");
		lblRemuneracion.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemuneracion.setForeground(FontColor);
		lblRemuneracion.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRemuneracion.setBounds(110, 188, 166, 24);
		add(lblRemuneracion);
		
		JLabel lblSueBas = new JLabel("Caja");
		lblSueBas.setForeground(FontColor);
		lblSueBas.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSueBas.setBounds(20, 222, 153, 24);
		add(lblSueBas);
		
		txtCaja = new JLabel();
		txtCaja.setForeground(FontColor);
		txtCaja.setBounds(171, 222, 199, 24);
		add(txtCaja);
		
		JLabel lblHorExt = new JLabel("Bancos");
		lblHorExt.setForeground(FontColor);
		lblHorExt.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblHorExt.setBounds(20, 257, 153, 24);
		add(lblHorExt);
		
		txtBancos = new JLabel();
		txtBancos.setForeground(FontColor);
		txtBancos.setBounds(171, 256, 199, 24);
		add(txtBancos);
		
		JLabel lblBonGes = new JLabel("Inversiones a corto plazo");
		lblBonGes.setForeground(FontColor);
		lblBonGes.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBonGes.setBounds(20, 292, 153, 24);
		add(lblBonGes);
		
		txtInvCorPla = new JLabel();
		txtInvCorPla.setForeground(FontColor);
		txtInvCorPla.setBounds(171, 292, 199, 24);
		add(txtInvCorPla);
		
		JLabel lblPar = new JLabel("Cuentas por Cobrar");
		lblPar.setForeground(FontColor);
		lblPar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPar.setBounds(20, 327, 153, 24);
		add(lblPar);
		
		txtCuentasCobrar = new JLabel();
		txtCuentasCobrar.setForeground(FontColor);
		txtCuentasCobrar.setBounds(171, 327, 199, 24);
		add(txtCuentasCobrar);
		
		JLabel lblCom = new JLabel("Inventario");
		lblCom.setForeground(FontColor);
		lblCom.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCom.setBounds(20, 362, 153, 24);
		add(lblCom);
		
		txtInventario = new JLabel();
		txtInventario.setForeground(FontColor);
		txtInventario.setBounds(171, 362, 199, 24);
		add(txtInventario);
		
		JLabel lblTotalActCir = new JLabel("Total Activo Circulante");
		lblTotalActCir.setForeground(FontColor);
		lblTotalActCir.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalActCir.setBounds(20, 396, 136, 24);
		add(lblTotalActCir);
		
		txtTotalActCir = new JLabel();
		txtTotalActCir.setForeground(FontColor);
		txtTotalActCir.setBounds(171, 396, 148, 24);
		add(txtTotalActCir);
		
		// Fin activo circulante
		
		
		// Activo Fijo
		
		JLabel lblActivoFijo = new JLabel("Activo Fijo");
		lblActivoFijo.setHorizontalAlignment(SwingConstants.CENTER);
		lblActivoFijo.setForeground(FontColor);
		lblActivoFijo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblActivoFijo.setBounds(110, 449, 166, 24);
		add(lblActivoFijo);
		
		JLabel lblEdic = new JLabel("Edificios");
		lblEdic.setForeground(FontColor);
		lblEdic.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEdic.setBounds(20, 483, 124, 24);
		add(lblEdic);
		
		txtEdificios = new JLabel();
		txtEdificios.setForeground(FontColor);
		txtEdificios.setBounds(171, 483, 199, 24);
		add(txtEdificios);
		
		JLabel lblTerreno = new JLabel("Terrenos");
		lblTerreno.setForeground(FontColor);
		lblTerreno.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTerreno.setBounds(20, 517, 136, 24);
		add(lblTerreno);
		
		txtTerreno = new JLabel();
		txtTerreno.setForeground(FontColor);
		txtTerreno.setBounds(171, 517, 199, 24);
		add(txtTerreno);
		
		JLabel lblDepAcum = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepAcum.setForeground(FontColor);
		lblDepAcum.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepAcum.setBounds(20, 551, 153, 24);
		add(lblDepAcum);
		
		txtDepAcum = new JLabel();
		txtDepAcum.setForeground(FontColor);
		txtDepAcum.setBounds(171, 551, 199, 24);
		add(txtDepAcum);
		
		JLabel lblMobYEq = new JLabel("Mobiliario y equipo");
		lblMobYEq.setForeground(FontColor);
		lblMobYEq.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMobYEq.setBounds(20, 585, 124, 24);
		add(lblMobYEq);
		
		txtMobYEq = new JLabel();
		txtMobYEq.setForeground(FontColor);
		txtMobYEq.setBounds(171, 585, 199, 24);
		add(txtMobYEq);
		
		JLabel lblDepA2 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA2.setForeground(FontColor);
		lblDepA2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA2.setBounds(20, 619, 153, 24);
		add(lblDepA2);
		
		txtDepA2 = new JLabel();
		txtDepA2.setForeground(FontColor);
		txtDepA2.setBounds(171, 619, 199, 24);
		add(txtDepA2);
		
		JLabel lblEqTrans = new JLabel("Equipo de transporte");
		lblEqTrans.setForeground(FontColor);
		lblEqTrans.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEqTrans.setBounds(20, 653, 153, 24);
		add(lblEqTrans);
		
		txtEqTrans = new JLabel();
		txtEqTrans.setForeground(FontColor);
		txtEqTrans.setBounds(171, 653, 199, 24);
		add(txtEqTrans);
		
		JLabel lblDepA3 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA3.setForeground(FontColor);
		lblDepA3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA3.setBounds(20, 687, 153, 24);
		add(lblDepA3);
		
		txtDepA3 = new JLabel();
		txtDepA3.setForeground(FontColor);
		txtDepA3.setBounds(171, 687, 199, 24);
		add(txtDepA3);
		
		JLabel lblEqCompu = new JLabel("Equipo de computo");
		lblEqCompu.setForeground(FontColor);
		lblEqCompu.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEqCompu.setBounds(20, 722, 153, 24);
		add(lblEqCompu);
		
		txtEqCompu = new JLabel();
		txtEqCompu.setForeground(FontColor);
		txtEqCompu.setBounds(171, 722, 199, 24);
		add(txtEqCompu);
		
		JLabel lblDepA4 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA4.setForeground(FontColor);
		lblDepA4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA4.setBounds(20, 757, 153, 24);
		add(lblDepA4);
		
		txtDepA4 = new JLabel();
		txtDepA4.setForeground(FontColor);
		txtDepA4.setBounds(171, 757, 199, 24);
		add(txtDepA4);
		
		JLabel lblTotalActivoFijo = new JLabel("Total Activo Fijo");
		lblTotalActivoFijo.setForeground(FontColor);
		lblTotalActivoFijo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalActivoFijo.setBounds(20, 792, 136, 24);
		add(lblTotalActivoFijo);
		
		txtTotalActivoFijo = new JLabel();
		txtTotalActivoFijo.setForeground(FontColor);
		txtTotalActivoFijo.setBounds(171, 792, 148, 24);
		add(txtTotalActivoFijo);
		
		
		/// Fin de activo Fijo
		
		
		// activo diferido
		
		JLabel lblActivoDiferido = new JLabel("Activo Diferido");
		lblActivoDiferido.setHorizontalAlignment(SwingConstants.CENTER);
		lblActivoDiferido.setForeground(FontColor);
		lblActivoDiferido.setFont(new Font("Dialog", Font.BOLD, 12));
		lblActivoDiferido.setBounds(110, 842, 166, 24);
		add(lblActivoDiferido);
		
		JLabel lblRentPag = new JLabel("Rentas pagadas por anticipado");
		lblRentPag.setForeground(FontColor);
		lblRentPag.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblRentPag.setBounds(20, 877, 153, 24);
		add(lblRentPag);
		
		txtRentPag = new JLabel();
		txtRentPag.setForeground(FontColor);
		txtRentPag.setBounds(171, 877, 199, 24);
		add(txtRentPag);
		
		JLabel lblOactDif = new JLabel("Otros activos diferidos");
		lblOactDif.setForeground(FontColor);
		lblOactDif.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblOactDif.setBounds(20, 912, 153, 24);
		add(lblOactDif);
		
		txtOactDif = new JLabel();
		txtOactDif.setForeground(FontColor);
		txtOactDif.setBounds(171, 912, 199, 24);
		add(txtOactDif);
		
		JLabel lblTotalActDif = new JLabel("Total Activo Diferido");
		lblTotalActDif.setForeground(FontColor);
		lblTotalActDif.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalActDif.setBounds(20, 947, 136, 24);
		add(lblTotalActDif);
		
		txtTotalActDif = new JLabel();
		txtTotalActDif.setForeground(FontColor);
		txtTotalActDif.setBounds(171, 947, 148, 24);
		add(txtTotalActDif);
		
		// Fin activo diferido
		
		// SUMA DEL ACTIVO
		
		JLabel lblSumaAct = new JLabel("SUMA DEL ACTIVO");
		lblSumaAct.setForeground(FontColor);
		lblSumaAct.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSumaAct.setBounds(20, 982, 141, 24);
		add(lblSumaAct);
		
		txtSumaAct = new JLabel();
		txtSumaAct.setForeground(FontColor);
		txtSumaAct.setBounds(171, 982, 144, 24);
		add(txtSumaAct);
		
		// FIN SUMA DEL ACTIVO
		
		
		// FIN ACTIVOS
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(FontColor);
		separator.setBounds(383-disminuir, 141, 9, 900);
		add(separator);
		
		
		// arriba de los botones
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(FontColor);
		separator_1_1.setBounds(0, 1060, 748, 10);
		add(separator_1_1);
		
		
		// PASIVOS
		
		JLabel lblPasivos = new JLabel("PASIVOS");
		lblPasivos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasivos.setForeground(FontColor);
		lblPasivos.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPasivos.setBounds(435-disminuir, 154, 215, 24);
		add(lblPasivos);
		
		// pasivo circulante
		
		JLabel lblPasivoCirculante = new JLabel("Pasivo Circulante");
		lblPasivoCirculante.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasivoCirculante.setForeground(FontColor);
		lblPasivoCirculante.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPasivoCirculante.setBounds(472-disminuir, 188, 166, 24);
		add(lblPasivoCirculante);
		
		JLabel lblCarAsiFam = new JLabel("Proveedores");
		lblCarAsiFam.setForeground(FontColor);
		lblCarAsiFam.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCarAsiFam.setBounds(401-disminuir, 222, 153, 24);
		add(lblCarAsiFam);
		
		txtProveedores = new JLabel();
		txtProveedores.setForeground(FontColor);
		txtProveedores.setBounds(552-disminuir, 222, 189, 24);
		add(txtProveedores);
		
		JLabel lblCol = new JLabel("Acreedores");
		lblCol.setForeground(FontColor);
		lblCol.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCol.setBounds(401-disminuir, 257, 153, 24);
		add(lblCol);
		
		txtAcreedores = new JLabel();
		txtAcreedores.setForeground(FontColor);
		txtAcreedores.setBounds(552-disminuir, 257, 189, 24);
		add(txtAcreedores);
		
		JLabel lblMov = new JLabel("Intereses por pagar");
		lblMov.setForeground(FontColor);
		lblMov.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMov.setBounds(401-disminuir, 292, 153, 24);
		add(lblMov);
		
		txtInteresesPorPagar = new JLabel();
		txtInteresesPorPagar.setForeground(FontColor);
		txtInteresesPorPagar.setBounds(552-disminuir, 292, 189, 24);
		add(txtInteresesPorPagar);
		
		JLabel lblISRPorPagar = new JLabel("ISR por pagar");
		lblISRPorPagar.setForeground(FontColor);
		lblISRPorPagar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblISRPorPagar.setBounds(401-disminuir, 327, 153, 24);
		add(lblISRPorPagar);
		
		txtISRPorPagar = new JLabel();
		txtISRPorPagar.setForeground(FontColor);
		txtISRPorPagar.setBounds(552-disminuir, 327, 189, 24);
		add(txtISRPorPagar);
		
		JLabel lblAnticipoCliente = new JLabel("Anticipo de clientes");
		lblAnticipoCliente.setForeground(FontColor);
		lblAnticipoCliente.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAnticipoCliente.setBounds(401-disminuir, 362, 140, 24);
		add(lblAnticipoCliente);
		
		txtAnticipoCliente = new JLabel();
		txtAnticipoCliente.setForeground(FontColor);
		txtAnticipoCliente.setBounds(552-disminuir, 362, 189, 24);
		add(txtAnticipoCliente);
		
		JLabel lblTotHab = new JLabel("Total Pasivo Circulante");
		lblTotHab.setForeground(FontColor);
		lblTotHab.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotHab.setBounds(400-disminuir, 398, 141, 24);
		add(lblTotHab);
		
		txtTotalPasCir = new JLabel();
		txtTotalPasCir.setForeground(FontColor);
		txtTotalPasCir.setBounds(552-disminuir, 398, 144, 24);
		add(txtTotalPasCir);
		// fin pasivo circulante
		
		
		// pasivo a largo plazo
		JLabel lblPasivoALargo = new JLabel("Pasivo a largo plazo");
		lblPasivoALargo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasivoALargo.setForeground(FontColor);
		lblPasivoALargo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPasivoALargo.setBounds(471-disminuir, 450, 166, 24);
		add(lblPasivoALargo);
		
		JLabel lblDocumentosPorPagar = new JLabel("Documentos por pagar");
		lblDocumentosPorPagar.setForeground(FontColor);
		lblDocumentosPorPagar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDocumentosPorPagar.setBounds(400-disminuir, 484, 153, 24);
		add(lblDocumentosPorPagar);
		
		txtDocPorPagar = new JLabel();
		txtDocPorPagar.setForeground(FontColor);
		txtDocPorPagar.setBounds(551-disminuir, 484, 189, 24);
		add(txtDocPorPagar);
	
		JLabel lblTotalPasivoA = new JLabel("Total Pasivo a largo plazo");
		lblTotalPasivoA.setForeground(FontColor);
		lblTotalPasivoA.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalPasivoA.setBounds(399-disminuir, 518, 141, 24);
		add(lblTotalPasivoA);
		
		txtTotPasALargoPlas = new JLabel();
		txtTotPasALargoPlas.setForeground(FontColor);
		txtTotPasALargoPlas.setBounds(551-disminuir, 518, 144, 24);
		add(txtTotPasALargoPlas);
		
		
		// fin pasivo a largo plazo
		
		// Suma del pasivo
		
		JLabel lblSumaDelPasivo = new JLabel("SUMA DEL PASIVO");
		lblSumaDelPasivo.setForeground(FontColor);
		lblSumaDelPasivo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSumaDelPasivo.setBounds(399-disminuir, 577, 141, 24);
		add(lblSumaDelPasivo);
		
		txtSumaDelPasivo = new JLabel();
		txtSumaDelPasivo.setForeground(FontColor);
		txtSumaDelPasivo.setBounds(551-disminuir, 577, 144, 24);
		add(txtSumaDelPasivo);
		// fin Suma del pasivo
		
		// CAPITAL CONTABLE
		
				JLabel lblCapCont = new JLabel("CAPITAL CONTABLE");
				lblCapCont.setHorizontalAlignment(SwingConstants.CENTER);
				lblCapCont.setForeground(FontColor);
				lblCapCont.setFont(new Font("Dialog", Font.BOLD, 12));
				lblCapCont.setBounds(472-disminuir, 612, 166, 24);
				add(lblCapCont);
				
				JLabel lblCapSoc = new JLabel("Capital social");
				lblCapSoc.setForeground(FontColor);
				lblCapSoc.setFont(new Font("Dialog", Font.PLAIN, 12));
				lblCapSoc.setBounds(401-disminuir, 647, 153, 24);
				add(lblCapSoc);
				
				txtCapSoc = new JLabel();
				txtCapSoc.setForeground(FontColor);
				txtCapSoc.setBounds(552-disminuir, 647, 189, 24);
				add(txtCapSoc);
				
				JLabel lblReser = new JLabel("Reservas");
				lblReser.setForeground(FontColor);
				lblReser.setFont(new Font("Dialog", Font.PLAIN, 12));
				lblReser.setBounds(401-disminuir, 682, 153, 24);
				add(lblReser);
				
				txtReser = new JLabel();
				txtReser.setForeground(FontColor);
				txtReser.setBounds(552-disminuir, 682, 189, 24);
				add(txtReser);
				
				JLabel lblResEjeAnt = new JLabel("Resultados de ejercicios anteriores");
				lblResEjeAnt.setForeground(FontColor);
				lblResEjeAnt.setFont(new Font("Dialog", Font.PLAIN, 12));
				lblResEjeAnt.setBounds(401-disminuir, 717, 153, 24);
				add(lblResEjeAnt);
				
				txtResEjeAnt = new JLabel();
				txtResEjeAnt.setForeground(FontColor);
				txtResEjeAnt.setBounds(552-disminuir, 717, 189, 24);
				add(txtResEjeAnt);
				
				JLabel lblReslEje = new JLabel("Resultados del ejercicio");
				lblReslEje.setForeground(FontColor);
				lblReslEje.setFont(new Font("Dialog", Font.PLAIN, 12));
				lblReslEje.setBounds(401-disminuir, 752, 153, 24);
				add(lblReslEje);
				
				txtReslEje = new JLabel();
				txtReslEje.setForeground(FontColor);
				txtReslEje.setBounds(552-disminuir, 752, 189, 24);
				add(txtReslEje);
				
				JLabel lblCapCon = new JLabel("Total Capital contable");
				lblCapCon.setForeground(FontColor);
				lblCapCon.setFont(new Font("Dialog", Font.BOLD, 12));
				lblCapCon.setBounds(400-disminuir, 787, 141, 24);
				add(lblCapCon);
				
				txtCapCon = new JLabel();
				txtCapCon.setForeground(FontColor);
				txtCapCon.setBounds(552-disminuir, 787, 144, 24);
				add(txtCapCon);
				
				// fin CAPITAL CONTABLE
		
				// suma del capital contable
				
				JLabel lblSumaCapCon = new JLabel("SUMA DEL CAPITAL CONTABLE");
				lblSumaCapCon.setForeground(FontColor);
				lblSumaCapCon.setFont(new Font("Dialog", Font.BOLD, 14));
				lblSumaCapCon.setBounds(399-disminuir, 822, 285, 24);
				add(lblSumaCapCon);
				
				txtSumaCapCon = new JLabel();
				txtSumaCapCon.setForeground(FontColor);
				txtSumaCapCon.setBounds(399-disminuir, 857, 285, 24);
				add(txtSumaCapCon);
				
	}
	
	@Override
	public void CargarData(BalanceGeneralEntity record) {
		// TODO Auto-generated method stub
		txtNomEmpre.setText(record.getNomEmp());
		dateFecha.setText(Helpers.getFechaFormat(record.getFecha())); 
		
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
		
		cacularTotales();
	}
	
	public void cacularTotales() {
	
		txtTotalActCir.setText(""+CalcularTotal(getFormActivoCirculante()));
		txtTotalActivoFijo.setText(""+CalcularTotal(getFormActivoFijo()));
		txtTotalActDif.setText(""+CalcularTotal(getFormActivoDiferido()));
		txtTotalPasCir.setText(""+CalcularTotal(getFormPasivoCiculante()));
		txtTotPasALargoPlas.setText(""+CalcularTotal(getFormPasivoLargoPlazo()));
		txtCapCon.setText(""+CalcularTotal(getFormCapitalContable()));
		
		int calcular = Integer.parseInt(txtTotalActCir.getText()) + 
			       Integer.parseInt(txtTotalActivoFijo.getText()) +
			       Integer.parseInt(txtTotalActDif.getText());
			
		txtSumaAct.setText(""+ calcular);
		
		calcular = Integer.parseInt(txtTotalPasCir.getText()) + 
			       Integer.parseInt(txtTotPasALargoPlas.getText());
			
		txtSumaDelPasivo.setText(""+ calcular);
	
		calcular = Integer.parseInt(txtTotalPasCir.getText()) + 
			       Integer.parseInt(txtTotPasALargoPlas.getText())+
			       Integer.parseInt(txtCapCon.getText());
			       ;
			
		txtSumaCapCon.setText(""+ calcular);
	}
	
	private int CalcularTotal(JLabel[] form) {
		
		int total = 0;
		
		for(JLabel text: form) {
			total += Integer.parseInt(text.getText());
		}
		
		return total;
	}
	
	private JLabel[] getFormActivoCirculante() {
		JLabel[] form = {txtCaja, txtBancos,  txtInvCorPla, txtCuentasCobrar, txtInventario};
		return form; 
	}
	
	private JLabel[] getFormActivoFijo() {
		JLabel[] form = {txtEdificios, txtTerreno,  txtDepAcum, txtMobYEq, txtDepA2, txtEqTrans, txtDepA3, txtEqCompu, txtDepA4 };
		return form; 
	}
	
	private JLabel[] getFormActivoDiferido() {
		JLabel[] form = {txtRentPag, txtOactDif};
		return form; 
	}
	
	private JLabel[] getFormPasivoCiculante() {
		JLabel[] form = {txtProveedores, txtAcreedores,  txtInteresesPorPagar, txtISRPorPagar, txtAnticipoCliente};
		return form; 
	}
	
	private JLabel[] getFormPasivoLargoPlazo() {
		JLabel[] form = {txtDocPorPagar};
		return form; 
	}
	
	private JLabel[] getFormCapitalContable() {
		JLabel[] form = {txtCapSoc, txtReser,  txtResEjeAnt, txtReslEje};
		return form; 
	}

}
