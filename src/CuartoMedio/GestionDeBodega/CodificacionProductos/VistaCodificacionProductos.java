package CuartoMedio.GestionDeBodega.CodificacionProductos;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import ui.Labels.LabelTitulos;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dimension;

import ui.Texts.TextSoloNumeros;
import javax.swing.JLabel;
import java.awt.Font;
import ui.Buttons.StandarButton;
import javax.swing.JButton;

public class VistaCodificacionProductos extends JPanel {
	
	private ControlCodificacionProductos ccp;
	
	private JTextField txtProveedor;
	private JTextField txtCodInternoProd;
	private JTextField txtCodBarrasEAN13;
	private JTextField txtCodBarrasEAN14;
	private JTextField txtPaisAbaste;
	private JTextField txtPaisFabric;
	private JTextField txtMarca;
	private JTextField txtDescProducto;
	private TextSoloNumeros txtPrecSinImpuesto;
	private TextSoloNumeros txtDescPermanente;
	private TextSoloNumeros txtDescuentoIntroduccion;
	private TextSoloNumeros txtIVA;
	private TextSoloNumeros txtPVP;
	private TextSoloNumeros txtPrecioSugerido;
	private JTextField txtUniEmbalaje;
	private JTextField txtRegistroSanitario;
	private JTextField txtCajasxPlanchas;
	private JTextField txtPlanchasxPallet;
	private TextSoloNumeros txtPesoBrutoCaja;
	private TextSoloNumeros txtPesoNetoCaja;
	private TextSoloNumeros txtAnchoCaja;
	private TextSoloNumeros txtAltoCaja;
	private TextSoloNumeros txtPesoBrutoUnidad;
	private TextSoloNumeros txtAnchoUnidad;
	private TextSoloNumeros txtPesoNetoUnidad;
	private TextSoloNumeros txtAltoUnidad;
	private StandarButton stndrbtnGuardar;
	private TextSoloNumeros txtPrecioNeto;
	private TextSoloNumeros txtVidaUtil;
	private JTextField txtTipoEmbalaje;
	private TextSoloNumeros txtProfundidadCaja;
	private TextSoloNumeros txtVolumenCaja;
	private TextSoloNumeros txtProfundidadUnidad;
	private TextSoloNumeros txtVolumenUnidad;
	private StandarButton btnListaProductos;
	private JPanel panel;
	private JScrollPane scrollPane;

	/**
	 * Create the panel.
	 */
	public VistaCodificacionProductos() {
		
		ccp = new ControlCodificacionProductos(this);
		
		setBounds(0, 0, 748, 723);
		setOpaque(false);
		setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);
		
		panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 840));
		panel.setLayout(null);
		scrollPane.setViewportView(panel);
		
		
		LabelTitulos lbltlsCodificacionDelProducto = new LabelTitulos((String) null);
		lbltlsCodificacionDelProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCodificacionDelProducto.setText("Codificaci\u00F3n del Producto");
		lbltlsCodificacionDelProducto.setBounds(0, 60, 722, 30);
		panel.add(lbltlsCodificacionDelProducto);
		
		LabelSubtitulos lblsbtlsCdIntProducto = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto.setText("Proveedor");
		lblsbtlsCdIntProducto.setBounds(10, 125, 123, 23);
		panel.add(lblsbtlsCdIntProducto);
		
		txtProveedor = new JTextField();
		txtProveedor.setBounds(113, 126, 235, 23);
		panel.add(txtProveedor);
		txtProveedor.setColumns(10);
		
		LabelSubtitulos lblsbtlsCdIntProducto_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto_1.setText("C\u00F3d. Int. Producto");
		lblsbtlsCdIntProducto_1.setBounds(10, 159, 123, 23);
		panel.add(lblsbtlsCdIntProducto_1);
		
		txtCodInternoProd = new JTextField();
		txtCodInternoProd.setColumns(10);
		txtCodInternoProd.setBounds(113, 160, 120, 23);
		panel.add(txtCodInternoProd);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_2.setText("C\u00F3d. Barras EAN-13");
		lblsbtlsCdBarrasEan_2.setBounds(237, 159, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_2);
		
		txtCodBarrasEAN13 = new JTextField();
		txtCodBarrasEAN13.setColumns(10);
		txtCodBarrasEAN13.setBounds(353, 160, 120, 23);
		panel.add(txtCodBarrasEAN13);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_1_1.setText("C\u00F3d. Barras EAN-14");
		lblsbtlsCdBarrasEan_1_1.setBounds(476, 159, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_1_1);
		
		txtCodBarrasEAN14 = new JTextField();
		txtCodBarrasEAN14.setColumns(10);
		txtCodBarrasEAN14.setBounds(592, 160, 120, 23);
		panel.add(txtCodBarrasEAN14);
		
		LabelSubtitulos lblsbtlsCdIntProducto_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto_1_1.setText("Pa\u00EDs Abastecim.");
		lblsbtlsCdIntProducto_1_1.setBounds(10, 193, 123, 23);
		panel.add(lblsbtlsCdIntProducto_1_1);
		
		txtPaisAbaste = new JTextField();
		txtPaisAbaste.setColumns(10);
		txtPaisAbaste.setBounds(113, 194, 120, 23);
		panel.add(txtPaisAbaste);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_2_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_2_1.setText("Pais Fabricacion");
		lblsbtlsCdBarrasEan_2_1.setBounds(237, 193, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_2_1);
		
		txtPaisFabric = new JTextField();
		txtPaisFabric.setColumns(10);
		txtPaisFabric.setBounds(353, 194, 120, 23);
		panel.add(txtPaisFabric);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_1_1_1.setText("Marca");
		lblsbtlsCdBarrasEan_1_1_1.setBounds(476, 193, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_1_1_1);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(592, 194, 120, 23);
		panel.add(txtMarca);
		
		LabelSubtitulos lblsbtlsCdIntProducto_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto_2.setText("Descripcion Produc.");
		lblsbtlsCdIntProducto_2.setBounds(353, 125, 123, 23);
		panel.add(lblsbtlsCdIntProducto_2);
		
		txtDescProducto = new JTextField();
		txtDescProducto.setColumns(10);
		txtDescProducto.setBounds(477, 126, 235, 23);
		panel.add(txtDescProducto);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBackground(Color.WHITE);
		separator.setBounds(0, 240, 722, 7);
		panel.add(separator);
		
		LabelSubtitulos lblsbtlsDatosComerciales = new LabelSubtitulos((String) null);
		lblsbtlsDatosComerciales.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsDatosComerciales.setText("Datos Comerciales");
		lblsbtlsDatosComerciales.setBounds(0, 253, 722, 23);
		panel.add(lblsbtlsDatosComerciales);
		
		LabelSubtitulos lblsbtlsCdIntProducto_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto_1_1_1.setText("Precio Sin Impue.");
		lblsbtlsCdIntProducto_1_1_1.setBounds(10, 290, 123, 23);
		panel.add(lblsbtlsCdIntProducto_1_1_1);
		
		txtPrecSinImpuesto = new TextSoloNumeros();
		txtPrecSinImpuesto.setBounds(113, 291, 120, 23);
		panel.add(txtPrecSinImpuesto);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_2_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_2_1_1.setText("Descuento Perman.");
		lblsbtlsCdBarrasEan_2_1_1.setBounds(237, 290, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_2_1_1);
		
		txtDescPermanente = new TextSoloNumeros();
		txtDescPermanente.setBounds(353, 291, 120, 23);
		panel.add(txtDescPermanente);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_1_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_1_1_1_1.setText("Precio Neto");
		lblsbtlsCdBarrasEan_1_1_1_1.setBounds(476, 290, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_1_1_1_1);
		
		LabelSubtitulos lblsbtlsCdIntProducto_1_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto_1_1_2.setText("Descuento Intro.");
		lblsbtlsCdIntProducto_1_1_2.setBounds(10, 324, 123, 23);
		panel.add(lblsbtlsCdIntProducto_1_1_2);
		
		txtDescuentoIntroduccion = new TextSoloNumeros();
		txtDescuentoIntroduccion.setColumns(10);
		txtDescuentoIntroduccion.setBounds(113, 325, 120, 23);
		panel.add(txtDescuentoIntroduccion);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_2_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_2_1_2.setText("I.V.A.");
		lblsbtlsCdBarrasEan_2_1_2.setBounds(237, 324, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_2_1_2);
		
		txtIVA = new TextSoloNumeros();
		txtIVA.setColumns(10);
		txtIVA.setBounds(353, 325, 120, 23);
		panel.add(txtIVA);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_1_1_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_1_1_1_2.setText("P.V.P.");
		lblsbtlsCdBarrasEan_1_1_1_2.setBounds(476, 324, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_1_1_1_2);
		
		txtPVP = new TextSoloNumeros();
		txtPVP.setColumns(10);
		txtPVP.setBounds(592, 325, 120, 23);
		panel.add(txtPVP);
		
		LabelSubtitulos lblsbtlsCdIntProducto_1_1_3 = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto_1_1_3.setText("Precio Sugerido");
		lblsbtlsCdIntProducto_1_1_3.setBounds(10, 358, 123, 23);
		panel.add(lblsbtlsCdIntProducto_1_1_3);
		
		txtPrecioSugerido = new TextSoloNumeros();
		txtPrecioSugerido.setColumns(10);
		txtPrecioSugerido.setBounds(113, 359, 120, 23);
		panel.add(txtPrecioSugerido);
		
		txtPrecioNeto = new TextSoloNumeros();
		txtPrecioNeto.setBounds(592, 290, 120, 23);
		panel.add(txtPrecioNeto);
		
		JLabel lblNewLabel = new JLabel("(Periodo 3 meses)");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 8));
		lblNewLabel.setBounds(10, 340, 103, 14);
		panel.add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(0, 400, 722, 7);
		panel.add(separator_1);
		
		LabelSubtitulos lblsbtlsDatosLogisticos = new LabelSubtitulos((String) null);
		lblsbtlsDatosLogisticos.setText("Datos Logisticos");
		lblsbtlsDatosLogisticos.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsDatosLogisticos.setBounds(0, 411, 722, 23);
		panel.add(lblsbtlsDatosLogisticos);
		
		LabelSubtitulos lblsbtlsCdIntProducto_1_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto_1_1_1_1.setText("Unidad Embalaje");
		lblsbtlsCdIntProducto_1_1_1_1.setBounds(10, 445, 123, 23);
		panel.add(lblsbtlsCdIntProducto_1_1_1_1);
		
		txtUniEmbalaje = new JTextField();
		txtUniEmbalaje.setColumns(10);
		txtUniEmbalaje.setBounds(113, 446, 120, 23);
		panel.add(txtUniEmbalaje);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_2_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_2_1_1_1.setText("Registro Sanitario");
		lblsbtlsCdBarrasEan_2_1_1_1.setBounds(237, 445, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_2_1_1_1);
		
		txtRegistroSanitario = new JTextField();
		txtRegistroSanitario.setColumns(10);
		txtRegistroSanitario.setBounds(353, 446, 120, 23);
		panel.add(txtRegistroSanitario);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_1_1_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_1_1_1_1_1.setText("Vida Util (dias)");
		lblsbtlsCdBarrasEan_1_1_1_1_1.setBounds(476, 445, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_1_1_1_1_1);
		
		txtVidaUtil = new TextSoloNumeros();
		txtVidaUtil.setBounds(592, 445, 120, 23);
		panel.add(txtVidaUtil);
		
		LabelSubtitulos lblsbtlsCdIntProducto_1_1_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto_1_1_1_2.setText("Cajas x Planchas");
		lblsbtlsCdIntProducto_1_1_1_2.setBounds(10, 479, 123, 23);
		panel.add(lblsbtlsCdIntProducto_1_1_1_2);
		
		txtCajasxPlanchas = new JTextField();
		txtCajasxPlanchas.setColumns(10);
		txtCajasxPlanchas.setBounds(113, 480, 120, 23);
		panel.add(txtCajasxPlanchas);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_2_1_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_2_1_1_2.setText("Planchas x Pallet");
		lblsbtlsCdBarrasEan_2_1_1_2.setBounds(237, 479, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_2_1_1_2);
		
		txtPlanchasxPallet = new JTextField();
		txtPlanchasxPallet.setColumns(10);
		txtPlanchasxPallet.setBounds(353, 480, 120, 23);
		panel.add(txtPlanchasxPallet);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_1_1_1_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_1_1_1_1_2.setText("Tipo de Embalaje");
		lblsbtlsCdBarrasEan_1_1_1_1_2.setBounds(476, 479, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_1_1_1_1_2);
		
		txtTipoEmbalaje = new JTextField();
		txtTipoEmbalaje.setBounds(592, 479, 120, 23);
		panel.add(txtTipoEmbalaje);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.WHITE);
		separator_1_1.setBackground(Color.WHITE);
		separator_1_1.setBounds(0, 527, 722, 7);
		panel.add(separator_1_1);
		
		LabelSubtitulos lblsbtlsDimensionDeCajas = new LabelSubtitulos((String) null);
		lblsbtlsDimensionDeCajas.setText("Dimension de Cajas");
		lblsbtlsDimensionDeCajas.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsDimensionDeCajas.setBounds(0, 538, 722, 23);
		panel.add(lblsbtlsDimensionDeCajas);
		
		LabelSubtitulos lblsbtlsCdIntProducto_1_1_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto_1_1_1_1_1.setText("Peso Bruto (Gr.)");
		lblsbtlsCdIntProducto_1_1_1_1_1.setBounds(10, 572, 123, 23);
		panel.add(lblsbtlsCdIntProducto_1_1_1_1_1);
		
		txtPesoBrutoCaja = new TextSoloNumeros();
		txtPesoBrutoCaja.setColumns(10);
		txtPesoBrutoCaja.setBounds(113, 573, 120, 23);
		panel.add(txtPesoBrutoCaja);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_2_1_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_2_1_1_1_1.setText("Peso Neto (Gr.)");
		lblsbtlsCdBarrasEan_2_1_1_1_1.setBounds(237, 572, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_2_1_1_1_1);
		
		txtPesoNetoCaja = new TextSoloNumeros();
		txtPesoNetoCaja.setColumns(10);
		txtPesoNetoCaja.setBounds(353, 573, 120, 23);
		panel.add(txtPesoNetoCaja);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_1_1_1_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_1_1_1_1_1_1.setText("Profundidad (cms)");
		lblsbtlsCdBarrasEan_1_1_1_1_1_1.setBounds(476, 572, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_1_1_1_1_1_1);
		
		txtProfundidadCaja = new TextSoloNumeros();
		txtProfundidadCaja.setBounds(592, 572, 120, 23);
		panel.add(txtProfundidadCaja);
		
		LabelSubtitulos lblsbtlsCdIntProducto_1_1_1_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto_1_1_1_1_2.setText("Ancho (cms)");
		lblsbtlsCdIntProducto_1_1_1_1_2.setBounds(10, 606, 123, 23);
		panel.add(lblsbtlsCdIntProducto_1_1_1_1_2);
		
		txtAnchoCaja = new TextSoloNumeros();
		txtAnchoCaja.setColumns(10);
		txtAnchoCaja.setBounds(113, 607, 120, 23);
		panel.add(txtAnchoCaja);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_2_1_1_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_2_1_1_1_2.setText("Alto (cms)");
		lblsbtlsCdBarrasEan_2_1_1_1_2.setBounds(237, 606, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_2_1_1_1_2);
		
		txtAltoCaja = new TextSoloNumeros();
		txtAltoCaja.setColumns(10);
		txtAltoCaja.setBounds(353, 607, 120, 23);
		panel.add(txtAltoCaja);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_1_1_1_1_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_1_1_1_1_1_2.setText("Volumen (cm3)");
		lblsbtlsCdBarrasEan_1_1_1_1_1_2.setBounds(476, 606, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_1_1_1_1_1_2);
		
		txtVolumenCaja = new TextSoloNumeros();
		txtVolumenCaja.setBounds(592, 606, 120, 23);
		panel.add(txtVolumenCaja);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.WHITE);
		separator_1_1_1.setBackground(Color.WHITE);
		separator_1_1_1.setBounds(0, 653, 722, 7);
		panel.add(separator_1_1_1);
		
		LabelSubtitulos lblsbtlsDimensionesDeUnidades = new LabelSubtitulos((String) null);
		lblsbtlsDimensionesDeUnidades.setText("Dimensiones de Unidades");
		lblsbtlsDimensionesDeUnidades.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsDimensionesDeUnidades.setBounds(0, 664, 722, 23);
		panel.add(lblsbtlsDimensionesDeUnidades);
		
		LabelSubtitulos lblsbtlsCdIntProducto_1_1_1_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto_1_1_1_1_1_1.setText("Peso Bruto (Gr.)");
		lblsbtlsCdIntProducto_1_1_1_1_1_1.setBounds(10, 698, 123, 23);
		panel.add(lblsbtlsCdIntProducto_1_1_1_1_1_1);
		
		LabelSubtitulos lblsbtlsCdIntProducto_1_1_1_1_2_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto_1_1_1_1_2_1.setText("Ancho (cms)");
		lblsbtlsCdIntProducto_1_1_1_1_2_1.setBounds(10, 732, 123, 23);
		panel.add(lblsbtlsCdIntProducto_1_1_1_1_2_1);
		
		txtPesoBrutoUnidad = new TextSoloNumeros();
		txtPesoBrutoUnidad.setColumns(10);
		txtPesoBrutoUnidad.setBounds(113, 699, 120, 23);
		panel.add(txtPesoBrutoUnidad);
		
		txtAnchoUnidad = new TextSoloNumeros();
		txtAnchoUnidad.setColumns(10);
		txtAnchoUnidad.setBounds(113, 733, 120, 23);
		panel.add(txtAnchoUnidad);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_2_1_1_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_2_1_1_1_1_1.setText("Peso Neto (Gr.)");
		lblsbtlsCdBarrasEan_2_1_1_1_1_1.setBounds(237, 698, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_2_1_1_1_1_1);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_2_1_1_1_2_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_2_1_1_1_2_1.setText("Alto (cms)");
		lblsbtlsCdBarrasEan_2_1_1_1_2_1.setBounds(237, 732, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_2_1_1_1_2_1);
		
		txtPesoNetoUnidad = new TextSoloNumeros();
		txtPesoNetoUnidad.setColumns(10);
		txtPesoNetoUnidad.setBounds(353, 699, 120, 23);
		panel.add(txtPesoNetoUnidad);
		
		txtAltoUnidad = new TextSoloNumeros();
		txtAltoUnidad.setColumns(10);
		txtAltoUnidad.setBounds(353, 733, 120, 23);
		panel.add(txtAltoUnidad);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_1_1_1_1_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_1_1_1_1_1_1_1.setText("Profundidad (cms)");
		lblsbtlsCdBarrasEan_1_1_1_1_1_1_1.setBounds(476, 698, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_1_1_1_1_1_1_1);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_1_1_1_1_1_2_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_1_1_1_1_1_2_1.setText("Volumen (cm3)");
		lblsbtlsCdBarrasEan_1_1_1_1_1_2_1.setBounds(476, 732, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_1_1_1_1_1_2_1);
		
		txtProfundidadUnidad = new TextSoloNumeros();
		txtProfundidadUnidad.setBounds(592, 698, 120, 23);
		panel.add(txtProfundidadUnidad);
		
		txtVolumenUnidad = new TextSoloNumeros();
		txtVolumenUnidad.setBounds(592, 732, 120, 23);
		panel.add(txtVolumenUnidad);
		
		stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(445, 790, 110, 30);
		stndrbtnGuardar.addActionListener(ccp);
		panel.add(stndrbtnGuardar);
		
		btnListaProductos = new StandarButton("Lista de productos");
		btnListaProductos.setBounds(163, 790, 140, 30);
		btnListaProductos.addActionListener(ccp);
		panel.add(btnListaProductos);

	}
	
	
	public boolean CamposVacios() {
		
		if(txtProveedor.getText().length() <= 0) {
			return false;
			
		}else if(txtDescProducto.getText().length() <= 0) {
			return false;
			
		}else if(txtCodInternoProd.getText().length() <= 0) {
			return false;
			
		}else if(txtCodBarrasEAN13.getText().length() <= 0) {
			return false;
			
		}else if(txtCodBarrasEAN14.getText().length() <= 0) {
			return false;
			
		}else if(txtPaisAbaste.getText().length() <= 0) {
			return false;
			
		}else if(txtPaisFabric.getText().length() <= 0) {
			return false;
			
		}else if(txtMarca.getText().length() <= 0) {
			return false;
			
		}else if(txtPrecSinImpuesto.getText().length() <= 0) {
			return false;
			
		}else if(txtDescPermanente.getText().length() <= 0) {
			return false;
			
		}else if(txtDescuentoIntroduccion.getText().length() <= 0) {
			return false;
			
		}else if(txtIVA.getText().length() <= 0) {
			return false;
			
		}else if(txtPVP.getText().length() <= 0) {
			return false;
			
		}else if(txtPrecioSugerido.getText().length() <= 0) {
			return false;
			
		}else if(txtUniEmbalaje.getText().length() <= 0) {
			return false;
			
		}else if(txtRegistroSanitario.getText().length() <= 0) {
			return false;
			
		}else if(txtVidaUtil.getText().length() <= 0) {
			return false;
			
		}else if(txtCajasxPlanchas.getText().length() <= 0) {
			return false;
			
		}else if(txtPlanchasxPallet.getText().length() <= 0) {
			return false;
			
		}else if(txtTipoEmbalaje.getText().length() <= 0) {
			return false;
			
		}else if(txtPesoBrutoCaja.getText().length() <= 0) {
			return false;
			
		}else if(txtPesoNetoCaja.getText().length() <= 0) {
			return false;
			
		}else if(txtProfundidadCaja.getText().length() <= 0) {
			return false;
			
		}else if(txtAnchoCaja.getText().length() <= 0) {
			return false;
			
		}else if(txtAltoCaja.getText().length() <= 0) {
			return false;
			
		}else if(txtVolumenCaja.getText().length() <= 0) {
			return false;
			
		}else if(txtPesoBrutoUnidad.getText().length() <= 0) {
			return false;
			
		}else if(txtPesoNetoUnidad.getText().length() <= 0) {
			return false;
			
		}else if(txtAltoUnidad.getText().length() <= 0) {
			return false;
			
		}else if(txtAnchoUnidad.getText().length() <= 0) {
			return false;
			
		}else if(txtProfundidadUnidad.getText().length() <= 0) {
			return false;
			
		}else if(txtVolumenUnidad.getText().length() <= 0) {
			return false;
		}
		return true;
	}
	
	public void cargarForm(CodificacionProdEntity cpe) {
		ccp.setId(cpe.getId());
		txtProveedor.setText(cpe.getProveedor());
		txtDescProducto.setText(cpe.getDescripProducto());
		txtCodInternoProd.setText(cpe.getCodIntProducto());
		txtCodBarrasEAN13.setText(cpe.getCodBarrasEAN13());
		txtCodBarrasEAN14.setText(cpe.getCodBarrasEAN14());
		txtPaisAbaste.setText(cpe.getPaisAbastecimiento());
		txtPaisFabric.setText(cpe.getPaisFabricacion());
		txtMarca.setText(cpe.getMarca());
		txtPrecSinImpuesto.setText(cpe.getPrecioSinImpuestos());
		txtDescPermanente.setText(cpe.getDescuentoPermanente());
		txtPrecioNeto.setText(cpe.getPrecioNeto());
		txtDescuentoIntroduccion.setText(cpe.getDescuentoIntro());
		txtIVA.setText(cpe.getIVA());
		txtPVP.setText(cpe.getPVP());
		txtPrecioSugerido.setText(cpe.getPrecioSugerido());
		txtUniEmbalaje.setText(cpe.getUnidadEmbalaje());
		txtRegistroSanitario.setText(cpe.getRegistroSanitario());
		txtVidaUtil.setText(cpe.getVidaUtil());
		txtCajasxPlanchas.setText(cpe.getCajasxPlanchas());
		txtPlanchasxPallet.setText(cpe.getPlanchasxPallet());
		txtTipoEmbalaje.setText(cpe.getTipoEmbalaje());
		txtPesoBrutoCaja.setText(cpe.getPesoBrutoCaja());
		txtPesoNetoCaja.setText(cpe.getPesoNetoCaja());
		txtProfundidadCaja.setText(cpe.getProfundidadCaja());
		txtAnchoCaja.setText(cpe.getAnchoCaja());
		txtAltoCaja.setText(cpe.getAltoCaja());
		txtVolumenCaja.setText(cpe.getVolumenCaja());
		txtPesoBrutoUnidad.setText(cpe.getPesoBrutoUnidad());
		txtPesoNetoUnidad.setText(cpe.getPesoNeto());
		txtProfundidadUnidad.setText(cpe.getProfundidadUnidad());
		txtAnchoUnidad.setText(cpe.getAnchoUnidad());
		txtAltoUnidad.setText(cpe.getAltoUnidad());
		txtVolumenUnidad.setText(cpe.getVolumenUnidad());
		
	}
	
	public void VaciarForm() {
		ccp.setId(0L);
		txtProveedor.setText("");
		txtDescProducto.setText("");
		txtCodInternoProd.setText("");
		txtCodBarrasEAN13.setText("");
		txtCodBarrasEAN14.setText("");
		txtPaisAbaste.setText("");
		txtPaisFabric.setText("");
		txtMarca.setText("");
		txtPrecSinImpuesto.setText("");
		txtDescPermanente.setText("");
		txtPrecioNeto.setText("");
		txtDescuentoIntroduccion.setText("");
		txtIVA.setText("");
		txtPVP.setText("");
		txtPrecioSugerido.setText("");
		txtUniEmbalaje.setText("");
		txtRegistroSanitario.setText("");
		txtVidaUtil.setText("");
		txtCajasxPlanchas.setText("");
		txtPlanchasxPallet.setText("");
		txtTipoEmbalaje.setText("");
		txtPesoBrutoCaja.setText("");
		txtPesoNetoCaja.setText("");
		txtProfundidadCaja.setText("");
		txtAnchoCaja.setText("");
		txtAltoCaja.setText("");
		txtVolumenCaja.setText("");
		txtPesoBrutoUnidad.setText("");
		txtPesoNetoUnidad.setText("");
		txtAltoUnidad.setText("");
		txtAnchoUnidad.setText("");
		txtProfundidadUnidad.setText("");
		txtVolumenUnidad.setText("");
		
	}
	


	public JTextField getTxtProveedor() {
		return txtProveedor;
	}


	public void setTxtProveedor(JTextField txtProveedor) {
		this.txtProveedor = txtProveedor;
	}


	public JTextField getTxtCodInternoProd() {
		return txtCodInternoProd;
	}


	public void setTxtCodInternoProd(JTextField txtCodInternoProd) {
		this.txtCodInternoProd = txtCodInternoProd;
	}


	public JTextField getTxtCodBarrasEAN13() {
		return txtCodBarrasEAN13;
	}


	public void setTxtCodBarrasEAN13(JTextField txtCodBarrasEAN13) {
		this.txtCodBarrasEAN13 = txtCodBarrasEAN13;
	}


	public JTextField getTxtCodBarrasEAN14() {
		return txtCodBarrasEAN14;
	}


	public void setTxtCodBarrasEAN14(JTextField txtCodBarrasEAN14) {
		this.txtCodBarrasEAN14 = txtCodBarrasEAN14;
	}


	public JTextField getTxtPaisAbaste() {
		return txtPaisAbaste;
	}


	public void setTxtPaisAbaste(JTextField txtPaisAbaste) {
		this.txtPaisAbaste = txtPaisAbaste;
	}


	public JTextField getTxtPaisFabric() {
		return txtPaisFabric;
	}


	public void setTxtPaisFabric(JTextField txtPaisFabric) {
		this.txtPaisFabric = txtPaisFabric;
	}


	public JTextField getTxtMarca() {
		return txtMarca;
	}


	public void setTxtMarca(JTextField txtMarca) {
		this.txtMarca = txtMarca;
	}


	public JTextField getTxtDescProducto() {
		return txtDescProducto;
	}


	public void setTxtDescProducto(JTextField txtDescProducto) {
		this.txtDescProducto = txtDescProducto;
	}


	public TextSoloNumeros getTxtPrecSinImpuesto() {
		return txtPrecSinImpuesto;
	}


	public void setTxtPrecSinImpuesto(TextSoloNumeros txtPrecSinImpuesto) {
		this.txtPrecSinImpuesto = txtPrecSinImpuesto;
	}


	public TextSoloNumeros getTxtDescPermanente() {
		return txtDescPermanente;
	}


	public void setTxtDescPermanente(TextSoloNumeros txtDescPermanente) {
		this.txtDescPermanente = txtDescPermanente;
	}


	public TextSoloNumeros getTxtDescuentoIntroduccion() {
		return txtDescuentoIntroduccion;
	}


	public void setTxtDescuentoIntroduccion(TextSoloNumeros txtDescuentoIntroduccion) {
		this.txtDescuentoIntroduccion = txtDescuentoIntroduccion;
	}


	public TextSoloNumeros getTxtIVA() {
		return txtIVA;
	}


	public void setTxtIVA(TextSoloNumeros txtIVA) {
		this.txtIVA = txtIVA;
	}


	public TextSoloNumeros getTxtPVP() {
		return txtPVP;
	}


	public void setTxtPVP(TextSoloNumeros txtPVP) {
		this.txtPVP = txtPVP;
	}


	public TextSoloNumeros getTxtPrecioSugerido() {
		return txtPrecioSugerido;
	}


	public void setTxtPrecioSugerido(TextSoloNumeros txtPrecioSugerido) {
		this.txtPrecioSugerido = txtPrecioSugerido;
	}


	public JTextField getTxtUniEmbalaje() {
		return txtUniEmbalaje;
	}


	public void setTxtUniEmbalaje(JTextField txtUniEmbalaje) {
		this.txtUniEmbalaje = txtUniEmbalaje;
	}


	public JTextField getTxtRegistroSanitario() {
		return txtRegistroSanitario;
	}


	public void setTxtRegistroSanitario(JTextField txtRegistroSanitario) {
		this.txtRegistroSanitario = txtRegistroSanitario;
	}


	public JTextField getTxtCajasxPlanchas() {
		return txtCajasxPlanchas;
	}


	public void setTxtCajasxPlanchas(JTextField txtCajasxPlanchas) {
		this.txtCajasxPlanchas = txtCajasxPlanchas;
	}


	public JTextField getTxtPlanchasxPallet() {
		return txtPlanchasxPallet;
	}


	public void setTxtPlanchasxPallet(JTextField txtPlanchasxPallet) {
		this.txtPlanchasxPallet = txtPlanchasxPallet;
	}


	public TextSoloNumeros getTxtPesoBrutoCaja() {
		return txtPesoBrutoCaja;
	}


	public void setTxtPesoBrutoCaja(TextSoloNumeros txtPesoBrutoCaja) {
		this.txtPesoBrutoCaja = txtPesoBrutoCaja;
	}


	public TextSoloNumeros getTxtPesoNetoCaja() {
		return txtPesoNetoCaja;
	}


	public void setTxtPesoNetoCaja(TextSoloNumeros txtPesoNetoCaja) {
		this.txtPesoNetoCaja = txtPesoNetoCaja;
	}


	public TextSoloNumeros getTxtAnchoCaja() {
		return txtAnchoCaja;
	}


	public void setTxtAnchoCaja(TextSoloNumeros txtAnchoCaja) {
		this.txtAnchoCaja = txtAnchoCaja;
	}


	public TextSoloNumeros getTxtAltoCaja() {
		return txtAltoCaja;
	}


	public void setTxtAltoCaja(TextSoloNumeros txtAltoCaja) {
		this.txtAltoCaja = txtAltoCaja;
	}


	public TextSoloNumeros getTxtPesoBrutoUnidad() {
		return txtPesoBrutoUnidad;
	}


	public void setTxtPesoBrutoUnidad(TextSoloNumeros txtPesoBrutoUnidad) {
		this.txtPesoBrutoUnidad = txtPesoBrutoUnidad;
	}


	public TextSoloNumeros getTxtAnchoUnidad() {
		return txtAnchoUnidad;
	}


	public void setTxtAnchoUnidad(TextSoloNumeros txtAnchoUnidad) {
		this.txtAnchoUnidad = txtAnchoUnidad;
	}


	public TextSoloNumeros getTxtPesoNetoUnidad() {
		return txtPesoNetoUnidad;
	}


	public void setTxtPesoNetoUnidad(TextSoloNumeros txtPesoNetoUnidad) {
		this.txtPesoNetoUnidad = txtPesoNetoUnidad;
	}


	public TextSoloNumeros getTxtAltoUnidad() {
		return txtAltoUnidad;
	}


	public void setTxtAltoUnidad(TextSoloNumeros txtAltoUnidad) {
		this.txtAltoUnidad = txtAltoUnidad;
	}


	public StandarButton getStndrbtnGuardar() {
		return stndrbtnGuardar;
	}


	public void setStndrbtnGuardar(StandarButton stndrbtnGuardar) {
		this.stndrbtnGuardar = stndrbtnGuardar;
	}


	public TextSoloNumeros getTxtPrecioNeto() {
		return txtPrecioNeto;
	}


	public void setTxtPrecioNeto(TextSoloNumeros txtPrecioNeto) {
		this.txtPrecioNeto = txtPrecioNeto;
	}


	public TextSoloNumeros getTxtVidaUtil() {
		return txtVidaUtil;
	}


	public void setTxtVidaUtil(TextSoloNumeros txtVidaUtil) {
		this.txtVidaUtil = txtVidaUtil;
	}


	public JTextField getTxtTipoEmbalaje() {
		return txtTipoEmbalaje;
	}


	public void setTxtTipoEmbalaje(JTextField txtTipoEmbalaje) {
		this.txtTipoEmbalaje = txtTipoEmbalaje;
	}


	public TextSoloNumeros getTxtProfundidadCaja() {
		return txtProfundidadCaja;
	}


	public void setTxtProfundidadCaja(TextSoloNumeros txtProfundidadCaja) {
		this.txtProfundidadCaja = txtProfundidadCaja;
	}


	public TextSoloNumeros getTxtVolumenCaja() {
		return txtVolumenCaja;
	}


	public void setTxtVolumenCaja(TextSoloNumeros txtVolumenCaja) {
		this.txtVolumenCaja = txtVolumenCaja;
	}


	public TextSoloNumeros getTxtProfundidadUnidad() {
		return txtProfundidadUnidad;
	}


	public void setTxtProfundidadUnidad(TextSoloNumeros txtProfundidadUnidad) {
		this.txtProfundidadUnidad = txtProfundidadUnidad;
	}


	public TextSoloNumeros getTxtVolumenUnidad() {
		return txtVolumenUnidad;
	}


	public void setTxtVolumenUnidad(TextSoloNumeros txtVolumenUnidad) {
		this.txtVolumenUnidad = txtVolumenUnidad;
	}


	public StandarButton getBtnListaProductos() {
		return btnListaProductos;
	}


	public void setBtnListaProductos(StandarButton btnListaProductos) {
		this.btnListaProductos = btnListaProductos;
	}


	public JPanel getPanel() {
		return panel;
	}


	public JScrollPane getScrollPane() {
		return scrollPane;
	}


	public void setPanel(JPanel panel) {
		this.panel = panel;
	}


	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}




	
}
