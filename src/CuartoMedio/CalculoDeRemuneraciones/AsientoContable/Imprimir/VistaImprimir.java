package CuartoMedio.CalculoDeRemuneraciones.AsientoContable.Imprimir;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class VistaImprimir extends JFrame {

	private JPanel contentPane;
	private ControlVistaImprimir cvi;
	private JButton btnImprimir;
	private ImprimirPanel panel = new ImprimirPanel();

	

	/**
	 * Create the frame.
	 */
	public VistaImprimir() {
		
		cvi = new ControlVistaImprimir(this);
		
		setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
	    setResizable(false);		  //Que no puedan modificar la pantalla
		
		setBounds(100, 100, 600, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		contentPane.add(panel);
		
		btnImprimir = new JButton("IMPRIMIR");
		btnImprimir.setBounds(423, 763, 151, 37);
		btnImprimir.addActionListener(cvi);
		contentPane.add(btnImprimir);
	}

	public JButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(JButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public ImprimirPanel getPanel() {
		return panel;
	}

	public void setPanel(ImprimirPanel panel) {
		this.panel = panel;
	}

}
