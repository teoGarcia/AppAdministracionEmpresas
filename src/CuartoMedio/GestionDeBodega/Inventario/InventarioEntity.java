package CuartoMedio.GestionDeBodega.Inventario;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InventarioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private int tipoProducto;
	
	@Column
	private String insumo;
	
	@Column
	private int unidadMedida;
	
	@Column
	private int stockReal;
	
	@Column
	private Double valorUnitario;


	public InventarioEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public InventarioEntity(Long id, int tipoProducto, String insumo, int unidadMedida, int stockReal,
			Double valorUnitario) {
		super();
		this.id = id;
		this.tipoProducto = tipoProducto;
		this.insumo = insumo;
		this.unidadMedida = unidadMedida;
		this.stockReal = stockReal;
		this.valorUnitario = valorUnitario;
	}


	public Long getId() {
		return id;
	}


	public int getTipoProducto() {
		return tipoProducto;
	}


	public String getInsumo() {
		return insumo;
	}


	public int getUnidadMedida() {
		return unidadMedida;
	}


	public int getStockReal() {
		return stockReal;
	}


	public Double getValorUnitario() {
		return valorUnitario;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setTipoProducto(int tipoProducto) {
		this.tipoProducto = tipoProducto;
	}


	public void setInsumo(String insumo) {
		this.insumo = insumo;
	}


	public void setUnidadMedida(int unidadMedida) {
		this.unidadMedida = unidadMedida;
	}


	public void setStockReal(int stockReal) {
		this.stockReal = stockReal;
	}


	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}
