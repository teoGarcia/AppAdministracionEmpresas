package TerceroMedio.OrganizacionOficinas.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Menu.Side.SideMenu;
import TerceroMedio.OrganizacionOficinas.InventariosDocFisicosDigitales.VistaInvDocFisDig;
import TerceroMedio.ProcesosAdministrativos.CalendarioProduccion.VistaCalendarioProduccion;
import TerceroMedio.ProcesosAdministrativos.CartaGantt.VistaCartaGantt;
import TerceroMedio.ProcesosAdministrativos.Departamentalizacion.Imprimir.VistaDepartamentalizacion;
import TerceroMedio.ProcesosAdministrativos.EvaluacionProyecto.VistaEvaluacionProyecto;
import TerceroMedio.ProcesosAdministrativos.FormatoOrganigrama.VistaFormatoOrganigrama;
import TerceroMedio.ProcesosAdministrativos.Menu.VistaMenuProcesosAdministrativos;

public class ControlMenuInvDocFisDig implements ActionListener{
	
	private VistaMenuInvDocFisDig vista;

	public ControlMenuInvDocFisDig(VistaMenuInvDocFisDig vista) {
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String name = e.getActionCommand();
		if(!SideMenu.isContentPanel(name)) lazinLoadView(e.getSource());
		SideMenu.changeContentPanel(name);
		
	}

	private void lazinLoadView(Object btn) {
		// TODO Auto-generated method stub
		if(btn.equals(vista.getBtnInvDocFisDig())) {
			SideMenu.registerContentPanel(new VistaMenuInvDocFisDig(), vista.getBtnInvDocFisDig().getText());
		}/*else if(btn.equals(vmpa.getBtnCarGantt())) {		
			SideMenu.registerContentPanel(new VistaCartaGantt(), vmpa.getBtnCarGantt().getText());
		}else if(btn.equals(vmpa.getBtnCalPro())) {		
			SideMenu.registerContentPanel(new VistaCalendarioProduccion(), vmpa.getBtnCalPro().getText());
		}else if(btn.equals(vmpa.getBtnOrg())) {
			SideMenu.registerContentPanel(new VistaFormatoOrganigrama(), vmpa.getBtnOrg().getText());
		}else if(btn.equals(vmpa.getBtnDep())) {
			SideMenu.registerContentPanel(new VistaDepartamentalizacion(), vmpa.getBtnDep().getText());
		}else if(btn.equals(vmpa.getBtnEvaPro())) {
			SideMenu.registerContentPanel(new VistaEvaluacionProyecto(), vmpa.getBtnEvaPro().getText());
		}*/
	}

}
