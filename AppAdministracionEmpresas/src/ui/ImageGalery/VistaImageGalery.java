package ui.ImageGalery;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CuartoMedio.LegislacionLaboral.Contratos.Controlador.ControladorContratoIndefinido;
import Helpers.ImageUrls;
import java.awt.BorderLayout;

public class VistaImageGalery extends JFrame {

	private JPanel contentPane;
	private ContoladorImageGalery cig;
	private JButton btnFlechaDerecha;
	private JButton btnFlechaIzquierda;
	private JLabel lblImagenes;
	private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();

	/**
	 * Create the frame.
	 */
	public VistaImageGalery(ArrayList<ImageIcon> images) {
		super();
		this.images = images;
		inicialize();
	}
	
	private void inicialize() {
		cig = new ContoladorImageGalery(this);

		addWindowListener(cig);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		btnFlechaIzquierda = new JButton("");
		btnFlechaIzquierda.setFocusPainted(false);
		btnFlechaIzquierda.setIcon(new ImageIcon(this.getClass().getResource(ImageUrls.icon + "flecha-izquierda.png")));
		btnFlechaIzquierda.setBorder(null);
		btnFlechaIzquierda.setBackground(Color.WHITE);
		btnFlechaIzquierda.addActionListener(cig);
		contentPane.add(btnFlechaIzquierda, BorderLayout.LINE_START);
		
		btnFlechaDerecha = new JButton("");
		btnFlechaDerecha.setFocusPainted(false);
		btnFlechaDerecha.setBorder(null);
		btnFlechaDerecha.setBackground(Color.WHITE);
		btnFlechaDerecha.setIcon(new ImageIcon(this.getClass().getResource(ImageUrls.icon + "flecha-derecha.png")));
		btnFlechaDerecha.addActionListener(cig);
		contentPane.add(btnFlechaDerecha, BorderLayout.LINE_END);
		
		lblImagenes = new JLabel("");
		lblImagenes.setIcon(images.get(0));
		contentPane.add(lblImagenes, BorderLayout.CENTER);
	}
	
	public void changeImage(int index){
		lblImagenes.setIcon(images.get(index));
	}

	public JButton getBtnFlechaDerecha() {
		return btnFlechaDerecha;
	}

	public JButton getBtnFlechaIzquierda() {
		return btnFlechaIzquierda;
	}

	public ArrayList<ImageIcon> getFotos() {
		return images;
	}

}
