package TerceroMedio.GestionComercialTrib.Inventario.Imprimir;

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

import TerceroMedio.GestionComercialTrib.Inventario.InventarioEntity3;
import core.Helpers;

public class PanelImprimir extends JPanel implements Printable{
	
	private JLabel lblTipoProducto;
	private JLabel lblUM;
	private JLabel lblSActual;
	private JLabel lblInsumo;
	private JLabel lblValorUnitario;
	private JLabel lblValorTotal;

	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Insumo:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(52, 207, 86, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Inventario");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 119, 584, 33);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Stock Actual:");
		lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_1.setBounds(52, 301, 86, 22);
		add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Valor Unitario:");
		lblNewLabel_2_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1.setBounds(227, 301, 69, 22);
		add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("U. Medida:");
		lblNewLabel_2_1_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_1.setBounds(433, 207, 48, 22);
		add(lblNewLabel_2_1_3_1_1);
		
		JLabel lblNewLabel_2_1_3_1_1_1 = new JLabel("Tipo de Producto:");
		lblNewLabel_2_1_3_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_1_1.setBounds(52, 254, 86, 22);
		add(lblNewLabel_2_1_3_1_1_1);
		
		lblInsumo = new JLabel("Insumo");
		lblInsumo.setFont(new Font("Dialog", Font.BOLD, 9));
		lblInsumo.setBounds(161, 207, 262, 22);
		add(lblInsumo);
		
		lblSActual = new JLabel("S. Actual");
		lblSActual.setFont(new Font("Dialog", Font.BOLD, 9));
		lblSActual.setBounds(161, 301, 48, 22);
		add(lblSActual);
		
		lblTipoProducto = new JLabel("Nombre de proveedor:");
		lblTipoProducto.setFont(new Font("Dialog", Font.BOLD, 9));
		lblTipoProducto.setBounds(161, 254, 372, 22);
		add(lblTipoProducto);
		
		lblUM = new JLabel("UM");
		lblUM.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUM.setFont(new Font("Dialog", Font.BOLD, 9));
		lblUM.setBounds(480, 207, 43, 22);
		add(lblUM);
		
		lblValorUnitario = new JLabel("UM");
		lblValorUnitario.setHorizontalAlignment(SwingConstants.LEFT);
		lblValorUnitario.setFont(new Font("Dialog", Font.BOLD, 9));
		lblValorUnitario.setBounds(296, 301, 58, 22);
		add(lblValorUnitario);
		
		JLabel lblNewLabel_2_1_3_1_2 = new JLabel("Valor Total:");
		lblNewLabel_2_1_3_1_2.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_2.setBounds(364, 301, 59, 22);
		add(lblNewLabel_2_1_3_1_2);
		
		lblValorTotal = new JLabel("UM");
		lblValorTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblValorTotal.setFont(new Font("Dialog", Font.BOLD, 9));
		lblValorTotal.setBounds(421, 301, 77, 22);
		add(lblValorTotal);
		
		
		
	}
	
	public void CargarForm(InventarioEntity3 ape) {
		
		lblInsumo.setText(ape.getInsumo());
		lblSActual.setText(""+ape.getStockReal());
		lblValorUnitario.setText(Helpers.ponerPuntos(""+ape.getValorUnitario()));
		
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

	public JLabel getLblTipoProducto() {
		return lblTipoProducto;
	}

	public JLabel getLblUM() {
		return lblUM;
	}

	public JLabel getLblSActual() {
		return lblSActual;
	}

	public JLabel getLblInsumo() {
		return lblInsumo;
	}

	public void setLblTipoProducto(JLabel lblTipoProducto) {
		this.lblTipoProducto = lblTipoProducto;
	}

	public void setLblUM(JLabel lblUM) {
		this.lblUM = lblUM;
	}

	public void setLblSActual(JLabel lblSActual) {
		this.lblSActual = lblSActual;
	}

	public void setLblInsumo(JLabel lblInsumo) {
		this.lblInsumo = lblInsumo;
	}

	public JLabel getLblValorUnitario() {
		return lblValorUnitario;
	}

	public JLabel getLblValorTotal() {
		return lblValorTotal;
	}

	public void setLblValorUnitario(JLabel lblValorUnitario) {
		this.lblValorUnitario = lblValorUnitario;
	}

	public void setLblValorTotal(JLabel lblValorTotal) {
		this.lblValorTotal = lblValorTotal;
	}


}
