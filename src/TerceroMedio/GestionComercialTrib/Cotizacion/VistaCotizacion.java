package TerceroMedio.GestionComercialTrib.Cotizacion;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import TerceroMedio.GestionComercialTrib.Inventario.ControladorInventario;
import TerceroMedio.GestionComercialTrib.Inventario.InventarioEntity3;
import ui.Buttons.StandarButton;
import ui.Labels.LabelSubtitulos;
import ui.Labels.LabelTitulos;
import ui.TablaUi.TableStandard;
import ui.Texts.TextSoloNumeros;
import javax.swing.JFormattedTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JEditorPane;

public class VistaCotizacion extends JPanel {
	
	private ControladorInventario controlador;
	private TableStandard tableEmpresas;
	private TableStandard tableRegistrarCotizacion;
	private TableStandard tableMaterialesElectricos;
	private TableStandard tableRealizarCotizacion;
	private StandarButton btnGuardarEmp;
	private JTextField txtId;
	private JTextField txtInsumo;
	private JTextField txtSitioWeb;
	private TextSoloNumeros txtStockReal;
	private JTextField comboBoxUM;
	private TextSoloNumeros txtTotalMatOfi;
	private TextSoloNumeros txtTotalMatElec;
	private TextSoloNumeros txtTotalMatDiv;
	private StandarButton btnModificarEmpresa;
	private StandarButton btnEliminarEmpresa;
	private StandarButton btnModificarCotizacion;
	private StandarButton btnEliminarCotizacion;
	private StandarButton btnModificarME;
	private StandarButton btnEliminarME;
	private StandarButton btnModificarRealCoti;
	private StandarButton btnEliminarRealCotizacion;
	private StandarButton btnUsarDatosCotizacion;
	private StandarButton btnImprimirME;
	private StandarButton btnImprimirMO;
	private StandarButton btnUsarDatosEmpresa;
	private JTextField txtCorreo;
	private JTextField txtRutEmpCot;
	private JTextField txtRazonSocialEmpCot;
	private JTextField txtNumCotizacionEmpCot;
	private JTextField txtNumeroRegCotizacion;
	private JTextField txtDescripcion;

	/**
	 * Create the panel.
	 */
	public VistaCotizacion() {
		
		//controlador = new ControladorInventario(this);
		
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
		lbltlsInventario.setText("Empresas o Persona");
		lbltlsInventario.setBounds(0, 61, 748, 30);
		panel.add(lbltlsInventario);
		
		LabelSubtitulos lblsbtlsTipoDeProducto = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeProducto.setText("Razon Social / Nombre");
		lblsbtlsTipoDeProducto.setBounds(25, 129, 138, 23);
		panel.add(lblsbtlsTipoDeProducto);
		
		LabelSubtitulos lblsbtlsInsumo = new LabelSubtitulos((String) null);
		lblsbtlsInsumo.setText("Direcci\u00F3n");
		lblsbtlsInsumo.setBounds(25, 173, 119, 23);
		panel.add(lblsbtlsInsumo);
		
		txtInsumo = new JTextField();
		txtInsumo.setBounds(158, 173, 309, 23);
		panel.add(txtInsumo);
		txtInsumo.setColumns(10);
		
		LabelSubtitulos lblsbtlsUnidadMedida = new LabelSubtitulos((String) null);
		lblsbtlsUnidadMedida.setText("Comuna");
		lblsbtlsUnidadMedida.setBounds(487, 173, 61, 23);
		panel.add(lblsbtlsUnidadMedida);
		
		comboBoxUM = new JTextField();
		comboBoxUM.setBounds(558, 173, 165, 23);
		panel.add(comboBoxUM);
		
		LabelSubtitulos lblsbtlsStockReal = new LabelSubtitulos((String) null);
		lblsbtlsStockReal.setText("Telefono");
		lblsbtlsStockReal.setBounds(25, 213, 119, 23);
		panel.add(lblsbtlsStockReal);
		
		txtStockReal = new TextSoloNumeros();
		txtStockReal.setBounds(158, 213, 94, 23);
		panel.add(txtStockReal);
		
		LabelSubtitulos lblsbtlsValorUnitario = new LabelSubtitulos((String) null);
		lblsbtlsValorUnitario.setText("Sitio Web");
		lblsbtlsValorUnitario.setBounds(257, 213, 73, 23);
		panel.add(lblsbtlsValorUnitario);
		
		txtSitioWeb = new JTextField();
		txtSitioWeb.setBounds(329, 214, 138, 23);
		panel.add(txtSitioWeb);
		
		btnGuardarEmp = new StandarButton((String) null);
		btnGuardarEmp.setText("Guardar");
		btnGuardarEmp.setBounds(623, 255, 100, 25);
		btnGuardarEmp.addActionListener(controlador);
		panel.add(btnGuardarEmp);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 526, 748, 9);
		panel.add(separator);
		
