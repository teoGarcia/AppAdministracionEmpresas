package TerceroMedio.GestionDeBodega.ControlStock;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import TerceroMedio.GestionDeBodega.ControlStock.ComprasYVentas.VistaCompraYVenta;
import TerceroMedio.GestionDeBodega.ControlStock.Producto.VistaProducto;
import ui.Labels.LabelTitulos;

public class VistaControlStock extends JPanel {
	
	private VistaProducto vp;
	private VistaCompraYVenta vcv;
	private JPanel panel;
	private ControladorControlStock control;
	
	public VistaControlStock() {
		inicialize();
	}
	
	private void inicialize() {
		
		control = new ControladorControlStock(this);
			
		setBounds(0, 0, 748, 722);
		setOpaque(false);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0,  767, 722);
		add(scrollPane);

		panel = new JPanel();
		panel.setBackground(new Color(59, 59, 59));
		panel.setPreferredSize(new Dimension(748, 1100));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		LabelTitulos lbltlsCartaGantt = new LabelTitulos("Control de Stock");
		lbltlsCartaGantt.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsCartaGantt.setBounds(0, 10, 722, 30);
		panel.add(lbltlsCartaGantt);
		
		
		vp = new VistaProducto();
		vp.setLocation(0, 100);
		vp.getCrud().getBtnOpcional().addActionListener(control);
		panel.add(vp);
			
		vcv = new VistaCompraYVenta();
		vcv.setLocation(0, 600);
		panel.add(vcv);
			
	}

	public VistaProducto getVp() {
		return vp;
	}

	public void setVp(VistaProducto vp) {
		this.vp = vp;
	}

	public VistaCompraYVenta getVcv() {
		return vcv;
	}

	public void setVcv(VistaCompraYVenta vcv) {
		this.vcv = vcv;
	}

}
