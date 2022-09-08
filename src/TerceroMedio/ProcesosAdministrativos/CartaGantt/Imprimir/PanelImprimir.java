package TerceroMedio.ProcesosAdministrativos.CartaGantt.Imprimir;

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

import TerceroMedio.ProcesosAdministrativos.CartaGantt.CartaGantt3;
import core.Helpers;

public class PanelImprimir extends JPanel implements Printable{

	private JLabel lblFechaInicio;
	private JLabel lblResponsable;
	private JLabel lblFechaTermino;
	private JLabel lblActividad;
	private JLabel lblProyecto;

	
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de proyecto:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2.setBounds(53, 181, 122, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Carta GANTT");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 101, 584, 33);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Actividad:");
		lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_1.setBounds(53, 221, 122, 22);
		add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Responsable:");
		lblNewLabel_2_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1.setBounds(53, 263, 122, 22);
		add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("Fecha Termino:");
		lblNewLabel_2_1_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_1.setBounds(324, 306, 72, 22);
		add(lblNewLabel_2_1_3_1_1);
		
		JLabel lblNewLabel_2_1_3_1_1_1 = new JLabel("Fecha Inicio:");
		lblNewLabel_2_1_3_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_1_1.setBounds(53, 306, 122, 22);
		add(lblNewLabel_2_1_3_1_1_1);
		
		lblProyecto = new JLabel("Nombre de proveedor:");
		lblProyecto.setFont(new Font("Dialog", Font.BOLD, 10));
		lblProyecto.setBounds(185, 181, 349, 22);
		add(lblProyecto);
		
		lblActividad = new JLabel("Nombre de proveedor:");
		lblActividad.setFont(new Font("Dialog", Font.BOLD, 10));
		lblActividad.setBounds(185, 221, 349, 22);
		add(lblActividad);
		
		lblResponsable = new JLabel("Nombre de proveedor:");
		lblResponsable.setFont(new Font("Dialog", Font.BOLD, 10));
		lblResponsable.setBounds(185, 263, 349, 22);
		add(lblResponsable);
		
		lblFechaInicio = new JLabel("Nombre de proveedor:");
		lblFechaInicio.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFechaInicio.setBounds(185, 306, 128, 22);
		add(lblFechaInicio);
		
		lblFechaTermino = new JLabel("Nombre de proveedor:");
		lblFechaTermino.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaTermino.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFechaTermino.setBounds(400, 305, 128, 22);
		add(lblFechaTermino);
		
		
		
	}
	
	public void CargarForm(CartaGantt3 ape) {
		
		lblProyecto.setText(ape.getProyecto());
		lblActividad.setText(ape.getActividad());
		lblResponsable.setText(ape.getResponsable());
		lblFechaInicio.setText(Helpers.getFechaFormat(ape.getFechaI()));
		lblFechaTermino.setText(Helpers.getFechaFormat(ape.getFechaT()));
		
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

	public JLabel getLblFechaInicio() {
		return lblFechaInicio;
	}

	public JLabel getLblResponsable() {
		return lblResponsable;
	}

	public JLabel getLblFechaTermino() {
		return lblFechaTermino;
	}

	public JLabel getLblActividad() {
		return lblActividad;
	}

	public JLabel getLblProyecto() {
		return lblProyecto;
	}

	public void setLblFechaInicio(JLabel lblFechaInicio) {
		this.lblFechaInicio = lblFechaInicio;
	}

	public void setLblResponsable(JLabel lblResponsable) {
		this.lblResponsable = lblResponsable;
	}

	public void setLblFechaTermino(JLabel lblFechaTermino) {
		this.lblFechaTermino = lblFechaTermino;
	}

	public void setLblActividad(JLabel lblActividad) {
		this.lblActividad = lblActividad;
	}

	public void setLblProyecto(JLabel lblProyecto) {
		this.lblProyecto = lblProyecto;
	}

}
