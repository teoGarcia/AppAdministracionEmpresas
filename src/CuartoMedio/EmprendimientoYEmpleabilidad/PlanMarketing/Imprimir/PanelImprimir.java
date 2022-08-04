package CuartoMedio.EmprendimientoYEmpleabilidad.PlanMarketing.Imprimir;

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

import CuartoMedio.EmprendimientoYEmpleabilidad.PlanMarketing.PlanMarketing;
import core.Helpers;

public class PanelImprimir extends JPanel implements Printable{
	
	private JLabel lblProducto;
	private JLabel lblGrupoObjetivo;
	private JLabel lblPrecio;
	private JLabel lblObjetivoProyecto;
	private JLabel lblNombreProyecto;
	private JLabel lblPlaza;
	private JLabel lblPromocion;
	private JLabel lblPersona;
	private JLabel lblPostVenta;


	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre del proyecto:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2.setBounds(53, 181, 122, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Registro de Proveedor");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 101, 584, 33);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Objetivo del Proyecto:");
		lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_1.setBounds(53, 221, 122, 22);
		add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Grupo Objetivo:");
		lblNewLabel_2_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1.setBounds(53, 263, 122, 22);
		add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("Precio:");
		lblNewLabel_2_1_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_1.setBounds(332, 306, 54, 22);
		add(lblNewLabel_2_1_3_1_1);
		
		JLabel lblNewLabel_2_1_3_1_1_1 = new JLabel("Producto:");
		lblNewLabel_2_1_3_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_1_1.setBounds(53, 306, 122, 22);
		add(lblNewLabel_2_1_3_1_1_1);
		
		lblNombreProyecto = new JLabel("Nombre de proveedor:");
		lblNombreProyecto.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNombreProyecto.setBounds(168, 181, 366, 22);
		add(lblNombreProyecto);
		
		lblObjetivoProyecto = new JLabel("Nombre de proveedor:");
		lblObjetivoProyecto.setFont(new Font("Dialog", Font.BOLD, 10));
		lblObjetivoProyecto.setBounds(168, 221, 366, 22);
		add(lblObjetivoProyecto);
		
		lblGrupoObjetivo = new JLabel("Nombre de proveedor:");
		lblGrupoObjetivo.setFont(new Font("Dialog", Font.BOLD, 10));
		lblGrupoObjetivo.setBounds(168, 263, 366, 22);
		add(lblGrupoObjetivo);
		
		lblProducto = new JLabel("Nombre de proveedor:");
		lblProducto.setFont(new Font("Dialog", Font.BOLD, 10));
		lblProducto.setBounds(168, 306, 154, 22);
		add(lblProducto);
		
		lblPrecio = new JLabel("Nombre de proveedor:");
		lblPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecio.setFont(new Font("Dialog", Font.BOLD, 10));
		lblPrecio.setBounds(383, 306, 151, 22);
		add(lblPrecio);
		
		JLabel lblNewLabel_2_1_3_1_1_1_1 = new JLabel("Plaza:");
		lblNewLabel_2_1_3_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_1_1_1.setBounds(53, 352, 122, 22);
		add(lblNewLabel_2_1_3_1_1_1_1);
		
		lblPlaza = new JLabel("Nombre de proveedor:");
		lblPlaza.setFont(new Font("Dialog", Font.BOLD, 10));
		lblPlaza.setBounds(168, 352, 154, 22);
		add(lblPlaza);
		
		JLabel lblNewLabel_2_1_3_1_1_2 = new JLabel("Promocion:");
		lblNewLabel_2_1_3_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_1_2.setBounds(332, 352, 54, 22);
		add(lblNewLabel_2_1_3_1_1_2);
		
		lblPromocion = new JLabel("Nombre de proveedor:");
		lblPromocion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPromocion.setFont(new Font("Dialog", Font.BOLD, 10));
		lblPromocion.setBounds(383, 352, 151, 22);
		add(lblPromocion);
		
		JLabel lblNewLabel_2_1_3_1_1_1_2 = new JLabel("Persona:");
		lblNewLabel_2_1_3_1_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_1_1_2.setBounds(53, 399, 122, 22);
		add(lblNewLabel_2_1_3_1_1_1_2);
		
		lblPersona = new JLabel("Nombre de proveedor:");
		lblPersona.setFont(new Font("Dialog", Font.BOLD, 10));
		lblPersona.setBounds(168, 399, 154, 22);
		add(lblPersona);
		
		JLabel lblNewLabel_2_1_3_1_1_3 = new JLabel("Post-Venta:");
		lblNewLabel_2_1_3_1_1_3.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_1_3.setBounds(332, 399, 54, 22);
		add(lblNewLabel_2_1_3_1_1_3);
		
		lblPostVenta = new JLabel("Nombre de proveedor:");
		lblPostVenta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPostVenta.setFont(new Font("Dialog", Font.BOLD, 10));
		lblPostVenta.setBounds(383, 399, 151, 22);
		add(lblPostVenta);
		
		
		
	}
	
	public void CargarForm(PlanMarketing ape) {
		
		lblNombreProyecto.setText(ape.getProyecto());
		lblObjetivoProyecto.setText(ape.getObjetivo());
		lblGrupoObjetivo.setText(ape.getGrupo());
		lblPrecio.setText(Helpers.ponerPuntos(""+ape.getPrecio()));
		lblProducto.setText(ape.getProducto());
		lblPlaza.setText(ape.getPlaza());
		lblPromocion.setText(ape.getPromocion());
		lblPersona.setText(ape.getPersona());
		lblPostVenta.setText(ape.getPostVenta());
		
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

	public JLabel getLblProducto() {
		return lblProducto;
	}

	public JLabel getLblGrupoObjetivo() {
		return lblGrupoObjetivo;
	}

	public JLabel getLblPrecio() {
		return lblPrecio;
	}

	public JLabel getLblObjetivoProyecto() {
		return lblObjetivoProyecto;
	}

	public JLabel getLblNombreProyecto() {
		return lblNombreProyecto;
	}

	public JLabel getLblPlaza() {
		return lblPlaza;
	}

	public JLabel getLblPromocion() {
		return lblPromocion;
	}

	public JLabel getLblPersona() {
		return lblPersona;
	}

	public JLabel getLblPostVenta() {
		return lblPostVenta;
	}

	public void setLblProducto(JLabel lblProducto) {
		this.lblProducto = lblProducto;
	}

	public void setLblGrupoObjetivo(JLabel lblGrupoObjetivo) {
		this.lblGrupoObjetivo = lblGrupoObjetivo;
	}

	public void setLblPrecio(JLabel lblPrecio) {
		this.lblPrecio = lblPrecio;
	}

	public void setLblObjetivoProyecto(JLabel lblObjetivoProyecto) {
		this.lblObjetivoProyecto = lblObjetivoProyecto;
	}

	public void setLblNombreProyecto(JLabel lblNombreProyecto) {
		this.lblNombreProyecto = lblNombreProyecto;
	}

	public void setLblPlaza(JLabel lblPlaza) {
		this.lblPlaza = lblPlaza;
	}

	public void setLblPromocion(JLabel lblPromocion) {
		this.lblPromocion = lblPromocion;
	}

	public void setLblPersona(JLabel lblPersona) {
		this.lblPersona = lblPersona;
	}

	public void setLblPostVenta(JLabel lblPostVenta) {
		this.lblPostVenta = lblPostVenta;
	}

}
