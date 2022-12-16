package Menu.Principal;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import CuartoMedio.Menu.VistaMenu4Medio;
import Main.Window;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JEditorPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaMenu extends JPanel {

	private ControladorMenu cm;
	private JButton btn3Medio;
	private JButton btn4Medio;
	private JButton btnExit;

	/**
	 * Create the panel.
	 */
	public VistaMenu() {
		inicialize();
	}
	
	private void inicialize(){
		
		cm = new ControladorMenu(this); 
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setBounds(0, 0, 1024, 768);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(146, 204, 694, 433);
		add(panel);
		panel.setLayout(new GridLayout(1, 0, 20, 20));
		
		JLabel lblLogoColegio = new JLabel("");
		lblLogoColegio.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoColegio.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Logotipos/Logo Colegio bien.png")));
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
		
		btn3Medio = new JButton("3ro Medio");
		btn3Medio.setForeground(Color.WHITE);
		btn3Medio.setBorder(new LineBorder(new Color(0, 0, 0)));
		btn3Medio.setBackground(new Color(54, 54, 54));
		btn3Medio.setFont(new Font("Dialog", Font.BOLD, 28));
		btn3Medio.setBounds(0, 296, 219, 48);
		btn3Medio.addActionListener(cm);
		panel.add(btn3Medio);
		
		btn4Medio = new JButton("4to Medio");
		btn4Medio.setForeground(Color.WHITE);
		btn4Medio.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn4Medio.setBackground(new Color(54, 54, 54));
		btn4Medio.setFont(new Font("Dialog", Font.BOLD, 28));
		btn4Medio.setBounds(0, 296, 219, 48);
		btn4Medio.addActionListener(cm);
		panel.add(btn4Medio);
		
		btnExit = new JButton("");
		btnExit.setBackground(new Color(0, 0, 0));
		btnExit.setBorder(null);
		btnExit.setOpaque(false);
		btnExit.setBounds(28, 659, 79, 64);
		btnExit.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Icons/salida.png")));
		btnExit.addMouseListener(cm);
		add(btnExit);
		
		JLabel lbBg = new JLabel("");
		lbBg.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/ImagenesFondo/fondo gris oscuro.jpg")));
		lbBg.setBounds(0, 0, 1024, 768);
		add(lbBg);
		
		
	}

	public JButton getBtn3Medio() {
		return btn3Medio;
	}

	public JButton getBtn4Medio() {
		return btn4Medio;
	}

	public JButton getBtnExit() {
		return btnExit;
	}
}
