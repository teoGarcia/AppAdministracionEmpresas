package TerceroMedio.GestionComercialTrib.ConciliacionBancaria.Imprimir;

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
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import core.Helpers;
import ui.TablaUi.TableStandard;

public class PanelImprimirCheTer extends JPanel implements Printable{
	private JLabel lblTotal;
	private TableStandard table;
	private JLabel lbl_Total1;
	private JLabel lblFechaEmision;
	private JScrollPane scrollPane;
	private JLabel lblEstado;
	private JLabel lblTitulo;
	
	public PanelImprimirCheTer() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		lblTitulo = new JLabel("Cheques de Terceros");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTitulo.setBounds(70, 102, 450, 33);
		add(lblTitulo);
		
		lbl_Total1 = new JLabel("Total");
		lbl_Total1.setFont(new Font("Dialog", Font.BOLD, 9));
		lbl_Total1.setBounds(405, 614, 36, 22);
		add(lbl_Total1);
		
		lblTotal = new JLabel("");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 9));
		lblTotal.setBounds(451, 614, 69, 22);
		add(lblTotal);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 200, 450, 406);
		add(scrollPane);
		
		table = new TableStandard();
		table.setFont(new Font("Dialog", Font.PLAIN, 9));
		String[] columns = new String[] { "Num. Factura", "Fecha Dep", "Bco. Emision", "Num. Cheque", "Titular",
				"Depositado en","$ Monto"};
		table.setColums(columns);
		table.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 9));
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(2).setPreferredWidth(120);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(200);
		table.getColumnModel().getColumn(5).setPreferredWidth(120);
		table.getColumnModel().getColumn(6).setPreferredWidth(100);
		
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2_4_1_4_1_2 = new JLabel("$");
		lblNewLabel_2_4_1_4_1_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_1_2.setBounds(435, 614, 16, 22);
		add(lblNewLabel_2_4_1_4_1_2);
		
		lblFechaEmision = new JLabel("Reporte de cheques ");
		lblFechaEmision.setForeground(Color.BLACK);
		lblFechaEmision.setBackground(Color.WHITE);
		lblFechaEmision.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaEmision.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblFechaEmision.setBounds(70, 167, 95, 22);
		add(lblFechaEmision);
		
		lblEstado = new JLabel("Reporte de cheques");
		lblEstado.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstado.setForeground(Color.BLACK);
		lblEstado.setFont(new Font("Dialog", Font.BOLD, 9));
		lblEstado.setBackground(Color.WHITE);
		lblEstado.setBounds(175, 167, 109, 22);
		add(lblEstado);
		
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
	
	
	public void calcularTotalImprimir() {
		
		int total = 0;
		  
		for(int i=0; i<this.table.getRowCount(); i++) { 
			total += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 6))); 
		}
	
		lblTotal.setText(Helpers.ponerPuntos(""+total));
		 
	}
	
	
	public DefaultTableModel getModelTableImprimir() {
		return table.getModel();
	}

	public TableStandard getTable() {
		return table;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public JLabel getLbl_Total1() {
		return lbl_Total1;
	}

	public void setLbl_Total1(JLabel lbl_Total1) {
		this.lbl_Total1 = lbl_Total1;
	}

	public JLabel getLblTotal() {
		return lblTotal;
	}

	public void setLblTotal(JLabel lblTotal) {
		this.lblTotal = lblTotal;
	}
	public JLabel getLblFechaEmision() {
		return lblFechaEmision;
	}

	public void setLblFechaEmision(JLabel lblFechaEmision) {
		this.lblFechaEmision = lblFechaEmision;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JLabel getLblEstado() {
		return lblEstado;
	}

	public void setLblEstado(JLabel lblEstado) {
		this.lblEstado = lblEstado;
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}

	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTitulo = lblTitulo;
	}
}
