package CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class LiquidacionSueldo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nomEmpresa;
	
	@Column
	private String rutEmpresa;
	
	@Column
	private String nomTrabajador;
	
	@Column
	private String rutTrabajador;
	
	@Column
	private int year;
	
	@Column
	private int mon;
	
	@Column
	private double sueldo;
	
	@Column
	private double hrasExtra;
	
	@Column
	private double bonoGesMen;
	
	@Column
	private double participacion;
	
	@Column
	private double comisiones;
	
	@Column
	private double gratificacion;
	
	@Column
	private double cargFami;

	@Column
	private double asigCola;
	
	@Column
	private double asigMovi;
	
	@Column
	private double afp;
	
	@Column
	private double seguroCesantia;
	
	@Column
	private double salud;
	
	@Column
	private double difIsap;
	
	@Column
	private double impUni;

	@Column
	private double cuoBie;
	
	@Column
	private double cuoAhorrLibr;

	@Column
	private double credCCFAAra;
	
	@Column
	private double sulLiqLetras;
	
	@Column
	private double valesAnticipos;

	public LiquidacionSueldo(Long id, String nomEmpresa, String rutEmpresa, String nomTrabajador, String rutTrabajador,
			int year, int mon, double sueldo, double hrasExtra, double bonoGesMen, double participacion,
			double comisiones, double gratificacion, double cargFami, double asigCola, double asigMovi, double afp,
			double seguroCesantia, double salud, double difIsap, double impUni, double cuoBie, double cuoAhorrLibr,
			double credCCFAAra, double sulLiqLetras, double valesAnticipos) {
		super();
		this.id = id;
		this.nomEmpresa = nomEmpresa;
		this.rutEmpresa = rutEmpresa;
		this.nomTrabajador = nomTrabajador;
		this.rutTrabajador = rutTrabajador;
		this.year = year;
		this.mon = mon;
		this.sueldo = sueldo;
		this.hrasExtra = hrasExtra;
		this.bonoGesMen = bonoGesMen;
		this.participacion = participacion;
		this.comisiones = comisiones;
		this.gratificacion = gratificacion;
		this.cargFami = cargFami;
		this.asigCola = asigCola;
		this.asigMovi = asigMovi;
		this.afp = afp;
		this.seguroCesantia = seguroCesantia;
		this.salud = salud;
		this.difIsap = difIsap;
		this.impUni = impUni;
		this.cuoBie = cuoBie;
		this.cuoAhorrLibr = cuoAhorrLibr;
		this.credCCFAAra = credCCFAAra;
		this.sulLiqLetras = sulLiqLetras;
		this.valesAnticipos = valesAnticipos;
	}

	public LiquidacionSueldo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LiquidacionSueldo [id=" + id + ", nomEmpresa=" + nomEmpresa + ", rutEmpresa=" + rutEmpresa
				+ ", nomTrabajador=" + nomTrabajador + ", rutTrabajador=" + rutTrabajador + ", year=" + year + ", mon="
				+ mon + ", sueldo=" + sueldo + ", hrasExtra=" + hrasExtra + ", bonoGesMen=" + bonoGesMen
				+ ", participacion=" + participacion + ", comisiones=" + comisiones + ", gratificacion=" + gratificacion
				+ ", cargFami=" + cargFami + ", asigCola=" + asigCola + ", asigMovi=" + asigMovi + ", afp=" + afp
				+ ", seguroCesantia=" + seguroCesantia + ", salud=" + salud + ", difIsap=" + difIsap + ", impUni="
				+ impUni + ", cuoBie=" + cuoBie + ", cuoAhorrLibr=" + cuoAhorrLibr + ", credCCFAAra=" + credCCFAAra
				+ ", sulLiqLetras=" + sulLiqLetras + ", valesAnticipos=" + valesAnticipos + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomEmpresa() {
		return nomEmpresa;
	}

	public void setNomEmpresa(String nomEmpresa) {
		this.nomEmpresa = nomEmpresa;
	}

	public String getRutEmpresa() {
		return rutEmpresa;
	}

	public void setRutEmpresa(String rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}

	public String getNomTrabajador() {
		return nomTrabajador;
	}

	public void setNomTrabajador(String nomTrabajador) {
		this.nomTrabajador = nomTrabajador;
	}

	public String getRutTrabajador() {
		return rutTrabajador;
	}

	public void setRutTrabajador(String rutTrabajador) {
		this.rutTrabajador = rutTrabajador;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMon() {
		return mon;
	}

	public void setMon(int mon) {
		this.mon = mon;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getHrasExtra() {
		return hrasExtra;
	}

	public void setHrasExtra(double hrasExtra) {
		this.hrasExtra = hrasExtra;
	}

	public double getBonoGesMen() {
		return bonoGesMen;
	}

	public void setBonoGesMen(double bonoGesMen) {
		this.bonoGesMen = bonoGesMen;
	}

	public double getParticipacion() {
		return participacion;
	}

	public void setParticipacion(double participacion) {
		this.participacion = participacion;
	}

	public double getComisiones() {
		return comisiones;
	}

	public void setComisiones(double comisiones) {
		this.comisiones = comisiones;
	}

	public double getGratificacion() {
		return gratificacion;
	}

	public void setGratificacion(double gratificacion) {
		this.gratificacion = gratificacion;
	}

	public double getCargFami() {
		return cargFami;
	}

	public void setCargFami(double cargFami) {
		this.cargFami = cargFami;
	}

	public double getAsigCola() {
		return asigCola;
	}

	public void setAsigCola(double asigCola) {
		this.asigCola = asigCola;
	}

	public double getAsigMovi() {
		return asigMovi;
	}

	public void setAsigMovi(double asigMovi) {
		this.asigMovi = asigMovi;
	}

	public double getAfp() {
		return afp;
	}

	public void setAfp(double afp) {
		this.afp = afp;
	}

	public double getSeguroCesantia() {
		return seguroCesantia;
	}

	public void setSeguroCesantia(double seguroCesantia) {
		this.seguroCesantia = seguroCesantia;
	}

	public double getSalud() {
		return salud;
	}

	public void setSalud(double salud) {
		this.salud = salud;
	}

	public double getDifIsap() {
		return difIsap;
	}

	public void setDifIsap(double difIsap) {
		this.difIsap = difIsap;
	}

	public double getImpUni() {
		return impUni;
	}

	public void setImpUni(double impUni) {
		this.impUni = impUni;
	}

	public double getCuoBie() {
		return cuoBie;
	}

	public void setCuoBie(double cuoBie) {
		this.cuoBie = cuoBie;
	}

	public double getCuoAhorrLibr() {
		return cuoAhorrLibr;
	}

	public void setCuoAhorrLibr(double cuoAhorrLibr) {
		this.cuoAhorrLibr = cuoAhorrLibr;
	}

	public double getCredCCFAAra() {
		return credCCFAAra;
	}

	public void setCredCCFAAra(double credCCFAAra) {
		this.credCCFAAra = credCCFAAra;
	}

	public double getSulLiqLetras() {
		return sulLiqLetras;
	}

	public void setSulLiqLetras(double sulLiqLetras) {
		this.sulLiqLetras = sulLiqLetras;
	}

	public double getValesAnticipos() {
		return valesAnticipos;
	}

	public void setValesAnticipos(double valesAnticipos) {
		this.valesAnticipos = valesAnticipos;
	}
	
	
}