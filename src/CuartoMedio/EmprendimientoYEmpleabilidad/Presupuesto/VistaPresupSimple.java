package CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import ui.TablaUi.TableStandard;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultComboBoxModel;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.hibernate.mapping.Column;

import java.awt.Color;

public class VistaPresupSimple extends JPanel {
	
	private JTextField txtApartado;
	private TableStandard table;
	private JTextField txtTotaligresos;
	private JTextField txtTotalEgresos;
	private JTextField textField_3;
	private JComboBox comboTipo;
	private JDateChooser dateFecha;
	private TextSoloNumeros txtMonto;
	private StandarButton btnGuardar;

	/**
	 * Create the panel.
	 */
	public VistaPresupSimple() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblTitle = new JLabel("Presupuesto Simple");
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitle.setBounds(0, 60, 774, 30);
		add(lblTitle);
		
		LabelSubtitulos lblsbtlsApartado = new LabelSubtitulos((String) null);
		lblsbtlsApartado.setText("Apartado");
		lblsbtlsApartado.setBounds(66, 132, 87, 23);
		add(lblsbtlsApartado);
		
		txtApartado = new JTextField();
		txtApartado.setBounds(144, 133, 375, 23);
		add(txtApartado);
		txtApartado.setColumns(10);
		
		LabelSubtitulos lblsbtlsTipo = new LabelSubtitulos((String) null);
		lblsbtlsTipo.setText("Tipo");
		lblsbtlsTipo.setBounds(529, 132, 61, 23);
		add(lblsbtlsTipo);
		
		comboTipo = new JComboBox();
		comboTipo.setModel(new DefaultComboBoxModel(new String[] {"Ingreso", "Egreso"}));
		comboTipo.setBounds(600, 133, 116, 23);
		add(comboTipo);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos((String) null);
		lblsbtlsFecha.setText("Fecha");
		lblsbtlsFecha.setBounds(66, 185, 71, 23);
		add(lblsbtlsFecha);
		
		dateFecha = new JDateChooser();
		dateFecha.setBounds(144, 185, 160, 23);
		add(dateFecha);
		
		LabelSubtitulos lblsbtlsMonto = new LabelSubtitulos((String) null);
		lblsbtlsMonto.setText("Monto");
		lblsbtlsMonto.setBounds(334, 185, 77, 23);
		add(lblsbtlsMonto);
		
		txtMonto = new TextSoloNumeros();
		txtMonto.setBounds(401, 185, 160, 23);
		add(txtMonto);
		
		btnGuardar = new StandarButton((String) null);
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(603, 185, 100, 23);
		add(btnGuardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(66, 244, 638, 333);
		add(scrollPane);
		
		table = new TableStandard();
		String[] columns = new String[] {"Id", "Apartado", "Fecha", "Ingreso", "Egreso"};
		table.setColums(columns);
		scrollPane.setViewportView(table);
		
		StandarButton btnEliminiar = new StandarButton((String) null);
		btnEliminiar.setText("Eliminiar");
		btnEliminiar.setBounds(66, 588, 100, 30);
		add(btnEliminiar);
		
		StandarButton btnModificar = new StandarButton((String) null);
		btnModificar.setText("Modificar");
		btnModificar.setBounds(188, 588, 100, 30);
		add(btnModificar);
		
		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("TOTAL");
		lblsbtlsTotal.setBounds(373, 594, 100, 23);
		add(lblsbtlsTotal);
		
		txtTotaligresos = new JTextField();
		txtTotaligresos.setEditable(false);
		txtTotaligresos.setBounds(461, 594, 100, 23);
		add(txtTotaligresos);
		txtTotaligresos.setColumns(10);
		
		txtTotalEgresos = new JTextField();
		txtTotalEgresos.setEditable(false);
		txtTotalEgresos.setColumns(10);
		txtTotalEgresos.setBounds(603, 594, 100, 23);
		add(txtTotalEgresos);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(603, 638, 100, 23);
		add(textField_3);
		textField_3.setColumns(10);
		
		LabelSubtitulos lblsbtlsResultado = new LabelSubtitulos((String) null);
		lblsbtlsResultado.setText("Resultado");
		lblsbtlsResultado.setBounds(503, 637, 87, 23);
		add(lblsbtlsResultado);

	}

	
}
