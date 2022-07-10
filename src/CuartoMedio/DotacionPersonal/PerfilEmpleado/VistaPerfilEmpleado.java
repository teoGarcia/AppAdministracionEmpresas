package CuartoMedio.DotacionPersonal.PerfilEmpleado;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;

import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import ui.Buttons.StandarButton;
import ui.Labels.LabelSubtitulos;
import ui.TablaUi.TableStandard;

public class VistaPerfilEmpleado extends JPanel {
	
	private ControlPerfilEmpleado cpe;
	
	private JTextField txtSede;
	private JTextField txtNivel;
	private JTextField txtCodigo;
	private JTextField txtDependencia;
	private JTextField txtDedicacion;
	private JTextField txtGrupoOcasional;
	private JTextField txtDenominacionEmpleo;
	private JTextField txtGrado;
	private JTextField txtCargoJefeInmediato;
	private JTextField txtClaseCargo;

	private TableStandard table;

	private StandarButton btnModificar;

	private StandarButton btnEliminar;

	private StandarButton btnVerTodosLos;

	private StandarButton btnImprimir;

	private JTextField txtId;
	private JEditorPane txtPropositoPrincipal;
	private JEditorPane txtFuncionesEsenciales;
	private JEditorPane txtCriterioDesempeno;
	private JEditorPane txtConocBasicos;
	private JEditorPane txtOrganizacionales;
	private JEditorPane txtIndividual;
	private StandarButton btnVaciarCampos;
	private StandarButton btnGuardar;

