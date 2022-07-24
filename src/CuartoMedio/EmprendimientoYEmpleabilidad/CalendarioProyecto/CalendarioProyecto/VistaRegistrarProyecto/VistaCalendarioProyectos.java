package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto;

import javax.swing.JPanel;
import ui.Labels.LabelTitulos;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;

public class VistaCalendarioProyectos extends JPanel {
	
	private JTextField txtNomPro;
	private JTextField txtDiaPla;

	private JTextField txtDescripcionEtapa;
	private TextSoloNumeros txtDuracion;
	private JComboBox textField_2;
	private JTextField textField_3;
	private TableStandard table;
	private JComboBox comboBoxTareaPendiente;
	private LabelSubtitulos lblNomProy;
	private LabelSubtitulos lblNomProyCalendario;
	private TableStandard tableRegistro;
	private StandarButton btnEliminarCalendario;
	private StandarButton btnModificarCalendario;
	private StandarButton btnEliminarRegistro;
	private StandarButton btnUsarDatos;

	 /**
	 * Create the panel.
	 */
	public VistaCalendarioProyectos() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
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
		
		JDateChooser dateInicio = new JDateChooser();
		dateInicio.setBounds(153, 178, 160, 23);
		panel.add(dateInicio);
		
		JDateChooser dateFin = new JDateChooser();
		dateFin.setBounds(480, 178, 160, 23);
		panel.add(dateFin);
		
		txtNomPro = new JTextField();
		txtNomPro.setBounds(153, 144, 377, 23);
		panel.add(txtNomPro);
		txtNomPro.setColumns(10);
		
		txtDiaPla = new JTextField();
		txtDiaPla.setBounds(638, 145, 100, 23);
		panel.add(txtDiaPla);
		txtDiaPla.setColumns(10);
		
		StandarButton stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(312, 231, 120, 30);
		panel.add(stndrbtnGuardar);
		
		JScrollPane scrollPaneTableRegistro = new JScrollPane();
		scrollPaneTableRegistro.setBounds(10, 282, 728, 153);
		panel.add(scrollPaneTableRegistro);
		
		tableRegistro = new TableStandard();
		String columnsRegistro[] = new String[] {
			"Id",
			"Nombre del Proyecto",
			"Dias Planeados",
			"Fecha de Inicio",
			"Fecha Final"
		};
		tableRegistro.setColums(columnsRegistro);
		
		tableRegistro.getColumnModel().getColumn(0).setPreferredWidth(40);
		tableRegistro.getColumnModel().getColumn(1).setPreferredWidth(250);
		tableRegistro.getColumnModel().getColumn(2).setPreferredWidth(100);
		tableRegistro.getColumnModel().getColumn(3).setPreferredWidth(100);
		tableRegistro.getColumnModel().getColumn(4).setPreferredWidth(100);
		
		scrollPaneTableRegistro.setViewportView(tableRegistro);
		
		LabelTitulos lbltlsCalendarioDeProyectos = new LabelTitulos((String) null);
		lbltlsCalendarioDeProyectos.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCalendarioDeProyectos.setText("Calendario de proyectos");
		lbltlsCalendarioDeProyectos.setBounds(0, 521, 748, 30);
		panel.add(lbltlsCalendarioDeProyectos);
		
		lblNomProyCalendario = new LabelSubtitulos((String) null);
		lblNomProyCalendario.setText("Nombre del Proyecto");
		lblNomProyCalendario.setBounds(10, 597, 141, 23);
		panel.add(lblNomProyCalendario);
		
		JTextField txtNombreEnCalendario = new JTextField();
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
		comboBoxTareaPendiente.setModel(new DefaultComboBoxModel(new String[] {"No Aplica", "Aplica"}));
		comboBoxTareaPendiente.setBounds(597, 631, 141, 23);
		panel.add(comboBoxTareaPendiente);
		
		LabelSubtitulos lblsbtlsTipoDeDependencia = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeDependencia.setText("Tipo de Dependen.");
		lblsbtlsTipoDeDependencia.setBounds(478, 700, 124, 23);
		panel.add(lblsbtlsTipoDeDependencia);
		
