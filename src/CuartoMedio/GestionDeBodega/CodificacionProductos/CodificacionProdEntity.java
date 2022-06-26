package CuartoMedio.GestionDeBodega.CodificacionProductos;

import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class CodificacionProdEntity {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column
		private String Proveedor;
		@Column
		private String DescripProducto;
		@Column
		private String CodIntProducto;
		@Column
		private String CodBarrasEAN13;
		@Column
		private String CodBarrasEAN14;
		@Column
		private String PaisAbastecimiento;
		@Column
		private String PaisFabricacion;
		@Column
		private String Marca;
		@Column
		private String PrecioSinImpuestos;
		@Column
		private String DescuentoPermanente;
		@Column
		private String PrecioNeto;
		@Column
		private String DescuentoIntro;
		@Column
		private String IVA;
		@Column
		private String PVP;
		@Column
		private String PrecioSugerido;
		@Column
		private String UnidadEmbalaje;
		@Column
		private String RegistroSanitario;
		@Column
		private String VidaUtil;
		@Column
		private String CajasxPlanchas;
		@Column
		private String PlanchasxPallet;
		@Column
		private String TipoEmbalaje;
		@Column
		private String PesoBrutoCaja;
		@Column
		private String PesoNetoCaja;
		@Column
		private String ProfundidadCaja;
		@Column
		private String AnchoCaja;
		@Column
		private String AltoCaja;
		@Column
		private String VolumenCaja;
		@Column
		private String PesoBrutoUnidad;
		@Column
		private String PesoNeto;
		@Column
		private String ProfundidadUnidad;
		@Column
		private String AnchoUnidad;
		@Column
		private String AltoUnidad;
		@Column
		private String VolumenUnidad;
		
		
		public CodificacionProdEntity(Long id, String proveedor, String descripProducto, String codIntProducto,
				String codBarrasEAN13, String codBarrasEAN14, String paisAbastecimiento, String paisFabricacion,
				String marca, String precioSinImpuestos, String descuentoPermanente, String precioNeto,
				String descuentoIntro, String iVA, String pVP, String precioSugerido, String unidadEmbalaje,
				String registroSanitario, String vidaUtil, String cajasxPlanchas, String planchasxPallet,
				String tipoEmbalaje, String pesoBrutoCaja, String pesoNetoCaja, String profundidadCaja,
				String anchoCaja, String altoCaja, String volumenCaja, String pesoBrutoUnidad, String pesoNeto,
				String profundidadUnidad, String anchoUnidad, String altoUnidad, String volumenUnidad) {
			super();
			this.id = id;
			Proveedor = proveedor;
			DescripProducto = descripProducto;
			CodIntProducto = codIntProducto;
			CodBarrasEAN13 = codBarrasEAN13;
			CodBarrasEAN14 = codBarrasEAN14;
			PaisAbastecimiento = paisAbastecimiento;
			PaisFabricacion = paisFabricacion;
			Marca = marca;
			PrecioSinImpuestos = precioSinImpuestos;
			DescuentoPermanente = descuentoPermanente;
			PrecioNeto = precioNeto;
			DescuentoIntro = descuentoIntro;
			IVA = iVA;
			PVP = pVP;
			PrecioSugerido = precioSugerido;
			UnidadEmbalaje = unidadEmbalaje;
			RegistroSanitario = registroSanitario;
			VidaUtil = vidaUtil;
			CajasxPlanchas = cajasxPlanchas;
			PlanchasxPallet = planchasxPallet;
			TipoEmbalaje = tipoEmbalaje;
			PesoBrutoCaja = pesoBrutoCaja;
			PesoNetoCaja = pesoNetoCaja;
			ProfundidadCaja = profundidadCaja;
			AnchoCaja = anchoCaja;
			AltoCaja = altoCaja;
			VolumenCaja = volumenCaja;
			PesoBrutoUnidad = pesoBrutoUnidad;
			PesoNeto = pesoNeto;
			ProfundidadUnidad = profundidadUnidad;
			AnchoUnidad = anchoUnidad;
			AltoUnidad = altoUnidad;
			VolumenUnidad = volumenUnidad;
		}


		public CodificacionProdEntity() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getProveedor() {
			return Proveedor;
		}


		public void setProveedor(String proveedor) {
			Proveedor = proveedor;
		}


		public String getDescripProducto() {
			return DescripProducto;
		}


		public void setDescripProducto(String descripProducto) {
			DescripProducto = descripProducto;
		}


		public String getCodIntProducto() {
			return CodIntProducto;
		}


		public void setCodIntProducto(String codIntProducto) {
			CodIntProducto = codIntProducto;
		}


		public String getCodBarrasEAN13() {
			return CodBarrasEAN13;
		}


		public void setCodBarrasEAN13(String codBarrasEAN13) {
			CodBarrasEAN13 = codBarrasEAN13;
		}


		public String getCodBarrasEAN14() {
			return CodBarrasEAN14;
		}


		public void setCodBarrasEAN14(String codBarrasEAN14) {
			CodBarrasEAN14 = codBarrasEAN14;
		}


		public String getPaisAbastecimiento() {
			return PaisAbastecimiento;
		}


		public void setPaisAbastecimiento(String paisAbastecimiento) {
			PaisAbastecimiento = paisAbastecimiento;
		}


		public String getPaisFabricacion() {
			return PaisFabricacion;
		}


		public void setPaisFabricacion(String paisFabricacion) {
			PaisFabricacion = paisFabricacion;
		}


		public String getMarca() {
			return Marca;
		}


		public void setMarca(String marca) {
			Marca = marca;
		}


		public String getPrecioSinImpuestos() {
			return PrecioSinImpuestos;
		}


		public void setPrecioSinImpuestos(String precioSinImpuestos) {
			PrecioSinImpuestos = precioSinImpuestos;
		}


		public String getDescuentoPermanente() {
			return DescuentoPermanente;
		}


		public void setDescuentoPermanente(String descuentoPermanente) {
			DescuentoPermanente = descuentoPermanente;
		}


		public String getPrecioNeto() {
			return PrecioNeto;
		}


		public void setPrecioNeto(String precioNeto) {
			PrecioNeto = precioNeto;
		}


		public String getDescuentoIntro() {
			return DescuentoIntro;
		}


		public void setDescuentoIntro(String descuentoIntro) {
			DescuentoIntro = descuentoIntro;
		}


		public String getIVA() {
			return IVA;
		}


		public void setIVA(String iVA) {
			IVA = iVA;
		}


		public String getPVP() {
			return PVP;
		}


		public void setPVP(String pVP) {
			PVP = pVP;
		}


		public String getPrecioSugerido() {
			return PrecioSugerido;
		}


		public String getUnidadEmbalaje() {
			return UnidadEmbalaje;
		}


		public void setUnidadEmbalaje(String unidadEmbalaje) {
			UnidadEmbalaje = unidadEmbalaje;
		}


		public void setPrecioSugerido(String precioSugerido) {
			PrecioSugerido = precioSugerido;
		}


		public String getRegistroSanitario() {
			return RegistroSanitario;
		}


		public void setRegistroSanitario(String registroSanitario) {
			RegistroSanitario = registroSanitario;
		}


		public String getVidaUtil() {
			return VidaUtil;
		}


		public void setVidaUtil(String vidaUtil) {
			VidaUtil = vidaUtil;
		}


		public String getCajasxPlanchas() {
			return CajasxPlanchas;
		}


		public void setCajasxPlanchas(String cajasxPlanchas) {
			CajasxPlanchas = cajasxPlanchas;
		}


		public String getPlanchasxPallet() {
			return PlanchasxPallet;
		}


		public void setPlanchasxPallet(String planchasxPallet) {
			PlanchasxPallet = planchasxPallet;
		}


		public String getTipoEmbalaje() {
			return TipoEmbalaje;
		}


		public void setTipoEmbalaje(String tipoEmbalaje) {
			TipoEmbalaje = tipoEmbalaje;
		}


		public String getPesoBrutoCaja() {
			return PesoBrutoCaja;
		}


		public void setPesoBrutoCaja(String pesoBrutoCaja) {
			PesoBrutoCaja = pesoBrutoCaja;
		}


		public String getPesoNetoCaja() {
			return PesoNetoCaja;
		}


		public void setPesoNetoCaja(String pesoNetoCaja) {
			PesoNetoCaja = pesoNetoCaja;
		}


		public String getProfundidadCaja() {
			return ProfundidadCaja;
		}


		public void setProfundidadCaja(String profundidadCaja) {
			ProfundidadCaja = profundidadCaja;
		}


		public String getAnchoCaja() {
			return AnchoCaja;
		}


		public void setAnchoCaja(String anchoCaja) {
			AnchoCaja = anchoCaja;
		}


		public String getAltoCaja() {
			return AltoCaja;
		}


		public void setAltoCaja(String altoCaja) {
			AltoCaja = altoCaja;
		}


		public String getVolumenCaja() {
			return VolumenCaja;
		}


		public void setVolumenCaja(String volumenCaja) {
			VolumenCaja = volumenCaja;
		}


		public String getPesoBrutoUnidad() {
			return PesoBrutoUnidad;
		}


		public void setPesoBrutoUnidad(String pesoBrutoUnidad) {
			PesoBrutoUnidad = pesoBrutoUnidad;
		}


		public String getPesoNeto() {
			return PesoNeto;
		}


		public void setPesoNeto(String pesoNeto) {
			PesoNeto = pesoNeto;
		}


		public String getProfundidadUnidad() {
			return ProfundidadUnidad;
		}


		public void setProfundidadUnidad(String profundidadUnidad) {
			ProfundidadUnidad = profundidadUnidad;
		}


		public String getAnchoUnidad() {
			return AnchoUnidad;
		}


		public void setAnchoUnidad(String anchoUnidad) {
			AnchoUnidad = anchoUnidad;
		}


		public String getAltoUnidad() {
			return AltoUnidad;
		}


		public void setAltoUnidad(String altoUnidad) {
			AltoUnidad = altoUnidad;
		}


		public String getVolumenUnidad() {
			return VolumenUnidad;
		}


		public void setVolumenUnidad(String volumenUnidad) {
			VolumenUnidad = volumenUnidad;
		}
		
}
