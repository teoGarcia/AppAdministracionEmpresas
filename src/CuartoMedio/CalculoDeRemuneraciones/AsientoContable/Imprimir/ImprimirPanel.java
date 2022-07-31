package CuartoMedio.CalculoDeRemuneraciones.AsientoContable.Imprimir;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CuartoMedio.CalculoDeRemuneraciones.AsientoContable.AsientoContable;
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

public class ImprimirPanel extends JPanel implements Printable{

	private JPanel contentPane;
	private JLabel lblNomTra;
	private JLabel lblRutTra;
	private JLabel lblSueldo;
	private JLabel lblGratifica;
	private JLabel lblHorasExt;
	private JLabel lblComisiones;
	private JLabel lblBonus;
	private JLabel lblMovilizacion;
	private JLabel lblColacion;
	private JLabel lblViaticos;
	private JLabel lblAFP;
	private JLabel lblFonasa;
	private JLabel lblIsapre;
	private JLabel lblDifIsa;
	private JLabel lblSegCesa;
	private JLabel lblImpuUnic;
	private JLabel lblCuoSind;
	private JLabel lblCuotaBiene;
	private JLabel lblAntiSuel;
	private JLabel lblAportePatro;
	private JLabel lblCajaBancoPatro;
	private JLabel lblGlosaPatronal;
	private JLabel lblCargo;
	private JLabel lblFecha;
	private JLabel lblAsigFami;
	private JLabel lblTotalDebe;
	private JLabel lblTotalHaber;
	private JLabel lblSueldPaga;
	private JLabel lblCajaBancoRemune;
	private JLabel lblGlosaRemu;

	
	public ImprimirPanel() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de Empresa:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2.setBounds(57, 152, 133, 22);
		add(lblNewLabel_2);
		
		JLabel lblTitulo = new JLabel("Asiento Contable de Remuneraciones");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTitulo.setBounds(10, 70, 584, 33);
		add(lblTitulo);
		
		lblNomTra = new JLabel("Nombre de trabajador");
		lblNomTra.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNomTra.setBounds(193, 152, 147, 22);
		add(lblNomTra);
		
		JLabel lblNewLabel_2_1 = new JLabel("Rut:");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(374, 152, 60, 22);
		add(lblNewLabel_2_1);
		
		lblRutTra = new JLabel("Rut del empresa");
		lblRutTra.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRutTra.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblRutTra.setBounds(438, 152, 91, 22);
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
		separator.setBounds(304, 265, 1, 287);
		add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Sueldo");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(60, 286, 90, 16);
		add(lblNewLabel_1);
		
		lblSueldo = new JLabel("20.000.000.00");
		lblSueldo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSueldo.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblSueldo.setBounds(208, 286, 86, 16);
		add(lblSueldo);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gratificaciones");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2.setBounds(60, 313, 136, 16);
		add(lblNewLabel_1_2);
		
		lblGratifica = new JLabel("Sueldo Base");
		lblGratifica.setHorizontalAlignment(SwingConstants.CENTER);
		lblGratifica.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblGratifica.setBounds(208, 313, 86, 16);
		add(lblGratifica);
		
		JLabel lblNewLabel_1_3 = new JLabel("Horas Extraordinarias");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_3.setBounds(60, 340, 147, 16);
		add(lblNewLabel_1_3);
		
		lblHorasExt = new JLabel("Sueldo Base");
		lblHorasExt.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorasExt.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblHorasExt.setBounds(208, 340, 86, 16);
		add(lblHorasExt);
		
		JLabel lblNewLabel_1_4 = new JLabel("Comisiones");
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_4.setBounds(60, 367, 90, 16);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Bonos");
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_1.setBounds(60, 394, 90, 16);
		add(lblNewLabel_1_2_1);
		
		lblBonus = new JLabel("Sueldo Base");
		lblBonus.setHorizontalAlignment(SwingConstants.CENTER);
		lblBonus.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblBonus.setBounds(208, 394, 86, 16);
		add(lblBonus);
		
