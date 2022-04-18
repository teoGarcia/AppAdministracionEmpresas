package CuartoMedio.LegislacionLaboral.Finiquitos.Vista;

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

import CuartoMedio.LegislacionLaboral.Finiquitos.Controlador.ControlVistaFiniquito;

import java.awt.Color;
import javax.swing.ImageIcon;

public class VistaFiniquito extends JFrame {

	private JPanel contentPane;
	private ControlVistaFiniquito cvf;
	private JButton btnPracticar;
	private JButton btnEjemplo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaFiniquito frame = new VistaFiniquito();
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
	public VistaFiniquito() {
		
		cvf = new ControlVistaFiniquito(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Finiquito de Contrato");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 42, 784, 30);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 181, 764, 418);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Finiquito", null, panel, null);
		tabbedPane.setFont(new Font("Dialog", Font.BOLD, 14));
		panel.setLayout(null);
		
		JEditorPane editorPaneFiniquito = new JEditorPane();
		editorPaneFiniquito.setFont(new Font("Dialog", Font.PLAIN, 14));
		editorPaneFiniquito.setText("Es un acto por el cual un trabajador y un empleador ratifican o aprueban ante un Ministro de Fe el  t\u00E9rmino  de\r\nla relaci\u00F3n laboral y su acuerdo con lo estipulado en un documento escrito denominado finiquito.\r\n\r\nSi alguna de las partes tuviese dudas sobre alg\u00FAn o  algunos  aspectos  del  documento ( finiquito),  las  partes\r\npueden solicitar ratificar el finiquito ante un ministro de fe de la Inspecci\u00F3n del Trabajo respectiva.");
		editorPaneFiniquito.setBounds(23, 35, 711, 231);
		panel.add(editorPaneFiniquito);
		
		btnEjemplo = new JButton("Ejemplo");
		btnEjemplo.setFont(new Font("Dialog", Font.BOLD, 12));
		btnEjemplo.setBounds(527, 321, 89, 35);
		btnEjemplo.addActionListener(cvf);
		panel.add(btnEjemplo);
		
		btnPracticar = new JButton("Practicar");
		btnPracticar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnPracticar.setBounds(645, 321, 89, 35);
		btnPracticar.addActionListener(cvf);
		panel.add(btnPracticar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(VistaFiniquito.class.getResource("/Imagenes/Icons/atras.png")));
		btnNewButton.setBounds(728, 679, 46, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VistaFiniquito.class.getResource("/Imagenes/ImagenesFondo/fondo-gris.jpg")));
		lblNewLabel_1.setBounds(0, 0, 784, 729);
		contentPane.add(lblNewLabel_1);
		
		
	
	}

	public JButton getBtnPracticar() {
		return btnPracticar;
	}

	public void setBtnPracticar(JButton btnPracticar) {
		this.btnPracticar = btnPracticar;
	}

	public JButton getBtnEjemplo() {
		return btnEjemplo;
	}

	public void setBtnEjemplo(JButton btnEjemplo) {
		this.btnEjemplo = btnEjemplo;
	}
}
