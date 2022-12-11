package TerceroMedio.GestionComercialTrib.OC.Imprimir;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import core.Helpers;
import ui.TablaUi.TableStandard;
import javax.swing.JSeparator;

public class PanelImprimir extends JPanel implements Printable{

	private JLabel lblCargos;
	private TableStandard table;
	private JLabel lblNumOC;
	private JLabel lblDescuentos;
	private JLabel lblNeto;
	private JEditorPane txtTerminosCondiciones;
	private JLabel lblDireccionDespacho;
	private JLabel lblMetodoDespacho;
	private JLabel lblFechaEntregaProd;
	private JLabel lblNombreOC;
	private JLabel lblRut;
	private JLabel lblSenores;
	private JLabel lblFechaEnvioOC;
	private JScrollPane scrollPane;
	private JLabel lblRutDemandante;
	private JLabel lblEstado;
	private JLabel lblDireccionEnvio;
	private JLabel lblFormaPago;
	private JEditorPane txtObservacion;
	private JLabel lblSubtotal;
	private JLabel lblIVA;
	private JLabel lblTotal;
	
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Señores:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2.setBounds(55, 128, 69, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Rut:");
		lblNewLabel_2_1_3_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_3_1.setBounds(55, 146, 69, 22);
		add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Orden de compra Nro.");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(184, 83, 158, 33);
		add(lblNewLabel_3);
		
		JLabel lbl_Cargo = new JLabel("Cargos");
		lbl_Cargo.setFont(new Font("Dialog", Font.BOLD, 9));
		lbl_Cargo.setBounds(379, 608, 58, 22);
		add(lbl_Cargo);
		
		lblCargos = new JLabel("0");
		lblCargos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCargos.setFont(new Font("Dialog", Font.BOLD, 9));
		lblCargos.setBounds(448, 608, 80, 22);
		add(lblCargos);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 296, 490, 272);
		add(scrollPane);
		
