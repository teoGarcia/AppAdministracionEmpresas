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
import CuartoMedio.LegislacionLaboral.PermisosLaborales.Comprobante.VistaComprobante;
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
		
		VistaDiasHoras vdh = new VistaDiasHoras("Los trabajadores regularmente piden permisos de unas horas, medio día, un día o varios días, y en caso de ser concedidos surge la duda de si la empresa debe remunerar ese tiempo no laborado, o puede descontarlo del sueldo, o exigirle al trabajador que lo compense con trabajo ejecutado por fuera de la jornada laboral.");
		tabbedPaneContratos.addTab("Dias o Horas", null, vdh, null);
		
		VistaVacaciones vv = new VistaVacaciones("Las vacaciones legales en Chile son un derecho que tienen todos los trabajadores para ausentarse del trabajo en un periodo determinado de manera anual. Cabe destacar que también son llamadas como feriado.\r\n"
				+ "\r\n"
				+ "El único requisito para poder disfrutar de este beneficio es que el trabajar tenga mínimo 1 año trabajando para la misma empresa.\r\n"
				+ "\r\n"
				+ "En caso, de que se tenga menos de 1 año por ley no corresponde tener este derecho. Sin embargo, todo dependerá del empleador, ya que este podría llegar a proporcionarte un tiempo mínimo de descanso.");
		tabbedPaneContratos.addTab("Vacaciones", null, vv, null);
		
		VistaSalud vSalud = new VistaSalud("Es un documento escrito donde una persona presenta una solicitud de permiso por motivos de salud ya sea de él o por acompañar a un familiar hijo, madre, padre , hermano en este documento describe el motivo de la solicitud; el tiempo , fecha y firma.");
		tabbedPaneContratos.addTab("Salud", null, vSalud, null);
		
		VistaNoRetribuido vnr = new VistaNoRetribuido("Un permiso no retribuido es aquel que permite que un trabajador se ausente de su puesto por un tiempo concreto, renunciando a la remuneración salarial. Este tipo de solicitudes son frecuentes cuando los motivos para faltar al trabajo no están contemplados en los permisos retribuidos. \r\n"
				+ "\r\n"
				+ "Es decir, si un familiar de primer grado ha fallecido no tendremos que recurrir a este supuesto porque ya está contemplado en los permisos retribuidos. Sin embargo, si necesitas realizar un viaje por otro motivo sí podría ser una opción para ti.\r\n"
				+ "\r\n"
				+ "El permiso no retribuido es más breve, a diferencia de la excedencia, incluida en el Estatuto de Trabajadores, no se extiende más de un mes. Además, al regreso tendrás tu puesto de trabajo asegurado.");
		tabbedPaneContratos.addTab("No Retribuido", null, vnr, null);
		
		VistaComprobante vc = new VistaComprobante("DEFINICION");
		tabbedPaneContratos.addTab("Comprobante", null, vc, null);
		
		
	}
}
