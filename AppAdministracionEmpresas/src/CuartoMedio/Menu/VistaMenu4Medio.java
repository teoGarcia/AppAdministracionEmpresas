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
import Menu.VistaMenu;
import Menu.SideMenu;

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
		lblLogoColegio.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Logotipos/Logo Colegio bien.png")));
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
		add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VistaMenu.class.getResource("/Imagenes/ImagenesFondo/fondo gris oscuro.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1024, 768);
		add(lblNewLabel_1);
		
		btnLegisLabo = new JButton("Legislacion Laboral");
		btnLegisLabo.addActionListener(cm4m);
		btnLegisLabo.setForeground(new Color(255, 255, 255));
		btnLegisLabo.setBackground(new Color(54, 54, 54));
		btnLegisLabo.setFont(new Font("Dialog", Font.BOLD, 14));
		panel.add(btnLegisLabo);
		
		btnCalRemFinObli = new JButton("Calculo de remuneraciones, finiquitos y obligaciones laborales");
		btnCalRemFinObli.setForeground(new Color(255, 255, 255));
		btnCalRemFinObli.setBackground(new Color(54, 54, 54));
		btnCalRemFinObli.setFont(new Font("Dialog", Font.BOLD, 14));
		panel.add(btnCalRemFinObli);
		
		btnDotPer = new JButton("Dotacion de Personal");
		btnDotPer.setForeground(new Color(255, 255, 255));
		btnDotPer.setBackground(new Color(54, 54, 54));
		btnDotPer.setFont(new Font("Dialog", Font.BOLD, 14));
		panel.add(btnDotPer);
		
		btnDesBinePer = new JButton("Desarrollo y Bienestar de Personal");
		btnDesBinePer.setForeground(new Color(255, 255, 255));
		btnDesBinePer.setBackground(new Color(54, 54, 54));
		btnDesBinePer.setFont(new Font("Dialog", Font.BOLD, 14));
		panel.add(btnDesBinePer);
		
		btnEmpreEmple = new JButton("Emprendimiento y empleabilidad");
		btnEmpreEmple.setForeground(new Color(255, 255, 255));
		btnEmpreEmple.setBackground(new Color(54, 54, 54));
		btnEmpreEmple.setFont(new Font("Dialog", Font.BOLD, 14));
		panel.add(btnEmpreEmple);
		
		btnGesBode = new JButton("Gestion de Bodega");
		btnGesBode.setForeground(new Color(255, 255, 255));
		btnGesBode.setBackground(new Color(54, 54, 54));
		btnGesBode.setFont(new Font("Dialog", Font.BOLD, 14));
		panel.add(btnGesBode);
		
	}

	public JButton getBtnLegisLabo() {
		return btnLegisLabo;
	}
	
}
