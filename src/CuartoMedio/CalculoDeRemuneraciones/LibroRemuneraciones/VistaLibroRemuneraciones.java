package CuartoMedio.CalculoDeRemuneraciones.LibroRemuneraciones;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.JSeparator;
import ui.Buttons.StandarButton;
import ui.TablaUi.TableStandard;
import ui.Texts.TextSoloNumeros;
import javax.swing.JFormattedTextField;

public class VistaLibroRemuneraciones extends JPanel {
	
	private Long id = 0L;
	
	private JTextField txtNomTra;
	private JFormattedTextField txtRutTra;
	private TextSoloNumeros txtOtrIng;
	private TextSoloNumeros txtSueBas;
	private TextSoloNumeros txtHorExt;
	private TextSoloNumeros txtGra;
	private TextSoloNumeros txtMov;
	private TextSoloNumeros txtCol;
	private TextSoloNumeros txtGasRep;
	private TextSoloNumeros txtAsiFam;
	private TextSoloNumeros txtAFP;
	private TextSoloNumeros txtSal;
	private TextSoloNumeros txtDifIsa;
	private TextSoloNumeros txtSegCes;
	private TextSoloNumeros txtImpDet;
	private TextSoloNumeros txtImpPagar;
	private TextSoloNumeros txtAnt;
	private TextSoloNumeros txtOtrDes;
	private TextSoloNumeros txtTotImp;
	private TextSoloNumeros txtTotNoImp;
	private TextSoloNumeros txtTotDesPrev;
	private TextSoloNumeros txtTotalOtrosDescuentos;
	private TextSoloNumeros txtTotalImposicionesEmpleador;
	private TextSoloNumeros textCesantia;
	private TextSoloNumeros txtSIS;
	private TextSoloNumeros txtACC;
	private TextSoloNumeros txtImponible;
	
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
	private StandarButton btnImprimir;

	

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
		
