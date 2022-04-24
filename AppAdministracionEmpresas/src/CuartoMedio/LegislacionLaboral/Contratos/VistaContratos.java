package CuartoMedio.LegislacionLaboral.Contratos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;

import CuartoMedio.LegislacionLaboral.Contratos.ControladorContratos;
import CuartoMedio.LegislacionLaboral.Contratos.Indefinido.VistaIndefinido;
import CuartoMedio.LegislacionLaboral.Contratos.PlazoFijo.VistaPlazoFijo;

import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.border.BevelBorder;

public class VistaContratos extends JPanel {

	private JButton btnPracticarIndefinido;
	private JButton btnPracticarHonorarios;
	private JButton btnEjemploHonorarios;
	private JButton btnPracticarPlazoFijo;
	private JButton btnEjemploPlazoFijo;
	private JButton btnEjemploIndefinido;
	
	private ControladorContratos cc;


	/**
	 * Create the frame.
	 */
	public VistaContratos() {
		setOpaque(false);
		
		cc = new ControladorContratos(this);
		
		setBounds(0, 0, 774, 731);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contratos de trabajo");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 34, 774, 29);
		add(lblNewLabel);
		
		JTabbedPane tabbedPaneContratos = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneContratos.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPaneContratos.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		tabbedPaneContratos.setForeground(Color.GRAY);
		tabbedPaneContratos.setBackground(new Color(54, 54, 54));
		tabbedPaneContratos.setOpaque(true);
		tabbedPaneContratos.setBounds(10, 250, 754, 404);
		tabbedPaneContratos.setFont(new Font("Dialog", Font.BOLD, 14));
		add(tabbedPaneContratos);
		
		
		VistaIndefinido vi = new VistaIndefinido("El contrato indefinido es aquel que se establece sin definir l\u00EDmites de"
				  +" tiempo en la prestaci\u00F3n de los servicios, en\r\ncuanto a la duraci\u00F3n del contrato."
				  +"\r\n\r\nEste tipo de  contrato se reconoce y se considera bajo esta  modalidad, cuando el acuerdo "
				  +" contractual  genera\r\nun v\u00EDnculo legal entre el empleador y el trabajador a largo "
				  +"plazo.\r\n\r\nAdem\u00E1s  de la experiencia y aprendizaje en \u00E1reas espec\u00EDficas "
				  +"que  adquiere el trabajador  bajo esta  modalidad\r\n(al no contar con un l\u00EDmite de tiempo),"
				  +" cabe se\u00F1alar que un contrato de plazo indefinido llevar\u00E1  al  trabajador  a\r\nadquirir "
				  +"derechos por sus a\u00F1os de servicios, mientras siga vigente el contrato.");
		tabbedPaneContratos.addTab("Indefinido", null, vi, null);
		
		VistaPlazoFijo vpf = new VistaPlazoFijo("Es aquel  contrato de trabajo que tiene una duraci\u00F3n determinada, por lo cual, de acuerdo a lo dispuesto  en  el\r\nart\u00EDculo 159 N\u00B0 4 del C\u00F3digo del Trabajo, termina por el vencimiento del plazo convenido.\r\n\r\nEste plazo, por regla general, no puede exceder de un a\u00F1o, salvo que se trate de profesionales o  t\u00E9cnicos  que\r\ntengan un t\u00EDtulo profesional, cuyo t\u00EDtulo haya sido otorgado por una instituci\u00F3n de educaci\u00F3n superior del Estado\r\no reconocida por \u00E9ste, en cuyo caso la duraci\u00F3n del contrato no puede ser mayor a dos a\u00F1os. ");
		tabbedPaneContratos.addTab("Plazo fijo", null, vpf, null);
		
		 /* JPanel panel = new JPanel(); panel.setBackground(new Color(54, 54, 54));
		  tabbedPaneContratos.addTab("Indefinido", null, panel, null);
		  panel.setLayout(null);
		  
		  JEditorPane editorPaneIndefinido = new JEditorPane();
		  editorPaneIndefinido.setForeground(new Color(255, 255, 255));
		  editorPaneIndefinido.setOpaque(false);
		  editorPaneIndefinido.setEditable(false); editorPaneIndefinido.setBorder(new
		  LineBorder(new Color(0, 0, 0))); editorPaneIndefinido.setBackground(new
		  Color(252, 252, 252)); editorPaneIndefinido.
		  setText("El contrato indefinido es aquel que se establece sin definir l\u00EDmites de"
		  +
		  " tiempo en la prestaci\u00F3n de los servicios, en\r\ncuanto a la duraci\u00F3n del contrato."
		  +
		  "\r\n\r\nEste tipo de  contrato se reconoce y se considera bajo esta  modalidad, cuando el acuerdo "
		  +
		  " contractual  genera\r\nun v\u00EDnculo legal entre el empleador y el trabajador a largo "
		  +
		  "plazo.\r\n\r\nAdem\u00E1s  de la experiencia y aprendizaje en \u00E1reas espec\u00EDficas "
		  +
		  "que  adquiere el trabajador  bajo esta  modalidad\r\n(al no contar con un l\u00EDmite de tiempo),"
		  +
		  " cabe se\u00F1alar que un contrato de plazo indefinido llevar\u00E1  al  trabajador  a\r\nadquirir "
		  +
		  "derechos por sus a\u00F1os de servicios, mientras siga vigente el contrato."
		  ); editorPaneIndefinido.setFont(new Font("Dialog", Font.PLAIN, 14));
		  editorPaneIndefinido.setBounds(23, 35, 711, 231);
		  panel.add(editorPaneIndefinido);
		  
		  btnPracticarIndefinido = new JButton("Practicar");
		  btnPracticarIndefinido.setFont(new Font("Tahoma", Font.BOLD, 12));
		  btnPracticarIndefinido.setBounds(645, 307, 89, 35);
		  btnPracticarIndefinido.addActionListener(cc);
		  panel.add(btnPracticarIndefinido);
		  
		  btnEjemploIndefinido = new JButton("Ejemplo");
		  btnEjemploIndefinido.setFont(new Font("Tahoma", Font.BOLD, 12));
		  btnEjemploIndefinido.setBounds(528, 307, 89, 35);
		  btnEjemploIndefinido.addActionListener(cc); panel.add(btnEjemploIndefinido);*/
		 
		
			/*
			 * JPanel panel_1 = new JPanel(); panel_1.setOpaque(false);
			 * panel_1.setBackground(new Color(240, 248, 255));
			 * tabbedPaneContratos.addTab("Plazo fijo", null, panel_1, null);
			 * panel_1.setLayout(null);
			 * 
			 * JEditorPane editorPaneIndefinido_1 = new JEditorPane();
			 * editorPaneIndefinido_1.setForeground(new Color(255, 255, 255));
			 * editorPaneIndefinido_1.setOpaque(false); editorPaneIndefinido_1.setBorder(new
			 * LineBorder(new Color(0, 0, 0))); editorPaneIndefinido_1.
			 * setText("Es aquel  contrato de trabajo que tiene una duraci\u00F3n determinada, por lo cual, de acuerdo a lo dispuesto  en  el\r\nart\u00EDculo 159 N\u00B0 4 del C\u00F3digo del Trabajo, termina por el vencimiento del plazo convenido.\r\n\r\nEste plazo, por regla general, no puede exceder de un a\u00F1o, salvo que se trate de profesionales o  t\u00E9cnicos  que\r\ntengan un t\u00EDtulo profesional, cuyo t\u00EDtulo haya sido otorgado por una instituci\u00F3n de educaci\u00F3n superior del Estado\r\no reconocida por \u00E9ste, en cuyo caso la duraci\u00F3n del contrato no puede ser mayor a dos a\u00F1os. "
			 * ); editorPaneIndefinido_1.setFont(new Font("Dialog", Font.PLAIN, 14));
			 * editorPaneIndefinido_1.setBounds(23, 35, 711, 231);
			 * panel_1.add(editorPaneIndefinido_1);
			 * 
			 * btnPracticarPlazoFijo = new JButton("Practicar");
			 * btnPracticarPlazoFijo.setFont(new Font("Tahoma", Font.BOLD, 12));
			 * btnPracticarPlazoFijo.setBounds(645, 307, 89, 35);
			 * btnPracticarPlazoFijo.addActionListener(cc);
			 * panel_1.add(btnPracticarPlazoFijo);
			 * 
			 * btnEjemploPlazoFijo = new JButton("Ejemplo"); btnEjemploPlazoFijo.setFont(new
			 * Font("Tahoma", Font.BOLD, 12)); btnEjemploPlazoFijo.setBounds(528, 307, 89,
			 * 35); btnEjemploPlazoFijo.addActionListener(cc);
			 * panel_1.add(btnEjemploPlazoFijo);
			 */
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBackground(new Color(240, 248, 255));
		tabbedPaneContratos.addTab("Honorarios", null, panel_2, null);
		panel_2.setLayout(null);
		
		JEditorPane editorPaneIndefinido_2 = new JEditorPane();
		editorPaneIndefinido_2.setForeground(new Color(255, 255, 255));
		editorPaneIndefinido_2.setOpaque(false);
		editorPaneIndefinido_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPaneIndefinido_2.setText("El contrato a honorarios es una convenci\u00F3n en  virtud  de  la  cual una  parte  se  encuentra obligada  a  prestar\r\nservicios espec\u00EDficos, por un  tiempo  determinado a favor  de  otro, el que  a  su  vez  se  obliga  a pagar  una\r\ncierta cantidad de dinero por dichos servicios. Se rige  por  las  reglas  relativas  al arrendamiento  de  servicios\r\ninmateriales, particularmente en el art\u00EDculo 2006 y siguientes del C\u00F3digo Civil.\r\n\r\nEste contrato no puede tener una duraci\u00F3n superior al necesario para desarrollar  la  labor espec\u00EDfica  para  la\r\ncual se celebr\u00F3, y est\u00E1 pensado para las personas que presentan  servicios  con  cierta autonom\u00EDa,  y  son  las\r\npartes las llamadas a determinar los t\u00E9rminos y formas en que se llevan a  cabo  los  servicios, y  la  respectiva\r\nremuneraci\u00F3n.");
		editorPaneIndefinido_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		editorPaneIndefinido_2.setBounds(23, 35, 711, 231);
		panel_2.add(editorPaneIndefinido_2);
		
		btnPracticarHonorarios = new JButton("Practicar");
		btnPracticarHonorarios.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPracticarHonorarios.setBounds(645, 307, 89, 35);
		btnPracticarHonorarios.addActionListener(cc);
		panel_2.add(btnPracticarHonorarios);
		
		btnEjemploHonorarios = new JButton("Ejemplo");
		btnEjemploHonorarios.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEjemploHonorarios.setBounds(528, 307, 89, 35);
		btnEjemploHonorarios.addActionListener(cc);
		panel_2.add(btnEjemploHonorarios);
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.setIcon(new ImageIcon(VistaContratos.class.getResource("/Imagenes/Icons/atras.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(718, 680, 46, 40);
		add(btnNewButton);
		
		JEditorPane dtrpnElContratoDe = new JEditorPane();
		dtrpnElContratoDe.setForeground(new Color(255, 255, 255));
		dtrpnElContratoDe.setOpaque(false);
		dtrpnElContratoDe.setEditable(false);
		dtrpnElContratoDe.setFont(new Font("Dialog", Font.PLAIN, 14));
		dtrpnElContratoDe.setText("El contrato de trabajo es la herramienta b\u00E1sica para el buen funcionamiento del mercado laboral. En \u00E9l se especifican\r\nlas condiciones bajo las cuales un trabajador llevar\u00E1 a cabo determinadas tareas encargadas por  el  empleador. Del \r\ncontrato de trabajo se derivan derechos y deberes de las partes y es una prueba fundamental cuando  se  solicite  la\r\nayuda de un juez en casos de incumplimiento o desacuerdos");
		dtrpnElContratoDe.setBackground(new Color(254, 254, 254));
		dtrpnElContratoDe.setBounds(10, 97, 752, 99);
		add(dtrpnElContratoDe);
		
	}

	public JButton getBtnPracticarIndefinido() {
		return btnPracticarIndefinido;
	}

	public void setBtnPracticarIndefinido(JButton btnPracticarIndefinido) {
		this.btnPracticarIndefinido = btnPracticarIndefinido;
	}

	public JButton getBtnPracticarHonorarios() {
		return btnPracticarHonorarios;
	}

	public void setBtnPracticarHonorarios(JButton btnPracticarHonorarios) {
		this.btnPracticarHonorarios = btnPracticarHonorarios;
	}

	public JButton getBtnEjemploHonorarios() {
		return btnEjemploHonorarios;
	}

	public void setBtnEjemploHonorarios(JButton btnEjemploHonorarios) {
		this.btnEjemploHonorarios = btnEjemploHonorarios;
	}

	public JButton getBtnPracticarPlazoFijo() {
		return btnPracticarPlazoFijo;
	}

	public void setBtnPracticarPlazoFijo(JButton btnPracticarPlazoFijo) {
		this.btnPracticarPlazoFijo = btnPracticarPlazoFijo;
	}

	public JButton getBtnEjemploPlazoFijo() {
		return btnEjemploPlazoFijo;
	}

	public void setBtnEjemploPlazoFijo(JButton btnEjemploPlazoFijo) {
		this.btnEjemploPlazoFijo = btnEjemploPlazoFijo;
	}

	public JButton getBtnEjemploIndefinido() {
		return btnEjemploIndefinido;
	}

	public void setBtnEjemploIndefinido(JButton btnEjemploIndefinido) {
		this.btnEjemploIndefinido = btnEjemploIndefinido;
	}
}
