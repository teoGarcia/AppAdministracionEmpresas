package CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.Imprimir;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.LiquidacionSueldo;
import core.Helpers;

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
	private JLabel lblNomTra;
	private JLabel lblRutTra;
	private JLabel lblMes;
	private JLabel lblSueBas;
	private JLabel lblHorExt;
	private JLabel lblBonGesMen;
	private JLabel lblPar;
	private JLabel lblCom;
	private JLabel lblGra;
	private JLabel lblCarAsiLab;
	private JLabel lblAsiCol;
	private JLabel lblAsiMov;
	private JLabel lblAFP;
	private JLabel lblSegCes;
	private JLabel lblSalud;
	private JLabel lblDifIsa;
	private JLabel lblImpUni;
	private JLabel lblCuoBie;
	private JLabel lblCuoAhoLib;
	private JLabel lblCreCCFA;
	private JLabel lblAsiCol_1;
	private JLabel lblHaberes;
	private JLabel lblDescu;
	private JLabel lblTolLiq;
	private JLabel lblNomTra_1;
	private JLabel lblRutTra_1;
	private JLabel lblAnio;
	private JLabel lblCuoSin;

	
	public ImprimirLiquidacion() {
		
		setBackground(Color.WHITE);
		
		cil = new ControlImprimirLiquidacion(this);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de Empresa:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2.setBounds(52, 139, 129, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Liquidacion de sueldo");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 84, 584, 33);
		add(lblNewLabel_3);
		
		lblNomTra = new JLabel("Nombre del trabajador");
		lblNomTra.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNomTra.setBounds(183, 139, 217, 22);
		add(lblNomTra);
		
		JLabel lblNewLabel_2_1 = new JLabel("Rut:");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(410, 139, 37, 22);
		add(lblNewLabel_2_1);
		
		lblRutTra = new JLabel("Rut del empresa");
		lblRutTra.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRutTra.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblRutTra.setBounds(439, 139, 90, 22);
		add(lblRutTra);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Pago el mes");
		lblNewLabel_4_1_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_4_1_1.setBounds(60, 197, 97, 22);
		add(lblNewLabel_4_1_1);
		
		lblMes = new JLabel("Septiembre");
		lblMes.setHorizontalAlignment(SwingConstants.CENTER);
		lblMes.setFont(new Font("Dialog", Font.BOLD, 11));
		lblMes.setBounds(147, 197, 111, 22);
		add(lblMes);
		
		JLabel lblRemuneracion = new JLabel("Remuneracion");
		lblRemuneracion.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemuneracion.setFont(new Font("Dialog", Font.BOLD, 11));
		lblRemuneracion.setBounds(126, 242, 104, 22);
		add(lblRemuneracion);
		
		JLabel lblDescuentos = new JLabel("Descuentos");
		lblDescuentos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescuentos.setFont(new Font("Dialog", Font.BOLD, 11));
		lblDescuentos.setBounds(380, 242, 104, 22);
		add(lblDescuentos);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(304, 265, 1, 279);
		add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Sueldo Base");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(60, 286, 90, 16);
		add(lblNewLabel_1);
		
		lblSueBas = new JLabel("20.000.000.00");
		lblSueBas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSueBas.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblSueBas.setBounds(208, 286, 86, 16);
		add(lblSueBas);
		
		JLabel lblNewLabel_1_2 = new JLabel("Horas Extraordinarias");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2.setBounds(60, 313, 136, 16);
		add(lblNewLabel_1_2);
		
		lblHorExt = new JLabel("Sueldo Base");
		lblHorExt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHorExt.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblHorExt.setBounds(208, 313, 86, 16);
		add(lblHorExt);
		
		JLabel lblNewLabel_1_3 = new JLabel("Bono de gestion mensual");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_3.setBounds(60, 340, 147, 16);
		add(lblNewLabel_1_3);
		
		lblBonGesMen = new JLabel("Sueldo Base");
		lblBonGesMen.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBonGesMen.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblBonGesMen.setBounds(208, 340, 86, 16);
		add(lblBonGesMen);
		
		JLabel lblNewLabel_1_4 = new JLabel("Participaci\u00F3n");
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_4.setBounds(60, 367, 90, 16);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Comisiones");
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_1.setBounds(60, 394, 90, 16);
		add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Gratificaci\u00F3n");
		lblNewLabel_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_3_1.setBounds(60, 421, 90, 16);
		add(lblNewLabel_1_3_1);
		
		lblGra = new JLabel("Sueldo Base");
		lblGra.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGra.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblGra.setBounds(208, 421, 86, 16);
		add(lblGra);
		
		lblCom = new JLabel("Sueldo Base");
		lblCom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCom.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCom.setBounds(208, 394, 86, 16);
		add(lblCom);
		
		lblPar = new JLabel("Sueldo Base");
		lblPar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPar.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblPar.setBounds(208, 367, 86, 16);
		add(lblPar);
		
		JLabel lblNewLabel_1_5 = new JLabel("Cargas Asig. Laboral");
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_5.setBounds(60, 448, 147, 16);
		add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Asignaci\u00F3n de Colaci\u00F3n");
		lblNewLabel_1_2_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_2.setBounds(60, 475, 147, 16);
		add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Asignaci\u00F3n de movilizaci\u00F3n");
		lblNewLabel_1_3_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_3_2.setBounds(60, 502, 160, 16);
		add(lblNewLabel_1_3_2);
		
		lblAsiMov = new JLabel("Sueldo Base");
		lblAsiMov.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAsiMov.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAsiMov.setBounds(208, 502, 86, 16);
		add(lblAsiMov);
		
		lblAsiCol = new JLabel("Sueldo Base");
		lblAsiCol.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAsiCol.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAsiCol.setBounds(208, 475, 86, 16);
		add(lblAsiCol);
		
		lblCarAsiLab = new JLabel("Sueldo Base");
		lblCarAsiLab.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCarAsiLab.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCarAsiLab.setBounds(208, 448, 86, 16);
		add(lblCarAsiLab);
		
		JLabel lblNewLabel_1_1 = new JLabel("AFP");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_1.setBounds(316, 286, 90, 16);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Seguro de Cesant\u00EDa");
		lblNewLabel_1_2_3.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_3.setBounds(316, 313, 136, 16);
		add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Salud");
		lblNewLabel_1_3_3.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_3_3.setBounds(316, 340, 147, 16);
		add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Diferencia de Isapre");
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_4_1.setBounds(316, 367, 141, 16);
		add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Impuesto \u00DAnico");
		lblNewLabel_1_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_1_1.setBounds(316, 394, 136, 16);
		add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Cuota Bienestar");
		lblNewLabel_1_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_3_1_1.setBounds(316, 421, 110, 16);
		add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Cuota Ahorro Libreta");
		lblNewLabel_1_5_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_5_1.setBounds(316, 448, 152, 16);
		add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Caja de Compensacion");
		lblNewLabel_1_2_2_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_2_1.setBounds(316, 475, 165, 16);
		add(lblNewLabel_1_2_2_1);
		
		lblCreCCFA = new JLabel("Sueldo Base");
		lblCreCCFA.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCreCCFA.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCreCCFA.setBounds(454, 475, 75, 16);
		add(lblCreCCFA);
		
		lblCuoAhoLib = new JLabel("Sueldo Base");
		lblCuoAhoLib.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCuoAhoLib.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCuoAhoLib.setBounds(454, 448, 75, 16);
		add(lblCuoAhoLib);
		
		lblCuoBie = new JLabel("Sueldo Base");
		lblCuoBie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCuoBie.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCuoBie.setBounds(454, 421, 75, 16);
		add(lblCuoBie);
		
		lblImpUni = new JLabel("Sueldo Base");
		lblImpUni.setHorizontalAlignment(SwingConstants.RIGHT);
		lblImpUni.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblImpUni.setBounds(454, 394, 75, 16);
		add(lblImpUni);
		
		lblDifIsa = new JLabel("Sueldo Base");
		lblDifIsa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDifIsa.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblDifIsa.setBounds(454, 367, 75, 16);
		add(lblDifIsa);
		
		lblSalud = new JLabel("Sueldo Base");
		lblSalud.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalud.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblSalud.setBounds(454, 340, 75, 16);
		add(lblSalud);
		
		lblSegCes = new JLabel("Sueldo Base");
		lblSegCes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSegCes.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblSegCes.setBounds(454, 313, 75, 16);
		add(lblSegCes);
		
		lblAFP = new JLabel("20.000.000.00");
		lblAFP.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAFP.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAFP.setBounds(454, 286, 75, 16);
		add(lblAFP);
		
		lblTolLiq = new JLabel("Sueldo Base");
		lblTolLiq.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTolLiq.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblTolLiq.setBounds(443, 622, 86, 16);
		add(lblTolLiq);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("Total  Liquido");
		lblNewLabel_1_3_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_3_2_1.setBounds(299, 622, 111, 16);
		add(lblNewLabel_1_3_2_1);
		
		lblAsiCol_1 = new JLabel("Sueldo Base");
		lblAsiCol_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAsiCol_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAsiCol_1.setBounds(454, 528, 75, 16);
		add(lblAsiCol_1);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Vales o Anticipos");
		lblNewLabel_1_2_2_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_2_2.setBounds(316, 528, 147, 16);
		add(lblNewLabel_1_2_2_2);
		
		lblDescu = new JLabel("30.000.000.03");
		lblDescu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescu.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblDescu.setBounds(443, 595, 86, 16);
		add(lblDescu);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Total Descuentos");
		lblNewLabel_1_3_1_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_3_1_2.setBounds(299, 595, 119, 16);
		add(lblNewLabel_1_3_1_2);
		
		lblHaberes = new JLabel("20.000.000.02");
		lblHaberes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHaberes.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblHaberes.setBounds(443, 568, 86, 16);
		add(lblHaberes);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Total Haberes");
		lblNewLabel_1_2_1_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_2_1_2.setBounds(299, 568, 90, 16);
		add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombre del trabajador: ");
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2_2.setBounds(52, 164, 133, 22);
		add(lblNewLabel_2_2);
		
		lblNomTra_1 = new JLabel("Nombre de trabajador");
		lblNomTra_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNomTra_1.setBounds(183, 164, 217, 22);
		add(lblNomTra_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Rut:");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2_1_1.setBounds(410, 164, 36, 22);
		add(lblNewLabel_2_1_1);
		
		lblRutTra_1 = new JLabel("Rut del trabajador");
		lblRutTra_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRutTra_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblRutTra_1.setBounds(439, 164, 90, 22);
		add(lblRutTra_1);
		
		lblAnio = new JLabel("Septiembre");
		lblAnio.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnio.setFont(new Font("Dialog", Font.BOLD, 11));
		lblAnio.setBounds(316, 197, 111, 22);
		add(lblAnio);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Del a\u00F1o");
		lblNewLabel_4_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_4_1_1_1.setBounds(268, 197, 69, 22);
		add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_1_2_2_2_1 = new JLabel("Cuota Sindical");
		lblNewLabel_1_2_2_2_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_2_2_1.setBounds(315, 502, 147, 16);
		add(lblNewLabel_1_2_2_2_1);
		
		lblCuoSin = new JLabel("Sueldo Base");
		lblCuoSin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCuoSin.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCuoSin.setBounds(453, 502, 75, 16);
		add(lblCuoSin);
	}
	
	
	public void cargarForm(LiquidacionSueldo record) {
		
		int mes = record.getMes()+1;
		
		lblNomTra.setText(record.getNomEmpresa());
		lblRutTra.setText(record.getRutEmpresa());
		lblNomTra_1.setText(record.getNomTrabajador());
		lblRutTra_1.setText(record.getRutTrabajador());
		lblMes.setText(""+mes);
		lblAnio.setText(""+record.getAnio());
		lblSueBas.setText(Helpers.ponerPuntos(""+record.getSueldo()));
		lblHorExt.setText(Helpers.ponerPuntos(""+record.getHrasExtra()));
		lblBonGesMen.setText(Helpers.ponerPuntos(""+record.getBonoGesMen()));
		lblPar.setText(Helpers.ponerPuntos(""+record.getParticipacion()));
		lblCom.setText(Helpers.ponerPuntos(""+record.getComisiones()));
		lblGra.setText(Helpers.ponerPuntos(""+record.getGratificacion()));
		lblCarAsiLab.setText(Helpers.ponerPuntos(""+record.getCargFami()));
		lblAsiCol.setText(Helpers.ponerPuntos(""+record.getAsigCola()));
		lblAsiMov.setText(Helpers.ponerPuntos(""+record.getAsigMovi()));
		lblAFP.setText(Helpers.ponerPuntos(""+record.getAfp()));
		lblSegCes.setText(Helpers.ponerPuntos(""+record.getSeguroCesantia()));
		lblSalud.setText(Helpers.ponerPuntos(""+record.getSalud()));
		lblDifIsa.setText(Helpers.ponerPuntos(""+record.getDifIsap()));
		lblImpUni.setText(Helpers.ponerPuntos(""+record.getImpUni()));
		lblCuoBie.setText(Helpers.ponerPuntos(""+record.getCuoBie()));
		lblCuoAhoLib.setText(Helpers.ponerPuntos(""+record.getCuoAhorrLibr()));
		lblCreCCFA.setText(Helpers.ponerPuntos(""+record.getCredCCFAAra()));
		lblAsiCol_1.setText(Helpers.ponerPuntos(""+record.getValesAnticipos()));
		
		lblCuoSin.setText(Helpers.ponerPuntos(""+record.getCuotaSindical()));
		
		int sumarHaberes = record.getSueldo() + record.getHrasExtra() + record.getBonoGesMen() + record.getParticipacion() + record.getComisiones() + record.getGratificacion() + record.getCargFami() + record.getAsigCola() + record.getAsigMovi();
		lblHaberes.setText(Helpers.ponerPuntos(""+sumarHaberes));
		
		int sumaDescuento= record.getCuotaSindical() + record.getAfp() + record.getSeguroCesantia() + record.getSalud() + record.getDifIsap() + record.getImpUni() + record.getCuoBie() + record.getCuoAhorrLibr() + record.getCredCCFAAra() + record.getValesAnticipos();
		lblDescu.setText(Helpers.ponerPuntos(""+ sumaDescuento));
		
		int total = sumarHaberes - sumaDescuento;
		
		lblTolLiq.setText(Helpers.ponerPuntos(""+total));
		
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
