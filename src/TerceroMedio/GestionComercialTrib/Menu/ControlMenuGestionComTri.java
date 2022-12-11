package TerceroMedio.GestionComercialTrib.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Menu.Side.SideMenu;
import TerceroMedio.GestionComercialTrib.BoletaHonorarios.VistaBoletaHonorarios;
import TerceroMedio.GestionComercialTrib.ConciliacionBancaria.VistaConciliacionBancaria;
import TerceroMedio.GestionComercialTrib.Cotizacion.VistaCotizacion;
import TerceroMedio.GestionComercialTrib.DocumentacionMercantil.VistaDocumentos;
import TerceroMedio.GestionComercialTrib.Formulario22.VistaFormulario;
import TerceroMedio.GestionComercialTrib.Inventario.VistaInventario;
import TerceroMedio.GestionComercialTrib.OC.VistaOC;

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
		}else if(btn.equals(vista.getBtnFormularioCotizacion())) {
			SideMenu.registerContentPanel(new VistaCotizacion(), vista.getBtnFormularioCotizacion().getText()); 
		}else if(btn.equals(vista.getBtnFormularioOC())) {
			SideMenu.registerContentPanel(new VistaOC(), vista.getBtnFormularioOC().getText()); 
		}else if(btn.equals(vista.getBtnConciliacionBancaria())) {
			SideMenu.registerContentPanel(new VistaConciliacionBancaria(), vista.getBtnConciliacionBancaria().getText()); 
		}else if(btn.equals(vista.getBtnDocMercantil())) {
			SideMenu.registerContentPanel(new VistaDocumentos(), vista.getBtnDocMercantil().getText()); 
		}else if(btn.equals(vista.getBtnFormulario22())) {
			SideMenu.registerContentPanel(new VistaFormulario(), vista.getBtnFormulario22().getText()); 
		}else if(btn.equals(vista.getBtnFormulario29())) {
			SideMenu.registerContentPanel(new TerceroMedio.GestionComercialTrib.Formulario29.VistaFormulario(), vista.getBtnFormulario29().getText()); 
		}else if(btn.equals(vista.getBtnBoletadeHonorarios())) {
			SideMenu.registerContentPanel(new VistaBoletaHonorarios(), vista.getBtnBoletadeHonorarios().getText()); 
		}
		 
	}

}
