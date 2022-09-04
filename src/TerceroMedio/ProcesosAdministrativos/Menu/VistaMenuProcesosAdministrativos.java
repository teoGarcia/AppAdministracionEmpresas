package TerceroMedio.ProcesosAdministrativos.Menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import CuartoMedio.LegislacionLaboral.Contratos.VistaContratos;
import CuartoMedio.LegislacionLaboral.Menu.ControladorMenuLegislacionLaboral;
import Menu.Side.SideMenu;
import TerceroMedio.ProcesosAdministrativos.FormatoProyecto.VistaFormatoProyecto;

public class VistaMenuProcesosAdministrativos extends JPanel {
	
	private ControlMenuProcesosAdministrativos control;
	private JButton btnForPro;
	private JButton btnCarGantt;
	private JButton btnCalPro;
	private JButton btnDep;
	private JButton btnOrg;
	private JButton btnEvaPro;

	/**
	 * Create the panel.
	 */
	public VistaMenuProcesosAdministrativos() {
		
		inicialize();
		contentViewDefault();
	}

	private void inicialize() {
		
		control = new ControlMenuProcesosAdministrativos(this);
		
		setBounds(0, 0, 208, 476);
		setLayout(new GridLayout(0, 1, 0, 0));
		setOpaque(false);
		
		btnForPro = new JButton("Formato de proyecto");
		btnForPro.setForeground(Color.WHITE);
		btnForPro.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnForPro.setBackground(new Color(54, 54, 54));
		btnForPro.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnForPro.addActionListener(control);
		add(btnForPro);
		
		btnCarGantt = new JButton("Carta GANTT");
		btnCarGantt.setForeground(Color.WHITE);
		btnCarGantt.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCarGantt.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCarGantt.setBackground(new Color(54, 54, 54));
		btnCarGantt.addActionListener(control);
		add(btnCarGantt);
		
		btnCalPro = new JButton("Calendario de produccion");
		btnCalPro.setForeground(Color.WHITE);
		btnCalPro.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCalPro.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCalPro.setBackground(new Color(54, 54, 54));
		btnCalPro.addActionListener(control);
		add(btnCalPro);
		
		btnOrg = new JButton("Organigrama");
		btnOrg.setForeground(Color.WHITE);
		btnOrg.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnOrg.setBackground(new Color(54, 54, 54));
		btnOrg.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnOrg.addActionListener(control);
		add(btnOrg);
		
		btnDep = new JButton("Departamentalizacion");
		btnDep.setForeground(Color.WHITE);
		btnDep.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnDep.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnDep.setBackground(new Color(54, 54, 54));
		btnDep.addActionListener(control);
		add(btnDep);
		
		btnEvaPro = new JButton("Evaluacion de proyecto");
		btnEvaPro.setForeground(Color.WHITE);
		btnEvaPro.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnEvaPro.setBackground(new Color(54, 54, 54));
		btnEvaPro.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnEvaPro.addActionListener(control);
		add(btnEvaPro);
		
	}
	
	private void contentViewDefault() {
		SideMenu.registerContentPanel(new VistaFormatoProyecto(), btnForPro.getText());
	}

	public JButton getBtnForPro() {
		return btnForPro;
	}

	public JButton getBtnCarGantt() {
		return btnCarGantt;
	}

	public JButton getBtnCalPro() {
		return btnCalPro;
	}

	public JButton getBtnDep() {
		return btnDep;
	}

	public JButton getBtnOrg() {
		return btnOrg;
	}

	public JButton getBtnEvaPro() {
		return btnEvaPro;
	}

	public void setBtnForPro(JButton btnForPro) {
		this.btnForPro = btnForPro;
	}

	public void setBtnCarGantt(JButton btnCarGantt) {
		this.btnCarGantt = btnCarGantt;
	}

	public void setBtnCalPro(JButton btnCalPro) {
		this.btnCalPro = btnCalPro;
	}

	public void setBtnDep(JButton btnDep) {
		this.btnDep = btnDep;
	}

	public void setBtnOrg(JButton btnOrg) {
		this.btnOrg = btnOrg;
	}

	public void setBtnEvaPro(JButton btnEvaPro) {
		this.btnEvaPro = btnEvaPro;
	}

}