		lblComisiones = new JLabel("Sueldo Base");
		lblComisiones.setHorizontalAlignment(SwingConstants.CENTER);
		lblComisiones.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblComisiones.setBounds(208, 367, 86, 16);
		add(lblComisiones);
		
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
		
		lblViaticos = new JLabel("Sueldo Base");
		lblViaticos.setHorizontalAlignment(SwingConstants.CENTER);
		lblViaticos.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblViaticos.setBounds(208, 474, 86, 16);
		add(lblViaticos);
		
		lblColacion = new JLabel("Sueldo Base");
		lblColacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblColacion.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblColacion.setBounds(208, 447, 86, 16);
		add(lblColacion);
		
		lblMovilizacion = new JLabel("Sueldo Base");
		lblMovilizacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovilizacion.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblMovilizacion.setBounds(208, 420, 86, 16);
		add(lblMovilizacion);
		
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
		
		lblCuotaBiene = new JLabel("Sueldo Base");
		lblCuotaBiene.setHorizontalAlignment(SwingConstants.CENTER);
		lblCuotaBiene.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCuotaBiene.setBounds(454, 475, 86, 16);
		add(lblCuotaBiene);
		
		lblCuoSind = new JLabel("Sueldo Base");
		lblCuoSind.setHorizontalAlignment(SwingConstants.CENTER);
		lblCuoSind.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCuoSind.setBounds(454, 448, 86, 16);
		add(lblCuoSind);
		
		lblImpuUnic = new JLabel("Sueldo Base");
		lblImpuUnic.setHorizontalAlignment(SwingConstants.CENTER);
		lblImpuUnic.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblImpuUnic.setBounds(454, 421, 86, 16);
		add(lblImpuUnic);
		
		lblSegCesa = new JLabel("Sueldo Base");
		lblSegCesa.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegCesa.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblSegCesa.setBounds(454, 394, 86, 16);
		add(lblSegCesa);
		
		lblDifIsa = new JLabel("Sueldo Base");
		lblDifIsa.setHorizontalAlignment(SwingConstants.CENTER);
		lblDifIsa.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblDifIsa.setBounds(454, 367, 86, 16);
		add(lblDifIsa);
		
		lblIsapre = new JLabel("Sueldo Base");
		lblIsapre.setHorizontalAlignment(SwingConstants.CENTER);
		lblIsapre.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblIsapre.setBounds(454, 340, 86, 16);
		add(lblIsapre);
		
		lblFonasa = new JLabel("Sueldo Base");
		lblFonasa.setHorizontalAlignment(SwingConstants.CENTER);
		lblFonasa.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFonasa.setBounds(454, 313, 86, 16);
		add(lblFonasa);
		
		lblAFP = new JLabel("20.000.000.00");
		lblAFP.setHorizontalAlignment(SwingConstants.CENTER);
		lblAFP.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAFP.setBounds(454, 286, 86, 16);
		add(lblAFP);
		
		lblAntiSuel = new JLabel("Sueldo Base");
		lblAntiSuel.setHorizontalAlignment(SwingConstants.CENTER);
		lblAntiSuel.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAntiSuel.setBounds(454, 502, 86, 16);
		add(lblAntiSuel);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Anticipos de Sueldo");
		lblNewLabel_1_2_2_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_2_2_2.setBounds(316, 502, 147, 16);
		add(lblNewLabel_1_2_2_2);
		
		lblGlosaPatronal = new JLabel("Sueldo Base");
		lblGlosaPatronal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGlosaPatronal.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblGlosaPatronal.setBounds(445, 646, 86, 16);
		add(lblGlosaPatronal);
		
		lblCajaBancoPatro = new JLabel("30.000.000.03");
		lblCajaBancoPatro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCajaBancoPatro.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblCajaBancoPatro.setBounds(445, 619, 86, 16);
		add(lblCajaBancoPatro);
		