		try {
			MaskFormatter mascaraR = new MaskFormatter("##.###.###-A");
			txtRutTra = new JFormattedTextField(mascaraR);
			txtRutTra.setColumns(10);
			txtRutTra.setBounds(566, 100, 172, 20);
			panel.add(txtRutTra);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
		
		txtOtrIng = new TextSoloNumeros();
		txtOtrIng.setColumns(10);
		txtOtrIng.setBounds(648, 177, 90, 20);
		panel.add(txtOtrIng);
		
		txtSueBas = new TextSoloNumeros();
		txtSueBas.setColumns(10);
		txtSueBas.setBounds(97, 177, 100, 20);
		panel.add(txtSueBas);
		
		txtHorExt = new TextSoloNumeros();
		txtHorExt.setColumns(10);
		txtHorExt.setBounds(285, 177, 90, 20);
		panel.add(txtHorExt);
		
		txtGra = new TextSoloNumeros();
		txtGra.setColumns(10);
		txtGra.setBounds(463, 177, 90, 20);
		panel.add(txtGra);
		
		JLabel lblNewLabel_1_2_2_4 = new JLabel("Movilizacion");
		lblNewLabel_1_2_2_4.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_4.setBounds(21, 251, 79, 25);
		panel.add(lblNewLabel_1_2_2_4);
		
		txtMov = new TextSoloNumeros();
		txtMov.setColumns(10);
		txtMov.setBounds(97, 254, 100, 20);
		panel.add(txtMov);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Colacion");
		lblNewLabel_1_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1.setBounds(207, 251, 79, 25);
		panel.add(lblNewLabel_1_2_2_1_1);
		
		txtCol = new TextSoloNumeros();
		txtCol.setColumns(10);
		txtCol.setBounds(285, 254, 90, 20);
		panel.add(txtCol);
		
		JLabel lblNewLabel_1_2_2_2_1 = new JLabel("Gastos de Rep");
		lblNewLabel_1_2_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_2_1.setBounds(382, 251, 79, 25);
		panel.add(lblNewLabel_1_2_2_2_1);
		
		txtGasRep = new TextSoloNumeros();
		txtGasRep.setColumns(10);
		txtGasRep.setBounds(463, 254, 90, 20);
		panel.add(txtGasRep);
		
		JLabel lblNewLabel_1_2_2_3_1 = new JLabel("Asig. Familiar");
		lblNewLabel_1_2_2_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_3_1.setBounds(563, 251, 90, 25);
		panel.add(lblNewLabel_1_2_2_3_1);
		
		txtAsiFam = new TextSoloNumeros();
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
		
		txtAFP = new TextSoloNumeros();
		txtAFP.setColumns(10);
		txtAFP.setBounds(110, 326, 100, 20);
		panel.add(txtAFP);
		
		JLabel lblNewLabel_1_2_2_1_1_1 = new JLabel("Salud");
		lblNewLabel_1_2_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1_1.setBounds(215, 323, 79, 25);
		panel.add(lblNewLabel_1_2_2_1_1_1);
		
		txtSal = new TextSoloNumeros();
		txtSal.setColumns(10);
		txtSal.setBounds(285, 326, 90, 20);
		panel.add(txtSal);
		
		JLabel lblNewLabel_1_2_2_2_1_1 = new JLabel("Dif. Isapre");
		lblNewLabel_1_2_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_2_1_1.setBounds(382, 323, 79, 25);
		panel.add(lblNewLabel_1_2_2_2_1_1);
		
		txtDifIsa = new TextSoloNumeros();
		txtDifIsa.setColumns(10);
		txtDifIsa.setBounds(466, 326, 90, 20);
		panel.add(txtDifIsa);
		
		JLabel lblNewLabel_1_2_2_3_1_1 = new JLabel("Seguro de Ces.");
		lblNewLabel_1_2_2_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_3_1_1.setBounds(563, 323, 90, 25);
		panel.add(lblNewLabel_1_2_2_3_1_1);
		
		txtSegCes = new TextSoloNumeros();
		txtSegCes.setColumns(10);
		txtSegCes.setBounds(648, 326, 90, 20);
		panel.add(txtSegCes);
		
		JLabel lblNewLabel_1_2_2_4_2 = new JLabel("Imp. Determin.");
		lblNewLabel_1_2_2_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_4_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_4_2.setBounds(21, 359, 100, 25);
		panel.add(lblNewLabel_1_2_2_4_2);
		
		txtImpDet = new TextSoloNumeros();
		txtImpDet.setColumns(10);
		txtImpDet.setBounds(110, 362, 100, 20);
		panel.add(txtImpDet);
		
		JLabel lblNewLabel_1_2_2_1_1_2 = new JLabel("Imp. a Pag.");
		lblNewLabel_1_2_2_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1_2.setBounds(215, 359, 79, 25);
		panel.add(lblNewLabel_1_2_2_1_1_2);
		
		txtImpPagar = new TextSoloNumeros();
		txtImpPagar.setColumns(10);
		txtImpPagar.setBounds(285, 362, 90, 20);
		panel.add(txtImpPagar);
		
		JLabel lblNewLabel_1_2_2_2_1_2 = new JLabel("Anticipo ");
		lblNewLabel_1_2_2_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_2_1_2.setBounds(382, 359, 79, 25);
		panel.add(lblNewLabel_1_2_2_2_1_2);
		
		txtAnt = new TextSoloNumeros();
		txtAnt.setColumns(10);
		txtAnt.setBounds(466, 362, 90, 20);
		panel.add(txtAnt);
		
		JLabel lblNewLabel_1_2_2_3_1_2 = new JLabel("Otros Descue.");
		lblNewLabel_1_2_2_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_3_1_2.setBounds(563, 359, 90, 25);
		panel.add(lblNewLabel_1_2_2_3_1_2);
		
		txtOtrDes = new TextSoloNumeros();
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
		
		txtTotImp = new TextSoloNumeros();
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
		
		txtTotNoImp = new TextSoloNumeros();
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
		
		txtTotDesPrev = new TextSoloNumeros();
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
		
		txtTotalOtrosDescuentos = new TextSoloNumeros();
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
		
		txtTotalImposicionesEmpleador = new TextSoloNumeros();
		txtTotalImposicionesEmpleador.setColumns(10);
		txtTotalImposicionesEmpleador.setBounds(645, 1365, 90, 20);
		panel.add(txtTotalImposicionesEmpleador);
		
		lblNewLabel_1_2_2_4_3 = new JLabel("Imponible");
		lblNewLabel_1_2_2_4_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_4_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_4_3.setBounds(21, 1210, 79, 25);
		panel.add(lblNewLabel_1_2_2_4_3);
		
		txtImponible = new TextSoloNumeros();
		txtImponible.setColumns(10);
		txtImponible.setBounds(97, 1210, 100, 20);
		panel.add(txtImponible);
		
		lblNewLabel_1_2_2_1_1_3 = new JLabel("ACC 0,9% + T.R");
		lblNewLabel_1_2_2_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1_3.setBounds(202, 1210, 100, 25);
		panel.add(lblNewLabel_1_2_2_1_1_3);
		
		txtACC = new TextSoloNumeros();
		txtACC.setColumns(10);
		txtACC.setBounds(309, 1210, 90, 20);
		panel.add(txtACC);
		
		lblNewLabel_1_2_2_2_1_3 = new JLabel("SIS 2,21%");
		lblNewLabel_1_2_2_2_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_2_1_3.setBounds(409, 1210, 79, 25);
		panel.add(lblNewLabel_1_2_2_2_1_3);
		
		txtSIS = new TextSoloNumeros();
		txtSIS.setColumns(10);
		txtSIS.setBounds(482, 1210, 90, 20);
		panel.add(txtSIS);
		
		lblNewLabel_1_2_2_3_1_3 = new JLabel("Cesantia");
		lblNewLabel_1_2_2_3_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_3_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_3_1_3.setBounds(580, 1210, 90, 25);
		panel.add(lblNewLabel_1_2_2_3_1_3);
		
		textCesantia = new TextSoloNumeros();
		textCesantia.setColumns(10);
		textCesantia.setBounds(648, 1210, 90, 20);
		panel.add(textCesantia);
		
		btnGuardar = new StandarButton("Agregar");
		btnGuardar.setBounds(648, 1420, 89, 30);
		btnGuardar.addActionListener(control);
		panel.add(btnGuardar);
		
		btnModificar = new StandarButton("Modificar");
		btnModificar.setBounds(548, 1420, 89, 30);
		btnModificar.addActionListener(control);
		panel.add(btnModificar);
		
		btnEliminar = new StandarButton("Eliminar");
		btnEliminar.setBounds(448, 1420, 89, 30);
		btnEliminar.addActionListener(control);
		panel.add(btnEliminar);
		
		btnImprimir = new StandarButton((String) null);
		btnImprimir.setText("Imprimir");
		btnImprimir.setBounds(345, 1420, 90, 30);
		btnImprimir.addActionListener(control);
		panel.add(btnImprimir);
		
		actualizarVista();

	}
	
