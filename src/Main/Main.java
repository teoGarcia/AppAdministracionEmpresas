package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Menu.Principal.VistaMenu;
import core.ManagerDB;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame window = Window.getInstance();
					Window.registerPanel(new VistaMenu(), "menu");
					ManagerDB.getEntityManager();
					window.setVisible(true);	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 

}
