package CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String codigo;
	
	@Column
	private String nombre;
	
	@Column
	private String proveedor;
	
	@Column
	private Double precio;
	
	@Column
	private int cantidad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto(Long id, String codigo, String nombre, String proveedor, Double precio, int cantidad) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.proveedor = proveedor;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", proveedor=" + proveedor
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
}
