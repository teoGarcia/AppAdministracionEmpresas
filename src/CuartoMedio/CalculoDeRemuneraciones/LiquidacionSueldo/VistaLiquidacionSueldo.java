package CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import javax.swing.JSeparator;
import java.awt.Color;

public class VistaLiquidacionSueldo extends JPanel {
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
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;

	/**
	 * Create the panel.
	 */
	public VistaLiquidacionSueldo() {
		
		setOpaque(false);
		setBounds(0, 0, 748, 722);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(748, 1000));
		
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Liquidaci\u00F3n de sueldo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 36, 748, 45);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de Empresa");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(20, 104, 153, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Rut");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(502, 104, 107, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nombre de Trabajador");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(20, 145, 136, 24);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Rut");
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(502, 145, 107, 24);
		panel.add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(183, 107, 296, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 146, 296, 24);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(551, 106, 189, 24);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(551, 145, 189, 24);
		panel.add(textField_3);
		
		JLabel lblNewLabel_2 = new JLabel("Detalles de la Remuneraci\u00F3n");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2.setBounds(20, 194, 215, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Pago de sueldo del mes de ");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(20, 229, 166, 24);
		panel.add(lblNewLabel_1_3);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.getComboBox().setFont(new Font("Dialog", Font.PLAIN, 12));
		monthChooser.setBounds(203, 228, 112, 25);
		panel.add(monthChooser);
		
		JLabel lblNewLabel_3 = new JLabel("de");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(335, 229, 26, 24);
		panel.add(lblNewLabel_3);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.getSpinner().setFont(new Font("Dialog", Font.PLAIN, 12));
		yearChooser.setBounds(373, 229, 72, 24);
		panel.add(yearChooser);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBounds(383, 274, 9, 239);
		panel.add(separator);
		
		JLabel lblNewLabel_2_1 = new JLabel("Remuneraci\u00F3n Imponible");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(110, 268, 166, 24);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Remuneraci\u00F3n no Imponible");
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(493, 268, 177, 24);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("Sueldo Base");
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(20, 314, 153, 24);
		panel.add(lblNewLabel_1_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(171, 314, 199, 24);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Horas Extraordinarias");
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1.setBounds(20, 349, 153, 24);
		panel.add(lblNewLabel_1_4_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(171, 349, 199, 24);
		panel.add(textField_5);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Bono de Gestion Mensual");
		lblNewLabel_1_4_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_2.setBounds(20, 384, 153, 24);
		panel.add(lblNewLabel_1_4_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(171, 384, 199, 24);
		panel.add(textField_6);
		
		JLabel lblNewLabel_1_4_3 = new JLabel("Participaci\u00F3n");
		lblNewLabel_1_4_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_3.setBounds(20, 419, 153, 24);
		panel.add(lblNewLabel_1_4_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(171, 419, 199, 24);
		panel.add(textField_7);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Comisiones");
		lblNewLabel_1_4_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1_1.setBounds(20, 454, 153, 24);
		panel.add(lblNewLabel_1_4_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(171, 454, 199, 24);
		panel.add(textField_8);
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("Gratificaci\u00F3n");
		lblNewLabel_1_4_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_2_1.setBounds(20, 489, 153, 24);
		panel.add(lblNewLabel_1_4_2_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(171, 489, 199, 24);
		panel.add(textField_9);
		
		JLabel lblNewLabel_1_4_4 = new JLabel("Sueldo Base");
		lblNewLabel_1_4_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_4.setBounds(400, 314, 153, 24);
		panel.add(lblNewLabel_1_4_4);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(551, 314, 189, 24);
		panel.add(textField_10);
		
		JLabel lblNewLabel_1_4_1_2 = new JLabel("Horas Extraordinarias");
		lblNewLabel_1_4_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1_2.setBounds(400, 349, 153, 24);
		panel.add(lblNewLabel_1_4_1_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(551, 349, 189, 24);
		panel.add(textField_11);
		
		JLabel lblNewLabel_1_4_2_2 = new JLabel("Bono de Gestion Mensual");
		lblNewLabel_1_4_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_2_2.setBounds(400, 384, 153, 24);
		panel.add(lblNewLabel_1_4_2_2);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(551, 384, 189, 24);
		panel.add(textField_12);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 575, 774, 10);
		panel.add(separator_1);
		
		JLabel lblNewLabel_1_4_2_1_1 = new JLabel("Total Haberes");
		lblNewLabel_1_4_2_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_2_1_1.setBounds(256, 540, 124, 24);
		panel.add(lblNewLabel_1_4_2_1_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(385, 540, 166, 24);
		panel.add(textField_13);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Descuentos Previsionales");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(110, 586, 166, 24);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_4_5 = new JLabel("AFP");
		lblNewLabel_1_4_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_5.setBounds(20, 621, 153, 24);
		panel.add(lblNewLabel_1_4_5);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(171, 621, 199, 24);
		panel.add(textField_14);
		
		JLabel lblNewLabel_1_4_1_3 = new JLabel("Seguro de Cesantia (0,6%)");
		lblNewLabel_1_4_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1_3.setBounds(20, 656, 153, 24);
		panel.add(lblNewLabel_1_4_1_3);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(171, 656, 199, 24);
		panel.add(textField_15);
		
		JLabel lblNewLabel_1_4_2_3 = new JLabel("Salud (7%)");
		lblNewLabel_1_4_2_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_2_3.setBounds(20, 691, 153, 24);
		panel.add(lblNewLabel_1_4_2_3);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(171, 691, 199, 24);
		panel.add(textField_16);
		
		JLabel lblNewLabel_1_4_3_1 = new JLabel("Diferencia de Isapre");
		lblNewLabel_1_4_3_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_3_1.setBounds(20, 726, 153, 24);
		panel.add(lblNewLabel_1_4_3_1);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(171, 726, 199, 24);
		panel.add(textField_17);
		
		JLabel lblNewLabel_1_4_1_1_1 = new JLabel("Impuesto Unico");
		lblNewLabel_1_4_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1_1_1.setBounds(20, 761, 153, 24);
		panel.add(lblNewLabel_1_4_1_1_1);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(171, 761, 199, 24);
		panel.add(textField_18);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(383, 581, 9, 239);
		panel.add(separator_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Otros descuentos");
		lblNewLabel_2_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2_2_1.setBounds(536, 586, 116, 24);
		panel.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_1_4_4_1 = new JLabel("Cuota Bienestar");
		lblNewLabel_1_4_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_4_1.setBounds(400, 621, 153, 24);
		panel.add(lblNewLabel_1_4_4_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(551, 621, 189, 24);
		panel.add(textField_19);
		
		JLabel lblNewLabel_1_4_1_2_1 = new JLabel("Cuota Ahorro Libreta");
		lblNewLabel_1_4_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1_2_1.setBounds(400, 656, 153, 24);
		panel.add(lblNewLabel_1_4_1_2_1);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(551, 656, 189, 24);
		panel.add(textField_20);
		
		JLabel lblNewLabel_1_4_2_2_1 = new JLabel("Cr\u00E9dito CCFA La Araucana");
		lblNewLabel_1_4_2_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_2_2_1.setBounds(400, 691, 153, 24);
		panel.add(lblNewLabel_1_4_2_2_1);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(551, 691, 189, 24);
		panel.add(textField_21);
		
		JLabel lblNewLabel_1_4_2_1_1_1 = new JLabel("Total Descuentos");
		lblNewLabel_1_4_2_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_2_1_1_1.setBounds(256, 846, 124, 24);
		panel.add(lblNewLabel_1_4_2_1_1_1);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(385, 847, 166, 24);
		panel.add(textField_22);

	}
}
