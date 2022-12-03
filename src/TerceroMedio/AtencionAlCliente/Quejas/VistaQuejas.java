package TerceroMedio.AtencionAlCliente.Quejas;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import TerceroMedio.ProcesosAdministrativos.FormatoOrganigrama.ControlFormatoOrganigrama;
import ui.Buttons.TittleButton;
import ui.Labels.LabelTitulos;

public class VistaQuejas extends JPanel {
	
	private TittleButton btnVerDocumento;
	private ControQuejas control;

	/**
	 * Create the panel.
	 */
	public VistaQuejas() {
		
		control = new ControQuejas(this);
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lbltlsCartaGantt = new LabelTitulos("Formulario de Quejas");
		lbltlsCartaGantt.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCartaGantt.setBounds(0, 60, 722, 30);
		add(lbltlsCartaGantt);
		
		btnVerDocumento = new TittleButton((String) null);
		btnVerDocumento.setText("Ver Documento");
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

}
