package main.java.CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.Imprimir;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JOptionPane;

public class ControlImprimirLiquidacion implements ActionListener {
	
	private ImprimirLiquidacion il;
	
	public ControlImprimirLiquidacion(ImprimirLiquidacion il) {
		this.il = il;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		/*if(e.getSource().equals(il.getBtnImprimir())){
			PrinterJob pj = PrinterJob.getPrinterJob();
			pj.setPrintable((Printable) il);
			
			if(pj.printDialog()) {
				try {
					pj.print();
					
				} catch (PrinterException ex) {
					// TODO: handle exception
				}	
			}else {
				JOptionPane.showMessageDialog(null, "La impresion se ha cancelado");
				
			}
		}*/
		
	}

}
