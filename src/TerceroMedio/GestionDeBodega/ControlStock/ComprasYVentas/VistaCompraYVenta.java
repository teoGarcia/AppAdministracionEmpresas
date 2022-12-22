package TerceroMedio.GestionDeBodega.ControlStock.ComprasYVentas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import core.Vista;
import ui.CrudTable.VistaCrudTable;
import ui.Labels.LabelTitulos;
import ui.Texts.TextSoloNumeros;

public class VistaCompraYVenta extends JPanel implements Vista<CompraYVentaEntity> {

	private Long id = 0L;

	private VistaCrudTable crud;
	private ControladorCompraYVenta control;
	private JPanel panel;

	private JTextField txtComprobante;
	private JTextField txtCantidad;

	private JLabel txtProducto;

	private JDateChooser dateFecha;

	private JComboBox comboBoxOperacion;
	

	public VistaCompraYVenta() {
		inicialize();
	}

	public void inicialize() {

		control = new ControladorCompraYVenta(this);

		setBounds(0, 0, 749, 500);
		setOpaque(false);
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 749, 500);
		add(scrollPane);

		panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		LabelTitulos lbltlsCartaGantt = new LabelTitulos("Compra Y Venta");
		lbltlsCartaGantt.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCartaGantt.setBounds(0, 10, 722, 30);
		panel.add(lbltlsCartaGantt);
		
		createForm();
		
		crud = new VistaCrudTable();
		crud.setLocation(0, 180);
		crud.setColumnsTable(new String[] {"ID", "FECHA", "OPERACION", "COMPROBANTE",  "PRODUCTO",  "CANTIDAD"});
		crud.addControllers(control);
		crud.getBtnImprimir().setText("Cambiar");
		panel.add(crud);
		
		actualizarVista();
	}

	@Override
	public void createForm() {
		
		int disminuir = 80;
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setForeground(Color.WHITE);
		lblProducto.setFont(new Font("Dialog", Font.BOLD, 12));
		lblProducto.setBounds(25, 130-disminuir, 164, 20);
		panel.add(lblProducto);
		
		txtProducto = new JLabel("Selecione un producto...");
		txtProducto.setForeground(Color.WHITE);
		txtProducto.setFont(new Font("Dialog", Font.BOLD, 16));
		txtProducto.setBounds(25, 75, 600, 20);
		panel.add(txtProducto);
		

		JLabel lblNewLabel_1_3 = new JLabel("Fecha");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(25, 197-disminuir, 164, 20);
		panel.add(lblNewLabel_1_3);
		
		dateFecha = new JDateChooser();
		dateFecha.setBounds(187, 197-disminuir, 173, 20);
		panel.add(dateFecha);
		
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Operacion");
		lblNewLabel_1_3_2.setForeground(Color.WHITE);
		lblNewLabel_1_3_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_2.setBounds(387, 197-disminuir, 164, 20);
		panel.add(lblNewLabel_1_3_2);
		
		comboBoxOperacion = new JComboBox();
		comboBoxOperacion.setFont(new Font("Dialog", Font.PLAIN, 12));
		comboBoxOperacion.setModel(new DefaultComboBoxModel(new String[] {"Compra", "Venta", "Existencia"}));
		comboBoxOperacion.setBounds(558, 197-disminuir, 174, 20);
		panel.add(comboBoxOperacion);


		JLabel lblNewLabel_1_4 = new JLabel("Comprobante");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(25, 228-disminuir, 164, 20);
		panel.add(lblNewLabel_1_4);
		
		txtComprobante = new JTextField();
		txtComprobante.setColumns(10);
		txtComprobante.setBounds(187, 228-disminuir, 173, 20);
		panel.add(txtComprobante);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Cantidad");
		lblNewLabel_1_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_2.setBounds(387, 228-disminuir, 164, 20);
		panel.add(lblNewLabel_1_4_2);

		txtCantidad = new TextSoloNumeros();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(558, 228-disminuir, 174, 20);
		panel.add(txtCantidad);
		
	}

	@Override
	public boolean isCamposVacios() {
		
		if(!isProduct() || 
			dateFecha.getCalendar() == null || 
			comboBoxOperacion.getSelectedIndex() <= -1 || 
			txtComprobante.getText().length() <= 0 || 
			txtCantidad.getText().length() <= 0 
			   ) {
				return false;
			}
			
			return true;

	}
	
	public boolean isProduct() {
		String p = txtProducto.getText();	
		return p.contains(",");
	}
	
	public void setProduct(String id, String codigo, String producto, String categoria) {
		txtProducto.setText(id+", "+codigo+", "+producto+", "+categoria);
	}

	@Override
	public void actualizarVista() {
		// TODO Auto-generated method stub
		vaciarForm();
		control.LlenarTabla();
	}

	@Override
	public void cargarForm(CompraYVentaEntity record) {
		// TODO Auto-generated method stub
		id = record.getId();
		txtProducto.setText(record.getIdProducto()+","+record.getCodigo()+","+record.getProducto()+","+record.getCategoria());
		dateFecha.setCalendar(record.getFecha());
		comboBoxOperacion.setSelectedItem(record.getOperacion());
		txtComprobante.setText(record.getComprobante());
		txtCantidad.setText(""+record.getCantidad());
	}

	@Override
	public void vaciarForm() {
		// TODO Auto-generated method stub
		id = 0L;
		//txtProducto.setText("Selecione un producto...");
		dateFecha.setCalendar(null);
		comboBoxOperacion.setSelectedIndex(-1);
		txtComprobante.setText("");
		txtCantidad.setText("");
	}

	
	
	@Override
	public VistaCrudTable getCrud() {
		// TODO Auto-generated method stub
		return this.crud;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public JTextField getTxtComprobante() {
		return txtComprobante;
	}

	public void setTxtComprobante(JTextField txtComprobante) {
		this.txtComprobante = txtComprobante;
	}

	public JTextField getTxtCantidad() {
		return txtCantidad;
	}

	public void setTxtCantidad(JTextField txtCantidad) {
		this.txtCantidad = txtCantidad;
	}

	public JLabel getTxtProducto() {
		return txtProducto;
	}

	public void setTxtProducto(JLabel txtProducto) {
		this.txtProducto = txtProducto;
	}

	public JDateChooser getDateFecha() {
		return dateFecha;
	}

	public void setDateFecha(JDateChooser dateFecha) {
		this.dateFecha = dateFecha;
	}

	public JComboBox getComboBoxOperacion() {
		return comboBoxOperacion;
	}

	public void setComboBoxOperacion(JComboBox comboBoxOperacion) {
		this.comboBoxOperacion = comboBoxOperacion;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCrud(VistaCrudTable crud) {
		this.crud = crud;
	}

}
