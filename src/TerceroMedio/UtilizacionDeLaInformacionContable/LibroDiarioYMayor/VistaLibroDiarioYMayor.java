package TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor;

import java.awt.Color;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.ControlListaPrecio;
import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.Producto;
import core.Helpers;
import ui.Buttons.StandarButton;
import ui.TablaUi.TableStandard;
import ui.Texts.TextSoloNumeros;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;

public class VistaLibroDiarioYMayor extends JPanel {

	private Long id = 0L;
	private Long idLibro = 0L;
	private Long idSelectLibro = 0L;
	
	private ControlLibroDiarioYMayor control;
	
	private TableStandard table;
	private TableStandard tableLibro;
	
	private JTextField txtAsiento;
	private JComboBox txtDesglose;
	private JComboBox txtCodigo;
	private TextSoloNumeros txtDebe;
	private StandarButton btnAgregar;
	
	private DefaultTableModel modelo;
	
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	private StandarButton btnImprimir;
	private StandarButton btnAgregarLibro;
	private StandarButton btnModificarLibro;
	private StandarButton btnEliminarLibro;
	
	private JDateChooser dateFecha;
	private JYearChooser yearChooserPeriodo;
	private JMonthChooser monthMesPeriodo;
	
	private JTextField txtDenominacion;
	private JTextField txtDefinicion;
	private TextSoloNumeros txtHaber;
	private StandarButton btnUsarLibro;
	private JLabel lblLibro;
	private StandarButton stndrbtnCambiarLibro;
	private StandarButton btnMayoreo;
	
	/**
	 * Create the panel.
	 */
	public VistaLibroDiarioYMayor() {
		
		control = new ControlLibroDiarioYMayor(this);
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Libro Diario y mayorizaci\u00F3n autom\u00E1tica");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 34, 722, 48);
		add(lblNewLabel);
		
		JScrollPane scrollPane_Libro = new JScrollPane();
		scrollPane_Libro.setBounds(10, 151, 702, 129);
		add(scrollPane_Libro);
		
		tableLibro = new TableStandard();
		String[] columnsLibro = new String[] {"Id", "Periodo", "Denominacion o Razon Social"};
		tableLibro.setColums(columnsLibro);
		scrollPane_Libro.setViewportView(tableLibro);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 468, 702, 209);
		add(scrollPane);
		
