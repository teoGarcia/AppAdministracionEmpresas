package TerceroMedio.GestionComercialTrib.OC;

import java.awt.Color;
import java.awt.Dimension;
import java.text.ParseException;

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

import TerceroMedio.GestionComercialTrib.Cotizacion.RealizarCotizacionEntity;
import ui.Buttons.StandarButton;
import ui.Labels.LabelSubtitulos;
import ui.Labels.LabelTitulos;
import ui.TablaUi.TableStandard;
import ui.Texts.TextSoloNumeros;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VistaOC extends JPanel {
	
	private TableStandard tableRegistrarOC;
	private TableStandard tableRealizarOC;
	private StandarButton btnGuardarRegistroOC;
	private JTextField txtNombreOC;
	private JTextField txtEstado;
	private JTextField txtNumeroOC;
	private StandarButton btnModificaRegistroOC;
	private StandarButton btnEliminarRegistroOC;
	private StandarButton btnUsarDatosRegistrarOC;
	private JFormattedTextField txtRut;
	private JDateChooser FechaEnvioOC;
	private ControlOC controlador;
	private JTextField txtSenores;
	private JTextField txtDireccionEnvFac;
	private JTextField txtDireccionDespacho;
	private JTextField txtMetodoDespacho;
	private JTextField txtFormaPago;
	private JTextField txtObservacion;
	private JTextField txtIDOC;
	private JTextField txtCodLicitacion;
	private JTextField txtProducto;
	private JTextField txtCantidad;
	private TextSoloNumeros txtValorUnitario;
	private JTextField txtEspecifComprador;
	private JTextField txtEspecifProveedor;
	private StandarButton btnModificarRealizarOC;
	private StandarButton btnEliminarRealizarOC;
	private StandarButton btnImprimirOC;
	private JComboBox comboBoxUM;
	private JTextField txtIDRegOC;
	private JDateChooser FechaEntregaProd;
	private TextSoloNumeros txtNeto;
	private TextSoloNumeros txtDescuentosTotal;
	private TextSoloNumeros txtCargosTotal;
	private TextSoloNumeros txtSubtotal;
	private TextSoloNumeros txtIVA;
	private TextSoloNumeros txtTotal;
	private StandarButton btnGuardarRealizarOC;
	private JTextField txtIDRealizarOC;
	private TextSoloNumeros txtCargo;
	private TextSoloNumeros txtDescuento;
	private JScrollPane scrollPaneRealizarOC;

	/**
	 * Create the panel.
	 * @throws ParseException 
	 */
	public VistaOC() {

		controlador = new ControlOC(this);

		setOpaque(false);
		setBounds(0, 0, 748, 722);
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1450));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);

		LabelTitulos lbltlsInventario = new LabelTitulos((String) null);
		lbltlsInventario.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsInventario.setText("Registrar Orden de Compra");
		lbltlsInventario.setBounds(0, 61, 748, 30);
		panel.add(lbltlsInventario);

		LabelSubtitulos lblsbtlsTipoDeProducto = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeProducto.setText("Señor(es)");
		lblsbtlsTipoDeProducto.setBounds(25, 129, 119, 23);
		panel.add(lblsbtlsTipoDeProducto);
		
		try {
			MaskFormatter mascara = new MaskFormatter("##.###.###-A");
			txtRut = new JFormattedTextField(mascara);
			txtRut.setColumns(10);
			txtRut.setBounds(614, 130, 109, 23);
			panel.add(txtRut);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LabelSubtitulos lblsbtlsInsumo = new LabelSubtitulos((String) null);
		lblsbtlsInsumo.setText("Nombre de O.C.");
		lblsbtlsInsumo.setBounds(25, 173, 119, 23);
		panel.add(lblsbtlsInsumo);

		txtNombreOC = new JTextField();
		txtNombreOC.setBounds(154, 173, 309, 23);
		panel.add(txtNombreOC);
		txtNombreOC.setColumns(10);

		LabelSubtitulos lblsbtlsUnidadMedida = new LabelSubtitulos((String) null);
		lblsbtlsUnidadMedida.setText("Numero O.C.");
		lblsbtlsUnidadMedida.setBounds(472, 173, 76, 23);
		panel.add(lblsbtlsUnidadMedida);

		txtNumeroOC = new JTextField();
		txtNumeroOC.setBounds(558, 173, 165, 23);
		panel.add(txtNumeroOC);

		LabelSubtitulos lblsbtlsStockReal = new LabelSubtitulos((String) null);
		lblsbtlsStockReal.setText("Fecha envio O.C");
		lblsbtlsStockReal.setBounds(25, 213, 119, 23);
		panel.add(lblsbtlsStockReal);
		
		FechaEnvioOC = new JDateChooser();
		FechaEnvioOC.setBounds(154, 213, 134, 23);
		panel.add(FechaEnvioOC);

		LabelSubtitulos lblsbtlsValorUnitario = new LabelSubtitulos((String) null);
		lblsbtlsValorUnitario.setText("Fecha entrega prod.");
		lblsbtlsValorUnitario.setBounds(294, 213, 123, 23);
		panel.add(lblsbtlsValorUnitario);

		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setText("Enviada a Proveedor");
		txtEstado.setBounds(604, 214, 119, 23);
		panel.add(txtEstado);

		btnGuardarRegistroOC = new StandarButton((String) null);
		btnGuardarRegistroOC.setText("Guardar");
		btnGuardarRegistroOC.setBounds(623, 337, 100, 25);
		btnGuardarRegistroOC.addActionListener(controlador);
		panel.add(btnGuardarRegistroOC);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 620, 748, 9);
		panel.add(separator);

		JScrollPane scrollPaneRegistrarOC = new JScrollPane();
		scrollPaneRegistrarOC.setBounds(25, 383, 698, 185);
		panel.add(scrollPaneRegistrarOC);

		tableRegistrarOC = new TableStandard();
		tableRegistrarOC.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String[] columnsAlimBebidas = new String[] { "Id", "Señor(es)", "Rut", "Nombre O.C.", "Numero O.C.", "Fecha envio O.C.",
				"Fecha entrega Prod.", "Estado", "Direccion de envio de Facturas", "Direccion de despacho", "Metodo de despacho", "Forma de pago", "Observacion" };
		tableRegistrarOC.setColums(columnsAlimBebidas);
		scrollPaneRegistrarOC.setViewportView(tableRegistrarOC);
		tableRegistrarOC.getColumnModel().getColumn(0).setPreferredWidth(60);
		tableRegistrarOC.getColumnModel().getColumn(1).setPreferredWidth(250);
		tableRegistrarOC.getColumnModel().getColumn(2).setPreferredWidth(140);
		tableRegistrarOC.getColumnModel().getColumn(3).setPreferredWidth(250);
		tableRegistrarOC.getColumnModel().getColumn(4).setPreferredWidth(180);
		tableRegistrarOC.getColumnModel().getColumn(5).setPreferredWidth(180);
		tableRegistrarOC.getColumnModel().getColumn(6).setPreferredWidth(180);
		tableRegistrarOC.getColumnModel().getColumn(7).setPreferredWidth(180);
		tableRegistrarOC.getColumnModel().getColumn(8).setPreferredWidth(250);
		tableRegistrarOC.getColumnModel().getColumn(9).setPreferredWidth(250);
		tableRegistrarOC.getColumnModel().getColumn(10).setPreferredWidth(180);
		tableRegistrarOC.getColumnModel().getColumn(11).setPreferredWidth(300);
		tableRegistrarOC.getColumnModel().getColumn(12).setPreferredWidth(200);
		btnModificaRegistroOC = new StandarButton((String) null);
		btnModificaRegistroOC.setText("Modificar");
		btnModificaRegistroOC.setBounds(25, 579, 109, 30);
		btnModificaRegistroOC.addActionListener(controlador);
		panel.add(btnModificaRegistroOC);

		btnEliminarRegistroOC = new StandarButton((String) null);
		btnEliminarRegistroOC.setText("Eliminar");
		btnEliminarRegistroOC.setBounds(151, 579, 109, 30);
		btnEliminarRegistroOC.addActionListener(controlador);
		panel.add(btnEliminarRegistroOC);

		btnUsarDatosRegistrarOC = new StandarButton((String) null);
		btnUsarDatosRegistrarOC.setText("Usar Datos");
		btnUsarDatosRegistrarOC.setBounds(279, 579, 109, 30);
		btnUsarDatosRegistrarOC.addActionListener(controlador);
		panel.add(btnUsarDatosRegistrarOC);

		scrollPaneRealizarOC = new JScrollPane();
		scrollPaneRealizarOC.setBounds(25, 860, 698, 320);
		panel.add(scrollPaneRealizarOC);

		tableRealizarOC = new TableStandard();
		tableRealizarOC.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String[] columnsMateOficina = new String[] { "ID", "Cod./ID Licit.", "Producto", "Cantidad", "U.M", "Especific. Comprador", "Especific. Proveedor",
				"$ Valor U.", "$ Desc.", "$ Cargos", "$ Total"};
		tableRealizarOC.setColums(columnsMateOficina);
		tableRealizarOC.getColumnModel().getColumn(0).setPreferredWidth(80);
		tableRealizarOC.getColumnModel().getColumn(1).setPreferredWidth(80);
		tableRealizarOC.getColumnModel().getColumn(2).setPreferredWidth(200);
		tableRealizarOC.getColumnModel().getColumn(3).setPreferredWidth(80);
		tableRealizarOC.getColumnModel().getColumn(4).setPreferredWidth(60);
		tableRealizarOC.getColumnModel().getColumn(5).setPreferredWidth(225);
		tableRealizarOC.getColumnModel().getColumn(6).setPreferredWidth(225);
		tableRealizarOC.getColumnModel().getColumn(7).setPreferredWidth(120);
		tableRealizarOC.getColumnModel().getColumn(8).setPreferredWidth(120);
		tableRealizarOC.getColumnModel().getColumn(9).setPreferredWidth(120);
		tableRealizarOC.getColumnModel().getColumn(10).setPreferredWidth(120);
		scrollPaneRealizarOC.setViewportView(tableRealizarOC);
		
		txtSenores = new JTextField();
		txtSenores.setColumns(10);
		txtSenores.setBounds(154, 131, 364, 23);
		panel.add(txtSenores);
		
		LabelSubtitulos lblsbtlsRut = new LabelSubtitulos((String) null);
		lblsbtlsRut.setText("Rut");
		lblsbtlsRut.setBounds(550, 129, 52, 23);
		panel.add(lblsbtlsRut);
		
		FechaEntregaProd = new JDateChooser();
		FechaEntregaProd.setBounds(414, 213, 134, 23);
		panel.add(FechaEntregaProd);
		
		LabelSubtitulos lblsbtlsEstado = new LabelSubtitulos((String) null);
		lblsbtlsEstado.setText("Estado");
		lblsbtlsEstado.setBounds(558, 213, 46, 23);
		panel.add(lblsbtlsEstado);
		
		LabelSubtitulos lblsbtlsDireccionEnvioFact = new LabelSubtitulos((String) null);
		lblsbtlsDireccionEnvioFact.setText("Direcc. envio Fact.");
		lblsbtlsDireccionEnvioFact.setBounds(25, 254, 119, 23);
		panel.add(lblsbtlsDireccionEnvioFact);
		
		txtDireccionEnvFac = new JTextField();
		txtDireccionEnvFac.setColumns(10);
		txtDireccionEnvFac.setBounds(154, 254, 210, 23);
		panel.add(txtDireccionEnvFac);
		
		LabelSubtitulos lblsbtlsDireccionDeDespacho = new LabelSubtitulos((String) null);
		lblsbtlsDireccionDeDespacho.setText("Direcc. de Despacho");
		lblsbtlsDireccionDeDespacho.setBounds(374, 254, 123, 23);
		panel.add(lblsbtlsDireccionDeDespacho);
		
		txtDireccionDespacho = new JTextField();
		txtDireccionDespacho.setBounds(507, 255, 216, 23);
		panel.add(txtDireccionDespacho);
		
		LabelSubtitulos lblsbtlsMetodoDeDespacho = new LabelSubtitulos((String) null);
		lblsbtlsMetodoDeDespacho.setText("Metodo despacho");
		lblsbtlsMetodoDeDespacho.setBounds(25, 297, 119, 23);
		panel.add(lblsbtlsMetodoDeDespacho);
		
		txtMetodoDespacho = new JTextField();
		txtMetodoDespacho.setText("Despachar a direccion de envio");
		txtMetodoDespacho.setColumns(10);
		txtMetodoDespacho.setBounds(154, 297, 210, 23);
		panel.add(txtMetodoDespacho);
		
		LabelSubtitulos lblsbtlsFormaDePago = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago.setText("Forma de pago");
		lblsbtlsFormaDePago.setBounds(374, 297, 123, 23);
		panel.add(lblsbtlsFormaDePago);
		
		txtFormaPago = new JTextField();
		txtFormaPago.setBounds(507, 298, 216, 23);
		panel.add(txtFormaPago);
		
		txtObservacion = new JTextField();
		txtObservacion.setText("Ninguna");
		txtObservacion.setColumns(10);
		txtObservacion.setBounds(154, 338, 439, 23);
		panel.add(txtObservacion);
		
		LabelSubtitulos lblsbtlsMetodoDeDespacho_1 = new LabelSubtitulos((String) null);
		lblsbtlsMetodoDeDespacho_1.setText("Observacion");
		lblsbtlsMetodoDeDespacho_1.setBounds(25, 338, 119, 23);
		panel.add(lblsbtlsMetodoDeDespacho_1);
		
		LabelSubtitulos lblsbtlsCodId = new LabelSubtitulos((String) null);
		lblsbtlsCodId.setText("ID O.C.");
		lblsbtlsCodId.setBounds(25, 640, 134, 23);
		panel.add(lblsbtlsCodId);
		
		txtIDOC = new JTextField();
		txtIDOC.setEditable(false);
		txtIDOC.setColumns(10);
		txtIDOC.setBounds(154, 640, 109, 23);
		panel.add(txtIDOC);
		
		LabelSubtitulos lblsbtlsFormaDePago_1 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1.setText("Cod. / ID Licitacion CM");
		lblsbtlsFormaDePago_1.setBounds(294, 640, 134, 23);
		panel.add(lblsbtlsFormaDePago_1);
		
		txtCodLicitacion = new JTextField();
		txtCodLicitacion.setBounds(438, 641, 285, 23);
		panel.add(txtCodLicitacion);
		
		LabelSubtitulos lblsbtlsProducto = new LabelSubtitulos((String) null);
		lblsbtlsProducto.setText("Producto");
		lblsbtlsProducto.setBounds(24, 679, 134, 23);
		panel.add(lblsbtlsProducto);
		
		txtProducto = new JTextField();
		txtProducto.setColumns(10);
		txtProducto.setBounds(153, 679, 364, 23);
		panel.add(txtProducto);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1.setText("Cantidad");
		lblsbtlsFormaDePago_1_1.setBounds(535, 679, 66, 23);
		panel.add(lblsbtlsFormaDePago_1_1);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(622, 679, 100, 23);
		panel.add(txtCantidad);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_1.setText("Valor Unitario $");
		lblsbtlsFormaDePago_1_1_1.setBounds(24, 722, 91, 23);
		panel.add(lblsbtlsFormaDePago_1_1_1);
		
		txtValorUnitario = new TextSoloNumeros();
		txtValorUnitario.setBounds(153, 722, 100, 23);
		panel.add(txtValorUnitario);
		
		LabelSubtitulos lblsbtlsEspecifComprador = new LabelSubtitulos((String) null);
		lblsbtlsEspecifComprador.setText("Especif. Comprador");
		lblsbtlsEspecifComprador.setBounds(24, 766, 134, 23);
		panel.add(lblsbtlsEspecifComprador);
		
		txtEspecifComprador = new JTextField();
		txtEspecifComprador.setText("Ninguno");
		txtEspecifComprador.setColumns(10);
		txtEspecifComprador.setBounds(153, 766, 210, 23);
		panel.add(txtEspecifComprador);
		
		LabelSubtitulos lblsbtlsEspecifProveedor = new LabelSubtitulos((String) null);
		lblsbtlsEspecifProveedor.setText("Especif. Proveedor");
		lblsbtlsEspecifProveedor.setBounds(383, 766, 134, 23);
		panel.add(lblsbtlsEspecifProveedor);
		
		txtEspecifProveedor = new JTextField();
		txtEspecifProveedor.setText("Ninguno");
		txtEspecifProveedor.setColumns(10);
		txtEspecifProveedor.setBounds(512, 766, 210, 23);
		panel.add(txtEspecifProveedor);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_1_1.setText("Cargo $");
		lblsbtlsFormaDePago_1_1_1_1.setBounds(297, 722, 66, 23);
		panel.add(lblsbtlsFormaDePago_1_1_1_1);
		
		txtCargo = new TextSoloNumeros();
		txtCargo.setText("0");
		txtCargo.setBounds(369, 723, 100, 23);
		panel.add(txtCargo);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_1_1_1.setText("Descuento $");
		lblsbtlsFormaDePago_1_1_1_1_1.setBounds(534, 722, 91, 23);
		panel.add(lblsbtlsFormaDePago_1_1_1_1_1);
		
		txtDescuento = new TextSoloNumeros();
		txtDescuento.setText("0");
		txtDescuento.setBounds(623, 723, 100, 23);
		panel.add(txtDescuento);
		
		btnModificarRealizarOC = new StandarButton((String) null);
		btnModificarRealizarOC.setText("Modificar");
		btnModificarRealizarOC.setBounds(25, 1200, 109, 30);
		btnModificarRealizarOC.addActionListener(controlador);
		panel.add(btnModificarRealizarOC);
		
		btnEliminarRealizarOC = new StandarButton((String) null);
		btnEliminarRealizarOC.setText("Eliminar");
		btnEliminarRealizarOC.setBounds(151, 1200, 109, 30);
		btnEliminarRealizarOC.addActionListener(controlador);
		panel.add(btnEliminarRealizarOC);
		
		btnImprimirOC = new StandarButton((String) null);
		btnImprimirOC.setText("Imprimir");
		btnImprimirOC.setBounds(279, 1200, 109, 30);
		btnImprimirOC.addActionListener(controlador);
		panel.add(btnImprimirOC);
		
		btnGuardarRealizarOC = new StandarButton((String) null);
		btnGuardarRealizarOC.setText("Guardar");
		btnGuardarRealizarOC.setBounds(623, 810, 100, 25);
		btnGuardarRealizarOC.addActionListener(controlador);
		panel.add(btnGuardarRealizarOC);
		
		LabelSubtitulos lblsbtlsUnidadMedida_1 = new LabelSubtitulos((String) null);
		lblsbtlsUnidadMedida_1.setText("Unidad Medida");
		lblsbtlsUnidadMedida_1.setBounds(25, 810, 100, 23);
		panel.add(lblsbtlsUnidadMedida_1);
		
		comboBoxUM = new JComboBox();
		comboBoxUM.setModel(new DefaultComboBoxModel(new String[] {"C/U", "PAR", "KG", "MTS", "PAQUETE"}));
		comboBoxUM.setBounds(154, 810, 134, 24);
		panel.add(comboBoxUM);
		
		txtIDRegOC = new JTextField();
		txtIDRegOC.setVisible(false);
		txtIDRegOC.setColumns(10);
		txtIDRegOC.setBounds(154, 95, 106, 23);
		panel.add(txtIDRegOC);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2.setText("Neto");
		lblsbtlsFormaDePago_1_1_2.setBounds(523, 1200, 39, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2);
		
		txtNeto = new TextSoloNumeros();
		txtNeto.setBounds(622, 1200, 100, 23);
		panel.add(txtNeto);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_1 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_1.setText("Descuentos ");
		lblsbtlsFormaDePago_1_1_2_1.setBounds(523, 1230, 76, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_1);
		
		txtDescuentosTotal = new TextSoloNumeros();
		txtDescuentosTotal.setBounds(621, 1230, 100, 23);
		panel.add(txtDescuentosTotal);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_1_1.setText("Cargos");
		lblsbtlsFormaDePago_1_1_2_1_1.setBounds(523, 1260, 53, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_1_1);
		
		txtCargosTotal = new TextSoloNumeros();
		txtCargosTotal.setBounds(621, 1260, 100, 23);
		panel.add(txtCargosTotal);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_1_3 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_1_3.setText("19% IVA");
		lblsbtlsFormaDePago_1_1_2_1_3.setBounds(523, 1320, 71, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_1_3);
		
		txtIVA = new TextSoloNumeros();
		txtIVA.setBounds(621, 1320, 100, 23);
		panel.add(txtIVA);
		
		
		LabelSubtitulos lblSubTotal = new LabelSubtitulos((String) null);
		lblSubTotal.setText("Subtotal");
		lblSubTotal.setBounds(523, 1290, 52, 23);
		panel.add(lblSubTotal);
		
		txtSubtotal = new TextSoloNumeros();
		txtSubtotal.setEditable(false);
		txtSubtotal.setBounds(622, 1290, 100, 23);
		panel.add(txtSubtotal);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_1_4 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_1_4.setText("Total");
		lblsbtlsFormaDePago_1_1_2_1_4.setBounds(523, 1350, 52, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_1_4);
		
		txtTotal = new TextSoloNumeros();
		txtTotal.setEditable(false);
		txtTotal.setBounds(622, 1350, 100, 23);
		panel.add(txtTotal);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_2 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsFormaDePago_1_1_2_2.setText("$");
		lblsbtlsFormaDePago_1_1_2_2.setBounds(593, 1200, 19, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_2);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_2_1 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_2_1.setText("$");
		lblsbtlsFormaDePago_1_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsFormaDePago_1_1_2_2_1.setBounds(593, 1230, 19, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_2_1);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_2_2 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_2_2.setText("$");
		lblsbtlsFormaDePago_1_1_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsFormaDePago_1_1_2_2_2.setBounds(593, 1260, 19, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_2_2);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_2_3 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_2_3.setText("$");
		lblsbtlsFormaDePago_1_1_2_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsFormaDePago_1_1_2_2_3.setBounds(593, 1290, 19, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_2_3);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_2_4 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_2_4.setText("$");
		lblsbtlsFormaDePago_1_1_2_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsFormaDePago_1_1_2_2_4.setBounds(593, 1320, 19, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_2_4);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_2_4_1 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_2_4_1.setText("$");
		lblsbtlsFormaDePago_1_1_2_2_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsFormaDePago_1_1_2_2_4_1.setBounds(593, 1350, 19, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_2_4_1);
		
		txtIDRealizarOC = new JTextField();
		txtIDRealizarOC.setVisible(false);
		txtIDRealizarOC.setColumns(10);
		txtIDRealizarOC.setBounds(35, 616, 109, 23);
		panel.add(txtIDRealizarOC);
		
		ActualizarVista();
		
	}
	
	public void ActualizarVista() {
		VaciarFormRegistroOC();
		controlador.LlenarTablaRegistrarOC();;

	}
	
	public void actualizarTablaReaCot() {
		vaciarGuardarRealizOC();
		controlador.LlenarTablaReaOC();
		
	}
	
	public void VaciarFormRegistroOC() {
		
		txtIDRegOC.setText("");
		txtRut.setText("");
		txtSenores.setText("");
		txtNombreOC.setText("");
		txtNumeroOC.setText("");
		FechaEnvioOC.setCalendar(null);
		FechaEntregaProd.setCalendar(null);
		txtEstado.setText("Enviada a Proveedor");
		txtDireccionEnvFac.setText("");
		txtDireccionDespacho.setText("");
		txtMetodoDespacho.setText("Despachar a direccion de envio");
		txtFormaPago.setText("30 días contra la recepción conforme de la factura");
		txtObservacion.setText("Ninguna");
		

	}
	
	public void vaciarGuardarRealizOC() {
		

		txtIDRealizarOC.setText("");
		txtCodLicitacion.setText("");
		txtProducto.setText("");
		txtCantidad.setText("");
		txtEspecifComprador.setText("Ninguno");
		txtEspecifProveedor.setText("Ninguno");
		txtValorUnitario.setText("");
		txtDescuento.setText("0");
		txtCargo.setText("0");
		comboBoxUM.setSelectedIndex(0);
		
		
	}
	
	public void VaciarFormRealizarOC() {
		
		txtIDRealizarOC.setText("");
		txtIDOC.setText("");
		txtCodLicitacion.setText("");
		txtProducto.setText("");
		txtCantidad.setText("");
		txtEspecifComprador.setText("");
		txtEspecifProveedor.setText("");
		txtValorUnitario.setText("");
		txtDescuento.setText("");
		txtCargo.setText("");
		comboBoxUM.setSelectedIndex(0);
		txtIVA.setText("");
		txtCargosTotal.setText("");
		txtDescuentosTotal.setText("");
		txtTotal.setText("");

	}
	
	public void CargarFormRegistrarCotizacion(RegistrarOCEntity ape) {
		
		txtIDRegOC.setText("" + ape.getId());
		txtSenores.setText(ape.getSenores());
		txtRut.setText(ape.getRut());
		txtNombreOC.setText(ape.getNombreOC());
		txtNumeroOC.setText(ape.getNumeroOC());
		FechaEnvioOC.setCalendar(ape.getFechaEnvio());
		FechaEntregaProd.setCalendar(ape.getFechaEntregaProd());
		txtEstado.setText(ape.getEstado());
		txtDireccionDespacho.setText(ape.getDireccionDespacho());
		txtDireccionEnvFac.setText(ape.getDireccionEnvioFact());
		txtMetodoDespacho.setText(ape.getMetodoDespacho());
		txtFormaPago.setText(ape.getFormaPago());
		txtObservacion.setText(ape.getObservacion());
		
	}
	
	public void CargarFormRealizarCotizacion(RealizarOCEntity ape) {
		
		txtIDRealizarOC.setText(""+ape.getId());
		txtIDOC.setText(""+ape.getIdOC());
		txtCodLicitacion.setText(ape.getCodLicitacion());
		txtProducto.setText(ape.getProducto());
		txtCantidad.setText(""+ape.getCantidad());
		txtEspecifComprador.setText(ape.getEspecifComprador());
		txtEspecifProveedor.setText(ape.getEspecifProveedor());
		txtValorUnitario.setText(""+ape.getValorUnitario());
		txtDescuento.setText(""+ape.getDescuento());
		txtCargo.setText(""+ape.getCargo());
		comboBoxUM.setSelectedIndex(ape.getUM());
		
	}
	
	public boolean camposVaciosRegistroOC() {

		if(txtSenores.getText().length() <= 0) {
			return false;
		}else if (txtRut.getText().length() <= 0) {
			return false;
		}else if (txtNombreOC.getText().length() <= 0) {
			return false;
		}else if (txtNumeroOC.getText().length() <= 0) {
			return false;
		}else if (FechaEnvioOC.getCalendar() == null) {
			return false;
		}else if (FechaEnvioOC.getCalendar() == null) {
			return false;
		}else if (txtEstado.getText().length() <= 0) {
			return false;
		}else if (txtDireccionDespacho.getText().length() <= 0) {
			return false;
		}else if (txtDireccionEnvFac.getText().length() <= 0) {
			return false;
		}else if (txtMetodoDespacho.getText().length() <= 0) {
			return false;
		}else if (txtFormaPago.getText().length() <= 0) {
			return false;
		} else if (txtObservacion.getText().length() <= 0) {
			return false;
		}

		return true;
	}
	
	public boolean camposVaciosRealizarOC(){
		
		if(txtIDOC.getText().length() <= 0) {
			return false;
		}else if (txtCodLicitacion.getText().length() <= 0) {
			return false;
		}else if (txtProducto.getText().length() <= 0) {
			return false;
		}else if (txtCantidad.getText().length() <= 0) {
			return false;
		}else if (txtEspecifComprador.getText().length() <= 0) {
			return false;
		}else if (txtEspecifProveedor.getText().length() <= 0) {
			return false;
		}else if (txtValorUnitario.getText().length() <= 0) {
			return false;
		}else if (txtDescuento.getText().length() <= 0) {
			return false;
		}else if (txtCargo.getText().length() <= 0) {
			return false;
		}

		return true;
		
		
	}
	
	public boolean camposVaciosImprimir() {

		if (txtIDOC.getText().length() <= 0) {
			return false;
		} else if (tableRealizarOC.getRowCount() <= 0) {
			return false;
		} 

		return true;
	}
	
	public void calcularTotal() {
	
		int total = 0;
		int totalNeto = 0;
		int totalDescuentos = 0;
		int totalCargos = 0;
		  
		for(int i=0; i<this.tableRealizarOC.getRowCount(); i++) { 
			totalNeto += Integer.parseInt(String.valueOf(tableRealizarOC.getModel().getValueAt(i, 10))); 
		}
		
		for(int i=0; i<this.tableRealizarOC.getRowCount(); i++) { 
			totalDescuentos += Integer.parseInt(String.valueOf(tableRealizarOC.getModel().getValueAt(i, 8))); 
		}
		
		for(int i=0; i<this.tableRealizarOC.getRowCount(); i++) { 
			totalCargos += Integer.parseInt(String.valueOf(tableRealizarOC.getModel().getValueAt(i, 9))); 
		}
		
		
		//int Neto = (int) (total/1.19); 
		int subtotal = totalNeto - totalDescuentos+totalCargos ;
		int totalConDescuentos = (int) (subtotal*1.19);
		int IVA = totalConDescuentos - subtotal;
	
		txtTotal.setText(""+totalConDescuentos);
		txtNeto.setText(""+totalNeto);
		txtSubtotal.setText(""+subtotal);
		txtIVA.setText(""+IVA);
		txtDescuentosTotal.setText(""+totalDescuentos);
		txtCargosTotal.setText(""+totalCargos);
		
		
		 
	}
	
	public DefaultTableModel getModelTableRegistrarOC() {
		return tableRegistrarOC.getModel();
	}
	
	public DefaultTableModel getModelTableRealizarOC() {
		return tableRealizarOC.getModel();
		
	}

	public TableStandard getTableRegistrarOC() {
		return tableRegistrarOC;
	}

	public void setTableRegistrarOC(TableStandard tableRegistrarOC) {
		this.tableRegistrarOC = tableRegistrarOC;
	}

	public TableStandard getTableRegistrarCotizacion() {
		return tableRealizarOC;
	}

	public void setTableRegistrarCotizacion(TableStandard tableRegistrarCotizacion) {
		this.tableRealizarOC = tableRegistrarCotizacion;
	}

	public StandarButton getBtnGuardarRegistroOC() {
		return btnGuardarRegistroOC;
	}

	public void setBtnGuardarRegistroOC(StandarButton btnGuardarRegistroOC) {
		this.btnGuardarRegistroOC = btnGuardarRegistroOC;
	}

	public JTextField getTxtNombreOC() {
		return txtNombreOC;
	}

	public void setTxtNombreOC(JTextField txtNombreOC) {
		this.txtNombreOC = txtNombreOC;
	}

	public JTextField getTxtEstado() {
		return txtEstado;
	}

	public void setTxtEstado(JTextField txtEstado) {
		this.txtEstado = txtEstado;
	}

	public JTextField getTxtNumeroOC() {
		return txtNumeroOC;
	}

	public void setTxtNumeroOC(JTextField txtNumeroOC) {
		this.txtNumeroOC = txtNumeroOC;
	}

	public StandarButton getBtnModificaRegistroOC() {
		return btnModificaRegistroOC;
	}

	public void setBtnModificaRegistroOC(StandarButton btnModificaRegistroOC) {
		this.btnModificaRegistroOC = btnModificaRegistroOC;
	}

	public StandarButton getBtnEliminarRegistroOC() {
		return btnEliminarRegistroOC;
	}

	public void setBtnEliminarRegistroOC(StandarButton btnEliminarRegistroOC) {
		this.btnEliminarRegistroOC = btnEliminarRegistroOC;
	}

	public StandarButton getBtnUsarDatosRegistrarOC() {
		return btnUsarDatosRegistrarOC;
	}

	public void setBtnUsarDatosRegistrarOC(StandarButton btnUsarDatosRegistrarOC) {
		this.btnUsarDatosRegistrarOC = btnUsarDatosRegistrarOC;
	}

	public JFormattedTextField getTxtRut() {
		return txtRut;
	}

	public void setTxtRut(JFormattedTextField txtRut) {
		this.txtRut = txtRut;
	}

	public JDateChooser getFechaEnvioOC() {
		return FechaEnvioOC;
	}

	public void setFechaEnvioOC(JDateChooser fechaEnvioOC) {
		FechaEnvioOC = fechaEnvioOC;
	}

	public JTextField getTxtSenores() {
		return txtSenores;
	}

	public void setTxtSenores(JTextField txtSenores) {
		this.txtSenores = txtSenores;
	}

	public JTextField getTxtDireccionEnvFac() {
		return txtDireccionEnvFac;
	}

	public void setTxtDireccionEnvFac(JTextField txtDireccionEnvFac) {
		this.txtDireccionEnvFac = txtDireccionEnvFac;
	}

	public JTextField getTxtDireccionDespacho() {
		return txtDireccionDespacho;
	}

	public void setTxtDireccionDespacho(JTextField txtDireccionDespacho) {
		this.txtDireccionDespacho = txtDireccionDespacho;
	}

	public JTextField getTxtMetodoDespacho() {
		return txtMetodoDespacho;
	}

	public void setTxtMetodoDespacho(JTextField txtMetodoDespacho) {
		this.txtMetodoDespacho = txtMetodoDespacho;
	}

	public JTextField getTxtFormaPago() {
		return txtFormaPago;
	}

	public void setTxtFormaPago(JTextField txtFormaPago) {
		this.txtFormaPago = txtFormaPago;
	}

	public JTextField getTxtNinguna() {
		return txtObservacion;
	}

	public void setTxtNinguna(JTextField txtNinguna) {
		this.txtObservacion = txtNinguna;
	}

	public JTextField getTxtIDOC() {
		return txtIDOC;
	}

	public void setTxtIDOC(JTextField txtIDOC) {
		this.txtIDOC = txtIDOC;
	}

	public JTextField getTxtCodLicitacion() {
		return txtCodLicitacion;
	}

	public void setTxtCodLicitacion(JTextField txtCodLicitacion) {
		this.txtCodLicitacion = txtCodLicitacion;
	}

	public JTextField getTxtProducto() {
		return txtProducto;
	}

	public void setTxtProducto(JTextField txtProducto) {
		this.txtProducto = txtProducto;
	}

	public JTextField getTxtCantidad() {
		return txtCantidad;
	}

	public void setTxtCantidad(JTextField txtCantidad) {
		this.txtCantidad = txtCantidad;
	}

	public TextSoloNumeros getTxtValorUnitario() {
		return txtValorUnitario;
	}

	public void setTxtValorUnitario(TextSoloNumeros txtValorUnitario) {
		this.txtValorUnitario = txtValorUnitario;
	}

	public JTextField getTxtEspecifComprador() {
		return txtEspecifComprador;
	}

	public void setTxtEspecifComprador(JTextField txtEspecifComprador) {
		this.txtEspecifComprador = txtEspecifComprador;
	}

	public JTextField getTxtEspecifProveedor() {
		return txtEspecifProveedor;
	}

	public void setTxtEspecifProveedor(JTextField txtEspecifProveedor) {
		this.txtEspecifProveedor = txtEspecifProveedor;
	}

	public StandarButton getBtnModificarRealizarOC() {
		return btnModificarRealizarOC;
	}

	public void setBtnModificarRealizarOC(StandarButton btnModificarRealizarOC) {
		this.btnModificarRealizarOC = btnModificarRealizarOC;
	}

	public StandarButton getBtnEliminarRealizarOC() {
		return btnEliminarRealizarOC;
	}

	public void setBtnEliminarRealizarOC(StandarButton btnEliminarRealizarOC) {
		this.btnEliminarRealizarOC = btnEliminarRealizarOC;
	}

	public StandarButton getBtnImprimirOC() {
		return btnImprimirOC;
	}

	public void setBtnImprimirOC(StandarButton btnImprimirOC) {
		this.btnImprimirOC = btnImprimirOC;
	}

	public JComboBox getComboBoxUM() {
		return comboBoxUM;
	}

	public void setComboBoxUM(JComboBox comboBoxUM) {
		this.comboBoxUM = comboBoxUM;
	}

	public JTextField getTxtIDRegOC() {
		return txtIDRegOC;
	}

	public void setTxtIDRegOC(JTextField txtIDRegOC) {
		this.txtIDRegOC = txtIDRegOC;
	}

	public JDateChooser getFechaEntregaProd() {
		return FechaEntregaProd;
	}

	public void setFechaEntregaProd(JDateChooser fechaEntregaProd) {
		FechaEntregaProd = fechaEntregaProd;
	}

	public JTextField getTxtObservacion() {
		return txtObservacion;
	}

	public void setTxtObservacion(JTextField txtObservacion) {
		this.txtObservacion = txtObservacion;
	}

	public TextSoloNumeros getTxtNeto() {
		return txtNeto;
	}

	public void setTxtNeto(TextSoloNumeros txtNeto) {
		this.txtNeto = txtNeto;
	}

	public TextSoloNumeros getTxtDescuentosTotal() {
		return txtDescuentosTotal;
	}

	public void setTxtDescuentosTotal(TextSoloNumeros txtDescuentosTotal) {
		this.txtDescuentosTotal = txtDescuentosTotal;
	}

	public TextSoloNumeros getTxtCargosTotal() {
		return txtCargosTotal;
	}

	public void setTxtCargosTotal(TextSoloNumeros txtCargosTotal) {
		this.txtCargosTotal = txtCargosTotal;
	}

	public TextSoloNumeros getTxtIVA() {
		return txtIVA;
	}

	public void setTxtIVA(TextSoloNumeros txtIVA) {
		this.txtIVA = txtIVA;
	}

	public TextSoloNumeros getTxtTotal() {
		return txtTotal;
	}

	public void setTxtTotal(TextSoloNumeros txtTotal) {
		this.txtTotal = txtTotal;
	}

	public StandarButton getBtnGuardarRealizarOC() {
		return btnGuardarRealizarOC;
	}

	public void setBtnGuardarRealizarOC(StandarButton btnGuardarRealizarOC) {
		this.btnGuardarRealizarOC = btnGuardarRealizarOC;
	}

	public JTextField getTxtIDRealizarOC() {
		return txtIDRealizarOC;
	}

	public void setTxtIDRealizarOC(JTextField txtIDRealizarOC) {
		this.txtIDRealizarOC = txtIDRealizarOC;
	}

	public TextSoloNumeros getTxtCargo() {
		return txtCargo;
	}

	public void setTxtCargo(TextSoloNumeros txtCargo) {
		this.txtCargo = txtCargo;
	}

	public TextSoloNumeros getTxtDescuento() {
		return txtDescuento;
	}

	public void setTxtDescuento(TextSoloNumeros txtDescuento) {
		this.txtDescuento = txtDescuento;
	}

	public TableStandard getTableRealizarOC() {
		return tableRealizarOC;
	}

	public void setTableRealizarOC(TableStandard tableRealizarOC) {
		this.tableRealizarOC = tableRealizarOC;
	}

	public TextSoloNumeros getTxtSubtotal() {
		return txtSubtotal;
	}

	public void setTxtSubtotal(TextSoloNumeros txtSubtotal) {
		this.txtSubtotal = txtSubtotal;
	}
}
