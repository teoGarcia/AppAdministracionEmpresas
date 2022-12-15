package TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asientos {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private Long idLibro;
	
	@Column
	private String asiento;
	
	@Column
	private Calendar fecha;
	
	@Column
	private String definicion;
	
	@Column
	private int codigo;
	
	@Column
	private String desglose;
	
	@Column
	private int debe;
	
	@Column
	private int haber;
	
	

	public Long getId() {
		return Id;
	}

	public String getAsiento() {
		return asiento;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public String getDefinicion() {
		return definicion;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDesglose() {
		return desglose;
	}

	public int getDebe() {
		return debe;
	}

	public int getHaber() {
		return haber;
	}

	public void setId(Long id) {
		Id = id;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setDesglose(String desglose) {
		this.desglose = desglose;
	}

	public void setDebe(int debe) {
		this.debe = debe;
	}

	public void setHaber(int haber) {
		this.haber = haber;
	}

	public Long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}
}
