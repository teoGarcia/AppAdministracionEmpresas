package TerceroMedio.UtilizacionDeLaInformacionContable.Deprecacion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Deprecacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private int valorInicial;
	
	@Column
	private int valorRescate; 
	
	@Column
	private int vidaUtil;
	

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		this.Id = id;
	}

	public int getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(int valorInicial) {
		this.valorInicial = valorInicial;
	}

	public int getValorRescate() {
		return valorRescate;
	}

	public void setValorRescate(int valorRescate) {
		this.valorRescate = valorRescate;
	}

	public int getVidaUtil() {
		return vidaUtil;
	}

	public void setVidaUtil(int vidaUtil) {
		this.vidaUtil = vidaUtil;
	}
	

}
