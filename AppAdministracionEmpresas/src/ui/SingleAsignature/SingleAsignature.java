/**
 * 
 */
package ui.SingleAsignature;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

/**
 * @author Dead
 *
 */
public class SingleAsignature extends JPanel {

	
	private JButton btnPracticar;
	private JButton btnEjemplo;
	private JEditorPane txtDefinicion;
	private JLabel lblTitulo;
	
	/**
	 * 
	 */
	public SingleAsignature() {
		this.inicialize();
	}
	
	private void inicialize() {
		setOpaque(false);
		setBounds(0, 0, 774, 731);
		setLayout(null);
		
		lblTitulo = new JLabel("Titulo");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 34, 774, 29);
		add(lblTitulo);
		
		txtDefinicion = new JEditorPane();
		txtDefinicion.setEditable(false);
		txtDefinicion.setBorder(null);
		txtDefinicion.setForeground(new Color(255, 255, 255));
		txtDefinicion.setOpaque(false);
		txtDefinicion.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtDefinicion.setText("Definicion");
		txtDefinicion.setBackground(new Color(254, 254, 254));
		txtDefinicion.setBounds(21, 97, 731, 128);
		add(txtDefinicion);
		
		btnPracticar = new JButton("Practicar");
		btnPracticar.setForeground(Color.WHITE);
		btnPracticar.setBackground(Color.DARK_GRAY);
		btnPracticar.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnPracticar.setBounds(659, 236, 93, 35);
	    add(btnPracticar);
		
	    btnEjemplo = new JButton("Ejemplo");
	    btnEjemplo.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    btnEjemplo.setForeground(Color.WHITE);
	    btnEjemplo.setBackground(Color.DARK_GRAY);
		btnEjemplo.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnEjemplo.setBounds(538, 235, 111, 35);
		add(btnEjemplo);
	}
	
	protected void addControllerBtn(ActionListener c) {
		btnEjemplo.addActionListener(c);
		btnPracticar.addActionListener(c);
	}
	
	public boolean isBtnEjemplo(Object obj) {
		return btnEjemplo.equals(obj);
	}
	
	public boolean isBtnPracticar(Object obj) {
		return btnPracticar.equals(obj);
	}

	public void setDefinicion(String text) {
		this.txtDefinicion.setText(text);;
	}

	public void setTitulo(String titulo) {
		this.lblTitulo.setText(titulo);
	}

}
