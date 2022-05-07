package CuartoMedio.EmprendimientoYEmpleabilidad.PlanNegocios;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CuartoMedio.EmprendimientoYEmpleabilidad.PlanNegocios.*;
import Helpers.AbrirDocumentos;

public class ControladorVistaPlanNegocios implements ActionListener {
	
	private VistaPlanNegocios vpn;
	private AbrirDocumentos ad = AbrirDocumentos.getInstance();
	
	public ControladorVistaPlanNegocios(VistaPlanNegocios vpn) {
		this.vpn = vpn;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		if(ev.getSource().equals(vpn.getBtnPlantilla())) {
			JOptionPane.showMessageDialog(null, "HEYY");
			String url = "src/DocumentosWord4toMedio/FORMATO PLAN DE NEGOCIOS.docx";
			ad.VerDocumento(url);	
		}
		// TODO Auto-generated method stub
		
	}

	
	
	

}
