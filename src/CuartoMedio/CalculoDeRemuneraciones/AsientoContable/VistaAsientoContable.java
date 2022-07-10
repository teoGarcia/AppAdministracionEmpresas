package CuartoMedio.CalculoDeRemuneraciones.AsientoContable;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JSeparator;
import javax.swing.JButton;
import ui.Buttons.StandarButton;

public class VistaAsientoContable extends JPanel {
	
	private JTextField txtNomEmp;
	private JTextField txtCargo;
	private JTextField txtRut;
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
	private JTextField txtFonasa;
	private JTextField txtIsa;
	private JTextField txtDifIsa;
	private JTextField txtSegCes;
	private JTextField txtImpUni;
	private JTextField txtCuoSin;
	private JTextField txtCuoBie;
	private JTextField txtAntSue;
	private JTextField txtTotHab;
	private JTextField txtSulPagoRemun;
	private JTextField txtCajaBanRemu;
	private JTextField txtGlosaRemu;
	private JTextField txtAportePatronal;
	private JTextField txtCajaBancoAportePatronal;
	private JTextField txtGlosaAportePatronal;
	private StandarButton btnGuardar;
	private JDateChooser fechaEntrega;
	
	private ControlAsientoContable control;

	/**
	 * Create the panel.
	 */
	public VistaAsientoContable() {
		
		setOpaque(false);
		setBounds(0, 0, 767, 722);
		setLayout(null);
		
		control = new ControlAsientoContable(this);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(54, 54, 54));
		panel.setBounds(0, 10, 748, 819);
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
		lblNewLabel_1.setBounds(25, 74, 164, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Rut");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(491, 74, 48, 20);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cargo");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(25, 117, 164, 20);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha Entrega");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(491, 117, 81, 20);
		panel.add(lblNewLabel_1_1_1);
		
		txtNomEmp = new JTextField();
		txtNomEmp.setBounds(169, 75, 314, 20);
		panel.add(txtNomEmp);
		txtNomEmp.setColumns(10);
		
		txtCargo = new JTextField();
		txtCargo.setColumns(10);
		txtCargo.setBounds(169, 118, 314, 20);
		panel.add(txtCargo);
		
		txtRut = new JTextField();
		txtRut.setColumns(10);
		txtRut.setBounds(582, 75, 150, 20);
		panel.add(txtRut);
		
		fechaEntrega = new JDateChooser();
		fechaEntrega.setBounds(582, 118, 150, 20);
		panel.add(fechaEntrega);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("DEBE");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(0, 167, 375, 20);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("HABER");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_2_1_1.setBounds(373, 167, 375, 20);
		panel.add(lblNewLabel_1_2_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(370, 167, 7, 350);
		panel.add(separator);
		
		JLabel lblNewLabel_1_3 = new JLabel("Sueldos");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(25, 197, 164, 20);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Gratificaciones");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(25, 228, 164, 20);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Horas Extraordinarias");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5.setBounds(25, 259, 164, 20);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Comisiones");
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1.setBounds(25, 290, 164, 20);
		panel.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Bonos");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1.setBounds(25, 321, 164, 20);
		panel.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Movilizacion");
		lblNewLabel_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1.setBounds(25, 352, 164, 20);
		panel.add(lblNewLabel_1_5_1);
		
		txtSue = new JTextField();
		txtSue.setColumns(10);
		txtSue.setBounds(187, 197, 150, 20);
		panel.add(txtSue);
		
		txtGra = new JTextField();
		txtGra.setColumns(10);
		txtGra.setBounds(187, 228, 150, 20);
		panel.add(txtGra);
		
		txtHorExt = new JTextField();
		txtHorExt.setColumns(10);
		txtHorExt.setBounds(187, 259, 150, 20);
		panel.add(txtHorExt);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Colacion");
		lblNewLabel_1_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1_1.setBounds(25, 383, 164, 20);
		panel.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Viaticos");
		lblNewLabel_1_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1_1.setBounds(25, 414, 164, 20);
		panel.add(lblNewLabel_1_4_1_1);
		
		JLabel lblNewLabel_1_5_1_1 = new JLabel("Asignacion Familiar");
		lblNewLabel_1_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_1.setBounds(25, 445, 164, 20);
		panel.add(lblNewLabel_1_5_1_1);
		
		txtCom = new JTextField();
		txtCom.setColumns(10);
		txtCom.setBounds(187, 290, 150, 20);
		panel.add(txtCom);
		
