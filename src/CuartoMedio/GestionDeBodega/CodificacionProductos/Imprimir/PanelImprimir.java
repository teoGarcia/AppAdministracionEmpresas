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
import CuartoMedio.GestionDeBodega.CodificacionProductos.CodificacionProdEntity;
import core.Helpers;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import ui.TablaUi.TableStandard;

public class PanelImprimir extends JPanel implements Printable{
	
	private JLabel lblProveedor;
	private JLabel lblProducto;
	private JLabel lblCodIntProducto;
	private JLabel lblCodBarraEAN13;
	private JLabel lblCodBarraEAN14;
	private JLabel lblPaisAbas;
	private JLabel lblPaisFrabri;
	private JLabel lblPreSinImp;
	private JLabel lblMarca;
	private JLabel lblDescPer;
	private JLabel lblPrecNeto;
	private JLabel lblDescIntro;
	private JLabel lblIva;
	private JLabel lblPvp;
	private JLabel lblPreSuge;
	private JLabel lblUnidadEmb;
	private JLabel lblResgSani;
	private JLabel lblVidautil;
	private JLabel lblCajaPlanc;
	private JLabel lblPlanchaPallet;
	private JLabel lblTEmbalaje;

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
		lblProveedor_lbl.setFont(new Font("Dialog", Font.BOLD, 10));
		lblProveedor_lbl.setBounds(50, 123, 67, 22);
		add(lblProveedor_lbl);
		
		lblProveedor = new JLabel("proveedor");
		lblProveedor.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblProveedor.setBounds(127, 124, 67, 22);
		add(lblProveedor);
		
		JLabel lblDescripcionDeProducto = new JLabel("Descripcion de Producto:");
		lblDescripcionDeProducto.setFont(new Font("Dialog", Font.BOLD, 10));
		lblDescripcionDeProducto.setBounds(288, 123, 155, 22);
		add(lblDescripcionDeProducto);
		
		lblProducto = new JLabel("producto");
		lblProducto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProducto.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblProducto.setBounds(423, 124, 97, 22);
		add(lblProducto);
		
		JLabel lblCod = new JLabel("Cod. Int. Producto:");
		lblCod.setFont(new Font("Dialog", Font.BOLD, 10));
		lblCod.setBounds(49, 155, 112, 22);
		add(lblCod);
		
		lblCodIntProducto = new JLabel("Cod int pro");
		lblCodIntProducto.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCodIntProducto.setBounds(160, 156, 112, 22);
		add(lblCodIntProducto);
		
		JLabel lblCodBarraEat = new JLabel("Cod. Barras EAN-13:");
		lblCodBarraEat.setFont(new Font("Dialog", Font.BOLD, 10));
		lblCodBarraEat.setBounds(288, 155, 126, 22);
		add(lblCodBarraEat);
		
		lblCodBarraEAN13 = new JLabel("Cod barras ean 13");
		lblCodBarraEAN13.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodBarraEAN13.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCodBarraEAN13.setBounds(413, 155, 107, 22);
		add(lblCodBarraEAN13);
		
		JLabel lblCodBarrasEan = new JLabel("Cod. Barras EAN-14:");
		lblCodBarrasEan.setFont(new Font("Dialog", Font.BOLD, 10));
		lblCodBarrasEan.setBounds(50, 187, 131, 22);
		add(lblCodBarrasEan);
		
		lblCodBarraEAN14 = new JLabel("cod barras ean 14");
		lblCodBarraEAN14.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCodBarraEAN14.setBounds(170, 187, 108, 22);
		add(lblCodBarraEAN14);
		
		JLabel lblPaisDeAbasteciomiento = new JLabel("Pais de Abasteciomiento:");
		lblPaisDeAbasteciomiento.setFont(new Font("Dialog", Font.BOLD, 10));
		lblPaisDeAbasteciomiento.setBounds(288, 186, 155, 22);
		add(lblPaisDeAbasteciomiento);
		
		lblPaisAbas = new JLabel("pais");
		lblPaisAbas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPaisAbas.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblPaisAbas.setBounds(413, 187, 107, 22);
		add(lblPaisAbas);
		
		JLabel lblPaisDeFabricacion = new JLabel("Pais de Fabricacion:");
		lblPaisDeFabricacion.setFont(new Font("Dialog", Font.BOLD, 10));
		lblPaisDeFabricacion.setBounds(50, 228, 126, 22);
		add(lblPaisDeFabricacion);
		
