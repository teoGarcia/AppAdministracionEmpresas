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

import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacion;

import javax.swing.JButton;
import ui.Buttons.StandarButton;

public class VistaListaProductos extends JPanel {
	
	private ControlListaProductos clp;
	
	private TableStandard table;
	//private JTable table;
	private DefaultTableModel dtb;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	private StandarButton stndrbtnActualizar;

	/**
	 * Create the panel.
	 */
	public VistaListaProductos() {
		
		clp = new ControlListaProductos(this);
		
		setBounds(0, 0, 760, 740);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lblNewLabel = new LabelTitulos("Lista de Productos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 60, 760, 30);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 150, 740, 466);
		add(scrollPane);
		
		table = new TableStandard();
		String[] columns = new String[] {"ID", "Proveedor", "Descripcion Producto", "Cod Interno", "Cod. Barras EAN-13", "Cod. Barras EAN-14", "Marca", "Pais Abastecimiento", "Pais Fabricacion", "Precio Sin Impuesto", "Desc. Permanente", "Precio Neto", "Desc. Introduccion", "I.V.A.", "P.V.P.", "Precio Sugerido", "Unidad Embalaje", "Registro Sanitario", "Vida Util", "Cajas x Plancha", "Planchas x Pallet", "Tipo Embalaje", "Peso Bruto (Caja)", "Peso Neto (Caja)", "Profund. (Caja)", "Ancho (Caja)", "Alto (Caja)", "Volumen (Caja)", "Peso Bruto (Unidad)", "Peso Neto (Unidad)", "Profund. (Unidad)", "Ancho (Unidad)", "Alto (Unidad)", "Volumen (Unidad)"};
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setColums(columns);
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setPreferredWidth(60);
		table.getColumnModel().getColumn(7).setPreferredWidth(120);
		table.getColumnModel().getColumn(8).setPreferredWidth(120);
		table.getColumnModel().getColumn(9).setPreferredWidth(120);
		table.getColumnModel().getColumn(10).setPreferredWidth(120);
		table.getColumnModel().getColumn(11).setPreferredWidth(100);
		table.getColumnModel().getColumn(12).setPreferredWidth(100);
		table.getColumnModel().getColumn(13).setPreferredWidth(100);
		table.getColumnModel().getColumn(14).setPreferredWidth(100);
		table.getColumnModel().getColumn(15).setPreferredWidth(100);
		table.getColumnModel().getColumn(16).setPreferredWidth(100);
		table.getColumnModel().getColumn(17).setPreferredWidth(100);
		table.getColumnModel().getColumn(18).setPreferredWidth(100);
		table.getColumnModel().getColumn(19).setPreferredWidth(100);
		table.getColumnModel().getColumn(20).setPreferredWidth(100);
		table.getColumnModel().getColumn(21).setPreferredWidth(100);
		table.getColumnModel().getColumn(22).setPreferredWidth(100);
		table.getColumnModel().getColumn(23).setPreferredWidth(100);
		table.getColumnModel().getColumn(24).setPreferredWidth(100);
		table.getColumnModel().getColumn(25).setPreferredWidth(100);
		table.getColumnModel().getColumn(26).setPreferredWidth(100);
		table.getColumnModel().getColumn(27).setPreferredWidth(100);
		table.getColumnModel().getColumn(28).setPreferredWidth(100);
		table.getColumnModel().getColumn(29).setPreferredWidth(100);
		table.getColumnModel().getColumn(30).setPreferredWidth(100);
		table.getColumnModel().getColumn(31).setPreferredWidth(100);
		table.getColumnModel().getColumn(32).setPreferredWidth(100);
		table.getColumnModel().getColumn(33).setPreferredWidth(100);
		
		
		scrollPane.setViewportView(table);
		
		btnModificar = new StandarButton("Eliminar");
		btnModificar.setText("Modificar");
		btnModificar.setBounds(10, 641, 115, 30);
		btnModificar.addActionListener(clp);
		add(btnModificar);
		
		btnEliminar = new StandarButton("Modificar");
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(135, 641, 124, 30);
		btnEliminar.addActionListener(clp);
		add(btnEliminar);
		
		stndrbtnActualizar = new StandarButton("Modificar");
		stndrbtnActualizar.setText("Actualizar");
		stndrbtnActualizar.setBounds(10, 113, 79, 30);
		stndrbtnActualizar.addActionListener(clp);
		add(stndrbtnActualizar);
		
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


	public StandarButton getStndrbtnActualizar() {
		return stndrbtnActualizar;
	}


	public void setStndrbtnActualizar(StandarButton stndrbtnActualizar) {
		this.stndrbtnActualizar = stndrbtnActualizar;
	}
}
