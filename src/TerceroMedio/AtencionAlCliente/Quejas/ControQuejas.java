package TerceroMedio.AtencionAlCliente.Quejas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;
import TerceroMedio.ProcesosAdministrativos.EvaluacionProyecto.ModeloEvaluacionProyecto;

public class ControQuejas implements ActionListener {

	private VistaQuejas vd;
	private ModeloQuejas modelo = new ModeloQuejas();
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();
	
	public ControQuejas(VistaQuejas vd) {
		this.vd = vd;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vd.getBtnVerDocumento())) {
			mvd.VerDocumento(Urls.url3Doc, modelo.getDocument());
		}
		// TODO Auto-generated method stub
		
	}

}
