package ui.imprimir;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public abstract class PanelImprimirI<T> extends JPanel implements Printable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract void CargarData(T t);
	
	public PanelImprimirI(String title) {

		setBackground(Color.WHITE);
		setBounds(0, 40, 580, 693);
		setLayout(null);
		
		JLabel lblTitle = new JLabel(title);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTitle.setBounds(-2, 30, 584, 33);
		add(lblTitle);
		
	}

	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
	
		Graphics2D graphics2D = (Graphics2D) graphics;
		graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
		printAll(graphics2D);
		return PAGE_EXISTS;	
			
	}
	
}
