package ui.AbrirDocumento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;
import TerceroMedio.ProcesosAdministrativos.EvaluacionProyecto.ModeloEvaluacionProyecto;

public class ControlDocumento implements ActionListener {

	private VistaDocumento vista;
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();
	
	public ControlDocumento(VistaDocumento vista) {
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vista.getBtnVerDocumento())) {
			mvd.VerDocumento(Urls.url3Doc, vista.getDoc());
		}
		// TODO Auto-generated method stub
		
	}

}