		txtBon = new JTextField();
		txtBon.setColumns(10);
		txtBon.setBounds(187, 321, 150, 20);
		panel.add(txtBon);
		
		txtMov = new JTextField();
		txtMov.setColumns(10);
		txtMov.setBounds(187, 352, 150, 20);
		panel.add(txtMov);
		
		txtCol = new JTextField();
		txtCol.setColumns(10);
		txtCol.setBounds(187, 383, 150, 20);
		panel.add(txtCol);
		
		txtVia = new JTextField();
		txtVia.setColumns(10);
		txtVia.setBounds(187, 414, 150, 20);
		panel.add(txtVia);
		
		txtAsiFam = new JTextField();
		txtAsiFam.setColumns(10);
		txtAsiFam.setBounds(187, 445, 150, 20);
		panel.add(txtAsiFam);
		
		JLabel lblNewLabel_1_5_1_1_1 = new JLabel("TOTAL");
		lblNewLabel_1_5_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_1_1.setBounds(90, 496, 96, 20);
		panel.add(lblNewLabel_1_5_1_1_1);
		
		txtTotDeb = new JTextField();
		txtTotDeb.setColumns(10);
		txtTotDeb.setBounds(151, 496, 150, 20);
		panel.add(txtTotDeb);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("AFP");
		lblNewLabel_1_3_2.setForeground(Color.WHITE);
		lblNewLabel_1_3_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_2.setBounds(397, 197, 164, 20);
		panel.add(lblNewLabel_1_3_2);
		
		txtAFP = new JTextField();
		txtAFP.setColumns(10);
		txtAFP.setBounds(536, 197, 147, 20);
		panel.add(txtAFP);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("FONASA");
		lblNewLabel_1_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_2.setBounds(397, 228, 164, 20);
		panel.add(lblNewLabel_1_4_2);
		
		txtFonasa = new JTextField();
		txtFonasa.setColumns(10);
		txtFonasa.setBounds(536, 228, 147, 20);
		panel.add(txtFonasa);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("ISAPRE");
		lblNewLabel_1_5_2.setForeground(Color.WHITE);
		lblNewLabel_1_5_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_2.setBounds(397, 259, 164, 20);
		panel.add(lblNewLabel_1_5_2);
		
		txtIsa = new JTextField();
		txtIsa.setColumns(10);
		txtIsa.setBounds(536, 259, 147, 20);
		panel.add(txtIsa);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Diferencia de ISAPRE");
		lblNewLabel_1_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1_2.setBounds(397, 290, 135, 20);
		panel.add(lblNewLabel_1_3_1_2);
		
		txtDifIsa = new JTextField();
		txtDifIsa.setColumns(10);
		txtDifIsa.setBounds(536, 290, 147, 20);
		panel.add(txtDifIsa);
		
		JLabel lblNewLabel_1_4_1_2 = new JLabel("Seguro de Cesantia");
		lblNewLabel_1_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1_2.setBounds(397, 321, 164, 20);
		panel.add(lblNewLabel_1_4_1_2);
		
		txtSegCes = new JTextField();
		txtSegCes.setColumns(10);
		txtSegCes.setBounds(536, 321, 147, 20);
		panel.add(txtSegCes);
		
		JLabel lblNewLabel_1_5_1_2 = new JLabel("Impuesto Unico");
		lblNewLabel_1_5_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_2.setBounds(397, 352, 164, 20);
		panel.add(lblNewLabel_1_5_1_2);
		
		txtImpUni = new JTextField();
		txtImpUni.setColumns(10);
		txtImpUni.setBounds(536, 352, 147, 20);
		panel.add(txtImpUni);
		
		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Cuota Sindical");
		lblNewLabel_1_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1_1_1.setBounds(397, 383, 164, 20);
		panel.add(lblNewLabel_1_3_1_1_1);
		
		txtCuoSin = new JTextField();
		txtCuoSin.setColumns(10);
		txtCuoSin.setBounds(536, 383, 147, 20);
		panel.add(txtCuoSin);
		
		JLabel lblNewLabel_1_4_1_1_1 = new JLabel("Cuota Bienestar");
		lblNewLabel_1_4_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_1_1_1.setBounds(397, 414, 164, 20);
		panel.add(lblNewLabel_1_4_1_1_1);
		
		txtCuoBie = new JTextField();
		txtCuoBie.setColumns(10);
		txtCuoBie.setBounds(536, 414, 147, 20);
		panel.add(txtCuoBie);
		
