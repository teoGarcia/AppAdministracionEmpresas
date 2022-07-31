package CuartoMedio.DotacionPersonal.PerfilEmpleado.Imprimir;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import ui.Buttons.PrintButton;

public class VistaImprimirPerfilEmpleado extends JFrame {

	private PanelImprimirPerfilEmpleado piap = new PanelImprimirPerfilEmpleado();
	
	private JPanel contentPane;
	private ControlImprimir ci;
	private PrintButton btnImprimir;

	/**
	 * Create the frame.
	 */
	public VistaImprimirPerfilEmpleado() {
		
		
		ci = new ControlImprimir(this);
		
		setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
	    setResizable(false); //Que no se pueda cambiar el tamaño
		
		setBounds(100, 100, 600, 772);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		contentPane.add(piap);
		
		btnImprimir = new PrintButton();
		btnImprimir.addActionListener(ci);
		contentPane.add(btnImprimir);
	}

	public PanelImprimirPerfilEmpleado getPiap() {
		return piap;
	}

	public PrintButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setPiap(PanelImprimirPerfilEmpleado piap) {
		this.piap = piap;
	}

	public void setBtnImprimir(PrintButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

}
