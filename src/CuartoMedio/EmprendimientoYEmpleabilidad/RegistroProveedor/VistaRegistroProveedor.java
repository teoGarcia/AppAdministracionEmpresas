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
import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.Producto;
import ui.TablaUi.TableStandard;

import java.awt.Color;
import ui.Buttons.StandarButton;

public class VistaRegistroProveedor extends JPanel {
	
	private Long id = 0L;
	
	private ControlRegistroProveedor control;

	private TableStandard table;
	private JTextField txtNom;
	private JTextField txtCor;
	private JTextField txtDir;
	private JTextField txtAreCon;
	private JButton btnAgregar;
	
	private DefaultTableModel modelo;
	private JTextField txtRub;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	

	/**
	 * Create the panel.
	 */
	public VistaRegistroProveedor() {
		
		control = new ControlRegistroProveedor(this);
		
		setBounds(0, 0, 770, 740);
		setOpaque(false);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro de Proveedores");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 34, 722, 48);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 240, 750, 416);
		add(scrollPane);
		
		table = new TableStandard();
		String[] columns = new String[] {"Id", "Nombre de Proveedor", "Dirección", "Correo", "Rubro", "Area de Contacto"};
		table.setColums(columns);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 116, 89, 19);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Correo");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 158, 89, 19);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Direcci\u00F3n");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(389, 116, 89, 19);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Area de Contacto");
		lblNewLabel_1_4.setForeground(Color.WHITE);
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
		btnAgregar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnAgregar.setBounds(662, 188, 98, 28);
		btnAgregar.addActionListener(control);
		add(btnAgregar);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Rubro");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(255, 158, 89, 19);
		add(lblNewLabel_1_2_1);
		
		txtRub = new JTextField();
		txtRub.setColumns(10);
		txtRub.setBounds(323, 158, 155, 19);
		add(txtRub);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(20, 667, 107, 28);
		btnModificar.addActionListener(control);
		add(btnModificar);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(160, 667, 107, 28);
		btnEliminar.addActionListener(control);
		add(btnEliminar);
		
		ActualizarVista();
		
	}
	
	
	public void ActualizarVista() {
		VaciarForm();
		control.LlenarTabla();
		calcularTotal();
	}
	
	public void CargarForm(Proveedores p) {
		txtNom.setText(p.getNombre());
		txtDir.setText(p.getDireccion());
		txtCor.setText(p.getCorreo());
		txtRub.setText(p.getRubro());
		txtAreCon.setText(p.getAreaDeContecto());
		setId(p.getId());
	}
	
	public void VaciarForm() {
		txtNom.setText("");
		txtDir.setText("");
		txtCor.setText("");
		txtRub.setText("");
		txtAreCon.setText("");
		setId(0L);
	}
	
	public boolean camposVacios() {
		
		if(txtNom.getText().length() <= 0 || txtDir.getText().length() <= 0 || txtCor.getText().length() <= 0 || txtRub.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	public void calcularTotal() {
		
	}
	
	public DefaultTableModel getModel() {
		return table.getModel();
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


	public TableStandard getTable() {
		return table;
	}


	public void setTable(TableStandard table) {
		this.table = table;
	}


	public DefaultTableModel getModelo() {
		return modelo;
	}


	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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
}