		JLabel lblNewLabel_1_5_1_1_2 = new JLabel("Anticipo de Sueldo");
		lblNewLabel_1_5_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_1_2.setBounds(397, 445, 164, 20);
		panel.add(lblNewLabel_1_5_1_1_2);
		
		txtAntSue = new JTextField();
		txtAntSue.setColumns(10);
		txtAntSue.setBounds(536, 445, 147, 20);
		panel.add(txtAntSue);
		
		JLabel lblNewLabel_1_5_1_1_1_1 = new JLabel("TOTAL");
		lblNewLabel_1_5_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_1_1_1_1.setBounds(455, 496, 96, 20);
		panel.add(lblNewLabel_1_5_1_1_1_1);
		
		txtTotHab  = new JTextField();
		txtTotHab.setColumns(10);
		txtTotHab.setBounds(516, 496, 150, 20);
		panel.add(txtTotHab);
		
		JLabel lblTitulo2 = new JLabel("Asien. cont. de pago de remuneraciones");
		lblTitulo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo2.setForeground(Color.WHITE);
		lblTitulo2.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitulo2.setBounds(0, 527, 375, 35);
		panel.add(lblTitulo2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Sueldos Pagado");
		lblNewLabel_1_3_3.setForeground(Color.WHITE);
		lblNewLabel_1_3_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_3.setBounds(25, 575, 164, 20);
		panel.add(lblNewLabel_1_3_3);
		
		txtSulPagoRemun = new JTextField();
		txtSulPagoRemun.setColumns(10);
		txtSulPagoRemun.setBounds(187, 575, 150, 20);
		panel.add(txtSulPagoRemun);
		
		JLabel lblNewLabel_1_4_3 = new JLabel("Caja o Banco");
		lblNewLabel_1_4_3.setForeground(Color.WHITE);
		lblNewLabel_1_4_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_3.setBounds(25, 606, 164, 20);
		panel.add(lblNewLabel_1_4_3);
		
		txtCajaBanRemu = new JTextField();
		txtCajaBanRemu.setColumns(10);
		txtCajaBanRemu.setBounds(187, 606, 150, 20);
		panel.add(txtCajaBanRemu);
		
		JLabel lblNewLabel_1_5_3 = new JLabel("Glosa");
		lblNewLabel_1_5_3.setForeground(Color.WHITE);
		lblNewLabel_1_5_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_3.setBounds(25, 637, 164, 20);
		panel.add(lblNewLabel_1_5_3);
		
		txtGlosaRemu = new JTextField();
		txtGlosaRemu.setColumns(10);
		txtGlosaRemu.setBounds(187, 637, 150, 20);
		panel.add(txtGlosaRemu);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(373, 555, 2, 98);
		panel.add(separator_1);
		
		JLabel lblNewLabel_1_3_3_1 = new JLabel("Aporte patronal");
		lblNewLabel_1_3_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_3_1.setBounds(398, 575, 164, 20);
		panel.add(lblNewLabel_1_3_3_1);
		
		txtAportePatronal = new JTextField();
		txtAportePatronal.setColumns(10);
		txtAportePatronal.setBounds(560, 575, 150, 20);
		panel.add(txtAportePatronal);
		
		JLabel lblNewLabel_1_4_3_1 = new JLabel("Caja o Banco");
		lblNewLabel_1_4_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_4_3_1.setBounds(398, 606, 164, 20);
		panel.add(lblNewLabel_1_4_3_1);
		
		txtCajaBancoAportePatronal = new JTextField();
		txtCajaBancoAportePatronal.setColumns(10);
		txtCajaBancoAportePatronal.setBounds(560, 606, 150, 20);
		panel.add(txtCajaBancoAportePatronal);
		
		JLabel lblNewLabel_1_5_3_1 = new JLabel("Glosa");
		lblNewLabel_1_5_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_3_1.setBounds(398, 637, 164, 20);
		panel.add(lblNewLabel_1_5_3_1);
		
		txtGlosaAportePatronal = new JTextField();
		txtGlosaAportePatronal.setColumns(10);
		txtGlosaAportePatronal.setBounds(560, 637, 150, 20);
		panel.add(txtGlosaAportePatronal);
		
		JLabel lblAsienContDe = new JLabel("Asien. cont. de pago de aporte patronal");
		lblAsienContDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblAsienContDe.setForeground(Color.WHITE);
		lblAsienContDe.setFont(new Font("Dialog", Font.BOLD, 18));
		lblAsienContDe.setBounds(373, 527, 375, 35);
		panel.add(lblAsienContDe);
		
		btnGuardar = new StandarButton("New button");
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(582, 669, 128, 35);
		btnGuardar.addActionListener(control);
		panel.add(btnGuardar);

	}
	
