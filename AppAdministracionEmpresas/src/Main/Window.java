package Main;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	
	private static JFrame window;
	private static CardLayout card = new CardLayout();
	private static List<String> listPanel = new ArrayList<String>();
	
	public static JFrame getInstance() {
		if(window == null) {
			inicialize();
		}
		
		return window;
	}
	
	private static void inicialize(){
		window = new JFrame();
		window.setBounds(0, 0, 1024, 768);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(card);
	}
	
	private Window() {
		
	}
	
	public static void changeContent(String name) {
		card.show(window.getContentPane(), name);
	}
	
	public static void registerPanel(JPanel panel, String name) {
		window.add(panel, name);
		listPanel.add(name);
	}
	
	public static boolean isPanel(String name) {
		return listPanel.contains(name);
	}
	
}
