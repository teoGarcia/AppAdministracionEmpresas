package CuartoMedio.CalculoDeRemuneraciones.Menu;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import CuartoMedio.LegislacionLaboral.Contratos.VistaContratos;
import Menu.Side.SideMenu;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaMenuCalculoDeRemuneraciones extends JPanel {
	
	private JButton btnLiqSue;
	private JButton btnPagCot;
	private JButton btnLibRem;
	private JButton btnAsiConRem;
	private ControladorMenuCalculoDeRemuneraciones cmll;

	/**
	 * Create the panel.
	 */
	public VistaMenuCalculoDeRemuneraciones() {
		inicialize();
		contentViewDefault();
	}

	private void inicialize() {
		
		cmll = new ControladorMenuCalculoDeRemuneraciones(this);
		
		setBounds(0, 0, 208, 476);
		setLayout(new GridLayout(0, 1, 0, 0));
		setOpaque(false);
		
		btnLiqSue = new JButton("Liquidaciones de Sueldo");
		btnLiqSue.setForeground(Color.WHITE);
		btnLiqSue.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnLiqSue.setBackground(new Color(54, 54, 54));
		btnLiqSue.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnLiqSue.addActionListener(cmll);
		add(btnLiqSue);
		
		btnPagCot = new JButton("Pago de Cotizaciones");
		btnPagCot.setForeground(Color.WHITE);
		btnPagCot.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnPagCot.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnPagCot.setBackground(new Color(54, 54, 54));
		btnPagCot.addActionListener(cmll);
		add(btnPagCot);
		
		btnLibRem = new JButton("Libro de Remuneraciones");
		btnLibRem.setForeground(Color.WHITE);
		btnLibRem.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnLibRem.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnLibRem.setBackground(new Color(54, 54, 54));
		btnLibRem.addActionListener(cmll);
		add(btnLibRem);
		
		btnAsiConRem = new JButton("Asi. Con. Remuneraciones");
		btnAsiConRem.setForeground(Color.WHITE);
		btnAsiConRem.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnAsiConRem.setBackground(new Color(54, 54, 54));
		btnAsiConRem.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAsiConRem.addActionListener(cmll);
		add(btnAsiConRem);
		
	}
	
	private void contentViewDefault() {
		//SideMenu.registerContentPanel(new VistaContratos(), btnLiqSue.getText());
	}

	public JButton getBtnLiqSue() {
		return btnLiqSue;
	}

	public JButton getBtnPagCot() {
		return btnPagCot;
	}

	public JButton getBtnLibRem() {
		return btnLibRem;
	}

	public JButton getBtnAsiConRem() {
		return btnAsiConRem;
	}

	
}
