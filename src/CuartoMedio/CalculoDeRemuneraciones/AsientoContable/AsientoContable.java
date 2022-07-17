package CuartoMedio.CalculoDeRemuneraciones.AsientoContable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.toedter.calendar.JCalendar;

@Entity
public class AsientoContable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column
	private String nomEmple;
	
	@Column
	private String rut;
	
	@Column
	private String cargo;
	
	@Column
	private JCalendar fechaEntrega;
	
	// DEBE
	
	@Column
	private double sueldo;
	
	@Column
	private double gratificaciones;
	
	@Column
	private double hExtra;
	
	@Column
	private double comisones;
	
	@Column
	private double bonus;
	
	@Column
	private double movili;
	
	@Column
	private double colacion;
	
	@Column
	private double viaticos;
	
	@Column
	private double asigfami;
	
	// haber
	
	@Column
	private double afp;
	
	@Column
	private double fonasa;
	
	@Column
	private double isapre;
	
	@Column
	private double difIsapre;
	
	@Column
	private double segSesan;
	
	@Column
	private double impUni;
	
	@Column
	private double cuotSind;
	
	@Column
	private double cuotBiene;
	
	@Column
	private double antSuel;
	
	// asi. con. pag. Remune.
	
	@Column
	private double sulpagRem;
	
	@Column
	private double cajaBancoRem;
	
	@Column
	private double glosaRem;
	
	// asi. con. aporte patronal.
	
	@Column
	private double sulpagPatro;
		
	@Column
	private double cajaBancoPatro;
		
	@Column
	private double glosaPatro;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomEmple() {
		return nomEmple;
	}

	public void setNomEmple(String nomEmple) {
		this.nomEmple = nomEmple;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public JCalendar getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(JCalendar fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getGratificaciones() {
		return gratificaciones;
	}

	public void setGratificaciones(double gratificaciones) {
		this.gratificaciones = gratificaciones;
	}

	public double gethExtra() {
		return hExtra;
	}

	public void sethExtra(double hExtra) {
		this.hExtra = hExtra;
	}

	public double getComisones() {
		return comisones;
	}

	public void setComisones(double comisones) {
		this.comisones = comisones;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getMovili() {
		return movili;
	}

	public void setMovili(double movili) {
		this.movili = movili;
	}

	public double getColacion() {
		return colacion;
	}

	public void setColacion(double colacion) {
		this.colacion = colacion;
	}

	public double getViaticos() {
		return viaticos;
	}

	public void setViaticos(double viaticos) {
		this.viaticos = viaticos;
	}

	public double getAsigfami() {
		return asigfami;
	}

	public void setAsigfami(double asigfami) {
		this.asigfami = asigfami;
	}

	public double getAfp() {
		return afp;
	}

	public void setAfp(double afp) {
		this.afp = afp;
	}

	public double getFonasa() {
		return fonasa;
	}

	public void setFonasa(double fonasa) {
		this.fonasa = fonasa;
	}

	public double getIsapre() {
		return isapre;
	}

	public void setIsapre(double isapre) {
		this.isapre = isapre;
	}

	public double getDifIsapre() {
		return difIsapre;
	}

	public void setDifIsapre(double difIsapre) {
		this.difIsapre = difIsapre;
	}

	public double getSegSesan() {
		return segSesan;
	}

	public void setSegSesan(double segSesan) {
		this.segSesan = segSesan;
	}

	public double getImpUni() {
		return impUni;
	}

	public void setImpUni(double impUni) {
		this.impUni = impUni;
	}

	public double getCuotSind() {
		return cuotSind;
	}

	public void setCuotSind(double cuotSind) {
		this.cuotSind = cuotSind;
	}

	public double getCuotBiene() {
		return cuotBiene;
	}

	public void setCuotBiene(double cuotBiene) {
		this.cuotBiene = cuotBiene;
	}

	public double getAntSuel() {
		return antSuel;
	}

	public void setAntSuel(double antSuel) {
		this.antSuel = antSuel;
	}

	public double getSulpagRem() {
		return sulpagRem;
	}

	public void setSulpagRem(double sulpagRem) {
		this.sulpagRem = sulpagRem;
	}

	public double getCajaBancoRem() {
		return cajaBancoRem;
	}

	public void setCajaBancoRem(double cajaBancoRem) {
		this.cajaBancoRem = cajaBancoRem;
	}

	public double getGlosaRem() {
		return glosaRem;
	}

	public void setGlosaRem(double glosaRem) {
		this.glosaRem = glosaRem;
	}

	public double getSulpagPatro() {
		return sulpagPatro;
	}

	public void setSulpagPatro(double sulpagPatro) {
		this.sulpagPatro = sulpagPatro;
	}

	public double getCajaBancoPatro() {
		return cajaBancoPatro;
	}

	public void setCajaBancoPatro(double cajaBancoPatro) {
		this.cajaBancoPatro = cajaBancoPatro;
	}

	public double getGlosaPatro() {
		return glosaPatro;
	}

	public void setGlosaPatro(double glosaPatro) {
		this.glosaPatro = glosaPatro;
	}

	public AsientoContable() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AsientoContable [id=" + id + ", nomEmple=" + nomEmple + ", rut=" + rut + ", cargo=" + cargo
				+ ", fechaEntrega=" + fechaEntrega + ", sueldo=" + sueldo + ", gratificaciones=" + gratificaciones
				+ ", hExtra=" + hExtra + ", comisones=" + comisones + ", bonus=" + bonus + ", movili=" + movili
				+ ", colacion=" + colacion + ", viaticos=" + viaticos + ", asigfami=" + asigfami + ", afp=" + afp
				+ ", fonasa=" + fonasa + ", isapre=" + isapre + ", difIsapre=" + difIsapre + ", segSesan=" + segSesan
				+ ", impUni=" + impUni + ", cuotSind=" + cuotSind + ", cuotBiene=" + cuotBiene + ", antSuel=" + antSuel
				+ ", sulpagRem=" + sulpagRem + ", cajaBancoRem=" + cajaBancoRem + ", glosaRem=" + glosaRem
				+ ", sulpagPatro=" + sulpagPatro + ", cajaBancoPatro=" + cajaBancoPatro + ", glosaPatro=" + glosaPatro
				+ "]";
	}
	
	public AsientoContable(Long id, String nomEmple, String rut, String cargo, JCalendar fechaEntrega, double sueldo,
			double gratificaciones, double hExtra, double comisones, double bonus, double movili, double colacion,
			double viaticos, double asigfami, double afp, double fonasa, double isapre, double difIsapre,
			double segSesan, double impUni, double cuotSind, double cuotBiene, double antSuel, double sulpagRem,
			double cajaBancoRem, double glosaRem, double sulpagPatro, double cajaBancoPatro, double glosaPatro) {
		super();
		this.id = id;
		this.nomEmple = nomEmple;
		this.rut = rut;
		this.cargo = cargo;
		this.fechaEntrega = fechaEntrega;
		this.sueldo = sueldo;
		this.gratificaciones = gratificaciones;
		this.hExtra = hExtra;
		this.comisones = comisones;
		this.bonus = bonus;
		this.movili = movili;
		this.colacion = colacion;
		this.viaticos = viaticos;
		this.asigfami = asigfami;
		this.afp = afp;
		this.fonasa = fonasa;
		this.isapre = isapre;
		this.difIsapre = difIsapre;
		this.segSesan = segSesan;
		this.impUni = impUni;
		this.cuotSind = cuotSind;
		this.cuotBiene = cuotBiene;
		this.antSuel = antSuel;
		this.sulpagRem = sulpagRem;
		this.cajaBancoRem = cajaBancoRem;
		this.glosaRem = glosaRem;
		this.sulpagPatro = sulpagPatro;
		this.cajaBancoPatro = cajaBancoPatro;
		this.glosaPatro = glosaPatro;
	}
}
