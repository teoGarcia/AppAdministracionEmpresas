package TerceroMedio.GestionComercialTrib.BoletaHonorarios.Imprimir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JOptionPane;

public class ControlImprimir implements ActionListener {
	
	private VistaImprimir vi;

	public ControlImprimir(VistaImprimir vi) {
		this.vi = vi;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vi.getBtnImprimir())){
			PrinterJob pj = PrinterJob.getPrinterJob();
			pj.setPrintable(vi.getPi());
			
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
