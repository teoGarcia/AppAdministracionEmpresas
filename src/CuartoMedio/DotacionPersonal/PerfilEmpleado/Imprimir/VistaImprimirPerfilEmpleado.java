package CuartoMedio.DotacionPersonal.PerfilEmpleado.Imprimir;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VistaImprimirPerfilEmpleado extends JFrame {

	private PanelImprimirPerfilEmpleado piap = new PanelImprimirPerfilEmpleado();
	
	private JPanel contentPane;
	private ControlImprimir ci;
	private JButton btnImprimir;

	/**
	 * Create the frame.
	 */
	public VistaImprimirPerfilEmpleado() {
		
		
		ci = new ControlImprimir(this);
		
		setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
	    setResizable(false); //Que no se pueda cambiar el tamaño
		
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

	public PanelImprimirPerfilEmpleado getPiap() {
		return piap;
	}

	public JButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setPiap(PanelImprimirPerfilEmpleado piap) {
		this.piap = piap;
	}

	public void setBtnImprimir(JButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

}
