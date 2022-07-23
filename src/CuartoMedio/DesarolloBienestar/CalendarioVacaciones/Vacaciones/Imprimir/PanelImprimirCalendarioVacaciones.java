package CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones.Imprimir;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones.CalendarioVacacionesEntity;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
import core.Helpers;

public class PanelImprimirCalendarioVacaciones extends JPanel implements Printable{

	private JLabel lblNombre;
	private JLabel lblFechaDesde;
	private JLabel lblFechaHasta;
	private JLabel lblDiasPorAno;
	private JLabel lblDiasAcumAnosPrev;
	private JLabel lblDiasAcumFechaDef;
	private JLabel lblDiasPendientes;

	/**
	 * Create the panel.
	 */
	public PanelImprimirCalendarioVacaciones() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 0, 584, 750);
		setLayout(null);
		JLabel lblNewLabel_2 = new JLabel("El Sr. (a) ");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2.setBounds(92, 146, 50, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Vacaciones");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 70, 584, 33);
		add(lblNewLabel_3);
		
		lblNombre = new JLabel("");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNombre.setBounds(160, 146, 203, 22);
		add(lblNombre);
		
		JLabel lblNewLabel_2_1 = new JLabel("en el rango de fecha desde");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1.setBounds(373, 146, 146, 22);
		add(lblNewLabel_2_1);
		
		lblFechaDesde = new JLabel("");
		lblFechaDesde.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaDesde.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFechaDesde.setBounds(57, 171, 72, 22);
		add(lblFechaDesde);
		
		JLabel lblNewLabel_2_2 = new JLabel("Hasta");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_2.setBounds(130, 171, 50, 22);
		add(lblNewLabel_2_2);
		
		lblFechaHasta = new JLabel("");
		lblFechaHasta.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaHasta.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFechaHasta.setBounds(180, 171, 72, 22);
		add(lblFechaHasta);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Tiene una relacion de Dias distribuidas de la siguiente");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_1.setBounds(243, 171, 276, 22);
		add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("manera:");
		lblNewLabel_2_3.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_3.setBounds(57, 196, 50, 22);
		add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Dias por A\u00F1o:");
		lblNewLabel_2_3_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_3_1.setBounds(57, 271, 72, 22);
		add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Dias Acumulados en A\u00F1os Previos:");
		lblNewLabel_2_3_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_3_2.setBounds(57, 304, 185, 22);
		add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("Dias Tomados entre la Fecha Definida:");
		lblNewLabel_2_3_2_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_3_2_1.setBounds(57, 337, 212, 22);
		add(lblNewLabel_2_3_2_1);
		
		JLabel lblNewLabel_2_3_2_1_1 = new JLabel("Dias Pendientes:");
		lblNewLabel_2_3_2_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_3_2_1_1.setBounds(57, 372, 212, 22);
		add(lblNewLabel_2_3_2_1_1);
		
		lblDiasPorAno = new JLabel("");
		lblDiasPorAno.setFont(new Font("Dialog", Font.BOLD, 10));
		lblDiasPorAno.setBounds(298, 271, 110, 22);
		add(lblDiasPorAno);
		
		lblDiasAcumAnosPrev = new JLabel("");
		lblDiasAcumAnosPrev.setFont(new Font("Dialog", Font.BOLD, 10));
		lblDiasAcumAnosPrev.setBounds(298, 304, 110, 22);
		add(lblDiasAcumAnosPrev);
		
		lblDiasAcumFechaDef = new JLabel("");
		lblDiasAcumFechaDef.setFont(new Font("Dialog", Font.BOLD, 10));
		lblDiasAcumFechaDef.setBounds(298, 337, 110, 22);
		add(lblDiasAcumFechaDef);
		
		lblDiasPendientes = new JLabel("");
		lblDiasPendientes.setFont(new Font("Dialog", Font.BOLD, 10));
		lblDiasPendientes.setBounds(298, 372, 110, 22);
		add(lblDiasPendientes);

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
	
	public void CargarForm(CalendarioVacacionesEntity ape) {
		
		lblNombre.setText(ape.getNombreEmpleado());
		
		
		
		
		
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public JLabel getLblFechaDesde() {
		return lblFechaDesde;
	}

	public JLabel getLblHasta() {
		return lblFechaHasta;
	}

	public JLabel getLblDiasPorAno() {
		return lblDiasPorAno;
	}

	public JLabel getLblDiasAcumAnosPrev() {
		return lblDiasAcumAnosPrev;
	}

	public JLabel getLblDiasAcumFechaDef() {
		return lblDiasAcumFechaDef;
	}

	public JLabel getLblDiasPendientes() {
		return lblDiasPendientes;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	public void setLblFechaDesde(JLabel lblFechaDesde) {
		this.lblFechaDesde = lblFechaDesde;
	}

	public void setLblHasta(JLabel lblHasta) {
		this.lblFechaHasta = lblHasta;
	}

	public void setLblDiasPorAno(JLabel lblDiasPorAno) {
		this.lblDiasPorAno = lblDiasPorAno;
	}

	public void setLblDiasAcumAnosPrev(JLabel lblDiasAcumAnosPrev) {
		this.lblDiasAcumAnosPrev = lblDiasAcumAnosPrev;
	}

	public void setLblDiasAcumFechaDef(JLabel lblDiasAcumFechaDef) {
		this.lblDiasAcumFechaDef = lblDiasAcumFechaDef;
	}

	public void setLblDiasPendientes(JLabel lblDiasPendientes) {
		this.lblDiasPendientes = lblDiasPendientes;
	}
}
