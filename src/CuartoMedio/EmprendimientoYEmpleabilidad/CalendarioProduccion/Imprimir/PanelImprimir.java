package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProduccion.Imprimir;

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

import CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProduccion.CalendarioProduccion;
import core.Helpers;

public class PanelImprimir extends JPanel implements Printable{
	private JLabel lblFechaInicio;
	private JLabel lblFechaTermino;
	private JLabel lblEtapa;
	private JLabel lblNombreProyecto;

	public PanelImprimir() {
		

		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de proyecto:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2.setBounds(53, 208, 122, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Calendario de produccion");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 101, 584, 33);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Etapa:");
		lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_4_1.setBounds(53, 248, 122, 22);
		add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Fecha Inicio:");
		lblNewLabel_2_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1.setBounds(53, 290, 122, 22);
		add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("Fecha Termino:");
		lblNewLabel_2_1_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_3_1_1.setBounds(328, 290, 74, 22);
		add(lblNewLabel_2_1_3_1_1);
		
		lblNombreProyecto = new JLabel("Nombre de proveedor:");
		lblNombreProyecto.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNombreProyecto.setBounds(185, 208, 349, 22);
		add(lblNombreProyecto);
		
		lblEtapa = new JLabel("Nombre de proveedor:");
		lblEtapa.setFont(new Font("Dialog", Font.BOLD, 10));
		lblEtapa.setBounds(185, 248, 349, 22);
		add(lblEtapa);
		
		lblFechaInicio = new JLabel("Nombre de proveedor:");
		lblFechaInicio.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFechaInicio.setBounds(185, 290, 133, 22);
		add(lblFechaInicio);
		
		lblFechaTermino = new JLabel("Nombre de proveedor:");
		lblFechaTermino.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaTermino.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFechaTermino.setBounds(401, 289, 133, 22);
		add(lblFechaTermino);
		
	}
	
	public void CargarForm(CalendarioProduccion ape) {
		
		lblNombreProyecto.setText(ape.getProjecto());
		lblEtapa.setText(ape.getEtapa());
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

}
