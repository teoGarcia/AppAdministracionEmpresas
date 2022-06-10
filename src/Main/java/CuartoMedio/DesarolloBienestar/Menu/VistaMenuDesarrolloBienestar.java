package main.java.CuartoMedio.DesarolloBienestar.Menu;

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

public class VistaMenuDesarrolloBienestar extends JPanel {
	
	private JButton btnCalHorExt;
	private JButton btnCalDeVac;
	private JButton btnRegAusEmp;
	private JButton btnEvaDes;
	private ControladorMenuDesarrolloBienestar cmll;
	private JButton btnRegistroDeCapa;
	private JButton btnFichaDeTrabajador;

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
		
		btnRegAusEmp = new JButton("Registro de Ause. de Empl.");
		btnRegAusEmp.setForeground(Color.WHITE);
		btnRegAusEmp.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnRegAusEmp.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnRegAusEmp.setBackground(new Color(54, 54, 54));
		btnRegAusEmp.addActionListener(cmll);
		add(btnRegAusEmp);
		
		btnEvaDes = new JButton("Evaluaci\u00F3n de Desempe\u00F1o");
		btnEvaDes.setForeground(Color.WHITE);
		btnEvaDes.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnEvaDes.setBackground(new Color(54, 54, 54));
		btnEvaDes.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnEvaDes.addActionListener(cmll);
		add(btnEvaDes);
		
		btnRegistroDeCapa = new JButton("Registro de Capa. de Empl.");
		btnRegistroDeCapa.setForeground(Color.WHITE);
		btnRegistroDeCapa.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnRegistroDeCapa.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnRegistroDeCapa.setBackground(new Color(54, 54, 54));
		btnRegistroDeCapa.addActionListener(cmll);
		add(btnRegistroDeCapa);
		
		btnFichaDeTrabajador = new JButton("Ficha de Trabajador");
		btnFichaDeTrabajador.setForeground(Color.WHITE);
		btnFichaDeTrabajador.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnFichaDeTrabajador.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnFichaDeTrabajador.setBackground(new Color(54, 54, 54));
		btnFichaDeTrabajador.addActionListener(cmll);
		add(btnFichaDeTrabajador);
		
	}
	
	private void contentViewDefault() {
		//SideMenu.registerContentPanel(new VistaContratos(), btnLiqSue.getText());
	}
	
}
