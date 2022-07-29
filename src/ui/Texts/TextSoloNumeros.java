package ui.Texts;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class TextSoloNumeros extends JTextField implements KeyListener{
	
	public TextSoloNumeros () {
		
		super();
		this.setFont(new Font("Dialog", Font.BOLD, 12));
		this.addKeyListener(this);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

		char c = e.getKeyChar();
		
		if(c < '0' || c > '9') {
			e.consume();
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		String txt = ponerPuntos(getText());

		setText(txt);
	}
	
	public String ponerPuntos(String txt) {

		String cadena = "";
		
		while(txt.length() > 3) {
			cadena =  "."+txt.substring(txt.length()-3, txt.length())+cadena; 
			txt = txt.substring(0, txt.length()-3);
		}
		
		txt = txt + cadena;
		
		
		return txt;
	}
	
	@Override
	public String getText() {
		String txt = super.getText();

		return txt.replaceAll("\\p{Punct}", "");
	}

}
