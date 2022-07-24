package CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import ui.Labels.LabelTitulos;
import ui.Mensejes.Mensajes;
import ui.TablaUi.TableStandard;
import ui.Texts.TextSoloNumeros;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;

public class VistaFlujoCaja extends JPanel {

	private ControlCaja control;
	
	private Long idCaja = 0L;
	private Long idFlujo = 0L;
	
	private TableStandard tableFlujo;
	private TableStandard tableRegistro;

	private JTextField txtTotal;
	private JTextField txtCaja;
	private JTextField txtResponsable;
	private JTextField txtTipo;

	private TextSoloNumeros txtNumero;

	private StandarButton btnEliminar;
	private StandarButton btnModificar;
	private StandarButton btnUsarCaja;
	private JDateChooser dateFecha;

	private TextSoloNumeros txtNumCaja;
	private TextSoloNumeros txtConcepto;

	private StandarButton btnAgregar;
	private StandarButton btnCambiarCaja;
	private StandarButton btnEliminarFlujo;
	private StandarButton btnGuardar;
	private TextSoloNumeros txtCodigo;
	private TextSoloNumeros txtEntrada;
	private TextSoloNumeros txtSalida;

	/**
	 * Create the panel.
	 */
	public VistaFlujoCaja() {

		control = new ControlCaja(this);

		setOpaque(false);
		setBounds(0, 0, 774, 722);
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

		LabelTitulos lbltlsRegistroDeCaja = new LabelTitulos((String) null);
		lbltlsRegistroDeCaja.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsRegistroDeCaja.setText("Registro de Caja");
		lbltlsRegistroDeCaja.setBounds(0, 71, 748, 30);
		panel.add(lbltlsRegistroDeCaja);

		LabelSubtitulos lblsbtlsNroCaja = new LabelSubtitulos((String) null);
		lblsbtlsNroCaja.setText("Nro. Caja");
		lblsbtlsNroCaja.setBounds(20, 151, 97, 23);
		panel.add(lblsbtlsNroCaja);

		txtNumero = new TextSoloNumeros();
		txtNumero.setBounds(114, 151, 100, 23);
		panel.add(txtNumero);

		txtTipo = new JTextField();
		txtTipo.setBounds(320, 152, 145, 23);
		panel.add(txtTipo);

		LabelSubtitulos lblsbtlsTipoDeCaja = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeCaja.setText("Tipo de Caja");
		lblsbtlsTipoDeCaja.setBounds(224, 151, 97, 23);
		panel.add(lblsbtlsTipoDeCaja);

		txtResponsable = new JTextField();
		txtResponsable.setBounds(577, 152, 145, 23);
		panel.add(txtResponsable);

		LabelSubtitulos lblsbtlsResponsable = new LabelSubtitulos((String) null);
		lblsbtlsResponsable.setText("Responsable");
		lblsbtlsResponsable.setBounds(482, 151, 97, 23);
		panel.add(lblsbtlsResponsable);

		btnGuardar = new StandarButton((String) null);
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(326, 228, 100, 30);
		btnGuardar.addActionListener(control);
		panel.add(btnGuardar);

		JLabel lblNewLabel = new JLabel("Flujo Caja");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 587, 722, 33);
		panel.add(lblNewLabel);

		LabelSubtitulos lblsbtlsNro = new LabelSubtitulos((String) null);
		lblsbtlsNro.setText("Nro. Caja");
		lblsbtlsNro.setBounds(20, 654, 84, 23);
		panel.add(lblsbtlsNro);

		txtNumCaja = new TextSoloNumeros();
		txtNumCaja.setEnabled(false);
		txtNumCaja.setBounds(114, 654, 41, 23);
		panel.add(txtNumCaja);

		LabelSubtitulos lblTipoCaja = new LabelSubtitulos((String) null);
		lblTipoCaja.setText("Tipo de Caja");
		lblTipoCaja.setBounds(225, 654, 94, 23);
		panel.add(lblTipoCaja);

