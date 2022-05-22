package CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;

public class VistaLiquidacionSueldo extends JPanel {
	
	private ControlLiquidacionSueldo cls;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtSueBas;
	private JTextField txtHorExt;
	private JTextField txtBonGesMen;
	private JTextField txtPar;
	private JTextField txtCom;
	private JTextField txtGra;
	private JTextField txtAsiFam;
	private JTextField txtCol;
	private JTextField txtAsiMov;
	private JTextField txtTotHab;
	private JTextField txtAFP;
	private JTextField txtSegCes;
	private JTextField txtSal;
	private JTextField txtDifIsa;
	private JTextField txtImpUni;
	private JTextField txtCuoBie;
	private JTextField txtCuoAhoLib;
	private JTextField txtCCFA;
	private JTextField txtTotDes;
	private JTextField txtSueLiqLet;
	private JTextField txtAlcLiq;
	private JTextField txtValAnt;
	private JTextField txtTotSueLiq;
	private JButton btnCalcularHaberes;
	private JButton btnCalcularDescuentos;
	private JButton btnGuardar;
	private JButton btnImprimir;
	private JButton btnBuscar;

	/**
	 * Create the panel.
	 */
	public VistaLiquidacionSueldo() {
		
		cls = new ControlLiquidacionSueldo(this);
		
		setOpaque(false);
		setBounds(0, 0, 748, 722);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(748, 1120));
		
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Liquidaci\u00F3n de sueldo");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitulo.setBounds(0, 36, 748, 45);
		panel.add(lblTitulo);
		
		JLabel lblNomEmp = new JLabel("Nombre de Empresa");
		lblNomEmp.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNomEmp.setBounds(20, 104, 153, 24);
		panel.add(lblNomEmp);
		
		JLabel lblRutEmp = new JLabel("Rut");
		lblRutEmp.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblRutEmp.setBounds(502, 104, 107, 24);
		panel.add(lblRutEmp);
		
		JLabel lblNomTra = new JLabel("Nombre de Trabajador");
		lblNomTra.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNomTra.setBounds(20, 145, 136, 24);
		panel.add(lblNomTra);
		
		JLabel lblRutTra = new JLabel("Rut");
		lblRutTra.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblRutTra.setBounds(502, 145, 107, 24);
		panel.add(lblRutTra);
		
		textField = new JTextField();
		textField.setBounds(183, 107, 296, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 146, 296, 24);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(551, 106, 189, 24);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(551, 145, 189, 24);
		panel.add(textField_3);
		
