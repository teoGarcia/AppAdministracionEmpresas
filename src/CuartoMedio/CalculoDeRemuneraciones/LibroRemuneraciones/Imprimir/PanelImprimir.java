package CuartoMedio.CalculoDeRemuneraciones.LibroRemuneraciones.Imprimir;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import CuartoMedio.CalculoDeRemuneraciones.LibroRemuneraciones.LibroRemuneraciones;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
import core.Helpers;

public class PanelImprimir extends JPanel implements Printable{
	private JLabel lblSueldoBase;
	private JLabel lblHorasExtras;
	private JLabel lblGratificacion;
	private JLabel lblNombre;
	private JLabel lblRut;
	private JLabel lblOtrosIngresos;
	private JLabel lblMovilizacion;
	private JLabel lblColacion;
	private JLabel lblGastosRep;
	private JLabel lblAsigFamiliar;
	private JLabel lblAFP;
	private JLabel lblSalud;
	private JLabel lblSegCesantia;
	private JLabel lblDifIsapre;
	private JLabel lblOtrosDescuentos;
	private JLabel lblAnticipo;
	private JLabel lblImpPagar;
	private JLabel lblImpDeterminado;
	private JLabel lblCesEmpleador;
	private JLabel lblSIS;
	private JLabel lblACC;
	private JLabel lblImponible;

	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2.setBounds(53, 125, 63, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Libro de Remuneraciones");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 70, 584, 33);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Rut:");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1.setBounds(414, 125, 34, 22);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Remuneracion Imponible");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2_2.setBounds(0, 160, 584, 22);
		add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("Sueldo Base:");
		lblNewLabel_2_4.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4.setBounds(53, 198, 60, 22);
		add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Horas Extras:");
		lblNewLabel_2_1_3.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3.setBounds(178, 198, 60, 22);
		add(lblNewLabel_2_1_3);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(53, 301, 488, 5);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(53, 307, 488, 5);
		add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(53, 406, 488, 5);
		add(separator_2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(53, 412, 488, 5);
		add(separator_1_1);
		
		lblSueldoBase = new JLabel("88.025.025");
		lblSueldoBase.setFont(new Font("Dialog", Font.BOLD, 9));
		lblSueldoBase.setBounds(118, 198, 50, 22);
		add(lblSueldoBase);
		
		lblHorasExtras = new JLabel("Horas Extras:");
		lblHorasExtras.setFont(new Font("Dialog", Font.BOLD, 9));
		lblHorasExtras.setBounds(241, 198, 50, 22);
		add(lblHorasExtras);
		
		JLabel lblNewLabel_2_4_2 = new JLabel("Gratificacion:");
		lblNewLabel_2_4_2.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_2.setBounds(300, 198, 60, 22);
		add(lblNewLabel_2_4_2);
		
		lblGratificacion = new JLabel("88.025.025");
		lblGratificacion.setFont(new Font("Dialog", Font.BOLD, 9));
		lblGratificacion.setBounds(360, 198, 50, 22);
		add(lblGratificacion);
		
		JLabel lblNewLabel_2_1_3_2 = new JLabel("Otros Ingresos:");
		lblNewLabel_2_1_3_2.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_2.setBounds(420, 198, 66, 22);
		add(lblNewLabel_2_1_3_2);
		
		lblOtrosIngresos = new JLabel("Horas Extras:");
		lblOtrosIngresos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOtrosIngresos.setFont(new Font("Dialog", Font.BOLD, 9));
		lblOtrosIngresos.setBounds(491, 198, 50, 22);
		add(lblOtrosIngresos);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Remuneracion No Imponible");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2_2_1.setBounds(0, 230, 584, 22);
		add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Movilizacion:");
		lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_1.setBounds(53, 268, 60, 22);
		add(lblNewLabel_2_4_1);
		
		lblMovilizacion = new JLabel("88.025.025");
		lblMovilizacion.setFont(new Font("Dialog", Font.BOLD, 9));
		lblMovilizacion.setBounds(118, 268, 50, 22);
		add(lblMovilizacion);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Colacion:");
		lblNewLabel_2_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1.setBounds(178, 268, 60, 22);
		add(lblNewLabel_2_1_3_1);
		
		lblColacion = new JLabel("Horas Extras:");
		lblColacion.setFont(new Font("Dialog", Font.BOLD, 9));
		lblColacion.setBounds(231, 268, 50, 22);
		add(lblColacion);
		
		JLabel lblNewLabel_2_4_2_1 = new JLabel("Gastos de Rep.:");
		lblNewLabel_2_4_2_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_2_1.setBounds(290, 268, 74, 22);
		add(lblNewLabel_2_4_2_1);
		
		lblGastosRep = new JLabel("88.025.025");
		lblGastosRep.setFont(new Font("Dialog", Font.BOLD, 9));
		lblGastosRep.setBounds(365, 268, 50, 22);
		add(lblGastosRep);
		
		JLabel lblNewLabel_2_1_3_2_1 = new JLabel("Asig. Familiar:");
		lblNewLabel_2_1_3_2_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_2_1.setBounds(420, 268, 66, 22);
		add(lblNewLabel_2_1_3_2_1);
		
		lblAsigFamiliar = new JLabel("Horas Extras:");
		lblAsigFamiliar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAsigFamiliar.setFont(new Font("Dialog", Font.BOLD, 9));
		lblAsigFamiliar.setBounds(491, 268, 50, 22);
		add(lblAsigFamiliar);
		
		lblNombre = new JLabel("88.025.025");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNombre.setBounds(118, 125, 286, 22);
		add(lblNombre);
		
		lblRut = new JLabel("Horas Extras:");
		lblRut.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRut.setFont(new Font("Dialog", Font.BOLD, 9));
		lblRut.setBounds(448, 126, 93, 22);
		add(lblRut);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Descuentos");
		lblNewLabel_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2_2_1_1.setBounds(0, 317, 584, 22);
		add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_4_3 = new JLabel("AFP:");
		lblNewLabel_2_4_3.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_3.setBounds(53, 350, 60, 22);
		add(lblNewLabel_2_4_3);
		
		lblAFP = new JLabel("88.025.025");
		lblAFP.setFont(new Font("Dialog", Font.BOLD, 9));
		lblAFP.setBounds(123, 350, 50, 22);
		add(lblAFP);
		
		JLabel lblNewLabel_2_1_3_3 = new JLabel("Salud:");
		lblNewLabel_2_1_3_3.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_3.setBounds(178, 350, 60, 22);
		add(lblNewLabel_2_1_3_3);
		
		lblSalud = new JLabel("Horas Extras:");
		lblSalud.setFont(new Font("Dialog", Font.BOLD, 9));
		lblSalud.setBounds(241, 350, 50, 22);
		add(lblSalud);
		
		JLabel lblNewLabel_2_4_2_2 = new JLabel("Dif. Isapre:");
		lblNewLabel_2_4_2_2.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_2_2.setBounds(300, 350, 60, 22);
		add(lblNewLabel_2_4_2_2);
		
		lblDifIsapre = new JLabel("88.025.025");
		lblDifIsapre.setFont(new Font("Dialog", Font.BOLD, 9));
		lblDifIsapre.setBounds(360, 350, 50, 22);
		add(lblDifIsapre);
		
		JLabel lblNewLabel_2_1_3_2_2 = new JLabel("Seg. Cesantia:");
		lblNewLabel_2_1_3_2_2.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_2_2.setBounds(414, 350, 72, 22);
		add(lblNewLabel_2_1_3_2_2);
		
		lblSegCesantia = new JLabel("Horas Extras:");
		lblSegCesantia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSegCesantia.setFont(new Font("Dialog", Font.BOLD, 9));
		lblSegCesantia.setBounds(491, 350, 50, 22);
		add(lblSegCesantia);
		
		JLabel lblNewLabel_2_4_4 = new JLabel("Imp. Determin.");
		lblNewLabel_2_4_4.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_4.setBounds(53, 373, 63, 22);
		add(lblNewLabel_2_4_4);
		
		lblImpDeterminado = new JLabel("88.025.025");
		lblImpDeterminado.setFont(new Font("Dialog", Font.BOLD, 9));
		lblImpDeterminado.setBounds(123, 373, 50, 22);
		add(lblImpDeterminado);
		
		JLabel lblNewLabel_2_1_3_4 = new JLabel("Imp. a Pagar:");
		lblNewLabel_2_1_3_4.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_4.setBounds(178, 373, 60, 22);
		add(lblNewLabel_2_1_3_4);
		
		lblImpPagar = new JLabel("Horas Extras:");
		lblImpPagar.setFont(new Font("Dialog", Font.BOLD, 9));
		lblImpPagar.setBounds(241, 373, 50, 22);
		add(lblImpPagar);
		
		JLabel lblNewLabel_2_4_2_3 = new JLabel("Anticipo:");
		lblNewLabel_2_4_2_3.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_2_3.setBounds(300, 373, 60, 22);
		add(lblNewLabel_2_4_2_3);
		
		lblAnticipo = new JLabel("88.025.025");
		lblAnticipo.setFont(new Font("Dialog", Font.BOLD, 9));
		lblAnticipo.setBounds(360, 373, 50, 22);
		add(lblAnticipo);
		
		JLabel lblNewLabel_2_1_3_2_3 = new JLabel("Otros Descuentos:");
		lblNewLabel_2_1_3_2_3.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_2_3.setBounds(414, 373, 72, 22);
		add(lblNewLabel_2_1_3_2_3);
		
		lblOtrosDescuentos = new JLabel("Horas Extras:");
		lblOtrosDescuentos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOtrosDescuentos.setFont(new Font("Dialog", Font.BOLD, 9));
		lblOtrosDescuentos.setBounds(491, 373, 50, 22);
		add(lblOtrosDescuentos);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Imposiciones Empleador (Aporte Patronal)");
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_2_2_2.setBounds(0, 422, 584, 22);
		add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_4_5 = new JLabel("Imponible:");
		lblNewLabel_2_4_5.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_5.setBounds(53, 460, 60, 22);
		add(lblNewLabel_2_4_5);
		
		lblImponible = new JLabel("88.025.025");
		lblImponible.setFont(new Font("Dialog", Font.BOLD, 9));
		lblImponible.setBounds(108, 460, 60, 22);
		add(lblImponible);
		
		JLabel lblNewLabel_2_1_3_5 = new JLabel("ACC 0,9%+TR:");
		lblNewLabel_2_1_3_5.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_5.setBounds(172, 460, 66, 22);
		add(lblNewLabel_2_1_3_5);
		
		lblACC = new JLabel("Horas Extras:");
		lblACC.setFont(new Font("Dialog", Font.BOLD, 9));
		lblACC.setBounds(241, 460, 50, 22);
		add(lblACC);
		
		JLabel lblNewLabel_2_4_2_4 = new JLabel("Sis 2,2%:");
		lblNewLabel_2_4_2_4.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_2_4.setBounds(300, 460, 60, 22);
		add(lblNewLabel_2_4_2_4);
		
		lblSIS = new JLabel("88.025.025");
		lblSIS.setFont(new Font("Dialog", Font.BOLD, 9));
		lblSIS.setBounds(360, 460, 50, 22);
		add(lblSIS);
		
		JLabel lblNewLabel_2_1_3_2_4 = new JLabel("Cesantia:");
		lblNewLabel_2_1_3_2_4.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_2_4.setBounds(420, 460, 66, 22);
		add(lblNewLabel_2_1_3_2_4);
		
		lblCesEmpleador = new JLabel("Horas Extras:");
		lblCesEmpleador.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCesEmpleador.setFont(new Font("Dialog", Font.BOLD, 9));
		lblCesEmpleador.setBounds(491, 460, 50, 22);
		add(lblCesEmpleador);

	}
	
