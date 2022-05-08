package CuartoMedio.DotacionPersonal.SeleccionPersonal;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;

public class VistaSeleccionPersonal extends JPanel {
	private JTextField txrNombres;
	private JTextField txtCur;
	private JTextField txtCasAccLla;
	private JTextField txtApePat;
	private JTextField txtNumIMSS;
	private JTextField txtApeMat;
	private JTextField txtDom;
	private JTextField txtIns;
	private JTextField txtCar;
	private JTextField txtAno;
	private JTextField txtCur1;
	private JTextField txtCur2;
	private JTextField txtCur3;
	private JTextField txtCur4;
	private JTextField txtNomCom;
	private JTextField txtAreOcu;
	private JTextField txtPueAnt;
	private JTextField txtOcu;
	private JTextField txtSue;
	private JTextField txtTel;
	private JTextField txtPre;
	private JTextField txtRec;
	private JTextField txtLog;
	private JTextField txtJef;

	/**
	 * Create the panel.
	 */
	public VistaSeleccionPersonal() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccion de Personal");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 11, 774, 36);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 106, 96, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido Paterno");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(263, 108, 96, 14);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Apellido Materno");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(526, 106, 96, 14);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Curp");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 143, 96, 14);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Nro. IMSS");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(263, 145, 96, 14);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Domicilio");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(526, 143, 96, 14);
		add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Caso de accidente llamar");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 181, 81, 23);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Estado Civil");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(263, 185, 81, 19);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sexo");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(526, 183, 61, 19);
		add(lblNewLabel_4);
		
		txrNombres = new JTextField();
		txrNombres.setBounds(89, 102, 157, 23);
		add(txrNombres);
		txrNombres.setColumns(10);
		
		txtCur = new JTextField();
		txtCur.setColumns(10);
		txtCur.setBounds(89, 140, 157, 23);
		add(txtCur);
		
		txtCasAccLla = new JTextField();
		txtCasAccLla.setColumns(10);
		txtCasAccLla.setBounds(89, 179, 158, 23);
		add(txtCasAccLla);
		
		txtApePat = new JTextField();
		txtApePat.setColumns(10);
		txtApePat.setBounds(359, 102, 157, 23);
		add(txtApePat);
		
		txtNumIMSS = new JTextField();
		txtNumIMSS.setColumns(10);
		txtNumIMSS.setBounds(359, 139, 157, 23);
		add(txtNumIMSS);
		
		JComboBox cbEstCiv = new JComboBox();
		cbEstCiv.setFont(new Font("Dialog", Font.PLAIN, 12));
		cbEstCiv.setModel(new DefaultComboBoxModel(new String[] {"Soltero", "Casado", "Divorciado"}));
		cbEstCiv.setBounds(361, 180, 157, 23);
		add(cbEstCiv);
		
		txtApeMat = new JTextField();
		txtApeMat.setColumns(10);
		txtApeMat.setBounds(617, 103, 143, 23);
		add(txtApeMat);
		
		txtDom = new JTextField();
		txtDom.setColumns(10);
		txtDom.setBounds(617, 140, 143, 23);
		add(txtDom);
		
		JComboBox cbSex = new JComboBox();
		cbSex.setFont(new Font("Dialog", Font.PLAIN, 12));
		cbSex.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		cbSex.setBounds(617, 181, 143, 23);
		add(cbSex);
		
		JLabel lblNewLabel_5 = new JLabel("Datos Generales");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 68, 168, 23);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Datos Academicos");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1.setBounds(10, 227, 168, 23);
		add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_1_5 = new JLabel("Instituci\u00F3n");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_5.setBounds(10, 261, 96, 18);
		add(lblNewLabel_1_5);
		
		txtIns = new JTextField();
		txtIns.setBounds(89, 261, 270, 23);
		add(txtIns);
		txtIns.setColumns(10);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Carrera");
		lblNewLabel_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_5_1.setBounds(369, 261, 96, 18);
		add(lblNewLabel_1_5_1);
		
		txtCar = new JTextField();
		txtCar.setBounds(425, 260, 208, 23);
		add(txtCar);
		txtCar.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("A\u00F1o");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(645, 261, 61, 19);
		add(lblNewLabel_4_1);
		
		txtAno = new JTextField();
		txtAno.setBounds(678, 260, 82, 23);
		add(txtAno);
		txtAno.setColumns(10);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Idiomas");
		lblNewLabel_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1_1.setBounds(10, 299, 168, 23);
		add(lblNewLabel_5_1_1);
		
		JComboBox cbIdi = new JComboBox();
		cbIdi.setFont(new Font("Dialog", Font.PLAIN, 12));
		cbIdi.setModel(new DefaultComboBoxModel(new String[] {"Ingl\u00E9s", "Portugues", "Frances", "Italiano", "Chino", "Japones"}));
		cbIdi.setBounds(10, 333, 200, 23);
		add(cbIdi);
		
		JLabel lblNewLabel_6 = new JLabel("Nivel");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(230, 333, 61, 23);
		add(lblNewLabel_6);
		
		JComboBox cbNiv = new JComboBox();
		cbNiv.setFont(new Font("Dialog", Font.PLAIN, 12));
		cbNiv.setModel(new DefaultComboBoxModel(new String[] {"Basico", "Medio", "Avanzado"}));
		cbNiv.setBounds(270, 333, 188, 23);
		add(cbNiv);
		
		JLabel lblNewLabel_7 = new JLabel("En la Practica lo");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(470, 335, 107, 19);
		add(lblNewLabel_7);
		
		JComboBox cbPra = new JComboBox();
		cbPra.setModel(new DefaultComboBoxModel(new String[] {"Habla", "Escucha", "Lee", "Entiende", "Todas las anteriores"}));
		cbPra.setFont(new Font("Dialog", Font.PLAIN, 12));
		cbPra.setBounds(576, 333, 184, 23);
		add(cbPra);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Cursos");
		lblNewLabel_5_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1_1_1.setBounds(10, 373, 168, 23);
		add(lblNewLabel_5_1_1_1);
		
		JLabel lblNewLabel_8 = new JLabel("1.-");
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(10, 410, 46, 14);
		add(lblNewLabel_8);
		
		txtCur1 = new JTextField();
		txtCur1.setColumns(10);
		txtCur1.setBounds(38, 407, 140, 23);
		add(txtCur1);
		
		JLabel lblNewLabel_8_1 = new JLabel("2.-");
		lblNewLabel_8_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_8_1.setForeground(Color.WHITE);
		lblNewLabel_8_1.setBounds(199, 410, 46, 14);
		add(lblNewLabel_8_1);
		
		txtCur2 = new JTextField();
		txtCur2.setColumns(10);
		txtCur2.setBounds(230, 407, 140, 23);
		add(txtCur2);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("3.-");
		lblNewLabel_8_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_8_1_1.setForeground(Color.WHITE);
		lblNewLabel_8_1_1.setBounds(393, 410, 46, 14);
		add(lblNewLabel_8_1_1);
		
		txtCur3 = new JTextField();
		txtCur3.setColumns(10);
		txtCur3.setBounds(425, 407, 140, 23);
		add(txtCur3);
		
		JLabel lblNewLabel_8_1_1_1 = new JLabel("4.-");
		lblNewLabel_8_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_8_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_8_1_1_1.setBounds(590, 410, 46, 14);
		add(lblNewLabel_8_1_1_1);
		
		txtCur4 = new JTextField();
		txtCur4.setColumns(10);
		txtCur4.setBounds(624, 407, 136, 23);
		add(txtCur4);
		
		JLabel lblNewLabel_5_1_1_1_1 = new JLabel("Datos laborales Internos");
		lblNewLabel_5_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1_1_1_1.setBounds(10, 450, 281, 23);
		add(lblNewLabel_5_1_1_1_1);
		
		JLabel lblNewLabel_1_6 = new JLabel("Nombre Compa\u00F1ia");
		lblNewLabel_1_6.setForeground(Color.WHITE);
		lblNewLabel_1_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_6.setBounds(10, 488, 81, 14);
		add(lblNewLabel_1_6);
		
		txtNomCom = new JTextField();
		txtNomCom.setColumns(10);
		txtNomCom.setBounds(89, 484, 157, 23);
		add(txtNomCom);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Area que ocupaba");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(263, 490, 96, 14);
		add(lblNewLabel_1_1_1);
		
		txtAreOcu = new JTextField();
		txtAreOcu.setColumns(10);
		txtAreOcu.setBounds(359, 484, 157, 23);
		add(txtAreOcu);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Puesto Antiguo");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(526, 488, 96, 14);
		add(lblNewLabel_1_2_2);
		
		txtPueAnt = new JTextField();
		txtPueAnt.setColumns(10);
		txtPueAnt.setBounds(617, 485, 143, 23);
		add(txtPueAnt);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Ocupaci\u00F3n");
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_1.setBounds(10, 525, 96, 14);
		add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Jefe");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1.setBounds(263, 527, 96, 14);
		add(lblNewLabel_1_4_1);
		
		txtOcu = new JTextField();
		txtOcu.setColumns(10);
		txtOcu.setBounds(89, 522, 157, 23);
		add(txtOcu);
		
		txtJef = new JTextField();
		txtJef.setColumns(10);
		txtJef.setBounds(359, 521, 157, 23);
		add(txtJef);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Sueldo");
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBounds(526, 525, 96, 14);
		add(lblNewLabel_1_2_1_1);
		
		txtSue = new JTextField();
		txtSue.setColumns(10);
		txtSue.setBounds(617, 522, 143, 23);
		add(txtSue);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Telefono");
		lblNewLabel_1_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_1_1.setBounds(10, 558, 96, 14);
		add(lblNewLabel_1_3_1_1);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(89, 555, 157, 23);
		add(txtTel);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Fecha Ingreso");
		lblNewLabel_1_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1_1.setBounds(263, 560, 96, 14);
		add(lblNewLabel_1_4_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Fecha T\u00E9rmino");
		lblNewLabel_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1_1.setBounds(526, 558, 96, 14);
		add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_2 = new JLabel("Otros Datos");
		lblNewLabel_5_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1_1_1_2.setBounds(10, 600, 168, 23);
		add(lblNewLabel_5_1_1_1_2);
		
		JLabel lblNewLabel_1_7 = new JLabel("Premios");
		lblNewLabel_1_7.setForeground(Color.WHITE);
		lblNewLabel_1_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_7.setBounds(10, 638, 96, 14);
		add(lblNewLabel_1_7);
		
		txtPre = new JTextField();
		txtPre.setColumns(10);
		txtPre.setBounds(89, 635, 157, 23);
		add(txtPre);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Reconocimientos");
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(263, 640, 96, 14);
		add(lblNewLabel_1_1_2);
		
		txtRec = new JTextField();
		txtRec.setColumns(10);
		txtRec.setBounds(359, 635, 157, 23);
		add(txtRec);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Logros");
		lblNewLabel_1_2_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_3.setBounds(537, 638, 96, 14);
		add(lblNewLabel_1_2_3);
		
		txtLog = new JTextField();
		txtLog.setColumns(10);
		txtLog.setBounds(617, 635, 143, 23);
		add(txtLog);
		
		JDateChooser dateFecTer = new JDateChooser();
		dateFecTer.setBounds(644, 555, 116, 23);
		add(dateFecTer);
		
		JDateChooser dateFecIng = new JDateChooser();
		dateFecIng.setBounds(400, 555, 116, 23);
		add(dateFecIng);

	}
}