		JScrollPane scrollPaneEmpresas = new JScrollPane();
		scrollPaneEmpresas.setBounds(25, 297, 698, 173);
		panel.add(scrollPaneEmpresas);
		
		tableEmpresas = new TableStandard();
		String[] columnsAlimBebidas = new String[] {"Id", "Razon Social", "Rut", "Giro", "Dirección", "Comuna", "Teléfono", "Sitio Web", "E-mail"};
		tableEmpresas.setColums(columnsAlimBebidas);
		scrollPaneEmpresas.setViewportView(tableEmpresas);
		
		btnModificarEmpresa = new StandarButton((String) null);
		btnModificarEmpresa.setText("Modificar");
		btnModificarEmpresa.setBounds(25, 481, 109, 30);
		btnModificarEmpresa.addActionListener(controlador);
		panel.add(btnModificarEmpresa);
		
		btnEliminarEmpresa = new StandarButton((String) null);
		btnEliminarEmpresa.setText("Eliminar");
		btnEliminarEmpresa.setBounds(151, 481, 109, 30);
		btnEliminarEmpresa.addActionListener(controlador);
		panel.add(btnEliminarEmpresa);
		
		btnUsarDatosEmpresa = new StandarButton((String) null);
		btnUsarDatosEmpresa.setText("Usar Datos");
		btnUsarDatosEmpresa.setBounds(279, 481, 109, 30);
		btnUsarDatosEmpresa.addActionListener(controlador);
		panel.add(btnUsarDatosEmpresa);
		
		JScrollPane scrollPaneRegistrarCotizacion = new JScrollPane();
		scrollPaneRegistrarCotizacion.setBounds(25, 748, 698, 153);
		panel.add(scrollPaneRegistrarCotizacion);
		
		tableRegistrarCotizacion = new TableStandard();
		String[] columnsMateOficina = new String[] {"Id", "ID Emp. o Per.", "Razon Social", "N° Cotización", "Fecha Emisión", "Valida Hasta"};
		tableRegistrarCotizacion.setColums(columnsMateOficina);
		scrollPaneRegistrarCotizacion.setViewportView(tableRegistrarCotizacion);
		
		btnModificarCotizacion = new StandarButton((String) null);
		btnModificarCotizacion.setText("Modificar");
		btnModificarCotizacion.setBounds(25, 915, 109, 30);
		btnModificarCotizacion.addActionListener(controlador);
		panel.add(btnModificarCotizacion);
		
		btnEliminarCotizacion = new StandarButton((String) null);
		btnEliminarCotizacion.setText("Eliminar");
		btnEliminarCotizacion.setBounds(151, 915, 109, 30);
		btnEliminarCotizacion.addActionListener(controlador);
		panel.add(btnEliminarCotizacion);
		
		JScrollPane scrollPaneRealizarCotizacion = new JScrollPane();
		scrollPaneRealizarCotizacion.setBounds(25, 1100, 698, 385);
		panel.add(scrollPaneRealizarCotizacion);
		
