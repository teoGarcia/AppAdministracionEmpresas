package CuartoMedio.DesarolloBienestar.RegistroCapacEmpleado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.DesarolloBienestar.EvaluacionDesempeno.ModeloEvaluacionDesempeno;
import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;

public class ControlRegCapacEmpleado implements ActionListener {

	private VistaRegistroCapacEmpleado vrce;
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();
	private ModeloRegCapacEmpleado modelo = new ModeloRegCapacEmpleado();
	
	public ControlRegCapacEmpleado(VistaRegistroCapacEmpleado vrce) {
		this.vrce = vrce;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vrce.getStndrbtnVerDocumento())) {
			
			if(e.getSource().equals(vrce.getStndrbtnVerDocumento())) {
				
				mvd.VerDocumento(Urls.url1PDF, modelo.getDocument());
				
			}
			
		}
		// TODO Auto-generated method stub
		
	}

}
