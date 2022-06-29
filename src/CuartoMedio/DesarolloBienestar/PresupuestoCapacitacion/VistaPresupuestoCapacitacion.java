package CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Iterator;

import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import ui.TablaUi.TableStandard;

import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.hibernate.mapping.Column;

import javax.swing.JButton;
import java.awt.Color;

public class VistaPresupuestoCapacitacion extends JPanel {
	
	private TableStandard table;
	private JTextField total;
	private JTextField txtGlosario;
	private JDateChooser txtFecha;
	private ControlPresupuestoCapacitacion cpc;
	private StandarButton guardar;
	private TextSoloNumeros txtCancelar;
	private StandarButton btnEliminar;
	private StandarButton btnModificar;
	private JTextField txtId;

	/**
	 * Create the panel.
	 */
	public VistaPresupuestoCapacitacion() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		cpc = new ControlPresupuestoCapacitacion(this);
		
		JLabel lblTitulo = new JLabel("Presupuesto de Capacitacion");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitulo.setBounds(0, 60, 774, 35);
		add(lblTitulo);
		
		LabelSubtitulos lblGlosario = new LabelSubtitulos((String) null);
		lblGlosario.setText("Item / Glosario");
		lblGlosario.setBounds(63, 161, 103, 23);
		add(lblGlosario);
		
		txtGlosario = new JTextField();
		txtGlosario.setBounds(176, 163, 447, 23);
		add(txtGlosario);
		txtGlosario.setColumns(10);
		
		LabelSubtitulos lblFecha = new LabelSubtitulos((String) null);
		lblFecha.setText("Fecha");
		lblFecha.setBounds(63, 208, 103, 23);
		add(lblFecha);
		
		txtFecha = new JDateChooser();
		txtFecha.setBounds(176, 208, 165, 23);
		add(txtFecha);
		
		LabelSubtitulos lblMontoACancela = new LabelSubtitulos((String) null);
		lblMontoACancela.setText("Monto a Cancelar");
		lblMontoACancela.setBounds(361, 208, 127, 23);
		add(lblMontoACancela);
		
		txtCancelar = new TextSoloNumeros();
		txtCancelar.setBounds(481, 208, 124, 23);
		add(txtCancelar);
		
		guardar = new StandarButton((String) null);
		guardar.setText("Guardar");
		guardar.setBounds(615, 208, 103, 23);
		guardar.addActionListener(cpc);
		add(guardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(63, 256, 655, 312);
		add(scrollPane);
		
		table = new TableStandard();
		String[] columns = new String[] {"Id", "Glosario", "Fecha", "Monto a Cancelar"};
		table.setColums(columns);
		scrollPane.setViewportView(table);
		
		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("TOTAL");
		lblsbtlsTotal.setBounds(515, 579, 62, 23);
		add(lblsbtlsTotal);
		
		total = new JTextField();
		total.setBounds(602, 579, 116, 23);
		add(total);
		total.setColumns(10);
		
		btnEliminar = new StandarButton((String) null);
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(63, 579, 103, 23);
		btnEliminar.addActionListener(cpc);
		add(btnEliminar);
		
		btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(188, 579, 103, 23);
		btnModificar.addActionListener(cpc);
		add(btnModificar);
		
		txtId = new JTextField();
		txtId.setBounds(63, 129, 86, 20);
		add(txtId);
		txtId.setVisible(false);
		txtId.setColumns(10);

		ActualizarVista();
		
	}
	
	public boolean camposVacios() {
		
		if(txtGlosario.getText().length() <= 0) {
			return false;
		}else if(txtFecha.getCalendar().getTime() == null) {
			return false;
		}else if(txtCancelar.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	public void calcularTotal() {
		
		double t = 0;
		
		for(int i=0; i<this.table.getRowCount(); i++) {
			 t += Double.parseDouble(String.valueOf(table.getModel().getValueAt(i, 3)));
		}
		
		total.setText(""+t);
	}
	
	public void ActualizarVista() {
		VaciarForm();
		cpc.LlenarTabla();
		calcularTotal();
	}

	public void VaciarForm() {
		txtGlosario.setText("");
		txtFecha.setCalendar(null);
		txtCancelar.setText("");
		txtId.setText("");
	}
	
	public void CargarForm(PresupuestoCapacitacion cp) {
		txtGlosario.setText(cp.getGlosario());
		txtFecha.setCalendar(cp.getFecha());
		txtCancelar.setText(""+cp.getCancelar());
		txtId.setText(""+cp.getId());
	}

	public JTextField getTotal() {
		return total;
	}

	public void setTotal(JTextField total) {
		this.total = total;
	}

	public JTextField getTxtGlosario() {
		return txtGlosario;
	}

	public void setTxtGlosario(JTextField txtGlosario) {
		this.txtGlosario = txtGlosario;
	}

	public JDateChooser getTxtFecha() {
		return txtFecha;
	}

	public void setTxtFecha(JDateChooser txtFecha) {
		this.txtFecha = txtFecha;
	}

	public StandarButton getGuardar() {
		return guardar;
	}

	public void setGuardar(StandarButton guardar) {
		this.guardar = guardar;
	}

	public TextSoloNumeros getTxtCancelar() {
		return txtCancelar;
	}

	public void setTxtCancelar(TextSoloNumeros txtCancelar) {
		this.txtCancelar = txtCancelar;
	}
	
	public DefaultTableModel getModel() {
		return table.getModel();
	}


	public StandarButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(StandarButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public StandarButton getBtnModificar() {
		return btnModificar;
	}

	public TableStandard getTable() {
		return table;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public void setBtnModificar(StandarButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}
}
