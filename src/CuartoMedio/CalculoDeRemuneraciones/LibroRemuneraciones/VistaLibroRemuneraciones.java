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
	
	private Long id = 0L;
	
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
	private JTextField txtTotImp;
	private JTextField txtTotNoImp;
	private JTextField txtTotDesPrev;
	private JTextField txtTotalOtrosDescuentos;
	private JTextField txtTotalImposicionesEmpleador;
	private JTextField textCesantia;
	private JTextField txtSIS;
	private JTextField txtACC;
	private JTextField txtImponible;
	
	private TableStandard tableDesPre;
	private TableStandard tableOtrosDes;
	private TableStandard tableRemImp;
	private TableStandard tableImposi;
	private TableStandard tableRemNoImp;
	
	
	private JLabel lblNewLabel_1_2_2_4_3;
	private JLabel lblNewLabel_1_2_2_1_1_3;
	private JLabel lblNewLabel_1_2_2_2_1_3;
	private JLabel lblNewLabel_1_2_2_3_1_3;
	
	private StandarButton btnGuardar;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	
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
		String[] columnstableRemImp = new String[] {"Id", "Nombre", "Sueldo Base", "Horas Extras",  "Gratificacion", "Otros Ingresos", "Total"};
		tableRemImp.setColums(columnstableRemImp);
		scrollPaneRemImp.setViewportView(tableRemImp);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Remuneracion no imponible");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(0, 599, 748, 25);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("TOTAL");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(545, 568, 90, 20);
		panel.add(lblNewLabel_1_4);
		
		txtTotImp = new JTextField();
		txtTotImp.setColumns(10);
		txtTotImp.setBounds(645, 566, 90, 20);
		panel.add(txtTotImp);
		
		JScrollPane scrollPaneRemNoImp = new JScrollPane();
		scrollPaneRemNoImp.setBounds(21, 633, 717, 101);
		panel.add(scrollPaneRemNoImp);
		
		tableRemNoImp = new TableStandard();
		String[] columnstableRemNoImp = new String[] {"Id", "Nombre", "Movilizacion", "Colacion",  "Gasto de Rep.", "Asig. Familiar", "Total"};
		tableRemNoImp.setColums(columnstableRemNoImp);
		scrollPaneRemNoImp.setViewportView(tableRemNoImp);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("TOTAL");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4_1.setBounds(545, 735, 90, 20);
		panel.add(lblNewLabel_1_4_1);
		
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
		String[] columnstableDesPre = new String[] {"Id","Nombre", "AFP", "Salud",  "Dif Isapre", "Seg. Cesantia", "Total"};
		tableDesPre.setColums(columnstableDesPre);
		tableDesPre.setBounds(0, 0, 1, 1);
		scrollPaneDescuentosPrevisionales.setViewportView(tableDesPre);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("TOTAL");
		lblNewLabel_1_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4_2.setBounds(545, 908, 90, 20);
		panel.add(lblNewLabel_1_4_2);
		
		txtTotDesPrev = new JTextField();
		txtTotDesPrev.setColumns(10);
		txtTotDesPrev.setBounds(645, 911, 90, 20);
		panel.add(txtTotDesPrev);
		
		JScrollPane scrollPaneOtrosDescuentos = new JScrollPane();
		scrollPaneOtrosDescuentos.setBounds(21, 986, 717, 101);
		panel.add(scrollPaneOtrosDescuentos);
		
		tableOtrosDes = new TableStandard();
		String[] columnstableOtrosDes = new String[] {"Id", "Nombre", "Impuesto Determinado", "Impuesto a pagar",  "Anticipo de sueldo", "Otros Descuentos", "Total"};
		tableOtrosDes.setColums(columnstableOtrosDes);
		scrollPaneOtrosDescuentos.setViewportView(tableOtrosDes);
		
		JLabel lblNewLabel_1_4_3 = new JLabel("TOTAL");
		lblNewLabel_1_4_3.setForeground(Color.WHITE);
		lblNewLabel_1_4_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4_3.setBounds(545, 1089, 90, 20);
		panel.add(lblNewLabel_1_4_3);
		
		txtTotalOtrosDescuentos = new JTextField();
		txtTotalOtrosDescuentos.setColumns(10);
		txtTotalOtrosDescuentos.setBounds(645, 1092, 90, 20);
		panel.add(txtTotalOtrosDescuentos);
		
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
		String[] columnstableImposi = new String[] {"Id", "Imponible", "ACC 0,9% + TR", "SIS 2,21%",  "Cesantia (2,4% / 3%)", "Total"};
		tableImposi.setColums(columnstableImposi);
		scrollPaneImpEmp.setViewportView(tableImposi);
		
		JLabel lblNewLabel_1_4_4 = new JLabel("TOTAL");
		lblNewLabel_1_4_4.setForeground(Color.WHITE);
		lblNewLabel_1_4_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4_4.setBounds(545, 1365, 166, 20);
		panel.add(lblNewLabel_1_4_4);
		
		txtTotalImposicionesEmpleador = new JTextField();
		txtTotalImposicionesEmpleador.setColumns(10);
		txtTotalImposicionesEmpleador.setBounds(645, 1365, 90, 20);
		panel.add(txtTotalImposicionesEmpleador);
		
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
		btnGuardar.setBounds(648, 1420, 89, 23);
		btnGuardar.addActionListener(control);
		panel.add(btnGuardar);
		
		btnModificar = new StandarButton("Modificar");
		btnModificar.setBounds(548, 1420, 89, 23);
		btnModificar.addActionListener(control);
		panel.add(btnModificar);
		
		btnEliminar = new StandarButton("Eliminar");
		btnEliminar.setBounds(448, 1420, 89, 23);
		btnEliminar.addActionListener(control);
		panel.add(btnEliminar);
		
		actualizarVista();

	}
	
	public void calcularTotalImponible() {
		
		double t = 0;
		
		for(int i=0; i<this.tableRemImp.getRowCount(); i++) {
			 t += Double.parseDouble(String.valueOf(tableRemImp.getModel().getValueAt(i, 6)));
		}
		
		txtTotImp.setText(""+t);
	}
	public void calcularTotalNoImponible() {
		
		double t = 0;
		
		for(int i=0; i<this.tableRemNoImp.getRowCount(); i++) {
			 t += Double.parseDouble(String.valueOf(tableRemNoImp.getModel().getValueAt(i, 6)));
		}
		txtTotNoImp.setText(""+t);
	}
	public void calcularTotalDescPrevisionales() {
		
		double t = 0;
		
		for(int i=0; i<this.tableDesPre.getRowCount(); i++) {
			 t += Double.parseDouble(String.valueOf(tableDesPre.getModel().getValueAt(i, 6)));
		}
		txtTotDesPrev.setText(""+t);
	}
	public void calcularTotalOtrosDescuentos() {
		
		double t = 0;
		
		for(int i=0; i<this.tableOtrosDes.getRowCount(); i++) {
			 t += Double.parseDouble(String.valueOf(tableOtrosDes.getModel().getValueAt(i, 6)));
		}
		
		txtTotalOtrosDescuentos.setText(""+t);
	}
	public void calcularTotalImposicionesEmpleador() {
		
		double t = 0;
		
		for(int i=0; i<this.tableImposi.getRowCount(); i++) {
			 t += Double.parseDouble(String.valueOf(tableImposi.getModel().getValueAt(i, 4)));
		}
		
		txtTotalImposicionesEmpleador.setText(""+t);
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
	
	public void actualizarVista() {
		vaciarForm();
		control.LlenarTablas();
		calcularTotalImponible();
		calcularTotalNoImponible();
		calcularTotalDescPrevisionales();
		calcularTotalImposicionesEmpleador();;
		calcularTotalOtrosDescuentos();
	}
	
	public void vaciarForm() {
		setId(0L);
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
	
	public void cargarForm(LibroRemuneraciones record) {
		setId(record.getId());
		txtNomTra.setText(record.getNombre());
		txtRutTra.setText(record.getRut());
		txtSueBas.setText(""+record.getSueldoBase());
		txtHorExt.setText(""+record.getHorasExtras());
		txtGra.setText(""+record.getGratificacion());
		txtOtrIng.setText(""+record.getOtrosIngresos());
		txtMov.setText(""+record.getMovilizacion());
		txtCol.setText(""+record.getColacion());
		txtGasRep.setText(""+record.getGastoRep());
		txtAsiFam.setText(""+record.getAsigFamiliar());
		txtAFP.setText(""+record.getAfp());
		txtSal.setText(""+record.getSalud());
		txtDifIsa.setText(""+record.getDifIsapre());
		txtSegCes.setText(""+record.getSeguroCes());
		txtImpDet.setText(""+record.getImpDeter());
		txtImpPagar.setText(""+record.getImgAPag());
		txtAnt.setText(""+record.getAnticipo());
		txtOtrDes.setText(""+record.getOtroDesc());
		txtImponible.setText(""+record.getImponble());
		txtACC.setText(""+record.getAcc());
		txtSIS.setText(""+record.getSis());
		textCesantia.setText(""+record.getCesantia());
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

	public JTextField getTxtTotImp() {
		return txtTotImp;
	}

	public void setTxtTotImp(JTextField txtTotImp) {
		this.txtTotImp = txtTotImp;
	}

	public JTextField getTxtTotNoImp() {
		return txtTotNoImp;
	}

	public void setTxtTotNoImp(JTextField txtTotNoImp) {
		this.txtTotNoImp = txtTotNoImp;
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

	public JTextField getTextField_4() {
		return txtTotalOtrosDescuentos;
	}

	public void setTextField_4(JTextField textField_4) {
		this.txtTotalOtrosDescuentos = textField_4;
	}

	public JTextField getTextField_9() {
		return txtTotalImposicionesEmpleador;
	}

	public void setTextField_9(JTextField textField_9) {
		this.txtTotalImposicionesEmpleador = textField_9;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StandarButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(StandarButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public StandarButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(StandarButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}
}
