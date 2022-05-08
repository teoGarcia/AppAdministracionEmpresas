package CuartoMedio.LegislacionLaboral.CertificadoVacaciones.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;

import CuartoMedio.LegislacionLaboral.CertificadoVacaciones.Controlador.ControlCertificadoVacaciones;

public class VistaCertificadoVacaciones extends JFrame {

	private JPanel contentPane;
	private ControlCertificadoVacaciones ccv;
	private JButton btnPracticarVacaciones;
	private JButton btnEjemploVacaciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaCertificadoVacaciones frame = new VistaCertificadoVacaciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaCertificadoVacaciones() {
		
		ccv = new ControlCertificadoVacaciones(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Certificado Vacaciones");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 42, 784, 30);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 181, 764, 418);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		tabbedPane.addTab("Permiso por Vacaciones", null, panel, null);
		tabbedPane.setFont(new Font("Dialog", Font.BOLD, 14));
		panel.setLayout(null);
		
		JEditorPane editorPaneCertVacaciones = new JEditorPane();
		editorPaneCertVacaciones.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPaneCertVacaciones.setBackground(new Color(252, 252, 252));
		editorPaneCertVacaciones.setFont(new Font("Dialog", Font.PLAIN, 14));
		editorPaneCertVacaciones.setText("Los trabajadores chilenos con m\u00E1s de un a\u00F1o de servicio tienen derecho a 15  d\u00EDas  h\u00E1biles de  vacaciones  al\r\na\u00F1o, lo que en la pr\u00E1ctica son 21 d\u00EDas corridos, o tres semanas. La  ley  se\u00F1ala  que  las vacaciones  laborales\r\ndeben concederse de preferencia en primavera o verano, consider\u00E1ndose las necesidades del servicio.");
		editorPaneCertVacaciones.setBounds(23, 35, 711, 231);
		panel.add(editorPaneCertVacaciones);
		
		btnEjemploVacaciones = new JButton("Ejemplo");
		btnEjemploVacaciones.setFont(new Font("Dialog", Font.BOLD, 12));
		btnEjemploVacaciones.setBounds(527, 321, 89, 35);
		btnEjemploVacaciones.addActionListener(ccv);
		panel.add(btnEjemploVacaciones);
		
		btnPracticarVacaciones = new JButton("Practicar");
		btnPracticarVacaciones.setFont(new Font("Dialog", Font.BOLD, 12));
		btnPracticarVacaciones.setBounds(645, 321, 89, 35);
		btnPracticarVacaciones.addActionListener(ccv);
		panel.add(btnPracticarVacaciones);
		
		JButton lblNewLabel_1 = new JButton("");
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setIcon(new ImageIcon(VistaCertificadoVacaciones.class.getResource("/Imagenes/Icons/atras.png")));
		lblNewLabel_1.setBounds(728, 679, 46, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(VistaCertificadoVacaciones.class.getResource("/Imagenes/ImagenesFondo/fondo-gris.jpg")));
		lblFondo.setBounds(0, 0, 784, 729);
		contentPane.add(lblFondo);
		
	}

	public JButton getBtnPracticarVacaciones() {
		return btnPracticarVacaciones;
	}

	public void setBtnPracticarVacaciones(JButton btnPracticarVacaciones) {
		this.btnPracticarVacaciones = btnPracticarVacaciones;
	}

	public JButton getBtnEjemploVacaciones() {
		return btnEjemploVacaciones;
	}

	public void setBtnEjemploVacaciones(JButton btnEjemploVacaciones) {
		this.btnEjemploVacaciones = btnEjemploVacaciones;
	}
}
