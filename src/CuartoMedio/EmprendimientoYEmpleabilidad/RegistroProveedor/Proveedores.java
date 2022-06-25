package CuartoMedio.EmprendimientoYEmpleabilidad.RegistroProveedor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proveedores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombre;
	
	@Column
	private String direccion;
	
	@Column
	private String correo;
	
	@Column
	private String rubro;
	
	@Column
	private String areaDeContecto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public String getAreaDeContecto() {
		return areaDeContecto;
	}

	public void setAreaDeContecto(String areaDeContecto) {
		this.areaDeContecto = areaDeContecto;
	}

	public Proveedores(Long id, String nombre, String correo, String rubro, String areaDeContecto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.rubro = rubro;
		this.areaDeContecto = areaDeContecto;
	}

	public Proveedores() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Proveedores [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", rubro=" + rubro
				+ ", areaDeContecto=" + areaDeContecto + "]";
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
