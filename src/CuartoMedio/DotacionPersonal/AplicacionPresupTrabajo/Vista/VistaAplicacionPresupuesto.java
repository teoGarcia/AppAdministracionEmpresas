package CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;

import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import java.awt.Dimension;
import javax.swing.JSeparator;
import ui.Buttons.StandarButton;
import javax.swing.JTable;
import ui.TablaUi.TableStandard;
import ui.Labels.LabelSubtitulos;

public class VistaAplicacionPresupuesto extends JPanel {
	
	private ControlAplicacionPresupuesto cap;

	private JTextField txtPuesto;
	private JTextField txtCategoria;
	private JTextField txtDptoGrupo;
	private JTextField txtCodPuesto;
	private JTextField txtUbicacion;
	private JTextField txtRangoSalario;
	private JTextField txtContactoRRHH;
	private JTextField txtFormacionSolicitud;
	private JTextField txtURLInt;
	private JTextField txtNombreEmpresa;
	private JTextField txtReqCualifFormacion;
	private JTextField txtAptitudesDeseables;
	private JTextField txtNotasAdicionales;
	private JTextField txtRevisadoPor;
	private JTextField txtAprobadoPor;
	private JTextField txtUltimaActualizacion;
	private JTextField txtDireccion;
	private JTextField txtFaxCorreo;
	private JTextField txtCodPostal;
	private TableStandard table;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	private StandarButton btnGuardar;
	private JTextField txtId;
	private JComboBox comboBoxNecesarioViajar;
	private JComboBox comboBoxTipoPosicion;
	private JTextField txtURLExt;
	private JEditorPane txtRolResponsabilidades;
	private JDateChooser FechaRevisado;
	private JDateChooser FechaAprobado;
	private JDateChooser FechaActualizacion;
	private JDateChooser FechaPublicacion;
	private JDateChooser FechaExpiracion;
	private StandarButton btnVerTodosLos;
	private StandarButton btnImprimir;
	private StandarButton btnVaciarCampos;


