package TerceroMedio.GestionDeBodega.ControlStock.Producto;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import ui.CrudTable.VistaCrudTable;
import ui.Labels.LabelTitulos;

public class VistaProducto extends JPanel {

	private Long id = 0L;
	
	private VistaCrudTable crud;
	private ContoladorProducto control;
	private JPanel panel;

	private JTextField txtCodigo;
	private JTextField txtProducto;
	private JTextField txtCategoria;
	
	/**
	 * Create the panel.
	 */
	public VistaProducto() {
		inicialize();
	}

	private void inicialize() {
		// TODO Auto-generated method stub
		control = new ContoladorProducto(this);
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 500);
		add(scrollPane);

		panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		LabelTitulos lbltlsCartaGantt = new LabelTitulos("Registro de Productos");
		lbltlsCartaGantt.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCartaGantt.setBounds(0, 10, 722, 30);
		panel.add(lbltlsCartaGantt);
		
		createForm();
		
		crud = new VistaCrudTable();
		crud.setLocation(0, 180);
		crud.setColumnsTable(new String[] {"ID", "CODIGO", "PRODUCTO", "CATEGORIA"});
		crud.addControllers(control);
		panel.add(crud);
	}
	
	public void createForm() {
		
		
		int disminuir = 120;
		
		JLabel lblNewLabel_1_3 = new JLabel("Codigo");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(25, 197-disminuir, 164, 20);
		panel.add(lblNewLabel_1_3);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(187, 197-disminuir, 173, 20);
		panel.add(txtCodigo);

		JLabel lblNewLabel_1_4 = new JLabel("Producto");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(387, 197-disminuir, 164, 20);
		panel.add(lblNewLabel_1_4);
		
		txtProducto = new JTextField();
		txtProducto.setColumns(10);
		txtProducto.setBounds(558, 197-disminuir, 173, 20);
		panel.add(txtProducto);

		JLabel lblNewLabel_1_5 = new JLabel("Categoria");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5.setBounds(25, 259-disminuir, 164, 20);
		panel.add(lblNewLabel_1_5);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(187, 259-disminuir, 173, 20);
		panel.add(txtCategoria);
	
	}
	
	public boolean CamposVacios() {
		if(txtCodigo.getText().length() <= 0 || 
				txtProducto.getText().length() <= 0 || 
				txtCategoria.getText().length() <= 0 
			   ) {
				return false;
			}
			
			return true;
	}
	
	public void actualizarVista() {
		// TODO Auto-generated method stub
		vaciarForm();
		control.LlenarTabla();
	}

	public void cargarForm(ProductoEntity record) {
		id = record.getId();
		txtCodigo.setText(record.getCodigo());
		txtProducto.setText(record.getProducto());
		txtCategoria.setText(record.getCategoria());
	}

	public void vaciarForm() {
		// TODO Auto-generated method stub
		id =0L;
		txtCodigo.setText("");
		txtProducto.setText("");
		txtCategoria.setText("");
	}
	
	// get and set

	public VistaCrudTable getCrud() {
		return crud;
	}

	public void setCrud(VistaCrudTable crud) {
		this.crud = crud;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public JTextField getTxtCodigo() {
		return txtCodigo;
	}

	public void setTxtCodigo(JTextField txtCodigo) {
		this.txtCodigo = txtCodigo;
	}

	public JTextField getTxtProducto() {
		return txtProducto;
	}

	public void setTxtProducto(JTextField txtProducto) {
		this.txtProducto = txtProducto;
	}

	public JTextField getTxtCategoria() {
		return txtCategoria;
	}

	public void setTxtCategoria(JTextField txtCategoria) {
		this.txtCategoria = txtCategoria;
	}


}
