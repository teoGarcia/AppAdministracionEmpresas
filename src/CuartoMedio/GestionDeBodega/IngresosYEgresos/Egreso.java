package CuartoMedio.GestionDeBodega.IngresosYEgresos;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Egreso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String desc;
	
	@Column
	private Calendar Fecha;
	
	@Column
	private Double monto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Calendar getFecha() {
		return Fecha;
	}

	public void setFecha(Calendar fecha) {
		Fecha = fecha;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Egreso(Long id, String desc, Calendar fecha, Double monto) {
		super();
		this.id = id;
		this.desc = desc;
		Fecha = fecha;
		this.monto = monto;
	}

	public Egreso() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Egreso [id=" + id + ", desc=" + desc + ", Fecha=" + Fecha + ", monto=" + monto + "]";
	}
	
}
