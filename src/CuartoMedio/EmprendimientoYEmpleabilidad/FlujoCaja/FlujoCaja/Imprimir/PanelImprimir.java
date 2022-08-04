package CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja.Imprimir;

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
	private JLabel lblTotal;
	private TableStandard table;
	
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Flujo de Caja");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 93, 584, 33);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("TOTAL");
		lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1.setBounds(395, 572, 46, 22);
		add(lblNewLabel_2_4_1);
		
		lblTotal = new JLabel("800.000.000");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 9));
		lblTotal.setBounds(451, 572, 59, 22);
		add(lblTotal);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 147, 450, 416);
		add(scrollPane);
		
		table = new TableStandard();
		table.setFont(new Font("Dialog", Font.PLAIN, 9));
		String[] columns = new String[] {"Codigo", "Concepto", "Fecha", "Entrada", "Salida"};
		table.setColums(columns);
		table.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 10));
		
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(90);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		
		scrollPane.setViewportView(table);
		
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

	public JLabel getLblTotal() {
		return lblTotal;
	}

	public TableStandard getTable() {
		return table;
	}

	public void setLblTotal(JLabel lblTotal) {
		this.lblTotal = lblTotal;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

}
