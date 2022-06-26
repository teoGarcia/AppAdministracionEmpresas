package CuartoMedio.CalculoDeRemuneraciones.LibroRemuneraciones;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import ui.Buttons.StandarButton;
import ui.TablaUi.TableStandard;

public class VistaLibroRemuneraciones extends JPanel {
	
	private JTextField txtNomTra;
	private JTextField txtRutTra;
	private JTextField txtOtrIng;
	private JTextField txtSueBas;
	private JTextField txtHorExt;
	private JTextField txtGra;
	private JTextField txtMov;
	private JTextField txtCol;
	private JTextField txtGasRep;
	private JTextField txtAsiFam;
	private JTextField txtAFP;
	private JTextField txtSal;
	private JTextField txtDifIsa;
	private JTextField txtSegCes;
	private JTextField txtImpDet;
	private JTextField txtImpPagar;
	private JTextField txtAnt;
	private JTextField txtOtrDes;
	private JTextField txtTotSueBas;
	private JTextField txtTotHorExt;
	private JTextField txtTotGrat;
	private JTextField txtTotOtrIng;
	private JTextField txtTotImp;
	private JTextField txtTotMov;
	private JTextField txtTotCol;
	private JTextField txtTotGasRep;
	private JTextField txtTotAsiFam;
	private JTextField txtTotNoImp;
	private JTextField txtTotAFP;
	private JTextField txtTotSal;
	private JTextField txtTotDifIsa;
	private JTextField txtTotSegCes;
	private JTextField txtTotDesPrev;
	private TableStandard tableDesPre;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private TableStandard tableOtrosDes;
	private JLabel lblNewLabel_1_2_2_4_3;
	private JTextField txtImponible;
	private JLabel lblNewLabel_1_2_2_1_1_3;
	private JTextField txtACC;
	private JLabel lblNewLabel_1_2_2_2_1_3;
	private JTextField txtSIS;
	private JLabel lblNewLabel_1_2_2_3_1_3;
	private JTextField textCesantia;
	
	private TableStandard tableRemImp;
	private TableStandard tableImposi;
	private TableStandard tableRemNoImp;
	private StandarButton btnGuardar;
	
	private ControlLibroRemuneraciones control;

