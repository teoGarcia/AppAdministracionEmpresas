package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto;

import javax.swing.JPanel;
import ui.Labels.LabelTitulos;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import javax.swing.JComboBox;
import ui.Buttons.StandarButton;
import javax.swing.JTextField;

public class VistaCalendarioProyectos extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		lblsbtlsDescripcionDeEtapa.setBounds(37, 180, 141, 23);
		add(lblsbtlsDescripcionDeEtapa);
		
		textField = new JTextField();
		textField.setBounds(180, 182, 185, 23);
		add(textField);
		textField.setColumns(10);
		
		LabelSubtitulos lblsbtlsDuracion = new LabelSubtitulos((String) null);
		lblsbtlsDuracion.setText("Duracion");
		lblsbtlsDuracion.setBounds(375, 180, 141, 23);
		add(lblsbtlsDuracion);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(503, 181, 100, 23);
		add(textField_1);
		
		LabelSubtitulos lblsbtlsDias = new LabelSubtitulos((String) null);
		lblsbtlsDias.setText("dias");
		lblsbtlsDias.setBounds(613, 180, 65, 23);
		add(lblsbtlsDias);
		
		LabelSubtitulos lblsbtlsTareaPendiente = new LabelSubtitulos((String) null);
		lblsbtlsTareaPendiente.setText("Tarea Pendiente");
		lblsbtlsTareaPendiente.setBounds(37, 227, 141, 23);
		add(lblsbtlsTareaPendiente);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(180, 228, 185, 23);
		add(comboBox);
		
		LabelSubtitulos lblsbtlsTipoDeDependencia = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeDependencia.setText("Tipo de Dependencia");
		lblsbtlsTipoDeDependencia.setBounds(375, 227, 141, 23);
		add(lblsbtlsTipoDeDependencia);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(503, 229, 195, 23);
		add(textField_2);

	}
}
