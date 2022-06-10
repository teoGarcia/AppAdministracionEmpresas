package main.java.CuartoMedio.EmprendimientoYEmpleabilidad.Menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import main.java.CuartoMedio.EmprendimientoYEmpleabilidad.PlanNegocios.VistaPlanNegocios;
import main.java.CuartoMedio.LegislacionLaboral.Contratos.VistaContratos;
import main.java.CuartoMedio.LegislacionLaboral.Menu.ControladorMenuLegislacionLaboral;
import main.java.Menu.Side.SideMenu;

public class VistaMenuEyE extends JPanel {
	
	private JButton btnPlaNeg;
	private JButton btnAnaFODA;
	private JButton btnPre;
	private JButton btnFinTrab;
	private JButton btnCalProd;
	private JButton btnCarGan;
	private JButton btnPlaMar;
	private JButton btnCalProy;
	private JButton btnFluCaj;
	private JButton btnConGas;
	private JButton btnGas;
	private JButton btnRegPro;
	private JButton btnLisPre;
	
	private ControlMenuEyE cmee;

	/**
	 * Create the panel.
	 */
	public VistaMenuEyE() {
		inicialize();
		contentViewDefault();

	}
	
	private void inicialize() {
		
		cmee = new ControlMenuEyE(this);
		
		setBounds(0, 0, 208, 476);
		setLayout(new GridLayout(0, 1, 0, 0));
		setOpaque(false);
		
		btnPlaNeg = new JButton("Plan de Negocios");
		btnPlaNeg.setForeground(Color.WHITE);
		btnPlaNeg.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnPlaNeg.setBackground(new Color(54, 54, 54));
		btnPlaNeg.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnPlaNeg.addActionListener(cmee);
		add(btnPlaNeg);
		
		btnAnaFODA = new JButton("Analisis FODA");
		btnAnaFODA.setForeground(Color.WHITE);
		btnAnaFODA.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnAnaFODA.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAnaFODA.setBackground(new Color(54, 54, 54));
		btnAnaFODA.addActionListener(cmee);
		add(btnAnaFODA);
		
		btnPre = new JButton("Presupuesto");
		btnPre.setForeground(Color.WHITE);
		btnPre.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnPre.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnPre.setBackground(new Color(54, 54, 54));
		btnPre.addActionListener(cmee);
		add(btnPre);
		
		btnLisPre = new JButton("Lista de Precios");
		btnLisPre.setForeground(Color.WHITE);
		btnLisPre.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnLisPre.setBackground(new Color(54, 54, 54));
		btnLisPre.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnLisPre.addActionListener(cmee);
		add(btnLisPre);
		
		btnRegPro = new JButton("Registro de proveedores");
		btnRegPro.setForeground(Color.WHITE);
		btnRegPro.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnRegPro.setBackground(new Color(54, 54, 54));
		btnRegPro.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnRegPro.addActionListener(cmee);
		add(btnRegPro);

		btnGas = new JButton("Gastos");
		btnGas.setForeground(Color.WHITE);
		btnGas.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnGas.setBackground(new Color(54, 54, 54));
		btnGas.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnGas.addActionListener(cmee);
		add(btnGas);
		
		btnConGas = new JButton("Control de gastos");
		btnConGas.setForeground(Color.WHITE);
		btnConGas.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnConGas.setBackground(new Color(54, 54, 54));
		btnConGas.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnConGas.addActionListener(cmee);
		add(btnConGas);
		
		btnFluCaj = new JButton("Flujo de caja");
		btnFluCaj.setForeground(Color.WHITE);
		btnFluCaj.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnFluCaj.setBackground(new Color(54, 54, 54));
		btnFluCaj.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnFluCaj.addActionListener(cmee);
		add(btnFluCaj);
		
		btnCalProy = new JButton("calendario de proyecto");
		btnCalProy.setForeground(Color.WHITE);
		btnCalProy.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCalProy.setBackground(new Color(54, 54, 54));
		btnCalProy.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCalProy.addActionListener(cmee);
		add(btnCalProy);
		
		btnPlaMar = new JButton("Plan de Marketing");
		btnPlaMar.setForeground(Color.WHITE);
		btnPlaMar.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnPlaMar.setBackground(new Color(54, 54, 54));
		btnPlaMar.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnPlaMar.addActionListener(cmee);
		add(btnPlaMar);
		
		btnCarGan = new JButton("Carta Gantt");
		btnCarGan.setForeground(Color.WHITE);
		btnCarGan.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCarGan.setBackground(new Color(54, 54, 54));
		btnCarGan.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCarGan.addActionListener(cmee);
		add(btnCarGan);
		
		btnCalProd = new JButton("Calendario de producci\u00F3n");
		btnCalProd.setForeground(Color.WHITE);
		btnCalProd.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCalProd.setBackground(new Color(54, 54, 54));
		btnCalProd.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCalProd.addActionListener(cmee);
		add(btnCalProd);
		
	}
	
	private void contentViewDefault() {
		SideMenu.registerContentPanel(new VistaPlanNegocios(), btnPlaNeg.getText());
	}

	public JButton getBtnPlaNeg() {
		return btnPlaNeg;
	}

	public void setBtnPlaNeg(JButton btnPlaNeg) {
		this.btnPlaNeg = btnPlaNeg;
	}

	public JButton getBtnAnaFODA() {
		return btnAnaFODA;
	}

	public void setBtnAnaFODA(JButton btnAnaFODA) {
		this.btnAnaFODA = btnAnaFODA;
	}

	public JButton getBtnPre() {
		return btnPre;
	}

	public void setBtnPre(JButton btnPre) {
		this.btnPre = btnPre;
	}

	public JButton getBtnFinTrab() {
		return btnFinTrab;
	}

	public void setBtnFinTrab(JButton btnFinTrab) {
		this.btnFinTrab = btnFinTrab;
	}

	public JButton getBtnCalProd() {
		return btnCalProd;
	}

	public void setBtnCalProd(JButton btnCalProd) {
		this.btnCalProd = btnCalProd;
	}

	public JButton getBtnCarGan() {
		return btnCarGan;
	}

	public void setBtnCarGan(JButton btnCarGan) {
		this.btnCarGan = btnCarGan;
	}

	public JButton getBtnPlaMar() {
		return btnPlaMar;
	}

	public void setBtnPlaMar(JButton btnPlaMar) {
		this.btnPlaMar = btnPlaMar;
	}

	public JButton getBtnCalProy() {
		return btnCalProy;
	}

	public void setBtnCalProy(JButton btnCalProy) {
		this.btnCalProy = btnCalProy;
	}

	public JButton getBtnFluCaj() {
		return btnFluCaj;
	}

	public void setBtnFluCaj(JButton btnFluCaj) {
		this.btnFluCaj = btnFluCaj;
	}

	public JButton getBtnConGas() {
		return btnConGas;
	}

	public void setBtnConGas(JButton btnConGas) {
		this.btnConGas = btnConGas;
	}

	public JButton getBtnGas() {
		return btnGas;
	}

	public void setBtnGas(JButton btnGas) {
		this.btnGas = btnGas;
	}

	public JButton getBtnRegPro() {
		return btnRegPro;
	}

	public void setBtnRegPro(JButton btnRegPro) {
		this.btnRegPro = btnRegPro;
	}

	public JButton getBtnLisPre() {
		return btnLisPre;
	}

	public void setBtnLisPre(JButton btnLisPre) {
		this.btnLisPre = btnLisPre;
	}

}
