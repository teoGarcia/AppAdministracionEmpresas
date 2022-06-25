package CuartoMedio.GestionDeBodega.CodificacionProductos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import core.ManagerDB;

public class ControlCodificacionProductos implements ActionListener {
	
	private VistaCodificacionProductos vcp;
	private CodificacionProdRepository repository;

	public ControlCodificacionProductos(VistaCodificacionProductos vcp) {
		this.repository = new CodificacionProdRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vcp = vcp;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vcp.getStndrbtnGuardar())) {
			
			if(vcp.CamposVacios()) {
				
				JOptionPane.showMessageDialog(null, "Perfect");
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
			}
			
		}
	
			
		// TODO Auto-generated method stub
		
	}

}
