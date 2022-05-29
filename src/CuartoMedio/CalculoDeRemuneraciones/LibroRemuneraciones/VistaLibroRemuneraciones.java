package CuartoMedio.CalculoDeRemuneraciones.LibroRemuneraciones;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VistaLibroRemuneraciones extends JPanel {
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
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTable table;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public VistaLibroRemuneraciones() {
		
		setOpaque(false);
		setBounds(0, 0, 748, 722);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1120));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Libro de Remuneraciones");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 36, 748, 37);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Remuneracion imponible");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(21, 133, 166, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Remuneracion no imponible");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(21, 214, 198, 25);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nombre del trabajador");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(21, 97, 155, 25);
		panel.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setBounds(169, 100, 303, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Rut");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(516, 97, 56, 25);
		panel.add(lblNewLabel_1_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(566, 100, 172, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Sueldo Base");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(21, 174, 79, 25);
		panel.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Horas Extras");
		lblNewLabel_1_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1.setBounds(207, 174, 79, 25);
		panel.add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Gratificaci\u00F3n");
		lblNewLabel_1_2_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_2.setBounds(382, 174, 79, 25);
		panel.add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_1_2_2_3 = new JLabel("Otros Ingresos");
		lblNewLabel_1_2_2_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_3.setBounds(563, 174, 90, 25);
		panel.add(lblNewLabel_1_2_2_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(648, 177, 90, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(97, 177, 100, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(285, 177, 90, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(463, 177, 90, 20);
		panel.add(textField_5);
		
		JLabel lblNewLabel_1_2_2_4 = new JLabel("Movilizacion");
		lblNewLabel_1_2_2_4.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_4.setBounds(21, 251, 79, 25);
		panel.add(lblNewLabel_1_2_2_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(97, 254, 100, 20);
		panel.add(textField_6);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Colacion");
		lblNewLabel_1_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1.setBounds(207, 251, 79, 25);
		panel.add(lblNewLabel_1_2_2_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(285, 254, 90, 20);
		panel.add(textField_7);
		
		JLabel lblNewLabel_1_2_2_2_1 = new JLabel("Gastos de Rep");
		lblNewLabel_1_2_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_2_1.setBounds(382, 251, 79, 25);
		panel.add(lblNewLabel_1_2_2_2_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(463, 254, 90, 20);
		panel.add(textField_8);
		
		JLabel lblNewLabel_1_2_2_3_1 = new JLabel("Asig. Familiar");
		lblNewLabel_1_2_2_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_3_1.setBounds(563, 251, 90, 25);
		panel.add(lblNewLabel_1_2_2_3_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(648, 254, 90, 20);
		panel.add(textField_9);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Descuentos");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(21, 287, 100, 25);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_2_4_1 = new JLabel("AFP");
		lblNewLabel_1_2_2_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_4_1.setBounds(21, 323, 79, 25);
		panel.add(lblNewLabel_1_2_2_4_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(97, 326, 100, 20);
		panel.add(textField_10);
		
		JLabel lblNewLabel_1_2_2_1_1_1 = new JLabel("Salud");
		lblNewLabel_1_2_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1_1.setBounds(207, 323, 79, 25);
		panel.add(lblNewLabel_1_2_2_1_1_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(285, 326, 90, 20);
		panel.add(textField_11);
		
		JLabel lblNewLabel_1_2_2_2_1_1 = new JLabel("Dif. Isapre");
		lblNewLabel_1_2_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_2_1_1.setBounds(382, 323, 79, 25);
		panel.add(lblNewLabel_1_2_2_2_1_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(463, 326, 90, 20);
		panel.add(textField_12);
		
		JLabel lblNewLabel_1_2_2_3_1_1 = new JLabel("Seguro de Ces.");
		lblNewLabel_1_2_2_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_3_1_1.setBounds(563, 323, 90, 25);
		panel.add(lblNewLabel_1_2_2_3_1_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(648, 326, 90, 20);
		panel.add(textField_13);
		
		JLabel lblNewLabel_1_2_2_4_2 = new JLabel("Movilizacion");
		lblNewLabel_1_2_2_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_4_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_4_2.setBounds(21, 359, 79, 25);
		panel.add(lblNewLabel_1_2_2_4_2);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(97, 362, 100, 20);
		panel.add(textField_14);
		
		JLabel lblNewLabel_1_2_2_1_1_2 = new JLabel("Colacion");
		lblNewLabel_1_2_2_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1_2.setBounds(207, 359, 79, 25);
		panel.add(lblNewLabel_1_2_2_1_1_2);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(285, 362, 90, 20);
		panel.add(textField_15);
		
		JLabel lblNewLabel_1_2_2_2_1_2 = new JLabel("Gastos de Rep");
		lblNewLabel_1_2_2_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_2_1_2.setBounds(382, 359, 79, 25);
		panel.add(lblNewLabel_1_2_2_2_1_2);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(463, 362, 90, 20);
		panel.add(textField_16);
		
		JLabel lblNewLabel_1_2_2_3_1_2 = new JLabel("Asig. Familiar");
		lblNewLabel_1_2_2_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_3_1_2.setBounds(563, 359, 90, 25);
		panel.add(lblNewLabel_1_2_2_3_1_2);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(648, 362, 90, 20);
		panel.add(textField_17);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Aporte Patronal");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(0, 800, 138, 25);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Remuneracion imponible");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(0, 425, 748, 25);
		panel.add(lblNewLabel_1_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(21, 461, 717, 101);
		panel.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre ", "Sueldo Base", "Horas Extras", "Gratificacion", "Otros Ingresos", "Total Imponible"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(155);
		scrollPane_1.setViewportView(table);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setBounds(21, 395, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Remuneracion no imponible");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(0, 599, 748, 25);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("TOTALES");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(21, 563, 166, 20);
		panel.add(lblNewLabel_1_4);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(210, 566, 90, 20);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(320, 566, 90, 20);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(427, 566, 90, 20);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(537, 566, 90, 20);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(645, 566, 90, 20);
		panel.add(textField_22);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(21, 633, 717, 101);
		panel.add(scrollPane_1_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Movilizacion", "Colacion", "Gasto de Rep.", "Asig. Familiar", "Total no Imp."
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(155);
		scrollPane_1_1.setViewportView(table_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("TOTALES");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4_1.setBounds(21, 735, 166, 20);
		panel.add(lblNewLabel_1_4_1);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(210, 738, 90, 20);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(320, 738, 90, 20);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(427, 738, 90, 20);
		panel.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(537, 738, 90, 20);
		panel.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(645, 738, 90, 20);
		panel.add(textField_27);

	}
}
