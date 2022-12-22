package TerceroMedio.OrganizacionOficinas.InventariosDocFisicosDigitales;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import com.toedter.calendar.JDateChooser;
import ui.Buttons.StandarButton;
import ui.Labels.LabelSubtitulos;
import ui.Labels.LabelTitulos;
import ui.TablaUi.TableStandard;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.Color;

public class VistaInvDocFisDig extends JPanel {

	private Long id;
	
	private TableStandard table;
	
	private JTextField txtNumDocumento;
	private JComboBox comboBoxDocumento;
	private JDateChooser Fecha;
	
	private StandarButton btnGuardar;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	
	private ControlDocFisDig control;
	private StandarButton btnImprimir;
	private JTextField txtTipoDocumento;
	private JTextField txtMotivo;
	private JTextField txtRecibidoPor;
	private JTextField txtCopiaArchivadaEn;
	private JTextField txtUbicacionArchivo;
	private JTextField textPersonaAreaResp;

	private JFormattedTextField txtHora;
	private StandarButton btnVaciarCampos;
	private JTextField txtId;
	private JComboBox comboBoxEstadoDocumento;
	private StandarButton btnVerDatos;
	private StandarButton btnBuscar;

	/**
	 * Create the panel.
	 */
	public VistaInvDocFisDig() {
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		control = new ControlDocFisDig(this);
		
		LabelTitulos lbltlsCalendarioDeProduccion = new LabelTitulos((String) null);
		lbltlsCalendarioDeProduccion.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCalendarioDeProduccion.setText("Documentos F\u00EDsicos y Digitales");
		lbltlsCalendarioDeProduccion.setBounds(0, 60, 722, 30);
		add(lbltlsCalendarioDeProduccion);
		
		LabelSubtitulos lblsbtlsEtapa = new LabelSubtitulos((String) null);
		lblsbtlsEtapa.setText("Nro. Documento");
		lblsbtlsEtapa.setBounds(377, 128, 109, 23);
		add(lblsbtlsEtapa);
		
		txtNumDocumento = new JTextField();
		txtNumDocumento.setBounds(483, 129, 200, 23);
		add(txtNumDocumento);
		txtNumDocumento.setColumns(10);
		
		LabelSubtitulos lblFecha = new LabelSubtitulos((String) null);
		lblFecha.setText("Fecha");
		lblFecha.setBounds(377, 200, 99, 23);
		add(lblFecha);
		
		Fecha = new JDateChooser();
		Fecha.setBounds(556, 200, 127, 23);
		add(Fecha);
		
		btnGuardar = new StandarButton((String) null);
		btnGuardar.setText("Guardar");
		btnGuardar.addActionListener(control);
		btnGuardar.setBounds(583, 313, 100, 25);
		add(btnGuardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 411, 638, 265);
		add(scrollPane);
		
		table = new TableStandard();
		String[] columns = new String[] {"Id", "Nro. Documento", "Tipo Documento", "Recibido por",  "Fecha"};
		table.setColums(columns);
		scrollPane.setViewportView(table);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(120);
		table.getColumnModel().getColumn(3).setPreferredWidth(250);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(44, 687, 120, 30);
		btnModificar.addActionListener(control);
		add(btnModificar);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(187, 687, 120, 30);
		btnEliminar.addActionListener(control);
		add(btnEliminar);
		
		LabelSubtitulos lblsbtlsProyecto = new LabelSubtitulos((String) null);
		lblsbtlsProyecto.setText("Documento");
		lblsbtlsProyecto.setBounds(44, 128, 99, 23);
		add(lblsbtlsProyecto);
		
		comboBoxDocumento = new JComboBox();
		comboBoxDocumento.setModel(new DefaultComboBoxModel(new String[] {"Recibido", "Emitido"}));
		comboBoxDocumento.setBounds(163, 129, 200, 23);
		add(comboBoxDocumento);
		
		btnImprimir = new StandarButton((String) null);
		btnImprimir.setText("Imprimir");
		btnImprimir.setBounds(327, 687, 120, 30);
		btnImprimir.addActionListener(control);
		add(btnImprimir);
		
		LabelSubtitulos lblsbtlsTipoDeDocumento = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeDocumento.setText("Tipo de  Documento");
		lblsbtlsTipoDeDocumento.setBounds(45, 166, 120, 23);
		add(lblsbtlsTipoDeDocumento);
		
		txtTipoDocumento = new JTextField();
		txtTipoDocumento.setText("");
		txtTipoDocumento.setColumns(10);
		txtTipoDocumento.setBounds(164, 167, 200, 23);
		add(txtTipoDocumento);
		
		LabelSubtitulos lblsbtlsMotivo = new LabelSubtitulos((String) null);
		lblsbtlsMotivo.setText("Motivo");
		lblsbtlsMotivo.setBounds(378, 166, 109, 23);
		add(lblsbtlsMotivo);
		
		txtMotivo = new JTextField();
		txtMotivo.setText("");
		txtMotivo.setColumns(10);
		txtMotivo.setBounds(484, 167, 200, 23);
		add(txtMotivo);
		
		LabelSubtitulos lblsbtlsRecibidoPor = new LabelSubtitulos((String) null);
		lblsbtlsRecibidoPor.setText("Recibido Por");
		lblsbtlsRecibidoPor.setBounds(44, 201, 120, 23);
		add(lblsbtlsRecibidoPor);
		
		txtRecibidoPor = new JTextField();
		txtRecibidoPor.setText("");
		txtRecibidoPor.setColumns(10);
		txtRecibidoPor.setBounds(163, 202, 200, 23);
		add(txtRecibidoPor);
		
		LabelSubtitulos lblsbtlsCopiaarchivadaen = new LabelSubtitulos((String) null);
		lblsbtlsCopiaarchivadaen.setText("Copia Archivada en");
		lblsbtlsCopiaarchivadaen.setBounds(45, 235, 119, 23);
		add(lblsbtlsCopiaarchivadaen);
		
		txtCopiaArchivadaEn = new JTextField();
		txtCopiaArchivadaEn.setText("");
		txtCopiaArchivadaEn.setColumns(10);
		txtCopiaArchivadaEn.setBounds(163, 236, 200, 23);
		add(txtCopiaArchivadaEn);
		
		LabelSubtitulos lblsbtlsUbicacionDelArchivo = new LabelSubtitulos((String) null);
		lblsbtlsUbicacionDelArchivo.setText("Ubicacion del Arc.");
		lblsbtlsUbicacionDelArchivo.setBounds(377, 234, 109, 23);
		add(lblsbtlsUbicacionDelArchivo);
		
		txtUbicacionArchivo = new JTextField();
		txtUbicacionArchivo.setText("");
		txtUbicacionArchivo.setColumns(10);
		txtUbicacionArchivo.setBounds(483, 235, 200, 23);
		add(txtUbicacionArchivo);
		
		LabelSubtitulos lblsbtlsPersonaOArea = new LabelSubtitulos((String) null);
		lblsbtlsPersonaOArea.setText("Persona o Area Responsable");
		lblsbtlsPersonaOArea.setBounds(45, 269, 190, 23);
		add(lblsbtlsPersonaOArea);
		
		textPersonaAreaResp = new JTextField();
		textPersonaAreaResp.setText("");
		textPersonaAreaResp.setColumns(10);
		textPersonaAreaResp.setBounds(229, 270, 301, 23);
		add(textPersonaAreaResp);
		
		LabelSubtitulos lblsbtlsHora = new LabelSubtitulos((String) null);
		lblsbtlsHora.setText("Hora");
		lblsbtlsHora.setBounds(572, 269, 51, 23);
		add(lblsbtlsHora);
		
		try {
			MaskFormatter mascara = new MaskFormatter("##:##");
			txtHora = new JFormattedTextField(mascara);
			txtHora.setText("00:00");
			txtHora.setBounds(633, 271, 50, 20);
			add(txtHora);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		btnVaciarCampos = new StandarButton((String) null);
		btnVaciarCampos.setText("Vaciar Campos");
		btnVaciarCampos.setBounds(429, 313, 136, 25);
		btnVaciarCampos.addActionListener(control);
		add(btnVaciarCampos);
			
		txtId = new JTextField();
		txtId.setVisible(false);
		txtId.setBounds(616, 87, 67, 23);
		add(txtId);
		txtId.setColumns(10);
		
		LabelSubtitulos lblsbtlsEstadoDeDocumento = new LabelSubtitulos((String) null);
		lblsbtlsEstadoDeDocumento.setText("Estado de Documento");
		lblsbtlsEstadoDeDocumento.setBounds(44, 377, 142, 23);
		add(lblsbtlsEstadoDeDocumento);
		
		comboBoxEstadoDocumento = new JComboBox();
		comboBoxEstadoDocumento.setModel(new DefaultComboBoxModel(new String[] {"Recibido", "Emitido"}));
		comboBoxEstadoDocumento.setBounds(200, 377, 169, 23);
		add(comboBoxEstadoDocumento);
		
		btnBuscar = new StandarButton((String) null);
		btnBuscar.setText("Buscar");
		btnBuscar.setBounds(392, 375, 100, 25);
		btnBuscar.addActionListener(control);
		add(btnBuscar);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 358, 722, 9);
		add(separator);
		
		btnVerDatos = new StandarButton((String) null);
		btnVerDatos.setText("Ver Datos");
		btnVerDatos.setBounds(467, 687, 120, 30);
		btnVerDatos.addActionListener(control);
		add(btnVerDatos);
			
		
		ActualizarVista();

	}
	
