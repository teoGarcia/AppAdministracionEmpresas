package TerceroMedio.ProcesosAdministrativos.FormatoOrganigrama;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import TerceroMedio.ProcesosAdministrativos.FormatoProyecto.ControlFormatoProyecto;
import ui.Buttons.TittleButton;
import ui.Labels.LabelTitulos;

public class VistaFormatoOrganigrama extends JPanel {
	
	private TittleButton btnTipOrg;
	private TittleButton btnOrg;
	private ControlFormatoOrganigrama control;

	/**
	 * Create the panel.
	 */
	public VistaFormatoOrganigrama() {
		
		control = new ControlFormatoOrganigrama(this);
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lbltlsCartaGantt = new LabelTitulos((String) null);
		lbltlsCartaGantt.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCartaGantt.setText("Organigrama");
		lbltlsCartaGantt.setBounds(0, 60, 722, 30);
		add(lbltlsCartaGantt);
		
		btnOrg = new TittleButton((String) null);
		btnOrg.setText("Organigrama");
		btnOrg.setBounds(219, 235, 308, 78);
		btnOrg.addActionListener(control);
		add(btnOrg);
		
		btnTipOrg = new TittleButton((String) null);
		btnTipOrg.setText("Tipos de Organigramas");
		btnTipOrg.setBounds(219, 475, 308, 78);
		btnTipOrg.addActionListener(control);
		add(btnTipOrg);
		
	}

	public TittleButton getBtnTipOrg() {
		return btnTipOrg;
	}

	public TittleButton getBtnOrg() {
		return btnOrg;
	}

	public void setBtnTipOrg(TittleButton btnTipOrg) {
		this.btnTipOrg = btnTipOrg;
	}

	public void setBtnOrg(TittleButton btnOrg) {
		this.btnOrg = btnOrg;
	}


}
