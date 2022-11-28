package TerceroMedio.GestionComercialTrib.ConciliacionBancaria;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


 @Entity
public class ChequesPropiosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private Calendar fechaSalida;
	
	@Column
	private String proveedor;
	
	@Column
	private String numeroFactura;

	@Column
	private Calendar fechaPago;
	
	@Column
	private String bancoEmision;
	
	@Column
	private String numeroCheque;
	
	@Column
	private String titularCheque;
	
	@Column
	private int monto;
	
	@Column
	private int estado;
	
	@Column
	private String observacion;

	public ChequesPropiosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChequesPropiosEntity(Long id, Calendar fechaSalida, String proveedor, String numeroFactura,
			Calendar fechaPago, String bancoEmision, String numeroCheque, String titularCheque, int monto, int estado,
			String observacion) {
		super();
		Id = id;
		this.fechaSalida = fechaSalida;
		this.proveedor = proveedor;
		this.numeroFactura = numeroFactura;
		this.fechaPago = fechaPago;
		this.bancoEmision = bancoEmision;
		this.numeroCheque = numeroCheque;
		this.titularCheque = titularCheque;
		this.monto = monto;
		this.estado = estado;
		this.observacion = observacion;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Calendar getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Calendar fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public Calendar getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Calendar fechaPago) {
		this.fechaPago = fechaPago;
	}

	public String getBancoEmision() {
		return bancoEmision;
	}

	public void setBancoEmision(String bancoEmision) {
		this.bancoEmision = bancoEmision;
	}

	public String getNumeroCheque() {
		return numeroCheque;
	}

	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}

	public String getTitularCheque() {
		return titularCheque;
	}

	public void setTitularCheque(String titularCheque) {
		this.titularCheque = titularCheque;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
