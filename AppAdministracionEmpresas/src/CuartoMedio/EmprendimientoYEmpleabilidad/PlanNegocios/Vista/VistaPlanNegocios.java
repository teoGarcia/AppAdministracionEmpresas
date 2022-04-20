package CuartoMedio.EmprendimientoYEmpleabilidad.PlanNegocios.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CuartoMedio.EmprendimientoYEmpleabilidad.PlanNegocios.Controlador.ControladorVistaPlanNegocios;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;

public class VistaPlanNegocios extends JFrame {

	private JPanel contentPane;
	private JButton btnPlantilla;
	private ControladorVistaPlanNegocios cvpn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPlanNegocios frame = new VistaPlanNegocios();
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
	public VistaPlanNegocios() {
		
		cvpn = new ControladorVistaPlanNegocios(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Plan de Negocios");
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
		editorPaneFiniquito.setText("El  plan  de  negocios  es  una  descripci\u00F3n  detallada  del  negocio  que  se quiere emprender,  es un proyecto\r\ndin\u00E1mico  en  el  que   se  describe  c\u00F3mo  se  va  a  operar  y  desarrollar  dicho  negocio durante  un  per\u00EDodo\r\ndeterminado.");
		editorPaneFiniquito.setBounds(23, 35, 711, 231);
		panel.add(editorPaneFiniquito);
		
		btnPlantilla = new JButton("Planilla");
		btnPlantilla.setBounds(645, 304, 89, 29);
		btnPlantilla.addActionListener(cvpn);
		panel.add(btnPlantilla);
		
		
	}

	public JButton getBtnPlantilla() {
		return btnPlantilla;
	}

	public void setBtnPlantilla(JButton btnPlantilla) {
		this.btnPlantilla = btnPlantilla;
	}
}
