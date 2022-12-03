package ui.CrudTable;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import ui.Buttons.StandarButton;
import ui.TablaUi.TableStandard;

public class VistaCrudTable extends JPanel {
	
	// Table
	private TableStandard table;
	
	// Botones
	private StandarButton btnAgregar;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	private StandarButton btnImprimir;
	private StandarButton btnCambiar;
	
	// Scroll
	JScrollPane scrollPane;
	
	public VistaCrudTable(){
		inicializacion();
	}
	
	private void inicializacion() {
		
		setBounds(0, 0, 770, 305);
		setLayout(null);
		setOpaque(false);
		
		btnAgregar = new StandarButton("Guardar");
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgregar.setBounds(606, 11, 130, 28);
		//
		add(btnAgregar);
		
		scrollPane = new JScrollPane();
		//scrollPane.setBounds(10, 20, 702, 209);
		scrollPane.setBounds(34, 48, 702, 209);
		add(scrollPane);
		
		table = new TableStandard();
		scrollPane.setViewportView(table);
		
		btnModificar = new StandarButton("Modificar");
		btnModificar.setBounds(34, 268, 100, 28);
		//
		add(btnModificar);
		
		btnEliminar = new StandarButton("Eliminar");
		btnEliminar.setBounds(164, 268, 100, 28);
		//
		add(btnEliminar);
		
		btnImprimir = new StandarButton("Imprimir");
		btnImprimir.setBounds(294, 268, 100, 28);
		//
		add(btnImprimir);
		
	}
	
	public void addControllers(ActionListener control) {
		btnAgregar.addActionListener(control);
		btnModificar.addActionListener(control);
		btnEliminar.addActionListener(control);
		btnImprimir.addActionListener(control);
		
		if(btnCambiar != null) btnCambiar.addActionListener(control);
	}

	
	public void buildBtnCambiar() {
		btnCambiar = new StandarButton("Cambiar Libro");
		btnCambiar.setBounds(280, 267, 150, 28);
		//btnCambiarLibro.addActionListener(control);
		add(btnCambiar);
		
		btnImprimir.setBounds(410, 267, 100, 28);
	}
	
	public void setColumnsTable(String[] columns) {
		table.setColums(columns);
	}
	
	public Long getRowId() {
		int row = table.getSelectedRow();
		if (row >= 0) {
			Long id = Long.parseLong(String.valueOf(table.getModel().getValueAt(row, 0)));
			return id;
		} else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);
			return null;
		}

	}
	
	public String getSeledRow(int column) {
		int row = table.getSelectedRow();
		if (row >= 0) {
			String value = String.valueOf(table.getModel().getValueAt(row, column));
			return value;
		} else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);
			return null;
		}
	}

	public StandarButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(StandarButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public StandarButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(StandarButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public StandarButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(StandarButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public StandarButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(StandarButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public StandarButton getBtnCambiar() {
		return btnCambiar;
	}

	public void setBtnCambiar(StandarButton btnCambiar) {
		this.btnCambiar = btnCambiar;
	}

	public TableStandard getTable() {
		return table;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

}
