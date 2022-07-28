package CuartoMedio.DotacionPersonal.SeleccionPersonal;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;

import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
import CuartoMedio.DotacionPersonal.PerfilEmpleado.PerfilEmpleadoEntity;

import java.awt.Color;
import java.awt.Dimension;
import ui.Buttons.StandarButton;
import ui.Labels.LabelSubtitulos;
import ui.TablaUi.TableStandard;
import com.toedter.calendar.JYearChooser;
import ui.Texts.TextSoloNumeros;

public class VistaSeleccionPersonal extends JPanel {
	
	private ControlSeleccionPersonal csp;
	
	private JTextField txtNombres;
	private JTextField txtCur;
	private JTextField txtCasAccLla;
	private JTextField txtApePat;
	private JTextField txtNumIMSS;
	private JTextField txtApeMat;
	private JTextField txtDom;
	private JTextField txtIns;
	private JTextField txtCar;
	private JTextField txtCur1;
	private JTextField txtCur2;
	private JTextField txtCur3;
	private JTextField txtCur4;
	private JTextField txtNomCom;
	private JTextField txtAreOcu;
	private JTextField txtPueAnt;
	private JTextField txtOcu;
	private TextSoloNumeros txtSue;
	private JTextField txtTel;
	private JTextField txtPre;
	private JTextField txtRec;
	private JTextField txtLog;
	private JTextField txtJef;
	private JComboBox comboBoxNivel;
	private JComboBox comboBoxIdiomas;
	private StandarButton btnGuardar;
	private StandarButton btnVaciarCampos;
	private TableStandard table;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	private StandarButton btnVerTodosLos;
	private StandarButton btnImprimir;
	private JTextField txtId;
	private JComboBox comboBoxEstCiv;
	private JComboBox comboBoxSex;
	private JComboBox comboBoxPractica;
	private JDateChooser FecIng;
	private JDateChooser FecTer;
	private JYearChooser txtAno;

