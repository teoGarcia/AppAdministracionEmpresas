package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto.Imprimir;

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

import CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto.Calendario;
import CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto.Proyecto;
import CuartoMedio.EmprendimientoYEmpleabilidad.RegistroProveedor.Proveedores;
import core.Helpers;

public class PanelImprimir extends JPanel implements Printable{
	private JLabel lblFechaInicio;
	private JLabel lblFechaFin;
	private JLabel lblDiasPlaneados;
	private JLabel lblNombreProyecto;

	public PanelImprimir() {
		
setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre del proyecto:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2.setBounds(53, 181, 122, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Calendario de Proyecto");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 101, 584, 33);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Dias Planeados:");
		lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_1.setBounds(53, 221, 122, 22);
		add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Fecha Inicio:");
		lblNewLabel_2_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1.setBounds(53, 263, 122, 22);
		add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("Fecha Fin:");
		lblNewLabel_2_1_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_1.setBounds(370, 263, 54, 22);
		add(lblNewLabel_2_1_3_1_1);
		
		lblNombreProyecto = new JLabel("Nombre de proveedor:");
		lblNombreProyecto.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNombreProyecto.setBounds(185, 181, 349, 22);
		add(lblNombreProyecto);
		
		lblDiasPlaneados = new JLabel("Nombre de proveedor:");
		lblDiasPlaneados.setFont(new Font("Dialog", Font.BOLD, 10));
		lblDiasPlaneados.setBounds(185, 221, 349, 22);
		add(lblDiasPlaneados);
		
		lblFechaInicio = new JLabel("Nombre de proveedor:");
		lblFechaInicio.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFechaInicio.setBounds(185, 263, 175, 22);
		add(lblFechaInicio);
		
		lblFechaFin = new JLabel("Nombre de proveedor:");
		lblFechaFin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaFin.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFechaFin.setBounds(417, 262, 110, 22);
		add(lblFechaFin);
		
		
		
	}
	
	public void CargarForm(Proyecto ape) {
		
		lblNombreProyecto.setText(ape.getNombre());
		lblDiasPlaneados.setText(ape.getDias());
		lblFechaInicio.setText(Helpers.getFechaFormat(ape.getInicio()));
		lblFechaFin.setText(Helpers.getFechaFormat(ape.getFin()));
		
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

	public JLabel getLblFechaInicio() {
		return lblFechaInicio;
	}

	public JLabel getLblFechaFin() {
		return lblFechaFin;
	}

	public JLabel getLblDiasPlaneados() {
		return lblDiasPlaneados;
	}

	public JLabel getLblNombreProyecto() {
		return lblNombreProyecto;
	}

	public void setLblFechaInicio(JLabel lblFechaInicio) {
		this.lblFechaInicio = lblFechaInicio;
	}

	public void setLblFechaFin(JLabel lblFechaFin) {
		this.lblFechaFin = lblFechaFin;
	}

	public void setLblDiasPlaneados(JLabel lblDiasPlaneados) {
		this.lblDiasPlaneados = lblDiasPlaneados;
	}

	public void setLblNombreProyecto(JLabel lblNombreProyecto) {
		this.lblNombreProyecto = lblNombreProyecto;
	}

}