		table = new TableStandard();
		table.setFont(new Font("Dialog", Font.PLAIN, 9));
		String[] columns = new String[] { "Cód./ID Lic.CM", "Producto", "Cant.", "U.M.", "Esp. Comp.",
				"Esp. Prov.", "$ Valor U.", "$ Desc.", "$ Cargos", "$ Total" };
		table.setColums(columns);
		table.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 9));
		table.getColumnModel().getColumn(0).setPreferredWidth(60);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(60);
		table.getColumnModel().getColumn(3).setPreferredWidth(40);
		table.getColumnModel().getColumn(4).setPreferredWidth(125);
		table.getColumnModel().getColumn(5).setPreferredWidth(125);
		table.getColumnModel().getColumn(6).setPreferredWidth(90);
		table.getColumnModel().getColumn(7).setPreferredWidth(90);
		table.getColumnModel().getColumn(8).setPreferredWidth(90);
		table.getColumnModel().getColumn(9).setPreferredWidth(90);
		
		scrollPane.setViewportView(table);
		
		lblNumOC = new JLabel("00000");
		lblNumOC.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumOC.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNumOC.setBounds(349, 83, 115, 33);
		add(lblNumOC);
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("Nombre de O.C.:");
		lblNewLabel_2_1_3_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_3_1_1.setBounds(55, 175, 84, 22);
		add(lblNewLabel_2_1_3_1_1);
		
		JLabel lblNewLabel_2_4_1_1 = new JLabel("Metodo Despacho:");
		lblNewLabel_2_4_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_1.setBounds(55, 243, 90, 22);
		add(lblNewLabel_2_4_1_1);
		
		JLabel lblNewLabel_2_1_3_1_2 = new JLabel("Fecha Entrega Prod.:");
		lblNewLabel_2_1_3_1_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_3_1_2.setBounds(55, 192, 104, 22);
		add(lblNewLabel_2_1_3_1_2);
		
		JLabel lblNewLabel_2_4_1_2 = new JLabel("Direccion de Despac.:");
		lblNewLabel_2_4_1_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_2.setBounds(55, 226, 104, 22);
		add(lblNewLabel_2_4_1_2);
		
		JLabel lblNewLabel_2_4_1_3 = new JLabel("Disponibilidad   presupuestaria:");
		lblNewLabel_2_4_1_3.setFont(new Font("Dialog", Font.BOLD, 8));
		lblNewLabel_2_4_1_3.setBounds(51, 625, 122, 22);
		add(lblNewLabel_2_4_1_3);
		
		JLabel lblNewLabel_2_4_1_4 = new JLabel("Neto");
		lblNewLabel_2_4_1_4.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4.setBounds(379, 572, 58, 22);
		add(lblNewLabel_2_4_1_4);
		
		lblNeto = new JLabel("0");
		lblNeto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNeto.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNeto.setBounds(448, 572, 80, 22);
		add(lblNeto);
		
		JLabel lblNewLabel_2_4_1_5 = new JLabel("Descuentos");
		lblNewLabel_2_4_1_5.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_5.setBounds(379, 590, 58, 22);
		add(lblNewLabel_2_4_1_5);
		
		lblDescuentos = new JLabel("0");
		lblDescuentos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescuentos.setFont(new Font("Dialog", Font.BOLD, 9));
		lblDescuentos.setBounds(448, 590, 80, 22);
		add(lblDescuentos);
		
		txtTerminosCondiciones = new JEditorPane();
		txtTerminosCondiciones.setEditable(false);
		txtTerminosCondiciones.setText("Orden  de Compra Adquisición igual o inferior a 30 UTM (Debe presentar 3 cotizaciones)");
		txtTerminosCondiciones.setFont(new Font("Dialog", Font.PLAIN, 8));
		txtTerminosCondiciones.setBounds(283, 574, 72, 56);
		add(txtTerminosCondiciones);
		
		lblSenores = new JLabel("800.000.000");
		lblSenores.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenores.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblSenores.setBounds(157, 128, 371, 22);
		add(lblSenores);
		
		lblRut = new JLabel("800.000.000");
		lblRut.setHorizontalAlignment(SwingConstants.LEFT);
		lblRut.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblRut.setBounds(157, 146, 141, 22);
		add(lblRut);
		
		lblFechaEntregaProd = new JLabel("800.000.000");
		lblFechaEntregaProd.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaEntregaProd.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblFechaEntregaProd.setBounds(159, 192, 369, 22);
		add(lblFechaEntregaProd);
		
		lblNombreOC = new JLabel("800.000.000");
		lblNombreOC.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombreOC.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNombreOC.setBounds(159, 176, 369, 22);
		add(lblNombreOC);
		
		JLabel lblNewLabel_2_4_1_4_1 = new JLabel("$");
		lblNewLabel_2_4_1_4_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_1.setBounds(437, 572, 16, 22);
		add(lblNewLabel_2_4_1_4_1);
		
		JLabel lblNewLabel_2_4_1_4_1_1 = new JLabel("$");
		lblNewLabel_2_4_1_4_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_1_1.setBounds(437, 590, 16, 22);
		add(lblNewLabel_2_4_1_4_1_1);
		
		JLabel lblNewLabel_2_4_1_4_1_2 = new JLabel("$");
		lblNewLabel_2_4_1_4_1_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_1_2.setBounds(437, 608, 16, 22);
		add(lblNewLabel_2_4_1_4_1_2);
		
		lblDireccionDespacho = new JLabel("800.000.000");
		lblDireccionDespacho.setHorizontalAlignment(SwingConstants.LEFT);
		lblDireccionDespacho.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblDireccionDespacho.setBounds(159, 226, 369, 22);
		add(lblDireccionDespacho);
		
		lblMetodoDespacho = new JLabel("800.000.000");
		lblMetodoDespacho.setHorizontalAlignment(SwingConstants.LEFT);
		lblMetodoDespacho.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblMetodoDespacho.setBounds(159, 243, 369, 22);
		add(lblMetodoDespacho);
		
		JLabel lblNewLabel_2_4_1_4_2 = new JLabel("Demandante:");
		lblNewLabel_2_4_1_4_2.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_2.setBounds(51, 35, 80, 22);
		add(lblNewLabel_2_4_1_4_2);
		
		JLabel lblNewLabel_2_4_1_4_3 = new JLabel("Fecha Envio O.C.:");
		lblNewLabel_2_4_1_4_3.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_3.setBounds(362, 50, 90, 22);
		add(lblNewLabel_2_4_1_4_3);
		
		lblFechaEnvioOC = new JLabel("Fecha");
		lblFechaEnvioOC.setForeground(Color.BLACK);
		lblFechaEnvioOC.setBackground(Color.WHITE);
		lblFechaEnvioOC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaEnvioOC.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblFechaEnvioOC.setBounds(448, 50, 89, 22);
		add(lblFechaEnvioOC);
		
		JLabel lblNewLabel_2_1_3_1_3 = new JLabel("Direccion Dem.:");
		lblNewLabel_2_1_3_1_3.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_3_1_3.setBounds(51, 50, 80, 22);
		add(lblNewLabel_2_1_3_1_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Rut:");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1.setBounds(362, 35, 45, 22);
		add(lblNewLabel_2_1);
		
		lblRutDemandante = new JLabel("60.903.571-4");
		lblRutDemandante.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRutDemandante.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblRutDemandante.setBounds(463, 35, 74, 22);
		add(lblRutDemandante);
		
		JLabel lblAlmiranteLaTorre = new JLabel("Almirante La Torre Nro. 800");
		lblAlmiranteLaTorre.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlmiranteLaTorre.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblAlmiranteLaTorre.setBounds(130, 50, 141, 22);
		add(lblAlmiranteLaTorre);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Telefono:");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_1_1.setBounds(51, 65, 69, 22);
		add(lblNewLabel_2_1_1);
		
		JLabel lblRutDemandante_1 = new JLabel("3 42 582059");
		lblRutDemandante_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblRutDemandante_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblRutDemandante_1.setBounds(130, 65, 141, 22);
		add(lblRutDemandante_1);
		
		JLabel lblColegioBicentenarioSanta = new JLabel("Colegio Bicentenario Santa Maria de Aconcagua");
		lblColegioBicentenarioSanta.setHorizontalAlignment(SwingConstants.LEFT);
		lblColegioBicentenarioSanta.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblColegioBicentenarioSanta.setBounds(130, 35, 212, 22);
		add(lblColegioBicentenarioSanta);
		
		JLabel lblNewLabel_2_4_1_4_3_1 = new JLabel("Estado:");
		lblNewLabel_2_4_1_4_3_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_3_1.setBounds(362, 65, 80, 22);
		add(lblNewLabel_2_4_1_4_3_1);
		
		lblEstado = new JLabel("Estado");
		lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstado.setForeground(Color.BLACK);
		lblEstado.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblEstado.setBackground(Color.WHITE);
		lblEstado.setBounds(437, 65, 100, 22);
		add(lblEstado);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(51, 123, 490, 9);
		add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(51, 123, 5, 50);
		add(separator_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(51, 173, 490, 9);
		add(separator_1);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBounds(540, 123, 5, 50);
		add(separator_2_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(51, 176, 490, 9);
		add(separator_3);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(51, 285, 490, 9);
		add(separator_1_1);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1_1.setForeground(Color.BLACK);
		separator_2_1_1.setBounds(540, 176, 5, 110);
		add(separator_2_1_1);
		
		JLabel lblNewLabel_2_4_1_2_1 = new JLabel("Direccion Envio Fact.:");
		lblNewLabel_2_4_1_2_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_2_1.setBounds(55, 209, 104, 22);
		add(lblNewLabel_2_4_1_2_1);
		
		lblDireccionEnvio = new JLabel("800.000.000");
		lblDireccionEnvio.setHorizontalAlignment(SwingConstants.LEFT);
		lblDireccionEnvio.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblDireccionEnvio.setBounds(159, 209, 369, 22);
		add(lblDireccionEnvio);
		
		JSeparator separator_2_1_1_1 = new JSeparator();
		separator_2_1_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1_1_1.setForeground(Color.BLACK);
		separator_2_1_1_1.setBounds(51, 176, 5, 110);
		add(separator_2_1_1_1);
		
		JLabel lblNewLabel_2_4_1_4_4 = new JLabel("19% IVA");
		lblNewLabel_2_4_1_4_4.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_4.setBounds(379, 644, 58, 22);
		add(lblNewLabel_2_4_1_4_4);
		
		JLabel lblNewLabel_2_4_1_4_1_3 = new JLabel("$");
		lblNewLabel_2_4_1_4_1_3.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_1_3.setBounds(437, 644, 16, 22);
		add(lblNewLabel_2_4_1_4_1_3);
		
		JLabel lblNewLabel_2_4_1_5_1 = new JLabel("Total");
		lblNewLabel_2_4_1_5_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_5_1.setBounds(379, 662, 58, 22);
		add(lblNewLabel_2_4_1_5_1);
		
		JLabel lblNewLabel_2_4_1_4_1_1_1 = new JLabel("$");
		lblNewLabel_2_4_1_4_1_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_1_1_1.setBounds(437, 662, 16, 22);
		add(lblNewLabel_2_4_1_4_1_1_1);
		
		lblIVA = new JLabel("0");
		lblIVA.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIVA.setFont(new Font("Dialog", Font.BOLD, 9));
		lblIVA.setBounds(448, 644, 80, 22);
		add(lblIVA);
		
		lblTotal = new JLabel("0");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 9));
		lblTotal.setBounds(448, 662, 80, 22);
		add(lblTotal);
		
		JSeparator separator_2_1_1_1_1 = new JSeparator();
		separator_2_1_1_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1_1_1_1.setForeground(Color.BLACK);
		separator_2_1_1_1_1.setBounds(362, 568, 7, 114);
		add(separator_2_1_1_1_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1.setBounds(362, 682, 178, 9);
		add(separator_1_1_1);
		
		JSeparator separator_2_1_1_1_1_1 = new JSeparator();
		separator_2_1_1_1_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1_1_1_1_1.setForeground(Color.BLACK);
		separator_2_1_1_1_1_1.setBounds(539, 568, 7, 114);
		add(separator_2_1_1_1_1_1);
		
		JEditorPane dtrpnEstaOrdenDe = new JEditorPane();
		dtrpnEstaOrdenDe.setEditable(false);
		dtrpnEstaOrdenDe.setText(" Esta  orden  de  compra  cuenta  con  Certificado  de  Disponibilidad  Presupuestaria  (CDP) o  Justificación ");
		dtrpnEstaOrdenDe.setFont(new Font("Dialog", Font.PLAIN, 8));
		dtrpnEstaOrdenDe.setBounds(166, 628, 192, 25);
		add(dtrpnEstaOrdenDe);
		
		JLabel lblNewLabel_2_4_1_3_1 = new JLabel("Observacion:");
		lblNewLabel_2_4_1_3_1.setFont(new Font("Dialog", Font.BOLD, 8));
		lblNewLabel_2_4_1_3_1.setBounds(51, 656, 115, 22);
		add(lblNewLabel_2_4_1_3_1);
		
		txtObservacion = new JEditorPane();
		txtObservacion.setEditable(false);
		txtObservacion.setText("Observacion");
		txtObservacion.setFont(new Font("Dialog", Font.PLAIN, 8));
		txtObservacion.setBounds(166, 658, 192, 22);
		add(txtObservacion);
		
		JLabel lblNewLabel_2_4_1_1_1 = new JLabel("Forma de pago");
		lblNewLabel_2_4_1_1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_1_1.setBounds(55, 259, 90, 22);
		add(lblNewLabel_2_4_1_1_1);
		
		lblFormaPago = new JLabel("800.000.000");
		lblFormaPago.setHorizontalAlignment(SwingConstants.LEFT);
		lblFormaPago.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblFormaPago.setBounds(159, 259, 369, 22);
		add(lblFormaPago);
		
		JLabel lbl_Total1_1 = new JLabel("Subtotal");
		lbl_Total1_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lbl_Total1_1.setBounds(379, 626, 58, 22);
		add(lbl_Total1_1);
		
		JLabel lblNewLabel_2_4_1_4_1_2_1 = new JLabel("$");
		lblNewLabel_2_4_1_4_1_2_1.setFont(new Font("Dialog", Font.BOLD, 9));
		lblNewLabel_2_4_1_4_1_2_1.setBounds(437, 626, 16, 22);
		add(lblNewLabel_2_4_1_4_1_2_1);
		
		lblSubtotal = new JLabel("0");
		lblSubtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSubtotal.setFont(new Font("Dialog", Font.BOLD, 9));
		lblSubtotal.setBounds(448, 626, 80, 22);
		add(lblSubtotal);
		
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
		
		int totalNeto = 0;
		int totalDescuentos = 0;
		int totalCargos = 0;
		  
		for(int i=0; i<this.table.getRowCount(); i++) { 
			totalNeto += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 9))); 
		}
		
		for(int i=0; i<this.table.getRowCount(); i++) { 
			totalDescuentos += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 7))); 
		}
		
		for(int i=0; i<this.table.getRowCount(); i++) { 
			totalCargos += Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 8))); 
		}
		
		
		//int Neto = (int) (total/1.19); 
		int subtotal = totalNeto - totalDescuentos+totalCargos ;
		int totalConDescuentos = (int) (subtotal*1.19);
		int IVA = totalConDescuentos - subtotal;
	
		lblTotal.setText(Helpers.ponerPuntos(""+totalConDescuentos));
		lblNeto.setText(Helpers.ponerPuntos(""+totalNeto));
		lblSubtotal.setText(Helpers.ponerPuntos(""+subtotal));
		lblIVA.setText(Helpers.ponerPuntos(""+IVA));
		lblDescuentos.setText(Helpers.ponerPuntos(""+totalDescuentos));
		lblCargos.setText(Helpers.ponerPuntos(""+totalCargos));
		 
	}
	
	public DefaultTableModel getModelTablePanelImprimir() {
		return table.getModel();	
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

	public JLabel getLblCargos() {
		return lblCargos;
	}

	public void setLblCargos(JLabel lblCargos) {
		this.lblCargos = lblCargos;
	}

	public JLabel getLblNumOC() {
		return lblNumOC;
	}

	public void setLblNumOC(JLabel lblNumOC) {
		this.lblNumOC = lblNumOC;
	}

	public JLabel getLblDescuentos() {
		return lblDescuentos;
	}

	public void setLblDescuentos(JLabel lblDescuentos) {
		this.lblDescuentos = lblDescuentos;
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

	public JLabel getLblDireccionDespacho() {
		return lblDireccionDespacho;
	}

	public void setLblDireccionDespacho(JLabel lblDireccionDespacho) {
		this.lblDireccionDespacho = lblDireccionDespacho;
	}

	public JLabel getLblFechaEntregaProd() {
		return lblFechaEntregaProd;
	}

	public void setLblFechaEntregaProd(JLabel lblFechaEntregaProd) {
		this.lblFechaEntregaProd = lblFechaEntregaProd;
	}

	public JLabel getLblNombreOC() {
		return lblNombreOC;
	}

	public void setLblNombreOC(JLabel lblNombreOC) {
		this.lblNombreOC = lblNombreOC;
	}

	public JLabel getLblSenores() {
		return lblSenores;
	}

	public void setLblSenores(JLabel lblSenores) {
		this.lblSenores = lblSenores;
	}

	public JLabel getLblFechaEnvioOC() {
		return lblFechaEnvioOC;
	}

	public void setLblFechaEnvioOC(JLabel lblFechaEnvioOC) {
		this.lblFechaEnvioOC = lblFechaEnvioOC;
	}

	public JLabel getLblEstado() {
		return lblEstado;
	}

	public void setLblEstado(JLabel lblEstado) {
		this.lblEstado = lblEstado;
	}

	public JLabel getLblDireccionEnvio() {
		return lblDireccionEnvio;
	}

	public void setLblDireccionEnvio(JLabel lblDireccionEnvio) {
		this.lblDireccionEnvio = lblDireccionEnvio;
	}

	public JLabel getLblFormaPago() {
		return lblFormaPago;
	}

	public void setLblFormaPago(JLabel lblFormaPago) {
		this.lblFormaPago = lblFormaPago;
	}

	public JEditorPane getTxtObservacion() {
		return txtObservacion;
	}

	public void setTxtObservacion(JEditorPane txtObservacion) {
		this.txtObservacion = txtObservacion;
	}

	public JLabel getLblSubtotal() {
		return lblSubtotal;
	}

	public void setLblSubtotal(JLabel lblSubtotal) {
		this.lblSubtotal = lblSubtotal;
	}

	public JLabel getLblTotal() {
		return lblTotal;
	}

	public void setLblTotal(JLabel lblTotal) {
		this.lblTotal = lblTotal;
	}

	public JLabel getLblMetodoDespacho() {
		return lblMetodoDespacho;
	}

	public void setLblMetodoDespacho(JLabel lblMetodoDespacho) {
		this.lblMetodoDespacho = lblMetodoDespacho;
	}

	public JLabel getLblRut() {
		return lblRut;
	}

	public void setLblRut(JLabel lblRut) {
		this.lblRut = lblRut;
	}

	public JLabel getLblIVA() {
		return lblIVA;
	}

	public void setLblIVA(JLabel lblIVA) {
		this.lblIVA = lblIVA;
	}

	
}
