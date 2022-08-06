package CuartoMedio.GestionDeBodega.IngresosYEgresos.Imprimir;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.Iterator;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacion;
import CuartoMedio.EmprendimientoYEmpleabilidad.ControlGastos.ControlGastosEntity;
import CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto.PresupuestoEntity;
import CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto.PresupuestoRepository;
import core.Helpers;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import ui.TablaUi.TableStandard;

public class PanelImprimir extends JPanel implements Printable{
	
	private PresupuestoRepository repository;
	private TableStandard tableIngresos;
	private TableStandard tableEgresos;

	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblAnio = new JLabel("Ingresos");
		lblAnio.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAnio.setBounds(261, 152, 61, 22);
		add(lblAnio);
		
		JLabel lblTitulo = new JLabel("Ingresos y Egresos");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTitulo.setBounds(0, 80, 584, 33);
		add(lblTitulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 184, 526, 198);
		add(scrollPane);
		
		tableIngresos = new TableStandard();
		tableIngresos.setFont(new Font("Dialog", Font.PLAIN, 9));
		String[] columns = new String[] {"Id", "Descripcion", "Fecha", "Monto"};
		tableIngresos.setColums(columns);
		tableIngresos.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 10));
		scrollPane.setViewportView(tableIngresos);
		
		JLabel lblEgresos = new JLabel("Egresos");
		lblEgresos.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEgresos.setBounds(261, 404, 61, 22);
		add(lblEgresos);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(32, 436, 526, 198);
		add(scrollPane_1);
		
		tableEgresos = new TableStandard();
		tableEgresos.setFont(new Font("Dialog", Font.PLAIN, 9));
		tableEgresos.setColums(new String[] {"Id", "Descripcion", "Fecha", "Monto"});
		tableEgresos.setBounds(0, 0, 524, 1);
		tableEgresos.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 10));
		scrollPane_1.setViewportView(tableEgresos);
		
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
}