		JLabel lblNewLabel_2 = new JLabel("Detalles de la Remuneraci\u00F3n");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2.setBounds(20, 194, 215, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblPagSue = new JLabel("Pago de sueldo del mes de ");
		lblPagSue.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPagSue.setBounds(20, 229, 166, 24);
		panel.add(lblPagSue);
		
		JMonthChooser monthChooserPago = new JMonthChooser();
		monthChooserPago.getComboBox().setFont(new Font("Dialog", Font.PLAIN, 12));
		monthChooserPago.setBounds(203, 228, 112, 25);
		panel.add(monthChooserPago);
		
		JLabel lblNewLabel_3 = new JLabel("de");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(335, 229, 26, 24);
		panel.add(lblNewLabel_3);
		
		JYearChooser yearChooserPago = new JYearChooser();
		yearChooserPago.getSpinner().setFont(new Font("Dialog", Font.PLAIN, 12));
		yearChooserPago.setBounds(373, 229, 72, 24);
		panel.add(yearChooserPago);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBounds(383, 274, 9, 239);
		panel.add(separator);
		
		JLabel lblRemuneracion = new JLabel("Remuneraci\u00F3n Imponible");
		lblRemuneracion.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRemuneracion.setBounds(110, 268, 166, 24);
		panel.add(lblRemuneracion);
		
		JLabel lblRemuneracion2 = new JLabel("Remuneraci\u00F3n no Imponible");
		lblRemuneracion2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRemuneracion2.setBounds(493, 268, 177, 24);
		panel.add(lblRemuneracion2);
		
		JLabel lblSueBas = new JLabel("Sueldo Base");
		lblSueBas.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSueBas.setBounds(20, 314, 153, 24);
		panel.add(lblSueBas);
		
		txtSueBas = new JTextField();
		txtSueBas.setColumns(10);
		txtSueBas.setBounds(171, 314, 199, 24);
		panel.add(txtSueBas);
		
		JLabel lblHorExt = new JLabel("Horas Extraordinarias");
		lblHorExt.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblHorExt.setBounds(20, 349, 153, 24);
		panel.add(lblHorExt);
		
		txtHorExt = new JTextField();
		txtHorExt.setColumns(10);
		txtHorExt.setBounds(171, 349, 199, 24);
		panel.add(txtHorExt);
		
		JLabel lblBonGes = new JLabel("Bono de Gestion Mensual");
		lblBonGes.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBonGes.setBounds(20, 384, 153, 24);
		panel.add(lblBonGes);
		
		txtBonGesMen = new JTextField();
		txtBonGesMen.setColumns(10);
		txtBonGesMen.setBounds(171, 384, 199, 24);
		panel.add(txtBonGesMen);
		
		JLabel lblPar = new JLabel("Participaci\u00F3n");
		lblPar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPar.setBounds(20, 419, 153, 24);
		panel.add(lblPar);
		
		txtPar = new JTextField();
		txtPar.setColumns(10);
		txtPar.setBounds(171, 419, 199, 24);
		panel.add(txtPar);
		
		JLabel lblCom = new JLabel("Comisiones");
		lblCom.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCom.setBounds(20, 454, 153, 24);
		panel.add(lblCom);
		
		txtCom = new JTextField();
		txtCom.setColumns(10);
		txtCom.setBounds(171, 454, 199, 24);
		panel.add(txtCom);
		
		JLabel lblGra = new JLabel("Gratificaci\u00F3n");
		lblGra.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblGra.setBounds(20, 489, 153, 24);
		panel.add(lblGra);
		
		txtGra = new JTextField();
		txtGra.setColumns(10);
		txtGra.setBounds(171, 489, 199, 24);
		panel.add(txtGra);
		
		JLabel lblCarAsiFam = new JLabel("Cargas Asig. Familiar");
		lblCarAsiFam.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCarAsiFam.setBounds(400, 314, 153, 24);
		panel.add(lblCarAsiFam);
		
		txtAsiFam = new JTextField();
		txtAsiFam.setColumns(10);
		txtAsiFam.setBounds(551, 314, 189, 24);
		panel.add(txtAsiFam);
		
		JLabel lblCol = new JLabel("Asignaci\u00F3n de Colaci\u00F3n");
		lblCol.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCol.setBounds(400, 349, 153, 24);
		panel.add(lblCol);
		
		txtCol = new JTextField();
		txtCol.setColumns(10);
		txtCol.setBounds(551, 349, 189, 24);
		panel.add(txtCol);
		
		JLabel lblMov = new JLabel("Asignaci\u00F3n de Movilizaci\u00F3n");
		lblMov.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMov.setBounds(400, 384, 153, 24);
		panel.add(lblMov);
		
		txtAsiMov = new JTextField();
		txtAsiMov.setColumns(10);
		txtAsiMov.setBounds(551, 384, 189, 24);
		panel.add(txtAsiMov);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 575, 748, 10);
		panel.add(separator_1);
		
		JLabel lblTotHab = new JLabel("Total Haberes");
		lblTotHab.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotHab.setBounds(256, 540, 124, 24);
		panel.add(lblTotHab);
		
		txtTotHab = new JTextField();
		txtTotHab.setEditable(false);
		txtTotHab.setColumns(10);
		txtTotHab.setBounds(385, 540, 166, 24);
		panel.add(txtTotHab);
		
		JLabel lblDescuentos = new JLabel("Descuentos Previsionales");
		lblDescuentos.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDescuentos.setBounds(110, 586, 166, 24);
		panel.add(lblDescuentos);
		
		JLabel lblAFP = new JLabel("AFP");
		lblAFP.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAFP.setBounds(20, 621, 153, 24);
		panel.add(lblAFP);
		
		txtAFP = new JTextField();
		txtAFP.setColumns(10);
		txtAFP.setBounds(171, 621, 199, 24);
		panel.add(txtAFP);
		
		JLabel lblSegCes = new JLabel("Seguro de Cesantia (0,6%)");
		lblSegCes.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSegCes.setBounds(20, 656, 153, 24);
		panel.add(lblSegCes);
		
		txtSegCes = new JTextField();
		txtSegCes.setColumns(10);
		txtSegCes.setBounds(171, 656, 199, 24);
		panel.add(txtSegCes);
		
		JLabel lblSal = new JLabel("Salud (7%)");
		lblSal.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSal.setBounds(20, 691, 153, 24);
		panel.add(lblSal);
		
		txtSal = new JTextField();
		txtSal.setColumns(10);
		txtSal.setBounds(171, 691, 199, 24);
		panel.add(txtSal);
		
		JLabel lblDifIsa = new JLabel("Diferencia de Isapre");
		lblDifIsa.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDifIsa.setBounds(20, 726, 153, 24);
		panel.add(lblDifIsa);
		
		txtDifIsa = new JTextField();
		txtDifIsa.setColumns(10);
		txtDifIsa.setBounds(171, 726, 199, 24);
		panel.add(txtDifIsa);
		
		JLabel lblImpUni = new JLabel("Impuesto Unico");
		lblImpUni.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblImpUni.setBounds(20, 761, 153, 24);
		panel.add(lblImpUni);
		
