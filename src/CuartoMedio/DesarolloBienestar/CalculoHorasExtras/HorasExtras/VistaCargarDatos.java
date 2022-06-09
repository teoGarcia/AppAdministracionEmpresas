package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.HorasExtras;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import com.toedter.calendar.JDateChooser;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;

public class VistaCargarDatos extends JPanel {

	/**
	 * Create the panel.
	 */
	public VistaCargarDatos() {
		
		setOpaque(false);
		setBounds(0, 0, 774, 722);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cargar Datos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 55, 774, 30);
		add(lblNewLabel);
		
		LabelSubtitulos lblsbtlsCantidadDeHoras = new LabelSubtitulos();
		lblsbtlsCantidadDeHoras.setText("Cantidad de Horas Jornada Laboral + Almuerzo (Regular)");
		lblsbtlsCantidadDeHoras.setBounds(82, 150, 356, 21);
		add(lblsbtlsCantidadDeHoras);
		
		LabelSubtitulos lblsbtlsCantidadDeHoras_6 = new LabelSubtitulos();
		lblsbtlsCantidadDeHoras_6.setText("Cantidad de Horas Jornada Laboral Sabado (Regular)");
		lblsbtlsCantidadDeHoras_6.setBounds(82, 220, 356, 21);
		add(lblsbtlsCantidadDeHoras_6);
		
		LabelSubtitulos lblsbtlsCantidadDeHoras_1 = new LabelSubtitulos();
		lblsbtlsCantidadDeHoras_1.setText("Cantidad de Horas Jornada Laboral Domingo (Regular)");
		lblsbtlsCantidadDeHoras_1.setBounds(82, 290, 356, 21);
		add(lblsbtlsCantidadDeHoras_1);
		
		LabelSubtitulos lblsbtlsValorHoraExtra = new LabelSubtitulos();
		lblsbtlsValorHoraExtra.setText("Valor Hora Extra Normal");
		lblsbtlsValorHoraExtra.setBounds(82, 360, 356, 21);
		add(lblsbtlsValorHoraExtra);
		
		LabelSubtitulos lblsbtlsValorHoraExtra_1 = new LabelSubtitulos();
		lblsbtlsValorHoraExtra_1.setText("Valor Hora Extra Extraordinaria (Solo aplica los Domingos)");
		lblsbtlsValorHoraExtra_1.setBounds(82, 430, 356, 21);
		add(lblsbtlsValorHoraExtra_1);
		
		LabelSubtitulos lblsbtlsPrecioPorHora = new LabelSubtitulos();
		lblsbtlsPrecioPorHora.setText("Precio por Hora Normal");
		lblsbtlsPrecioPorHora.setBounds(82, 500, 356, 21);
		add(lblsbtlsPrecioPorHora);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd-MM-y HH-MM");
		dateChooser.setBounds(560, 150, 171, 21);
		add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(560, 220, 171, 20);
		add(dateChooser_1);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(560, 290, 171, 20);
		add(dateChooser_2);
		
		TextSoloNumeros textSoloNumeros = new TextSoloNumeros();
		textSoloNumeros.setBounds(560, 360, 171, 20);
		add(textSoloNumeros);
		
		TextSoloNumeros textSoloNumeros_1 = new TextSoloNumeros();
		textSoloNumeros_1.setBounds(560, 430, 171, 20);
		add(textSoloNumeros_1);
		
		TextSoloNumeros textSoloNumeros_2 = new TextSoloNumeros();
		textSoloNumeros_2.setBounds(560, 500, 171, 20);
		add(textSoloNumeros_2);
		
		StandarButton stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(319, 648, 133, 37);
		add(stndrbtnGuardar);

	}
}
