package CuartoMedio.DesarolloBienestar.CalendarioVacaciones.Vacaciones;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CalendarioVacacionesEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String NombreEmpleado;
	
	@Column
	private Calendar Fecha;
	
	@Column
	private int TipoPermiso;
	
	@Column
	private int DiasTomados;
	

	public CalendarioVacacionesEntity(Long id, String nombreEmpleado, Calendar fecha, int tipoPermiso,
			int diasTomados) {
		super();
		this.id = id;
		this.NombreEmpleado = nombreEmpleado;
		this.Fecha = fecha;
		this.TipoPermiso = tipoPermiso;
		this.DiasTomados = diasTomados;
	}


	public CalendarioVacacionesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public String getNombreEmpleado() {
		return NombreEmpleado;
	}


	public Calendar getFecha() {
		return Fecha;
	}


	public int getTipoPermiso() {
		return TipoPermiso;
	}


	public int getDiasTomados() {
		return DiasTomados;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setNombreEmpleado(String nombreEmpleado) {
		NombreEmpleado = nombreEmpleado;
	}


	public void setFecha(Calendar fecha) {
		Fecha = fecha;
	}


	public void setTipoPermiso(int tipoPermiso) {
		TipoPermiso = tipoPermiso;
	}


	public void setDiasTomados(int diasTomados) {
		DiasTomados = diasTomados;
	}
	
	

}