		txtImpUni = new JTextField();
		txtImpUni.setColumns(10);
		txtImpUni.setBounds(171, 761, 199, 24);
		panel.add(txtImpUni);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(383, 581, 9, 239);
		panel.add(separator_2);
		
		JLabel lblDescuentos2 = new JLabel("Otros descuentos");
		lblDescuentos2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDescuentos2.setBounds(536, 586, 116, 24);
		panel.add(lblDescuentos2);
		
		JLabel lblCuoBie = new JLabel("Cuota Bienestar");
		lblCuoBie.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCuoBie.setBounds(400, 621, 153, 24);
		panel.add(lblCuoBie);
		
		txtCuoBie = new JTextField();
		txtCuoBie.setColumns(10);
		txtCuoBie.setBounds(551, 621, 189, 24);
		panel.add(txtCuoBie);
		
		JLabel lblAhoLib = new JLabel("Cuota Ahorro Libreta");
		lblAhoLib.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAhoLib.setBounds(400, 656, 153, 24);
		panel.add(lblAhoLib);
		
		txtCuoAhoLib = new JTextField();
		txtCuoAhoLib.setColumns(10);
		txtCuoAhoLib.setBounds(551, 656, 189, 24);
		panel.add(txtCuoAhoLib);
		
		JLabel lblCCFA = new JLabel("Cr\u00E9dito CCFA La Araucana");
		lblCCFA.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCCFA.setBounds(400, 691, 153, 24);
		panel.add(lblCCFA);
		
		txtCCFA = new JTextField();
		txtCCFA.setColumns(10);
		txtCCFA.setBounds(551, 691, 189, 24);
		panel.add(txtCCFA);
		
		JLabel lblTotDes = new JLabel("Total Descuentos");
		lblTotDes.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotDes.setBounds(256, 846, 124, 24);
		panel.add(lblTotDes);
		
		txtTotDes = new JTextField();
		txtTotDes.setEditable(false);
		txtTotDes.setColumns(10);
		txtTotDes.setBounds(385, 847, 166, 24);
		panel.add(txtTotDes);
		
		JLabel lblSueLiqLet = new JLabel("Sueldo L\u00EDquido en Letras");
		lblSueLiqLet.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSueLiqLet.setBounds(20, 910, 189, 24);
		panel.add(lblSueLiqLet);
		
		txtSueLiqLet = new JTextField();
		txtSueLiqLet.setColumns(10);
		txtSueLiqLet.setBounds(190, 910, 550, 24);
		panel.add(txtSueLiqLet);
		
		JLabel lblAlcLiq = new JLabel("Alcance L\u00EDquido");
		lblAlcLiq.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAlcLiq.setBounds(400, 945, 153, 24);
		panel.add(lblAlcLiq);
		
		txtAlcLiq = new JTextField();
		txtAlcLiq.setColumns(10);
		txtAlcLiq.setBounds(551, 945, 189, 24);
		panel.add(txtAlcLiq);
		
		JLabel lblValAnt = new JLabel("Vales o Anticipos");
		lblValAnt.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblValAnt.setBounds(402, 980, 153, 24);
		panel.add(lblValAnt);
		
		txtValAnt = new JTextField();
		txtValAnt.setColumns(10);
		txtValAnt.setBounds(553, 980, 189, 24);
		panel.add(txtValAnt);
		
		JLabel lblSueLiq = new JLabel("Sueldo L\u00EDquido");
		lblSueLiq.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSueLiq.setBounds(402, 1015, 153, 24);
		panel.add(lblSueLiq);
		
		txtTotSueLiq = new JTextField();
		txtTotSueLiq.setColumns(10);
		txtTotSueLiq.setBounds(553, 1015, 189, 24);
		panel.add(txtTotSueLiq);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(0, 885, 748, 10);
		panel.add(separator_1_1);
		
		btnCalcularHaberes = new JButton("Calcular");
		btnCalcularHaberes.setBounds(579, 541, 85, 24);
		btnCalcularHaberes.addActionListener(cls);
		panel.add(btnCalcularHaberes);
		
		btnCalcularDescuentos = new JButton("Calcular");
		btnCalcularDescuentos.setBounds(580, 847, 85, 24);
		btnCalcularDescuentos.addActionListener(cls);
		panel.add(btnCalcularDescuentos);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(653, 1060, 85, 28);
		panel.add(btnGuardar);
		
		btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(551, 1060, 85, 28);
		panel.add(btnImprimir);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(447, 1060, 85, 28);
		panel.add(btnBuscar);

	}

	public JTextField getTxtSueBas() {
		return txtSueBas;
	}

	public void setTxtSueBas(JTextField txtSueBas) {
		this.txtSueBas = txtSueBas;
	}

	public JTextField getTxtHorExt() {
		return txtHorExt;
	}

	public void setTxtHorExt(JTextField txtHorExt) {
		this.txtHorExt = txtHorExt;
	}

	public JTextField getTxtBonGesMen() {
		return txtBonGesMen;
	}

	public void setTxtBonGesMen(JTextField txtBonGesMen) {
		this.txtBonGesMen = txtBonGesMen;
	}

	public JTextField getTxtPar() {
		return txtPar;
	}

	public void setTxtPar(JTextField txtPar) {
		this.txtPar = txtPar;
	}

	public JTextField getTxtCom() {
		return txtCom;
	}

	public void setTxtCom(JTextField txtCom) {
		this.txtCom = txtCom;
	}

	public JTextField getTxtGra() {
		return txtGra;
	}

	public void setTxtGra(JTextField txtGra) {
		this.txtGra = txtGra;
	}

	public JTextField getTxtAsiFam() {
		return txtAsiFam;
	}

	public void setTxtAsiFam(JTextField txtAsiFam) {
		this.txtAsiFam = txtAsiFam;
	}

	public JTextField getTxtCol() {
		return txtCol;
	}

	public void setTxtCol(JTextField txtCol) {
		this.txtCol = txtCol;
	}

	public JTextField getTxtAsiMov() {
		return txtAsiMov;
	}

	public void setTxtAsiMov(JTextField txtAsiMov) {
		this.txtAsiMov = txtAsiMov;
	}

	public JTextField getTxtTotHab() {
		return txtTotHab;
	}

	public void setTxtTotHab(JTextField txtTotHab) {
		this.txtTotHab = txtTotHab;
	}

	public JTextField getTxtAFP() {
		return txtAFP;
	}

	public void setTxtAFP(JTextField txtAFP) {
		this.txtAFP = txtAFP;
	}

	public JTextField getTxtSegCes() {
		return txtSegCes;
	}

	public void setTxtSegCes(JTextField txtSegCes) {
		this.txtSegCes = txtSegCes;
	}

	public JTextField getTxtSal() {
		return txtSal;
	}

	public void setTxtSal(JTextField txtSal) {
		this.txtSal = txtSal;
	}

	public JTextField getTxtDifIsa() {
		return txtDifIsa;
	}

	public void setTxtDifIsa(JTextField txtDifIsa) {
		this.txtDifIsa = txtDifIsa;
	}

	public JTextField getTxtImpUni() {
		return txtImpUni;
	}

	public void setTxtImpUni(JTextField txtImpUni) {
		this.txtImpUni = txtImpUni;
	}

	public JTextField getTxtCuoBie() {
		return txtCuoBie;
	}

	public void setTxtCuoBie(JTextField txtCuoBie) {
		this.txtCuoBie = txtCuoBie;
	}

	public JTextField getTxtCuoAhoLib() {
		return txtCuoAhoLib;
	}

	public void setTxtCuoAhoLib(JTextField txtCuoAhoLib) {
		this.txtCuoAhoLib = txtCuoAhoLib;
	}

	public JTextField getTxtCCFA() {
		return txtCCFA;
	}

	public void setTxtCCFA(JTextField txtCCFA) {
		this.txtCCFA = txtCCFA;
	}

	public JTextField getTxtTotDes() {
		return txtTotDes;
	}

	public void setTxtTotDes(JTextField txtTotDes) {
		this.txtTotDes = txtTotDes;
	}

	public JTextField getTxtSueLiqLet() {
		return txtSueLiqLet;
	}

	public void setTxtSueLiqLet(JTextField txtSueLiqLet) {
		this.txtSueLiqLet = txtSueLiqLet;
	}

	public JTextField getTxtAlcLiq() {
		return txtAlcLiq;
	}

	public void setTxtAlcLiq(JTextField txtAlcLiq) {
		this.txtAlcLiq = txtAlcLiq;
	}

	public JTextField getTxtValAnt() {
		return txtValAnt;
	}

	public void setTxtValAnt(JTextField txtValAnt) {
		this.txtValAnt = txtValAnt;
	}

	public JTextField getTxtTotSueLiq() {
		return txtTotSueLiq;
	}

	public void setTxtTotSueLiq(JTextField txtTotSueLiq) {
		this.txtTotSueLiq = txtTotSueLiq;
	}

	public JButton getBtnCalcularHaberes() {
		return btnCalcularHaberes;
	}

	public void setBtnCalcularHaberes(JButton btnCalcularHaberes) {
		this.btnCalcularHaberes = btnCalcularHaberes;
	}

	public JButton getBtnCalcularDescuentos() {
		return btnCalcularDescuentos;
	}

	public void setBtnCalcularDescuentos(JButton btnCalcularDescuentos) {
		this.btnCalcularDescuentos = btnCalcularDescuentos;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(JButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}
}
