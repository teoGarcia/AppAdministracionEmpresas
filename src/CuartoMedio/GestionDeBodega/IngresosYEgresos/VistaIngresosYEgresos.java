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
	private JTextField txtIdIngreso;
	private JTextField txtIdEgreso;

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
		panel.setPreferredSize(new Dimension(748, 800));
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
		btnGuardarIngreso.setBounds(143, 310, 102, 23);
		btnGuardarIngreso.addActionListener(control);
		panel.add(btnGuardarIngreso);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(2, 345, 367, 294);
		panel.add(scrollPane);
		
		tableIngreso = new TableStandard();
		String[] columnstableIngreso = new String[] {"Id", "Descripcion", "Fecha", "Monto"};
		tableIngreso.setColums(columnstableIngreso);
		tableIngreso.getColumnModel().getColumn(0).setPreferredWidth(10);
		tableIngreso.getColumnModel().getColumn(1).setPreferredWidth(140);
		tableIngreso.getColumnModel().getColumn(2).setPreferredWidth(20);
		tableIngreso.getColumnModel().getColumn(3).setPreferredWidth(35);
		scrollPane.setViewportView(tableIngreso);
		
		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("TOTAL");
		lblsbtlsTotal.setBounds(206, 669, 70, 23);
		panel.add(lblsbtlsTotal);
		
		txtTotalIngreso = new JTextField();
		txtTotalIngreso.setEditable(false);
		txtTotalIngreso.setBounds(254, 671, 109, 21);
		panel.add(txtTotalIngreso);
		txtTotalIngreso.setColumns(10);
		
		btnModificarIngreso = new StandarButton((String) null);
		btnModificarIngreso.setText("Modificar");
		btnModificarIngreso.setBounds(10, 665, 102, 30);
		btnModificarIngreso.addActionListener(control);
		panel.add(btnModificarIngreso);
		
		btnEliminarIngreso = new StandarButton((String) null);
		btnEliminarIngreso.setText("Eliminar");
		btnEliminarIngreso.setBounds(10, 706, 102, 30);
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
		btnGuardarEgreso.setBounds(513, 310, 102, 23);
		btnGuardarEgreso.addActionListener(control);
		panel.add(btnGuardarEgreso);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(377, 345, 367, 294);
		panel.add(scrollPane_2);
		
		tableEgreso = new TableStandard();
		String[] columns = new String[] {"Id", "Descripcion", "Fecha", "Monto"};
		tableEgreso.setColums(columns);
		tableEgreso.getColumnModel().getColumn(0).setPreferredWidth(10);
		tableEgreso.getColumnModel().getColumn(1).setPreferredWidth(140);
		tableEgreso.getColumnModel().getColumn(2).setPreferredWidth(20);
		tableEgreso.getColumnModel().getColumn(3).setPreferredWidth(35);
		scrollPane_2.setViewportView(tableEgreso);
		
		txtTotalEgreso = new JTextField();
		txtTotalEgreso.setEditable(false);
		txtTotalEgreso.setColumns(10);
		txtTotalEgreso.setBounds(625, 671, 109, 21);
		panel.add(txtTotalEgreso);
		
		LabelSubtitulos lblsbtlsTotal_1 = new LabelSubtitulos((String) null);
		lblsbtlsTotal_1.setText("TOTAL");
		lblsbtlsTotal_1.setBounds(577, 669, 70, 23);
		panel.add(lblsbtlsTotal_1);
		
		btnModificarEgreso = new StandarButton((String) null);
		btnModificarEgreso.setText("Modificar");
		btnModificarEgreso.setBounds(390, 665, 102, 30);
		btnModificarEgreso.addActionListener(control);
		panel.add(btnModificarEgreso);
		
		btnEliminarEgreso = new StandarButton((String) null);
		btnEliminarEgreso.setText("Eliminar");
		btnEliminarEgreso.setBounds(390, 704, 102, 30);
		btnEliminarEgreso.addActionListener(control);
		panel.add(btnEliminarEgreso);
		
		txtIdIngreso = new JTextField();
		txtIdIngreso.setBounds(276, 134, 86, 20);
		txtIdIngreso.setVisible(false);
		panel.add(txtIdIngreso);
		txtIdIngreso.setColumns(10);
		
		txtIdEgreso = new JTextField();
		txtIdEgreso.setColumns(10);
		txtIdEgreso.setBounds(380, 134, 86, 20);
		txtIdEgreso.setVisible(false);
		panel.add(txtIdEgreso);
		
		control.LlenarTablaIngreso();
		control.LlenarTablaEgreso();
		ActualizarVista();

	}
	
	public void calcularTotalIngreso() {
		
		int t = 0;
		
		for(int i=0; i<this.tableIngreso.getRowCount(); i++) {
			 t += Integer.parseInt(String.valueOf(tableIngreso.getModel().getValueAt(i, 3)));
		}
		
		getTxtTotalIngreso().setText(""+t);
	}
	
	public void calcularTotalEgreso() {
		
		int t = 0;
		
		for(int i=0; i<this.tableEgreso.getRowCount(); i++) {
			 t += Integer.parseInt(String.valueOf(tableEgreso.getModel().getValueAt(i, 3)));
		}
		
		getTxtTotalEgreso().setText(""+t);
	}
	
	public boolean camposIngresoVacios() {
		
		if(FechaIngreso.getCalendar() == null) { 
			return false;
		}else if(txtDescIngreso.getText().length() <= 0) {
			return false;
			
		}else if(txtMontoIngreso.getText().length() <= 0) {
			return false;
			
		}
		
		return true;
	}
	
	public boolean camposEgresosVacios() {
		if(FechaEgresso.getCalendar() == null || txtDescEgreso.getText().length() <= 0 ||  txtMontoEgreso.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	public void ActualizarVista() {
		VaciarForm();
		control.LlenarTablaIngreso();
		control.LlenarTablaEgreso();
		calcularTotalIngreso();
		calcularTotalEgreso();
	}

	public void VaciarForm() {
		// TODO Auto-generated method stub
		txtDescIngreso.setText("");
		FechaIngreso.setCalendar(null);
		txtMontoIngreso.setText("");
		txtIdIngreso.setText("");
		txtIdEgreso.setText("");
		txtDescEgreso.setText("");
		FechaEgresso.setCalendar(null);
		txtMontoEgreso.setText("");
	}
	
	public void cargarFormIngreso(Ingreso iEntity) {
		
		FechaIngreso.setCalendar(iEntity.getFecha());
		txtDescIngreso.setText(iEntity.getDesc());
		txtMontoIngreso.setText(""+iEntity.getMonto());
		txtIdIngreso.setText(""+iEntity.getId());
		
	}
	
	public void cargarFormEgreso(Egreso eEntity) {
		
		FechaEgresso.setCalendar(eEntity.getFecha());
		txtDescEgreso.setText(eEntity.getDesc());
		txtMontoEgreso.setText(""+eEntity.getMonto());
		txtIdEgreso.setText(""+eEntity.getId());
		
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

	public TableStandard getTableIngreso() {
		return tableIngreso;
	}

	public TableStandard getTableEgreso() {
		return tableEgreso;
	}

	public StandarButton getBtnGuardarEgreso() {
		return btnGuardarEgreso;
	}

	public StandarButton getBtnEliminarEgreso() {
		return btnEliminarEgreso;
	}

	public StandarButton getBtnModificarEgreso() {
		return btnModificarEgreso;
	}

	public void setTableIngreso(TableStandard tableIngreso) {
		this.tableIngreso = tableIngreso;
	}

	public void setTableEgreso(TableStandard tableEgreso) {
		this.tableEgreso = tableEgreso;
	}

	public void setBtnGuardarEgreso(StandarButton btnGuardarEgreso) {
		this.btnGuardarEgreso = btnGuardarEgreso;
	}

	public void setBtnEliminarEgreso(StandarButton btnEliminarEgreso) {
		this.btnEliminarEgreso = btnEliminarEgreso;
	}

	public void setBtnModificarEgreso(StandarButton btnModificarEgreso) {
		this.btnModificarEgreso = btnModificarEgreso;
	}

	public JTextField getTxtTotalIngreso() {
		return txtTotalIngreso;
	}

	public JTextField getTxtTotalEgreso() {
		return txtTotalEgreso;
	}

	public void setTxtTotalIngreso(JTextField txtTotalIngreso) {
		this.txtTotalIngreso = txtTotalIngreso;
	}

	public void setTxtTotalEgreso(JTextField txtTotalEgreso) {
		this.txtTotalEgreso = txtTotalEgreso;
	}

	public JTextField getTxtIdIngreso() {
		return txtIdIngreso;
	}

	public JTextField getTxtIdEgreso() {
		return txtIdEgreso;
	}

	public void setTxtIdIngreso(JTextField txtIdIngreso) {
		this.txtIdIngreso = txtIdIngreso;
	}

	public void setTxtIdEgreso(JTextField txtIdEgreso) {
		this.txtIdEgreso = txtIdEgreso;
	}

	public Long getIdEgreso() {
		return idEgreso;
	}

	public void setIdEgreso(Long idEgreso) {
		this.idEgreso = idEgreso;
	}

	public JTextField getTxtDescEgreso() {
		return txtDescEgreso;
	}

	public TextSoloNumeros getTxtMontoEgreso() {
		return txtMontoEgreso;
	}

	public void setTxtDescEgreso(JTextField txtDescEgreso) {
		this.txtDescEgreso = txtDescEgreso;
	}

	public void setTxtMontoEgreso(TextSoloNumeros txtMontoEgreso) {
		this.txtMontoEgreso = txtMontoEgreso;
	}

	
}
