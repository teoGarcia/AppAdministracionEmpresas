package TerceroMedio.ProcesosAdministrativos.FormatoOrganigrama;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;
import TerceroMedio.ProcesosAdministrativos.Departamentalizacion.Imprimir.ModeloDepartamentalizacion;

public class ControlFormatoOrganigrama implements ActionListener {
	
	private VistaFormatoOrganigrama vfo;
	private ModeloOrganigrama modelo = new ModeloOrganigrama();
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();

	public ControlFormatoOrganigrama(VistaFormatoOrganigrama vfo) {
		this.vfo = vfo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vfo.getBtnOrg())) {
			mvd.VerDocumento(Urls.url3Doc, modelo.getDocument());
		
		}else if(e.getSource().equals(vfo.getBtnTipOrg())) {
			mvd.VerDocumento(Urls.url3Doc, modelo.getDocument2());
		}
		
		
		
	}

}
