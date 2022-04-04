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
		
		JLabel lblNewLabel = new JLabel("Contratos");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 52, 784, 29);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPaneContratos = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneContratos.setBounds(10, 181, 764, 418);
		tabbedPaneContratos.setFont(new Font("Dialog", Font.BOLD, 14));
		contentPane.add(tabbedPaneContratos);
		
		JPanel panel = new JPanel();
		tabbedPaneContratos.addTab("Indefinido", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		tabbedPaneContratos.addTab("Plazo fijo", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPaneContratos.addTab("Honorarios", null, panel_2, null);
		
		JEditorPane editorPaneIndefinido = new JEditorPane();
		editorPaneIndefinido.setFont(new Font("Dialog", Font.PLAIN, 14));
		editorPaneIndefinido.setBounds(23, 35, 711, 231);
		panel.add(editorPaneIndefinido);
		
		JButton btnPracticarIndefinido = new JButton("Practicar");
		btnPracticarIndefinido.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPracticarIndefinido.setBounds(645, 321, 89, 35);
		panel.add(btnPracticarIndefinido);
		
		JButton btnEjemploIndefinido = new JButton("Ejemplo");
		btnEjemploIndefinido.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEjemploIndefinido.setBounds(527, 321, 89, 35);
		panel.add(btnEjemploIndefinido);
		
		
		
	}
}
