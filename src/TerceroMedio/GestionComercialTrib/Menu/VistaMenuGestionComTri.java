package TerceroMedio.GestionComercialTrib.Menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Menu.Side.SideMenu;
import TerceroMedio.GestionComercialTrib.Inventario.VistaInventario;

public class VistaMenuGestionComTri extends JPanel {
	
	private JButton btnInventario;
	private JButton btnDocMercantil;
	private JButton btnFormularioCotizacion;
	private JButton btnLibroCompraVentas;
	private JButton btnFormularioOC;
	private JButton btnFormulario29;
	private JButton btnConciliacionBancaria;
	private JButton btnFormulario22;
	private JButton btnBoletadeHonorarios;
	private ControlMenuGestionComTri cmgct;

	/**
	 * Create the panel.
	 */
	public VistaMenuGestionComTri() {
		
		inicialize();
		contentViewDefault();

	}
	
	private void inicialize() {
		
		cmgct = new ControlMenuGestionComTri(this);
		
		setBounds(0, 0, 208, 476);
		setLayout(new GridLayout(0, 1, 0, 0));
		setOpaque(false);
		
		btnInventario = new JButton("Inventario de Productos");
		btnInventario.setForeground(Color.WHITE);
		btnInventario.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnInventario.setBackground(new Color(54, 54, 54));
		btnInventario.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnInventario.addActionListener(cmgct);
		add(btnInventario);
		
		btnFormularioCotizacion = new JButton("Formulario de Cotizaci\u00F3n");
		btnFormularioCotizacion.setForeground(Color.WHITE);
		btnFormularioCotizacion.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnFormularioCotizacion.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnFormularioCotizacion.setBackground(new Color(54, 54, 54));
		btnFormularioCotizacion.addActionListener(cmgct);
		add(btnFormularioCotizacion);
		
		btnFormularioOC = new JButton("Formulario de O.C.");
		btnFormularioOC.setForeground(Color.WHITE);
		btnFormularioOC.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnFormularioOC.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnFormularioOC.setBackground(new Color(54, 54, 54));
		btnFormularioOC.addActionListener(cmgct);
		add(btnFormularioOC);
		
		btnConciliacionBancaria = new JButton("Conciliac\u00F3n Bancaria");
		btnConciliacionBancaria.setForeground(Color.WHITE);
		btnConciliacionBancaria.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnConciliacionBancaria.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnConciliacionBancaria.setBackground(new Color(54, 54, 54));
		btnConciliacionBancaria.addActionListener(cmgct);
		add(btnConciliacionBancaria);
		
		////////////////////////////////////
		btnDocMercantil = new JButton("Documentacion Mercantil");
		btnDocMercantil.setForeground(Color.WHITE);
		btnDocMercantil.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnDocMercantil.setBackground(new Color(54, 54, 54));
		btnDocMercantil.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnDocMercantil.addActionListener(cmgct);
		add(btnDocMercantil);
		
		btnLibroCompraVentas = new JButton("Libro Compra y Ventas");
		btnLibroCompraVentas.setForeground(Color.WHITE);
		btnLibroCompraVentas.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnLibroCompraVentas.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnLibroCompraVentas.setBackground(new Color(54, 54, 54));
		btnLibroCompraVentas.addActionListener(cmgct);
		add(btnLibroCompraVentas);
		
		btnFormulario29 = new JButton("Formulario 29");
		btnFormulario29.setForeground(Color.WHITE);
		btnFormulario29.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnFormulario29.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnFormulario29.setBackground(new Color(54, 54, 54));
		btnFormulario29.addActionListener(cmgct);
		add(btnFormulario29);
		
		btnBoletadeHonorarios = new JButton("Boleta de Honorarios");
		btnBoletadeHonorarios.setForeground(Color.WHITE);
		btnBoletadeHonorarios.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnBoletadeHonorarios.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnBoletadeHonorarios.setBackground(new Color(54, 54, 54));
		btnBoletadeHonorarios.addActionListener(cmgct);
		add(btnBoletadeHonorarios);
		
		
		btnFormulario22 = new JButton("Formulario 22");
		btnFormulario22.setForeground(Color.WHITE);
		btnFormulario22.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnFormulario22.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnFormulario22.setBackground(new Color(54, 54, 54));
		btnFormulario22.addActionListener(cmgct);
		add(btnFormulario22);
		
	}
	
	private void contentViewDefault() {
		SideMenu.registerContentPanel(new VistaInventario(), btnInventario.getText());
	}

	public JButton getBtnInventario() {
		return btnInventario;
	}

	public JButton getBtnDocMercantil() {
		return btnDocMercantil;
	}

	public JButton getBtnFormularioCotizacion() {
		return btnFormularioCotizacion;
	}

	public JButton getBtnLibroCompraVentas() {
		return btnLibroCompraVentas;
	}

	public JButton getBtnFormularioOC() {
		return btnFormularioOC;
	}

	public JButton getBtnFormulario29() {
		return btnFormulario29;
	}

	public JButton getBtnConciliacionBancaria() {
		return btnConciliacionBancaria;
	}

	public JButton getBtnFormulario22() {
		return btnFormulario22;
	}

	public JButton getBtnBoletadeHonorarios() {
		return btnBoletadeHonorarios;
	}

	public void setBtnInventario(JButton btnInventario) {
		this.btnInventario = btnInventario;
	}

	public void setBtnDocMercantil(JButton btnDocMercantil) {
		this.btnDocMercantil = btnDocMercantil;
	}

	public void setBtnFormularioCotizacion(JButton btnFormularioCotizacion) {
		this.btnFormularioCotizacion = btnFormularioCotizacion;
	}

	public void setBtnLibroCompraVentas(JButton btnLibroCompraVentas) {
		this.btnLibroCompraVentas = btnLibroCompraVentas;
	}

	public void setBtnFormularioOC(JButton btnFormularioOC) {
		this.btnFormularioOC = btnFormularioOC;
	}

	public void setBtnFormulario29(JButton btnFormulario29) {
		this.btnFormulario29 = btnFormulario29;
	}

	public void setBtnConciliacionBancaria(JButton btnConciliacionBancaria) {
		this.btnConciliacionBancaria = btnConciliacionBancaria;
	}

	public void setBtnFormulario22(JButton btnFormulario22) {
		this.btnFormulario22 = btnFormulario22;
	}

	public void setBtnBoletadeHonorarios(JButton btnBoletadeHonorarios) {
		this.btnBoletadeHonorarios = btnBoletadeHonorarios;
	}

}