		lblPaisFrabri = new JLabel("pais");
		lblPaisFrabri.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblPaisFrabri.setBounds(175, 228, 67, 22);
		add(lblPaisFrabri);
		
		JLabel lblMarca_lbl = new JLabel("Marca:");
		lblMarca_lbl.setFont(new Font("Dialog", Font.BOLD, 10));
		lblMarca_lbl.setBounds(288, 228, 52, 22);
		add(lblMarca_lbl);
		
		lblMarca = new JLabel("marca");
		lblMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarca.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblMarca.setBounds(413, 228, 107, 22);
		add(lblMarca);
		
		JLabel lblPrecioSinImp = new JLabel("Precio sin Impue. :");
		lblPrecioSinImp.setFont(new Font("Dialog", Font.BOLD, 10));
		lblPrecioSinImp.setBounds(50, 317, 112, 22);
		add(lblPrecioSinImp);
		
		lblPreSinImp = new JLabel("precio sin imp");
		lblPreSinImp.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblPreSinImp.setBounds(160, 317, 112, 22);
		add(lblPreSinImp);
		
		JLabel lblDescuentoPermanente = new JLabel("Descuento permanente:");
		lblDescuentoPermanente.setFont(new Font("Dialog", Font.BOLD, 10));
		lblDescuentoPermanente.setBounds(288, 317, 126, 22);
		add(lblDescuentoPermanente);
		
		lblDescPer = new JLabel("Des per");
		lblDescPer.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescPer.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblDescPer.setBounds(408, 317, 112, 22);
		add(lblDescPer);
		
		JLabel lblPrecioNeto = new JLabel("Precio Neto:");
		lblPrecioNeto.setFont(new Font("Dialog", Font.BOLD, 10));
		lblPrecioNeto.setBounds(49, 349, 112, 22);
		add(lblPrecioNeto);
		
		lblPrecNeto = new JLabel("Precio Neto");
		lblPrecNeto.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblPrecNeto.setBounds(160, 350, 112, 22);
		add(lblPrecNeto);
		
		JLabel lblDescuentoIntro = new JLabel("Descuento Intro:");
		lblDescuentoIntro.setFont(new Font("Dialog", Font.BOLD, 10));
		lblDescuentoIntro.setBounds(288, 349, 123, 22);
		add(lblDescuentoIntro);
		
		lblDescIntro = new JLabel("Descuento intro");
		lblDescIntro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescIntro.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblDescIntro.setBounds(413, 349, 107, 22);
		add(lblDescIntro);
		
		JLabel lblIva_lbl = new JLabel("IVA:");
		lblIva_lbl.setFont(new Font("Dialog", Font.BOLD, 10));
		lblIva_lbl.setBounds(50, 381, 107, 22);
		add(lblIva_lbl);
		
		lblIva = new JLabel("iva");
		lblIva.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblIva.setBounds(160, 381, 108, 22);
		add(lblIva);
		
		JLabel lblPvp_pvp = new JLabel("PVP:");
		lblPvp_pvp.setFont(new Font("Dialog", Font.BOLD, 10));
		lblPvp_pvp.setBounds(288, 380, 123, 22);
		add(lblPvp_pvp);
		
		lblPvp = new JLabel("pvp");
		lblPvp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPvp.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblPvp.setBounds(413, 381, 107, 22);
		add(lblPvp);
		
		JLabel lblPrecioSugerido = new JLabel("Precio sugerido:");
		lblPrecioSugerido.setFont(new Font("Dialog", Font.BOLD, 10));
		lblPrecioSugerido.setBounds(50, 422, 111, 22);
		add(lblPrecioSugerido);
		
		lblPreSuge = new JLabel("pre suge");
		lblPreSuge.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblPreSuge.setBounds(160, 422, 112, 22);
		add(lblPreSuge);
		
		JLabel lblDatosComerciales = new JLabel("Datos Comerciales");
		lblDatosComerciales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosComerciales.setFont(new Font("Dialog", Font.BOLD, 11));
		lblDatosComerciales.setBounds(0, 274, 584, 33);
		add(lblDatosComerciales);
		
		JLabel lblDatosLogisticos = new JLabel("Datos Logisticos");
		lblDatosLogisticos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosLogisticos.setFont(new Font("Dialog", Font.BOLD, 11));
		lblDatosLogisticos.setBounds(0, 455, 584, 33);
		add(lblDatosLogisticos);
		
		JLabel lblUnidadEnvalaje = new JLabel("Unidad Embalaje:");
		lblUnidadEnvalaje.setFont(new Font("Dialog", Font.BOLD, 10));
		lblUnidadEnvalaje.setBounds(51, 513, 112, 22);
		add(lblUnidadEnvalaje);
		
