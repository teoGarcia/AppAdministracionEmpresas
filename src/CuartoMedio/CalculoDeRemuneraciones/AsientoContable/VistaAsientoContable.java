package CuartoMedio.CalculoDeRemuneraciones.AsientoContable;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JSeparator;

public class VistaAsientoContable extends JPanel {
	private JTextField txtNomEmp;
	private JTextField txtCargo;
	private JTextField textRut;
	private JTextField txtSue;
	private JTextField txtGra;
	private JTextField txtHorExt;
	private JTextField txtCom;
	private JTextField txtBon;
	private JTextField txtMov;
	private JTextField txtCol;
	private JTextField txtVia;
	private JTextField txtAsiFam;
	private JTextField txtTotDeb;
	private JTextField txtAFP;
	private JTextField txtFon;
	private JTextField txtIsa;
	private JTextField txtDifIsa;
	private JTextField txtSegCes;
	private JTextField txtImpUni;
	private JTextField txtCuoSin;
	private JTextField txtCuoBie;
	private JTextField txtAntSue;
	private JTextField txtTotHab;

	/**
	 * Create the panel.
	 */
	public VistaAsientoContable() {
		
		setOpaque(false);
		setBounds(0, 0, 748, 722);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(54, 54, 54));
		panel.setBounds(0, 0, 748, 819);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Asiento Contable de Remuneraciones");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 36, 748, 35);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del Empleado");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1.setBounds(25, 99, 164, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Rut");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(491, 99, 48, 20);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cargo");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(25, 142, 164, 20);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha Entrega");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(491, 142, 81, 20);
		panel.add(lblNewLabel_1_1_1);
		
		txtNomEmp = new JTextField();
		txtNomEmp.setBounds(169, 100, 314, 20);
		panel.add(txtNomEmp);
		txtNomEmp.setColumns(10);
		
		txtCargo = new JTextField();
		txtCargo.setColumns(10);
		txtCargo.setBounds(169, 143, 314, 20);
		panel.add(txtCargo);
		
		textRut = new JTextField();
		textRut.setColumns(10);
		textRut.setBounds(582, 100, 150, 20);
		panel.add(textRut);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(582, 143, 150, 20);
		panel.add(dateChooser);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("DEBE");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(0, 214, 375, 20);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("HABER");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_2_1_1.setBounds(373, 214, 375, 20);
		panel.add(lblNewLabel_1_2_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(373, 228, 7, 350);
		panel.add(separator);
		
		JLabel lblNewLabel_1_3 = new JLabel("Sueldos");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(25, 259, 164, 20);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Gratificaciones");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(25, 290, 164, 20);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Horas Extraordinarias");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5.setBounds(25, 321, 164, 20);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Comisiones");
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1.setBounds(25, 352, 164, 20);
		panel.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Bonos");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1.setBounds(25, 383, 164, 20);
		panel.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Movilizacion");
		lblNewLabel_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1.setBounds(25, 414, 164, 20);
		panel.add(lblNewLabel_1_5_1);
		
		txtSue = new JTextField();
		txtSue.setColumns(10);
		txtSue.setBounds(187, 259, 150, 20);
		panel.add(txtSue);
		
		txtGra = new JTextField();
		txtGra.setColumns(10);
		txtGra.setBounds(187, 290, 150, 20);
		panel.add(txtGra);
		
		txtHorExt = new JTextField();
		txtHorExt.setColumns(10);
		txtHorExt.setBounds(187, 321, 150, 20);
		panel.add(txtHorExt);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Colacion");
		lblNewLabel_1_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1_1.setBounds(25, 445, 164, 20);
		panel.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Viaticos");
		lblNewLabel_1_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1_1.setBounds(25, 476, 164, 20);
		panel.add(lblNewLabel_1_4_1_1);
		
		JLabel lblNewLabel_1_5_1_1 = new JLabel("Asignacion Familiar");
		lblNewLabel_1_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_1.setBounds(25, 507, 164, 20);
		panel.add(lblNewLabel_1_5_1_1);
		
		txtCom = new JTextField();
		txtCom.setColumns(10);
		txtCom.setBounds(187, 352, 150, 20);
		panel.add(txtCom);
		
		txtBon = new JTextField();
		txtBon.setColumns(10);
		txtBon.setBounds(187, 383, 150, 20);
		panel.add(txtBon);
		
		txtMov = new JTextField();
		txtMov.setColumns(10);
		txtMov.setBounds(187, 414, 150, 20);
		panel.add(txtMov);
		
		txtCol = new JTextField();
		txtCol.setColumns(10);
		txtCol.setBounds(187, 445, 150, 20);
		panel.add(txtCol);
		
		txtVia = new JTextField();
		txtVia.setColumns(10);
		txtVia.setBounds(187, 476, 150, 20);
		panel.add(txtVia);
		
		txtAsiFam = new JTextField();
		txtAsiFam.setColumns(10);
		txtAsiFam.setBounds(187, 507, 150, 20);
		panel.add(txtAsiFam);
		
		JLabel lblNewLabel_1_5_1_1_1 = new JLabel("TOTAL");
		lblNewLabel_1_5_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_1_1.setBounds(90, 558, 96, 20);
		panel.add(lblNewLabel_1_5_1_1_1);
		
		txtTotDeb = new JTextField();
		txtTotDeb.setColumns(10);
		txtTotDeb.setBounds(151, 558, 150, 20);
		panel.add(txtTotDeb);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("AFP");
		lblNewLabel_1_3_2.setForeground(Color.WHITE);
		lblNewLabel_1_3_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_2.setBounds(397, 259, 164, 20);
		panel.add(lblNewLabel_1_3_2);
		
		txtAFP = new JTextField();
		txtAFP.setColumns(10);
		txtAFP.setBounds(536, 259, 147, 20);
		panel.add(txtAFP);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("FONASA");
		lblNewLabel_1_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_2.setBounds(397, 290, 164, 20);
		panel.add(lblNewLabel_1_4_2);
		
		txtFon = new JTextField();
		txtFon.setColumns(10);
		txtFon.setBounds(536, 290, 147, 20);
		panel.add(txtFon);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("ISAPRE");
		lblNewLabel_1_5_2.setForeground(Color.WHITE);
		lblNewLabel_1_5_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_2.setBounds(397, 321, 164, 20);
		panel.add(lblNewLabel_1_5_2);
		
		txtIsa = new JTextField();
		txtIsa.setColumns(10);
		txtIsa.setBounds(536, 321, 147, 20);
		panel.add(txtIsa);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Diferencia de ISAPRE");
		lblNewLabel_1_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1_2.setBounds(397, 352, 135, 20);
		panel.add(lblNewLabel_1_3_1_2);
		
		txtDifIsa = new JTextField();
		txtDifIsa.setColumns(10);
		txtDifIsa.setBounds(536, 352, 147, 20);
		panel.add(txtDifIsa);
		
		JLabel lblNewLabel_1_4_1_2 = new JLabel("Seguro de Cesantia");
		lblNewLabel_1_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1_2.setBounds(397, 383, 164, 20);
		panel.add(lblNewLabel_1_4_1_2);
		
		txtSegCes = new JTextField();
		txtSegCes.setColumns(10);
		txtSegCes.setBounds(536, 383, 147, 20);
		panel.add(txtSegCes);
		
		JLabel lblNewLabel_1_5_1_2 = new JLabel("Impuesto Unico");
		lblNewLabel_1_5_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_2.setBounds(397, 414, 164, 20);
		panel.add(lblNewLabel_1_5_1_2);
		
		txtImpUni = new JTextField();
		txtImpUni.setColumns(10);
		txtImpUni.setBounds(536, 414, 147, 20);
		panel.add(txtImpUni);
		
		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Cuota Sindical");
		lblNewLabel_1_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1_1_1.setBounds(397, 445, 164, 20);
		panel.add(lblNewLabel_1_3_1_1_1);
		
		txtCuoSin = new JTextField();
		txtCuoSin.setColumns(10);
		txtCuoSin.setBounds(536, 445, 147, 20);
		panel.add(txtCuoSin);
		
		JLabel lblNewLabel_1_4_1_1_1 = new JLabel("Cuota Bienestar");
		lblNewLabel_1_4_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1_1_1.setBounds(397, 476, 164, 20);
		panel.add(lblNewLabel_1_4_1_1_1);
		
		txtCuoBie = new JTextField();
		txtCuoBie.setColumns(10);
		txtCuoBie.setBounds(536, 476, 147, 20);
		panel.add(txtCuoBie);
		
		JLabel lblNewLabel_1_5_1_1_2 = new JLabel("Anticipo de Sueldo");
		lblNewLabel_1_5_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_1_2.setBounds(397, 507, 164, 20);
		panel.add(lblNewLabel_1_5_1_1_2);
		
		txtAntSue = new JTextField();
		txtAntSue.setColumns(10);
		txtAntSue.setBounds(536, 507, 147, 20);
		panel.add(txtAntSue);
		
		JLabel lblNewLabel_1_5_1_1_1_1 = new JLabel("TOTAL");
		lblNewLabel_1_5_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_1_1_1.setBounds(455, 558, 96, 20);
		panel.add(lblNewLabel_1_5_1_1_1_1);
		
		txtTotHab = new JTextField();
		txtTotHab.setColumns(10);
		txtTotHab.setBounds(516, 558, 150, 20);
		panel.add(txtTotHab);

	}
}
