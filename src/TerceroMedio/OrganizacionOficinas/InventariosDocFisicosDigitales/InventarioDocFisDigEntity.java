package TerceroMedio.OrganizacionOficinas.InventariosDocFisicosDigitales;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InventarioDocFisDigEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private int documento;
	
	@Column
	private String numeroDocumento;
	
	@Column
	private String tipoDocumento;
	
	@Column
	private String motivo;
	
	@Column
	private String recibidoPor;
	
	@Column
	private Calendar fecha;
	
	@Column
	private String copiaArchivada;
	
	@Column
	private String ubicacionArchivo;
	
	@Column
	private String personaAreaRespon;
	
	@Column
	private String hora;
	
	
	

	public InventarioDocFisDigEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public InventarioDocFisDigEntity(Long id, int documento, String numeroDocumento, String tipoDocumento,
			String motivo, String recibidoPor, Calendar fecha, String copiaArchivada, String ubicacionArchivo,
			String personaAreaRespon, String hora) {
		super();
		this.id = id;
		this.documento = documento;
		this.numeroDocumento = numeroDocumento;
		this.tipoDocumento = tipoDocumento;
		this.motivo = motivo;
		this.recibidoPor = recibidoPor;
		this.fecha = fecha;
		this.copiaArchivada = copiaArchivada;
		this.ubicacionArchivo = ubicacionArchivo;
		this.personaAreaRespon = personaAreaRespon;
		this.hora = hora;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public int getDocumento() {
		return documento;
	}


	public String getNumeroDocumento() {
		return numeroDocumento;
	}


	public String getTipoDocumento() {
		return tipoDocumento;
	}


	public String getMotivo() {
		return motivo;
	}


	public String getRecibidoPor() {
		return recibidoPor;
	}


	public Calendar getFecha() {
		return fecha;
	}


	public String getCopiaArchivada() {
		return copiaArchivada;
	}


	public String getUbicacionArchivo() {
		return ubicacionArchivo;
	}


	public String getPersonaAreaRespon() {
		return personaAreaRespon;
	}


	public String getHora() {
		return hora;
	}


	public void setDocumento(int documento) {
		this.documento = documento;
	}


	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


	public void setRecibidoPor(String recibidoPor) {
		this.recibidoPor = recibidoPor;
	}


	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}


	public void setCopiaArchivada(String copiaArchivada) {
		this.copiaArchivada = copiaArchivada;
	}


	public void setUbicacionArchivo(String ubicacionArchivo) {
		this.ubicacionArchivo = ubicacionArchivo;
	}


	public void setPersonaAreaRespon(String personaAreaRespon) {
		this.personaAreaRespon = personaAreaRespon;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}

	


	

}
