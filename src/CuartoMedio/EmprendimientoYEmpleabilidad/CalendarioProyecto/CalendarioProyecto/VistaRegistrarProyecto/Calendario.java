package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calendario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private String nombreProyecto;
	
	@Column
	private int duracion;
	
	@Column
	private String etapa;
	
	@Column
	private String tareaPendiente;
	
	@Column
	private int diasDependencia;
	
	@Column
	private Calendar comenzo;
	
	@Column
	private Calendar fin;
	
	@Column
	private String responsable;
	
	@Column
	private String dependencia;
	
	@Column
	private String estado;

	public Calendario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calendario(Long id, String nombreProyecto, int duracion, String etapa, String tareaPendiente,
			int diasDependencia, Calendar comenzo, Calendar fin, String responsable, String dependencia,
			String estado) {
		super();
		Id = id;
		this.nombreProyecto = nombreProyecto;
		this.duracion = duracion;
		this.etapa = etapa;
		this.tareaPendiente = tareaPendiente;
		this.diasDependencia = diasDependencia;
		this.comenzo = comenzo;
		this.fin = fin;
		this.responsable = responsable;
		this.dependencia = dependencia;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Calendario [Id=" + Id + ", nombreProyecto=" + nombreProyecto + ", duracion=" + duracion + ", etapa="
				+ etapa + ", tareaPendiente=" + tareaPendiente + ", diasDependencia=" + diasDependencia + ", comenzo="
				+ comenzo + ", fin=" + fin + ", responsable=" + responsable + ", dependencia=" + dependencia
				+ ", estado=" + estado + "]";
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	public String getTareaPendiente() {
		return tareaPendiente;
	}

	public void setTareaPendiente(String tareaPendiente) {
		this.tareaPendiente = tareaPendiente;
	}

	public int getDiasDependencia() {
		return diasDependencia;
	}

	public void setDiasDependencia(int diasDependencia) {
		this.diasDependencia = diasDependencia;
	}

	public Calendar getComenzo() {
		return comenzo;
	}

	public void setComenzo(Calendar comenzo) {
		this.comenzo = comenzo;
	}

	public Calendar getFin() {
		return fin;
	}

	public void setFin(Calendar fin) {
		this.fin = fin;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
