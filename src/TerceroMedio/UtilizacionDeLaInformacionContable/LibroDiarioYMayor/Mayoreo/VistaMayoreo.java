package TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Mayoreo;

import java.awt.Color;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Asientos;
import ui.Buttons.PrintButton;

public class VistaMayoreo  extends JFrame  {

	private PanelMayoreo pi;
	
	private ControlMayoreo ci;
	private JPanel contentPane;
	private PrintButton btnImprimir;
	
	public VistaMayoreo(Long idLibro, Iterator<Asientos> list) {
		
		pi = new PanelMayoreo(list);
		
		ci = new ControlMayoreo(this);

		
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

	public PanelMayoreo getPi() {
		return pi;
	}

	public PrintButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setPi(PanelMayoreo pi) {
		this.pi = pi;
	}

	public void setBtnImprimir(PrintButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}
	
}
