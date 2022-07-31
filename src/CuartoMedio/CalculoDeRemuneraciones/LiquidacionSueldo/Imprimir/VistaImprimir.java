package CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.Imprimir;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import ui.Buttons.StandarButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class VistaImprimir extends JFrame {

	private JPanel contentPane;
	private ControlVistaImprimir cvi;
	private StandarButton btnImprimir;
	private ImprimirLiquidacion panel = new ImprimirLiquidacion();

	

	/**
	 * Create the frame.
	 */
	public VistaImprimir() {
		
		cvi = new ControlVistaImprimir(this);
		
		setBounds(100, 100, 600, 772);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		contentPane.add(panel);
		
		setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
	    setResizable(false);		  //Que no puedan modificar la pantalla
		
		btnImprimir = new StandarButton("IMPRIMIR");
		btnImprimir.setBackground(Color.WHITE);
		btnImprimir.setText("");
		btnImprimir.setIcon(new ImageIcon(VistaImprimir.class.getResource("/Imagenes/Icons/impresora.png")));
		btnImprimir.setBounds(0, 0, 40, 40);
		btnImprimir.addActionListener(cvi);
		contentPane.add(btnImprimir);
	}

	public StandarButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(StandarButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public ImprimirLiquidacion getPanel() {
		return panel;
	}

	public void setPanel(ImprimirLiquidacion panel) {
		this.panel = panel;
	}

}
