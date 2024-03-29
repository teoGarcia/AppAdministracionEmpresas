package CuartoMedio.DotacionPersonal.Menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.VistaAplicacionPresupuesto;
import CuartoMedio.LegislacionLaboral.Contratos.VistaContratos;
import Menu.Side.SideMenu;

public class VistaMenuDotacionPersonal extends JPanel {

	private JButton btnAplPueTra;
	private JButton btnSelPer;
	private JButton btnPerEmp;
	private ControlMenuDotacionPersonal cmdp;
	
	/**
	 * Create the panel.
	 */
	public VistaMenuDotacionPersonal() {
		inicialize();
		contentViewDefault();
	}
	
	
	public void inicialize() {
		
		cmdp = new ControlMenuDotacionPersonal(this);
		
		setBounds(0, 0, 208, 476);
		setLayout(new GridLayout(0, 1, 0, 0));
		setOpaque(false);
		
		btnAplPueTra = new JButton("Aplicacion Puesto Trabajo");
		btnAplPueTra.setForeground(Color.WHITE);
		btnAplPueTra.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnAplPueTra.setBackground(new Color(54, 54, 54));
		btnAplPueTra.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAplPueTra.addActionListener(cmdp);
		add(btnAplPueTra);
		
		btnSelPer = new JButton("Selecci\u00F3n de Personal");
		btnSelPer.setForeground(Color.WHITE);
		btnSelPer.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnSelPer.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnSelPer.setBackground(new Color(54, 54, 54));
		btnSelPer.addActionListener(cmdp);
		add(btnSelPer);
		
		btnPerEmp = new JButton("Perfil de Empleado");
		btnPerEmp.setForeground(Color.WHITE);
		btnPerEmp.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnPerEmp.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnPerEmp.setBackground(new Color(54, 54, 54));
		btnPerEmp.addActionListener(cmdp);
		add(btnPerEmp);
		
		
	}
	
	private void contentViewDefault() {
		SideMenu.registerContentPanel(new VistaAplicacionPresupuesto(), btnAplPueTra.getText());
	}


	public JButton getBtnAplPueTra() {
		return btnAplPueTra;
	}


	public void setBtnAplPueTra(JButton btnAplPueTra) {
		this.btnAplPueTra = btnAplPueTra;
	}


	public JButton getBtnSelPer() {
		return btnSelPer;
	}


	public void setBtnSelPer(JButton btnSelPer) {
		this.btnSelPer = btnSelPer;
	}


	public JButton getBtnPerEmp() {
		return btnPerEmp;
	}


	public void setBtnPerEmp(JButton btnPerEmp) {
		this.btnPerEmp = btnPerEmp;
	}

}