	public void CargarForm(InventarioDocFisDigEntity record) {
		
		txtId.setText(""+record.getId());
		comboBoxDocumento.setSelectedIndex(record.getDocumento());
		txtNumDocumento.setText(record.getNumeroDocumento());
		txtTipoDocumento.setText(record.getTipoDocumento());
		txtMotivo.setText(record.getMotivo());
		txtRecibidoPor.setText(record.getRecibidoPor());
		Fecha.setCalendar(record.getFecha());
		txtCopiaArchivadaEn.setText(record.getCopiaArchivada());
		txtUbicacionArchivo.setText(record.getUbicacionArchivo());
		textPersonaAreaResp.setText(record.getPersonaAreaRespon());
		txtHora.setText(record.getHora());
		setId(record.getId());
	}
	
	public void CargarFormSinID(InventarioDocFisDigEntity record) {
		
		comboBoxDocumento.setSelectedIndex(record.getDocumento());
		txtNumDocumento.setText(record.getNumeroDocumento());
		txtTipoDocumento.setText(record.getTipoDocumento());
		txtMotivo.setText(record.getMotivo());
		txtRecibidoPor.setText(record.getRecibidoPor());
		Fecha.setCalendar(record.getFecha());
		txtCopiaArchivadaEn.setText(record.getCopiaArchivada());
		txtUbicacionArchivo.setText(record.getUbicacionArchivo());
		textPersonaAreaResp.setText(record.getPersonaAreaRespon());
		txtHora.setText(record.getHora());
		setId(record.getId());
	}
	
