package CuartoMedio.GestionDeBodega.MermasMercaderia;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MermaMercaderiaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private int tipoMovString;
	
	@Column
	private int Motivo;
	
	@Column
	private String Folio;
	
	@Column
	private String Local;
	
	@Column
	private String Tienda;
	
	@Column
	private String Almacen;
	
	@Column
	private String CentroCosto;
	
	@Column
	private String Seccion;
	
	@Column
	private Calendar Fecha;
	
	@Column
	private String CodSAPBARRAS;
	
	@Column
	private String DescripcionMaterial;
	
	@Column
	private int UnidadMedida;
	
	@Column
	private String CodigoMotivo;
	
	@Column
	private String Cantidad;

	public MermaMercaderiaEntity(Long id, int tipoMovString, int motivo, String folio, String local,
			String tienda, String almacen, String centroCosto, String seccion, Calendar fecha, String codSAPBARRAS,
			String descripcionMaterial, int unidadMedida, String codigoMotivo, String cantidad) {
		super();
		this.id = id;
		this.tipoMovString = tipoMovString;
		this.Motivo = motivo;
		this.Folio = folio;
		this.Local = local;
		this.Tienda = tienda;
		this.Almacen = almacen;
		this.CentroCosto = centroCosto;
		this.Seccion = seccion;
		this.Fecha = fecha;
		this.CodSAPBARRAS = codSAPBARRAS;
		this.DescripcionMaterial = descripcionMaterial;
		this.UnidadMedida = unidadMedida;
		this.CodigoMotivo = codigoMotivo;
		this.Cantidad = cantidad;
	}

	public MermaMercaderiaEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}


	public String getFolio() {
		return Folio;
	}

	public String getLocal() {
		return Local;
	}

	public String getTienda() {
		return Tienda;
	}

	public String getAlmacen() {
		return Almacen;
	}

	public String getCentroCosto() {
		return CentroCosto;
	}

	public String getSeccion() {
		return Seccion;
	}

	public Calendar getFecha() {
		return Fecha;
	}

	public String getCodSAPBARRAS() {
		return CodSAPBARRAS;
	}

	public String getDescripcionMaterial() {
		return DescripcionMaterial;
	}

	public String getCodigoMotivo() {
		return CodigoMotivo;
	}

	public String getCantidad() {
		return Cantidad;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFolio(String folio) {
		Folio = folio;
	}

	public void setLocal(String local) {
		Local = local;
	}

	public void setTienda(String tienda) {
		Tienda = tienda;
	}

	public void setAlmacen(String almacen) {
		Almacen = almacen;
	}

	public void setCentroCosto(String centroCosto) {
		CentroCosto = centroCosto;
	}

	public void setSeccion(String seccion) {
		Seccion = seccion;
	}

	public void setFecha(Calendar fecha) {
		Fecha = fecha;
	}

	public void setCodSAPBARRAS(String codSAPBARRAS) {
		CodSAPBARRAS = codSAPBARRAS;
	}

	public void setDescripcionMaterial(String descripcionMaterial) {
		DescripcionMaterial = descripcionMaterial;
	}

	public void setCodigoMotivo(String codigoMotivo) {
		CodigoMotivo = codigoMotivo;
	}

	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}

	public int getTipoMovString() {
		return tipoMovString;
	}

	public void setTipoMovString(int tipoMovString) {
		this.tipoMovString = tipoMovString;
	}

	public int getMotivo() {
		return Motivo;
	}

	public int getUnidadMedida() {
		return UnidadMedida;
	}

	public void setMotivo(int motivo) {
		Motivo = motivo;
	}

	public void setUnidadMedida(int unidadMedida) {
		UnidadMedida = unidadMedida;
	}
	
}
