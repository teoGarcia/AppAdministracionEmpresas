package main.java.CuartoMedio.LegislacionLaboral.Contratos;

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
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.event.ChangeListener;

import main.java.CuartoMedio.LegislacionLaboral.Contratos.Honorarios.VistaHonorarios;
import main.java.CuartoMedio.LegislacionLaboral.Contratos.Indefinido.VistaIndefinido;
import main.java.CuartoMedio.LegislacionLaboral.Contratos.PlazoFijo.VistaPlazoFijo;

import javax.swing.event.ChangeEvent;
import javax.swing.border.BevelBorder;

public class VistaContratos extends JPanel {


	/**
	 * Create the frame.
	 */
	public VistaContratos() {
		setOpaque(false);
		setBounds(0, 0, 774, 731);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Contratos de trabajo");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 34, 774, 29);
		add(lblTitulo);
		
		JEditorPane txtDefinicion = new JEditorPane();
		txtDefinicion.setForeground(new Color(255, 255, 255));
		txtDefinicion.setOpaque(false);
		txtDefinicion.setEditable(false);
		txtDefinicion.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtDefinicion.setText("El contrato de trabajo es la herramienta b\u00E1sica para el buen funcionamiento del mercado laboral. En \u00E9l se especifican las condiciones bajo las cuales un trabajador llevar\u00E1 a cabo determinadas tareas encargadas por  el  empleador. Del contrato de trabajo se derivan derechos y deberes de las partes y es una prueba fundamental cuando  se  solicite  la ayuda de un juez en casos de incumplimiento o desacuerdos");
		txtDefinicion.setBackground(new Color(254, 254, 254));
		txtDefinicion.setBounds(21, 95, 731, 99);
		add(txtDefinicion);
		
		JTabbedPane tabbedPaneContratos = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneContratos.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPaneContratos.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		tabbedPaneContratos.setForeground(Color.GRAY);
		tabbedPaneContratos.setBackground(new Color(54, 54, 54));
		tabbedPaneContratos.setOpaque(true);
		tabbedPaneContratos.setBounds(5, 250, 754, 404);
		tabbedPaneContratos.setFont(new Font("Dialog", Font.BOLD, 14));
		add(tabbedPaneContratos);
		
		
		VistaIndefinido vi = new VistaIndefinido("El contrato indefinido es aquel que se establece sin definir l\u00EDmites de"
				  +" tiempo en la prestaci\u00F3n de los servicios,  en cuanto a la duraci\u00F3n del contrato."
				  +" Este tipo de  contrato se reconoce y se considera bajo esta  modalidad,   cuando el acuerdo "
				  +" contractual  genera un v\u00EDnculo legal entre el empleador y el trabajador a largo "
				  +"plazo. \n  Adem\u00E1s  de la experiencia y aprendizaje en \u00E1reas espec\u00EDficas "
				  +"que  adquiere el trabajador  bajo esta  modalidad (al no contar con un l\u00EDmite de tiempo),"
				  +" cabe se\u00F1alar que un contrato de plazo indefinido llevar\u00E1  al  trabajador  a adquirir "
				  +"derechos por sus a\u00F1os de servicios, mientras siga vigente el contrato.");
		tabbedPaneContratos.addTab("Indefinido", null, vi, null);
		
		VistaPlazoFijo vpf = new VistaPlazoFijo("Es aquel  contrato de trabajo que tiene una duraci\u00F3n determinada, por lo cual, de acuerdo a lo dispuesto en el art\u00EDculo 159 N\u00B0 4 del C\u00F3digo del Trabajo, termina por el vencimiento del plazo convenido. Este plazo, por regla general, no puede exceder de un a\u00F1o, salvo que se trate de profesionales o  t\u00E9cnicos  que tengan un t\u00EDtulo profesional, cuyo t\u00EDtulo haya sido otorgado por una instituci\u00F3n de educaci\u00F3n superior del Estado o reconocida por \u00E9ste, en cuyo caso la duraci\u00F3n del contrato no puede ser mayor a dos a\u00F1os. ");
		tabbedPaneContratos.addTab("Plazo fijo", null, vpf, null);
		
		VistaHonorarios vh = new VistaHonorarios("El contrato a honorarios es una convenci\u00F3n en  virtud  de  la  cual una  parte  se  encuentra obligada  a  prestar servicios espec\u00EDficos, por un  tiempo  determinado a favor  de  otro, el que  a  su  vez  se  obliga  a pagar  una cierta cantidad de dinero por dichos servicios. Se rige  por  las  reglas  relativas  al arrendamiento  de  servicios inmateriales, particularmente en el art\u00EDculo 2006 y siguientes del C\u00F3digo Civil.  Este contrato no puede tener una duraci\u00F3n superior al necesario para desarrollar  la  labor espec\u00EDfica  para  la cual se celebr\u00F3, y est\u00E1 pensado para las personas que presentan  servicios  con  cierta autonom\u00EDa,  y  son  las partes las llamadas a determinar los t\u00E9rminos y formas en que se llevan a  cabo  los  servicios, y  la  respectiva remuneraci\u00F3n.");
		tabbedPaneContratos.addTab("Honorarios", null, vh, null);
		
	}
}