		textField_2 = new JComboBox();
		textField_2.setModel(new DefaultComboBoxModel(new String[] {"No Aplica", "CC", "FC"}));
		textField_2.setBounds(597, 701, 141, 23);
		panel.add(textField_2);
		
		LabelSubtitulos lblsbtlsDiasDeDependencia = new LabelSubtitulos((String) null);
		lblsbtlsDiasDeDependencia.setText("Dias de Dependencia");
		lblsbtlsDiasDeDependencia.setBounds(10, 667, 141, 23);
		panel.add(lblsbtlsDiasDeDependencia);
		
		TextSoloNumeros txtDiasDependencia = new TextSoloNumeros();
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
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(327, 667, 141, 23);
		panel.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(597, 665, 141, 23);
		panel.add(dateChooser_1);
		
		LabelSubtitulos lblsbtlsResponsable = new LabelSubtitulos((String) null);
		lblsbtlsResponsable.setText("Responsable");
		lblsbtlsResponsable.setBounds(10, 701, 141, 23);
		panel.add(lblsbtlsResponsable);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(153, 701, 315, 23);
		panel.add(textField_3);
		
		LabelSubtitulos lblsbtlsEstatus = new LabelSubtitulos((String) null);
		lblsbtlsEstatus.setText("Estatus");
		lblsbtlsEstatus.setBounds(10, 735, 100, 23);
		panel.add(lblsbtlsEstatus);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Completado", "En progreso", "Retrazado", "No Comenzado"}));
		comboBox_1.setBounds(153, 735, 185, 23);
		panel.add(comboBox_1);
		
		JScrollPane scrollPaneTableCalendario = new JScrollPane();
		scrollPaneTableCalendario.setBounds(10, 856, 728, 284);
		panel.add(scrollPaneTableCalendario);
		
		table = new TableStandard();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
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
			"Estatus"
		};
		table.setColums(columns);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(120);
		table.getColumnModel().getColumn(4).setPreferredWidth(150);
		table.getColumnModel().getColumn(5).setPreferredWidth(130);
		table.getColumnModel().getColumn(6).setPreferredWidth(120);
		table.getColumnModel().getColumn(7).setPreferredWidth(120);
		table.getColumnModel().getColumn(8).setPreferredWidth(120);
		table.getColumnModel().getColumn(9).setPreferredWidth(150);
		table.getColumnModel().getColumn(10).setPreferredWidth(120);
		scrollPaneTableCalendario.setViewportView(table);
		
		StandarButton stndrbtnGuardar_1 = new StandarButton((String) null);
		stndrbtnGuardar_1.setText("Guardar");
		stndrbtnGuardar_1.setBounds(327, 793, 105, 30);
		panel.add(stndrbtnGuardar_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 498, 748, 12);
		panel.add(separator);
		
		StandarButton btnModificarRegistro = new StandarButton((String) null);
		btnModificarRegistro.setText("Modificar");
		btnModificarRegistro.setBounds(10, 446, 120, 30);
		panel.add(btnModificarRegistro);
		
		btnEliminarRegistro = new StandarButton((String) null);
		btnEliminarRegistro.setText("Eliminar");
		btnEliminarRegistro.setBounds(155, 446, 120, 30);
		panel.add(btnEliminarRegistro);
		
		btnModificarCalendario = new StandarButton((String) null);
		btnModificarCalendario.setText("Modificar");
		btnModificarCalendario.setBounds(10, 1190, 120, 30);
		panel.add(btnModificarCalendario);
		
		btnEliminarCalendario = new StandarButton((String) null);
		btnEliminarCalendario.setText("Eliminar");
		btnEliminarCalendario.setBounds(155, 1190, 120, 30);
		panel.add(btnEliminarCalendario);
		
		btnUsarDatos = new StandarButton((String) null);
		btnUsarDatos.setText("Usar Datos");
		btnUsarDatos.setBounds(299, 446, 120, 30);
		panel.add(btnUsarDatos);
		
		StandarButton btnGuardarCalendario = new StandarButton((String) null);
		btnGuardarCalendario.setText("Guardar");
		btnGuardarCalendario.setBounds(37, 298, 100, 23);
		add(btnGuardarCalendario);

	}
}
