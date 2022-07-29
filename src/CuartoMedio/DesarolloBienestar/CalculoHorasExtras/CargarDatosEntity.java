package CuartoMedio.DesarolloBienestar.CalculoHorasExtras;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CargarDatosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String JornadaLabAlmuerzo;
	
	@Column
	private String JornadaLabSabado;
	
	@Column
	private String JornadaLabDomingo;
	
	@Column
	private int ValorHoraExtra;
	
	@Column
	private int ValorHoraExtraExtrao;
	
	@Column
	private int PrecioHoraNormal;

	public CargarDatosEntity(Long id, String jornadaLabAlmuerzo, String jornadaLabSabado, String jornadaLabDomingo,
			int valorHoraExtra, int valorHoraExtraExtrao, int precioHoraNormal) {
		super();
		this.id = id;
		JornadaLabAlmuerzo = jornadaLabAlmuerzo;
		JornadaLabSabado = jornadaLabSabado;
		JornadaLabDomingo = jornadaLabDomingo;
		ValorHoraExtra = valorHoraExtra;
		ValorHoraExtraExtrao = valorHoraExtraExtrao;
		PrecioHoraNormal = precioHoraNormal;
	}

	public CargarDatosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public String getJornadaLabAlmuerzo() {
		return JornadaLabAlmuerzo;
	}

	public String getJornadaLabSabado() {
		return JornadaLabSabado;
	}

	public String getJornadaLabDomingo() {
		return JornadaLabDomingo;
	}

	public int getValorHoraExtra() {
		return ValorHoraExtra;
	}

	public int getValorHoraExtraExtrao() {
		return ValorHoraExtraExtrao;
	}

	public int getPrecioHoraNormal() {
		return PrecioHoraNormal;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setJornadaLabAlmuerzo(String jornadaLabAlmuerzo) {
		JornadaLabAlmuerzo = jornadaLabAlmuerzo;
	}

	public void setJornadaLabSabado(String jornadaLabSabado) {
		JornadaLabSabado = jornadaLabSabado;
	}

	public void setJornadaLabDomingo(String jornadaLabDomingo) {
		JornadaLabDomingo = jornadaLabDomingo;
	}

	public void setValorHoraExtra(int valorHoraExtra) {
		ValorHoraExtra = valorHoraExtra;
	}

	public void setValorHoraExtraExtrao(int valorHoraExtraExtrao) {
		ValorHoraExtraExtrao = valorHoraExtraExtrao;
	}

	public void setPrecioHoraNormal(int precioHoraNormal) {
		PrecioHoraNormal = precioHoraNormal;
	}

	

}
