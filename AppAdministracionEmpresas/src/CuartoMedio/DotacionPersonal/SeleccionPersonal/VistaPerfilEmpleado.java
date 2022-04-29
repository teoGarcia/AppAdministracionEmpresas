package CuartoMedio.DotacionPersonal.SeleccionPersonal;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VistaPerfilEmpleado extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Create the panel.
	 */
	public VistaPerfilEmpleado() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccion de Personal");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 21, 774, 30);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 146, 96, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido Paterno");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(263, 148, 96, 14);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Apellido Materno");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(526, 146, 96, 14);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Curp");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 183, 96, 14);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Nro. IMSS");
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(263, 185, 96, 14);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Domicilio");
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(526, 183, 96, 14);
		add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Caso de accidente llamar");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 221, 157, 23);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Estado Civil");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(263, 225, 81, 19);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sexo");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(526, 223, 61, 19);
		add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(89, 142, 157, 23);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(89, 180, 157, 23);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(154, 219, 93, 23);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(359, 142, 157, 23);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(359, 179, 157, 23);
		add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Soltero", "Casado", "Divorciado"}));
		comboBox.setBounds(361, 220, 157, 23);
		add(comboBox);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(617, 143, 147, 23);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(617, 180, 147, 23);
		add(textField_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		comboBox_1.setBounds(617, 221, 147, 23);
		add(comboBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("Datos Generales");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 108, 168, 23);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Datos Academicos");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1.setBounds(10, 277, 168, 23);
		add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_1_5 = new JLabel("Instituci\u00F3n");
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_5.setBounds(10, 315, 96, 18);
		add(lblNewLabel_1_5);
		
		textField_7 = new JTextField();
		textField_7.setBounds(89, 310, 270, 23);
		add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Carrera");
		lblNewLabel_1_5_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_5_1.setBounds(369, 315, 96, 18);
		add(lblNewLabel_1_5_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(425, 310, 213, 23);
		add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("A\u00F1o");
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(648, 313, 61, 19);
		add(lblNewLabel_4_1);
		
		textField_9 = new JTextField();
		textField_9.setBounds(678, 310, 86, 23);
		add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Idiomas");
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1_1.setBounds(10, 356, 168, 23);
		add(lblNewLabel_5_1_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Ingl\u00E9s", "Portugues", "Frances", "Italiano", "Chino", "Japones"}));
		comboBox_2.setBounds(10, 390, 221, 23);
		add(comboBox_2);
		
		JLabel lblNewLabel_6 = new JLabel("Nivel");
		lblNewLabel_6.setBounds(263, 390, 61, 23);
		add(lblNewLabel_6);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Basico", "Medio", "Avanzado"}));
		comboBox_3.setBounds(348, 390, 188, 23);
		add(comboBox_3);

	}
}
