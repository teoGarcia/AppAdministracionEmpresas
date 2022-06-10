package main.java.CuartoMedio.EmprendimientoYEmpleabilidad.PlanNegocios;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.java.CuartoMedio.EmprendimientoYEmpleabilidad.PlanNegocios.*;
import main.java.CuartoMedio.LegislacionLaboral.Finiquitos.ControlFiniquito;
import main.java.ui.SingleAsignature.SingleAsignature;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;

public class VistaPlanNegocios extends SingleAsignature {

	private JPanel contentPane;
	private JButton btnPlantilla;
	private ControladorVistaPlanNegocios cvpn;
	
	public VistaPlanNegocios() {
		super();
		inicialize();
		
	}
	
	private void inicialize() {

		cvpn = new ControladorVistaPlanNegocios(this);
		setTitulo("Plan de Negocios");
		setDefinicion("El  plan  de  negocios  es  una  descripción  detallada  del  negocio  que  se quiere emprender,  es un proyecto\r\ndin\u00E1mico  en  el  que   se  describe  c\u00F3mo  se  va  a  operar  y  desarrollar  dicho  negocio durante  un  per\u00EDodo\r\ndeterminado.");
		addControllerBtn(cvpn);
		
	}

}
