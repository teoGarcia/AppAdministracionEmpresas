package TerceroMedio.AtencionAlCliente.RegClientes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import TerceroMedio.ProcesosAdministrativos.FormatoOrganigrama.ControlFormatoOrganigrama;
import ui.Buttons.TittleButton;
import ui.CrudTable.VistaCrudTable;
import ui.Labels.LabelTitulos;
import ui.Texts.TextSoloNumeros;

public class VistaRegClientes extends JPanel {
	
	
	private Long id = 0L;
	
	private TittleButton btnVerDocumento;
	private ControRegClientes control;

	private VistaCrudTable crud;
	
	private JPanel panel;
	
	private JTextField txtCodigo;
	private JTextField txtRut;
	private JTextField txtComuna;
	private JTextField txtTelefono;
	private JTextField txtTipo;
	private JTextField txtWeb;
	private JTextField txtNombre;
	private JTextField txtDirec;
	private JTextField txtCiudad;
	private JTextField txtRubro;
	private JTextField txtEmail;
	
	/**
	 * Create the panel.
	 */
	public VistaRegClientes() {
		inicialize();
	}
	
	private void inicialize() {
		
		control = new ControRegClientes(this);
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);

		panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		
		LabelTitulos lbltlsCartaGantt = new LabelTitulos("Registro de Clientes");
		lbltlsCartaGantt.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCartaGantt.setBounds(0, 60, 722, 30);
		panel.add(lbltlsCartaGantt);
	
		createForm();
		
		crud = new VistaCrudTable();
		crud.setLocation(0, 290);
		crud.setColumnsTable(new String[] {"ID", "CODIGO", "NOMBRE", "RUT", "TELEFONO"});
		crud.addControllers(control);
		panel.add(crud);
		
