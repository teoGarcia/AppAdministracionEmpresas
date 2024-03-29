/**
 * 
 */
package TerceroMedio.GestionDeBodega.ControlInventario;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import ui.Labels.LabelTitulos;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;
import javax.swing.JSeparator;
import ui.TablaUi.TableStandard;
import javax.swing.table.DefaultTableModel;


public class VistaControlInventario extends JPanel {

	private ControladorControlInventario controlador;
	private TableStandard tableAlimentosBebidas;
	private TableStandard tableMaterialesOficina;
	private TableStandard tableMaterialesElectricos;
	private TableStandard tableMaterialesDiversos;
	private StandarButton btnGuardar;
	private JTextField txtId;
	private JComboBox comboBoxTipoProducto;
	private JTextField txtInsumo;
	private TextSoloNumeros txtValorUnitario;
	private TextSoloNumeros txtStockReal;
	private JComboBox comboBoxUM;
	private TextSoloNumeros txtTotalAlimBeb;
	private TextSoloNumeros txtTotalMatOfi;
	private TextSoloNumeros txtTotalMatElec;
	private TextSoloNumeros txtTotalMatDiv;
	private StandarButton btnModificarAB;
	private StandarButton btnEliminarAB;
	private StandarButton btnModificarMO;
	private StandarButton btnEliminarMO;
	private StandarButton btnModificarME;
	private StandarButton btnEliminarME;
	private StandarButton btnModificarMD;
	private StandarButton btnEliminarMD;
	private StandarButton btnImprimirMD;
	private StandarButton btnImprimirME;
	private StandarButton btnImprimirMO;
	private StandarButton btnImprimirAB;
	
