package CuartoMedio.EmprendimientoYEmpleabilidad.FlujoCaja.FlujoCaja;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Caja {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private int numero;
	
	@Column
	private String Tipo;
	
	@Column
	private String responsable;

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

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public Caja(Long id, int numero, String tipo, String responsable) {
		super();
		Id = id;
		this.numero = numero;
		Tipo = tipo;
		this.responsable = responsable;
	}

	public Caja() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Caja [Id=" + Id + ", numero=" + numero + ", Tipo=" + Tipo + ", responsable=" + responsable + "]";
	}
	
}
