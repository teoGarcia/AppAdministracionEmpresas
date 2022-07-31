package CuartoMedio.DotacionPersonal.SeleccionPersonal.Imprimir;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
import CuartoMedio.DotacionPersonal.SeleccionPersonal.SeleccionPersonalEntity;
import core.Helpers;
import ui.Labels.LabelSubtitulos;

public class PanelImprimirSeleccionPersonal extends JPanel implements Printable{ private JLabel lblNombres;
private JLabel lblApellidos;
private JLabel lblCurp;
private JLabel lblNumImss;
private JLabel lblDomicilio;
private JLabel lblTlfCasoAccidente;
private JLabel lblEstadoCivil;
private JLabel lblSexo;
private JLabel lblAno;
private JLabel lblInstitucion;
private JLabel lblCarrera;
private JLabel lblNombreCompania;
private JLabel lblAreaOcupaba;
private JLabel lblOcupacion;
private JLabel lblJefe;
private JLabel lblSueldo;
private JLabel lblTelefono;
private JLabel lblPuestoAntiguo;
private JLabel lblFechaTerminoCampo;
private JLabel lblPremios;
private JLabel lblReconocimientos;
private JLabel lblLogros;
private JLabel lblFechaIngresoCampos;

	/**
	 * Create the panel.
	 */
	public PanelImprimirSeleccionPersonal() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2.setBounds(52, 138, 93, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Aplicacion de puesto de trabajo");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 70, 584, 33);
		add(lblNewLabel_3);
		
		lblNombres = new JLabel("Puesto");
		lblNombres.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNombres.setBounds(148, 138, 155, 22);
		add(lblNombres);
		
		JLabel lblApellido = new JLabel("Apellidos");
		lblApellido.setFont(new Font("Dialog", Font.BOLD, 10));
		lblApellido.setBounds(308, 138, 80, 22);
		add(lblApellido);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellidos.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblApellidos.setBounds(385, 138, 154, 22);
		add(lblApellidos);
		
		JLabel lblNewLabel_2_2 = new JLabel("Curp");
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_2.setBounds(52, 162, 93, 22);
		add(lblNewLabel_2_2);
		
		lblCurp = new JLabel("Puesto");
		lblCurp.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCurp.setBounds(148, 162, 155, 22);
		add(lblCurp);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("N\u00BA IMSS");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_1.setBounds(308, 162, 80, 22);
		add(lblNewLabel_2_1_1);
		
		lblNumImss = new JLabel("Categoria");
		lblNumImss.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumImss.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNumImss.setBounds(385, 162, 154, 22);
		add(lblNumImss);
		
		JLabel lblNewLabel_2_3 = new JLabel("Domicilio");
		lblNewLabel_2_3.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_3.setBounds(52, 186, 93, 22);
		add(lblNewLabel_2_3);
		
		lblDomicilio = new JLabel("Puesto");
		lblDomicilio.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblDomicilio.setBounds(148, 186, 391, 22);
		add(lblDomicilio);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Estado Civil");
		lblNewLabel_2_1_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_2.setBounds(308, 211, 80, 22);
		add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("Tlf. Caso Accidente");
		lblNewLabel_2_4.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_4.setBounds(52, 211, 105, 22);
		add(lblNewLabel_2_4);
		
		lblTlfCasoAccidente = new JLabel("Puesto");
		lblTlfCasoAccidente.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblTlfCasoAccidente.setBounds(148, 211, 155, 22);
		add(lblTlfCasoAccidente);
		
		lblEstadoCivil = new JLabel("Categoria");
		lblEstadoCivil.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstadoCivil.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblEstadoCivil.setBounds(385, 211, 154, 22);
		add(lblEstadoCivil);
		
		JLabel lblNewLabel_2_5 = new JLabel("Sexo");
		lblNewLabel_2_5.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_5.setBounds(52, 236, 93, 22);
		add(lblNewLabel_2_5);
		
		lblSexo = new JLabel("Puesto");
		lblSexo.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblSexo.setBounds(148, 236, 155, 22);
		add(lblSexo);
		
		JLabel lblNewLabel_2_1_5_1_1_1 = new JLabel("Datos Academicos");
		lblNewLabel_2_1_5_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_5_1_1_1.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_1.setBounds(0, 283, 584, 22);
		add(lblNewLabel_2_1_5_1_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(52, 267, 488, 5);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(52, 273, 488, 5);
		add(separator_1);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("A\u00F1o");
		lblNewLabel_2_1_6.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_6.setBounds(453, 316, 42, 22);
		add(lblNewLabel_2_1_6);
		
		lblAno = new JLabel("Categoria");
		lblAno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAno.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAno.setBounds(483, 316, 56, 22);
		add(lblAno);
		
		JLabel lblNewLabel_2_7_1 = new JLabel("Institucion");
		lblNewLabel_2_7_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_7_1.setBounds(52, 316, 72, 22);
		add(lblNewLabel_2_7_1);
		
		lblInstitucion = new JLabel("Puesto");
		lblInstitucion.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblInstitucion.setBounds(113, 316, 155, 22);
		add(lblInstitucion);
		
		JLabel lblNewLabel_2_1_6_1 = new JLabel("Carrera");
		lblNewLabel_2_1_6_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_6_1.setBounds(274, 316, 48, 22);
		add(lblNewLabel_2_1_6_1);
		
		lblCarrera = new JLabel("Categoria");
		lblCarrera.setHorizontalAlignment(SwingConstants.LEFT);
		lblCarrera.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCarrera.setBounds(322, 316, 128, 22);
		add(lblCarrera);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(51, 351, 488, 5);
		add(separator_2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(51, 357, 488, 5);
		add(separator_1_1);
		
		JLabel lblNewLabel_2_1_5_1_1_1_1 = new JLabel("Datos Laborales Internos");
		lblNewLabel_2_1_5_1_1_1_1.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_5_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_1_1.setBounds(0, 362, 584, 22);
		add(lblNewLabel_2_1_5_1_1_1_1);
		
		JLabel lblNewLabel_2_1_5_1_2 = new JLabel("Nombre de Compa\u00F1ia");
		lblNewLabel_2_1_5_1_2.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_2.setBounds(52, 400, 128, 22);
		add(lblNewLabel_2_1_5_1_2);
		
		lblNombreCompania = new JLabel("Categoria");
		lblNombreCompania.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombreCompania.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNombreCompania.setBounds(166, 400, 373, 22);
		add(lblNombreCompania);
		
		JLabel lblNewLabel_2_1_5_1_1_2 = new JLabel("Area que ocupaba");
		lblNewLabel_2_1_5_1_1_2.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_1_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_2.setBounds(52, 433, 118, 22);
		add(lblNewLabel_2_1_5_1_1_2);
		
		lblAreaOcupaba = new JLabel("Area que ocupaba");
		lblAreaOcupaba.setHorizontalAlignment(SwingConstants.LEFT);
		lblAreaOcupaba.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAreaOcupaba.setBounds(166, 433, 137, 22);
		add(lblAreaOcupaba);
		
		JLabel lblNewLabel_2_1_5_1_1_2_1 = new JLabel("Puesto antiguo");
		lblNewLabel_2_1_5_1_1_2_1.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_1_2_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_2_1.setBounds(308, 433, 93, 22);
		add(lblNewLabel_2_1_5_1_1_2_1);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBounds(51, 546, 488, 5);
		add(separator_2_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1.setBounds(51, 552, 488, 5);
		add(separator_1_1_1);
		
		JLabel FechaRevisado = new JLabel("Ocupacion");
		FechaRevisado.setFont(new Font("Dialog", Font.BOLD, 10));
		FechaRevisado.setBounds(308, 461, 80, 22);
		add(FechaRevisado);
		
		lblOcupacion = new JLabel("Categoria");
		lblOcupacion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOcupacion.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblOcupacion.setBounds(402, 461, 137, 22);
		add(lblOcupacion);
		
		JLabel lblNewLabel_2_7_3 = new JLabel("Jefe");
		lblNewLabel_2_7_3.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_7_3.setBounds(52, 461, 93, 22);
		add(lblNewLabel_2_7_3);
		
		lblJefe = new JLabel("Puesto");
		lblJefe.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblJefe.setBounds(166, 461, 137, 22);
		add(lblJefe);
		
		JLabel lblFechaAprobado = new JLabel("Sueldo");
		lblFechaAprobado.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFechaAprobado.setBounds(308, 487, 80, 22);
		add(lblFechaAprobado);
		
		lblSueldo = new JLabel("Categoria");
		lblSueldo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSueldo.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblSueldo.setBounds(402, 487, 137, 22);
		add(lblSueldo);
		
		LabelSubtitulos labelSubtitulos = new LabelSubtitulos((String) null);
		labelSubtitulos.setText("");
		labelSubtitulos.setBounds(308, 433, 93, 22);
		add(labelSubtitulos);
		
		lblPuestoAntiguo = new JLabel("Puesto antiguo");
		lblPuestoAntiguo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPuestoAntiguo.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblPuestoAntiguo.setBounds(402, 433, 137, 22);
		add(lblPuestoAntiguo);
		
		JLabel lblNewLabel_2_7_3_1 = new JLabel("Telefono");
		lblNewLabel_2_7_3_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_7_3_1.setBounds(52, 487, 93, 22);
		add(lblNewLabel_2_7_3_1);
		
		lblTelefono = new JLabel("Puesto");
		lblTelefono.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblTelefono.setBounds(166, 487, 137, 22);
		add(lblTelefono);
		
		JLabel lblFechaIngreso = new JLabel("Fecha Ingreso");
		lblFechaIngreso.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFechaIngreso.setBounds(52, 513, 80, 22);
		add(lblFechaIngreso);
		
		lblFechaIngresoCampos = new JLabel("Categoria");
		lblFechaIngresoCampos.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaIngresoCampos.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFechaIngresoCampos.setBounds(166, 513, 137, 22);
		add(lblFechaIngresoCampos);
		
		JLabel lblFechaTermino = new JLabel("Fecha Termino");
		lblFechaTermino.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFechaTermino.setBounds(308, 513, 80, 22);
		add(lblFechaTermino);
		
		lblFechaTerminoCampo = new JLabel("Puesto");
		lblFechaTerminoCampo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaTerminoCampo.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFechaTerminoCampo.setBounds(412, 513, 127, 22);
		add(lblFechaTerminoCampo);
		
		JLabel lblNewLabel_2_1_5_1_1_1_1_1 = new JLabel("Otros Datos");
		lblNewLabel_2_1_5_1_1_1_1_1.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_5_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_1_1_1.setBounds(0, 557, 584, 22);
		add(lblNewLabel_2_1_5_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_5_1_2_1 = new JLabel("Premios");
		lblNewLabel_2_1_5_1_2_1.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_2_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_2_1.setBounds(52, 588, 128, 22);
		add(lblNewLabel_2_1_5_1_2_1);
		
		lblPremios = new JLabel("Categoria");
		lblPremios.setHorizontalAlignment(SwingConstants.LEFT);
		lblPremios.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblPremios.setBounds(166, 588, 373, 22);
		add(lblPremios);
		
		JLabel lblNewLabel_2_1_5_1_2_2 = new JLabel("Reconocimientos");
		lblNewLabel_2_1_5_1_2_2.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_2_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_2_2.setBounds(52, 613, 128, 22);
		add(lblNewLabel_2_1_5_1_2_2);
		
		lblReconocimientos = new JLabel("Categoria");
		lblReconocimientos.setHorizontalAlignment(SwingConstants.LEFT);
		lblReconocimientos.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblReconocimientos.setBounds(166, 613, 373, 22);
		add(lblReconocimientos);
		
		JLabel lblNewLabel_2_1_5_1_2_3 = new JLabel("Logros");
		lblNewLabel_2_1_5_1_2_3.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_2_3.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_2_3.setBounds(52, 637, 128, 22);
		add(lblNewLabel_2_1_5_1_2_3);
		
		lblLogros = new JLabel("Categoria");
		lblLogros.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogros.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblLogros.setBounds(166, 637, 373, 22);
		add(lblLogros);
		
	}
	
	public void CargarForm(SeleccionPersonalEntity spe) {
		
		lblNombres.setText(spe.getNombres());
		lblApellidos.setText(spe.getApellidoPaterno()+" "+spe.getApellidoMaterno());
		lblCurp.setText(spe.getCURP());
		lblNumImss.setText(spe.getNumIMSS());
		lblDomicilio.setText(spe.getDomicilio());
		lblTlfCasoAccidente.setText(spe.getCasoAccion());
		lblEstadoCivil.setText(String.valueOf(spe.getEstadoCivil()));
		lblSexo.setText(String.valueOf(spe.getSexo()));
		lblInstitucion.setText(spe.getInstitucion());
		lblCarrera.setText(spe.getCarrera());
		lblAno.setText(""+spe.getAno());
		lblNombreCompania.setText(spe.getNombreCompania());
		lblAreaOcupaba.setText(spe.getAreaOcupaba());
		lblPuestoAntiguo.setText(spe.getPuestoAntiguo());;
		lblOcupacion.setText(spe.getOcupacion());
		lblJefe.setText(spe.getJefe());
		lblSueldo.setText(""+spe.getSueldo());
		lblTelefono.setText(spe.getTelefono());
		lblFechaIngresoCampos.setText(Helpers.getFechaFormat(spe.getFechaIngreso()));
		lblFechaTerminoCampo.setText(Helpers.getFechaFormat(spe.getFechaTermino()));
		lblPremios.setText(spe.getPremio());
		lblReconocimientos.setText(spe.getReconocimiento());
		lblLogros.setText(spe.getLogros());
		
		
	}
	
	private void lblFechaIngresoCampos(String fechaFormat) {
		// TODO Auto-generated method stub
		
	}

	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		if(pageIndex == 0) {
			Graphics2D graphics2D = (Graphics2D) graphics;
			graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
			printAll(graphics2D);
			return PAGE_EXISTS;	
			
		}else {
			return NO_SUCH_PAGE;
			
		}



	}

	public JLabel getLblNombres() {
		return lblNombres;
	}

	public JLabel getLblApellidos() {
		return lblApellidos;
	}

	public JLabel getLblCurp() {
		return lblCurp;
	}

	public JLabel getLblNumImss() {
		return lblNumImss;
	}

	public JLabel getLblDomicilio() {
		return lblDomicilio;
	}

	public JLabel getLblTlfCasoAccidente() {
		return lblTlfCasoAccidente;
	}

	public JLabel getLblEstadoCivil() {
		return lblEstadoCivil;
	}

	public JLabel getLblSexo() {
		return lblSexo;
	}

	public JLabel getLblAno() {
		return lblAno;
	}

	public JLabel getLblInstitucion() {
		return lblInstitucion;
	}

	public JLabel getLblCarrera() {
		return lblCarrera;
	}

	public JLabel getLblNombreCompania() {
		return lblNombreCompania;
	}

	public JLabel getLblAreaOcupaba() {
		return lblAreaOcupaba;
	}

	public JLabel getLblOcupacion() {
		return lblOcupacion;
	}

	public JLabel getLblJefe() {
		return lblJefe;
	}

	public JLabel getLblSueldo() {
		return lblSueldo;
	}

	public JLabel getLblTelefono() {
		return lblTelefono;
	}

	public JLabel getLblPuestoAntiguo() {
		return lblPuestoAntiguo;
	}

	public JLabel getLblFechaTerminoCampo() {
		return lblFechaTerminoCampo;
	}

	public JLabel getLblPremios() {
		return lblPremios;
	}

	public JLabel getLblReconocimientos() {
		return lblReconocimientos;
	}

	public JLabel getLblLogros() {
		return lblLogros;
	}

	public JLabel getLblFechaIngresoCampos() {
		return lblFechaIngresoCampos;
	}

	public void setLblNombres(JLabel lblNombres) {
		this.lblNombres = lblNombres;
	}

	public void setLblApellidos(JLabel lblApellidos) {
		this.lblApellidos = lblApellidos;
	}

	public void setLblCurp(JLabel lblCurp) {
		this.lblCurp = lblCurp;
	}

	public void setLblNumImss(JLabel lblNumImss) {
		this.lblNumImss = lblNumImss;
	}

	public void setLblDomicilio(JLabel lblDomicilio) {
		this.lblDomicilio = lblDomicilio;
	}

	public void setLblTlfCasoAccidente(JLabel lblTlfCasoAccidente) {
		this.lblTlfCasoAccidente = lblTlfCasoAccidente;
	}

	public void setLblEstadoCivil(JLabel lblEstadoCivil) {
		this.lblEstadoCivil = lblEstadoCivil;
	}

	public void setLblSexo(JLabel lblSexo) {
		this.lblSexo = lblSexo;
	}

	public void setLblAno(JLabel lblAno) {
		this.lblAno = lblAno;
	}

	public void setLblInstitucion(JLabel lblInstitucion) {
		this.lblInstitucion = lblInstitucion;
	}

	public void setLblCarrera(JLabel lblCarrera) {
		this.lblCarrera = lblCarrera;
	}

	public void setLblNombreCompania(JLabel lblNombreCompania) {
		this.lblNombreCompania = lblNombreCompania;
	}

	public void setLblAreaOcupaba(JLabel lblAreaOcupaba) {
		this.lblAreaOcupaba = lblAreaOcupaba;
	}

	public void setLblOcupacion(JLabel lblOcupacion) {
		this.lblOcupacion = lblOcupacion;
	}

	public void setLblJefe(JLabel lblJefe) {
		this.lblJefe = lblJefe;
	}

	public void setLblSueldo(JLabel lblSueldo) {
		this.lblSueldo = lblSueldo;
	}

	public void setLblTelefono(JLabel lblTelefono) {
		this.lblTelefono = lblTelefono;
	}

	public void setLblPuestoAntiguo(JLabel lblPuestoAntiguo) {
		this.lblPuestoAntiguo = lblPuestoAntiguo;
	}

	public void setLblFechaTerminoCampo(JLabel lblFechaTerminoCampo) {
		this.lblFechaTerminoCampo = lblFechaTerminoCampo;
	}

	public void setLblPremios(JLabel lblPremios) {
		this.lblPremios = lblPremios;
	}

	public void setLblReconocimientos(JLabel lblReconocimientos) {
		this.lblReconocimientos = lblReconocimientos;
	}

	public void setLblLogros(JLabel lblLogros) {
		this.lblLogros = lblLogros;
	}

	public void setLblFechaIngresoCampos(JLabel lblFechaIngresoCampos) {
		this.lblFechaIngresoCampos = lblFechaIngresoCampos;
	}
}