	/**
	 * Create the panel.
	 */
	public VistaLibroRemuneraciones() {
		
		control = new ControlLibroRemuneraciones(this);
		
		setOpaque(false);
		setBounds(0, 0, 748, 722);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1470));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Libro de Remuneraciones");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 36, 748, 37);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Remuneracion imponible");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(21, 133, 166, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Remuneracion no imponible");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(21, 214, 198, 25);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nombre del trabajador");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(21, 97, 155, 25);
		panel.add(lblNewLabel_1_2);
		
		txtNomTra = new JTextField();
		txtNomTra.setBounds(169, 100, 303, 20);
		panel.add(txtNomTra);
		txtNomTra.setColumns(10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Rut");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(516, 97, 56, 25);
		panel.add(lblNewLabel_1_2_1);
		
		txtRutTra = new JTextField();
		txtRutTra.setColumns(10);
		txtRutTra.setBounds(566, 100, 172, 20);
		panel.add(txtRutTra);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Sueldo Base");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(21, 174, 79, 25);
		panel.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Horas Extras");
		lblNewLabel_1_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1.setBounds(207, 174, 79, 25);
		panel.add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Gratificaci\u00F3n");
		lblNewLabel_1_2_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_2.setBounds(382, 174, 79, 25);
		panel.add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_1_2_2_3 = new JLabel("Otros Ingresos");
		lblNewLabel_1_2_2_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_3.setBounds(563, 174, 90, 25);
		panel.add(lblNewLabel_1_2_2_3);
		
		txtOtrIng = new JTextField();
		txtOtrIng.setColumns(10);
		txtOtrIng.setBounds(648, 177, 90, 20);
		panel.add(txtOtrIng);
		
		txtSueBas = new JTextField();
		txtSueBas.setColumns(10);
		txtSueBas.setBounds(97, 177, 100, 20);
		panel.add(txtSueBas);
		
		txtHorExt = new JTextField();
		txtHorExt.setColumns(10);
		txtHorExt.setBounds(285, 177, 90, 20);
		panel.add(txtHorExt);
		
		txtGra = new JTextField();
		txtGra.setColumns(10);
		txtGra.setBounds(463, 177, 90, 20);
		panel.add(txtGra);
		
		JLabel lblNewLabel_1_2_2_4 = new JLabel("Movilizacion");
		lblNewLabel_1_2_2_4.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_4.setBounds(21, 251, 79, 25);
		panel.add(lblNewLabel_1_2_2_4);
		
		txtMov = new JTextField();
		txtMov.setColumns(10);
		txtMov.setBounds(97, 254, 100, 20);
		panel.add(txtMov);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Colacion");
		lblNewLabel_1_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1.setBounds(207, 251, 79, 25);
		panel.add(lblNewLabel_1_2_2_1_1);
		
		txtCol = new JTextField();
		txtCol.setColumns(10);
		txtCol.setBounds(285, 254, 90, 20);
		panel.add(txtCol);
		
		JLabel lblNewLabel_1_2_2_2_1 = new JLabel("Gastos de Rep");
		lblNewLabel_1_2_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_2_1.setBounds(382, 251, 79, 25);
		panel.add(lblNewLabel_1_2_2_2_1);
		
		txtGasRep = new JTextField();
		txtGasRep.setColumns(10);
		txtGasRep.setBounds(463, 254, 90, 20);
		panel.add(txtGasRep);
		
		JLabel lblNewLabel_1_2_2_3_1 = new JLabel("Asig. Familiar");
		lblNewLabel_1_2_2_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_3_1.setBounds(563, 251, 90, 25);
		panel.add(lblNewLabel_1_2_2_3_1);
		
		txtAsiFam = new JTextField();
		txtAsiFam.setColumns(10);
		txtAsiFam.setBounds(648, 254, 90, 20);
		panel.add(txtAsiFam);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Descuentos");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(21, 287, 100, 25);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_2_4_1 = new JLabel("AFP");
		lblNewLabel_1_2_2_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_4_1.setBounds(21, 323, 79, 25);
		panel.add(lblNewLabel_1_2_2_4_1);
		
		txtAFP = new JTextField();
		txtAFP.setColumns(10);
		txtAFP.setBounds(110, 326, 100, 20);
		panel.add(txtAFP);
		
		JLabel lblNewLabel_1_2_2_1_1_1 = new JLabel("Salud");
		lblNewLabel_1_2_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1_1.setBounds(215, 323, 79, 25);
		panel.add(lblNewLabel_1_2_2_1_1_1);
		
		txtSal = new JTextField();
		txtSal.setColumns(10);
		txtSal.setBounds(285, 326, 90, 20);
		panel.add(txtSal);
		
		JLabel lblNewLabel_1_2_2_2_1_1 = new JLabel("Dif. Isapre");
		lblNewLabel_1_2_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_2_1_1.setBounds(382, 323, 79, 25);
		panel.add(lblNewLabel_1_2_2_2_1_1);
		
		txtDifIsa = new JTextField();
		txtDifIsa.setColumns(10);
		txtDifIsa.setBounds(466, 326, 90, 20);
		panel.add(txtDifIsa);
		
		JLabel lblNewLabel_1_2_2_3_1_1 = new JLabel("Seguro de Ces.");
		lblNewLabel_1_2_2_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_3_1_1.setBounds(563, 323, 90, 25);
		panel.add(lblNewLabel_1_2_2_3_1_1);
		
		txtSegCes = new JTextField();
		txtSegCes.setColumns(10);
		txtSegCes.setBounds(648, 326, 90, 20);
		panel.add(txtSegCes);
		
		JLabel lblNewLabel_1_2_2_4_2 = new JLabel("Imp. Determin.");
		lblNewLabel_1_2_2_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_4_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_4_2.setBounds(21, 359, 100, 25);
		panel.add(lblNewLabel_1_2_2_4_2);
		
		txtImpDet = new JTextField();
		txtImpDet.setColumns(10);
		txtImpDet.setBounds(110, 362, 100, 20);
		panel.add(txtImpDet);
		
		JLabel lblNewLabel_1_2_2_1_1_2 = new JLabel("Imp. a Pag.");
		lblNewLabel_1_2_2_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1_2.setBounds(215, 359, 79, 25);
		panel.add(lblNewLabel_1_2_2_1_1_2);
		
		txtImpPagar = new JTextField();
		txtImpPagar.setColumns(10);
		txtImpPagar.setBounds(285, 362, 90, 20);
		panel.add(txtImpPagar);
		
		JLabel lblNewLabel_1_2_2_2_1_2 = new JLabel("Anticipo ");
		lblNewLabel_1_2_2_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_2_1_2.setBounds(382, 359, 79, 25);
		panel.add(lblNewLabel_1_2_2_2_1_2);
		
		txtAnt = new JTextField();
		txtAnt.setColumns(10);
		txtAnt.setBounds(466, 362, 90, 20);
		panel.add(txtAnt);
		
		JLabel lblNewLabel_1_2_2_3_1_2 = new JLabel("Otros Descue.");
		lblNewLabel_1_2_2_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_3_1_2.setBounds(563, 359, 90, 25);
		panel.add(lblNewLabel_1_2_2_3_1_2);
		
		txtOtrDes = new JTextField();
		txtOtrDes.setColumns(10);
		txtOtrDes.setBounds(648, 362, 90, 20);
		panel.add(txtOtrDes);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Otros Descuentos");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(0, 950, 748, 25);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Remuneracion imponible");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(0, 425, 748, 25);
		panel.add(lblNewLabel_1_3);
		
		JScrollPane scrollPaneRemImp = new JScrollPane();
		scrollPaneRemImp.setBounds(21, 461, 717, 101);
		panel.add(scrollPaneRemImp);
		
		tableRemImp = new TableStandard();
		String[] columnstableRemImp = new String[] {"Nombre", "Sueldo Base", "Horas Extras",  "Gratificacion", "Otros Ingresos", "Total"};
		tableRemImp.setColums(columnstableRemImp);
		scrollPaneRemImp.setViewportView(tableRemImp);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Remuneracion no imponible");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(0, 599, 748, 25);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("TOTALES");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(21, 563, 166, 20);
		panel.add(lblNewLabel_1_4);
		
		txtTotSueBas = new JTextField();
		txtTotSueBas.setColumns(10);
		txtTotSueBas.setBounds(210, 566, 90, 20);
		panel.add(txtTotSueBas);
		
		txtTotHorExt = new JTextField();
		txtTotHorExt.setColumns(10);
		txtTotHorExt.setBounds(320, 566, 90, 20);
		panel.add(txtTotHorExt);
		
		txtTotGrat = new JTextField();
		txtTotGrat.setColumns(10);
		txtTotGrat.setBounds(427, 566, 90, 20);
		panel.add(txtTotGrat);
		
		txtTotOtrIng = new JTextField();
		txtTotOtrIng.setColumns(10);
		txtTotOtrIng.setBounds(537, 566, 90, 20);
		panel.add(txtTotOtrIng);
		
		txtTotImp = new JTextField();
		txtTotImp.setColumns(10);
		txtTotImp.setBounds(645, 566, 90, 20);
		panel.add(txtTotImp);
		
		JScrollPane scrollPaneRemNoImp = new JScrollPane();
		scrollPaneRemNoImp.setBounds(21, 633, 717, 101);
		panel.add(scrollPaneRemNoImp);
		
		tableRemNoImp = new TableStandard();
		String[] columnstableRemNoImp = new String[] {"Nombre", "Movilizacion", "Colacion",  "Gasto de Rep.", "Asig. Familiar", "Total"};
		tableRemNoImp.setColums(columnstableRemNoImp);
		scrollPaneRemNoImp.setViewportView(tableRemNoImp);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("TOTALES");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4_1.setBounds(21, 735, 166, 20);
		panel.add(lblNewLabel_1_4_1);
		
		txtTotMov = new JTextField();
		txtTotMov.setColumns(10);
		txtTotMov.setBounds(210, 738, 90, 20);
		panel.add(txtTotMov);
		
		txtTotCol = new JTextField();
		txtTotCol.setColumns(10);
		txtTotCol.setBounds(320, 738, 90, 20);
		panel.add(txtTotCol);
		
		txtTotGasRep = new JTextField();
		txtTotGasRep.setColumns(10);
		txtTotGasRep.setBounds(427, 738, 90, 20);
		panel.add(txtTotGasRep);
		
		txtTotAsiFam = new JTextField();
		txtTotAsiFam.setColumns(10);
		txtTotAsiFam.setBounds(537, 738, 90, 20);
		panel.add(txtTotAsiFam);
		
		txtTotNoImp = new JTextField();
		txtTotNoImp.setColumns(10);
		txtTotNoImp.setBounds(645, 738, 90, 20);
		panel.add(txtTotNoImp);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Descuentos Previsionales");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3_1.setBounds(0, 770, 748, 25);
		panel.add(lblNewLabel_1_3_1);
		
		JScrollPane scrollPaneDescuentosPrevisionales = new JScrollPane();
		scrollPaneDescuentosPrevisionales.setBounds(21, 805, 717, 101);
		panel.add(scrollPaneDescuentosPrevisionales);
		
		tableDesPre = new TableStandard();
		String[] columnstableDesPre = new String[] {"Nombre", "AFP", "Salud",  "Dif Isapre", "Seg. Cesantia", "Total"};
		tableDesPre.setColums(columnstableDesPre);
		tableDesPre.setBounds(0, 0, 1, 1);
		scrollPaneDescuentosPrevisionales.setViewportView(tableDesPre);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("TOTALES");
		lblNewLabel_1_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4_2.setBounds(21, 908, 166, 20);
		panel.add(lblNewLabel_1_4_2);
		
		txtTotAFP = new JTextField();
		txtTotAFP.setColumns(10);
		txtTotAFP.setBounds(210, 911, 90, 20);
		panel.add(txtTotAFP);
		
		txtTotSal = new JTextField();
		txtTotSal.setColumns(10);
		txtTotSal.setBounds(320, 911, 90, 20);
		panel.add(txtTotSal);
		
		txtTotDifIsa = new JTextField();
		txtTotDifIsa.setColumns(10);
		txtTotDifIsa.setBounds(427, 911, 90, 20);
		panel.add(txtTotDifIsa);
		
		txtTotSegCes = new JTextField();
		txtTotSegCes.setColumns(10);
		txtTotSegCes.setBounds(537, 911, 90, 20);
		panel.add(txtTotSegCes);
		
		txtTotDesPrev = new JTextField();
		txtTotDesPrev.setColumns(10);
		txtTotDesPrev.setBounds(645, 911, 90, 20);
		panel.add(txtTotDesPrev);
		
		JScrollPane scrollPaneOtrosDescuentos = new JScrollPane();
		scrollPaneOtrosDescuentos.setBounds(21, 986, 717, 101);
		panel.add(scrollPaneOtrosDescuentos);
		
		tableOtrosDes = new TableStandard();
		String[] columnstableOtrosDes = new String[] {"Nombre", "Impuesto Determinado", "Impuesto a pagar",  "Anticipo de sueldo", "Otros Descuentos", "Total"};
		tableOtrosDes.setColums(columnstableOtrosDes);
		scrollPaneOtrosDescuentos.setViewportView(tableOtrosDes);
		
		JLabel lblNewLabel_1_4_3 = new JLabel("TOTALES");
		lblNewLabel_1_4_3.setForeground(Color.WHITE);
		lblNewLabel_1_4_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4_3.setBounds(21, 1089, 166, 20);
		panel.add(lblNewLabel_1_4_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(210, 1092, 90, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(320, 1092, 90, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(427, 1092, 90, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(537, 1092, 90, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(645, 1092, 90, 20);
		panel.add(textField_4);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 1140, 748, 9);
		panel.add(separator);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Imposiciones Empleador (Aporte patronal)");
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2_1.setBounds(0, 1160, 748, 25);
		panel.add(lblNewLabel_1_1_2_1);
		
		JScrollPane scrollPaneImpEmp = new JScrollPane();
		scrollPaneImpEmp.setBounds(21, 1260, 717, 101);
		panel.add(scrollPaneImpEmp);
		
		tableImposi = new TableStandard();
		String[] columnstableImposi = new String[] {"Imponible", "ACC 0,9% + TR", "SIS 2,21%",  "Cesantia (2,4% / 3%)", "Total"};
		tableImposi.setColums(columnstableImposi);
		scrollPaneImpEmp.setViewportView(tableImposi);
		
		JLabel lblNewLabel_1_4_4 = new JLabel("TOTALES");
		lblNewLabel_1_4_4.setForeground(Color.WHITE);
		lblNewLabel_1_4_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4_4.setBounds(21, 1365, 166, 20);
		panel.add(lblNewLabel_1_4_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(210, 1365, 90, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(320, 1365, 90, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(427, 1365, 90, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(537, 1365, 90, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(645, 1365, 90, 20);
		panel.add(textField_9);
		
		lblNewLabel_1_2_2_4_3 = new JLabel("Imponible");
		lblNewLabel_1_2_2_4_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_4_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_4_3.setBounds(21, 1210, 79, 25);
		panel.add(lblNewLabel_1_2_2_4_3);
		
		txtImponible = new JTextField();
		txtImponible.setColumns(10);
		txtImponible.setBounds(97, 1210, 100, 20);
		panel.add(txtImponible);
		
		lblNewLabel_1_2_2_1_1_3 = new JLabel("ACC 0,9% + T.R");
		lblNewLabel_1_2_2_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1_3.setBounds(202, 1210, 100, 25);
		panel.add(lblNewLabel_1_2_2_1_1_3);
		
		txtACC = new JTextField();
		txtACC.setColumns(10);
		txtACC.setBounds(309, 1210, 90, 20);
		panel.add(txtACC);
		
		lblNewLabel_1_2_2_2_1_3 = new JLabel("SIS 2,21%");
		lblNewLabel_1_2_2_2_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_2_1_3.setBounds(409, 1210, 79, 25);
		panel.add(lblNewLabel_1_2_2_2_1_3);
		
		txtSIS = new JTextField();
		txtSIS.setColumns(10);
		txtSIS.setBounds(482, 1210, 90, 20);
		panel.add(txtSIS);
		
		lblNewLabel_1_2_2_3_1_3 = new JLabel("Cesantia");
		lblNewLabel_1_2_2_3_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_3_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_3_1_3.setBounds(580, 1210, 90, 25);
		panel.add(lblNewLabel_1_2_2_3_1_3);
		
		textCesantia = new JTextField();
		textCesantia.setColumns(10);
		textCesantia.setBounds(648, 1210, 90, 20);
		panel.add(textCesantia);
		
		btnGuardar = new StandarButton("Agregar");
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(648, 1420, 89, 23);
		btnGuardar.addActionListener(control);
		panel.add(btnGuardar);
		
		ActualizarVista();

	}
	
	public void calcularTotal() {
		
	}
	
	public boolean camposVacios() {
		
		if(txtNomTra.getText().length() <= 0 || 
			txtRutTra.getText().length() <= 0 || 
			txtSueBas.getText().length() <= 0 || 
			txtHorExt.getText().length() <= 0 ||
			txtGra.getText().length() <= 0 || 
			txtOtrIng.getText().length() <= 0 || 
			txtMov.getText().length() <= 0 || 
			txtCol.getText().length() <= 0 ||
			txtGasRep.getText().length() <= 0 || 
			txtAsiFam.getText().length() <= 0 || 
			txtAFP.getText().length() <= 0 || 
			txtSal.getText().length() <= 0 ||
			txtDifIsa.getText().length() <= 0 || 
			txtSegCes.getText().length() <= 0 || 
			txtImpDet.getText().length() <= 0 || 
			txtImpPagar.getText().length() <= 0 ||
			txtAnt.getText().length() <= 0 || 
			txtOtrDes.getText().length() <= 0 ||
			txtImponible.getText().length() <= 0 ||
			txtACC.getText().length() <= 0 ||
			txtSIS.getText().length() <= 0 ||
			textCesantia.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	public void ActualizarVista() {
		VaciarForm();
		control.LlenarTablas();
		calcularTotal();
	}
	
	public void VaciarForm() {
		txtNomTra.setText("");
		txtRutTra.setText("");
		txtSueBas.setText("");
		txtHorExt.setText("");
		txtGra.setText("");
		txtOtrIng.setText("");
		txtMov.setText("");
		txtCol.setText("");
		txtGasRep.setText("");
		txtAsiFam.setText("");
		txtAFP.setText("");
		txtSal.setText("");
		txtDifIsa.setText("");
		txtSegCes.setText("");
		txtImpDet.setText("");
		txtImpPagar.setText("");
		txtAnt.setText("");
		txtOtrDes.setText("");
		txtImponible.setText("");
		txtACC.setText("");
		txtSIS.setText("");
		textCesantia.setText("");
	}
	
	public DefaultTableModel getModelRemImp() {
		return tableRemImp.getModel();
	}
	
	public DefaultTableModel getModelRemNoImp() {
		return tableRemNoImp.getModel();
	}
	
	public DefaultTableModel getModelDesPre() {
		return tableDesPre.getModel();
	}
	
	public DefaultTableModel getModelOtrosDes() {
		return tableOtrosDes.getModel();
	}
	
	public DefaultTableModel getModelImposi() {
		return tableImposi.getModel();
	}

	public JTextField getTxtNomTra() {
		return txtNomTra;
	}

	public void setTxtNomTra(JTextField txtNomTra) {
		this.txtNomTra = txtNomTra;
	}

	public JTextField getTxtRutTra() {
		return txtRutTra;
	}

	public void setTxtRutTra(JTextField txtRutTra) {
		this.txtRutTra = txtRutTra;
	}

	public JTextField getTxtOtrIng() {
		return txtOtrIng;
	}

	public void setTxtOtrIng(JTextField txtOtrIng) {
		this.txtOtrIng = txtOtrIng;
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

	public JTextField getTxtGra() {
		return txtGra;
	}

	public void setTxtGra(JTextField txtGra) {
		this.txtGra = txtGra;
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

	public JTextField getTxtGasRep() {
		return txtGasRep;
	}

	public void setTxtGasRep(JTextField txtGasRep) {
		this.txtGasRep = txtGasRep;
	}

	public JTextField getTxtAsiFam() {
		return txtAsiFam;
	}

	public void setTxtAsiFam(JTextField txtAsiFam) {
		this.txtAsiFam = txtAsiFam;
	}

	public JTextField getTxtImponible() {
		return txtImponible;
	}

	public void setTxtImponible(JTextField txtImponible) {
		this.txtImponible = txtImponible;
	}

	public JTextField getTxtACC() {
		return txtACC;
	}

	public void setTxtACC(JTextField txtACC) {
		this.txtACC = txtACC;
	}

	public JTextField getTxtSIS() {
		return txtSIS;
	}

	public void setTxtSIS(JTextField txtSIS) {
		this.txtSIS = txtSIS;
	}

	public JTextField getTextCesantia() {
		return textCesantia;
	}

	public void setTextCesantia(JTextField textCesantia) {
		this.textCesantia = textCesantia;
	}

	public JTextField getTxtAFP() {
		return txtAFP;
	}

	public void setTxtAFP(JTextField txtAFP) {
		this.txtAFP = txtAFP;
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

	public JTextField getTxtSegCes() {
		return txtSegCes;
	}

	public void setTxtSegCes(JTextField txtSegCes) {
		this.txtSegCes = txtSegCes;
	}

	public JTextField getTxtImpDet() {
		return txtImpDet;
	}

	public void setTxtImpDet(JTextField txtImpDet) {
		this.txtImpDet = txtImpDet;
	}

	public JTextField getTxtImpPagar() {
		return txtImpPagar;
	}

	public void setTxtImpPagar(JTextField txtImpPagar) {
		this.txtImpPagar = txtImpPagar;
	}

	public JTextField getTxtAnt() {
		return txtAnt;
	}

	public void setTxtAnt(JTextField txtAnt) {
		this.txtAnt = txtAnt;
	}

	public JTextField getTxtOtrDes() {
		return txtOtrDes;
	}

	public void setTxtOtrDes(JTextField txtOtrDes) {
		this.txtOtrDes = txtOtrDes;
	}

	public JTextField getTxtTotSueBas() {
		return txtTotSueBas;
	}

	public void setTxtTotSueBas(JTextField txtTotSueBas) {
		this.txtTotSueBas = txtTotSueBas;
	}

	public JTextField getTxtTotHorExt() {
		return txtTotHorExt;
	}

	public void setTxtTotHorExt(JTextField txtTotHorExt) {
		this.txtTotHorExt = txtTotHorExt;
	}

	public JTextField getTxtTotGrat() {
		return txtTotGrat;
	}

	public void setTxtTotGrat(JTextField txtTotGrat) {
		this.txtTotGrat = txtTotGrat;
	}

	public JTextField getTxtTotOtrIng() {
		return txtTotOtrIng;
	}

	public void setTxtTotOtrIng(JTextField txtTotOtrIng) {
		this.txtTotOtrIng = txtTotOtrIng;
	}

	public JTextField getTxtTotImp() {
		return txtTotImp;
	}

	public void setTxtTotImp(JTextField txtTotImp) {
		this.txtTotImp = txtTotImp;
	}

	public JTextField getTxtTotMov() {
		return txtTotMov;
	}

	public void setTxtTotMov(JTextField txtTotMov) {
		this.txtTotMov = txtTotMov;
	}

	public JTextField getTxtTotCol() {
		return txtTotCol;
	}

	public void setTxtTotCol(JTextField txtTotCol) {
		this.txtTotCol = txtTotCol;
	}

	public JTextField getTxtTotGasRep() {
		return txtTotGasRep;
	}

	public void setTxtTotGasRep(JTextField txtTotGasRep) {
		this.txtTotGasRep = txtTotGasRep;
	}

	public JTextField getTxtTotAsiFam() {
		return txtTotAsiFam;
	}

	public void setTxtTotAsiFam(JTextField txtTotAsiFam) {
		this.txtTotAsiFam = txtTotAsiFam;
	}

	public JTextField getTxtTotNoImp() {
		return txtTotNoImp;
	}

	public void setTxtTotNoImp(JTextField txtTotNoImp) {
		this.txtTotNoImp = txtTotNoImp;
	}

	public JTextField getTxtTotAFP() {
		return txtTotAFP;
	}

	public void setTxtTotAFP(JTextField txtTotAFP) {
		this.txtTotAFP = txtTotAFP;
	}

	public JTextField getTxtTotSal() {
		return txtTotSal;
	}

	public void setTxtTotSal(JTextField txtTotSal) {
		this.txtTotSal = txtTotSal;
	}

	public JTextField getTxtTotDifIsa() {
		return txtTotDifIsa;
	}

	public void setTxtTotDifIsa(JTextField txtTotDifIsa) {
		this.txtTotDifIsa = txtTotDifIsa;
	}

	public JTextField getTxtTotSegCes() {
		return txtTotSegCes;
	}

	public void setTxtTotSegCes(JTextField txtTotSegCes) {
		this.txtTotSegCes = txtTotSegCes;
	}

	public JTextField getTxtTotDesPrev() {
		return txtTotDesPrev;
	}

	public void setTxtTotDesPrev(JTextField txtTotDesPrev) {
		this.txtTotDesPrev = txtTotDesPrev;
	}

	public TableStandard getTableDesPre() {
		return tableDesPre;
	}

	public void setTableDesPre(TableStandard tableDesPre) {
		this.tableDesPre = tableDesPre;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public JTextField getTextField_7() {
		return textField_7;
	}

	public void setTextField_7(JTextField textField_7) {
		this.textField_7 = textField_7;
	}

	public JTextField getTextField_8() {
		return textField_8;
	}

	public void setTextField_8(JTextField textField_8) {
		this.textField_8 = textField_8;
	}

	public JTextField getTextField_9() {
		return textField_9;
	}

	public void setTextField_9(JTextField textField_9) {
		this.textField_9 = textField_9;
	}

	public TableStandard getTableOtrosDes() {
		return tableOtrosDes;
	}

	public void setTableOtrosDes(TableStandard tableOtrosDes) {
		this.tableOtrosDes = tableOtrosDes;
	}

	public JLabel getLblNewLabel_1_2_2_4_3() {
		return lblNewLabel_1_2_2_4_3;
	}

	public void setLblNewLabel_1_2_2_4_3(JLabel lblNewLabel_1_2_2_4_3) {
		this.lblNewLabel_1_2_2_4_3 = lblNewLabel_1_2_2_4_3;
	}

	public JTextField getTextField_10() {
		return txtImponible;
	}

	public void setTextField_10(JTextField textField_10) {
		this.txtImponible = textField_10;
	}

	public JLabel getLblNewLabel_1_2_2_1_1_3() {
		return lblNewLabel_1_2_2_1_1_3;
	}

	public void setLblNewLabel_1_2_2_1_1_3(JLabel lblNewLabel_1_2_2_1_1_3) {
		this.lblNewLabel_1_2_2_1_1_3 = lblNewLabel_1_2_2_1_1_3;
	}

	public JTextField getTextField_11() {
		return txtACC;
	}

	public void setTextField_11(JTextField textField_11) {
		this.txtACC = textField_11;
	}

	public JLabel getLblNewLabel_1_2_2_2_1_3() {
		return lblNewLabel_1_2_2_2_1_3;
	}

	public void setLblNewLabel_1_2_2_2_1_3(JLabel lblNewLabel_1_2_2_2_1_3) {
		this.lblNewLabel_1_2_2_2_1_3 = lblNewLabel_1_2_2_2_1_3;
	}

	public JTextField getTextField_12() {
		return txtSIS;
	}

	public void setTextField_12(JTextField textField_12) {
		this.txtSIS = textField_12;
	}

	public JLabel getLblNewLabel_1_2_2_3_1_3() {
		return lblNewLabel_1_2_2_3_1_3;
	}

	public void setLblNewLabel_1_2_2_3_1_3(JLabel lblNewLabel_1_2_2_3_1_3) {
		this.lblNewLabel_1_2_2_3_1_3 = lblNewLabel_1_2_2_3_1_3;
	}

	public JTextField getTextField_13() {
		return textCesantia;
	}

	public void setTextField_13(JTextField textField_13) {
		this.textCesantia = textField_13;
	}

	public TableStandard getTableRemImp() {
		return tableRemImp;
	}

	public void setTableRemImp(TableStandard tableRemImp) {
		this.tableRemImp = tableRemImp;
	}

	public TableStandard getTableImposi() {
		return tableImposi;
	}

	public void setTableImposi(TableStandard tableImposi) {
		this.tableImposi = tableImposi;
	}

	public TableStandard getTableRemNoImp() {
		return tableRemNoImp;
	}

	public void setTableRemNoImp(TableStandard tableRemNoImp) {
		this.tableRemNoImp = tableRemNoImp;
	}

	public StandarButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(StandarButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public ControlLibroRemuneraciones getControl() {
		return control;
	}

	public void setControl(ControlLibroRemuneraciones control) {
		this.control = control;
	}
}
