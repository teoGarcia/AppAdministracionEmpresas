package ui.userUI.form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import ui.Labels.LabelTitulos;
import java.awt.Color;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import ui.Buttons.StandarButton;
import javax.swing.JTextField;

public class VistaRegistrarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtSeccion;
	private StandarButton btnGuardar;
	private ControlRegistrarUsuario cru;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaRegistrarUsuario frame = new VistaRegistrarUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaRegistrarUsuario() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 430);
		
		cru = new ControlRegistrarUsuario(this);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(54, 54, 54));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		LabelTitulos lbltlsRegistrarUsuario = new LabelTitulos((String) null);
		lbltlsRegistrarUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsRegistrarUsuario.setText("Registrar Usuario");
		lbltlsRegistrarUsuario.setBounds(33, 28, 384, 30);
		contentPane.add(lbltlsRegistrarUsuario);
		
		LabelSubtitulos lblsbtlsNombres = new LabelSubtitulos((String) null);
		lblsbtlsNombres.setText("Nombres");
		lblsbtlsNombres.setBounds(29, 120, 102, 23);
		contentPane.add(lblsbtlsNombres);
		
		LabelSubtitulos lblsbtlsApellidos = new LabelSubtitulos((String) null);
		lblsbtlsApellidos.setText("Apellidos");
		lblsbtlsApellidos.setBounds(29, 175, 102, 24);
		contentPane.add(lblsbtlsApellidos);
		
		LabelSubtitulos lblsbtlsSeccion = new LabelSubtitulos((String) null);
		lblsbtlsSeccion.setText("Seccion");
		lblsbtlsSeccion.setBounds(29, 230, 102, 24);
		contentPane.add(lblsbtlsSeccion);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(141, 121, 233, 23);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(141, 178, 233, 23);
		contentPane.add(txtApellido);
		
		txtSeccion = new JTextField();
		txtSeccion.setBounds(141, 233, 86, 20);
		contentPane.add(txtSeccion);
		txtSeccion.setColumns(10);
		
		btnGuardar = new StandarButton((String) null);
		btnGuardar.addActionListener(cru);
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(144, 308, 102, 30);
		contentPane.add(btnGuardar);
	}
	
	public void LlenarTabla() {
		
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JTextField getTxtSeccion() {
		return txtSeccion;
	}

	public void setTxtSeccion(JTextField txtSeccion) {
		this.txtSeccion = txtSeccion;
	}

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

}
