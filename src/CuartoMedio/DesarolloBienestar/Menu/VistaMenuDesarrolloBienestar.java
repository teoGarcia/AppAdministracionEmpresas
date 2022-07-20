package CuartoMedio.DesarolloBienestar.Menu;

import java.awt.Color;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import CuartoMedio.DesarolloBienestar.CalculoHorasExtras.VistaCalculoHorasExtras;
import CuartoMedio.LegislacionLaboral.Contratos.VistaContratos;
import Menu.Side.SideMenu;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaMenuDesarrolloBienestar extends JPanel {
	
	private JButton btnCalHorExt;
	private JButton btnCalDeVac;
	private JButton btnPreCap;
	private JButton btnRegAusEmp;
	private ControladorMenuDesarrolloBienestar cmll;
	private JButton btnEvaDes;
	private JButton btnFicTra;
	private JButton btnRegCap;

	/**
	 * Create the panel.
	 */
	public VistaMenuDesarrolloBienestar() {
		inicialize();
		contentViewDefault();
	}

	private void inicialize() {
		
		cmll = new ControladorMenuDesarrolloBienestar(this);
		
		setBounds(0, 0, 208, 476);
		setLayout(new GridLayout(0, 1, 0, 0));
		setOpaque(false);
		
		btnCalHorExt = new JButton("Calculo Horas Extra");
		btnCalHorExt.setForeground(Color.WHITE);
		btnCalHorExt.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCalHorExt.setBackground(new Color(54, 54, 54));
		btnCalHorExt.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCalHorExt.addActionListener(cmll);
		add(btnCalHorExt);
		
		btnCalDeVac = new JButton("Calendario de Vacaciones");
		btnCalDeVac.setForeground(Color.WHITE);
		btnCalDeVac.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCalDeVac.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCalDeVac.setBackground(new Color(54, 54, 54));
		btnCalDeVac.addActionListener(cmll);
		add(btnCalDeVac);
		
		btnPreCap = new JButton("Presupuesto de Capacitacion");
		btnPreCap.setForeground(Color.WHITE);
		btnPreCap.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnPreCap.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnPreCap.setBackground(new Color(54, 54, 54));
		btnPreCap.addActionListener(cmll);
		add(btnPreCap);
		
		btnRegAusEmp = new JButton("Reg. Ausencia de Emp.");
		btnRegAusEmp.setForeground(Color.WHITE);
		btnRegAusEmp.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnRegAusEmp.setBackground(new Color(54, 54, 54));
		btnRegAusEmp.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnRegAusEmp.addActionListener(cmll);
		add(btnRegAusEmp);
		
		btnEvaDes = new JButton("Evaluacion de Desempe\u00F1o");
		btnEvaDes.setForeground(Color.WHITE);
		btnEvaDes.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnEvaDes.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnEvaDes.setBackground(new Color(54, 54, 54));
		btnEvaDes.addActionListener(cmll);
		add(btnEvaDes);
		
		btnRegCap = new JButton("Registro de Capac. de Emp.");
		btnRegCap.setForeground(Color.WHITE);
		btnRegCap.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnRegCap.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnRegCap.setBackground(new Color(54, 54, 54));
		btnRegCap.addActionListener(cmll);
		add(btnRegCap);
		
		btnFicTra = new JButton("Ficha de Trabajador");
		btnFicTra.setForeground(Color.WHITE);
		btnFicTra.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnFicTra.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnFicTra.setBackground(new Color(54, 54, 54));
		btnFicTra.addActionListener(cmll);
		add(btnFicTra);
		
	}
	
	private void contentViewDefault() {
		SideMenu.registerContentPanel(new VistaCalculoHorasExtras(), btnCalHorExt.getText());
	}

	public JButton getBtnCalHorExt() {
		return btnCalHorExt;
	}

	public void setBtnCalHorExt(JButton btnCalHorExt) {
		this.btnCalHorExt = btnCalHorExt;
	}

	public JButton getBtnCalDeVac() {
		return btnCalDeVac;
	}

	public void setBtnCalDeVac(JButton btnCalDeVac) {
		this.btnCalDeVac = btnCalDeVac;
	}

	public JButton getBtnPreCap() {
		return btnPreCap;
	}

	public void setBtnPreCap(JButton btnPreCap) {
		this.btnPreCap = btnPreCap;
	}

	public JButton getBtnRegAusEmp() {
		return btnRegAusEmp;
	}

	public void setBtnRegAusEmp(JButton btnRegAusEmp) {
		this.btnRegAusEmp = btnRegAusEmp;
	}

	public JButton getBtnEvaDes() {
		return btnEvaDes;
	}

	public void setBtnEvaDes(JButton btnEvaDes) {
		this.btnEvaDes = btnEvaDes;
	}

	public JButton getBtnFicTra() {
		return btnFicTra;
	}

	public void setBtnFicTra(JButton btnFicTra) {
		this.btnFicTra = btnFicTra;
	}

	public JButton getBtnRegCap() {
		return btnRegCap;
	}

	public void setBtnRegCap(JButton btnRegCap) {
		this.btnRegCap = btnRegCap;
	}


	
}
