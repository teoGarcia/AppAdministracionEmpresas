package TerceroMedio.ProcesosAdministrativos.FormatoProyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlFormatoProyecto implements ActionListener {
	
	private VistaFormatoProyecto vfp;

	public ControlFormatoProyecto(VistaFormatoProyecto vfp) {
		this.vfp = vfp;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vfp.getBtnPreProNor())) {
			
			
		}else if(e.getSource().equals(vfp.getBtnProInv())) {
			
			
		}
		
	}

}
