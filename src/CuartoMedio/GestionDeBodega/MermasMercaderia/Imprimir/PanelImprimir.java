package CuartoMedio.GestionDeBodega.MermasMercaderia.Imprimir;

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
import CuartoMedio.GestionDeBodega.MermasMercaderia.MermaMercaderiaEntity;
import core.Helpers;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import ui.TablaUi.TableStandard;

public class PanelImprimir extends JPanel implements Printable{
	
	private JLabel lblTMovimiento;
	private JLabel lblMotivo;
	private JLabel lblFolio;
	private JLabel lblLocal;
	private JLabel lblTiendaa;
	private JLabel lblAlmacen;
	private JLabel lblCentroCosto;
	private JLabel lblFecha;
	private JLabel lblSeccion;
	private JLabel lblCodSapBarra;
	private JLabel lblDescMaterial;
	private JLabel lbUnidadMedica;
	private JLabel lblCodigoMotivo;
	private JLabel lblCantidad;

	/**
	 * Create the panel.
	 */
	public PanelImprimir() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Mermas y Consumos Autorizados");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTitulo.setBounds(0, 80, 584, 33);
		add(lblTitulo);
		
		JLabel lblProveedor_lbl = new JLabel("Tipo de Movimiento:");
		lblProveedor_lbl.setFont(new Font("Dialog", Font.BOLD, 12));
		lblProveedor_lbl.setBounds(25, 151, 118, 22);
		add(lblProveedor_lbl);
		
		lblTMovimiento = new JLabel("Tipo de movimiento");
		lblTMovimiento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTMovimiento.setBounds(145, 151, 112, 22);
		add(lblTMovimiento);
		
		JLabel lblDescripcionDeProducto = new JLabel("Motivo");
		lblDescripcionDeProducto.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDescripcionDeProducto.setBounds(283, 150, 112, 22);
		add(lblDescripcionDeProducto);
		
		lblMotivo = new JLabel("motivo");
		lblMotivo.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMotivo.setBounds(384, 151, 131, 22);
		add(lblMotivo);
		
		JLabel lblCod = new JLabel("Folio:");
		lblCod.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCod.setBounds(24, 182, 112, 22);
		add(lblCod);
		
		lblFolio = new JLabel("Folio");
		lblFolio.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblFolio.setBounds(145, 183, 102, 22);
		add(lblFolio);
		
		JLabel lblCodBarraEat = new JLabel("Local");
		lblCodBarraEat.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCodBarraEat.setBounds(283, 182, 97, 22);
		add(lblCodBarraEat);
		
		lblLocal = new JLabel("Local");
		lblLocal.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblLocal.setBounds(384, 182, 131, 22);
		add(lblLocal);
		
		JLabel lblTienda = new JLabel("Tienda");
		lblTienda.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTienda.setBounds(25, 214, 131, 22);
		add(lblTienda);
		
		lblTiendaa = new JLabel("Tienda");
		lblTiendaa.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTiendaa.setBounds(145, 214, 98, 22);
		add(lblTiendaa);
		
		JLabel lblPaisDeAbasteciomiento = new JLabel("Almacen:");
		lblPaisDeAbasteciomiento.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPaisDeAbasteciomiento.setBounds(283, 213, 97, 22);
		add(lblPaisDeAbasteciomiento);
		
		lblAlmacen = new JLabel("Almacen");
		lblAlmacen.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAlmacen.setBounds(384, 214, 118, 22);
		add(lblAlmacen);
		
		JLabel lblPaisDeFabricacion = new JLabel("Centro costo:");
		lblPaisDeFabricacion.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPaisDeFabricacion.setBounds(25, 255, 108, 22);
		add(lblPaisDeFabricacion);
		
		lblCentroCosto = new JLabel("Centro costo");
		lblCentroCosto.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCentroCosto.setBounds(143, 255, 114, 22);
		add(lblCentroCosto);
		
		JLabel lblSeccion_lbl = new JLabel("Seccion:");
		lblSeccion_lbl.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSeccion_lbl.setBounds(283, 255, 52, 22);
		add(lblSeccion_lbl);
		
		lblSeccion = new JLabel("seccion");
		lblSeccion.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSeccion.setBounds(384, 255, 96, 22);
		add(lblSeccion);
		
		JLabel lblPrecioSinImp = new JLabel("Fecha:");
		lblPrecioSinImp.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPrecioSinImp.setBounds(25, 344, 112, 22);
		add(lblPrecioSinImp);
		
		lblFecha = new JLabel("fecha");
		lblFecha.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblFecha.setBounds(135, 344, 118, 22);
		add(lblFecha);
		
		JLabel lblCodBarra_lbl = new JLabel("Cod SAP / Barra:");
		lblCodBarra_lbl.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCodBarra_lbl.setBounds(283, 344, 112, 22);
		add(lblCodBarra_lbl);
		
		lblCodSapBarra = new JLabel("Des per");
		lblCodSapBarra.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCodSapBarra.setBounds(418, 344, 118, 22);
		add(lblCodSapBarra);
		
		JLabel lblDesc = new JLabel("Desc. Material:");
		lblDesc.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDesc.setBounds(24, 376, 112, 22);
		add(lblDesc);
		
