package CuartoMedio.DesarolloBienestar.CalculoHorasExtras.Imprimir;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import CuartoMedio.DesarolloBienestar.CalculoHorasExtras.HorasTrabajadasEntity;
import CuartoMedio.DotacionPersonal.PerfilEmpleado.PerfilEmpleadoEntity;

public class PanelImprimirCalculoHE extends JPanel implements Printable {
	
	private JLabel lblNombre;
	private JLabel lblFechaDesde;
	private JLabel lblFechaHasta;
	private JLabel lblHorasExtras;
	private JLabel lblHorasExtrasExtrao;
	private JLabel lblTotalHorasExtras;
	private JLabel lblTotalHorasExtrasExtrao;

	/**
	 * Create the panel.
	 */
	public PanelImprimirCalculoHE() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		JLabel lblNewLabel_2 = new JLabel("El Sr. (a) ");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2.setBounds(92, 146, 50, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Horas Extras");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 84, 584, 33);
		add(lblNewLabel_3);
		
		lblNombre = new JLabel("");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNombre.setBounds(152, 146, 221, 22);
		add(lblNombre);
		
		JLabel lblNewLabel_2_1 = new JLabel("en el rango de fecha desde");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1.setBounds(373, 146, 146, 22);
		add(lblNewLabel_2_1);
		
		lblFechaDesde = new JLabel("");
		lblFechaDesde.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaDesde.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFechaDesde.setBounds(57, 171, 72, 22);
		add(lblFechaDesde);
		
		JLabel lblNewLabel_2_2 = new JLabel("Hasta");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_2.setBounds(130, 171, 50, 22);
		add(lblNewLabel_2_2);
		
		lblFechaHasta = new JLabel("");
		lblFechaHasta.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaHasta.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFechaHasta.setBounds(180, 171, 72, 22);
		add(lblFechaHasta);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Tiene las Horas Extras y Horas Extras Extraordinarias");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_1.setBounds(243, 171, 276, 22);
		add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("divididas de la siguiente manera:");
		lblNewLabel_2_3.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_3.setBounds(57, 196, 195, 22);
		add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Horas Extras:");
		lblNewLabel_2_3_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_3_1.setBounds(57, 271, 72, 22);
		add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Horas Extras Extraordinarias:");
		lblNewLabel_2_3_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_3_2.setBounds(57, 304, 185, 22);
		add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("Total Horas Extras:");
		lblNewLabel_2_3_2_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_3_2_1.setBounds(57, 337, 212, 22);
		add(lblNewLabel_2_3_2_1);
		
		JLabel lblNewLabel_2_3_2_1_1 = new JLabel("Total Horas Extras Extraordinarias:");
		lblNewLabel_2_3_2_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_3_2_1_1.setBounds(57, 372, 212, 22);
		add(lblNewLabel_2_3_2_1_1);
		
		lblHorasExtras = new JLabel("");
		lblHorasExtras.setFont(new Font("Dialog", Font.BOLD, 10));
		lblHorasExtras.setBounds(298, 271, 110, 22);
		add(lblHorasExtras);
		
		lblHorasExtrasExtrao = new JLabel("");
		lblHorasExtrasExtrao.setFont(new Font("Dialog", Font.BOLD, 10));
		lblHorasExtrasExtrao.setBounds(298, 304, 110, 22);
		add(lblHorasExtrasExtrao);
		
		lblTotalHorasExtras = new JLabel("");
		lblTotalHorasExtras.setFont(new Font("Dialog", Font.BOLD, 10));
		lblTotalHorasExtras.setBounds(298, 337, 110, 22);
		add(lblTotalHorasExtras);
		
		lblTotalHorasExtrasExtrao = new JLabel("");
		lblTotalHorasExtrasExtrao.setFont(new Font("Dialog", Font.BOLD, 10));
		lblTotalHorasExtrasExtrao.setBounds(298, 372, 110, 22);
		add(lblTotalHorasExtrasExtrao);

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
	
	public void CargarForm(HorasTrabajadasEntity ape) {
		
		lblNombre.setText(ape.getNombre());
		
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public JLabel getLblFechaDesde() {
		return lblFechaDesde;
	}

	public JLabel getLblFechaHasta() {
		return lblFechaHasta;
	}

	public JLabel getLblHorasExtras() {
		return lblHorasExtras;
	}

	public JLabel getLblHorasExtrasExtrao() {
		return lblHorasExtrasExtrao;
	}

	public JLabel getLblTotalHorasExtras() {
		return lblTotalHorasExtras;
	}

	public JLabel getLblTotalHorasExtrasExtrao() {
		return lblTotalHorasExtrasExtrao;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	public void setLblFechaDesde(JLabel lblFechaDesde) {
		this.lblFechaDesde = lblFechaDesde;
	}

	public void setLblFechaHasta(JLabel lblFechaHasta) {
		this.lblFechaHasta = lblFechaHasta;
	}

	public void setLblHorasExtras(JLabel lblHorasExtras) {
		this.lblHorasExtras = lblHorasExtras;
	}

	public void setLblHorasExtrasExtrao(JLabel lblHorasExtrasExtrao) {
		this.lblHorasExtrasExtrao = lblHorasExtrasExtrao;
	}

	public void setLblTotalHorasExtras(JLabel lblTotalHorasExtras) {
		this.lblTotalHorasExtras = lblTotalHorasExtras;
	}

	public void setLblTotalHorasExtrasExtrao(JLabel lblTotalHorasExtrasExtrao) {
		this.lblTotalHorasExtrasExtrao = lblTotalHorasExtrasExtrao;
	}

}
