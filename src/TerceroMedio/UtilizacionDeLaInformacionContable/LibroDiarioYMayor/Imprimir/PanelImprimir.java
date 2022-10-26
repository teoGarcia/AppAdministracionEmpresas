package TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Imprimir;

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
	
	
	private JLabel txtPeriodo;
	private TableStandard table;
	private JLabel txtDenominacinORazn;

	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblPeriodo = new JLabel("Periodo");
		lblPeriodo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPeriodo.setBounds(32, 68, 67, 22);
		add(lblPeriodo);
		
		JLabel lblTitulo = new JLabel("Libro Diario y Mayor");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTitulo.setBounds(0, 25, 584, 33);
		add(lblTitulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 155, 526, 519);
		add(scrollPane);
		
		table = new TableStandard();
		table.setFont(new Font("Dialog", Font.PLAIN, 9));
		String[] columns = new String[] {"Id", "Asiento", "Fecha", "Definicion",  "Codigo", "Desglose", "Debe", "Haber"};
		table.setColums(columns);
		table.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 10));
		scrollPane.setViewportView(table);
		
		txtPeriodo = new JLabel("Marzo 2013");
		txtPeriodo.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtPeriodo.setBounds(98, 68, 100, 22);
		add(txtPeriodo);
		
		txtDenominacinORazn = new JLabel("Oboso S.A.");
		txtDenominacinORazn.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtDenominacinORazn.setBounds(234, 100, 192, 22);
		add(txtDenominacinORazn);
		
		JLabel lblDenominacinORazn = new JLabel("Denominaci\u00F3n o Raz\u00F3n Social");
		lblDenominacinORazn.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDenominacinORazn.setBounds(32, 100, 192, 22);
		add(lblDenominacinORazn);
		
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

	public JLabel getLblTotalIngresos() {
		return txtPeriodo;
	}


	public TableStandard getTable() {
		return table;
	}

	public void setLblTotalIngresos(JLabel lblTotalIngresos) {
		this.txtPeriodo = lblTotalIngresos;
	}


	public void setTable(TableStandard table) {
		this.table = table;
	}

	public JLabel getTxtPeriodo() {
		return txtPeriodo;
	}

	public JLabel getTxtDenominacinORazn() {
		return txtDenominacinORazn;
	}

	public void setTxtPeriodo(JLabel txtPeriodo) {
		this.txtPeriodo = txtPeriodo;
	}

	public void setTxtDenominacinORazn(JLabel txtDenominacinORazn) {
		this.txtDenominacinORazn = txtDenominacinORazn;
	}
}
