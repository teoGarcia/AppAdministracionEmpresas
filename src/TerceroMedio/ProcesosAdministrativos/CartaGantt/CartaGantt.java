package TerceroMedio.ProcesosAdministrativos.CartaGantt;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CartaGantt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String proyecto;
	
	@Column
	private String responsable;
	
	@Column
	private String actividad;
	
	@Column
	private Calendar fechaI;
	
	@Column
	private Calendar fechaT;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public Calendar getFechaI() {
		return fechaI;
	}

	public void setFechaI(Calendar fechaI) {
		this.fechaI = fechaI;
	}

	public Calendar getFechaT() {
		return fechaT;
	}

	public void setFechaT(Calendar fechaT) {
		this.fechaT = fechaT;
	}

	public CartaGantt(Long id, String proyecto, String responsable, Calendar fechaI, Calendar fechaT) {
		super();
		this.id = id;
		this.proyecto = proyecto;
		this.responsable = responsable;
		this.fechaI = fechaI;
		this.fechaT = fechaT;
	}

	public CartaGantt() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CartaGantt [id=" + id + ", proyecto=" + proyecto + ", responsable=" + responsable + ", fechaI=" + fechaI
				+ ", fechaT=" + fechaT + "]";
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

}
