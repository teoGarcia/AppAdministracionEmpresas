package CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JOptionPane;

import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoRepository;
import core.ManagerDB;

public class ControlImprimir implements ActionListener {
	
	private PanelImprimirAplicPresup piap = new PanelImprimirAplicPresup();
	private VistaImprimirAplicacionPresup viap;
	private AplicacionPresupuestoRepository repository;

	public ControlImprimir(VistaImprimirAplicacionPresup viap) {
		
		this.repository = new AplicacionPresupuestoRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.viap = viap;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
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
		
	}
	
	public void DatosImprimirSeleccionado() {
		
		
		
	}

}
