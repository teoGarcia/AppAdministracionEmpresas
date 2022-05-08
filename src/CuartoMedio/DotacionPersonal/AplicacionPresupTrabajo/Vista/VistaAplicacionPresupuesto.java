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
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

public class VistaAplicacionPresupuesto extends JPanel {

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
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;


	/**
	 * Create the frame.
	 */
	public VistaAplicacionPresupuesto() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		//setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Aplicaci\u00F3n de puestos de Trabajo");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 11, 784, 36);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Puesto");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 68, 105, 22);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Categor\u00EDa");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(270, 68, 81, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Depto. o Grupo");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(526, 68, 88, 22);
		add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBounds(125, 68, 135, 22);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(381, 68, 135, 22);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(639, 68, 121, 22);
		add(textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("C\u00F3d. del Puesto");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 101, 109, 22);
		add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(125, 101, 135, 22);
		add(textField_3);
		
		JLabel lblNewLabel_2_2 = new JLabel("Ubicaci\u00F3n");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(270, 101, 81, 22);
		add(lblNewLabel_2_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(381, 101, 135, 22);
		add(textField_4);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Necesario Viajar");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(526, 101, 109, 22);
		add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Rango de Salario");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 139, 126, 22);
		add(lblNewLabel_3);
		
		textField_6 = new JTextField();
		textField_6.setBounds(125, 140, 135, 21);
		add(textField_6);
		textField_6.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		comboBox.setBounds(639, 101, 58, 22);
		add(comboBox);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tipo de Posicion");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(270, 139, 109, 22);
		add(lblNewLabel_3_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Tiempo Completo", "Tiempo Parcial", "Compartido", "Contrato", "En pr\u00E1ctica"}));
		comboBox_1.setBounds(381, 139, 135, 22);
		add(comboBox_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Contacto RRHH");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setBounds(526, 139, 109, 22);
		add(lblNewLabel_3_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(639, 140, 121, 21);
		add(textField_5);
		
		JLabel lblNewLabel_1_2 = new JLabel("Fecha Publicacion");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 172, 126, 22);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Formaci\u00F3n de Sol.");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(270, 172, 145, 22);
		add(lblNewLabel_2_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(381, 172, 135, 22);
		add(textField_8);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Expiracion Public.");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_1_2.setBounds(526, 172, 118, 22);
		add(lblNewLabel_2_1_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(125, 174, 135, 20);
		add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(639, 174, 121, 20);
		add(dateChooser_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("URL Publicacion ext.");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(10, 205, 135, 22);
		add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("URL Publicaci\u00F3n int.");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(391, 205, 145, 22);
		add(lblNewLabel_1_2_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(125, 205, 260, 22);
		add(textField_7);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(526, 205, 234, 22);
		add(textField_9);
		
		JLabel lblNewLabel_4 = new JLabel("Solicitudes aceptadas por:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 238, 197, 22);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre de la Empresa");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 264, 183, 22);
		add(lblNewLabel_5);
		
		textField_10 = new JTextField();
		textField_10.setBounds(155, 265, 224, 22);
		add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Descripci\u00F3n del Puesto:");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 325, 183, 22);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Rol y responsabilidades");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 356, 271, 22);
		add(lblNewLabel_7);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPane.setBounds(10, 382, 750, 54);
		add(editorPane);
		
		JLabel lblNewLabel_8 = new JLabel("Requisitos de Cualificaci\u00F3n y Formaci\u00F3n");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(10, 445, 250, 21);
		add(lblNewLabel_8);
		
		textField_11 = new JTextField();
		textField_11.setBounds(245, 447, 515, 22);
		add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Aptitudes deseables");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(10, 477, 250, 22);
		add(lblNewLabel_9);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(245, 478, 515, 22);
		add(textField_12);
		
		JLabel lblNewLabel_9_1 = new JLabel("Notas Adicionales");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_9_1.setBounds(10, 510, 250, 22);
		add(lblNewLabel_9_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(245, 511, 515, 22);
		add(textField_13);
		
		JLabel lblNewLabel_10 = new JLabel("Revisado Por");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(10, 568, 183, 22);
		add(lblNewLabel_10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(165, 568, 271, 21);
		add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Fecha Revisado");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(471, 569, 105, 21);
		add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Aprobado Por");
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(10, 600, 126, 22);
		add(lblNewLabel_12);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(600, 568, 160, 20);
		add(dateChooser_2);
		
		JLabel lblNewLabel_10_1 = new JLabel("Ultima Actualizaci\u00F3n por");
		lblNewLabel_10_1.setForeground(Color.WHITE);
		lblNewLabel_10_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_10_1.setBounds(10, 633, 183, 22);
		add(lblNewLabel_10_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(165, 601, 271, 21);
		add(textField_15);
		
		JLabel lblNewLabel_11_1 = new JLabel("Fecha Aprobado");
		lblNewLabel_11_1.setForeground(Color.WHITE);
		lblNewLabel_11_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_11_1.setBounds(471, 601, 105, 21);
		add(lblNewLabel_11_1);
		
		JDateChooser dateChooser_2_1 = new JDateChooser();
		dateChooser_2_1.setBounds(600, 600, 160, 20);
		add(dateChooser_2_1);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(165, 634, 271, 21);
		add(textField_16);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("Fecha y Hora");
		lblNewLabel_11_1_1.setForeground(Color.WHITE);
		lblNewLabel_11_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_11_1_1.setBounds(471, 634, 105, 21);
		add(lblNewLabel_11_1_1);
		
		JDateChooser dateChooser_2_1_1 = new JDateChooser();
		dateChooser_2_1_1.setBounds(600, 633, 160, 20);
		add(dateChooser_2_1_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Direcci\u00F3n");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(411, 264, 95, 22);
		add(lblNewLabel_5_1);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(496, 265, 264, 22);
		add(textField_17);
		
		JLabel lblNewLabel_5_2 = new JLabel("Fax o Correo Electr\u00F3nico");
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_5_2.setBounds(10, 297, 183, 22);
		add(lblNewLabel_5_2);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(155, 298, 224, 22);
		add(textField_18);
		
		JLabel lblNewLabel_5_3 = new JLabel("C\u00F3digo Postal");
		lblNewLabel_5_3.setForeground(Color.WHITE);
		lblNewLabel_5_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_5_3.setBounds(411, 297, 105, 22);
		add(lblNewLabel_5_3);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(496, 298, 264, 22);
		add(textField_19);
		
		JLabel lblNewLabel_13 = new JLabel("______________________________________________________________________________________");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_13.setBounds(0, 535, 774, 22);
		add(lblNewLabel_13);
		
	}
}
