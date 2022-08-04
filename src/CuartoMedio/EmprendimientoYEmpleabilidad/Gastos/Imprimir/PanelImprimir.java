package CuartoMedio.EmprendimientoYEmpleabilidad.Gastos.Imprimir;

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
	
	private JLabel lblTotalReal;
	private JLabel lblTotalDiferencia;
	private TableStandard table;
	private JLabel lblTotalPresup;

	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		lblTotalPresup = new JLabel("100.000.000");
		lblTotalPresup.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblTotalPresup.setBounds(297, 549, 59, 22);
		add(lblTotalPresup);
		
		JLabel lblNewLabel_3 = new JLabel("Gastos de la Empresa");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 80, 584, 33);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("TOTAL");
		lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1.setBounds(248, 549, 35, 22);
		add(lblNewLabel_2_4_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 162, 450, 365);
		add(scrollPane);
		
		table = new TableStandard();
		table.setFont(new Font("Dialog", Font.PLAIN, 9));
		String[] columns = new String[] {"Gasto", "TipoGasto", "Presupuesto", "Real", "Dif. $"};
		table.setColums(columns);
		table.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 10));
		
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		
		scrollPane.setViewportView(table);
		
		lblTotalReal = new JLabel("100.000.000");
		lblTotalReal.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblTotalReal.setBounds(370, 549, 59, 22);
		add(lblTotalReal);
		
		lblTotalDiferencia = new JLabel("100.000.000");
		lblTotalDiferencia.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalDiferencia.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblTotalDiferencia.setBounds(449, 549, 59, 22);
		add(lblTotalDiferencia);
		
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

	public JLabel getLblTotalReal() {
		return lblTotalReal;
	}

	public JLabel getLblTotalDiferencia() {
		return lblTotalDiferencia;
	}

	public JLabel getLblTotalPresup() {
		return lblTotalPresup;
	}

	public void setLblTotalReal(JLabel lblTotalReal) {
		this.lblTotalReal = lblTotalReal;
	}

	public void setLblTotalDiferencia(JLabel lblTotalDiferencia) {
		this.lblTotalDiferencia = lblTotalDiferencia;
	}

	public void setLblTotalPresup(JLabel lblTotalPresup) {
		this.lblTotalPresup = lblTotalPresup;
	}

}
