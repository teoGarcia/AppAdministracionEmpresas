package TerceroMedio.ProcesosAdministrativos.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CuartoMedio.LegislacionLaboral.CertificadoVacaciones.VistaCertificadoVacaciones;
import CuartoMedio.LegislacionLaboral.Finiquitos.VistaFiniquito;
import CuartoMedio.LegislacionLaboral.PermisosLaborales.VistaPermisosLaborales;
import Menu.Side.SideMenu;
import TerceroMedio.ProcesosAdministrativos.CalendarioProduccion.VistaCalendarioProduccion;
import TerceroMedio.ProcesosAdministrativos.CartaGantt.VistaCartaGantt;

public class ControlMenuProcesosAdministrativos implements ActionListener {
	
	private VistaMenuProcesosAdministrativos vmpa;

	public ControlMenuProcesosAdministrativos(VistaMenuProcesosAdministrativos vmpa) {
		this.vmpa = vmpa;
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
		if(btn.equals(vmpa.getBtnForPro())) {
			SideMenu.registerContentPanel(new VistaMenuProcesosAdministrativos(), vmpa.getBtnForPro().getText());
		}else if(btn.equals(vmpa.getBtnCarGantt())) {		
			SideMenu.registerContentPanel(new VistaCartaGantt(), vmpa.getBtnCarGantt().getText());
		}else if(btn.equals(vmpa.getBtnCalPro())) {		
			SideMenu.registerContentPanel(new VistaCalendarioProduccion(), vmpa.getBtnCalPro().getText());
		}/*else if(btn.equals(vmll.getBtnFinTrab())) {
			SideMenu.registerContentPanel(new VistaFiniquito(), vmll.getBtnFinTrab().getText());
		}*/
	}

}
