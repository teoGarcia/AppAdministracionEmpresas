package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Empleado;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import ui.Buttons.StandarButton;
import javax.swing.JTextField;
import java.awt.Color;
import ui.Texts.TextSoloNumeros;
import com.toedter.calendar.JDateChooser;

public class VistaRegistrarEmpleado extends JPanel {
	private JTextField txtNomApe;
	private JTextField txtRut;
	private JTextField txtTel;
	private JTextField txtDir;
	private JTextField txtOcu;

	/**
	 * Create the panel.
	 */
	public VistaRegistrarEmpleado() {

		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrar Empleado");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 55, 774, 30);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres y Apellidos");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1.setBounds(88, 186, 157, 24);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Rut");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(88, 249, 157, 24);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Direccion");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(88, 314, 157, 24);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tel\u00E9fono");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(417, 249, 72, 24);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(88, 446, 157, 24);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Ocupacion");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(88, 381, 157, 24);
		add(lblNewLabel_1_2_1);
		
		StandarButton btnGuardar = new StandarButton("New button");
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(324, 612, 127, 36);
		add(btnGuardar);
		
		txtNomApe = new JTextField();
		txtNomApe.setBounds(229, 189, 447, 21);
		add(txtNomApe);
		txtNomApe.setColumns(10);
		
		txtRut = new JTextField();
		txtRut.setColumns(10);
		txtRut.setBounds(229, 252, 178, 21);
		add(txtRut);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(498, 252, 178, 21);
		add(txtTel);
		
		txtDir = new JTextField();
		txtDir.setColumns(10);
		txtDir.setBounds(229, 317, 447, 21);
		add(txtDir);
		
		txtOcu = new JTextField();
		txtOcu.setColumns(10);
		txtOcu.setBounds(229, 384, 447, 21);
		add(txtOcu);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(229, 446, 186, 21);
		add(dateChooser);
		
		
		
	}
}
