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

import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import ui.Texts.TextSoloNumeros;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class VistaVerAusenciaEmpleado extends JPanel {
	
	private ControlAusenciaEmpleado control;
	
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
	private JTextField txtId;

	/**
	 * Create the panel.
	 */
	public VistaVerAusenciaEmpleado() {
		
		control = new ControlAusenciaEmpleado(this);
		
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
		lblsbtlsNombre.setBounds(10, 155, 95, 23);
		panel.add(lblsbtlsNombre);
		
		JComboBox comboBox;
		txtNombre = new JTextField();
		txtNombre.setBounds(115, 156, 623, 23);
		panel.add(txtNombre);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos((String) null);
		lblsbtlsFecha.setText("Fecha");
		lblsbtlsFecha.setBounds(10, 209, 95, 23);
		panel.add(lblsbtlsFecha);
		
		fechaRegistroAusEmpleado = new JDateChooser();
		fechaRegistroAusEmpleado.setBounds(115, 209, 160, 23);
		panel.add(fechaRegistroAusEmpleado);
		
		LabelSubtitulos lblsbtlsMotivo = new LabelSubtitulos((String) null);
		lblsbtlsMotivo.setText("Motivo");
		lblsbtlsMotivo.setBounds(330, 209, 83, 23);
		panel.add(lblsbtlsMotivo);
		
		txtMotivo = new JTextField();
		txtMotivo.setBounds(411, 210, 327, 23);
		panel.add(txtMotivo);
		txtMotivo.setColumns(10);
		
		StandarButton stndrbtnAgregar = new StandarButton((String) null);
		stndrbtnAgregar.setText("Guardar");
		stndrbtnAgregar.setBounds(340, 629, 100, 30);
		add(stndrbtnAgregar);
		
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
		btnBuscar.addActionListener(control);
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
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(150, 756, 96, 30);
		btnEliminar.addActionListener(control);
		panel.add(btnEliminar);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(10, 756, 103, 30);
		btnModificar.addActionListener(control);
		panel.add(btnModificar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 358, 748, 11);
		panel.add(separator);
		
		LabelSubtitulos lblsbtlsTotalDias = new LabelSubtitulos((String) null);
		lblsbtlsTotalDias.setText("Total Dias");
		lblsbtlsTotalDias.setBounds(10, 259, 114, 23);
		panel.add(lblsbtlsTotalDias);
		
		txtTotalDias = new TextSoloNumeros();
		txtTotalDias.setColumns(10);
		txtTotalDias.setBounds(115, 260, 83, 23);
		panel.add(txtTotalDias);
		
		btnGuardar = new StandarButton((String) null);
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(324, 305, 105, 30);
		btnGuardar.addActionListener(control);
		panel.add(btnGuardar);
		
		txtId = new JTextField();
		txtId.setVisible(false);
		txtId.setBounds(10, 428, 95, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		ActualizarVista();

	}
	
	public void VaciarForm() {
		
		txtNombre.setText("");
		txtMotivo.setText("");
		txtTotalDias.setText("");
		fechaRegistroAusEmpleado.setCalendar(null);
		
		txtId.setText("");
		
	}
	
	public void ActualizarVista() {
		VaciarForm();
		control.LlenarTabla();
		
	}
	
	
	public boolean camposVacios() {
		
		if(txtNombre.getText().length() <= 0) {
			return false;
		}else if(txtMotivo.getText().length() <= 0) {
			return false;
		}else if(txtTotalDias.getText().length() <= 0) {
			return false;
		}else if(fechaRegistroAusEmpleado.getCalendar() == null) {
			return false;
		}
		
		return true;
	}
	
	public void CargarForm(AusenciaEmpleadoEntity ape) {
	
		txtId.setText(""+ape.getId());
		
		txtNombre.setText(ape.getNombre());
		fechaRegistroAusEmpleado.setCalendar(ape.getFecha());
		txtMotivo.setText(ape.getMotivo());
		txtTotalDias.setText(""+ape.getTotalDias());
		
	}

	public DefaultTableModel getModel() {
		return table.getModel();
	}
	
	public TableStandard getTable() {
		return table;
	}

	public JTextField getTxtMotivo() {
		return txtMotivo;
	}

	public TextSoloNumeros getTxtTotalDias() {
		return txtTotalDias;
	}

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public JDateChooser getFechaRegistroAusEmpleado() {
		return fechaRegistroAusEmpleado;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JDateChooser getFechaDesde() {
		return fechaDesde;
	}

	public JDateChooser getFechaHasta() {
		return fechaHasta;
	}

	public StandarButton getBtnBuscar() {
		return btnBuscar;
	}

	public StandarButton getBtnModificar() {
		return btnModificar;
	}

	public StandarButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public void setTxtMotivo(JTextField txtMotivo) {
		this.txtMotivo = txtMotivo;
	}

	public void setTxtTotalDias(TextSoloNumeros txtTotalDias) {
		this.txtTotalDias = txtTotalDias;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public void setFechaRegistroAusEmpleado(JDateChooser fechaRegistroAusEmpleado) {
		this.fechaRegistroAusEmpleado = fechaRegistroAusEmpleado;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public void setFechaDesde(JDateChooser fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public void setFechaHasta(JDateChooser fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	public void setBtnBuscar(StandarButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public void setBtnModificar(StandarButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public void setBtnEliminar(StandarButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}
}
