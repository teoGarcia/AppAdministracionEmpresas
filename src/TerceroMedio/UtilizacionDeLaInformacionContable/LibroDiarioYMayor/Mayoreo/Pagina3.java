package TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Mayoreo;

import java.util.Iterator;

import TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Asientos;
import ui.imprimir.PanelImprimirI;

public class Pagina3 extends PanelImprimirI<Asientos>{

	private TableMayoreo table1;
	private TableMayoreo table2;
	
	public Pagina3() {
		super("Mayoreo 3");
		
		table1 = new TableMayoreo();
		table1.setLocation(15, 60);
	    add(table1);
	    
	    table2 = new TableMayoreo();
		table2.setLocation(15, 370);
	    add(table2);
		
	}
	
	@Override
	public void CargarData(Asientos record) {	
		if(record.getCodigo()==5) table1.LlenarTabla(record);
		if(record.getCodigo()==6) table2.LlenarTabla(record);
		
		table1.calcularTotales();
		table2.calcularTotales();
	}
	

}
