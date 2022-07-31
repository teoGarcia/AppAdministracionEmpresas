package CuartoMedio.DotacionPersonal.PerfilEmpleado.Imprimir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JOptionPane;


import CuartoMedio.DotacionPersonal.PerfilEmpleado.PerfilEmpleadoRepository;

public class ControlImprimir implements ActionListener {
	
	private VistaImprimirPerfilEmpleado viap;
	private PanelImprimirPerfilEmpleado piap = new PanelImprimirPerfilEmpleado();
	private PerfilEmpleadoRepository repository;

	public ControlImprimir(VistaImprimirPerfilEmpleado viap) {
		// TODO Auto-generated constructor stub
		this.viap = viap;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(viap.getBtnImprimir())){
			
			PrinterJob pj = PrinterJob.getPrinterJob();
			pj.setPrintable(viap.getPiap());
			
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
