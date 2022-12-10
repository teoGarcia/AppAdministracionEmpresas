package TerceroMedio.UtilizacionDeLaInformacionContable.BalanceGeneral.Imprimir;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import TerceroMedio.UtilizacionDeLaInformacionContable.BalanceGeneral.BalanceGeneralEntity;
import ui.imprimir.PanelImprimirI;
import javax.swing.border.LineBorder;

public class Pagina2 extends PanelImprimirI<BalanceGeneralEntity> {


	private Color FontColor = Color.BLACK;
	private JLabel txtDepA3;
	private JLabel txtEqCompu;
	private JLabel txtDepA4;
	private JLabel txtTotalActivoFijo;
	private JLabel txtRentPag;
	private JLabel txtOactDif;
	private JLabel txtTotalActDif;
	private JLabel txtSumaAct;
	private JLabel txtReser;
	private JLabel txtResEjeAnt;
	private JLabel txtReslEje;
	private JLabel txtCapCon;
	private JLabel txtSumaCapCon;
	
	public Pagina2() {
		super("Balance General");

		int disminuir = 70;
		int aux = 600;
		
		
		JLabel lblDepA3 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA3.setForeground(FontColor);
		lblDepA3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA3.setBounds(20, 87, 144, 24);
		add(lblDepA3);
		
		txtDepA3 = new JLabel();
		txtDepA3.setForeground(FontColor);
		txtDepA3.setBounds(171, 87, 100, 24);
		add(txtDepA3);
		
		JLabel lblEqCompu = new JLabel("Equipo de computo");
		lblEqCompu.setForeground(FontColor);
		lblEqCompu.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEqCompu.setBounds(20, 122, 144, 24);
		add(lblEqCompu);
		
		txtEqCompu = new JLabel();
		txtEqCompu.setForeground(FontColor);
		txtEqCompu.setBounds(171, 122, 100, 24);
		add(txtEqCompu);
		
		JLabel lblDepA4 = new JLabel("Depreciaci\u00F3n acumulada");
		lblDepA4.setForeground(FontColor);
		lblDepA4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDepA4.setBounds(20, 157, 144, 24);
		add(lblDepA4);
		
		txtDepA4 = new JLabel();
		txtDepA4.setForeground(FontColor);
		txtDepA4.setBounds(171, 157, 100, 24);
		add(txtDepA4);
		
		JLabel lblTotalActivoFijo = new JLabel("Total Activo Fijo");
		lblTotalActivoFijo.setForeground(FontColor);
		lblTotalActivoFijo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalActivoFijo.setBounds(20, 192, 144, 24);
		add(lblTotalActivoFijo);
		
		txtTotalActivoFijo = new JLabel();
		txtTotalActivoFijo.setForeground(FontColor);
		txtTotalActivoFijo.setBounds(171, 192, 100, 24);
		add(txtTotalActivoFijo);
		
		
		/// Fin de activo Fijo
		
		
		// activo diferido
		
		JLabel lblActivoDiferido = new JLabel("Activo Diferido");
		lblActivoDiferido.setHorizontalAlignment(SwingConstants.CENTER);
		lblActivoDiferido.setForeground(FontColor);
		lblActivoDiferido.setFont(new Font("Dialog", Font.BOLD, 12));
		lblActivoDiferido.setBounds(63, 242, 166, 24);
		add(lblActivoDiferido);
		
		JLabel lblRentPag = new JLabel("Rentas pagadas por anticipado");
		lblRentPag.setForeground(FontColor);
		lblRentPag.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblRentPag.setBounds(20, 277, 144, 24);
		add(lblRentPag);
		
		txtRentPag = new JLabel();
		txtRentPag.setForeground(FontColor);
		txtRentPag.setBounds(171, 277, 100, 24);
		add(txtRentPag);
		
		JLabel lblOactDif = new JLabel("Otros activos diferidos");
		lblOactDif.setForeground(FontColor);
		lblOactDif.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblOactDif.setBounds(20, 312, 144, 24);
		add(lblOactDif);
		
		txtOactDif = new JLabel();
		txtOactDif.setForeground(FontColor);
		txtOactDif.setBounds(171, 312, 100, 24);
		add(txtOactDif);
		
		JLabel lblTotalActDif = new JLabel("Total Activo Diferido");
		lblTotalActDif.setForeground(FontColor);
		lblTotalActDif.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalActDif.setBounds(20, 347, 144, 24);
		add(lblTotalActDif);
		
		txtTotalActDif = new JLabel();
		txtTotalActDif.setForeground(FontColor);
		txtTotalActDif.setBounds(171, 347, 100, 24);
		add(txtTotalActDif);
		
		// Fin activo diferido
		
		// SUMA DEL ACTIVO
		
		JLabel lblSumaAct = new JLabel("SUMA DEL ACTIVO");
		lblSumaAct.setForeground(FontColor);
		lblSumaAct.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSumaAct.setBounds(20, 382, 144, 24);
		add(lblSumaAct);
		
		txtSumaAct = new JLabel();
		txtSumaAct.setForeground(FontColor);
		txtSumaAct.setBounds(171, 382, 100, 24);
		add(txtSumaAct);
		
		// FIN SUMA DEL ACTIVO
		
		JLabel lblReser = new JLabel("Reservas");
		lblReser.setForeground(FontColor);
		lblReser.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblReser.setBounds(316, 79, 138, 24);
		add(lblReser);
		
		txtReser = new JLabel();
		txtReser.setForeground(FontColor);
		txtReser.setBounds(451, 79, 104, 24);
		add(txtReser);
		
		JLabel lblResEjeAnt = new JLabel("Resultados de ejercicios anteriores");
		lblResEjeAnt.setForeground(FontColor);
		lblResEjeAnt.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblResEjeAnt.setBounds(316, 114, 138, 24);
		add(lblResEjeAnt);
		
		txtResEjeAnt = new JLabel();
		txtResEjeAnt.setForeground(FontColor);
		txtResEjeAnt.setBounds(451, 114, 104, 24);
		add(txtResEjeAnt);
		
		JLabel lblReslEje = new JLabel("Resultados del ejercicio");
		lblReslEje.setForeground(FontColor);
		lblReslEje.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblReslEje.setBounds(316, 149, 138, 24);
		add(lblReslEje);
		
		txtReslEje = new JLabel();
		txtReslEje.setForeground(FontColor);
		txtReslEje.setBounds(451, 149, 104, 24);
		add(txtReslEje);
		
		JLabel lblCapCon = new JLabel("Total Capital contable");
		lblCapCon.setForeground(FontColor);
		lblCapCon.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCapCon.setBounds(315, 184, 139, 24);
		add(lblCapCon);
		
		txtCapCon = new JLabel();
		txtCapCon.setForeground(FontColor);
		txtCapCon.setBounds(451, 184, 104, 24);
		add(txtCapCon);
		
		// fin CAPITAL CONTABLE

		// suma del capital contable
		
		JLabel lblSumaCapCon = new JLabel("SUMA DEL CAPITAL CONTABLE");
		lblSumaCapCon.setForeground(FontColor);
		lblSumaCapCon.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSumaCapCon.setBounds(314, 219, 222, 24);
		add(lblSumaCapCon);
		
		txtSumaCapCon = new JLabel();
		txtSumaCapCon.setForeground(FontColor);
		txtSumaCapCon.setBounds(314, 254, 222, 24);
		add(txtSumaCapCon);
		
	}
	
	@Override
	public void CargarData(BalanceGeneralEntity record) {
		// TODO Auto-generated method stub
		txtDepA3.setText(""+record.getDepAcu3());
		txtEqCompu.setText(""+record.getEqComp());
		txtDepA4.setText(""+record.getDepAcu4());
		
		// Activo Diferido
		txtRentPag.setText(""+record.getRentPagAnt());
		txtOactDif.setText(""+record.getDepAcu5());
		
		txtReser.setText(""+record.getReservas());
		txtResEjeAnt.setText(""+record.getResEjeAnt());
		txtReslEje.setText(""+record.getResEje());
		

	}
	
	public void cargarTotales(String totalActivoFijo, String totalActDif, String sumaAct, String capCon, String sumaCapCon) {
		txtTotalActivoFijo.setText(totalActivoFijo);
		txtTotalActDif.setText(totalActDif);
		txtSumaAct.setText(sumaAct);
		txtCapCon.setText(capCon);
		txtSumaCapCon.setText(sumaCapCon);
	}

}
