package CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Presupuesto")
public class PresupuestoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String apartado;

	@Column
	private Calendar fecha;
	
	@Column
	private int ingreso;
	
	@Column
	private int egreso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApartado() {
		return apartado;
	}

	public void setApartado(String apartado) {
		this.apartado = apartado;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public int getIngreso() {
		return ingreso;
	}

	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}

	public int getEgreso() {
		return egreso;
	}

	public void setEgreso(int egreso) {
		this.egreso = egreso;
	}

	public PresupuestoEntity(Long id, String apartado, Calendar fecha, int ingreso, int egreso) {
		super();
		this.id = id;
		this.apartado = apartado;
		this.fecha = fecha;
		this.ingreso = ingreso;
		this.egreso = egreso;
	}

	public PresupuestoEntity() {
		super();
	}
	
	@Override
	public String toString() {
		return "PresupuestoEntity [id=" + id + ", apartado=" + apartado + ", fecha=" + fecha + ", ingreso=" + ingreso
				+ ", egreso=" + egreso + "]";
	}

}
