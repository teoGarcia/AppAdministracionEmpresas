package ui.userUI.list;

import java.util.Iterator;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import core.ManagerDB;
import ui.userUI.Usuario;
import ui.userUI.UsuarioRepository;

public class ControlUsuarios {

	private VistaUsuarios vu;
	private UsuarioRepository repository;
	
	public ControlUsuarios(VistaUsuarios vu) {
		this.repository = new UsuarioRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vu = vu;
	}

	public void LlenarTabla(){
		
		Iterator<Usuario> users = this.repository.findAll().iterator();
		
		while(users.hasNext()) {
			
			vu.getModel().addRow(new Object[] {
					users.next()
			});
		}
		
		
	}
}
