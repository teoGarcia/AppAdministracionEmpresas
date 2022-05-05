package CuartoMedio.LegislacionLaboral.PermisosLaborales;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import CuartoMedio.LegislacionLaboral.Contratos.Indefinido.VistaIndefinido;
import CuartoMedio.LegislacionLaboral.PermisosLaborales.DiasHoras.VistaDiasHoras;
import CuartoMedio.LegislacionLaboral.PermisosLaborales.NoRetribuido.VistaNoRetribuido;
import CuartoMedio.LegislacionLaboral.PermisosLaborales.Salud.VistaSalud;
import CuartoMedio.LegislacionLaboral.PermisosLaborales.Solicitud.VistaSolicitud;
import CuartoMedio.LegislacionLaboral.PermisosLaborales.Vacaciones.VistaVacaciones;

import java.awt.ComponentOrientation;

public class VistaPermisosLaborales extends JPanel {

	public VistaPermisosLaborales() {
		setOpaque(false);
		setBackground(Color.DARK_GRAY);
		inicialize();
	}
	
	private void inicialize() {
		setBounds(0, 0, 774, 731);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Permisos Laborales");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 34, 774, 29);
		add(lblTitulo);
		
		JEditorPane txtDefinicion = new JEditorPane();
		txtDefinicion.setForeground(new Color(255, 255, 255));
		txtDefinicion.setOpaque(false);
		txtDefinicion.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtDefinicion.setText("Una permiso laboral es b\u00E1sicamente una manera formal de solicitar un descanso del trabajo durante un per\u00EDodo de tiempo particular. El motivo debe incluirse en el permiso y es esencial para asegurarce de que el instituto u organizaci\u00F3n lo acepte. \r\nSi el motivo legal para la solicitud, no ser\u00E1 rechazada sin ninguna justificaci\u00F3n, especialmente cuando se deba a razones personales, como enfermedad, trabajo urgente o para visitar a padres enfermos, entre otros.");
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
		
		VistaSolicitud vs = new VistaSolicitud("Una solicitud de permiso laboral es una carta formal que se le escribe a el supervisor de la empresa para solicitar un tiempo fuera del trabajo. La carta formal es necesaria para su archivo personal. Proporciona un registro escrito de la notificaciónes que recibe y a la empresa antes de necesitar el permiso de ausencia. Si bien se puede explicar la situación en persona, una carta escrita proporciona la explicación exacta de la necesidad del tiempo libre. Esto hace que la solicitud sea más fácil de entender para el gerente o persona de recursos humanos.");
		tabbedPaneContratos.addTab("Solicitud", null, vs, null);
		
		VistaDiasHoras vdh = new VistaDiasHoras("DEFINICION");
		tabbedPaneContratos.addTab("Dias o Horas", null, vdh, null);
		
		VistaVacaciones vv = new VistaVacaciones("DEFINICION");
		tabbedPaneContratos.addTab("Vacaciones", null, vv, null);
		
		VistaSalud vSalud = new VistaSalud("DEFINICION");
		tabbedPaneContratos.addTab("Vacaciones", null, vSalud, null);
		
		VistaNoRetribuido vnr = new VistaNoRetribuido("DEFINICION");
		tabbedPaneContratos.addTab("Vacaciones", null, vnr, null);
		
		
	}
}
