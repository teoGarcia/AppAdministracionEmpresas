/**
 * 
 */
package CuartoMedio.GestionDeBodega.Menu;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import CuartoMedio.GestionDeBodega.CodificacionProductos.VistaCodificacionProductos;
import CuartoMedio.GestionDeBodega.IngresosYEgresos.VistaIngresosYEgresos;
import CuartoMedio.GestionDeBodega.Inventario.VistaInventario;
import CuartoMedio.LegislacionLaboral.CertificadoVacaciones.VistaCertificadoVacaciones;
import CuartoMedio.LegislacionLaboral.Finiquitos.VistaFiniquito;
import CuartoMedio.LegislacionLaboral.PermisosLaborales.VistaPermisosLaborales;
import Menu.Side.SideMenu;

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
			SideMenu.registerContentPanel(new VistaInventario(), vmgb.getBtnInventario().getText()); 
		}else if(btn.equals(vmgb.getBtnCodPro())) {
			SideMenu.registerContentPanel(new VistaCodificacionProductos(), vmgb.getBtnCodPro().getText()); 
		}else if(btn.equals(vmgb.getBtnIngMer())) {
			SideMenu.registerContentPanel(new VistaIngresosYEgresos(), vmgb.getBtnIngMer().getText()); 
		}
		 
	}

}
