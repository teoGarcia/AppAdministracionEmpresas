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
	private JTable tableRemImp;
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
	private JTable tableRemNoImp;
	private JTextField txtTotAFP;
	private JTextField txtTotSal;
	private JTextField txtTotDifIsa;
	private JTextField txtTotSegCes;
	private JTextField txtTotDesPrev;
	private JTable tableDesPre;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public VistaLibroRemuneraciones() {
		
		setOpaque(false);
		setBounds(0, 0, 748, 722);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 767, 722);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1500));
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
		
		tableRemImp = new JTable();
		tableRemImp.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre ", "Sueldo Base", "Horas Extras", "Gratificacion", "Otros Ingresos", "Total Imponible"
			}
		));
		tableRemImp.getColumnModel().getColumn(0).setPreferredWidth(155);
		scrollPaneRemImp.setViewportView(tableRemImp);
		
		JButton btnAgr = new JButton("Agregar");
		btnAgr.setBounds(21, 395, 89, 23);
		panel.add(btnAgr);
		
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
		
		tableRemNoImp = new JTable();
		tableRemNoImp.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Movilizacion", "Colacion", "Gasto de Rep.", "Asig. Familiar", "Total no Imp."
			}
		));
		tableRemNoImp.getColumnModel().getColumn(0).setPreferredWidth(155);
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
		
		tableDesPre = new JTable();
		tableDesPre.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Nombre", "AFP", "Salud", "Dif Isapre", "Seg. Cesantia", "Total Desc. Prev."
				}
			));
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

	}
}
