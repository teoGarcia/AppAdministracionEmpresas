package Menu;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Menus.MenuPrincipal.VistaMenuPrincipal;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import Main.Window;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

public class SideMenu extends JPanel {
	
	private static SideMenu sideMenu;
	
	// variable del panel del menu
	private static JPanel menuPanel;
	private static CardLayout cardMenu = new CardLayout();
	private static List<String> cardMenuList = new ArrayList<String>();
	
	
	// variable que manejan el panel de contenido
	private static JPanel contentPanel;
	private static CardLayout cardContent = new CardLayout();
	private static List<String> cardContentList = new ArrayList<String>();
	
	
	private JButton btnExit;

	/**
	 * Create the panel.
	 */
	private SideMenu() {
		inicialize();
	}
	
	public static SideMenu getInstance() {
		if(sideMenu == null) {
			sideMenu = new SideMenu();
			Window.registerPanel(sideMenu, "sideMenu");
		}
		return sideMenu;
	}
	
	
	
	private void inicialize() {
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setBounds(0, 0, 1024, 768);
		setLayout(null);
		
		buildingSidePanel();
		
		contentPanel = new JPanel();
		contentPanel.setOpaque(false);
		contentPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPanel.setBounds(240, 10, 774, 731);
		add(contentPanel);
		contentPanel.setLayout(null);
				
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon(SideMenu.class.getResource("/Imagenes/ImagenesFondo/fondo gris oscuro.jpg")));
		lblBg.setBounds(0, 0, 1024, 753);
		add(lblBg);
		
	}
	
	private void buildingSidePanel() {
		
		JPanel sidePanel = new JPanel();
		sidePanel.setBorder(null);
		sidePanel.setOpaque(false);
		sidePanel.setBounds(0, 0, 230, 753);
		sidePanel.setLayout(null);
		add(sidePanel);
			
		btnExit = new JButton();
		btnExit.setBackground(new Color(0, 0, 0));
		btnExit.setBounds(10, 678, 79, 64);
		btnExit.setBorder(null);
		btnExit.setOpaque(false);
		btnExit.setIcon(new ImageIcon(SideMenu.class.getResource("/Imagenes/Icons/salida.png")));
		sidePanel.add(btnExit);
		
		JLabel lblLogoColegio = new JLabel("");
		lblLogoColegio.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoColegio.setIcon(new ImageIcon(VistaMenuPrincipal.class.getResource("/Imagenes/Logo Colegio bien.png")));
		lblLogoColegio.setBounds(10, 11, 110, 179);
		sidePanel.add(lblLogoColegio);
		
		JEditorPane txtNombreColegio = new JEditorPane();
		txtNombreColegio.setEditable(false);
		txtNombreColegio.setOpaque(false);
		txtNombreColegio.setForeground(Color.WHITE);
		txtNombreColegio.setBackground(new Color(60, 60, 60));
		txtNombreColegio.setText("Colegio\r\nBicentenario\r\nSanta Maria \r\nde Aconcagua");
		txtNombreColegio.setFont(new Font("Dialog", Font.BOLD, 13));
		txtNombreColegio.setBounds(119, 100, 100, 80);
		sidePanel.add(txtNombreColegio);
		
		menuPanel = new JPanel();
		menuPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		menuPanel.setOpaque(false);
		menuPanel.setBounds(10, 191, 208, 476);
		sidePanel.add(menuPanel);
		menuPanel.setLayout(cardMenu);
		
	}

	
	// control del panel del menu
	public static void changeMenuPanel(String name) {
		Window.changeContent("sideMenu");
		cardMenu.show(menuPanel, name);
	}
	
	public static void registerMenuPanel(JPanel panel, String name) {
		menuPanel.add(panel, name);
		cardMenuList.add(name);
	}
	
	public static boolean isMenuPanel(String name) {
		return cardMenuList.contains(name);
	}
	
	
	// control del panel de contenido
	public static void changeContentPanel(String name) {
		cardContent.show(contentPanel, name);
	}
	
	public static void registerContentPanel(JPanel panel, String name) {
		contentPanel.add(panel, name);
		cardContentList.add(name);
	}
	
	public static boolean isContentPanel(String name) {
		return cardContentList.contains(name);
	}
	
}
