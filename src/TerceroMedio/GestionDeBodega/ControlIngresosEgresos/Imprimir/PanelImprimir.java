package TerceroMedio.GestionDeBodega.ControlIngresosEgresos.Imprimir;

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
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;
import ui.TablaUi.TableStandard;

public class PanelImprimir extends JPanel implements Printable{
	
	private TableStandard tableIngresos;
	private TableStandard tableEgresos;
	private JLabel lblTotalEgresos;
	private JLabel lblTotalIngresos;

	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblAnio = new JLabel("Ingresos");
		lblAnio.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnio.setFont(new Font("Dialog", Font.BOLD, 11));
		lblAnio.setBounds(215, 105, 161, 22);
		add(lblAnio);
		
		JLabel lblTitulo = new JLabel("Ingresos y Egresos");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTitulo.setBounds(0, 69, 584, 33);
		add(lblTitulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 138, 526, 226);
		add(scrollPane);
		
		tableIngresos = new TableStandard();
		tableIngresos.setFont(new Font("Dialog", Font.PLAIN, 9));
		String[] columns = new String[] {"Id", "Descripcion", "Fecha", "Monto"};
		tableIngresos.setColums(columns);
		tableIngresos.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 9));
		scrollPane.setViewportView(tableIngresos);
		
		JLabel lblEgresos = new JLabel("Egresos");
		lblEgresos.setHorizontalAlignment(SwingConstants.CENTER);
		lblEgresos.setFont(new Font("Dialog", Font.BOLD, 11));
		lblEgresos.setBounds(215, 384, 161, 22);
		add(lblEgresos);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(32, 414, 526, 226);
		add(scrollPane_1);
		
		tableEgresos = new TableStandard();
		tableEgresos.setFont(new Font("Dialog", Font.PLAIN, 9));
		tableEgresos.setColums(new String[] {"Id", "Descripcion", "Fecha", "Monto"});
		tableEgresos.setBounds(0, 0, 524, 1);
		tableEgresos.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 9));
		scrollPane_1.setViewportView(tableEgresos);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 10));
		lblTotal.setBounds(369, 366, 70, 22);
		add(lblTotal);
		
		JLabel lblTotal_1 = new JLabel("TOTAL");
		lblTotal_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblTotal_1.setBounds(369, 641, 70, 22);
		add(lblTotal_1);
		
		lblTotalIngresos = new JLabel("TOTAL");
		lblTotalIngresos.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalIngresos.setFont(new Font("Dialog", Font.BOLD, 10));
		lblTotalIngresos.setBounds(477, 366, 81, 22);
		add(lblTotalIngresos);
		
		lblTotalEgresos = new JLabel("TOTAL");
		lblTotalEgresos.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalEgresos.setFont(new Font("Dialog", Font.BOLD, 10));
		lblTotalEgresos.setBounds(477, 641, 81, 22);
		add(lblTotalEgresos);
		
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
	
	public DefaultTableModel getModelIngresos() {
		return tableIngresos.getModel();
	}
	
	public DefaultTableModel getModelEgresos() {
		return tableEgresos.getModel();
	}

	public TableStandard getTable() {
		return tableIngresos;
	}


	public void setTable(TableStandard table) {
		this.tableIngresos = table;
	}

	public JLabel getLblTotalEgresos() {
		return lblTotalEgresos;
	}

	public JLabel getLblTotalIngresos() {
		return lblTotalIngresos;
	}

	public void setLblTotalEgresos(JLabel lblTotalEgresos) {
		this.lblTotalEgresos = lblTotalEgresos;
	}

	public void setLblTotalIngresos(JLabel lblTotalIngresos) {
		this.lblTotalIngresos = lblTotalIngresos;
	}
}
