package TerceroMedio.GestionComercialTrib.ConciliacionBancaria;

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

import com.toedter.calendar.JDateChooser;

import TerceroMedio.GestionComercialTrib.Cotizacion.EmpresaPersonaEntity;
import ui.Buttons.StandarButton;
import ui.Labels.LabelSubtitulos;
import ui.Labels.LabelTitulos;
import ui.TablaUi.TableStandard;
import ui.Texts.TextSoloNumeros;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VistaConciliacionBancaria extends JPanel {

	private ControlConciliacionBancaria controlador;
	private TableStandard tableChequesTerceros;
	private TableStandard tableChequesPropios;
	private StandarButton btnGuardarChequesTercero;
	private JTextField txtNumFacturaCheTer;
	private JComboBox comboBoxEstadoCheTer;
	private JTextField txtBancoEmisionCheTer;
	private JTextField txtTitularChequeCheTer;
	private StandarButton btnModificarCheTer;
	private StandarButton btnEliminarCheTer;
	private StandarButton btnModificarChePro;
	private StandarButton btnEliminarChePro;
	private StandarButton btnImprimirChequeTercero;
	private JDateChooser FechaDeposito;
	private JTextField txtNumChequeCheTer;
	private TextSoloNumeros txtMontoCheTer;
	private JTextField txtDepositadoEn;
	private JTextField txtDestinatarioEndoso;
	private JTextField txtObservacionCheTer;
	private JTextField txtNumFacturaChePro;
	private JTextField txtBancoEmisionChePro;
	private JTextField txtIdChePro;
	private JTextField txtProveedor;
	private JTextField txtNumChequeChePro;
	private JTextField txtTitularChequeChePro;
	private JTextField txtIdCheTer;
	private JTextField txtObservacionChePro;
	private StandarButton btnBuscarChePro;
	private StandarButton btnBuscarCheTer;
	private StandarButton btnGuardarChequesPropios;
	private JDateChooser FechaEndoso;
	private StandarButton btnImprimirChequesPropios;
	private TextSoloNumeros txtTotalCheTer;
	private JComboBox comboBoxBuscarCheTer;
	private JDateChooser fechaSalida;
	private JDateChooser FechaPago;
	private JComboBox comboBoxEstadoChePro;
	private TextSoloNumeros txtMontoChePro;
	private JComboBox comboBoxBuscarChePro;
	private TextSoloNumeros txtTotalChePro;

	/**
	 * Create the panel.
	 * @throws ParseException 
	 */
	public VistaConciliacionBancaria() {

		controlador = new ControlConciliacionBancaria(this);

		setOpaque(false);
		setBounds(0, 0, 748, 722);
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1150));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);

		LabelTitulos lbltlsInventario = new LabelTitulos((String) null);
		lbltlsInventario.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsInventario.setText("Cheques de Terceros");
		lbltlsInventario.setBounds(0, 61, 748, 30);
		panel.add(lbltlsInventario);

		LabelSubtitulos lblsbtlsTipoDeProducto = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeProducto.setText("Nro. de Factura");
		lblsbtlsTipoDeProducto.setBounds(25, 129, 119, 23);
		panel.add(lblsbtlsTipoDeProducto);

		txtNumFacturaCheTer = new JTextField();
		txtNumFacturaCheTer.setBounds(140, 130, 112, 23);
		panel.add(txtNumFacturaCheTer);
		txtNumFacturaCheTer.setColumns(10);
		
		LabelSubtitulos lblsbtlsInsumo = new LabelSubtitulos((String) null);
		lblsbtlsInsumo.setText("Banco Emision");
		lblsbtlsInsumo.setBounds(496, 129, 94, 23);
		panel.add(lblsbtlsInsumo);
		
		FechaDeposito = new JDateChooser();
		FechaDeposito.setBounds(371, 129, 115, 23);
		panel.add(FechaDeposito);

		LabelSubtitulos Fechalbl = new LabelSubtitulos((String) null);
		Fechalbl.setText("Fecha Deposito");
		Fechalbl.setBounds(262, 129, 94, 23);
		panel.add(Fechalbl);

		txtTitularChequeCheTer = new JTextField();
		txtTitularChequeCheTer.setBounds(371, 163, 352, 23);
		panel.add(txtTitularChequeCheTer);

		LabelSubtitulos lblsbtlsStockReal = new LabelSubtitulos((String) null);
		lblsbtlsStockReal.setText("Numero de Cheque");
		lblsbtlsStockReal.setBounds(25, 163, 119, 23);
		panel.add(lblsbtlsStockReal);

		txtBancoEmisionCheTer = new JTextField();
		txtBancoEmisionCheTer.setBounds(593, 130, 130, 23);
		panel.add(txtBancoEmisionCheTer);

		LabelSubtitulos lblsbtlsValorUnitario = new LabelSubtitulos((String) null);
		lblsbtlsValorUnitario.setText("Monto");
		lblsbtlsValorUnitario.setBounds(25, 196, 60, 23);
		panel.add(lblsbtlsValorUnitario);

		comboBoxEstadoCheTer = new JComboBox();
		comboBoxEstadoCheTer.setModel(new DefaultComboBoxModel(new String[] {"A depositar", "Depositado", "Endosado", "Anulado", "Rechazado"}));
		comboBoxEstadoCheTer.setBounds(371, 197, 115, 23);
		panel.add(comboBoxEstadoCheTer);

		btnGuardarChequesTercero = new StandarButton((String) null);
		btnGuardarChequesTercero.setText("Guardar");
		btnGuardarChequesTercero.setBounds(622, 300, 100, 25);
		btnGuardarChequesTercero.addActionListener(controlador);
		panel.add(btnGuardarChequesTercero);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 561, 748, 9);
		panel.add(separator);

		JScrollPane scrollPaneChequesTercero = new JScrollPane();
		scrollPaneChequesTercero.setBounds(25, 336, 698, 173);
		panel.add(scrollPaneChequesTercero);

		tableChequesTerceros = new TableStandard();
		tableChequesTerceros.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String[] columnsAlimBebidas = new String[] { "Id", "Nro. Factura", "Fecha Dep.", "Banco de Emision", "Nro. Cheque", "titular del Cheque",
				"Monto $", "Estado", "Depositado en", "Fecha Endoso", "Destinatario del endoso", "Observacion" };
		tableChequesTerceros.setColums(columnsAlimBebidas);
		scrollPaneChequesTercero.setViewportView(tableChequesTerceros);
		tableChequesTerceros.getColumnModel().getColumn(0).setPreferredWidth(80);
		tableChequesTerceros.getColumnModel().getColumn(1).setPreferredWidth(140);
		tableChequesTerceros.getColumnModel().getColumn(2).setPreferredWidth(120);
		tableChequesTerceros.getColumnModel().getColumn(3).setPreferredWidth(180);
		tableChequesTerceros.getColumnModel().getColumn(4).setPreferredWidth(120);
		tableChequesTerceros.getColumnModel().getColumn(5).setPreferredWidth(200);
		tableChequesTerceros.getColumnModel().getColumn(6).setPreferredWidth(120);
		tableChequesTerceros.getColumnModel().getColumn(7).setPreferredWidth(140);
		tableChequesTerceros.getColumnModel().getColumn(8).setPreferredWidth(180);
		tableChequesTerceros.getColumnModel().getColumn(9).setPreferredWidth(120);
		tableChequesTerceros.getColumnModel().getColumn(10).setPreferredWidth(200);
		tableChequesTerceros.getColumnModel().getColumn(11).setPreferredWidth(200);

		btnModificarCheTer = new StandarButton((String) null);
		btnModificarCheTer.setText("Modificar");
		btnModificarCheTer.setBounds(25, 520, 109, 30);
		btnModificarCheTer.addActionListener(controlador);
		panel.add(btnModificarCheTer);

		btnEliminarCheTer = new StandarButton((String) null);
		btnEliminarCheTer.setText("Eliminar");
		btnEliminarCheTer.setBounds(151, 520, 109, 30);
		btnEliminarCheTer.addActionListener(controlador);
		panel.add(btnEliminarCheTer);

		btnImprimirChequeTercero = new StandarButton((String) null);
		btnImprimirChequeTercero.setText("Imprimir");
		btnImprimirChequeTercero.setBounds(279, 520, 109, 30);
		btnImprimirChequeTercero.addActionListener(controlador);
		panel.add(btnImprimirChequeTercero);

		JScrollPane scrollPaneChequesPropios = new JScrollPane();
		scrollPaneChequesPropios.setBounds(25, 835, 698, 173);
		panel.add(scrollPaneChequesPropios);

		tableChequesPropios = new TableStandard();
		tableChequesPropios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String[] columnsMateOficina = new String[] { "Id", "Fecha salida", "Proveedor", "Nro. Factura",
				"Fecha de pago", "Banco de emision", "Nro. de Cheque", "Titular del Cheque", "Monto $", "Estado", "Observacion" };
		tableChequesPropios.setColums(columnsMateOficina);
		tableChequesPropios.getColumnModel().getColumn(0).setPreferredWidth(60);
		tableChequesPropios.getColumnModel().getColumn(1).setPreferredWidth(120);
		tableChequesPropios.getColumnModel().getColumn(2).setPreferredWidth(250);
		tableChequesPropios.getColumnModel().getColumn(3).setPreferredWidth(140);
		tableChequesPropios.getColumnModel().getColumn(4).setPreferredWidth(120);
		tableChequesPropios.getColumnModel().getColumn(5).setPreferredWidth(180);
		tableChequesPropios.getColumnModel().getColumn(6).setPreferredWidth(140);
		tableChequesPropios.getColumnModel().getColumn(7).setPreferredWidth(250);
		tableChequesPropios.getColumnModel().getColumn(8).setPreferredWidth(120);
		tableChequesPropios.getColumnModel().getColumn(9).setPreferredWidth(140);
		tableChequesPropios.getColumnModel().getColumn(10).setPreferredWidth(250);
		scrollPaneChequesPropios.setViewportView(tableChequesPropios);

		btnModificarChePro = new StandarButton((String) null);
		btnModificarChePro.setText("Modificar");
		btnModificarChePro.setBounds(25, 1025, 109, 30);
		btnModificarChePro.addActionListener(controlador);
		panel.add(btnModificarChePro);

		btnEliminarChePro = new StandarButton((String) null);
		btnEliminarChePro.setText("Eliminar");
		btnEliminarChePro.setBounds(151, 1025, 109, 30);
		btnEliminarChePro.addActionListener(controlador);
		panel.add(btnEliminarChePro);
		
		txtNumChequeCheTer = new JTextField();
		txtNumChequeCheTer.setColumns(10);
		txtNumChequeCheTer.setBounds(140, 163, 112, 23);
		panel.add(txtNumChequeCheTer);
		
		LabelSubtitulos lblsbtlsTitularDelCheque = new LabelSubtitulos((String) null);
		lblsbtlsTitularDelCheque.setText("Titular del Cheque");
		lblsbtlsTitularDelCheque.setBounds(262, 163, 109, 23);
		panel.add(lblsbtlsTitularDelCheque);
		
		txtMontoCheTer = new TextSoloNumeros();
		txtMontoCheTer.setColumns(10);
		txtMontoCheTer.setBounds(140, 197, 112, 23);
		panel.add(txtMontoCheTer);
		
		LabelSubtitulos lblsbtlsValorUnitario_1 = new LabelSubtitulos((String) null);
		lblsbtlsValorUnitario_1.setText("$");
		lblsbtlsValorUnitario_1.setBounds(122, 196, 22, 23);
		panel.add(lblsbtlsValorUnitario_1);
		
		LabelSubtitulos lblsbtlsEstado = new LabelSubtitulos((String) null);
		lblsbtlsEstado.setText("Estado");
		lblsbtlsEstado.setBounds(262, 196, 109, 23);
		panel.add(lblsbtlsEstado);
		
		LabelSubtitulos lblsbtlsDepositadoEn = new LabelSubtitulos((String) null);
		lblsbtlsDepositadoEn.setText("Depositado en");
		lblsbtlsDepositadoEn.setBounds(496, 197, 100, 23);
		panel.add(lblsbtlsDepositadoEn);
		
		txtDepositadoEn = new JTextField();
		txtDepositadoEn.setBounds(593, 197, 130, 23);
		panel.add(txtDepositadoEn);
		
		LabelSubtitulos lblsbtlsFechaEndoso = new LabelSubtitulos((String) null);
		lblsbtlsFechaEndoso.setText("Fecha Endoso");
		lblsbtlsFechaEndoso.setBounds(25, 230, 94, 23);
		panel.add(lblsbtlsFechaEndoso);
		
		FechaEndoso = new JDateChooser();
		FechaEndoso.setBounds(140, 231, 112, 23);
		panel.add(FechaEndoso);
		
		LabelSubtitulos lblsbtlsDestintarioDelEndoso = new LabelSubtitulos((String) null);
		lblsbtlsDestintarioDelEndoso.setText("Destintario Endoso");
		lblsbtlsDestintarioDelEndoso.setBounds(262, 231, 109, 23);
		panel.add(lblsbtlsDestintarioDelEndoso);
		
		txtDestinatarioEndoso = new JTextField();
		txtDestinatarioEndoso.setBounds(371, 231, 352, 23);
		panel.add(txtDestinatarioEndoso);
		
		LabelSubtitulos lblsbtlsObservacion = new LabelSubtitulos((String) null);
		lblsbtlsObservacion.setText("Observacion");
		lblsbtlsObservacion.setBounds(25, 264, 109, 23);
		panel.add(lblsbtlsObservacion);
		
		txtObservacionCheTer = new JTextField();
		txtObservacionCheTer.setText("Ninguna");
		txtObservacionCheTer.setBounds(140, 265, 583, 23);
		panel.add(txtObservacionCheTer);
		
		LabelSubtitulos lblsbtlsBuscarPorEstado = new LabelSubtitulos((String) null);
		lblsbtlsBuscarPorEstado.setText("Buscar por estado");
		lblsbtlsBuscarPorEstado.setBounds(25, 301, 109, 23);
		panel.add(lblsbtlsBuscarPorEstado);
		
		comboBoxBuscarCheTer = new JComboBox();
		comboBoxBuscarCheTer.setModel(new DefaultComboBoxModel(new String[] {"A depositar", "Depositado", "Endosado", "Anulado", "Rechazado"}));
		comboBoxBuscarCheTer.setBounds(140, 302, 115, 23);
		panel.add(comboBoxBuscarCheTer);
		
		btnBuscarCheTer = new StandarButton((String) null);
		btnBuscarCheTer.setText("Buscar");
		btnBuscarCheTer.setBounds(271, 300, 100, 25);
		btnBuscarCheTer.addActionListener(controlador);
		panel.add(btnBuscarCheTer);
		
		LabelTitulos lbltlsChequesPropios = new LabelTitulos((String) null);
		lbltlsChequesPropios.setText("Cheques Propios");
		lbltlsChequesPropios.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsChequesPropios.setBounds(0, 581, 748, 30);
		panel.add(lbltlsChequesPropios);
		
		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("Total");
		lblsbtlsTotal.setBounds(530, 514, 60, 23);
		panel.add(lblsbtlsTotal);
		
		LabelSubtitulos lblsbtlsValorUnitario_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsValorUnitario_1_1.setText("$");
		lblsbtlsValorUnitario_1_1.setBounds(593, 514, 22, 23);
		panel.add(lblsbtlsValorUnitario_1_1);
		
		txtTotalCheTer = new TextSoloNumeros();
		txtTotalCheTer.setColumns(10);
		txtTotalCheTer.setBounds(611, 515, 112, 23);
		panel.add(txtTotalCheTer);
		
		LabelSubtitulos lblsbtlsTipoDeProducto_1 = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeProducto_1.setText("Nro. de Factura");
		lblsbtlsTipoDeProducto_1.setBounds(25, 676, 119, 23);
		panel.add(lblsbtlsTipoDeProducto_1);
		
		txtNumFacturaChePro = new JTextField();
		txtNumFacturaChePro.setColumns(10);
		txtNumFacturaChePro.setBounds(140, 677, 112, 23);
		panel.add(txtNumFacturaChePro);
		
		LabelSubtitulos FechaSalida = new LabelSubtitulos((String) null);
		FechaSalida.setText("Fecha Salida");
		FechaSalida.setBounds(25, 642, 94, 23);
		panel.add(FechaSalida);
		
		fechaSalida = new JDateChooser();
		fechaSalida.setBounds(140, 642, 112, 23);
		panel.add(fechaSalida);
		
		LabelSubtitulos lblsbtlsInsumo_1 = new LabelSubtitulos((String) null);
		lblsbtlsInsumo_1.setText("Banco Emision");
		lblsbtlsInsumo_1.setBounds(496, 675, 94, 23);
		panel.add(lblsbtlsInsumo_1);
		
		txtBancoEmisionChePro = new JTextField();
		txtBancoEmisionChePro.setBounds(593, 676, 130, 23);
		panel.add(txtBancoEmisionChePro);
		
		LabelSubtitulos lblsbtlsFechaPago = new LabelSubtitulos((String) null);
		lblsbtlsFechaPago.setText("Fecha Pago");
		lblsbtlsFechaPago.setBounds(262, 676, 94, 23);
		panel.add(lblsbtlsFechaPago);
		
		txtIdChePro = new JTextField();
		txtIdChePro.setVisible(false);
		txtIdChePro.setEditable(false);
		txtIdChePro.setColumns(10);
		txtIdChePro.setBounds(140, 605, 112, 23);
		panel.add(txtIdChePro);
		
		LabelSubtitulos lblsbtlsProveedor = new LabelSubtitulos((String) null);
		lblsbtlsProveedor.setText("Proveedor");
		lblsbtlsProveedor.setBounds(262, 642, 109, 23);
		panel.add(lblsbtlsProveedor);
		
		txtProveedor = new JTextField();
		txtProveedor.setBounds(371, 643, 352, 23);
		panel.add(txtProveedor);
		
		LabelSubtitulos lblsbtlsValorUnitario_2 = new LabelSubtitulos((String) null);
		lblsbtlsValorUnitario_2.setText("Monto");
		lblsbtlsValorUnitario_2.setBounds(25, 709, 60, 23);
		panel.add(lblsbtlsValorUnitario_2);
		
		LabelSubtitulos lblsbtlsValorUnitario_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsValorUnitario_1_2.setText("$");
		lblsbtlsValorUnitario_1_2.setBounds(122, 709, 22, 23);
		panel.add(lblsbtlsValorUnitario_1_2);
		
		txtMontoChePro = new TextSoloNumeros();
		txtMontoChePro.setColumns(10);
		txtMontoChePro.setBounds(140, 710, 112, 23);
		panel.add(txtMontoChePro);
		
		LabelSubtitulos lblsbtlsEstado_1 = new LabelSubtitulos((String) null);
		lblsbtlsEstado_1.setText("Estado");
		lblsbtlsEstado_1.setBounds(262, 709, 109, 23);
		panel.add(lblsbtlsEstado_1);
		
		comboBoxEstadoChePro = new JComboBox();
		comboBoxEstadoChePro.setModel(new DefaultComboBoxModel(new String[] {"A depositar", "Pagado", "Rechazado", "Anulado"}));
		comboBoxEstadoChePro.setBounds(371, 710, 115, 23);
		panel.add(comboBoxEstadoChePro);
		
		LabelSubtitulos lblsbtlsNroCheque = new LabelSubtitulos((String) null);
		lblsbtlsNroCheque.setText("Nro. Cheque");
		lblsbtlsNroCheque.setBounds(496, 710, 100, 23);
		panel.add(lblsbtlsNroCheque);
		
		txtNumChequeChePro = new JTextField();
		txtNumChequeChePro.setBounds(593, 710, 130, 23);
		panel.add(txtNumChequeChePro);
		
		LabelSubtitulos lblsbtlsObservacion_1 = new LabelSubtitulos((String) null);
		lblsbtlsObservacion_1.setText("Observacion");
		lblsbtlsObservacion_1.setBounds(25, 743, 109, 23);
		panel.add(lblsbtlsObservacion_1);
		
		FechaPago = new JDateChooser();
		FechaPago.setBounds(371, 676, 112, 23);
		panel.add(FechaPago);
		
		LabelSubtitulos lblsbtlsTitularDelCheque_1 = new LabelSubtitulos((String) null);
		lblsbtlsTitularDelCheque_1.setText("Titular del Cheque");
		lblsbtlsTitularDelCheque_1.setBounds(400, 744, 109, 23);
		panel.add(lblsbtlsTitularDelCheque_1);
		
		txtTitularChequeChePro = new JTextField();
		txtTitularChequeChePro.setBounds(515, 744, 210, 23);
		panel.add(txtTitularChequeChePro);
		
		txtIdCheTer = new JTextField();
		txtIdCheTer.setVisible(false);
		txtIdCheTer.setEditable(false);
		txtIdCheTer.setColumns(10);
		txtIdCheTer.setBounds(140, 91, 112, 23);
		panel.add(txtIdCheTer);
		
		txtObservacionChePro = new JTextField();
		txtObservacionChePro.setText("Ninguna");
		txtObservacionChePro.setBounds(140, 744, 255, 23);
		panel.add(txtObservacionChePro);
		
		LabelSubtitulos lblsbtlsBuscarPorEstado_1 = new LabelSubtitulos((String) null);
		lblsbtlsBuscarPorEstado_1.setText("Buscar por estado");
		lblsbtlsBuscarPorEstado_1.setBounds(25, 788, 109, 23);
		panel.add(lblsbtlsBuscarPorEstado_1);
		
		comboBoxBuscarChePro = new JComboBox();
		comboBoxBuscarChePro.setModel(new DefaultComboBoxModel(new String[] {"A depositar", "Pagado", "Rechazado", "Anulado"}));
		comboBoxBuscarChePro.setBounds(140, 788, 115, 23);
		panel.add(comboBoxBuscarChePro);
		
		btnBuscarChePro = new StandarButton((String) null);
		btnBuscarChePro.setText("Buscar");
		btnBuscarChePro.setBounds(271, 788, 100, 25);
		btnBuscarChePro.addActionListener(controlador);
		panel.add(btnBuscarChePro);
		
		btnGuardarChequesPropios = new StandarButton((String) null);
		btnGuardarChequesPropios.setText("Guardar");
		btnGuardarChequesPropios.setBounds(623, 788, 100, 25);
		btnGuardarChequesPropios.addActionListener(controlador);
		panel.add(btnGuardarChequesPropios);
		
		btnImprimirChequesPropios = new StandarButton((String) null);
		btnImprimirChequesPropios.setText("Imprimir");
		btnImprimirChequesPropios.setBounds(279, 1025, 109, 30);
		panel.add(btnImprimirChequesPropios);
		
		LabelSubtitulos lblsbtlsTotal_1 = new LabelSubtitulos((String) null);
		lblsbtlsTotal_1.setText("Total");
		lblsbtlsTotal_1.setBounds(530, 1020, 60, 23);
		panel.add(lblsbtlsTotal_1);
		
		LabelSubtitulos lblsbtlsValorUnitario_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsValorUnitario_1_1_1.setText("$");
		lblsbtlsValorUnitario_1_1_1.setBounds(593, 1020, 22, 23);
		panel.add(lblsbtlsValorUnitario_1_1_1);
		
		txtTotalChePro = new TextSoloNumeros();
		txtTotalChePro.setColumns(10);
		txtTotalChePro.setBounds(611, 1020, 112, 23);
		panel.add(txtTotalChePro);
		
		ActualizarVistaCheTer();
		ActualizarVistaChePro();
		
	}
	
	public void ActualizarVistaCheTer() {
		
		VaciarFormCheTer();
		controlador.LlenarTablaCheTer();
	}
	
	public void ActualizarVistaChePro() {
		
		VaciarFormChePro();
		controlador.LlenarTablaChePro();
	}
	
	public void CargarFormCheTer(ChequesTerceroEntity ape) {

		txtIdCheTer.setText("" +ape.getId());
		txtNumFacturaCheTer.setText(ape.getNumeroFactura());
		FechaDeposito.setCalendar(ape.getFechaDeposito());
		txtBancoEmisionCheTer.setText("" + ape.getBancoEmision());
		txtNumChequeCheTer.setText("" + ape.getNumeroCheque());
		txtTitularChequeCheTer.setText(ape.getTitularCheque());
		txtMontoCheTer.setText(""+ape.getMonto());
		comboBoxEstadoCheTer.setSelectedIndex(ape.getEstado());
		txtDepositadoEn.setText(ape.getDepositadoEn());
		FechaEndoso.setCalendar(ape.getFechaEndoso());
		txtDestinatarioEndoso.setText(ape.getDestinatarioEndoso());
		txtObservacionCheTer.setText(ape.getObservacion());
		
	}
	
	public void CargarFormChePro(ChequesPropiosEntity ape) {

		txtIdChePro.setText("" +ape.getId());
		fechaSalida.setCalendar(ape.getFechaSalida());
		txtProveedor.setText("" + ape.getProveedor());
		txtNumFacturaChePro.setText("" + ape.getNumeroFactura());
		FechaPago.setCalendar(ape.getFechaPago());
		txtBancoEmisionChePro.setText(ape.getBancoEmision());
		txtNumChequeChePro.setText(""+ape.getNumeroCheque());
		txtTitularChequeChePro.setText(ape.getTitularCheque());
		txtMontoChePro.setText(""+ape.getMonto());
		comboBoxEstadoChePro.setSelectedIndex(ape.getEstado());
		txtObservacionChePro.setText(ape.getObservacion());
		
	}
	
	public void VaciarFormCheTer() {
		
		txtIdCheTer.setText("");
		txtNumFacturaCheTer.setText("");
		FechaDeposito.setCalendar(null);
		txtBancoEmisionCheTer.setText("");
		txtNumChequeCheTer.setText("");
		txtTitularChequeCheTer.setText("");
		txtMontoCheTer.setText("");
		comboBoxEstadoCheTer.setSelectedIndex(0);
		txtDepositadoEn.setText("");
		FechaEndoso.setCalendar(null);
		txtDestinatarioEndoso.setText("");
		txtObservacionCheTer.setText("Ninguna");
		
	}
	
	public void VaciarFormChePro() {
		
		txtIdChePro.setText("");
		fechaSalida.setCalendar(null);
		txtProveedor.setText("");
		txtNumFacturaChePro.setText("");
		FechaPago.setCalendar(null);
		txtBancoEmisionChePro.setText("");
		txtNumChequeChePro.setText("");
		txtTitularChequeChePro.setText("");
		txtMontoChePro.setText("");
		comboBoxEstadoChePro.setSelectedIndex(0);
		txtObservacionChePro.setText("Ninguna");
		
	}
	
	public boolean camposVaciosCheTer() {
		
		if (txtNumFacturaCheTer.getText().length() <= 0) {
			return false;
		} else if (FechaDeposito.getCalendar() == null) {
			return false;
		} else if (txtBancoEmisionCheTer.getText().length() <= 0) {
			return false;
		} else if (txtNumChequeCheTer.getText().length() <= 0) {
			return false;
		} else if (txtTitularChequeCheTer.getText().length() <= 0) {
			return false;
		} else if (txtMontoCheTer.getText().length() <= 0) {
			return false;
		} else if (txtDepositadoEn.getText().length() <= 0) {
			return false;
		} else if (FechaEndoso.getCalendar() == null) {
			return false;
		} else if (txtDestinatarioEndoso.getText().length() <= 0) {
			return false;
		} else if (txtObservacionCheTer.getText().length() <= 0) {
			return false;
		}
		
		return true;
		
	}
	public boolean camposVaciosChePro() {
		
		if (fechaSalida.getCalendar() == null) {
			return false;
		} else if (txtProveedor.getText().length() <= 0) {
			return false;
		} else if (txtNumFacturaChePro.getText().length() <= 0) {
			return false;
		} else if (FechaPago.getCalendar() == null) {
			return false;
		} else if (txtBancoEmisionChePro.getText().length() <= 0) {
			return false;
		} else if (txtNumChequeChePro.getText().length() <= 0) {
			return false;
		} else if (txtTitularChequeChePro.getText().length() <= 0) {
			return false;
		}else if (txtMontoChePro.getText().length() <= 0) {
			return false;
		} else if (txtObservacionChePro.getText().length() <= 0) {
			return false;
		}
		
		return true;
		
	}
	
	public void calcularTotalCheTer() {
		
		int totalCheTer = 0;
		  
		for(int i=0; i<this.tableChequesTerceros.getRowCount(); i++) { 
			totalCheTer += Integer.parseInt(String.valueOf(tableChequesTerceros.getModel().getValueAt(i, 6))); 
		}
		
		txtTotalCheTer.setText(""+totalCheTer);
		
	}
	
	public void calcularTotalChePro() {
		
		int totalChePro = 0;
		  
		for(int i=0; i<this.tableChequesPropios.getRowCount(); i++) { 
			totalChePro += Integer.parseInt(String.valueOf(tableChequesPropios.getModel().getValueAt(i, 8))); 
		}
		
		txtTotalChePro.setText(""+totalChePro);
		
	}
	
	public DefaultTableModel getModelTableChequesTerceros() {
		return tableChequesTerceros.getModel();
		
	}
	
	public DefaultTableModel getModelTableChequesPropios() {
		return tableChequesPropios.getModel();
		
	}


	public ControlConciliacionBancaria getControlador() {
		return controlador;
	}

	public void setControlador(ControlConciliacionBancaria controlador) {
		this.controlador = controlador;
	}

	public TableStandard getTableChequesTerceros() {
		return tableChequesTerceros;
	}

	public void setTableChequesTerceros(TableStandard tableChequesTerceros) {
		this.tableChequesTerceros = tableChequesTerceros;
	}

	public TableStandard getTableChequesPropios() {
		return tableChequesPropios;
	}

	public void setTableChequesPropios(TableStandard tableChequesPropios) {
		this.tableChequesPropios = tableChequesPropios;
	}

	public StandarButton getBtnGuardarChequesTercero() {
		return btnGuardarChequesTercero;
	}

	public void setBtnGuardarChequesTercero(StandarButton btnGuardarChequesTercero) {
		this.btnGuardarChequesTercero = btnGuardarChequesTercero;
	}

	public JTextField getTxtNumFacturaCheTer() {
		return txtNumFacturaCheTer;
	}

	public void setTxtNumFacturaCheTer(JTextField txtNumFacturaCheTer) {
		this.txtNumFacturaCheTer = txtNumFacturaCheTer;
	}

	public JComboBox getComboBoxEstadoCheTer() {
		return comboBoxEstadoCheTer;
	}

	public void setComboBoxEstadoCheTer(JComboBox comboBoxEstadoCheTer) {
		this.comboBoxEstadoCheTer = comboBoxEstadoCheTer;
	}

	public JTextField getTxtBancoEmisionCheTer() {
		return txtBancoEmisionCheTer;
	}

	public void setTxtBancoEmisionCheTer(JTextField txtBancoEmisionCheTer) {
		this.txtBancoEmisionCheTer = txtBancoEmisionCheTer;
	}

	public JTextField getTxtTitularChequeCheTer() {
		return txtTitularChequeCheTer;
	}

	public void setTxtTitularChequeCheTer(JTextField txtTitularChequeCheTer) {
		this.txtTitularChequeCheTer = txtTitularChequeCheTer;
	}

	public StandarButton getBtnModificarCheTer() {
		return btnModificarCheTer;
	}

	public void setBtnModificarCheTer(StandarButton btnModificarCheTer) {
		this.btnModificarCheTer = btnModificarCheTer;
	}

	public StandarButton getBtnEliminarCheTer() {
		return btnEliminarCheTer;
	}

	public void setBtnEliminarCheTer(StandarButton btnEliminarCheTer) {
		this.btnEliminarCheTer = btnEliminarCheTer;
	}

	public StandarButton getBtnModificarChePro() {
		return btnModificarChePro;
	}

	public void setBtnModificarChePro(StandarButton btnModificarChePro) {
		this.btnModificarChePro = btnModificarChePro;
	}

	public StandarButton getBtnEliminarChePro() {
		return btnEliminarChePro;
	}

	public void setBtnEliminarChePro(StandarButton btnEliminarChePro) {
		this.btnEliminarChePro = btnEliminarChePro;
	}

	public StandarButton getBtnImprimirChequeTercero() {
		return btnImprimirChequeTercero;
	}

	public void setBtnImprimirChequeTercero(StandarButton btnImprimirChequeTercero) {
		this.btnImprimirChequeTercero = btnImprimirChequeTercero;
	}

	public JDateChooser getFechaDeposito() {
		return FechaDeposito;
	}

	public void setFechaDeposito(JDateChooser fechaDeposito) {
		FechaDeposito = fechaDeposito;
	}

	public JTextField getTxtNumChequeCheTer() {
		return txtNumChequeCheTer;
	}

	public void setTxtNumChequeCheTer(JTextField txtNumChequeCheTer) {
		this.txtNumChequeCheTer = txtNumChequeCheTer;
	}

	public TextSoloNumeros getTxtMontoCheTer() {
		return txtMontoCheTer;
	}

	public void setTxtMontoCheTer(TextSoloNumeros txtMontoCheTer) {
		this.txtMontoCheTer = txtMontoCheTer;
	}

	public JTextField getTxtDepositadoEn() {
		return txtDepositadoEn;
	}

	public void setTxtDepositadoEn(JTextField txtDepositadoEn) {
		this.txtDepositadoEn = txtDepositadoEn;
	}

	public JTextField getTxtDestinatarioEndoso() {
		return txtDestinatarioEndoso;
	}

	public void setTxtDestinatarioEndoso(JTextField txtDestinatarioEndoso) {
		this.txtDestinatarioEndoso = txtDestinatarioEndoso;
	}

	public JTextField getTxtObservacionCheTer() {
		return txtObservacionCheTer;
	}

	public void setTxtObservacionCheTer(JTextField txtObservacionCheTer) {
		this.txtObservacionCheTer = txtObservacionCheTer;
	}

	public JTextField getTxtNumFacturaChePro() {
		return txtNumFacturaChePro;
	}

	public void setTxtNumFacturaChePro(JTextField txtNumFacturaChePro) {
		this.txtNumFacturaChePro = txtNumFacturaChePro;
	}

	public JTextField getTxtBancoEmisionChePro() {
		return txtBancoEmisionChePro;
	}

	public void setTxtBancoEmisionChePro(JTextField txtBancoEmisionChePro) {
		this.txtBancoEmisionChePro = txtBancoEmisionChePro;
	}

	public JTextField getTxtIdChePro() {
		return txtIdChePro;
	}

	public void setTxtIdChePro(JTextField txtIdChePro) {
		this.txtIdChePro = txtIdChePro;
	}

	public JTextField getTxtProveedor() {
		return txtProveedor;
	}

	public void setTxtProveedor(JTextField txtProveedor) {
		this.txtProveedor = txtProveedor;
	}

	public JTextField getTxtNumChequeChePro() {
		return txtNumChequeChePro;
	}

	public void setTxtNumChequeChePro(JTextField txtNumChequeChePro) {
		this.txtNumChequeChePro = txtNumChequeChePro;
	}

	public JTextField getTxtTitularChequeChePro() {
		return txtTitularChequeChePro;
	}

	public void setTxtTitularChequeChePro(JTextField txtTitularChequeChePro) {
		this.txtTitularChequeChePro = txtTitularChequeChePro;
	}

	public JTextField getTxtIdCheTer() {
		return txtIdCheTer;
	}

	public void setTxtIdCheTer(JTextField txtIdCheTer) {
		this.txtIdCheTer = txtIdCheTer;
	}

	public JTextField getTxtObservacionChePro() {
		return txtObservacionChePro;
	}

	public void setTxtObservacionChePro(JTextField txtObservacionChePro) {
		this.txtObservacionChePro = txtObservacionChePro;
	}

	public StandarButton getBtnBuscarChePro() {
		return btnBuscarChePro;
	}

	public void setBtnBuscarChePro(StandarButton btnBuscarChePro) {
		this.btnBuscarChePro = btnBuscarChePro;
	}

	public StandarButton getBtnBuscarCheTer() {
		return btnBuscarCheTer;
	}

	public void setBtnBuscarCheTer(StandarButton btnBuscarCheTer) {
		this.btnBuscarCheTer = btnBuscarCheTer;
	}

	public StandarButton getBtnGuardarChequesPropios() {
		return btnGuardarChequesPropios;
	}

	public void setBtnGuardarChequesPropios(StandarButton btnGuardarChequesPropios) {
		this.btnGuardarChequesPropios = btnGuardarChequesPropios;
	}

	public JDateChooser getFechaEndoso() {
		return FechaEndoso;
	}

	public void setFechaEndoso(JDateChooser fechaEndoso) {
		FechaEndoso = fechaEndoso;
	}

	public StandarButton getBtnImprimirChequesPropios() {
		return btnImprimirChequesPropios;
	}

	public void setBtnImprimirChequesPropios(StandarButton btnImprimirChequesPropios) {
		this.btnImprimirChequesPropios = btnImprimirChequesPropios;
	}

	public TextSoloNumeros getTxtTotalCheTer() {
		return txtTotalCheTer;
	}

	public void setTxtTotalCheTer(TextSoloNumeros txtTotalCheTer) {
		this.txtTotalCheTer = txtTotalCheTer;
	}

	public JComboBox getComboBoxBuscarCheTer() {
		return comboBoxBuscarCheTer;
	}

	public void setComboBoxBuscarCheTer(JComboBox comboBoxBuscarCheTer) {
		this.comboBoxBuscarCheTer = comboBoxBuscarCheTer;
	}

	public JDateChooser getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(JDateChooser fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public JDateChooser getFechaPago() {
		return FechaPago;
	}

	public void setFechaPago(JDateChooser fechaPago) {
		FechaPago = fechaPago;
	}

	public JComboBox getComboBoxEstadoChePro() {
		return comboBoxEstadoChePro;
	}

	public void setComboBoxEstadoChePro(JComboBox comboBoxEstadoChePro) {
		this.comboBoxEstadoChePro = comboBoxEstadoChePro;
	}

	public TextSoloNumeros getTxtMontoChePro() {
		return txtMontoChePro;
	}

	public void setTxtMontoChePro(TextSoloNumeros txtMontoChePro) {
		this.txtMontoChePro = txtMontoChePro;
	}

	public JComboBox getComboBoxBuscarChePro() {
		return comboBoxBuscarChePro;
	}

	public void setComboBoxBuscarChePro(JComboBox comboBoxBuscarChePro) {
		this.comboBoxBuscarChePro = comboBoxBuscarChePro;
	}
}
