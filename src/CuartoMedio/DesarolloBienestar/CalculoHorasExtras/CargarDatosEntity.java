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
	private double JornadaLabAlmuerzo;
	
	@Column
	private double JornadaLabSabado;
	
	@Column
	private double JornadaLabDomingo;
	
	@Column
	private double ValorHoraExtra;
	
	@Column
	private double ValorHoraExtraExtrao;
	
	@Column
	private double PrecioHoraNormal;

	public CargarDatosEntity(Long id, double jornadaLabAlmuerzo, double jornadaLabSabado, double jornadaLabDomingo,
			double valorHoraExtra, double valorHoraExtraExtrao, double precioHoraNormal) {
		super();
		this.id = id;
		this.JornadaLabAlmuerzo = jornadaLabAlmuerzo;
		this.JornadaLabSabado = jornadaLabSabado;
		this.JornadaLabDomingo = jornadaLabDomingo;
		this.ValorHoraExtra = valorHoraExtra;
		this.ValorHoraExtraExtrao = valorHoraExtraExtrao;
		this.PrecioHoraNormal = precioHoraNormal;
	}

	public CargarDatosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getJornadaLabAlmuerzo() {
		return JornadaLabAlmuerzo;
	}

	public double getJornadaLabSabado() {
		return JornadaLabSabado;
	}

	public double getJornadaLabDomingo() {
		return JornadaLabDomingo;
	}

	public double getValorHoraExtra() {
		return ValorHoraExtra;
	}

	public double getValorHoraExtraExtrao() {
		return ValorHoraExtraExtrao;
	}

	public double getPrecioHoraNormal() {
		return PrecioHoraNormal;
	}

	public void setJornadaLabAlmuerzo(double jornadaLabAlmuerzo) {
		JornadaLabAlmuerzo = jornadaLabAlmuerzo;
	}

	public void setJornadaLabSabado(double jornadaLabSabado) {
		JornadaLabSabado = jornadaLabSabado;
	}

	public void setJornadaLabDomingo(double jornadaLabDomingo) {
		JornadaLabDomingo = jornadaLabDomingo;
	}

	public void setValorHoraExtra(double valorHoraExtra) {
		ValorHoraExtra = valorHoraExtra;
	}

	public void setValorHoraExtraExtrao(double valorHoraExtraExtrao) {
		ValorHoraExtraExtrao = valorHoraExtraExtrao;
	}

	public void setPrecioHoraNormal(double precioHoraNormal) {
		PrecioHoraNormal = precioHoraNormal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
