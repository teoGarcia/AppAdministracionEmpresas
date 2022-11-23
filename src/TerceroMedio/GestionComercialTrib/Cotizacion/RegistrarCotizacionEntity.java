package TerceroMedio.GestionComercialTrib.Cotizacion;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistrarCotizacionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private Long idEmpresa;
	
	@Column
	private Calendar fechaEmision;
	
	@Column
	private Calendar validaHasta;
	
	@Column
	private Long numeroCotizacion;
	
	@Column
	private String terminoCondiciones;

	public RegistrarCotizacionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrarCotizacionEntity(Long id, Long idEmpresa, Calendar fechaEmision, Calendar validaHasta,
			Long numeroCotizacion, String terminoCondiciones) {
		super();
		Id = id;
		this.idEmpresa = idEmpresa;
		this.fechaEmision = fechaEmision;
		this.validaHasta = validaHasta;
		this.numeroCotizacion = numeroCotizacion;
		this.terminoCondiciones = terminoCondiciones;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public Calendar getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Calendar fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Calendar getValidaHasta() {
		return validaHasta;
	}

	public void setValidaHasta(Calendar validaHasta) {
		this.validaHasta = validaHasta;
	}

	public Long getNumeroCotizacion() {
		return numeroCotizacion;
	}

	public void setNumeroCotizacion(Long numeroCotizacion) {
		this.numeroCotizacion = numeroCotizacion;
	}

	public String getTerminoCondiciones() {
		return terminoCondiciones;
	}

	public void setTerminoCondiciones(String terminoCondiciones) {
		this.terminoCondiciones = terminoCondiciones;
	}

}
