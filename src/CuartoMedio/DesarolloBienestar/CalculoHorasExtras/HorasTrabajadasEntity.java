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
	private String HoraEntradaHora;
	
	@Column
	private String HoraEntradaMinuto;
	
	@Column
	private String HoraSalidaHora;

	@Column
	private String HoraSalidaMinuto;
	
	@Column
	private String TotalHorasHora;
	
	@Column
	private String TotalHorasMinuto;
	
	@Column
	private String TotalHorasExtrasHora;

	@Column
	private String TotalHorasExtrasMinuto;

	public HorasTrabajadasEntity(Long id, String nombre, Calendar fechaHoraRegistrada, String horaEntradaHora,
			String horaEntradaMinuto, String horaSalidaHora, String horaSalidaMinuto, String totalHorasHora, String totalHorasMinuto,
			String totalHorasExtrasHora, String totalHorasExtrasMinuto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.FechaHoraRegistrada = fechaHoraRegistrada;
		this.HoraEntradaHora = horaEntradaHora;
		this.HoraEntradaMinuto = horaEntradaMinuto;
		this.HoraSalidaHora = horaSalidaHora;
		this.HoraSalidaMinuto = horaSalidaMinuto;
		this.TotalHorasHora = totalHorasHora;
		this.TotalHorasMinuto = totalHorasMinuto;
		this.TotalHorasExtrasHora = totalHorasExtrasHora;
		this.TotalHorasExtrasMinuto = totalHorasExtrasMinuto;
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

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaHoraRegistrada(Calendar fechaHoraRegistrada) {
		FechaHoraRegistrada = fechaHoraRegistrada;
	}

	public String getHoraEntradaHora() {
		return HoraEntradaHora;
	}

	public String getHoraEntradaMinuto() {
		return HoraEntradaMinuto;
	}

	public String getHoraSalidaHora() {
		return HoraSalidaHora;
	}

	public String getHoraSalidaMinuto() {
		return HoraSalidaMinuto;
	}

	public String getTotalHorasHora() {
		return TotalHorasHora;
	}

	public String getTotalHorasMinuto() {
		return TotalHorasMinuto;
	}

	public String getTotalHorasExtrasHora() {
		return TotalHorasExtrasHora;
	}

	public String getTotalHorasExtrasMinuto() {
		return TotalHorasExtrasMinuto;
	}

	public void setHoraEntradaHora(String horaEntradaHora) {
		HoraEntradaHora = horaEntradaHora;
	}

	public void setHoraEntradaMinuto(String horaEntradaMinuto) {
		HoraEntradaMinuto = horaEntradaMinuto;
	}

	public void setHoraSalidaHora(String horaSalidaHora) {
		HoraSalidaHora = horaSalidaHora;
	}

	public void setHoraSalidaMinuto(String horaSalidaMinuto) {
		HoraSalidaMinuto = horaSalidaMinuto;
	}

	public void setTotalHorasHora(String totalHorasHora) {
		TotalHorasHora = totalHorasHora;
	}

	public void setTotalHorasMinuto(String totalHorasMinuto) {
		TotalHorasMinuto = totalHorasMinuto;
	}

	public void setTotalHorasExtrasHora(String totalHorasExtrasHora) {
		TotalHorasExtrasHora = totalHorasExtrasHora;
	}

	public void setTotalHorasExtrasMinuto(String totalHorasExtrasMinuto) {
		TotalHorasExtrasMinuto = totalHorasExtrasMinuto;
	}


}
