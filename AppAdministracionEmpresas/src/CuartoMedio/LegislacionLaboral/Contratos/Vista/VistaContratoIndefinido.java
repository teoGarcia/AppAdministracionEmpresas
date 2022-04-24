package CuartoMedio.LegislacionLaboral.Contratos.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CuartoMedio.LegislacionLaboral.Contratos.Controlador.ControladorContratoIndefinido;
import Helpers.ImageUrls;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class VistaContratoIndefinido extends JFrame {

	private JPanel contentPane;
	private ControladorContratoIndefinido cci;
	private JButton btnFlechaDerecha;
	private JButton btnFlechaIzquierda;
	private JLabel lblImagenes;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaContratoIndefinido frame = new VistaContratoIndefinido();
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
	public VistaContratoIndefinido() {
		
		cci = new ControladorContratoIndefinido(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnFlechaIzquierda = new JButton("");
		btnFlechaIzquierda.setFocusPainted(false);
		btnFlechaIzquierda.setIcon(new ImageIcon(this.getClass().getResource(ImageUrls.icon + "flecha-izquierda.png")));
		btnFlechaIzquierda.setBorder(null);
		btnFlechaIzquierda.setBackground(Color.WHITE);
		btnFlechaIzquierda.setBounds(20, 690, 46, 40);
		btnFlechaIzquierda.addActionListener(cci);
		contentPane.add(btnFlechaIzquierda);
		
		btnFlechaDerecha = new JButton("");
		btnFlechaDerecha.setFocusPainted(false);
		btnFlechaDerecha.setBorder(null);
		btnFlechaDerecha.setBackground(Color.WHITE);
		btnFlechaDerecha.setIcon(new ImageIcon(this.getClass().getResource(ImageUrls.icon + "flecha-derecha.png")));
		btnFlechaDerecha.setBounds(520, 690, 46, 40);
		btnFlechaDerecha.addActionListener(cci);
		contentPane.add(btnFlechaDerecha);
		
		lblImagenes = new JLabel("");
		lblImagenes.setIcon(new ImageIcon(this.getClass().getResource(ImageUrls.legislacionLaboral + "MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1_00001.jpg")));
		lblImagenes.setBounds(0, 0, 584, 741);
		contentPane.add(lblImagenes);
		
	}

	public JButton getBtnFlechaDerecha() {
		return btnFlechaDerecha;
	}

	public void setBtnFlechaDerecha(JButton btnFlechaDerecha) {
		this.btnFlechaDerecha = btnFlechaDerecha;
	}

	public JButton getBtnFlechaIzquierda() {
		return btnFlechaIzquierda;
	}

	public void setBtnFlechaIzquierda(JButton btnFlechaIzquierda) {
		this.btnFlechaIzquierda = btnFlechaIzquierda;
	}

	public JLabel getLblImagenes() {
		return lblImagenes;
	}

	public void setLblImagenes(JLabel lblImagenes) {
		this.lblImagenes = lblImagenes;
	}
}
