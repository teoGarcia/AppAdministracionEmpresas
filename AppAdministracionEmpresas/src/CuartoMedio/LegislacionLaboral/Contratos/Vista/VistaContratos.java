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

public class VistaContratos extends JFrame {

	private JPanel contentPane;

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
		
		JButton btnPracticarIndefinido_1 = new JButton("Practicar");
		btnPracticarIndefinido_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPracticarIndefinido_1.setBounds(648, 330, 89, 35);
		panel_1.add(btnPracticarIndefinido_1);
		
		JButton btnEjemploIndefinido_1 = new JButton("Ejemplo");
		btnEjemploIndefinido_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEjemploIndefinido_1.setBounds(530, 330, 89, 35);
		panel_1.add(btnEjemploIndefinido_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPaneContratos.addTab("Honorarios", null, panel_2, null);
		panel_2.setLayout(null);
		
		JEditorPane editorPaneIndefinido_2 = new JEditorPane();
		editorPaneIndefinido_2.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		editorPaneIndefinido_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		editorPaneIndefinido_2.setBounds(24, 39, 711, 231);
		panel_2.add(editorPaneIndefinido_2);
		
		JButton btnPracticarIndefinido_2 = new JButton("Practicar");
		btnPracticarIndefinido_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPracticarIndefinido_2.setBounds(646, 325, 89, 35);
		panel_2.add(btnPracticarIndefinido_2);
		
		JButton btnEjemploIndefinido_2 = new JButton("Ejemplo");
		btnEjemploIndefinido_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEjemploIndefinido_2.setBounds(528, 325, 89, 35);
		panel_2.add(btnEjemploIndefinido_2);
		
		JEditorPane editorPaneIndefinido = new JEditorPane();
		editorPaneIndefinido.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPaneIndefinido.setBackground(new Color(252, 252, 252));
		editorPaneIndefinido.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		editorPaneIndefinido.setFont(new Font("Dialog", Font.PLAIN, 14));
		editorPaneIndefinido.setBounds(23, 35, 711, 231);
		panel.add(editorPaneIndefinido);
		
		JButton btnPracticarIndefinido = new JButton("Practicar");
		btnPracticarIndefinido.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPracticarIndefinido.setBounds(645, 307, 89, 35);
		panel.add(btnPracticarIndefinido);
		
		JButton btnEjemploIndefinido = new JButton("Ejemplo");
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
}
