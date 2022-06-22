package CuartoMedio.EmprendimientoYEmpleabilidad.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.EmprendimientoYEmpleabilidad.AnalisisFODA.VistaAnalisisFODA;
import CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProduccion.VistaCalendarioProduccion;
import CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.MenuCalenProyecto.VistaMenuCalenProyecto;
import CuartoMedio.EmprendimientoYEmpleabilidad.CartaGantt.VistaCartaGantt;
import CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.MenuFlujoCaja.VistaMenuFlujoCaja;
import CuartoMedio.EmprendimientoYEmpleabilidad.Gastos.VistaGastos;
import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.VistaListaPrecio;
import CuartoMedio.EmprendimientoYEmpleabilidad.PlanMarketing.VistaPlanMarketing;
import CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto.VistaPresupSimple;
import CuartoMedio.EmprendimientoYEmpleabilidad.RegistroProveedor.VistaRegistroProveedor;
import CuartoMedio.LegislacionLaboral.CertificadoVacaciones.VistaCertificadoVacaciones;
import CuartoMedio.LegislacionLaboral.Finiquitos.VistaFiniquito;
import Menu.Side.SideMenu;

public class ControlMenuEyE implements ActionListener {
	
	private VistaMenuEyE vmee;

	public ControlMenuEyE(VistaMenuEyE vmee) {
		this.vmee = vmee;
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
		if(btn.equals(vmee.getBtnPlaNeg())) {
			SideMenu.registerContentPanel(new VistaMenuEyE(), vmee.getBtnPlaNeg().getText());
		}else if(btn.equals(vmee.getBtnAnaFODA())) {		
			SideMenu.registerContentPanel(new VistaAnalisisFODA(), vmee.getBtnAnaFODA().getText());
		}else if(btn.equals(vmee.getBtnPre())) {		
			SideMenu.registerContentPanel(new VistaPresupSimple(), vmee.getBtnPre().getText());
		}else if(btn.equals(vmee.getBtnLisPre())) {
			SideMenu.registerContentPanel(new VistaListaPrecio(), vmee.getBtnLisPre().getText());
		}else if(btn.equals(vmee.getBtnRegPro())) {		
			SideMenu.registerContentPanel(new VistaRegistroProveedor(), vmee.getBtnRegPro().getText());
		}else if(btn.equals(vmee.getBtnPlaMar())) {
			SideMenu.registerContentPanel(new VistaPlanMarketing(), vmee.getBtnPlaMar().getText());
		}else if(btn.equals(vmee.getBtnGas())) {		
			SideMenu.registerContentPanel(new VistaGastos(), vmee.getBtnGas().getText());
		}else if(btn.equals(vmee.getBtnFluCaj())) {
			SideMenu.registerContentPanel(new VistaMenuFlujoCaja(), vmee.getBtnFluCaj().getText());
		}else if(btn.equals(vmee.getBtnCalProy())) {		
			SideMenu.registerContentPanel(new VistaMenuCalenProyecto(), vmee.getBtnCalProy().getText());
		}else if(btn.equals(vmee.getBtnCarGan())) {
			SideMenu.registerContentPanel(new VistaCartaGantt(), vmee.getBtnCarGan().getText());
		}else if(btn.equals(vmee.getBtnCalProd())) {		
			SideMenu.registerContentPanel(new VistaCalendarioProduccion(), vmee.getBtnCalProd().getText());
		}/*else if(btn.equals(vmee.getBtnLisPre())) {
			SideMenu.registerContentPanel(new VistaFiniquito(), vmee.getBtnFinTrab().getText());
		}*/
	}

}
