package TerceroMedio.ProcesosAdministrativos.FormatoProyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;
import TerceroMedio.ProcesosAdministrativos.FormatoOrganigrama.ModeloOrganigrama;

public class ControlFormatoProyecto implements ActionListener {
	
	private VistaFormatoProyecto vfp;
	
	private ModeloProyecto modelo = new ModeloProyecto();
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();


	public ControlFormatoProyecto(VistaFormatoProyecto vfp) {
		this.vfp = vfp;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vfp.getBtnPreProNor())) {
			JOptionPane.showMessageDialog(null, "AQUI PASO"+ modelo.getDocument());
			mvd.VerDocumento(Urls.url3Doc, modelo.getDocument());
		
		}else if(e.getSource().equals(vfp.getBtnProInv())) {
			mvd.VerDocumento(Urls.url3Doc, modelo.getDocument2());
		}
		
	}

}
