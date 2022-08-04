package CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import ui.TablaUi.TableStandard;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;


import javax.swing.DefaultComboBoxModel;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


import java.awt.Color;

public class VistaPresupSimple extends JPanel {
	
	private TableStandard table;
	
	private Long id = 0L;
	
	private JTextField txtApartado;
	private JTextField txtTotaligresos;
	private JTextField txtTotalEgresos;
	private JTextField txtTotal;

	private JComboBox comboTipo;
	
	private JDateChooser txtFecha;
	
	private TextSoloNumeros txtMonto;
	
	private StandarButton btnGuardar;
	private StandarButton btnEliminiar;
	private StandarButton btnModificar;
	
	private ControlPresupuesto cp;
	private StandarButton btnImprimir;

	/**
	 * Create the panel.
	 */
	public VistaPresupSimple() {
		
		cp = new ControlPresupuesto(this);
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblTitle = new JLabel("Presupuesto Simple");
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitle.setBounds(0, 60, 774, 30);
		add(lblTitle);
		
		LabelSubtitulos lblsbtlsApartado = new LabelSubtitulos((String) null);
		lblsbtlsApartado.setText("Apartado");
		lblsbtlsApartado.setBounds(66, 132, 87, 23);
		add(lblsbtlsApartado);
		
		txtApartado = new JTextField();
		txtApartado.setBounds(144, 133, 375, 23);
		add(txtApartado);
		txtApartado.setColumns(10);
		
		LabelSubtitulos lblsbtlsTipo = new LabelSubtitulos((String) null);
		lblsbtlsTipo.setText("Tipo");
		lblsbtlsTipo.setBounds(529, 132, 61, 23);
		add(lblsbtlsTipo);
		
		comboTipo = new JComboBox();
		comboTipo.setModel(new DefaultComboBoxModel(new String[] {"Ingreso", "Egreso"}));
		comboTipo.setBounds(600, 133, 116, 23);
		add(comboTipo);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos((String) null);
		lblsbtlsFecha.setText("Fecha");
		lblsbtlsFecha.setBounds(66, 185, 71, 23);
		add(lblsbtlsFecha);
		
		txtFecha = new JDateChooser();
		txtFecha.setBounds(144, 185, 160, 23);
		add(txtFecha);
		
		LabelSubtitulos lblsbtlsMonto = new LabelSubtitulos((String) null);
		lblsbtlsMonto.setText("Monto");
		lblsbtlsMonto.setBounds(334, 185, 77, 23);
		add(lblsbtlsMonto);
		
		txtMonto = new TextSoloNumeros();
		txtMonto.setBounds(401, 185, 160, 23);
		add(txtMonto);
		
		btnGuardar = new StandarButton((String) null);
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(603, 185, 100, 23);
		btnGuardar.addActionListener(cp);
		add(btnGuardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(66, 244, 638, 333);
		add(scrollPane);
		
		table = new TableStandard();
		String[] columns = new String[] {"Id", "Apartado", "Fecha", "Ingreso", "Egreso"};
		table.setColums(columns);
		scrollPane.setViewportView(table);
		
		btnEliminiar = new StandarButton((String) null);
		btnEliminiar.setText("Eliminar");
		btnEliminiar.setBounds(66, 588, 100, 30);
		btnEliminiar.addActionListener(cp);
		add(btnEliminiar);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(188, 588, 100, 30);
		btnModificar.addActionListener(cp);
		add(btnModificar);
		
		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("TOTAL");
		lblsbtlsTotal.setBounds(373, 594, 100, 23);
		add(lblsbtlsTotal);
		
		txtTotaligresos = new JTextField();
		txtTotaligresos.setEditable(false);
		txtTotaligresos.setBounds(461, 594, 100, 23);
		add(txtTotaligresos);
		txtTotaligresos.setColumns(10);
		
		txtTotalEgresos = new JTextField();
		txtTotalEgresos.setEditable(false);
		txtTotalEgresos.setColumns(10);
		txtTotalEgresos.setBounds(603, 594, 100, 23);
		add(txtTotalEgresos);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setBounds(603, 638, 100, 23);
		add(txtTotal);
		txtTotal.setColumns(10);
		
		LabelSubtitulos lblsbtlsResultado = new LabelSubtitulos((String) null);
		lblsbtlsResultado.setText("Resultado");
		lblsbtlsResultado.setBounds(503, 637, 87, 23);
		add(lblsbtlsResultado);
		
		btnImprimir = new StandarButton((String) null);
		btnImprimir.setText("Imprimir");
		btnImprimir.setBounds(603, 672, 100, 30);
		btnImprimir.addActionListener(cp);
		add(btnImprimir);
		
		ActualizarVista();

	}
	
	public boolean camposVacios() {
		
		if(txtApartado.getText().length() <= 0) {
			return false;
		}else if(txtFecha.getCalendar() == null) {
			return false;
		}else if(txtMonto.getText().length() <= 0) {
			return false;
		}else if(comboTipo.getSelectedIndex() < 0) {
			return false;
		}
		
		return true;
	}

	public void calcularTotal() {
		
		int totalI = 0;
		int totalE = 0;
		  
		for(int i=0; i<this.table.getRowCount(); i++) { 
			totalI += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 3))); 
		}
		  
		for(int i=0; i<this.table.getRowCount(); i++) { 
			totalE += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 4))); 
		}
		
		txtTotaligresos.setText(""+totalI);
		txtTotalEgresos.setText(""+totalE);
		txtTotal.setText(""+(totalI - totalE));
		 
	}
	
	public void ActualizarVista() {
		VaciarForm();
		cp.LlenarTabla();
		calcularTotal();
	}

	public void VaciarForm() {
		txtApartado.setText("");
		txtFecha.setCalendar(null);
		comboTipo.setSelectedIndex(-1);
		txtMonto.setText("");
		setId(0L);
	}
	
	public void CargarForm(PresupuestoEntity p) {
		txtApartado.setText(p.getApartado());
		txtFecha.setCalendar(p.getFecha());
		
		
		if(p.getEgreso() > 0) {
			txtMonto.setText(""+p.getEgreso());
			comboTipo.setSelectedIndex(1);
		}else if(p.getIngreso() > 0) {
			txtMonto.setText(""+p.getIngreso());
			comboTipo.setSelectedIndex(0);
		}
		
		setId(p.getId());
	}
	
	public DefaultTableModel getModel() {
		return table.getModel();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public JTextField getTxtApartado() {
		return txtApartado;
	}

	public void setTxtApartado(JTextField txtApartado) {
		this.txtApartado = txtApartado;
	}

	public TableStandard getTable() {
		return table;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public JTextField getTxtTotaligresos() {
		return txtTotaligresos;
	}

	public void setTxtTotaligresos(JTextField txtTotaligresos) {
		this.txtTotaligresos = txtTotaligresos;
	}

	public JTextField getTxtTotalEgresos() {
		return txtTotalEgresos;
	}

	public void setTxtTotalEgresos(JTextField txtTotalEgresos) {
		this.txtTotalEgresos = txtTotalEgresos;
	}

	public JComboBox getComboTipo() {
		return comboTipo;
	}

	public void setComboTipo(JComboBox comboTipo) {
		this.comboTipo = comboTipo;
	}

	public JDateChooser getTxtFecha() {
		return txtFecha;
	}

	public void setTxtFecha(JDateChooser txtFecha) {
		this.txtFecha = txtFecha;
	}

	public TextSoloNumeros getTxtMonto() {
		return txtMonto;
	}

	public void setTxtMonto(TextSoloNumeros txtMonto) {
		this.txtMonto = txtMonto;
	}

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public StandarButton getBtnEliminiar() {
		return btnEliminiar;
	}

	public void setBtnEliminiar(StandarButton btnEliminiar) {
		this.btnEliminiar = btnEliminiar;
	}

	public StandarButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(StandarButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public JTextField getTxtTotal() {
		return txtTotal;
	}

	public void setTxtTotal(JTextField txtTotal) {
		this.txtTotal = txtTotal;
	}

	public StandarButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(StandarButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}
}
