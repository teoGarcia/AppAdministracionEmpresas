package CuartoMedio.GestionDeBodega.MermasMercaderia;

import javax.swing.JPanel;
import ui.Labels.LabelTitulos;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import ui.Labels.LabelSubtitulos;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import ui.Texts.TextSoloNumeros;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacion;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import ui.TablaUi.TableStandard;
import ui.Buttons.StandarButton;

public class VistaMermaMercaderia extends JPanel {
	
	private JTextField txtLocal;
	private JTextField txtTienda;
	private JTextField txtAlmacen;
	private JTextField txtCentroCosto;
	private JTextField txtSeccion;
	private JTextField txtCodSapBarras;
	private JTextField txtDescripcionMaterial;
	private JTextField txtMotivo;
	private TableStandard table;
	private ControlMermaMercaderia cmm;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	private StandarButton btnGuardar;
	private JTextField txtId;
	private TextSoloNumeros txtFolio;
	private JDateChooser Fecha;
	private TextSoloNumeros txtCantidad;
	private JComboBox comboBoxMotivo;
	private JComboBox comboBoxTMov;
	private JComboBox comboBoxUnidadMedida;
	private StandarButton btnImprimir;

	/**
	 * Create the panel.
	 */
	public VistaMermaMercaderia() {
		
		cmm = new ControlMermaMercaderia(this);
		
		setBounds(0, 0, 774, 722);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lbltlsMermasYConsumos = new LabelTitulos((String) null);
		lbltlsMermasYConsumos.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsMermasYConsumos.setText("Mermas y Consumos Autorizados");
		lbltlsMermasYConsumos.setBounds(0, 60, 774, 30);
		add(lbltlsMermasYConsumos);
		
		LabelSubtitulos lblsbtlsTipoDeMovimientos = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeMovimientos.setText("Tipo de Movimiento");
		lblsbtlsTipoDeMovimientos.setBounds(34, 118, 132, 23);
		add(lblsbtlsTipoDeMovimientos);
		
		comboBoxTMov = new JComboBox();
		comboBoxTMov.setModel(new DefaultComboBoxModel(new String[] {"Consumo", "Merma"}));
		comboBoxTMov.setBounds(145, 118, 137, 23);
		add(comboBoxTMov);
		
		LabelSubtitulos lblsbtlsMotivo = new LabelSubtitulos((String) null);
		lblsbtlsMotivo.setText("Motivo");
		lblsbtlsMotivo.setBounds(284, 119, 104, 23);
		add(lblsbtlsMotivo);
		
		comboBoxMotivo = new JComboBox();
		comboBoxMotivo.setModel(new DefaultComboBoxModel(new String[] {"21.- Casino", "22.- Aseo", "23.- Operacion", "51.- Consumo", "53.- Vencimiento", "54.- Operacion"}));
		comboBoxMotivo.setBounds(380, 118, 137, 23);
		add(comboBoxMotivo);
		
		LabelSubtitulos lblsbtlsFolio = new LabelSubtitulos((String) null);
		lblsbtlsFolio.setText("Folio");
		lblsbtlsFolio.setBounds(521, 118, 64, 23);
		add(lblsbtlsFolio);
		
		txtFolio = new TextSoloNumeros();
		txtFolio.setBounds(595, 117, 137, 23);
		add(txtFolio);
		
		LabelSubtitulos lblsbtlsLocal = new LabelSubtitulos((String) null);
		lblsbtlsLocal.setText("Local");
		lblsbtlsLocal.setBounds(34, 153, 132, 23);
		add(lblsbtlsLocal);
		
		txtLocal = new JTextField();
		txtLocal.setBounds(145, 153, 137, 23);
		add(txtLocal);
		txtLocal.setColumns(10);
		
		LabelSubtitulos lblsbtlsTienda = new LabelSubtitulos((String) null);
		lblsbtlsTienda.setText("Tienda");
		lblsbtlsTienda.setBounds(284, 153, 132, 23);
		add(lblsbtlsTienda);
		
		txtTienda = new JTextField();
		txtTienda.setColumns(10);
		txtTienda.setBounds(380, 153, 137, 23);
		add(txtTienda);
		
		LabelSubtitulos lblsbtlsAlmacen = new LabelSubtitulos((String) null);
		lblsbtlsAlmacen.setText("Almacen");
		lblsbtlsAlmacen.setBounds(521, 152, 89, 23);
		add(lblsbtlsAlmacen);
		
		txtAlmacen = new JTextField();
		txtAlmacen.setColumns(10);
		txtAlmacen.setBounds(595, 153, 137, 23);
		add(txtAlmacen);
		
		LabelSubtitulos lblsbtlsCentroCosto = new LabelSubtitulos((String) null);
		lblsbtlsCentroCosto.setText("Centro Costo");
		lblsbtlsCentroCosto.setBounds(34, 188, 132, 23);
		add(lblsbtlsCentroCosto);
		
		txtCentroCosto = new JTextField();
		txtCentroCosto.setColumns(10);
		txtCentroCosto.setBounds(145, 188, 137, 23);
		add(txtCentroCosto);
		
		LabelSubtitulos lblsbtlsSeccion = new LabelSubtitulos((String) null);
		lblsbtlsSeccion.setText("Seccion");
		lblsbtlsSeccion.setBounds(284, 188, 132, 23);
		add(lblsbtlsSeccion);
		
		txtSeccion = new JTextField();
		txtSeccion.setColumns(10);
		txtSeccion.setBounds(380, 188, 137, 23);
		add(txtSeccion);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos((String) null);
		lblsbtlsFecha.setText("Fecha");
		lblsbtlsFecha.setBounds(521, 187, 89, 23);
		add(lblsbtlsFecha);
		
		Fecha = new JDateChooser();
		Fecha.setBounds(595, 188, 137, 23);
		add(Fecha);
		
		LabelSubtitulos lblsbtlsCodSap = new LabelSubtitulos((String) null);
		lblsbtlsCodSap.setText("Cod SAP / Barras");
		lblsbtlsCodSap.setBounds(34, 223, 132, 23);
		add(lblsbtlsCodSap);
		
		txtCodSapBarras = new JTextField();
		txtCodSapBarras.setColumns(10);
		txtCodSapBarras.setBounds(145, 223, 137, 23);
		add(txtCodSapBarras);
		
		LabelSubtitulos lblsbtlsDescMaterial = new LabelSubtitulos((String) null);
		lblsbtlsDescMaterial.setText("Desc. Material");
		lblsbtlsDescMaterial.setBounds(284, 223, 132, 23);
		add(lblsbtlsDescMaterial);
		
		txtDescripcionMaterial = new JTextField();
		txtDescripcionMaterial.setColumns(10);
		txtDescripcionMaterial.setBounds(380, 223, 137, 23);
		add(txtDescripcionMaterial);
		
		LabelSubtitulos lblsbtlsUnidadMedida = new LabelSubtitulos((String) null);
		lblsbtlsUnidadMedida.setText("Unidad Med.");
		lblsbtlsUnidadMedida.setBounds(521, 222, 89, 23);
		add(lblsbtlsUnidadMedida);
		
		comboBoxUnidadMedida = new JComboBox();
		comboBoxUnidadMedida.setModel(new DefaultComboBoxModel(new String[] {"C/U", "Pack", "Pallet", "Caja", "Kilo"}));
		comboBoxUnidadMedida.setBounds(595, 223, 137, 23);
		add(comboBoxUnidadMedida);
		
		LabelSubtitulos lblsbtlsCodMotivo = new LabelSubtitulos((String) null);
		lblsbtlsCodMotivo.setText("Codigo Motivo");
		lblsbtlsCodMotivo.setBounds(34, 260, 132, 23);
		add(lblsbtlsCodMotivo);
		
		txtMotivo = new JTextField();
		txtMotivo.setColumns(10);
		txtMotivo.setBounds(145, 260, 137, 23);
		add(txtMotivo);
		
		LabelSubtitulos lblsbtlsCantidad = new LabelSubtitulos((String) null);
		lblsbtlsCantidad.setText("Cantidad");
		lblsbtlsCantidad.setBounds(284, 260, 132, 23);
		add(lblsbtlsCantidad);
		
		txtCantidad = new TextSoloNumeros();
		txtCantidad.setBounds(380, 260, 137, 23);
		add(txtCantidad);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 294, 700, 343);
		add(scrollPane);
		
