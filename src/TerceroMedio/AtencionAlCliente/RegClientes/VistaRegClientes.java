package TerceroMedio.AtencionAlCliente.RegClientes;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import TerceroMedio.ProcesosAdministrativos.FormatoOrganigrama.ControlFormatoOrganigrama;
import ui.Buttons.TittleButton;
import ui.Labels.LabelTitulos;

public class VistaRegClientes extends JPanel {
	
	private TittleButton btnVerDocumento;
	private ControRegClientes control;

	/**
	 * Create the panel.
	 */
	public VistaRegClientes() {
		
		control = new ControRegClientes(this);
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lbltlsCartaGantt = new LabelTitulos("Registro de Clientes");
		lbltlsCartaGantt.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCartaGantt.setBounds(0, 60, 722, 30);
		add(lbltlsCartaGantt);
		
		
	}

	public TittleButton getBtnVerDocumento() {
		return btnVerDocumento;
	}

	public void setBtnVerDocumento(TittleButton btnVerDocumento) {
		this.btnVerDocumento = btnVerDocumento;
	}

}
