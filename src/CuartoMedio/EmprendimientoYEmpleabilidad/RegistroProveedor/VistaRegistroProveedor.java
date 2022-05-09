package CuartoMedio.EmprendimientoYEmpleabilidad.RegistroProveedor;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.ControlListaPrecio;

public class VistaRegistroProveedor extends JPanel {
	
	private ControlRegistroProveedor crp;

	private JTable table;
	private JTextField txtNom;
	private JTextField txtCor;
	private JTextField txtDir;
	private JTextField txtAreCon;
	private JButton btnAgregar;
	
	private DefaultTableModel modelo;
	private JTextField txtRub;
	

	/**
	 * Create the panel.
	 */
	public VistaRegistroProveedor() {
		
		crp = new ControlRegistroProveedor(this);
		
		setBounds(0, 0, 770, 740);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro de Proveedores");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 34, 722, 48);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 240, 750, 416);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre de Proveedor", "Dirección", "Correo", "Rubro", "Area de Contacto"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		table.getColumnModel().getColumn(1).setPreferredWidth(180);
		table.getColumnModel().getColumn(4).setPreferredWidth(120);
		
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 116, 89, 19);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Correo");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 158, 89, 19);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Direcci\u00F3n");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(389, 116, 89, 19);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Area de Contacto");
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(499, 158, 107, 19);
		add(lblNewLabel_1_4);
		
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(91, 116, 282, 19);
		add(txtNom);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(91, 158, 155, 19);
		add(txtCor);
		
		txtDir = new JTextField();
		txtDir.setColumns(10);
		txtDir.setBounds(478, 116, 282, 19);
		add(txtDir);
		
		txtAreCon = new JTextField();
		txtAreCon.setColumns(10);
		txtAreCon.setBounds(605, 158, 155, 19);
		add(txtAreCon);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(630, 188, 130, 28);
		btnAgregar.addActionListener(crp);
		add(btnAgregar);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Rubro");
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(255, 158, 89, 19);
		add(lblNewLabel_1_2_1);
		
		txtRub = new JTextField();
		txtRub.setColumns(10);
		txtRub.setBounds(323, 158, 155, 19);
		add(txtRub);
		
	}


	public JTextField getTxtNom() {
		return txtNom;
	}


	public void setTxtNom(JTextField txtNom) {
		this.txtNom = txtNom;
	}


	public JTextField getTxtCor() {
		return txtCor;
	}


	public void setTxtCor(JTextField txtCor) {
		this.txtCor = txtCor;
	}


	public JTextField getTxtDir() {
		return txtDir;
	}


	public void setTxtDir(JTextField txtDir) {
		this.txtDir = txtDir;
	}


	public JTextField getTxtAreCon() {
		return txtAreCon;
	}


	public void setTxtAreCon(JTextField txtAreCon) {
		this.txtAreCon = txtAreCon;
	}


	public JButton getBtnAgregar() {
		return btnAgregar;
	}


	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}


	public JTextField getTxtRub() {
		return txtRub;
	}


	public void setTxtRub(JTextField txtRub) {
		this.txtRub = txtRub;
	}


	public JTable getTable() {
		return table;
	}


	public void setTable(JTable table) {
		this.table = table;
	}


	public DefaultTableModel getModelo() {
		return modelo;
	}


	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}
}
