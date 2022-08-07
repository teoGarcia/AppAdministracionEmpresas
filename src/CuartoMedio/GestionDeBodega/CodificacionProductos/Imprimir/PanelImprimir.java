package CuartoMedio.GestionDeBodega.CodificacionProductos.Imprimir;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.Iterator;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacion;
import CuartoMedio.EmprendimientoYEmpleabilidad.ControlGastos.ControlGastosEntity;
import CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto.PresupuestoEntity;
import CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto.PresupuestoRepository;
import core.Helpers;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import ui.TablaUi.TableStandard;

public class PanelImprimir extends JPanel implements Printable{
	
	private PresupuestoRepository repository;
	private JLabel lblProveedor;
	private JLabel lblProducto;
	private JLabel lblCodIntProducto;
	private JLabel lblCodBarraEAN13;
	private JLabel lblCodBarraEAN14;
	private JLabel lblPaisAbas;
	private JLabel lblPaisFrabri;
	private JLabel lblPreSinImp;
	private JLabel lblMarca;

	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Codificacion de Producto");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTitulo.setBounds(0, 80, 584, 33);
		add(lblTitulo);
		
		JLabel lblProveedor_lbl = new JLabel("Proveedor:");
		lblProveedor_lbl.setFont(new Font("Dialog", Font.BOLD, 12));
		lblProveedor_lbl.setBounds(10, 122, 67, 22);
		add(lblProveedor_lbl);
		
		lblProveedor = new JLabel("proveedor");
		lblProveedor.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProveedor.setBounds(87, 123, 67, 22);
		add(lblProveedor);
		
		JLabel lblDescripcionDeProducto = new JLabel("Descripcion de Producto:");
		lblDescripcionDeProducto.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDescripcionDeProducto.setBounds(268, 122, 155, 22);
		add(lblDescripcionDeProducto);
		
		lblProducto = new JLabel("producto");
		lblProducto.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProducto.setBounds(433, 123, 67, 22);
		add(lblProducto);
		
		JLabel lblCod = new JLabel("Cod. Int. Producto:");
		lblCod.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCod.setBounds(9, 154, 112, 22);
		add(lblCod);
		
		lblCodIntProducto = new JLabel("Cod int pro");
		lblCodIntProducto.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCodIntProducto.setBounds(120, 155, 112, 22);
		add(lblCodIntProducto);
		
		JLabel lblCodBarraEat = new JLabel("Cod. Barras EAN-13:");
		lblCodBarraEat.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCodBarraEat.setBounds(268, 154, 126, 22);
		add(lblCodBarraEat);
		
		lblCodBarraEAN13 = new JLabel("Cod barras ean 13");
		lblCodBarraEAN13.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCodBarraEAN13.setBounds(393, 154, 107, 22);
		add(lblCodBarraEAN13);
		
		JLabel lblCodBarrasEan = new JLabel("Cod. Barras EAN-14:");
		lblCodBarrasEan.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCodBarrasEan.setBounds(10, 186, 131, 22);
		add(lblCodBarrasEan);
		
		lblCodBarraEAN14 = new JLabel("cod barras ean 14");
		lblCodBarraEAN14.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCodBarraEAN14.setBounds(130, 186, 108, 22);
		add(lblCodBarraEAN14);
		
		JLabel lblPaisDeAbasteciomiento = new JLabel("Pais de Abasteciomiento:");
		lblPaisDeAbasteciomiento.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPaisDeAbasteciomiento.setBounds(268, 185, 155, 22);
		add(lblPaisDeAbasteciomiento);
		
		lblPaisAbas = new JLabel("pais");
		lblPaisAbas.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPaisAbas.setBounds(433, 186, 67, 22);
		add(lblPaisAbas);
		
		JLabel lblPaisDeFabricacion = new JLabel("Pais de Fabricacion:");
		lblPaisDeFabricacion.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPaisDeFabricacion.setBounds(10, 227, 126, 22);
		add(lblPaisDeFabricacion);
		
