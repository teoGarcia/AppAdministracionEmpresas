package CuartoMedio.CalculoDeRemuneraciones.LibroRemuneraciones;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LibroRemuneraciones {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String nombre;
	
	@Column
	private String rut;
	
	@Column
	private double SueldoBase;
	
	@Column
	private int horasExtras;
	
	@Column
	private double gratificacion;
	
	@Column
	private double otrosIngresos;
	
	@Column
	private double movilizacion;
	
	@Column
	private double colacion;
	
	@Column
	private double gastoRep;
	
	@Column
	private double asigFamiliar;
	
	@Column
	private double afp;
	
	@Column
	private double salud;
	
	@Column
	private double difIsapre;
	
	@Column
	private double seguroCes;
	
	@Column
	private double impDeter;
	
	@Column
	private double imgAPag;
	
	@Column
	private double anticipo;
	
	@Column
	private double otroDesc;
	
	@Column
	private double imponble;
	
	@Column
	private double acc;
	
	@Column
	private double sis;
	
	@Column
	private double cesantia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public double getSueldoBase() {
		return SueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		SueldoBase = sueldoBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	@Override
	public String toString() {
		return "LibroRemuneraciones [id=" + id + ", nombre=" + nombre + ", rut=" + rut + ", SueldoBase=" + SueldoBase
				+ ", horasExtras=" + horasExtras + ", gratificacion=" + gratificacion + ", otrosIngresos="
				+ otrosIngresos + ", movilizacion=" + movilizacion + ", colacion=" + colacion + ", gastoRep=" + gastoRep
				+ ", asigFamiliar=" + asigFamiliar + ", afp=" + afp + ", salud=" + salud + ", difIsapre=" + difIsapre
				+ ", seguroCes=" + seguroCes + ", impDeter=" + impDeter + ", imgAPag=" + imgAPag + ", anticipo="
				+ anticipo + ", otroDesc=" + otroDesc + "]";
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getGratificacion() {
		return gratificacion;
	}

	public void setGratificacion(double gratificacion) {
		this.gratificacion = gratificacion;
	}

	public double getOtrosIngresos() {
		return otrosIngresos;
	}

	public void setOtrosIngresos(double otrosIngresos) {
		this.otrosIngresos = otrosIngresos;
	}

	public double getMovilizacion() {
		return movilizacion;
	}

	public void setMovilizacion(double movilizacion) {
		this.movilizacion = movilizacion;
	}

	public LibroRemuneraciones() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getColacion() {
		return colacion;
	}

	public void setColacion(double colacion) {
		this.colacion = colacion;
	}

	public double getGastoRep() {
		return gastoRep;
	}

	public void setGastoRep(double gastoRep) {
		this.gastoRep = gastoRep;
	}

	public double getAsigFamiliar() {
		return asigFamiliar;
	}

	public void setAsigFamiliar(double asigFamiliar) {
		this.asigFamiliar = asigFamiliar;
	}

	public double getAfp() {
		return afp;
	}

	public void setAfp(double afp) {
		this.afp = afp;
	}

	public double getSalud() {
		return salud;
	}

	public void setSalud(double salud) {
		this.salud = salud;
	}

	public double getDifIsapre() {
		return difIsapre;
	}

	public void setDifIsapre(double difIsapre) {
		this.difIsapre = difIsapre;
	}

	public double getSeguroCes() {
		return seguroCes;
	}

	public void setSeguroCes(double seguroCes) {
		this.seguroCes = seguroCes;
	}

	public double getImpDeter() {
		return impDeter;
	}

	public void setImpDeter(double impDeter) {
		this.impDeter = impDeter;
	}

	public double getImgAPag() {
		return imgAPag;
	}

	public void setImgAPag(double imgAPag) {
		this.imgAPag = imgAPag;
	}

	public double getAnticipo() {
		return anticipo;
	}

	public void setAnticipo(double anticipo) {
		this.anticipo = anticipo;
	}

	public double getOtroDesc() {
		return otroDesc;
	}

	public void setOtroDesc(double otroDesc) {
		this.otroDesc = otroDesc;
	}

	public LibroRemuneraciones(Long id, String nombre, String rut, double sueldoBase, int horasExtras,
			double gratificacion, double otrosIngresos, double movilizacion, double colacion, double gastoRep,
			double asigFamiliar, double afp, double salud, double difIsapre, double seguroCes, double impDeter,
			double imgAPag, double anticipo, double otroDesc) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rut = rut;
		SueldoBase = sueldoBase;
		this.horasExtras = horasExtras;
		this.gratificacion = gratificacion;
		this.otrosIngresos = otrosIngresos;
		this.movilizacion = movilizacion;
		this.colacion = colacion;
		this.gastoRep = gastoRep;
		this.asigFamiliar = asigFamiliar;
		this.afp = afp;
		this.salud = salud;
		this.difIsapre = difIsapre;
		this.seguroCes = seguroCes;
		this.impDeter = impDeter;
		this.imgAPag = imgAPag;
		this.anticipo = anticipo;
		this.otroDesc = otroDesc;
	}

	public double getImponble() {
		return imponble;
	}

	public void setImponble(double imponble) {
		this.imponble = imponble;
	}

	public double getAcc() {
		return acc;
	}

	public void setAcc(double acc) {
		this.acc = acc;
	}

	public double getSis() {
		return sis;
	}

	public void setSis(double sis) {
		this.sis = sis;
	}

	public double getCesantia() {
		return cesantia;
	}

	public void setCesantia(double cesantia) {
		this.cesantia = cesantia;
	}
	
}
