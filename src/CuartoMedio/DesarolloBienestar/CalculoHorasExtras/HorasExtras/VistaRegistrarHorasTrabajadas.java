package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.HorasExtras;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import ui.Labels.LabelSubtitulos;
import java.awt.Color;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JFormattedTextField;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaRegistrarHorasTrabajadas extends JPanel {

	/**
	 * Create the panel.
	 */
	public VistaRegistrarHorasTrabajadas() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrar Horas Trabajadas");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 50, 774, 30);
		add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsNombre = new LabelSubtitulos("Nombre");
		lblsbtlsNombre.setBounds(115, 223, 99, 20);
		add(lblsbtlsNombre);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(224, 224, 457, 20);
		add(comboBox);
		
		LabelSubtitulos lblsbtlsFecha = new LabelSubtitulos("Fecha");
		lblsbtlsFecha.setBounds(115, 282, 99, 20);
		add(lblsbtlsFecha);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(224, 282, 158, 20);
		add(dateChooser);
		
		LabelSubtitulos lblsbtlsHoraEntrada = new LabelSubtitulos("Hora Entrada");
		lblsbtlsHoraEntrada.setBounds(115, 345, 99, 20);
		add(lblsbtlsHoraEntrada);
		
		LabelSubtitulos lblsbtlsHoraSalida = new LabelSubtitulos("Hora Salida");
		lblsbtlsHoraSalida.setBounds(439, 345, 99, 20);
		add(lblsbtlsHoraSalida);
		
		TextSoloNumeros textSoloNumeros = new TextSoloNumeros();
		textSoloNumeros.setHorizontalAlignment(SwingConstants.CENTER);
		textSoloNumeros.setText("00");
		textSoloNumeros.setBounds(224, 346, 25, 20);
		add(textSoloNumeros);
		
		TextSoloNumeros textSoloNumeros_1 = new TextSoloNumeros();
		textSoloNumeros_1.setHorizontalAlignment(SwingConstants.CENTER);
		textSoloNumeros_1.setText("00");
		textSoloNumeros_1.setBounds(258, 346, 25, 20);
		add(textSoloNumeros_1);
		
		LabelSubtitulos lblsbtlsPp = new LabelSubtitulos(":");
		lblsbtlsPp.setForeground(Color.WHITE);
		lblsbtlsPp.setFont(new Font("Dialog", Font.BOLD, 14));
		lblsbtlsPp.setBounds(251, 344, 10, 20);
		add(lblsbtlsPp);
		
		TextSoloNumeros textSoloNumeros_2 = new TextSoloNumeros();
		textSoloNumeros_2.setText("00");
		textSoloNumeros_2.setHorizontalAlignment(SwingConstants.CENTER);
		textSoloNumeros_2.setBounds(535, 347, 25, 20);
		add(textSoloNumeros_2);
		
		LabelSubtitulos lblsbtlsPp_1 = new LabelSubtitulos(":");
		lblsbtlsPp_1.setForeground(Color.WHITE);
		lblsbtlsPp_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblsbtlsPp_1.setBounds(562, 345, 10, 20);
		add(lblsbtlsPp_1);
		
		TextSoloNumeros textSoloNumeros_1_1 = new TextSoloNumeros();
		textSoloNumeros_1_1.setText("00");
		textSoloNumeros_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		textSoloNumeros_1_1.setBounds(569, 347, 25, 20);
		add(textSoloNumeros_1_1);
		
		StandarButton stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		stndrbtnGuardar.setBounds(306, 494, 145, 38);
		add(stndrbtnGuardar);

	}
}