		lblPaisFrabri = new JLabel("pais");
		lblPaisFrabri.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPaisFrabri.setBounds(135, 227, 67, 22);
		add(lblPaisFrabri);
		
		JLabel lblMarca_lbl = new JLabel("Marca:");
		lblMarca_lbl.setFont(new Font("Dialog", Font.BOLD, 12));
		lblMarca_lbl.setBounds(268, 227, 52, 22);
		add(lblMarca_lbl);
		
		lblMarca = new JLabel("marca");
		lblMarca.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMarca.setBounds(330, 227, 135, 22);
		add(lblMarca);
		
		JLabel lblPrecioSinImp = new JLabel("Precio sin Impue. :");
		lblPrecioSinImp.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPrecioSinImp.setBounds(10, 316, 112, 22);
		add(lblPrecioSinImp);
		
		lblPreSinImp = new JLabel("precio sin imp");
		lblPreSinImp.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPreSinImp.setBounds(120, 316, 118, 22);
		add(lblPreSinImp);
		
		JLabel lblDescuentoPermanente = new JLabel("Descuento permanente:");
		lblDescuentoPermanente.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDescuentoPermanente.setBounds(268, 316, 155, 22);
		add(lblDescuentoPermanente);
		
		JLabel lblDescPer = new JLabel("Des per");
		lblDescPer.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDescPer.setBounds(410, 316, 111, 22);
		add(lblDescPer);
		
		JLabel lblPrecioNeto = new JLabel("Precio Neto:");
		lblPrecioNeto.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPrecioNeto.setBounds(9, 348, 112, 22);
		add(lblPrecioNeto);
		
		JLabel lblProveedor_1_2_3 = new JLabel("Precio Neto");
		lblProveedor_1_2_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProveedor_1_2_3.setBounds(120, 349, 118, 22);
		add(lblProveedor_1_2_3);
		
		JLabel lblDescuentoIntro = new JLabel("Descuento Intro:");
		lblDescuentoIntro.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDescuentoIntro.setBounds(268, 348, 126, 22);
		add(lblDescuentoIntro);
		
		JLabel lblProveedor_1_2_1_1 = new JLabel("Descuento intro");
		lblProveedor_1_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProveedor_1_2_1_1.setBounds(403, 348, 97, 22);
		add(lblProveedor_1_2_1_1);
		
		JLabel lblIva = new JLabel("IVA:");
		lblIva.setFont(new Font("Dialog", Font.BOLD, 12));
		lblIva.setBounds(10, 380, 107, 22);
		add(lblIva);
		
		JLabel lblProveedor_1_2_2_1 = new JLabel("iva");
		lblProveedor_1_2_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProveedor_1_2_2_1.setBounds(120, 380, 108, 22);
		add(lblProveedor_1_2_2_1);
		
		JLabel lblPvp = new JLabel("PVP:");
		lblPvp.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPvp.setBounds(268, 379, 135, 22);
		add(lblPvp);
		
		JLabel lblProveedor_1_3_2 = new JLabel("pvp");
		lblProveedor_1_3_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProveedor_1_3_2.setBounds(410, 380, 90, 22);
		add(lblProveedor_1_3_2);
		
		JLabel lblPrecioSugerido = new JLabel("Precio sugerido:");
		lblPrecioSugerido.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPrecioSugerido.setBounds(10, 421, 111, 22);
		add(lblPrecioSugerido);
		
		JLabel lblProveedor_1_3_1_2 = new JLabel("pre suge");
		lblProveedor_1_3_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProveedor_1_3_1_2.setBounds(120, 421, 67, 22);
		add(lblProveedor_1_3_1_2);
		
		JLabel lblMarca_1 = new JLabel("Marca:");
		lblMarca_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblMarca_1.setBounds(268, 421, 52, 22);
		add(lblMarca_1);
		
		JLabel lblProveedor_1_3_1_1_1 = new JLabel("marca");
		lblProveedor_1_3_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProveedor_1_3_1_1_1.setBounds(330, 421, 135, 22);
		add(lblProveedor_1_3_1_1_1);
		