		tableRealizarCotizacion = new TableStandard();
		String[] columnsMaterialesDiversos = new String[] {"Id", "Descripción", "$ Valor Uni.", "Cantidad", "$ Neto", "$ IVA", "$ Total"};
		tableRealizarCotizacion.setColums(columnsMaterialesDiversos);
		scrollPaneRealizarCotizacion.setViewportView(tableRealizarCotizacion);
		
		btnModificarRealCoti = new StandarButton((String) null);
		btnModificarRealCoti.setText("Modificar");
		btnModificarRealCoti.setBounds(25, 1610, 109, 30);
		btnModificarRealCoti.addActionListener(controlador);
		panel.add(btnModificarRealCoti);
		
		btnEliminarRealCotizacion = new StandarButton((String) null);
		btnEliminarRealCotizacion.setText("Eliminar");
		btnEliminarRealCotizacion.setBounds(151, 1610, 109, 30);
		btnEliminarRealCotizacion.addActionListener(controlador);
		panel.add(btnEliminarRealCotizacion);
		
		btnUsarDatosCotizacion = new StandarButton((String) null);
		btnUsarDatosCotizacion.setText("Usar Datos");
		btnUsarDatosCotizacion.setBounds(279, 915, 109, 30);
		btnUsarDatosCotizacion.addActionListener(controlador);
		panel.add(btnUsarDatosCotizacion);
		
