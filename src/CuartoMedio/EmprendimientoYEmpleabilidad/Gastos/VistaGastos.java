package CuartoMedio.EmprendimientoYEmpleabilidad.Gastos;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import ui.TablaUi.TableStandard;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.Producto;

import javax.swing.JTextField;
import java.awt.Color;

public class VistaGastos extends JPanel {

	
	private Long Id;
	
	private ControlGastos control;
	
	private TableStandard table;
	private TextSoloNumeros txtTotalPres;
	private TextSoloNumeros txtTotalReal;
	private TextSoloNumeros txtDif$;
	private StandarButton btnEliminar;
	private JComboBox comboBoxGastos;
	private JComboBox comboBoxTipoGasto;
	private StandarButton btnAgregar;
	private TextSoloNumeros txtPresupuesto;
	private TextSoloNumeros txtReal;

	/**
	 * Create the panel.
	 */
	public VistaGastos() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		control = new ControlGastos(this);
		
		JLabel lblNewLabel = new JLabel("Gastos de la Empresa");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 60, 774, 30);
		add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsGastos = new LabelSubtitulos((String) null);
		lblsbtlsGastos.setText("Gastos");
		lblsbtlsGastos.setBounds(52, 141, 73, 23);
		add(lblsbtlsGastos);
		
		comboBoxGastos = new JComboBox();
		comboBoxGastos.setModel(new DefaultComboBoxModel(new String[] {"De Oficina", "De Tienda", "De Ventas", "Publicidad"}));
		comboBoxGastos.setBounds(147, 142, 301, 23);
		add(comboBoxGastos);
		
		LabelSubtitulos lblsbtlsTipoDeGasto = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeGasto.setText("Tipo de Gasto");
		lblsbtlsTipoDeGasto.setBounds(481, 141, 116, 23);
		add(lblsbtlsTipoDeGasto);
		
		comboBoxTipoGasto = new JComboBox();
		comboBoxTipoGasto.setModel(new DefaultComboBoxModel(new String[] {"Empleado", "Operativo"}));
		comboBoxTipoGasto.setBounds(594, 142, 128, 22);
		add(comboBoxTipoGasto);
		
		LabelSubtitulos lblsbtlsPresupuesto = new LabelSubtitulos((String) null);
		lblsbtlsPresupuesto.setText("Presupuesto");
		lblsbtlsPresupuesto.setBounds(52, 197, 95, 23);
		add(lblsbtlsPresupuesto);
		
		txtPresupuesto = new TextSoloNumeros();
		txtPresupuesto.setBounds(147, 197, 150, 23);
		add(txtPresupuesto);
		
		LabelSubtitulos lblsbtlsReal = new LabelSubtitulos((String) null);
		lblsbtlsReal.setText("Real");
		lblsbtlsReal.setBounds(333, 197, 65, 23);
		add(lblsbtlsReal);
		
		txtReal = new TextSoloNumeros();
		txtReal.setBounds(396, 197, 150, 23);
		add(txtReal);
		
		btnAgregar = new StandarButton((String) null);
		btnAgregar.setText("Guardar");
		btnAgregar.setBounds(606, 197, 116, 23);
		btnAgregar.addActionListener(control);
		add(btnAgregar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 248, 670, 363);
		add(scrollPane);
		
		table = new TableStandard();
		String[] columns = new String[] {"Id", "Gasto", "Tipo Gasto", "Presupuesto", "Real", "Dif. $"};
		table.setColums(columns);
		scrollPane.setViewportView(table);
		
		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("TOTAL");
		lblsbtlsTotal.setBounds(256, 622, 78, 23);
		add(lblsbtlsTotal);
		
		txtTotalPres = new TextSoloNumeros();
		txtTotalPres.setEditable(false);
		txtTotalPres.setBounds(396, 622, 86, 23);
		add(txtTotalPres);
		txtTotalPres.setColumns(10);
		
		txtTotalReal = new TextSoloNumeros();
		txtTotalReal.setEditable(false);
		txtTotalReal.setColumns(10);
		txtTotalReal.setBounds(522, 621, 86, 23);
		add(txtTotalReal);
		
		txtDif$ = new TextSoloNumeros();
		txtDif$.setEditable(false);
		txtDif$.setColumns(10);
		txtDif$.setBounds(629, 621, 86, 23);
		add(txtDif$);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(52, 622, 100, 30);
		btnEliminar.addActionListener(control);
		add(btnEliminar);
		
		ActualizarVista();

	}
	
	public void calcularTotal() {
		
		int totalPre = 0;
		int totalReal = 0;
		int totalDif = 0;
		
		for(int i=0; i<this.table.getRowCount(); i++) { 
			totalPre += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 3))); 
		}
		
		for(int i=0; i<this.table.getRowCount(); i++) { 
			totalReal += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 4))); 
		}
		
		for(int i=0; i<this.table.getRowCount(); i++) { 
			totalDif += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 5))); 
		}
		
		txtTotalPres.setText(""+totalPre);
		txtTotalReal.setText(""+totalReal);
		txtDif$.setText(""+totalDif);
		  
	}

	public boolean camposVacios() {
		
		if(comboBoxGastos.getSelectedIndex() <= -1 || comboBoxTipoGasto.getSelectedIndex() <= -1 || txtReal.getText().length() <= 0 || txtPresupuesto.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	
	public void ActualizarVista() {
		VaciarForm();
		control.LlenarTabla();
		calcularTotal();
	}
	
	public void CargarForm(Gastos record) {
		comboBoxGastos.setSelectedItem(record.getGasto());
		comboBoxTipoGasto.setSelectedItem(record.getTgasto());
		txtPresupuesto.setText(""+record.getPresupuesto());
		txtReal.setText(""+record.getReal());
		setId(record.getId());
	}
	
	public void VaciarForm() {
		comboBoxGastos.setSelectedItem(-1);
		comboBoxTipoGasto.setSelectedItem(-1);
		txtPresupuesto.setText("");
		txtReal.setText("");
		setId(0L);
	}

	public DefaultTableModel getModel() {
		return table.getModel();
	}
	
	public TableStandard getTable() {
		return table;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public JTextField getTxtTotalPres() {
		return txtTotalPres;
	}

	public void setTxtTotalPres(TextSoloNumeros txtTotalPres) {
		this.txtTotalPres = txtTotalPres;
	}

	public TextSoloNumeros getTxtTotalReal() {
		return txtTotalReal;
	}

	public void setTxtTotalReal(TextSoloNumeros txtTotalReal) {
		this.txtTotalReal = txtTotalReal;
	}

	public TextSoloNumeros getTxtDif$() {
		return txtDif$;
	}

	public void setTxtDif$(TextSoloNumeros txtDif$) {
		this.txtDif$ = txtDif$;
	}

	public StandarButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(StandarButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public StandarButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(StandarButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public JComboBox getComboBoxGastos() {
		return comboBoxGastos;
	}

	public void setComboBoxGastos(JComboBox comboBoxGastos) {
		this.comboBoxGastos = comboBoxGastos;
	}

	public JComboBox getComboBoxTipoGasto() {
		return comboBoxTipoGasto;
	}

	public void setComboBoxTipoGasto(JComboBox comboBoxTipoGasto) {
		this.comboBoxTipoGasto = comboBoxTipoGasto;
	}

	public TextSoloNumeros getTxtPresupuesto() {
		return txtPresupuesto;
	}

	public void setTxtPresupuesto(TextSoloNumeros txtPresupuesto) {
		this.txtPresupuesto = txtPresupuesto;
	}

	public TextSoloNumeros getTxtReal() {
		return txtReal;
	}

	public void setTxtReal(TextSoloNumeros txtReal) {
		this.txtReal = txtReal;
	}
}
