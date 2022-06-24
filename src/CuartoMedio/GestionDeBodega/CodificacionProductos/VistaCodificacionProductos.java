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
	private JTextField txtPrecSinImpuesto;
	private JTextField txtDescPermanente;
	private JTextField txtDescuentoIntroduccion;
	private JTextField txtIVA;
	private JTextField txtPVP;
	private JTextField txtPrecioSugerido;
	private JTextField txtUniEmbalaje;
	private JTextField txtRegistroSanitario;
	private JTextField txtCajasxPlanchas;
	private JTextField txtPlanchasxPallet;
	private JTextField txtPesoBrutoCaja;
	private JTextField txtPesoNetoCaja;
	private JTextField txtAnchoCaja;
	private JTextField txtAltoCaja;
	private JTextField txtPesoBrutoUnidad;
	private JTextField txtAnchoUnidad;
	private JTextField txtPesoNetoUnidad;
	private JTextField txtAltoUnidad;
	private StandarButton stndrbtnGuardar;

	/**
	 * Create the panel.
	 */
	public VistaCodificacionProductos() {
		
		ccp = new ControlCodificacionProductos(this);
		
		setBounds(0, 0, 748, 723);
		setOpaque(false);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);
		
		JPanel panel = new JPanel();
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
		
		txtPrecSinImpuesto = new JTextField();
		txtPrecSinImpuesto.setColumns(10);
		txtPrecSinImpuesto.setBounds(113, 291, 120, 23);
		panel.add(txtPrecSinImpuesto);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_2_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_2_1_1.setText("Descuento Perman.");
		lblsbtlsCdBarrasEan_2_1_1.setBounds(237, 290, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_2_1_1);
		
		txtDescPermanente = new JTextField();
		txtDescPermanente.setColumns(10);
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
		
		txtDescuentoIntroduccion = new JTextField();
		txtDescuentoIntroduccion.setColumns(10);
		txtDescuentoIntroduccion.setBounds(113, 325, 120, 23);
		panel.add(txtDescuentoIntroduccion);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_2_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_2_1_2.setText("I.V.A.");
		lblsbtlsCdBarrasEan_2_1_2.setBounds(237, 324, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_2_1_2);
		
		txtIVA = new JTextField();
		txtIVA.setColumns(10);
		txtIVA.setBounds(353, 325, 120, 23);
		panel.add(txtIVA);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_1_1_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_1_1_1_2.setText("P.V.P.");
		lblsbtlsCdBarrasEan_1_1_1_2.setBounds(476, 324, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_1_1_1_2);
		
		txtPVP = new JTextField();
		txtPVP.setColumns(10);
		txtPVP.setBounds(592, 325, 120, 23);
		panel.add(txtPVP);
		
		LabelSubtitulos lblsbtlsCdIntProducto_1_1_3 = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto_1_1_3.setText("Precio Sugerido");
		lblsbtlsCdIntProducto_1_1_3.setBounds(10, 358, 123, 23);
		panel.add(lblsbtlsCdIntProducto_1_1_3);
		
		txtPrecioSugerido = new JTextField();
		txtPrecioSugerido.setColumns(10);
		txtPrecioSugerido.setBounds(113, 359, 120, 23);
		panel.add(txtPrecioSugerido);
		
		TextSoloNumeros txtPrecioNeto = new TextSoloNumeros();
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
		
		TextSoloNumeros txtVidaUtil = new TextSoloNumeros();
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
		
		TextSoloNumeros txtTipoEmbalaje = new TextSoloNumeros();
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
		
		txtPesoBrutoCaja = new JTextField();
		txtPesoBrutoCaja.setColumns(10);
		txtPesoBrutoCaja.setBounds(113, 573, 120, 23);
		panel.add(txtPesoBrutoCaja);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_2_1_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_2_1_1_1_1.setText("Peso Neto (Gr.)");
		lblsbtlsCdBarrasEan_2_1_1_1_1.setBounds(237, 572, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_2_1_1_1_1);
		
		txtPesoNetoCaja = new JTextField();
		txtPesoNetoCaja.setColumns(10);
		txtPesoNetoCaja.setBounds(353, 573, 120, 23);
		panel.add(txtPesoNetoCaja);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_1_1_1_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_1_1_1_1_1_1.setText("Profundidad (cms)");
		lblsbtlsCdBarrasEan_1_1_1_1_1_1.setBounds(476, 572, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_1_1_1_1_1_1);
		
		TextSoloNumeros txtProfundidadCaja = new TextSoloNumeros();
		txtProfundidadCaja.setBounds(592, 572, 120, 23);
		panel.add(txtProfundidadCaja);
		
		LabelSubtitulos lblsbtlsCdIntProducto_1_1_1_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdIntProducto_1_1_1_1_2.setText("Ancho (cms)");
		lblsbtlsCdIntProducto_1_1_1_1_2.setBounds(10, 606, 123, 23);
		panel.add(lblsbtlsCdIntProducto_1_1_1_1_2);
		
		txtAnchoCaja = new JTextField();
		txtAnchoCaja.setColumns(10);
		txtAnchoCaja.setBounds(113, 607, 120, 23);
		panel.add(txtAnchoCaja);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_2_1_1_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_2_1_1_1_2.setText("Alto (cms)");
		lblsbtlsCdBarrasEan_2_1_1_1_2.setBounds(237, 606, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_2_1_1_1_2);
		
		txtAltoCaja = new JTextField();
		txtAltoCaja.setColumns(10);
		txtAltoCaja.setBounds(353, 607, 120, 23);
		panel.add(txtAltoCaja);
		
		LabelSubtitulos lblsbtlsCdBarrasEan_1_1_1_1_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsCdBarrasEan_1_1_1_1_1_2.setText("Volumen (cm3)");
		lblsbtlsCdBarrasEan_1_1_1_1_1_2.setBounds(476, 606, 123, 23);
		panel.add(lblsbtlsCdBarrasEan_1_1_1_1_1_2);
		
		TextSoloNumeros txtPrecioNeto_1_2 = new TextSoloNumeros();
		txtPrecioNeto_1_2.setBounds(592, 606, 120, 23);
		panel.add(txtPrecioNeto_1_2);
		
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
		
		txtPesoBrutoUnidad = new JTextField();
		txtPesoBrutoUnidad.setColumns(10);
		txtPesoBrutoUnidad.setBounds(113, 699, 120, 23);
		panel.add(txtPesoBrutoUnidad);
		
		txtAnchoUnidad = new JTextField();
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
		
		txtPesoNetoUnidad = new JTextField();
		txtPesoNetoUnidad.setColumns(10);
		txtPesoNetoUnidad.setBounds(353, 699, 120, 23);
		panel.add(txtPesoNetoUnidad);
		
		txtAltoUnidad = new JTextField();
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
		
		TextSoloNumeros txtProfundidadUnidad = new TextSoloNumeros();
		txtProfundidadUnidad.setBounds(592, 698, 120, 23);
		panel.add(txtProfundidadUnidad);
		
		TextSoloNumeros txtVolumenUnidad = new TextSoloNumeros();
		txtVolumenUnidad.setBounds(592, 732, 120, 23);
		panel.add(txtVolumenUnidad);
		
		stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(315, 790, 103, 30);
		stndrbtnGuardar.addActionListener(ccp);
		panel.add(stndrbtnGuardar);

	}

	public StandarButton getStndrbtnGuardar() {
		return stndrbtnGuardar;
	}

	public void setStndrbtnGuardar(StandarButton stndrbtnGuardar) {
		this.stndrbtnGuardar = stndrbtnGuardar;
	}
}