		actualizarVista();
		
	}
	
	
	public void createForm() {
		
		
		int disminuir = 97;
		
		JLabel lblNewLabel_1_3 = new JLabel("Codigo");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(25, 197-disminuir, 164, 20);
		panel.add(lblNewLabel_1_3);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(187, 197-disminuir, 173, 20);
		panel.add(txtCodigo);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Nombre");
		lblNewLabel_1_3_2.setForeground(Color.WHITE);
		lblNewLabel_1_3_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_2.setBounds(387, 197-disminuir, 164, 20);
		panel.add(lblNewLabel_1_3_2);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(558, 197-disminuir, 174, 20);
		panel.add(txtNombre);

		JLabel lblNewLabel_1_4 = new JLabel("Rut");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(25, 228-disminuir, 164, 20);
		panel.add(lblNewLabel_1_4);
		
		try {
			MaskFormatter mascara = new MaskFormatter("##.###.###-A");
			txtRut = new JFormattedTextField(mascara);
			txtRut.setColumns(10);
			txtRut.setBounds(187, 228-disminuir, 173, 20);
			panel.add(txtRut);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Direccion");
		lblNewLabel_1_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_2.setBounds(387, 228-disminuir, 164, 20);
		panel.add(lblNewLabel_1_4_2);

		txtDirec = new JTextField();
		txtDirec.setColumns(10);
		txtDirec.setBounds(558, 228-disminuir, 174, 20);
		panel.add(txtDirec);
		

		JLabel lblNewLabel_1_5 = new JLabel("Comuna");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5.setBounds(25, 259-disminuir, 164, 20);
		panel.add(lblNewLabel_1_5);
		
		txtComuna = new JTextField();
		txtComuna.setColumns(10);
		txtComuna.setBounds(187, 259-disminuir, 173, 20);
		panel.add(txtComuna);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("Ciudad");
		lblNewLabel_1_5_2.setForeground(Color.WHITE);
		lblNewLabel_1_5_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_2.setBounds(387, 259-disminuir, 164, 20);
		panel.add(lblNewLabel_1_5_2);

		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(558, 259-disminuir, 174, 20);
		panel.add(txtCiudad);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Telefono");
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1.setBounds(25, 290-disminuir, 164, 20);
		panel.add(lblNewLabel_1_3_1);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(187, 290-disminuir, 173, 20);
		panel.add(txtTelefono);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Rubro");
		lblNewLabel_1_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1_2.setBounds(387, 290-disminuir, 135, 20);
		panel.add(lblNewLabel_1_3_1_2);

		txtRubro = new JTextField();
		txtRubro.setColumns(10);
		txtRubro.setBounds(558, 290-disminuir, 174, 20);
		panel.add(txtRubro);

		JLabel lblNewLabel_1_4_1 = new JLabel("Tipo");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1.setBounds(25, 321-disminuir, 164, 20);
		panel.add(lblNewLabel_1_4_1);
		
		txtTipo = new JTextField();
		txtTipo.setColumns(10);
		txtTipo.setBounds(187, 321-disminuir, 173, 20);
		panel.add(txtTipo);
		
		JLabel lblNewLabel_1_4_1_2 = new JLabel("Email");
		lblNewLabel_1_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1_2.setBounds(387, 321-disminuir, 164, 20);
		panel.add(lblNewLabel_1_4_1_2);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(558, 321-disminuir, 174, 20);
		panel.add(txtEmail);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Web");
		lblNewLabel_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1.setBounds(25, 352-disminuir, 164, 20);
		panel.add(lblNewLabel_1_5_1);

		txtWeb = new JTextField();
		txtWeb.setColumns(10);
		txtWeb.setBounds(187, 352-disminuir, 173, 20);
		panel.add(txtWeb);
		
		/*JLabel lblNewLabel_1_5_1 = new JLabel("Web");
		lblNewLabel_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1.setBounds(387, 352-disminuir, 164, 20);
		panel.add(lblNewLabel_1_5_1);

		txtWeb = new JTextField();
		txtWeb.setColumns(10);
		txtWeb.setBounds(558, 352-disminuir, 173, 20);
		panel.add(txtWeb);*/

		
	}
	
	public boolean isCamposVacios() {
		if(txtCodigo.getText().length() <= 0 || 
			txtRut.getText().length() <= 0 || 
			txtComuna.getText().length() <= 0 || 
			txtTelefono.getText().length() <= 0 ||
			txtTipo.getText().length() <= 0 ||
			txtWeb.getText().length() <= 0 ||
			txtNombre.getText().length() <= 0 ||
			txtDirec.getText().length() <= 0 ||
			txtCiudad.getText().length() <= 0 ||
			txtRubro.getText().length() <= 0 ||
			txtEmail.getText().length() <= 0 
		   ) {
			return false;
		}
		
		return true;
	}

	public void actualizarVista() {
		vaciarForm();
		control.LlenarTabla();
	}

	public void cargarForm(ModeloRegClientes record) {
		txtCodigo.setText(record.getCodigo());
		txtRut.setText(record.getRut());
		txtComuna.setText(record.getComuna());
		txtTelefono.setText(record.getTelefono());
		txtTipo.setText(record.getTipo());
		txtWeb.setText(record.getWeb());
		txtNombre.setText(record.getNombre());
		txtDirec.setText(record.getDireccion());
		txtCiudad.setText(record.getCiudad());
		txtRubro.setText(record.getRubro());
		txtEmail.setText(record.getCorreo());
		id = record.getId();
	}
	
	public void vaciarForm() {
		txtCodigo.setText("");
		txtRut.setText("");
		txtComuna.setText("");
		txtTelefono.setText("");
		txtTipo.setText("");
		txtWeb.setText("");
		txtNombre.setText("");
		txtDirec.setText("");
		txtCiudad.setText("");
		txtRubro.setText("");
		txtEmail.setText("");
		id =0L;
	}

	public TittleButton getBtnVerDocumento() {
		return btnVerDocumento;
	}

	public void setBtnVerDocumento(TittleButton btnVerDocumento) {
		this.btnVerDocumento = btnVerDocumento;
	}

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

	public JTextField getTxtRut() {
		return txtRut;
	}

	public void setTxtRut(JTextField txtRut) {
		this.txtRut = txtRut;
	}

	public JTextField getTxtComuna() {
		return txtComuna;
	}

	public void setTxtComuna(JTextField txtComuna) {
		this.txtComuna = txtComuna;
	}

	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}

	public JTextField getTxtTipo() {
		return txtTipo;
	}

	public void setTxtTipo(JTextField txtTipo) {
		this.txtTipo = txtTipo;
	}

	public JTextField getTxtWeb() {
		return txtWeb;
	}

	public void setTxtWeb(JTextField txtWeb) {
		this.txtWeb = txtWeb;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtDirec() {
		return txtDirec;
	}

	public void setTxtDirec(JTextField txtDirec) {
		this.txtDirec = txtDirec;
	}

	public JTextField getTxtCiudad() {
		return txtCiudad;
	}

	public void setTxtCiudad(JTextField txtCiudad) {
		this.txtCiudad = txtCiudad;
	}

	public JTextField getTxtRubro() {
		return txtRubro;
	}

	public void setTxtRubro(JTextField txtRubro) {
		this.txtRubro = txtRubro;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	

}
