package TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Mayoreo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		pj.setPrintable(vista.getPi());
		
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
