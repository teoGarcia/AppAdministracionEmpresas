package TerceroMedio.GestionComercialTrib.BoletaHonorarios.Imprimir;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import core.Helpers;
import ui.TablaUi.TableStandard;

public class PanelImprimir extends JPanel implements Printable{
	
	private JLabel lblTotal;
	private TableStandard table;
	private JLabel lblTotalHonorarios;
	private JLabel lbl_Total1;
	private JLabel lblGiroTitular;
	private JLabel lblDireccionEmpresa;
	private JLabel lblRutTitular;
	private JLabel lblSenoresEmpresa;
	private JScrollPane scrollPane;
	private JLabel lblFechaE;
	private JLabel lblImpuestos;
	private JLabel lblNumeroDocBH;
	private JLabel lblRutEmpresa;
	private JLabel lblNombreTitular;
	private JLabel lblTelefonoTitular;
	private JLabel lblDireccionTitular;

	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("SEÑOR(ES):");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2.setBounds(57, 205, 69, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("GIRO:");
		lblNewLabel_2_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1.setBounds(83, 82, 61, 22);
		add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("RUT:");
		lblNewLabel_2_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_3_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_3_1.setBounds(132, 65, 69, 22);
		add(lblNewLabel_2_1_3_1);
		
		JLabel lblTipoDoc = new JLabel("BOLETA DE HONORARIOS");
		lblTipoDoc.setForeground(Color.BLACK);
		lblTipoDoc.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDoc.setFont(new Font("Arial", Font.BOLD, 12));
		lblTipoDoc.setBounds(347, 30, 169, 33);
		add(lblTipoDoc);
		
		lbl_Total1 = new JLabel("Total");
		lbl_Total1.setFont(new Font("Dialog", Font.BOLD, 9));
		lbl_Total1.setBounds(347, 650, 50, 22);
		add(lbl_Total1);
		
		lblTotal = new JLabel("");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 9));
		lblTotal.setBounds(447, 650, 79, 22);
		add(lblTotal);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(57, 283, 475, 297);
		add(scrollPane);
		
		table = new TableStandard();
		table.setFont(new Font("Dialog", Font.PLAIN, 9));
		String[] columns = new String[] { "ID", "Descripcion", "$ Total" };
		
		table.setColums(columns);
		table.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 9));
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(350);
		table.getColumnModel().getColumn(2).setPreferredWidth(120);
		
		
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("DIRECCION:");
		lblNewLabel_2_1_3_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_3_1_1.setBounds(57, 229, 69, 22);
		add(lblNewLabel_2_1_3_1_1);
		
		JLabel lblNewLabel_2_4_1_4 = new JLabel("Total honorarios");
		lblNewLabel_2_4_1_4.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4.setBounds(347, 590, 90, 22);
		add(lblNewLabel_2_4_1_4);
		
		lblTotalHonorarios = new JLabel("");
		lblTotalHonorarios.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalHonorarios.setFont(new Font("Dialog", Font.BOLD, 9));
		lblTotalHonorarios.setBounds(447, 587, 79, 22);
		add(lblTotalHonorarios);
		
		lblSenoresEmpresa = new JLabel("800.000.000");
		lblSenoresEmpresa.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenoresEmpresa.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblSenoresEmpresa.setBounds(131, 205, 214, 22);
		add(lblSenoresEmpresa);
		
		lblRutTitular = new JLabel("800.000.000");
		lblRutTitular.setHorizontalAlignment(SwingConstants.LEFT);
		lblRutTitular.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblRutTitular.setBounds(191, 65, 154, 22);
		add(lblRutTitular);
		
		lblDireccionEmpresa = new JLabel("800.000.000");
		lblDireccionEmpresa.setHorizontalAlignment(SwingConstants.LEFT);
		lblDireccionEmpresa.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblDireccionEmpresa.setBounds(131, 229, 214, 22);
		add(lblDireccionEmpresa);
		
		JLabel lblNewLabel_2_4_1_4_1 = new JLabel("$");
		lblNewLabel_2_4_1_4_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_1.setBounds(437, 590, 16, 22);
		add(lblNewLabel_2_4_1_4_1);
		
		JLabel lblNewLabel_2_4_1_4_1_2 = new JLabel("$");
		lblNewLabel_2_4_1_4_1_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_1_2.setBounds(437, 650, 16, 22);
		add(lblNewLabel_2_4_1_4_1_2);
		
		lblGiroTitular = new JLabel("800.000.000");
		lblGiroTitular.setHorizontalAlignment(SwingConstants.CENTER);
		lblGiroTitular.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblGiroTitular.setBounds(132, 82, 213, 22);
		add(lblGiroTitular);
		
		JLabel lblNewLabel_2_4_1_4_2 = new JLabel("Fecha Emision:");
		lblNewLabel_2_4_1_4_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_2.setBounds(377, 123, 80, 22);
		add(lblNewLabel_2_4_1_4_2);
		
		lblNumeroDocBH = new JLabel("N° 00000");
		lblNumeroDocBH.setForeground(Color.BLACK);
		lblNumeroDocBH.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroDocBH.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNumeroDocBH.setBounds(347, 71, 169, 33);
		add(lblNumeroDocBH);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(347, 27, 169, 7);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(347, 105, 169, 7);
		add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(347, 27, 16, 79);
		add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBounds(516, 27, 16, 79);
		add(separator_2_1);
		
		lblFechaE = new JLabel("800.000.000");
		lblFechaE.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaE.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblFechaE.setBounds(463, 123, 69, 22);
		add(lblFechaE);
		
		JLabel lbl_Total1_1 = new JLabel("12.25% Imp. Retenido");
		lbl_Total1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lbl_Total1_1.setBounds(347, 620, 90, 22);
		add(lbl_Total1_1);
		
		JLabel lblNewLabel_2_4_1_4_1_2_1 = new JLabel("$");
		lblNewLabel_2_4_1_4_1_2_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_1_2_1.setBounds(437, 620, 16, 22);
		add(lblNewLabel_2_4_1_4_1_2_1);
		
		lblImpuestos = new JLabel("");
		lblImpuestos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblImpuestos.setFont(new Font("Dialog", Font.BOLD, 9));
		lblImpuestos.setBounds(447, 620, 79, 22);
		add(lblImpuestos);
		ImageIcon image = new ImageIcon("Imagenes/Logotipos/Logo Colegio bien.png");
		
		lblNombreTitular = new JLabel("Colegio Santa María de Aconcagua");
		lblNombreTitular.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreTitular.setForeground(Color.BLACK);
		lblNombreTitular.setFont(new Font("Arial", Font.BOLD, 11));
		lblNombreTitular.setBounds(57, 36, 288, 33);
		add(lblNombreTitular);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("TELEFONO:");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_1.setBounds(142, 123, 58, 22);
		add(lblNewLabel_2_1_1);
		
		lblTelefonoTitular = new JLabel("3 42 582059");
		lblTelefonoTitular.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblTelefonoTitular.setBounds(205, 123, 95, 22);
		add(lblTelefonoTitular);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("DIRECCION:");
		lblNewLabel_2_1_1_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_1_2.setBounds(70, 103, 61, 22);
		add(lblNewLabel_2_1_1_2);
		
		lblDireccionTitular = new JLabel("Almirante Latorre #800, Santa");
		lblDireccionTitular.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireccionTitular.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblDireccionTitular.setBounds(132, 103, 213, 22);
		add(lblDireccionTitular);
		
		JSeparator separator_3_2 = new JSeparator();
		separator_3_2.setOrientation(SwingConstants.VERTICAL);
		separator_3_2.setForeground(Color.BLACK);
		separator_3_2.setBounds(335, 580, 10, 95);
		add(separator_3_2);
		
		JSeparator separator_3_2_1 = new JSeparator();
		separator_3_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_1.setForeground(Color.BLACK);
		separator_3_2_1.setBounds(530, 580, 10, 93);
		add(separator_3_2_1);
		
		JSeparator separator_3_2_2_1 = new JSeparator();
		separator_3_2_2_1.setForeground(Color.BLACK);
		separator_3_2_2_1.setBounds(335, 674, 196, 7);
		add(separator_3_2_2_1);
		
		JLabel lblNewLabel_2_4_1_4_2_1 = new JLabel("RUT :");
		lblNewLabel_2_4_1_4_2_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_2_1.setBounds(409, 205, 60, 22);
		add(lblNewLabel_2_4_1_4_2_1);
		
		lblRutEmpresa = new JLabel("800.000.000");
		lblRutEmpresa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRutEmpresa.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblRutEmpresa.setBounds(463, 205, 69, 22);
		add(lblRutEmpresa);
		
		JLabel lblElectronica = new JLabel("ELECTRONICA");
		lblElectronica.setHorizontalAlignment(SwingConstants.CENTER);
		lblElectronica.setForeground(Color.BLACK);
		lblElectronica.setFont(new Font("Arial", Font.BOLD, 12));
		lblElectronica.setBounds(347, 50, 169, 33);
		add(lblElectronica);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("Por atencion profesional:");
		lblNewLabel_2_1_1_3.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_1_3.setBounds(57, 262, 144, 22);
		add(lblNewLabel_2_1_1_3);

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
		
		int totalHonorarios = 0;
		int totalImpuesto = 0; 
		int total = 0;
		
		for(int i=0; i<this.table.getRowCount(); i++) { 
			totalHonorarios += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 2))); 
		}
		
		totalImpuesto = (int) ((totalHonorarios*12.25)/100);
		total = totalHonorarios-totalImpuesto;
		
		lblTotalHonorarios.setText(Helpers.ponerPuntos(""+totalHonorarios));
		lblImpuestos.setText(Helpers.ponerPuntos(""+totalImpuesto));
		lblTotal.setText(Helpers.ponerPuntos(""+total));
		 
	}
	
	
	public DefaultTableModel getModelTableImprimir() {
		return table.getModel();
	}

	public JLabel getLblTotal() {
		return lblTotal;
	}

	public void setLblTotal(JLabel lblTotal) {
		this.lblTotal = lblTotal;
	}

	public TableStandard getTable() {
		return table;
	}

	public void setTable(TableStandard table) {
		this.table = table;
	}

	public JLabel getLblTotalHonorarios() {
		return lblTotalHonorarios;
	}

	public void setLblTotalHonorarios(JLabel lblTotalHonorarios) {
		this.lblTotalHonorarios = lblTotalHonorarios;
	}

	public JLabel getLblGiroTitular() {
		return lblGiroTitular;
	}

	public void setLblGiroTitular(JLabel lblGiroTitular) {
		this.lblGiroTitular = lblGiroTitular;
	}

	public JLabel getLblDireccionEmpresa() {
		return lblDireccionEmpresa;
	}

	public void setLblDireccionEmpresa(JLabel lblDireccionEmpresa) {
		this.lblDireccionEmpresa = lblDireccionEmpresa;
	}

	public JLabel getLblRutTitular() {
		return lblRutTitular;
	}

	public void setLblRutTitular(JLabel lblRutTitular) {
		this.lblRutTitular = lblRutTitular;
	}

	public JLabel getLblSenoresEmpresa() {
		return lblSenoresEmpresa;
	}

	public void setLblSenoresEmpresa(JLabel lblSenoresEmpresa) {
		this.lblSenoresEmpresa = lblSenoresEmpresa;
	}

	public JLabel getLblFechaE() {
		return lblFechaE;
	}

	public void setLblFechaE(JLabel lblFechaE) {
		this.lblFechaE = lblFechaE;
	}

	public JLabel getLblImpuestos() {
		return lblImpuestos;
	}

	public void setLblImpuestos(JLabel lblImpuestos) {
		this.lblImpuestos = lblImpuestos;
	}

	public JLabel getLblNumeroDocBH() {
		return lblNumeroDocBH;
	}

	public void setLblNumeroDocBH(JLabel lblNumeroDocBH) {
		this.lblNumeroDocBH = lblNumeroDocBH;
	}

	public JLabel getLblRutEmpresa() {
		return lblRutEmpresa;
	}

	public void setLblRutEmpresa(JLabel lblRutEmpresa) {
		this.lblRutEmpresa = lblRutEmpresa;
	}

	public JLabel getLblNombreTitular() {
		return lblNombreTitular;
	}

	public void setLblNombreTitular(JLabel lblNombreTitular) {
		this.lblNombreTitular = lblNombreTitular;
	}

	public JLabel getLblTelefonoTitular() {
		return lblTelefonoTitular;
	}

	public void setLblTelefonoTitular(JLabel lblTelefonoTitular) {
		this.lblTelefonoTitular = lblTelefonoTitular;
	}

	public JLabel getLblDireccionTitular() {
		return lblDireccionTitular;
	}

	public void setLblDireccionTitular(JLabel lblDireccionTitular) {
		this.lblDireccionTitular = lblDireccionTitular;
	}

	
}
