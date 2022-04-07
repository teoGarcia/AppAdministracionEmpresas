package CuartoMedio.LegislacionLaboral.Contratos.Vista;

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

import CuartoMedio.LegislacionLaboral.Contratos.Controlador.ControladorContratos;

public class VistaContratos extends JFrame {

	private JPanel contentPane;
	private JButton btnPracticarIndefinido;
	private JButton btnPracticarHonorarios;
	private JButton btnEjemploHonorarios;
	private JButton btnPracticarPlazoFijo;
	private JButton btnEjemploPlazoFijo;
	private JButton btnEjemploIndefinido;
	
	private ControladorContratos cc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaContratos frame = new VistaContratos();
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
	public VistaContratos() {
		
		cc = new ControladorContratos(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contratos de trabajo");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 34, 784, 29);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPaneContratos = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneContratos.setBounds(10, 250, 764, 404);
		tabbedPaneContratos.setFont(new Font("Dialog", Font.BOLD, 14));
		contentPane.add(tabbedPaneContratos);
		
		JPanel panel = new JPanel();
		tabbedPaneContratos.addTab("Indefinido", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		tabbedPaneContratos.addTab("Plazo fijo", null, panel_1, null);
		panel_1.setLayout(null);
		
		JEditorPane editorPaneIndefinido_1 = new JEditorPane();
		editorPaneIndefinido_1.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		editorPaneIndefinido_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		editorPaneIndefinido_1.setBounds(23, 35, 711, 231);
		panel_1.add(editorPaneIndefinido_1);
		
		btnPracticarPlazoFijo = new JButton("Practicar");
		btnPracticarPlazoFijo.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPracticarPlazoFijo.setBounds(645, 314, 89, 35);
		btnPracticarPlazoFijo.addActionListener(cc);
		panel_1.add(btnPracticarPlazoFijo);
		
		btnEjemploPlazoFijo = new JButton("Ejemplo");
		btnEjemploPlazoFijo.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEjemploPlazoFijo.setBounds(531, 314, 89, 35);
		panel_1.add(btnEjemploPlazoFijo);
		
		JPanel panel_2 = new JPanel();
		tabbedPaneContratos.addTab("Honorarios", null, panel_2, null);
		panel_2.setLayout(null);
		
		JEditorPane editorPaneIndefinido_2 = new JEditorPane();
		editorPaneIndefinido_2.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		editorPaneIndefinido_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		editorPaneIndefinido_2.setBounds(24, 39, 711, 231);
		panel_2.add(editorPaneIndefinido_2);
		
		btnPracticarHonorarios = new JButton("Practicar");
		btnPracticarHonorarios.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPracticarHonorarios.setBounds(646, 313, 89, 35);
		panel_2.add(btnPracticarHonorarios);
		
		btnEjemploHonorarios = new JButton("Ejemplo");
		btnEjemploHonorarios.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEjemploHonorarios.setBounds(527, 313, 89, 35);
		panel_2.add(btnEjemploHonorarios);
		
		JEditorPane editorPaneIndefinido = new JEditorPane();
		editorPaneIndefinido.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPaneIndefinido.setBackground(new Color(252, 252, 252));
		editorPaneIndefinido.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		editorPaneIndefinido.setFont(new Font("Dialog", Font.PLAIN, 14));
		editorPaneIndefinido.setBounds(23, 35, 711, 231);
		panel.add(editorPaneIndefinido);
		
		btnPracticarIndefinido = new JButton("Practicar");
		btnPracticarIndefinido.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPracticarIndefinido.setBounds(645, 307, 89, 35);
		panel.add(btnPracticarIndefinido);
		
		btnEjemploIndefinido = new JButton("Ejemplo");
		btnEjemploIndefinido.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEjemploIndefinido.setBounds(528, 307, 89, 35);
		panel.add(btnEjemploIndefinido);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(VistaContratos.class.getResource("/Imagenes/Icons/atras.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(728, 679, 46, 39);
		contentPane.add(btnNewButton);
		
		JEditorPane dtrpnElContratoDe = new JEditorPane();
		dtrpnElContratoDe.setEditable(false);
		dtrpnElContratoDe.setFont(new Font("Dialog", Font.PLAIN, 14));
		dtrpnElContratoDe.setText("El contrato de trabajo es la herramienta b\u00E1sica para el buen funcionamiento del mercado laboral. En \u00E9l se especifican\r\nlas condiciones bajo las cuales un trabajador llevar\u00E1 a cabo determinadas tareas encargadas por  el  empleador. Del \r\ncontrato de trabajo se derivan derechos y deberes de las partes y es una prueba fundamental cuando  se  solicite  la\r\nayuda de un juez en casos de incumplimiento o desacuerdos");
		dtrpnElContratoDe.setBackground(new Color(254, 254, 254));
		dtrpnElContratoDe.setBounds(10, 97, 752, 99);
		contentPane.add(dtrpnElContratoDe);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VistaContratos.class.getResource("/Imagenes/ImagenesFondo/fondo-gris.jpg")));
		lblNewLabel_1.setBounds(0, 0, 784, 729);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		
		
		
		
		
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
