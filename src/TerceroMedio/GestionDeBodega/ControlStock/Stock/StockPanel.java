package TerceroMedio.GestionDeBodega.ControlStock.Stock;

import java.awt.Font;
import java.util.Iterator;

import javax.swing.JLabel;
import javax.swing.JScrollPane;

import TerceroMedio.GestionDeBodega.ControlStock.ComprasYVentas.CompraYVentaEntity;
import TerceroMedio.GestionDeBodega.ControlStock.Producto.ProductoEntity;
import core.Helpers;
import ui.TablaUi.TableStandard;
import ui.imprimir.PanelImprimirI;
import javax.swing.JTextField;

public class StockPanel extends PanelImprimirI<ProductoEntity>{

	
	
	private TableStandard table;
	private JLabel txtProducto;
	private JLabel txtTotal;

	public StockPanel() {
		super("Saldo de Stock");
		
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setFont(new Font("Dialog", Font.BOLD, 12));
		lblProducto.setBounds(32, 100, 60, 22);
		add(lblProducto);
		
		txtProducto = new JLabel("Producto");
		txtProducto.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtProducto.setBounds(102, 100, 192, 22);
		add(txtProducto);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 155, 526, 470);
		add(scrollPane);
		
		table = new TableStandard();
		table.setFont(new Font("Dialog", Font.PLAIN, 9));
		String[] columns = new String[] {"Fecha", "Operacion", "Cantidad"};
		table.setColums(columns);
		table.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 10));
		scrollPane.setViewportView(table);
		
		txtTotal = new JLabel();
		txtTotal.setFont(new Font("Dialog", Font.BOLD, 12));
		txtTotal.setBounds(386, 644, 172, 20);
		add(txtTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotal.setBounds(316, 642, 60, 22);
		add(lblTotal);
		
		
	}

	@Override
	public void CargarData(ProductoEntity record) {
		txtProducto.setText(record.getProducto());
		
	}
	
	public void CargarTabla(Iterator<CompraYVentaEntity> lista) {
		
		table.getModel().getDataVector().removeAllElements();
		table.getModel().fireTableDataChanged();

		while (lista.hasNext()) {
			CompraYVentaEntity records = lista.next();
			table.getModel().addRow(
					new Object[] { 
							Helpers.getFechaFormat(records.getFecha()),
							records.getOperacion(),
							records.getCantidad()
					});
			}
		
		CalcularTotal();
	}
	
	private void CalcularTotal() {
		
		int t = 0;
		
		for(int i=0; i<table.getRowCount(); i++) {
			 t += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 2)));
		}
		
		txtTotal.setText(""+t);
		
	}
	

	public JLabel getTxtProducto() {
		return txtProducto;
	}

	public void setTxtProducto(JLabel txtProducto) {
		this.txtProducto = txtProducto;
	}
}
