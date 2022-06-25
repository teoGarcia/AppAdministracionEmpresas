package ui.TablaUi;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.hibernate.mapping.Column;


public class TableStandard extends JTable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DefaultTableModel model;
	
	public TableStandard() {
		super();
	
		setColumnSelectionAllowed(false);
		getTableHeader().setReorderingAllowed(false);
		setCellSelectionEnabled(false);
		setRowSelectionAllowed(true);
		setSelectionMode(1);
		
		model = new DefaultTableModel() {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		setModel(model);
	}

	public void setColums(String[] columns) {
		
		for(String c: columns) {
			model.addColumn(new Column(c).getName());
		}
		
	}

	public DefaultTableModel getModel() {
		return model;
	}

	
	
}
