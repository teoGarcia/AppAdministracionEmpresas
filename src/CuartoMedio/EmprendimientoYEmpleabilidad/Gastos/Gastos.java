package CuartoMedio.EmprendimientoYEmpleabilidad.Gastos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gastos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String gasto;
	
	@Column
	private String Tgasto;

	@Column
	private double presupuesto;
	
	@Column
	private double real;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGasto() {
		return gasto;
	}

	public void setGasto(String gasto) {
		this.gasto = gasto;
	}

	public String getTgasto() {
		return Tgasto;
	}

	public void setTgasto(String tgasto) {
		Tgasto = tgasto;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public Gastos(Long id, String gasto, String tgasto, double presupuesto, double real) {
		super();
		this.id = id;
		this.gasto = gasto;
		Tgasto = tgasto;
		this.presupuesto = presupuesto;
		this.real = real;
	}

	public Gastos() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gastos [id=" + id + ", gasto=" + gasto + ", Tgasto=" + Tgasto + ", presupuesto=" + presupuesto
				+ ", real=" + real + "]";
	}
	
	
	
}
