package CuartoMedio.EmprendimientoYEmpleabilidad.ControlGastos;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import ui.Labels.LabelTitulos;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import ui.Labels.LabelSubtitulos;
import javax.swing.JTextField;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import ui.TablaUi.TableStandard;
import javax.swing.table.DefaultTableModel;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import com.toedter.calendar.JMonthChooser;
import java.awt.Font;
import com.toedter.calendar.JYearChooser;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class VistaControlGastos extends JPanel {
	
	private ControladorControlGastos control;
	
	private Long id;
	
	private JTextField txtDetalles;
	
	private TableStandard tableEnero, tableFebrero, tableMarzo, tableAbril, tableMayo, tableJunio, tableJulio, tableAgosto, tableSeptiembre, tableOctubre, tableNoviembre, tableDiciembre;
	
	private JYearChooser yearChooserPago;
	private JMonthChooser monthMes;
	private JYearChooser yearBuscar;
	
	private TextSoloNumeros txtImporte;
	
	private JComboBox comCategoria;
	private JComboBox comSubCategoria;
	
	private StandarButton btnGuardar;
	private StandarButton stndrbtnBuscar;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	
	
	/**
	 * Create the panel.
	 */
	public VistaControlGastos() { 
		
		control = new ControladorControlGastos(this);
		
		setBounds(0, 0, 748, 722);
		setOpaque(false);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 2300));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		LabelTitulos lbltlsControlDeGastos = new LabelTitulos((String) null);
		lbltlsControlDeGastos.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsControlDeGastos.setText("Control de Gastos");
		lbltlsControlDeGastos.setBounds(0, 60, 748, 30);
		panel.add(lbltlsControlDeGastos);
		
		comCategoria = new JComboBox();
		comCategoria.addItemListener(control);
		comCategoria.setModel(new DefaultComboBoxModel(new String[] {"Supermercado", "Gastos Fijos", "Formacion", "Ocio", "Transporte", "Vivienda", "Salud", "Seguros", "Impuestos"}));
		comCategoria.setBounds(93, 125, 265, 23);
		panel.add(comCategoria);
		
		LabelSubtitulos lblsbtlsCategoria = new LabelSubtitulos((String) null);
		lblsbtlsCategoria.setText("Categoria");
		lblsbtlsCategoria.setBounds(20, 125, 109, 23);
		panel.add(lblsbtlsCategoria);
		
		LabelSubtitulos lblsbtlsSubCategoria = new LabelSubtitulos((String) null);
		lblsbtlsSubCategoria.setText("Sub Categoria");
		lblsbtlsSubCategoria.setBounds(368, 125, 109, 23);
		panel.add(lblsbtlsSubCategoria);
		
		comSubCategoria = new JComboBox();
		comSubCategoria.setBounds(477, 125, 250, 23);
		comSubCategoria.setModel(new DefaultComboBoxModel(new String[] {"Almacén", "Verdulería", "Carnicería", "Delivery", "Artículos Limpieza", "S-Otros"}));
		panel.add(comSubCategoria);
		
		LabelSubtitulos lblsbtlsDetalle = new LabelSubtitulos((String) null);
		lblsbtlsDetalle.setText("Detalle");
		lblsbtlsDetalle.setBounds(20, 165, 109, 23);
		panel.add(lblsbtlsDetalle);
		
		txtDetalles = new JTextField();
		txtDetalles.setBounds(91, 165, 186, 23);
		panel.add(txtDetalles);
		txtDetalles.setColumns(10);
		
		LabelSubtitulos lblsbtlsImporte = new LabelSubtitulos((String) null);
		lblsbtlsImporte.setText("Importe");
		lblsbtlsImporte.setBounds(570, 165, 83, 23);
		panel.add(lblsbtlsImporte);
		
		LabelSubtitulos lblsbtlsA = new LabelSubtitulos((String) null);
		lblsbtlsA.setText("A\u00F1o");
		lblsbtlsA.setBounds(287, 165, 46, 23);
		panel.add(lblsbtlsA);
		
		LabelSubtitulos lblsbtlsMes = new LabelSubtitulos((String) null);
		lblsbtlsMes.setText("Mes");
		lblsbtlsMes.setBounds(405, 165, 53, 23);
		panel.add(lblsbtlsMes);
		
		txtImporte = new TextSoloNumeros();
		txtImporte.setBounds(627, 165, 100, 23);
		panel.add(txtImporte);
		
		btnGuardar = new StandarButton((String) null);
		btnGuardar.setText("Guardar");
		btnGuardar.addActionListener(control);
		btnGuardar.setBounds(627, 198, 100, 30);
		panel.add(btnGuardar);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 240, 748, 12);
		panel.add(separator);
		
		LabelSubtitulos lblsbtlsBuscar = new LabelSubtitulos((String) null);
		lblsbtlsBuscar.setText("Buscar por a\u00F1o");
		lblsbtlsBuscar.setBounds(20, 253, 109, 23);
		panel.add(lblsbtlsBuscar);
		
		stndrbtnBuscar = new StandarButton((String) null);
		stndrbtnBuscar.setText("Buscar");
		stndrbtnBuscar.addActionListener(control);
		stndrbtnBuscar.setBounds(249, 249, 100, 30);
		panel.add(stndrbtnBuscar);
		
		LabelSubtitulos lblsbtlsEnero = new LabelSubtitulos((String) null);
		lblsbtlsEnero.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsEnero.setText("Enero");
		lblsbtlsEnero.setBounds(0, 287, 748, 23);
		panel.add(lblsbtlsEnero);
		
		JScrollPane scrollPaneEnero = new JScrollPane();
		scrollPaneEnero.setBounds(20, 320, 707, 124);
		panel.add(scrollPaneEnero);
		
		tableEnero = new TableStandard();
		String ColumnsEnero[] = new String[] {"Id", "Categoria", "Sub Categoria", "Detalle", "Importe"};
		tableEnero.setColums(ColumnsEnero);
		scrollPaneEnero.setViewportView(tableEnero);
		
		scrollPaneEnero.setViewportView(tableEnero);
		
		LabelSubtitulos lblsbtlsFebrero = new LabelSubtitulos((String) null);
		lblsbtlsFebrero.setText("Febrero");
		lblsbtlsFebrero.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsFebrero.setBounds(0, 455, 748, 23);
		panel.add(lblsbtlsFebrero);
		
		JScrollPane scrollPaneFebrero = new JScrollPane();
		scrollPaneFebrero.setBounds(20, 488, 707, 124);
		panel.add(scrollPaneFebrero);
		
		tableFebrero = new TableStandard();
		String ColumnsFebrero[] = new String[] {"Id", "Categoria", "Sub Categoria", "Detalle", "Importe"};
		tableFebrero.setColums(ColumnsFebrero);
		scrollPaneFebrero.setViewportView(tableFebrero);
		
		LabelSubtitulos lblsbtlsMarzo = new LabelSubtitulos((String) null);
		lblsbtlsMarzo.setText("Marzo");
		lblsbtlsMarzo.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsMarzo.setBounds(0, 623, 748, 23);
		panel.add(lblsbtlsMarzo);
		
		JScrollPane scrollPaneMarzo = new JScrollPane();
		scrollPaneMarzo.setBounds(20, 656, 707, 124);
		panel.add(scrollPaneMarzo);
		
		tableMarzo = new TableStandard();
		String ColumnsMarzo[] = new String[] {"Id", "Categoria", "Sub Categoria", "Detalle", "Importe"};
		tableMarzo.setColums(ColumnsMarzo);
		scrollPaneMarzo.setViewportView(tableMarzo);
		
		LabelSubtitulos lblsbtlsAbril = new LabelSubtitulos((String) null);
		lblsbtlsAbril.setText("Abril");
		lblsbtlsAbril.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsAbril.setBounds(0, 791, 748, 23);
		panel.add(lblsbtlsAbril);
		
		JScrollPane scrollPaneAbril = new JScrollPane();
		scrollPaneAbril.setBounds(20, 824, 707, 124);
		panel.add(scrollPaneAbril);
		
		tableAbril = new TableStandard();
		String ColumnsAbril[] = new String[] {"Id", "Categoria", "Sub Categoria", "Detalle", "Importe"};
		tableAbril.setColums(ColumnsAbril);
		scrollPaneAbril.setViewportView(tableAbril);
		
		LabelSubtitulos lblsbtlsMayo = new LabelSubtitulos((String) null);
		lblsbtlsMayo.setText("Mayo");
		lblsbtlsMayo.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsMayo.setBounds(0, 959, 748, 23);
		panel.add(lblsbtlsMayo);
		
		JScrollPane scrollPaneMayo = new JScrollPane();
		scrollPaneMayo.setBounds(20, 992, 707, 124);
		panel.add(scrollPaneMayo);
		
		tableMayo = new TableStandard();
		String ColumnsMayo[] = new String[] {"Id", "Categoria", "Sub Categoria", "Detalle", "Importe"};
		tableMayo.setColums(ColumnsMayo);
		scrollPaneMayo.setViewportView(tableMayo);
		
		LabelSubtitulos lblsbtlsJunio = new LabelSubtitulos((String) null);
		lblsbtlsJunio.setText("Junio");
		lblsbtlsJunio.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsJunio.setBounds(0, 1127, 748, 23);
		panel.add(lblsbtlsJunio);
		
		JScrollPane scrollPaneJunio = new JScrollPane();
		scrollPaneJunio.setBounds(20, 1160, 707, 124);
		panel.add(scrollPaneJunio);
		
		tableJunio = new TableStandard();
		String ColumnsJunio[] = new String[] {"Id", "Categoria", "Sub Categoria", "Detalle", "Importe"};
		tableJunio.setColums(ColumnsJunio);
		scrollPaneJunio.setViewportView(tableJunio);
		
		LabelSubtitulos lblsbtlsJulio = new LabelSubtitulos((String) null);
		lblsbtlsJulio.setText("Julio");
		lblsbtlsJulio.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsJulio.setBounds(0, 1295, 748, 23);
		panel.add(lblsbtlsJulio);
		
		JScrollPane scrollPaneJulio = new JScrollPane();
		scrollPaneJulio.setBounds(20, 1328, 707, 124);
		panel.add(scrollPaneJulio);
		
		tableJulio = new TableStandard();
		String ColumnsJulio[] = new String[] {"Id", "Categoria", "Sub Categoria", "Detalle", "Importe"};
		tableJulio.setColums(ColumnsJulio);
		scrollPaneJulio.setViewportView(tableJulio);
		
		LabelSubtitulos lblsbtlsAgosto = new LabelSubtitulos((String) null);
		lblsbtlsAgosto.setText("Agosto");
		lblsbtlsAgosto.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsAgosto.setBounds(0, 1463, 748, 23);
		panel.add(lblsbtlsAgosto);
		
		JScrollPane scrollPaneAgosto = new JScrollPane();
		scrollPaneAgosto.setBounds(20, 1496, 707, 124);
		panel.add(scrollPaneAgosto);
		
		tableAgosto = new TableStandard();
		String ColumnsAgosto[] = new String[] {"Id", "Categoria", "Sub Categoria", "Detalle", "Importe"};
		tableAgosto.setColums(ColumnsAgosto);
		scrollPaneAgosto.setViewportView(tableAgosto);
		
		LabelSubtitulos lblsbtlsSeptiembre = new LabelSubtitulos((String) null);
		lblsbtlsSeptiembre.setText("Septiembre");
		lblsbtlsSeptiembre.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsSeptiembre.setBounds(0, 1631, 748, 23);
		panel.add(lblsbtlsSeptiembre);
		
		JScrollPane scrollPaneSeptiembre = new JScrollPane();
		scrollPaneSeptiembre.setBounds(20, 1664, 707, 124);
		panel.add(scrollPaneSeptiembre);
		
		tableSeptiembre = new TableStandard();
		String ColumnsSeptiembre[] = new String[] {"Id", "Categoria", "Sub Categoria", "Detalle", "Importe"};
		tableSeptiembre.setColums(ColumnsSeptiembre);
		scrollPaneSeptiembre.setViewportView(tableSeptiembre);
		
		LabelSubtitulos lblsbtlsOctubre = new LabelSubtitulos((String) null);
		lblsbtlsOctubre.setText("Octubre");
		lblsbtlsOctubre.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsOctubre.setBounds(0, 1799, 748, 23);
		panel.add(lblsbtlsOctubre);
		
		JScrollPane scrollPaneOctubre = new JScrollPane();
		scrollPaneOctubre.setBounds(20, 1832, 707, 124);
		panel.add(scrollPaneOctubre);
		
		tableOctubre = new TableStandard();
		String ColumnsOctubre[] = new String[] {"Id", "Categoria", "Sub Categoria", "Detalle", "Importe"};
		tableOctubre.setColums(ColumnsOctubre);
		scrollPaneOctubre.setViewportView(tableOctubre);
		
		LabelSubtitulos lblsbtlsNoviembre = new LabelSubtitulos((String) null);
		lblsbtlsNoviembre.setText("Noviembre");
		lblsbtlsNoviembre.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsNoviembre.setBounds(0, 1967, 748, 23);
		panel.add(lblsbtlsNoviembre);
		
		JScrollPane scrollPaneNoviembre = new JScrollPane();
		scrollPaneNoviembre.setBounds(20, 2000, 707, 124);
		panel.add(scrollPaneNoviembre);
		
		tableNoviembre = new TableStandard();
		String ColumnsNoviembre[] = new String[] {"Id", "Categoria", "Sub Categoria", "Detalle", "Importe"};
		tableNoviembre.setColums(ColumnsNoviembre);
		scrollPaneNoviembre.setViewportView(tableNoviembre);
		
		LabelSubtitulos lblsbtlsDiciembre = new LabelSubtitulos((String) null);
		lblsbtlsDiciembre.setText("Diciembre");
		lblsbtlsDiciembre.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsDiciembre.setBounds(0, 2135, 748, 23);
		panel.add(lblsbtlsDiciembre);
		
		JScrollPane scrollPaneDiciembre = new JScrollPane();
		scrollPaneDiciembre.setBounds(20, 2168, 707, 124);
		panel.add(scrollPaneDiciembre);
		
		tableDiciembre = new TableStandard();
		String ColumnsDiciembre[] = new String[] {"Id", "Categoria", "Sub Categoria", "Detalle", "Importe"};
		tableDiciembre.setColums(ColumnsDiciembre);
		scrollPaneDiciembre.setViewportView(tableDiciembre);
		
		monthMes = new JMonthChooser();
		monthMes.getComboBox().setFont(new Font("Dialog", Font.PLAIN, 12));
		monthMes.setMonth(0);
		monthMes.setBounds(448, 165, 112, 25);
		panel.add(monthMes);
		
		yearChooserPago = new JYearChooser();
		yearChooserPago.getSpinner().setFont(new Font("Dialog", Font.PLAIN, 12));
		yearChooserPago.setYear(2022);
		yearChooserPago.setBounds(321, 165, 72, 24);
		panel.add(yearChooserPago);
		
		yearBuscar = new JYearChooser();
		yearBuscar.getSpinner().setFont(new Font("Dialog", Font.PLAIN, 12));
		yearBuscar.setYear(2022);
		yearBuscar.setBounds(152, 252, 72, 24);
		panel.add(yearBuscar);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(627, 262, 100, 30);
		btnEliminar.addActionListener(control);
		panel.add(btnEliminar);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(517, 262, 100, 30);
		btnModificar.addActionListener(control);
		panel.add(btnModificar);
		
		actualizarVista();

	}
	
	public void actualizarVista() {
		control.LlenarTablas();
		vaciarFormulario();
	}
	
	public boolean camposVacios() {
		
		if(comCategoria.getSelectedIndex() <= -1) {
			return false;
		}else if(comSubCategoria.getSelectedIndex() <= -1) {
			return false;
		}else if(txtDetalles.getText().length() <= 0) {
			return false;
		}else if(txtImporte.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	public void vaciarFormulario() {
		id = 0L;
		comCategoria.setSelectedIndex(-1);
		comSubCategoria.setSelectedIndex(-1);
		txtDetalles.setText("");
		txtImporte.setText("");
		getYearChooserPago().setYear(2022);
		monthMes.setMonth(0);
		
	}
	
	public void cargarForm(ControlGastosEntity record) {
		
		id = record.getId();
		comCategoria.setSelectedItem(record.getCategoria());;
		comSubCategoria.setSelectedItem(record.getSubCategoria());
		txtDetalles.setText(record.getDetalle());
		txtImporte.setText(""+ record.getImporte());
		getYearChooserPago().setYear(record.getAnio());
		monthMes.setMonth(record.getMes());
		
	}
	
	
	public DefaultTableModel getModelEnero() {
		return tableEnero.getModel();
	}
	
	public DefaultTableModel getModelFebrero() {
		return tableFebrero.getModel();
	}
	
	public DefaultTableModel getModelMarzo() {
		return tableMarzo.getModel();
	}
	
	public DefaultTableModel getModelAbril() {
		return tableAbril.getModel();
	}
	
	public DefaultTableModel getModelMayo() {
		return tableMayo.getModel();
	}
	
	public DefaultTableModel getModelJunio() {
		return tableJunio.getModel();
	}
	
	public DefaultTableModel getModelJulio() {
		return tableJulio.getModel();
	}
	
	public DefaultTableModel getModelAgosto() {
		return tableAgosto.getModel();
	}
	
	public DefaultTableModel getModelSeptiembre() {
		return tableSeptiembre.getModel();
	}
	
	public DefaultTableModel getModelOctubre() {
		return tableOctubre.getModel();
	}
	
	public DefaultTableModel getModelNoviembre() {
		return tableNoviembre.getModel();
	}
	
	public DefaultTableModel getModelDiciembre() {
		return tableDiciembre.getModel();
	}

	public ControladorControlGastos getControl() {
		return control;
	}

	public void setControl(ControladorControlGastos control) {
		this.control = control;
	}

	public JTextField getTxtDetalles() {
		return txtDetalles;
	}

	public void setTxtDetalles(JTextField txtDetalles) {
		this.txtDetalles = txtDetalles;
	}

	public TableStandard getTableEnero() {
		return tableEnero;
	}

	public void setTableEnero(TableStandard tableEnero) {
		this.tableEnero = tableEnero;
	}

	public TableStandard getTableFebrero() {
		return tableFebrero;
	}

	public void setTableFebrero(TableStandard tableFebrero) {
		this.tableFebrero = tableFebrero;
	}

	public TableStandard getTableMarzo() {
		return tableMarzo;
	}

	public void setTableMarzo(TableStandard tableMarzo) {
		this.tableMarzo = tableMarzo;
	}

	public TableStandard getTableAbril() {
		return tableAbril;
	}

	public void setTableAbril(TableStandard tableAbril) {
		this.tableAbril = tableAbril;
	}

	public TableStandard getTableMayo() {
		return tableMayo;
	}

	public void setTableMayo(TableStandard tableMayo) {
		this.tableMayo = tableMayo;
	}

	public TableStandard getTableJunio() {
		return tableJunio;
	}

	public void setTableJunio(TableStandard tableJunio) {
		this.tableJunio = tableJunio;
	}

	public TableStandard getTableJulio() {
		return tableJulio;
	}

	public void setTableJulio(TableStandard tableJulio) {
		this.tableJulio = tableJulio;
	}

	public TableStandard getTableAgosto() {
		return tableAgosto;
	}

	public void setTableAgosto(TableStandard tableAgosto) {
		this.tableAgosto = tableAgosto;
	}

	public TableStandard getTableSeptiembre() {
		return tableSeptiembre;
	}

	public void setTableSeptiembre(TableStandard tableSeptiembre) {
		this.tableSeptiembre = tableSeptiembre;
	}

	public TableStandard getTableOctubre() {
		return tableOctubre;
	}

	public void setTableOctubre(TableStandard tableOctubre) {
		this.tableOctubre = tableOctubre;
	}

	public TableStandard getTableNoviembre() {
		return tableNoviembre;
	}

	public void setTableNoviembre(TableStandard tableNoviembre) {
		this.tableNoviembre = tableNoviembre;
	}

	public TableStandard getTableDiciembre() {
		return tableDiciembre;
	}

	public void setTableDiciembre(TableStandard tableDiciembre) {
		this.tableDiciembre = tableDiciembre;
	}

	public JYearChooser getYearChooserPago() {
		return yearChooserPago;
	}

	public void setYearChooserPago(JYearChooser yearChooserPago) {
		this.yearChooserPago = yearChooserPago;
	}

	public JMonthChooser getMonthMes() {
		return monthMes;
	}

	public void setMonthMes(JMonthChooser monthMes) {
		this.monthMes = monthMes;
	}

	public TextSoloNumeros getTextSoloNumeros() {
		return txtImporte;
	}

	public void setTextSoloNumeros(TextSoloNumeros textSoloNumeros) {
		this.txtImporte = textSoloNumeros;
	}

	public JComboBox getComCategoria() {
		return comCategoria;
	}

	public void setComCategoria(JComboBox comCategoria) {
		this.comCategoria = comCategoria;
	}

	public JComboBox getComSubCategoria() {
		return comSubCategoria;
	}

	public void setComSubCategoria(JComboBox comSubCategoria) {
		this.comSubCategoria = comSubCategoria;
	}

	public StandarButton getStndrbtnGuardar() {
		return btnGuardar;
	}

	public void setStndrbtnGuardar(StandarButton stndrbtnGuardar) {
		this.btnGuardar = stndrbtnGuardar;
	}

	public TextSoloNumeros getTxtImporte() {
		return txtImporte;
	}

	public void setTxtImporte(TextSoloNumeros txtImporte) {
		this.txtImporte = txtImporte;
	}

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public StandarButton getStndrbtnBuscar() {
		return stndrbtnBuscar;
	}

	public void setStndrbtnBuscar(StandarButton stndrbtnBuscar) {
		this.stndrbtnBuscar = stndrbtnBuscar;
	}

	public JYearChooser getYearBuscar() {
		return yearBuscar;
	}

	public void setYearBuscar(JYearChooser yearBuscar) {
		this.yearBuscar = yearBuscar;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public StandarButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(StandarButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public StandarButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(StandarButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}
}