		JLabel lblDatosComerciales = new JLabel("Datos Comerciales");
		lblDatosComerciales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosComerciales.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDatosComerciales.setBounds(-10, 273, 584, 33);
		add(lblDatosComerciales);
		
		JLabel lblDatosLogisticos = new JLabel("Datos Logisticos");
		lblDatosLogisticos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosLogisticos.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDatosLogisticos.setBounds(-10, 469, 584, 33);
		add(lblDatosLogisticos);
		
		JLabel lblUnidadEnvalaje = new JLabel("Unidad Embalaje:");
		lblUnidadEnvalaje.setFont(new Font("Dialog", Font.BOLD, 12));
		lblUnidadEnvalaje.setBounds(11, 500, 112, 22);
		add(lblUnidadEnvalaje);
		
		JLabel lblProveedor_1_4_1 = new JLabel("unidad emb");
		lblProveedor_1_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProveedor_1_4_1.setBounds(121, 500, 118, 22);
		add(lblProveedor_1_4_1);
		
		JLabel lblRegistroSanitario = new JLabel("Registro Sanitario:");
		lblRegistroSanitario.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRegistroSanitario.setBounds(269, 500, 126, 22);
		add(lblRegistroSanitario);
		
		JLabel lblProveedor_1_1_1_1 = new JLabel("Res sanita");
		lblProveedor_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProveedor_1_1_1_1.setBounds(411, 500, 111, 22);
		add(lblProveedor_1_1_1_1);
		
		JLabel lblVidaUtildias = new JLabel("Vida util (Dias):");
		lblVidaUtildias.setFont(new Font("Dialog", Font.BOLD, 12));
		lblVidaUtildias.setBounds(10, 532, 112, 22);
		add(lblVidaUtildias);
		
		JLabel lblProveedor_1_2_3_1 = new JLabel("vida util");
		lblProveedor_1_2_3_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProveedor_1_2_3_1.setBounds(121, 533, 118, 22);
		add(lblProveedor_1_2_3_1);
		
		JLabel lblCajaXPlanchas = new JLabel("Caja x Planchas:");
		lblCajaXPlanchas.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCajaXPlanchas.setBounds(269, 532, 126, 22);
		add(lblCajaXPlanchas);
		
		JLabel lblProveedor_1_2_1_1_1 = new JLabel("caja x planchas");
		lblProveedor_1_2_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProveedor_1_2_1_1_1.setBounds(404, 532, 97, 22);
		add(lblProveedor_1_2_1_1_1);
		
		JLabel lblPlanchasXPallet = new JLabel("Planchas x Pallet:");
		lblPlanchasXPallet.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPlanchasXPallet.setBounds(11, 564, 107, 22);
		add(lblPlanchasXPallet);
		
		JLabel lblProveedor_1_2_2_1_1 = new JLabel("planchas pallet");
		lblProveedor_1_2_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProveedor_1_2_2_1_1.setBounds(121, 564, 108, 22);
		add(lblProveedor_1_2_2_1_1);
		
		JLabel lblTipoDeEnvalaje = new JLabel("Tipo de Embalaje:");
		lblTipoDeEnvalaje.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTipoDeEnvalaje.setBounds(269, 563, 135, 22);
		add(lblTipoDeEnvalaje);
		
		JLabel lblProveedor_1_3_2_1 = new JLabel("tipo embalaje");
		lblProveedor_1_3_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProveedor_1_3_2_1.setBounds(411, 564, 90, 22);
		add(lblProveedor_1_3_2_1);
		String[] columns = new String[] {"Id", "Descripcion", "Fecha", "Monto"};
		
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
	
	public DefaultTableModel getModelIngresos() {
		return tableIngresos.getModel();
	}
	
	public DefaultTableModel getModelEgresos() {
		return tableEgresos.getModel();
	}

	public TableStandard getTable() {
		return tableIngresos;
	}


	public void setTable(TableStandard table) {
		this.tableIngresos = table;
	}
}
