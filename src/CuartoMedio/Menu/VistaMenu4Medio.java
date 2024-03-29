package CuartoMedio.Menu;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Main.Window;
import Menu.Principal.VistaMenu;
import Menu.Side.SideMenu;
import TerceroMedio.Menu.VistaMenu3Medio;

import java.awt.Color;

public class VistaMenu4Medio extends JPanel {
	
	private ControladorMenu4Medio cm4m;
	
	private JButton btnLegisLabo;
	private JButton btnCalRemFinObli;
	private JButton btnDotPer;
	private JButton btnDesBinePer;
	private JButton btnEmpreEmple;
	private JButton btnGesBode;
	private JButton btnExit;

	private JButton btnBack;
	
	
	public VistaMenu4Medio() {
		inicialize();
	}
	
	public void inicialize() {
		
		cm4m = new ControladorMenu4Medio(this);
		
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
		
		JLabel lblLogoColegio_1 = new JLabel("");
		lblLogoColegio_1.setIcon(new ImageIcon(VistaMenu.class.getResource("/Imagenes/Logotipos/logo Empresa 2.jpg")));
		lblLogoColegio_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoColegio_1.setBounds(751, 52, 250, 107);
		add(lblLogoColegio_1);
		
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
		btnExit.setIcon(new ImageIcon(VistaMenu4Medio.class.getResource("/Imagenes/Icons/salida.png")));
		btnExit.addMouseListener(cm4m);
		add(btnExit);
		

		btnBack = new JButton();
		btnBack.setBackground(new Color(0, 0, 0));
		btnBack.setBounds(792, 659, 79, 64);
		btnBack.setBorder(null);
		btnBack.setOpaque(false);
		btnBack.setIcon(new ImageIcon(VistaMenu4Medio.class.getResource("/Imagenes/Icons/back.png")));
		btnBack.addMouseListener(cm4m);
		add(btnBack);
		
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon(VistaMenu4Medio.class.getResource("/Imagenes/ImagenesFondo/fondo gris oscuro.jpg")));
		lblBg.setBounds(0, 0, 1024, 768);
		add(lblBg);
		
		btnLegisLabo = new JButton("Legislacion Laboral");
		btnLegisLabo.setForeground(new Color(255, 255, 255));
		btnLegisLabo.setBackground(new Color(54, 54, 54));
		btnLegisLabo.setFont(new Font("Dialog", Font.BOLD, 14));
		btnLegisLabo.addActionListener(cm4m);
		panel.add(btnLegisLabo);
		
		btnCalRemFinObli = new JButton("Calculo de remuneraciones");
		btnCalRemFinObli.setForeground(new Color(255, 255, 255));
		btnCalRemFinObli.setBackground(new Color(54, 54, 54));
		btnCalRemFinObli.setFont(new Font("Dialog", Font.BOLD, 14));
		btnCalRemFinObli.addActionListener(cm4m);
		panel.add(btnCalRemFinObli);
		
		btnDotPer = new JButton("Dotacion de Personal");
		btnDotPer.setForeground(new Color(255, 255, 255));
		btnDotPer.setBackground(new Color(54, 54, 54));
		btnDotPer.setFont(new Font("Dialog", Font.BOLD, 14));
		btnDotPer.addActionListener(cm4m);
		panel.add(btnDotPer);
		
		btnDesBinePer = new JButton("Desarrollo y Bienestar de Personal");
		btnDesBinePer.setForeground(new Color(255, 255, 255));
		btnDesBinePer.setBackground(new Color(54, 54, 54));
		btnDesBinePer.setFont(new Font("Dialog", Font.BOLD, 14));
		btnDesBinePer.addActionListener(cm4m);
		panel.add(btnDesBinePer);
		
		btnEmpreEmple = new JButton("Emprendimiento y empleabilidad");
		btnEmpreEmple.setForeground(new Color(255, 255, 255));
		btnEmpreEmple.setBackground(new Color(54, 54, 54));
		btnEmpreEmple.setFont(new Font("Dialog", Font.BOLD, 14));
		btnEmpreEmple.addActionListener(cm4m);
		panel.add(btnEmpreEmple);
		
		btnGesBode = new JButton("Gestion de Bodega");
		btnGesBode.setForeground(new Color(255, 255, 255));
		btnGesBode.setBackground(new Color(54, 54, 54));
		btnGesBode.setFont(new Font("Dialog", Font.BOLD, 14));
		btnGesBode.addActionListener(cm4m);
		panel.add(btnGesBode);
		
	}

	public JButton getBtnLegisLabo() {
		return btnLegisLabo;
	}

	public JButton getBtnCalRemFinObli() {
		return btnCalRemFinObli;
	}

	public void setBtnCalRemFinObli(JButton btnCalRemFinObli) {
		this.btnCalRemFinObli = btnCalRemFinObli;
	}

	public JButton getBtnDotPer() {
		return btnDotPer;
	}

	public void setBtnDotPer(JButton btnDotPer) {
		this.btnDotPer = btnDotPer;
	}

	public JButton getBtnDesBinePer() {
		return btnDesBinePer;
	}

	public void setBtnDesBinePer(JButton btnDesBinePer) {
		this.btnDesBinePer = btnDesBinePer;
	}

	public JButton getBtnEmpreEmple() {
		return btnEmpreEmple;
	}

	public void setBtnEmpreEmple(JButton btnEmpreEmple) {
		this.btnEmpreEmple = btnEmpreEmple;
	}

	public JButton getBtnGesBode() {
		return btnGesBode;
	}

	public void setBtnGesBode(JButton btnGesBode) {
		this.btnGesBode = btnGesBode;
	}

	public JButton getBtnExit() {
		return btnExit;
	}

	public void setBtnExit(JButton btnExit) {
		this.btnExit = btnExit;
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}
	
}