		lblDescMaterial = new JLabel("Desc. Material");
		lblDescMaterial.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDescMaterial.setBounds(135, 377, 118, 22);
		add(lblDescMaterial);
		
		JLabel lblDescuentoIntro = new JLabel("Unidad Medica:");
		lblDescuentoIntro.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDescuentoIntro.setBounds(283, 376, 126, 22);
		add(lblDescuentoIntro);
		
		lbUnidadMedica = new JLabel("Unidad Medica");
		lbUnidadMedica.setFont(new Font("Dialog", Font.PLAIN, 12));
		lbUnidadMedica.setBounds(418, 376, 97, 22);
		add(lbUnidadMedica);
		
		JLabel lblIva_lbl = new JLabel("Codigo Motivo:");
		lblIva_lbl.setFont(new Font("Dialog", Font.BOLD, 12));
		lblIva_lbl.setBounds(25, 408, 107, 22);
		add(lblIva_lbl);
		
		lblCodigoMotivo = new JLabel("Codigo motivo");
		lblCodigoMotivo.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCodigoMotivo.setBounds(135, 408, 108, 22);
		add(lblCodigoMotivo);
		
		JLabel lblcan = new JLabel("Cantidad:");
		lblcan.setFont(new Font("Dialog", Font.BOLD, 12));
		lblcan.setBounds(283, 407, 135, 22);
		add(lblcan);
		
		lblCantidad = new JLabel("cantidad");
		lblCantidad.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCantidad.setBounds(418, 408, 97, 22);
		add(lblCantidad);
		String[] columns = new String[] {"Id", "Descripcion", "Fecha", "Monto"};
		
	}
	
	public void cargarForm(MermaMercaderiaEntity record) {
		
		lblTMovimiento.setText(""+record.getTipoMovString());
		lblMotivo.setText(""+record.getMotivo());
		lblFolio.setText(record.getFolio());
		lblLocal.setText(record.getLocal());
		lblTiendaa.setText(record.getTienda());
		lblAlmacen.setText(record.getAlmacen());
		lblCentroCosto.setText(record.getCentroCosto());
		lblSeccion.setText(record.getSeccion());
		
		lblFecha.setText(Helpers.getFechaFormat(record.getFecha()));
		lblCodSapBarra.setText(record.getCodSAPBARRAS());
		lblDescMaterial.setText(record.getDescripcionMaterial());
		lbUnidadMedica.setText(""+record.getUnidadMedida());
		lblCodigoMotivo.setText(record.getCodigoMotivo());
		lblCantidad.setText(record.getCantidad());
		
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
		return lblTMovimiento;
	}

	public void setLblProveedor(JLabel lblProveedor) {
		this.lblTMovimiento = lblProveedor;
	}

	public JLabel getLblProducto() {
		return lblMotivo;
	}

	public void setLblProducto(JLabel lblProducto) {
		this.lblMotivo = lblProducto;
	}

	public JLabel getLblCodIntProducto() {
		return lblFolio;
	}

	public void setLblCodIntProducto(JLabel lblCodIntProducto) {
		this.lblFolio = lblCodIntProducto;
	}

	public JLabel getLblCodBarraEAN13() {
		return lblLocal;
	}

	public void setLblCodBarraEAN13(JLabel lblCodBarraEAN13) {
		this.lblLocal = lblCodBarraEAN13;
	}

	public JLabel getLblCodBarraEAN14() {
		return lblTiendaa;
	}

	public void setLblCodBarraEAN14(JLabel lblCodBarraEAN14) {
		this.lblTiendaa = lblCodBarraEAN14;
	}

	public JLabel getLblPaisAbas() {
		return lblAlmacen;
	}

	public void setLblPaisAbas(JLabel lblPaisAbas) {
		this.lblAlmacen = lblPaisAbas;
	}

	public JLabel getLblPaisFrabri() {
		return lblCentroCosto;
	}

	public void setLblPaisFrabri(JLabel lblPaisFrabri) {
		this.lblCentroCosto = lblPaisFrabri;
	}

	public JLabel getLblPreSinImp() {
		return lblFecha;
	}

	public void setLblPreSinImp(JLabel lblPreSinImp) {
		this.lblFecha = lblPreSinImp;
	}

	public JLabel getLblMarca() {
		return lblSeccion;
	}

	public void setLblMarca(JLabel lblMarca) {
		this.lblSeccion = lblMarca;
	}

	public JLabel getLblDescPer() {
		return lblCodSapBarra;
	}

	public void setLblDescPer(JLabel lblDescPer) {
		this.lblCodSapBarra = lblDescPer;
	}

	public JLabel getLblPrecNeto() {
		return lblDescMaterial;
	}

	public void setLblPrecNeto(JLabel lblPrecNeto) {
		this.lblDescMaterial = lblPrecNeto;
	}

	public JLabel getLblDescIntro() {
		return lbUnidadMedica;
	}

	public void setLblDescIntro(JLabel lblDescIntro) {
		this.lbUnidadMedica = lblDescIntro;
	}

	public JLabel getLblIva() {
		return lblCodigoMotivo;
	}

	public void setLblIva(JLabel lblIva) {
		this.lblCodigoMotivo = lblIva;
	}

	public JLabel getLblPvp() {
		return lblCantidad;
	}

	public void setLblPvp(JLabel lblPvp) {
		this.lblCantidad = lblPvp;
	}



}