package CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.Imprimir.ControlVistaImprimir;

public class VistaImprimirAplicacionPresup extends JFrame {
	
	private PanelImprimirAplicPresup piap = new PanelImprimirAplicPresup();
	
	private ControlImprimir ci;
	private JPanel contentPane;
	private JButton btnImprimir;

	
	public VistaImprimirAplicacionPresup() {
		
		ci = new ControlImprimir(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		contentPane.add(piap);
		
		btnImprimir = new JButton("IMPRIMIR");
		btnImprimir.setBounds(423, 763, 151, 37);
		btnImprimir.addActionListener(ci);
		contentPane.add(btnImprimir);
	}

	public JButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(JButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

}