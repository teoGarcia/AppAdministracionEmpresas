package CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flujo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private int numero;
	
	@Column
	private String caja;
	
	@Column
	private Long idCaja;
	
	@Column
	private Calendar fecha;
	
	@Column
	private String concepto;
	
	@Column
	private int codigo;
	
	@Column
	private int entrada;
	
	@Column
	private int salida;

	public Flujo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flujo(Long id, int numero, String caja, Long idCaja, Calendar fecha, String concepto, int codigo,
			int entrada, int salida) {
		super();
		Id = id;
		this.numero = numero;
		this.caja = caja;
		this.idCaja = idCaja;
		this.fecha = fecha;
		this.concepto = concepto;
		this.codigo = codigo;
		this.entrada = entrada;
		this.salida = salida;
	}

	@Override
	public String toString() {
		return "Flujo [Id=" + Id + ", numero=" + numero + ", caja=" + caja + ", idCaja=" + idCaja + ", fecha=" + fecha
				+ ", concepto=" + concepto + ", codigo=" + codigo + ", entrada=" + entrada + ", salida=" + salida + "]";
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCaja() {
		return caja;
	}

	public void setCaja(String caja) {
		this.caja = caja;
	}

	public Long getIdCaja() {
		return idCaja;
	}

	public void setIdCaja(Long idCaja) {
		this.idCaja = idCaja;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getEntrada() {
		return entrada;
	}

	public void setEntrada(int entrada) {
		this.entrada = entrada;
	}

	public int getSalida() {
		return salida;
	}

	public void setSalida(int salida) {
		this.salida = salida;
	}

}
