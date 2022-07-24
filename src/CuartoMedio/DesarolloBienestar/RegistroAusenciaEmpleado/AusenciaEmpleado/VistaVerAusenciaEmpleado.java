package CuartoMedio.DesarolloBienestar.RegistroAusenciaEmpleado.AusenciaEmpleado;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import ui.TablaUi.TableStandard;

import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import ui.Texts.TextSoloNumeros;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class VistaVerAusenciaEmpleado extends JPanel {
	private TableStandard table;
	private JTextField txtMotivo;
	private TextSoloNumeros txtTotalDias;
	private StandarButton btnGuardar;
	private JDateChooser fechaRegistroAusEmpleado;
	private JTextField txtNombre;
	private JDateChooser fechaDesde;
	private JDateChooser fechaHasta;
	private StandarButton btnBuscar;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	private TextSoloNumeros txtTotalDiasSumar;

	/**
	 * Create the panel.
	 */
	public VistaVerAusenciaEmpleado() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 900));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro de Ausencia de Empleado");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 81, 748, 30);
		panel.add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsNombre = new LabelSubtitulos((String) null);
		lblsbtlsNombre.setText("Nombre");
		lblsbtlsNombre.setBounds(10, 150, 95, 23);
		panel.add(lblsbtlsNombre);
		
		JComboBox comboBox;
		txtNombre = new JTextField();
		txtNombre.setBounds(115, 151, 533, 23);
		panel.add(txtNombre);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos((String) null);
		lblsbtlsFecha.setText("Fecha");
		lblsbtlsFecha.setBounds(10, 185, 95, 23);
		panel.add(lblsbtlsFecha);
		
		fechaRegistroAusEmpleado = new JDateChooser();
		fechaRegistroAusEmpleado.setBounds(115, 185, 160, 23);
		panel.add(fechaRegistroAusEmpleado);
		
		LabelSubtitulos lblsbtlsMotivo = new LabelSubtitulos((String) null);
		lblsbtlsMotivo.setText("Motivo");
		lblsbtlsMotivo.setBounds(330, 185, 83, 23);
		panel.add(lblsbtlsMotivo);
		
		txtMotivo = new JTextField();
		txtMotivo.setBounds(411, 186, 327, 23);
		panel.add(txtMotivo);
		txtMotivo.setColumns(10);
		
		txtTotalDiasSumar = new TextSoloNumeros();
		txtTotalDiasSumar.setBounds(635, 756, 100, 23);
		panel.add(txtTotalDiasSumar);
		
		StandarButton stndrbtnAgregar = new StandarButton((String) null);
		stndrbtnAgregar.setText("Guardar");
		stndrbtnAgregar.setBounds(340, 629, 100, 30);
		add(stndrbtnAgregar);
		
		JLabel lbl1 = new JLabel("Ausencias de Empleados");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setForeground(Color.WHITE);
		lbl1.setFont(new Font("Dialog", Font.BOLD, 18));
		lbl1.setBounds(0, 329, 748, 30);
		panel.add(lbl1);
		
		LabelSubtitulos lblsbtlsDesde = new LabelSubtitulos((String) null);
		lblsbtlsDesde.setText("Desde");
		lblsbtlsDesde.setBounds(10, 394, 103, 23);
		panel.add(lblsbtlsDesde);
		
		fechaDesde = new JDateChooser();
		fechaDesde.setBounds(107, 394, 156, 23);
		panel.add(fechaDesde);
		
		fechaHasta = new JDateChooser();
		fechaHasta.setBounds(423, 394, 156, 23);
		panel.add(fechaHasta);
		
		LabelSubtitulos lblsbtlsNombre_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsNombre_1_1.setText("Hasta");
		lblsbtlsNombre_1_1.setBounds(351, 394, 78, 23);
		panel.add(lblsbtlsNombre_1_1);
		
		btnBuscar = new StandarButton((String) null);
		btnBuscar.setText("Buscar");
		btnBuscar.setBounds(635, 394, 103, 23);
		panel.add(btnBuscar);
		
		JScrollPane scrollPaneTable = new JScrollPane();
		scrollPaneTable.setBounds(10, 454, 728, 291);
		panel.add(scrollPaneTable);
		
		table = new TableStandard();
		String columns[] = new String[] {
			"Id",
			"Nombre",
			"Motivo",
			"Fecha",
			"Total de Dias"
		};
		table.setColums(columns);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setPreferredWidth(250);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(3).setPreferredWidth(120);
		table.getColumnModel().getColumn(4).setPreferredWidth(120);
		
		scrollPaneTable.setViewportView(table);
		
		LabelSubtitulos lblsbtlsTotalDeDias = new LabelSubtitulos((String) null);
		lblsbtlsTotalDeDias.setText("Total de Dias");
		lblsbtlsTotalDeDias.setBounds(500, 756, 103, 23);
		panel.add(lblsbtlsTotalDeDias);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(150, 756, 96, 30);
		panel.add(btnEliminar);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(10, 756, 103, 30);
		panel.add(btnModificar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 313, 748, 11);
		panel.add(separator);
		
		LabelSubtitulos lblsbtlsTotalDias = new LabelSubtitulos((String) null);
		lblsbtlsTotalDias.setText("Total Dias");
		lblsbtlsTotalDias.setBounds(10, 219, 114, 23);
		panel.add(lblsbtlsTotalDias);
		
		txtTotalDias = new TextSoloNumeros();
		txtTotalDias.setColumns(10);
		txtTotalDias.setBounds(115, 220, 160, 23);
		panel.add(txtTotalDias);
		
		btnGuardar = new StandarButton((String) null);
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(321, 268, 105, 30);
		panel.add(btnGuardar);

	}
}
