package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Menu;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class VistaMenuPrincipalHorsExt extends JPanel {
	
	private ControlMenuPrinciparHorExt cmphe;
	private JButton btnHorExt;
	private JButton btnEmp;
	

	/**
	 * Create the panel.
	 */
	public VistaMenuPrincipalHorsExt() {
		
		cmphe = new ControlMenuPrinciparHorExt(this);
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		btnEmp = new JButton("Empleado");
		btnEmp.setFont(new Font("Dialog", Font.BOLD, 14));
		btnEmp.setBounds(130, 284, 190, 190);
		btnEmp.addActionListener(cmphe);
		add(btnEmp);
		
		btnHorExt = new JButton("Horas Extras");
		btnHorExt.setFont(new Font("Dialog", Font.BOLD, 14));
		btnHorExt.setBounds(452, 284, 190, 190);
		btnHorExt.addActionListener(cmphe);
		add(btnHorExt);

	}

	public JButton getBtnHorExt() {
		return btnHorExt;
	}

	public void setBtnHorExt(JButton btnHorExt) {
		this.btnHorExt = btnHorExt;
	}

	public JButton getbtnEmp() {
		return btnEmp;
	}

	public void setbtnEmp(JButton btnEmp) {
		this.btnEmp = btnEmp;
	}
}
