package CuartoMedio.LegislacionLaboral.Contratos.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CuartoMedio.LegislacionLaboral.Contratos.Controlador.ControladorContratoPlazoFijo;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
public class VistaContratoPlazoFijo extends JFrame {

	private JPanel contentPane;
	private ControladorContratoPlazoFijo ccpf;
	private JLabel lblImagenes;
	private JButton btnFlechaIzquierda;
	private JButton btnFlechaDerecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaContratoPlazoFijo frame = new VistaContratoPlazoFijo();
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
	public VistaContratoPlazoFijo() {
		
		ccpf = new ControladorContratoPlazoFijo(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnFlechaIzquierda = new JButton("");
		btnFlechaIzquierda.setFocusPainted(false);
		btnFlechaIzquierda.setIcon(new ImageIcon(VistaContratoIndefinido.class.getResource("/Imagenes/Icons/flecha-izquierda.png")));
		btnFlechaIzquierda.setBorder(null);
		btnFlechaIzquierda.setBackground(Color.WHITE);
		btnFlechaIzquierda.setBounds(20, 690, 46, 40);
		btnFlechaIzquierda.addActionListener(ccpf);
		contentPane.add(btnFlechaIzquierda);
		
		btnFlechaDerecha = new JButton("");
		btnFlechaDerecha.setFocusPainted(false);
		btnFlechaDerecha.setBorder(null);
		btnFlechaDerecha.setBackground(Color.WHITE);
		btnFlechaDerecha.setIcon(new ImageIcon(VistaContratoIndefinido.class.getResource("/Imagenes/Icons/flecha-derecha.png")));
		btnFlechaDerecha.setBounds(520, 690, 46, 40);
		btnFlechaDerecha.addActionListener(ccpf);
		contentPane.add(btnFlechaDerecha);
		
		lblImagenes = new JLabel("");
		lblImagenes.setIcon(new ImageIcon(VistaContratoPlazoFijo.class.getResource("/Imagenes/MODELO DE CONTRATO PLAZO FIJO_00001.jpg")));
		lblImagenes.setBounds(0, 0, 584, 741);
		contentPane.add(lblImagenes);
		
	}

	public JLabel getLblImagenes() {
		return lblImagenes;
	}

	public void setLblImagenes(JLabel lblImagenes) {
		this.lblImagenes = lblImagenes;
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
