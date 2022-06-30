/**
 * 
 */
package CuartoMedio.GestionDeBodega.Inventario;

import ui.SingleAsignature.SingleAsignature;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.ControladorHonorarios;
import ui.Labels.LabelTitulos;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;
import javax.swing.JSeparator;
import javax.swing.JTable;
import ui.TablaUi.TableStandard;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;


public class VistaInventario extends JPanel {

	private ControladorInventario controlador;
	private TableStandard tableAlimentosBebidas;
	private TableStandard tableMaterialesOficina;
	private StandarButton btnGuardar;
	private JTextField txtId;
	private JComboBox comboBoxTipoProducto;
	private JTextField txtInsumo;
	private TextSoloNumeros txtValorUnitario;
	private TextSoloNumeros txtStockReal;
	private JComboBox comboBoxUM;
	
	public VistaInventario() {
		
	controlador = new ControladorInventario(this);
	
	setOpaque(false);
	setBounds(0, 0, 748, 722);
	setLayout(null);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setOpaque(false);
	scrollPane.setBounds(0, 0, 767, 722);
	add(scrollPane);
	
	JPanel panel = new JPanel();
	panel.setBackground(new Color(59, 59, 59));
	panel.setPreferredSize(new Dimension(748, 1700));
	scrollPane.setViewportView(panel);
	panel.setLayout(null);
	
	LabelTitulos lbltlsInventario = new LabelTitulos((String) null);
	lbltlsInventario.setHorizontalAlignment(SwingConstants.CENTER);
	lbltlsInventario.setText("Inventario");
	lbltlsInventario.setBounds(0, 60, 748, 30);
	panel.add(lbltlsInventario);
	
	LabelSubtitulos lblsbtlsTipoDeProducto = new LabelSubtitulos((String) null);
	lblsbtlsTipoDeProducto.setText("Tipo de Producto");
	lblsbtlsTipoDeProducto.setBounds(25, 160, 120, 23);
	panel.add(lblsbtlsTipoDeProducto);
	
	comboBoxTipoProducto = new JComboBox();
	comboBoxTipoProducto.setModel(new DefaultComboBoxModel(new String[] {"Alimento y Bebidas", "Materiales de Oficina", "Materiales electricos", "Materiales, Repuestos y diversos Utiles de Mantencion y Reparacion"}));
	comboBoxTipoProducto.setBounds(138, 160, 585, 22);
	panel.add(comboBoxTipoProducto);
	
	LabelSubtitulos lblsbtlsInsumo = new LabelSubtitulos((String) null);
	lblsbtlsInsumo.setText("Insumo");
	lblsbtlsInsumo.setBounds(25, 210, 119, 23);
	panel.add(lblsbtlsInsumo);
	
	txtInsumo = new JTextField();
	txtInsumo.setBounds(138, 210, 329, 23);
	panel.add(txtInsumo);
	txtInsumo.setColumns(10);
	
	LabelSubtitulos lblsbtlsUnidadMedida = new LabelSubtitulos((String) null);
	lblsbtlsUnidadMedida.setText("Unidad Medida");
	lblsbtlsUnidadMedida.setBounds(487, 210, 109, 23);
	panel.add(lblsbtlsUnidadMedida);
	
	comboBoxUM = new JComboBox();
	comboBoxUM.setModel(new DefaultComboBoxModel(new String[] {"C/U", "Paquete", "Kilo", "Metro"}));
	comboBoxUM.setBounds(598, 210, 125, 23);
	panel.add(comboBoxUM);
	
	LabelSubtitulos lblsbtlsStockReal = new LabelSubtitulos((String) null);
	lblsbtlsStockReal.setText("Stock Real");
	lblsbtlsStockReal.setBounds(25, 260, 119, 23);
	panel.add(lblsbtlsStockReal);
	
	txtStockReal = new TextSoloNumeros();
	txtStockReal.setBounds(138, 260, 103, 23);
	panel.add(txtStockReal);
	
	LabelSubtitulos lblsbtlsValorUnitario = new LabelSubtitulos((String) null);
	lblsbtlsValorUnitario.setText("Valor Unitario");
	lblsbtlsValorUnitario.setBounds(251, 260, 119, 23);
	panel.add(lblsbtlsValorUnitario);
	
	txtValorUnitario = new TextSoloNumeros();
	txtValorUnitario.setBounds(364, 260, 103, 23);
	panel.add(txtValorUnitario);
	
	btnGuardar = new StandarButton((String) null);
	btnGuardar.setText("Guardar");
	btnGuardar.setBounds(623, 260, 100, 23);
	btnGuardar.addActionListener(controlador);
	panel.add(btnGuardar);
	
	LabelSubtitulos lblsbtlsAlimentosYBebidas = new LabelSubtitulos((String) null);
	lblsbtlsAlimentosYBebidas.setHorizontalAlignment(SwingConstants.CENTER);
	lblsbtlsAlimentosYBebidas.setText("Alimentos y Bebidas");
	lblsbtlsAlimentosYBebidas.setBounds(0, 332, 748, 23);
	panel.add(lblsbtlsAlimentosYBebidas);
	
	JSeparator separator = new JSeparator();
	separator.setForeground(Color.WHITE);
	separator.setBounds(0, 312, 748, 9);
	panel.add(separator);
	
	JScrollPane scrollPaneAlimentosBebidas = new JScrollPane();
	scrollPaneAlimentosBebidas.setBounds(25, 420, 698, 153);
	panel.add(scrollPaneAlimentosBebidas);
	
	tableAlimentosBebidas = new TableStandard();
	String[] columnsAlimBebidas = new String[] {"Id", "Insumo", "Unid. Medida", "Stock Real", "Salida Material", "Stock Actual", "Valor Unitario", "Valor Total"};
	tableAlimentosBebidas.setColums(columnsAlimBebidas);
	scrollPaneAlimentosBebidas.setViewportView(tableAlimentosBebidas);
	
	LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
	lblsbtlsTotal.setText("TOTAL");
	lblsbtlsTotal.setBounds(533, 584, 91, 23);
	panel.add(lblsbtlsTotal);
	
	TextSoloNumeros textSoloNumeros_2 = new TextSoloNumeros();
	textSoloNumeros_2.setBounds(620, 584, 103, 23);
	panel.add(textSoloNumeros_2);
	
	StandarButton stndrbtnModificar = new StandarButton((String) null);
	stndrbtnModificar.setText("Modificar");
	stndrbtnModificar.setBounds(25, 585, 109, 30);
	panel.add(stndrbtnModificar);
	
	StandarButton stndrbtnEliminar = new StandarButton((String) null);
	stndrbtnEliminar.setText("Eliminar");
	stndrbtnEliminar.setBounds(151, 585, 109, 30);
	panel.add(stndrbtnEliminar);
	
	LabelSubtitulos lblsbtlsSalida = new LabelSubtitulos((String) null);
	lblsbtlsSalida.setText("Salida Material");
	lblsbtlsSalida.setBounds(25, 386, 120, 23);
	panel.add(lblsbtlsSalida);
	
	TextSoloNumeros txtSalidaMaterialAB = new TextSoloNumeros();
	txtSalidaMaterialAB.setBounds(138, 386, 78, 23);
	panel.add(txtSalidaMaterialAB);
	
	StandarButton btnAgregarAlimentoBebida = new StandarButton((String) null);
	btnAgregarAlimentoBebida.setText("Agregar");
	btnAgregarAlimentoBebida.setBounds(237, 386, 103, 23);
	panel.add(btnAgregarAlimentoBebida);
	
	LabelSubtitulos lblMaterialOficina = new LabelSubtitulos((String) null);
	lblMaterialOficina.setText("Materiales de Oficina");
	lblMaterialOficina.setHorizontalAlignment(SwingConstants.CENTER);
	lblMaterialOficina.setBounds(0, 642, 748, 23);
	panel.add(lblMaterialOficina);
	
	LabelSubtitulos lblsbtlsSalida_1 = new LabelSubtitulos((String) null);
	lblsbtlsSalida_1.setText("Salida Material");
	lblsbtlsSalida_1.setBounds(25, 696, 120, 23);
	panel.add(lblsbtlsSalida_1);
	
	TextSoloNumeros textSoloNumeros_3_1 = new TextSoloNumeros();
	textSoloNumeros_3_1.setBounds(138, 696, 78, 23);
	panel.add(textSoloNumeros_3_1);
	
	StandarButton stndrbtnAgregar_1 = new StandarButton((String) null);
	stndrbtnAgregar_1.setText("Agregar");
	stndrbtnAgregar_1.setBounds(237, 696, 103, 23);
	panel.add(stndrbtnAgregar_1);
	
	JScrollPane scrollPaneMaterialesOficina = new JScrollPane();
	scrollPaneMaterialesOficina.setBounds(25, 730, 698, 153);
	panel.add(scrollPaneMaterialesOficina);
	
	tableMaterialesOficina = new TableStandard();
	String[] columnsMateOficina = new String[] {"Id", "Insumo", "Unid. Medida", "Stock Real", "Salida Material", "Stock Actual", "Valor Unitario", "Valor Total"};
	tableMaterialesOficina.setColums(columnsMateOficina);
	scrollPaneMaterialesOficina.setViewportView(tableMaterialesOficina);
	
	StandarButton stndrbtnModificar_1 = new StandarButton((String) null);
	stndrbtnModificar_1.setText("Modificar");
	stndrbtnModificar_1.setBounds(25, 894, 109, 30);
	panel.add(stndrbtnModificar_1);
	
	StandarButton stndrbtnEliminar_1 = new StandarButton((String) null);
	stndrbtnEliminar_1.setText("Eliminar");
	stndrbtnEliminar_1.setBounds(151, 894, 109, 30);
	panel.add(stndrbtnEliminar_1);
	
	LabelSubtitulos lblsbtlsTotal_1 = new LabelSubtitulos((String) null);
	lblsbtlsTotal_1.setText("TOTAL");
	lblsbtlsTotal_1.setBounds(533, 894, 91, 23);
	panel.add(lblsbtlsTotal_1);
	
	TextSoloNumeros textSoloNumeros_2_1 = new TextSoloNumeros();
	textSoloNumeros_2_1.setBounds(620, 894, 103, 23);
	panel.add(textSoloNumeros_2_1);
	
	JSeparator separator_1 = new JSeparator();
	separator_1.setForeground(Color.WHITE);
	separator_1.setBounds(0, 630, 748, 9);
	panel.add(separator_1);
	
	LabelSubtitulos lblsbtlsMaterialesElectricos = new LabelSubtitulos((String) null);
	lblsbtlsMaterialesElectricos.setText("Materiales Electricos");
	lblsbtlsMaterialesElectricos.setHorizontalAlignment(SwingConstants.CENTER);
	lblsbtlsMaterialesElectricos.setBounds(0, 955, 748, 23);
	panel.add(lblsbtlsMaterialesElectricos);
	
	LabelSubtitulos lblsbtlsSalida_2 = new LabelSubtitulos((String) null);
	lblsbtlsSalida_2.setText("Salida Material");
	lblsbtlsSalida_2.setBounds(25, 1009, 120, 23);
	panel.add(lblsbtlsSalida_2);
	
	TextSoloNumeros txtSalidaMaterialAB_1 = new TextSoloNumeros();
	txtSalidaMaterialAB_1.setBounds(138, 1009, 78, 23);
	panel.add(txtSalidaMaterialAB_1);
	
	StandarButton btnAgregarAlimentoBebida_1 = new StandarButton((String) null);
	btnAgregarAlimentoBebida_1.setText("Agregar");
	btnAgregarAlimentoBebida_1.setBounds(237, 1009, 103, 23);
	panel.add(btnAgregarAlimentoBebida_1);
	
	JScrollPane scrollPaneMaterialesElect = new JScrollPane();
	scrollPaneMaterialesElect.setBounds(25, 1043, 698, 153);
	panel.add(scrollPaneMaterialesElect);
	
	StandarButton stndrbtnModificar_2 = new StandarButton((String) null);
	stndrbtnModificar_2.setText("Modificar");
	stndrbtnModificar_2.setBounds(25, 1208, 109, 30);
	panel.add(stndrbtnModificar_2);
	
	StandarButton stndrbtnEliminar_2 = new StandarButton((String) null);
	stndrbtnEliminar_2.setText("Eliminar");
	stndrbtnEliminar_2.setBounds(151, 1208, 109, 30);
	panel.add(stndrbtnEliminar_2);
	
	LabelSubtitulos lblsbtlsTotal_2 = new LabelSubtitulos((String) null);
	lblsbtlsTotal_2.setText("TOTAL");
	lblsbtlsTotal_2.setBounds(533, 1208, 91, 23);
	panel.add(lblsbtlsTotal_2);
	
	TextSoloNumeros textSoloNumeros_2_2 = new TextSoloNumeros();
	textSoloNumeros_2_2.setBounds(620, 1208, 103, 23);
	panel.add(textSoloNumeros_2_2);
	
	JSeparator separator_1_1 = new JSeparator();
	separator_1_1.setForeground(Color.WHITE);
	separator_1_1.setBounds(0, 940, 748, 9);
	panel.add(separator_1_1);
	
	JSeparator separator_2 = new JSeparator();
	separator_2.setForeground(Color.WHITE);
	separator_2.setBounds(0, 1253, 748, 9);
	panel.add(separator_2);
	
	LabelSubtitulos lblsbtlsMaterialesRepuestosY = new LabelSubtitulos((String) null);
	lblsbtlsMaterialesRepuestosY.setText("Materiales, repuestos y utiles diversos para Mantencion y Reparacion");
	lblsbtlsMaterialesRepuestosY.setHorizontalAlignment(SwingConstants.CENTER);
	lblsbtlsMaterialesRepuestosY.setBounds(0, 1275, 748, 23);
	panel.add(lblsbtlsMaterialesRepuestosY);
	
	LabelSubtitulos lblsbtlsSalida_3 = new LabelSubtitulos((String) null);
	lblsbtlsSalida_3.setText("Salida Material");
	lblsbtlsSalida_3.setBounds(25, 1330, 120, 23);
	panel.add(lblsbtlsSalida_3);
	
	TextSoloNumeros txtSalidaMaterialAB_2 = new TextSoloNumeros();
	txtSalidaMaterialAB_2.setBounds(138, 1330, 78, 23);
	panel.add(txtSalidaMaterialAB_2);
	
	StandarButton btnAgregarAlimentoBebida_2 = new StandarButton((String) null);
	btnAgregarAlimentoBebida_2.setText("Agregar");
	btnAgregarAlimentoBebida_2.setBounds(237, 1330, 103, 23);
	panel.add(btnAgregarAlimentoBebida_2);
	
	JScrollPane scrollPaneAlimentosBebidas_1 = new JScrollPane();
	scrollPaneAlimentosBebidas_1.setBounds(25, 1364, 698, 153);
	panel.add(scrollPaneAlimentosBebidas_1);
	
	StandarButton stndrbtnModificar_3 = new StandarButton((String) null);
	stndrbtnModificar_3.setText("Modificar");
	stndrbtnModificar_3.setBounds(25, 1529, 109, 30);
	panel.add(stndrbtnModificar_3);
	
	StandarButton stndrbtnEliminar_3 = new StandarButton((String) null);
	stndrbtnEliminar_3.setText("Eliminar");
	stndrbtnEliminar_3.setBounds(151, 1529, 109, 30);
	panel.add(stndrbtnEliminar_3);
	
	LabelSubtitulos lblsbtlsTotal_3 = new LabelSubtitulos((String) null);
	lblsbtlsTotal_3.setText("TOTAL");
	lblsbtlsTotal_3.setBounds(533, 1529, 91, 23);
	panel.add(lblsbtlsTotal_3);
	
	TextSoloNumeros textSoloNumeros_2_3 = new TextSoloNumeros();
	textSoloNumeros_2_3.setBounds(620, 1529, 103, 23);
	panel.add(textSoloNumeros_2_3);
	
	txtId = new JTextField();
	txtId.setBounds(25, 101, 86, 20);
	panel.add(txtId);
	txtId.setColumns(10);
	
		
	}
	