	public boolean camposVacios() {
		
		if(txtNomEmp.getText().length() <= 0 || 
			txtRut.getText().length() <= 0 ||
			txtCargo.getText().length() <= 0 ||
			fechaEntrega.getCalendar().getTime() == null || 
			txtSue.getText().length() <= 0 ||
			txtGra.getText().length() <= 0 ||
			txtHorExt.getText().length() <= 0 ||
			txtCom.getText().length() <= 0 ||
			txtBon.getText().length() <= 0 ||
			txtMov.getText().length() <= 0 ||
			txtCol.getText().length() <= 0 ||
			txtVia.getText().length() <= 0 ||
			txtAsiFam.getText().length() <= 0 ||
			txtAFP.getText().length() <= 0 ||
			txtFonasa.getText().length() <= 0 ||
			txtIsa.getText().length() <= 0 ||
			txtDifIsa.getText().length() <= 0 ||
			txtSegCes.getText().length() <= 0 ||
			txtImpUni.getText().length() <= 0 ||
			txtCuoSin.getText().length() <= 0 ||
			txtCuoBie.getText().length() <= 0 ||
			txtAntSue.getText().length() <= 0 ||
			txtSulPagoRemun.getText().length() <= 0 ||
			txtCajaBanRemu.getText().length() <= 0 ||
			txtGlosaRemu.getText().length() <= 0 ||
			txtAportePatronal.getText().length() <= 0 ||
			txtCajaBancoAportePatronal.getText().length() <= 0 ||
			txtGlosaAportePatronal.getText().length() <= 0) {
			return false;
		}
		
		
		return true;
	}
	
	public void VaciarForm() {
		txtNomEmp.setText(""); 
				txtRut.setText("");
				txtCargo.setText("");
				fechaEntrega.setCalendar(null);
				txtSue.setText("");
				txtGra.setText("");
				txtHorExt.setText("");
				txtCom.setText("");
				txtBon.setText("");
				txtMov.setText("");
				txtCol.setText("");
				txtVia.setText("");
				txtAsiFam.setText("");
				txtAFP.setText("");
				txtFonasa.setText("");
				txtIsa.setText("");
				txtDifIsa.setText("");
				txtSegCes.setText("");
				txtImpUni.setText("");
				txtCuoSin.setText("");
				txtCuoBie.setText("");
				txtAntSue.setText("");
				txtSulPagoRemun.setText("");
				txtCajaBanRemu.setText("");
				txtGlosaRemu.setText("");
				txtAportePatronal.setText("");
				txtCajaBancoAportePatronal.setText("");
				txtGlosaAportePatronal.setText("");
	}

	public JTextField getTxtNomEmp() {
		return txtNomEmp;
	}

	public void setTxtNomEmp(JTextField txtNomEmp) {
		this.txtNomEmp = txtNomEmp;
	}

	public JTextField getTxtCargo() {
		return txtCargo;
	}

	public void setTxtCargo(JTextField txtCargo) {
		this.txtCargo = txtCargo;
	}

	public JTextField getTextRut() {
		return txtRut;
	}

	public void setTextRut(JTextField textRut) {
		this.txtRut = textRut;
	}

	public JTextField getTxtSue() {
		return txtSue;
	}

	public void setTxtSue(JTextField txtSue) {
		this.txtSue = txtSue;
	}

	public JTextField getTxtGra() {
		return txtGra;
	}

	public void setTxtGra(JTextField txtGra) {
		this.txtGra = txtGra;
	}

	public JTextField getTxtHorExt() {
		return txtHorExt;
	}

	public void setTxtHorExt(JTextField txtHorExt) {
		this.txtHorExt = txtHorExt;
	}

	public JTextField getTxtCom() {
		return txtCom;
	}

	public void setTxtCom(JTextField txtCom) {
		this.txtCom = txtCom;
	}

	public JTextField getTxtBon() {
		return txtBon;
	}

	public void setTxtBon(JTextField txtBon) {
		this.txtBon = txtBon;
	}

	public JTextField getTxtMov() {
		return txtMov;
	}

	public void setTxtMov(JTextField txtMov) {
		this.txtMov = txtMov;
	}

	public JTextField getTxtCol() {
		return txtCol;
	}

	public void setTxtCol(JTextField txtCol) {
		this.txtCol = txtCol;
	}

