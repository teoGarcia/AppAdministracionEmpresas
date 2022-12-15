package TerceroMedio.GestionComercialTrib.BoletaHonorarios;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

<<<<<<< HEAD
import com.toedter.calendar.JDateChooser;

import TerceroMedio.GestionComercialTrib.OC.RegistrarOCEntity;
import ui.Buttons.StandarButton;
=======
import TerceroMedio.GestionComercialTrib.Formulario22.ControlFormulario;
import ui.AbrirDocumento.VistaDocumento;
>>>>>>> 8e9a4dfd3f55dc4070b9152b4820b5af1c562b13
import ui.Buttons.TittleButton;
import ui.Labels.LabelSubtitulos;
import ui.Labels.LabelTitulos;
import ui.TablaUi.TableStandard;
import ui.Texts.TextSoloNumeros;

public class VistaBoletaHonorarios extends VistaDocumento {

<<<<<<< HEAD
	private TableStandard tableRegistrarBH;
	private TableStandard tableRealizarBH;
	private StandarButton btnGuardarRegistroBH;
	private JTextField txtGiroTitular;
	private JTextField txtDireccionTitular;
	private StandarButton btnModificaRegistroDatos;
	private StandarButton btnEliminarRegistroDatos;
	private StandarButton btnUsarDatosRegistrarDatos;
	private JFormattedTextField txtRutEmpresa;
	private JFormattedTextField txtRutTitular;
	private JDateChooser Fecha;
	private ControlBoletaHonorarios controlador;
	private JTextField txtNombreTitular;
	private JTextField txtTelefonoTitular;
	private JTextField txtNombreEmpresa;
	private JTextField txtIDDatos;
	private JTextField txtNombreTitularReaBH;
	private JTextField txtDescripcion;
	private TextSoloNumeros txtValorUnitario;
	private StandarButton btnModificarRealizarBH;
	private StandarButton btnEliminarRealizarBH;
	private StandarButton btnImprimirBH;
	private JTextField txtIDRegBH;
	private TextSoloNumeros txtTotalHonorarios;
	private TextSoloNumeros txtImptoRetenido;
	private TextSoloNumeros txtTotal;
	private StandarButton btnGuardarRealizarBH;
	private JTextField txtIDRealizarBH;
	private JScrollPane scrollPaneRealizarBH;
	private JTextField txtDireccionEmpresa;
	private JTextField txtNumeroBH;
	
	
	public VistaBoletaHonorarios() {

		controlador = new ControlBoletaHonorarios(this);

		setOpaque(false);
		setBounds(0, 0, 748, 722);
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1200));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);

		LabelTitulos lbltlsInventario = new LabelTitulos((String) null);
		lbltlsInventario.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsInventario.setText("Registrar Datos");
		lbltlsInventario.setBounds(0, 61, 748, 30);
		panel.add(lbltlsInventario);

		LabelSubtitulos lblsbtlsTipoDeProducto = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeProducto.setText("Nombre Titular");
		lblsbtlsTipoDeProducto.setBounds(25, 129, 119, 23);
		panel.add(lblsbtlsTipoDeProducto);
		
		try {
			MaskFormatter mascara = new MaskFormatter("##.###.###-A");
			txtRutTitular = new JFormattedTextField(mascara);
			txtRutTitular.setColumns(10);
			txtRutTitular.setBounds(614, 130, 109, 23);
			panel.add(txtRutTitular);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LabelSubtitulos lblsbtlsInsumo = new LabelSubtitulos((String) null);
		lblsbtlsInsumo.setText("Giro Titular");
		lblsbtlsInsumo.setBounds(25, 163, 119, 23);
		panel.add(lblsbtlsInsumo);

		txtGiroTitular = new JTextField();
		txtGiroTitular.setBounds(154, 163, 222, 23);
		panel.add(txtGiroTitular);
		txtGiroTitular.setColumns(10);

		LabelSubtitulos lblsbtlsUnidadMedida = new LabelSubtitulos((String) null);
		lblsbtlsUnidadMedida.setText("Direccion Titular");
		lblsbtlsUnidadMedida.setBounds(386, 163, 111, 23);
		panel.add(lblsbtlsUnidadMedida);

		txtDireccionTitular = new JTextField();
		txtDireccionTitular.setBounds(507, 163, 216, 23);
		panel.add(txtDireccionTitular);

		LabelSubtitulos lblsbtlsStockReal = new LabelSubtitulos((String) null);
		lblsbtlsStockReal.setText("Fecha");
		lblsbtlsStockReal.setBounds(557, 230, 45, 23);
		panel.add(lblsbtlsStockReal);
		
		Fecha = new JDateChooser();
		Fecha.setBounds(604, 230, 119, 23);
		panel.add(Fecha);

		btnGuardarRegistroBH = new StandarButton((String) null);
		btnGuardarRegistroBH.setText("Guardar");
		btnGuardarRegistroBH.setBounds(623, 264, 100, 25);
		btnGuardarRegistroBH.addActionListener(controlador);
		panel.add(btnGuardarRegistroBH);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 543, 748, 9);
		panel.add(separator);

		JScrollPane scrollPaneRegistrarBH = new JScrollPane();
		scrollPaneRegistrarBH.setBounds(25, 306, 698, 185);
		panel.add(scrollPaneRegistrarBH);

		tableRegistrarBH = new TableStandard();
		tableRegistrarBH.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String[] columnsAlimBebidas = new String[] { "Id", "Nro. Documento", "Nombre Titular", "Rut Titular", "Giro Titular", "Direccion Titular", "Telefono",
				"Nombre Empresa", "Rut Empresa", "Direccion Empresa", "Fecha"};
		tableRegistrarBH.setColums(columnsAlimBebidas);
		tableRegistrarBH.getColumnModel().getColumn(0).setPreferredWidth(60);
		tableRegistrarBH.getColumnModel().getColumn(1).setPreferredWidth(180);
		tableRegistrarBH.getColumnModel().getColumn(2).setPreferredWidth(250);
		tableRegistrarBH.getColumnModel().getColumn(3).setPreferredWidth(140);
		tableRegistrarBH.getColumnModel().getColumn(4).setPreferredWidth(180);
		tableRegistrarBH.getColumnModel().getColumn(5).setPreferredWidth(250);
		tableRegistrarBH.getColumnModel().getColumn(6).setPreferredWidth(140);
		tableRegistrarBH.getColumnModel().getColumn(7).setPreferredWidth(250);
		tableRegistrarBH.getColumnModel().getColumn(8).setPreferredWidth(140);
		tableRegistrarBH.getColumnModel().getColumn(9).setPreferredWidth(250);
		tableRegistrarBH.getColumnModel().getColumn(10).setPreferredWidth(140);
		scrollPaneRegistrarBH.setViewportView(tableRegistrarBH);
		
		
		btnModificaRegistroDatos = new StandarButton((String) null);
		btnModificaRegistroDatos.setText("Modificar");
		btnModificaRegistroDatos.setBounds(25, 502, 109, 30);
		btnModificaRegistroDatos.addActionListener(controlador);
		panel.add(btnModificaRegistroDatos);

		btnEliminarRegistroDatos = new StandarButton((String) null);
		btnEliminarRegistroDatos.setText("Eliminar");
		btnEliminarRegistroDatos.setBounds(151, 502, 109, 30);
		btnEliminarRegistroDatos.addActionListener(controlador);
		panel.add(btnEliminarRegistroDatos);

		btnUsarDatosRegistrarDatos = new StandarButton((String) null);
		btnUsarDatosRegistrarDatos.setText("Usar Datos");
		btnUsarDatosRegistrarDatos.setBounds(279, 502, 109, 30);
		btnUsarDatosRegistrarDatos.addActionListener(controlador);
		panel.add(btnUsarDatosRegistrarDatos);

		scrollPaneRealizarBH = new JScrollPane();
		scrollPaneRealizarBH.setBounds(25, 667, 698, 320);
		panel.add(scrollPaneRealizarBH);

		tableRealizarBH = new TableStandard();
		String[] columnsMateOficina = new String[] { "ID", "Descripcion", "Total"};
		tableRealizarBH.setColums(columnsMateOficina);
		tableRealizarBH.getColumnModel().getColumn(0).setPreferredWidth(70);
		tableRealizarBH.getColumnModel().getColumn(1).setPreferredWidth(450);
		tableRealizarBH.getColumnModel().getColumn(2).setPreferredWidth(100);
		scrollPaneRealizarBH.setViewportView(tableRealizarBH);
		
		txtNombreTitular = new JTextField();
		txtNombreTitular.setColumns(10);
		txtNombreTitular.setBounds(154, 131, 364, 23);
		panel.add(txtNombreTitular);
		
		LabelSubtitulos lblsbtlsRut = new LabelSubtitulos((String) null);
		lblsbtlsRut.setText("Rut Titular");
		lblsbtlsRut.setBounds(528, 129, 74, 23);
		panel.add(lblsbtlsRut);
		
		LabelSubtitulos lblsbtlsEstado = new LabelSubtitulos((String) null);
		lblsbtlsEstado.setText("Rut Empresa");
		lblsbtlsEstado.setBounds(25, 230, 109, 23);
		panel.add(lblsbtlsEstado);
		
		try {
			MaskFormatter mascara = new MaskFormatter("##.###.###-A");
			txtRutEmpresa = new JFormattedTextField(mascara);
			txtRutEmpresa.setColumns(10);
			txtRutEmpresa.setBounds(154, 231, 109, 23);
			panel.add(txtRutEmpresa);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LabelSubtitulos lblsbtlsDireccionEnvioFact = new LabelSubtitulos((String) null);
		lblsbtlsDireccionEnvioFact.setText("Telefono Titular");
		lblsbtlsDireccionEnvioFact.setBounds(25, 196, 119, 23);
		panel.add(lblsbtlsDireccionEnvioFact);
		
		txtTelefonoTitular = new JTextField();
		txtTelefonoTitular.setColumns(10);
		txtTelefonoTitular.setBounds(154, 197, 134, 23);
		panel.add(txtTelefonoTitular);
		
		LabelSubtitulos lblsbtlsDireccionDeDespacho = new LabelSubtitulos((String) null);
		lblsbtlsDireccionDeDespacho.setText("Nombre Empresa");
		lblsbtlsDireccionDeDespacho.setBounds(309, 196, 123, 23);
		panel.add(lblsbtlsDireccionDeDespacho);
		
		txtNombreEmpresa = new JTextField();
		txtNombreEmpresa.setBounds(429, 197, 294, 23);
		panel.add(txtNombreEmpresa);
		
		LabelSubtitulos lblsbtlsCodId = new LabelSubtitulos((String) null);
		lblsbtlsCodId.setText("ID Datos");
		lblsbtlsCodId.setBounds(26, 557, 119, 23);
		panel.add(lblsbtlsCodId);
		
		txtIDDatos = new JTextField();
		txtIDDatos.setEditable(false);
		txtIDDatos.setColumns(10);
		txtIDDatos.setBounds(154, 557, 110, 23);
		panel.add(txtIDDatos);
		
		LabelSubtitulos lblsbtlsFormaDePago_1 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1.setText("Nombre Titular");
		lblsbtlsFormaDePago_1.setBounds(289, 557, 100, 23);
		panel.add(lblsbtlsFormaDePago_1);
		
		txtNombreTitularReaBH = new JTextField();
		txtNombreTitularReaBH.setEditable(false);
		txtNombreTitularReaBH.setBounds(404, 558, 319, 23);
		panel.add(txtNombreTitularReaBH);
		
		LabelSubtitulos lblsbtlsProducto = new LabelSubtitulos((String) null);
		lblsbtlsProducto.setText("Descripcion");
		lblsbtlsProducto.setBounds(25, 592, 123, 23);
		panel.add(lblsbtlsProducto);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(154, 592, 364, 23);
		panel.add(txtDescripcion);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_1.setText("Valor         $");
		lblsbtlsFormaDePago_1_1_1.setBounds(538, 592, 83, 23);
		panel.add(lblsbtlsFormaDePago_1_1_1);
		
		txtValorUnitario = new TextSoloNumeros();
		txtValorUnitario.setBounds(623, 592, 100, 23);
		panel.add(txtValorUnitario);
		
		btnModificarRealizarBH = new StandarButton((String) null);
		btnModificarRealizarBH.setText("Modificar");
		btnModificarRealizarBH.setBounds(25, 1000, 109, 30);
		btnModificarRealizarBH.addActionListener(controlador);
		panel.add(btnModificarRealizarBH);
		
		btnEliminarRealizarBH = new StandarButton((String) null);
		btnEliminarRealizarBH.setText("Eliminar");
		btnEliminarRealizarBH.setBounds(151, 1000, 109, 30);
		btnEliminarRealizarBH.addActionListener(controlador);
		panel.add(btnEliminarRealizarBH);
		
		btnImprimirBH = new StandarButton((String) null);
		btnImprimirBH.setText("Imprimir");
		btnImprimirBH.setBounds(279, 1000, 109, 30);
		btnImprimirBH.addActionListener(controlador);
		panel.add(btnImprimirBH);
		
		btnGuardarRealizarBH = new StandarButton((String) null);
		btnGuardarRealizarBH.setText("Guardar");
		btnGuardarRealizarBH.setBounds(623, 626, 100, 25);
		btnGuardarRealizarBH.addActionListener(controlador);
		panel.add(btnGuardarRealizarBH);
		
		txtIDRegBH = new JTextField();
		txtIDRegBH.setVisible(false);
		txtIDRegBH.setColumns(10);
		txtIDRegBH.setBounds(154, 95, 106, 23);
		panel.add(txtIDRegBH);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2.setText("Total Honorarios");
		lblsbtlsFormaDePago_1_1_2.setBounds(523, 1000, 39, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2);
		
		txtTotalHonorarios = new TextSoloNumeros();
		txtTotalHonorarios.setBounds(622, 1000, 100, 23);
		panel.add(txtTotalHonorarios);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_1 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_1.setText("12.25% Imp. Retenido");
		lblsbtlsFormaDePago_1_1_2_1.setBounds(523, 1030, 76, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_1);
		
		txtImptoRetenido = new TextSoloNumeros();
		txtImptoRetenido.setBounds(621, 1030, 100, 23);
		panel.add(txtImptoRetenido);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_1_1.setText("Total");
		lblsbtlsFormaDePago_1_1_2_1_1.setBounds(523, 1060, 53, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_1_1);
		
		txtTotal = new TextSoloNumeros();
		txtTotal.setBounds(621, 1060, 100, 23);
		panel.add(txtTotal);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_2 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsFormaDePago_1_1_2_2.setText("$");
		lblsbtlsFormaDePago_1_1_2_2.setBounds(593, 1000, 19, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_2);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_2_1 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_2_1.setText("$");
		lblsbtlsFormaDePago_1_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsFormaDePago_1_1_2_2_1.setBounds(593, 1030, 19, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_2_1);
		
		LabelSubtitulos lblsbtlsFormaDePago_1_1_2_2_2 = new LabelSubtitulos((String) null);
		lblsbtlsFormaDePago_1_1_2_2_2.setText("$");
		lblsbtlsFormaDePago_1_1_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsFormaDePago_1_1_2_2_2.setBounds(593, 1060, 19, 23);
		panel.add(lblsbtlsFormaDePago_1_1_2_2_2);
		
		txtIDRealizarBH = new JTextField();
		txtIDRealizarBH.setVisible(false);
		txtIDRealizarBH.setColumns(10);
		txtIDRealizarBH.setBounds(614, 524, 109, 23);
		panel.add(txtIDRealizarBH);
		
		LabelSubtitulos lblsbtlsDireccionEmpresa = new LabelSubtitulos((String) null);
		lblsbtlsDireccionEmpresa.setText("Direccion Empresa");
		lblsbtlsDireccionEmpresa.setBounds(273, 230, 123, 23);
		panel.add(lblsbtlsDireccionEmpresa);
		
		txtDireccionEmpresa = new JTextField();
		txtDireccionEmpresa.setText("");
		txtDireccionEmpresa.setBounds(393, 231, 154, 23);
		panel.add(txtDireccionEmpresa);
		
		LabelSubtitulos lblsbtlsNumeroDocumento = new LabelSubtitulos((String) null);
		lblsbtlsNumeroDocumento.setText("Numero Documento");
		lblsbtlsNumeroDocumento.setBounds(25, 265, 119, 23);
		panel.add(lblsbtlsNumeroDocumento);
		
		txtNumeroBH = new JTextField();
		txtNumeroBH.setText("");
		txtNumeroBH.setColumns(10);
		txtNumeroBH.setBounds(154, 266, 134, 23);
		panel.add(txtNumeroBH);
		
		ActualizarRegVistaBH();
		
	}
	
	public void ActualizarRegVistaBH() {
		VaciarRegistroBH();
		controlador.LlenarTablaRegBH();

=======
	public VistaBoletaHonorarios() {
		super("Boleta y Honorarios", "FORMATO BOLETA DE HONORARIOS.pdf");
>>>>>>> 8e9a4dfd3f55dc4070b9152b4820b5af1c562b13
	}
	
	public void ActualizarTablaReaBH() {
		vaciarRealizarBH();;
		controlador.LlenarTablaReaBH();
		
	}
	
	public void VaciarRegistroBH() {
		
		txtIDRegBH.setText("");
		txtNumeroBH.setText("");
		txtRutTitular.setText("");
		txtNombreTitular.setText("");
		txtGiroTitular.setText("");
		txtDireccionTitular.setText("");
		Fecha.setCalendar(null);
		txtTelefonoTitular.setText("");
		txtNombreEmpresa.setText("");
		txtDireccionEmpresa.setText("");
		txtRutEmpresa.setText("");
		

<<<<<<< HEAD
	}
	
	public void vaciarRealizarBH() {
		
		txtIDRealizarBH.setText("");
		txtDescripcion.setText("");
		txtValorUnitario.setText("");
		
	}
	
	
	public void CargarFormRegistrarBH(RegBoletaHonorariosEntity ape) {
		
		txtIDRegBH.setText(""+ape.getId());
		txtNumeroBH.setText(ape.getNumeroBH());
		txtRutTitular.setText(ape.getRutTitular());
		txtNombreTitular.setText(ape.getNombreTitular());
		txtGiroTitular.setText(ape.getGiroTitular());
		txtDireccionTitular.setText(ape.getDireccionTitular());
		Fecha.setCalendar(ape.getFecha());
		txtTelefonoTitular.setText(ape.getTelefonoTitular());
		txtNombreEmpresa.setText(ape.getNombreEmpresa());
		txtDireccionEmpresa.setText(ape.getDireccionEmpresa());
		txtRutEmpresa.setText(ape.getRutEmpresa());
		
	}
	
	public void CargarFormRealizarBH(ReaBoletaHonorariosEntity ape) {
		
		txtIDRealizarBH.setText(""+ape.getId());
		txtIDDatos.setText(""+ape.getIdDatos());
		txtDescripcion.setText(ape.getDescripcion());
		txtValorUnitario.setText(""+ape.getValor());
		txtNombreTitularReaBH.setText("Modificando");
	}
	
	public boolean camposVaciosRegistroBH() {

		if(txtNombreTitular.getText().length() <= 0) {
			return false;
		}else if (txtRutTitular.getText().length() <= 0) {
			return false;
		}else if (txtGiroTitular.getText().length() <= 0) {
			return false;
		}else if (txtDireccionTitular.getText().length() <= 0) {
			return false;
		}else if (Fecha.getCalendar() == null) {
			return false;
		}else if (txtNombreEmpresa.getText().length() <= 0) {
			return false;
		}else if (txtTelefonoTitular.getText().length() <= 0) {
			return false;
		}else if (txtDireccionEmpresa.getText().length() <= 0) {
			return false;
		}else if (txtRutEmpresa.getText().length() <= 0) {
			return false;
		}

		return true;
	}
	
	public boolean camposVaciosRealizarBH(){
		
		if(txtIDDatos.getText().length() <= 0) {
			return false;
		}else if (txtNombreTitularReaBH.getText().length() <= 0) {
			return false;
		}else if (txtDescripcion.getText().length() <= 0) {
			return false;
		}else if (txtValorUnitario.getText().length() <= 0) {
			return false;
		}

		return true;
		
		
	}
	
	public boolean camposVaciosImprimir() {

		if (txtIDDatos.getText().length() <= 0) {
			return false;
		} else if (tableRealizarBH.getRowCount() <= 0) {
			return false;
		} 

		return true;
	}
	
	public void calcularTotal() {
	
		int totalHonorarios = 0;
		int totalImpuesto = 0; 
		int total = 0;
		
		for(int i=0; i<this.tableRealizarBH.getRowCount(); i++) { 
			totalHonorarios += Integer.parseInt(String.valueOf(tableRealizarBH.getModel().getValueAt(i, 2))); 
		}
		
		totalImpuesto = (int) ((totalHonorarios*12.25)/100);
		total = totalHonorarios-totalImpuesto;
		
		txtTotalHonorarios.setText(""+totalHonorarios);
		txtImptoRetenido.setText(""+totalImpuesto);
		txtTotal.setText(""+total);
		
		
		 
	}
	public DefaultTableModel getModelTableRegBH() {
		return tableRegistrarBH.getModel();
	}

	public DefaultTableModel getModelTableReaBH() {
		return tableRealizarBH.getModel();
	}
=======
	
>>>>>>> 8e9a4dfd3f55dc4070b9152b4820b5af1c562b13

	public TableStandard getTableRegistrarBH() {
		return tableRegistrarBH;
	}

	public void setTableRegistrarBH(TableStandard tableRegistrarBH) {
		this.tableRegistrarBH = tableRegistrarBH;
	}

	public TableStandard getTableRealizarBH() {
		return tableRealizarBH;
	}

	public void setTableRealizarBH(TableStandard tableRealizarBH) {
		this.tableRealizarBH = tableRealizarBH;
	}

	public StandarButton getBtnGuardarRegistroBH() {
		return btnGuardarRegistroBH;
	}

	public void setBtnGuardarRegistroBH(StandarButton btnGuardarRegistroBH) {
		this.btnGuardarRegistroBH = btnGuardarRegistroBH;
	}

	public JTextField getTxtGiroTitular() {
		return txtGiroTitular;
	}

	public void setTxtGiroTitular(JTextField txtGiroTitular) {
		this.txtGiroTitular = txtGiroTitular;
	}

	public JTextField getTxtDireccionTitular() {
		return txtDireccionTitular;
	}

	public void setTxtDireccionTitular(JTextField txtDireccionTitular) {
		this.txtDireccionTitular = txtDireccionTitular;
	}

	public StandarButton getBtnModificaRegistroDatos() {
		return btnModificaRegistroDatos;
	}

	public void setBtnModificaRegistroDatos(StandarButton btnModificaRegistroDatos) {
		this.btnModificaRegistroDatos = btnModificaRegistroDatos;
	}

	public StandarButton getBtnEliminarRegistroDatos() {
		return btnEliminarRegistroDatos;
	}

	public void setBtnEliminarRegistroDatos(StandarButton btnEliminarRegistroDatos) {
		this.btnEliminarRegistroDatos = btnEliminarRegistroDatos;
	}

	public StandarButton getBtnUsarDatosRegistrarDatos() {
		return btnUsarDatosRegistrarDatos;
	}

	public void setBtnUsarDatosRegistrarDatos(StandarButton btnUsarDatosRegistrarDatos) {
		this.btnUsarDatosRegistrarDatos = btnUsarDatosRegistrarDatos;
	}

	public JFormattedTextField getTxtRutEmpresa() {
		return txtRutEmpresa;
	}

	public void setTxtRutEmpresa(JFormattedTextField txtRutEmpresa) {
		this.txtRutEmpresa = txtRutEmpresa;
	}

	public JFormattedTextField getTxtRutTitular() {
		return txtRutTitular;
	}

	public void setTxtRutTitular(JFormattedTextField txtRutTitular) {
		this.txtRutTitular = txtRutTitular;
	}

	public JDateChooser getFecha() {
		return Fecha;
	}

	public void setFecha(JDateChooser fecha) {
		Fecha = fecha;
	}

	public JTextField getTxtNombreTitular() {
		return txtNombreTitular;
	}

	public void setTxtNombreTitular(JTextField txtNombreTitular) {
		this.txtNombreTitular = txtNombreTitular;
	}

	public JTextField getTxtTelefonoTitular() {
		return txtTelefonoTitular;
	}

	public void setTxtTelefonoTitular(JTextField txtTelefonoTitular) {
		this.txtTelefonoTitular = txtTelefonoTitular;
	}

	public JTextField getTxtNombreEmpresa() {
		return txtNombreEmpresa;
	}

	public void setTxtNombreEmpresa(JTextField txtNombreEmpresa) {
		this.txtNombreEmpresa = txtNombreEmpresa;
	}

	public JTextField getTxtIDDatos() {
		return txtIDDatos;
	}

	public void setTxtIDDatos(JTextField txtIDDatos) {
		this.txtIDDatos = txtIDDatos;
	}

	public JTextField getTxtCodLicitacion() {
		return txtNombreTitularReaBH;
	}

	public void setTxtCodLicitacion(JTextField txtCodLicitacion) {
		this.txtNombreTitularReaBH = txtCodLicitacion;
	}

	public JTextField getTxtDescripcion() {
		return txtDescripcion;
	}

	public void setTxtDescripcion(JTextField txtDescripcion) {
		this.txtDescripcion = txtDescripcion;
	}

	public TextSoloNumeros getTxtValorUnitario() {
		return txtValorUnitario;
	}

	public void setTxtValorUnitario(TextSoloNumeros txtValorUnitario) {
		this.txtValorUnitario = txtValorUnitario;
	}

	public StandarButton getBtnModificarRealizarBH() {
		return btnModificarRealizarBH;
	}

	public void setBtnModificarRealizarBH(StandarButton btnModificarRealizarBH) {
		this.btnModificarRealizarBH = btnModificarRealizarBH;
	}

	public StandarButton getBtnEliminarRealizarBH() {
		return btnEliminarRealizarBH;
	}

	public void setBtnEliminarRealizarBH(StandarButton btnEliminarRealizarBH) {
		this.btnEliminarRealizarBH = btnEliminarRealizarBH;
	}

	public StandarButton getBtnImprimirBH() {
		return btnImprimirBH;
	}

	public void setBtnImprimirBH(StandarButton btnImprimirBH) {
		this.btnImprimirBH = btnImprimirBH;
	}

	public JTextField getTxtIDRegBH() {
		return txtIDRegBH;
	}

	public void setTxtIDRegBH(JTextField txtIDRegBH) {
		this.txtIDRegBH = txtIDRegBH;
	}

	public TextSoloNumeros getTxtTotalHonorarios() {
		return txtTotalHonorarios;
	}

	public void setTxtTotalHonorarios(TextSoloNumeros txtTotalHonorarios) {
		this.txtTotalHonorarios = txtTotalHonorarios;
	}

	public TextSoloNumeros getTxtImptoRetenido() {
		return txtImptoRetenido;
	}

	public void setTxtImptoRetenido(TextSoloNumeros txtImptoRetenido) {
		this.txtImptoRetenido = txtImptoRetenido;
	}

	public TextSoloNumeros getTxtTotal() {
		return txtTotal;
	}

	public void setTxtTotal(TextSoloNumeros txtTotal) {
		this.txtTotal = txtTotal;
	}

	public StandarButton getBtnGuardarRealizarBH() {
		return btnGuardarRealizarBH;
	}

	public void setBtnGuardarRealizarBH(StandarButton btnGuardarRealizarBH) {
		this.btnGuardarRealizarBH = btnGuardarRealizarBH;
	}

	public JTextField getTxtIDRealizarBH() {
		return txtIDRealizarBH;
	}

	public void setTxtIDRealizarBH(JTextField txtIDRealizarBH) {
		this.txtIDRealizarBH = txtIDRealizarBH;
	}

	public JTextField getTxtDireccionEmpresa() {
		return txtDireccionEmpresa;
	}

	public void setTxtDireccionEmpresa(JTextField txtDireccionEmpresa) {
		this.txtDireccionEmpresa = txtDireccionEmpresa;
	}

	public JTextField getTxtNombreTitularReaBH() {
		return txtNombreTitularReaBH;
	}

	public void setTxtNombreTitularReaBH(JTextField txtNombreTitularReaBH) {
		this.txtNombreTitularReaBH = txtNombreTitularReaBH;
	}

	public JTextField getTxtNumeroBH() {
		return txtNumeroBH;
	}

	public void setTxtNumeroBH(JTextField txtNumeroBH) {
		this.txtNumeroBH = txtNumeroBH;
	}
}