	public void ActualizarVista() {
		VaciarForm();
		//cpc.LlenarTabla();
		
	}
	
	public boolean camposVacios(){
		
		if(txtInsumo.getText().length() <= 0) {
			return false;
		}else if(txtStockReal.getText().length() <= 0) {
			return false;
		}else if(txtValorUnitario.getText().length() <= 0) {
			return false;
		}
		
		return true;
		
	}
	
	public void VaciarForm(){
		
		comboBoxTipoProducto.setSelectedIndex(0);
		txtInsumo.setText("");
		comboBoxUM.setSelectedIndex(0);
		txtStockReal.setText("");
		txtValorUnitario.setText("");
		txtId.setText("");
		
	}

	public TableStandard getTableAlimentosBebidas() {
		return tableAlimentosBebidas;
	}

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setTableAlimentosBebidas(TableStandard tableAlimentosBebidas) {
		this.tableAlimentosBebidas = tableAlimentosBebidas;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public TableStandard getTableMaterialesOficina() {
		return tableMaterialesOficina;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public JComboBox getComboBoxTipoProducto() {
		return comboBoxTipoProducto;
	}

	public JTextField getTxtInsumo() {
		return txtInsumo;
	}

	public TextSoloNumeros getTxtValorUnitario() {
		return txtValorUnitario;
	}

	public TextSoloNumeros getTxtStockReal() {
		return txtStockReal;
	}

	public JComboBox getComboBoxUM() {
		return comboBoxUM;
	}

	public void setTableMaterialesOficina(TableStandard tableMaterialesOficina) {
		this.tableMaterialesOficina = tableMaterialesOficina;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public void setComboBoxTipoProducto(JComboBox comboBoxTipoProducto) {
		this.comboBoxTipoProducto = comboBoxTipoProducto;
	}

	public void setTxtInsumo(JTextField txtInsumo) {
		this.txtInsumo = txtInsumo;
	}

	public void setTxtValorUnitario(TextSoloNumeros txtValorUnitario) {
		this.txtValorUnitario = txtValorUnitario;
	}

	public void setTxtStockReal(TextSoloNumeros txtStockReal) {
		this.txtStockReal = txtStockReal;
	}

	public void setComboBoxUM(JComboBox comboBoxUM) {
		this.comboBoxUM = comboBoxUM;
	}
}
