package TerceroMedio.ProcesosAdministrativos.EvaluacionProyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;

public class ControlEvaluacionProyecto implements ActionListener {
	
	private VistaEvaluacionProyecto vep;
	private ModeloEvaluacionProyecto modelo = new ModeloEvaluacionProyecto();
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();

	public ControlEvaluacionProyecto(VistaEvaluacionProyecto vep) {
		this.vep = vep;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vep.getBtnVerDocumento())) {
			
			JOptionPane.showMessageDialog(null, "TETE "+Urls.url3Doc + "  " + modelo.getDocument());
			mvd.VerDocumento(Urls.url3Doc, modelo.getDocument());
		}
		
	}

}
