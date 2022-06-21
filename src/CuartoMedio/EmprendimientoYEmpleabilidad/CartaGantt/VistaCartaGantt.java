package CuartoMedio.EmprendimientoYEmpleabilidad.CartaGantt;

import javax.swing.JPanel;
import ui.Labels.LabelTitulos;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import ui.Buttons.StandarButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VistaCartaGantt extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public VistaCartaGantt() {
		
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lbltlsCartaGantt = new LabelTitulos((String) null);
		lbltlsCartaGantt.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCartaGantt.setText("Carta Gantt");
		lbltlsCartaGantt.setBounds(0, 60, 722, 30);
		add(lbltlsCartaGantt);
		
		LabelSubtitulos lblsbtlsProyecto = new LabelSubtitulos((String) null);
		lblsbtlsProyecto.setText("Proyecto");
		lblsbtlsProyecto.setBounds(55, 129, 102, 23);
		add(lblsbtlsProyecto);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(167, 130, 510, 22);
		add(comboBox);
		
		LabelSubtitulos lblsbtlsActividad = new LabelSubtitulos((String) null);
		lblsbtlsActividad.setText("Actividad");
		lblsbtlsActividad.setBounds(55, 183, 102, 23);
		add(lblsbtlsActividad);
		
		textField = new JTextField();
		textField.setBounds(167, 185, 185, 23);
		add(textField);
		textField.setColumns(10);
		
		LabelSubtitulos lblsbtlsResponsable = new LabelSubtitulos((String) null);
		lblsbtlsResponsable.setText("Responsable");
		lblsbtlsResponsable.setBounds(380, 183, 102, 23);
		add(lblsbtlsResponsable);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(492, 185, 185, 23);
		add(textField_1);
		
		LabelSubtitulos lblsbtlsFechaInicio = new LabelSubtitulos((String) null);
		lblsbtlsFechaInicio.setText("Fecha Inicio");
		lblsbtlsFechaInicio.setBounds(55, 234, 102, 23);
		add(lblsbtlsFechaInicio);
		
		LabelSubtitulos lblsbtlsFechaTermino = new LabelSubtitulos((String) null);
		lblsbtlsFechaTermino.setText("Fecha Termino");
		lblsbtlsFechaTermino.setBounds(380, 234, 102, 23);
		add(lblsbtlsFechaTermino);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(167, 237, 185, 23);
		add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(492, 237, 185, 23);
		add(dateChooser_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 332, 621, 338);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Actividad", "Responsable", "Duracion", "Fecha Inicio", "Fecha Term"
			}
		));
		scrollPane.setViewportView(table);
		
		StandarButton stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(55, 279, 100, 23);
		add(stndrbtnGuardar);
		
		StandarButton stndrbtnModificar = new StandarButton((String) null);
		stndrbtnModificar.setText("Modificar");
		stndrbtnModificar.setBounds(55, 681, 111, 30);
		add(stndrbtnModificar);
		
		StandarButton stndrbtnEliminar = new StandarButton((String) null);
		stndrbtnEliminar.setText("Eliminar");
		stndrbtnEliminar.setBounds(176, 681, 111, 30);
		add(stndrbtnEliminar);

	}
}
