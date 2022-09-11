package TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.ControlListaPrecio;
import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.Producto;
import core.Helpers;
import ui.Buttons.StandarButton;
import ui.TablaUi.TableStandard;
import ui.Texts.TextSoloNumeros;

public class VistaLibroDiarioYMayor extends JPanel {

	private Long id = 0L;
	
	private ControlLibroDiarioYMayor control;
	
	private TableStandard table;
	private JTextField txtAsiento;
	private JTextField txtFecha;
	private JTextField txtDesglose;
	private TextSoloNumeros txtPreUni;
	private TextSoloNumeros txtDebe;
	private JTextField txtSubTotal;
	private JTextField txtIVA;
	private JTextField txtTotal;
	private StandarButton btnAgregar;
	
	private DefaultTableModel modelo;
	private StandarButton btnModificar;
	private StandarButton btnEliminar;
	private StandarButton btnImprimir;
	
	/**
	 * Create the panel.
	 */
	public VistaLibroDiarioYMayor() {
		
		control = new ControlLibroDiarioYMayor(this);
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de Precios");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 34, 722, 48);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 208, 702, 416);
		add(scrollPane);
		
		table = new TableStandard();
		String[] columns = new String[] {"Asiento", "Fecha", "Definicion",  "Codigo", "Desglose", "Debe", "Haber"};
		table.setColums(columns);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Asiento");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 116, 89, 19);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(256, 116, 89, 19);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Desglose");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(256, 140, 89, 19);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Codigo");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 140, 89, 19);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Debe");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(10, 169, 77, 19);
		add(lblNewLabel_1_4);
		
		txtAsiento = new JTextField();
		txtAsiento.setBounds(106, 115, 140, 19);
		add(txtAsiento);
		txtAsiento.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBounds(328, 116, 140, 19);
		add(txtFecha);
		
		txtDesglose = new JTextField();
		txtDesglose.setColumns(10);
		txtDesglose.setBounds(328, 140, 140, 19);
		add(txtDesglose);
		
		txtPreUni = new TextSoloNumeros();
		txtPreUni.setColumns(10);
		txtPreUni.setBounds(106, 140, 140, 19);
		add(txtPreUni);
		
		txtDebe = new TextSoloNumeros();
		txtDebe.setColumns(10);
		txtDebe.setBounds(107, 169, 140, 19);
		add(txtDebe);
		
		btnAgregar = new StandarButton("Agregar");
		btnAgregar.setText("Guardar");
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgregar.setBounds(532, 160, 130, 28);
		btnAgregar.addActionListener(control);
		add(btnAgregar);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar\r\n");
		btnModificar.setBounds(20, 635, 100, 28);
		btnModificar.addActionListener(control);
		add(btnModificar);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(149, 635, 97, 28);
		btnEliminar.addActionListener(control);
		add(btnEliminar);
		
		btnImprimir = new StandarButton((String) null);
		btnImprimir.setText("Imprimir");
		btnImprimir.setBounds(274, 635, 97, 28);
		btnImprimir.addActionListener(control);
		add(btnImprimir);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Definicion");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1.setBounds(488, 116, 77, 19);
		add(lblNewLabel_1_4_1);
		
		TextSoloNumeros txtDefinicion = new TextSoloNumeros();
		txtDefinicion.setText("");
		txtDefinicion.setColumns(10);
		txtDefinicion.setBounds(572, 116, 140, 19);
		add(txtDefinicion);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Haber");
		lblNewLabel_1_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_2.setBounds(254, 169, 64, 19);
		add(lblNewLabel_1_4_2);
		
		TextSoloNumeros txtHaber = new TextSoloNumeros();
		txtHaber.setText("");
		txtHaber.setColumns(10);
		txtHaber.setBounds(328, 169, 140, 19);
		add(txtHaber);
		
		ActualizarVista();
		
	}
	
	public boolean camposVacios() {
		
		if(txtAsiento.getText().length() <= 0 || txtFecha.getText().length() <= 0 || txtPreUni.getText().length() <= 0 || txtDebe.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	public void calcularTotal() {
		
		int total = 0;
		int iva = 0;
		
		for(int i=0; i<this.table.getRowCount(); i++) { 
			total += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 6))); 
		}
		
		iva = Integer.parseInt(""+ ((total * 19)/ 100));
		
		txtSubTotal.setText(Helpers.ponerPuntos(""+(total-iva)));
		txtIVA.setText(Helpers.ponerPuntos(""+iva));
		txtTotal.setText(Helpers.ponerPuntos(""+total));
		  
	}
	
	public void ActualizarVista() {
		VaciarForm();
		control.LlenarTabla();
		calcularTotal();
	}
	
	public void CargarForm(Producto p) {
		txtAsiento.setText(p.getCodigo());
		txtFecha.setText(p.getNombre());
		txtDesglose.setText(p.getProveedor());
		txtPreUni.setText(""+p.getPrecio());
		txtDebe.setText(""+p.getCantidad());
		setId(p.getId());
	}
	
	public void VaciarForm() {
		txtAsiento.setText("");
		txtFecha.setText("");
		txtDesglose.setText("");
		txtPreUni.setText("");
		txtDebe.setText("");
		setId(0L);
	}

	public DefaultTableModel getModel() {
		return table.getModel();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
}
