package TerceroMedio.OrganizacionOficinas.Menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Menu.Side.SideMenu;
import TerceroMedio.OrganizacionOficinas.InventariosDocFisicosDigitales.VistaInvDocFisDig;
import TerceroMedio.ProcesosAdministrativos.FormatoProyecto.VistaFormatoProyecto;
import TerceroMedio.ProcesosAdministrativos.Menu.ControlMenuProcesosAdministrativos;

public class VistaMenuInvDocFisDig extends JPanel {
	
	private ControlMenuInvDocFisDig control;
	private JButton btnInvDocFisDig;

	/**
	 * Create the panel.
	 */
	public VistaMenuInvDocFisDig() {
		
		inicialize();
		contentViewDefault();

	}
	
	private void inicialize() {
		
		control = new ControlMenuInvDocFisDig(this);
		
		setBounds(0, 0, 208, 476);
		setLayout(new GridLayout(0, 1, 0, 0));
		setOpaque(false);
		
		btnInvDocFisDig = new JButton("Gestion de Documentos");
		btnInvDocFisDig.setForeground(Color.WHITE);
		btnInvDocFisDig.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnInvDocFisDig.setBackground(new Color(54, 54, 54));
		btnInvDocFisDig.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnInvDocFisDig.addActionListener(control);
		add(btnInvDocFisDig);
		
		/*btnCarGantt = new JButton("Carta GANTT");
		btnCarGantt.setForeground(Color.WHITE);
		btnCarGantt.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCarGantt.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCarGantt.setBackground(new Color(54, 54, 54));
		btnCarGantt.addActionListener(control);
		add(btnCarGantt);
		
		btnCalPro = new JButton("Calendario de produccion");
		btnCalPro.setForeground(Color.WHITE);
		btnCalPro.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCalPro.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCalPro.setBackground(new Color(54, 54, 54));
		btnCalPro.addActionListener(control);
		add(btnCalPro);*/
		
		
	}
	
	private void contentViewDefault() {
		SideMenu.registerContentPanel(new VistaInvDocFisDig(), btnInvDocFisDig.getText());
	}

	public JButton getBtnInvDocFisDig() {
		return btnInvDocFisDig;
	}

	public void setBtnInvDocFisDig(JButton btnInvDocFisDig) {
		this.btnInvDocFisDig = btnInvDocFisDig;
	}
	

}