		lblUnidadEmb = new JLabel("unidad emb");
		lblUnidadEmb.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblUnidadEmb.setBounds(161, 513, 118, 22);
		add(lblUnidadEmb);
		
		JLabel lblRegistroSanitario = new JLabel("Registro Sanitario:");
		lblRegistroSanitario.setFont(new Font("Dialog", Font.BOLD, 10));
		lblRegistroSanitario.setBounds(289, 514, 107, 22);
		add(lblRegistroSanitario);
		
		lblResgSani = new JLabel("Res sanita");
		lblResgSani.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResgSani.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblResgSani.setBounds(401, 514, 120, 22);
		add(lblResgSani);
		
		JLabel lblVidaUtildias = new JLabel("Vida util (Dias):");
		lblVidaUtildias.setFont(new Font("Dialog", Font.BOLD, 10));
		lblVidaUtildias.setBounds(50, 545, 112, 22);
		add(lblVidaUtildias);
		
		lblVidautil = new JLabel("vida util");
		lblVidautil.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblVidautil.setBounds(161, 546, 118, 22);
		add(lblVidautil);
		
		JLabel lblCajaXPlanchas = new JLabel("Caja x Planchas:");
		lblCajaXPlanchas.setFont(new Font("Dialog", Font.BOLD, 10));
		lblCajaXPlanchas.setBounds(289, 546, 97, 22);
		add(lblCajaXPlanchas);
		
		lblCajaPlanc = new JLabel("caja x planchas");
		lblCajaPlanc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCajaPlanc.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCajaPlanc.setBounds(408, 546, 113, 22);
		add(lblCajaPlanc);
		
		JLabel lblPlanchasXPallet = new JLabel("Planchas x Pallet:");
		lblPlanchasXPallet.setFont(new Font("Dialog", Font.BOLD, 10));
		lblPlanchasXPallet.setBounds(51, 577, 107, 22);
		add(lblPlanchasXPallet);
		
		lblPlanchaPallet = new JLabel("planchas pallet");
		lblPlanchaPallet.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblPlanchaPallet.setBounds(161, 577, 108, 22);
		add(lblPlanchaPallet);
		
		JLabel lblTipoDeEnvalaje = new JLabel("Tipo de Embalaje:");
		lblTipoDeEnvalaje.setFont(new Font("Dialog", Font.BOLD, 10));
		lblTipoDeEnvalaje.setBounds(289, 577, 97, 22);
		add(lblTipoDeEnvalaje);
		
