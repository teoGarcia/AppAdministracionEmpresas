package TerceroMedio.UtilizacionDeLaInformacionContable.Menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Menu.Side.SideMenu;
import TerceroMedio.ProcesosAdministrativos.FormatoProyecto.VistaFormatoProyecto;
import TerceroMedio.ProcesosAdministrativos.Menu.ControlMenuProcesosAdministrativos;
import TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.VistaLibroDiarioYMayor;
         

public class VistaMenuUtilizacionDeLaInformacionContable extends JPanel {

	private ControlMenuUtilizacionDeLaInformacionContable control;
	private JButton btnLibDiaLibMay;
	private JButton btnBalGen;
	private JButton btnInv;
	private JButton btnDep;
	
	public VistaMenuUtilizacionDeLaInformacionContable() {
		super();
		inicialize();
		contentViewDefault();
	} 
	
	private void inicialize() {
		
		control = new ControlMenuUtilizacionDeLaInformacionContable(this);
		
		setBounds(0, 0, 208, 476);
		setLayout(new GridLayout(0, 1, 0, 0));
		setOpaque(false);
		
		btnLibDiaLibMay = new JButton("Libro Diario y Mayor");
		btnLibDiaLibMay.setForeground(Color.WHITE);
		btnLibDiaLibMay.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnLibDiaLibMay.setBackground(new Color(54, 54, 54));
		btnLibDiaLibMay.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnLibDiaLibMay.addActionListener(control);
		add(btnLibDiaLibMay);
		
		btnBalGen = new JButton("Balance General");
		btnBalGen.setForeground(Color.WHITE);
		btnBalGen.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnBalGen.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnBalGen.setBackground(new Color(54, 54, 54));
		btnBalGen.addActionListener(control);
		add(btnBalGen);
		
		btnInv = new JButton("Inventario (FIFO, PMP)");
		btnInv.setForeground(Color.WHITE);
		btnInv.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnInv.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnInv.setBackground(new Color(54, 54, 54));
		btnInv.addActionListener(control);
		add(btnInv);
		
		btnDep = new JButton("Depreciacion");
		btnDep.setForeground(Color.WHITE);
		btnDep.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnDep.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnDep.setBackground(new Color(54, 54, 54));
		btnDep.addActionListener(control);
		add(btnDep);
		
	}
	
	private void contentViewDefault() {
		SideMenu.registerContentPanel(new VistaLibroDiarioYMayor(), btnLibDiaLibMay.getText());
	}

	public ControlMenuUtilizacionDeLaInformacionContable getControl() {
		return control;
	}

	public void setControl(ControlMenuUtilizacionDeLaInformacionContable control) {
		this.control = control;
	}

	public JButton getBtnLibDiaLibMay() {
		return btnLibDiaLibMay;
	}

	public void setBtnLibDiaLibMay(JButton btnLibDiaLibMay) {
		this.btnLibDiaLibMay = btnLibDiaLibMay;
	}

	public JButton getBtnBalGen() {
		return btnBalGen;
	}

	public void setBtnBalGen(JButton btnBalGen) {
		this.btnBalGen = btnBalGen;
	}

	public JButton getBtnInv() {
		return btnInv;
	}

	public void setBtnInv(JButton btnInv) {
		this.btnInv = btnInv;
	}

	public JButton getBtnDep() {
		return btnDep;
	}

	public void setBtnDep(JButton btnDep) {
		this.btnDep = btnDep;
	}
	
}