		txtId = new JTextField();
		txtId.setBounds(25, 60, 86, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		TextSoloNumeros txtRazonSocial = new TextSoloNumeros();
		txtRazonSocial.setText("");
		txtRazonSocial.setBounds(158, 129, 179, 23);
		panel.add(txtRazonSocial);
		
		LabelSubtitulos lblsbtlsRut = new LabelSubtitulos((String) null);
		lblsbtlsRut.setText("Rut");
		lblsbtlsRut.setBounds(347, 129, 39, 23);
		panel.add(lblsbtlsRut);
		
		JFormattedTextField txtRut = new JFormattedTextField();
		txtRut.setText("");
		txtRut.setBounds(384, 129, 109, 23);
		panel.add(txtRut);
		
		LabelSubtitulos lblsbtlsGiro = new LabelSubtitulos((String) null);
		lblsbtlsGiro.setText("Giro");
		lblsbtlsGiro.setBounds(510, 129, 39, 23);
		panel.add(lblsbtlsGiro);
		
		TextSoloNumeros txtGiro = new TextSoloNumeros();
		txtGiro.setText("");
		txtGiro.setBounds(558, 129, 165, 23);
		panel.add(txtGiro);
		
		LabelSubtitulos lblsbtlsEmail = new LabelSubtitulos((String) null);
		lblsbtlsEmail.setText("E-Mail");
		lblsbtlsEmail.setBounds(487, 213, 61, 23);
		panel.add(lblsbtlsEmail);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(558, 213, 165, 23);
		panel.add(txtCorreo);
		
		LabelTitulos lbltlsCotizacin = new LabelTitulos((String) null);
		lbltlsCotizacin.setText("Cotizaci\u00F3n");
		lbltlsCotizacin.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCotizacin.setBounds(0, 539, 748, 30);
		panel.add(lbltlsCotizacin);
		
		txtRutEmpCot = new JTextField();
		txtRutEmpCot.setBounds(578, 592, 145, 23);
		panel.add(txtRutEmpCot);
		
		LabelSubtitulos lblsbtlsRut_1 = new LabelSubtitulos((String) null);
		lblsbtlsRut_1.setText("Rut");
		lblsbtlsRut_1.setBounds(487, 591, 61, 23);
		panel.add(lblsbtlsRut_1);
		
		txtRazonSocialEmpCot = new JTextField();
		txtRazonSocialEmpCot.setText("");
		txtRazonSocialEmpCot.setBounds(329, 593, 153, 23);
		panel.add(txtRazonSocialEmpCot);
		
		LabelSubtitulos lblsbtlsRazonSocial = new LabelSubtitulos((String) null);
		lblsbtlsRazonSocial.setText("Razon Social");
		lblsbtlsRazonSocial.setBounds(242, 593, 100, 23);
		panel.add(lblsbtlsRazonSocial);
		
		TextSoloNumeros txtIDEmpCot = new TextSoloNumeros();
		txtIDEmpCot.setText("");
		txtIDEmpCot.setBounds(113, 592, 119, 23);
		panel.add(txtIDEmpCot);
		
		LabelSubtitulos lblsbtlsId = new LabelSubtitulos((String) null);
		lblsbtlsId.setText("ID");
		lblsbtlsId.setBounds(25, 592, 39, 23);
		panel.add(lblsbtlsId);
		
		txtNumCotizacionEmpCot = new JTextField();
		txtNumCotizacionEmpCot.setBounds(578, 630, 145, 23);
		panel.add(txtNumCotizacionEmpCot);
		
		LabelSubtitulos lblsbtlsNCotizacin = new LabelSubtitulos((String) null);
		lblsbtlsNCotizacin.setText("N\u00B0 Cotizaci\u00F3n");
		lblsbtlsNCotizacin.setBounds(487, 629, 94, 23);
		panel.add(lblsbtlsNCotizacin);
		
		LabelSubtitulos lblsbtlsValidaHasta = new LabelSubtitulos((String) null);
		lblsbtlsValidaHasta.setText("Valida Hasta");
		lblsbtlsValidaHasta.setBounds(242, 630, 89, 23);
		panel.add(lblsbtlsValidaHasta);
		
		LabelSubtitulos lblsbtlsFechaEmision = new LabelSubtitulos((String) null);
		lblsbtlsFechaEmision.setText("Fecha Emision");
		lblsbtlsFechaEmision.setBounds(25, 630, 119, 23);
		panel.add(lblsbtlsFechaEmision);
		
		JDateChooser FechaValidaHasta = new JDateChooser();
		FechaValidaHasta.setBounds(363, 630, 119, 23);
		panel.add(FechaValidaHasta);
		
		JDateChooser FechaEmision = new JDateChooser();
		FechaEmision.setBounds(113, 630, 119, 23);
		panel.add(FechaEmision);
		
		LabelSubtitulos lblsbtlsTrminosYCondiciones = new LabelSubtitulos((String) null);
		lblsbtlsTrminosYCondiciones.setText("T\u00E9rminos y condiciones");
		lblsbtlsTrminosYCondiciones.setBounds(25, 668, 157, 23);
		panel.add(lblsbtlsTrminosYCondiciones);
		
		JTextField txtTerminosyCondiciones = new JTextField();
		txtTerminosyCondiciones.setText("Ninguno");
		txtTerminosyCondiciones.setBounds(192, 668, 531, 23);
		panel.add(txtTerminosyCondiciones);
		
		StandarButton btnGuardarCotizacion = new StandarButton((String) null);
		btnGuardarCotizacion.setText("Guardar");
		btnGuardarCotizacion.setBounds(623, 709, 100, 25);
		panel.add(btnGuardarCotizacion);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(0, 955, 748, 9);
		panel.add(separator_1);
		
		LabelSubtitulos lblsbtlsIdCotizacion = new LabelSubtitulos((String) null);
		lblsbtlsIdCotizacion.setText("ID Cotizacion");
		lblsbtlsIdCotizacion.setBounds(25, 968, 86, 23);
		panel.add(lblsbtlsIdCotizacion);
		
		TextSoloNumeros txtIDRegCotizacion = new TextSoloNumeros();
		txtIDRegCotizacion.setText("");
		txtIDRegCotizacion.setBounds(113, 968, 119, 23);
		panel.add(txtIDRegCotizacion);
		
		LabelSubtitulos lblsbtlsNCotizacin_2 = new LabelSubtitulos((String) null);
		lblsbtlsNCotizacin_2.setText("N\u00B0 Cotizaci\u00F3n");
		lblsbtlsNCotizacin_2.setBounds(242, 968, 100, 23);
		panel.add(lblsbtlsNCotizacin_2);
		
		txtNumeroRegCotizacion = new JTextField();
		txtNumeroRegCotizacion.setText("");
		txtNumeroRegCotizacion.setBounds(329, 968, 153, 23);
		panel.add(txtNumeroRegCotizacion);
		
		LabelSubtitulos lblsbtlsFechaEmision_1 = new LabelSubtitulos((String) null);
		lblsbtlsFechaEmision_1.setText("Fecha Emision");
		lblsbtlsFechaEmision_1.setBounds(487, 968, 119, 23);
		panel.add(lblsbtlsFechaEmision_1);
		
		JDateChooser FechaEmisionRegCotizacion = new JDateChooser();
		FechaEmisionRegCotizacion.setBounds(604, 968, 119, 23);
		panel.add(FechaEmisionRegCotizacion);
		
		LabelSubtitulos lblsbtlsValidaHasta_1 = new LabelSubtitulos((String) null);
		lblsbtlsValidaHasta_1.setText("Valida Hasta");
		lblsbtlsValidaHasta_1.setBounds(25, 1006, 89, 23);
		panel.add(lblsbtlsValidaHasta_1);
		
		JDateChooser FechaValidaHasta_1 = new JDateChooser();
		FechaValidaHasta_1.setBounds(113, 1006, 119, 23);
		panel.add(FechaValidaHasta_1);
		
		LabelSubtitulos lblsbtlsNCotizacin_1 = new LabelSubtitulos((String) null);
		lblsbtlsNCotizacin_1.setText("Descripci\u00F3n");
		lblsbtlsNCotizacin_1.setBounds(242, 1006, 89, 23);
		panel.add(lblsbtlsNCotizacin_1);
		
		LabelSubtitulos lblsbtlsTrminosYCondiciones_1 = new LabelSubtitulos((String) null);
		lblsbtlsTrminosYCondiciones_1.setText("Cantidad");
		lblsbtlsTrminosYCondiciones_1.setBounds(25, 1044, 86, 23);
		panel.add(lblsbtlsTrminosYCondiciones_1);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setText("Ninguno");
		txtDescripcion.setBounds(329, 1006, 394, 23);
		panel.add(txtDescripcion);
		
		JFormattedTextField txtCantidad = new JFormattedTextField();
		txtCantidad.setText("");
		txtCantidad.setBounds(113, 1044, 119, 23);
		panel.add(txtCantidad);
		
		LabelSubtitulos lblsbtlsTrminosYCondiciones_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsTrminosYCondiciones_1_1.setText("Valor Unitario");
		lblsbtlsTrminosYCondiciones_1_1.setBounds(242, 1044, 86, 23);
		panel.add(lblsbtlsTrminosYCondiciones_1_1);
		
		JFormattedTextField txtValorUnitario = new JFormattedTextField();
		txtValorUnitario.setText("");
		txtValorUnitario.setBounds(330, 1044, 137, 23);
		panel.add(txtValorUnitario);
		
		StandarButton btnGuardarRealCotizacion = new StandarButton((String) null);
		btnGuardarRealCotizacion.setText("Guardar");
		btnGuardarRealCotizacion.setBounds(623, 1044, 100, 25);
		panel.add(btnGuardarRealCotizacion);
		
		StandarButton btnImprimir = new StandarButton((String) null);
		btnImprimir.setText("Imprimir");
		btnImprimir.setBounds(279, 1610, 109, 30);
		panel.add(btnImprimir);
		
		LabelSubtitulos lblsbtlsNeto = new LabelSubtitulos((String) null);
		lblsbtlsNeto.setText("Neto");
		lblsbtlsNeto.setBounds(496, 1510, 119, 23);
		panel.add(lblsbtlsNeto);
		
		TextSoloNumeros txtNeto = new TextSoloNumeros();
		txtNeto.setText("");
		txtNeto.setBounds(629, 1510, 94, 23);
		panel.add(txtNeto);
		
		LabelSubtitulos lblsbtlsIva = new LabelSubtitulos((String) null);
		lblsbtlsIva.setText("IVA");
		lblsbtlsIva.setBounds(496, 1540, 119, 23);
		panel.add(lblsbtlsIva);
		
		TextSoloNumeros txtIVA = new TextSoloNumeros();
		txtIVA.setText("");
		txtIVA.setBounds(629, 1540, 94, 23);
		panel.add(txtIVA);
		
		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("Total");
		lblsbtlsTotal.setBounds(496, 1570, 119, 23);
		panel.add(lblsbtlsTotal);
		
		TextSoloNumeros txtTotal = new TextSoloNumeros();
		txtTotal.setText("");
		txtTotal.setBounds(629, 1570, 94, 23);
		panel.add(txtTotal);
		
		JEditorPane txtTerminosCondicionesRealizCot = new JEditorPane();
		txtTerminosCondicionesRealizCot.setBounds(25, 1530, 345, 59);
		panel.add(txtTerminosCondicionesRealizCot);
		
		LabelSubtitulos lblsbtlsTrminosYCondiciones_2 = new LabelSubtitulos((String) null);
		lblsbtlsTrminosYCondiciones_2.setText("T\u00E9rminos y condiciones");
		lblsbtlsTrminosYCondiciones_2.setBounds(25, 1500, 157, 23);
		panel.add(lblsbtlsTrminosYCondiciones_2);
		txtId.setVisible(false);
		
		ActualizarVista();
		
		}
		
