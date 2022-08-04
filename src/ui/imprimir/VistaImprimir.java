package ui.imprimir;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ui.Buttons.PrintButton;

public class VistaImprimir extends JFrame {

	private static VistaImprimir vista;
	
	private PanelImprimirI pi;
	
	private ControlImprimir ci;
	private JPanel contentPane;
	private PrintButton btnImprimir;
	


	public VistaImprimir() {
		
		ci = new ControlImprimir(this);

		setBounds(100, 100, 600, 772);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add((Component) pi);
		
		setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
	    setResizable(false); //Que no se pueda cambiar el tamaño
	    
		btnImprimir = new PrintButton();
		btnImprimir.addActionListener(ci);
		contentPane.add(btnImprimir);
	}

	public PanelImprimirI getPi() {
		return pi;
	}

	public PrintButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setPi(PanelImprimirI pi) {
		this.pi = pi;
	}

}