	public void calcularTotalImponible() {
		
		int t = 0;
		
		for(int i=0; i<this.tableRemImp.getRowCount(); i++) {
			 t += Integer.parseInt(String.valueOf(tableRemImp.getModel().getValueAt(i, 6)));
		}
		
		txtTotImp.setText(""+t);
	}
	public void calcularTotalNoImponible() {
		
		int t = 0;
		
		for(int i=0; i<this.tableRemNoImp.getRowCount(); i++) {
			 t += Integer.parseInt(String.valueOf(tableRemNoImp.getModel().getValueAt(i, 6)));
		}
		txtTotNoImp.setText(""+t);
	}
	public void calcularTotalDescPrevisionales() {
		
		int t = 0;
		
		for(int i=0; i<this.tableDesPre.getRowCount(); i++) {
			 t += Integer.parseInt(String.valueOf(tableDesPre.getModel().getValueAt(i, 6)));
		}
		txtTotDesPrev.setText(""+t);
	}
	public void calcularTotalOtrosDescuentos() {
		
		int t = 0;
		
		for(int i=0; i<this.tableOtrosDes.getRowCount(); i++) {
			 t += Integer.parseInt(String.valueOf(tableOtrosDes.getModel().getValueAt(i, 6)));
		}
		
		txtTotalOtrosDescuentos.setText(""+t);
	}
	public void calcularTotalImposicionesEmpleador() {
		
		int t = 0;
		
		for(int i=0; i<this.tableImposi.getRowCount(); i++) {
			 t += Integer.parseInt(String.valueOf(tableImposi.getModel().getValueAt(i, 5)));
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

	public TextSoloNumeros getTxtOtrIng() {
		return txtOtrIng;
	}

	public void setTxtOtrIng(TextSoloNumeros txtOtrIng) {
		this.txtOtrIng = txtOtrIng;
	}

	public TextSoloNumeros getTxtSueBas() {
		return txtSueBas;
	}

	public void setTxtSueBas(TextSoloNumeros txtSueBas) {
		this.txtSueBas = txtSueBas;
	}

	public TextSoloNumeros getTxtHorExt() {
		return txtHorExt;
	}

	public void setTxtHorExt(TextSoloNumeros txtHorExt) {
		this.txtHorExt = txtHorExt;
	}

	public TextSoloNumeros getTxtGra() {
		return txtGra;
	}

	public void setTxtGra(TextSoloNumeros txtGra) {
		this.txtGra = txtGra;
	}

	public TextSoloNumeros getTxtMov() {
		return txtMov;
	}

	public void setTxtMov(TextSoloNumeros txtMov) {
		this.txtMov = txtMov;
	}

	public TextSoloNumeros getTxtCol() {
		return txtCol;
	}

	public void setTxtCol(TextSoloNumeros txtCol) {
		this.txtCol = txtCol;
	}

	public TextSoloNumeros getTxtGasRep() {
		return txtGasRep;
	}

	public void setTxtGasRep(TextSoloNumeros txtGasRep) {
		this.txtGasRep = txtGasRep;
	}

	public TextSoloNumeros getTxtAsiFam() {
		return txtAsiFam;
	}

	public void setTxtAsiFam(TextSoloNumeros txtAsiFam) {
		this.txtAsiFam = txtAsiFam;
	}

	public TextSoloNumeros getTxtAFP() {
		return txtAFP;
	}

	public void setTxtAFP(TextSoloNumeros txtAFP) {
		this.txtAFP = txtAFP;
	}

	public TextSoloNumeros getTxtSal() {
		return txtSal;
	}

	public void setTxtSal(TextSoloNumeros txtSal) {
		this.txtSal = txtSal;
	}

	public TextSoloNumeros getTxtDifIsa() {
		return txtDifIsa;
	}

	public void setTxtDifIsa(TextSoloNumeros txtDifIsa) {
		this.txtDifIsa = txtDifIsa;
	}

	public TextSoloNumeros getTxtSegCes() {
		return txtSegCes;
	}

	public void setTxtSegCes(TextSoloNumeros txtSegCes) {
		this.txtSegCes = txtSegCes;
	}

	public TextSoloNumeros getTxtImpDet() {
		return txtImpDet;
	}

	public void setTxtImpDet(TextSoloNumeros txtImpDet) {
		this.txtImpDet = txtImpDet;
	}

	public TextSoloNumeros getTxtImpPagar() {
		return txtImpPagar;
	}

	public void setTxtImpPagar(TextSoloNumeros txtImpPagar) {
		this.txtImpPagar = txtImpPagar;
	}

	public TextSoloNumeros getTxtAnt() {
		return txtAnt;
	}

	public void setTxtAnt(TextSoloNumeros txtAnt) {
		this.txtAnt = txtAnt;
	}

	public TextSoloNumeros getTxtOtrDes() {
		return txtOtrDes;
	}

	public void setTxtOtrDes(TextSoloNumeros txtOtrDes) {
		this.txtOtrDes = txtOtrDes;
	}

	public JTextField getTxtTotImp() {
		return txtTotImp;
	}

	public void setTxtTotImp(TextSoloNumeros txtTotImp) {
		this.txtTotImp = txtTotImp;
	}

	public JTextField getTxtTotNoImp() {
		return txtTotNoImp;
	}

	public void setTxtTotNoImp(TextSoloNumeros txtTotNoImp) {
		this.txtTotNoImp = txtTotNoImp;
	}

	public JTextField getTxtTotDesPrev() {
		return txtTotDesPrev;
	}

	public void setTxtTotDesPrev(TextSoloNumeros txtTotDesPrev) {
		this.txtTotDesPrev = txtTotDesPrev;
	}

	public JTextField getTxtTotalOtrosDescuentos() {
		return txtTotalOtrosDescuentos;
	}

	public void setTxtTotalOtrosDescuentos(TextSoloNumeros txtTotalOtrosDescuentos) {
		this.txtTotalOtrosDescuentos = txtTotalOtrosDescuentos;
	}

	public JTextField getTxtTotalImposicionesEmpleador() {
		return txtTotalImposicionesEmpleador;
	}

	public void setTxtTotalImposicionesEmpleador(TextSoloNumeros txtTotalImposicionesEmpleador) {
		this.txtTotalImposicionesEmpleador = txtTotalImposicionesEmpleador;
	}

	public TextSoloNumeros getTextCesantia() {
		return textCesantia;
	}

	public void setTextCesantia(TextSoloNumeros textCesantia) {
		this.textCesantia = textCesantia;
	}

	public TextSoloNumeros getTxtSIS() {
		return txtSIS;
	}

	public void setTxtSIS(TextSoloNumeros txtSIS) {
		this.txtSIS = txtSIS;
	}

	public TextSoloNumeros getTxtACC() {
		return txtACC;
	}

	public void setTxtACC(TextSoloNumeros txtACC) {
		this.txtACC = txtACC;
	}

	public TextSoloNumeros getTxtImponible() {
		return txtImponible;
	}

	public void setTxtImponible(TextSoloNumeros txtImponible) {
		this.txtImponible = txtImponible;
	}

	public TableStandard getTableDesPre() {
		return tableDesPre;
	}

	public void setTableDesPre(TableStandard tableDesPre) {
		this.tableDesPre = tableDesPre;
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

	public JLabel getLblNewLabel_1_2_2_1_1_3() {
		return lblNewLabel_1_2_2_1_1_3;
	}

	public void setLblNewLabel_1_2_2_1_1_3(JLabel lblNewLabel_1_2_2_1_1_3) {
		this.lblNewLabel_1_2_2_1_1_3 = lblNewLabel_1_2_2_1_1_3;
	}

	public JLabel getLblNewLabel_1_2_2_2_1_3() {
		return lblNewLabel_1_2_2_2_1_3;
	}

	public void setLblNewLabel_1_2_2_2_1_3(JLabel lblNewLabel_1_2_2_2_1_3) {
		this.lblNewLabel_1_2_2_2_1_3 = lblNewLabel_1_2_2_2_1_3;
	}

	public JLabel getLblNewLabel_1_2_2_3_1_3() {
		return lblNewLabel_1_2_2_3_1_3;
	}

	public void setLblNewLabel_1_2_2_3_1_3(JLabel lblNewLabel_1_2_2_3_1_3) {
		this.lblNewLabel_1_2_2_3_1_3 = lblNewLabel_1_2_2_3_1_3;
	}

	public void setTxtRutTra(JFormattedTextField txtRutTra) {
		this.txtRutTra = txtRutTra;
	}

	public JFormattedTextField getTxtRutTra() {
		return txtRutTra;
	}

	public StandarButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(StandarButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}
}