		public void ActualizarVista() {
			VaciarForm();
			//controlador.LlenarTabla();
			//calcularTotales(tableMaterialesOficina, txtTotalMatOfi);
			//calcularTotales(tableMaterialesElectricos, txtTotalMatElec);
			//calcularTotales(tableMaterialesDiversos, txtTotalMatDiv);
			
		}
		public void CargarFormAB(InventarioEntity3 ape) {
			
			txtId.setText(""+ape.getId());
			
			//comboBoxTipoProducto.setSelectedIndex(ape.getTipoProducto());
			txtInsumo.setText(ape.getInsumo());
			//comboBoxUM.setSelectedIndex(ape.getUnidadMedida());
			txtStockReal.setText(""+ape.getStockReal());
			txtSitioWeb.setText(""+ape.getValorUnitario());
			
		}
		
		/*public void calcularTotales(TableStandard table, JTextField txt) {
			
			int t = 0;
			
			for(int i=0; i<table.getRowCount(); i++) {
				 t += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 6)));
			}
		}*/
		
		public boolean camposVacios(){
			
			if(txtInsumo.getText().length() <= 0) {
				return false;
			}else if(txtStockReal.getText().length() <= 0) {
				return false;
			}else if(txtSitioWeb.getText().length() <= 0) {
				return false;
			}
			
			return true;
			
		}
		
