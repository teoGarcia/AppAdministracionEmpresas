package CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.Imprimir.ControlVistaImprimir;
import ui.Buttons.PrintButton;
import java.awt.Color;

public class VistaImprimirAplicacionPresup extends JFrame {
	
	private PanelImprimirAplicPresup piap = new PanelImprimirAplicPresup();
	
	private ControlImprimir ci;
	private JPanel contentPane;
	private PrintButton btnImprimir;

	
	public VistaImprimirAplicacionPresup() {
		
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

	public PrintButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(PrintButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public PanelImprimirAplicPresup getPiap() {
		return piap;
	}

	public void setPiap(PanelImprimirAplicPresup piap) {
		this.piap = piap;
	}

}
