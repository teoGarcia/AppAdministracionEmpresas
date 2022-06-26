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
	
	private StandarButton btnGuardar;
	private TextSoloNumeros txtResponsable;
	private TextSoloNumeros txtTipo;
	private TextSoloNumeros txtNumero;
	
	private ControlCaja control;

	/**
	 * Create the panel.
	 */
	public VistaRegistrarCaja() {
		
		control = new ControlCaja(this);
		
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
		
		txtNumero = new TextSoloNumeros();
		txtNumero.setBounds(370, 198, 145, 23);
		add(txtNumero);
		
		txtTipo = new TextSoloNumeros();
		txtTipo.setBounds(370, 249, 145, 23);
		add(txtTipo);
		
		LabelSubtitulos lblsbtlsTipoDeCaja = new LabelSubtitulos((String) null);
		lblsbtlsTipoDeCaja.setText("Tipo de Caja");
		lblsbtlsTipoDeCaja.setBounds(239, 249, 97, 23);
		add(lblsbtlsTipoDeCaja);
		
		txtResponsable = new TextSoloNumeros();
		txtResponsable.setBounds(370, 301, 145, 23);
		add(txtResponsable);
		
		LabelSubtitulos lblsbtlsResponsable = new LabelSubtitulos((String) null);
		lblsbtlsResponsable.setText("Responsable");
		lblsbtlsResponsable.setBounds(239, 301, 97, 23);
		add(lblsbtlsResponsable);
		
		btnGuardar = new StandarButton((String) null);
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(320, 410, 100, 30);
		btnGuardar.addActionListener(control);
		add(btnGuardar);
		

	}
	
	
	public void VaciarForm() {
		txtResponsable.setText("");
		txtTipo.setText("");
		txtNumero.setText("");
	}
	
	public boolean camposVacios() {
		
		if(txtResponsable.getText().length() <= 0 || txtTipo.getText().length() <= 0 || txtNumero.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}


	public TextSoloNumeros getTxtResponsable() {
		return txtResponsable;
	}


	public void setTxtResponsable(TextSoloNumeros txtResponsable) {
		this.txtResponsable = txtResponsable;
	}


	public TextSoloNumeros getTxtTipo() {
		return txtTipo;
	}


	public void setTxtTipo(TextSoloNumeros txtTipo) {
		this.txtTipo = txtTipo;
	}


	public TextSoloNumeros getTxtNumero() {
		return txtNumero;
	}


	public void setTxtNumero(TextSoloNumeros txtNumero) {
		this.txtNumero = txtNumero;
	}
}