		public void VaciarForm(){
			txtInsumo.setText("");
			txtStockReal.setText("");
			txtSitioWeb.setText("");
			txtId.setText("");
			
		}

		public TableStandard getTableAlimentosBebidas() {
			return tableEmpresas;
		}

		public StandarButton getBtnGuardar() {
			return btnGuardarEmp;
		}

		public void setTableAlimentosBebidas(TableStandard tableAlimentosBebidas) {
			this.tableEmpresas = tableAlimentosBebidas;
		}

		public void setBtnGuardar(StandarButton btnGuardar) {
			this.btnGuardarEmp = btnGuardar;
		}

		public TableStandard getTableMaterialesOficina() {
			return tableRegistrarCotizacion;
		}

		public JTextField getTxtId() {
			return txtId;
		}

		public JTextField getTxtInsumo() {
			return txtInsumo;
		}

		public TextSoloNumeros getTxtStockReal() {
			return txtStockReal;
		}

		public void setTableMaterialesOficina(TableStandard tableMaterialesOficina) {
			this.tableRegistrarCotizacion = tableMaterialesOficina;
		}

		public void setTxtId(JTextField txtId) {
			this.txtId = txtId;
		}

		public void setTxtInsumo(JTextField txtInsumo) {
			this.txtInsumo = txtInsumo;
		}

