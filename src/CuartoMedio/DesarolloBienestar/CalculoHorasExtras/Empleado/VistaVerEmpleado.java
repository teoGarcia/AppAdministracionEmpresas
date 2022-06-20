package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Empleado;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import ui.Labels.LabelSubtitulos;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class VistaVerEmpleado extends JPanel {
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public VistaVerEmpleado() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Listado de Empleados");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 55, 774, 30);
		add(lblNewLabel);
		
		StandarButton stndrbtnEliminar = new StandarButton((String) null);
		stndrbtnEliminar.setSize(94, 32);
		stndrbtnEliminar.setLocation(525, 647);
		stndrbtnEliminar.setText("Eliminar");
		add(stndrbtnEliminar);
		
		StandarButton stndrbtnModificar = new StandarButton((String) null);
		stndrbtnModificar.setSize(94, 32);
		stndrbtnModificar.setText("Modificar");
		stndrbtnModificar.setLocation(659, 647);
		add(stndrbtnModificar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 188, 733, 405);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Rut", "Direccion", "Telefono", "Ocupacion", "Fecha"
			}
		));
		scrollPane.setViewportView(table);
		
		LabelSubtitulos lblsbtlsBuscar = new LabelSubtitulos("Buscar por nombre");
		lblsbtlsBuscar.setBounds(20, 138, 154, 21);
		add(lblsbtlsBuscar);
		
		textField = new JTextField();
		textField.setBounds(186, 139, 346, 21);
		add(textField);
		textField.setColumns(10);

	}
}
