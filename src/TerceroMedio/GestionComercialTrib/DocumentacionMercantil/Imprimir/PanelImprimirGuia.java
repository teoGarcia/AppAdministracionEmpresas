package TerceroMedio.GestionComercialTrib.DocumentacionMercantil.Imprimir;

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

public class PanelImprimirGuia extends JPanel implements Printable{
	
	private JLabel lblTotal;
	private TableStandard table;
	private JLabel lblNumCot;
	private JLabel lblIVA;
	private JLabel lblNeto;
	private JLabel lbl_Total1;
	private JLabel lblCiudad;
	private JLabel lblComuna;
	private JLabel lblGiro;
	private JLabel lblTelefono;
	private JLabel lblDireccion;
	private JLabel lblRut;
	private JLabel lblSenores;
	private JScrollPane scrollPane;
	private JLabel lblFechaE;
	private JLabel lblImpuestos;
	private JLabel lblNumeroDoc;
	private JLabel lblRutTransp;
	private JLabel lblRutPatente;
	private JLabel lblRutChofer;
	private JLabel lblNomChofer;
	private JLabel LblTipoTraslado;

	/**
	 * Create the panel.
	 */
	public PanelImprimirGuia() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("SEÑOR(ES):");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2.setBounds(70, 143, 69, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("GIRO:");
		lblNewLabel_2_4_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1.setBounds(70, 173, 61, 22);
		add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("RUT:");
		lblNewLabel_2_1_3_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_3_1.setBounds(70, 158, 69, 22);
		add(lblNewLabel_2_1_3_1);
		
		JLabel lblTipoDoc = new JLabel("GUIA DE DESPACHO");
		lblTipoDoc.setForeground(Color.RED);
		lblTipoDoc.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDoc.setFont(new Font("Arial", Font.BOLD, 12));
		lblTipoDoc.setBounds(347, 52, 169, 33);
		add(lblTipoDoc);
		
		lbl_Total1 = new JLabel("Total");
		lbl_Total1.setFont(new Font("Dialog", Font.BOLD, 9));
		lbl_Total1.setBounds(377, 650, 50, 22);
		add(lbl_Total1);
		
		lblTotal = new JLabel("");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 9));
		lblTotal.setBounds(447, 650, 79, 22);
		add(lblTotal);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(57, 262, 475, 318);
		add(scrollPane);
		
		table = new TableStandard();
		table.setFont(new Font("Dialog", Font.PLAIN, 9));
		String[] columns = new String[] { "ID", "Codigo", "Descripcion", "Cantidad$", "$ Precio Uni.", "$ Imp. Adic.",
				"$ Total" };
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
		
		lblNumCot = new JLabel("R.U.T.: 60.903.571-4");
		lblNumCot.setForeground(Color.RED);
		lblNumCot.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumCot.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNumCot.setBounds(347, 27, 169, 33);
		add(lblNumCot);
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("DIRECCION:");
		lblNewLabel_2_1_3_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_3_1_1.setBounds(70, 188, 69, 22);
		add(lblNewLabel_2_1_3_1_1);
		
		JLabel lblNewLabel_2_4_1_1 = new JLabel("COMUNA:");
		lblNewLabel_2_4_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_1.setBounds(70, 203, 61, 22);
		add(lblNewLabel_2_4_1_1);
		
		JLabel lblNewLabel_2_1_3_1_2 = new JLabel("TELEFONO:");
		lblNewLabel_2_1_3_1_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_3_1_2.setBounds(70, 218, 69, 22);
		add(lblNewLabel_2_1_3_1_2);
		
		JLabel lblNewLabel_2_4_1_4 = new JLabel("Neto");
		lblNewLabel_2_4_1_4.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4.setBounds(377, 590, 50, 22);
		add(lblNewLabel_2_4_1_4);
		
		lblNeto = new JLabel("");
		lblNeto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNeto.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNeto.setBounds(447, 587, 79, 22);
		add(lblNeto);
		
		JLabel lblNewLabel_2_4_1_5 = new JLabel("IVA");
		lblNewLabel_2_4_1_5.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_5.setBounds(377, 612, 50, 22);
		add(lblNewLabel_2_4_1_5);
		
		lblIVA = new JLabel("");
		lblIVA.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIVA.setFont(new Font("Dialog", Font.BOLD, 9));
		lblIVA.setBounds(447, 609, 79, 22);
		add(lblIVA);
		
		lblSenores = new JLabel("800.000.000");
		lblSenores.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenores.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblSenores.setBounds(149, 143, 214, 22);
		add(lblSenores);
		
		lblRut = new JLabel("800.000.000");
		lblRut.setHorizontalAlignment(SwingConstants.LEFT);
		lblRut.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblRut.setBounds(149, 158, 141, 22);
		add(lblRut);
		
		lblTelefono = new JLabel("800.000.000");
		lblTelefono.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelefono.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblTelefono.setBounds(149, 218, 141, 22);
		add(lblTelefono);
		
		lblDireccion = new JLabel("800.000.000");
		lblDireccion.setHorizontalAlignment(SwingConstants.LEFT);
		lblDireccion.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblDireccion.setBounds(149, 188, 214, 22);
		add(lblDireccion);
		
		JLabel lblNewLabel_2_4_1_4_1 = new JLabel("$");
		lblNewLabel_2_4_1_4_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_1.setBounds(437, 590, 16, 22);
		add(lblNewLabel_2_4_1_4_1);
		
		JLabel lblNewLabel_2_4_1_4_1_1 = new JLabel("$");
		lblNewLabel_2_4_1_4_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_1_1.setBounds(437, 612, 16, 22);
		add(lblNewLabel_2_4_1_4_1_1);
		
		JLabel lblNewLabel_2_4_1_4_1_2 = new JLabel("$");
		lblNewLabel_2_4_1_4_1_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_1_2.setBounds(437, 650, 16, 22);
		add(lblNewLabel_2_4_1_4_1_2);
		
		lblCiudad = new JLabel("800.000.000");
		lblCiudad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCiudad.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblCiudad.setBounds(283, 203, 80, 22);
		add(lblCiudad);
		
		lblComuna = new JLabel("800.000.000");
		lblComuna.setHorizontalAlignment(SwingConstants.LEFT);
		lblComuna.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblComuna.setBounds(149, 203, 80, 22);
		add(lblComuna);
		
		lblGiro = new JLabel("800.000.000");
		lblGiro.setHorizontalAlignment(SwingConstants.LEFT);
		lblGiro.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblGiro.setBounds(149, 173, 141, 22);
		add(lblGiro);
		
		JLabel lblNewLabel_2_4_1_4_2 = new JLabel("Fecha Emision:");
		lblNewLabel_2_4_1_4_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_2.setBounds(377, 123, 80, 22);
		add(lblNewLabel_2_4_1_4_2);
		
		JLabel lblNewLabel_2_4_1_4_3 = new JLabel("CIUDAD:");
		lblNewLabel_2_4_1_4_3.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_3.setBounds(234, 203, 52, 22);
		add(lblNewLabel_2_4_1_4_3);
		
		lblNumeroDoc = new JLabel("N° 00000");
		lblNumeroDoc.setForeground(Color.RED);
		lblNumeroDoc.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroDoc.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNumeroDoc.setBounds(347, 71, 169, 33);
		add(lblNumeroDoc);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.RED);
		separator.setBounds(347, 27, 169, 7);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.RED);
		separator_1.setBounds(347, 105, 169, 7);
		add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.RED);
		separator_2.setBounds(347, 27, 16, 79);
		add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.RED);
		separator_2_1.setBounds(516, 27, 16, 79);
		add(separator_2_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(57, 135, 10, 128);
		add(separator_3);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1.setForeground(Color.BLACK);
		separator_3_1.setBounds(373, 135, 10, 128);
		add(separator_3_1);
		
		lblFechaE = new JLabel("800.000.000");
		lblFechaE.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaE.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblFechaE.setBounds(463, 123, 69, 22);
		add(lblFechaE);
		
		JSeparator separator_3_1_1 = new JSeparator();
		separator_3_1_1.setForeground(Color.BLACK);
		separator_3_1_1.setBounds(57, 135, 317, 7);
		add(separator_3_1_1);
		
		JLabel lbl_Total1_1 = new JLabel("Impuesto Adic");
		lbl_Total1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lbl_Total1_1.setBounds(377, 632, 60, 22);
		add(lbl_Total1_1);
		
		JLabel lblNewLabel_2_4_1_4_1_2_1 = new JLabel("$");
		lblNewLabel_2_4_1_4_1_2_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_1_2_1.setBounds(437, 632, 16, 22);
		add(lblNewLabel_2_4_1_4_1_2_1);
		
		lblImpuestos = new JLabel("");
		lblImpuestos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblImpuestos.setFont(new Font("Dialog", Font.BOLD, 9));
		lblImpuestos.setBounds(447, 632, 79, 22);
		add(lblImpuestos);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(42, 27, 69, 95);
		ImageIcon image = new ImageIcon("Imagenes/Logotipos/Logo Colegio bien.png");
		Icon icon = new ImageIcon(image.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT));	
		lblNewLabel.setIcon(icon);//(new ImageIcon(PanelImprimir.class.getResource("/Imagenes/Logotipos/Logo Colegio bien.png")));
		lblNewLabel.repaint();
		add(lblNewLabel);
		
		JLabel lblNewLabel_3_1 = new JLabel("Colegio Santa María de Aconcagua");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setForeground(Color.RED);
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(141, 18, 197, 33);
		add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email:");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1.setBounds(141, 48, 50, 22);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Telefono:");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_1.setBounds(141, 70, 50, 22);
		add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("3 42 582059");
		lblNewLabel_2_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_1_1.setBounds(196, 70, 95, 22);
		add(lblNewLabel_2_1_1_1);
		
		JLabel lblEmail = new JLabel("colegiosma@gmail.com");
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblEmail.setBounds(196, 48, 142, 22);
		add(lblEmail);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Direccion:");
		lblNewLabel_2_1_1_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_1_2.setBounds(141, 92, 50, 22);
		add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Almirante Latorre #800, Santa");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_1_1_1.setBounds(196, 92, 144, 22);
		add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("María. Región de Valparaíso.");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2_1_1_1_1_1.setBounds(196, 107, 144, 22);
		add(lblNewLabel_2_1_1_1_1_1);
		
		JSeparator separator_3_2 = new JSeparator();
		separator_3_2.setOrientation(SwingConstants.VERTICAL);
		separator_3_2.setForeground(Color.BLACK);
		separator_3_2.setBounds(360, 580, 10, 95);
		add(separator_3_2);
		
		JSeparator separator_3_2_1 = new JSeparator();
		separator_3_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_1.setForeground(Color.BLACK);
		separator_3_2_1.setBounds(530, 580, 10, 93);
		add(separator_3_2_1);
		
		JSeparator separator_3_2_2_1 = new JSeparator();
		separator_3_2_2_1.setForeground(Color.BLACK);
		separator_3_2_2_1.setBounds(360, 674, 171, 7);
		add(separator_3_2_2_1);
		
		JLabel lblNewLabel_2_4_1_4_2_1 = new JLabel("RUT TRANSP.:");
		lblNewLabel_2_4_1_4_2_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_2_1.setBounds(377, 163, 95, 22);
		add(lblNewLabel_2_4_1_4_2_1);
		
		lblRutTransp = new JLabel("800.000.000");
		lblRutTransp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRutTransp.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblRutTransp.setBounds(463, 163, 69, 22);
		add(lblRutTransp);
		
		JLabel lblNewLabel_2_4_1_4_2_2 = new JLabel("PATENTE:");
		lblNewLabel_2_4_1_4_2_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_2_2.setBounds(377, 188, 80, 22);
		add(lblNewLabel_2_4_1_4_2_2);
		
		lblRutPatente = new JLabel("800.000.000");
		lblRutPatente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRutPatente.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblRutPatente.setBounds(463, 188, 69, 22);
		add(lblRutPatente);
		
		JLabel lblNewLabel_2_4_1_4_2_3 = new JLabel("RUT CHOFER:");
		lblNewLabel_2_4_1_4_2_3.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_2_3.setBounds(377, 210, 80, 22);
		add(lblNewLabel_2_4_1_4_2_3);
		
		lblRutChofer = new JLabel("800.000.000");
		lblRutChofer.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRutChofer.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblRutChofer.setBounds(463, 210, 69, 22);
		add(lblRutChofer);
		
		JLabel lblNewLabel_2_4_1_4_2_4 = new JLabel("NOM. CHOFER:");
		lblNewLabel_2_4_1_4_2_4.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_2_4.setBounds(377, 233, 79, 22);
		add(lblNewLabel_2_4_1_4_2_4);
		
		lblNomChofer = new JLabel("800.000.000");
		lblNomChofer.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomChofer.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNomChofer.setBounds(453, 236, 79, 22);
		add(lblNomChofer);
		
		JLabel lblNewLabel_2_1_3_1_2_1 = new JLabel("TIPO DE TRAS.:");
		lblNewLabel_2_1_3_1_2_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_3_1_2_1.setBounds(70, 236, 69, 22);
		add(lblNewLabel_2_1_3_1_2_1);
		
		LblTipoTraslado = new JLabel("800.000.000");
		LblTipoTraslado.setHorizontalAlignment(SwingConstants.LEFT);
		LblTipoTraslado.setFont(new Font("Dialog", Font.PLAIN, 9));
		LblTipoTraslado.setBounds(149, 236, 141, 22);
		add(LblTipoTraslado);

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
		int totalImpuestos = 0;
		
		for(int i=0; i<this.table.getRowCount(); i++) { 
			total += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 6))); 
		}
		
		for(int i=0; i<this.table.getRowCount(); i++) { 
			totalImpuestos += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 5))); 
		}
		
		int Neto = (int) (total/1.19); 
		int IVA = total - Neto;
		int TotalFinal = total + totalImpuestos;
	
		lblTotal.setText(Helpers.ponerPuntos(""+TotalFinal));
		lblNeto.setText(Helpers.ponerPuntos(""+Neto));
		lblImpuestos.setText(Helpers.ponerPuntos(""+totalImpuestos));
		lblIVA.setText(Helpers.ponerPuntos(""+IVA));
		 
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

	public JLabel getLblCiudad() {
		return lblCiudad;
	}

	public void setLblCiudad(JLabel lblCiudad) {
		this.lblCiudad = lblCiudad;
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

	public JLabel getLblSenores() {
		return lblSenores;
	}

	public void setLblSenores(JLabel lblSenores) {
		this.lblSenores = lblSenores;
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

	public JLabel getLblNumeroDoc() {
		return lblNumeroDoc;
	}

	public void setLblNumeroDoc(JLabel lblNumeroDoc) {
		this.lblNumeroDoc = lblNumeroDoc;
	}

	public JLabel getLblRutTransp() {
		return lblRutTransp;
	}

	public void setLblRutTransp(JLabel lblRutTransp) {
		this.lblRutTransp = lblRutTransp;
	}

	public JLabel getLblRutPatente() {
		return lblRutPatente;
	}

	public void setLblRutPatente(JLabel lblRutPatente) {
		this.lblRutPatente = lblRutPatente;
	}

	public JLabel getLblRutChofer() {
		return lblRutChofer;
	}

	public void setLblRutChofer(JLabel lblRutChofer) {
		this.lblRutChofer = lblRutChofer;
	}

	public JLabel getLblNomChofer() {
		return lblNomChofer;
	}

	public void setLblNomChofer(JLabel lblNomChofer) {
		this.lblNomChofer = lblNomChofer;
	}

	public JLabel getLblTipoTraslado() {
		return LblTipoTraslado;
	}

	public void setLblTipoTraslado(JLabel lblTipoTraslado) {
		LblTipoTraslado = lblTipoTraslado;
	}
}
