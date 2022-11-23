
package TerceroMedio.OrganizacionOficinas.InventariosDocFisicosDigitales.Imprimir;

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

import TerceroMedio.OrganizacionOficinas.InventariosDocFisicosDigitales.InventarioDocFisDigEntity;
import TerceroMedio.ProcesosAdministrativos.CalendarioProduccion.CalendarioProduccion3;
import core.Helpers;

public class PanelImprimir extends JPanel implements Printable{
	
	private JLabel lblTipoDocumento;
	private JLabel lblNumDocumento;
	private JLabel lblDocumento;
	private JLabel lblMotivo;
	private JLabel lblRecibidoPor;
	private JLabel lblFecha;
	private JLabel lblCopiaArchivada;
	private JLabel lblUbicArchivo;
	private JLabel lblPersonaAreaRespo;
	private JLabel lblHora;

	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Documento:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2.setBounds(53, 208, 103, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Documentos F\u00EDsicos y Digitales");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 101, 584, 33);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("N\u00B0 de Documento:");
		lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1.setBounds(300, 209, 91, 22);
		add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Tipo de Documento:");
		lblNewLabel_2_1_3_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_3_1.setBounds(53, 259, 103, 22);
		add(lblNewLabel_2_1_3_1);
		
		lblDocumento = new JLabel("Nombre de proveedor:");
		lblDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		lblDocumento.setBounds(149, 208, 145, 22);
		add(lblDocumento);
		
		lblTipoDocumento = new JLabel("Nombre de proveedor:");
		lblTipoDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		lblTipoDocumento.setBounds(149, 258, 145, 22);
		add(lblTipoDocumento);
		
		lblNumDocumento = new JLabel("Nombre de proveedor:");
		lblNumDocumento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		lblNumDocumento.setBounds(390, 208, 145, 22);
		add(lblNumDocumento);
		
		JLabel lblNewLabel_2_4_1_1 = new JLabel("Motivo:");
		lblNewLabel_2_4_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_1.setBounds(300, 259, 91, 22);
		add(lblNewLabel_2_4_1_1);
		
		lblMotivo = new JLabel("Nombre de proveedor:");
		lblMotivo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMotivo.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		lblMotivo.setBounds(390, 258, 145, 22);
		add(lblMotivo);
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("Recibido Por:");
		lblNewLabel_2_1_3_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_3_1_1.setBounds(53, 310, 103, 22);
		add(lblNewLabel_2_1_3_1_1);
		
		lblRecibidoPor = new JLabel("Nombre de proveedor:");
		lblRecibidoPor.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		lblRecibidoPor.setBounds(149, 309, 145, 22);
		add(lblRecibidoPor);
		
		JLabel lblNewLabel_2_4_1_1_1 = new JLabel("Fecha");
		lblNewLabel_2_4_1_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_1_1.setBounds(300, 310, 91, 22);
		add(lblNewLabel_2_4_1_1_1);
		
		lblFecha = new JLabel("Nombre de proveedor:");
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFecha.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		lblFecha.setBounds(390, 309, 145, 22);
		add(lblFecha);
		
		JLabel lblNewLabel_2_1_3_1_1_1 = new JLabel("Copia Archivada en:");
		lblNewLabel_2_1_3_1_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_3_1_1_1.setBounds(53, 360, 103, 22);
		add(lblNewLabel_2_1_3_1_1_1);
		
		lblCopiaArchivada = new JLabel("Nombre de proveedor:");
		lblCopiaArchivada.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		lblCopiaArchivada.setBounds(149, 359, 145, 22);
		add(lblCopiaArchivada);
		
		JLabel lblNewLabel_2_4_1_1_1_1 = new JLabel("Ubic. del Archivo:");
		lblNewLabel_2_4_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_1_1_1.setBounds(300, 360, 91, 22);
		add(lblNewLabel_2_4_1_1_1_1);
		
		lblUbicArchivo = new JLabel("Nombre de proveedor:");
		lblUbicArchivo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUbicArchivo.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		lblUbicArchivo.setBounds(390, 359, 145, 22);
		add(lblUbicArchivo);
		
		JLabel lblNewLabel_2_1_3_1_1_1_1 = new JLabel("Pers. o Area Resp.");
		lblNewLabel_2_1_3_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_3_1_1_1_1.setBounds(53, 418, 103, 22);
		add(lblNewLabel_2_1_3_1_1_1_1);
		
		lblPersonaAreaRespo = new JLabel("Nombre de proveedor:");
		lblPersonaAreaRespo.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		lblPersonaAreaRespo.setBounds(149, 417, 212, 22);
		add(lblPersonaAreaRespo);
		
		JLabel lblNewLabel_2_4_1_1_1_1_1 = new JLabel("Hora:");
		lblNewLabel_2_4_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_1_1_1_1.setBounds(371, 418, 61, 22);
		add(lblNewLabel_2_4_1_1_1_1_1);
		
		lblHora = new JLabel("Nombre de proveedor:");
		lblHora.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHora.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		lblHora.setBounds(412, 417, 123, 22);
		add(lblHora);
		
	}
	
