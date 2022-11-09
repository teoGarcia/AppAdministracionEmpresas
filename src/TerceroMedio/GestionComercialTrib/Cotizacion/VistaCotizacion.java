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
	
	private ControlCotizacion controlador;
	private TableStandard tableEmpresas;
	private TableStandard tableRegistrarCotizacion;
	private TableStandard tableMaterialesElectricos;
	private TableStandard tableRealizarCotizacion;
	private StandarButton btnGuardarEmp;
	private JTextField txtId;
	private JTextField txtDireccion;
	private JTextField txtSitioWeb;
	private TextSoloNumeros txtTelefono;
	private JTextField txtComuna;
	private StandarButton btnModificarEmpresa;
	private StandarButton btnEliminarEmpresa;
	private StandarButton btnModificarCotizacion;
	private StandarButton btnEliminarCotizacion;
	private StandarButton btnModificarRealCoti;
	private StandarButton btnEliminarRealCotizacion;
	private StandarButton btnUsarDatosCotizacion;
	private StandarButton btnUsarDatosEmpresa;
	private JTextField txtEmail;
	private JTextField txtRutEmpCot;
	private JTextField txtRazonSocialEmpCot;
	private JTextField txtNumCotizacionEmpCot;
	private JTextField txtNumeroRegCotizacion;
	private JTextField txtDescripcion;
	private TextSoloNumeros txtRazonSocial;
	private JFormattedTextField txtRut;
	private TextSoloNumeros txtGiro;
	private TextSoloNumeros txtIDEmpCot;
	private JDateChooser FechaEmision;
	private JDateChooser FechaValidaHasta;

	/**
	 * Create the panel.
	 */
	public VistaCotizacion() {
		
		controlador = new ControlCotizacion(this);
		
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
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(158, 173, 309, 23);
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		LabelSubtitulos lblsbtlsUnidadMedida = new LabelSubtitulos((String) null);
		lblsbtlsUnidadMedida.setText("Comuna");
		lblsbtlsUnidadMedida.setBounds(487, 173, 61, 23);
		panel.add(lblsbtlsUnidadMedida);
		
		txtComuna = new JTextField();
		txtComuna.setBounds(558, 173, 165, 23);
		panel.add(txtComuna);
		
		LabelSubtitulos lblsbtlsStockReal = new LabelSubtitulos((String) null);
		lblsbtlsStockReal.setText("Telefono");
		lblsbtlsStockReal.setBounds(25, 213, 119, 23);
		panel.add(lblsbtlsStockReal);
		
		txtTelefono = new TextSoloNumeros();
		txtTelefono.setBounds(158, 213, 94, 23);
		panel.add(txtTelefono);
		
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
		
		txtRazonSocial = new TextSoloNumeros();
		txtRazonSocial.setText("");
		txtRazonSocial.setBounds(158, 129, 179, 23);
		panel.add(txtRazonSocial);
		
		LabelSubtitulos lblsbtlsRut = new LabelSubtitulos((String) null);
		lblsbtlsRut.setText("Rut");
		lblsbtlsRut.setBounds(347, 129, 39, 23);
		panel.add(lblsbtlsRut);
		
		txtRut = new JFormattedTextField();
		txtRut.setText("");
		txtRut.setBounds(384, 129, 109, 23);
		panel.add(txtRut);
		
		LabelSubtitulos lblsbtlsGiro = new LabelSubtitulos((String) null);
		lblsbtlsGiro.setText("Giro");
		lblsbtlsGiro.setBounds(510, 129, 39, 23);
		panel.add(lblsbtlsGiro);
		
		txtGiro = new TextSoloNumeros();
		txtGiro.setText("");
		txtGiro.setBounds(558, 129, 165, 23);
		panel.add(txtGiro);
		
		LabelSubtitulos lblsbtlsEmail = new LabelSubtitulos((String) null);
		lblsbtlsEmail.setText("E-Mail");
		lblsbtlsEmail.setBounds(487, 213, 61, 23);
		panel.add(lblsbtlsEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(558, 213, 165, 23);
		panel.add(txtEmail);
		
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
		
		txtIDEmpCot = new TextSoloNumeros();
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
		
		FechaValidaHasta = new JDateChooser();
		FechaValidaHasta.setBounds(363, 630, 119, 23);
		panel.add(FechaValidaHasta);
		
		FechaEmision = new JDateChooser();
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
			controlador.LlenarTabla();
			//calcularTotales(tableMaterialesOficina, txtTotalMatOfi);
			//calcularTotales(tableMaterialesElectricos, txtTotalMatElec);
			//calcularTotales(tableMaterialesDiversos, txtTotalMatDiv);
			
		}
		public void CargarFormEmpresaPersona(EmpresaPersonaEntity ape) {
			
			txtId.setText(""+ape.getId());
			txtRazonSocial.setText(ape.getRazonSocial());
			txtRut.setText(ape.getRut());
			txtGiro.setText(""+ape.getGiro());
			txtDireccion.setText(""+ape.getDireccion());
			txtComuna.setText(ape.getComuna());
			txtTelefono.setText(ape.getTelefono());
			txtSitioWeb.setText(""+ape.getSitioWeb());
			txtEmail.setText(""+ape.geteMail());
			
		}
		
		/*public void calcularTotales(TableStandard table, JTextField txt) {
			
			int t = 0;
			
			for(int i=0; i<table.getRowCount(); i++) {
				 t += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 6)));
			}
		}*/
		
		public boolean camposVacios(){
			
			if(txtRazonSocial.getText().length() <= 0) {
				return false;
			}else if(txtRut.getText().length() <= 0) {
				return false;
			}else if(txtGiro.getText().length() <= 0) {
				return false;
			}else if(txtDireccion.getText().length() <= 0) {
				return false;
			}else if(txtComuna.getText().length() <= 0) {
				return false;
			}else if(txtTelefono.getText().length() <= 0) {
				return false;
			}else if(txtSitioWeb.getText().length() <= 0) {
				return false;
			}else if(txtEmail.getText().length() <= 0) {
				return false;
			}
			
			return true;
			
		}
		
		public void VaciarForm(){
			txtDireccion.setText("");
			txtTelefono.setText("");
			txtSitioWeb.setText("");
			txtId.setText("");
			
		}
		
		public DefaultTableModel getModelTableEmpresaPersona() {
			return tableEmpresas.getModel();
		}

		public TableStandard getTableAlimentosBebidas() {
			return tableEmpresas;
		}

		public TableStandard getTableEmpresas() {
			return tableEmpresas;
		}

		public TableStandard getTableRegistrarCotizacion() {
			return tableRegistrarCotizacion;
		}

		public TableStandard getTableRealizarCotizacion() {
			return tableRealizarCotizacion;
		}

		public JTextField getTxtId() {
			return txtId;
		}

		public JTextField getTxtDireccion() {
			return txtDireccion;
		}

		public JTextField getTxtSitioWeb() {
			return txtSitioWeb;
		}

		public TextSoloNumeros getTxtTelefono() {
			return txtTelefono;
		}

		public JTextField getTxtComuna() {
			return txtComuna;
		}

		public StandarButton getBtnModificarEmpresa() {
			return btnModificarEmpresa;
		}

		public StandarButton getBtnEliminarEmpresa() {
			return btnEliminarEmpresa;
		}

		public StandarButton getBtnModificarCotizacion() {
			return btnModificarCotizacion;
		}

		public StandarButton getBtnEliminarCotizacion() {
			return btnEliminarCotizacion;
		}

		public StandarButton getBtnModificarRealCoti() {
			return btnModificarRealCoti;
		}

		public StandarButton getBtnEliminarRealCotizacion() {
			return btnEliminarRealCotizacion;
		}

		public StandarButton getBtnUsarDatosCotizacion() {
			return btnUsarDatosCotizacion;
		}

		public StandarButton getBtnUsarDatosEmpresa() {
			return btnUsarDatosEmpresa;
		}

		public JTextField getTxtEmail() {
			return txtEmail;
		}

		public JTextField getTxtRutEmpCot() {
			return txtRutEmpCot;
		}

		public JTextField getTxtRazonSocialEmpCot() {
			return txtRazonSocialEmpCot;
		}

		public JTextField getTxtNumCotizacionEmpCot() {
			return txtNumCotizacionEmpCot;
		}

		public JTextField getTxtNumeroRegCotizacion() {
			return txtNumeroRegCotizacion;
		}

		public JTextField getTxtDescripcion() {
			return txtDescripcion;
		}

		public void setTableEmpresas(TableStandard tableEmpresas) {
			this.tableEmpresas = tableEmpresas;
		}

		public void setTableRegistrarCotizacion(TableStandard tableRegistrarCotizacion) {
			this.tableRegistrarCotizacion = tableRegistrarCotizacion;
		}

		public void setTableRealizarCotizacion(TableStandard tableRealizarCotizacion) {
			this.tableRealizarCotizacion = tableRealizarCotizacion;
		}

		public void setTxtId(JTextField txtId) {
			this.txtId = txtId;
		}

		public void setTxtDireccion(JTextField txtDireccion) {
			this.txtDireccion = txtDireccion;
		}

		public void setTxtSitioWeb(JTextField txtSitioWeb) {
			this.txtSitioWeb = txtSitioWeb;
		}

		public void setTxtTelefono(TextSoloNumeros txtTelefono) {
			this.txtTelefono = txtTelefono;
		}

		public void setTxtComuna(JTextField txtComuna) {
			this.txtComuna = txtComuna;
		}

		public void setBtnModificarEmpresa(StandarButton btnModificarEmpresa) {
			this.btnModificarEmpresa = btnModificarEmpresa;
		}

		public void setBtnEliminarEmpresa(StandarButton btnEliminarEmpresa) {
			this.btnEliminarEmpresa = btnEliminarEmpresa;
		}

		public void setBtnModificarCotizacion(StandarButton btnModificarCotizacion) {
			this.btnModificarCotizacion = btnModificarCotizacion;
		}

		public void setBtnEliminarCotizacion(StandarButton btnEliminarCotizacion) {
			this.btnEliminarCotizacion = btnEliminarCotizacion;
		}

		public void setBtnModificarRealCoti(StandarButton btnModificarRealCoti) {
			this.btnModificarRealCoti = btnModificarRealCoti;
		}

		public void setBtnEliminarRealCotizacion(StandarButton btnEliminarRealCotizacion) {
			this.btnEliminarRealCotizacion = btnEliminarRealCotizacion;
		}

		public void setBtnUsarDatosCotizacion(StandarButton btnUsarDatosCotizacion) {
			this.btnUsarDatosCotizacion = btnUsarDatosCotizacion;
		}

		public void setBtnUsarDatosEmpresa(StandarButton btnUsarDatosEmpresa) {
			this.btnUsarDatosEmpresa = btnUsarDatosEmpresa;
		}

		public void setTxtEmail(JTextField txtEmail) {
			this.txtEmail = txtEmail;
		}

		public void setTxtRutEmpCot(JTextField txtRutEmpCot) {
			this.txtRutEmpCot = txtRutEmpCot;
		}

		public void setTxtRazonSocialEmpCot(JTextField txtRazonSocialEmpCot) {
			this.txtRazonSocialEmpCot = txtRazonSocialEmpCot;
		}

		public void setTxtNumCotizacionEmpCot(JTextField txtNumCotizacionEmpCot) {
			this.txtNumCotizacionEmpCot = txtNumCotizacionEmpCot;
		}

		public void setTxtNumeroRegCotizacion(JTextField txtNumeroRegCotizacion) {
			this.txtNumeroRegCotizacion = txtNumeroRegCotizacion;
		}

		public void setTxtDescripcion(JTextField txtDescripcion) {
			this.txtDescripcion = txtDescripcion;
		}

		public StandarButton getBtnGuardarEmp() {
			return btnGuardarEmp;
		}

		public void setBtnGuardarEmp(StandarButton btnGuardarEmp) {
			this.btnGuardarEmp = btnGuardarEmp;
		}

		public TextSoloNumeros getTxtRazonSocial() {
			return txtRazonSocial;
		}

		public JFormattedTextField getTxtRut() {
			return txtRut;
		}

		public TextSoloNumeros getTxtGiro() {
			return txtGiro;
		}

		public TextSoloNumeros getTxtIDEmpCot() {
			return txtIDEmpCot;
		}

		public JDateChooser getFechaEmision() {
			return FechaEmision;
		}

		public JDateChooser getFechaValidaHasta() {
			return FechaValidaHasta;
		}

		public void setTxtRazonSocial(TextSoloNumeros txtRazonSocial) {
			this.txtRazonSocial = txtRazonSocial;
		}

		public void setTxtRut(JFormattedTextField txtRut) {
			this.txtRut = txtRut;
		}

		public void setTxtGiro(TextSoloNumeros txtGiro) {
			this.txtGiro = txtGiro;
		}

		public void setTxtIDEmpCot(TextSoloNumeros txtIDEmpCot) {
			this.txtIDEmpCot = txtIDEmpCot;
		}

		public void setFechaEmision(JDateChooser fechaEmision) {
			FechaEmision = fechaEmision;
		}

		public void setFechaValidaHasta(JDateChooser fechaValidaHasta) {
			FechaValidaHasta = fechaValidaHasta;
		}


}
