package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto;

import javax.swing.JPanel;
import ui.Labels.LabelTitulos;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import javax.swing.JComboBox;
import ui.Buttons.StandarButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import ui.Texts.TextSoloNumeros;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VistaCalendarioProyectos extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public VistaCalendarioProyectos() {
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lbltlsCalendarioDeProyectos = new LabelTitulos((String) null);
		lbltlsCalendarioDeProyectos.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCalendarioDeProyectos.setText("Calendario de proyectos");
		lbltlsCalendarioDeProyectos.setBounds(0, 60, 722, 30);
		add(lbltlsCalendarioDeProyectos);
		
		LabelSubtitulos lblsbtlsNombreDelProyecto = new LabelSubtitulos((String) null);
		lblsbtlsNombreDelProyecto.setText("Nombre del Proyecto");
		lblsbtlsNombreDelProyecto.setBounds(37, 128, 141, 23);
		add(lblsbtlsNombreDelProyecto);
		
		JComboBox comboBoxBuscar = new JComboBox();
		comboBoxBuscar.setBounds(180, 129, 365, 23);
		add(comboBoxBuscar);
		
		StandarButton stndrbtnBuscar = new StandarButton((String) null);
		stndrbtnBuscar.setText("Buscar");
		stndrbtnBuscar.setBounds(598, 128, 100, 23);
		add(stndrbtnBuscar);
		
		LabelSubtitulos lblsbtlsDescripcionDeEtapa = new LabelSubtitulos((String) null);
		lblsbtlsDescripcionDeEtapa.setText("Descripcion de Etapa");
		lblsbtlsDescripcionDeEtapa.setBounds(37, 162, 141, 23);
		add(lblsbtlsDescripcionDeEtapa);
		
		textField = new JTextField();
		textField.setBounds(180, 164, 185, 23);
		add(textField);
		textField.setColumns(10);
		
		LabelSubtitulos lblsbtlsDuracion = new LabelSubtitulos((String) null);
		lblsbtlsDuracion.setText("Duracion");
		lblsbtlsDuracion.setBounds(378, 162, 78, 23);
		add(lblsbtlsDuracion);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(513, 163, 70, 23);
		add(textField_1);
		
		LabelSubtitulos lblsbtlsDias = new LabelSubtitulos((String) null);
		lblsbtlsDias.setText("dias");
		lblsbtlsDias.setBounds(598, 162, 65, 23);
		add(lblsbtlsDias);
		
		LabelSubtitulos lblsbtlsTareaPendiente = new LabelSubtitulos((String) null);
		lblsbtlsTareaPendiente.setText("Tarea Pendiente");
		lblsbtlsTareaPendiente.setBounds(37, 196, 141, 23);
		add(lblsbtlsTareaPendiente);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"No Aplica", "Aplica"}));
		comboBox.setBounds(180, 197, 185, 23);
		add(comboBox);
		
		LabelSubtitulos lblsbtlsTipoDeDependencia = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeDependencia.setText("Tipo de Dependencia");
		lblsbtlsTipoDeDependencia.setBounds(378, 197, 141, 23);
		add(lblsbtlsTipoDeDependencia);
		
		textField_2 = new JComboBox();
		textField_2.setModel(new DefaultComboBoxModel(new String[] {"No Aplica", "CC", "FC"}));
		textField_2.setBounds(513, 197, 185, 23);
		add(textField_2);
		
		LabelSubtitulos lblsbtlsDiasDeDependencia = new LabelSubtitulos((String) null);
		lblsbtlsDiasDeDependencia.setText("Dias de Dependencia");
		lblsbtlsDiasDeDependencia.setBounds(37, 230, 141, 23);
		add(lblsbtlsDiasDeDependencia);
		
		TextSoloNumeros textSoloNumeros = new TextSoloNumeros();
		textSoloNumeros.setBounds(180, 230, 70, 23);
		add(textSoloNumeros);
		
		LabelSubtitulos lblsbtlsComienzo = new LabelSubtitulos((String) null);
		lblsbtlsComienzo.setText("Comienzo");
		lblsbtlsComienzo.setBounds(260, 230, 93, 23);
		add(lblsbtlsComienzo);
		
		LabelSubtitulos lblsbtlsFin = new LabelSubtitulos((String) null);
		lblsbtlsFin.setText("Fin");
		lblsbtlsFin.setBounds(505, 230, 78, 23);
		add(lblsbtlsFin);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(340, 230, 141, 23);
		add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(557, 230, 141, 23);
		add(dateChooser_1);
		
		LabelSubtitulos lblsbtlsResponsable = new LabelSubtitulos((String) null);
		lblsbtlsResponsable.setText("Responsable");
		lblsbtlsResponsable.setBounds(37, 264, 141, 23);
		add(lblsbtlsResponsable);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(180, 264, 185, 23);
		add(textField_3);
		
		LabelSubtitulos lblsbtlsEstatus = new LabelSubtitulos((String) null);
		lblsbtlsEstatus.setText("Estatus");
		lblsbtlsEstatus.setBounds(378, 264, 100, 23);
		add(lblsbtlsEstatus);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Completado", "En progreso", "Retrazado", "No Comenzado"}));
		comboBox_1.setBounds(513, 265, 185, 23);
		add(comboBox_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 332, 661, 284);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00B0", "Durac. Etapa", "Tarea Pend.", "T. de Dep.", "Dias Dep.", "Comienzo", "Fin", "Responsable"
			}
		));
		scrollPane.setViewportView(table);
		
		StandarButton stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(37, 298, 100, 23);
		add(stndrbtnGuardar);

	}
}
