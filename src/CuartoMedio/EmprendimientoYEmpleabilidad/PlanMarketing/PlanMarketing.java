package CuartoMedio.EmprendimientoYEmpleabilidad.PlanMarketing;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlanMarketing {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String proyecto;

	@Column
	private String objetivo;
	
	@Column
	private String grupo;
	
	@Column
	private String producto;
	
	@Column
	private int precio;
	
	@Column
	private String plaza;
	
	@Column
	private String promocion;
	
	@Column
	private String Persona;
	
	@Column
	private String postVenta;
	
	
	public PlanMarketing(Long id, String proyecto, String objetivo, String grupo, String producto, int precio,
			String plaza, String promocion, String persona, String postVenta) {
		super();
		this.id = id;
		this.proyecto = proyecto;
		this.objetivo = objetivo;
		this.grupo = grupo;
		this.producto = producto;
		this.precio = precio;
		this.plaza = plaza;
		this.promocion = promocion;
		Persona = persona;
		this.postVenta = postVenta;
	}

	
	public PlanMarketing() {
		super();
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getProyecto() {
		return proyecto;
	}


	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}


	public String getObjetivo() {
		return objetivo;
	}


	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}


	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public String getPlaza() {
		return plaza;
	}


	public void setPlaza(String plaza) {
		this.plaza = plaza;
	}


	public String getPromocion() {
		return promocion;
	}


	public void setPromocion(String promocion) {
		this.promocion = promocion;
	}


	public String getPersona() {
		return Persona;
	}


	public void setPersona(String persona) {
		Persona = persona;
	}


	public String getPostVenta() {
		return postVenta;
	}


	public void setPostVenta(String postVenta) {
		this.postVenta = postVenta;
	}


	@Override
	public String toString() {
		return "PlanMarketing [id=" + id + ", proyecto=" + proyecto + ", objetivo=" + objetivo + ", grupo=" + grupo
				+ ", producto=" + producto + ", precio=" + precio + ", plaza=" + plaza + ", promocion=" + promocion
				+ ", Persona=" + Persona + ", postVenta=" + postVenta + "]";
	}
}
