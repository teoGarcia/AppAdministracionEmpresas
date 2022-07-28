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
	private int SueldoBase;
	
	@Column
	private int horasExtras;
	
	@Column
	private int gratificacion;
	
	@Column
	private int otrosIngresos;
	
	@Column
	private int movilizacion;
	
	@Column
	private int colacion;
	
	@Column
	private int gastoRep;
	
	@Column
	private int asigFamiliar;
	
	@Column
	private int afp;
	
	@Column
	private int salud;
	
	@Column
	private int difIsapre;
	
	@Column
	private int seguroCes;
	
	@Column
	private int impDeter;
	
	@Column
	private int imgAPag;
	
	@Column
	private int anticipo;
	
	@Column
	private int otroDesc;
	
	@Column
	private int imponble;
	
	@Column
	private int acc;
	
	@Column
	private int sis;
	
	@Column
	private int cesantia;


	@Override
	public String toString() {
		return "LibroRemuneraciones [id=" + id + ", nombre=" + nombre + ", rut=" + rut + ", SueldoBase=" + SueldoBase
				+ ", horasExtras=" + horasExtras + ", gratificacion=" + gratificacion + ", otrosIngresos="
				+ otrosIngresos + ", movilizacion=" + movilizacion + ", colacion=" + colacion + ", gastoRep=" + gastoRep
				+ ", asigFamiliar=" + asigFamiliar + ", afp=" + afp + ", salud=" + salud + ", difIsapre=" + difIsapre
				+ ", seguroCes=" + seguroCes + ", impDeter=" + impDeter + ", imgAPag=" + imgAPag + ", anticipo="
				+ anticipo + ", otroDesc=" + otroDesc + "]";
	}

	

	public LibroRemuneraciones() {
		super();
		// TODO Auto-generated constructor stub
	}



	public LibroRemuneraciones(Long id, String nombre, String rut, int sueldoBase, int horasExtras, int gratificacion,
			int otrosIngresos, int movilizacion, int colacion, int gastoRep, int asigFamiliar, int afp, int salud,
			int difIsapre, int seguroCes, int impDeter, int imgAPag, int anticipo, int otroDesc, int imponble, int acc,
			int sis, int cesantia) {
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
		this.imponble = imponble;
		this.acc = acc;
		this.sis = sis;
		this.cesantia = cesantia;
	}



	public Long getId() {
		return id;
	}



	public String getNombre() {
		return nombre;
	}



	public String getRut() {
		return rut;
	}



	public int getSueldoBase() {
		return SueldoBase;
	}



	public int getHorasExtras() {
		return horasExtras;
	}



	public int getGratificacion() {
		return gratificacion;
	}



	public int getOtrosIngresos() {
		return otrosIngresos;
	}



	public int getMovilizacion() {
		return movilizacion;
	}



	public int getColacion() {
		return colacion;
	}



	public int getGastoRep() {
		return gastoRep;
	}



	public int getAsigFamiliar() {
		return asigFamiliar;
	}



	public int getAfp() {
		return afp;
	}



	public int getSalud() {
		return salud;
	}



	public int getDifIsapre() {
		return difIsapre;
	}



	public int getSeguroCes() {
		return seguroCes;
	}



	public int getImpDeter() {
		return impDeter;
	}



	public int getImgAPag() {
		return imgAPag;
	}



	public int getAnticipo() {
		return anticipo;
	}



	public int getOtroDesc() {
		return otroDesc;
	}



	public int getImponble() {
		return imponble;
	}



	public int getAcc() {
		return acc;
	}



	public int getSis() {
		return sis;
	}



	public int getCesantia() {
		return cesantia;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setRut(String rut) {
		this.rut = rut;
	}



	public void setSueldoBase(int sueldoBase) {
		SueldoBase = sueldoBase;
	}



	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}



	public void setGratificacion(int gratificacion) {
		this.gratificacion = gratificacion;
	}



	public void setOtrosIngresos(int otrosIngresos) {
		this.otrosIngresos = otrosIngresos;
	}



	public void setMovilizacion(int movilizacion) {
		this.movilizacion = movilizacion;
	}



	public void setColacion(int colacion) {
		this.colacion = colacion;
	}



	public void setGastoRep(int gastoRep) {
		this.gastoRep = gastoRep;
	}



	public void setAsigFamiliar(int asigFamiliar) {
		this.asigFamiliar = asigFamiliar;
	}



	public void setAfp(int afp) {
		this.afp = afp;
	}



	public void setSalud(int salud) {
		this.salud = salud;
	}



	public void setDifIsapre(int difIsapre) {
		this.difIsapre = difIsapre;
	}



	public void setSeguroCes(int seguroCes) {
		this.seguroCes = seguroCes;
	}



	public void setImpDeter(int impDeter) {
		this.impDeter = impDeter;
	}



	public void setImgAPag(int imgAPag) {
		this.imgAPag = imgAPag;
	}



	public void setAnticipo(int anticipo) {
		this.anticipo = anticipo;
	}



	public void setOtroDesc(int otroDesc) {
		this.otroDesc = otroDesc;
	}



	public void setImponble(int imponble) {
		this.imponble = imponble;
	}



	public void setAcc(int acc) {
		this.acc = acc;
	}



	public void setSis(int sis) {
		this.sis = sis;
	}



	public void setCesantia(int cesantia) {
		this.cesantia = cesantia;
	}

	

	
	
}
