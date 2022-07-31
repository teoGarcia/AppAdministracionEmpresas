package CuartoMedio.DotacionPersonal.SeleccionPersonal.Imprimir;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import ui.Buttons.PrintButton;

public class VistaImprimirSeleccionPersonal extends JFrame {

	private PanelImprimirSeleccionPersonal piap = new PanelImprimirSeleccionPersonal();
	private JPanel contentPane;
	private PrintButton btnImprimir;
	private ControlImprimir ci;

	/**
	 * Create the frame.
	 */
	public VistaImprimirSeleccionPersonal() {
		
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

	public PanelImprimirSeleccionPersonal getPiap() {
		return piap;
	}

	public PrintButton getBtnImprimir() {
		return btnImprimir;
	}

	public ControlImprimir getCi() {
		return ci;
	}

	public void setPiap(PanelImprimirSeleccionPersonal piap) {
		this.piap = piap;
	}

	public void setBtnImprimir(PrintButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public void setCi(ControlImprimir ci) {
		this.ci = ci;
	}

}
