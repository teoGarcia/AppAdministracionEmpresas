package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Menu;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class VistaSubMenuCalcHorExt extends JPanel {
	
	private ControlSubMenuCalcHorExt csmche;
	private JButton btnRegEmp;
	private JButton btnVerEmp;

	/**
	 * Create the panel.
	 */
	public VistaSubMenuCalcHorExt() {
		
		csmche = new ControlSubMenuCalcHorExt(this);
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		btnRegEmp = new JButton("Registrar Empleado");
		btnRegEmp.setFont(new Font("Dialog", Font.BOLD, 14));
		btnRegEmp.setBounds(177, 185, 408, 88);
		btnRegEmp.addActionListener(csmche);
		add(btnRegEmp);
		
		btnVerEmp = new JButton("Ver Empleados");
		btnVerEmp.setFont(new Font("Dialog", Font.BOLD, 14));
		btnVerEmp.setBounds(177, 466, 408, 88);
		btnVerEmp.addActionListener(csmche);
		add(btnVerEmp);

	}

	public JButton getBtnRegEmp() {
		return btnRegEmp;
	}

	public void setBtnRegEmp(JButton btnRegEmp) {
		this.btnRegEmp = btnRegEmp;
	}

	public JButton getBtnVerEmp() {
		return btnVerEmp;
	}

	public void setBtnVerEmp(JButton btnVerEmp) {
		this.btnVerEmp = btnVerEmp;
	}

}
