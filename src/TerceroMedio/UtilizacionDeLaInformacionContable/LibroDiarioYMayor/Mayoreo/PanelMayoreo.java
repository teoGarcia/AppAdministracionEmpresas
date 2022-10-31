package TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Mayoreo;

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

public class PanelMayoreo extends JPanel implements Printable {
	
	private int[] y = new int[] { 68, 268, 468, 668, 868, 1068 };
	private TableMayoreo[] tables = new TableMayoreo[y.length];
	private Long idLibro;
	
	
	
	public PanelMayoreo(Long idLibro) {
		
		this.idLibro = idLibro;
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Mayoreo");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTitulo.setBounds(0, 25, 584, 33);
		add(lblTitulo);
		
		for(int i=0; i>tables.length; i++) {
		    tables[i] = new TableMayoreo();
		    tables[i].setLocation(19, y[i]);
		    add(tables[i]);
		}

	}
	
	private void cargarTablas() {
		
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
	
}
