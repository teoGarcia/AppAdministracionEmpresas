package CuartoMedio.EmprendimientoYEmpleabilidad.PlanNegocios.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.EmprendimientoYEmpleabilidad.PlanNegocios.Vista.VistaPlanNegocios;
import Modelo.AbrirDocumentos;

public class ControladorVistaPlanNegocios implements ActionListener {
	
	private VistaPlanNegocios vpn;
	private AbrirDocumentos ad = new AbrirDocumentos();
	
	public ControladorVistaPlanNegocios(VistaPlanNegocios vpn) {
		this.vpn = vpn;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		if(ev.getSource().equals(vpn.getBtnPlantilla())) {
			System.out.println("hii");
			String url = "src/DocumentosWord4toMedio/FORMATO PLAN DE NEGOCIOS.docx";
			ad.VerDocumento(url);	
		}
		// TODO Auto-generated method stub
		
	}

	
	
	

}
