package CuartoMedio.EmprendimientoYEmpleabilidad.PlanMarketing;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Rectangle;
import ui.Buttons.StandarButton;
import ui.TablaUi.TableStandard;

public class VistaPlanMarketing extends JPanel {
	
	private ControlPlanMarketing control;
	
	private JTextField txtNomPro;
	private JTextField txtObjPro;
	private JTextField txtGruObj;
	private JTextField txtPro;
	private JTextField txtPre;
	private JTextField txtPla;
	private JTextField txtProm;
	private JTextField txtPer;
	private JTextField txtPosVen;
	
	private TableStandard table;
	
	private StandarButton btnGuardar;
	private StandarButton btnModificar;
	private StandarButton btnEliminiar;

	/**
	 * Create the panel.
	 */
	public VistaPlanMarketing() {
		
		control = new ControlPlanMarketing(this);
		
		setBounds(0, 0, 762, 740);
		setOpaque(false);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Plan de Marketing");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 21, 722, 43);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del proyecto");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(15, 85, 143, 20);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Objetivo del proyecto");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(15, 120, 143, 20);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Grupo Objetivo");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(15, 155, 143, 20);
		add(lblNewLabel_1_2);
		
		txtNomPro = new JTextField();
		txtNomPro.setBounds(207, 85, 543, 20);
		add(txtNomPro);
		txtNomPro.setColumns(10);
		
		txtObjPro = new JTextField();
		txtObjPro.setColumns(10);
		txtObjPro.setBounds(207, 120, 543, 20);
		add(txtObjPro);
		
		txtGruObj = new JTextField();
		txtGruObj.setColumns(10);
		txtGruObj.setBounds(207, 155, 543, 20);
		add(txtGruObj);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 300, 740, 378);
		add(scrollPane);
		
		table = new TableStandard();
		String[] columns = new String[] {"Id", "Apartado", "Fecha", "Ingreso", "Egreso"};
		table.setColums(columns);
		scrollPane.setViewportView(table);
		
		
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Producto");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(15, 190, 87, 20);
		add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Precio");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(276, 190, 87, 20);
		add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Plaza");
		lblNewLabel_1_2_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_3.setBounds(509, 190, 87, 20);
		add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Promocion");
		lblNewLabel_1_2_4.setForeground(Color.WHITE);
		lblNewLabel_1_2_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_4.setBounds(15, 225, 107, 20);
		add(lblNewLabel_1_2_4);
		
		JLabel lblNewLabel_1_2_5 = new JLabel("Persona");
		lblNewLabel_1_2_5.setForeground(Color.WHITE);
		lblNewLabel_1_2_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_5.setBounds(276, 225, 94, 20);
		add(lblNewLabel_1_2_5);
		
		JLabel lblNewLabel_1_2_6 = new JLabel("Post Venta");
		lblNewLabel_1_2_6.setForeground(Color.WHITE);
		lblNewLabel_1_2_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_6.setBounds(509, 225, 87, 20);
		add(lblNewLabel_1_2_6);
		
		txtPro = new JTextField();
		txtPro.setBounds(95, 190, 160, 20);
		add(txtPro);
		txtPro.setColumns(10);
		
		txtPre = new JTextField();
		txtPre.setColumns(10);
		txtPre.setBounds(339, 190, 160, 20);
		add(txtPre);
		
		txtPla = new JTextField();
		txtPla.setColumns(10);
		txtPla.setBounds(590, 191, 160, 20);
		add(txtPla);
		
		txtProm = new JTextField();
		txtProm.setColumns(10);
		txtProm.setBounds(95, 225, 160, 20);
		add(txtProm);
		
		txtPer = new JTextField();
		txtPer.setColumns(10);
		txtPer.setBounds(339, 225, 160, 20);
		add(txtPer);
		
		txtPosVen = new JTextField();
		txtPosVen.setColumns(10);
		txtPosVen.setBounds(590, 226, 160, 20);
		add(txtPosVen);
		
		btnGuardar = new StandarButton("Agregar");
		btnGuardar.setText("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGuardar.setBounds(627, 256, 123, 33);
		add(btnGuardar);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(517, 260, 100, 30);
		add(btnModificar);
		
		btnEliminiar = new StandarButton((String) null);
		btnEliminiar.setText("Eliminiar");
		btnEliminiar.setBounds(395, 260, 100, 30);
		add(btnEliminiar);

	}

	public JTextField getTxtNomPro() {
		return txtNomPro;
	}

	public void setTxtNomPro(JTextField txtNomPro) {
		this.txtNomPro = txtNomPro;
	}

	public JTextField getTxtObjPro() {
		return txtObjPro;
	}

	public void setTxtObjPro(JTextField txtObjPro) {
		this.txtObjPro = txtObjPro;
	}

	public JTextField getTxtGruObj() {
		return txtGruObj;
	}

	public void setTxtGruObj(JTextField txtGruObj) {
		this.txtGruObj = txtGruObj;
	}

	public JTextField getTxtPro() {
		return txtPro;
	}

	public void setTxtPro(JTextField txtPro) {
		this.txtPro = txtPro;
	}

	public JTextField getTxtPre() {
		return txtPre;
	}

	public void setTxtPre(JTextField txtPre) {
		this.txtPre = txtPre;
	}

	public JTextField getTxtPla() {
		return txtPla;
	}

	public void setTxtPla(JTextField txtPla) {
		this.txtPla = txtPla;
	}

	public JTextField getTxtProm() {
		return txtProm;
	}

	public void setTxtProm(JTextField txtProm) {
		this.txtProm = txtProm;
	}

	public JTextField getTxtPer() {
		return txtPer;
	}

	public void setTxtPer(JTextField txtPer) {
		this.txtPer = txtPer;
	}

	public JTextField getTxtPosVen() {
		return txtPosVen;
	}

	public void setTxtPosVen(JTextField txtPosVen) {
		this.txtPosVen = txtPosVen;
	}

	public TableStandard getTable() {
		return table;
	}

	public void setTable(TableStandard table) {
		this.table = table;
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

	public StandarButton getBtnEliminiar() {
		return btnEliminiar;
	}

	public void setBtnEliminiar(StandarButton btnEliminiar) {
		this.btnEliminiar = btnEliminiar;
	}
	
	
	
}
