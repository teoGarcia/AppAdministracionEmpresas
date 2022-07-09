package CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AplicacionPresupuestoEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String Puesto;
	
	@Column
	private String Categoria;
	
	@Column
	private String DptoGrupo;
	
	@Column
	private String CodPuesto;
	
	@Column
	private String Ubicacion;
	
	@Column
	private int NecesarioViajar;
	
	@Column
	private String RangoSalario;
	
	@Column
	private int TipoPosicion;
	
	@Column
	private String ContactoRRHH;
	
	@Column
	private Calendar FechaPublicacion;
	
	@Column
	private String FormatoSolicitud;
	
	@Column
	private Calendar FechaExpiracion;
	
	@Column
	private String URLExt;
	
	@Column
	private String URLInt;
	
	@Column
	private String NombreEmpresa;
	
	@Column
	private String Direccion;
	
	@Column
	private String FaxCorreo;
	
	@Column
	private String CodigoPostal;
	
	@Column
	private String RolResponsabilidad;
	
	@Column
	private String RequisitosCualifFormacion;
	
	@Column
	private String AptitudesDeseables;
	
	@Column
	private String NotasAdicionales;
	
	@Column
	private String RevisadoPor;
	
	@Column
	private Calendar FechaRevisado;
	
	@Column
	private String AprobadoPor;
	
	@Column
	private Calendar FechaAprobado;
	
	@Column
	private String UltimaActuaPor;
	
	@Column
	private Calendar FechaActualizacion;

	public AplicacionPresupuestoEntity(Long id, String puesto, String categoria, String dptoGrupo, String codPuesto,
			String ubicacion, int necesarioViajar, String rangoSalario, int tipoPosicion, String contactoRRHH,
			Calendar fechaPublicacion, String formatoSolicitud, Calendar fechaExpiracion, String uRLExt, String uRLInt,
			String nombreEmpresa, String direccion, String faxCorreo, String codigoPostal, String rolResponsabilidad,
			String requisitosCualifFormacion, String aptitudesDeseables, String notasAdicionales, String revisadoPor,
			Calendar fechaRevisado, String aprobadoPor, Calendar fechaAprobado, String ultimaActuaPor,
			Calendar fechaActualizacion) {
		super();
		this.id = id;
		this.Puesto = puesto;
		this.Categoria = categoria;
		this.DptoGrupo = dptoGrupo;
		this.CodPuesto = codPuesto;
		this.Ubicacion = ubicacion;
		this.NecesarioViajar = necesarioViajar;
		this.RangoSalario = rangoSalario;
		this.TipoPosicion = tipoPosicion;
		this.ContactoRRHH = contactoRRHH;
		this.FechaPublicacion = fechaPublicacion;
		this.FormatoSolicitud = formatoSolicitud;
		this.FechaExpiracion = fechaExpiracion;
		this.URLExt = uRLExt;
		this.URLInt = uRLInt;
		this.NombreEmpresa = nombreEmpresa;
		this.Direccion = direccion;
		this.FaxCorreo = faxCorreo;
		this.CodigoPostal = codigoPostal;
		this.RolResponsabilidad = rolResponsabilidad;
		this.RequisitosCualifFormacion = requisitosCualifFormacion;
		this.AptitudesDeseables = aptitudesDeseables;
		this.NotasAdicionales = notasAdicionales;
		this.RevisadoPor = revisadoPor;
		this.FechaRevisado = fechaRevisado;
		this.AprobadoPor = aprobadoPor;
		this.FechaAprobado = fechaAprobado;
		this.UltimaActuaPor = ultimaActuaPor;
		this.FechaActualizacion = fechaActualizacion;
	}

	public AplicacionPresupuestoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Long getId() {
		return id;
	}

	public String getPuesto() {
		return Puesto;
	}

	public String getCategoria() {
		return Categoria;
	}

	public String getDptoGrupo() {
		return DptoGrupo;
	}

	public String getCodPuesto() {
		return CodPuesto;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public int getNecesarioViajar() {
		return NecesarioViajar;
	}

	public String getRangoSalario() {
		return RangoSalario;
	}

	public int getTipoPosicion() {
		return TipoPosicion;
	}

	public String getContactoRRHH() {
		return ContactoRRHH;
	}

	public Calendar getFechaPublicacion() {
		return FechaPublicacion;
	}

	public String getFormatoSolicitud() {
		return FormatoSolicitud;
	}

	public Calendar getFechaExpiracion() {
		return FechaExpiracion;
	}

	public String getURLExt() {
		return URLExt;
	}

	public String getURLInt() {
		return URLInt;
	}

	public String getNombreEmpresa() {
		return NombreEmpresa;
	}

	public String getDireccion() {
		return Direccion;
	}

	public String getFaxCorreo() {
		return FaxCorreo;
	}

	public String getCodigoPostal() {
		return CodigoPostal;
	}

	public String getRolResponsabilidad() {
		return RolResponsabilidad;
	}

	public String getRequisitosCualifFormacion() {
		return RequisitosCualifFormacion;
	}

	public String getAptitudesDeseables() {
		return AptitudesDeseables;
	}

	public String getNotasAdicionales() {
		return NotasAdicionales;
	}

	public String getRevisadoPor() {
		return RevisadoPor;
	}

	public Calendar getFechaRevisado() {
		return FechaRevisado;
	}

	public String getAprobadoPor() {
		return AprobadoPor;
	}

	public Calendar getFechaAprobado() {
		return FechaAprobado;
	}

	public String getUltimaActuaPor() {
		return UltimaActuaPor;
	}

	public Calendar getFechaActualizacion() {
		return FechaActualizacion;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPuesto(String puesto) {
		Puesto = puesto;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public void setDptoGrupo(String dptoGrupo) {
		DptoGrupo = dptoGrupo;
	}

	public void setCodPuesto(String codPuesto) {
		CodPuesto = codPuesto;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}

	public void setNecesarioViajar(int necesarioViajar) {
		NecesarioViajar = necesarioViajar;
	}

	public void setRangoSalario(String rangoSalario) {
		RangoSalario = rangoSalario;
	}

	public void setTipoPosicion(int tipoPosicion) {
		TipoPosicion = tipoPosicion;
	}

	public void setContactoRRHH(String contactoRRHH) {
		ContactoRRHH = contactoRRHH;
	}

	public void setFechaPublicacion(Calendar fechaPublicacion) {
		FechaPublicacion = fechaPublicacion;
	}

	public void setFormatoSolicitud(String formatoSolicitud) {
		FormatoSolicitud = formatoSolicitud;
	}

	public void setFechaExpiracion(Calendar fechaExpiracion) {
		FechaExpiracion = fechaExpiracion;
	}

	public void setURLExt(String uRLExt) {
		URLExt = uRLExt;
	}

	public void setURLInt(String uRLInt) {
		URLInt = uRLInt;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		NombreEmpresa = nombreEmpresa;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public void setFaxCorreo(String faxCorreo) {
		FaxCorreo = faxCorreo;
	}

	public void setCodigoPostal(String codigoPostal) {
		CodigoPostal = codigoPostal;
	}

	public void setRolResponsabilidad(String rolResponsabilidad) {
		RolResponsabilidad = rolResponsabilidad;
	}

	public void setRequisitosCualifFormacion(String requisitosCualifFormacion) {
		RequisitosCualifFormacion = requisitosCualifFormacion;
	}

	public void setAptitudesDeseables(String aptitudesDeseables) {
		AptitudesDeseables = aptitudesDeseables;
	}

	public void setNotasAdicionales(String notasAdicionales) {
		NotasAdicionales = notasAdicionales;
	}

	public void setRevisadoPor(String revisadoPor) {
		RevisadoPor = revisadoPor;
	}

	public void setFechaRevisado(Calendar fechaRevisado) {
		FechaRevisado = fechaRevisado;
	}

	public void setAprobadoPor(String aprobadoPor) {
		AprobadoPor = aprobadoPor;
	}

	public void setFechaAprobado(Calendar fechaAprobado) {
		FechaAprobado = fechaAprobado;
	}

	public void setUltimaActuaPor(String ultimaActuaPor) {
		UltimaActuaPor = ultimaActuaPor;
	}

	public void setFechaActualizacion(Calendar fechaActualizacion) {
		FechaActualizacion = fechaActualizacion;
	}

}