	public VistaControlInventario() {
		
	controlador = new ControladorControlInventario(this);
	
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
	String[] columnsAlimBebidas = new String[] {"Id", "Insumo", "Unid. Medida", "Stock Real", "Stock Actual", "Valor Unitario", "Valor Total"};
	tableAlimentosBebidas.setColums(columnsAlimBebidas);
	scrollPaneAlimentosBebidas.setViewportView(tableAlimentosBebidas);
	
	LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
	lblsbtlsTotal.setText("TOTAL");
	lblsbtlsTotal.setBounds(533, 584, 91, 23);
	panel.add(lblsbtlsTotal);
	
	txtTotalAlimBeb = new TextSoloNumeros();
	txtTotalAlimBeb.setBounds(620, 584, 103, 23);
	panel.add(txtTotalAlimBeb);
	
	btnModificarAB = new StandarButton((String) null);
	btnModificarAB.setText("Modificar");
	btnModificarAB.setBounds(25, 585, 109, 30);
	btnModificarAB.addActionListener(controlador);
	panel.add(btnModificarAB);
	
	btnEliminarAB = new StandarButton((String) null);
	btnEliminarAB.setText("Eliminar");
	btnEliminarAB.setBounds(151, 585, 109, 30);
	btnEliminarAB.addActionListener(controlador);
	panel.add(btnEliminarAB);
	
	LabelSubtitulos lblMaterialOficina = new LabelSubtitulos((String) null);
	lblMaterialOficina.setText("Materiales de Oficina");
	lblMaterialOficina.setHorizontalAlignment(SwingConstants.CENTER);
	lblMaterialOficina.setBounds(0, 642, 748, 23);
	panel.add(lblMaterialOficina);
	
	JScrollPane scrollPaneMaterialesOficina = new JScrollPane();
	scrollPaneMaterialesOficina.setBounds(25, 730, 698, 153);
	panel.add(scrollPaneMaterialesOficina);
	
	tableMaterialesOficina = new TableStandard();
	String[] columnsMateOficina = new String[] {"Id", "Insumo", "Unid. Medida", "Stock Real", "Stock Actual", "Valor Unitario", "Valor Total"};
	tableMaterialesOficina.setColums(columnsMateOficina);
	scrollPaneMaterialesOficina.setViewportView(tableMaterialesOficina);
	
	btnModificarMO = new StandarButton((String) null);
	btnModificarMO.setText("Modificar");
	btnModificarMO.setBounds(25, 894, 109, 30);
	btnModificarMO.addActionListener(controlador);
	panel.add(btnModificarMO);
	
	btnEliminarMO = new StandarButton((String) null);
	btnEliminarMO.setText("Eliminar");
	btnEliminarMO.setBounds(151, 894, 109, 30);
	btnEliminarMO.addActionListener(controlador);
	panel.add(btnEliminarMO);
	
	LabelSubtitulos lblsbtlsTotal_1 = new LabelSubtitulos((String) null);
	lblsbtlsTotal_1.setText("TOTAL");
	lblsbtlsTotal_1.setBounds(533, 894, 91, 23);
	panel.add(lblsbtlsTotal_1);
	
	txtTotalMatOfi = new TextSoloNumeros();
	txtTotalMatOfi.setBounds(620, 894, 103, 23);
	panel.add(txtTotalMatOfi);
	
	JSeparator separator_1 = new JSeparator();
	separator_1.setForeground(Color.WHITE);
	separator_1.setBounds(0, 630, 748, 9);
	panel.add(separator_1);
	
	LabelSubtitulos lblsbtlsMaterialesElectricos = new LabelSubtitulos((String) null);
	lblsbtlsMaterialesElectricos.setText("Materiales Electricos");
	lblsbtlsMaterialesElectricos.setHorizontalAlignment(SwingConstants.CENTER);
	lblsbtlsMaterialesElectricos.setBounds(0, 955, 748, 23);
	panel.add(lblsbtlsMaterialesElectricos);
	
	JScrollPane scrollPaneMaterialesElect = new JScrollPane();
	scrollPaneMaterialesElect.setBounds(25, 1043, 698, 153);
	panel.add(scrollPaneMaterialesElect);

	tableMaterialesElectricos = new TableStandard();
	String[] columnsMateElectricos = new String[] {"Id", "Insumo", "Unid. Medida", "Stock Real", "Stock Actual", "Valor Unitario", "Valor Total"};
	tableMaterialesElectricos.setColums(columnsMateElectricos);
	scrollPaneMaterialesElect.setViewportView(tableMaterialesElectricos);
	
	btnModificarME = new StandarButton((String) null);
	btnModificarME.setText("Modificar");
	btnModificarME.setBounds(25, 1208, 109, 30);
	btnModificarME.addActionListener(controlador);
	panel.add(btnModificarME);
	
	btnEliminarME = new StandarButton((String) null);
	btnEliminarME.setText("Eliminar");
	btnEliminarME.setBounds(151, 1208, 109, 30);
	btnEliminarME.addActionListener(controlador);
	panel.add(btnEliminarME);
	
	LabelSubtitulos lblsbtlsTotal_2 = new LabelSubtitulos((String) null);
	lblsbtlsTotal_2.setText("TOTAL");
	lblsbtlsTotal_2.setBounds(533, 1208, 91, 23);
	panel.add(lblsbtlsTotal_2);
	
	txtTotalMatElec = new TextSoloNumeros();
	txtTotalMatElec.setBounds(620, 1208, 103, 23);
	panel.add(txtTotalMatElec);
	
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
	
	JScrollPane scrollPaneMaterialesDiversos = new JScrollPane();
	scrollPaneMaterialesDiversos.setBounds(25, 1364, 698, 153);
	panel.add(scrollPaneMaterialesDiversos);
	
	tableMaterialesDiversos = new TableStandard();
	String[] columnsMaterialesDiversos = new String[] {"Id", "Insumo", "Unid. Medida", "Stock Real", "Stock Actual", "Valor Unitario", "Valor Total"};
	tableMaterialesDiversos.setColums(columnsMaterialesDiversos);
	scrollPaneMaterialesDiversos.setViewportView(tableMaterialesDiversos);
	
	btnModificarMD = new StandarButton((String) null);
	btnModificarMD.setText("Modificar");
	btnModificarMD.setBounds(25, 1529, 109, 30);
	btnModificarMD.addActionListener(controlador);
	panel.add(btnModificarMD);
	
	btnEliminarMD = new StandarButton((String) null);
	btnEliminarMD.setText("Eliminar");
	btnEliminarMD.setBounds(151, 1529, 109, 30);
	btnEliminarMD.addActionListener(controlador);
	panel.add(btnEliminarMD);
	
	LabelSubtitulos lblsbtlsTotal_3 = new LabelSubtitulos((String) null);
	lblsbtlsTotal_3.setText("TOTAL");
	lblsbtlsTotal_3.setBounds(533, 1529, 91, 23);
	panel.add(lblsbtlsTotal_3);
	
	txtTotalMatDiv = new TextSoloNumeros();
	txtTotalMatDiv.setBounds(620, 1529, 103, 23);
	panel.add(txtTotalMatDiv);
	
	txtId = new JTextField();
	txtId.setBounds(25, 101, 86, 20);
	panel.add(txtId);
	txtId.setColumns(10);
	
	btnImprimirAB = new StandarButton((String) null);
	btnImprimirAB.setText("Imprimir");
	btnImprimirAB.setBounds(279, 585, 109, 30);
	btnImprimirAB.addActionListener(controlador);
	panel.add(btnImprimirAB);
	
	btnImprimirMD = new StandarButton((String) null);
	btnImprimirMD.setText("Imprimir");
	btnImprimirMD.setBounds(279, 1529, 109, 30);
	btnImprimirMD.addActionListener(controlador);
	panel.add(btnImprimirMD);
	
	btnImprimirME = new StandarButton((String) null);
	btnImprimirME.setText("Imprimir");
	btnImprimirME.setBounds(279, 1208, 109, 30);
	btnImprimirME.addActionListener(controlador);
	panel.add(btnImprimirME);
	
	btnImprimirMO = new StandarButton((String) null);
	btnImprimirMO.setText("Imprimir");
	btnImprimirMO.setBounds(279, 894, 109, 30);
	btnImprimirMO.addActionListener(controlador);
	panel.add(btnImprimirMO);
	txtId.setVisible(false);
	
	ActualizarVista();
	
	}
	
