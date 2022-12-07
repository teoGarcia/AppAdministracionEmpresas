package TerceroMedio.GestionComercialTrib.DocumentacionMercantil;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RealizarGuiasEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private Long idGuia;
	
	@Column
	private String codigo;
	
	@Column
	private String descripcion;
	
	@Column
	private int cantidad;
	
	@Column
	private int precioUnitario;
	
	@Column
	private int impuestoAdicional;

	public RealizarGuiasEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RealizarGuiasEntity(Long id, Long idGuia, String codigo, String descripcion, int cantidad,
			int precioUnitario, int impuestoAdicional) {
		super();
		Id = id;
		this.idGuia = idGuia;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.impuestoAdicional = impuestoAdicional;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getIdGuia() {
		return idGuia;
	}

	public void setIdGuia(Long idGuia) {
		this.idGuia = idGuia;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getImpuestoAdicional() {
		return impuestoAdicional;
	}

	public void setImpuestoAdicional(int impuestoAdicional) {
		this.impuestoAdicional = impuestoAdicional;
	}

	
}
