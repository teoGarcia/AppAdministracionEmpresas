package CuartoMedio.DesarolloBienestar.CalculoHorasExtras;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HorasTrabajadasEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String nombre;
	
	@Column
	private Calendar FechaHoraRegistrada;
	
	@Column
	private int HoraEntradaHora;
	
	@Column
	private int HoraEntradaMinuto;
	
	@Column
	private int HoraSalidaHora;

	@Column
	private int HoraSalidaMinuto;
	
	@Column
	private int TotalHorasHora;
	
	@Column
	private int TotalHorasMinuto;
	
	@Column
	private int TotalHorasExtrasHora;

	@Column
	private int TotalHorasExtrasMinuto;

	public HorasTrabajadasEntity(Long id, String nombre, Calendar fechaHoraRegistrada, int horaEntradaHora,
			int horaEntradaMinuto, int horaSalidaHora, int horaSalidaMinuto, int totalHorasHora, int totalHorasMinuto,
			int totalHorasExtrasHora, int totalHorasExtrasMinuto) {
		super();
		this.id = id;
		this.nombre = nombre;
		FechaHoraRegistrada = fechaHoraRegistrada;
		HoraEntradaHora = horaEntradaHora;
		HoraEntradaMinuto = horaEntradaMinuto;
		HoraSalidaHora = horaSalidaHora;
		HoraSalidaMinuto = horaSalidaMinuto;
		TotalHorasHora = totalHorasHora;
		TotalHorasMinuto = totalHorasMinuto;
		TotalHorasExtrasHora = totalHorasExtrasHora;
		TotalHorasExtrasMinuto = totalHorasExtrasMinuto;
	}

	public HorasTrabajadasEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Calendar getFechaHoraRegistrada() {
		return FechaHoraRegistrada;
	}

	public int getHoraEntradaHora() {
		return HoraEntradaHora;
	}

	public int getHoraEntradaMinuto() {
		return HoraEntradaMinuto;
	}

	public int getHoraSalidaHora() {
		return HoraSalidaHora;
	}

	public int getHoraSalidaMinuto() {
		return HoraSalidaMinuto;
	}

	public int getTotalHorasHora() {
		return TotalHorasHora;
	}

	public int getTotalHorasMinuto() {
		return TotalHorasMinuto;
	}

	public int getTotalHorasExtrasHora() {
		return TotalHorasExtrasHora;
	}

	public int getTotalHorasExtrasMinuto() {
		return TotalHorasExtrasMinuto;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaHoraRegistrada(Calendar fechaHoraRegistrada) {
		FechaHoraRegistrada = fechaHoraRegistrada;
	}

	public void setHoraEntradaHora(int horaEntradaHora) {
		HoraEntradaHora = horaEntradaHora;
	}

	public void setHoraEntradaMinuto(int horaEntradaMinuto) {
		HoraEntradaMinuto = horaEntradaMinuto;
	}

	public void setHoraSalidaHora(int horaSalidaHora) {
		HoraSalidaHora = horaSalidaHora;
	}

	public void setHoraSalidaMinuto(int horaSalidaMinuto) {
		HoraSalidaMinuto = horaSalidaMinuto;
	}

	public void setTotalHorasHora(int totalHorasHora) {
		TotalHorasHora = totalHorasHora;
	}

	public void setTotalHorasMinuto(int totalHorasMinuto) {
		TotalHorasMinuto = totalHorasMinuto;
	}

	public void setTotalHorasExtrasHora(int totalHorasExtrasHora) {
		TotalHorasExtrasHora = totalHorasExtrasHora;
	}

	public void setTotalHorasExtrasMinuto(int totalHorasExtrasMinuto) {
		TotalHorasExtrasMinuto = totalHorasExtrasMinuto;
	}

}
