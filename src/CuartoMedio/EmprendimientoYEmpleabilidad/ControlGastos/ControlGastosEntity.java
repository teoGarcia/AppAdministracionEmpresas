package CuartoMedio.EmprendimientoYEmpleabilidad.ControlGastos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ControlGastosEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String categoria;
	
	@Column
	private String subCategoria;
	
	@Column
	private String detalle;
	
	
	@Column
	private int anio;
	
	@Column
	private int mes; 
	
	@Column
	private int importe;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(String subCategoria) {
		this.subCategoria = subCategoria;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public ControlGastosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "ControlGastosEntity [id=" + id + ", categoria=" + categoria + ", subCategoria=" + subCategoria
				+ ", detalle=" + detalle + ", anio=" + anio + ", mes=" + mes + ", importe=" + importe + "]";
	}

	public ControlGastosEntity(Long id, String categoria, String subCategoria, String detalle, int anio, int mes,
			int importe) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.subCategoria = subCategoria;
		this.detalle = detalle;
		this.anio = anio;
		this.mes = mes;
		this.importe = importe;
	}

	
}
