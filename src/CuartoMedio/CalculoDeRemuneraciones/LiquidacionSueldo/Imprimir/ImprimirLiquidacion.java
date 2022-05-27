package CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.Imprimir;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class ImprimirLiquidacion extends JPanel implements Printable{

	private JPanel contentPane;
	private ControlImprimirLiquidacion cil;

	
	public ImprimirLiquidacion() {
		setBackground(Color.WHITE);
		
		cil = new ControlImprimirLiquidacion(this);
		
		setBounds(0, 0, 584, 750);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres: ");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2.setBounds(46, 126, 80, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Liquidacion de sueldo");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 52, 584, 33);
		add(lblNewLabel_3);
		
		JLabel lblNomTra = new JLabel("Nombre de trabajador");
		lblNomTra.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNomTra.setBounds(120, 126, 348, 22);
		add(lblNomTra);
		
		JLabel lblNewLabel_2_1 = new JLabel("Rut:");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(46, 151, 80, 22);
		add(lblNewLabel_2_1);
		
		JLabel lblRutTra = new JLabel("Rut del trabajador");
		lblRutTra.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblRutTra.setBounds(120, 151, 174, 22);
		add(lblRutTra);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Pago del sueldo del mes de ");
		lblNewLabel_4_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4_1_1.setBounds(46, 198, 174, 22);
		add(lblNewLabel_4_1_1);
		
		JLabel lblMes = new JLabel("Septiembre");
		lblMes.setHorizontalAlignment(SwingConstants.CENTER);
		lblMes.setFont(new Font("Dialog", Font.BOLD, 12));
		lblMes.setBounds(208, 198, 104, 22);
		add(lblMes);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("del a\u00F1o");
		lblNewLabel_4_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4_1_2.setBounds(316, 198, 62, 22);
		add(lblNewLabel_4_1_2);
		
		JLabel lblAno = new JLabel("2022");
		lblAno.setHorizontalAlignment(SwingConstants.CENTER);
		lblAno.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAno.setBounds(360, 198, 66, 22);
		add(lblAno);
		
		JLabel lblRemuneracion = new JLabel("Remuneracion");
		lblRemuneracion.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemuneracion.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRemuneracion.setBounds(116, 242, 104, 22);
		add(lblRemuneracion);
		
		JLabel lblDescuentos = new JLabel("Descuentos");
		lblDescuentos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescuentos.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDescuentos.setBounds(393, 242, 104, 22);
		add(lblDescuentos);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(297, 265, 8, 270);
		add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Sueldo Base");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(46, 286, 90, 16);
		add(lblNewLabel_1);
		
		JLabel lblSueBas = new JLabel("20.000.000.00");
		lblSueBas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSueBas.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSueBas.setBounds(201, 286, 86, 16);
		add(lblSueBas);
		
		JLabel lblNewLabel_1_2 = new JLabel("Horas Extraordinarias");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(46, 313, 136, 16);
		add(lblNewLabel_1_2);
		
		JLabel lblHorExt = new JLabel("Sueldo Base");
		lblHorExt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHorExt.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblHorExt.setBounds(201, 313, 86, 16);
		add(lblHorExt);
		
		JLabel lblNewLabel_1_3 = new JLabel("Bono de gestion mensual");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(46, 340, 147, 16);
		add(lblNewLabel_1_3);
		
		JLabel lblBonGesMen = new JLabel("Sueldo Base");
		lblBonGesMen.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBonGesMen.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBonGesMen.setBounds(201, 340, 86, 16);
		add(lblBonGesMen);
		
		JLabel lblNewLabel_1_4 = new JLabel("Participaci\u00F3n");
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(46, 367, 90, 16);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Comisiones");
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(46, 394, 90, 16);
		add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Gratificaci\u00F3n");
		lblNewLabel_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_1.setBounds(46, 421, 90, 16);
		add(lblNewLabel_1_3_1);
		
		JLabel lblGra = new JLabel("Sueldo Base");
		lblGra.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGra.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblGra.setBounds(201, 421, 86, 16);
		add(lblGra);
		
		JLabel lblCom = new JLabel("Sueldo Base");
		lblCom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCom.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCom.setBounds(201, 394, 86, 16);
		add(lblCom);
		
		JLabel lblPar = new JLabel("Sueldo Base");
		lblPar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPar.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPar.setBounds(201, 367, 86, 16);
		add(lblPar);
		
		JLabel lblNewLabel_1_5 = new JLabel("Cargas Asig. Laboral");
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_5.setBounds(46, 448, 147, 16);
		add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Asignaci\u00F3n de Colaci\u00F3n");
		lblNewLabel_1_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(46, 475, 147, 16);
		add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Asignaci\u00F3n de movilizaci\u00F3n");
		lblNewLabel_1_3_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_2.setBounds(46, 502, 160, 16);
		add(lblNewLabel_1_3_2);
		
		JLabel lblAsiMov = new JLabel("Sueldo Base");
		lblAsiMov.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAsiMov.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAsiMov.setBounds(201, 502, 86, 16);
		add(lblAsiMov);
		
		JLabel lblAsiCol = new JLabel("Sueldo Base");
		lblAsiCol.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAsiCol.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAsiCol.setBounds(201, 475, 86, 16);
		add(lblAsiCol);
		
		JLabel lblCarAsiLab = new JLabel("Sueldo Base");
		lblCarAsiLab.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCarAsiLab.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCarAsiLab.setBounds(201, 448, 86, 16);
		add(lblCarAsiLab);
		
		JLabel lblNewLabel_1_1 = new JLabel("AFP");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(316, 286, 90, 16);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Seguro de Cesant\u00EDa");
		lblNewLabel_1_2_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_3.setBounds(316, 313, 136, 16);
		add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Salud");
		lblNewLabel_1_3_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_3.setBounds(316, 340, 147, 16);
		add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Diferencia de Isapre");
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1.setBounds(316, 367, 141, 16);
		add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Impuesto \u00DAnico");
		lblNewLabel_1_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBounds(316, 394, 136, 16);
		add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Cuota Bienestar");
		lblNewLabel_1_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_1_1.setBounds(316, 421, 110, 16);
		add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Cuota Ahorro Libreta");
		lblNewLabel_1_5_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_5_1.setBounds(316, 448, 152, 16);
		add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Cr\u00E9dito CCFA La Araucana");
		lblNewLabel_1_2_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1.setBounds(316, 475, 165, 16);
		add(lblNewLabel_1_2_2_1);
		
		JLabel lblCreCCFA = new JLabel("Sueldo Base");
		lblCreCCFA.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCreCCFA.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCreCCFA.setBounds(471, 475, 86, 16);
		add(lblCreCCFA);
		
		JLabel lblCuoAhoLib = new JLabel("Sueldo Base");
		lblCuoAhoLib.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCuoAhoLib.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCuoAhoLib.setBounds(471, 448, 86, 16);
		add(lblCuoAhoLib);
		
		JLabel lblCuoBie = new JLabel("Sueldo Base");
		lblCuoBie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCuoBie.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCuoBie.setBounds(471, 421, 86, 16);
		add(lblCuoBie);
		
		JLabel lblImpUni = new JLabel("Sueldo Base");
		lblImpUni.setHorizontalAlignment(SwingConstants.RIGHT);
		lblImpUni.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblImpUni.setBounds(471, 394, 86, 16);
		add(lblImpUni);
		
		JLabel lblDifIsa = new JLabel("Sueldo Base");
		lblDifIsa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDifIsa.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDifIsa.setBounds(471, 367, 86, 16);
		add(lblDifIsa);
		
		JLabel lblSalud = new JLabel("Sueldo Base");
		lblSalud.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalud.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSalud.setBounds(471, 340, 86, 16);
		add(lblSalud);
		
		JLabel lblSegCes = new JLabel("Sueldo Base");
		lblSegCes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSegCes.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSegCes.setBounds(471, 313, 86, 16);
		add(lblSegCes);
		
		JLabel lblAFP = new JLabel("20.000.000.00");
		lblAFP.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAFP.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAFP.setBounds(471, 286, 86, 16);
		add(lblAFP);
		
		JLabel lblAsiMov_1 = new JLabel("Sueldo Base");
		lblAsiMov_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAsiMov_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAsiMov_1.setBounds(488, 723, 86, 16);
		add(lblAsiMov_1);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("Total Liquido");
		lblNewLabel_1_3_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_2_1.setBounds(333, 723, 160, 16);
		add(lblNewLabel_1_3_2_1);
		
		JLabel lblAsiCol_1 = new JLabel("Sueldo Base");
		lblAsiCol_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAsiCol_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAsiCol_1.setBounds(471, 502, 86, 16);
		add(lblAsiCol_1);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Vales o Anticipos");
		lblNewLabel_1_2_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_2_2.setBounds(316, 502, 147, 16);
		add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("Alcance Liq uido");
		lblNewLabel_1_5_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_5_2.setBounds(333, 696, 147, 16);
		add(lblNewLabel_1_5_2);
		
		JLabel lblCarAsiLab_1 = new JLabel("Sueldo Base");
		lblCarAsiLab_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCarAsiLab_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCarAsiLab_1.setBounds(488, 696, 86, 16);
		add(lblCarAsiLab_1);
		
		JLabel lblGra_1 = new JLabel("Sueldo Base");
		lblGra_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGra_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblGra_1.setBounds(488, 669, 86, 16);
		add(lblGra_1);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Total Descuentos");
		lblNewLabel_1_3_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3_1_2.setBounds(333, 669, 119, 16);
		add(lblNewLabel_1_3_1_2);
		
		JLabel lblCom_1 = new JLabel("Sueldo Base");
		lblCom_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCom_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCom_1.setBounds(488, 642, 86, 16);
		add(lblCom_1);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Total Haberes");
		lblNewLabel_1_2_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_2_1_2.setBounds(333, 642, 90, 16);
		add(lblNewLabel_1_2_1_2);
	}
	
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		if(pageIndex == 0) {
			Graphics2D graphics2D = (Graphics2D) graphics;
			graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
			printAll(graphics2D);
			return PAGE_EXISTS;	
			
		}else {
			return NO_SUCH_PAGE;
			
		}
		
	}
}
