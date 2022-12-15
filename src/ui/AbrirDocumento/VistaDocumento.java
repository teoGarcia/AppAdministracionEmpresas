package ui.AbrirDocumento;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import TerceroMedio.ProcesosAdministrativos.FormatoOrganigrama.ControlFormatoOrganigrama;
import ui.Buttons.TittleButton;
import ui.Labels.LabelTitulos;

public class VistaDocumento extends JPanel {
	
	private TittleButton btnVerDocumento;
	private ControlDocumento control;
	private String doc;

	/**
	 * Create the panel.
	 */
	public VistaDocumento(String title, String doc) {
		
		this.doc = doc;
		
		control = new ControlDocumento(this);
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lbltlsCartaGantt = new LabelTitulos(title);
		lbltlsCartaGantt.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCartaGantt.setBounds(0, 60, 722, 30);
		add(lbltlsCartaGantt);
		
		btnVerDocumento = new TittleButton("Ver Documento");
		btnVerDocumento.setBounds(208, 334, 308, 78);
		btnVerDocumento.addActionListener(control);
		add(btnVerDocumento);
		
	}

	public TittleButton getBtnVerDocumento() {
		return btnVerDocumento;
	}

	public void setBtnVerDocumento(TittleButton btnVerDocumento) {
		this.btnVerDocumento = btnVerDocumento;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

}
