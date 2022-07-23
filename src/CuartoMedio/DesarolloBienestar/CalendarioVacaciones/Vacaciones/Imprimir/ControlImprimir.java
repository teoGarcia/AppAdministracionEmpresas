package CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones.Imprimir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JOptionPane;

public class ControlImprimir implements ActionListener {
	
	private VistaImprimirCalendarioVacaciones viap;
	private PanelImprimirCalendarioVacaciones piap;

	public ControlImprimir(VistaImprimirCalendarioVacaciones viap) {
		this.viap = viap;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(viap.getBtnImprimir())){
			
			PrinterJob pj = PrinterJob.getPrinterJob();
			pj.setPrintable(piap);
			
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
