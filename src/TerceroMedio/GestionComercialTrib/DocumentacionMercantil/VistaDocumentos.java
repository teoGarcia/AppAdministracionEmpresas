package TerceroMedio.GestionComercialTrib.DocumentacionMercantil;

import java.awt.Color;


import java.awt.Dimension;
import java.text.ParseException;
import java.util.Date;

import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import com.toedter.calendar.JDateChooser;
import ui.Buttons.StandarButton;
import ui.Labels.LabelSubtitulos;
import ui.Labels.LabelTitulos;
import ui.TablaUi.TableStandard;
import ui.Texts.TextSoloNumeros;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VistaDocumentos extends JPanel {

	private ControlDocumentos controlador;
	private TableStandard tableRegDoc;
	private TableStandard tableReaDoc;
	private StandarButton btnGuardarRegDoc;
	private JTextField txtIdRegDoc;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtComuna;
	private StandarButton btnModificarRegDoc;
	private StandarButton btnEliminarRegDoc;
	private StandarButton btnModificarReaDoc;
	private StandarButton btnEliminarReaDoc;
	private StandarButton btnUsarDatosRegDoc;
	private JTextField txtTipoCompraRegDoc;
	private JTextField txtSenoresReaDoc;
	private JTextField txtTipoDocumento;
	private JTextField txtSenoresRegDoc;
	private JFormattedTextField txtRutRegDoc;
	private JTextField txtGiro;
	private JTextField txtIDDoc;
	private StandarButton btnGuardarReaDoc;
	private JTextField txtIDReaDoc;
	private JTextField txtCodigoReaDoc;
	private TextSoloNumeros txtNetoReaDoc;
	private TextSoloNumeros txtTotalReaDoc;
	private TextSoloNumeros txtIVAReaDoc;
	private StandarButton btnImprimirReaDoc;
	private JComboBox comboBoxTipoDoc;
	private JTextField txtNumDocumento;
	private JTextField txtCiudad;
	private JTextField txtDescripcionReaDoc;
	private JTextField txtCantidadReaDoc;
	private JDateChooser FechaEmisionRegDoc;
	private TextSoloNumeros txtPrecioUniReaDoc;
	private TextSoloNumeros txtImpAdicionalReaDoc;
	private TextSoloNumeros txtTotalImpAdic;
	private JTextField textFieldSenoresRegGuia;
	private JFormattedTextField txtRutRegGuia;
	private JTextField txtNumDocRegGuia;
	private JTextField txtGiroRegGuia;
	private JTextField txtDireccionRegGuia;
	private JTextField txtComunaRegGuia;
	private JTextField txtCiudadRegGuia;
	private JTextField txtTelefonoRegGuia;
	private JTextField txtTipoTrasladoRegGuia;
	private JTextField txtPatente;
	private JFormattedTextField txtRutTranspRegGuia;
	private JFormattedTextField txtRutChofer;
	private JTextField txtNombreChofer;
	private StandarButton btnGuardarRegGuia;
	private JScrollPane scrollPaneRegGuia;
	private TableStandard tableRegGuia;
	private StandarButton btnModificarRegGuia;
	private StandarButton btnEliminarRegGuia;
	private JTextField txtIDGuia;
	private JTextField txtNumeroDocumentoReaGuia;
	private JTextField txtSenoresReaGuia;
	private JTextField txtCodReaGuia;
	private JTextField txtDescripcionReaGui;
	private JTextField txtCantidadReaGui;
	private TextSoloNumeros txtPrecioUniReaGui;
	private TextSoloNumeros txtImpAdicionalReaGui;
	private StandarButton btnGuardarReaGui;
	private TableStandard tableReaGui;
	private StandarButton btnImprimirReaGui;
	private StandarButton btnEliminarReaGui;
	private StandarButton btnModificarReaGui;
	private TextSoloNumeros txtNetoReaGui;
	private TextSoloNumeros txtTotalImpAdicReaGui;
	private TextSoloNumeros txtTotalReaGui;
	private JTextField txtIDRegGui;
	private JTextField txtIDReaGui;
	private JDateChooser FechaEmisionRegGuia;
	private StandarButton btnUsarDatosRegGui;
	private TextSoloNumeros txtIVAReaGui;
	/**
	 * Create the panel.
	 * @throws ParseException 
	 */
	public VistaDocumentos() {
		controlador = new ControlDocumentos(this);

		setOpaque(false);
		setBounds(0, 0, 748, 722);
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 2500));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);

		LabelTitulos lbltlsInventario = new LabelTitulos((String) null);
		lbltlsInventario.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsInventario.setText("Registrar documento");
		lbltlsInventario.setBounds(0, 53, 748, 30);
		panel.add(lbltlsInventario);

		LabelSubtitulos lblsbtlsTipoDeProducto = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeProducto.setText("Señores");
		lblsbtlsTipoDeProducto.setBounds(25, 148, 109, 23);
		panel.add(lblsbtlsTipoDeProducto);

		LabelSubtitulos lblsbtlsInsumo = new LabelSubtitulos((String) null);
		lblsbtlsInsumo.setText("Direccion");
		lblsbtlsInsumo.setBounds(25, 182, 119, 23);
		panel.add(lblsbtlsInsumo);

		txtDireccion = new JTextField();
		txtDireccion.setBounds(158, 182, 172, 23);
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);

		LabelSubtitulos lblsbtlsUnidadMedida = new LabelSubtitulos((String) null);
		lblsbtlsUnidadMedida.setText("Comuna");
		lblsbtlsUnidadMedida.setBounds(340, 182, 61, 23);
		panel.add(lblsbtlsUnidadMedida);

		txtComuna = new JTextField();
		txtComuna.setBounds(416, 183, 119, 23);
		panel.add(txtComuna);

		LabelSubtitulos lblsbtlsStockReal = new LabelSubtitulos((String) null);
		lblsbtlsStockReal.setText("Telefono");
		lblsbtlsStockReal.setBounds(25, 217, 119, 23);
		panel.add(lblsbtlsStockReal);

		txtTelefono = new JTextField();
		txtTelefono.setBounds(158, 217, 100, 23);
		panel.add(txtTelefono);

		LabelSubtitulos lblsbtlsValorUnitario = new LabelSubtitulos((String) null);
		lblsbtlsValorUnitario.setText("Fecha Emision");
		lblsbtlsValorUnitario.setBounds(268, 217, 85, 23);
		panel.add(lblsbtlsValorUnitario);

		btnGuardarRegDoc = new StandarButton((String) null);
		btnGuardarRegDoc.setText("Guardar");
		btnGuardarRegDoc.setBounds(623, 251, 100, 25);
		btnGuardarRegDoc.addActionListener(controlador);
		panel.add(btnGuardarRegDoc);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 500, 748, 9);
		panel.add(separator);

		JScrollPane scrollPaneRegDoc = new JScrollPane();
		scrollPaneRegDoc.setBounds(25, 287, 698, 166);
		panel.add(scrollPaneRegDoc);

		tableRegDoc = new TableStandard();
		tableRegDoc.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String[] columnsAlimBebidas = new String[] { "Id", "Tipo de documento", "Señores", "Rut", "Nro. Documento", "Fecha emision", "Giro", "Direccion",
				"Comuna", "Ciudad", "Telefono", "Tipo de compra" };
		tableRegDoc.setColums(columnsAlimBebidas);
		scrollPaneRegDoc.setViewportView(tableRegDoc);
		tableRegDoc.getColumnModel().getColumn(0).setPreferredWidth(80);
		tableRegDoc.getColumnModel().getColumn(1).setPreferredWidth(160);
		tableRegDoc.getColumnModel().getColumn(2).setPreferredWidth(250);
		tableRegDoc.getColumnModel().getColumn(3).setPreferredWidth(120);
		tableRegDoc.getColumnModel().getColumn(4).setPreferredWidth(150);
		tableRegDoc.getColumnModel().getColumn(5).setPreferredWidth(120);
		tableRegDoc.getColumnModel().getColumn(6).setPreferredWidth(160);
		tableRegDoc.getColumnModel().getColumn(7).setPreferredWidth(250);
		tableRegDoc.getColumnModel().getColumn(8).setPreferredWidth(150);
		tableRegDoc.getColumnModel().getColumn(9).setPreferredWidth(150);
		tableRegDoc.getColumnModel().getColumn(10).setPreferredWidth(150);
		tableRegDoc.getColumnModel().getColumn(11).setPreferredWidth(180);

		btnModificarRegDoc = new StandarButton((String) null);
		btnModificarRegDoc.setText("Modificar");
		btnModificarRegDoc.setBounds(25, 459, 109, 30);
		btnModificarRegDoc.addActionListener(controlador);
		panel.add(btnModificarRegDoc);

		btnEliminarRegDoc = new StandarButton((String) null);
		btnEliminarRegDoc.setText("Eliminar");
		btnEliminarRegDoc.setBounds(151, 459, 109, 30);
		btnEliminarRegDoc.addActionListener(controlador);
		panel.add(btnEliminarRegDoc);

		btnUsarDatosRegDoc = new StandarButton((String) null);
		btnUsarDatosRegDoc.setText("Usar Datos");
		btnUsarDatosRegDoc.setBounds(279, 459, 109, 30);
		btnUsarDatosRegDoc.addActionListener(controlador);
		panel.add(btnUsarDatosRegDoc);
		String[] columnsMateOficina = new String[] { "Id", "ID Emp. o Per.", "Razon Social", "N. Cotizacion",
				"Fecha Emision", "Valida Hasta" };

		JScrollPane scrollPaneReaDoc = new JScrollPane();
		scrollPaneReaDoc.setBounds(25, 658, 698, 385);
		panel.add(scrollPaneReaDoc);

		tableReaDoc = new TableStandard();
		String[] columnsMaterialesDiversos = new String[] { "Id", "Codigo", "Descripcion", "Cantidad", "$ Precio U.", "$ Imp. Adic.",
				"$ Total" };
		tableReaDoc.setColums(columnsMaterialesDiversos);
		scrollPaneReaDoc.setViewportView(tableReaDoc);

		btnModificarReaDoc = new StandarButton((String) null);
		btnModificarReaDoc.setText("Modificar");
		btnModificarReaDoc.setBounds(25, 1070, 109, 30);
		btnModificarReaDoc.addActionListener(controlador);
		panel.add(btnModificarReaDoc);

		btnEliminarReaDoc = new StandarButton((String) null);
		btnEliminarReaDoc.setText("Eliminar");
		btnEliminarReaDoc.setBounds(151, 1070, 109, 30);
		btnEliminarReaDoc.addActionListener(controlador);
		panel.add(btnEliminarReaDoc);

		txtIdRegDoc = new JTextField();
		txtIdRegDoc.setVisible(false);
		txtIdRegDoc.setBounds(35, 83, 109, 20);
		panel.add(txtIdRegDoc);
		txtIdRegDoc.setColumns(10);

		txtSenoresRegDoc = new JTextField();
		txtSenoresRegDoc.setText("");
		txtSenoresRegDoc.setBounds(158, 148, 236, 23);
		panel.add(txtSenoresRegDoc);

		LabelSubtitulos lblsbtlsRut = new LabelSubtitulos((String) null);
		lblsbtlsRut.setText("Rut");
		lblsbtlsRut.setBounds(558, 113, 61, 23);
		panel.add(lblsbtlsRut);

		try {
			MaskFormatter mascara = new MaskFormatter("##.###.###-A");
			txtRutRegDoc = new JFormattedTextField(mascara);
			txtRutRegDoc.setColumns(10);
			txtRutRegDoc.setBounds(629, 114, 94, 23);
			panel.add(txtRutRegDoc);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LabelSubtitulos lblsbtlsGiro = new LabelSubtitulos((String) null);
		lblsbtlsGiro.setText("Giro");
		lblsbtlsGiro.setBounds(415, 148, 39, 23);
		panel.add(lblsbtlsGiro);

		txtGiro = new JTextField();
		txtGiro.setText("");
		txtGiro.setBounds(494, 148, 229, 23);
		panel.add(txtGiro);

		LabelSubtitulos lblsbtlsEmail = new LabelSubtitulos((String) null);
		lblsbtlsEmail.setText("Tipo de Compra");
		lblsbtlsEmail.setBounds(494, 217, 95, 23);
		panel.add(lblsbtlsEmail);

		txtTipoCompraRegDoc = new JTextField();
		txtTipoCompraRegDoc.setBounds(604, 217, 119, 23);
		panel.add(txtTipoCompraRegDoc);

		txtSenoresReaDoc = new JTextField();
		txtSenoresReaDoc.setEditable(false);
		txtSenoresReaDoc.setBounds(558, 514, 165, 23);
		panel.add(txtSenoresReaDoc);

		LabelSubtitulos lblsbtlsRut_1 = new LabelSubtitulos((String) null);
		lblsbtlsRut_1.setText("Señores");
		lblsbtlsRut_1.setBounds(489, 513, 61, 23);
		panel.add(lblsbtlsRut_1);

		txtTipoDocumento = new JTextField();
		txtTipoDocumento.setEditable(false);
		txtTipoDocumento.setText("");
		txtTipoDocumento.setBounds(340, 514, 138, 23);
		panel.add(txtTipoDocumento);

		LabelSubtitulos lblsbtlsRazonSocial = new LabelSubtitulos((String) null);
		lblsbtlsRazonSocial.setText("Tipo Documento");
		lblsbtlsRazonSocial.setBounds(223, 513, 119, 23);
		panel.add(lblsbtlsRazonSocial);

		txtIDDoc = new JTextField();
		txtIDDoc.setEditable(false);
		txtIDDoc.setText("");
		txtIDDoc.setBounds(113, 514, 100, 23);
		panel.add(txtIDDoc);

		LabelSubtitulos lblsbtlsId = new LabelSubtitulos((String) null);
		lblsbtlsId.setText("ID Doc");
		lblsbtlsId.setBounds(25, 514, 86, 23);
		panel.add(lblsbtlsId);

		LabelSubtitulos lblsbtlsTrminosYCondiciones = new LabelSubtitulos((String) null);
		lblsbtlsTrminosYCondiciones.setText("Codigo");
		lblsbtlsTrminosYCondiciones.setBounds(25, 548, 86, 23);
		panel.add(lblsbtlsTrminosYCondiciones);

		txtCodigoReaDoc = new JTextField();
		txtCodigoReaDoc.setBounds(113, 548, 100, 23);
		panel.add(txtCodigoReaDoc);

		btnGuardarReaDoc = new StandarButton((String) null);
		btnGuardarReaDoc.setText("Guardar");
		btnGuardarReaDoc.setBounds(623, 615, 100, 25);
		btnGuardarReaDoc.addActionListener(controlador);
		panel.add(btnGuardarReaDoc);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(0, 1175, 748, 9);
		panel.add(separator_1);

		btnImprimirReaDoc = new StandarButton((String) null);
		btnImprimirReaDoc.setText("Imprimir");
		btnImprimirReaDoc.setBounds(279, 1070, 109, 30);
		btnImprimirReaDoc.addActionListener(controlador);
		panel.add(btnImprimirReaDoc);

		LabelSubtitulos lblsbtlsNeto = new LabelSubtitulos((String) null);
		lblsbtlsNeto.setText("Neto  $");
		lblsbtlsNeto.setBounds(496, 1055, 119, 23);
		panel.add(lblsbtlsNeto);

		txtNetoReaDoc = new TextSoloNumeros();
		txtNetoReaDoc.setText("");
		txtNetoReaDoc.setBounds(629, 1055, 94, 23);
		panel.add(txtNetoReaDoc);

		LabelSubtitulos lblsbtlsIva = new LabelSubtitulos((String) null);
		lblsbtlsIva.setText("IVA    $");
		lblsbtlsIva.setBounds(496, 1085, 119, 23);
		panel.add(lblsbtlsIva);

		txtIVAReaDoc = new TextSoloNumeros();
		txtIVAReaDoc.setText("");
		txtIVAReaDoc.setBounds(629, 1085, 94, 23);
		panel.add(txtIVAReaDoc);

		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("Total $");
		lblsbtlsTotal.setBounds(496, 1145, 119, 23);
		panel.add(lblsbtlsTotal);

		txtTotalReaDoc = new TextSoloNumeros();
		txtTotalReaDoc.setText("");
		txtTotalReaDoc.setBounds(629, 1145, 94, 23);
		panel.add(txtTotalReaDoc);

		txtIDReaDoc = new JTextField();
		txtIDReaDoc.setVisible(false);
		txtIDReaDoc.setText("");
		txtIDReaDoc.setBounds(629, 487, 119, 23);
		panel.add(txtIDReaDoc);
		
		LabelSubtitulos lblsbtlsTipoDeDocumento = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeDocumento.setText("Tipo de Documento");
		lblsbtlsTipoDeDocumento.setBounds(25, 114, 138, 23);
		panel.add(lblsbtlsTipoDeDocumento);
		
		comboBoxTipoDoc = new JComboBox();
		comboBoxTipoDoc.setModel(new DefaultComboBoxModel(new String[] {"Boleta electronica", "Factura electronica", "Nota de Credito electronica"}));
		comboBoxTipoDoc.setBounds(158, 114, 171, 23);
		panel.add(comboBoxTipoDoc);
		
		txtNumDocumento = new JTextField();
		txtNumDocumento.setText("");
		txtNumDocumento.setBounds(416, 115, 119, 23);
		panel.add(txtNumDocumento);
		
		LabelSubtitulos lblsbtlsNroDocumento = new LabelSubtitulos((String) null);
		lblsbtlsNroDocumento.setText("Nro. Docum.");
		lblsbtlsNroDocumento.setBounds(336, 114, 78, 23);
		panel.add(lblsbtlsNroDocumento);
		
		LabelSubtitulos lblsbtlsCiudad = new LabelSubtitulos((String) null);
		lblsbtlsCiudad.setText("Ciudad");
		lblsbtlsCiudad.setBounds(545, 182, 57, 23);
		panel.add(lblsbtlsCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setText("");
		txtCiudad.setBounds(604, 183, 119, 23);
		panel.add(txtCiudad);
		
		FechaEmisionRegDoc = new JDateChooser();
		FechaEmisionRegDoc.setBounds(363, 217, 119, 23);
		panel.add(FechaEmisionRegDoc);
		
		LabelSubtitulos lblsbtlsDescripcion = new LabelSubtitulos((String) null);
		lblsbtlsDescripcion.setText("Descripcion");
		lblsbtlsDescripcion.setBounds(223, 548, 86, 23);
		panel.add(lblsbtlsDescripcion);
		
		txtDescripcionReaDoc = new JTextField();
		txtDescripcionReaDoc.setText("");
		txtDescripcionReaDoc.setBounds(340, 547, 383, 23);
		panel.add(txtDescripcionReaDoc);
		
		LabelSubtitulos lblsbtlsCantidad = new LabelSubtitulos((String) null);
		lblsbtlsCantidad.setText("Cantidad");
		lblsbtlsCantidad.setBounds(25, 581, 61, 23);
		panel.add(lblsbtlsCantidad);
		
		txtCantidadReaDoc = new JTextField();
		txtCantidadReaDoc.setText("");
		txtCantidadReaDoc.setBounds(113, 582, 100, 23);
		panel.add(txtCantidadReaDoc);
		
		txtPrecioUniReaDoc = new TextSoloNumeros();
		txtPrecioUniReaDoc.setText("");
		txtPrecioUniReaDoc.setBounds(340, 581, 119, 23);
		panel.add(txtPrecioUniReaDoc);
		
		LabelSubtitulos lblsbtlsPrecioU = new LabelSubtitulos((String) null);
		lblsbtlsPrecioU.setText("Precio U.");
		lblsbtlsPrecioU.setBounds(223, 581, 86, 23);
		panel.add(lblsbtlsPrecioU);
		
		LabelSubtitulos lblsbtlsPrecioU_1 = new LabelSubtitulos((String) null);
		lblsbtlsPrecioU_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsPrecioU_1.setText("$");
		lblsbtlsPrecioU_1.setBounds(310, 581, 20, 23);
		panel.add(lblsbtlsPrecioU_1);
		
		txtImpAdicionalReaDoc = new TextSoloNumeros();
		txtImpAdicionalReaDoc.setText("");
		txtImpAdicionalReaDoc.setBounds(604, 581, 119, 23);
		panel.add(txtImpAdicionalReaDoc);
		
		LabelSubtitulos lblsbtlsImpuestoAdicional = new LabelSubtitulos((String) null);
		lblsbtlsImpuestoAdicional.setText("Impuesto Adicional");
		lblsbtlsImpuestoAdicional.setBounds(469, 581, 119, 23);
		panel.add(lblsbtlsImpuestoAdicional);
		
		LabelSubtitulos lblsbtlsPrecioU_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsPrecioU_1_1.setText("$");
		lblsbtlsPrecioU_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsPrecioU_1_1.setBounds(584, 581, 20, 23);
		panel.add(lblsbtlsPrecioU_1_1);
		
		LabelSubtitulos lblsbtlsImpAdic = new LabelSubtitulos((String) null);
		lblsbtlsImpAdic.setText("Imp. Adic. $");
		lblsbtlsImpAdic.setBounds(496, 1115, 119, 23);
		panel.add(lblsbtlsImpAdic);
		
		txtTotalImpAdic = new TextSoloNumeros();
		txtTotalImpAdic.setText("");
		txtTotalImpAdic.setBounds(629, 1115, 94, 23);
		panel.add(txtTotalImpAdic);
		
		LabelTitulos lbltlsRegistrarGuiaDe = new LabelTitulos((String) null);
		lbltlsRegistrarGuiaDe.setText("Registrar guia de despacho");
		lbltlsRegistrarGuiaDe.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsRegistrarGuiaDe.setBounds(0, 1190, 748, 30);
		panel.add(lbltlsRegistrarGuiaDe);
		
		LabelSubtitulos lblsbtlsTipoDeProducto_1 = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeProducto_1.setText("Señores");
		lblsbtlsTipoDeProducto_1.setBounds(25, 1240, 109, 23);
		panel.add(lblsbtlsTipoDeProducto_1);
		
		textFieldSenoresRegGuia = new JTextField();
		textFieldSenoresRegGuia.setText("");
		textFieldSenoresRegGuia.setBounds(158, 1240, 377, 23);
		panel.add(textFieldSenoresRegGuia);
		
		LabelSubtitulos lblsbtlsRut_2 = new LabelSubtitulos((String) null);
		lblsbtlsRut_2.setText("Rut");
		lblsbtlsRut_2.setBounds(558, 1240, 61, 23);
		panel.add(lblsbtlsRut_2);
		
		try {
			MaskFormatter mascara = new MaskFormatter("##.###.###-A");
			txtRutRegGuia = new JFormattedTextField(mascara);
			txtRutRegGuia.setColumns(10);
			txtRutRegGuia.setBounds(629, 1240, 94, 23);
			panel.add(txtRutRegGuia);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			LabelSubtitulos lblsbtlsNroDocumento_2 = new LabelSubtitulos((String) null);
			lblsbtlsNroDocumento_2.setText("Nro. Documento");
			lblsbtlsNroDocumento_2.setBounds(25, 1275, 109, 23);
			panel.add(lblsbtlsNroDocumento_2);
			
			txtNumDocRegGuia = new JTextField();
			txtNumDocRegGuia.setText("");
			txtNumDocRegGuia.setBounds(158, 1275, 119, 23);
			panel.add(txtNumDocRegGuia);
			
			LabelSubtitulos lblsbtlsGiro_1 = new LabelSubtitulos((String) null);
			lblsbtlsGiro_1.setText("Giro");
			lblsbtlsGiro_1.setBounds(511, 1275, 39, 23);
			panel.add(lblsbtlsGiro_1);
			
			txtGiroRegGuia = new JTextField();
			txtGiroRegGuia.setText("");
			txtGiroRegGuia.setBounds(571, 1275, 152, 23);
			panel.add(txtGiroRegGuia);
			
			LabelSubtitulos lblsbtlsValorUnitario_1 = new LabelSubtitulos((String) null);
			lblsbtlsValorUnitario_1.setText("Fecha Emision");
			lblsbtlsValorUnitario_1.setBounds(287, 1275, 85, 23);
			panel.add(lblsbtlsValorUnitario_1);
			
			FechaEmisionRegGuia = new JDateChooser();
			FechaEmisionRegGuia.setBounds(382, 1275, 119, 23);
			panel.add(FechaEmisionRegGuia);
			
			LabelSubtitulos lblsbtlsInsumo_1 = new LabelSubtitulos((String) null);
			lblsbtlsInsumo_1.setText("Direccion");
			lblsbtlsInsumo_1.setBounds(25, 1310, 119, 23);
			panel.add(lblsbtlsInsumo_1);
			
			txtDireccionRegGuia = new JTextField();
			txtDireccionRegGuia.setText("");
			txtDireccionRegGuia.setColumns(10);
			txtDireccionRegGuia.setBounds(158, 1310, 172, 23);
			panel.add(txtDireccionRegGuia);
			
			LabelSubtitulos lblsbtlsUnidadMedida_1 = new LabelSubtitulos((String) null);
			lblsbtlsUnidadMedida_1.setText("Comuna");
			lblsbtlsUnidadMedida_1.setBounds(340, 1310, 61, 23);
			panel.add(lblsbtlsUnidadMedida_1);
			
			txtComunaRegGuia = new JTextField();
			txtComunaRegGuia.setText("");
			txtComunaRegGuia.setBounds(416, 1310, 119, 23);
			panel.add(txtComunaRegGuia);
			
			LabelSubtitulos lblsbtlsCiudad_1 = new LabelSubtitulos((String) null);
			lblsbtlsCiudad_1.setText("Ciudad");
			lblsbtlsCiudad_1.setBounds(545, 1310, 57, 23);
			panel.add(lblsbtlsCiudad_1);
			
			txtCiudadRegGuia = new JTextField();
			txtCiudadRegGuia.setText("");
			txtCiudadRegGuia.setBounds(604, 1310, 119, 23);
			panel.add(txtCiudadRegGuia);
			
			LabelSubtitulos lblsbtlsStockReal_1 = new LabelSubtitulos((String) null);
			lblsbtlsStockReal_1.setText("Telefono");
			lblsbtlsStockReal_1.setBounds(25, 1345, 119, 23);
			panel.add(lblsbtlsStockReal_1);
			
			txtTelefonoRegGuia = new JTextField();
			txtTelefonoRegGuia.setText("");
			txtTelefonoRegGuia.setBounds(158, 1345, 100, 23);
			panel.add(txtTelefonoRegGuia);
			
			LabelSubtitulos lblsbtlsTipoDeTraslado = new LabelSubtitulos((String) null);
			lblsbtlsTipoDeTraslado.setText("Tipo de traslado");
			lblsbtlsTipoDeTraslado.setBounds(297, 1345, 104, 23);
			panel.add(lblsbtlsTipoDeTraslado);
			
			txtTipoTrasladoRegGuia = new JTextField();
			txtTipoTrasladoRegGuia.setText("");
			txtTipoTrasladoRegGuia.setBounds(416, 1345, 307, 23);
			panel.add(txtTipoTrasladoRegGuia);
			
			LabelSubtitulos lblsbtlsRutTransportista = new LabelSubtitulos((String) null);
			lblsbtlsRutTransportista.setText("Rut Transportista");
			lblsbtlsRutTransportista.setBounds(25, 1380, 119, 23);
			panel.add(lblsbtlsRutTransportista);
			
			
			try {
				MaskFormatter mascara = new MaskFormatter("##.###.###-A");
				txtRutTranspRegGuia = new JFormattedTextField(mascara);
				txtRutTranspRegGuia.setColumns(10);
				txtRutTranspRegGuia.setBounds(158, 1380, 100, 23);
				panel.add(txtRutTranspRegGuia);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			LabelSubtitulos lblsbtlsUnidadMedida_2 = new LabelSubtitulos((String) null);
			lblsbtlsUnidadMedida_2.setText("Patente");
			lblsbtlsUnidadMedida_2.setBounds(300, 1380, 61, 23);
			panel.add(lblsbtlsUnidadMedida_2);
			
			txtPatente = new JTextField();
			txtPatente.setText("");
			txtPatente.setBounds(372, 1380, 119, 23);
			panel.add(txtPatente);
			
			LabelSubtitulos lblsbtlsCiudad_2 = new LabelSubtitulos((String) null);
			lblsbtlsCiudad_2.setText("Rut chofer");
			lblsbtlsCiudad_2.setBounds(532, 1380, 72, 23);
			panel.add(lblsbtlsCiudad_2);
			
			try {
				MaskFormatter mascara = new MaskFormatter("##.###.###-A");
				txtRutChofer = new JFormattedTextField(mascara);
				txtRutChofer.setColumns(10);
				txtRutChofer.setBounds(629, 1380, 94, 23);
				panel.add(txtRutChofer);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		LabelSubtitulos lblsbtlsNombreDelChofer = new LabelSubtitulos((String) null);
		lblsbtlsNombreDelChofer.setText("Nombre del chofer");
		lblsbtlsNombreDelChofer.setBounds(25, 1415, 119, 23);
		panel.add(lblsbtlsNombreDelChofer);
				
		txtNombreChofer = new JTextField();
		txtNombreChofer.setText("");
		txtNombreChofer.setBounds(158, 1415, 256, 23);
		panel.add(txtNombreChofer);
				
		btnGuardarRegGuia = new StandarButton((String) null);
		btnGuardarRegGuia.setText("Guardar");
		btnGuardarRegGuia.setBounds(623, 1415, 100, 25);
		btnGuardarRegGuia.addActionListener(controlador);
		panel.add(btnGuardarRegGuia);
				
		scrollPaneRegGuia = new JScrollPane();
		scrollPaneRegGuia.setBounds(25, 1455, 698, 166);
		panel.add(scrollPaneRegGuia);
		
		tableRegGuia = new TableStandard();
		tableRegGuia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		tableRegGuia.setColums(new String[] {"Id", "Nro. Documento", "Señores", "Rut", "Fecha emision", "Giro", 
				"Direccion", "Comuna", "Ciudad", "Telefono", "Tipo de traslado", "Rut Transp.", "Patente", "Nombre del Chofer", "Rut del chofer"});
		
		tableRegGuia.getColumnModel().getColumn(0).setPreferredWidth(80);
		tableRegGuia.getColumnModel().getColumn(1).setPreferredWidth(160);
		tableRegGuia.getColumnModel().getColumn(2).setPreferredWidth(250);
		tableRegGuia.getColumnModel().getColumn(3).setPreferredWidth(120);
		tableRegGuia.getColumnModel().getColumn(4).setPreferredWidth(150);
		tableRegGuia.getColumnModel().getColumn(5).setPreferredWidth(160);
		tableRegGuia.getColumnModel().getColumn(6).setPreferredWidth(250);
		tableRegGuia.getColumnModel().getColumn(7).setPreferredWidth(150);
		tableRegGuia.getColumnModel().getColumn(8).setPreferredWidth(150);
		tableRegGuia.getColumnModel().getColumn(9).setPreferredWidth(150);
		tableRegGuia.getColumnModel().getColumn(10).setPreferredWidth(160);
		tableRegGuia.getColumnModel().getColumn(11).setPreferredWidth(120);
		tableRegGuia.getColumnModel().getColumn(12).setPreferredWidth(150);
		tableRegGuia.getColumnModel().getColumn(13).setPreferredWidth(200);
		tableRegGuia.getColumnModel().getColumn(14).setPreferredWidth(120);
		scrollPaneRegGuia.setViewportView(tableRegGuia);
		
		btnModificarRegGuia = new StandarButton((String) null);
		btnModificarRegGuia.setText("Modificar");
		btnModificarRegGuia.setBounds(25, 1635, 109, 30);
		btnModificarRegGuia.addActionListener(controlador);
		panel.add(btnModificarRegGuia);
		
		btnEliminarRegGuia = new StandarButton((String) null);
		btnEliminarRegGuia.setText("Eliminar");
		btnEliminarRegGuia.setBounds(151, 1635, 109, 30);
		btnEliminarRegGuia.addActionListener(controlador);
		panel.add(btnEliminarRegGuia);
		
		btnUsarDatosRegGui = new StandarButton((String) null);
		btnUsarDatosRegGui.setText("Usar Datos");
		btnUsarDatosRegGui.setBounds(279, 1635, 109, 30);
		btnUsarDatosRegGui.addActionListener(controlador);
		panel.add(btnUsarDatosRegGui);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(0, 1674, 748, 9);
		panel.add(separator_2);
		
		LabelSubtitulos lblsbtlsIdGuia = new LabelSubtitulos((String) null);
		lblsbtlsIdGuia.setText("ID Guia");
		lblsbtlsIdGuia.setBounds(25, 1685, 86, 23);
		panel.add(lblsbtlsIdGuia);
		
		txtIDGuia = new JTextField();
		txtIDGuia.setText("");
		txtIDGuia.setEditable(false);
		txtIDGuia.setBounds(113, 1685, 119, 23);
		panel.add(txtIDGuia);
		
		LabelSubtitulos lblsbtlsNroDocumento_1 = new LabelSubtitulos((String) null);
		lblsbtlsNroDocumento_1.setText("Nro. Documento");
		lblsbtlsNroDocumento_1.setBounds(242, 1685, 119, 23);
		panel.add(lblsbtlsNroDocumento_1);
		
		txtNumeroDocumentoReaGuia = new JTextField();
		txtNumeroDocumentoReaGuia.setText("");
		txtNumeroDocumentoReaGuia.setEditable(false);
		txtNumeroDocumentoReaGuia.setBounds(372, 1685, 145, 23);
		panel.add(txtNumeroDocumentoReaGuia);
		
		LabelSubtitulos lblsbtlsRut_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsRut_1_1.setText("Rut");
		lblsbtlsRut_1_1.setBounds(543, 1685, 61, 23);
		panel.add(lblsbtlsRut_1_1);
		
		try {
			MaskFormatter mascara = new MaskFormatter("##.###.###-A");
			txtSenoresReaGuia = new JTextField();
			txtSenoresReaGuia.setColumns(10);
			txtSenoresReaGuia.setBounds(629, 1685, 95, 23);
			panel.add(txtSenoresReaGuia);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		LabelSubtitulos lblsbtlsTrminosYCondiciones_1 = new LabelSubtitulos((String) null);
		lblsbtlsTrminosYCondiciones_1.setText("Codigo");
		lblsbtlsTrminosYCondiciones_1.setBounds(25, 1720, 86, 23);
		panel.add(lblsbtlsTrminosYCondiciones_1);
		
		txtCodReaGuia = new JTextField();
		txtCodReaGuia.setBounds(113, 1720, 119, 23);
		panel.add(txtCodReaGuia);
		
		LabelSubtitulos lblsbtlsDescripcion_1 = new LabelSubtitulos((String) null);
		lblsbtlsDescripcion_1.setText("Descripcion");
		lblsbtlsDescripcion_1.setBounds(242, 1720, 86, 23);
		panel.add(lblsbtlsDescripcion_1);
		
		txtDescripcionReaGui = new JTextField();
		txtDescripcionReaGui.setText("");
		txtDescripcionReaGui.setBounds(372, 1720, 351, 23);
		panel.add(txtDescripcionReaGui);
		
		LabelSubtitulos lblsbtlsCantidad_1 = new LabelSubtitulos((String) null);
		lblsbtlsCantidad_1.setText("Cantidad");
		lblsbtlsCantidad_1.setBounds(25, 1755, 61, 23);
		panel.add(lblsbtlsCantidad_1);
		
		txtCantidadReaGui = new JTextField();
		txtCantidadReaGui.setText("");
		txtCantidadReaGui.setBounds(113, 1755, 119, 23);
		panel.add(txtCantidadReaGui);
		
		LabelSubtitulos lblsbtlsPrecioU_2 = new LabelSubtitulos((String) null);
		lblsbtlsPrecioU_2.setText("Precio U.");
		lblsbtlsPrecioU_2.setBounds(242, 1755, 86, 23);
		panel.add(lblsbtlsPrecioU_2);
		
		LabelSubtitulos lblsbtlsPrecioU_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsPrecioU_1_2.setText("$");
		lblsbtlsPrecioU_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsPrecioU_1_2.setBounds(341, 1755, 20, 23);
		panel.add(lblsbtlsPrecioU_1_2);
		
		txtPrecioUniReaGui = new TextSoloNumeros();
		txtPrecioUniReaGui.setText("");
		txtPrecioUniReaGui.setBounds(372, 1755, 94, 23);
		panel.add(txtPrecioUniReaGui);
		
		LabelSubtitulos lblsbtlsImpuestoAdicional_1 = new LabelSubtitulos((String) null);
		lblsbtlsImpuestoAdicional_1.setText("Impuesto Adicional");
		lblsbtlsImpuestoAdicional_1.setBounds(479, 1755, 119, 23);
		panel.add(lblsbtlsImpuestoAdicional_1);
		
		LabelSubtitulos lblsbtlsPrecioU_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsPrecioU_1_1_1.setText("$");
		lblsbtlsPrecioU_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsPrecioU_1_1_1.setBounds(598, 1755, 20, 23);
		panel.add(lblsbtlsPrecioU_1_1_1);
		
		txtImpAdicionalReaGui = new TextSoloNumeros();
		txtImpAdicionalReaGui.setText("");
		txtImpAdicionalReaGui.setBounds(629, 1755, 94, 23);
		panel.add(txtImpAdicionalReaGui);
		
		btnGuardarReaGui = new StandarButton((String) null);
		btnGuardarReaGui.setText("Guardar");
		btnGuardarReaGui.setBounds(623, 1790, 100, 25);
		btnGuardarReaGui.addActionListener(controlador);
		panel.add(btnGuardarReaGui);
		
		JScrollPane scrollPaneReaGui = new JScrollPane();
		scrollPaneReaGui.setBounds(25, 1830, 698, 385);
		panel.add(scrollPaneReaGui);
		
		tableReaGui = new TableStandard();
		tableReaGui.setColums(new String[] {"Id", "Codigo", "Descripcion", "Cantidad", "$ Precio U.", "$ Imp. Adic.", "$ Total"});
		scrollPaneReaGui.setViewportView(tableReaGui);
		
		btnModificarReaGui = new StandarButton((String) null);
		btnModificarReaGui.setText("Modificar");
		btnModificarReaGui.setBounds(25, 2225, 109, 30);
		btnModificarReaGui.addActionListener(controlador);
		panel.add(btnModificarReaGui);
		
		btnEliminarReaGui = new StandarButton((String) null);
		btnEliminarReaGui.setText("Eliminar");
		btnEliminarReaGui.setBounds(151, 2225, 109, 30);
		btnEliminarReaGui.addActionListener(controlador);
		panel.add(btnEliminarReaGui);
		
		btnImprimirReaGui = new StandarButton((String) null);
		btnImprimirReaGui.setText("Imprimir");
		btnImprimirReaGui.setBounds(279, 2225, 109, 30);
		btnImprimirReaGui.addActionListener(controlador);
		panel.add(btnImprimirReaGui);
		
		LabelSubtitulos lblsbtlsNeto_1 = new LabelSubtitulos((String) null);
		lblsbtlsNeto_1.setText("Neto  $");
		lblsbtlsNeto_1.setBounds(496, 2250, 119, 23);
		panel.add(lblsbtlsNeto_1);
		
		txtNetoReaGui = new TextSoloNumeros();
		txtNetoReaGui.setText("");
		txtNetoReaGui.setBounds(629, 2250, 94, 23);
		panel.add(txtNetoReaGui);
		
		LabelSubtitulos lblsbtlsIva_1 = new LabelSubtitulos((String) null);
		lblsbtlsIva_1.setText("IVA    $");
		lblsbtlsIva_1.setBounds(496, 2285, 119, 23);
		panel.add(lblsbtlsIva_1);
		
		txtIVAReaGui = new TextSoloNumeros();
		txtIVAReaGui.setText("");
		txtIVAReaGui.setBounds(629, 2285, 94, 23);
		panel.add(txtIVAReaGui);
		
		LabelSubtitulos lblsbtlsTotal_2 = new LabelSubtitulos((String) null);
		lblsbtlsTotal_2.setText("Total  $");
		lblsbtlsTotal_2.setBounds(496, 2355, 119, 23);
		panel.add(lblsbtlsTotal_2);
		
		txtTotalReaGui = new TextSoloNumeros();
		txtTotalReaGui.setText("");
		txtTotalReaGui.setBounds(629, 2355, 94, 23);
		panel.add(txtTotalReaGui);
		
		LabelSubtitulos lblsbtlsImpAdic_1 = new LabelSubtitulos((String) null);
		lblsbtlsImpAdic_1.setText("Imp. Adic. $");
		lblsbtlsImpAdic_1.setBounds(496, 2320, 119, 23);
		panel.add(lblsbtlsImpAdic_1);
		
		txtTotalImpAdicReaGui = new TextSoloNumeros();
		txtTotalImpAdicReaGui.setText("");
		txtTotalImpAdicReaGui.setBounds(629, 2320, 94, 23);
		panel.add(txtTotalImpAdicReaGui);
		
		txtIDRegGui = new JTextField();
		txtIDRegGui.setText("");
		txtIDRegGui.setColumns(10);
		txtIDRegGui.setBounds(35, 11, 109, 20);
		panel.add(txtIDRegGui);
		
		txtIDReaGui = new JTextField();
		txtIDReaGui.setText("");
		txtIDReaGui.setColumns(10);
		txtIDReaGui.setBounds(174, 11, 109, 20);
		panel.add(txtIDReaGui);

		ActualizarVistaRegDoc();
		ActualizarVistaRegGui();

	}

	public void ActualizarVistaRegDoc() {
		VaciarFormRegDoc();
		controlador.LlenarTablaRegDoc();

	}
	
	public void ActualizarVistaReaDoc() {
		VaciarFormReaDoc();
		controlador.LlenarTablaReaDoc();

	}
	
	public void ActualizarVistaRegGui() {
		VaciarFormRegGui();
		controlador.LlenarTablaRegGui();

	}
	
	public void ActualizarVistaReaGui() {
		VaciarFormReaGui();
		controlador.LlenarTablaReaGui();

	}

	public void CargarFormRegDoc(RegistrarDocumentosEntity ape) {

		txtIdRegDoc.setText("" + ape.getId());
		comboBoxTipoDoc.setSelectedIndex(ape.getTipoDocumento());
		txtNumDocumento.setText(ape.getNumeroDocumento());
		txtSenoresRegDoc.setText(ape.getSenores());
		txtRutRegDoc.setText(ape.getRut());
		txtGiro.setText("" + ape.getGiro());
		txtDireccion.setText("" + ape.getDireccion());
		txtComuna.setText(ape.getComuna());
		txtCiudad.setText(ape.getCiudad());
		txtTelefono.setText(ape.getTelefono());
		FechaEmisionRegDoc.setCalendar(ape.getFechaEmision());;
		comboBoxTipoDoc.setSelectedIndex(ape.getTipoDocumento());
		txtTipoCompraRegDoc.setText(ape.getTipoCompra());

	}

	public void CargarFormReaDoc(RealizarDocumentosEntity ape) {

		
		txtIDReaDoc.setText("" + ape.getId());
		txtIDDoc.setText("" + ape.getIdDocumento());
		txtTipoDocumento.setText("Modificando");
		txtSenoresReaDoc.setText("Modificando");
		txtCodigoReaDoc.setText(ape.getCodigo());
		txtDescripcionReaDoc.setText(ape.getDescripcion());
		txtCantidadReaDoc.setText("" + ape.getCantidad());
		txtPrecioUniReaDoc.setText(""+ape.getPrecioUnitario());
		getTxtImpAdicionalReaDoc().setText(""+ape.getImpuestoAdicional());

	}
	
	public void CargarFormRegGui(RegistrarGuiasEntity ape) {

		txtIDRegGui.setText("" + ape.getId());
		textFieldSenoresRegGuia.setText(ape.getSenores());
		txtRutRegGuia.setText(ape.getRut());
		txtNumDocRegGuia.setText(ape.getNumeroDocumento());
		FechaEmisionRegGuia.setCalendar(ape.getFechaEmision());
		txtGiroRegGuia.setText("" + ape.getGiro());
		txtDireccionRegGuia.setText("" + ape.getDireccion());
		txtComunaRegGuia.setText(ape.getComuna());
		txtCiudadRegGuia.setText(ape.getCiudad());
		txtTelefonoRegGuia.setText(ape.getTelefono());
		txtTipoTrasladoRegGuia.setText(ape.getTipoTraslado());
		txtRutTranspRegGuia.setText(ape.getRutTransportista());
		txtPatente.setText(ape.getPatente());
		txtRutChofer.setText(ape.getRutChofer());
		txtNombreChofer.setText(ape.getNombreChofer());

	}

	public void CargarFormReaGui(RealizarGuiasEntity ape) {

		
		txtIDReaGui.setText("" + ape.getId());
		txtIDGuia.setText("" + ape.getIdGuia());
		txtNumeroDocumentoReaGuia.setText("Modificando");
		txtSenoresReaGuia.setText("Modificando");
		txtCodReaGuia.setText(ape.getCodigo());
		txtDescripcionReaGui.setText(ape.getDescripcion());
		txtCantidadReaGui.setText("" + ape.getCantidad());
		txtPrecioUniReaGui.setText(""+ape.getPrecioUnitario());
		txtImpAdicionalReaGui.setText(""+ape.getImpuestoAdicional());

	}
	
	
	public void calcularTotalReaDoc() {
		
		int total = 0;
		int totalImpuestos = 0;
		  
		for(int i=0; i<this.tableReaDoc.getRowCount(); i++) { 
			total += Integer.parseInt(String.valueOf(tableReaDoc.getModel().getValueAt(i, 6))); 
		}
		
		for(int i=0; i<this.tableReaDoc.getRowCount(); i++) { 
			totalImpuestos += Integer.parseInt(String.valueOf(tableReaDoc.getModel().getValueAt(i, 5))); 
		}
		
		int Neto = (int) (total/1.19); 
		int IVA = total - Neto;
		int TotalFinal = total + totalImpuestos;
	
		txtTotalReaDoc.setText(""+TotalFinal);
		txtNetoReaDoc.setText(""+Neto);
		txtTotalImpAdic.setText(""+totalImpuestos);
		txtIVAReaDoc.setText(""+IVA);
		 
	}
	
	public void calcularTotalReaGui() {
		
		int total = 0;
		int totalImpuestos = 0;
		  
		for(int i=0; i<this.tableReaGui.getRowCount(); i++) { 
			total += Integer.parseInt(String.valueOf(tableReaGui.getModel().getValueAt(i, 6))); 
		}
		
		for(int i=0; i<this.tableReaGui.getRowCount(); i++) { 
			totalImpuestos += Integer.parseInt(String.valueOf(tableReaGui.getModel().getValueAt(i, 5))); 
		}
		
		int Neto = (int) (total/1.19); 
		int IVA = total - Neto;
		int TotalFinal = total + totalImpuestos;
	
		txtTotalReaGui.setText(""+TotalFinal);
		txtNetoReaGui.setText(""+Neto);
		txtTotalImpAdicReaGui.setText(""+totalImpuestos);
		txtIVAReaGui.setText(""+IVA);
		 
	}

	public boolean camposVaciosRegDoc() {

		if (txtNumDocumento.getText().length() <= 0) {
			return false;
		} else if (txtSenoresRegDoc.getText().length() <= 0) {
			return false;
		} else if (txtRutRegDoc.getText().length() <= 0) {
			return false;
		} else if (txtGiro.getText().length() <= 0) {
			return false;
		} else if (txtDireccion.getText().length() <= 0) {
			return false;
		} else if (txtComuna.getText().length() <= 0) {
			return false;
		} else if (txtCiudad.getText().length() <= 0) {
			return false;
		} else if (txtTelefono.getText().length() <= 0) {
			return false;
		}else if (FechaEmisionRegDoc.getCalendar() == null) {
			return false;
		} else if (txtTipoCompraRegDoc.getText().length() <= 0) {
			return false;
		}

		return true;

	}

	public boolean camposVaciosReaDoc() {

		if (txtIDDoc.getText().length() <= 0) {
			return false;
		} else if (txtTipoDocumento.getText().length() <= 0) {
			return false;
		} else if (txtSenoresReaDoc.getText().length() <= 0) {
			return false;
		} else if (txtCodigoReaDoc.getText().length() <= 0) {
			return false;
		} else if (txtDescripcionReaDoc.getText().length() <= 0) {
			return false;
		} else if (txtCantidadReaDoc.getText().length() <= 0) {
			return false;
		} else if (txtPrecioUniReaDoc.getText().length() <= 0) {
			return false;
		} else if (txtImpAdicionalReaDoc.getText().length() <= 0) {
			return false;
		} 

		return true;
	}
	
	
	
	public boolean camposVaciosRegGui() {

		if (textFieldSenoresRegGuia.getText().length() <= 0) {
			return false;
		} else if (txtRutRegGuia.getText().length() <= 0) {
			return false;
		} else if (txtNumDocRegGuia.getText().length() <= 0) {
			return false;
		} else if (FechaEmisionRegGuia.getCalendar() == null) {
			return false;
		} else if (txtGiroRegGuia.getText().length() <= 0) {
			return false;
		} else if (txtDireccionRegGuia.getText().length() <= 0) {
			return false;
		} else if (txtComunaRegGuia.getText().length() <= 0) {
			return false;
		} else if (txtCiudadRegGuia.getText().length() <= 0) {
			return false;
		} else if (txtTelefonoRegGuia.getText().length() <= 0) {
			return false;
		} else if (txtTipoTrasladoRegGuia.getText().length() <= 0) {
			return false;
		} else if (txtRutTranspRegGuia.getText().length() <= 0) {
			return false;
		} else if (txtPatente.getText().length() <= 0) {
			return false;
		} else if (txtRutChofer.getText().length() <= 0) {
			return false;
		} else if (txtNombreChofer.getText().length() <= 0) {
			return false;
		}

		return true;
	}
	
	public boolean camposVaciosReaGui() {

		if (txtIDGuia.getText().length() <= 0) {
			return false;
		} else if (txtSenoresReaGuia.getText().length() <= 0) {
			return false;
		} else if (txtCodReaGuia.getText().length() <= 0) {
			return false;
		} else if (txtDescripcionReaGui.getText().length() <= 0) {
			return false;
		} else if (txtCantidadReaGui.getText().length() <= 0) {
			return false;
		} else if (txtPrecioUniReaGui.getText().length() <= 0) {
			return false;
		} else if (txtImpAdicionalReaGui.getText().length() <= 0) {
			return false;
		} 

		return true;
	}

	public void VaciarFormRegDoc() {
		
		comboBoxTipoDoc.setSelectedIndex(0);
		txtNumDocumento.setText("");
		txtSenoresRegDoc.setText("");
		txtRutRegDoc.setText("");
		txtGiro.setText("");
		txtDireccion.setText("");
		txtComuna.setText("");
		txtCiudad.setText("");
		txtTelefono.setText("");
		FechaEmisionRegDoc.setCalendar(null);
		txtTipoCompraRegDoc.setText("");
		txtIdRegDoc.setText("");

	}

	public void VaciarFormReaDoc() {

		txtCodigoReaDoc.setText("");
		txtDescripcionReaDoc.setText("");
		txtCantidadReaDoc.setText("");
		txtPrecioUniReaDoc.setText("");
		txtImpAdicionalReaDoc.setText("");

	}
	
	public void VaciarFormRegGui() {

		txtIDRegGui.setText("");
		textFieldSenoresRegGuia.setText("");
		txtRutRegGuia.setText("");
		txtNumDocRegGuia.setText("");
		FechaEmisionRegGuia.setCalendar(null);
		txtGiroRegGuia.setText("");;
		txtDireccionRegGuia.setText("");
		txtComunaRegGuia.setText("");
		txtCiudadRegGuia.setText("");
		txtTelefonoRegGuia.setText("");
		txtTipoTrasladoRegGuia.setText("");
		txtRutTranspRegGuia.setText("");
		txtPatente.setText("");
		txtNombreChofer.setText("");
		txtRutChofer.setText("");

	}
	
	public void VaciarFormReaGui() {

		txtIDReaGui.setText("");
		txtCodReaGuia.setText("");
		txtDescripcionReaGui.setText("");
		txtCantidadReaGui.setText("");
		txtPrecioUniReaGui.setText("");
		txtImpAdicionalReaGui.setText("");

	}

	public DefaultTableModel getModelTableRegDoc() {
		return tableRegDoc.getModel();
	}

	public DefaultTableModel getModelTableReaDoc() {
		return tableReaDoc.getModel();
	}
	
	public DefaultTableModel getModelTableRegistrarGuia() {
		return tableRegGuia.getModel();
	}

	public DefaultTableModel getModelTableRealizarGuia() {
		return tableReaGui.getModel();
	}
	
	public ControlDocumentos getControlador() {
		return controlador;
	}

	public void setControlador(ControlDocumentos controlador) {
		this.controlador = controlador;
	}

	public TableStandard getTableRegDoc() {
		return tableRegDoc;
	}

	public void setTableRegDoc(TableStandard tableRegDoc) {
		this.tableRegDoc = tableRegDoc;
	}

	public TableStandard getTableRealizarCotizacion() {
		return tableReaDoc;
	}

	public void setTableRealizarCotizacion(TableStandard tableRealizarCotizacion) {
		this.tableReaDoc = tableRealizarCotizacion;
	}

	public StandarButton getBtnGuardarRegDoc() {
		return btnGuardarRegDoc;
	}

	public void setBtnGuardarRegDoc(StandarButton btnGuardarRegDoc) {
		this.btnGuardarRegDoc = btnGuardarRegDoc;
	}

	public JTextField getTxtIdRegDoc() {
		return txtIdRegDoc;
	}

	public void setTxtIdRegDoc(JTextField txtIdRegDoc) {
		this.txtIdRegDoc = txtIdRegDoc;
	}

	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}

	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}

	public JTextField getTxtComuna() {
		return txtComuna;
	}

	public void setTxtComuna(JTextField txtComuna) {
		this.txtComuna = txtComuna;
	}

	public StandarButton getBtnModificarRegDoc() {
		return btnModificarRegDoc;
	}

	public void setBtnModificarRegDoc(StandarButton btnModificarRegDoc) {
		this.btnModificarRegDoc = btnModificarRegDoc;
	}

	public StandarButton getBtnEliminarRegDoc() {
		return btnEliminarRegDoc;
	}

	public void setBtnEliminarRegDoc(StandarButton btnEliminarRegDoc) {
		this.btnEliminarRegDoc = btnEliminarRegDoc;
	}

	public StandarButton getBtnModificarReaDoc() {
		return btnModificarReaDoc;
	}

	public void setBtnModificarReaDoc(StandarButton btnModificarReaDoc) {
		this.btnModificarReaDoc = btnModificarReaDoc;
	}

	public StandarButton getBtnEliminarReaDoc() {
		return btnEliminarReaDoc;
	}

	public void setBtnEliminarReaDoc(StandarButton btnEliminarReaDoc) {
		this.btnEliminarReaDoc = btnEliminarReaDoc;
	}

	public StandarButton getBtnUsarDatosRegDoc() {
		return btnUsarDatosRegDoc;
	}

	public void setBtnUsarDatosRegDoc(StandarButton btnUsarDatosRegDoc) {
		this.btnUsarDatosRegDoc = btnUsarDatosRegDoc;
	}

	public JTextField getTxtTipoCompraRegDoc() {
		return txtTipoCompraRegDoc;
	}

	public void setTxtTipoCompraRegDoc(JTextField txtTipoCompraRegDoc) {
		this.txtTipoCompraRegDoc = txtTipoCompraRegDoc;
	}

	public JTextField getTxtRutReaDoc() {
		return txtSenoresReaDoc;
	}

	public void setTxtRutReaDoc(JTextField txtRutReaDoc) {
		this.txtSenoresReaDoc = txtRutReaDoc;
	}

	public JTextField getTxtTipoDocumento() {
		return txtTipoDocumento;
	}

	public void setTxtTipoDocumento(JTextField txtTipoDocumento) {
		this.txtTipoDocumento = txtTipoDocumento;
	}

	public JTextField getTxtSenores() {
		return txtSenoresRegDoc;
	}

	public void setTxtSenores(JTextField txtSenores) {
		this.txtSenoresRegDoc = txtSenores;
	}

	public JFormattedTextField getTxtRut() {
		return txtRutRegDoc;
	}

	public void setTxtRut(JFormattedTextField txtRut) {
		this.txtRutRegDoc = txtRut;
	}

	public JTextField getTxtGiro() {
		return txtGiro;
	}

	public void setTxtGiro(JTextField txtGiro) {
		this.txtGiro = txtGiro;
	}

	public JTextField getTxtIDDoc() {
		return txtIDDoc;
	}

	public void setTxtIDDoc(JTextField txtIDDoc) {
		this.txtIDDoc = txtIDDoc;
	}

	public StandarButton getBtnGuardarReaDoc() {
		return btnGuardarReaDoc;
	}

	public void setBtnGuardarReaDoc(StandarButton btnGuardarReaDoc) {
		this.btnGuardarReaDoc = btnGuardarReaDoc;
	}

	public JTextField getTxtIDReaDoc() {
		return txtIDReaDoc;
	}

	public void setTxtIDReaDoc(JTextField txtIDReaDoc) {
		this.txtIDReaDoc = txtIDReaDoc;
	}

	public JTextField getTxtCodigoReaDoc() {
		return txtCodigoReaDoc;
	}

	public void setTxtCodigoReaDoc(JTextField txtCodigoReaDoc) {
		this.txtCodigoReaDoc = txtCodigoReaDoc;
	}

	public JComboBox getComboBoxTipoDoc() {
		return comboBoxTipoDoc;
	}

	public void setComboBoxTipoDoc(JComboBox comboBoxTipoDoc) {
		this.comboBoxTipoDoc = comboBoxTipoDoc;
	}

	public JTextField getTxtDescripcionReaDoc() {
		return txtDescripcionReaDoc;
	}

	public void setTxtDescripcionReaDoc(JTextField txtDescripcionReaDoc) {
		this.txtDescripcionReaDoc = txtDescripcionReaDoc;
	}

	public JTextField getTxtCantidadReaDoc() {
		return txtCantidadReaDoc;
	}

	public void setTxtCantidadReaDoc(JTextField txtCantidadReaDoc) {
		this.txtCantidadReaDoc = txtCantidadReaDoc;
	}

	public JDateChooser getFechaEmisionRegDoc() {
		return FechaEmisionRegDoc;
	}

	public void setFechaEmisionRegDoc(JDateChooser fechaEmisionRegDoc) {
		FechaEmisionRegDoc = fechaEmisionRegDoc;
	}

	public TableStandard getTableReaDoc() {
		return tableReaDoc;
	}

	public void setTableReaDoc(TableStandard tableReaDoc) {
		this.tableReaDoc = tableReaDoc;
	}

	public JTextField getTxtSenoresRegDoc() {
		return txtSenoresRegDoc;
	}

	public void setTxtSenoresRegDoc(JTextField txtSenoresRegDoc) {
		this.txtSenoresRegDoc = txtSenoresRegDoc;
	}

	public JFormattedTextField getTxtRutRegDoc() {
		return txtRutRegDoc;
	}

	public void setTxtRutRegDoc(JFormattedTextField txtRutRegDoc) {
		this.txtRutRegDoc = txtRutRegDoc;
	}

	public TextSoloNumeros getTxtNetoReaDoc() {
		return txtNetoReaDoc;
	}

	public void setTxtNetoReaDoc(TextSoloNumeros txtNetoReaDoc) {
		this.txtNetoReaDoc = txtNetoReaDoc;
	}

	public TextSoloNumeros getTxtTotalReaDoc() {
		return txtTotalReaDoc;
	}

	public void setTxtTotalReaDoc(TextSoloNumeros txtTotalReaDoc) {
		this.txtTotalReaDoc = txtTotalReaDoc;
	}

	public TextSoloNumeros getTxtIVAReaDoc() {
		return txtIVAReaDoc;
	}

	public void setTxtIVAReaDoc(TextSoloNumeros txtIVAReaDoc) {
		this.txtIVAReaDoc = txtIVAReaDoc;
	}

	public JTextField getTxtNumDocumento() {
		return txtNumDocumento;
	}

	public void setTxtNumDocumento(JTextField txtNumDocumento) {
		this.txtNumDocumento = txtNumDocumento;
	}

	public JTextField getTxtCiudad() {
		return txtCiudad;
	}

	public void setTxtCiudad(JTextField txtCiudad) {
		this.txtCiudad = txtCiudad;
	}

	public TextSoloNumeros getTxtPrecioUniReaDoc() {
		return txtPrecioUniReaDoc;
	}

	public void setTxtPrecioUniReaDoc(TextSoloNumeros txtPrecioUniReaDoc) {
		this.txtPrecioUniReaDoc = txtPrecioUniReaDoc;
	}

	public TextSoloNumeros getTxtImpAdicionalReaDoc() {
		return txtImpAdicionalReaDoc;
	}

	public void setTxtImpAdicionalReaDoc(TextSoloNumeros txtImpAdicionalReaDoc) {
		this.txtImpAdicionalReaDoc = txtImpAdicionalReaDoc;
	}

	public StandarButton getBtnImprimirReaDoc() {
		return btnImprimirReaDoc;
	}

	public void setBtnImprimirReaDoc(StandarButton btnImprimirReaDoc) {
		this.btnImprimirReaDoc = btnImprimirReaDoc;
	}

	public TextSoloNumeros getTxtTotalImpAdic() {
		return txtTotalImpAdic;
	}

	public void setTxtTotalImpAdic(TextSoloNumeros txtTotalImpAdic) {
		this.txtTotalImpAdic = txtTotalImpAdic;
	}

	public JTextField getTextFieldSenoresRegGuia() {
		return textFieldSenoresRegGuia;
	}

	public void setTextFieldSenoresRegGuia(JTextField textFieldSenoresRegGuia) {
		this.textFieldSenoresRegGuia = textFieldSenoresRegGuia;
	}

	public JFormattedTextField getTxtRutRegGuia() {
		return txtRutRegGuia;
	}

	public void setTxtRutRegGuia(JFormattedTextField txtRutRegGuia) {
		this.txtRutRegGuia = txtRutRegGuia;
	}

	public JTextField getTxtNumDocRegGuia() {
		return txtNumDocRegGuia;
	}

	public void setTxtNumDocRegGuia(JTextField txtNumDocRegGuia) {
		this.txtNumDocRegGuia = txtNumDocRegGuia;
	}

	public JTextField getTxtGiroRegGuia() {
		return txtGiroRegGuia;
	}

	public void setTxtGiroRegGuia(JTextField txtGiroRegGuia) {
		this.txtGiroRegGuia = txtGiroRegGuia;
	}

	public JTextField getTxtDireccionRegGuia() {
		return txtDireccionRegGuia;
	}

	public void setTxtDireccionRegGuia(JTextField txtDireccionRegGuia) {
		this.txtDireccionRegGuia = txtDireccionRegGuia;
	}

	public JTextField getTxtComunaRegGuia() {
		return txtComunaRegGuia;
	}

	public void setTxtComunaRegGuia(JTextField txtComunaRegGuia) {
		this.txtComunaRegGuia = txtComunaRegGuia;
	}

	public JTextField getTxtCiudadRegGuia() {
		return txtCiudadRegGuia;
	}

	public void setTxtCiudadRegGuia(JTextField txtCiudadRegGuia) {
		this.txtCiudadRegGuia = txtCiudadRegGuia;
	}

	public JTextField getTxtTelefonoRegGuia() {
		return txtTelefonoRegGuia;
	}

	public void setTxtTelefonoRegGuia(JTextField txtTelefonoRegGuia) {
		this.txtTelefonoRegGuia = txtTelefonoRegGuia;
	}

	public JTextField getTxtTipoTrasladoRegGuia() {
		return txtTipoTrasladoRegGuia;
	}

	public void setTxtTipoTrasladoRegGuia(JTextField txtTipoTrasladoRegGuia) {
		this.txtTipoTrasladoRegGuia = txtTipoTrasladoRegGuia;
	}

	public JTextField getTxtPatente() {
		return txtPatente;
	}

	public void setTxtPatente(JTextField txtPatente) {
		this.txtPatente = txtPatente;
	}

	public JFormattedTextField getTxtRutTranspRegGuia() {
		return txtRutTranspRegGuia;
	}

	public void setTxtRutTranspRegGuia(JFormattedTextField txtRutTranspRegGuia) {
		this.txtRutTranspRegGuia = txtRutTranspRegGuia;
	}

	public JFormattedTextField getTxtRutChofer() {
		return txtRutChofer;
	}

	public void setTxtRutChofer(JFormattedTextField txtRutChofer) {
		this.txtRutChofer = txtRutChofer;
	}

	public JTextField getTxtNombreChofer() {
		return txtNombreChofer;
	}

	public void setTxtNombreChofer(JTextField txtNombreChofer) {
		this.txtNombreChofer = txtNombreChofer;
	}

	public StandarButton getBtnGuardarRegGuia() {
		return btnGuardarRegGuia;
	}

	public void setBtnGuardarRegGuia(StandarButton btnGuardarRegGuia) {
		this.btnGuardarRegGuia = btnGuardarRegGuia;
	}

	public JScrollPane getScrollPaneRegGuia() {
		return scrollPaneRegGuia;
	}

	public void setScrollPaneRegGuia(JScrollPane scrollPaneRegGuia) {
		this.scrollPaneRegGuia = scrollPaneRegGuia;
	}

	public TableStandard getTableRegGuia() {
		return tableRegGuia;
	}

	public void setTableRegGuia(TableStandard tableRegGuia) {
		this.tableRegGuia = tableRegGuia;
	}

	public StandarButton getBtnModificarRegGuia() {
		return btnModificarRegGuia;
	}

	public void setBtnModificarRegGuia(StandarButton btnModificarRegGuia) {
		this.btnModificarRegGuia = btnModificarRegGuia;
	}

	public StandarButton getBtnEliminarRegGuia() {
		return btnEliminarRegGuia;
	}

	public void setBtnEliminarRegGuia(StandarButton btnEliminarRegGuia) {
		this.btnEliminarRegGuia = btnEliminarRegGuia;
	}

	public JTextField getTxtIDGuia() {
		return txtIDGuia;
	}

	public void setTxtIDGuia(JTextField txtIDGuia) {
		this.txtIDGuia = txtIDGuia;
	}

	public JTextField getTxtNumeroDocumentoReaGuia() {
		return txtNumeroDocumentoReaGuia;
	}

	public void setTxtNumeroDocumentoReaGuia(JTextField txtNumeroDocumentoReaGuia) {
		this.txtNumeroDocumentoReaGuia = txtNumeroDocumentoReaGuia;
	}

	public JTextField getTxtRutReaGuia() {
		return txtSenoresReaGuia;
	}

	public void setTxtRutReaGuia(JTextField txtRutReaGuia) {
		this.txtSenoresReaGuia = txtRutReaGuia;
	}

	public JTextField getTxtCodReaGuia() {
		return txtCodReaGuia;
	}

	public void setTxtCodReaGuia(JTextField txtCodReaGuia) {
		this.txtCodReaGuia = txtCodReaGuia;
	}

	public JTextField getTxtDescripcionReaGui() {
		return txtDescripcionReaGui;
	}

	public void setTxtDescripcionReaGui(JTextField txtDescripcionReaGui) {
		this.txtDescripcionReaGui = txtDescripcionReaGui;
	}

	public JTextField getTxtCantidadReaGui() {
		return txtCantidadReaGui;
	}

	public void setTxtCantidadReaGui(JTextField txtCantidadReaGui) {
		this.txtCantidadReaGui = txtCantidadReaGui;
	}

	public TextSoloNumeros getTxtPrecioUniReaGui() {
		return txtPrecioUniReaGui;
	}

	public void setTxtPrecioUniReaGui(TextSoloNumeros txtPrecioUniReaGui) {
		this.txtPrecioUniReaGui = txtPrecioUniReaGui;
	}

	public TextSoloNumeros getTxtImpAdicionalReaGui() {
		return txtImpAdicionalReaGui;
	}

	public void setTxtImpAdicionalReaGui(TextSoloNumeros txtImpAdicionalReaGui) {
		this.txtImpAdicionalReaGui = txtImpAdicionalReaGui;
	}

	public StandarButton getBtnGuardarReaGui() {
		return btnGuardarReaGui;
	}

	public void setBtnGuardarReaGui(StandarButton btnGuardarReaGui) {
		this.btnGuardarReaGui = btnGuardarReaGui;
	}

	public TableStandard getTableReaGui() {
		return tableReaGui;
	}

	public void setTableReaGui(TableStandard tableReaGui) {
		this.tableReaGui = tableReaGui;
	}

	public StandarButton getBtnImprimirReaGui() {
		return btnImprimirReaGui;
	}

	public void setBtnImprimirReaGui(StandarButton btnImprimirReaGui) {
		this.btnImprimirReaGui = btnImprimirReaGui;
	}

	public StandarButton getBtnEliminarReaGui() {
		return btnEliminarReaGui;
	}

	public void setBtnEliminarReaGui(StandarButton btnEliminarReaGui) {
		this.btnEliminarReaGui = btnEliminarReaGui;
	}

	public StandarButton getBtnModificarReaGui() {
		return btnModificarReaGui;
	}

	public void setBtnModificarReaGui(StandarButton btnModificarReaGui) {
		this.btnModificarReaGui = btnModificarReaGui;
	}

	public TextSoloNumeros getTxtNetoReaGui() {
		return txtNetoReaGui;
	}

	public void setTxtNetoReaGui(TextSoloNumeros txtNetoReaGui) {
		this.txtNetoReaGui = txtNetoReaGui;
	}

	public TextSoloNumeros getTxtTotalImpAdicReaGui() {
		return txtTotalImpAdicReaGui;
	}

	public void setTxtTotalImpAdicReaGui(TextSoloNumeros txtTotalImpAdicReaGui) {
		this.txtTotalImpAdicReaGui = txtTotalImpAdicReaGui;
	}

	public TextSoloNumeros getTxtTotalReaGui() {
		return txtTotalReaGui;
	}

	public void setTxtTotalReaGui(TextSoloNumeros txtTotalReaGui) {
		this.txtTotalReaGui = txtTotalReaGui;
	}

	public JTextField getTxtSenoresReaDoc() {
		return txtSenoresReaDoc;
	}

	public void setTxtSenoresReaDoc(JTextField txtSenoresReaDoc) {
		this.txtSenoresReaDoc = txtSenoresReaDoc;
	}

	public JTextField getTxtIDRegGui() {
		return txtIDRegGui;
	}

	public void setTxtIDRegGui(JTextField txtIDRegGui) {
		this.txtIDRegGui = txtIDRegGui;
	}

	public JTextField getTxtIDReaGui() {
		return txtIDReaGui;
	}

	public void setTxtIDReaGui(JTextField txtIDReaGui) {
		this.txtIDReaGui = txtIDReaGui;
	}

	public JTextField getTxtSenoresReaGuia() {
		return txtSenoresReaGuia;
	}

	public void setTxtSenoresReaGuia(JTextField txtSenoresReaGuia) {
		this.txtSenoresReaGuia = txtSenoresReaGuia;
	}

	public JDateChooser getFechaEmisionRegGuia() {
		return FechaEmisionRegGuia;
	}

	public void setFechaEmisionRegGuia(JDateChooser fechaEmisionRegGuia) {
		FechaEmisionRegGuia = fechaEmisionRegGuia;
	}

	public StandarButton getBtnUsarDatosRegGui() {
		return btnUsarDatosRegGui;
	}

	public void setBtnUsarDatosRegGui(StandarButton btnUsarDatosRegGui) {
		this.btnUsarDatosRegGui = btnUsarDatosRegGui;
	}

	public TextSoloNumeros getTxtIVAReaGui() {
		return txtIVAReaGui;
	}

	public void setTxtIVAReaGui(TextSoloNumeros txtIVAReaGui) {
		this.txtIVAReaGui = txtIVAReaGui;
	}
}
