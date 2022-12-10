package TerceroMedio.AtencionAlCliente.RegClientes.Imprimir;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

import TerceroMedio.AtencionAlCliente.RegClientes.ModeloRegClientes;
import ui.imprimir.PanelImprimirI;
import javax.swing.border.LineBorder;

public class RegClientePanel extends PanelImprimirI<ModeloRegClientes> {

	private JLabel txtCodigo;
	private JLabel txtNombre;
	private JLabel txtRut;
	private JLabel txtDirec;
	private JLabel txtComuna;
	private JLabel txtCiudad;
	private JLabel txtTelefono;
	private JLabel txtRubro;
	private JLabel txtTipo;
	private JLabel txtEmail;
	private JLabel txtWeb;

	public RegClientePanel() {
		super("Registro Cliente");
		
		int disminuir = 97;
		
		JLabel lblNewLabel_1_3 = new JLabel("Codigo");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(25, 100, 75, 20);
		add(lblNewLabel_1_3);
		
		txtCodigo = new JLabel();
		txtCodigo.setBorder(null);
		txtCodigo.setForeground(Color.BLACK);
		txtCodigo.setBounds(110, 100, 120, 20);
		add(txtCodigo);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Nombre");
		lblNewLabel_1_3_2.setForeground(Color.BLACK);
		lblNewLabel_1_3_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_2.setBounds(279, 100, 98, 20);
		add(lblNewLabel_1_3_2);

		txtNombre = new JLabel();
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBounds(396, 100, 118, 20);
		add(txtNombre);

		JLabel lblNewLabel_1_4 = new JLabel("Rut");
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(25, 131, 75, 20);
		add(lblNewLabel_1_4);
		
		txtRut = new JLabel();
		txtRut.setForeground(Color.BLACK);
		txtRut.setBounds(110, 131, 120, 20);
		add(txtRut);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Direccion");
		lblNewLabel_1_4_2.setForeground(Color.BLACK);
		lblNewLabel_1_4_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_2.setBounds(279, 131, 98, 20);
		add(lblNewLabel_1_4_2);

		txtDirec = new JLabel();
		txtDirec.setForeground(Color.BLACK);
		txtDirec.setBounds(396, 131, 118, 20);
		add(txtDirec);
		

		JLabel lblNewLabel_1_5 = new JLabel("Comuna");
		lblNewLabel_1_5.setForeground(Color.BLACK);
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5.setBounds(25, 162, 75, 20);
		add(lblNewLabel_1_5);
		
		txtComuna = new JLabel();
		txtComuna.setForeground(Color.BLACK);
		txtComuna.setBounds(110, 162, 120, 20);
		add(txtComuna);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("Ciudad");
		lblNewLabel_1_5_2.setForeground(Color.BLACK);
		lblNewLabel_1_5_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_2.setBounds(279, 162, 98, 20);
		add(lblNewLabel_1_5_2);

		txtCiudad = new JLabel();
		txtCiudad.setForeground(Color.BLACK);
		txtCiudad.setBounds(396, 162, 118, 20);
		add(txtCiudad);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Telefono");
		lblNewLabel_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_1_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1.setBounds(25, 193, 75, 20);
		add(lblNewLabel_1_3_1);
		
		txtTelefono = new JLabel();
		txtTelefono.setForeground(Color.BLACK);
		txtTelefono.setBounds(110, 193, 120, 20);
		add(txtTelefono);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Rubro");
		lblNewLabel_1_3_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_3_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1_2.setBounds(279, 193, 98, 20);
		add(lblNewLabel_1_3_1_2);

		txtRubro = new JLabel();
		txtRubro.setForeground(Color.BLACK);
		txtRubro.setBounds(396, 193, 118, 20);
		add(txtRubro);

		JLabel lblNewLabel_1_4_1 = new JLabel("Tipo");
		lblNewLabel_1_4_1.setForeground(Color.BLACK);
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1.setBounds(25, 224, 75, 20);
		add(lblNewLabel_1_4_1);
		
		txtTipo = new JLabel();
		txtTipo.setForeground(Color.BLACK);
		txtTipo.setBounds(110, 224, 120, 20);
		add(txtTipo);
		
		JLabel lblNewLabel_1_4_1_2 = new JLabel("Email");
		lblNewLabel_1_4_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_4_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1_2.setBounds(279, 224, 98, 20);
		add(lblNewLabel_1_4_1_2);

		txtEmail = new JLabel();
		txtEmail.setForeground(Color.BLACK);
		txtEmail.setBounds(396, 224, 118, 20);
		add(txtEmail);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Web");
		lblNewLabel_1_5_1.setForeground(Color.BLACK);
		lblNewLabel_1_5_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1.setBounds(25, 255, 75, 20);
		add(lblNewLabel_1_5_1);

		txtWeb = new JLabel();
		txtWeb.setBounds(110, 255, 120, 20);
		add(txtWeb);
		
	}

	@Override
	public void CargarData(ModeloRegClientes record) {
		// TODO Auto-generated method stub
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
		
	}

}
