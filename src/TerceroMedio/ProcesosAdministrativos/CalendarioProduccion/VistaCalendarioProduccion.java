package TerceroMedio.ProcesosAdministrativos.CalendarioProduccion;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import ui.Buttons.StandarButton;
import ui.Labels.LabelSubtitulos;
import ui.Labels.LabelTitulos;
import ui.TablaUi.TableStandard;

public class VistaCalendarioProduccion extends JPanel {

private Long id;
	
	private TableStandard table;
	
	private JTextField txtEtapa;
	private JTextField txtProyecto;
	private JDateChooser FechaInicio;
	private JDateChooser FechaTermino;
	
	private StandarButton btnGuardar;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	
	private ControlCalendarioProduccion control;
	private StandarButton btnImprimir;

	/**
	 * Create the panel.
	 */
	public VistaCalendarioProduccion() {
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		control = new ControlCalendarioProduccion(this);
		
		LabelTitulos lbltlsCalendarioDeProduccion = new LabelTitulos((String) null);
		lbltlsCalendarioDeProduccion.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCalendarioDeProduccion.setText("Calendario de Produccion");
		lbltlsCalendarioDeProduccion.setBounds(0, 60, 722, 30);
		add(lbltlsCalendarioDeProduccion);
		
		LabelSubtitulos lblsbtlsEtapa = new LabelSubtitulos((String) null);
		lblsbtlsEtapa.setText("Etapa");
		lblsbtlsEtapa.setBounds(44, 157, 99, 23);
		add(lblsbtlsEtapa);
		
		txtEtapa = new JTextField();
		txtEtapa.setBounds(153, 158, 530, 23);
		add(txtEtapa);
		txtEtapa.setColumns(10);
		
		LabelSubtitulos lblsbtlsFechaInicio_1 = new LabelSubtitulos((String) null);
		lblsbtlsFechaInicio_1.setText("Fecha Inicio");
		lblsbtlsFechaInicio_1.setBounds(44, 202, 99, 23);
		add(lblsbtlsFechaInicio_1);
		
		LabelSubtitulos lblsbtlsFechaInicio = new LabelSubtitulos((String) null);
		lblsbtlsFechaInicio.setText("FechaTermino");
		lblsbtlsFechaInicio.setBounds(402, 202, 99, 23);
		add(lblsbtlsFechaInicio);
		
		FechaInicio = new JDateChooser();
		FechaInicio.setBounds(153, 202, 150, 23);
		add(FechaInicio);
		
		FechaTermino = new JDateChooser();
		FechaTermino.setBounds(533, 202, 150, 23);
		add(FechaTermino);
		
		btnGuardar = new StandarButton((String) null);
		btnGuardar.setText("Guardar");
		btnGuardar.addActionListener(control);
		btnGuardar.setBounds(583, 247, 100, 23);
		add(btnGuardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 286, 638, 355);
		add(scrollPane);
		
		table = new TableStandard();
		String[] columns = new String[] {"Id", "Proyecto", "Etapa", "Fecha Inicio",  "Fecha terminado"};
		table.setColums(columns);
		scrollPane.setViewportView(table);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(44, 652, 120, 30);
		btnModificar.addActionListener(control);
		add(btnModificar);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(187, 652, 120, 30);
		btnEliminar.addActionListener(control);
		add(btnEliminar);
		
		LabelSubtitulos lblsbtlsProyecto = new LabelSubtitulos((String) null);
		lblsbtlsProyecto.setText("Proyecto");
		lblsbtlsProyecto.setBounds(44, 113, 99, 23);
		add(lblsbtlsProyecto);
		
		txtProyecto = new JTextField();
		txtProyecto.setBounds(153, 114, 530, 23);
		add(txtProyecto);
		
		btnImprimir = new StandarButton((String) null);
		btnImprimir.setText("Imprimir");
		btnImprimir.setBounds(327, 652, 120, 30);
		btnImprimir.addActionListener(control);
		add(btnImprimir);
		
		ActualizarVista();

	}
	
	public void CargarForm(CalendarioProduccion3 record) {
		txtProyecto.setText(record.getProjecto());
		txtEtapa.setText(record.getEtapa());
		FechaInicio.setCalendar(record.getFechaI());
		FechaTermino.setCalendar(record.getFechaT());
		setId(record.getId());
	}
	
	public void ActualizarVista() {
		VaciarForm();
		control.LlenarTabla();
	}
	
	public void VaciarForm() {
		txtProyecto.setText("");
		txtEtapa.setText("");
		FechaInicio.setCalendar(null);
		FechaTermino.setCalendar(null);
		setId(0L);
	}
	


	public boolean camposVacios() {
		
		if(txtProyecto.getText().length() <= 0 || txtEtapa.getText().length() <= 0 || FechaInicio.getCalendar() == null || FechaTermino.getCalendar() == null) {
			return false;
		}
		
		return true;
	}
	
	public DefaultTableModel getModel() {
		return table.getModel();
	}

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public StandarButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(StandarButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public StandarButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(StandarButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TableStandard getTable() {
		return table;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public JTextField getTxtEtapa() {
		return txtEtapa;
	}

	public void setTxtEtapa(JTextField txtEtapa) {
		this.txtEtapa = txtEtapa;
	}

	public JTextField getTxtProyecto() {
		return txtProyecto;
	}

	public void setTxtProyecto(JTextField txtProyecto) {
		this.txtProyecto = txtProyecto;
	}

	public JDateChooser getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(JDateChooser fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public JDateChooser getFechaTermino() {
		return FechaTermino;
	}

	public void setFechaTermino(JDateChooser fechaTermino) {
		FechaTermino = fechaTermino;
	}

	public ControlCalendarioProduccion getControl() {
		return control;
	}

	public void setControl(ControlCalendarioProduccion control) {
		this.control = control;
	}

	public StandarButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(StandarButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

}
