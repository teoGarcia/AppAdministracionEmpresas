package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Imprimir;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ui.Buttons.PrintButton;

public class VistaImprimir extends JFrame {

	private PanelImprimirCalculoHE piap = new PanelImprimirCalculoHE();
	
	private ControlImprimir ci;
	private PrintButton btnImprimir;
	private JPanel contentPane;

	
	public VistaImprimir() {
		
		ci = new ControlImprimir(this);
		
		setBounds(100, 100, 600, 772);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(piap);
		
		setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
	    setResizable(false); //Que no se pueda cambiar el tamaño
		
		btnImprimir = new PrintButton();
		btnImprimir.addActionListener(ci);
		contentPane.add(btnImprimir);
	}


	public PanelImprimirCalculoHE getPiap() {
		return piap;
	}


	public PrintButton getBtnImprimir() {
		return btnImprimir;
	}


	public void setPiap(PanelImprimirCalculoHE piap) {
		this.piap = piap;
	}


	public void setBtnImprimir(PrintButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

}
