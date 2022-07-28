package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto;

import javax.swing.JPanel;
import ui.Labels.LabelTitulos;
import ui.Mensejes.Mensajes;
import ui.TablaUi.TableStandard;

import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import javax.swing.JComboBox;
import ui.Buttons.StandarButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import ui.Texts.TextSoloNumeros;
import com.toedter.calendar.JDateChooser;

import CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja.Caja;
import CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja.Flujo;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;

public class VistaCalendarioProyectos extends JPanel {

	private Long idProyecto = 0L;
	private Long idSeledProyecto = 0L;
	private Long idCalendario = 0L;

	private ControlCalendarioDeProyecto control;

	private TableStandard tableCalendario;
	private TableStandard tableProyecto;

	private JTextField txtNomPro;
	private JTextField txtDiaPla;
	private JTextField txtDescripcionEtapa;
	private JTextField txtResponsable;
	private JTextField txtNombreEnCalendario;

	private TextSoloNumeros txtDuracion;
	private TextSoloNumeros txtDiasDependencia;

	private JComboBox comboDependencia;
	private JComboBox comboBoxTareaPendiente;
	private JComboBox comboStatus;

	private LabelSubtitulos lblNomProy;
	private LabelSubtitulos lblNomProyCalendario;

	private StandarButton btnEliminarCalendario;
	private StandarButton btnModificarCalendario;
	private StandarButton btnEliminarProyecto;
	private StandarButton btnUsarProyecto;
	private StandarButton btnGuardarProyecto;
	private StandarButton btnModificarProyecto;
	private StandarButton btnGuardarCaledario;

	private JDateChooser dateInicio;
	private JDateChooser dateFinal;
	private JDateChooser dateComienzo;
	private JDateChooser dateFin;

	/**
	 * Create the panel.
	 */
	public VistaCalendarioProyectos() {

		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);

