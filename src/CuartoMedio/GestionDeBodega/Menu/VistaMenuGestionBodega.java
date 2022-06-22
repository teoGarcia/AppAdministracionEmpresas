package CuartoMedio.GestionDeBodega.Menu;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import CuartoMedio.GestionDeBodega.Inventario.VistaInventario;
import CuartoMedio.LegislacionLaboral.Contratos.VistaContratos;
import Menu.Side.SideMenu;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaMenuGestionBodega extends JPanel {
	
	private JButton btnInventario;
	private JButton btnCodPro;
	private JButton btnIngMer;
	private JButton btnEgrMer;
	private ControladorMenuGestionDeBodega cmll;
	private JButton btnMerMer;

	/**
	 * Create the panel.
	 */
	public VistaMenuGestionBodega() {
		inicialize();
		contentViewDefault();
	}

	private void inicialize() {
		
		cmll = new ControladorMenuGestionDeBodega(this);
		
		setBounds(0, 0, 208, 476);
		setLayout(new GridLayout(0, 1, 0, 0));
		setOpaque(false);
		
		btnInventario = new JButton("Inventario");
		btnInventario.setForeground(Color.WHITE);
		btnInventario.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnInventario.setBackground(new Color(54, 54, 54));
		btnInventario.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnInventario.addActionListener(cmll);
		add(btnInventario);
		
		btnCodPro = new JButton("Codificaci\u00F3n de Productos");
		btnCodPro.setForeground(Color.WHITE);
		btnCodPro.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCodPro.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCodPro.setBackground(new Color(54, 54, 54));
		btnCodPro.addActionListener(cmll);
		add(btnCodPro);
		
		btnIngMer = new JButton("Ingreso de Mercader\u00EDa");
		btnIngMer.setForeground(Color.WHITE);
		btnIngMer.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnIngMer.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnIngMer.setBackground(new Color(54, 54, 54));
		btnIngMer.addActionListener(cmll);
		add(btnIngMer);
		
		btnEgrMer = new JButton("Egreso de Mercader\u00EDa");
		btnEgrMer.setForeground(Color.WHITE);
		btnEgrMer.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnEgrMer.setBackground(new Color(54, 54, 54));
		btnEgrMer.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnEgrMer.addActionListener(cmll);
		add(btnEgrMer);
		
		btnMerMer = new JButton("Mermas de Mercader\u00EDas ");
		btnMerMer.setForeground(Color.WHITE);
		btnMerMer.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnMerMer.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnMerMer.setBackground(new Color(54, 54, 54));
		btnMerMer.addActionListener(cmll);
		add(btnMerMer);
		
	}
	
	private void contentViewDefault() {
		SideMenu.registerContentPanel(new VistaInventario(), btnInventario.getText());
	}

	public JButton getBtnInventario() {
		return btnInventario;
	}

	public void setBtnInventario(JButton btnInventario) {
		this.btnInventario = btnInventario;
	}

	public JButton getBtnCodPro() {
		return btnCodPro;
	}

	public void setBtnCodPro(JButton btnCodPro) {
		this.btnCodPro = btnCodPro;
	}

	public JButton getBtnIngMer() {
		return btnIngMer;
	}

	public void setBtnIngMer(JButton btnIngMer) {
		this.btnIngMer = btnIngMer;
	}

	public JButton getBtnEgrMer() {
		return btnEgrMer;
	}

	public void setBtnEgrMer(JButton btnEgrMer) {
		this.btnEgrMer = btnEgrMer;
	}

	public JButton getBtnMerMer() {
		return btnMerMer;
	}

	public void setBtnMerMer(JButton btnMerMer) {
		this.btnMerMer = btnMerMer;
	}
	
}
