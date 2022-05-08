package CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class VistaListaPrecio extends JPanel {
	
	private ControlListaPrecio clp;
	
	private JTable table;
	private JTextField txtCodPro;
	private JTextField txtNom;
	private JTextField txtPro;
	private JTextField txtPreUni;
	private JTextField txtCan;
	private JTextField txtSubTotal;
	private JTextField txtIVA;
	private JTextField txtTotal;
	private JButton btnAgregar;
	
	private DefaultTableModel modelo;
	

	/**
	 * Create the panel.
	 */
	public VistaListaPrecio() {
		
		clp = new ControlListaPrecio(this);
		
		setBounds(0, 0, 722, 740);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de Precios");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 34, 722, 48);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 208, 702, 416);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3d. Producto", "Nombre del Producto", "Proveedor", "Precio Unit.", "Cantidad", "Total"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(87);
		table.getColumnModel().getColumn(1).setPreferredWidth(257);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3d. Producto");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 116, 89, 19);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(256, 116, 89, 19);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Proveedor");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(256, 140, 89, 19);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Precio Unitario");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 140, 89, 19);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Cantidad");
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(488, 140, 77, 19);
		add(lblNewLabel_1_4);
		
		txtCodPro = new JTextField();
		txtCodPro.setBounds(106, 115, 140, 19);
		add(txtCodPro);
		txtCodPro.setColumns(10);
		
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(328, 116, 384, 19);
		add(txtNom);
		
		txtPro = new JTextField();
		txtPro.setColumns(10);
		txtPro.setBounds(328, 140, 140, 19);
		add(txtPro);
		
		txtPreUni = new JTextField();
		txtPreUni.setColumns(10);
		txtPreUni.setBounds(106, 140, 140, 19);
		add(txtPreUni);
		
		txtCan = new JTextField();
		txtCan.setColumns(10);
		txtCan.setBounds(572, 140, 140, 19);
		add(txtCan);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(582, 170, 130, 28);
		btnAgregar.addActionListener(clp);
		add(btnAgregar);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Subtotal");
		lblNewLabel_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_1.setBounds(507, 635, 89, 19);
		add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("IVA.");
		lblNewLabel_1_3_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_2.setBounds(507, 665, 89, 19);
		add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Total");
		lblNewLabel_1_3_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_3.setBounds(507, 698, 89, 19);
		add(lblNewLabel_1_3_3);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setBounds(596, 635, 116, 19);
		add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		txtIVA = new JTextField();
		txtIVA.setColumns(10);
		txtIVA.setBounds(596, 665, 116, 19);
		add(txtIVA);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(596, 698, 116, 19);
		add(txtTotal);
		
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public JTextField getTxtCodPro() {
		return txtCodPro;
	}

	public void setTxtCodPro(JTextField txtCodPro) {
		this.txtCodPro = txtCodPro;
	}

	public JTextField getTxtNom() {
		return txtNom;
	}

	public void setTxtNom(JTextField txtNom) {
		this.txtNom = txtNom;
	}

	public JTextField getTxtPro() {
		return txtPro;
	}

	public void setTxtPro(JTextField txtPro) {
		this.txtPro = txtPro;
	}

	public JTextField getTxtPreUni() {
		return txtPreUni;
	}

	public void setTxtPreUni(JTextField txtPreUni) {
		this.txtPreUni = txtPreUni;
	}

	public JTextField getTxtCan() {
		return txtCan;
	}

	public void setTxtCan(JTextField txtCan) {
		this.txtCan = txtCan;
	}

	public JTextField getTxtSubTotal() {
		return txtSubTotal;
	}

	public void setTxtSubTotal(JTextField txtSubTotal) {
		this.txtSubTotal = txtSubTotal;
	}

	public JTextField getTxtIVA() {
		return txtIVA;
	}

	public void setTxtIVA(JTextField txtIVA) {
		this.txtIVA = txtIVA;
	}

	public JTextField getTxtTotal() {
		return txtTotal;
	}

	public void setTxtTotal(JTextField txtTotal) {
		this.txtTotal = txtTotal;
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
