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
import javax.swing.JFormattedTextField;
import com.toedter.calendar.JDayChooser;

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
		
		LabelSubtitulos lblsbtlsCantidadDeHoras = new LabelSubtitulos("Cantidad de Horas Jornada Laboral + Almuerzo (Regular)");
		lblsbtlsCantidadDeHoras.setBounds(82, 150, 356, 21);
		add(lblsbtlsCantidadDeHoras);
		
		LabelSubtitulos lblsbtlsCantidadDeHoras_6 = new LabelSubtitulos("Cantidad de Horas Jornada Laboral Sabado (Regular)");
		lblsbtlsCantidadDeHoras_6.setBounds(82, 220, 356, 21);
		add(lblsbtlsCantidadDeHoras_6);
		
		LabelSubtitulos lblsbtlsCantidadDeHoras_1 = new LabelSubtitulos("Cantidad de Horas Jornada Laboral Domingo (Regular)");
		lblsbtlsCantidadDeHoras_1.setBounds(82, 290, 356, 21);
		add(lblsbtlsCantidadDeHoras_1);
		
		LabelSubtitulos lblsbtlsValorHoraExtra = new LabelSubtitulos("Valor Hora Extra Normal");
		lblsbtlsValorHoraExtra.setBounds(82, 360, 356, 21);
		add(lblsbtlsValorHoraExtra);
		
		LabelSubtitulos lblsbtlsValorHoraExtra_1 = new LabelSubtitulos("Valor Hora Extra Extraordinaria (Solo aplica los Domingos)");
		lblsbtlsValorHoraExtra_1.setBounds(82, 430, 356, 21);
		add(lblsbtlsValorHoraExtra_1);
		
		LabelSubtitulos lblsbtlsPrecioPorHora = new LabelSubtitulos("Precio por Hora Normal");
		lblsbtlsPrecioPorHora.setBounds(82, 500, 356, 21);
		add(lblsbtlsPrecioPorHora);
		
		TextSoloNumeros textSoloNumeros = new TextSoloNumeros();
		textSoloNumeros.setBounds(560, 360, 87, 20);
		add(textSoloNumeros);
		
		TextSoloNumeros textSoloNumeros_1 = new TextSoloNumeros();
		textSoloNumeros_1.setBounds(560, 430, 87, 20);
		add(textSoloNumeros_1);
		
		TextSoloNumeros textSoloNumeros_2 = new TextSoloNumeros();
		textSoloNumeros_2.setBounds(560, 500, 87, 20);
		add(textSoloNumeros_2);
		
		StandarButton stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(319, 648, 133, 37);
		add(stndrbtnGuardar);
		
		TextSoloNumeros textSoloNumeros_3 = new TextSoloNumeros();
		textSoloNumeros_3.setBounds(560, 151, 87, 20);
		add(textSoloNumeros_3);
		
		LabelSubtitulos lblsbtlsHoras = new LabelSubtitulos("Horas");
		lblsbtlsHoras.setBounds(654, 151, 77, 21);
		add(lblsbtlsHoras);
		
		TextSoloNumeros textSoloNumeros_3_1 = new TextSoloNumeros();
		textSoloNumeros_3_1.setBounds(560, 220, 87, 20);
		add(textSoloNumeros_3_1);
		
		LabelSubtitulos lblsbtlsHoras_1 = new LabelSubtitulos("Horas");
		lblsbtlsHoras_1.setBounds(654, 220, 77, 21);
		add(lblsbtlsHoras_1);
		
		TextSoloNumeros textSoloNumeros_3_1_1 = new TextSoloNumeros();
		textSoloNumeros_3_1_1.setBounds(560, 290, 87, 20);
		add(textSoloNumeros_3_1_1);
		
		LabelSubtitulos lblsbtlsHoras_1_1 = new LabelSubtitulos("Horas");
		lblsbtlsHoras_1_1.setBounds(654, 290, 77, 21);
		add(lblsbtlsHoras_1_1);
		
		LabelSubtitulos lblsbtlsHoras_1_1_1 = new LabelSubtitulos("% (Porcentaje)");
		lblsbtlsHoras_1_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblsbtlsHoras_1_1_1.setBounds(654, 360, 95, 21);
		add(lblsbtlsHoras_1_1_1);
		
		LabelSubtitulos labelSubtitulos = new LabelSubtitulos("$");
		labelSubtitulos.setBounds(657, 500, 28, 21);
		add(labelSubtitulos);
		
		LabelSubtitulos lblsbtlsHoras_1_1_1_1 = new LabelSubtitulos("% (Porcentaje)");
		lblsbtlsHoras_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblsbtlsHoras_1_1_1_1.setBounds(654, 430, 95, 21);
		add(lblsbtlsHoras_1_1_1_1);
		

	}
}
