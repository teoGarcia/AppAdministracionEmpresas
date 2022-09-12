package TerceroMedio.ProcesosAdministrativos.EvaluacionProyecto;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import TerceroMedio.ProcesosAdministrativos.Departamentalizacion.Imprimir.ControlDepartamentalizacion;
import ui.Buttons.TittleButton;
import ui.Labels.LabelTitulos;

public class VistaEvaluacionProyecto extends JPanel {
	
	private TittleButton btnVerDocumento;
	private ControlEvaluacionProyecto control;

	/**
	 * Create the panel.
	 */
	public VistaEvaluacionProyecto() {
		
		control = new ControlEvaluacionProyecto(this);
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lbltlsCartaGantt = new LabelTitulos((String) null);
		lbltlsCartaGantt.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCartaGantt.setText("Evaluaci\u00F3n de Proyecto");
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