	public void ActualizarVista() {
		VaciarForm();
		//control.LlenarTabla();
	}
	
	public void VaciarForm() {
		txtNumDocumento.setText("");
		txtTipoDocumento.setText("");
		txtMotivo.setText("");
		txtRecibidoPor.setText("");
		txtCopiaArchivadaEn.setText("");
		txtUbicacionArchivo.setText("");
		Fecha.setCalendar(null);
		textPersonaAreaResp.setText("");
		txtHora.setText("00:00");
		txtId.setText("");
	}
	


	public boolean camposVacios() {
		
			
		if(txtNumDocumento.getText().length() <= 0) {
			return false;
		}else if(txtTipoDocumento.getText().length() <= 0) {
			return false;
		}else if(txtMotivo.getText().length() <= 0) {
			return false;
		}else if(txtRecibidoPor.getText().length() <= 0) {
			return false;
		}else if(Fecha.getCalendar() == null) {
			return false;
		}else if(txtCopiaArchivadaEn.getText().length() <= 0) {
			return false;
		}else if(txtUbicacionArchivo.getText().length() <= 0) {
			return false;
		}else if(textPersonaAreaResp.getText().length() <= 0) {
			return false;
		}else if(txtHora.getText().length() <= 0) {
			return false;
		}
		
		return true;
		
	}
		
