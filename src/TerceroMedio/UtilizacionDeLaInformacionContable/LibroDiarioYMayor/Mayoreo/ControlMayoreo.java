package TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Mayoreo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JOptionPane;

public class ControlMayoreo  implements ActionListener {

	private VistaMayoreo vista;

	public ControlMayoreo(VistaMayoreo vista) {
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		PrinterJob pj = PrinterJob.getPrinterJob();
		PageFormat pf = pj.pageDialog(pj.defaultPage());
		
		/// acase coloca el book o lo que va a colocar en el documento
		Book book = new Book();
		for (int i = 0; i < 2; i++) {
			book.append(vista.getPi(), pf);
		}
		
		//aca se inicializa el tama�o del papel
		Paper paper = new Paper();
		int margenDerecho = 20;
		paper.setSize(612.0, 832.0);
		double margin = margenDerecho;
		paper.setImageableArea(margin, margin, paper.getWidth() - margin, paper.getHeight() - margin);
		float tamanioPapelAlto = (float) paper.getHeight();
		float tamanioPapelAncho = (float) paper.getWidth();
				
		pf.setPaper(paper);
		pf.setOrientation(PageFormat.PORTRAIT);
		
		for (int i = 0; i < 2; i++) {
			book.append(vista.getPi(), pf);
		}
		
		pj.setPageable(book);
		pj.setJobName("document");
		pj.printDialog();
		
		
		if(pj.printDialog()) {
			try {
				pj.print();
				
			} catch (PrinterException ex) {
				// TODO: handle exception
			}	
		}else {
			JOptionPane.showMessageDialog(null, "La impresion se ha cancelado");
			
		}
		
	}
}