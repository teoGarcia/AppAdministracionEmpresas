package TerceroMedio.GestionComercialTrib.Cotizacion;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class RealizarCotizacionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private Long idCotizacion;
	
	@Column
	private int cantidad;
	
	@Column
	private String descripcion;
	
	@Column
	private int valorUnitario;

}