	public void CargarForm(InventarioDocFisDigEntity ape) {
		
		lblDocumento.setText(""+ape.getDocumento());
		lblNumDocumento.setText(ape.getNumeroDocumento());
		lblTipoDocumento.setText(ape.getTipoDocumento());
		lblMotivo.setText(ape.getMotivo());
		lblRecibidoPor.setText(ape.getRecibidoPor());
		lblFecha.setText(Helpers.getFechaFormat(ape.getFecha()));
		lblCopiaArchivada.setText(ape.getCopiaArchivada());
		lblUbicArchivo.setText(ape.getUbicacionArchivo());
		lblPersonaAreaRespo.setText(ape.getPersonaAreaRespon());
		lblHora.setText(ape.getHora());
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

	public JLabel getLblTipoDocumento() {
		return lblTipoDocumento;
	}

	public JLabel getLblNumDocumento() {
		return lblNumDocumento;
	}

	public JLabel getLblDocumento() {
		return lblDocumento;
	}

	public JLabel getLblMotivo() {
		return lblMotivo;
	}

	public JLabel getLblRecibidoPor() {
		return lblRecibidoPor;
	}

	public JLabel getLblFecha() {
		return lblFecha;
	}

	public JLabel getLblCopiaArchivada() {
		return lblCopiaArchivada;
	}

	public JLabel getLblUbicArchivo() {
		return lblUbicArchivo;
	}

	public JLabel getLblPersonaAreaRespo() {
		return lblPersonaAreaRespo;
	}

	public JLabel getLblHora() {
		return lblHora;
	}

	public void setLblTipoDocumento(JLabel lblTipoDocumento) {
		this.lblTipoDocumento = lblTipoDocumento;
	}

	public void setLblNumDocumento(JLabel lblNumDocumento) {
		this.lblNumDocumento = lblNumDocumento;
	}

	public void setLblDocumento(JLabel lblDocumento) {
		this.lblDocumento = lblDocumento;
	}

	public void setLblMotivo(JLabel lblMotivo) {
		this.lblMotivo = lblMotivo;
	}

	public void setLblRecibidoPor(JLabel lblRecibidoPor) {
		this.lblRecibidoPor = lblRecibidoPor;
	}

	public void setLblFecha(JLabel lblFecha) {
		this.lblFecha = lblFecha;
	}

	public void setLblCopiaArchivada(JLabel lblCopiaArchivada) {
		this.lblCopiaArchivada = lblCopiaArchivada;
	}

	public void setLblUbicArchivo(JLabel lblUbicArchivo) {
		this.lblUbicArchivo = lblUbicArchivo;
	}

	public void setLblPersonaAreaRespo(JLabel lblPersonaAreaRespo) {
		this.lblPersonaAreaRespo = lblPersonaAreaRespo;
	}

	public void setLblHora(JLabel lblHora) {
		this.lblHora = lblHora;
	}
}
