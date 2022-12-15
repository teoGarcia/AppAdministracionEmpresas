package TerceroMedio.GestionComercialTrib.BoletaHonorarios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import core.CrudRepositoryJPA;

@Entity
public class ReaBoletaHonorariosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private Long idDatos;
	
	@Column
	private String descripcion;
	
	@Column
	private int valor;

	public ReaBoletaHonorariosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReaBoletaHonorariosEntity(Long id, Long idDatos, String descripcion, int valor) {
		super();
		Id = id;
		this.idDatos = idDatos;
		this.descripcion = descripcion;
		this.valor = valor;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getIdDatos() {
		return idDatos;
	}

	public void setIdDatos(Long idDatos) {
		this.idDatos = idDatos;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	

}
