package CuartoMedio.CalculoDeRemuneraciones.AsientoContable;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private Calendar fecha;
	
	// DEBE
	
	@Column
	private int sueldo;
	
	@Column
	private int gratificaciones;
	
	@Column
	private int hExtra;
	
	@Column
	private int comisones;
	
	@Column
	private int bonus;
	
	@Column
	private int movili;
	
	@Column
	private int colacion;
	
	@Column
	private int viaticos;
	
	@Column
	private int asigfami;
	
	// haber
	
	@Column
	private int afp;
	
	@Column
	private int fonasa;
	
	@Column
	private int isapre;
	
	@Column
	private int difIsapre;
	
	@Column
	private int segSesan;
	
	@Column
	private int impUni;
	
	@Column
	private int cuotSind;
	
	@Column
	private int cuotBiene;
	
	@Column
	private int antSuel;
	
	// asi. con. pag. Remune.
	
	@Column
	private int sulpagRem;
	
	@Column
	private String cajaBancoRem;
	
	@Column
	private String glosaRem;
	
	// asi. con. aporte patronal.
	
	@Column
	private int sulpagPatro;
		
	@Column
	private String cajaBancoPatro;
		
	@Column
	private String glosaPatro;

	
	
	
	public AsientoContable() {
	
		super();
		// TODO Auto-generated constructor stub
	}

	public AsientoContable(Long id, String nomEmple, String rut, String cargo, Calendar fecha, int sueldo,
			int gratificaciones, int hExtra, int comisones, int bonus, int movili, int colacion, int viaticos,
			int asigfami, int afp, int fonasa, int isapre, int difIsapre, int segSesan, int impUni, int cuotSind,
			int cuotBiene, int antSuel, int sulpagRem, String cajaBancoRem, String glosaRem, int sulpagPatro,
			String cajaBancoPatro, String glosaPatro) {
		super();
		this.id = id;
		this.nomEmple = nomEmple;
		this.rut = rut;
		this.cargo = cargo;
		this.fecha = fecha;
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

	public Long getId() {
		return id;
	}

	public String getNomEmple() {
		return nomEmple;
	}

	public String getRut() {
		return rut;
	}

	public String getCargo() {
		return cargo;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public int getSueldo() {
		return sueldo;
	}

	public int getGratificaciones() {
		return gratificaciones;
	}

	public int gethExtra() {
		return hExtra;
	}

	public int getComisones() {
		return comisones;
	}

	public int getBonus() {
		return bonus;
	}

	public int getMovili() {
		return movili;
	}

	public int getColacion() {
		return colacion;
	}

	public int getViaticos() {
		return viaticos;
	}

	public int getAsigfami() {
		return asigfami;
	}

	public int getAfp() {
		return afp;
	}

	public int getFonasa() {
		return fonasa;
	}

	public int getIsapre() {
		return isapre;
	}

	public int getDifIsapre() {
		return difIsapre;
	}

	public int getSegSesan() {
		return segSesan;
	}

	public int getImpUni() {
		return impUni;
	}

	public int getCuotSind() {
		return cuotSind;
	}

	public int getCuotBiene() {
		return cuotBiene;
	}

	public int getAntSuel() {
		return antSuel;
	}

	public int getSulpagRem() {
		return sulpagRem;
	}

	public String getCajaBancoRem() {
		return cajaBancoRem;
	}

	public String getGlosaRem() {
		return glosaRem;
	}

	public int getSulpagPatro() {
		return sulpagPatro;
	}

	public String getCajaBancoPatro() {
		return cajaBancoPatro;
	}

	public String getGlosaPatro() {
		return glosaPatro;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNomEmple(String nomEmple) {
		this.nomEmple = nomEmple;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public void setGratificaciones(int gratificaciones) {
		this.gratificaciones = gratificaciones;
	}

	public void sethExtra(int hExtra) {
		this.hExtra = hExtra;
	}

	public void setComisones(int comisones) {
		this.comisones = comisones;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public void setMovili(int movili) {
		this.movili = movili;
	}

	public void setColacion(int colacion) {
		this.colacion = colacion;
	}

	public void setViaticos(int viaticos) {
		this.viaticos = viaticos;
	}

	public void setAsigfami(int asigfami) {
		this.asigfami = asigfami;
	}

	public void setAfp(int afp) {
		this.afp = afp;
	}

	public void setFonasa(int fonasa) {
		this.fonasa = fonasa;
	}

	public void setIsapre(int isapre) {
		this.isapre = isapre;
	}

	public void setDifIsapre(int difIsapre) {
		this.difIsapre = difIsapre;
	}

	public void setSegSesan(int segSesan) {
		this.segSesan = segSesan;
	}

	public void setImpUni(int impUni) {
		this.impUni = impUni;
	}

	public void setCuotSind(int cuotSind) {
		this.cuotSind = cuotSind;
	}

	public void setCuotBiene(int cuotBiene) {
		this.cuotBiene = cuotBiene;
	}

	public void setAntSuel(int antSuel) {
		this.antSuel = antSuel;
	}

	public void setSulpagRem(int sulpagRem) {
		this.sulpagRem = sulpagRem;
	}

	public void setCajaBancoRem(String cajaBancoRem) {
		this.cajaBancoRem = cajaBancoRem;
	}

	public void setGlosaRem(String glosaRem) {
		this.glosaRem = glosaRem;
	}

	public void setSulpagPatro(int sulpagPatro) {
		this.sulpagPatro = sulpagPatro;
	}

	public void setCajaBancoPatro(String cajaBancoPatro) {
		this.cajaBancoPatro = cajaBancoPatro;
	}

	public void setGlosaPatro(String glosaPatro) {
		this.glosaPatro = glosaPatro;
	}
	

	

}