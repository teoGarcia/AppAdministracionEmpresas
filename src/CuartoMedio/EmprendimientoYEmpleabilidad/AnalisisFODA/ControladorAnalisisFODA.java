package CuartoMedio.EmprendimientoYEmpleabilidad.AnalisisFODA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.ModeloHonorarios;
import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.VistaHonorarios;
import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;
import ui.ImageGalery.VistaImageGalery;

public class ControladorAnalisisFODA implements ActionListener {

	private VistaAnalisisFODA vista;
	private ModeloAnalisisFODA modelo = new ModeloAnalisisFODA();
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();  
	private VistaImageGalery galery;
	
	public ControladorAnalisisFODA(VistaAnalisisFODA vista) {
		// TODO Auto-generated constructor stub
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(vista.isBtnEjemplo(e.getSource())) {
			if(galery == null) {
				galery = new VistaImageGalery(modelo.getImages());
			}
			galery.setVisible(true);
		}else if(vista.isBtnPracticar(e.getSource())) {
			mvd.VerDocumento(Urls.url4Exc, modelo.getDocument());
			
		}
	}

}
