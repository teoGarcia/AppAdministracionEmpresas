package CuartoMedio.EmprendimientoYEmpleabilidad.AnalisisFODA.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.EmprendimientoYEmpleabilidad.AnalisisFODA.Vista.VistaAnalisisFODA;
import Modelo.AbrirDocumentos;

public class ControlVistaAnalisisFODA implements ActionListener {
	
	private VistaAnalisisFODA vaf;
	private AbrirDocumentos ad = new AbrirDocumentos();
	
	public ControlVistaAnalisisFODA(VistaAnalisisFODA vaf) {
		this.vaf = vaf;
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		if(ev.getSource().equals(vaf.getBtnPlantilla())) {
			
			System.out.println("fsfs");
			String url = "src/DocumentosExcel4toMedio/ANALISIS DAFO O FODA.xlsx";
			ad.VerDocumento(url);
			
		}
		// TODO Auto-generated method stub
		
	}

	

}
