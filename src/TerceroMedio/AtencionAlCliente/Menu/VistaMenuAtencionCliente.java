package TerceroMedio.AtencionAlCliente.Menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Menu.Side.SideMenu;
import TerceroMedio.AtencionAlCliente.Quejas.VistaQuejas;
import TerceroMedio.GestionComercialTrib.Inventario.VistaInventario;

public class VistaMenuAtencionCliente extends JPanel {
	
	private JButton btnQuejas;
	private JButton btnResgClientes;

	private ControlMenuAtencionCliente cmgct;

	/**
	 * Create the panel.
	 */
	public VistaMenuAtencionCliente() {
		inicialize();
		contentViewDefault();
	}
	
	private void inicialize() {
		
		cmgct = new ControlMenuAtencionCliente(this);
		
		setBounds(0, 0, 208, 476);
		setLayout(new GridLayout(0, 1, 0, 0));
		setOpaque(false);
		
		btnQuejas = new JButton("Formulario de Quejas");
		btnQuejas.setForeground(Color.WHITE);
		btnQuejas.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnQuejas.setBackground(new Color(54, 54, 54));
		btnQuejas.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnQuejas.addActionListener(cmgct);
		add(btnQuejas);
		
		btnResgClientes = new JButton("Registro de Clientes");
		btnResgClientes.setForeground(Color.WHITE);
		btnResgClientes.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnResgClientes.setBackground(new Color(54, 54, 54));
		btnResgClientes.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnResgClientes.addActionListener(cmgct);
		add(btnResgClientes);
		
	}
	
	private void contentViewDefault() {
		SideMenu.registerContentPanel(new VistaQuejas(), btnQuejas.getText());
	}

	public JButton getBtnQuejas() {
		return btnQuejas;
	}

	public JButton getBtnResgClientes() {
		return btnResgClientes;
	}

	

	public void setBtnQuejas(JButton btnQuejas) {
		this.btnQuejas = btnQuejas;
	}

	public void setBtnResgClientes(JButton btnResgClientes) {
		this.btnResgClientes = btnResgClientes;
	}

}
