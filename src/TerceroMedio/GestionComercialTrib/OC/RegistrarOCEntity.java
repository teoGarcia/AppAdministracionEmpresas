package TerceroMedio.GestionComercialTrib.OC;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistrarOCEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private String senores;
	
	@Column
	private String rut;
	
	@Column
	private String nombreOC;
	
	@Column
	private String numeroOC;
	
	@Column
	private Calendar fechaEnvio;
	
	@Column
	private Calendar fechaEntregaProd;
	
	@Column
	private String estado;
	
	@Column
	private String direccionEnvioFact;
	
	@Column
	private String direccionDespacho;
	
	@Column
	private String metodoDespacho;
	
	@Column
	private String formaPago;
	
	@Column
	private String observacion;

	public RegistrarOCEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrarOCEntity(Long id, String senores, String rut, String nombreOC, String numeroOC, Calendar fechaEnvio,
			Calendar fechaEntregaProd, String estado, String direccionEnvioFact, String direccionDespacho,
			String metodoDespacho, String formaPago, String observacion) {
		super();
		Id = id;
		this.senores = senores;
		this.rut = rut;
		this.nombreOC = nombreOC;
		this.numeroOC = numeroOC;
		this.fechaEnvio = fechaEnvio;
		this.fechaEntregaProd = fechaEntregaProd;
		this.estado = estado;
		this.direccionEnvioFact = direccionEnvioFact;
		this.direccionDespacho = direccionDespacho;
		this.metodoDespacho = metodoDespacho;
		this.formaPago = formaPago;
		this.observacion = observacion;
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

	public String getNombreOC() {
		return nombreOC;
	}

	public void setNombreOC(String nombreOC) {
		this.nombreOC = nombreOC;
	}

	public String getNumeroOC() {
		return numeroOC;
	}

	public void setNumeroOC(String numeroOC) {
		this.numeroOC = numeroOC;
	}

	public Calendar getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(Calendar fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public Calendar getFechaEntregaProd() {
		return fechaEntregaProd;
	}

	public void setFechaEntregaProd(Calendar fechaEntregaProd) {
		this.fechaEntregaProd = fechaEntregaProd;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDireccionEnvioFact() {
		return direccionEnvioFact;
	}

	public void setDireccionEnvioFact(String direccionEnvioFact) {
		this.direccionEnvioFact = direccionEnvioFact;
	}

	public String getDireccionDespacho() {
		return direccionDespacho;
	}

	public void setDireccionDespacho(String direccionDespacho) {
		this.direccionDespacho = direccionDespacho;
	}

	public String getMetodoDespacho() {
		return metodoDespacho;
	}

	public void setMetodoDespacho(String metodoDespacho) {
		this.metodoDespacho = metodoDespacho;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


}
