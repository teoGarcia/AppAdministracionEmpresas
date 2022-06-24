package ui.userUI;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Usuario{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String seccion;
	
	
	
	
	public Usuario(Long id, String nombre, String apellido, String seccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.seccion = seccion;
	}
	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", seccion=" + seccion + "]";
	}
	

}
