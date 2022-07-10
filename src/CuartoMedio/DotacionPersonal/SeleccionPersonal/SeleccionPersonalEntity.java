package CuartoMedio.DotacionPersonal.SeleccionPersonal;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class SeleccionPersonalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String Nombres;
	
	@Column
	private String ApellidoPaterno;
	
	@Column
	private String ApellidoMaterno;
	
	@Column
	private String CURP;
	
	@Column
	private String NumIMSS;
	
	@Column
	private String Domicilio;
	
	@Column
	private String CasoAccion;
	
	@Column
	private int EstadoCivil;
	
	@Column
	private int Sexo;
	
	@Column
	private String Institucion;
	
	@Column
	private String Carrera;
	
	@Column
	private String Ano;
	
	@Column
	private int Idioma;
	
	@Column
	private int Nivel;
	
	@Column
	private int Practica;
	
	@Column
	private String Curso1;
	
	@Column
	private String Curso2;
	
	@Column
	private String Curso3;
	
	@Column
	private String Curso4;
	
	@Column
	private String NombreCompania;
	
	@Column
	private String AreaOcupaba;
	
	@Column
	private String PuestoAntiguo;
	
	@Column
	private String Ocupacion;
	
	@Column
	private String Jefe;
	
	@Column
	private String Sueldo;
	
	@Column
	private String Telefono;
	
	@Column
	private Calendar FechaIngreso;
	
	@Column
	private Calendar FechaTermino;
	
	@Column
	private String Premio;
	
	@Column
	private String Reconocimiento;
	
	@Column
	private String Logros;

	public SeleccionPersonalEntity(Long id, String nombres, String apellidoPaterno, String apellidoMaterno, String cURP,
			String numIMSS, String domicilio, String casoAccion, int estadoCivil, int sexo, String institucion,
			String carrera, String ano, int idioma, int nivel, int practica, String curso1, String curso2,
			String curso3, String curso4, String nombreCompania, String areaOcupaba, String puestoAntiguo,
			String ocupacion, String jefe, String sueldo, String telefono, Calendar fechaIngreso, Calendar fechaTermino,
			String premio, String reconocimiento, String logros) {
		super();
		this.id = id;
		this.Nombres = nombres;
		this.ApellidoPaterno = apellidoPaterno;
		this.ApellidoMaterno = apellidoMaterno;
		this.CURP = cURP;
		this.NumIMSS = numIMSS;
		this.Domicilio = domicilio;
		this.CasoAccion = casoAccion;
		this.EstadoCivil = estadoCivil;
		this.Sexo = sexo;
		this.Institucion = institucion;
		this.Carrera = carrera;
		this.Ano = ano;
		this.Idioma = idioma;
		this.Nivel = nivel;
		this.Practica = practica;
		this.Curso1 = curso1;
		this.Curso2 = curso2;
		this.Curso3 = curso3;
		this.Curso4 = curso4;
		this.NombreCompania = nombreCompania;
		this.AreaOcupaba = areaOcupaba;
		this.PuestoAntiguo = puestoAntiguo;
		Ocupacion = ocupacion;
		Jefe = jefe;
		Sueldo = sueldo;
		Telefono = telefono;
		FechaIngreso = fechaIngreso;
		FechaTermino = fechaTermino;
		Premio = premio;
		Reconocimiento = reconocimiento;
		Logros = logros;
	}

	public SeleccionPersonalEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public String getNombres() {
		return Nombres;
	}

	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}

	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}

	public String getCURP() {
		return CURP;
	}

	public String getNumIMSS() {
		return NumIMSS;
	}

	public String getDomicilio() {
		return Domicilio;
	}

	public String getCasoAccion() {
		return CasoAccion;
	}

	public int getEstadoCivil() {
		return EstadoCivil;
	}

	public int getSexo() {
		return Sexo;
	}

	public String getInstitucion() {
		return Institucion;
	}

	public String getCarrera() {
		return Carrera;
	}

	public String getAno() {
		return Ano;
	}

	public int getIdioma() {
		return Idioma;
	}

	public int getNivel() {
		return Nivel;
	}

	public int getPractica() {
		return Practica;
	}

	public String getCurso1() {
		return Curso1;
	}

	public String getCurso2() {
		return Curso2;
	}

	public String getCurso3() {
		return Curso3;
	}

	public String getCurso4() {
		return Curso4;
	}

	public String getNombreCompania() {
		return NombreCompania;
	}

	public String getAreaOcupaba() {
		return AreaOcupaba;
	}

	public String getPuestoAntiguo() {
		return PuestoAntiguo;
	}

	public String getOcupacion() {
		return Ocupacion;
	}

	public String getJefe() {
		return Jefe;
	}

	public String getSueldo() {
		return Sueldo;
	}

	public String getTelefono() {
		return Telefono;
	}

	public Calendar getFechaIngreso() {
		return FechaIngreso;
	}

	public Calendar getFechaTermino() {
		return FechaTermino;
	}

	public String getPremio() {
		return Premio;
	}

	public String getReconocimiento() {
		return Reconocimiento;
	}

	public String getLogros() {
		return Logros;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		ApellidoPaterno = apellidoPaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		ApellidoMaterno = apellidoMaterno;
	}

	public void setCURP(String cURP) {
		CURP = cURP;
	}

	public void setNumIMSS(String numIMSS) {
		NumIMSS = numIMSS;
	}

	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}

	public void setCasoAccion(String casoAccion) {
		CasoAccion = casoAccion;
	}

	public void setEstadoCivil(int estadoCivil) {
		EstadoCivil = estadoCivil;
	}

	public void setSexo(int sexo) {
		Sexo = sexo;
	}

	public void setInstitucion(String institucion) {
		Institucion = institucion;
	}

	public void setCarrera(String carrera) {
		Carrera = carrera;
	}

	public void setAno(String ano) {
		Ano = ano;
	}

	public void setIdioma(int idioma) {
		Idioma = idioma;
	}

	public void setNivel(int nivel) {
		Nivel = nivel;
	}

	public void setPractica(int practica) {
		Practica = practica;
	}

	public void setCurso1(String curso1) {
		Curso1 = curso1;
	}

	public void setCurso2(String curso2) {
		Curso2 = curso2;
	}

	public void setCurso3(String curso3) {
		Curso3 = curso3;
	}

	public void setCurso4(String curso4) {
		Curso4 = curso4;
	}

	public void setNombreCompania(String nombreCompania) {
		NombreCompania = nombreCompania;
	}

	public void setAreaOcupaba(String areaOcupaba) {
		AreaOcupaba = areaOcupaba;
	}

	public void setPuestoAntiguo(String puestoAntiguo) {
		PuestoAntiguo = puestoAntiguo;
	}

	public void setOcupacion(String ocupacion) {
		Ocupacion = ocupacion;
	}

	public void setJefe(String jefe) {
		Jefe = jefe;
	}

	public void setSueldo(String sueldo) {
		Sueldo = sueldo;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public void setFechaIngreso(Calendar fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}

	public void setFechaTermino(Calendar fechaTermino) {
		FechaTermino = fechaTermino;
	}

	public void setPremio(String premio) {
		Premio = premio;
	}

	public void setReconocimiento(String reconocimiento) {
		Reconocimiento = reconocimiento;
	}

	public void setLogros(String logros) {
		Logros = logros;
	}
	

}