		table = new TableStandard();
		String[] columns = new String[] {"Id", "Asiento", "Fecha", "Definicion",  "Codigo", "Desglose", "Debe", "Haber"};
		table.setColums(columns);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Asiento");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 376, 89, 19);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(256, 376, 89, 19);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Desglose");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(256, 400, 89, 19);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Codigo");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 400, 89, 19);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Debe");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(10, 429, 77, 19);
		add(lblNewLabel_1_4);
		
		txtAsiento = new JTextField();
		txtAsiento.setBounds(106, 375, 140, 19);
		add(txtAsiento);
		txtAsiento.setColumns(10);
		
		txtDesglose = new JComboBox();
		txtDesglose.setModel(new DefaultComboBoxModel(new String[] {"Alquileres perdidos", "Caja", "Mercaderias", "Pagare a pagar", "Proveedores", "Rodados", "Ventas", "Banco"}));
		txtDesglose.setEditable(false);
		txtDesglose.setEnabled(false);
		txtDesglose.setBounds(328, 400, 140, 19);
		add(txtDesglose);
		
		txtCodigo = new JComboBox();
		txtCodigo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		txtCodigo.addItemListener(control);
		txtCodigo.setBounds(106, 400, 140, 19);
		add(txtCodigo);
		
		txtDebe = new TextSoloNumeros();
		txtDebe.setColumns(10);
		txtDebe.setBounds(107, 429, 140, 19);
		add(txtDebe);
		
		btnAgregar = new StandarButton("Agregar");
		btnAgregar.setText("Guardar");
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgregar.setBounds(575, 420, 130, 28);
		btnAgregar.addActionListener(control);
		add(btnAgregar);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar\r\n");
		btnModificar.setBounds(20, 687, 100, 28);
		btnModificar.addActionListener(control);
		add(btnModificar);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(150, 687, 100, 28);
		btnEliminar.addActionListener(control);
		add(btnEliminar);
		
		btnImprimir = new StandarButton((String) null);
		btnImprimir.setText("Imprimir");
		btnImprimir.setBounds(410, 293, 100, 28);
		btnImprimir.addActionListener(control);
		add(btnImprimir);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Definicion");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1.setBounds(488, 376, 77, 19);
		add(lblNewLabel_1_4_1);
		
		txtDefinicion = new JTextField();
		txtDefinicion.setText("");
		txtDefinicion.setColumns(10);
		txtDefinicion.setBounds(572, 376, 130, 19);
		add(txtDefinicion);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Haber");
		lblNewLabel_1_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_2.setBounds(254, 429, 64, 19);
		add(lblNewLabel_1_4_2);
		
		txtHaber = new TextSoloNumeros();
		txtHaber.setText("");
		txtHaber.setColumns(10);
		txtHaber.setBounds(328, 429, 140, 19);
		add(txtHaber);
		
		JLabel lblNewLabel_1_4_3 = new JLabel("Periodo");
		lblNewLabel_1_4_3.setForeground(Color.WHITE);
		lblNewLabel_1_4_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_3.setBounds(29, 116, 58, 19);
		add(lblNewLabel_1_4_3);
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("Denominaci\u00F3n");
		lblNewLabel_1_4_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_2_1.setBounds(319, 116, 89, 19);
		add(lblNewLabel_1_4_2_1);
		
		txtDenominacion = new JTextField();
		txtDenominacion.setText("");
		txtDenominacion.setColumns(10);
		txtDenominacion.setBounds(425, 113, 140, 24);
		add(txtDenominacion);
		
		btnAgregarLibro = new StandarButton("Agregar");
		btnAgregarLibro.setText("Guardar");
		btnAgregarLibro.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgregarLibro.addActionListener(control);
		btnAgregarLibro.setBounds(575, 111, 130, 28);
		add(btnAgregarLibro);
		
		lblLibro = new JLabel("Seleccione el Libro Diario");
		lblLibro.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibro.setForeground(Color.WHITE);
		lblLibro.setFont(new Font("Dialog", Font.BOLD, 14));
		lblLibro.setBounds(250, 331, 221, 28);
		add(lblLibro);
		
		monthMesPeriodo = new JMonthChooser();
		monthMesPeriodo.getComboBox().setFont(new Font("Dialog", Font.PLAIN, 12));
		monthMesPeriodo.setMonth(0);
		monthMesPeriodo.setBounds(85, 116, 112, 25);
		add(monthMesPeriodo);
		
		yearChooserPeriodo = new JYearChooser();
		yearChooserPeriodo.getSpinner().setFont(new Font("Dialog", Font.PLAIN, 12));
		yearChooserPeriodo.setYear(2022);
		yearChooserPeriodo.setBounds(207, 116, 72, 24);
		add(yearChooserPeriodo);
		
		dateFecha = new JDateChooser();
		dateFecha.setBounds(328, 372, 140, 23);
		add(dateFecha);
		
		btnModificarLibro = new StandarButton((String) null);
		btnModificarLibro.setText("Modificar\r\n");
		btnModificarLibro.setBounds(20, 293, 100, 28);
		btnModificarLibro.addActionListener(control);
		add(btnModificarLibro);
		
		btnEliminarLibro = new StandarButton((String) null);
		btnEliminarLibro.setText("Eliminar");
		btnEliminarLibro.setBounds(150, 293, 100, 28);
		btnEliminarLibro.addActionListener(control);
		add(btnEliminarLibro);
		
		btnUsarLibro = new StandarButton((String) null);
		btnUsarLibro.setText("Usar Libro");
		btnUsarLibro.setBounds(280, 293, 100, 28);
		btnUsarLibro.addActionListener(control);
		add(btnUsarLibro);
		
		stndrbtnCambiarLibro = new StandarButton((String) null);
		stndrbtnCambiarLibro.setText("Cambiar Libro");
		stndrbtnCambiarLibro.setBounds(280, 687, 150, 28);
		stndrbtnCambiarLibro.addActionListener(control);
		add(stndrbtnCambiarLibro);
		
		btnMayoreo = new StandarButton((String) null);
		btnMayoreo.setText("Mayoreo");
		btnMayoreo.setBounds(460, 687, 100, 28);
		btnMayoreo.addActionListener(control);
		add(btnMayoreo);
		
		actualizarVistaLibro();
		actualizarVista();
	}
	
	

	public boolean camposVacios() {
		
		if(txtAsiento.getText().length() <= 0 || 
				dateFecha.getCalendar() == null|| 
				txtDesglose.getSelectedIndex() <= -1 || 
				txtCodigo.getSelectedIndex() <= -1 || 
				txtDebe.getText().length() <= 0 ||
				txtHaber.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	public boolean camposVaciosLibro() {
		
		if(txtDenominacion.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	
	public void actualizarVista() {
		vaciarForm();
		control.LlenarTabla();
	}
	
	public void actualizarVistaLibro() {
		VaciarFormLibro();
		control.LlenarTablaLibro();
	}
	
	public void cargarFormLibro(LibroDiario record) {
		monthMesPeriodo.setMonth(record.getMes());
		yearChooserPeriodo.setYear(record.getAnio());
		txtDenominacion.setText(record.getDenominacion());
		setIdLibro(record.getId());
	}
	
	public void cargarForm(Asientos record) {
		txtAsiento.setText(record.getAsiento());
		dateFecha.setCalendar(record.getFecha());
		txtDefinicion.setText(record.getDefinicion());
		txtCodigo.setSelectedIndex(record.getCodigo()-1);
		txtDesglose.setSelectedItem(record.getDesglose());
		txtDebe.setText(""+record.getDebe());
		txtHaber.setText(""+record.getHaber());
		setId(record.getId());
	}
	
	public void vaciarForm() {
		txtAsiento.setText("");
		dateFecha.setCalendar(null);
		txtDefinicion.setText("");
		txtCodigo.setSelectedIndex(-1);
		txtDesglose.setSelectedIndex(-1);
		txtDebe.setText("");
		txtHaber.setText(""); 
		setId(0L);
	}
	
	public void VaciarFormLibro() {
		txtDenominacion.setText("");
		idLibro =0l;
	}
	
	public DefaultTableModel getModelLibro() {
		return tableLibro.getModel();
	}
	
	public DefaultTableModel getModel() {
		return table.getModel();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public StandarButton getBtnAgregarLibro() {
		return btnAgregarLibro;
	}

	public void setBtnAgregarLibro(StandarButton btnAgregarLibro) {
		this.btnAgregarLibro = btnAgregarLibro;
	}

	public StandarButton getBtnModificarLibro() {
		return btnModificarLibro;
	}

	public void setBtnModificarLibro(StandarButton btnModificarLibro) {
		this.btnModificarLibro = btnModificarLibro;
	}

	public StandarButton getStndrbtnCambiarLibro() {
		return stndrbtnCambiarLibro;
	}

	public void setStndrbtnCambiarLibro(StandarButton stndrbtnCambiarLibro) {
		this.stndrbtnCambiarLibro = stndrbtnCambiarLibro;
	}

	public TableStandard getTable() {
		return table;
	}

	public JTextField getTxtAsiento() {
		return txtAsiento;
	}

	public JComboBox getTxtDesglose() {
		return txtDesglose;
	}

	public JComboBox getTxtCodigo() {
		return txtCodigo;
	}

	public TextSoloNumeros getTxtDebe() {
		return txtDebe;
	}

	public StandarButton getBtnAgregar() {
		return btnAgregar;
	}

	public StandarButton getBtnModificar() {
		return btnModificar;
	}

	public StandarButton getBtnEliminar() {
		return btnEliminar;
	}

	public StandarButton getBtnImprimir() {
		return btnImprimir;
	}

	public JDateChooser getDateFecha() {
		return dateFecha;
	}

	public JTextField getTxtDefinicion() {
		return txtDefinicion;
	}

	public TextSoloNumeros getTxtHaber() {
		return txtHaber;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public void setTxtAsiento(JTextField txtAsiento) {
		this.txtAsiento = txtAsiento;
	}

	public void setTxtDesglose(JComboBox txtDesglose) {
		this.txtDesglose = txtDesglose;
	}

	public void setTxtCodigo(JComboBox txtPreUni) {
		this.txtCodigo = txtPreUni;
	}

	public void setTxtDebe(TextSoloNumeros txtDebe) {
		this.txtDebe = txtDebe;
	}

	public void setBtnAgregar(StandarButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public void setBtnModificar(StandarButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public void setBtnEliminar(StandarButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public void setBtnImprimir(StandarButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public void setDateFecha(JDateChooser dateFecha) {
		this.dateFecha = dateFecha;
	}

	public void setTxtDefinicion(JTextField txtDefinicion) {
		this.txtDefinicion = txtDefinicion;
	}

	public void setTxtHaber(TextSoloNumeros txtHaber) {
		this.txtHaber = txtHaber;
	}
	
	public StandarButton getBtnEliminarLibro() {
		return btnEliminarLibro;
	}

	public void setBtnEliminarLibro(StandarButton btnEliminarLibro) {
		this.btnEliminarLibro = btnEliminarLibro;
	}

	public JYearChooser getYearChooserPeriodo() {
		return yearChooserPeriodo;
	}

	public void setYearChooserPeriodo(JYearChooser yearChooserPeriodo) {
		this.yearChooserPeriodo = yearChooserPeriodo;
	}

	public JMonthChooser getMonthMesPeriodo() {
		return monthMesPeriodo;
	}

	public void setMonthMesPeriodo(JMonthChooser monthMesPeriodo) {
		this.monthMesPeriodo = monthMesPeriodo;
	}

	public JTextField getTxtDenominacion() {
		return txtDenominacion;
	}

	public void setTxtDenominacion(JTextField txtDenominacion) {
		this.txtDenominacion = txtDenominacion;
	}

	/**
	 * @return the idLibro
	 */
	public Long getIdLibro() {
		return idLibro;
	}

	/**
	 * @param idLibro the idLibro to set
	 */
	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}

	public TableStandard getTableLibro() {
		return tableLibro;
	}

	public void setTableLibro(TableStandard tableLibro) {
		this.tableLibro = tableLibro;
	}

	/**
	 * @return the idSelectLibro
	 */
	public Long getIdSelectLibro() {
		return idSelectLibro;
	}

	/**
	 * @param idSelectLibro the idSelectLibro to set
	 */
	public void setIdSelectLibro(Long idSelectLibro) {
		this.idSelectLibro = idSelectLibro;
	}

	public StandarButton getBtnUsarLibro() {
		return btnUsarLibro;
	}

	public void setBtnUsarLibro(StandarButton btnUsarLibro) {
		this.btnUsarLibro = btnUsarLibro;
	}

	public JLabel getLblLibro() {
		return lblLibro;
	}

	public void setLblLibro(JLabel lblLibro) {
		this.lblLibro = lblLibro;
	}

	public StandarButton getBtnMayoreo() {
		return btnMayoreo;
	}

	public void setBtnMayoreo(StandarButton btnMayoreo) {
		this.btnMayoreo = btnMayoreo;
	}
}
