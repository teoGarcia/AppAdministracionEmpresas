package ui.imprimir;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.print.PageFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ui.Buttons.PrintButton;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class VistaImprimir extends JFrame {

	private static VistaImprimir vista;
	private ControlImprimir control;
	private JPanel pane;
	private PrintButton btnImprimir;
	
	
	private static CardLayout card = new CardLayout();
	private static List<PanelImprimirI> listPanel = new ArrayList<PanelImprimirI>();
	
	private PrintButton btnNext;
	private PrintButton btnBack;
	


	private VistaImprimir() {
		
		control = new ControlImprimir(this);

		setBounds(0, 0, 600, 772);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
	    setResizable(false); //Que no se pueda cambiar el tama�o
		
	    JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	    
		pane = new JPanel();
		pane.setBackground(Color.WHITE);
		pane.setBorder(new LineBorder(new Color(0, 0, 0)));
		pane.setBounds(0, 40, 580, 693);
		pane.setLayout(card);
		contentPane.add(pane);
		
		btnImprimir = new PrintButton();
		btnImprimir.addActionListener(control);
		btnImprimir.setBounds(10, 0, 40, 40);
		getContentPane().add(btnImprimir);
		
		btnNext = new PrintButton();
		btnNext.setIcon(new ImageIcon(VistaImprimir.class.getResource("/Imagenes/Icons/flecha-derecha.png")));
		btnNext.setBounds(542, 0, 40, 40);
		btnNext.addActionListener(control);
		contentPane.add(btnNext);
		
		btnBack = new PrintButton();
		btnBack.setIcon(new ImageIcon(VistaImprimir.class.getResource("/Imagenes/Icons/flecha-izquierda.png")));
		btnBack.setBounds(490, 0, 40, 40);
		btnBack.addActionListener(control);
		contentPane.add(btnBack);
	}
	
	public void resetImprimir() {
		
		for(PanelImprimirI panel: listPanel) {
			this.card.removeLayoutComponent(panel);
		}
		
		listPanel.clear();
		
	}

	public static VistaImprimir  instance() {
		if(vista == null) vista = new VistaImprimir();
		return vista;
	}
	
	public PrintButton getBtnImprimir() {
		return btnImprimir;
	}
	
	public void registerPanel(PanelImprimirI panel, String name) {
		pane.add(panel, name);
		listPanel.add(panel);
	}

	public PrintButton getBtnNext() {
		return btnNext;
	}

	public void setBtnNext(PrintButton btnNext) {
		this.btnNext = btnNext;
	}

	public PrintButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(PrintButton btnBack) {
		this.btnBack = btnBack;
	}

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}

	public JPanel getPane() {
		return pane;
	}

	public void setPane(JPanel pane) {
		this.pane = pane;
	}

	public List<PanelImprimirI> getListPanel() {
		return listPanel;
	}

	public void setListPanel(List<PanelImprimirI> listPanel) {
		this.listPanel = listPanel;
	}
}