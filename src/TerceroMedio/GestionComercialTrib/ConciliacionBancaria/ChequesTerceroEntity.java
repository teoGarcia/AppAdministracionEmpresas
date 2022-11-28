package TerceroMedio.GestionComercialTrib.ConciliacionBancaria;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChequesTerceroEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private String numeroFactura;
	
	@Column
	private Calendar fechaDeposito;
	
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
	private String depositadoEn;
	
	@Column
	private Calendar fechaEndoso;
	
	@Column
	private String destinatarioEndoso;
	
	@Column
	private String observacion;

	public ChequesTerceroEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChequesTerceroEntity(Long id, String numeroFactura, Calendar fechaDeposito, String bancoEmision,
			String numeroCheque, String titularCheque, int monto, int estado, String depositadoEn, Calendar fechaEndoso,
			String destinatarioEndoso, String observacion) {
		super();
		Id = id;
		this.numeroFactura = numeroFactura;
		this.fechaDeposito = fechaDeposito;
		this.bancoEmision = bancoEmision;
		this.numeroCheque = numeroCheque;
		this.titularCheque = titularCheque;
		this.monto = monto;
		this.estado = estado;
		this.depositadoEn = depositadoEn;
		this.fechaEndoso = fechaEndoso;
		this.destinatarioEndoso = destinatarioEndoso;
		this.observacion = observacion;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public Calendar getFechaDeposito() {
		return fechaDeposito;
	}

	public void setFechaDeposito(Calendar fechaDeposito) {
		this.fechaDeposito = fechaDeposito;
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

	public String getDepositadoEn() {
		return depositadoEn;
	}

	public void setDepositadoEn(String depositadoEn) {
		this.depositadoEn = depositadoEn;
	}

	public Calendar getFechaEndoso() {
		return fechaEndoso;
	}

	public void setFechaEndoso(Calendar fechaEndoso) {
		this.fechaEndoso = fechaEndoso;
	}

	public String getDestinatarioEndoso() {
		return destinatarioEndoso;
	}

	public void setDestinatarioEndoso(String destinatarioEndoso) {
		this.destinatarioEndoso = destinatarioEndoso;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
