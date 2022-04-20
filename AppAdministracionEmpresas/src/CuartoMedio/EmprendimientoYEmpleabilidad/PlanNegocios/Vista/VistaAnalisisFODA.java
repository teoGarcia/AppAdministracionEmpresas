package CuartoMedio.EmprendimientoYEmpleabilidad.PlanNegocios.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class VistaAnalisisFODA extends JFrame {

	private JPanel contentPane;
	private JButton btnPlantilla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaAnalisisFODA frame = new VistaAnalisisFODA();
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
	public VistaAnalisisFODA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Analisis FODA o DAFO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 35, 784, 50);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 181, 764, 418);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Definicion", null, panel, null);
		tabbedPane.setFont(new Font("Dialog", Font.BOLD, 14));
		panel.setLayout(null);
		
		JEditorPane editorPaneFiniquito = new JEditorPane();
		editorPaneFiniquito.setFont(new Font("Dialog", Font.PLAIN, 14));
		editorPaneFiniquito.setText("El an\u00E1lisis FODA (Fortalezas, Oportunidades, Debilidades, Amenazas), tambi\u00E9n conocido como an\u00E1lisis DAFO, \r\nes una herramienta de estudio de la situaci\u00F3n de una empresa, instituci\u00F3n, proyecto o persona, analizando sus\r\ncaracter\u00EDsticas internas (Debilidades y Fortalezas) y su situaci\u00F3n externa (Amenazas y Oportunidades)  en  una\r\nmatriz cuadrada.");
		editorPaneFiniquito.setBounds(23, 35, 711, 231);
		panel.add(editorPaneFiniquito);
		
		btnPlantilla = new JButton("Plantilla");
		btnPlantilla.setBounds(645, 309, 89, 29);
		panel.add(btnPlantilla);

		
	}

	public JButton getBtnPlantilla() {
		return btnPlantilla;
	}

	public void setBtnPlantilla(JButton btnPlantilla) {
		this.btnPlantilla = btnPlantilla;
	}
}