	public void ActualizarVista() {
		VaciarForm();
		controlador.LlenarTabla();
		calcularTotales(tableAlimentosBebidas, txtTotalAlimBeb);
		calcularTotales(tableMaterialesOficina, txtTotalMatOfi);
		calcularTotales(tableMaterialesElectricos, txtTotalMatElec);
		calcularTotales(tableMaterialesDiversos, txtTotalMatDiv);
		
	}
	public void CargarFormAB(ControlInventarioEntity ape) {
		
		txtId.setText(""+ape.getId());
		
		comboBoxTipoProducto.setSelectedIndex(ape.getTipoProducto());
		txtInsumo.setText(ape.getInsumo());
		comboBoxUM.setSelectedIndex(ape.getUnidadMedida());
		txtStockReal.setText(""+ape.getStockReal());
		txtValorUnitario.setText(""+ape.getValorUnitario());
		
	}
	
	public void calcularTotales(TableStandard table, JTextField txt) {
		
		int t = 0;
		
		for(int i=0; i<table.getRowCount(); i++) {
			 t += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 6)));
		}
		
		txt.setText(""+t);
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
	
	public DefaultTableModel getModelAlimBebidas() {
		return tableAlimentosBebidas.getModel();
	}
	
	public DefaultTableModel getModelMatOficina() {
		return tableMaterialesOficina.getModel();
	}
	public DefaultTableModel getModelMatElectricos() {
		return tableMaterialesElectricos.getModel();
	}
	public DefaultTableModel getModelMatDiversos() {
		return tableMaterialesDiversos.getModel();
	}

	public TableStandard getTableMaterialesElectricos() {
		return tableMaterialesElectricos;
	}

	public TableStandard getTableMaterialesDiversos() {
		return tableMaterialesDiversos;
	}

	public TextSoloNumeros getTxtTotalAlimBeb() {
		return txtTotalAlimBeb;
	}

	public TextSoloNumeros getTxtTotalMatOfi() {
		return txtTotalMatOfi;
	}

	public TextSoloNumeros getTxtTotalMatElec() {
		return txtTotalMatElec;
	}

	public TextSoloNumeros getTxtTotalMatDiv() {
		return txtTotalMatDiv;
	}

	public void setTableMaterialesElectricos(TableStandard tableMaterialesElectricos) {
		this.tableMaterialesElectricos = tableMaterialesElectricos;
	}

	public void setTableMaterialesDiversos(TableStandard tableMaterialesDiversos) {
		this.tableMaterialesDiversos = tableMaterialesDiversos;
	}

	public void setTxtTotalAlimBeb(TextSoloNumeros txtTotalAlimBeb) {
		this.txtTotalAlimBeb = txtTotalAlimBeb;
	}

	public void setTxtTotalMatOfi(TextSoloNumeros txtTotalMatOfi) {
		this.txtTotalMatOfi = txtTotalMatOfi;
	}

	public void setTxtTotalMatElec(TextSoloNumeros txtTotalMatElec) {
		this.txtTotalMatElec = txtTotalMatElec;
	}

	public void setTxtTotalMatDiv(TextSoloNumeros txtTotalMatDiv) {
		this.txtTotalMatDiv = txtTotalMatDiv;
	}

	public StandarButton getBtnModificarAB() {
		return btnModificarAB;
	}

	public StandarButton getBtnEliminarAB() {
		return btnEliminarAB;
	}


	public void setBtnModificarAB(StandarButton btnModificarAB) {
		this.btnModificarAB = btnModificarAB;
	}

	public void setBtnEliminarAB(StandarButton btnEliminarAB) {
		this.btnEliminarAB = btnEliminarAB;
	}

	public StandarButton getBtnModificarMO() {
		return btnModificarMO;
	}

	public StandarButton getBtnEliminarMO() {
		return btnEliminarMO;
	}

	public StandarButton getBtnModificarME() {
		return btnModificarME;
	}

	public StandarButton getBtnEliminarME() {
		return btnEliminarME;
	}

	public StandarButton getBtnModificarMD() {
		return btnModificarMD;
	}

	public StandarButton getBtnEliminarMD() {
		return btnEliminarMD;
	}

	public void setBtnModificarMO(StandarButton btnModificarMO) {
		this.btnModificarMO = btnModificarMO;
	}

	public void setBtnEliminarMO(StandarButton btnEliminarMO) {
		this.btnEliminarMO = btnEliminarMO;
	}

	public void setBtnModificarME(StandarButton btnModificarME) {
		this.btnModificarME = btnModificarME;
	}

	public void setBtnEliminarME(StandarButton btnEliminarME) {
		this.btnEliminarME = btnEliminarME;
	}

	public void setBtnModificarMD(StandarButton btnModificarMD) {
		this.btnModificarMD = btnModificarMD;
	}

	public void setBtnEliminarMD(StandarButton btnEliminarMD) {
		this.btnEliminarMD = btnEliminarMD;
	}

	public StandarButton getBtnImprimirMD() {
		return btnImprimirMD;
	}

	public StandarButton getBtnImprimirME() {
		return btnImprimirME;
	}

	public StandarButton getBtnImprimirMO() {
		return btnImprimirMO;
	}

	public StandarButton getBtnImprimirAB() {
		return btnImprimirAB;
	}

	public void setBtnImprimirMD(StandarButton btnImprimirMD) {
		this.btnImprimirMD = btnImprimirMD;
	}

	public void setBtnImprimirME(StandarButton btnImprimirME) {
		this.btnImprimirME = btnImprimirME;
	}

	public void setBtnImprimirMO(StandarButton btnImprimirMO) {
		this.btnImprimirMO = btnImprimirMO;
	}

	public void setBtnImprimirAB(StandarButton btnImprimirAB) {
		this.btnImprimirAB = btnImprimirAB;
	}
}
