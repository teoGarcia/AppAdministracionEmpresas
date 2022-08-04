package CuartoMedio.DesarolloBienestar.RegistroAusenciaEmpleado.AusenciaEmpleado.Imprimir;

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

import CuartoMedio.DesarolloBienestar.RegistroAusenciaEmpleado.AusenciaEmpleado.AusenciaEmpleadoEntity;
import core.Helpers;

public class PanelImprimir extends JPanel implements Printable{
	private JLabel lblMotivo;
	private JLabel lblFecha;
	private JLabel lblDiasTomados;
	private JLabel lblNombre;

	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("El Se\u00F1or (a)");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(53, 145, 72, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Presupuesto de Capacitacion");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 70, 584, 33);
		add(lblNewLabel_3);
		
		lblNombre = new JLabel("Teofilo Marfran Garcia Zambrano Albajad");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNombre.setBounds(129, 145, 261, 22);
		add(lblNombre);
		
		JLabel lblMotivolabel = new JLabel("Motivo:");
		lblMotivolabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblMotivolabel.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblMotivolabel.setBounds(53, 233, 52, 22);
		add(lblMotivolabel);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tiene registrada una ausencia");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(387, 145, 154, 22);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("definida de la siguiente manera:");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_2_1_1.setBounds(53, 174, 183, 22);
		add(lblNewLabel_2_1_1);
		
		JLabel lblFechalabel = new JLabel("Fecha:");
		lblFechalabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechalabel.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFechalabel.setBounds(53, 273, 52, 22);
		add(lblFechalabel);
		
		JLabel lblDiasTomadoslabel = new JLabel("Dias Tomados:");
		lblDiasTomadoslabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblDiasTomadoslabel.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblDiasTomadoslabel.setBounds(53, 315, 83, 22);
		add(lblDiasTomadoslabel);
		
		lblMotivo = new JLabel("Teofilo Marfran Garcia Zambrano Albajad");
		lblMotivo.setHorizontalAlignment(SwingConstants.LEFT);
		lblMotivo.setFont(new Font("Dialog", Font.BOLD, 10));
		lblMotivo.setBounds(167, 233, 374, 22);
		add(lblMotivo);
		
		lblFecha = new JLabel("Teofilo Marfran Garcia Zambrano Albajad");
		lblFecha.setHorizontalAlignment(SwingConstants.LEFT);
		lblFecha.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFecha.setBounds(167, 273, 374, 22);
		add(lblFecha);
		
		lblDiasTomados = new JLabel("Teofilo Marfran Garcia Zambrano Albajad");
		lblDiasTomados.setHorizontalAlignment(SwingConstants.LEFT);
		lblDiasTomados.setFont(new Font("Dialog", Font.BOLD, 10));
		lblDiasTomados.setBounds(167, 315, 374, 22);
		add(lblDiasTomados);

	}
	
	public void CargarForm(AusenciaEmpleadoEntity ape) {
		
		lblNombre.setText(ape.getNombre());
		lblFecha.setText(Helpers.getFechaFormat(ape.getFecha()));
		lblMotivo.setText(ape.getMotivo());
		lblDiasTomados.setText(""+ape.getTotalDias());
		
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

	public JLabel getLblMotivo() {
		return lblMotivo;
	}

	public JLabel getLblFecha() {
		return lblFecha;
	}

	public JLabel getLblDiasTomados() {
		return lblDiasTomados;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public void setLblMotivo(JLabel lblMotivo) {
		this.lblMotivo = lblMotivo;
	}

	public void setLblFecha(JLabel lblFecha) {
		this.lblFecha = lblFecha;
	}

	public void setLblDiasTomados(JLabel lblDiasTomados) {
		this.lblDiasTomados = lblDiasTomados;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}
}
