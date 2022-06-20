package CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import ui.Labels.LabelTitulos;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;

public class VistaRegistrarCaja extends JPanel {

	/**
	 * Create the panel.
	 */
	public VistaRegistrarCaja() {
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lbltlsRegistroDeCaja = new LabelTitulos((String) null);
		lbltlsRegistroDeCaja.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsRegistroDeCaja.setText("Registro de Caja");
		lbltlsRegistroDeCaja.setBounds(0, 60, 722, 30);
		add(lbltlsRegistroDeCaja);
		
		LabelSubtitulos lblsbtlsNroCaja = new LabelSubtitulos((String) null);
		lblsbtlsNroCaja.setText("Nro. Caja");
		lblsbtlsNroCaja.setBounds(239, 198, 97, 23);
		add(lblsbtlsNroCaja);
		
		TextSoloNumeros textSoloNumeros = new TextSoloNumeros();
		textSoloNumeros.setBounds(418, 198, 97, 23);
		add(textSoloNumeros);
		
		TextSoloNumeros textSoloNumeros_1 = new TextSoloNumeros();
		textSoloNumeros_1.setBounds(370, 249, 145, 23);
		add(textSoloNumeros_1);
		
		LabelSubtitulos lblsbtlsTipoDeCaja = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeCaja.setText("Tipo de Caja");
		lblsbtlsTipoDeCaja.setBounds(239, 249, 97, 23);
		add(lblsbtlsTipoDeCaja);
		
		TextSoloNumeros textSoloNumeros_2 = new TextSoloNumeros();
		textSoloNumeros_2.setBounds(370, 301, 145, 23);
		add(textSoloNumeros_2);
		
		LabelSubtitulos lblsbtlsResponsable = new LabelSubtitulos((String) null);
		lblsbtlsResponsable.setText("Responsable");
		lblsbtlsResponsable.setBounds(239, 301, 97, 23);
		add(lblsbtlsResponsable);
		
		StandarButton stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(320, 410, 100, 30);
		add(stndrbtnGuardar);
		

	}
}
