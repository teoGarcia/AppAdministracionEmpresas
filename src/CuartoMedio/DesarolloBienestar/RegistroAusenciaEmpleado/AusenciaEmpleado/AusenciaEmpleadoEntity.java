package CuartoMedio.DesarolloBienestar.RegistroAusenciaEmpleado.AusenciaEmpleado;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AusenciaEmpleadoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String Nombre;
	
	@Column
	private Calendar Fecha;
	
	@Column
	private String Motivo;
	
	@Column
	private int TotalDias;

	public AusenciaEmpleadoEntity(Long id, String nombre, Calendar fecha, String motivo, int totalDias) {
		super();
		this.id = id;
		this.Nombre = nombre;
		this.Fecha = fecha;
		this.Motivo = motivo;
		this.TotalDias = totalDias;
	}

	public AusenciaEmpleadoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return Nombre;
	}

	public Calendar getFecha() {
		return Fecha;
	}

	public String getMotivo() {
		return Motivo;
	}

	public int getTotalDias() {
		return TotalDias;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public void setFecha(Calendar fecha) {
		Fecha = fecha;
	}

	public void setMotivo(String motivo) {
		Motivo = motivo;
	}

	public void setTotalDias(int totalDias) {
		TotalDias = totalDias;
	}
	

}
