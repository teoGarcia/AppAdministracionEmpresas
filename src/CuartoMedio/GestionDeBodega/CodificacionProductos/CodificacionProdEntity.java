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
		private String DescuentoIntro; IVA, 
					   PVP, PrecioSugerido, Unidad, Embalaje, RegistroSanitario, VidaUtil, CajasxPlanchas, ;
		
	

}
