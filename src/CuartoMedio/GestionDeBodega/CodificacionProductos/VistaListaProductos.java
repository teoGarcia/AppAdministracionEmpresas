package CuartoMedio.GestionDeBodega.CodificacionProductos;

import javax.swing.JPanel;

import java.awt.Dimension;

import javax.swing.JLabel;
import ui.Labels.LabelTitulos;
import ui.TablaUi.TableStandard;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VistaListaProductos extends JPanel {
	
	private ControlListaProductos clp;
	
	private TableStandard table;
	//private JTable table;
	private DefaultTableModel dtb;

	/**
	 * Create the panel.
	 */
	public VistaListaProductos() {
		
		clp = new ControlListaProductos(this);
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lblNewLabel = new LabelTitulos("Lista de Productos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 60, 722, 30);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 150, 702, 466);
		add(scrollPane);
		
		table = new TableStandard();
		String[] columns = new String[] {"ID", "Proveedor", "Descripcion Producto", "Cod Interno", "Cod. Barras EAN-14", "Cod. Barras EAN-14", "Marca", "Descripcion Producto", "Pais Abastecimiento", "Pais Fabricacion", "Precio Sin Impuesto", "Desc. Permanente", "Precio Neto", "Desc. Introduccion", "I.V.A.", "P.V.P.", "Precio Sugerido", "Unidad Embalaje", "Registro Sanitario", "Vida Util", "Cajas x Plancha", "Planchas x Pallet", "Tipo Embalaje", "Peso Bruto (Caja)", "Peso Neto (Caja)", "Profund. (Caja)", "Ancho (Caja)", "Alto (Caja)", "Volumen (Caja)", "Peso Bruto (Unidad)", "Peso Neto (Unidad)", "Profund. (Unidad)", "Ancho (Unidad)", "Alto (Unidad)", "Volumen (Unidad)"};
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setColums(columns);
		scrollPane.setViewportView(table);
		
		ActualizarVista();

	}
	
	public void ActualizarVista() {
		
		clp.LlenarTabla();
		
	}

	public TableStandard getTable() {
		return table;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public DefaultTableModel getModel() {
		return table.getModel();
	}
	
	
}
