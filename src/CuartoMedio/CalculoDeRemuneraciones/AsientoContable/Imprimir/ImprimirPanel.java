package CuartoMedio.CalculoDeRemuneraciones.AsientoContable.Imprimir;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo.LiquidacionSueldo;

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

public class ImprimirPanel extends JPanel implements Printable{

	private JPanel contentPane;
	private JLabel lblNomTra;
	private JLabel lblRutTra;
	private JLabel lblSueBas;
	private JLabel lblHorExt;
	private JLabel lblBonGesMen;
	private JLabel lblPar;
	private JLabel lblCom;
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
	private JLabel lblAlcLiq;
	private JLabel lblTolLiq;
	private JLabel lblCargo;
	private JLabel lblFecha;

	
	public ImprimirPanel() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 0, 584, 750);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de Empresa:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 125, 133, 22);
		add(lblNewLabel_2);
		
		JLabel lblTitulo = new JLabel("Asiento Contable de Remuneraciones");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTitulo.setBounds(10, 70, 584, 33);
		add(lblTitulo);
		
		lblNomTra = new JLabel("Nombre de trabajador");
		lblNomTra.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNomTra.setBounds(171, 125, 147, 22);
		add(lblNomTra);
		
		JLabel lblNewLabel_2_1 = new JLabel("Rut:");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(326, 125, 80, 22);
		add(lblNewLabel_2_1);
		
		lblRutTra = new JLabel("Rut del empresa");
		lblRutTra.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblRutTra.setBounds(400, 125, 174, 22);
		add(lblRutTra);
		
		JLabel lblRemuneracion = new JLabel("DEBE");
		lblRemuneracion.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemuneracion.setFont(new Font("Dialog", Font.BOLD, 11));
		lblRemuneracion.setBounds(126, 242, 104, 22);
		add(lblRemuneracion);
		
		JLabel lblDescuentos = new JLabel("HABER");
		lblDescuentos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescuentos.setFont(new Font("Dialog", Font.BOLD, 11));
		lblDescuentos.setBounds(380, 242, 104, 22);
		add(lblDescuentos);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(297, 265, 8, 270);
		add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Sueldo");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(60, 286, 90, 16);
		add(lblNewLabel_1);
		
		lblSueBas = new JLabel("20.000.000.00");
		lblSueBas.setHorizontalAlignment(SwingConstants.CENTER);
		lblSueBas.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblSueBas.setBounds(208, 286, 86, 16);
		add(lblSueBas);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gratificaciones");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2.setBounds(60, 313, 136, 16);
		add(lblNewLabel_1_2);
		
		lblHorExt = new JLabel("Sueldo Base");
		lblHorExt.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorExt.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblHorExt.setBounds(208, 313, 86, 16);
		add(lblHorExt);
		
		JLabel lblNewLabel_1_3 = new JLabel("Horas Extraordinarias");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_3.setBounds(60, 340, 147, 16);
		add(lblNewLabel_1_3);
		
		lblBonGesMen = new JLabel("Sueldo Base");
		lblBonGesMen.setHorizontalAlignment(SwingConstants.CENTER);
		lblBonGesMen.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblBonGesMen.setBounds(208, 340, 86, 16);
		add(lblBonGesMen);
		
		JLabel lblNewLabel_1_4 = new JLabel("Comisiones");
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_4.setBounds(60, 367, 90, 16);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Bonos");
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_1.setBounds(60, 394, 90, 16);
		add(lblNewLabel_1_2_1);
		
		lblCom = new JLabel("Sueldo Base");
		lblCom.setHorizontalAlignment(SwingConstants.CENTER);
		lblCom.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCom.setBounds(208, 394, 86, 16);
		add(lblCom);
		
		lblPar = new JLabel("Sueldo Base");
		lblPar.setHorizontalAlignment(SwingConstants.CENTER);
		lblPar.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblPar.setBounds(208, 367, 86, 16);
		add(lblPar);
		
		JLabel lblNewLabel_1_5 = new JLabel("Movilizacion");
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_5.setBounds(60, 420, 147, 16);
		add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Colacion");
		lblNewLabel_1_2_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_2.setBounds(60, 447, 147, 16);
		add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Viaticos");
		lblNewLabel_1_3_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_3_2.setBounds(60, 474, 160, 16);
		add(lblNewLabel_1_3_2);
		
		lblAsiMov = new JLabel("Sueldo Base");
		lblAsiMov.setHorizontalAlignment(SwingConstants.CENTER);
		lblAsiMov.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAsiMov.setBounds(208, 474, 86, 16);
		add(lblAsiMov);
		
		lblAsiCol = new JLabel("Sueldo Base");
		lblAsiCol.setHorizontalAlignment(SwingConstants.CENTER);
		lblAsiCol.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAsiCol.setBounds(208, 447, 86, 16);
		add(lblAsiCol);
		
		lblCarAsiLab = new JLabel("Sueldo Base");
		lblCarAsiLab.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarAsiLab.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCarAsiLab.setBounds(208, 420, 86, 16);
		add(lblCarAsiLab);
		
		JLabel lblNewLabel_1_1 = new JLabel("AFP");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_1.setBounds(316, 286, 90, 16);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("FONASA");
		lblNewLabel_1_2_3.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_3.setBounds(316, 313, 136, 16);
		add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("ISAPRE");
		lblNewLabel_1_3_3.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_3_3.setBounds(316, 340, 147, 16);
		add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Diferencia de Isapre");
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_4_1.setBounds(316, 367, 141, 16);
		add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Seguro de Cesantia");
		lblNewLabel_1_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_1_1.setBounds(316, 394, 136, 16);
		add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Impuesto Unico");
		lblNewLabel_1_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_3_1_1.setBounds(316, 421, 110, 16);
		add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Cuota Sindical");
		lblNewLabel_1_5_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_5_1.setBounds(316, 448, 152, 16);
		add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Cuota Bienestar");
		lblNewLabel_1_2_2_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_2_1.setBounds(316, 475, 165, 16);
		add(lblNewLabel_1_2_2_1);
		
		lblCreCCFA = new JLabel("Sueldo Base");
		lblCreCCFA.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreCCFA.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCreCCFA.setBounds(454, 475, 86, 16);
		add(lblCreCCFA);
		
		lblCuoAhoLib = new JLabel("Sueldo Base");
		lblCuoAhoLib.setHorizontalAlignment(SwingConstants.CENTER);
		lblCuoAhoLib.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCuoAhoLib.setBounds(454, 448, 86, 16);
		add(lblCuoAhoLib);
		
		lblCuoBie = new JLabel("Sueldo Base");
		lblCuoBie.setHorizontalAlignment(SwingConstants.CENTER);
		lblCuoBie.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCuoBie.setBounds(454, 421, 86, 16);
		add(lblCuoBie);
		
		lblImpUni = new JLabel("Sueldo Base");
		lblImpUni.setHorizontalAlignment(SwingConstants.CENTER);
		lblImpUni.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblImpUni.setBounds(454, 394, 86, 16);
		add(lblImpUni);
		
		lblDifIsa = new JLabel("Sueldo Base");
		lblDifIsa.setHorizontalAlignment(SwingConstants.CENTER);
		lblDifIsa.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblDifIsa.setBounds(454, 367, 86, 16);
		add(lblDifIsa);
		
		lblSalud = new JLabel("Sueldo Base");
		lblSalud.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalud.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblSalud.setBounds(454, 340, 86, 16);
		add(lblSalud);
		
		lblSegCes = new JLabel("Sueldo Base");
		lblSegCes.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegCes.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblSegCes.setBounds(454, 313, 86, 16);
		add(lblSegCes);
		
		lblAFP = new JLabel("20.000.000.00");
		lblAFP.setHorizontalAlignment(SwingConstants.CENTER);
		lblAFP.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAFP.setBounds(454, 286, 86, 16);
		add(lblAFP);
		
		lblTolLiq = new JLabel("Sueldo Base");
		lblTolLiq.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTolLiq.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblTolLiq.setBounds(443, 655, 86, 16);
		add(lblTolLiq);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("Total  Liquido");
		lblNewLabel_1_3_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_3_2_1.setBounds(299, 655, 160, 16);
		add(lblNewLabel_1_3_2_1);
		
		lblAsiCol_1 = new JLabel("Sueldo Base");
		lblAsiCol_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAsiCol_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAsiCol_1.setBounds(454, 502, 86, 16);
		add(lblAsiCol_1);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Anticipos de Sueldo");
		lblNewLabel_1_2_2_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_2_2.setBounds(316, 502, 147, 16);
		add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("Alcance Liquido");
		lblNewLabel_1_5_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_5_2.setBounds(299, 628, 147, 16);
		add(lblNewLabel_1_5_2);
		
		lblAlcLiq = new JLabel("Sueldo Base");
		lblAlcLiq.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAlcLiq.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblAlcLiq.setBounds(443, 628, 86, 16);
		add(lblAlcLiq);
		
		lblDescu = new JLabel("30.000.000.03");
		lblDescu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescu.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblDescu.setBounds(443, 601, 86, 16);
		add(lblDescu);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Total Descuentos");
		lblNewLabel_1_3_1_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_3_1_2.setBounds(299, 601, 119, 16);
		add(lblNewLabel_1_3_1_2);
		
		lblHaberes = new JLabel("20.000.000.02");
		lblHaberes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHaberes.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblHaberes.setBounds(443, 574, 86, 16);
		add(lblHaberes);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Total Haberes");
		lblNewLabel_1_2_1_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_2_1_2.setBounds(299, 574, 90, 16);
		add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Cargo");
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2_2.setBounds(10, 150, 147, 22);
		add(lblNewLabel_2_2);
		
		lblCargo = new JLabel("Cargo");
		lblCargo.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblCargo.setBounds(171, 150, 147, 22);
		add(lblCargo);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Fecha:");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2_1_1.setBounds(327, 150, 62, 22);
		add(lblNewLabel_2_1_1);
		
		lblFecha = new JLabel("fecha");
		lblFecha.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblFecha.setBounds(401, 150, 193, 22);
		add(lblFecha);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("Asignacion Familiar");
		lblNewLabel_1_3_4.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_3_4.setBounds(60, 500, 147, 16);
		add(lblNewLabel_1_3_4);
		
		JLabel lblBonGesMen_1 = new JLabel("Sueldo Base");
		lblBonGesMen_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBonGesMen_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblBonGesMen_1.setBounds(208, 500, 86, 16);
		add(lblBonGesMen_1);
	}
	
	
	public void cargarForm(LiquidacionSueldo record) {
		
		lblNomTra.setText(record.getNomEmpresa());
		lblRutTra.setText(record.getRutEmpresa());
		lblCargo.setText(record.getNomTrabajador());
		lblFecha.setText(record.getRutTrabajador());
		lblMes.setText(""+record.getMes());
		lblAnio.setText(""+record.getAnio());
		lblSueBas.setText(""+record.getSueldo());
		lblHorExt.setText(""+record.getHrasExtra());
		lblBonGesMen.setText(""+record.getBonoGesMen());
		lblPar.setText(""+record.getParticipacion());
		lblCom.setText(""+record.getComisiones());
		lblGra.setText(""+record.getGratificacion());
		lblCarAsiLab.setText(""+record.getCargFami());
		lblAsiCol.setText(""+record.getAsigCola());
		lblAsiMov.setText(""+record.getAsigMovi());
		lblAFP.setText(""+record.getAfp());
		lblSegCes.setText(""+record.getSeguroCesantia());
		lblSalud.setText(""+record.getSalud());
		lblDifIsa.setText(""+record.getDifIsap());
		lblImpUni.setText(""+record.getImpUni());
		lblCuoBie.setText(""+record.getCuoBie());
		lblCuoAhoLib.setText(""+record.getCuoAhorrLibr());
		lblCreCCFA.setText(""+record.getCredCCFAAra());
		lblAsiCol_1.setText(""+record.getAsigCola());
		
		double sumarHaberes = record.getSueldo() + record.getHrasExtra() + record.getBonoGesMen() + record.getParticipacion() + record.getComisiones() + record.getGratificacion() + record.getCargFami() + record.getAsigCola() + record.getAsigMovi();
		lblHaberes.setText(""+sumarHaberes);
		
		double sumaDescuento= record.getAfp() + record.getSeguroCesantia() + record.getSalud() + record.getDifIsap() + record.getImpUni() + record.getCuoBie() + record.getCuoAhorrLibr() + record.getCredCCFAAra();
		lblDescu.setText(""+ sumaDescuento);
		
		double alcanceLiquido = sumarHaberes - sumaDescuento;
		
		double valeAnticipo = record.getValesAnticipos();

		double total = alcanceLiquido - valeAnticipo;
		
		lblAlcLiq.setText(""+ alcanceLiquido);
		lblTolLiq.setText(""+ total);
		
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
