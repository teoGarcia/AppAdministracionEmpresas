package CuartoMedio.GestionDeBodega.IngresosYEgresos;

import javax.swing.JPanel;
import ui.Labels.LabelTitulos;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dimension;

import ui.Texts.TextSoloNumeros;
import com.toedter.calendar.JDateChooser;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import com.toedter.calendar.JYearChooser;

public class VistaIngresosYEgresos extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table_1;
	private JTable table_2;
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
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;

	/**
	 * Create the panel.
	 */
	public VistaIngresosYEgresos() {
		
		setBounds(0, 0, 748, 723);
		setOpaque(false);
		setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setOpaque(false);
		scrollPane_1.setBounds(0, 0, 767, 722);
		add(scrollPane_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1000));
		panel.setLayout(null);
		scrollPane_1.setViewportView(panel);
		
		LabelTitulos lbltlsIngresosYEgresos = new LabelTitulos((String) null);
		lbltlsIngresosYEgresos.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsIngresosYEgresos.setText("Ingresos y Egresos");
		lbltlsIngresosYEgresos.setBounds(0, 60, 748, 30);
		panel.add(lbltlsIngresosYEgresos);
		
		LabelSubtitulos lblsbtlsIngresos = new LabelSubtitulos((String) null);
		lblsbtlsIngresos.setText("Ingresos");
		lblsbtlsIngresos.setBounds(163, 144, 82, 23);
		panel.add(lblsbtlsIngresos);
		
		LabelSubtitulos lblsbtlsEgresos = new LabelSubtitulos((String) null);
		lblsbtlsEgresos.setText("Egresos");
		lblsbtlsEgresos.setBounds(520, 144, 125, 23);
		panel.add(lblsbtlsEgresos);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos((String) null);
		lblsbtlsFecha.setText("Fecha");
		lblsbtlsFecha.setBounds(10, 202, 125, 23);
		panel.add(lblsbtlsFecha);
		
		LabelSubtitulos lblsbtlsDescripcion = new LabelSubtitulos((String) null);
		lblsbtlsDescripcion.setText("Descripcion");
		lblsbtlsDescripcion.setBounds(10, 236, 125, 23);
		panel.add(lblsbtlsDescripcion);
		
		LabelSubtitulos lblsbtlsMonto = new LabelSubtitulos((String) null);
		lblsbtlsMonto.setText("Monto");
		lblsbtlsMonto.setBounds(10, 270, 125, 23);
		panel.add(lblsbtlsMonto);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(372, 159, 8, 550);
		panel.add(separator);
		
		TextSoloNumeros textSoloNumeros = new TextSoloNumeros();
		textSoloNumeros.setBounds(114, 270, 160, 23);
		panel.add(textSoloNumeros);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(114, 202, 160, 23);
		panel.add(dateChooser);
		
		TextSoloNumeros textSoloNumeros_1 = new TextSoloNumeros();
		textSoloNumeros_1.setBounds(114, 236, 250, 23);
		panel.add(textSoloNumeros_1);
		
		StandarButton stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(143, 304, 102, 23);
		panel.add(stndrbtnGuardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(2, 333, 367, 294);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Descripcion", "Fecha", "Monto"
			}
		));
		scrollPane.setViewportView(table);
		
		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("TOTAL");
		lblsbtlsTotal.setBounds(205, 630, 70, 23);
		panel.add(lblsbtlsTotal);
		
		textField = new JTextField();
		textField.setBounds(253, 632, 109, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		StandarButton stndrbtnModificar = new StandarButton((String) null);
		stndrbtnModificar.setText("Modificar");
		stndrbtnModificar.setBounds(10, 662, 102, 30);
		panel.add(stndrbtnModificar);
		
		StandarButton stndrbtnEliminar = new StandarButton((String) null);
		stndrbtnEliminar.setText("Eliminar");
		stndrbtnEliminar.setBounds(132, 662, 102, 30);
		panel.add(stndrbtnEliminar);
		
		LabelSubtitulos lblsbtlsFecha_1 = new LabelSubtitulos((String) null);
		lblsbtlsFecha_1.setText("Fecha");
		lblsbtlsFecha_1.setBounds(380, 202, 125, 23);
		panel.add(lblsbtlsFecha_1);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(484, 202, 160, 23);
		panel.add(dateChooser_1);
		
		LabelSubtitulos lblsbtlsDescripcion_1 = new LabelSubtitulos((String) null);
		lblsbtlsDescripcion_1.setText("Descripcion");
		lblsbtlsDescripcion_1.setBounds(380, 236, 125, 23);
		panel.add(lblsbtlsDescripcion_1);
		
		TextSoloNumeros textSoloNumeros_1_1 = new TextSoloNumeros();
		textSoloNumeros_1_1.setBounds(484, 236, 250, 23);
		panel.add(textSoloNumeros_1_1);
		
		LabelSubtitulos lblsbtlsMonto_1 = new LabelSubtitulos((String) null);
		lblsbtlsMonto_1.setText("Monto");
		lblsbtlsMonto_1.setBounds(380, 270, 125, 23);
		panel.add(lblsbtlsMonto_1);
		
		TextSoloNumeros textSoloNumeros_2 = new TextSoloNumeros();
		textSoloNumeros_2.setBounds(484, 270, 160, 23);
		panel.add(textSoloNumeros_2);
		
		StandarButton stndrbtnGuardar_1 = new StandarButton((String) null);
		stndrbtnGuardar_1.setText("Guardar");
		stndrbtnGuardar_1.setBounds(513, 304, 102, 23);
		panel.add(stndrbtnGuardar_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(377, 333, 367, 294);
		panel.add(scrollPane_2);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Descripcion", "Fecha", "Monto"
			}
		));
		scrollPane_2.setViewportView(table_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(623, 632, 109, 21);
		panel.add(textField_1);
		
		LabelSubtitulos lblsbtlsTotal_1 = new LabelSubtitulos((String) null);
		lblsbtlsTotal_1.setText("TOTAL");
		lblsbtlsTotal_1.setBounds(575, 630, 70, 23);
		panel.add(lblsbtlsTotal_1);
		
		StandarButton stndrbtnModificar_1 = new StandarButton((String) null);
		stndrbtnModificar_1.setText("Modificar");
		stndrbtnModificar_1.setBounds(380, 662, 102, 30);
		panel.add(stndrbtnModificar_1);
		
		StandarButton stndrbtnEliminar_1 = new StandarButton((String) null);
		stndrbtnEliminar_1.setText("Eliminar");
		stndrbtnEliminar_1.setBounds(502, 662, 102, 30);
		panel.add(stndrbtnEliminar_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(0, 710, 748, 12);
		panel.add(separator_1);
		
		LabelSubtitulos lblsbtlsVerMovimientosPor = new LabelSubtitulos((String) null);
		lblsbtlsVerMovimientosPor.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsVerMovimientosPor.setText("Ver Movimientos por Mes");
		lblsbtlsVerMovimientosPor.setBounds(0, 720, 748, 23);
		panel.add(lblsbtlsVerMovimientosPor);
		
		LabelSubtitulos lblsbtlsAo = new LabelSubtitulos((String) null);
		lblsbtlsAo.setText("A\u00F1o");
		lblsbtlsAo.setBounds(10, 770, 55, 22);
		panel.add(lblsbtlsAo);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(76, 770, 55, 23);
		panel.add(yearChooser);
		
		StandarButton stndrbtnBuscar = new StandarButton((String) null);
		stndrbtnBuscar.setText("Buscar");
		stndrbtnBuscar.setBounds(152, 770, 100, 23);
		panel.add(stndrbtnBuscar);
		
		LabelSubtitulos lblsbtlsIngresos_1 = new LabelSubtitulos((String) null);
		lblsbtlsIngresos_1.setText("Ingresos");
		lblsbtlsIngresos_1.setBounds(5, 830, 125, 23);
		panel.add(lblsbtlsIngresos_1);
		
		LabelSubtitulos lblsbtlsIngresos_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsIngresos_1_1.setText("Egresos");
		lblsbtlsIngresos_1_1.setBounds(5, 850, 125, 23);
		panel.add(lblsbtlsIngresos_1_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(76, 820, 669, 54);
		panel.add(scrollPane_3);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
			}
		));
		scrollPane_3.setViewportView(table_2);
		
		LabelSubtitulos lblsbtlsResulXMes = new LabelSubtitulos((String) null);
		lblsbtlsResulXMes.setText("Res. x Mes");
		lblsbtlsResulXMes.setBounds(5, 885, 70, 23);
		panel.add(lblsbtlsResulXMes);
		
		LabelSubtitulos lblsbtlsAcumulado = new LabelSubtitulos((String) null);
		lblsbtlsAcumulado.setText("Acumulado");
		lblsbtlsAcumulado.setBounds(5, 915, 70, 23);
		panel.add(lblsbtlsAcumulado);
		
		textField_2 = new JTextField();
		textField_2.setBounds(77, 885, 45, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(77, 915, 45, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(134, 885, 45, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(134, 915, 45, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(190, 885, 45, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(190, 915, 45, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(245, 885, 45, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(245, 915, 45, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(302, 885, 45, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(302, 915, 45, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(358, 885, 45, 20);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(358, 915, 45, 20);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(413, 885, 45, 20);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(413, 915, 45, 20);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(470, 885, 45, 20);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(470, 915, 45, 20);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(526, 885, 45, 20);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(526, 915, 45, 20);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(585, 885, 45, 20);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(585, 915, 45, 20);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(642, 885, 45, 20);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(642, 915, 45, 20);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(698, 885, 45, 20);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(698, 915, 45, 20);
		panel.add(textField_25);
		
		

	}
}
