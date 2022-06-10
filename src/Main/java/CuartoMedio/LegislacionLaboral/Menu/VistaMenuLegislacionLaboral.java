package main.java.CuartoMedio.LegislacionLaboral.Menu;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import main.java.CuartoMedio.LegislacionLaboral.Contratos.VistaContratos;
import main.java.Menu.Side.SideMenu;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaMenuLegislacionLaboral extends JPanel {
	
	private JButton btnConTra;
	private JButton btnPerLab;
	private JButton btnCerVac;
	private JButton btnFinTrab;
	private ControladorMenuLegislacionLaboral cmll;

	/**
	 * Create the panel.
	 */
	public VistaMenuLegislacionLaboral() {
		inicialize();
		contentViewDefault();
	}

	private void inicialize() {
		
		cmll = new ControladorMenuLegislacionLaboral(this);
		
		setBounds(0, 0, 208, 476);
		setLayout(new GridLayout(0, 1, 0, 0));
		setOpaque(false);
		
		btnConTra = new JButton("Contratos De Trabajo");
		btnConTra.setForeground(Color.WHITE);
		btnConTra.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnConTra.setBackground(new Color(54, 54, 54));
		btnConTra.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnConTra.addActionListener(cmll);
		add(btnConTra);
		
		btnPerLab = new JButton("Permisos Laborales");
		btnPerLab.setForeground(Color.WHITE);
		btnPerLab.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnPerLab.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnPerLab.setBackground(new Color(54, 54, 54));
		btnPerLab.addActionListener(cmll);
		add(btnPerLab);
		
		btnCerVac = new JButton("Certificado de vacaciones");
		btnCerVac.setForeground(Color.WHITE);
		btnCerVac.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCerVac.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCerVac.setBackground(new Color(54, 54, 54));
		btnCerVac.addActionListener(cmll);
		add(btnCerVac);
		
		btnFinTrab = new JButton("Finiquitos de trabajo");
		btnFinTrab.setForeground(Color.WHITE);
		btnFinTrab.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnFinTrab.setBackground(new Color(54, 54, 54));
		btnFinTrab.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnFinTrab.addActionListener(cmll);
		add(btnFinTrab);
		
	}
	
	private void contentViewDefault() {
		SideMenu.registerContentPanel(new VistaContratos(), btnConTra.getText());
	}

	public JButton getBtnFinTrab() {
		return btnFinTrab;
	}

	public JButton getBtnCerVac() {
		return btnCerVac;
	}

	public JButton getBtnConTra() {
		return btnConTra;
	}

	public JButton getBtnPerLab() {
		return btnPerLab;
	}
}
