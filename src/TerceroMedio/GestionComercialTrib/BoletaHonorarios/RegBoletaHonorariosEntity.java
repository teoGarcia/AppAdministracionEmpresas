package TerceroMedio.GestionComercialTrib.BoletaHonorarios;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegBoletaHonorariosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private String numeroBH;
	
	@Column
	private String nombreTitular;
	
	@Column
	private String rutTitular;
	
	@Column
	private String giroTitular;
	
	@Column
	private String direccionTitular;
	
	@Column
	private String telefonoTitular;
	
	@Column
	private String nombreEmpresa;
	
	@Column
	private String direccionEmpresa;
	
	@Column
	private String rutEmpresa;
	
	@Column
	private Calendar fecha;

	public RegBoletaHonorariosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public RegBoletaHonorariosEntity(Long id, String numeroBH, String nombreTitular, String rutTitular,
			String giroTitular, String direccionTitular, String telefonoTitular, String nombreEmpresa,
			String direccionEmpresa, String rutEmpresa, Calendar fecha) {
		super();
		Id = id;
		this.numeroBH = numeroBH;
		this.nombreTitular = nombreTitular;
		this.rutTitular = rutTitular;
		this.giroTitular = giroTitular;
		this.direccionTitular = direccionTitular;
		this.telefonoTitular = telefonoTitular;
		this.nombreEmpresa = nombreEmpresa;
		this.direccionEmpresa = direccionEmpresa;
		this.rutEmpresa = rutEmpresa;
		this.fecha = fecha;
	}



	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getRutTitular() {
		return rutTitular;
	}

	public void setRutTitular(String rutTitular) {
		this.rutTitular = rutTitular;
	}

	public String getGiroTitular() {
		return giroTitular;
	}

	public void setGiroTitular(String giroTitular) {
		this.giroTitular = giroTitular;
	}

	public String getDireccionTitular() {
		return direccionTitular;
	}

	public void setDireccionTitular(String direccionTitular) {
		this.direccionTitular = direccionTitular;
	}

	public String getTelefonoTitular() {
		return telefonoTitular;
	}

	public void setTelefonoTitular(String telefonoTitular) {
		this.telefonoTitular = telefonoTitular;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}

	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}

	public String getRutEmpresa() {
		return rutEmpresa;
	}

	public void setRutEmpresa(String rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}



	public String getNumeroBH() {
		return numeroBH;
	}



	public void setNumeroBH(String numeroBH) {
		this.numeroBH = numeroBH;
	}
	
}
