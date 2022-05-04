package CuartoMedio.LegislacionLaboral.PermisosLaborales;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class VistaPermisosLaborales extends JPanel {

	public VistaPermisosLaborales() {
		inicialize();
	}
	
	private void inicialize() {
		setOpaque(false);
		setBounds(0, 0, 774, 731);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Permisos Laborales");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 34, 774, 29);
		add(lblTitulo);
		
		JEditorPane txtDefinicion = new JEditorPane();
		txtDefinicion.setForeground(new Color(255, 255, 255));
		txtDefinicion.setOpaque(false);
		txtDefinicion.setEditable(false);
		txtDefinicion.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtDefinicion.setText("DEFINICION");
		txtDefinicion.setBackground(new Color(254, 254, 254));
		txtDefinicion.setBounds(21, 95, 731, 99);
		add(txtDefinicion);
		
		JTabbedPane tabbedPaneContratos = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneContratos.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPaneContratos.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		tabbedPaneContratos.setForeground(Color.GRAY);
		tabbedPaneContratos.setBackground(new Color(54, 54, 54));
		tabbedPaneContratos.setOpaque(true);
		tabbedPaneContratos.setBounds(5, 250, 754, 404);
		tabbedPaneContratos.setFont(new Font("Dialog", Font.BOLD, 14));
		add(tabbedPaneContratos);
	}
}
