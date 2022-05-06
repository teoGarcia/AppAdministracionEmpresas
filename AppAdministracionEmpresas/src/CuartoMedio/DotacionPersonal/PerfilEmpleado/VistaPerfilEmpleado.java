package CuartoMedio.DotacionPersonal.PerfilEmpleado;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class VistaPerfilEmpleado extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_2;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public VistaPerfilEmpleado() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Perfil del empleado");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 11, 774, 39);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sede");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(31, 86, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nivel");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(31, 116, 46, 14);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Denominaci\u00F3n del empleo");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(368, 119, 176, 14);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("C\u00F3digo");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(31, 146, 46, 14);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Grado");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(368, 150, 46, 14);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Dependencia");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_5.setBounds(31, 176, 154, 14);
		add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Cargo del Jefe Inmediato");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1.setBounds(368, 181, 176, 14);
		add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Dedicaci\u00F3n");
		lblNewLabel_1_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_2.setBounds(31, 206, 92, 14);
		add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("Clase de cargo");
		lblNewLabel_1_4_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_2_1.setBounds(368, 212, 92, 14);
		add(lblNewLabel_1_4_2_1);
		
		JLabel lblNewLabel_1_4_2_2 = new JLabel("Grupo Ocasional");
		lblNewLabel_1_4_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_2_2.setBounds(31, 236, 105, 14);
		add(lblNewLabel_1_4_2_2);
		
		textField = new JTextField();
		textField.setBounds(148, 86, 599, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 116, 210, 20);
		add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(148, 146, 210, 20);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(148, 176, 210, 20);
		add(textField_4);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(148, 206, 210, 20);
		add(textField_7);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(148, 236, 599, 20);
		add(textField_9);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(527, 116, 220, 20);
		add(textField_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(527, 146, 220, 20);
		add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(527, 176, 220, 20);
		add(textField_11);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(527, 206, 220, 20);
		add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("I. Identificaci\u00F3n del cargo");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(31, 55, 269, 20);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("II. Prop\u00F3sito principal");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(31, 267, 269, 20);
		add(lblNewLabel_2_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(31, 294, 716, 40);
		add(editorPane);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("III. Funciones Esenciales");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(31, 340, 269, 20);
		add(lblNewLabel_2_1_1);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(31, 367, 716, 40);
		add(editorPane_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("IV. Criterios de desempe\u00F1o");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2.setBounds(31, 415, 269, 20);
		add(lblNewLabel_2_1_2);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBounds(31, 442, 716, 40);
		add(editorPane_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("V. Conocimientos Basicos o Esenciales");
		lblNewLabel_2_1_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3.setBounds(31, 490, 269, 20);
		add(lblNewLabel_2_1_3);
		
		JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setBounds(31, 517, 716, 40);
		add(editorPane_3);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("VI. Competencias");
		lblNewLabel_2_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3_1.setBounds(31, 567, 269, 20);
		add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Organizacionales");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(43, 592, 349, 14);
		add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Individuales: Nivel-Area");
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBounds(398, 593, 349, 14);
		add(lblNewLabel_1_2_1_1);
		
		JEditorPane editorPane_4 = new JEditorPane();
		editorPane_4.setBounds(31, 617, 349, 39);
		add(editorPane_4);
		
		JEditorPane editorPane_4_1 = new JEditorPane();
		editorPane_4_1.setBounds(398, 617, 349, 39);
		add(editorPane_4_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(VistaPerfilEmpleado.class.getResource("/Imagenes/Icons/atras.png")));
		btnNewButton.setBounds(690, 665, 57, 46);
		add(btnNewButton);

	}
}