		txtCaja = new JTextField();
		txtCaja.setEnabled(false);
		txtCaja.setBounds(307, 655, 160, 23);
		panel.add(txtCaja);

		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos((String) null);
		lblsbtlsFecha.setText("Fecha");
		lblsbtlsFecha.setBounds(505, 654, 59, 23);
		panel.add(lblsbtlsFecha);

		dateFecha = new JDateChooser();
		dateFecha.setBounds(562, 654, 160, 23);
		panel.add(dateFecha);

		LabelSubtitulos lblsbtlsConcepto = new LabelSubtitulos((String) null);
		lblsbtlsConcepto.setText("Concepto");
		lblsbtlsConcepto.setBounds(20, 700, 84, 23);
		panel.add(lblsbtlsConcepto);

		txtConcepto = new TextSoloNumeros();
		txtConcepto.setBounds(114, 700, 353, 23);
		panel.add(txtConcepto);

		LabelSubtitulos lblsbtlsCodigo = new LabelSubtitulos((String) null);
		lblsbtlsCodigo.setText("Codigo");
		lblsbtlsCodigo.setBounds(505, 700, 59, 23);
		panel.add(lblsbtlsCodigo);

		txtCodigo = new TextSoloNumeros();
		txtCodigo.setBounds(562, 700, 160, 23);
		panel.add(txtCodigo);

		LabelSubtitulos lblsbtlsEntrada = new LabelSubtitulos((String) null);
		lblsbtlsEntrada.setText("Entrada");
		lblsbtlsEntrada.setBounds(20, 746, 84, 23);
		panel.add(lblsbtlsEntrada);

		txtEntrada = new TextSoloNumeros();
		txtEntrada.setBounds(114, 746, 110, 23);
		panel.add(txtEntrada);

		LabelSubtitulos lblsbtlsSalida = new LabelSubtitulos((String) null);
		lblsbtlsSalida.setText("Salida");
		lblsbtlsSalida.setBounds(265, 746, 103, 23);
		panel.add(lblsbtlsSalida);

		txtSalida = new TextSoloNumeros();
		txtSalida.setBounds(357, 746, 110, 23);
		panel.add(txtSalida);

		btnAgregar = new StandarButton((String) null);
		btnAgregar.setText("Agregar");
		btnAgregar.setBounds(612, 746, 110, 23);
		panel.add(btnAgregar);

		JScrollPane scrollPaneTablaFlujo = new JScrollPane();
		scrollPaneTablaFlujo.setBounds(20, 801, 702, 292);
		panel.add(scrollPaneTablaFlujo);

		tableFlujo = new TableStandard();
		tableFlujo.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Id", "Codigo", "Concepto", "Fecha", "Entrada", "Salida" }));
		scrollPaneTablaFlujo.setViewportView(tableFlujo);

		btnCambiarCaja = new StandarButton((String) null);
		btnCambiarCaja.setText("Cambiar Caja");
		btnCambiarCaja.setBounds(20, 1108, 135, 30);
		panel.add(btnCambiarCaja);

		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("TOTAL");
		lblsbtlsTotal.setBounds(550, 1104, 84, 26);
		panel.add(lblsbtlsTotal);

		btnEliminarFlujo = new StandarButton((String) null);
		btnEliminarFlujo.setText("Eliminar");
		btnEliminarFlujo.setBounds(172, 1108, 99, 30);
		panel.add(btnEliminarFlujo);

		StandarButton btnModificarFlujo = new StandarButton((String) null);
		btnModificarFlujo.setText("Modificar");
		btnModificarFlujo.setBounds(286, 1108, 100, 30);
		panel.add(btnModificarFlujo);

		txtTotal = new JTextField();
		txtTotal.setBounds(612, 1108, 110, 23);
		panel.add(txtTotal);
		txtTotal.setColumns(10);

		JScrollPane scrollPaneTablaRegistro = new JScrollPane();
		scrollPaneTablaRegistro.setBounds(20, 290, 702, 185);
		panel.add(scrollPaneTablaRegistro);

