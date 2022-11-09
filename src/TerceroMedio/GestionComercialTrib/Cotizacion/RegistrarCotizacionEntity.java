package TerceroMedio.GestionComercialTrib.Cotizacion;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistrarCotizacionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private Long idEmpresa;
	
	@Column
	private Calendar fechaEmision;
	
	@Column
	private Calendar validaHasta;
	
	@Column
	private Long numeroCotizacion;
	
	@Column
	private String terminoCondiciones;

}
