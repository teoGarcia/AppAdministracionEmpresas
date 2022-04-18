package CuartoMedio.LegislacionLaboral.Finiquitos.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CuartoMedio.LegislacionLaboral.Finiquitos.Controlador.ControlFiniquito;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Finiquito extends JFrame {

	private JPanel contentPane;
	private ControlFiniquito cf;
	private JButton btnFlechaIzquierda;
	private JButton btnFlechaDerecha;

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
		
		cf = new ControlFiniquito(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnFlechaDerecha = new JButton("");
		btnFlechaDerecha.setBackground(Color.WHITE);
		btnFlechaDerecha.setBorder(null);
		btnFlechaDerecha.setIcon(new ImageIcon(Finiquito.class.getResource("/Imagenes/Icons/flecha-derecha.png")));
		btnFlechaDerecha.setBounds(525, 688, 59, 53);
		btnFlechaDerecha.addActionListener(cf);
		contentPane.add(btnFlechaDerecha);
		
		btnFlechaIzquierda = new JButton("");
		btnFlechaIzquierda.setBackground(Color.WHITE);
		btnFlechaIzquierda.setBorder(null);
		btnFlechaIzquierda.setIcon(new ImageIcon(Finiquito.class.getResource("/Imagenes/Icons/flecha-izquierda.png")));
		btnFlechaIzquierda.setBounds(0, 688, 65, 53);
		btnFlechaIzquierda.addActionListener(cf);
		contentPane.add(btnFlechaIzquierda);
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(Finiquito.class.getResource("/Imagenes/ImagenesLegislacionLaboral/MODELO DE FINIQUITO DE CONTRATO_00001.jpg")));
		lblImagen.setBounds(0, 0, 584, 741);
		contentPane.add(lblImagen);
	}

	public JButton getBtnFlechaIzquierda() {
		return btnFlechaIzquierda;
	}

	public void setBtnFlechaIzquierda(JButton btnFlechaIzquierda) {
		this.btnFlechaIzquierda = btnFlechaIzquierda;
	}

	public JButton getBtnFlechaDerecha() {
		return btnFlechaDerecha;
	}

	public void setBtnFlechaDerecha(JButton btnFlechaDerecha) {
		this.btnFlechaDerecha = btnFlechaDerecha;
	}
}
