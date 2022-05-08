package CuartoMedio.EmprendimientoYEmpleabilidad.PlanNegocios;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CuartoMedio.EmprendimientoYEmpleabilidad.PlanNegocios.*;
import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;

public class ControladorVistaPlanNegocios implements ActionListener {
	
	private VistaPlanNegocios vpn;
	private AbrirDocumentos ad = AbrirDocumentos.getInstance();
	
	public ControladorVistaPlanNegocios(VistaPlanNegocios vpn) {
		this.vpn = vpn;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		if(vpn.isBtnPracticar(ev.getSource())) {
			String doc = "FORMATO PLAN DE NEGOCIOS.docx";
			ad.VerDocumento(Urls.url4Doc, doc);	
		}
		// TODO Auto-generated method stub
		
	}

	
	
	

}
