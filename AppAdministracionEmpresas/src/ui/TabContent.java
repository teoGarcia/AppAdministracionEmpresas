package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Rectangle;
import java.awt.event.ActionListener;

public class TabContent extends JPanel {
	
	private JEditorPane dtrpnLoremIpsumHas;
	private JButton btnPracticar;
	private JButton btnEjemplo;

	/**
	 * Create the panel.
	 */
	public TabContent(String def) {
		inicialize(def);
		
	}
	
	private void inicialize(String def) {
		
		//setBounds(0, 0, 774, 731);
		setBackground(new Color(54, 54, 54));
		setLayout(null);
		
		dtrpnLoremIpsumHas = new JEditorPane();
		dtrpnLoremIpsumHas.setForeground(new Color(255, 255, 255));
		dtrpnLoremIpsumHas.setOpaque(false);
		dtrpnLoremIpsumHas.setEditable(false);
		dtrpnLoremIpsumHas.setBorder(new LineBorder(new Color(0, 0, 0)));
		dtrpnLoremIpsumHas.setBackground(new Color(252, 252, 252));
		//dtrpnLoremIpsumHas.setText("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software. like Aldus PageMaker including versions of Lorem Ipsum.");
		dtrpnLoremIpsumHas.setText(def);
		dtrpnLoremIpsumHas.setFont(new Font("Dialog", Font.PLAIN, 14));
		dtrpnLoremIpsumHas.setBounds(23, 35, 711, 231);
		add(dtrpnLoremIpsumHas);
		
		btnPracticar = new JButton("Practicar");
		btnPracticar.setForeground(Color.WHITE);
		btnPracticar.setBackground(Color.DARK_GRAY);
		btnPracticar.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnPracticar.setBounds(641, 307, 93, 35);
	    add(btnPracticar);
		
	    btnEjemplo = new JButton("Ejemplo");
	    btnEjemplo.setForeground(Color.WHITE);
	    btnEjemplo.setBackground(Color.DARK_GRAY);
		btnEjemplo.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnEjemplo.setBounds(520, 307, 89, 35);
		add(btnEjemplo);
	}
	
	protected void addControllerBtn(ActionListener c) {
		btnEjemplo.addActionListener(c);
		btnPracticar.addActionListener(c);
	}

}
