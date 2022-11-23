package TerceroMedio.GestionComercialTrib.Cotizacion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmpresaPersonaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private String razonSocial;
	
	@Column
	private String rut;
	
	@Column
	private String giro;
	
	@Column
	private String direccion;
	
	@Column
	private String comuna;
	
	@Column
	private String telefono;
	
	@Column
	private String sitioWeb;
	
	@Column
	private String eMail;
	

	public EmpresaPersonaEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpresaPersonaEntity(Long id, String razonSocial, String rut, String giro, String direccion, String comuna,
			String telefono, String sitioWeb, String eMail) {
		super();
		Id = id;
		this.razonSocial = razonSocial;
		this.rut = rut;
		this.giro = giro;
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.sitioWeb = sitioWeb;
		this.eMail = eMail;
	}

	public Long getId() {
		return Id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public String getRut() {
		return rut;
	}

	public String getGiro() {
		return giro;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getSitioWeb() {
		return sitioWeb;
	}

	public String geteMail() {
		return eMail;
	}

	public void setId(Long id) {
		Id = id;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public void setGiro(String giro) {
		this.giro = giro;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


}
