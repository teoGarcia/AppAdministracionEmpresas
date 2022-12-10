package TerceroMedio.UtilizacionDeLaInformacionContable.BalanceGeneral.Imprimir;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import TerceroMedio.UtilizacionDeLaInformacionContable.BalanceGeneral.BalanceGeneralEntity;
import core.Helpers;
import ui.imprimir.PanelImprimirI;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class Pagina1 extends PanelImprimirI<BalanceGeneralEntity> {

	private Color FontColor = Color.BLACK;
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
	private JLabel txtCapSoc;
	private JLabel txtSumaDelPasivo;
	private JLabel txtTotPasALargoPlas;
	private JLabel txtDocPorPagar;
	private JLabel txtTotalPasCir;
	private JLabel txtAnticipoCliente;
	private JLabel txtISRPorPagar;
	private JLabel txtInteresesPorPagar;
	private JLabel txtAcreedores;
	private JLabel txtProveedores;

	public Pagina1() {
		super("Balance General");
		int disminuir = 70;

		JLabel lblNomEmp = new JLabel("Nombre de Empresa");
		lblNomEmp.setForeground(FontColor);
		lblNomEmp.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNomEmp.setBounds(20, 81, 136, 24);
		add(lblNomEmp);

		txtNomEmpre = new JLabel();
		txtNomEmpre.setForeground(FontColor);
		txtNomEmpre.setBounds(160, 81, 192, 24);
		add(txtNomEmpre);

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setForeground(FontColor);
		lblFecha.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblFecha.setBounds(373, 81, 39, 24);
		add(lblFecha);

		dateFecha = new JLabel();
		dateFecha.setForeground(FontColor);
		dateFecha.setBounds(422, 81, 124, 27);
		add(dateFecha);

		// activos

		JLabel lblNewLabel_2 = new JLabel("ACTIVOS");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(FontColor);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2.setBounds(32, 131, 215, 24);
		add(lblNewLabel_2);

		// activo circulante

		JLabel lblRemuneracion = new JLabel("Activo Circulante");
		lblRemuneracion.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemuneracion.setForeground(FontColor);
		lblRemuneracion.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRemuneracion.setBounds(66, 164, 166, 24);
		add(lblRemuneracion);

		JLabel lblSueBas = new JLabel("Caja");
		lblSueBas.setForeground(FontColor);
		lblSueBas.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSueBas.setBounds(20, 199, 153, 24);
		add(lblSueBas);

		txtCaja = new JLabel();
		txtCaja.setForeground(FontColor);
		txtCaja.setBounds(171, 199, 99, 24);
		add(txtCaja);

		JLabel lblHorExt = new JLabel("Bancos");
		lblHorExt.setForeground(FontColor);
		lblHorExt.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblHorExt.setBounds(20, 234, 153, 24);
		add(lblHorExt);

		txtBancos = new JLabel();
		txtBancos.setForeground(FontColor);
		txtBancos.setBounds(171, 233, 99, 24);
		add(txtBancos);

		JLabel lblBonGes = new JLabel("Inversiones a corto plazo");
		lblBonGes.setForeground(FontColor);
		lblBonGes.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBonGes.setBounds(20, 269, 136, 24);
		add(lblBonGes);
		

		txtInvCorPla = new JLabel();
		txtInvCorPla.setForeground(FontColor);
		txtInvCorPla.setBounds(171, 269, 99, 24);
		add(txtInvCorPla);

		JLabel lblPar = new JLabel("Cuentas por Cobrar");
		lblPar.setForeground(FontColor);
		lblPar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPar.setBounds(20, 304, 153, 24);
		add(lblPar);
		

		txtCuentasCobrar = new JLabel();
		txtCuentasCobrar.setForeground(FontColor);
		txtCuentasCobrar.setBounds(171, 304, 99, 24);
		add(txtCuentasCobrar);

		JLabel lblCom = new JLabel("Inventario");
		lblCom.setForeground(FontColor);
		lblCom.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCom.setBounds(20, 339, 153, 24);
		add(lblCom);

		txtInventario = new JLabel();
		txtInventario.setForeground(FontColor);
		txtInventario.setBounds(171, 339, 99, 24);
		add(txtInventario);

		JLabel lblTotalActCir = new JLabel("Total Activo Circulante");
		lblTotalActCir.setForeground(FontColor);
		lblTotalActCir.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalActCir.setBounds(20, 373, 136, 24);
		add(lblTotalActCir);

		txtTotalActCir = new JLabel();
		txtTotalActCir.setForeground(FontColor);
		txtTotalActCir.setBounds(171, 373, 99, 24);
		add(txtTotalActCir);

		// Fin activo circulante

		// Activo Fijo

		JLabel lblActivoFijo = new JLabel("Activo Fijo");
		lblActivoFijo.setHorizontalAlignment(SwingConstants.CENTER);
		lblActivoFijo.setForeground(FontColor);
		lblActivoFijo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblActivoFijo.setBounds(66, 425, 166, 24);
		add(lblActivoFijo);

		JLabel lblEdic = new JLabel("Edificios");
		lblEdic.setForeground(FontColor);
		lblEdic.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEdic.setBounds(20, 460, 124, 24);
		add(lblEdic);

		txtEdificios = new JLabel();
		txtEdificios.setForeground(FontColor);
		txtEdificios.setBounds(171, 460, 99, 24);
		add(txtEdificios);

		JLabel lblTerreno = new JLabel("Terrenos");
		lblTerreno.setForeground(FontColor);
		lblTerreno.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTerreno.setBounds(20, 494, 136, 24);
		add(lblTerreno);

		txtTerreno = new JLabel();
		txtTerreno.setForeground(FontColor);
		txtTerreno.setBounds(171, 494, 99, 24);
		add(txtTerreno);

		JLabel lblDepAcum = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepAcum.setForeground(FontColor);
		lblDepAcum.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepAcum.setBounds(20, 528, 153, 24);
		add(lblDepAcum);

		txtDepAcum = new JLabel();
		txtDepAcum.setForeground(FontColor);
		txtDepAcum.setBounds(171, 528, 99, 24);
		add(txtDepAcum);

		JLabel lblMobYEq = new JLabel("Mobiliario y equipo");
		lblMobYEq.setForeground(FontColor);
		lblMobYEq.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMobYEq.setBounds(20, 562, 124, 24);
		add(lblMobYEq);

		txtMobYEq = new JLabel();
		txtMobYEq.setForeground(FontColor);
		txtMobYEq.setBounds(171, 562, 99, 24);
		add(txtMobYEq);

		JLabel lblDepA2 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA2.setForeground(FontColor);
		lblDepA2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA2.setBounds(20, 596, 153, 24);
		add(lblDepA2);

		txtDepA2 = new JLabel();
		txtDepA2.setForeground(FontColor);
		txtDepA2.setBounds(171, 596, 99, 24);
		add(txtDepA2);

		JLabel lblEqTrans = new JLabel("Equipo de transporte");
		lblEqTrans.setForeground(FontColor);
		lblEqTrans.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEqTrans.setBounds(20, 630, 153, 24);
		add(lblEqTrans);

		txtEqTrans = new JLabel();
		txtEqTrans.setForeground(FontColor);
		txtEqTrans.setBounds(171, 630, 99, 24);
		add(txtEqTrans);

		// PASIVOS

		JLabel lblPasivos = new JLabel("PASIVOS");
		lblPasivos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasivos.setForeground(FontColor);
		lblPasivos.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPasivos.setBounds(300, 131, 215, 24);
		add(lblPasivos);

		// pasivo circulante

		JLabel lblPasivoCirculante = new JLabel("Pasivo Circulante");
		lblPasivoCirculante.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasivoCirculante.setForeground(FontColor);
		lblPasivoCirculante.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPasivoCirculante.setBounds(326, 164, 166, 24);
		add(lblPasivoCirculante);

		JLabel lblCarAsiFam = new JLabel("Proveedores");
		lblCarAsiFam.setForeground(FontColor);
		lblCarAsiFam.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCarAsiFam.setBounds(319, 199, 137, 24);
		add(lblCarAsiFam);

		txtProveedores = new JLabel();
		txtProveedores.setForeground(FontColor);
		txtProveedores.setBounds(453, 199, 105, 24);
		add(txtProveedores);

		JLabel lblCol = new JLabel("Acreedores");
		lblCol.setForeground(FontColor);
		lblCol.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCol.setBounds(319, 234, 137, 24);
		add(lblCol);

		txtAcreedores = new JLabel();
		txtAcreedores.setForeground(FontColor);
		txtAcreedores.setBounds(453, 234, 105, 24);
		add(txtAcreedores);

		JLabel lblMov = new JLabel("Intereses por pagar");
		lblMov.setForeground(FontColor);
		lblMov.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMov.setBounds(319, 269, 137, 24);
		add(lblMov);

		txtInteresesPorPagar = new JLabel();
		txtInteresesPorPagar.setForeground(FontColor);
		txtInteresesPorPagar.setBounds(453, 269, 105, 24);
		add(txtInteresesPorPagar);

		JLabel lblISRPorPagar = new JLabel("ISR por pagar");
		lblISRPorPagar.setForeground(FontColor);
		lblISRPorPagar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblISRPorPagar.setBounds(319, 304, 137, 24);
		add(lblISRPorPagar);

		txtISRPorPagar = new JLabel();
		txtISRPorPagar.setForeground(FontColor);
		txtISRPorPagar.setBounds(453, 304, 105, 24);
		add(txtISRPorPagar);

		JLabel lblAnticipoCliente = new JLabel("Anticipo de clientes");
		lblAnticipoCliente.setForeground(FontColor);
		lblAnticipoCliente.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAnticipoCliente.setBounds(319, 339, 137, 24);
		add(lblAnticipoCliente);

		txtAnticipoCliente = new JLabel();
		txtAnticipoCliente.setForeground(FontColor);
		txtAnticipoCliente.setBounds(453, 339, 105, 24);
		add(txtAnticipoCliente);

		JLabel lblTotHab = new JLabel("Total Pasivo Circulante");
		lblTotHab.setForeground(FontColor);
		lblTotHab.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotHab.setBounds(318, 375, 141, 24);
		add(lblTotHab);

		txtTotalPasCir = new JLabel();
		txtTotalPasCir.setForeground(FontColor);
		txtTotalPasCir.setBounds(453, 375, 105, 24);
		add(txtTotalPasCir);
		// fin pasivo circulante

		// pasivo a largo plazo
		JLabel lblPasivoALargo = new JLabel("Pasivo a largo plazo");
		lblPasivoALargo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasivoALargo.setForeground(FontColor);
		lblPasivoALargo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPasivoALargo.setBounds(342, 425, 166, 24);
		add(lblPasivoALargo);

		JLabel lblDocumentosPorPagar = new JLabel("Documentos por pagar");
		lblDocumentosPorPagar.setForeground(FontColor);
		lblDocumentosPorPagar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDocumentosPorPagar.setBounds(318, 461, 138, 24);
		add(lblDocumentosPorPagar);

		txtDocPorPagar = new JLabel();
		txtDocPorPagar.setForeground(FontColor);
		txtDocPorPagar.setBounds(452, 461, 106, 24);
		add(txtDocPorPagar);

		JLabel lblTotalPasivoA = new JLabel("Total Pasivo a largo plazo");
		lblTotalPasivoA.setForeground(FontColor);
		lblTotalPasivoA.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalPasivoA.setBounds(317, 495, 139, 24);
		add(lblTotalPasivoA);

		txtTotPasALargoPlas = new JLabel();
		txtTotPasALargoPlas.setForeground(FontColor);
		txtTotPasALargoPlas.setBounds(452, 495, 106, 24);
		add(txtTotPasALargoPlas);

		// fin pasivo a largo plazo

		// Suma del pasivo

		JLabel lblSumaDelPasivo = new JLabel("SUMA DEL PASIVO");
		lblSumaDelPasivo.setForeground(FontColor);
		lblSumaDelPasivo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSumaDelPasivo.setBounds(317, 554, 141, 24);
		add(lblSumaDelPasivo);

		txtSumaDelPasivo = new JLabel();
		txtSumaDelPasivo.setForeground(FontColor);
		txtSumaDelPasivo.setBounds(469, 554, 89, 24);
		add(txtSumaDelPasivo);
		// fin Suma del pasivo

		// CAPITAL CONTABLE

		JLabel lblCapCont = new JLabel("CAPITAL CONTABLE");
		lblCapCont.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapCont.setForeground(FontColor);
		lblCapCont.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCapCont.setBounds(342, 589, 166, 24);
		add(lblCapCont);

		JLabel lblCapSoc = new JLabel("Capital social");
		lblCapSoc.setForeground(FontColor);
		lblCapSoc.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCapSoc.setBounds(319, 624, 124, 24);
		add(lblCapSoc);

		txtCapSoc = new JLabel();
		txtCapSoc.setForeground(FontColor);
		txtCapSoc.setBounds(453, 624, 105, 24);
		add(txtCapSoc);

	}

	@Override
	public void CargarData(BalanceGeneralEntity record) {
		// TODO Auto-generated method stub
		txtNomEmpre.setText(record.getNomEmp());
		dateFecha.setText(Helpers.getFechaFormat(record.getFecha()));

		// Activo Circulante
		txtCaja.setText("" + record.getCaja());
		txtBancos.setText("" + record.getBancos());
		txtInvCorPla.setText("" + record.getInvCorPla());
		txtCuentasCobrar.setText("" + record.getCuenPorCob());
		txtInventario.setText("" + record.getInventario());

		// Activo Fijo
		txtEdificios.setText("" + record.getEdificio());
		txtTerreno.setText("" + record.getTerreno());
		txtDepAcum.setText("" + record.getDepAcu1());
		txtMobYEq.setText("" + record.getMobEq());
		txtDepA2.setText("" + record.getDepAcu2());
		txtEqTrans.setText("" + record.getEqTransp());

		// Pasivo circulante
		txtProveedores.setText("" + record.getProveedores());
		txtAcreedores.setText("" + record.getAcreedores());
		txtInteresesPorPagar.setText("" + record.getIntPorPagar());
		txtISRPorPagar.setText("" + record.getISRporPagar());
		txtAnticipoCliente.setText("" + record.getAntiCliente());

		// pasivo a largo plazo
		txtDocPorPagar.setText("" + record.getDocPorPagar());

		// capital contable
		txtCapSoc.setText("" + record.getCapSoc());
	}
	
	public void cargarTotales(String TotalActCir, String TotalPasCir, String TotPasALargoPlas) {
		txtTotalActCir.setText(TotalActCir);
		txtTotalPasCir.setText(TotalPasCir);
		txtTotPasALargoPlas.setText(TotPasALargoPlas);
		txtSumaDelPasivo.setText(""+(Integer.parseInt(TotalPasCir)+Integer.parseInt(TotPasALargoPlas)));
	}

}
