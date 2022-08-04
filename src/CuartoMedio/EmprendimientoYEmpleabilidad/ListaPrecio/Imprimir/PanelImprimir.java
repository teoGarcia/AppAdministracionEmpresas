package CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.Imprimir;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import ui.TablaUi.TableStandard;

public class PanelImprimir extends JPanel implements Printable{

	private JLabel lblSubTotal;
	private JLabel lblIVA;
	private JLabel lblTotal;
	private TableStandard table;
	
	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("SubTotal");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2.setBounds(400, 577, 59, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lista de Precios");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 80, 584, 33);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("TOTAL");
		lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1.setBounds(400, 630, 46, 22);
		add(lblNewLabel_2_4_1);
		
		lblTotal = new JLabel("800.000.000");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 9));
		lblTotal.setBounds(456, 630, 59, 22);
		add(lblTotal);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(57, 140, 474, 432);
		add(scrollPane);
		
		table = new TableStandard();
		table.setFont(new Font("Dialog", Font.PLAIN, 9));
		String[] columns = new String[] {"Cod. Producto", "Nombre", "Proveedor", "P. Unitario", "Cantidad", "Total"};
		table.setColums(columns);
		table.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 10));
		
		table.getColumnModel().getColumn(0).setPreferredWidth(75);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(75);
		table.getColumnModel().getColumn(3).setPreferredWidth(75);
		table.getColumnModel().getColumn(4).setPreferredWidth(30);
		table.getColumnModel().getColumn(5).setPreferredWidth(75);
		
		scrollPane.setViewportView(table);
		
		lblSubTotal = new JLabel("100.000.000");
		lblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSubTotal.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblSubTotal.setBounds(456, 578, 59, 22);
		add(lblSubTotal);
		
		lblIVA = new JLabel("100.000.000");
		lblIVA.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIVA.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblIVA.setBounds(456, 604, 59, 22);
		add(lblIVA);
		
		JLabel lblNewLabel_2_1 = new JLabel("I.V.A.");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1.setBounds(400, 603, 59, 22);
		add(lblNewLabel_2_1);
		
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
	
	public DefaultTableModel getModel() {
		return table.getModel();
	}

	public JLabel getLblSubTotal() {
		return lblSubTotal;
	}

	public JLabel getLblIVA() {
		return lblIVA;
	}

	public JLabel getLblTotal() {
		return lblTotal;
	}

	public TableStandard getTable() {
		return table;
	}

	public void setLblSubTotal(JLabel lblSubTotal) {
		this.lblSubTotal = lblSubTotal;
	}

	public void setLblIVA(JLabel lblIVA) {
		this.lblIVA = lblIVA;
	}

	public void setLblTotal(JLabel lblTotal) {
		this.lblTotal = lblTotal;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

}
