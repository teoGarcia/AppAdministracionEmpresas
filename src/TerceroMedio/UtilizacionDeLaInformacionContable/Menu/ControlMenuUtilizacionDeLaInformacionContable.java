package TerceroMedio.UtilizacionDeLaInformacionContable.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.EmprendimientoYEmpleabilidad.AnalisisFODA.VistaAnalisisFODA;
import CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProduccion.VistaCalendarioProduccion;
import CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto.VistaCalendarioProyectos;
import CuartoMedio.EmprendimientoYEmpleabilidad.CartaGantt.VistaCartaGantt;
import CuartoMedio.EmprendimientoYEmpleabilidad.ControlGastos.VistaControlGastos;
import CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja.VistaFlujoCaja;
import CuartoMedio.EmprendimientoYEmpleabilidad.Gastos.VistaGastos;
import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.VistaListaPrecio;
import CuartoMedio.EmprendimientoYEmpleabilidad.Menu.VistaMenuEyE;
import CuartoMedio.EmprendimientoYEmpleabilidad.PlanMarketing.VistaPlanMarketing;
import CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto.VistaPresupSimple;
import CuartoMedio.EmprendimientoYEmpleabilidad.RegistroProveedor.VistaRegistroProveedor;
import CuartoMedio.GestionDeBodega.Inventario.VistaInventario;
import Menu.Side.SideMenu;
import TerceroMedio.UtilizacionDeLaInformacionContable.BalanceGeneral.VistaBalanceGeneral;
import TerceroMedio.UtilizacionDeLaInformacionContable.Deprecacion.VistaDeprecacion;
import TerceroMedio.UtilizacionDeLaInformacionContable.InventarioFIFOPMP.VistaInventarioFIFOPMP;
import TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.VistaLibroDiarioYMayor;

public class ControlMenuUtilizacionDeLaInformacionContable implements ActionListener {
	
	private VistaMenuUtilizacionDeLaInformacionContable vista;

	public ControlMenuUtilizacionDeLaInformacionContable(
			VistaMenuUtilizacionDeLaInformacionContable vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		if(!SideMenu.isContentPanel(name)) lazinLoadView(e.getSource());
		SideMenu.changeContentPanel(name);
	}
	
	private void lazinLoadView(Object btn) {
		// TODO Auto-generated method stub
		if(btn.equals(vista.getBtnLibDiaLibMay())) {
			SideMenu.registerContentPanel(new VistaLibroDiarioYMayor(), vista.getBtnLibDiaLibMay().getText());
		}else if(btn.equals(vista.getBtnBalGen())) {		
			SideMenu.registerContentPanel(new VistaBalanceGeneral(), vista.getBtnBalGen().getText());
		}else if(btn.equals(vista.getBtnInv())) {		
			SideMenu.registerContentPanel(new VistaInventarioFIFOPMP(), vista.getBtnInv().getText());
		}else if(btn.equals(vista.getBtnDep())) {
			SideMenu.registerContentPanel(new VistaDeprecacion(), vista.getBtnDep().getText());
		}
	}

}