	public DefaultTableModel getModel() {
		return table.getModel();
	}
		
	public Long getId() {
		return id;
	}

	public TableStandard getTable() {
		return table;
	}

	public JTextField getTxtNumDocumento() {
		return txtNumDocumento;
	}

	public JComboBox getComboBoxDocumento() {
		return comboBoxDocumento;
	}

	public JDateChooser getFecha() {
		return Fecha;
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

	public StandarButton getBtnImprimir() {
		return btnImprimir;
	}

	public JTextField getTxtTipoDocumento() {
		return txtTipoDocumento;
	}

	public JTextField getTxtMotivo() {
		return txtMotivo;
	}

	public JTextField getTxtRecibidoPor() {
		return txtRecibidoPor;
	}

	public JTextField getTxtCopiaArchivadaEn() {
		return txtCopiaArchivadaEn;
	}

	public JTextField getTextPersonaAreaResp() {
		return textPersonaAreaResp;
	}

	public JFormattedTextField getTxtHora() {
		return txtHora;
	}

	public StandarButton getBtnVaciarCampos() {
		return btnVaciarCampos;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public void setTxtNumDocumento(JTextField txtNumDocumento) {
		this.txtNumDocumento = txtNumDocumento;
	}

	public void setComboBoxDocumento(JComboBox comboBoxDocumento) {
		this.comboBoxDocumento = comboBoxDocumento;
	}

	public void setFecha(JDateChooser fecha) {
		Fecha = fecha;
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

	public void setBtnImprimir(StandarButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public void setTxtTipoDocumento(JTextField txtTipoDocumento) {
		this.txtTipoDocumento = txtTipoDocumento;
	}

	public void setTxtMotivo(JTextField txtMotivo) {
		this.txtMotivo = txtMotivo;
	}

	public void setTxtRecibidoPor(JTextField txtRecibidoPor) {
		this.txtRecibidoPor = txtRecibidoPor;
	}

	public void setTxtCopiaArchivadaEn(JTextField txtCopiaArchivadaEn) {
		this.txtCopiaArchivadaEn = txtCopiaArchivadaEn;
	}

	public void setTextPersonaAreaResp(JTextField textPersonaAreaResp) {
		this.textPersonaAreaResp = textPersonaAreaResp;
	}

	public void setTxtHora(JFormattedTextField txtHora) {
		this.txtHora = txtHora;
	}

	public void setBtnVaciarCampos(StandarButton btnVaciarCampos) {
		this.btnVaciarCampos = btnVaciarCampos;
	}

	public JTextField getTxtUbicacionArchivo() {
		return txtUbicacionArchivo;
	}

	public void setTxtUbicacionArchivo(JTextField txtUbicacionArchivo) {
		this.txtUbicacionArchivo = txtUbicacionArchivo;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public JComboBox getComboBoxEstadoDocumento() {
		return comboBoxEstadoDocumento;
	}

	public StandarButton getBtnVerDatos() {
		return btnVerDatos;
	}

	public void setComboBoxEstadoDocumento(JComboBox comboBoxEstadoDocumento) {
		this.comboBoxEstadoDocumento = comboBoxEstadoDocumento;
	}

	public void setBtnVerDatos(StandarButton btnVerDatos) {
		this.btnVerDatos = btnVerDatos;
	}

	public StandarButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(StandarButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}
}