		lblAportePatro = new JLabel("20.000.000.02");
		lblAportePatro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAportePatro.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblAportePatro.setBounds(445, 592, 86, 16);
		add(lblAportePatro);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Aporte patronal");
		lblNewLabel_1_2_1_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_2_1_2.setBounds(318, 592, 90, 16);
		add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Cargo");
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2_2.setBounds(57, 177, 147, 22);
		add(lblNewLabel_2_2);
		
		lblCargo = new JLabel("Cargo");
		lblCargo.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblCargo.setBounds(193, 177, 147, 22);
		add(lblCargo);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Fecha:");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2_1_1.setBounds(375, 177, 59, 22);
		add(lblNewLabel_2_1_1);
		
		lblFecha = new JLabel("fecha");
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFecha.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblFecha.setBounds(439, 177, 90, 22);
		add(lblFecha);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("Asignacion Familiar");
		lblNewLabel_1_3_4.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1_3_4.setBounds(60, 500, 147, 16);
		add(lblNewLabel_1_3_4);
		
		lblAsigFami = new JLabel("Sueldo Base");
		lblAsigFami.setHorizontalAlignment(SwingConstants.CENTER);
		lblAsigFami.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAsigFami.setBounds(208, 500, 86, 16);
		add(lblAsigFami);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(62, 555, 469, 2);
		add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(304, 560, 8, 140);
		add(separator_1_1);
		
		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("Sueldos Pagados");
		lblNewLabel_1_2_1_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_2_1_2_1.setBounds(62, 592, 119, 16);
		add(lblNewLabel_1_2_1_2_1);
		
		JLabel lblNewLabel_1_3_1_2_1 = new JLabel("Caja o Banco");
		lblNewLabel_1_3_1_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_3_1_2_1.setBounds(62, 619, 119, 16);
		add(lblNewLabel_1_3_1_2_1);
		
		JLabel lblNewLabel_1_5_2_1 = new JLabel("Glosa");
		lblNewLabel_1_5_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_5_2_1.setBounds(62, 646, 119, 16);
		add(lblNewLabel_1_5_2_1);
		
		lblGlosaRemu = new JLabel("Sueldo Base");
		lblGlosaRemu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGlosaRemu.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblGlosaRemu.setBounds(206, 646, 86, 16);
		add(lblGlosaRemu);
		
		lblCajaBancoRemune = new JLabel("30.000.000.03");
		lblCajaBancoRemune.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCajaBancoRemune.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblCajaBancoRemune.setBounds(206, 619, 86, 16);
		add(lblCajaBancoRemune);
		
		lblSueldPaga = new JLabel("20.000.000.02");
		lblSueldPaga.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSueldPaga.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblSueldPaga.setBounds(206, 592, 86, 16);
		add(lblSueldPaga);
		
		JLabel lblAsienContDe = new JLabel("Asien. Cont. de pago de remuneraciones");
		lblAsienContDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblAsienContDe.setFont(new Font("Dialog", Font.BOLD, 11));
		lblAsienContDe.setBounds(47, 560, 245, 22);
		add(lblAsienContDe);
		
		JLabel lblAsienContDe_2 = new JLabel("Asien. Cont. de pago de aporte patronal");
		lblAsienContDe_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAsienContDe_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblAsienContDe_2.setBounds(309, 560, 245, 22);
		add(lblAsienContDe_2);
		
		JLabel lblNewLabel_1_3_1_2_1_1 = new JLabel("Caja o Banco");
		lblNewLabel_1_3_1_2_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_3_1_2_1_1.setBounds(318, 619, 119, 16);
		add(lblNewLabel_1_3_1_2_1_1);
		
		JLabel lblNewLabel_1_5_2_1_1 = new JLabel("Glosa");
		lblNewLabel_1_5_2_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_5_2_1_1.setBounds(318, 646, 147, 16);
		add(lblNewLabel_1_5_2_1_1);
		
		JLabel lblNewLabel_1_5_2_1_2 = new JLabel("Total");
		lblNewLabel_1_5_2_1_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_5_2_1_2.setBounds(145, 532, 62, 16);
		add(lblNewLabel_1_5_2_1_2);
		
