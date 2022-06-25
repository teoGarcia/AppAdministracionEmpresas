package ui.userUI.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.ManagerDB;
import ui.userUI.Usuario;
import ui.userUI.UsuarioRepository;


public class ControlRegistrarUsuario implements ActionListener {

	private VistaRegistrarUsuario vru;
	private UsuarioRepository repository;
	
	public ControlRegistrarUsuario(VistaRegistrarUsuario vru) {
		this.vru = vru;
		this.repository = new UsuarioRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario();
		usuario.setNombre(vru.getTxtNombre().getText());
		usuario.setApellido(vru.getTxtApellido().getText());
		usuario.setSeccion(vru.getTxtSeccion().getText());

		System.out.println(repository.create(usuario));
	}

}
