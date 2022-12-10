package TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Imprimir;


import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Asientos;
import javax.swing.JScrollPane;
import ui.TablaUi.TableStandard;
import ui.imprimir.PanelImprimirI;

public class PanelImprimir extends PanelImprimirI<Asientos>{
	
	
	private JLabel txtPeriodo;
	private TableStandard table;
	private JLabel txtDenominacinORazn;

	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		super("Libro Diario y Mayor");
		
		JLabel lblPeriodo = new JLabel("Periodo");
		lblPeriodo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPeriodo.setBounds(32, 68, 67, 22);
		add(lblPeriodo);
		
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



	@Override
	public void CargarData(Asientos record) {
		// TODO Auto-generated method stub
		
	}
}
