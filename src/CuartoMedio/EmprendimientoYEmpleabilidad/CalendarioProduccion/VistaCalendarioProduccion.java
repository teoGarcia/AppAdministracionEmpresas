package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProduccion;

import javax.swing.JPanel;
import ui.Labels.LabelTitulos;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

public class VistaCalendarioProduccion extends JPanel {
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public VistaCalendarioProduccion() {
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lbltlsCalendarioDeProduccion = new LabelTitulos((String) null);
		lbltlsCalendarioDeProduccion.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCalendarioDeProduccion.setText("Calendario de Produccion");
		lbltlsCalendarioDeProduccion.setBounds(0, 60, 722, 30);
		add(lbltlsCalendarioDeProduccion);
		
		LabelSubtitulos lblsbtlsEtapa = new LabelSubtitulos((String) null);
		lblsbtlsEtapa.setText("Etapa");
		lblsbtlsEtapa.setBounds(44, 157, 99, 23);
		add(lblsbtlsEtapa);
		
		textField = new JTextField();
		textField.setBounds(153, 158, 530, 23);
		add(textField);
		textField.setColumns(10);
		
		LabelSubtitulos lblsbtlsFechaInicio_1 = new LabelSubtitulos((String) null);
		lblsbtlsFechaInicio_1.setText("Fecha Inicio");
		lblsbtlsFechaInicio_1.setBounds(44, 202, 99, 23);
		add(lblsbtlsFechaInicio_1);
		
		LabelSubtitulos lblsbtlsFechaInicio = new LabelSubtitulos((String) null);
		lblsbtlsFechaInicio.setText("FechaTermino");
		lblsbtlsFechaInicio.setBounds(402, 202, 99, 23);
		add(lblsbtlsFechaInicio);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(153, 202, 150, 23);
		add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(533, 202, 150, 23);
		add(dateChooser_1);
		
		StandarButton stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(44, 246, 100, 23);
		add(stndrbtnGuardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 286, 638, 355);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Etapa", "Fecha Inicio", "Fecha Termino"
			}
		));
		scrollPane.setViewportView(table);
		
		StandarButton stndrbtnModificar = new StandarButton((String) null);
		stndrbtnModificar.setText("Modificar");
		stndrbtnModificar.setBounds(44, 652, 120, 30);
		add(stndrbtnModificar);
		
		StandarButton stndrbtnEliminar = new StandarButton((String) null);
		stndrbtnEliminar.setText("Eliminar");
		stndrbtnEliminar.setBounds(187, 652, 120, 30);
		add(stndrbtnEliminar);
		
		LabelSubtitulos lblsbtlsProyecto = new LabelSubtitulos((String) null);
		lblsbtlsProyecto.setText("Proyecto");
		lblsbtlsProyecto.setBounds(44, 113, 99, 23);
		add(lblsbtlsProyecto);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(153, 114, 530, 23);
		add(comboBox);

	}
}
