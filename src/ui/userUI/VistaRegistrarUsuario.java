package ui.userUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import ui.Labels.LabelTitulos;
import java.awt.Color;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import ui.Buttons.StandarButton;
import javax.swing.JTextField;

public class VistaRegistrarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaRegistrarUsuario frame = new VistaRegistrarUsuario();
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
	public VistaRegistrarUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(54, 54, 54));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		LabelTitulos lbltlsRegistrarUsuario = new LabelTitulos((String) null);
		lbltlsRegistrarUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsRegistrarUsuario.setText("Registrar Usuario");
		lbltlsRegistrarUsuario.setBounds(0, 33, 384, 30);
		contentPane.add(lbltlsRegistrarUsuario);
		
		LabelSubtitulos lblsbtlsNombres = new LabelSubtitulos((String) null);
		lblsbtlsNombres.setText("Nombres");
		lblsbtlsNombres.setBounds(29, 120, 102, 23);
		contentPane.add(lblsbtlsNombres);
		
		LabelSubtitulos lblsbtlsApellidos = new LabelSubtitulos((String) null);
		lblsbtlsApellidos.setText("Apellidos");
		lblsbtlsApellidos.setBounds(29, 175, 102, 24);
		contentPane.add(lblsbtlsApellidos);
		
		LabelSubtitulos lblsbtlsSeccion = new LabelSubtitulos((String) null);
		lblsbtlsSeccion.setText("Seccion");
		lblsbtlsSeccion.setBounds(29, 230, 102, 24);
		contentPane.add(lblsbtlsSeccion);
		
		StandarButton stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(144, 308, 102, 30);
		contentPane.add(stndrbtnGuardar);
		
		textField = new JTextField();
		textField.setBounds(141, 121, 233, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 178, 233, 23);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 233, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