		lblTotalDebe = new JLabel("0");
		lblTotalDebe.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalDebe.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblTotalDebe.setBounds(204, 532, 86, 16);
		add(lblTotalDebe);
		
		lblTotalHaber = new JLabel("0");
		lblTotalHaber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalHaber.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblTotalHaber.setBounds(439, 532, 86, 16);
		add(lblTotalHaber);
		
		JLabel lblNewLabel_1_5_2_1_2_1 = new JLabel("Total");
		lblNewLabel_1_5_2_1_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_5_2_1_2_1.setBounds(380, 532, 62, 16);
		add(lblNewLabel_1_5_2_1_2_1);
	}
	
	
	public void cargarForm(AsientoContable record) {
		
		lblNomTra.setText(record.getNomEmple());
		lblRutTra.setText(record.getRut());
		lblCargo.setText(record.getCargo());
		lblFecha.setText(Helpers.getFechaFormat(record.getFecha()));
		
		lblSueldo.setText(Helpers.ponerPuntos(""+record.getSueldo()));
		lblGratifica.setText(Helpers.ponerPuntos(""+record.getGratificaciones()));
		lblHorasExt.setText(Helpers.ponerPuntos(""+record.gethExtra()));
		lblComisiones.setText(Helpers.ponerPuntos(""+record.getComisones()));
		lblBonus.setText(Helpers.ponerPuntos(""+record.getBonus()));
		lblMovilizacion.setText(Helpers.ponerPuntos(""+record.getMovili()));
		lblColacion.setText(Helpers.ponerPuntos(""+record.getColacion()));
		lblViaticos.setText(Helpers.ponerPuntos(""+record.getViaticos()));
		lblAsigFami.setText(Helpers.ponerPuntos(""+record.getAsigfami()));
		
		lblAFP.setText(Helpers.ponerPuntos(""+record.getAfp()));
		lblFonasa.setText(Helpers.ponerPuntos(""+record.getFonasa()));
		lblIsapre.setText(Helpers.ponerPuntos(""+record.getIsapre()));
		lblDifIsa.setText(Helpers.ponerPuntos(""+record.getDifIsapre()));
		lblSegCesa.setText(Helpers.ponerPuntos(""+record.getSegSesan()));
		lblImpuUnic.setText(Helpers.ponerPuntos(""+record.getImpUni()));
		lblCuoSind.setText(Helpers.ponerPuntos(""+record.getCuotSind()));
		lblCuotaBiene.setText(Helpers.ponerPuntos(""+record.getCuotBiene()));
		lblAntiSuel.setText(Helpers.ponerPuntos(""+record.getAntSuel()));
		
		int sumaDede = record.getSueldo() + record.getGratificaciones() + record.gethExtra() + record.getComisones() +record.getBonus() + record.getMovili() + record.getColacion() + record.getViaticos() + record.getAsigfami();
		lblTotalDebe.setText(Helpers.ponerPuntos(""+ sumaDede));
		
		int sumarHaber = record.getAfp() + record.getFonasa() + record.getIsapre() + record.getDifIsapre() + record.getSegSesan() + record.getImpUni() + record.getCuotSind() + record.getCuotBiene() + record.getAntSuel();
		lblTotalHaber.setText(Helpers.ponerPuntos(""+ sumarHaber));
		
		lblSueldPaga.setText(Helpers.ponerPuntos(""+ record.getSulpagRem()));
		lblCajaBancoRemune.setText(Helpers.ponerPuntos(""+ record.getCajaBancoRem()));
		lblGlosaRemu.setText(Helpers.ponerPuntos(""+ record.getGlosaRem()));
		
		lblAportePatro.setText(Helpers.ponerPuntos(""+ record.getSulpagPatro()));
		lblCajaBancoPatro.setText(Helpers.ponerPuntos(""+ record.getCajaBancoPatro()));
		lblGlosaPatronal.setText(Helpers.ponerPuntos(""+ record.getGlosaPatro()));
		
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
