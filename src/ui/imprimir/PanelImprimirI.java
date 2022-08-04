package ui.imprimir;

import java.awt.print.Printable;

public interface PanelImprimirI<T> extends Printable {

	
	public void CargarForm(T t);
	
}
