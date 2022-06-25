package CuartoMedio.EmprendimientoYEmpleabilidad.Presupuesto;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Presupuesto")
public class PresupuestoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String apartado;
	
	@Column
	private Calendar fecha;
	
	@Column(columnDefinition="default '0'")
	private Double ingreso;
	
	@Column(columnDefinition="default '0'")
	private Double egreso;

}
