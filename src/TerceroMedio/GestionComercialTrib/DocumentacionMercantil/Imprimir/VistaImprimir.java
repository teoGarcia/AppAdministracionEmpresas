package TerceroMedio.GestionComercialTrib.DocumentacionMercantil.Imprimir;

import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TerceroMedio.GestionComercialTrib.ConciliacionBancaria.Imprimir.PanelImprimirChePro;
import TerceroMedio.GestionComercialTrib.ConciliacionBancaria.Imprimir.PanelImprimirCheTer;
import ui.Buttons.PrintButton;

public class VistaImprimir extends JFrame {

	private JPanel contentPane;
	private PanelImprimirDoc pid = new PanelImprimirDoc();
	private PanelImprimirGuia pig = new PanelImprimirGuia();
	private PrintButton btnImprimir;
	private ControlImprimir ci;

	public VistaImprimir() {

		ci = new ControlImprimir(this);

		setBounds(100, 100, 600, 772);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(pid);
		contentPane.add(pig);
		
		pid.setVisible(false);
		pig.setVisible(false);
		
		setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
	    setResizable(false); //Que no se pueda cambiar el tamano
	    
	    
		btnImprimir = new PrintButton();
		btnImprimir.addActionListener(ci);
		contentPane.add(btnImprimir);
	}

	public PanelImprimirDoc getPid() {
		return pid;
	}

	public PanelImprimirGuia getPig() {
		return pig;
	}

	public PrintButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(PrintButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

}