		tableRegistro = new TableStandard();
		String columns[] = new String[] { "Id", "Numero de Caja", "Tipo de Caja", "Responsable" };
		tableRegistro.setColums(columns);
		scrollPaneTablaRegistro.setViewportView(tableRegistro);

		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(20, 486, 99, 30);
		panel.add(btnEliminar);

		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(134, 486, 100, 30);
		panel.add(btnModificar);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 548, 748, 8);
		panel.add(separator);

		btnUsarCaja = new StandarButton((String) null);
		btnUsarCaja.setText("Usar Caja");
		btnUsarCaja.setBounds(249, 486, 119, 30);
		panel.add(btnUsarCaja);

	}

	public void actualizarVista() {
		actualizarVistaRegistro();
		actualizarVistaFlujo();
	}

	public void actualizarVistaRegistro() {
		VaciarFormRegistro();
		control.LlenarTablaRegistro();
	}

	public void actualizarVistaFlujo() {
		VaciarFormFlujo();
		control.LlenarTablaFlujo();
	}

	public void VaciarFormRegistro() {
		idCaja = 0L;
		txtResponsable.setText("");
		txtTipo.setText("");
		txtNumero.setText("");
	}

	public void VaciarFormFlujo() {
		idFlujo = 0L;
		dateFecha.setCalendar(null);
		txtConcepto.setText("");
		txtCodigo.setText("");
		txtEntrada.setText("");
		txtSalida.setText("");
	}
	
	public void CargarFormRegistro(Caja record) {
		idCaja = record.getId();
		txtResponsable.setText(record.getResponsable());
		txtTipo.setText(record.getTipo());
		txtNumero.setText(""+record.getNumero());
	}
	
	public void CargarFormRegistro() {
		idFlujo = 0L;
		dateFecha.setCalendar(null);
		txtConcepto.setText("");
		txtCodigo.setText("");
		txtEntrada.setText("");
		txtSalida.setText("");
	}

	public void CambiarCaja() {
		txtNumCaja.setText("");
		txtCaja.setText("");

		this.getModelFlujo().getDataVector().removeAllElements();
		this.getModelFlujo().fireTableDataChanged();
	}

	public boolean camposVaciosRegistro() {

		if (txtResponsable.getText().length() <= 0 || txtTipo.getText().length() <= 0
				|| txtNumero.getText().length() <= 0) {
			return false;
		}

		return true;
	}

	public boolean camposVaciosFlujo() {

		if (txtNumCaja.getText().length() <= 0 || txtCaja.getText().length() <= 0) {
			Mensajes.Information("Debe Seleccionar una Caja");
		}

		if (txtConcepto.getText().length() <= 0 || txtCodigo.getText().length() <= 0
				|| txtEntrada.getText().length() <= 0 || txtSalida.getText().length() <= 0) {
			return false;
		}

		return true;
	}

	public DefaultTableModel getModelRegistro() {
		return tableRegistro.getModel();
	}

	public DefaultTableModel getModelFlujo() {
		return tableFlujo.getModel();
	}

	public JTable getTableFlujo() {
		return tableFlujo;
	}

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public JTextField getTxtResponsable() {
		return txtResponsable;
	}

	public JTextField getTxtTipo() {
		return txtTipo;
	}

	public TextSoloNumeros getTxtNumero() {
		return txtNumero;
	}

	public ControlCaja getControl() {
		return control;
	}

	public void setTableFlujo(TableStandard tableFlujo) {
		this.tableFlujo = tableFlujo;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public void setTxtResponsable(JTextField txtResponsable) {
		this.txtResponsable = txtResponsable;
	}

	public void setTxtTipo(JTextField txtTipo) {
		this.txtTipo = txtTipo;
	}

	public void setTxtNumero(TextSoloNumeros txtNumero) {
		this.txtNumero = txtNumero;
	}

	public void setControl(ControlCaja control) {
		this.control = control;
	}

	public Long getIdCaja() {
		return idCaja;
	}

	public void setIdCaja(Long idCaja) {
		this.idCaja = idCaja;
	}

	public Long getIdFlujo() {
		return idFlujo;
	}

	public void setIdFlujo(Long idFlujo) {
		this.idFlujo = idFlujo;
	}
}
