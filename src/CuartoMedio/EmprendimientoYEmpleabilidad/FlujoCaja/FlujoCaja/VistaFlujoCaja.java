package CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import ui.Texts.TextSoloNumeros;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import ui.Buttons.StandarButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VistaFlujoCaja extends JPanel {
	
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public VistaFlujoCaja() {

		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Flujo Caja");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 60, 722, 33);
		add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsNro = new LabelSubtitulos((String) null);
		lblsbtlsNro.setText("Nro.");
		lblsbtlsNro.setBounds(53, 127, 37, 23);
		add(lblsbtlsNro);
		
		TextSoloNumeros txtNumeros = new TextSoloNumeros();
		txtNumeros.setBounds(100, 127, 50, 23);
		add(txtNumeros);
		
		LabelSubtitulos lblsbtlsTipoDeCaja = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeCaja.setText("Tipo de Caja");
		lblsbtlsTipoDeCaja.setBounds(168, 127, 94, 23);
		add(lblsbtlsTipoDeCaja);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(259, 128, 190, 23);
		add(comboBox);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos((String) null);
		lblsbtlsFecha.setText("Fecha");
		lblsbtlsFecha.setBounds(459, 127, 59, 23);
		add(lblsbtlsFecha);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(516, 127, 160, 23);
		add(dateChooser);
		
		LabelSubtitulos lblsbtlsConcepto = new LabelSubtitulos((String) null);
		lblsbtlsConcepto.setText("Concepto");
		lblsbtlsConcepto.setBounds(53, 173, 84, 23);
		add(lblsbtlsConcepto);
		
		TextSoloNumeros textSoloNumeros_1 = new TextSoloNumeros();
		textSoloNumeros_1.setBounds(147, 173, 302, 23);
		add(textSoloNumeros_1);
		
		LabelSubtitulos lblsbtlsCodigo = new LabelSubtitulos((String) null);
		lblsbtlsCodigo.setText("Codigo");
		lblsbtlsCodigo.setBounds(459, 173, 59, 23);
		add(lblsbtlsCodigo);
		
		TextSoloNumeros textSoloNumeros_2 = new TextSoloNumeros();
		textSoloNumeros_2.setBounds(516, 173, 160, 23);
		add(textSoloNumeros_2);
		
		LabelSubtitulos lblsbtlsEntrada = new LabelSubtitulos((String) null);
		lblsbtlsEntrada.setText("Entrada");
		lblsbtlsEntrada.setBounds(53, 219, 84, 23);
		add(lblsbtlsEntrada);
		
		TextSoloNumeros textSoloNumeros_3 = new TextSoloNumeros();
		textSoloNumeros_3.setBounds(147, 219, 110, 23);
		add(textSoloNumeros_3);
		
		LabelSubtitulos lblsbtlsSalida = new LabelSubtitulos((String) null);
		lblsbtlsSalida.setText("Salida");
		lblsbtlsSalida.setBounds(267, 219, 103, 23);
		add(lblsbtlsSalida);
		
		TextSoloNumeros textSoloNumeros_3_1 = new TextSoloNumeros();
		textSoloNumeros_3_1.setBounds(339, 219, 110, 23);
		add(textSoloNumeros_3_1);
		
		StandarButton stndrbtnAgregar = new StandarButton((String) null);
		stndrbtnAgregar.setText("Agregar");
		stndrbtnAgregar.setBounds(566, 219, 110, 23);
		add(stndrbtnAgregar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 274, 625, 358);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Concepto", "Fecha", "Entrada", "Salida"
			}
		));
		scrollPane.setViewportView(table);
		
		StandarButton stndrbtnCambiarCaja = new StandarButton((String) null);
		stndrbtnCambiarCaja.setText("Cambiar Caja");
		stndrbtnCambiarCaja.setBounds(53, 656, 135, 30);
		add(stndrbtnCambiarCaja);
		
		LabelSubtitulos lblsbtlsTotal = new LabelSubtitulos((String) null);
		lblsbtlsTotal.setText("TOTAL");
		lblsbtlsTotal.setBounds(504, 643, 84, 26);
		add(lblsbtlsTotal);
		
		StandarButton stndrbtnEliminar = new StandarButton((String) null);
		stndrbtnEliminar.setText("Eliminar");
		stndrbtnEliminar.setBounds(205, 656, 99, 30);
		add(stndrbtnEliminar);
		
		StandarButton stndrbtnModificar = new StandarButton((String) null);
		stndrbtnModificar.setText("Modificar");
		stndrbtnModificar.setBounds(319, 656, 100, 30);
		add(stndrbtnModificar);
		
		textField = new JTextField();
		textField.setBounds(566, 647, 110, 23);
		add(textField);
		textField.setColumns(10);
	}
}