	public void CargarForm(LibroRemuneraciones ape) {
		
		lblNombre.setText(ape.getNombre());
		lblRut.setText(ape.getRut());
		lblSueldoBase.setText(Helpers.ponerPuntos(""+ape.getSueldoBase()));
		lblHorasExtras.setText(Helpers.ponerPuntos(""+ape.getHorasExtras()));
		lblGratificacion.setText(Helpers.ponerPuntos(""+ape.getGratificacion()));
		lblOtrosIngresos.setText(Helpers.ponerPuntos(""+ape.getOtrosIngresos()));
		lblMovilizacion.setText(Helpers.ponerPuntos(""+ape.getMovilizacion()));
		lblColacion.setText(Helpers.ponerPuntos(""+ape.getColacion()));
		lblGastosRep.setText(Helpers.ponerPuntos(""+ape.getGastoRep()));
		lblAsigFamiliar.setText(Helpers.ponerPuntos(""+ape.getAsigFamiliar()));
		lblAFP.setText(Helpers.ponerPuntos(""+ape.getAfp()));
		lblSalud.setText(Helpers.ponerPuntos(""+ape.getSalud()));
		lblDifIsapre.setText(Helpers.ponerPuntos(""+ape.getDifIsapre()));
		lblSegCesantia.setText(Helpers.ponerPuntos(""+ape.getSeguroCes()));
		lblImpDeterminado.setText(Helpers.ponerPuntos(""+ape.getImpDeter()));
		lblImpPagar.setText(Helpers.ponerPuntos(""+ape.getImgAPag()));
		lblAnticipo.setText(Helpers.ponerPuntos(""+ape.getAnticipo()));
		lblOtrosDescuentos.setText(Helpers.ponerPuntos(""+ape.getOtroDesc()));
		lblImponible.setText(Helpers.ponerPuntos(""+ape.getImponble()));
		lblACC.setText(Helpers.ponerPuntos(""+ape.getAcc()));
		lblSIS.setText(Helpers.ponerPuntos(""+ape.getSis()));
		lblCesEmpleador.setText(Helpers.ponerPuntos(""+ape.getCesantia()));
		
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

	public JLabel getLblSueldoBase() {
		return lblSueldoBase;
	}

	public JLabel getLblHorasExtras() {
		return lblHorasExtras;
	}

	public JLabel getLblGratificacion() {
		return lblGratificacion;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public JLabel getLblRut() {
		return lblRut;
	}

	public JLabel getLblOtrosIngresos() {
		return lblOtrosIngresos;
	}

	public JLabel getLblMovilizacion() {
		return lblMovilizacion;
	}

	public JLabel getLblColacion() {
		return lblColacion;
	}

	public JLabel getLblGastosRep() {
		return lblGastosRep;
	}

	public JLabel getLblAsigFamiliar() {
		return lblAsigFamiliar;
	}

	public JLabel getLblAFP() {
		return lblAFP;
	}

	public JLabel getLblSalud() {
		return lblSalud;
	}

	public JLabel getLblSegCesantia() {
		return lblSegCesantia;
	}

	public JLabel getLblDifIsapre() {
		return lblDifIsapre;
	}

	public JLabel getLblOtrosDescuentos() {
		return lblOtrosDescuentos;
	}

	public JLabel getLblAnticipo() {
		return lblAnticipo;
	}

	public JLabel getLblImpPagar() {
		return lblImpPagar;
	}

	public JLabel getLblImpDeterminado() {
		return lblImpDeterminado;
	}

	public void setLblSueldoBase(JLabel lblSueldoBase) {
		this.lblSueldoBase = lblSueldoBase;
	}

	public void setLblHorasExtras(JLabel lblHorasExtras) {
		this.lblHorasExtras = lblHorasExtras;
	}

	public void setLblGratificacion(JLabel lblGratificacion) {
		this.lblGratificacion = lblGratificacion;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	public void setLblRut(JLabel lblRut) {
		this.lblRut = lblRut;
	}

	public void setLblOtrosIngresos(JLabel lblOtrosIngresos) {
		this.lblOtrosIngresos = lblOtrosIngresos;
	}

	public void setLblMovilizacion(JLabel lblMovilizacion) {
		this.lblMovilizacion = lblMovilizacion;
	}

	public void setLblColacion(JLabel lblColacion) {
		this.lblColacion = lblColacion;
	}

	public void setLblGastosRep(JLabel lblGastosRep) {
		this.lblGastosRep = lblGastosRep;
	}

	public void setLblAsigFamiliar(JLabel lblAsigFamiliar) {
		this.lblAsigFamiliar = lblAsigFamiliar;
	}

	public void setLblAFP(JLabel lblAFP) {
		this.lblAFP = lblAFP;
	}

	public void setLblSalud(JLabel lblSalud) {
		this.lblSalud = lblSalud;
	}

	public void setLblSegCesantia(JLabel lblSegCesantia) {
		this.lblSegCesantia = lblSegCesantia;
	}

	public void setLblDifIsapre(JLabel lblDifIsapre) {
		this.lblDifIsapre = lblDifIsapre;
	}

	public void setLblOtrosDescuentos(JLabel lblOtrosDescuentos) {
		this.lblOtrosDescuentos = lblOtrosDescuentos;
	}

	public void setLblAnticipo(JLabel lblAnticipo) {
		this.lblAnticipo = lblAnticipo;
	}

	public void setLblImpPagar(JLabel lblImpPagar) {
		this.lblImpPagar = lblImpPagar;
	}

	public void setLblImpDeterminado(JLabel lblImpDeterminado) {
		this.lblImpDeterminado = lblImpDeterminado;
	}

	public JLabel getLblCesEmpleador() {
		return lblCesEmpleador;
	}

	public JLabel getLblSIS() {
		return lblSIS;
	}

	public JLabel getLblACC() {
		return lblACC;
	}

	public JLabel getLblImponible() {
		return lblImponible;
	}

	public void setLblCesEmpleador(JLabel lblCesEmpleador) {
		this.lblCesEmpleador = lblCesEmpleador;
	}

	public void setLblSIS(JLabel lblSIS) {
		this.lblSIS = lblSIS;
	}

	public void setLblACC(JLabel lblACC) {
		this.lblACC = lblACC;
	}

	public void setLblImponible(JLabel lblImponible) {
		this.lblImponible = lblImponible;
	}
}