		control = new ControlCalendarioDeProyecto(this);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1300));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);

		LabelTitulos lbltlsRegistrarProyecto = new LabelTitulos((String) null);
		lbltlsRegistrarProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsRegistrarProyecto.setText("Registrar Proyecto");
		lbltlsRegistrarProyecto.setBounds(0, 60, 748, 30);
		panel.add(lbltlsRegistrarProyecto);

		LabelSubtitulos lblsbtlsNombreDelProyecto;
		lblNomProy = new LabelSubtitulos((String) null);
		lblNomProy.setText("Nombre del Proyecto");
		lblNomProy.setBounds(10, 144, 165, 23);
		panel.add(lblNomProy);

		LabelSubtitulos lblsbtlsFechaInicio = new LabelSubtitulos((String) null);
		lblsbtlsFechaInicio.setText("Fecha Inicio");
		lblsbtlsFechaInicio.setBounds(10, 178, 165, 23);
		panel.add(lblsbtlsFechaInicio);

		LabelSubtitulos lblsbtlsFechaFinal = new LabelSubtitulos((String) null);
		lblsbtlsFechaFinal.setText("Fecha Final");
		lblsbtlsFechaFinal.setBounds(362, 178, 165, 23);
		panel.add(lblsbtlsFechaFinal);

		LabelSubtitulos lblsbtlsNombreDelProyecto_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsNombreDelProyecto_1_1.setText("Dias Planeados");
		lblsbtlsNombreDelProyecto_1_1.setBounds(540, 144, 100, 23);
		panel.add(lblsbtlsNombreDelProyecto_1_1);

		dateInicio = new JDateChooser();
		dateInicio.setBounds(153, 178, 160, 23);
		panel.add(dateInicio);

		dateFinal = new JDateChooser();
		dateFinal.setBounds(480, 178, 160, 23);
		panel.add(dateFinal);

		txtNomPro = new JTextField();
		txtNomPro.setBounds(153, 144, 377, 23);
		panel.add(txtNomPro);
		txtNomPro.setColumns(10);

		txtDiaPla = new JTextField();
		txtDiaPla.setBounds(638, 145, 100, 23);
		panel.add(txtDiaPla);
		txtDiaPla.setColumns(10);

		btnGuardarProyecto = new StandarButton((String) null);
		btnGuardarProyecto.setText("Guardar");
		btnGuardarProyecto.setBounds(312, 231, 120, 30);
		btnGuardarProyecto.addActionListener(control);
		panel.add(btnGuardarProyecto);

		JScrollPane scrollPaneTableRegistro = new JScrollPane();
		scrollPaneTableRegistro.setBounds(10, 282, 728, 153);
		panel.add(scrollPaneTableRegistro);

		tableProyecto = new TableStandard();
		String columnsRegistro[] = new String[] { 
				"Id", 
				"Nombre del Proyecto", 
				"Dias Planeados", 
				"Fecha de Inicio",
				"Fecha Final" };
		tableProyecto.setColums(columnsRegistro);
		scrollPaneTableRegistro.setViewportView(tableProyecto);

		LabelTitulos lbltlsCalendarioDeProyectos = new LabelTitulos((String) null);
		lbltlsCalendarioDeProyectos.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCalendarioDeProyectos.setText("Calendario de proyectos");
		lbltlsCalendarioDeProyectos.setBounds(0, 521, 748, 30);
		panel.add(lbltlsCalendarioDeProyectos);

		lblNomProyCalendario = new LabelSubtitulos((String) null);
		lblNomProyCalendario.setText("Nombre del Proyecto");
		lblNomProyCalendario.setBounds(10, 597, 141, 23);
		panel.add(lblNomProyCalendario);

		txtNombreEnCalendario = new JTextField();
		txtNombreEnCalendario.setEditable(false);
		txtNombreEnCalendario.setBounds(153, 598, 315, 23);
		panel.add(txtNombreEnCalendario);

		LabelSubtitulos lblsbtlsDescripcionDeEtapa = new LabelSubtitulos((String) null);
		lblsbtlsDescripcionDeEtapa.setText("Descripcion de Etapa");
		lblsbtlsDescripcionDeEtapa.setBounds(10, 631, 141, 23);
		panel.add(lblsbtlsDescripcionDeEtapa);

		txtDescripcionEtapa = new JTextField();
		txtDescripcionEtapa.setBounds(153, 633, 315, 23);
		panel.add(txtDescripcionEtapa);
		txtDescripcionEtapa.setColumns(10);

		LabelSubtitulos lblsbtlsDuracion = new LabelSubtitulos((String) null);
		lblsbtlsDuracion.setText("Duracion");
		lblsbtlsDuracion.setBounds(478, 597, 68, 23);
		panel.add(lblsbtlsDuracion);

		txtDuracion = new TextSoloNumeros();
		txtDuracion.setColumns(10);
		txtDuracion.setBounds(597, 597, 86, 23);
		panel.add(txtDuracion);

		LabelSubtitulos lblsbtlsDias = new LabelSubtitulos((String) null);
		lblsbtlsDias.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsbtlsDias.setText("dias");
		lblsbtlsDias.setBounds(701, 597, 37, 23);
		panel.add(lblsbtlsDias);

		LabelSubtitulos lblsbtlsTareaPendiente = new LabelSubtitulos((String) null);
		lblsbtlsTareaPendiente.setText("Tarea Pendiente");
		lblsbtlsTareaPendiente.setBounds(478, 632, 100, 23);
		panel.add(lblsbtlsTareaPendiente);

		comboBoxTareaPendiente = new JComboBox();
		comboBoxTareaPendiente.setModel(new DefaultComboBoxModel(new String[] { "No Aplica", "Aplica" }));
		comboBoxTareaPendiente.setBounds(597, 631, 141, 23);
		panel.add(comboBoxTareaPendiente);

		LabelSubtitulos lblsbtlsTipoDeDependencia = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeDependencia.setText("Tipo de Dependen.");
		lblsbtlsTipoDeDependencia.setBounds(478, 700, 124, 23);
		panel.add(lblsbtlsTipoDeDependencia);

		comboDependencia = new JComboBox();
		comboDependencia.setModel(new DefaultComboBoxModel(new String[] { "No Aplica", "CC", "FC" }));
		comboDependencia.setBounds(597, 701, 141, 23);
		panel.add(comboDependencia);

		LabelSubtitulos lblsbtlsDiasDeDependencia = new LabelSubtitulos((String) null);
		lblsbtlsDiasDeDependencia.setText("Dias de Dependencia");
		lblsbtlsDiasDeDependencia.setBounds(10, 667, 141, 23);
		panel.add(lblsbtlsDiasDeDependencia);

		txtDiasDependencia = new TextSoloNumeros();
		txtDiasDependencia.setBounds(153, 667, 70, 23);
		panel.add(txtDiasDependencia);

		LabelSubtitulos lblsbtlsComienzo = new LabelSubtitulos((String) null);
		lblsbtlsComienzo.setText("Comienzo");
		lblsbtlsComienzo.setBounds(233, 667, 93, 23);
		panel.add(lblsbtlsComienzo);

		LabelSubtitulos lblsbtlsFin = new LabelSubtitulos((String) null);
		lblsbtlsFin.setText("Fin");
		lblsbtlsFin.setBounds(478, 666, 78, 23);
		panel.add(lblsbtlsFin);

		dateComienzo = new JDateChooser();
		dateComienzo.setBounds(327, 667, 141, 23);
		panel.add(dateComienzo);

		dateFin = new JDateChooser();
		dateFin.setBounds(597, 665, 141, 23);
		panel.add(dateFin);

		LabelSubtitulos lblsbtlsResponsable = new LabelSubtitulos((String) null);
		lblsbtlsResponsable.setText("Responsable");
		lblsbtlsResponsable.setBounds(10, 701, 141, 23);
		panel.add(lblsbtlsResponsable);

		txtResponsable = new JTextField();
		txtResponsable.setColumns(10);
		txtResponsable.setBounds(153, 701, 315, 23);
		panel.add(txtResponsable);

		LabelSubtitulos lblsbtlsEstatus = new LabelSubtitulos((String) null);
		lblsbtlsEstatus.setText("Estatus");
		lblsbtlsEstatus.setBounds(10, 735, 100, 23);
		panel.add(lblsbtlsEstatus);

		comboStatus = new JComboBox();
		comboStatus.setModel(
				new DefaultComboBoxModel(new String[] { "Completado", "En progreso", "Retrazado", "No Comenzado" }));
		comboStatus.setBounds(153, 735, 185, 23);
		panel.add(comboStatus);

		JScrollPane scrollPaneTableCalendario = new JScrollPane();
		scrollPaneTableCalendario.setBounds(10, 856, 728, 284);
		panel.add(scrollPaneTableCalendario);

		tableCalendario = new TableStandard();
		tableCalendario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String columns[] = new String[] { 
				"Id", 
				"Nombre del Proyecto", 
				"Descripcion de la Etapa", 
				"Duracion en dias",
				"Tarea Pendiente", 
				"Dias de Dependencia", 
				"Fecha Comienzo", 
				"Fecha Fin", 
				"Responsable",
				"Tipo de Dependencia", 
				"Estatus" };
		tableCalendario.setColums(columns);
		scrollPaneTableCalendario.setViewportView(tableCalendario);

		btnGuardarCaledario = new StandarButton((String) null);
		btnGuardarCaledario.setText("Guardar");
		btnGuardarCaledario.addActionListener(control);
		btnGuardarCaledario.setBounds(327, 793, 105, 30);
		panel.add(btnGuardarCaledario);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 498, 748, 12);
		panel.add(separator);

		btnModificarProyecto = new StandarButton((String) null);
		btnModificarProyecto.setText("Modificar");
		btnModificarProyecto.addActionListener(control);
		btnModificarProyecto.setBounds(10, 446, 120, 30);
		panel.add(btnModificarProyecto);

		btnEliminarProyecto = new StandarButton((String) null);
		btnEliminarProyecto.setText("Eliminar");
		btnEliminarProyecto.addActionListener(control);
		btnEliminarProyecto.setBounds(155, 446, 120, 30);
		panel.add(btnEliminarProyecto);

		btnModificarCalendario = new StandarButton((String) null);
		btnModificarCalendario.setText("Modificar");
		btnModificarCalendario.addActionListener(control);
		btnModificarCalendario.setBounds(10, 1190, 120, 30);
		panel.add(btnModificarCalendario);

		btnEliminarCalendario = new StandarButton((String) null);
		btnEliminarCalendario.setText("Eliminar");
		btnEliminarCalendario.addActionListener(control);
		btnEliminarCalendario.setBounds(155, 1190, 120, 30);
		panel.add(btnEliminarCalendario);

		btnUsarProyecto = new StandarButton((String) null);
		btnUsarProyecto.setText("Usar Datos");
		btnUsarProyecto.addActionListener(control);
		btnUsarProyecto.setBounds(299, 446, 120, 30);
		panel.add(btnUsarProyecto);

		actualizarVista();

	}

	public void actualizarVista() {
		actualizarVistaProyecto();
		actualizarVistaCalendario();
	}

	public void actualizarVistaProyecto() {
		vaciarFormProyecto();
		control.LlenarTablaProyecto();
	}

	public void actualizarVistaCalendario() {
		vaciarFormCalendario();
		control.LlenarTablaCalendario();
	}

	public void vaciarFormProyecto() {
		idProyecto = 0L;
		txtNomPro.setText("");
		txtDiaPla.setText("");
		dateInicio.setCalendar(null);
		dateFinal.setCalendar(null);
	}

	public void vaciarFormCalendario() {
		idCalendario = 0L;
		txtDuracion.setText("");
		txtDescripcionEtapa.setText("");
		comboBoxTareaPendiente.setSelectedIndex(-1);
		txtDiasDependencia.setText("");
		dateComienzo.setCalendar(null);
		dateFin.setCalendar(null);
		txtResponsable.setText("");
		comboDependencia.setSelectedIndex(-1);
		comboStatus.setSelectedIndex(-1);
	}

	public void cargarFormProyecto(Proyecto record) {
		idProyecto = record.getId();
		txtNomPro.setText(record.getNombre());
		txtDiaPla.setText(record.getDias());
		dateInicio.setCalendar(record.getInicio());
		dateFinal.setCalendar(record.getFin());
	}

	public void cargarFormCalendario(Calendario record) {
		idCalendario = record.getId();
		txtDuracion.setText(""+record.getDuracion());
		txtDescripcionEtapa.setText(record.getEtapa());
		comboBoxTareaPendiente.setSelectedItem(record.getTareaPendiente());
		txtDiasDependencia.setText(""+record.getDiasDependencia());
		dateComienzo.setCalendar(record.getComenzo());
		dateFin.setCalendar(record.getFin());
		txtResponsable.setText(record.getResponsable());
		comboDependencia.setSelectedItem(record.getDependencia());
		comboStatus.setSelectedItem(record.getEstado());
	}

	public boolean camposVaciosProyecto() {

		if (txtNomPro.getText().length() <= 0 || txtDiaPla.getText().length() <= 0
				|| dateInicio.getCalendar().getTime() == null || dateInicio.getCalendar().getTime() == null) {
			return false;
		}

		return true;
	}

	public boolean camposVaciosCalendario() {
		
		if (txtNombreEnCalendario.getText().length()  <= 0) {
			Mensajes.Information("Debe Seleccionar un proyecto");
		}

		if (txtDuracion.getText().length() <= 0 ||
				txtDescripcionEtapa.getText().length() <= 0 || 
				comboBoxTareaPendiente.getSelectedIndex() <= -1 || 
				txtDiasDependencia.getText().length() <= 0 || 
				dateComienzo.getCalendar().getTime() == null ||
				dateFin.getCalendar().getTime() == null ||
				txtResponsable.getText().length() <= 0 ||
				comboDependencia.getSelectedIndex() <= -1 || 
				comboStatus.getSelectedIndex() <= -1 
				) {
			return false;
		}

		return true;
	}
	
	public DefaultTableModel getModelProyecto() {
		return tableProyecto.getModel();
	}

	public DefaultTableModel getModelCalendario() {
		return tableCalendario.getModel();
	}

	public Long getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(Long idProyecto) {
		this.idProyecto = idProyecto;
	}

	public Long getIdSeledProyecto() {
		return idSeledProyecto;
	}

	public void setIdSeledProyecto(Long idSeledProyecto) {
		this.idSeledProyecto = idSeledProyecto;
	}

	public Long getIdCalendario() {
		return idCalendario;
	}

	public void setIdCalendario(Long idCalendario) {
		this.idCalendario = idCalendario;
	}

	public ControlCalendarioDeProyecto getControl() {
		return control;
	}

	public void setControl(ControlCalendarioDeProyecto control) {
		this.control = control;
	}

	public TableStandard getTableCalendario() {
		return tableCalendario;
	}

	public void setTableCalendario(TableStandard tableCalendario) {
		this.tableCalendario = tableCalendario;
	}

	public TableStandard getTableProyecto() {
		return tableProyecto;
	}

	public void setTableProyecto(TableStandard tableProyecto) {
		this.tableProyecto = tableProyecto;
	}

	public JTextField getTxtNomPro() {
		return txtNomPro;
	}

	public void setTxtNomPro(JTextField txtNomPro) {
		this.txtNomPro = txtNomPro;
	}

	public JTextField getTxtDiaPla() {
		return txtDiaPla;
	}

	public void setTxtDiaPla(JTextField txtDiaPla) {
		this.txtDiaPla = txtDiaPla;
	}

	public JTextField getTxtDescripcionEtapa() {
		return txtDescripcionEtapa;
	}

	public void setTxtDescripcionEtapa(JTextField txtDescripcionEtapa) {
		this.txtDescripcionEtapa = txtDescripcionEtapa;
	}

	public JTextField getTxtResponsable() {
		return txtResponsable;
	}

	public void setTxtResponsable(JTextField txtResponsable) {
		this.txtResponsable = txtResponsable;
	}

	public JTextField getTxtNombreEnCalendario() {
		return txtNombreEnCalendario;
	}

	public void setTxtNombreEnCalendario(JTextField txtNombreEnCalendario) {
		this.txtNombreEnCalendario = txtNombreEnCalendario;
	}

	public TextSoloNumeros getTxtDuracion() {
		return txtDuracion;
	}

	public void setTxtDuracion(TextSoloNumeros txtDuracion) {
		this.txtDuracion = txtDuracion;
	}

	public TextSoloNumeros getTxtDiasDependencia() {
		return txtDiasDependencia;
	}

	public void setTxtDiasDependencia(TextSoloNumeros txtDiasDependencia) {
		this.txtDiasDependencia = txtDiasDependencia;
	}

	public JComboBox getComboDependencia() {
		return comboDependencia;
	}

	public void setComboDependencia(JComboBox comboDependencia) {
		this.comboDependencia = comboDependencia;
	}

	public JComboBox getComboBoxTareaPendiente() {
		return comboBoxTareaPendiente;
	}

	public void setComboBoxTareaPendiente(JComboBox comboBoxTareaPendiente) {
		this.comboBoxTareaPendiente = comboBoxTareaPendiente;
	}

	public JComboBox getComboStatus() {
		return comboStatus;
	}

	public void setComboStatus(JComboBox comboStatus) {
		this.comboStatus = comboStatus;
	}

	public LabelSubtitulos getLblNomProy() {
		return lblNomProy;
	}

	public void setLblNomProy(LabelSubtitulos lblNomProy) {
		this.lblNomProy = lblNomProy;
	}

	public LabelSubtitulos getLblNomProyCalendario() {
		return lblNomProyCalendario;
	}

	public void setLblNomProyCalendario(LabelSubtitulos lblNomProyCalendario) {
		this.lblNomProyCalendario = lblNomProyCalendario;
	}

	public StandarButton getBtnEliminarCalendario() {
		return btnEliminarCalendario;
	}

	public void setBtnEliminarCalendario(StandarButton btnEliminarCalendario) {
		this.btnEliminarCalendario = btnEliminarCalendario;
	}

	public StandarButton getBtnModificarCalendario() {
		return btnModificarCalendario;
	}

	public void setBtnModificarCalendario(StandarButton btnModificarCalendario) {
		this.btnModificarCalendario = btnModificarCalendario;
	}

	public StandarButton getBtnEliminarProyecto() {
		return btnEliminarProyecto;
	}

	public void setBtnEliminarProyecto(StandarButton btnEliminarProyecto) {
		this.btnEliminarProyecto = btnEliminarProyecto;
	}

	public StandarButton getBtnUsarProyecto() {
		return btnUsarProyecto;
	}

	public void setBtnUsarProyecto(StandarButton btnUsarProyecto) {
		this.btnUsarProyecto = btnUsarProyecto;
	}

	public StandarButton getBtnGuardarProyecto() {
		return btnGuardarProyecto;
	}

	public void setBtnGuardarProyecto(StandarButton btnGuardarProyecto) {
		this.btnGuardarProyecto = btnGuardarProyecto;
	}

	public StandarButton getBtnModificarProyecto() {
		return btnModificarProyecto;
	}

	public void setBtnModificarProyecto(StandarButton btnModificarProyecto) {
		this.btnModificarProyecto = btnModificarProyecto;
	}

	public StandarButton getBtnGuardarCaledario() {
		return btnGuardarCaledario;
	}

	public void setBtnGuardarCaledario(StandarButton btnGuardarCaledario) {
		this.btnGuardarCaledario = btnGuardarCaledario;
	}

	public JDateChooser getDateInicio() {
		return dateInicio;
	}

	public void setDateInicio(JDateChooser dateInicio) {
		this.dateInicio = dateInicio;
	}

	public JDateChooser getDateFinal() {
		return dateFinal;
	}

	public void setDateFinal(JDateChooser dateFinal) {
		this.dateFinal = dateFinal;
	}

	public JDateChooser getDateComienzo() {
		return dateComienzo;
	}

	public void setDateComienzo(JDateChooser dateComienzo) {
		this.dateComienzo = dateComienzo;
	}

	public JDateChooser getDateFin() {
		return dateFin;
	}

	public void setDateFin(JDateChooser dateFin) {
		this.dateFin = dateFin;
	}

}
