package Menus.MenuPrincipal.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;

public class VistaMenuPrincipal extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public VistaMenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMenuLateral = new JPanel();
		panelMenuLateral.setBounds(0, 0, 219, 729);
		contentPane.add(panelMenuLateral);
		panelMenuLateral.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("4to Medio");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(54, 54, 54));
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_1.setBounds(0, 296, 219, 48);
		panelMenuLateral.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3ero Medio");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(51, 51, 51));
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_2.setBounds(0, 343, 219, 48);
		panelMenuLateral.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VistaMenuPrincipal.class.getResource("/Imagenes/Icons/salida.png")));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 654, 64, 64);
		panelMenuLateral.add(lblNewLabel);
		
		JLabel lblLogoColegio = new JLabel("");
		lblLogoColegio.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoColegio.setIcon(new ImageIcon(VistaMenuPrincipal.class.getResource("/Imagenes/Logo Colegio bien.png")));
		lblLogoColegio.setBounds(10, 11, 110, 179);
		panelMenuLateral.add(lblLogoColegio);
		
		JEditorPane dtrpnColegioBicentenarioSanta = new JEditorPane();
		dtrpnColegioBicentenarioSanta.setForeground(Color.WHITE);
		dtrpnColegioBicentenarioSanta.setBackground(new Color(60, 60, 60));
		dtrpnColegioBicentenarioSanta.setText("Colegio\r\nBicentenario\r\nSanta Maria \r\nde Aconcagua");
		dtrpnColegioBicentenarioSanta.setFont(new Font("Dialog", Font.BOLD, 13));
		dtrpnColegioBicentenarioSanta.setBounds(119, 89, 100, 80);
		panelMenuLateral.add(dtrpnColegioBicentenarioSanta);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VistaMenuPrincipal.class.getResource("/Imagenes/ImagenesFondo/fondo gris oscuro.jpg")));
		lblNewLabel_1.setBounds(0, 0, 219, 729);
		panelMenuLateral.add(lblNewLabel_1);
		
		
		
		JPanel panelRepaint = new JPanel();
		panelRepaint.setBounds(218, 0, 790, 729);
		contentPane.add(panelRepaint);
		panelRepaint.setLayout(null);
		
		JButton btnNewButton = new JButton("Legislacion Laboral");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBounds(79, 72, 217, 140);
		panelRepaint.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Calculo de remuneraciones, finiquitos y obligaciones laborales");
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_3.setBounds(513, 72, 210, 140);
		panelRepaint.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Dotacion de Personal");
		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_4.setBounds(79, 295, 217, 140);
		panelRepaint.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Emprendimiento y empleabilidad");
		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_5.setBounds(79, 526, 217, 140);
		panelRepaint.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Desarrollo y Bienestar de Personal");
		btnNewButton_6.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_6.setBounds(513, 295, 210, 140);
		panelRepaint.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Gestion de Bodega");
		btnNewButton_7.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_7.setBounds(513, 526, 210, 140);
		panelRepaint.add(btnNewButton_7);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 790, 729);
		panelRepaint.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(VistaMenuPrincipal.class.getResource("/Imagenes/ImagenesFondo/fondo-gris.jpg")));
		
		
	}
}
