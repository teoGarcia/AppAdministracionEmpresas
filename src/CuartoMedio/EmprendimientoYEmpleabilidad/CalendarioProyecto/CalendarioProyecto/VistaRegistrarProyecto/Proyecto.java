package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	private String nombre;
	
	private String dias;
	
	private Calendar inicio;
	
	private Calendar fin;

	@Override
	public String toString() {
		return "Proyecto [Id=" + Id + ", nombre=" + nombre + ", dias=" + dias + ", inicio=" + inicio + ", fin=" + fin
				+ "]";
	}

	public Proyecto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Proyecto(Long id, String nombre, String dias, Calendar inicio, Calendar fin) {
		super();
		Id = id;
		this.nombre = nombre;
		this.dias = dias;
		this.inicio = inicio;
		this.fin = fin;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}

	public Calendar getInicio() {
		return inicio;
	}

	public void setInicio(Calendar inicio) {
		this.inicio = inicio;
	}

	public Calendar getFin() {
		return fin;
	}

	public void setFin(Calendar fin) {
		this.fin = fin;
	}
	
}
