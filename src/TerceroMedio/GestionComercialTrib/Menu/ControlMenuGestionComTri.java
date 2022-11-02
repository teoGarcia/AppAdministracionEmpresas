package TerceroMedio.GestionComercialTrib.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Menu.Side.SideMenu;
import TerceroMedio.GestionComercialTrib.Inventario.VistaInventario;

public class ControlMenuGestionComTri implements ActionListener {
	
	private VistaMenuGestionComTri vista;

	public ControlMenuGestionComTri(VistaMenuGestionComTri vista) {
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = e.getActionCommand();
		if(!SideMenu.isContentPanel(name)) lazinLoadView(e.getSource());
		SideMenu.changeContentPanel(name);
		
	}
	
	private void lazinLoadView(Object btn) {
		// TODO Auto-generated method stub
		
		if(btn.equals(vista.getBtnInventario())) {
			SideMenu.registerContentPanel(new VistaInventario(), vista.getBtnInventario().getText()); 
		}/*else if(btn.equals(vmgb.getBtnCodPro())) {
			System.out.println("btn: "+ vmgb.getBtnCodPro().getText());
			SideMenu.registerContentPanel(new VistaCodificacionProductos(), vmgb.getBtnCodPro().getText()); 
		}else if(btn.equals(vmgb.getBtnIngMer())) {
			SideMenu.registerContentPanel(new VistaIngresosYEgresos(), vmgb.getBtnIngMer().getText()); 
		}else if(btn.equals(vmgb.getBtnMerMer())) {
			SideMenu.registerContentPanel(new VistaMermaMercaderia(), vmgb.getBtnMerMer().getText()); 
		}*/
		 
	}

}
