package TerceroMedio.UtilizacionDeLaInformacionContable.BalanceGeneral;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BalanceGeneralEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private String nomEmp;
	
	@Column
	private Calendar fecha;
	
	
	// ACTIVOS
	// Actvio circulante
	@Column
	private int caja;
	
	@Column
	private int bancos;
	
	@Column
	private int invCorPla;
	
	@Column
	private int cuenPorCob;
	
	@Column
	private int inventario;
	
	
	
	// activo fijo
	@Column
	private int edificio;
	
	@Column
	private int terreno;
	
	@Column
	private int depAcu1;
	
	@Column
	private int MobEq;
	
	@Column
	private int depAcu2;
	
	@Column
	private int eqTransp;
	
	@Column
	private int depAcu3;
	
	@Column
	private int eqComp;
	
	@Column
	private int depAcu4;
	
	
	
	// activo diferido
	
	@Column
	private int rentPagAnt;
	
	@Column
	private int depAcu5;
	
	
	
	// PASIVOS
	
	// Pasivo circulante
	@Column
	private int proveedores;
	
	@Column
	private int acreedores;
	
	@Column
	private int intPorPagar;
	
	@Column
	private int ISRporPagar;
	
	@Column
	private int antiCliente;
	
	
	// pasivo largo plazo
	@Column
	private int docPorPagar;
	
	// CAPITAL CONTABLE
	
	@Column
	private int capSoc;
	
	@Column
	private int reservas;
	
	@Column
	private int resEjeAnt;
	
	@Column
	private int resEje;

	public Long getId() {
		return Id;
	}

	public String getNomEmp() {
		return nomEmp;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public int getCaja() {
		return caja;
	}

	public int getBancos() {
		return bancos;
	}

	public int getInvCorPla() {
		return invCorPla;
	}

	public int getCuenPorCob() {
		return cuenPorCob;
	}

	public int getInventario() {
		return inventario;
	}

	public int getEdificio() {
		return edificio;
	}

	public int getTerreno() {
		return terreno;
	}

	public int getDepAcu1() {
		return depAcu1;
	}

	public int getMobEq() {
		return MobEq;
	}

	public int getDepAcu2() {
		return depAcu2;
	}

	public int getEqTransp() {
		return eqTransp;
	}

	public int getDepAcu3() {
		return depAcu3;
	}

	public int getEqComp() {
		return eqComp;
	}

	public int getDepAcu4() {
		return depAcu4;
	}

	public int getRentPagAnt() {
		return rentPagAnt;
	}

	public int getDepAcu5() {
		return depAcu5;
	}

	public int getProveedores() {
		return proveedores;
	}

	public int getAcreedores() {
		return acreedores;
	}

	public int getIntPorPagar() {
		return intPorPagar;
	}

	public int getISRporPagar() {
		return ISRporPagar;
	}

	public int getAntiCliente() {
		return antiCliente;
	}

	public int getDocPorPagar() {
		return docPorPagar;
	}

	public int getCapSoc() {
		return capSoc;
	}

	public int getReservas() {
		return reservas;
	}

	public int getResEjeAnt() {
		return resEjeAnt;
	}

	public int getResEje() {
		return resEje;
	}

	public void setId(Long id) {
		Id = id;
	}

	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public void setCaja(int caja) {
		this.caja = caja;
	}

	public void setBancos(int bancos) {
		this.bancos = bancos;
	}

	public void setInvCorPla(int invCorPla) {
		this.invCorPla = invCorPla;
	}

	public void setCuenPorCob(int cuenPorCob) {
		this.cuenPorCob = cuenPorCob;
	}

	public void setInventario(int inventario) {
		this.inventario = inventario;
	}

	public void setEdificio(int edificio) {
		this.edificio = edificio;
	}

	public void setTerreno(int terreno) {
		this.terreno = terreno;
	}

	public void setDepAcu1(int depAcu1) {
		this.depAcu1 = depAcu1;
	}

	public void setMobEq(int mobEq) {
		MobEq = mobEq;
	}

	public void setDepAcu2(int depAcu2) {
		this.depAcu2 = depAcu2;
	}

	public void setEqTransp(int eqTransp) {
		this.eqTransp = eqTransp;
	}

	public void setDepAcu3(int depAcu3) {
		this.depAcu3 = depAcu3;
	}

	public void setEqComp(int eqComp) {
		this.eqComp = eqComp;
	}

	public void setDepAcu4(int depAcu4) {
		this.depAcu4 = depAcu4;
	}

	public void setRentPagAnt(int rentPagAnt) {
		this.rentPagAnt = rentPagAnt;
	}

	public void setDepAcu5(int depAcu5) {
		this.depAcu5 = depAcu5;
	}

	public void setProveedores(int proveedores) {
		this.proveedores = proveedores;
	}

	public void setAcreedores(int acreedores) {
		this.acreedores = acreedores;
	}

	public void setIntPorPagar(int intPorPagar) {
		this.intPorPagar = intPorPagar;
	}

	public void setISRporPagar(int iSRporPagar) {
		ISRporPagar = iSRporPagar;
	}

	public void setAntiCliente(int antiCliente) {
		this.antiCliente = antiCliente;
	}

	public void setDocPorPagar(int docPorPagar) {
		this.docPorPagar = docPorPagar;
	}

	public void setCapSoc(int capSoc) {
		this.capSoc = capSoc;
	}

	public void setReservas(int reservas) {
		this.reservas = reservas;
	}

	public void setResEjeAnt(int resEjeAnt) {
		this.resEjeAnt = resEjeAnt;
	}

	public void setResEje(int resEje) {
		this.resEje = resEje;
	}
	
	
}
