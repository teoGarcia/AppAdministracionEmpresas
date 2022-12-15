package TerceroMedio.ProcesosAdministrativos.Departamentalizacion.Imprimir;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import TerceroMedio.ProcesosAdministrativos.FormatoOrganigrama.ControlFormatoOrganigrama;
import ui.Buttons.TittleButton;
import ui.Labels.LabelTitulos;

public class VistaDepartamentalizacion extends JPanel {
	
	private TittleButton btnVerDocumento;
	private ControlDepartamentalizacion control;

	/**
	 * Create the panel.
	 */
	public VistaDepartamentalizacion() {
		
		control = new ControlDepartamentalizacion(this);
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lbltlsCartaGantt = new LabelTitulos("Departamentalizacion");
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

}
