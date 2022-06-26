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
import ui.TablaUi.TableStandard;

public class VistaIngresosYEgresos extends JPanel {
	
	private Long idIngreso = 0L;
	private Long idEgreso = 0L;
	
	private TableStandard tableIngreso;
	private JTextField txtTotalIngreso;
	private JTextField txtTotalEgreso;
	private TableStandard tableEgreso;
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
	private StandarButton btnGuardarIngreso;
	private StandarButton btnGuardarEgreso;
	private JTextField txtDescEgreso;
	private TextSoloNumeros txtMontoEgreso;
	private JDateChooser FechaEgresso;
	private StandarButton btnModificarIngreso;
	private StandarButton btnEliminarIngreso;
	private StandarButton btnEliminarEgreso;
	private StandarButton btnModificarEgreso;
	private ControlIngresoEgreso control;
	private JDateChooser FechaIngreso;
	private JTextField txtDescIngreso;
	private TextSoloNumeros txtMontoIngreso;

	/**
	 * Create the panel.
	 */
	public VistaIngresosYEgresos() {
		
		control = new ControlIngresoEgreso(this);
		
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
		
		txtMontoIngreso = new TextSoloNumeros();
		txtMontoIngreso.setBounds(114, 270, 160, 23);
		panel.add(txtMontoIngreso);
		
		FechaIngreso = new JDateChooser();
		FechaIngreso.setBounds(114, 202, 160, 23);
		panel.add(FechaIngreso);
		
		txtDescIngreso = new JTextField();
		txtDescIngreso.setBounds(114, 236, 250, 23);
		panel.add(txtDescIngreso);
		
		btnGuardarIngreso = new StandarButton((String) null);
		btnGuardarIngreso.setText("Guardar");
		btnGuardarIngreso.setBounds(143, 304, 102, 23);
		btnGuardarIngreso.addActionListener(control);
		panel.add(btnGuardarIngreso);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(2, 333, 367, 294);
		panel.add(scrollPane);
		
		tableIngreso = new TableStandard();
		String[] columnstableIngreso = new String[] {"Id", "Descripcion", "Fecha", "Monto"};
		tableIngreso.setColums(columnstableIngreso);
		scrollPane.setViewportView(tableIngreso);
		
		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("TOTAL");
		lblsbtlsTotal.setBounds(205, 630, 70, 23);
		panel.add(lblsbtlsTotal);
		
		txtTotalIngreso = new JTextField();
		txtTotalIngreso.setBounds(253, 632, 109, 21);
		panel.add(txtTotalIngreso);
		txtTotalIngreso.setColumns(10);
		
		btnModificarIngreso = new StandarButton((String) null);
		btnModificarIngreso.setText("Modificar");
		btnModificarIngreso.setBounds(10, 662, 102, 30);
		btnModificarIngreso.addActionListener(control);
		panel.add(btnModificarIngreso);
		
		btnEliminarIngreso = new StandarButton((String) null);
		btnEliminarIngreso.setText("Eliminar");
		btnEliminarIngreso.setBounds(134, 664, 102, 30);
		btnEliminarIngreso.addActionListener(control);
		panel.add(btnEliminarIngreso);
		
		LabelSubtitulos lblsbtlsFecha_1 = new LabelSubtitulos((String) null);
		lblsbtlsFecha_1.setText("Fecha");
		lblsbtlsFecha_1.setBounds(380, 202, 125, 23);
		panel.add(lblsbtlsFecha_1);
		
		FechaEgresso = new JDateChooser();
		FechaEgresso.setBounds(484, 202, 160, 23);
		panel.add(FechaEgresso);
		
		LabelSubtitulos lblsbtlsDescripcion_1 = new LabelSubtitulos((String) null);
		lblsbtlsDescripcion_1.setText("Descripcion");
		lblsbtlsDescripcion_1.setBounds(380, 236, 125, 23);
		panel.add(lblsbtlsDescripcion_1);
		
		txtDescEgreso = new JTextField();
		txtDescEgreso.setBounds(484, 236, 250, 23);
		panel.add(txtDescEgreso);
		
		LabelSubtitulos lblsbtlsMonto_1 = new LabelSubtitulos((String) null);
		lblsbtlsMonto_1.setText("Monto");
		lblsbtlsMonto_1.setBounds(380, 270, 125, 23);
		panel.add(lblsbtlsMonto_1);
		
		txtMontoEgreso = new TextSoloNumeros();
		txtMontoEgreso.setBounds(484, 270, 160, 23);
		panel.add(txtMontoEgreso);
		
		btnGuardarEgreso = new StandarButton((String) null);
		btnGuardarEgreso.setText("Guardar");
		btnGuardarEgreso.setBounds(513, 304, 102, 23);
		panel.add(btnGuardarEgreso);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(377, 333, 367, 294);
		panel.add(scrollPane_2);
		
		tableEgreso = new TableStandard();
		String[] columns = new String[] {"Id", "Descripcion", "Fecha", "Monto"};
		tableEgreso.setColums(columns);
		scrollPane_2.setViewportView(tableEgreso);
		
		txtTotalEgreso = new JTextField();
		txtTotalEgreso.setColumns(10);
		txtTotalEgreso.setBounds(623, 632, 109, 21);
		panel.add(txtTotalEgreso);
		
		LabelSubtitulos lblsbtlsTotal_1 = new LabelSubtitulos((String) null);
		lblsbtlsTotal_1.setText("TOTAL");
		lblsbtlsTotal_1.setBounds(575, 630, 70, 23);
		panel.add(lblsbtlsTotal_1);
		
		btnModificarEgreso = new StandarButton((String) null);
		btnModificarEgreso.setText("Modificar");
		btnModificarEgreso.setBounds(380, 662, 102, 30);
		btnModificarEgreso.addActionListener(control);
		panel.add(btnModificarEgreso);
		
		btnEliminarEgreso = new StandarButton((String) null);
		btnEliminarEgreso.setText("Eliminar");
		btnEliminarEgreso.setBounds(502, 662, 102, 30);
		btnEliminarEgreso.addActionListener(control);
		panel.add(btnEliminarEgreso);
		
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
		
		control.LlenarTablas();

	}
	