		table = new TableStandard();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String[] columns = new String[] {"Id", "Cod. SAP/BARRAS", "Descripcion de Material", "Motivo", "U.M.", "Cantidad", "Tipo Movimiento", "Folio", "C. Costo", "Fecha", "Seccion", "Local", "Tienda", "Almacen"};
		table.setColums(columns);
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(3).setPreferredWidth(120);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.getColumnModel().getColumn(5).setPreferredWidth(120);
		table.getColumnModel().getColumn(6).setPreferredWidth(120);
		table.getColumnModel().getColumn(7).setPreferredWidth(120);
		table.getColumnModel().getColumn(8).setPreferredWidth(120);
		table.getColumnModel().getColumn(9).setPreferredWidth(120);
		table.getColumnModel().getColumn(10).setPreferredWidth(120);
		table.getColumnModel().getColumn(11).setPreferredWidth(120);
		table.getColumnModel().getColumn(12).setPreferredWidth(120);
		table.getColumnModel().getColumn(13).setPreferredWidth(120);
		scrollPane.setViewportView(table);
		
		btnGuardar = new StandarButton((String) null);
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(628, 260, 104, 23);
		btnGuardar.addActionListener(cmm);
		add(btnGuardar);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(34, 648, 125, 30);
		btnModificar.addActionListener(cmm);
		add(btnModificar);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(169, 648, 125, 30);
		btnEliminar.addActionListener(cmm);
		add(btnEliminar);
		
