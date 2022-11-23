package CuartoMedio.DotacionPersonal.PerfilEmpleado;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class PerfilEmpleadoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String Sede;
	
	@Column
	private String Nivel;
	
	@Column
	private String DenominacionEmpleo;
	
	@Column
	private String Codigo;
	
	@Column
	private String Grado;
	
	@Column
	private String Dependencia;
	
	@Column
	private String CargoJefeInmediato;
	
	@Column
	private String Dedicacion;
	
	@Column
	private String ClaseCargo;
	
	@Column
	private String GrupoOcasional;
	
	@Column
	private String PropositoPrincipal;
	
	@Column
	private String FuncionesEsenciales;
	
	@Column
<<<<<<< HEAD
	private String CriteriosDesempenio;
=======
	private String CriteriosDesempeño;
>>>>>>> 990048b365f10e53aa46d08d6df6a0e2ec51a741
	
	@Column
	private String ConocimientosBasicos;
	
	@Column
	private String Organizacionales;
	
	@Column
	private String Individuales;

	public PerfilEmpleadoEntity(Long id, String sede, String nivel, String denominacionEmpleo, String codigo,
			String grado, String dependencia, String cargoJefeInmediato, String dedicacion, String claseCargo,
<<<<<<< HEAD
			String grupoOcasional, String propositoPrincipal, String funcionesEsenciales, String criteriosDesempenio,
=======
			String grupoOcasional, String propositoPrincipal, String funcionesEsenciales, String criteriosDesempeño,
>>>>>>> 990048b365f10e53aa46d08d6df6a0e2ec51a741
			String conocimientosBasicos, String organizacionales, String individuales) {
		super();
		this.id = id;
		this.Sede = sede;
		this.Nivel = nivel;
		this.DenominacionEmpleo = denominacionEmpleo;
		this.Codigo = codigo;
		this.Grado = grado;
		this.Dependencia = dependencia;
		this.CargoJefeInmediato = cargoJefeInmediato;
		this.Dedicacion = dedicacion;
		this.ClaseCargo = claseCargo;
		this.GrupoOcasional = grupoOcasional;
		this.PropositoPrincipal = propositoPrincipal;
		this.FuncionesEsenciales = funcionesEsenciales;
<<<<<<< HEAD
		this.CriteriosDesempenio = criteriosDesempenio;
=======
		this.CriteriosDesempeño = criteriosDesempeño;
>>>>>>> 990048b365f10e53aa46d08d6df6a0e2ec51a741
		this.ConocimientosBasicos = conocimientosBasicos;
		this.Organizacionales = organizacionales;
		this.Individuales = individuales;
	}

	public PerfilEmpleadoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public String getSede() {
		return Sede;
	}

	public String getNivel() {
		return Nivel;
	}

	public String getDenominacionEmpleo() {
		return DenominacionEmpleo;
	}

	public String getCodigo() {
		return Codigo;
	}

	public String getGrado() {
		return Grado;
	}

	public String getDependencia() {
		return Dependencia;
	}

	public String getCargoJefeInmediato() {
		return CargoJefeInmediato;
	}

	public String getDedicacion() {
		return Dedicacion;
	}

	public String getClaseCargo() {
		return ClaseCargo;
	}

	public String getGrupoOcasional() {
		return GrupoOcasional;
	}

	public String getPropositoPrincipal() {
		return PropositoPrincipal;
	}

	public String getFuncionesEsenciales() {
		return FuncionesEsenciales;
	}

<<<<<<< HEAD
	public String getCriteriosDesempenio() {
		return CriteriosDesempenio;
=======
	public String getCriteriosDesempeño() {
		return CriteriosDesempeño;
>>>>>>> 990048b365f10e53aa46d08d6df6a0e2ec51a741
	}

	public String getConocimientosBasicos() {
		return ConocimientosBasicos;
	}

	public String getOrganizacionales() {
		return Organizacionales;
	}

	public String getIndividuales() {
		return Individuales;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSede(String sede) {
		Sede = sede;
	}

	public void setNivel(String nivel) {
		Nivel = nivel;
	}

	public void setDenominacionEmpleo(String denominacionEmpleo) {
		DenominacionEmpleo = denominacionEmpleo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public void setGrado(String grado) {
		Grado = grado;
	}

	public void setDependencia(String dependencia) {
		Dependencia = dependencia;
	}

	public void setCargoJefeInmediato(String cargoJefeInmediato) {
		CargoJefeInmediato = cargoJefeInmediato;
	}

	public void setDedicacion(String dedicacion) {
		Dedicacion = dedicacion;
	}

	public void setClaseCargo(String claseCargo) {
		ClaseCargo = claseCargo;
	}

	public void setGrupoOcasional(String grupoOcasional) {
		GrupoOcasional = grupoOcasional;
	}

	public void setPropositoPrincipal(String propositoPrincipal) {
		PropositoPrincipal = propositoPrincipal;
	}

	public void setFuncionesEsenciales(String funcionesEsenciales) {
		FuncionesEsenciales = funcionesEsenciales;
	}

<<<<<<< HEAD
	public void setCriteriosDesempenio(String criteriosDesempenio) {
		CriteriosDesempenio = criteriosDesempenio;
=======
	public void setCriteriosDesempeño(String criteriosDesempeño) {
		CriteriosDesempeño = criteriosDesempeño;
>>>>>>> 990048b365f10e53aa46d08d6df6a0e2ec51a741
	}

	public void setConocimientosBasicos(String conocimientosBasicos) {
		ConocimientosBasicos = conocimientosBasicos;
	}

	public void setOrganizacionales(String organizacionales) {
		Organizacionales = organizacionales;
	}

	public void setIndividuales(String individuales) {
		Individuales = individuales;
	}

}
