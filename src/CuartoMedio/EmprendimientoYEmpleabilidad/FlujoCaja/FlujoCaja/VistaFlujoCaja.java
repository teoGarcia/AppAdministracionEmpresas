package CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import ui.Labels.LabelTitulos;
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
	
	private JTextField textField;
	private JTable tableFlujo;
	private StandarButton btnGuardar;
	private JTextField txtResponsable;
	private JTextField txtTipo;
	private TextSoloNumeros txtNumero;
	private ControlCaja control;
	private TableStandard tableRegistro;

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
		
		TextSoloNumeros txtNumeros = new TextSoloNumeros();
		txtNumeros.setBounds(114, 654, 41, 23);
		panel.add(txtNumeros);
		
		LabelSubtitulos lblTipoCaja = new LabelSubtitulos((String) null);
		lblTipoCaja.setText("Tipo de Caja");
		lblTipoCaja.setBounds(225, 654, 94, 23);
		panel.add(lblTipoCaja);
		
		JTextField comboBox = new JTextField();
		comboBox.setBounds(307, 655, 160, 23);
		panel.add(comboBox);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos((String) null);
		lblsbtlsFecha.setText("Fecha");
		lblsbtlsFecha.setBounds(505, 654, 59, 23);
		panel.add(lblsbtlsFecha);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(562, 654, 160, 23);
		panel.add(dateChooser);
		
		LabelSubtitulos lblsbtlsConcepto = new LabelSubtitulos((String) null);
		lblsbtlsConcepto.setText("Concepto");
		lblsbtlsConcepto.setBounds(20, 700, 84, 23);
		panel.add(lblsbtlsConcepto);
		
		TextSoloNumeros textSoloNumeros_1 = new TextSoloNumeros();
		textSoloNumeros_1.setBounds(114, 700, 353, 23);
		panel.add(textSoloNumeros_1);
		
		LabelSubtitulos lblsbtlsCodigo = new LabelSubtitulos((String) null);
		lblsbtlsCodigo.setText("Codigo");
		lblsbtlsCodigo.setBounds(505, 700, 59, 23);
		panel.add(lblsbtlsCodigo);
		
		TextSoloNumeros textSoloNumeros_2 = new TextSoloNumeros();
		textSoloNumeros_2.setBounds(562, 700, 160, 23);
		panel.add(textSoloNumeros_2);
		
		LabelSubtitulos lblsbtlsEntrada = new LabelSubtitulos((String) null);
		lblsbtlsEntrada.setText("Entrada");
		lblsbtlsEntrada.setBounds(20, 746, 84, 23);
		panel.add(lblsbtlsEntrada);
		
		TextSoloNumeros textSoloNumeros_3 = new TextSoloNumeros();
		textSoloNumeros_3.setBounds(114, 746, 110, 23);
		panel.add(textSoloNumeros_3);
		
		LabelSubtitulos lblsbtlsSalida = new LabelSubtitulos((String) null);
		lblsbtlsSalida.setText("Salida");
		lblsbtlsSalida.setBounds(265, 746, 103, 23);
		panel.add(lblsbtlsSalida);
		
		TextSoloNumeros textSoloNumeros_3_1 = new TextSoloNumeros();
		textSoloNumeros_3_1.setBounds(357, 746, 110, 23);
		panel.add(textSoloNumeros_3_1);
		
		StandarButton stndrbtnAgregar = new StandarButton((String) null);
		stndrbtnAgregar.setText("Agregar");
		stndrbtnAgregar.setBounds(612, 746, 110, 23);
		panel.add(stndrbtnAgregar);
		
		JScrollPane scrollPaneTablaFlujo = new JScrollPane();
		scrollPaneTablaFlujo.setBounds(20, 801, 702, 292);
		panel.add(scrollPaneTablaFlujo);
		
		tableFlujo = new JTable();
		tableFlujo.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Codigo", "Concepto", "Fecha", "Entrada", "Salida"
			}
		));
		scrollPaneTablaFlujo.setViewportView(tableFlujo);
		
		StandarButton stndrbtnCambiarCaja = new StandarButton((String) null);
		stndrbtnCambiarCaja.setText("Cambiar Caja");
		stndrbtnCambiarCaja.setBounds(20, 1108, 135, 30);
		panel.add(stndrbtnCambiarCaja);
		
		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("TOTAL");
		lblsbtlsTotal.setBounds(550, 1104, 84, 26);
		panel.add(lblsbtlsTotal);
		
		StandarButton stndrbtnEliminar = new StandarButton((String) null);
		stndrbtnEliminar.setText("Eliminar");
		stndrbtnEliminar.setBounds(172, 1108, 99, 30);
		panel.add(stndrbtnEliminar);
		
		StandarButton stndrbtnModificar = new StandarButton((String) null);
		stndrbtnModificar.setText("Modificar");
		stndrbtnModificar.setBounds(286, 1108, 100, 30);
		panel.add(stndrbtnModificar);
		
		textField = new JTextField();
		textField.setBounds(612, 1108, 110, 23);
		panel.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPaneTablaRegistro = new JScrollPane();
		scrollPaneTablaRegistro.setBounds(20, 290, 702, 185);
		panel.add(scrollPaneTablaRegistro);
		
		tableRegistro = new TableStandard();
		String columns[] = new String[] {
				"Id",
				"Numero de Caja",
				"Tipo de Caja",
				"Responsable"
			};
		tableRegistro.setColums(columns);
		tableRegistro.getColumnModel().getColumn(0).setPreferredWidth(40);
		tableRegistro.getColumnModel().getColumn(1).setPreferredWidth(100);
		tableRegistro.getColumnModel().getColumn(2).setPreferredWidth(180);
		tableRegistro.getColumnModel().getColumn(3).setPreferredWidth(250);
		scrollPaneTablaRegistro.setViewportView(tableRegistro);
		
		StandarButton stndrbtnEliminar_1 = new StandarButton((String) null);
		stndrbtnEliminar_1.setText("Eliminar");
		stndrbtnEliminar_1.setBounds(20, 486, 99, 30);
		panel.add(stndrbtnEliminar_1);
		
		StandarButton stndrbtnModificar_1 = new StandarButton((String) null);
		stndrbtnModificar_1.setText("Modificar");
		stndrbtnModificar_1.setBounds(134, 486, 100, 30);
		panel.add(stndrbtnModificar_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 548, 748, 8);
		panel.add(separator);
		
		StandarButton stndrbtnOk = new StandarButton((String) null);
		stndrbtnOk.setText("Usar Datos");
		stndrbtnOk.setBounds(249, 486, 119, 30);
		panel.add(stndrbtnOk);
	}
	
	public void VaciarForm() {
		txtResponsable.setText("");
		txtTipo.setText("");
		txtNumero.setText("");
	}
	
	public boolean camposVaciosRegistro() {
		
		if(txtResponsable.getText().length() <= 0 || txtTipo.getText().length() <= 0 || txtNumero.getText().length() <= 0) {
			return false;
		}
		
		return true;
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

	public void setTableFlujo(JTable tableFlujo) {
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
}
