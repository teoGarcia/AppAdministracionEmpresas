package CuartoMedio.EmprendimientoYEmpleabilidad.ControlGastos.Imprimir;

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
	
	private JLabel lblAnio_lbl;
	private TableStandard table;

	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblAnio = new JLabel("A\u00F1o");
		lblAnio.setFont(new Font("Dialog", Font.BOLD, 10));
		lblAnio.setBounds(70, 123, 32, 22);
		add(lblAnio);
		
		JLabel lblTitulo = new JLabel("Control de Gastos");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTitulo.setBounds(0, 80, 584, 33);
		add(lblTitulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 155, 526, 519);
		add(scrollPane);
		
		table = new TableStandard();
		table.setFont(new Font("Dialog", Font.PLAIN, 9));
		String[] columns = new String[] {"Id", "Mes", "Categoria", "Sub Categoria", "Detalle", "Importe"};
		table.setColums(columns);
		table.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 10));
		scrollPane.setViewportView(table);
		
		lblAnio_lbl = new JLabel("2022");
		lblAnio_lbl.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblAnio_lbl.setBounds(112, 124, 59, 22);
		add(lblAnio_lbl);
		
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
	
	public void llenarTabla() {
		

		
	}
	
	public DefaultTableModel getModel() {
		return table.getModel();
	}

	public JLabel getLblTotalIngresos() {
		return lblAnio_lbl;
	}


	public TableStandard getTable() {
		return table;
	}

	public void setLblTotalIngresos(JLabel lblTotalIngresos) {
		this.lblAnio_lbl = lblTotalIngresos;
	}


	public void setTable(TableStandard table) {
		this.table = table;
	}
}
