package ui.Texts;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class TextNumbers extends JTextField implements KeyListener{
	
	public TextNumbers() {
	
		super();
		this.setFont(new Font("Dialog", Font.PLAIN, 12));
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		char c = e.getKeyChar();
		
		if(c < '0' && c > '9') {
			e.consume();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
