package TerceroMedio.Menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import CuartoMedio.Menu.VistaMenu4Medio;
import Menu.Principal.VistaMenu;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JLabel;

public class VistaMenu3Medio extends JPanel {
	
	private ControlMenu3Medio control;
	private JButton btnExit;
	private JButton btnProAdm;
	private JButton btnUtiInfCon;
	private JButton btnOrgOfi;
	private JButton btnGesComTri;
	private JButton btnAteCli;
	private JButton btnGesBode;
	

	public VistaMenu3Medio() {
		inicialize();
	}
	
	public void inicialize() {
		
		control = new ControlMenu3Medio(this);
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setBounds(0, 0, 1024, 768);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(146, 204, 694, 433);
		add(panel);
		panel.setLayout(new GridLayout(2, 2, 20, 20));
		
		JLabel lblLogoColegio = new JLabel("");
		lblLogoColegio.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoColegio.setIcon(new ImageIcon(VistaMenu4Medio.class.getResource("/Imagenes/Logotipos/Logo Colegio bien.png")));
		lblLogoColegio.setBounds(10, 11, 110, 179);
		add(lblLogoColegio);
		
		JEditorPane dtrpnColegioBicentenarioSanta = new JEditorPane();
		dtrpnColegioBicentenarioSanta.setOpaque(false);
		dtrpnColegioBicentenarioSanta.setForeground(Color.WHITE);
		dtrpnColegioBicentenarioSanta.setBackground(new Color(60, 60, 60));
		dtrpnColegioBicentenarioSanta.setText("Colegio\r\nBicentenario\r\nSanta Maria \r\nde Aconcagua");
		dtrpnColegioBicentenarioSanta.setFont(new Font("Dialog", Font.BOLD, 13));
		dtrpnColegioBicentenarioSanta.setBounds(119, 100, 100, 80);
		add(dtrpnColegioBicentenarioSanta);
		
		btnExit = new JButton("");
		btnExit.setBackground(new Color(0, 0, 0));
		btnExit.setBorder(null);
		btnExit.setOpaque(false);
		btnExit.setBounds(28, 659, 79, 64);
		btnExit.setIcon(new ImageIcon(VistaMenu.class.getResource("/Imagenes/Icons/salida.png")));
		btnExit.addMouseListener(control);
		add(btnExit);
		
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon(VistaMenu4Medio.class.getResource("/Imagenes/ImagenesFondo/fondo gris oscuro.jpg")));
		lblBg.setBounds(0, 0, 1024, 768);
		add(lblBg);
		
		btnProAdm = new JButton("Procesos Administrativos");
		btnProAdm.setForeground(new Color(255, 255, 255));
		btnProAdm.setBackground(new Color(54, 54, 54));
		btnProAdm.setFont(new Font("Dialog", Font.BOLD, 14));
		btnProAdm.addActionListener(control);
		panel.add(btnProAdm);
		
		btnUtiInfCon = new JButton("Utilizacion de la inf. Contable");
		btnUtiInfCon.setForeground(new Color(255, 255, 255));
		btnUtiInfCon.setBackground(new Color(54, 54, 54));
		btnUtiInfCon.setFont(new Font("Dialog", Font.BOLD, 14));
		btnUtiInfCon.addActionListener(control);
		panel.add(btnUtiInfCon);
		
		btnOrgOfi = new JButton("Organizacion de Oficinas");
		btnOrgOfi.setForeground(new Color(255, 255, 255));
		btnOrgOfi.setBackground(new Color(54, 54, 54));
		btnOrgOfi.setFont(new Font("Dialog", Font.BOLD, 14));
		btnOrgOfi.addActionListener(control);
		panel.add(btnOrgOfi);
		
		btnGesComTri = new JButton("Gestion Comercial y tributaria");
		btnGesComTri.setForeground(new Color(255, 255, 255));
		btnGesComTri.setBackground(new Color(54, 54, 54));
		btnGesComTri.setFont(new Font("Dialog", Font.BOLD, 14));
		btnGesComTri.addActionListener(control);
		panel.add(btnGesComTri);
		
		btnAteCli = new JButton("Atencion de Clientes");
		btnAteCli.setForeground(new Color(255, 255, 255));
		btnAteCli.setBackground(new Color(54, 54, 54));
		btnAteCli.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAteCli.addActionListener(control);
		panel.add(btnAteCli);
		
		btnGesBode = new JButton("Gestion de Bodega");
		btnGesBode.setForeground(new Color(255, 255, 255));
		btnGesBode.setBackground(new Color(54, 54, 54));
		btnGesBode.setFont(new Font("Dialog", Font.BOLD, 14));
		btnGesBode.addActionListener(control);
		panel.add(btnGesBode);
	
		
	}

	public ControlMenu3Medio getControl() {
		return control;
	}

	public JButton getBtnExit() {
		return btnExit;
	}

	public JButton getBtnProAdm() {
		return btnProAdm;
	}

	public JButton getBtnUtiInfCon() {
		return btnUtiInfCon;
	}

	public JButton getBtnOrgOfi() {
		return btnOrgOfi;
	}

	public JButton getBtnGesComTri() {
		return btnGesComTri;
	}

	public JButton getBtnAteCli() {
		return btnAteCli;
	}

	public JButton getBtnGesBode() {
		return btnGesBode;
	}

	public void setControl(ControlMenu3Medio control) {
		this.control = control;
	}

	public void setBtnExit(JButton btnExit) {
		this.btnExit = btnExit;
	}

	public void setBtnProAdm(JButton btnProAdm) {
		this.btnProAdm = btnProAdm;
	}

	public void setBtnUtiInfCon(JButton btnUtiInfCon) {
		this.btnUtiInfCon = btnUtiInfCon;
	}

	public void setBtnOrgOfi(JButton btnOrgOfi) {
		this.btnOrgOfi = btnOrgOfi;
	}

	public void setBtnGesComTri(JButton btnGesComTri) {
		this.btnGesComTri = btnGesComTri;
	}

	public void setBtnAteCli(JButton btnAteCli) {
		this.btnAteCli = btnAteCli;
	}

	public void setBtnGesBode(JButton btnGesBode) {
		this.btnGesBode = btnGesBode;
	}
	
}
