package CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones.Imprimir;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir.PanelImprimirAplicPresup;
import java.awt.Color;
import ui.Buttons.PrintButton;

public class VistaImprimirCalendarioVacaciones extends JFrame {
	
	private PanelImprimirCalendarioVacaciones piap = new PanelImprimirCalendarioVacaciones();

	private ControlImprimir ci;
	private JPanel contentPane;
	private PrintButton btnImprimir;

	/**
	 * Create the frame.
	 */
	public VistaImprimirCalendarioVacaciones() {
		
		ci = new ControlImprimir(this);
		
		setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
	    setResizable(false); //Que no se pueda cambiar el tamaño
		setBounds(100, 100, 600, 772);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		contentPane.add(piap);
		
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

	public PanelImprimirCalendarioVacaciones getPiap() {
		return piap;
	}

	public void setPiap(PanelImprimirCalendarioVacaciones piap) {
		this.piap = piap;
	}

}
