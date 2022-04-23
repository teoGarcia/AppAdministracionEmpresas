package CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import com.toedter.calendar.JDateChooser;

public class VistaAplicacionPresupuesto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_5;
	private JTextField textField_8;
	private JTextField textField_7;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaAplicacionPresupuesto frame = new VistaAplicacionPresupuesto();
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
	public VistaAplicacionPresupuesto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aplicaci\u00F3n de puestos de Trabajo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 11, 784, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Puesto");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 68, 105, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Categor\u00EDa");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(270, 68, 81, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Depto. o Grupo");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(526, 68, 88, 22);
		contentPane.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBounds(125, 68, 135, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(381, 68, 135, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(639, 68, 135, 22);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("C\u00F3d. del Puesto");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 101, 109, 22);
		contentPane.add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(125, 101, 135, 22);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2_2 = new JLabel("Ubicaci\u00F3n");
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(270, 101, 81, 22);
		contentPane.add(lblNewLabel_2_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(381, 101, 135, 22);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Necesario Viajar");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(526, 101, 88, 22);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Rango de Salario");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 139, 126, 22);
		contentPane.add(lblNewLabel_3);
		
		textField_6 = new JTextField();
		textField_6.setBounds(125, 140, 135, 21);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		comboBox.setBounds(639, 101, 58, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tipo de Posicion");
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(270, 139, 109, 22);
		contentPane.add(lblNewLabel_3_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Tiempo Completo", "Tiempo Parcial", "Compartido", "Contrato", "En pr\u00E1ctica"}));
		comboBox_1.setBounds(381, 139, 135, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Contacto RRHH");
		lblNewLabel_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setBounds(526, 139, 109, 22);
		contentPane.add(lblNewLabel_3_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(639, 140, 135, 21);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_2 = new JLabel("Fecha Publicacion");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 172, 126, 22);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Formaci\u00F3n de Sol.");
		lblNewLabel_2_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(270, 172, 145, 22);
		contentPane.add(lblNewLabel_2_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(381, 172, 135, 22);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Expiracion Public.");
		lblNewLabel_2_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_1_2.setBounds(526, 172, 118, 22);
		contentPane.add(lblNewLabel_2_1_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(125, 174, 135, 20);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(639, 174, 135, 20);
		contentPane.add(dateChooser_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("URL Publicacion ext.");
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(10, 205, 135, 22);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("URL Publicaci\u00F3n int.");
		lblNewLabel_1_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(391, 205, 145, 22);
		contentPane.add(lblNewLabel_1_2_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(135, 205, 250, 22);
		contentPane.add(textField_7);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(526, 205, 250, 22);
		contentPane.add(textField_9);
	}
}