		txtId = new JTextField();
		txtId.setBounds(34, 25, 86, 20);
		add(txtId);
		txtId.setColumns(10);
		
		btnImprimir = new StandarButton((String) null);
		btnImprimir.setText("Imprimir");
		btnImprimir.setBounds(304, 648, 125, 30);
		btnImprimir.addActionListener(cmm);
		add(btnImprimir);
		txtId.setVisible(false);
		
		ActualizarVista();

	}
	
	public void VaciarForm() {
		
		comboBoxTMov.setSelectedIndex(0);
		comboBoxMotivo.setSelectedIndex(0);
		txtFolio.setText("");
		txtLocal.setText("");
		txtTienda.setText("");
		txtAlmacen.setText("");
		txtCentroCosto.setText("");
		txtSeccion.setText("");
		Fecha.setCalendar(null);
		txtCodSapBarras.setText("");
		txtDescripcionMaterial.setText("");
		comboBoxUnidadMedida.setSelectedIndex(0);
		txtMotivo.setText("");
		txtCantidad.setText("");
		txtId.setText("");
		
		
	}
	
	public void ActualizarVista() {
		VaciarForm();
		cmm.LlenarTabla();
		
	}
	
	public void CargarForm(MermaMercaderiaEntity mme, int indexTMov, int indexMotivo, int indexUM) {
		
		comboBoxTMov.setSelectedIndex(indexTMov);
		comboBoxMotivo.setSelectedIndex(indexMotivo);
		txtFolio.setText(mme.getFolio());
		txtLocal.setText(mme.getLocal());
		txtTienda.setText(mme.getTienda());
		txtAlmacen.setText(mme.getAlmacen());
		txtCentroCosto.setText(mme.getCentroCosto());
		txtSeccion.setText(mme.getSeccion());
		Fecha.setCalendar(mme.getFecha());
		txtCodSapBarras.setText(mme.getCodSAPBARRAS());
		txtDescripcionMaterial.setText(mme.getDescripcionMaterial());
		comboBoxUnidadMedida.setSelectedIndex(indexUM);
		txtMotivo.setText(mme.getCodigoMotivo());
		txtCantidad.setText(mme.getCantidad());
		txtId.setText(""+mme.getId());
	}
	
	public boolean camposVacios() {
		
		if(txtFolio.getText().length() <= 0) {
			return false;
		}else if(txtLocal.getText().length() <= 0) {
			return false;
		}else if(txtTienda.getText().length() <= 0) {
			return false;
		}else if(txtAlmacen.getText().length() <= 0) {
			return false;
		}else if(txtCentroCosto.getText().length() <= 0) {
			return false;
		}else if(txtSeccion.getText().length() <= 0) {
			return false;
		}else if(Fecha.getCalendar() == null) {
			return false;
		}else if(txtCodSapBarras.getText().length() <= 0) {
			return false;
		}else if(txtDescripcionMaterial.getText().length() <= 0) {
			return false;
		}else if(txtMotivo.getText().length() <= 0) {
			return false;
		}else if(txtCantidad.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	public DefaultTableModel getModel() {
		return table.getModel();
	}

	public StandarButton getBtnModificar() {
		return btnModificar;
	}

	public StandarButton getBtnEliminar() {
		return btnEliminar;
	}

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnModificar(StandarButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public void setBtnEliminar(StandarButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JTextField getTxtLocal() {
		return txtLocal;
	}

	public JTextField getTxtTienda() {
		return txtTienda;
	}

	public JTextField getTxtAlmacen() {
		return txtAlmacen;
	}

	public JTextField getTxtCentroCosto() {
		return txtCentroCosto;
	}

	public JTextField getTxtSeccion() {
		return txtSeccion;
	}

	public JTextField getTxtCodSapBarras() {
		return txtCodSapBarras;
	}

	public JTextField getTxtDescripcionMaterial() {
		return txtDescripcionMaterial;
	}

	public JTextField getTxtMotivo() {
		return txtMotivo;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtLocal(JTextField txtLocal) {
		this.txtLocal = txtLocal;
	}

	public void setTxtTienda(JTextField txtTienda) {
		this.txtTienda = txtTienda;
	}

	public void setTxtAlmacen(JTextField txtAlmacen) {
		this.txtAlmacen = txtAlmacen;
	}

	public void setTxtCentroCosto(JTextField txtCentroCosto) {
		this.txtCentroCosto = txtCentroCosto;
	}

	public void setTxtSeccion(JTextField txtSeccion) {
		this.txtSeccion = txtSeccion;
	}

	public void setTxtCodSapBarras(JTextField txtCodSapBarras) {
		this.txtCodSapBarras = txtCodSapBarras;
	}

	public void setTxtDescripcionMaterial(JTextField txtDescripcionMaterial) {
		this.txtDescripcionMaterial = txtDescripcionMaterial;
	}

	public void setTxtMotivo(JTextField txtMotivo) {
		this.txtMotivo = txtMotivo;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public TextSoloNumeros getTxtFolio() {
		return txtFolio;
	}

	public void setTxtFolio(TextSoloNumeros txtFolio) {
		this.txtFolio = txtFolio;
	}

	public TableStandard getTable() {
		return table;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public JDateChooser getFecha() {
		return Fecha;
	}

	public void setFecha(JDateChooser fecha) {
		Fecha = fecha;
	}

	public TextSoloNumeros getTxtCantidad() {
		return txtCantidad;
	}

	public void setTxtCantidad(TextSoloNumeros txtCantidad) {
		this.txtCantidad = txtCantidad;
	}

	public JComboBox getComboBoxMotivo() {
		return comboBoxMotivo;
	}

	public JComboBox getComboBoxTMov() {
		return comboBoxTMov;
	}

	public JComboBox getComboBoxUnidadMedida() {
		return comboBoxUnidadMedida;
	}

	public void setComboBoxMotivo(JComboBox comboBoxMotivo) {
		this.comboBoxMotivo = comboBoxMotivo;
	}

	public void setComboBoxTMov(JComboBox comboBoxTMov) {
		this.comboBoxTMov = comboBoxTMov;
	}

	public void setComboBoxUnidadMedida(JComboBox comboBoxUnidadMedida) {
		this.comboBoxUnidadMedida = comboBoxUnidadMedida;
	}

	public StandarButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(StandarButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}
}
