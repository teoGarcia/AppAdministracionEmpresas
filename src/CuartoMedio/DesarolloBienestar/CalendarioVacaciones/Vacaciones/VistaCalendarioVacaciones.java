package CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import ui.Labels.LabelSubtitulos;
import ui.TablaUi.TableStandard;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import ui.Texts.TextSoloNumeros;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Dimension;

import ui.Buttons.CalcularButton;
import javax.swing.JSeparator;

public class VistaCalendarioVacaciones extends JPanel {
	
	private ControlCalendarioVacaciones ccv;
	
	private JTextField txtDiasAcumuladosRangoFecha;
	private JTextField txtDiasPendientes;
	private TableStandard table;
	private JDateChooser FechaRegistrarPermiso;
	private JDateChooser FechaDesde;
	private JDateChooser FechaHasta;
	private TextSoloNumeros txtId;
	private JTextField txtNombreEmpleado;
	private JComboBox comboPermiso;
	private TextSoloNumeros txtDiasTomados;
	private StandarButton btnGuardar;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	private CalcularButton btnCalcular;
	private StandarButton btnImprimir;
	private TextSoloNumeros txtDiasPorAno;
	private TextSoloNumeros txtDiasAcumAnoPrev;
	

	/**
	 * Create the panel.
	 */
	public VistaCalendarioVacaciones() {
		
		ccv = new ControlCalendarioVacaciones(this);
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1000));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrar Permiso");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 60, 774, 30);
		panel.add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsNombreDelEmpleado = new LabelSubtitulos("Nombre del Empleado");
		lblsbtlsNombreDelEmpleado.setBounds(10, 124, 148, 23);
		panel.add(lblsbtlsNombreDelEmpleado);
		
		txtNombreEmpleado = new JTextField();
		txtNombreEmpleado.setBounds(153, 125, 454, 23);
		panel.add(txtNombreEmpleado);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos("Fecha");
		lblsbtlsFecha.setBounds(11, 158, 126, 23);
		panel.add(lblsbtlsFecha);
	
		FechaRegistrarPermiso = new JDateChooser();
		FechaRegistrarPermiso.setBounds(154, 158, 148, 23);
		panel.add(FechaRegistrarPermiso);
		
		LabelSubtitulos lblsbtlsTipoDePermiso = new LabelSubtitulos("Tipo de Permiso");
		lblsbtlsTipoDePermiso.setBounds(337, 159, 110, 23);
		panel.add(lblsbtlsTipoDePermiso);
		
		comboPermiso = new JComboBox();
		comboPermiso.setModel(new DefaultComboBoxModel(new String[] {"E", "V", "M", "T", "MD"}));
		comboPermiso.setBounds(448, 160, 75, 23);
		panel.add(comboPermiso);
		
		btnGuardar = new StandarButton("Guardar");
		btnGuardar.setBounds(321, 210, 110, 30);
		btnGuardar.addActionListener(ccv);
		panel.add(btnGuardar);
		
		
		JLabel lblCalendarioVac = new JLabel("Calendario Vacaciones");
		lblCalendarioVac.setForeground(Color.WHITE);
		lblCalendarioVac.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCalendarioVac.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalendarioVac.setBounds(0, 266, 748, 30);
		panel.add(lblCalendarioVac);
		
		LabelSubtitulos lblsbtlsDesde = new LabelSubtitulos("Desde");
		lblsbtlsDesde.setBounds(10, 313, 80, 23);
		panel.add(lblsbtlsDesde);
		
		FechaDesde = new JDateChooser();
		FechaDesde.setBounds(103, 313, 150, 23);
		panel.add(FechaDesde);
		
		LabelSubtitulos lblsbtlsHasta = new LabelSubtitulos("Hasta");
		lblsbtlsHasta.setText("Hasta");
		lblsbtlsHasta.setBounds(277, 313, 72, 23);
		panel.add(lblsbtlsHasta);
		
		FechaHasta = new JDateChooser();
		FechaHasta.setBounds(359, 313, 150, 23);
		panel.add(FechaHasta);
		
		StandarButton stndrbtnBuscar = new StandarButton((String) null);
		stndrbtnBuscar.setText("Buscar");
		stndrbtnBuscar.setBounds(549, 313, 93, 23);
		panel.add(stndrbtnBuscar);
		
		JScrollPane scrollPaneTabla = new JScrollPane();
		scrollPaneTabla.setBounds(10, 353, 728, 283);
		panel.add(scrollPaneTabla);
		
		table = new TableStandard();
		String columns[] = new String[] {
				"Id",
				"Nombre",
				"Fecha",
				"Motivo",
				"DiasTomados",
		};
		table.setColums(columns);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setPreferredWidth(280);
		table.getColumnModel().getColumn(2).setPreferredWidth(120);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		
		scrollPaneTabla.setViewportView(table);
		
		LabelSubtitulos lblNewLabel_1 = new LabelSubtitulos("Dias acumulados en el rango de la fecha");
		lblNewLabel_1.setText("Dias Tomados en el rango de fecha");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(411, 699, 205, 23);
		panel.add(lblNewLabel_1);
		
		txtDiasAcumuladosRangoFecha = new JTextField();
		txtDiasAcumuladosRangoFecha.setBounds(638, 699, 100, 23);
		panel.add(txtDiasAcumuladosRangoFecha);
		txtDiasAcumuladosRangoFecha.setColumns(10);
		
		LabelSubtitulos lblNewLabel_1_1 = new LabelSubtitulos("Dias acumulados en el rango de la fecha");
		lblNewLabel_1_1.setText("Dias Acum. A\u00F1os previos");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setBounds(10, 733, 167, 23);
		panel.add(lblNewLabel_1_1);
		
		txtDiasPendientes = new JTextField();
		txtDiasPendientes.setEditable(false);
		txtDiasPendientes.setColumns(10);
		txtDiasPendientes.setBounds(638, 734, 100, 23);
		panel.add(txtDiasPendientes);
		
		LabelSubtitulos lblNewLabel_1_2 = new LabelSubtitulos("Dias acumulados en el rango de la fecha");
		lblNewLabel_1_2.setText("Dias Por A\u00F1o");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setBounds(10, 699, 167, 23);
		panel.add(lblNewLabel_1_2);
		
		txtDiasPorAno = new TextSoloNumeros();
		txtDiasPorAno.setBounds(197, 699, 100, 23);
		panel.add(txtDiasPorAno);
		
		txtDiasAcumAnoPrev = new TextSoloNumeros();
		txtDiasAcumAnoPrev.setBounds(197, 733, 100, 23);
		panel.add(txtDiasAcumAnoPrev);
		
		LabelSubtitulos lblNewLabel_1_3 = new LabelSubtitulos("Dias acumulados en el rango de la fecha");
		lblNewLabel_1_3.setText("Dias Pendientes");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setBounds(411, 733, 205, 23);
		panel.add(lblNewLabel_1_3);
		
		btnCalcular = new CalcularButton();
		btnCalcular.setBounds(705, 767, 33, 33);
		btnCalcular.addActionListener(ccv);
		panel.add(btnCalcular);
		
		btnImprimir = new StandarButton((String) null);
		btnImprimir.setText("Imprimir");
		btnImprimir.setBounds(645, 807, 93, 30);
		btnImprimir.addActionListener(ccv);
		panel.add(btnImprimir);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 253, 748, 8);
		panel.add(separator);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(10, 647, 110, 30);
		btnModificar.addActionListener(ccv);
		panel.add(btnModificar);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(143, 647, 110, 30);
		btnEliminar.addActionListener(ccv);
		panel.add(btnEliminar);
		
		txtId = new TextSoloNumeros();
		txtId.setVisible(false);
		txtId.setBounds(337, 651, 110, 23);
		panel.add(txtId);
		
		LabelSubtitulos lblsbtlsDiasTomados = new LabelSubtitulos("Tipo de Permiso");
		lblsbtlsDiasTomados.setText("Dias Tomados");
		lblsbtlsDiasTomados.setBounds(561, 159, 100, 23);
		panel.add(lblsbtlsDiasTomados);
		
		txtDiasTomados = new TextSoloNumeros();
		txtDiasTomados.setBounds(663, 160, 75, 23);
		panel.add(txtDiasTomados);
		
		ActualizarVista();

	}
	
	public void VaciarForm() {
		
		txtNombreEmpleado.setText("");
		FechaRegistrarPermiso.setCalendar(null);
		comboPermiso.setSelectedIndex(0);
		txtDiasTomados.setText("");
		
		txtId.setText("");
		
	}
	
	public void ActualizarVista() {
		VaciarForm();
		ccv.LlenarTabla();
		
	}
	
	
	public boolean camposVaciosImprimir() {
		
		if(txtDiasPorAno.getText().length() <= 0) {
			return false;
		}else if(txtDiasAcumAnoPrev.getText().length() <= 0) {
			return false;
		}else if(txtDiasAcumuladosRangoFecha.getText().length() <= 0) {
			return false;
		}else if(txtDiasPendientes.getText().length() <= 0) {
			return false;
		}else if(FechaDesde.getCalendar() == null) {
			return false;
		}else if(FechaHasta.getCalendar() == null) {
			return false;
		}
		
		return true;
	}
	
	public boolean camposVacios() {
		
		if(txtNombreEmpleado.getText().length() <= 0) {
			return false;
		}else if(FechaRegistrarPermiso.getCalendar() == null) {
			return false;
		}else if(txtDiasTomados.getText().length() <= 0) {
			return false;
		}
		
		
		return true;
	}
	
	public void CargarForm(CalendarioVacacionesEntity ape) {
	
		txtId.setText(""+ape.getId());
		
		txtNombreEmpleado.setText(ape.getNombreEmpleado());
		FechaRegistrarPermiso.setCalendar(ape.getFecha());
		comboPermiso.setSelectedIndex(ape.getTipoPermiso());
		txtDiasTomados.setText(""+ape.getDiasTomados());
		
	}
	
	public DefaultTableModel getModel() {
		return table.getModel();
	}

	public TableStandard getTable() {
		return table;
	}

	public JDateChooser getFechaRegistrarPermiso() {
		return FechaRegistrarPermiso;
	}

	public JDateChooser getFechaDesde() {
		return FechaDesde;
	}

	public JDateChooser getFechaHasta() {
		return FechaHasta;
	}

	public TextSoloNumeros getTxtId() {
		return txtId;
	}

	public JTextField getTxtNombreEmpleado() {
		return txtNombreEmpleado;
	}

	public JComboBox getComboPermiso() {
		return comboPermiso;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public void setFechaRegistrarPermiso(JDateChooser fechaRegistrarPermiso) {
		FechaRegistrarPermiso = fechaRegistrarPermiso;
	}

	public void setFechaDesde(JDateChooser fechaDesde) {
		FechaDesde = fechaDesde;
	}

	public void setFechaHasta(JDateChooser fechaHasta) {
		FechaHasta = fechaHasta;
	}

	public void setTxtId(TextSoloNumeros txtId) {
		this.txtId = txtId;
	}

	public void setTxtNombreEmpleado(JTextField txtNombreEmpleado) {
		this.txtNombreEmpleado = txtNombreEmpleado;
	}

	public void setComboPermiso(JComboBox comboPermiso) {
		this.comboPermiso = comboPermiso;
	}

	public TextSoloNumeros getTxtDiasTomados() {
		return txtDiasTomados;
	}

	public void setTxtDiasTomados(TextSoloNumeros txtDiasTomados) {
		this.txtDiasTomados = txtDiasTomados;
	}

	public JTextField getTxtDiasAcumuladosRangoFecha() {
		return txtDiasAcumuladosRangoFecha;
	}

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public StandarButton getBtnModificar() {
		return btnModificar;
	}

	public StandarButton getBtnEliminar() {
		return btnEliminar;
	}

	public CalcularButton getBtnCalcular() {
		return btnCalcular;
	}

	public void setTxtDiasAcumuladosRangoFecha(JTextField txtDiasAcumuladosRangoFecha) {
		this.txtDiasAcumuladosRangoFecha = txtDiasAcumuladosRangoFecha;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public void setBtnModificar(StandarButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public void setBtnEliminar(StandarButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public void setBtnCalcular(CalcularButton btnCalcular) {
		this.btnCalcular = btnCalcular;
	}

	public TextSoloNumeros getTxtDiasPorAno() {
		return txtDiasPorAno;
	}

	public void setTxtDiasPorAno(TextSoloNumeros txtDiasPorAno) {
		this.txtDiasPorAno = txtDiasPorAno;
	}

	public void setTxtDiasPendientes(TextSoloNumeros txtDiasPendientes) {
		this.txtDiasAcumAnoPrev = txtDiasPendientes;
	}

	public StandarButton getBtnImprimir() {
		return btnImprimir;
	}

	public TextSoloNumeros getTxtDiasAcumAnoPrev() {
		return txtDiasAcumAnoPrev;
	}

	public void setBtnImprimir(StandarButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public void setTxtDiasAcumAnoPrev(TextSoloNumeros txtDiasAcumAnoPrev) {
		this.txtDiasAcumAnoPrev = txtDiasAcumAnoPrev;
	}

	public JTextField getTxtDiasPendientes() {
		return txtDiasPendientes;
	}

	public void setTxtDiasPendientes(JTextField txtDiasPendientes) {
		this.txtDiasPendientes = txtDiasPendientes;
	}
}
