package ui.imprimir;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ui.Buttons.PrintButton;

public class VistaImprimir extends JFrame {

	private static VistaImprimir vista;
	private ControlImprimir ci;
	private JPanel contentPane;
	private PrintButton btnImprimir;
	


	private VistaImprimir() {
		
		ci = new ControlImprimir(this);

		setBounds(100, 100, 600, 772);
		setLayout(null);
		setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
	    setResizable(false); //Que no se pueda cambiar el tamaño
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnImprimir = new PrintButton();
		btnImprimir.addActionListener(ci);
		add(btnImprimir);
	}

	public static VistaImprimir  instance() {
		if(vista == null) vista = new VistaImprimir();
		return vista;
	}
	
	public PrintButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setPi(PanelImprimirI pi) {
		System.out.println("PanelImprimirI"+ pi);
		this.setContentPane(pi);
		contentPane.updateUI();
		this.validate();
	}
	

}