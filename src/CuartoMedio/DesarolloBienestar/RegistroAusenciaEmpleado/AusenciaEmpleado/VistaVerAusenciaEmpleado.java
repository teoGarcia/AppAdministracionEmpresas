package CuartoMedio.DesarolloBienestar.RegistroAusenciaEmpleado.AusenciaEmpleado;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import ui.Texts.TextSoloNumeros;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class VistaVerAusenciaEmpleado extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public VistaVerAusenciaEmpleado() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ausencias de Empleados");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 60, 785, 30);
		add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsNombre = new LabelSubtitulos((String) null);
		lblsbtlsNombre.setText("Nombre");
		lblsbtlsNombre.setBounds(77, 154, 103, 23);
		add(lblsbtlsNombre);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(174, 154, 530, 23);
		add(comboBox);
		
		LabelSubtitulos lblsbtlsDesde = new LabelSubtitulos((String) null);
		lblsbtlsDesde.setText("Desde");
		lblsbtlsDesde.setBounds(77, 208, 103, 23);
		add(lblsbtlsDesde);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(174, 208, 156, 23);
		add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(423, 208, 156, 23);
		add(dateChooser_1);
		
		LabelSubtitulos lblsbtlsNombre_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsNombre_1_1.setText("Hasta");
		lblsbtlsNombre_1_1.setBounds(351, 208, 78, 23);
		add(lblsbtlsNombre_1_1);
		
		StandarButton stndrbtnBuscar = new StandarButton((String) null);
		stndrbtnBuscar.setText("Buscar");
		stndrbtnBuscar.setBounds(601, 208, 103, 23);
		add(stndrbtnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(77, 268, 627, 291);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Motivo", "Fecha", "Total de Dias"
			}
		));
		scrollPane.setViewportView(table);
		
		LabelSubtitulos lblsbtlsTotalDeDias = new LabelSubtitulos((String) null);
		lblsbtlsTotalDeDias.setText("Total de Dias");
		lblsbtlsTotalDeDias.setBounds(487, 570, 103, 23);
		add(lblsbtlsTotalDeDias);
		
		TextSoloNumeros textSoloNumeros = new TextSoloNumeros();
		textSoloNumeros.setBounds(574, 570, 130, 23);
		add(textSoloNumeros);
		
		StandarButton stndrbtnEliminar = new StandarButton((String) null);
		stndrbtnEliminar.setText("Eliminar");
		stndrbtnEliminar.setBounds(77, 570, 96, 23);
		add(stndrbtnEliminar);
		
		StandarButton stndrbtnModificar = new StandarButton((String) null);
		stndrbtnModificar.setText("Modificar");
		stndrbtnModificar.setBounds(183, 570, 103, 23);
		add(stndrbtnModificar);

	}
}
