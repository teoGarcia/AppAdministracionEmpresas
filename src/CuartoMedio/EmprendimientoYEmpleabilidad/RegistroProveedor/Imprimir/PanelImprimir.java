package CuartoMedio.EmprendimientoYEmpleabilidad.RegistroProveedor.Imprimir;

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

import CuartoMedio.EmprendimientoYEmpleabilidad.RegistroProveedor.Proveedores;
import core.Helpers;

public class PanelImprimir extends JPanel implements Printable{
	private JLabel lblAreaContacto;
	private JLabel lblCorreo;
	private JLabel lblRubro;
	private JLabel lblDireccion;
	private JLabel lblNombreProveedor;
	
	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de proveedor:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2.setBounds(53, 181, 122, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Registro de Proveedor");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 101, 584, 33);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Direccion:");
		lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_1.setBounds(53, 221, 122, 22);
		add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Correo:");
		lblNewLabel_2_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1.setBounds(53, 263, 122, 22);
		add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("Rubro:");
		lblNewLabel_2_1_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_1.setBounds(370, 263, 54, 22);
		add(lblNewLabel_2_1_3_1_1);
		
		JLabel lblNewLabel_2_1_3_1_1_1 = new JLabel("Area de Contacto:");
		lblNewLabel_2_1_3_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_1_1.setBounds(53, 306, 122, 22);
		add(lblNewLabel_2_1_3_1_1_1);
		
		lblNombreProveedor = new JLabel("Nombre de proveedor:");
		lblNombreProveedor.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNombreProveedor.setBounds(185, 181, 349, 22);
		add(lblNombreProveedor);
		
		lblDireccion = new JLabel("Nombre de proveedor:");
		lblDireccion.setFont(new Font("Dialog", Font.BOLD, 10));
		lblDireccion.setBounds(185, 221, 349, 22);
		add(lblDireccion);
		
		lblCorreo = new JLabel("Nombre de proveedor:");
		lblCorreo.setFont(new Font("Dialog", Font.BOLD, 10));
		lblCorreo.setBounds(185, 263, 175, 22);
		add(lblCorreo);
		
		lblAreaContacto = new JLabel("Nombre de proveedor:");
		lblAreaContacto.setFont(new Font("Dialog", Font.BOLD, 10));
		lblAreaContacto.setBounds(185, 306, 349, 22);
		add(lblAreaContacto);
		
		lblRubro = new JLabel("Nombre de proveedor:");
		lblRubro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRubro.setFont(new Font("Dialog", Font.BOLD, 10));
		lblRubro.setBounds(406, 263, 128, 22);
		add(lblRubro);
		
		
		
	}
	
	public void CargarForm(Proveedores ape) {
		
		lblNombreProveedor.setText(ape.getNombre());
		lblDireccion.setText(ape.getDireccion());
		lblCorreo.setText(ape.getCorreo());
		lblRubro.setText(ape.getRubro());
		lblAreaContacto.setText(ape.getAreaDeContecto());
		
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

	public JLabel getLblAreaContacto() {
		return lblAreaContacto;
	}

	public JLabel getLblCorreo() {
		return lblCorreo;
	}

	public JLabel getLblRubro() {
		return lblRubro;
	}

	public JLabel getLblDireccion() {
		return lblDireccion;
	}

	public JLabel getLblNombreProveedor() {
		return lblNombreProveedor;
	}

	public void setLblAreaContacto(JLabel lblAreaContacto) {
		this.lblAreaContacto = lblAreaContacto;
	}

	public void setLblCorreo(JLabel lblCorreo) {
		this.lblCorreo = lblCorreo;
	}

	public void setLblRubro(JLabel lblRubro) {
		this.lblRubro = lblRubro;
	}

	public void setLblDireccion(JLabel lblDireccion) {
		this.lblDireccion = lblDireccion;
	}

	public void setLblNombreProveedor(JLabel lblNombreProveedor) {
		this.lblNombreProveedor = lblNombreProveedor;
	}
}
