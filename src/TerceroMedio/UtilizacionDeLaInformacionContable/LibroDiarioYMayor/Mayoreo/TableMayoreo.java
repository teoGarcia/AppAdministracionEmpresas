package TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Mayoreo;

import java.awt.Color;
import java.awt.Font;
import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Asientos;
import core.Helpers;
import ui.TablaUi.TableStandard;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TableMayoreo extends JPanel {
	
	private TableStandard table;
	private JLabel txtTotalDebe;
	private JLabel txtTotalHaber;
	private JLabel txtTotalSaldo;
	
	public TableMayoreo(){
		
		setBackground(Color.WHITE);
		
		setBounds(10, 10, 546, 180);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 526, 124);
		add(scrollPane);
		
		table = new TableStandard();
		table.setFont(new Font("Dialog", Font.PLAIN, 9));
		String[] columns = new String[] {"Codigo", "Fecha", "Desglose", "Debe", "Haber", "Saldo"};
		table.setColums(columns);
		table.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 10));
		scrollPane.setViewportView(table);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotal.setBounds(199, 148, 59, 22);
		add(lblTotal);
		

		txtTotalDebe = new JLabel("0");
		txtTotalDebe.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotalDebe.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtTotalDebe.setBounds(268, 144, 80, 22);
		add(txtTotalDebe);
		
		txtTotalHaber = new JLabel("0");
		txtTotalHaber.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotalHaber.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtTotalHaber.setBounds(358, 144, 80, 22);
		add(txtTotalHaber);
		
		txtTotalSaldo = new JLabel("0");
		txtTotalSaldo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotalSaldo.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtTotalSaldo.setBounds(448, 144, 80, 22);
		add(txtTotalSaldo);
		
	}
	
	public void LlenarTabla(Iterator<Asientos> lista) {
		
		while (lista.hasNext()) {
			Asientos records = lista.next();
			
			table.getModel().addRow(new Object[] { 
					records.getCodigo(),
					Helpers.getFechaFormat(records.getFecha()),
					records.getDesglose(),
					records.getDebe(),
					records.getHaber(),
					(records.getDebe()+records.getHaber())
				});
			
			
		}
		
		calcularTotales();
		
	}
	
	private void calcularTotales() {
		
		int tDebe = Helpers.calcularTotalDeFila(3, table);
		int tHaber =  Helpers.calcularTotalDeFila(4, table);
		int tSaldo =  Helpers.calcularTotalDeFila(5, table);
		
		txtTotalDebe.setText(""+ tDebe);
		txtTotalHaber.setText(""+ tHaber);
		txtTotalSaldo.setText(""+ tSaldo);
		
	}
	
}