	public JTextField getTxtVia() {
		return txtVia;
	}

	public void setTxtVia(JTextField txtVia) {
		this.txtVia = txtVia;
	}

	public JTextField getTxtAsiFam() {
		return txtAsiFam;
	}

	public void setTxtAsiFam(JTextField txtAsiFam) {
		this.txtAsiFam = txtAsiFam;
	}

	public JTextField getTxtTotDeb() {
		return txtTotDeb;
	}

	public void setTxtTotDeb(JTextField txtTotDeb) {
		this.txtTotDeb = txtTotDeb;
	}

	public JTextField getTxtAFP() {
		return txtAFP;
	}

	public void setTxtAFP(JTextField txtAFP) {
		this.txtAFP = txtAFP;
	}

	public JTextField getTxtFon() {
		return txtFonasa;
	}

	public void setTxtFon(JTextField txtFon) {
		this.txtFonasa = txtFon;
	}

	public JTextField getTxtIsa() {
		return txtIsa;
	}

	public void setTxtIsa(JTextField txtIsa) {
		this.txtIsa = txtIsa;
	}

	public JTextField getTxtDifIsa() {
		return txtDifIsa;
	}

	public void setTxtDifIsa(JTextField txtDifIsa) {
		this.txtDifIsa = txtDifIsa;
	}

	public JTextField getTxtSegCes() {
		return txtSegCes;
	}

	public void setTxtSegCes(JTextField txtSegCes) {
		this.txtSegCes = txtSegCes;
	}

	public JTextField getTxtImpUni() {
		return txtImpUni;
	}

	public void setTxtImpUni(JTextField txtImpUni) {
		this.txtImpUni = txtImpUni;
	}

	public JTextField getTxtCuoSin() {
		return txtCuoSin;
	}

	public void setTxtCuoSin(JTextField txtCuoSin) {
		this.txtCuoSin = txtCuoSin;
	}

	public JTextField getTxtCuoBie() {
		return txtCuoBie;
	}

	public void setTxtCuoBie(JTextField txtCuoBie) {
		this.txtCuoBie = txtCuoBie;
	}

	public JTextField getTxtAntSue() {
		return txtAntSue;
	}

	public void setTxtAntSue(JTextField txtAntSue) {
		this.txtAntSue = txtAntSue;
	}

	public JTextField getTxtTotHab() {
		return txtTotHab;
	}

	public void setTxtTotHab(JTextField txtTotHab) {
		this.txtTotHab = txtTotHab;
	}

	public JTextField getTxtSulPagoRemun() {
		return txtSulPagoRemun;
	}

	public void setTxtSulPagoRemun(JTextField txtSulPagoRemun) {
		this.txtSulPagoRemun = txtSulPagoRemun;
	}

	public JTextField getTxtCajaBanRemu() {
		return txtCajaBanRemu;
	}

	public void setTxtCajaBanRemu(JTextField txtCajaBanRemu) {
		this.txtCajaBanRemu = txtCajaBanRemu;
	}

	public JTextField getTxtGlosaRemu() {
		return txtGlosaRemu;
	}

	public void setTxtGlosaRemu(JTextField txtGlosaRemu) {
		this.txtGlosaRemu = txtGlosaRemu;
	}

	public JTextField getTxtAportePatronal() {
		return txtAportePatronal;
	}

	public void setTxtAportePatronal(JTextField txtAportePatronal) {
		this.txtAportePatronal = txtAportePatronal;
	}

	public JTextField getTxtCajaBancoAportePatronal() {
		return txtCajaBancoAportePatronal;
	}

	public void setTxtCajaBancoAportePatronal(JTextField txtCajaBancoAportePatronal) {
		this.txtCajaBancoAportePatronal = txtCajaBancoAportePatronal;
	}

	public JTextField getTxtGlosaAportePatronal() {
		return txtGlosaAportePatronal;
	}

	public void setTxtGlosaAportePatronal(JTextField txtGlosaAportePatronal) {
		this.txtGlosaAportePatronal = txtGlosaAportePatronal;
	}

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JTextField getTxtRut() {
		return txtRut;
	}

	public void setTxtRut(JTextField txtRut) {
		this.txtRut = txtRut;
	}

	public JTextField getTxtFonasa() {
		return txtFonasa;
	}

	public void setTxtFonasa(JTextField txtFonasa) {
		this.txtFonasa = txtFonasa;
	}

	public JDateChooser getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(JDateChooser fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
}
