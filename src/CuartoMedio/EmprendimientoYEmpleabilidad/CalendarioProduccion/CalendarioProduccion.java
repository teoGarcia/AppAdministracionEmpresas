package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProduccion;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CalendarioProduccion {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String projecto;
	
	@Column
	private String etapa;
	
	@Column
	private Calendar FechaI;
	
	@Column
	private Calendar FechaT;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjecto() {
		return projecto;
	}

	public void setProjecto(String projecto) {
		this.projecto = projecto;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	public Calendar getFechaI() {
		return FechaI;
	}

	public void setFechaI(Calendar fechaI) {
		FechaI = fechaI;
	}

	public Calendar getFechaT() {
		return FechaT;
	}

	public void setFechaT(Calendar fechaT) {
		FechaT = fechaT;
	}

	public CalendarioProduccion(Long id, String projecto, String etapa, Calendar fechaI, Calendar fechaT) {
		super();
		this.id = id;
		this.projecto = projecto;
		this.etapa = etapa;
		FechaI = fechaI;
		FechaT = fechaT;
	}

	public CalendarioProduccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CalendarioProduccion [id=" + id + ", projecto=" + projecto + ", etapa=" + etapa + ", FechaI=" + FechaI
				+ ", FechaT=" + FechaT + "]";
	}
}
