package TerceroMedio.ProcesosAdministrativos.FormatoProyecto;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import ui.Labels.LabelTitulos;
import ui.SingleAsignature.SingleAsignature;
import ui.Buttons.TittleButton;

public class VistaFormatoProyecto extends JPanel{

	private ControlFormatoProyecto control;
	private TittleButton btnProInv;
	private TittleButton btnPreProNor;
	
	/**
	 * 
	 */
	public VistaFormatoProyecto() {
		
		control = new ControlFormatoProyecto(this);
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lbltlsCartaGantt = new LabelTitulos((String) null);
		lbltlsCartaGantt.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCartaGantt.setText("Formato de Proyecto");
		lbltlsCartaGantt.setBounds(0, 60, 722, 30);
		add(lbltlsCartaGantt);
		
		btnPreProNor = new TittleButton((String) null);
		btnPreProNor.setText("Presentacion Proyecto Normal");
		btnPreProNor.setBounds(219, 235, 308, 78);
		btnPreProNor.addActionListener(control);
		add(btnPreProNor);
		
		btnProInv = new TittleButton((String) null);
		btnProInv.setText("Proyecto de Investigacion");
		btnProInv.setBounds(219, 475, 308, 78);
		btnProInv.addActionListener(control);
		add(btnProInv);
		
	}

	public TittleButton getBtnProInv() {
		return btnProInv;
	}

	public TittleButton getBtnPreProNor() {
		return btnPreProNor;
	}

	public void setBtnProInv(TittleButton btnProInv) {
		this.btnProInv = btnProInv;
	}

	public void setBtnPreProNor(TittleButton btnPreProNor) {
		this.btnPreProNor = btnPreProNor;
	}
}
