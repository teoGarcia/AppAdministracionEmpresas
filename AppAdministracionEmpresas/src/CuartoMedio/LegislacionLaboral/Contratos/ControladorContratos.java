package CuartoMedio.LegislacionLaboral.Contratos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import CuartoMedio.LegislacionLaboral.Contratos.Modelo.ModeloVerDocumentos;
import CuartoMedio.LegislacionLaboral.Contratos.VistaContratos;

public class ControladorContratos implements ActionListener {

	private VistaContratos vc; 
	private ModeloVerDocumentos mvd = new ModeloVerDocumentos();
	
	public ControladorContratos(VistaContratos vc) {
		
		this.vc = vc;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		//C:\Users\teoga\git\AppAdministracionEmpresas\AppAdministracionEmpresas\src\DocumentosWord
		if(ev.getSource().equals(vc.getBtnPracticarIndefinido())) {
			String url = "src/DocumentosWord/MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1.docx";
			mvd.VerDocumento(url);
			
		}else if(ev.getSource().equals(vc.getBtnPracticarPlazoFijo())) {
			System.out.println("HEYY");
			String url = "src/DocumentosWord/MODELO DE CONTRATO PLAZO FIJO.doc";
			mvd.VerDocumento(url);
			
		}else if(ev.getSource().equals(vc.getBtnPracticarHonorarios())) {
			String url = "src/DocumentosWord/MODELO DE CONTRATO HONORARIO.docx";
			mvd.VerDocumento(url);
		}
		
		
	}	
		
	
	
}
