package TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Mayoreo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Asientos;
import ui.TablaUi.TableStandard;

public class PanelMayoreo extends JPanel implements Printable {
	
	private int[] y = new int[] { 68, 268, 468, 668, 868, 1068 };
	private TableMayoreo[] tables = new TableMayoreo[y.length];
	
	public PanelMayoreo(Iterator<Asientos> list) {
		
		
		setBackground(Color.WHITE);
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 584, 700);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(550, 1250));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		
		
		JLabel lblTitulo = new JLabel("Mayoreo");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTitulo.setBounds(0, 25, 584, 33);
		panel.add(lblTitulo);
		
		for(int i=0; i<tables.length; i++) {
			
		    tables[i] = new TableMayoreo();
		    tables[i].setLocation(19, y[i]);
		    panel.add(tables[i]);
		}
		
		cargarTablas(list);

	}
	
	private void cargarTablas(Iterator<Asientos> list) {
		
		while (list.hasNext()) {
			Asientos record = list.next();
			
			tables[record.getCodigo()-1].LlenarTabla(record);
			
		}
		
		for(int i=0; i<tables.length; i++) {
			tables[i].calcularTotales();

		}
	}
	

	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

			Graphics2D graphics2D = (Graphics2D) graphics;
			graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
			printAll(graphics2D);
			return PAGE_EXISTS;	

	}
	
}
