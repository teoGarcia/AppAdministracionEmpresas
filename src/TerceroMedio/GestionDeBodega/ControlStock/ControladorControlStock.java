package TerceroMedio.GestionDeBodega.ControlStock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorControlStock implements ActionListener {

	private VistaControlStock vista;
	
	public ControladorControlStock(VistaControlStock vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String codigo = vista.getVp().getCrud().getSeledRow(1);
		String producto = null, categoria = null;
		if(codigo != null) producto  = vista.getVp().getCrud().getSeledRow(2);
		if(codigo != null && producto != null) categoria = vista.getVp().getCrud().getSeledRow(3);
		
		if(codigo != null && producto != null && categoria != null)
			vista.getVcv().setProduct(codigo, producto, categoria);
	}

}