	/**
	 * Create the frame.
	 */
	public VistaAplicacionPresupuesto() {
		
		cap = new ControlAplicacionPresupuesto(this);
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1120));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aplicaci\u00F3n de puestos de Trabajo");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 20, 784, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Puesto");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 73, 105, 22);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Categor\u00EDa");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(270, 73, 81, 22);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Depto. o Grupo");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(526, 73, 88, 22);
		panel.add(lblNewLabel_2_1);
		
		txtPuesto = new JTextField();
		txtPuesto.setBounds(125, 73, 135, 22);
		panel.add(txtPuesto);
		txtPuesto.setColumns(10);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(381, 73, 135, 22);
		panel.add(txtCategoria);
		
		txtDptoGrupo = new JTextField();
		txtDptoGrupo.setColumns(10);
		txtDptoGrupo.setBounds(624, 73, 114, 22);
		panel.add(txtDptoGrupo);
		
		JLabel lblNewLabel_1_1 = new JLabel("C\u00F3d. del Puesto");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 106, 109, 22);
		panel.add(lblNewLabel_1_1);
		
		txtCodPuesto = new JTextField();
		txtCodPuesto.setColumns(10);
		txtCodPuesto.setBounds(125, 106, 135, 22);
		panel.add(txtCodPuesto);
		
		JLabel lblNewLabel_2_2 = new JLabel("Ubicaci\u00F3n");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(270, 106, 81, 22);
		panel.add(lblNewLabel_2_2);
		
		txtUbicacion = new JTextField();
		txtUbicacion.setColumns(10);
		txtUbicacion.setBounds(381, 106, 135, 22);
		panel.add(txtUbicacion);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Necesario Viajar");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(526, 106, 109, 22);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Rango de Salario");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 139, 126, 22);
		panel.add(lblNewLabel_3);
		
		txtRangoSalario = new JTextField();
		txtRangoSalario.setBounds(125, 140, 135, 21);
		panel.add(txtRangoSalario);
		txtRangoSalario.setColumns(10);
		
		comboBoxNecesarioViajar = new JComboBox();
		comboBoxNecesarioViajar.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		comboBoxNecesarioViajar.setBounds(624, 106, 114, 22);
		panel.add(comboBoxNecesarioViajar);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tipo de Posicion");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(270, 139, 109, 22);
		panel.add(lblNewLabel_3_1);
		
		comboBoxTipoPosicion = new JComboBox();
		comboBoxTipoPosicion.setModel(new DefaultComboBoxModel(new String[] {"Tiempo Completo", "Tiempo Parcial", "Compartido", "Contrato", "En pr\u00E1ctica"}));
		comboBoxTipoPosicion.setBounds(381, 139, 135, 22);
		panel.add(comboBoxTipoPosicion);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Contacto RRHH");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setBounds(526, 139, 109, 22);
		panel.add(lblNewLabel_3_1_1);
		
		txtContactoRRHH = new JTextField();
		txtContactoRRHH.setColumns(10);
		txtContactoRRHH.setBounds(624, 140, 114, 21);
		panel.add(txtContactoRRHH);
		
		JLabel lblNewLabel_1_2 = new JLabel("Fecha Publicacion");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 172, 126, 22);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Formaci\u00F3n de Sol.");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(270, 172, 145, 22);
		panel.add(lblNewLabel_2_3);
		
		txtFormacionSolicitud = new JTextField();
		txtFormacionSolicitud.setColumns(10);
		txtFormacionSolicitud.setBounds(381, 172, 135, 22);
		panel.add(txtFormacionSolicitud);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Expiracion Public.");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2_1_2.setBounds(526, 172, 118, 22);
		panel.add(lblNewLabel_2_1_2);
		
		FechaPublicacion = new JDateChooser();
		FechaPublicacion.setBounds(125, 174, 135, 20);
		panel.add(FechaPublicacion);
		
		FechaExpiracion = new JDateChooser();
		FechaExpiracion.setBounds(624, 174, 114, 20);
		panel.add(FechaExpiracion);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("URL Publicacion ext.");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(10, 205, 135, 22);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("URL Publicaci\u00F3n int.");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(391, 205, 145, 22);
		panel.add(lblNewLabel_1_2_2);
		
		txtURLExt = new JTextField();
		txtURLExt.setColumns(10);
		txtURLExt.setBounds(125, 205, 260, 22);
		panel.add(txtURLExt);
		
		txtURLInt = new JTextField();
		txtURLInt.setColumns(10);
		txtURLInt.setBounds(505, 205, 233, 22);
		panel.add(txtURLInt);
		
		JLabel lblNewLabel_4 = new JLabel("Solicitudes aceptadas por:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 238, 197, 22);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre de la Empresa");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 264, 183, 22);
		panel.add(lblNewLabel_5);
		
		txtNombreEmpresa = new JTextField();
		txtNombreEmpresa.setBounds(155, 265, 224, 22);
		panel.add(txtNombreEmpresa);
		txtNombreEmpresa.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Descripci\u00F3n del Puesto:");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 325, 183, 22);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Rol y responsabilidades");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 356, 271, 22);
		panel.add(lblNewLabel_7);
		
		txtRolResponsabilidades = new JEditorPane();
		txtRolResponsabilidades.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtRolResponsabilidades.setBounds(10, 382, 728, 54);
		panel.add(txtRolResponsabilidades);
		
		JLabel lblNewLabel_8 = new JLabel("Requisitos de Cualificaci\u00F3n y Formaci\u00F3n");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(10, 445, 250, 21);
		panel.add(lblNewLabel_8);
		
		txtReqCualifFormacion = new JTextField();
		txtReqCualifFormacion.setBounds(245, 447, 493, 22);
		panel.add(txtReqCualifFormacion);
		txtReqCualifFormacion.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Aptitudes deseables");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(10, 477, 250, 22);
		panel.add(lblNewLabel_9);
		
		txtAptitudesDeseables = new JTextField();
		txtAptitudesDeseables.setColumns(10);
		txtAptitudesDeseables.setBounds(245, 478, 493, 22);
		panel.add(txtAptitudesDeseables);
		
		JLabel lblNewLabel_9_1 = new JLabel("Notas Adicionales");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_9_1.setBounds(10, 510, 250, 22);
		panel.add(lblNewLabel_9_1);
		
		txtNotasAdicionales = new JTextField();
		txtNotasAdicionales.setColumns(10);
		txtNotasAdicionales.setBounds(245, 511, 493, 22);
		panel.add(txtNotasAdicionales);
		
		JLabel lblNewLabel_10 = new JLabel("Revisado Por");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(10, 568, 183, 22);
		panel.add(lblNewLabel_10);
		
		txtRevisadoPor = new JTextField();
		txtRevisadoPor.setBounds(165, 568, 271, 21);
		panel.add(txtRevisadoPor);
		txtRevisadoPor.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Fecha Revisado");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(471, 569, 105, 21);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Aprobado Por");
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(10, 600, 126, 22);
		panel.add(lblNewLabel_12);
		
		FechaRevisado = new JDateChooser();
		FechaRevisado.setBounds(600, 568, 138, 20);
		panel.add(FechaRevisado);
		
		JLabel lblNewLabel_10_1 = new JLabel("Ultima Actualizaci\u00F3n por");
		lblNewLabel_10_1.setForeground(Color.WHITE);
		lblNewLabel_10_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_10_1.setBounds(10, 633, 183, 22);
		panel.add(lblNewLabel_10_1);
		
		txtAprobadoPor = new JTextField();
		txtAprobadoPor.setColumns(10);
		txtAprobadoPor.setBounds(165, 601, 271, 21);
		panel.add(txtAprobadoPor);
		
		JLabel lblNewLabel_11_1 = new JLabel("Fecha Aprobado");
		lblNewLabel_11_1.setForeground(Color.WHITE);
		lblNewLabel_11_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_11_1.setBounds(471, 601, 105, 21);
		panel.add(lblNewLabel_11_1);
		
		FechaAprobado = new JDateChooser();
		FechaAprobado.setBounds(600, 600, 138, 20);
		panel.add(FechaAprobado);
		
		txtUltimaActualizacion = new JTextField();
		txtUltimaActualizacion.setColumns(10);
		txtUltimaActualizacion.setBounds(165, 634, 271, 21);
		panel.add(txtUltimaActualizacion);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("Fecha de Actualizacion");
		lblNewLabel_11_1_1.setForeground(Color.WHITE);
		lblNewLabel_11_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_11_1_1.setBounds(471, 634, 135, 21);
		panel.add(lblNewLabel_11_1_1);
		
		FechaActualizacion = new JDateChooser();
		FechaActualizacion.setBounds(600, 633, 138, 20);
		panel.add(FechaActualizacion);
		
		JLabel lblNewLabel_5_1 = new JLabel("Direcci\u00F3n");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(391, 264, 95, 22);
		panel.add(lblNewLabel_5_1);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(496, 265, 242, 22);
		panel.add(txtDireccion);
		
		JLabel lblNewLabel_5_2 = new JLabel("Fax o Correo Electr\u00F3nico");
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_5_2.setBounds(10, 297, 183, 22);
		panel.add(lblNewLabel_5_2);
		
		txtFaxCorreo = new JTextField();
		txtFaxCorreo.setColumns(10);
		txtFaxCorreo.setBounds(155, 298, 224, 22);
		panel.add(txtFaxCorreo);
		
		JLabel lblNewLabel_5_3 = new JLabel("C\u00F3digo Postal");
		lblNewLabel_5_3.setForeground(Color.WHITE);
		lblNewLabel_5_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_5_3.setBounds(391, 297, 105, 22);
		panel.add(lblNewLabel_5_3);
		
		txtCodPostal = new JTextField();
		txtCodPostal.setColumns(10);
		txtCodPostal.setBounds(496, 298, 242, 22);
		panel.add(txtCodPostal);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 550, 748, 12);
		panel.add(separator);
		
		btnGuardar = new StandarButton((String) null);
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(628, 677, 110, 30);
		btnGuardar.addActionListener(cap);
		panel.add(btnGuardar);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(0, 733, 748, 12);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(0, 740, 748, 12);
		panel.add(separator_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 845, 728, 200);
		panel.add(scrollPane_1);
		
		table = new TableStandard();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String columns[] = new String[] {
			"Id",
			"Puesto",
			"Categoria",
			"Cod. Puesto",
			"Viaja",
			"Rango de Salario",
			"Tipo de posicion",
			"Nombre de la empresa",
			"Revisado por",
			"Aprobado por"
		};
		table.setColums(columns);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setPreferredWidth(140);
		table.getColumnModel().getColumn(2).setPreferredWidth(120);
		table.getColumnModel().getColumn(3).setPreferredWidth(90);
		table.getColumnModel().getColumn(4).setPreferredWidth(70);
		table.getColumnModel().getColumn(5).setPreferredWidth(120);
		table.getColumnModel().getColumn(6).setPreferredWidth(140);
		table.getColumnModel().getColumn(7).setPreferredWidth(250);
		table.getColumnModel().getColumn(8).setPreferredWidth(140);
		table.getColumnModel().getColumn(9).setPreferredWidth(140);
		
		scrollPane_1.setViewportView(table);
		
		LabelSubtitulos lblsbtlsListado = new LabelSubtitulos((String) null);
		lblsbtlsListado.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsListado.setText("Listado");
		lblsbtlsListado.setBounds(0, 785, 748, 23);
		panel.add(lblsbtlsListado);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(10, 1080, 105, 30);
		btnModificar.addActionListener(cap);
		panel.add(btnModificar);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(140, 1080, 105, 30);
		btnEliminar.addActionListener(cap);
		panel.add(btnEliminar);
		
		btnVerTodosLos = new StandarButton((String) null);
		btnVerTodosLos.setText("Ver todos los Datos");
		btnVerTodosLos.setBounds(273, 1080, 150, 30);
		btnVerTodosLos.addActionListener(cap);
		panel.add(btnVerTodosLos);
		
		btnImprimir = new StandarButton((String) null);
		btnImprimir.setText("Imprimir");
		btnImprimir.setBounds(445, 1080, 126, 30);
		btnImprimir.addActionListener(cap);
		panel.add(btnImprimir);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setBounds(10, 683, 86, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		txtId.setVisible(false);
		
		btnVaciarCampos = new StandarButton((String) null);
		btnVaciarCampos.setText("Vaciar Campos");
		btnVaciarCampos.setBounds(463, 677, 143, 30);
		btnVaciarCampos.addActionListener(cap);
		panel.add(btnVaciarCampos);
		
		ActualizarVista();
		
	}
	
	public void VaciarForm() {
		
		txtPuesto.setText("");
		txtCategoria.setText("");
		txtDptoGrupo.setText("");
		txtCodPuesto.setText("");
		txtUbicacion.setText("");
		comboBoxNecesarioViajar.setSelectedIndex(0);
		txtRangoSalario.setText("");
		comboBoxTipoPosicion.setSelectedIndex(0);
		txtContactoRRHH.setText("");
		FechaPublicacion.setCalendar(null);
		txtFormacionSolicitud.setText("");
		FechaExpiracion.setCalendar(null);
		txtURLExt.setText("");
		txtURLInt.setText("");
		txtNombreEmpresa.setText("");
		txtDireccion.setText("");
		txtFaxCorreo.setText("");
		txtCodPostal.setText("");
		txtRolResponsabilidades.setText("");
		txtReqCualifFormacion.setText("");
		txtAptitudesDeseables.setText("");
		txtNotasAdicionales.setText("");
		txtRevisadoPor.setText("");
		FechaRevisado.setCalendar(null);
		txtAprobadoPor.setText("");
		FechaAprobado.setCalendar(null);
		txtUltimaActualizacion.setText("");
		FechaActualizacion.setCalendar(null);
		txtId.setText("");
		
	}
	
	public void ActualizarVista() {
		VaciarForm();
		cap.LlenarTabla();
		
	}
	
	
	public boolean camposVacios() {
		
		if(txtPuesto.getText().length() <= 0) {
			return false;
		}else if(txtCategoria.getText().length() <= 0) {
			return false;
		}else if(txtDptoGrupo.getText().length() <= 0) {
			return false;
		}else if(txtCodPuesto.getText().length() <= 0) {
			return false;
		}else if(txtUbicacion.getText().length() <= 0) {
			return false;
		}else if(txtRangoSalario.getText().length() <= 0) {
			return false;
		}else if(txtContactoRRHH.getText().length() <= 0) {
			return false;
		}else if(FechaPublicacion.getCalendar() == null) {
			return false;
		}else if(txtFormacionSolicitud.getText().length() <= 0) {
			return false;
		}else if(FechaExpiracion.getCalendar() == null) {
			return false;
		}else if(txtURLExt.getText().length() <= 0) {
			return false;
		}else if(txtURLInt.getText().length() <= 0) {
			return false;
		}else if(txtNombreEmpresa.getText().length() <= 0) {
			return false;
		}else if(txtDireccion.getText().length() <= 0) {
			return false;
		}else if(txtFaxCorreo.getText().length() <= 0) {
			return false;
		}else if(txtCodPostal.getText().length() <= 0) {
			return false;
		}else if(txtRolResponsabilidades.getText().length() <= 0) {
			return false;
		}else if(txtReqCualifFormacion.getText().length() <= 0) {
			return false;
		}else if(txtAptitudesDeseables.getText().length() <= 0) {
			return false;
		}else if(txtNotasAdicionales.getText().length() <= 0) {
			return false;
		}else if(txtRevisadoPor.getText().length() <= 0) {
			return false;
		}else if(txtAprobadoPor.getText().length() <= 0) {
			return false;
		}else if(txtUltimaActualizacion.getText().length() <= 0) {
			return false;
		}else if(FechaRevisado.getCalendar() == null) {
			return false;
		}else if(FechaAprobado.getCalendar() == null) {
			return false;
		}else if(FechaActualizacion.getCalendar() == null) {
			return false;
		}
		
		return true;
	}
	
	public void CargarForm(AplicacionPresupuestoEntity ape) {
	
		txtId.setText(""+ape.getId());
		
		txtPuesto.setText(ape.getPuesto());
		txtCategoria.setText(ape.getCategoria());
		txtDptoGrupo.setText(ape.getDptoGrupo());
		txtCodPuesto.setText(ape.getCodPuesto());
		txtUbicacion.setText(ape.getUbicacion());
		comboBoxNecesarioViajar.setSelectedIndex(ape.getNecesarioViajar());
		txtRangoSalario.setText(ape.getRangoSalario());
		comboBoxTipoPosicion.setSelectedIndex(ape.getTipoPosicion());
		txtContactoRRHH.setText(ape.getContactoRRHH());
		FechaPublicacion.setCalendar(ape.getFechaPublicacion());
		txtFormacionSolicitud.setText(ape.getFormatoSolicitud());
		FechaExpiracion.setCalendar(ape.getFechaExpiracion());
		txtURLExt.setText(ape.getURLExt());
		txtURLInt.setText(ape.getURLInt());
		txtNombreEmpresa.setText(ape.getNombreEmpresa());
		txtDireccion.setText(ape.getDireccion());
		txtFaxCorreo.setText(ape.getFaxCorreo());
		txtCodPostal.setText(ape.getCodigoPostal());
		txtRolResponsabilidades.setText(ape.getRolResponsabilidad());
		txtReqCualifFormacion.setText(ape.getRequisitosCualifFormacion());
		txtAptitudesDeseables.setText(ape.getAptitudesDeseables());
		txtNotasAdicionales.setText(ape.getNotasAdicionales());
		txtRevisadoPor.setText(ape.getRevisadoPor());
		txtAprobadoPor.setText(ape.getAprobadoPor());
		txtUltimaActualizacion.setText(ape.getUltimaActuaPor());
		FechaRevisado.setCalendar(ape.getFechaRevisado());
		FechaAprobado.setCalendar(ape.getFechaAprobado());
		FechaActualizacion.setCalendar(ape.getFechaActualizacion());
		
	}
	
	public void VerTodosDatos(AplicacionPresupuestoEntity ape) {
		
		txtPuesto.setText(ape.getPuesto());
		txtCategoria.setText(ape.getCategoria());
		txtDptoGrupo.setText(ape.getDptoGrupo());
		txtCodPuesto.setText(ape.getCodPuesto());
		txtUbicacion.setText(ape.getUbicacion());
		comboBoxNecesarioViajar.setSelectedIndex(ape.getNecesarioViajar());
		txtRangoSalario.setText(ape.getRangoSalario());
		comboBoxTipoPosicion.setSelectedIndex(ape.getTipoPosicion());
		txtContactoRRHH.setText(ape.getContactoRRHH());
		FechaPublicacion.setCalendar(ape.getFechaPublicacion());
		txtFormacionSolicitud.setText(ape.getFormatoSolicitud());
		FechaExpiracion.setCalendar(ape.getFechaExpiracion());
		txtURLExt.setText(ape.getURLExt());
		txtURLInt.setText(ape.getURLInt());
		txtNombreEmpresa.setText(ape.getNombreEmpresa());
		txtDireccion.setText(ape.getDireccion());
		txtFaxCorreo.setText(ape.getFaxCorreo());
		txtCodPostal.setText(ape.getCodigoPostal());
		txtRolResponsabilidades.setText(ape.getRolResponsabilidad());
		txtReqCualifFormacion.setText(ape.getRequisitosCualifFormacion());
		txtAptitudesDeseables.setText(ape.getAptitudesDeseables());
		txtNotasAdicionales.setText(ape.getNotasAdicionales());
		txtRevisadoPor.setText(ape.getRevisadoPor());
		txtAprobadoPor.setText(ape.getAprobadoPor());
		txtUltimaActualizacion.setText(ape.getUltimaActuaPor());
		FechaRevisado.setCalendar(ape.getFechaRevisado());
		FechaAprobado.setCalendar(ape.getFechaAprobado());
		FechaActualizacion.setCalendar(ape.getFechaActualizacion());
		
		
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


	public void setBtnModificar(StandarButton btnModificar) {
		this.btnModificar = btnModificar;
	}


	public void setBtnEliminar(StandarButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}


	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}


	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}


	public JTextField getTxtId() {
		return txtId;
	}


	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}


	public JTextField getTxtPuesto() {
		return txtPuesto;
	}


	public JTextField getTxtCategoria() {
		return txtCategoria;
	}


	public JTextField getTxtDptoGrupo() {
		return txtDptoGrupo;
	}


	public JTextField getTxtCodPuesto() {
		return txtCodPuesto;
	}


	public JTextField getTxtUbicacion() {
		return txtUbicacion;
	}


	public JTextField getTxtRangoSalario() {
		return txtRangoSalario;
	}


	public JTextField getTxtContactoRRHH() {
		return txtContactoRRHH;
	}


	public JTextField getTxtFormacionSolicitud() {
		return txtFormacionSolicitud;
	}


	public JTextField getTxtURLInt() {
		return txtURLInt;
	}


	public JTextField getTxtNombreEmpresa() {
		return txtNombreEmpresa;
	}


	public JTextField getTxtReqCualifFormacion() {
		return txtReqCualifFormacion;
	}


	public JTextField getTxtAptitudesDeseables() {
		return txtAptitudesDeseables;
	}


	public JTextField getTxtNotasAdicionales() {
		return txtNotasAdicionales;
	}


	public JTextField getTxtRevisadoPor() {
		return txtRevisadoPor;
	}


	public JTextField getTxtAprobadoPor() {
		return txtAprobadoPor;
	}


	public JTextField getTxtUltimaActualizacion() {
		return txtUltimaActualizacion;
	}


	public JTextField getTxtDireccion() {
		return txtDireccion;
	}


	public JTextField getTxtFaxCorreo() {
		return txtFaxCorreo;
	}


	public JTextField getTxtCodPostal() {
		return txtCodPostal;
	}


	public TableStandard getTable() {
		return table;
	}


	public JComboBox getComboBoxNecesarioViajar() {
		return comboBoxNecesarioViajar;
	}


	public JComboBox getComboBoxTipoPosicion() {
		return comboBoxTipoPosicion;
	}


	public JTextField getTxtURLExt() {
		return txtURLExt;
	}


	public JEditorPane getTxtRolResponsabilidades() {
		return txtRolResponsabilidades;
	}


	public JDateChooser getFechaRevisado() {
		return FechaRevisado;
	}


	public JDateChooser getFechaAprobado() {
		return FechaAprobado;
	}


	public JDateChooser getFechaActualizacion() {
		return FechaActualizacion;
	}


	public JDateChooser getFechaPublicacion() {
		return FechaPublicacion;
	}


	public JDateChooser getFechaExpiracion() {
		return FechaExpiracion;
	}


	public void setTxtPuesto(JTextField txtPuesto) {
		this.txtPuesto = txtPuesto;
	}


	public void setTxtCategoria(JTextField txtCategoria) {
		this.txtCategoria = txtCategoria;
	}


	public void setTxtDptoGrupo(JTextField txtDptoGrupo) {
		this.txtDptoGrupo = txtDptoGrupo;
	}


	public void setTxtCodPuesto(JTextField txtCodPuesto) {
		this.txtCodPuesto = txtCodPuesto;
	}


	public void setTxtUbicacion(JTextField txtUbicacion) {
		this.txtUbicacion = txtUbicacion;
	}


	public void setTxtRangoSalario(JTextField txtRangoSalario) {
		this.txtRangoSalario = txtRangoSalario;
	}


	public void setTxtContactoRRHH(JTextField txtContactoRRHH) {
		this.txtContactoRRHH = txtContactoRRHH;
	}


	public void setTxtFormacionSolicitud(JTextField txtFormacionSolicitud) {
		this.txtFormacionSolicitud = txtFormacionSolicitud;
	}


	public void setTxtURLInt(JTextField txtURLInt) {
		this.txtURLInt = txtURLInt;
	}


	public void setTxtNombreEmpresa(JTextField txtNombreEmpresa) {
		this.txtNombreEmpresa = txtNombreEmpresa;
	}


	public void setTxtReqCualifFormacion(JTextField txtReqCualifFormacion) {
		this.txtReqCualifFormacion = txtReqCualifFormacion;
	}


	public void setTxtAptitudesDeseables(JTextField txtAptitudesDeseables) {
		this.txtAptitudesDeseables = txtAptitudesDeseables;
	}


	public void setTxtNotasAdicionales(JTextField txtNotasAdicionales) {
		this.txtNotasAdicionales = txtNotasAdicionales;
	}


	public void setTxtRevisadoPor(JTextField txtRevisadoPor) {
		this.txtRevisadoPor = txtRevisadoPor;
	}


	public void setTxtAprobadoPor(JTextField txtAprobadoPor) {
		this.txtAprobadoPor = txtAprobadoPor;
	}


	public void setTxtUltimaActualizacion(JTextField txtUltimaActualizacion) {
		this.txtUltimaActualizacion = txtUltimaActualizacion;
	}


	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}


	public void setTxtFaxCorreo(JTextField txtFaxCorreo) {
		this.txtFaxCorreo = txtFaxCorreo;
	}


	public void setTxtCodPostal(JTextField txtCodPostal) {
		this.txtCodPostal = txtCodPostal;
	}


	public void setTable(TableStandard table) {
		this.table = table;
	}


	public void setComboBoxNecesarioViajar(JComboBox comboBoxNecesarioViajar) {
		this.comboBoxNecesarioViajar = comboBoxNecesarioViajar;
	}


	public void setComboBoxTipoPosicion(JComboBox comboBoxTipoPosicion) {
		this.comboBoxTipoPosicion = comboBoxTipoPosicion;
	}


	public void setTxtURLExt(JTextField txtURLExt) {
		this.txtURLExt = txtURLExt;
	}


	public void setTxtRolResponsabilidades(JEditorPane txtRolResponsabilidades) {
		this.txtRolResponsabilidades = txtRolResponsabilidades;
	}


	public void setFechaRevisado(JDateChooser fechaRevisado) {
		FechaRevisado = fechaRevisado;
	}


	public void setFechaAprobado(JDateChooser fechaAprobado) {
		FechaAprobado = fechaAprobado;
	}


	public void setFechaActualizacion(JDateChooser fechaActualizacion) {
		FechaActualizacion = fechaActualizacion;
	}


	public void setFechaPublicacion(JDateChooser fechaPublicacion) {
		FechaPublicacion = fechaPublicacion;
	}


	public void setFechaExpiracion(JDateChooser fechaExpiracion) {
		FechaExpiracion = fechaExpiracion;
	}

	public StandarButton getBtnVerTodosLos() {
		return btnVerTodosLos;
	}

	public StandarButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnVerTodosLos(StandarButton btnVerTodosLos) {
		this.btnVerTodosLos = btnVerTodosLos;
	}

	public void setBtnImprimir(StandarButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public StandarButton getBtnVaciarCampos() {
		return btnVaciarCampos;
	}

	public void setBtnVaciarCampos(StandarButton btnVaciarCampos) {
		this.btnVaciarCampos = btnVaciarCampos;
	}
}
