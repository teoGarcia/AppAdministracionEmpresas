/**
 * 
 */
package TerceroMedio.GestionDeBodega.Menu;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import Menu.Side.SideMenu;
import TerceroMedio.GestionDeBodega.ControlIngresosEgresos.VistaControlIngresosYEgresos;
import TerceroMedio.GestionDeBodega.ControlInventario.VistaControlInventario;
import TerceroMedio.GestionDeBodega.ControlMermas.VistaControlMerma;
import TerceroMedio.GestionDeBodega.FormatoProducto.VistaFormatoProductos;
import TerceroMedio.GestionDeBodega.ManExtintores.VistaManExtintores;

/**
 * @author Dead
 *
 */
public class ControladorMenuGestionDeBodega implements ActionListener {

	private VistaMenuGestionBodega vmgb;

	public ControladorMenuGestionDeBodega(VistaMenuGestionBodega vmgb) {
		this.vmgb = vmgb;
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
		
		if(btn.equals(vmgb.getBtnInventario())) {
			SideMenu.registerContentPanel(new VistaControlInventario(), vmgb.getBtnInventario().getText()); 
		}else if(btn.equals(vmgb.getBtnCodPro())) {
			SideMenu.registerContentPanel(new VistaFormatoProductos(), vmgb.getBtnCodPro().getText()); 
		}else if(btn.equals(vmgb.getBtnIngMer())) {
			SideMenu.registerContentPanel(new VistaControlIngresosYEgresos(), vmgb.getBtnIngMer().getText()); 
		}else if(btn.equals(vmgb.getBtnMerMer())) {
			SideMenu.registerContentPanel(new VistaControlMerma(), vmgb.getBtnMerMer().getText()); 
		}else if(btn.equals(vmgb.getBtnManExtin())) {
			SideMenu.registerContentPanel(new VistaManExtintores(), vmgb.getBtnManExtin().getText()); 
		}
		 
	}

}