	/**
	 * Create the panel.
	 */
	public VistaPerfilEmpleado() {
		
		cpe = new ControlPerfilEmpleado(this);
		
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
		
		JLabel lblNewLabel = new JLabel("Perfil del empleado");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 30, 747, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sede");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 111, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nivel");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 141, 46, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Denominaci\u00F3n del empleo");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(368, 144, 176, 14);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("C\u00F3digo");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 171, 46, 14);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Grado");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(368, 175, 46, 14);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Dependencia");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_5.setBounds(10, 201, 154, 14);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Cargo del Jefe Inmediato");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1.setBounds(368, 206, 176, 14);
		panel.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Dedicaci\u00F3n");
		lblNewLabel_1_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_2.setBounds(10, 231, 92, 14);
		panel.add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("Clase de cargo");
		lblNewLabel_1_4_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_2_1.setBounds(368, 237, 92, 14);
		panel.add(lblNewLabel_1_4_2_1);
		
		JLabel lblNewLabel_1_4_2_2 = new JLabel("Grupo Ocasional");
		lblNewLabel_1_4_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_2_2.setBounds(10, 261, 105, 14);
		panel.add(lblNewLabel_1_4_2_2);
		
		txtSede = new JTextField();
		txtSede.setBounds(148, 111, 590, 20);
		panel.add(txtSede);
		txtSede.setColumns(10);
		
		txtNivel = new JTextField();
		txtNivel.setColumns(10);
		txtNivel.setBounds(148, 141, 210, 20);
		panel.add(txtNivel);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(148, 171, 210, 20);
		panel.add(txtCodigo);
		
		txtDependencia = new JTextField();
		txtDependencia.setColumns(10);
		txtDependencia.setBounds(148, 201, 210, 20);
		panel.add(txtDependencia);
		
		txtDedicacion = new JTextField();
		txtDedicacion.setColumns(10);
		txtDedicacion.setBounds(148, 231, 210, 20);
		panel.add(txtDedicacion);
		
		txtGrupoOcasional = new JTextField();
		txtGrupoOcasional.setColumns(10);
		txtGrupoOcasional.setBounds(148, 261, 590, 20);
		panel.add(txtGrupoOcasional);
		
		txtDenominacionEmpleo = new JTextField();
		txtDenominacionEmpleo.setColumns(10);
		txtDenominacionEmpleo.setBounds(527, 141, 211, 20);
		panel.add(txtDenominacionEmpleo);
		
		txtGrado = new JTextField();
		txtGrado.setColumns(10);
		txtGrado.setBounds(527, 171, 211, 20);
		panel.add(txtGrado);
		
		txtCargoJefeInmediato = new JTextField();
		txtCargoJefeInmediato.setColumns(10);
		txtCargoJefeInmediato.setBounds(527, 201, 211, 20);
		panel.add(txtCargoJefeInmediato);
		
		txtClaseCargo = new JTextField();
		txtClaseCargo.setColumns(10);
		txtClaseCargo.setBounds(527, 231, 211, 20);
		panel.add(txtClaseCargo);
		
		JLabel lblNewLabel_2 = new JLabel("I. Identificaci\u00F3n del cargo");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 80, 269, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("II. Prop\u00F3sito principal");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(10, 292, 269, 20);
		panel.add(lblNewLabel_2_1);
		
		txtPropositoPrincipal = new JEditorPane();
		txtPropositoPrincipal.setBounds(10, 319, 728, 40);
		panel.add(txtPropositoPrincipal);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("III. Funciones Esenciales");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(10, 365, 269, 20);
		panel.add(lblNewLabel_2_1_1);
		
		txtFuncionesEsenciales = new JEditorPane();
		txtFuncionesEsenciales.setBounds(10, 392, 728, 40);
		panel.add(txtFuncionesEsenciales);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("IV. Criterios de desempe\u00F1o");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2.setBounds(10, 440, 269, 20);
		panel.add(lblNewLabel_2_1_2);
		
		txtCriterioDesempeno = new JEditorPane();
		txtCriterioDesempeno.setBounds(10, 467, 728, 40);
		panel.add(txtCriterioDesempeno);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("V. Conocimientos Basicos o Esenciales");
		lblNewLabel_2_1_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3.setBounds(10, 515, 269, 20);
		panel.add(lblNewLabel_2_1_3);
		
		txtConocBasicos = new JEditorPane();
		txtConocBasicos.setBounds(10, 542, 728, 40);
		panel.add(txtConocBasicos);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("VI. Competencias");
		lblNewLabel_2_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3_1.setBounds(10, 592, 269, 20);
		panel.add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Organizacionales");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(43, 617, 349, 14);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Individuales: Nivel-Area");
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBounds(398, 618, 349, 14);
		panel.add(lblNewLabel_1_2_1_1);
		
		txtOrganizacionales = new JEditorPane();
		txtOrganizacionales.setBounds(10, 642, 370, 39);
		panel.add(txtOrganizacionales);
		
		txtIndividual = new JEditorPane();
		txtIndividual.setBounds(398, 642, 340, 39);
		panel.add(txtIndividual);
		
		btnGuardar = new StandarButton((String) null);
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(634, 698, 105, 30);
		btnGuardar.addActionListener(cpe);
		panel.add(btnGuardar);
		
		btnVaciarCampos = new StandarButton((String) null);
		btnVaciarCampos.setText("Vaciar Campos");
		btnVaciarCampos.setBounds(495, 698, 125, 30);
		btnVaciarCampos.addActionListener(cpe);
		panel.add(btnVaciarCampos);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(0, 745, 748, 12);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(0, 752, 748, 12);
		panel.add(separator_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 845, 728, 200);
		panel.add(scrollPane_1);
		
		table = new TableStandard();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		String columns[] = new String[] {
			"Id",
			"Codigo",
			"Denominacion Empleo",
			"Sede",
			"Nivel",
			"Clase de Cargo",
			"Cargo del jefe inmediato"
				
		};
		table.setColums(columns);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(170);
		table.getColumnModel().getColumn(3).setPreferredWidth(170);
		table.getColumnModel().getColumn(4).setPreferredWidth(120);
		table.getColumnModel().getColumn(5).setPreferredWidth(170);
		table.getColumnModel().getColumn(6).setPreferredWidth(170);
		
		scrollPane_1.setViewportView(table);
		
		LabelSubtitulos lblsbtlsListado = new LabelSubtitulos((String) null);
		lblsbtlsListado.setHorizontalAlignment(SwingConstants.CENTER);
		lblsbtlsListado.setText("Listado");
		lblsbtlsListado.setBounds(0, 785, 748, 23);
		panel.add(lblsbtlsListado);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(10, 1080, 105, 30);
		btnModificar.addActionListener(cpe);
		panel.add(btnModificar);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(140, 1080, 105, 30);
		btnEliminar.addActionListener(cpe);
		panel.add(btnEliminar);
		
		btnVerTodosLos = new StandarButton((String) null);
		btnVerTodosLos.setText("Ver todos los Datos");
		btnVerTodosLos.setBounds(273, 1080, 150, 30);
		btnVerTodosLos.addActionListener(cpe);
		panel.add(btnVerTodosLos);
		
		btnImprimir = new StandarButton((String) null);
		btnImprimir.setText("Imprimir");
		btnImprimir.setBounds(445, 1080, 126, 30);
		btnImprimir.addActionListener(cpe);
		panel.add(btnImprimir);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setBounds(10, 690, 86, 20);
		txtId.setColumns(10);
		panel.add(txtId);
		txtId.setVisible(false);
		
		ActualizarVista();
		

	}
	
	public void VaciarForm() {
		
		txtSede.setText("");
		txtNivel.setText("");
		txtDenominacionEmpleo.setText("");
		txtCodigo.setText("");
		txtGrado.setText("");
		txtDependencia.setText("");
		txtCargoJefeInmediato.setText("");
		txtDedicacion.setText("");
		txtClaseCargo.setText("");
		txtGrupoOcasional.setText("");
		txtPropositoPrincipal.setText("");
		txtFuncionesEsenciales.setText("");
		txtCriterioDesempeno.setText("");
		txtConocBasicos.setText("");
		txtOrganizacionales.setText("");
		txtIndividual.setText("");
		
		txtId.setText("");
		
	}
	
	public void ActualizarVista() {
		VaciarForm();
		cpe.LlenarTabla();
		
	}
	
	
	public boolean camposVacios() {
		
		if(txtSede.getText().length() <= 0) {
			return false;
		}else if(txtNivel.getText().length() <= 0) {
			return false;
		}else if(txtDenominacionEmpleo.getText().length() <= 0) {
			return false;
		}else if(txtCodigo.getText().length() <= 0) {
			return false;
		}else if(txtGrado.getText().length() <= 0) {
			return false;
		}else if(txtDependencia.getText().length() <= 0) {
			return false;
		}else if(txtCargoJefeInmediato.getText().length() <= 0) {
			return false;
		}else if(txtDedicacion.getText().length() <= 0) {
			return false;
		}else if(txtClaseCargo.getText().length() <= 0) {
			return false;
		}else if(txtGrupoOcasional.getText().length() <= 0) {
			return false;
		}else if(txtPropositoPrincipal.getText().length() <= 0) {
			return false;
		}else if(txtFuncionesEsenciales.getText().length() <= 0) {
			return false;
		}else if(txtCriterioDesempeno.getText().length() <= 0) {
			return false;
		}else if(txtConocBasicos.getText().length() <= 0) {
			return false;
		}else if(txtOrganizacionales.getText().length() <= 0) {
			return false;
		}else if(txtIndividual.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	public void CargarForm(PerfilEmpleadoEntity pee) {
	
		txtId.setText(""+pee.getId());
		
		txtSede.setText(pee.getSede());
		txtNivel.setText(pee.getNivel());
		txtDenominacionEmpleo.setText(pee.getDenominacionEmpleo());
		txtCodigo.setText(pee.getCodigo());
		txtGrado.setText(pee.getGrado());
		txtDependencia.setText(pee.getDependencia());
		txtCargoJefeInmediato.setText(pee.getCargoJefeInmediato());
		txtDedicacion.setText(pee.getDedicacion());
		txtClaseCargo.setText(pee.getClaseCargo());
		txtGrupoOcasional.setText(pee.getGrupoOcasional());
		txtPropositoPrincipal.setText(pee.getPropositoPrincipal());
		txtFuncionesEsenciales.setText(pee.getFuncionesEsenciales());
		txtCriterioDesempeno.setText(pee.getCriteriosDesempeño());
		txtConocBasicos.setText(pee.getConocimientosBasicos());
		txtOrganizacionales.setText(pee.getOrganizacionales());
		txtIndividual.setText(pee.getIndividuales());
		
	}
	
	public void VerTodosDatos(PerfilEmpleadoEntity pee) {
		
		txtSede.setText(pee.getSede());
		txtNivel.setText(pee.getNivel());
		txtDenominacionEmpleo.setText(pee.getDenominacionEmpleo());
		txtCodigo.setText(pee.getCodigo());
		txtGrado.setText(pee.getGrado());
		txtDependencia.setText(pee.getDependencia());
		txtCargoJefeInmediato.setText(pee.getCargoJefeInmediato());
		txtDedicacion.setText(pee.getDedicacion());
		txtClaseCargo.setText(pee.getClaseCargo());
		txtGrupoOcasional.setText(pee.getGrupoOcasional());
		txtPropositoPrincipal.setText(pee.getPropositoPrincipal());
		txtFuncionesEsenciales.setText(pee.getFuncionesEsenciales());
		txtCriterioDesempeno.setText(pee.getCriteriosDesempeño());
		txtConocBasicos.setText(pee.getConocimientosBasicos());
		txtOrganizacionales.setText(pee.getOrganizacionales());
		txtIndividual.setText(pee.getIndividuales());
		
		
	}
	
	


	
	public DefaultTableModel getModel() {
		return table.getModel();
	}

	public JTextField getTxtSede() {
		return txtSede;
	}

	public JTextField getTxtNivel() {
		return txtNivel;
	}

	public JTextField getTxtCodigo() {
		return txtCodigo;
	}

	public JTextField getTxtDependencia() {
		return txtDependencia;
	}

	public JTextField getTxtDedicacion() {
		return txtDedicacion;
	}

	public JTextField getTxtGrupoOcasional() {
		return txtGrupoOcasional;
	}

	public JTextField getTxtDenominacionEmpleo() {
		return txtDenominacionEmpleo;
	}

	public JTextField getTxtGrado() {
		return txtGrado;
	}

	public JTextField getTxtCargoJefeInmediato() {
		return txtCargoJefeInmediato;
	}

	public JTextField getTxtClaseCargo() {
		return txtClaseCargo;
	}

	public TableStandard getTable() {
		return table;
	}

	public StandarButton getBtnModificar() {
		return btnModificar;
	}

	public StandarButton getBtnEliminar() {
		return btnEliminar;
	}

	public StandarButton getBtnVerTodosLos() {
		return btnVerTodosLos;
	}

	public StandarButton getBtnImprimir() {
		return btnImprimir;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public JEditorPane getTxtPropositoPrincipal() {
		return txtPropositoPrincipal;
	}

	public JEditorPane getTxtFuncionesEsenciales() {
		return txtFuncionesEsenciales;
	}

	public JEditorPane getTxtCriterioDesempeno() {
		return txtCriterioDesempeno;
	}

	public JEditorPane getTxtConocBasicos() {
		return txtConocBasicos;
	}

	public JEditorPane getTxtOrganizacionales() {
		return txtOrganizacionales;
	}

	public JEditorPane getTxtIndividual() {
		return txtIndividual;
	}

	public StandarButton getBtnVaciarCampos() {
		return btnVaciarCampos;
	}

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setTxtSede(JTextField txtSede) {
		this.txtSede = txtSede;
	}

	public void setTxtNivel(JTextField txtNivel) {
		this.txtNivel = txtNivel;
	}

	public void setTxtCodigo(JTextField txtCodigo) {
		this.txtCodigo = txtCodigo;
	}

	public void setTxtDependencia(JTextField txtDependencia) {
		this.txtDependencia = txtDependencia;
	}

	public void setTxtDedicacion(JTextField txtDedicacion) {
		this.txtDedicacion = txtDedicacion;
	}

	public void setTxtGrupoOcasional(JTextField txtGrupoOcasional) {
		this.txtGrupoOcasional = txtGrupoOcasional;
	}

	public void setTxtDenominacionEmpleo(JTextField txtDenominacionEmpleo) {
		this.txtDenominacionEmpleo = txtDenominacionEmpleo;
	}

	public void setTxtGrado(JTextField txtGrado) {
		this.txtGrado = txtGrado;
	}

	public void setTxtCargoJefeInmediato(JTextField txtCargoJefeInmediato) {
		this.txtCargoJefeInmediato = txtCargoJefeInmediato;
	}

	public void setTxtClaseCargo(JTextField txtClaseCargo) {
		this.txtClaseCargo = txtClaseCargo;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public void setBtnModificar(StandarButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public void setBtnEliminar(StandarButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public void setBtnVerTodosLos(StandarButton btnVerTodosLos) {
		this.btnVerTodosLos = btnVerTodosLos;
	}

	public void setBtnImprimir(StandarButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public void setTxtPropositoPrincipal(JEditorPane txtPropositoPrincipal) {
		this.txtPropositoPrincipal = txtPropositoPrincipal;
	}

	public void setTxtFuncionesEsenciales(JEditorPane txtFuncionesEsenciales) {
		this.txtFuncionesEsenciales = txtFuncionesEsenciales;
	}

	public void setTxtCriterioDesempeno(JEditorPane txtCriterioDesempeno) {
		this.txtCriterioDesempeno = txtCriterioDesempeno;
	}

	public void setTxtConocBasicos(JEditorPane txtConocBasicos) {
		this.txtConocBasicos = txtConocBasicos;
	}

	public void setTxtOrganizacionales(JEditorPane txtOrganizacionales) {
		this.txtOrganizacionales = txtOrganizacionales;
	}

	public void setTxtIndividual(JEditorPane txtIndividual) {
		this.txtIndividual = txtIndividual;
	}

	public void setBtnVaciarCampos(StandarButton btnVaciarCampos) {
		this.btnVaciarCampos = btnVaciarCampos;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

}
