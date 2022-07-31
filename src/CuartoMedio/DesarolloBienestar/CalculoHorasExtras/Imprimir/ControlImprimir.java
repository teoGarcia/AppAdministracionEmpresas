package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Imprimir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		
		if(e.getSource().equals(vista.getBtnImprimir())){
			
			PrinterJob pj = PrinterJob.getPrinterJob();
			pj.setPrintable(vista.getPiap());
			
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
		// TODO Auto-generated method stub
		
	}

}
