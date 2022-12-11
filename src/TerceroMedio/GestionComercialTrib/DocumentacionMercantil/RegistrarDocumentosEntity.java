package TerceroMedio.GestionComercialTrib.DocumentacionMercantil;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistrarDocumentosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private int tipoDocumento;
	
	@Column
	private String numeroDocumento;
	
	@Column
	private String senores;
	
	@Column
	private String rut;
	
	@Column
	private String giro;
	
	@Column
	private String direccion;
	
	@Column
	private String comuna;
	
	@Column
	private String ciudad;
	
	@Column
	private String telefono;
	
	@Column
	private Calendar fechaEmision;
	
	@Column
	private String tipoCompra;
	
	
	public RegistrarDocumentosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrarDocumentosEntity(Long id, int tipoDocumento, String numeroDocumento,
			String senores, String rut, String giro, String direccion, String comuna, String ciudad, String telefono,
			Calendar fechaEmision, String tipoCompra) {
		super();
		Id = id;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.senores = senores;
		this.rut = rut;
		this.giro = giro;
		this.direccion = direccion;
		this.comuna = comuna;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.fechaEmision = fechaEmision;
		this.tipoCompra = tipoCompra;
	}


	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public int getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getSenores() {
		return senores;
	}

	public void setSenores(String senores) {
		this.senores = senores;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getGiro() {
		return giro;
	}

	public void setGiro(String giro) {
		this.giro = giro;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Calendar getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Calendar fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getTipoCompra() {
		return tipoCompra;
	}

	public void setTipoCompra(String tipoCompra) {
		this.tipoCompra = tipoCompra;
	}
	

}
