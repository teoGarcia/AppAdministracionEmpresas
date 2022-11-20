package TerceroMedio.GestionComercialTrib.Cotizacion.Imprimir;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import core.Helpers;
import ui.TablaUi.TableStandard;
import javax.swing.JEditorPane;

public class PanelImprimir extends JPanel implements Printable{
		
		private JLabel lblTotal;
		private TableStandard table;
		private JLabel lblNumCot;
		private JLabel lblIVA;
		private JLabel lblNeto;
		private JEditorPane txtTerminosCondiciones;
		private JLabel lbl_Total1;
		private JLabel lblEmail;
		private JLabel lblComuna;
		private JLabel lblGiro;
		private JLabel lblTelefono;
		private JLabel lblDireccion;
		private JLabel lblRut;
		private JLabel lblRazonSocial;
		private JLabel lblFechaValidaHasta;
		private JLabel lblFechaEmision;
		private JScrollPane scrollPane;
		
		public PanelImprimir() {
			
			setBackground(Color.WHITE);
			
			setBounds(0, 40, 584, 700);
			setLayout(null);
			
			JLabel lblNewLabel_2 = new JLabel("Razon Social:");
			lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2.setBounds(70, 123, 69, 22);
			add(lblNewLabel_2);
			
			JLabel lblNewLabel_2_4_1 = new JLabel("Giro:");
			lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2_4_1.setBounds(300, 149, 61, 22);
			add(lblNewLabel_2_4_1);
			
			JLabel lblNewLabel_2_1_3_1 = new JLabel("Rut:");
			lblNewLabel_2_1_3_1.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2_1_3_1.setBounds(70, 149, 69, 22);
			add(lblNewLabel_2_1_3_1);
			
			JLabel lblNewLabel_3 = new JLabel("Cotizacion Nro.");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
			lblNewLabel_3.setBounds(181, 83, 131, 33);
			add(lblNewLabel_3);
			
			lbl_Total1 = new JLabel("Total");
			lbl_Total1.setFont(new Font("Dialog", Font.BOLD, 9));
			lbl_Total1.setBounds(405, 614, 36, 22);
			add(lbl_Total1);
			
			lblTotal = new JLabel("");
			lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
			lblTotal.setFont(new Font("Dialog", Font.BOLD, 9));
			lblTotal.setBounds(451, 614, 69, 22);
			add(lblTotal);
			
			scrollPane = new JScrollPane();
			scrollPane.setBounds(70, 234, 450, 329);
			add(scrollPane);
			
			table = new TableStandard();
			table.setFont(new Font("Dialog", Font.PLAIN, 9));
			String[] columns = new String[] { "Id", "Descripcion", "$ Valor Uni.", "Cantidad", "$ Neto",
					"$ IVA", "$ Total" };
			table.setColums(columns);
			table.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 9));
			table.getColumnModel().getColumn(0).setPreferredWidth(60);
			table.getColumnModel().getColumn(1).setPreferredWidth(300);
			table.getColumnModel().getColumn(2).setPreferredWidth(120);
			table.getColumnModel().getColumn(3).setPreferredWidth(120);
			table.getColumnModel().getColumn(4).setPreferredWidth(120);
			table.getColumnModel().getColumn(5).setPreferredWidth(120);
			table.getColumnModel().getColumn(6).setPreferredWidth(120);
			
			scrollPane.setViewportView(table);
			
			lblNumCot = new JLabel("00000");
			lblNumCot.setHorizontalAlignment(SwingConstants.LEFT);
			lblNumCot.setFont(new Font("Dialog", Font.BOLD, 15));
			lblNumCot.setBounds(314, 83, 109, 33);
			add(lblNumCot);
			
			JLabel lblNewLabel_2_1_3_1_1 = new JLabel("Direccion:");
			lblNewLabel_2_1_3_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2_1_3_1_1.setBounds(70, 176, 69, 22);
			add(lblNewLabel_2_1_3_1_1);
			
			JLabel lblNewLabel_2_4_1_1 = new JLabel("Comuna:");
			lblNewLabel_2_4_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2_4_1_1.setBounds(300, 176, 61, 22);
			add(lblNewLabel_2_4_1_1);
			
			JLabel lblNewLabel_2_1_3_1_2 = new JLabel("Telefono:");
			lblNewLabel_2_1_3_1_2.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2_1_3_1_2.setBounds(70, 202, 52, 22);
			add(lblNewLabel_2_1_3_1_2);
			
			JLabel lblNewLabel_2_4_1_2 = new JLabel("E-mail:");
			lblNewLabel_2_4_1_2.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2_4_1_2.setBounds(300, 198, 61, 22);
			add(lblNewLabel_2_4_1_2);
			
			JLabel lblNewLabel_2_4_1_3 = new JLabel("Terminos y condiciones");
			lblNewLabel_2_4_1_3.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2_4_1_3.setBounds(70, 572, 143, 22);
			add(lblNewLabel_2_4_1_3);
			
			JLabel lblNewLabel_2_4_1_4 = new JLabel("Neto");
			lblNewLabel_2_4_1_4.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2_4_1_4.setBounds(405, 572, 30, 22);
			add(lblNewLabel_2_4_1_4);
			
			lblNeto = new JLabel("");
			lblNeto.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNeto.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNeto.setBounds(451, 572, 69, 22);
			add(lblNeto);
			
			JLabel lblNewLabel_2_4_1_5 = new JLabel("IVA");
			lblNewLabel_2_4_1_5.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2_4_1_5.setBounds(405, 594, 30, 22);
			add(lblNewLabel_2_4_1_5);
			
			lblIVA = new JLabel("");
			lblIVA.setHorizontalAlignment(SwingConstants.RIGHT);
			lblIVA.setFont(new Font("Dialog", Font.BOLD, 9));
			lblIVA.setBounds(451, 594, 69, 22);
			add(lblIVA);
			
			txtTerminosCondiciones = new JEditorPane();
			txtTerminosCondiciones.setFont(new Font("Dialog", Font.PLAIN, 9));
			txtTerminosCondiciones.setBounds(70, 594, 269, 33);
			add(txtTerminosCondiciones);
			
			lblRazonSocial = new JLabel("800.000.000");
			lblRazonSocial.setHorizontalAlignment(SwingConstants.LEFT);
			lblRazonSocial.setFont(new Font("Dialog", Font.PLAIN, 9));
			lblRazonSocial.setBounds(149, 123, 371, 22);
			add(lblRazonSocial);
			
			lblRut = new JLabel("800.000.000");
			lblRut.setHorizontalAlignment(SwingConstants.LEFT);
			lblRut.setFont(new Font("Dialog", Font.PLAIN, 9));
			lblRut.setBounds(149, 149, 141, 22);
			add(lblRut);
			
			lblTelefono = new JLabel("800.000.000");
			lblTelefono.setHorizontalAlignment(SwingConstants.LEFT);
			lblTelefono.setFont(new Font("Dialog", Font.PLAIN, 9));
			lblTelefono.setBounds(149, 202, 141, 22);
			add(lblTelefono);
			
			lblDireccion = new JLabel("800.000.000");
			lblDireccion.setHorizontalAlignment(SwingConstants.LEFT);
			lblDireccion.setFont(new Font("Dialog", Font.PLAIN, 9));
			lblDireccion.setBounds(149, 176, 141, 22);
			add(lblDireccion);
			
			JLabel lblNewLabel_2_4_1_4_1 = new JLabel("$");
			lblNewLabel_2_4_1_4_1.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2_4_1_4_1.setBounds(435, 572, 16, 22);
			add(lblNewLabel_2_4_1_4_1);
			
			JLabel lblNewLabel_2_4_1_4_1_1 = new JLabel("$");
			lblNewLabel_2_4_1_4_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2_4_1_4_1_1.setBounds(435, 594, 16, 22);
			add(lblNewLabel_2_4_1_4_1_1);
			
			JLabel lblNewLabel_2_4_1_4_1_2 = new JLabel("$");
			lblNewLabel_2_4_1_4_1_2.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2_4_1_4_1_2.setBounds(435, 614, 16, 22);
			add(lblNewLabel_2_4_1_4_1_2);
			
			lblEmail = new JLabel("800.000.000");
			lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
			lblEmail.setFont(new Font("Dialog", Font.PLAIN, 9));
			lblEmail.setBounds(379, 202, 141, 22);
			add(lblEmail);
			
			lblComuna = new JLabel("800.000.000");
			lblComuna.setHorizontalAlignment(SwingConstants.RIGHT);
			lblComuna.setFont(new Font("Dialog", Font.PLAIN, 9));
			lblComuna.setBounds(379, 176, 141, 22);
			add(lblComuna);
			
			lblGiro = new JLabel("800.000.000");
			lblGiro.setHorizontalAlignment(SwingConstants.RIGHT);
			lblGiro.setFont(new Font("Dialog", Font.PLAIN, 9));
			lblGiro.setBounds(379, 149, 141, 22);
			add(lblGiro);
			
			JLabel lblNewLabel_2_4_1_4_2 = new JLabel("Fecha Emision");
			lblNewLabel_2_4_1_4_2.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2_4_1_4_2.setBounds(371, 38, 80, 22);
			add(lblNewLabel_2_4_1_4_2);
			
			lblFechaEmision = new JLabel("");
			lblFechaEmision.setForeground(Color.BLACK);
			lblFechaEmision.setBackground(Color.WHITE);
			lblFechaEmision.setHorizontalAlignment(SwingConstants.RIGHT);
			lblFechaEmision.setFont(new Font("Dialog", Font.PLAIN, 9));
			lblFechaEmision.setBounds(451, 38, 69, 22);
			add(lblFechaEmision);
			
			JLabel lblNewLabel_2_4_1_4_3 = new JLabel("Valida Hasta");
			lblNewLabel_2_4_1_4_3.setFont(new Font("Dialog", Font.BOLD, 9));
			lblNewLabel_2_4_1_4_3.setBounds(371, 63, 80, 22);
			add(lblNewLabel_2_4_1_4_3);
			
			lblFechaValidaHasta = new JLabel("");
			lblFechaValidaHasta.setForeground(Color.BLACK);
			lblFechaValidaHasta.setBackground(Color.WHITE);
			lblFechaValidaHasta.setHorizontalAlignment(SwingConstants.RIGHT);
			lblFechaValidaHasta.setFont(new Font("Dialog", Font.PLAIN, 9));
			lblFechaValidaHasta.setBounds(451, 63, 69, 22);
			add(lblFechaValidaHasta);
			
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
		
		
		public void calcularTotalImprimir() {
			
			int total = 0;
			  
			for(int i=0; i<this.table.getRowCount(); i++) { 
				total += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 6))); 
			}
			
			int Neto = (int) (total/1.19); 
			int IVA = total - Neto;
		
			lblTotal.setText(Helpers.ponerPuntos(""+total));
			lblNeto.setText(Helpers.ponerPuntos(""+Neto));
			lblIVA.setText(Helpers.ponerPuntos(""+IVA));
			 
		}
		
		
		public DefaultTableModel getModelTableImprimir() {
			return table.getModel();
		}

		public TableStandard getTable() {
			return table;
		}

		public void setTable(TableStandard table) {
			this.table = table;
		}

		public JLabel getLblNumCot() {
			return lblNumCot;
		}

		public void setLblNumCot(JLabel lblNumCot) {
			this.lblNumCot = lblNumCot;
		}

		public JLabel getLblIVA() {
			return lblIVA;
		}

		public void setLblIVA(JLabel lblIVA) {
			this.lblIVA = lblIVA;
		}

		public JLabel getLblNeto() {
			return lblNeto;
		}

		public void setLblNeto(JLabel lblNeto) {
			this.lblNeto = lblNeto;
		}

		public JEditorPane getTxtTerminosCondiciones() {
			return txtTerminosCondiciones;
		}

		public void setTxtTerminosCondiciones(JEditorPane txtTerminosCondiciones) {
			this.txtTerminosCondiciones = txtTerminosCondiciones;
		}

		public JLabel getLbl_Total1() {
			return lbl_Total1;
		}

		public void setLbl_Total1(JLabel lbl_Total1) {
			this.lbl_Total1 = lbl_Total1;
		}

		public JLabel getLblTotal() {
			return lblTotal;
		}

		public void setLblTotal(JLabel lblTotal) {
			this.lblTotal = lblTotal;
		}

		public JLabel getLblEmail() {
			return lblEmail;
		}

		public void setLblEmail(JLabel lblEmail) {
			this.lblEmail = lblEmail;
		}

		public JLabel getLblComuna() {
			return lblComuna;
		}

		public void setLblComuna(JLabel lblComuna) {
			this.lblComuna = lblComuna;
		}

		public JLabel getLblGiro() {
			return lblGiro;
		}

		public void setLblGiro(JLabel lblGiro) {
			this.lblGiro = lblGiro;
		}

		public JLabel getLblTelefono() {
			return lblTelefono;
		}

		public void setLblTelefono(JLabel lblTelefono) {
			this.lblTelefono = lblTelefono;
		}

		public JLabel getLblDireccion() {
			return lblDireccion;
		}

		public void setLblDireccion(JLabel lblDireccion) {
			this.lblDireccion = lblDireccion;
		}

		public JLabel getLblRut() {
			return lblRut;
		}

		public void setLblRut(JLabel lblRut) {
			this.lblRut = lblRut;
		}

		public JLabel getLblRazonSocial() {
			return lblRazonSocial;
		}

		public void setLblRazonSocial(JLabel lblRazonSocial) {
			this.lblRazonSocial = lblRazonSocial;
		}

		public JLabel getLblFechaValidaHasta() {
			return lblFechaValidaHasta;
		}

		public void setLblFechaValidaHasta(JLabel lblFechaValidaHasta) {
			this.lblFechaValidaHasta = lblFechaValidaHasta;
		}

		public JLabel getLblFechaEmision() {
			return lblFechaEmision;
		}

		public void setLblFechaEmision(JLabel lblFechaEmision) {
			this.lblFechaEmision = lblFechaEmision;
		}

		public JScrollPane getScrollPane() {
			return scrollPane;
		}

		public void setScrollPane(JScrollPane scrollPane) {
			this.scrollPane = scrollPane;
		}
}
