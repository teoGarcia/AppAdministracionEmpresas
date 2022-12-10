package ui.imprimir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;


public class ControlImprimir implements ActionListener {
	
	private VistaImprimir vista;

	public ControlImprimir(VistaImprimir vista) {
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vista.getBtnImprimir())) {
			
			PrinterJob pj = PrinterJob.getPrinterJob();
			Book book = new Book();
			PageFormat pf = new PageFormat();
			
			Paper paper = new Paper();
			int margenDerecho = 10;
			paper.setSize(612.0, 720);
			double margin = margenDerecho;
			paper.setImageableArea(margin, margin, paper.getWidth() - margin, paper.getHeight() - margin);
			pf.setPaper(paper);
			pf.setOrientation(PageFormat.PORTRAIT);
			
			for(PanelImprimirI panel: vista.getListPanel()) {
				book.append(panel, pf);
			}
			
			pj.setPageable(book);
			
			boolean doPrint = pj.printDialog();
			
			if (doPrint) {
				try {
					pj.print();
				} catch (PrinterException exception) {
					System.err.println("Printing error: " + exception);
					JOptionPane.showMessageDialog(null, "La impresion se ha cancelado");
				}
			}
				
			
		}else if(e.getSource().equals(vista.getBtnNext())) {
			vista.getCard().next(vista.getPane());
		}else if(e.getSource().equals(vista.getBtnBack())) {
			vista.getCard().previous(vista.getPane());
		}
		
		
		
	}
	
	

}
