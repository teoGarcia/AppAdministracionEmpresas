package TerceroMedio.GestionComercialTrib.Cotizacion;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class RealizarCotizacionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private Long idCotizacion;
	
	@Column
	private int cantidad;
	
	@Column
	private String descripcion;
	
	@Column
	private int valorUnitario;

	public RealizarCotizacionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RealizarCotizacionEntity(Long id, Long idCotizacion, int cantidad, String descripcion, int valorUnitario) {
		super();
		Id = id;
		this.idCotizacion = idCotizacion;
		this.cantidad = cantidad;
		this.descripcion = descripcion;
		this.valorUnitario = valorUnitario;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getIdCotizacion() {
		return idCotizacion;
	}

	public void setIdCotizacion(Long idCotizacion) {
		this.idCotizacion = idCotizacion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}
