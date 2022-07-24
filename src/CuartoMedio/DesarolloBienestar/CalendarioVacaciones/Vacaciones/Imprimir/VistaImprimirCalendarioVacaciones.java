package CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones.Imprimir;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir.PanelImprimirAplicPresup;

public class VistaImprimirCalendarioVacaciones extends JFrame {
	
	private PanelImprimirCalendarioVacaciones piap = new PanelImprimirCalendarioVacaciones();

	private ControlImprimir ci;
	private JPanel contentPane;
	private JButton btnImprimir;

	/**
	 * Create the frame.
	 */
	public VistaImprimirCalendarioVacaciones() {
		
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

	public JButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(JButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public PanelImprimirCalendarioVacaciones getPiap() {
		return piap;
	}

	public void setPiap(PanelImprimirCalendarioVacaciones piap) {
		this.piap = piap;
	}

}
