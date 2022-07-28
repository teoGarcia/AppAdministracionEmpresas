package CuartoMedio.CalculoDeRemuneraciones.LiquidacionSueldo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LiquidacionSueldo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
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
	private int anio;

	@Column
	private int mes;

	@Column
	private int sueldo;

	@Column
	private int hrasExtra;

	@Column
	private int bonoGesMen;

	@Column
	private int participacion;

	@Column
	private int comisiones;

	@Column
	private int gratificacion;

	@Column
	private int cargFami;

	@Column
	private int asigCola;

	@Column
	private int asigMovi;

	@Column
	private int afp;

	@Column
	private int seguroCesantia;

	@Column
	private int salud;

	@Column
	private int difIsap;

	@Column
	private int impUni;

	@Column
	private int cuoBie;

	@Column
	private int cuoAhorrLibr;

	@Column
	private int credCCFAAra;

	@Column
	private String sulLiqLetras;

	@Column
	private int valesAnticipos;
	
	
	public LiquidacionSueldo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*public LiquidacionSueldo(Long id, String nomEmpresa, String rutEmpresa, String nomTrabajador, String rutTrabajador,
			Long year, Long mon, double sueldo, double hrasExtra, double bonoGesMen, double participacion,
			double comisiones, double gratificacion, double cargFami, double asigCola, double asigMovi, double afp,
			double seguroCesantia, double salud, double difIsap, double impUni, double cuoBie, double cuoAhorrLibr,
			double credCCFAAra, double sulLiqLetras, double valesAnticipos) {
		super();
		this.id = id;
		this.nomEmpresa = nomEmpresa;
		this.rutEmpresa = rutEmpresa;
		this.nomTrabajador = nomTrabajador;
		this.rutTrabajador = rutTrabajador;
		// this.year = year;
		// this.mon = mon;
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

	}*/

	public LiquidacionSueldo(Long id, String nomEmpresa, String rutEmpresa, String nomTrabajador, String rutTrabajador,
			int anio, int mes, int sueldo, int hrasExtra, int bonoGesMen, int participacion, int comisiones,
			int gratificacion, int cargFami, int asigCola, int asigMovi, int afp, int seguroCesantia, int salud,
			int difIsap, int impUni, int cuoBie, int cuoAhorrLibr, int credCCFAAra, String sulLiqLetras,
			int valesAnticipos) {
		super();
		this.id = id;
		this.nomEmpresa = nomEmpresa;
		this.rutEmpresa = rutEmpresa;
		this.nomTrabajador = nomTrabajador;
		this.rutTrabajador = rutTrabajador;
		this.anio = anio;
		this.mes = mes;
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

	public int getSueldo() {
		return sueldo;
	}

	public int getHrasExtra() {
		return hrasExtra;
	}

	public int getBonoGesMen() {
		return bonoGesMen;
	}

	public int getParticipacion() {
		return participacion;
	}

	public int getComisiones() {
		return comisiones;
	}

	public int getGratificacion() {
		return gratificacion;
	}

	public int getCargFami() {
		return cargFami;
	}

	public int getAsigCola() {
		return asigCola;
	}

	public int getAsigMovi() {
		return asigMovi;
	}

	public int getAfp() {
		return afp;
	}

	public int getSeguroCesantia() {
		return seguroCesantia;
	}

	public int getSalud() {
		return salud;
	}

	public int getDifIsap() {
		return difIsap;
	}

	public int getImpUni() {
		return impUni;
	}

	public int getCuoBie() {
		return cuoBie;
	}

	public int getCuoAhorrLibr() {
		return cuoAhorrLibr;
	}

	public int getCredCCFAAra() {
		return credCCFAAra;
	}

	public String getSulLiqLetras() {
		return sulLiqLetras;
	}

	public int getValesAnticipos() {
		return valesAnticipos;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public void setHrasExtra(int hrasExtra) {
		this.hrasExtra = hrasExtra;
	}

	public void setBonoGesMen(int bonoGesMen) {
		this.bonoGesMen = bonoGesMen;
	}

	public void setParticipacion(int participacion) {
		this.participacion = participacion;
	}

	public void setComisiones(int comisiones) {
		this.comisiones = comisiones;
	}

	public void setGratificacion(int gratificacion) {
		this.gratificacion = gratificacion;
	}

	public void setCargFami(int cargFami) {
		this.cargFami = cargFami;
	}

	public void setAsigCola(int asigCola) {
		this.asigCola = asigCola;
	}

	public void setAsigMovi(int asigMovi) {
		this.asigMovi = asigMovi;
	}

	public void setAfp(int afp) {
		this.afp = afp;
	}

	public void setSeguroCesantia(int seguroCesantia) {
		this.seguroCesantia = seguroCesantia;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public void setDifIsap(int difIsap) {
		this.difIsap = difIsap;
	}

	public void setImpUni(int impUni) {
		this.impUni = impUni;
	}

	public void setCuoBie(int cuoBie) {
		this.cuoBie = cuoBie;
	}

	public void setCuoAhorrLibr(int cuoAhorrLibr) {
		this.cuoAhorrLibr = cuoAhorrLibr;
	}

	public void setCredCCFAAra(int credCCFAAra) {
		this.credCCFAAra = credCCFAAra;
	}

	public void setSulLiqLetras(String sulLiqLetras) {
		this.sulLiqLetras = sulLiqLetras;
	}

	public void setValesAnticipos(int valesAnticipos) {
		this.valesAnticipos = valesAnticipos;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getMes() {
		return mes;
	}

	@Override
	public String toString() {
		return "LiquidacionSueldo [id=" + id + ", nomEmpresa=" + nomEmpresa + ", rutEmpresa=" + rutEmpresa
				+ ", nomTrabajador=" + nomTrabajador + ", rutTrabajador=" + rutTrabajador + ", anio=" + anio + ", mes="
				+ mes + ", sueldo=" + sueldo + ", hrasExtra=" + hrasExtra + ", bonoGesMen=" + bonoGesMen
				+ ", participacion=" + participacion + ", comisiones=" + comisiones + ", gratificacion=" + gratificacion
				+ ", cargFami=" + cargFami + ", asigCola=" + asigCola + ", asigMovi=" + asigMovi + ", afp=" + afp
				+ ", seguroCesantia=" + seguroCesantia + ", salud=" + salud + ", difIsap=" + difIsap + ", impUni="
				+ impUni + ", cuoBie=" + cuoBie + ", cuoAhorrLibr=" + cuoAhorrLibr + ", credCCFAAra=" + credCCFAAra
				+ ", sulLiqLetras=" + sulLiqLetras + ", valesAnticipos=" + valesAnticipos + "]";
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

}