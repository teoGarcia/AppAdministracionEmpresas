package TerceroMedio.GestionComercialTrib.DocumentacionMercantil;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistrarGuiasEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private String senores;
	
	@Column
	private String rut;
	
	@Column
	private String numeroDocumento;
	
	@Column
	private Calendar fechaEmision;
	
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
	private String tipoTraslado;
	
	@Column
	private String rutTransportista;
	
	@Column
	private String patente;
	
	@Column
	private String rutChofer;
	
	@Column
	private String nombreChofer;

	public RegistrarGuiasEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrarGuiasEntity(Long id, String senores, String rut, String numeroDocumento, Calendar fechaEmision,
			String giro, String direccion, String comuna, String ciudad, String telefono, String tipoTraslado,
			String rutTransportista, String patente, String rutChofer, String nombreChofer) {
		super();
		Id = id;
		this.senores = senores;
		this.rut = rut;
		this.numeroDocumento = numeroDocumento;
		this.fechaEmision = fechaEmision;
		this.giro = giro;
		this.direccion = direccion;
		this.comuna = comuna;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.tipoTraslado = tipoTraslado;
		this.rutTransportista = rutTransportista;
		this.patente = patente;
		this.rutChofer = rutChofer;
		this.nombreChofer = nombreChofer;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Calendar getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Calendar fechaEmision) {
		this.fechaEmision = fechaEmision;
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

	public String getTipoTraslado() {
		return tipoTraslado;
	}

	public void setTipoTraslado(String tipoTraslado) {
		this.tipoTraslado = tipoTraslado;
	}

	public String getRutTransportista() {
		return rutTransportista;
	}

	public void setRutTransportista(String rutTransportista) {
		this.rutTransportista = rutTransportista;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getRutChofer() {
		return rutChofer;
	}

	public void setRutChofer(String rutChofer) {
		this.rutChofer = rutChofer;
	}

	public String getNombreChofer() {
		return nombreChofer;
	}

	public void setNombreChofer(String nombreChofer) {
		this.nombreChofer = nombreChofer;
	}

}