		lblTEmbalaje = new JLabel("tipo embalaje");
		lblTEmbalaje.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTEmbalaje.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblTEmbalaje.setBounds(401, 578, 120, 22);
		add(lblTEmbalaje);
		String[] columns = new String[] {"Id", "Descripcion", "Fecha", "Monto"};
		
	}
	
	public void cargarForm(CodificacionProdEntity record) {
		
		lblProveedor.setText(record.getProveedor());
		lblProducto.setText(record.getDescripProducto());
		lblCodIntProducto.setText(record.getCodIntProducto());
		lblCodBarraEAN13.setText(record.getCodBarrasEAN13());
		lblCodBarraEAN14.setText(record.getCodBarrasEAN14());
		lblPaisAbas.setText(record.getPaisAbastecimiento());
		lblPaisFrabri.setText(record.getPaisFabricacion());
		lblMarca.setText(record.getMarca());
		
		lblPreSinImp.setText(Helpers.ponerPuntos(record.getPrecioSinImpuestos()));
		lblDescPer.setText(Helpers.ponerPuntos(record.getDescuentoPermanente()));
		lblPrecNeto.setText(Helpers.ponerPuntos(record.getPrecioNeto()));
		lblDescIntro.setText(Helpers.ponerPuntos(record.getDescuentoIntro()));
		lblIva.setText(Helpers.ponerPuntos(record.getIVA()));
		lblPvp.setText(Helpers.ponerPuntos(record.getPVP()));
		lblPreSuge.setText(Helpers.ponerPuntos(record.getPrecioSugerido()));
		
		lblUnidadEmb.setText(record.getUnidadEmbalaje());
		lblResgSani.setText(record.getRegistroSanitario());
		lblVidautil.setText(record.getVidaUtil());
		lblCajaPlanc.setText(record.getCajasxPlanchas());
		lblPlanchaPallet.setText(record.getPlanchasxPallet());
		lblTEmbalaje.setText(record.getTipoEmbalaje());
		
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

	public JLabel getLblProveedor() {
		return lblProveedor;
	}

	public void setLblProveedor(JLabel lblProveedor) {
		this.lblProveedor = lblProveedor;
	}

	public JLabel getLblProducto() {
		return lblProducto;
	}

	public void setLblProducto(JLabel lblProducto) {
		this.lblProducto = lblProducto;
	}

	public JLabel getLblCodIntProducto() {
		return lblCodIntProducto;
	}

	public void setLblCodIntProducto(JLabel lblCodIntProducto) {
		this.lblCodIntProducto = lblCodIntProducto;
	}

	public JLabel getLblCodBarraEAN13() {
		return lblCodBarraEAN13;
	}

	public void setLblCodBarraEAN13(JLabel lblCodBarraEAN13) {
		this.lblCodBarraEAN13 = lblCodBarraEAN13;
	}

	public JLabel getLblCodBarraEAN14() {
		return lblCodBarraEAN14;
	}

	public void setLblCodBarraEAN14(JLabel lblCodBarraEAN14) {
		this.lblCodBarraEAN14 = lblCodBarraEAN14;
	}

	public JLabel getLblPaisAbas() {
		return lblPaisAbas;
	}

	public void setLblPaisAbas(JLabel lblPaisAbas) {
		this.lblPaisAbas = lblPaisAbas;
	}

	public JLabel getLblPaisFrabri() {
		return lblPaisFrabri;
	}

	public void setLblPaisFrabri(JLabel lblPaisFrabri) {
		this.lblPaisFrabri = lblPaisFrabri;
	}

	public JLabel getLblPreSinImp() {
		return lblPreSinImp;
	}

	public void setLblPreSinImp(JLabel lblPreSinImp) {
		this.lblPreSinImp = lblPreSinImp;
	}

	public JLabel getLblMarca() {
		return lblMarca;
	}

	public void setLblMarca(JLabel lblMarca) {
		this.lblMarca = lblMarca;
	}

	public JLabel getLblDescPer() {
		return lblDescPer;
	}

	public void setLblDescPer(JLabel lblDescPer) {
		this.lblDescPer = lblDescPer;
	}

	public JLabel getLblPrecNeto() {
		return lblPrecNeto;
	}

	public void setLblPrecNeto(JLabel lblPrecNeto) {
		this.lblPrecNeto = lblPrecNeto;
	}

	public JLabel getLblDescIntro() {
		return lblDescIntro;
	}

	public void setLblDescIntro(JLabel lblDescIntro) {
		this.lblDescIntro = lblDescIntro;
	}

	public JLabel getLblIva() {
		return lblIva;
	}

	public void setLblIva(JLabel lblIva) {
		this.lblIva = lblIva;
	}

	public JLabel getLblPvp() {
		return lblPvp;
	}

	public void setLblPvp(JLabel lblPvp) {
		this.lblPvp = lblPvp;
	}

	public JLabel getLblPreSuge() {
		return lblPreSuge;
	}

	public void setLblPreSuge(JLabel lblPreSuge) {
		this.lblPreSuge = lblPreSuge;
	}

	public JLabel getLblUnidadEmb() {
		return lblUnidadEmb;
	}

	public void setLblUnidadEmb(JLabel lblUnidadEmb) {
		this.lblUnidadEmb = lblUnidadEmb;
	}

	public JLabel getLblResgSani() {
		return lblResgSani;
	}

	public void setLblResgSani(JLabel lblResgSani) {
		this.lblResgSani = lblResgSani;
	}

	public JLabel getLblVidautil() {
		return lblVidautil;
	}

	public void setLblVidautil(JLabel lblVidautil) {
		this.lblVidautil = lblVidautil;
	}

	public JLabel getLblCajaPlanc() {
		return lblCajaPlanc;
	}

	public void setLblCajaPlanc(JLabel lblCajaPlanc) {
		this.lblCajaPlanc = lblCajaPlanc;
	}

	public JLabel getLblPlanchaPallet() {
		return lblPlanchaPallet;
	}

	public void setLblPlanchaPallet(JLabel lblPlanchaPallet) {
		this.lblPlanchaPallet = lblPlanchaPallet;
	}

	public JLabel getLblTEmbalaje() {
		return lblTEmbalaje;
	}

	public void setLblTEmbalaje(JLabel lblTEmbalaje) {
		this.lblTEmbalaje = lblTEmbalaje;
	}

}
