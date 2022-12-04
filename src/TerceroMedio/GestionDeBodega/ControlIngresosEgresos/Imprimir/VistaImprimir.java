package TerceroMedio.GestionDeBodega.ControlIngresosEgresos.Imprimir;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ui.Buttons.PrintButton;

public class VistaImprimir extends JFrame {
	
	private PanelImprimir pi = new PanelImprimir();
	
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
		
		contentPane.add(pi);
		
		setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
	    setResizable(false); //Que no se pueda cambiar el tama�o
	    
		btnImprimir = new PrintButton();
		btnImprimir.addActionListener(ci);
		contentPane.add(btnImprimir);
	}

	public PanelImprimir getPi() {
		return pi;
	}

	public PrintButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setPi(PanelImprimir pi) {
		this.pi = pi;
	}

	public void setBtnImprimir(PrintButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

}
