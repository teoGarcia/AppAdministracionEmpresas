package CuartoMedio.LegislacionLaboral.Finiquitos.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Finiquito extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finiquito frame = new Finiquito();
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
	public Finiquito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFlechaDerecha = new JButton("");
		btnFlechaDerecha.setBackground(Color.WHITE);
		btnFlechaDerecha.setBorder(null);
		btnFlechaDerecha.setIcon(new ImageIcon(Finiquito.class.getResource("/Imagenes/Icons/flecha-derecha.png")));
		btnFlechaDerecha.setBounds(525, 688, 59, 53);
		contentPane.add(btnFlechaDerecha);
		
		JButton btnFlechaIzquierda = new JButton("");
		btnFlechaIzquierda.setBackground(Color.WHITE);
		btnFlechaIzquierda.setBorder(null);
		btnFlechaIzquierda.setIcon(new ImageIcon(Finiquito.class.getResource("/Imagenes/Icons/flecha-izquierda.png")));
		btnFlechaIzquierda.setBounds(0, 688, 65, 53);
		contentPane.add(btnFlechaIzquierda);
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(Finiquito.class.getResource("/Imagenes/ImagenesLegislacionLaboral/MODELO DE FINIQUITO DE CONTRATO_00001.jpg")));
		lblImagen.setBounds(0, 0, 584, 741);
		contentPane.add(lblImagen);
	}
}
