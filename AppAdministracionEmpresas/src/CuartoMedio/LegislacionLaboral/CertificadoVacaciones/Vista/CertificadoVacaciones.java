package CuartoMedio.LegislacionLaboral.CertificadoVacaciones.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class CertificadoVacaciones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CertificadoVacaciones frame = new CertificadoVacaciones();
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
	public CertificadoVacaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblFlechaDerecha = new JLabel("New label");
		lblFlechaDerecha.setBounds(492, 693, 68, 37);
		contentPane.add(lblFlechaDerecha);
		
		JLabel lblFlechaIzquierda = new JLabel("New label");
		lblFlechaIzquierda.setBounds(27, 677, 75, 53);
		contentPane.add(lblFlechaIzquierda);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CertificadoVacaciones.class.getResource("/Imagenes/SOLICITUD DE PERMISO POR VACACIONES.jpg")));
		lblNewLabel.setBounds(0, 0, 584, 741);
		contentPane.add(lblNewLabel);
		
	}

}