	public void calcularTotal() {
		
		double totalI = 0;
		double totalE = 0;
		
		for(int i=0; i<this.tableIngreso.getRowCount(); i++) { 
			totalI += Double.parseDouble(String.valueOf(tableIngreso.getModel().getValueAt(i, 3))); 
		}
		
		for(int i=0; i<this.tableEgreso.getRowCount(); i++) { 
			totalE += Double.parseDouble(String.valueOf(tableEgreso.getModel().getValueAt(i, 3))); 
		}
		
		txtTotalIngreso.setText(""+totalI);
		txtTotalEgreso.setText(""+totalE);
		  
	}
	
	public boolean camposIngresoVacios() {
		if(FechaIngreso.getCalendar().getTime() == null || txtDescIngreso.getText().length() <= 0 ||  txtMontoIngreso.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	public void ActualizarVista() {
		VaciarForm();
		control.LlenarTablas();
		calcularTotal();
	}

	public void VaciarForm() {
		// TODO Auto-generated method stub
		txtDescIngreso.setText("");
		FechaIngreso.setCalendar(null);
		txtMontoIngreso.setText("");
		
		txtDescEgreso.setText("");
		FechaEgresso.setCalendar(null);
		txtMontoEgreso.setText("");
	}
	
	public DefaultTableModel getModelIngreso() {
		return tableIngreso.getModel();
	}
	
	public DefaultTableModel getModelEgreso() {
		return tableEgreso.getModel();
	}

	public StandarButton getBtnGuardarIngreso() {
		return btnGuardarIngreso;
	}

	public void setBtnGuardarIngreso(StandarButton btnGuardarIngreso) {
		this.btnGuardarIngreso = btnGuardarIngreso;
	}

	public StandarButton getBtnModificarIngreso() {
		return btnModificarIngreso;
	}

	public void setBtnModificarIngreso(StandarButton btnModificarIngreso) {
		this.btnModificarIngreso = btnModificarIngreso;
	}

	public StandarButton getBtnEliminarIngreso() {
		return btnEliminarIngreso;
	}

	public void setBtnEliminarIngreso(StandarButton btnEliminarIngreso) {
		this.btnEliminarIngreso = btnEliminarIngreso;
	}

	public Long getIdIngreso() {
		return idIngreso;
	}

	public void setIdIngreso(Long idIngreso) {
		this.idIngreso = idIngreso;
	}

	public JDateChooser getFechaEgresso() {
		return FechaEgresso;
	}

	public void setFechaEgresso(JDateChooser fechaEgresso) {
		FechaEgresso = fechaEgresso;
	}

	public JDateChooser getFechaIngreso() {
		return FechaIngreso;
	}

	public void setFechaIngreso(JDateChooser fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}

	public JTextField getTxtDescIngreso() {
		return txtDescIngreso;
	}

	public void setTxtDescIngreso(JTextField txtDescIngreso) {
		this.txtDescIngreso = txtDescIngreso;
	}

	public TextSoloNumeros getTxtMontoIngreso() {
		return txtMontoIngreso;
	}

	public void setTxtMontoIngreso(TextSoloNumeros txtMontoIngreso) {
		this.txtMontoIngreso = txtMontoIngreso;
	}

	
}