		public void setTxtValorUnitario(TextSoloNumeros txtValorUnitario) {
			this.txtSitioWeb = txtValorUnitario;
		}

		public void setTxtStockReal(TextSoloNumeros txtStockReal) {
			this.txtStockReal = txtStockReal;
		}
		
		public DefaultTableModel getModelAlimBebidas() {
			return tableEmpresas.getModel();
		}
		
		public DefaultTableModel getModelMatOficina() {
			return tableRegistrarCotizacion.getModel();
		}
		public DefaultTableModel getModelMatElectricos() {
			return tableMaterialesElectricos.getModel();
		}
		public DefaultTableModel getModelMatDiversos() {
			return tableRealizarCotizacion.getModel();
		}

		public TableStandard getTableMaterialesElectricos() {
			return tableMaterialesElectricos;
		}

		public TableStandard getTableMaterialesDiversos() {
			return tableRealizarCotizacion;
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
			this.tableRealizarCotizacion = tableMaterialesDiversos;
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
			return btnModificarEmpresa;
		}

		public StandarButton getBtnEliminarAB() {
			return btnEliminarEmpresa;
		}


		public void setBtnModificarAB(StandarButton btnModificarAB) {
			this.btnModificarEmpresa = btnModificarAB;
		}

		public void setBtnEliminarAB(StandarButton btnEliminarAB) {
			this.btnEliminarEmpresa = btnEliminarAB;
		}

		public StandarButton getBtnModificarMO() {
			return btnModificarCotizacion;
		}

		public StandarButton getBtnEliminarMO() {
			return btnEliminarCotizacion;
		}

		public StandarButton getBtnModificarME() {
			return btnModificarME;
		}

		public StandarButton getBtnEliminarME() {
			return btnEliminarME;
		}

		public StandarButton getBtnModificarMD() {
			return btnModificarRealCoti;
		}

		public StandarButton getBtnEliminarMD() {
			return btnEliminarRealCotizacion;
		}

		public void setBtnModificarMO(StandarButton btnModificarMO) {
			this.btnModificarCotizacion = btnModificarMO;
		}

		public void setBtnEliminarMO(StandarButton btnEliminarMO) {
			this.btnEliminarCotizacion = btnEliminarMO;
		}

		public void setBtnModificarME(StandarButton btnModificarME) {
			this.btnModificarME = btnModificarME;
		}

		public void setBtnEliminarME(StandarButton btnEliminarME) {
			this.btnEliminarME = btnEliminarME;
		}

		public void setBtnModificarMD(StandarButton btnModificarMD) {
			this.btnModificarRealCoti = btnModificarMD;
		}

		public void setBtnEliminarMD(StandarButton btnEliminarMD) {
			this.btnEliminarRealCotizacion = btnEliminarMD;
		}

		public StandarButton getBtnImprimirMD() {
			return btnUsarDatosCotizacion;
		}

		public StandarButton getBtnImprimirME() {
			return btnImprimirME;
		}

		public StandarButton getBtnImprimirMO() {
			return btnImprimirMO;
		}

		public StandarButton getBtnImprimirAB() {
			return btnUsarDatosEmpresa;
		}

		public void setBtnImprimirMD(StandarButton btnImprimirMD) {
			this.btnUsarDatosCotizacion = btnImprimirMD;
		}

		public void setBtnImprimirME(StandarButton btnImprimirME) {
			this.btnImprimirME = btnImprimirME;
		}

		public void setBtnImprimirMO(StandarButton btnImprimirMO) {
			this.btnImprimirMO = btnImprimirMO;
		}

		public void setBtnImprimirAB(StandarButton btnImprimirAB) {
			this.btnUsarDatosEmpresa = btnImprimirAB;
		}
}
