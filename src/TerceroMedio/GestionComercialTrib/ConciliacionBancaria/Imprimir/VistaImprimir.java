package TerceroMedio.GestionComercialTrib.ConciliacionBancaria.Imprimir;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import ui.Buttons.PrintButton;

public class VistaImprimir extends JFrame {
	
	private PanelImprimirCheTer pict = new PanelImprimirCheTer();
	private PanelImprimirChePro picp = new PanelImprimirChePro();
	private PrintButton btnImprimir;
	private JPanel contentPane;
	private ControlImprimir ci;

	public VistaImprimir() {

		ci = new ControlImprimir(this);

		setBounds(100, 100, 600, 772);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(pict);
		contentPane.add(picp);
		
		pict.setVisible(false);
		picp.setVisible(false);
		
		setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
	    setResizable(false); //Que no se pueda cambiar el tamano
	    
	    
		btnImprimir = new PrintButton();
		btnImprimir.addActionListener(ci);
		contentPane.add(btnImprimir);
	}

	public PanelImprimirCheTer getPict() {
		return pict;
	}
	
	public PanelImprimirChePro getPicp() {
		return picp;
	}

	public PrintButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(PrintButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

}
