package CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.Imprimir;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacion;
import core.Helpers;

public class PanelImprimir extends JPanel implements Printable{
	private JLabel lblItemGlosario;
	private JLabel lblFecha;
	private JLabel lblMontoCancelar;

	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Item / Glosario:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2.setBounds(53, 145, 89, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Presupuesto de Capacitacion");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 70, 584, 33);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Fecha:");
		lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_1.setBounds(53, 185, 49, 22);
		add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Monto a Cancelar:");
		lblNewLabel_2_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1.setBounds(265, 185, 89, 22);
		add(lblNewLabel_2_1_3_1);
		
		lblItemGlosario = new JLabel("Item / Glosario:");
		lblItemGlosario.setFont(new Font("Dialog", Font.BOLD, 10));
		lblItemGlosario.setBounds(152, 145, 389, 22);
		add(lblItemGlosario);
		
		lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Dialog", Font.BOLD, 9));
		lblFecha.setBounds(152, 185, 103, 22);
		add(lblFecha);
		
		lblMontoCancelar = new JLabel("Monto a Cancelar:");
		lblMontoCancelar.setFont(new Font("Dialog", Font.BOLD, 9));
		lblMontoCancelar.setBounds(358, 185, 95, 22);
		add(lblMontoCancelar);
		
	}
	
	public void CargarForm(PresupuestoCapacitacion ape) {
		
		lblItemGlosario.setText(ape.getGlosario());
		lblFecha.setText(Helpers.getFechaFormat(ape.getFecha()));
		lblMontoCancelar.setText(Helpers.ponerPuntos(""+ape.getCancelar()));
		
	}
	
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		if(pageIndex == 0) {
			Graphics2D graphics2D = (Graphics2D) graphics;
			graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
			printAll(graphics2D);
			return PAGE_EXISTS;	
			
		}else {
			return NO_SUCH_PAGE;
			
		}

	}

	public JLabel getLblItemGlosario() {
		return lblItemGlosario;
	}

	public JLabel getLblFecha() {
		return lblFecha;
	}

	public JLabel getLblMontoCancelar() {
		return lblMontoCancelar;
	}

	public void setLblItemGlosario(JLabel lblItemGlosario) {
		this.lblItemGlosario = lblItemGlosario;
	}

	public void setLblFecha(JLabel lblFecha) {
		this.lblFecha = lblFecha;
	}

	public void setLblMontoCancelar(JLabel lblMontoCancelar) {
		this.lblMontoCancelar = lblMontoCancelar;
	}

}
