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
	private JLabel txtDebe;
	private JLabel txtHaber;
	private JLabel txtSaldo;
	
	public TableMayoreo(){
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 546, 180);
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
		

		txtDebe = new JLabel("0");
		txtDebe.setHorizontalAlignment(SwingConstants.CENTER);
		txtDebe.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtDebe.setBounds(268, 144, 80, 22);
		add(txtDebe);
		
		txtHaber = new JLabel("0");
		txtHaber.setHorizontalAlignment(SwingConstants.CENTER);
		txtHaber.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtHaber.setBounds(358, 144, 80, 22);
		add(txtHaber);
		
		txtSaldo = new JLabel("0");
		txtSaldo.setHorizontalAlignment(SwingConstants.CENTER);
		txtSaldo.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtSaldo.setBounds(448, 144, 80, 22);
		add(txtSaldo);
		
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
		
		CalcularTotales();
		
	}
	
	
	private void CalcularTotales() {
		
	}
}