	/**
	 * Create the panel.
	 */
	public VistaSeleccionPersonal() {
		
		csp = new ControlSeleccionPersonal(this);
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1190));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccion de Personal");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 11, 774, 36);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 106, 91, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido Paterno");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(263, 108, 96, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Apellido Materno");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(526, 106, 96, 14);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Curp");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 143, 91, 14);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Nro. IMSS");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(263, 145, 96, 14);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Domicilio");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(526, 143, 81, 14);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tlf Caso Accidente");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(5, 181, 96, 23);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Estado Civil");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(263, 185, 81, 19);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sexo");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(526, 183, 61, 19);
		panel.add(lblNewLabel_4);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(101, 102, 157, 23);
		panel.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtCur = new JTextField();
		txtCur.setColumns(10);
		txtCur.setBounds(101, 140, 157, 23);
		panel.add(txtCur);
		
		txtCasAccLla = new JTextField();
		txtCasAccLla.setColumns(10);
		txtCasAccLla.setBounds(101, 179, 158, 23);
		panel.add(txtCasAccLla);
		
		txtApePat = new JTextField();
		txtApePat.setColumns(10);
		txtApePat.setBounds(359, 102, 157, 23);
		panel.add(txtApePat);
		
		txtNumIMSS = new JTextField();
		txtNumIMSS.setColumns(10);
		txtNumIMSS.setBounds(359, 139, 157, 23);
		panel.add(txtNumIMSS);
		
		comboBoxEstCiv = new JComboBox();
		comboBoxEstCiv.setFont(new Font("Dialog", Font.PLAIN, 12));
		comboBoxEstCiv.setModel(new DefaultComboBoxModel(new String[] {"Soltero", "Casado", "Divorciado"}));
		comboBoxEstCiv.setBounds(361, 180, 157, 23);
		panel.add(comboBoxEstCiv);
		
		txtApeMat = new JTextField();
		txtApeMat.setColumns(10);
		txtApeMat.setBounds(617, 103, 128, 23);
		panel.add(txtApeMat);
		
		txtDom = new JTextField();
		txtDom.setColumns(10);
		txtDom.setBounds(617, 140, 128, 23);
		panel.add(txtDom);
		
		comboBoxSex = new JComboBox();
		comboBoxSex.setFont(new Font("Dialog", Font.PLAIN, 12));
		comboBoxSex.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		comboBoxSex.setBounds(617, 181, 128, 23);
		panel.add(comboBoxSex);
		
		JLabel lblNewLabel_5 = new JLabel("Datos Generales");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(5, 68, 168, 23);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Datos Academicos");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1.setBounds(5, 227, 168, 23);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_1_5 = new JLabel("Instituci\u00F3n");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_5.setBounds(5, 261, 81, 18);
		panel.add(lblNewLabel_1_5);
		
		txtIns = new JTextField();
		txtIns.setBounds(89, 261, 270, 23);
		panel.add(txtIns);
		txtIns.setColumns(10);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Carrera");
		lblNewLabel_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_5_1.setBounds(369, 261, 55, 18);
		panel.add(lblNewLabel_1_5_1);
		
		txtCar = new JTextField();
		txtCar.setBounds(425, 260, 208, 23);
		panel.add(txtCar);
		txtCar.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("A\u00F1o");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(645, 261, 32, 19);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Idiomas");
		lblNewLabel_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1_1.setBounds(5, 299, 168, 23);
		panel.add(lblNewLabel_5_1_1);
		
		comboBoxIdiomas = new JComboBox();
		comboBoxIdiomas.setFont(new Font("Dialog", Font.PLAIN, 12));
		comboBoxIdiomas.setModel(new DefaultComboBoxModel(new String[] {"Ingl\u00E9s", "Espa\u00F1ol", "Portugues", "Frances", "Italiano", "Chino", "Japones"}));
		comboBoxIdiomas.setBounds(5, 333, 200, 23);
		panel.add(comboBoxIdiomas);
		
		JLabel lblNewLabel_6 = new JLabel("Nivel");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(230, 333, 61, 23);
		panel.add(lblNewLabel_6);
		
		comboBoxNivel = new JComboBox();
		comboBoxNivel.setFont(new Font("Dialog", Font.PLAIN, 12));
		comboBoxNivel.setModel(new DefaultComboBoxModel(new String[] {"Basico", "Medio", "Avanzado"}));
		comboBoxNivel.setBounds(270, 333, 188, 23);
		panel.add(comboBoxNivel);
		
		JLabel lblNewLabel_7 = new JLabel("En la Practica lo");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(470, 335, 107, 19);
		panel.add(lblNewLabel_7);
		
		comboBoxPractica = new JComboBox();
		comboBoxPractica.setModel(new DefaultComboBoxModel(new String[] {"Habla", "Escucha", "Lee", "Entiende", "Todas las anteriores"}));
		comboBoxPractica.setFont(new Font("Dialog", Font.PLAIN, 12));
		comboBoxPractica.setBounds(576, 333, 169, 23);
		panel.add(comboBoxPractica);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Cursos");
		lblNewLabel_5_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1_1_1.setBounds(5, 373, 168, 23);
		panel.add(lblNewLabel_5_1_1_1);
		
		JLabel lblNewLabel_8 = new JLabel("1.-");
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(5, 410, 46, 14);
		panel.add(lblNewLabel_8);
		
		txtCur1 = new JTextField();
		txtCur1.setColumns(10);
		txtCur1.setBounds(35, 407, 140, 23);
		panel.add(txtCur1);
		
		JLabel lblNewLabel_8_1 = new JLabel("2.-");
		lblNewLabel_8_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_8_1.setForeground(Color.WHITE);
		lblNewLabel_8_1.setBounds(199, 410, 46, 14);
		panel.add(lblNewLabel_8_1);
		
		txtCur2 = new JTextField();
		txtCur2.setColumns(10);
		txtCur2.setBounds(230, 407, 140, 23);
		panel.add(txtCur2);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("3.-");
		lblNewLabel_8_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_8_1_1.setForeground(Color.WHITE);
		lblNewLabel_8_1_1.setBounds(393, 410, 46, 14);
		panel.add(lblNewLabel_8_1_1);
		
		txtCur3 = new JTextField();
		txtCur3.setColumns(10);
		txtCur3.setBounds(425, 407, 140, 23);
		panel.add(txtCur3);
		
		JLabel lblNewLabel_8_1_1_1 = new JLabel("4.-");
		lblNewLabel_8_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_8_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_8_1_1_1.setBounds(590, 410, 46, 14);
		panel.add(lblNewLabel_8_1_1_1);
		
		txtCur4 = new JTextField();
		txtCur4.setColumns(10);
		txtCur4.setBounds(624, 407, 121, 23);
		panel.add(txtCur4);
		
		JLabel lblNewLabel_5_1_1_1_1 = new JLabel("Datos laborales Internos");
		lblNewLabel_5_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1_1_1_1.setBounds(5, 450, 281, 23);
		panel.add(lblNewLabel_5_1_1_1_1);
		
		JLabel lblNewLabel_1_6 = new JLabel("Nombre Compa\u00F1ia");
		lblNewLabel_1_6.setForeground(Color.WHITE);
		lblNewLabel_1_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_6.setBounds(5, 488, 121, 14);
		panel.add(lblNewLabel_1_6);
		
		txtNomCom = new JTextField();
		txtNomCom.setColumns(10);
		txtNomCom.setBounds(116, 484, 140, 23);
		panel.add(txtNomCom);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Area que ocupaba");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(260, 490, 116, 14);
		panel.add(lblNewLabel_1_1_1);
		
		txtAreOcu = new JTextField();
		txtAreOcu.setColumns(10);
		txtAreOcu.setBounds(371, 484, 145, 23);
		panel.add(txtAreOcu);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Puesto Antiguo");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(526, 488, 96, 14);
		panel.add(lblNewLabel_1_2_2);
		
		txtPueAnt = new JTextField();
		txtPueAnt.setColumns(10);
		txtPueAnt.setBounds(617, 485, 128, 23);
		panel.add(txtPueAnt);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Ocupaci\u00F3n");
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_1.setBounds(5, 523, 96, 14);
		panel.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Jefe");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1.setBounds(260, 523, 99, 14);
		panel.add(lblNewLabel_1_4_1);
		
		txtOcu = new JTextField();
		txtOcu.setColumns(10);
		txtOcu.setBounds(116, 520, 140, 23);
		panel.add(txtOcu);
		
		txtJef = new JTextField();
		txtJef.setColumns(10);
		txtJef.setBounds(371, 520, 145, 23);
		panel.add(txtJef);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Sueldo");
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBounds(526, 523, 96, 14);
		panel.add(lblNewLabel_1_2_1_1);
		
		txtSue = new TextSoloNumeros();
		txtSue.setColumns(10);
		txtSue.setBounds(617, 520, 128, 23);
		panel.add(txtSue);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Telefono");
		lblNewLabel_1_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_1_1.setBounds(5, 558, 96, 14);
		panel.add(lblNewLabel_1_3_1_1);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(116, 555, 140, 23);
		panel.add(txtTel);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Fecha Ingreso");
		lblNewLabel_1_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1_1.setBounds(260, 560, 99, 14);
		panel.add(lblNewLabel_1_4_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Fecha T\u00E9rmino");
		lblNewLabel_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1_1.setBounds(526, 558, 96, 14);
		panel.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_2 = new JLabel("Otros Datos");
		lblNewLabel_5_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1_1_1_2.setBounds(5, 600, 168, 23);
		panel.add(lblNewLabel_5_1_1_1_2);
		
		JLabel lblNewLabel_1_7 = new JLabel("Premios");
		lblNewLabel_1_7.setForeground(Color.WHITE);
		lblNewLabel_1_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_7.setBounds(5, 638, 96, 14);
		panel.add(lblNewLabel_1_7);
		
		txtPre = new JTextField();
		txtPre.setColumns(10);
		txtPre.setBounds(89, 635, 157, 23);
		panel.add(txtPre);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Reconocimientos");
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(263, 640, 96, 14);
		panel.add(lblNewLabel_1_1_2);
		
		txtRec = new JTextField();
		txtRec.setColumns(10);
		txtRec.setBounds(359, 635, 157, 23);
		panel.add(txtRec);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Logros");
		lblNewLabel_1_2_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_3.setBounds(537, 638, 96, 14);
		panel.add(lblNewLabel_1_2_3);
		
		txtLog = new JTextField();
		txtLog.setColumns(10);
		txtLog.setBounds(617, 635, 128, 23);
		panel.add(txtLog);
		
		FecTer = new JDateChooser();
		FecTer.setBounds(617, 555, 128, 23);
		panel.add(FecTer);
		
		FecIng = new JDateChooser();
		FecIng.setBounds(371, 555, 145, 23);
		panel.add(FecIng);
		
		btnGuardar = new StandarButton((String) null);
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(640, 685, 105, 30);
		btnGuardar.addActionListener(csp);
		panel.add(btnGuardar);
		
		btnVaciarCampos = new StandarButton((String) null);
		btnVaciarCampos.setText("Vaciar Campos");
		btnVaciarCampos.setBounds(482, 685, 125, 30);
		btnVaciarCampos.addActionListener(csp);
		panel.add(btnVaciarCampos);
		
		
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
			"Nombres",
			"Apellido Paterno",
			"Apellido Materno",
			"Domicilio",
			"Estado Civil",
			"Sexo",
			"CURP",
			"Nro. IMSS",
			"Idioma",
			
		};
		table.setColums(columns);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setPreferredWidth(250);
		table.getColumnModel().getColumn(2).setPreferredWidth(140);
		table.getColumnModel().getColumn(3).setPreferredWidth(140);
		table.getColumnModel().getColumn(4).setPreferredWidth(140);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setPreferredWidth(60);
		table.getColumnModel().getColumn(7).setPreferredWidth(180);
		table.getColumnModel().getColumn(8).setPreferredWidth(180);
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
		btnModificar.addActionListener(csp);
		panel.add(btnModificar);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(140, 1080, 105, 30);
		btnEliminar.addActionListener(csp);
		panel.add(btnEliminar);
		
		btnVerTodosLos = new StandarButton((String) null);
		btnVerTodosLos.setText("Ver todos los Datos");
		btnVerTodosLos.setBounds(273, 1080, 150, 30);
		btnVerTodosLos.addActionListener(csp);
		panel.add(btnVerTodosLos);
		
		btnImprimir = new StandarButton((String) null);
		btnImprimir.setText("Imprimir");
		btnImprimir.setBounds(445, 1080, 126, 30);
		btnImprimir.addActionListener(csp);
		panel.add(btnImprimir);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setBounds(10, 683, 86, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		txtAno = new JYearChooser();
		txtAno.setBounds(676, 261, 62, 23);
		panel.add(txtAno);
		txtId.setVisible(false);

		ActualizarVista();
		
	}
	
	public void VaciarForm() {
		
		txtNombres.setText("");
		txtApePat.setText("");
		txtApeMat.setText("");
		txtCur.setText("");
		txtNumIMSS.setText("");
		txtDom.setText("");
		txtCasAccLla.setText("");
		comboBoxEstCiv.setSelectedIndex(0);
		comboBoxSex.setSelectedIndex(0);
		txtIns.setText("");
		txtCar.setText("");
		comboBoxIdiomas.setSelectedIndex(0);
		comboBoxNivel.setSelectedIndex(0);
		comboBoxPractica.setSelectedIndex(0);
		txtCur1.setText("");
		txtCur2.setText("");
		txtCur3.setText("");
		txtCur4.setText("");
		txtNomCom.setText("");
		txtAreOcu.setText("");
		txtPueAnt.setText("");
		txtOcu.setText("");
		txtJef.setText("");
		txtSue.setText("");
		txtTel.setText("");
		FecIng.setCalendar(null);
		FecTer.setCalendar(null);
		txtPre.setText("");
		txtRec.setText("");
		txtLog.setText("");
		txtAno.setYear(2022);
		
		txtId.setText("");
		
	}
	
	public void ActualizarVista() {
		VaciarForm();
		csp.LlenarTabla();
		
	}
	
	
	public boolean camposVacios() {
		
		if(txtNombres.getText().length() <= 0) {
			return false;
		}else if(txtApePat.getText().length() <= 0) {
			return false;
		}else if(txtApeMat.getText().length() <= 0) {
			return false;
		}else if(txtCur.getText().length() <= 0) {
			return false;
		}else if(txtNumIMSS.getText().length() <= 0) {
			return false;
		}else if(txtDom.getText().length() <= 0) {
			return false;
		}else if(txtCasAccLla.getText().length() <= 0) {
			return false;
		}else if(txtIns.getText().length() <= 0) {
			return false;
		}else if(txtCar.getText().length() <= 0) {
			return false;
		}else if(txtCur1.getText().length() <= 0) {
			return false;
		}else if(txtCur2.getText().length() <= 0) {
			return false;
		}else if(txtCur3.getText().length() <= 0) {
			return false;
		}else if(txtCur4.getText().length() <= 0) {
			return false;
		}else if(txtNomCom.getText().length() <= 0) {
			return false;
		}else if(txtAreOcu.getText().length() <= 0) {
			return false;
		}else if(txtPueAnt.getText().length() <= 0) {
			return false;
		}else if(txtOcu.getText().length() <= 0) {
			return false;
		}else if(txtJef.getText().length() <= 0) {
			return false;
		}else if(txtSue.getText().length() <= 0) {
			return false;
		}else if(txtTel.getText().length() <= 0) {
			return false;
		}else if(FecIng.getCalendar() == null) {
			return false;
		}else if(FecTer.getCalendar() == null) {
			return false;
		}else if(txtPre.getText().length() <= 0) {
			return false;
		}else if(txtRec.getText().length() <= 0) {
			return false;
		}else if(txtLog.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	public void CargarForm(SeleccionPersonalEntity spe) {
		
		txtId.setText(""+spe.getId());
		
		txtNombres.setText(spe.getNombres());
		txtApePat.setText(spe.getApellidoPaterno());
		txtApeMat.setText(spe.getApellidoMaterno());
		txtCur.setText(spe.getCURP());
		txtNumIMSS.setText(spe.getNumIMSS());
		txtDom.setText(spe.getDomicilio());
		txtCasAccLla.setText(spe.getCasoAccion());
		comboBoxEstCiv.setSelectedIndex(spe.getEstadoCivil());
		comboBoxSex.setSelectedIndex(spe.getSexo());
		txtIns.setText(spe.getInstitucion());
		txtCar.setText(spe.getCarrera());
		txtAno.setYear(spe.getAno());
		comboBoxIdiomas.setSelectedIndex(spe.getIdioma());
		comboBoxNivel.setSelectedIndex(spe.getNivel());
		comboBoxPractica.setSelectedIndex(spe.getPractica());
		txtCur1.setText(spe.getCurso1());
		txtCur2.setText(spe.getCurso2());
		txtCur3.setText(spe.getCurso3());
		txtCur4.setText(spe.getCurso4());
		txtNomCom.setText(spe.getNombreCompania());
		txtAreOcu.setText(spe.getAreaOcupaba());
		txtPueAnt.setText(spe.getPuestoAntiguo());
		txtOcu.setText(spe.getOcupacion());
		txtJef.setText(spe.getJefe());
		txtSue.setText(""+spe.getSueldo());
		txtTel.setText(spe.getTelefono());
		FecIng.setCalendar(spe.getFechaIngreso());
		FecTer.setCalendar(spe.getFechaTermino());
		txtPre.setText(spe.getPremio());
		txtRec.setText(spe.getReconocimiento());
		txtLog.setText(spe.getLogros());
		
	}
	
	public void VerTodosDatos(SeleccionPersonalEntity spe) {
		
		txtNombres.setText(spe.getNombres());
		txtApePat.setText(spe.getApellidoPaterno());
		txtApeMat.setText(spe.getApellidoMaterno());
		txtCur.setText(spe.getCURP());
		txtNumIMSS.setText(spe.getNumIMSS());
		txtDom.setText(spe.getDomicilio());
		txtCasAccLla.setText(spe.getCasoAccion());
		comboBoxEstCiv.setSelectedIndex(spe.getEstadoCivil());
		comboBoxSex.setSelectedIndex(spe.getSexo());
		txtIns.setText(spe.getInstitucion());
		txtCar.setText(spe.getCarrera());
		txtAno.setYear(spe.getAno());
		comboBoxIdiomas.setSelectedIndex(spe.getIdioma());
		comboBoxNivel.setSelectedIndex(spe.getNivel());
		comboBoxPractica.setSelectedIndex(spe.getPractica());
		txtCur1.setText(spe.getCurso1());
		txtCur2.setText(spe.getCurso2());
		txtCur3.setText(spe.getCurso3());
		txtCur4.setText(spe.getCurso4());
		txtNomCom.setText(spe.getNombreCompania());
		txtAreOcu.setText(spe.getAreaOcupaba());
		txtPueAnt.setText(spe.getPuestoAntiguo());
		txtOcu.setText(spe.getOcupacion());
		txtJef.setText(spe.getJefe());
		txtSue.setText(""+spe.getSueldo());
		txtTel.setText(spe.getTelefono());
		FecIng.setCalendar(spe.getFechaIngreso());
		FecTer.setCalendar(spe.getFechaTermino());
		txtPre.setText(spe.getPremio());
		txtRec.setText(spe.getReconocimiento());
		txtLog.setText(spe.getLogros());
		
		
	}

	public DefaultTableModel getModel() {
		return table.getModel();
	}
	
	public JTextField getTxrNombres() {
		return txtNombres;
	}

	public JTextField getTxtCur() {
		return txtCur;
	}

	public JTextField getTxtCasAccLla() {
		return txtCasAccLla;
	}

	public JTextField getTxtApePat() {
		return txtApePat;
	}

	public JTextField getTxtNumIMSS() {
		return txtNumIMSS;
	}

	public JTextField getTxtApeMat() {
		return txtApeMat;
	}

	public JTextField getTxtDom() {
		return txtDom;
	}

	public JTextField getTxtIns() {
		return txtIns;
	}

	public JTextField getTxtCar() {
		return txtCar;
	}

	public JTextField getTxtCur1() {
		return txtCur1;
	}

	public JTextField getTxtCur2() {
		return txtCur2;
	}

	public JTextField getTxtCur3() {
		return txtCur3;
	}

	public JTextField getTxtCur4() {
		return txtCur4;
	}

	public JTextField getTxtNomCom() {
		return txtNomCom;
	}

	public JTextField getTxtAreOcu() {
		return txtAreOcu;
	}

	public JTextField getTxtPueAnt() {
		return txtPueAnt;
	}

	public JTextField getTxtOcu() {
		return txtOcu;
	}

	public TextSoloNumeros getTxtSue() {
		return txtSue;
	}

	public JTextField getTxtTel() {
		return txtTel;
	}

	public JTextField getTxtPre() {
		return txtPre;
	}

	public JTextField getTxtRec() {
		return txtRec;
	}

	public JTextField getTxtLog() {
		return txtLog;
	}

	public JTextField getTxtJef() {
		return txtJef;
	}

	public JComboBox getComboBoxNivel() {
		return comboBoxNivel;
	}

	public JComboBox getComboBoxIdiomas() {
		return comboBoxIdiomas;
	}

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public StandarButton getBtnVaciarCampos() {
		return btnVaciarCampos;
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

	public void setTxrNombres(JTextField txrNombres) {
		this.txtNombres = txrNombres;
	}

	public void setTxtCur(JTextField txtCur) {
		this.txtCur = txtCur;
	}

	public void setTxtCasAccLla(JTextField txtCasAccLla) {
		this.txtCasAccLla = txtCasAccLla;
	}

	public void setTxtApePat(JTextField txtApePat) {
		this.txtApePat = txtApePat;
	}

	public void setTxtNumIMSS(JTextField txtNumIMSS) {
		this.txtNumIMSS = txtNumIMSS;
	}

	public void setTxtApeMat(JTextField txtApeMat) {
		this.txtApeMat = txtApeMat;
	}

	public void setTxtDom(JTextField txtDom) {
		this.txtDom = txtDom;
	}

	public void setTxtIns(JTextField txtIns) {
		this.txtIns = txtIns;
	}

	public void setTxtCar(JTextField txtCar) {
		this.txtCar = txtCar;
	}
	public void setTxtCur1(JTextField txtCur1) {
		this.txtCur1 = txtCur1;
	}

	public void setTxtCur2(JTextField txtCur2) {
		this.txtCur2 = txtCur2;
	}

	public void setTxtCur3(JTextField txtCur3) {
		this.txtCur3 = txtCur3;
	}

	public void setTxtCur4(JTextField txtCur4) {
		this.txtCur4 = txtCur4;
	}

	public void setTxtNomCom(JTextField txtNomCom) {
		this.txtNomCom = txtNomCom;
	}

	public void setTxtAreOcu(JTextField txtAreOcu) {
		this.txtAreOcu = txtAreOcu;
	}

	public void setTxtPueAnt(JTextField txtPueAnt) {
		this.txtPueAnt = txtPueAnt;
	}

	public void setTxtOcu(JTextField txtOcu) {
		this.txtOcu = txtOcu;
	}

	public void setTxtSue(TextSoloNumeros txtSue) {
		this.txtSue = txtSue;
	}

	public void setTxtTel(JTextField txtTel) {
		this.txtTel = txtTel;
	}

	public void setTxtPre(JTextField txtPre) {
		this.txtPre = txtPre;
	}

	public void setTxtRec(JTextField txtRec) {
		this.txtRec = txtRec;
	}

	public void setTxtLog(JTextField txtLog) {
		this.txtLog = txtLog;
	}

	public void setTxtJef(JTextField txtJef) {
		this.txtJef = txtJef;
	}

	public void setComboBoxNivel(JComboBox comboBoxNivel) {
		this.comboBoxNivel = comboBoxNivel;
	}

	public void setComboBoxIdiomas(JComboBox comboBoxIdiomas) {
		this.comboBoxIdiomas = comboBoxIdiomas;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public void setBtnVaciarCampos(StandarButton btnVaciarCampos) {
		this.btnVaciarCampos = btnVaciarCampos;
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

	public JComboBox getComboBoxEstCiv() {
		return comboBoxEstCiv;
	}

	public void setComboBoxEstCiv(JComboBox comboBoxEstCiv) {
		this.comboBoxEstCiv = comboBoxEstCiv;
	}

	public JComboBox getComboBoxSex() {
		return comboBoxSex;
	}

	public void setComboBoxSex(JComboBox comboBoxSex) {
		this.comboBoxSex = comboBoxSex;
	}

	public JTextField getTxtNombres() {
		return txtNombres;
	}

	public JComboBox getComboBoxPractica() {
		return comboBoxPractica;
	}

	public void setTxtNombres(JTextField txtNombres) {
		this.txtNombres = txtNombres;
	}

	public void setComboBoxPractica(JComboBox comboBoxPractica) {
		this.comboBoxPractica = comboBoxPractica;
	}

	public JDateChooser getFecIng() {
		return FecIng;
	}

	public JDateChooser getFecTer() {
		return FecTer;
	}

	public void setFecIng(JDateChooser fecIng) {
		FecIng = fecIng;
	}

	public void setFecTer(JDateChooser fecTer) {
		FecTer = fecTer;
	}

	public JYearChooser getTxtAno() {
		return txtAno;
	}

	public void setTxtAno(JYearChooser txtAno) {
		this.txtAno = txtAno;
	}
}
