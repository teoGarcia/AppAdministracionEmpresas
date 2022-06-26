package CuartoMedio.GestionDeBodega.CodificacionProductos;

import javax.persistence.Id;
import javax.persistence.*;

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
		private String Unidad;
		@Column
		private String Embalaje;
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
	

}
