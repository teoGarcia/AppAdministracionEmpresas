package CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PresupuestoCapacitacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String glosario;
	
	@Column
	private Calendar fecha;
	
	@Column
	private Double cancelar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGlosario() {
		return glosario;
	}

	public void setGlosario(String glosario) {
		this.glosario = glosario;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public Double getCancelar() {
		return cancelar;
	}

	public void setCancelar(Double cancelar) {
		this.cancelar = cancelar;
	}

	public PresupuestoCapacitacion(Long id, String glosario, Calendar fecha, Double cancelar) {
		super();
		this.id = id;
		this.glosario = glosario;
		this.fecha = fecha;
		this.cancelar = cancelar;
	}

	public PresupuestoCapacitacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PresupuestoCapacitacion [id=" + id + ", glosario=" + glosario + ", fecha=" + fecha + ", cancelar="
			+ cancelar + "]";
	}
	
}
