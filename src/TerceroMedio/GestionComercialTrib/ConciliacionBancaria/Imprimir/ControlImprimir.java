package TerceroMedio.GestionComercialTrib.ConciliacionBancaria.Imprimir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JOptionPane;

public class ControlImprimir implements ActionListener{
	
	private VistaImprimir vi;
	private PanelImprimirChePro picp;
	private PanelImprimirCheTer pict;


	public ControlImprimir(VistaImprimir vi) {
		this.vi = vi;;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(vi.getBtnImprimir())){
			
			if(vi.getPict().isVisible()) {
				PrinterJob pj = PrinterJob.getPrinterJob();
				pj.setPrintable(vi.getPict());
				
				if(pj.printDialog()) {
					try {
						pj.print();
						
					} catch (PrinterException ex) {
						// TODO: handle exception
					}	
				}else {
					JOptionPane.showMessageDialog(null, "La impresion se ha cancelado");
				}
				
			}else if(vi.getPicp().isVisible()) {
				PrinterJob pj = PrinterJob.getPrinterJob();
				pj.setPrintable(vi.getPicp());
				
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
		
	}

}
