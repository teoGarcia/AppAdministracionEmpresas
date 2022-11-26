package TerceroMedio.GestionComercialTrib.OC;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RealizarOCEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private Long idOC;
	
	@Column
	private String codLicitacion;
	
	@Column
	private String producto;
	
	@Column
	private int cantidad;
	
	@Column
	private int valorUnitario;
	
	@Column
	private int cargo;
	
	@Column
	private int descuento;
	
	@Column
	private String especifProveedor;
	
	@Column
	private String especifComprador;
	
	@Column
	private int UM;

	public RealizarOCEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RealizarOCEntity(Long id, Long idOC, String codLicitacion, String producto, int cantidad, int valorUnitario,
			int cargo, int descuento, String especifProveedor, String especifComprador, int uM) {
		super();
		Id = id;
		this.idOC = idOC;
		this.codLicitacion = codLicitacion;
		this.producto = producto;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
		this.cargo = cargo;
		this.descuento = descuento;
		this.especifProveedor = especifProveedor;
		this.especifComprador = especifComprador;
		UM = uM;
	}



	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getIdOC() {
		return idOC;
	}

	public void setIdOC(Long idOC) {
		this.idOC = idOC;
	}

	public String getCodLicitacion() {
		return codLicitacion;
	}

	public void setCodLicitacion(String codLicitacion) {
		this.codLicitacion = codLicitacion;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public String getEspecifProveedor() {
		return especifProveedor;
	}

	public void setEspecifProveedor(String especifProveedor) {
		this.especifProveedor = especifProveedor;
	}

	public String getEspecifComprador() {
		return especifComprador;
	}

	public void setEspecifComprador(String especifComprador) {
		this.especifComprador = especifComprador;
	}

	public int getUM() {
		return UM;
	}

	public void setUM(int uM) {
		UM = uM;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
