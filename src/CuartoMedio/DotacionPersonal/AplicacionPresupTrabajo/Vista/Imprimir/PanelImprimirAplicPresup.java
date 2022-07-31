package CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.VistaAplicacionPresupuesto;
import core.Helpers;

import javax.swing.JEditorPane;

public class PanelImprimirAplicPresup extends JPanel implements Printable{
	

	private VistaAplicacionPresupuesto vap;
	
	private JLabel lblRangoSalario;
	private JLabel lblUbicacion;
	private JLabel lblDptoGrupo;
	private JLabel lblPuesto;
	private JLabel lblViajar;
	private JLabel lblCodPuesto;
	private JLabel lblCategoria;
	private JLabel lblTipoPosicion;
	private JLabel lblFormSolicitud;
	private JLabel lblRRHH;
	private JLabel lblFechaPublic;
	private JLabel lblURLExt;
	private JLabel lblURLInt;
	private JLabel lblFechaExpPublic;
	private JLabel lblNombreEmpresa;
	private JLabel lblDireccion;
	private JLabel lblFaxCorreo;
	private JLabel lblCodPostal;
	private JEditorPane lblRolResponsab;
	private JLabel lblRequCualForm;
	private JLabel lblAptitudesDeseables;
	private JLabel lblNotasAdicionales;
	private JLabel lblRevisadoPor;
	private JLabel lblAprobadoPor;
	private JLabel lblFechaRevisado;
	private JLabel lblFechaAprob;

	/**
	 * Create the panel.
	 */
	public PanelImprimirAplicPresup() {
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		JLabel lblNewLabel_2 = new JLabel("Puesto:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2.setBounds(53, 125, 93, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Aplicacion de puesto de trabajo");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 70, 584, 33);
		add(lblNewLabel_3);
		
		lblPuesto = new JLabel("Puesto");
		lblPuesto.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblPuesto.setBounds(149, 125, 155, 22);
		add(lblPuesto);
		
		JLabel lblNewLabel_2_1 = new JLabel("Categor\u00EDa:");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1.setBounds(309, 125, 80, 22);
		add(lblNewLabel_2_1);
		
		lblCategoria = new JLabel("Categoria");
		lblCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategoria.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCategoria.setBounds(386, 125, 154, 22);
		add(lblCategoria);
		
		JLabel lblNewLabel_2_2 = new JLabel("Dpto. o Grupo");
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_2.setBounds(53, 149, 93, 22);
		add(lblNewLabel_2_2);
		
		lblDptoGrupo = new JLabel("Puesto");
		lblDptoGrupo.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblDptoGrupo.setBounds(149, 149, 155, 22);
		add(lblDptoGrupo);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("C\u00F3d. puesto");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_1.setBounds(309, 149, 80, 22);
		add(lblNewLabel_2_1_1);
		
		lblCodPuesto = new JLabel("Categoria");
		lblCodPuesto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodPuesto.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCodPuesto.setBounds(386, 149, 154, 22);
		add(lblCodPuesto);
		
		JLabel lblNewLabel_2_3 = new JLabel("Ubicaci\u00F3n");
		lblNewLabel_2_3.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_3.setBounds(53, 173, 93, 22);
		add(lblNewLabel_2_3);
		
		lblUbicacion = new JLabel("Puesto");
		lblUbicacion.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblUbicacion.setBounds(149, 173, 155, 22);
		add(lblUbicacion);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Viajar");
		lblNewLabel_2_1_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_2.setBounds(309, 173, 80, 22);
		add(lblNewLabel_2_1_2);
		
		lblViajar = new JLabel("Categoria");
		lblViajar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblViajar.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblViajar.setBounds(386, 173, 154, 22);
		add(lblViajar);
		
		JLabel lblNewLabel_2_4 = new JLabel("Rango Salario");
		lblNewLabel_2_4.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_4.setBounds(53, 198, 93, 22);
		add(lblNewLabel_2_4);
		
		lblRangoSalario = new JLabel("Puesto");
		lblRangoSalario.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblRangoSalario.setBounds(149, 198, 155, 22);
		add(lblRangoSalario);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Tipo Posici\u00F3n");
		lblNewLabel_2_1_3.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_3.setBounds(309, 198, 80, 22);
		add(lblNewLabel_2_1_3);
		
		lblTipoPosicion = new JLabel("Categoria");
		lblTipoPosicion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoPosicion.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblTipoPosicion.setBounds(386, 198, 154, 22);
		add(lblTipoPosicion);
		
		JLabel lblNewLabel_2_5 = new JLabel("Contacto RRHH");
		lblNewLabel_2_5.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_5.setBounds(53, 223, 93, 22);
		add(lblNewLabel_2_5);
		
		lblRRHH = new JLabel("Puesto");
		lblRRHH.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblRRHH.setBounds(149, 223, 155, 22);
		add(lblRRHH);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Fecha Public.");
		lblNewLabel_2_1_4.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_4.setBounds(309, 223, 80, 22);
		add(lblNewLabel_2_1_4);
		
		lblFechaPublic = new JLabel("Categoria");
		lblFechaPublic.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaPublic.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFechaPublic.setBounds(386, 223, 154, 22);
		add(lblFechaPublic);
		
		JLabel lblNewLabel_2_6 = new JLabel("Form. de Solicit.");
		lblNewLabel_2_6.setToolTipText("Formaci\u00F3n de solicitantes");
		lblNewLabel_2_6.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_6.setBounds(53, 248, 93, 22);
		add(lblNewLabel_2_6);
		
		lblFormSolicitud = new JLabel("Formato solicitud");
		lblFormSolicitud.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFormSolicitud.setBounds(149, 248, 155, 22);
		add(lblFormSolicitud);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Exp. Public.");
		lblNewLabel_2_1_5.setToolTipText("Expiracion de la Publicacion");
		lblNewLabel_2_1_5.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5.setBounds(309, 248, 80, 22);
		add(lblNewLabel_2_1_5);
		
		lblFechaExpPublic = new JLabel("Categoria");
		lblFechaExpPublic.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaExpPublic.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFechaExpPublic.setBounds(386, 248, 154, 22);
		add(lblFechaExpPublic);
		
		JLabel lblNewLabel_2_1_5_1 = new JLabel("URL de publicaci\u00F3n externa");
		lblNewLabel_2_1_5_1.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1.setBounds(53, 273, 147, 22);
		add(lblNewLabel_2_1_5_1);
		
		lblURLExt = new JLabel("Categoria");
		lblURLExt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblURLExt.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblURLExt.setBounds(210, 273, 330, 22);
		add(lblURLExt);
		
		JLabel lblNewLabel_2_1_5_1_1 = new JLabel("URL de publicaci\u00F3n interna");
		lblNewLabel_2_1_5_1_1.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1.setBounds(53, 298, 147, 22);
		add(lblNewLabel_2_1_5_1_1);
		
		lblURLInt = new JLabel("Categoria");
		lblURLInt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblURLInt.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblURLInt.setBounds(210, 298, 330, 22);
		add(lblURLInt);
		
		JLabel lblNewLabel_2_1_5_1_1_1 = new JLabel("Solicitudes aceptadas por");
		lblNewLabel_2_1_5_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_5_1_1_1.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_1.setBounds(0, 335, 584, 22);
		add(lblNewLabel_2_1_5_1_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(53, 325, 488, 5);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(53, 331, 488, 5);
		add(separator_1);
		
		JLabel lblNewLabel_2_7 = new JLabel("Fax o Correo");
		lblNewLabel_2_7.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_7.setBounds(53, 384, 93, 22);
		add(lblNewLabel_2_7);
		
		lblFaxCorreo = new JLabel("Puesto");
		lblFaxCorreo.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFaxCorreo.setBounds(149, 384, 155, 22);
		add(lblFaxCorreo);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("C\u00F3d. Postal");
		lblNewLabel_2_1_6.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_6.setBounds(309, 384, 80, 22);
		add(lblNewLabel_2_1_6);
		
		lblCodPostal = new JLabel("Categoria");
		lblCodPostal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodPostal.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCodPostal.setBounds(386, 384, 154, 22);
		add(lblCodPostal);
		
		JLabel lblNewLabel_2_7_1 = new JLabel("Nombre Empresa");
		lblNewLabel_2_7_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_7_1.setBounds(53, 360, 93, 22);
		add(lblNewLabel_2_7_1);
		
		lblNombreEmpresa = new JLabel("Puesto");
		lblNombreEmpresa.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNombreEmpresa.setBounds(149, 360, 155, 22);
		add(lblNombreEmpresa);
		
		JLabel lblNewLabel_2_1_6_1 = new JLabel("Direcci\u00F3n");
		lblNewLabel_2_1_6_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_6_1.setBounds(309, 360, 80, 22);
		add(lblNewLabel_2_1_6_1);
		
		lblDireccion = new JLabel("Categoria");
		lblDireccion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccion.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblDireccion.setBounds(386, 360, 154, 22);
		add(lblDireccion);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(53, 406, 488, 5);
		add(separator_2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(53, 412, 488, 5);
		add(separator_1_1);
		
		JLabel lblNewLabel_2_1_5_1_1_1_1 = new JLabel("Descripcion del puesto");
		lblNewLabel_2_1_5_1_1_1_1.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_5_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_1_1.setBounds(0, 416, 584, 22);
		add(lblNewLabel_2_1_5_1_1_1_1);
		
		JLabel lblNewLabel_2_7_1_1 = new JLabel("Rol y responsabilidades");
		lblNewLabel_2_7_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_7_1_1.setBounds(53, 438, 128, 22);
		add(lblNewLabel_2_7_1_1);
		
		lblRolResponsab = new JEditorPane();
		lblRolResponsab.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblRolResponsab.setEditable(false);
		lblRolResponsab.setBounds(51, 456, 490, 50);
		add(lblRolResponsab);
		
		JLabel lblNewLabel_2_1_5_1_2 = new JLabel("Requisitos de cualificacion y formaci\u00F3n");
		lblNewLabel_2_1_5_1_2.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_2.setBounds(53, 504, 200, 22);
		add(lblNewLabel_2_1_5_1_2);
		
		lblRequCualForm = new JLabel("Categoria");
		lblRequCualForm.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRequCualForm.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblRequCualForm.setBounds(251, 504, 289, 22);
		add(lblRequCualForm);
		
		JLabel lblNewLabel_2_1_5_1_1_2 = new JLabel("Aptitudes Deseables");
		lblNewLabel_2_1_5_1_1_2.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_1_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_2.setBounds(53, 529, 147, 22);
		add(lblNewLabel_2_1_5_1_1_2);
		
		lblAptitudesDeseables = new JLabel("Categoria");
		lblAptitudesDeseables.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAptitudesDeseables.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAptitudesDeseables.setBounds(251, 529, 289, 22);
		add(lblAptitudesDeseables);
		
		JLabel lblNewLabel_2_1_5_1_1_2_1 = new JLabel("Notas Adicionales");
		lblNewLabel_2_1_5_1_1_2_1.setToolTipText("Expiracion Publicacion");
		lblNewLabel_2_1_5_1_1_2_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_2_1.setBounds(53, 554, 147, 22);
		add(lblNewLabel_2_1_5_1_1_2_1);
		
		lblNotasAdicionales = new JLabel("Categoria");
		lblNotasAdicionales.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNotasAdicionales.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNotasAdicionales.setBounds(251, 554, 289, 22);
		add(lblNotasAdicionales);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBounds(53, 576, 488, 5);
		add(separator_2_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1.setBounds(53, 582, 488, 5);
		add(separator_1_1_1);
		
		JLabel lblNewLabel_2_7_2 = new JLabel("Revisado Por");
		lblNewLabel_2_7_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_7_2.setBounds(53, 587, 93, 22);
		add(lblNewLabel_2_7_2);
		
		lblRevisadoPor = new JLabel("Puesto");
		lblRevisadoPor.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblRevisadoPor.setBounds(149, 587, 155, 22);
		add(lblRevisadoPor);
		
		JLabel FechaRevisado = new JLabel("Fecha Revisado");
		FechaRevisado.setFont(new Font("Dialog", Font.BOLD, 10));
		FechaRevisado.setBounds(309, 587, 80, 22);
		add(FechaRevisado);
		
		lblFechaRevisado = new JLabel("Categoria");
		lblFechaRevisado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaRevisado.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFechaRevisado.setBounds(386, 587, 154, 22);
		add(lblFechaRevisado);
		
		JLabel lblNewLabel_2_7_3 = new JLabel("Aprobado Por");
		lblNewLabel_2_7_3.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_7_3.setBounds(53, 611, 93, 22);
		add(lblNewLabel_2_7_3);
		
		lblAprobadoPor = new JLabel("Puesto");
		lblAprobadoPor.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAprobadoPor.setBounds(149, 611, 155, 22);
		add(lblAprobadoPor);
		
		JLabel lblFechaAprobado = new JLabel("Fecha Aprobado");
		lblFechaAprobado.setFont(new Font("Dialog", Font.BOLD, 10));
		lblFechaAprobado.setBounds(309, 611, 80, 22);
		add(lblFechaAprobado);
		
		lblFechaAprob = new JLabel("Categoria");
		lblFechaAprob.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaAprob.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFechaAprob.setBounds(386, 611, 154, 22);
		add(lblFechaAprob);
		
	}
	
	public void CargarForm(AplicacionPresupuestoEntity ape) {
		
		lblPuesto.setText(ape.getPuesto());
		lblCategoria.setText(ape.getCategoria());
		lblDptoGrupo.setText(ape.getDptoGrupo());
		lblCodPuesto.setText(ape.getCodPuesto());
		lblUbicacion.setText(ape.getUbicacion());
		lblViajar.setText(String.valueOf(ape.getNecesarioViajar()));
		lblRangoSalario.setText(ape.getRangoSalario());
		lblTipoPosicion.setText(String.valueOf(ape.getTipoPosicion()));
		lblRRHH.setText(ape.getContactoRRHH());
		lblFechaPublic.setText(Helpers.getFechaFormat(ape.getFechaPublicacion()));
		lblFormSolicitud.setText(ape.getFormatoSolicitud());
		lblFechaExpPublic.setText(Helpers.getFechaFormat(ape.getFechaExpiracion()));
		lblURLExt.setText(ape.getURLExt());
		lblURLInt.setText(ape.getURLInt());
		lblNombreEmpresa.setText(ape.getNombreEmpresa());
		lblDireccion.setText(ape.getDireccion());
		lblFaxCorreo.setText(ape.getFaxCorreo());
		lblCodPostal.setText(ape.getCodigoPostal());
		lblRolResponsab.setText(ape.getRolResponsabilidad());
		lblRequCualForm.setText(ape.getRequisitosCualifFormacion());
		lblAptitudesDeseables.setText(ape.getAptitudesDeseables());
		lblNotasAdicionales.setText(ape.getNotasAdicionales());
		lblRevisadoPor.setText(ape.getRevisadoPor());
		lblAprobadoPor.setText(ape.getAprobadoPor());
		lblFechaRevisado.setText(Helpers.getFechaFormat(ape.getFechaRevisado()));
		lblFechaAprob.setText(Helpers.getFechaFormat(ape.getFechaAprobado()));
		
		
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

	public JLabel getLblRangoSalario() {
		return lblRangoSalario;
	}

	public JLabel getLblUbicacion() {
		return lblUbicacion;
	}

	public JLabel getLblDptoGrupo() {
		return lblDptoGrupo;
	}

	public JLabel getLblPuesto() {
		return lblPuesto;
	}

	public JLabel getLblViajar() {
		return lblViajar;
	}

	public JLabel getLblCodPuesto() {
		return lblCodPuesto;
	}

	public JLabel getLblCategoria() {
		return lblCategoria;
	}

	public JLabel getLblTipoPosicion() {
		return lblTipoPosicion;
	}

	public JLabel getLblFormSolicitud() {
		return lblFormSolicitud;
	}

	public JLabel getLblRRHH() {
		return lblRRHH;
	}

	public JLabel getLblFechaPublic() {
		return lblFechaPublic;
	}

	public void setLblRangoSalario(JLabel lblRangoSalario) {
		this.lblRangoSalario = lblRangoSalario;
	}

	public void setLblUbicacion(JLabel lblUbicacion) {
		this.lblUbicacion = lblUbicacion;
	}

	public void setLblDptoGrupo(JLabel lblDptoGrupo) {
		this.lblDptoGrupo = lblDptoGrupo;
	}

	public void setLblPuesto(JLabel lblPuesto) {
		this.lblPuesto = lblPuesto;
	}

	public void setLblViajar(JLabel lblViajar) {
		this.lblViajar = lblViajar;
	}

	public void setLblCodPuesto(JLabel lblCodPuesto) {
		this.lblCodPuesto = lblCodPuesto;
	}

	public void setLblCategoria(JLabel lblCategoria) {
		this.lblCategoria = lblCategoria;
	}

	public void setLblTipoPosicion(JLabel lblTipoPosicion) {
		this.lblTipoPosicion = lblTipoPosicion;
	}

	public void setLblFormSolicitud(JLabel lblFormSolicitud) {
		this.lblFormSolicitud = lblFormSolicitud;
	}

	public void setLblRRHH(JLabel lblRRHH) {
		this.lblRRHH = lblRRHH;
	}

	public void setLblFechaPublic(JLabel lblFechaPublic) {
		this.lblFechaPublic = lblFechaPublic;
	}

	public JLabel getLblURLExt() {
		return lblURLExt;
	}

	public JLabel getLblURLInt() {
		return lblURLInt;
	}

	public JLabel getLblFechaExpPublic() {
		return lblFechaExpPublic;
	}

	public JLabel getLblNombreEmpresa() {
		return lblNombreEmpresa;
	}

	public JLabel getLblDireccion() {
		return lblDireccion;
	}

	public JLabel getLblFaxCorreo() {
		return lblFaxCorreo;
	}

	public JLabel getLblCodPostal() {
		return lblCodPostal;
	}

	public JEditorPane getLblRolResponsab() {
		return lblRolResponsab;
	}

	public void setLblURLExt(JLabel lblURLExt) {
		this.lblURLExt = lblURLExt;
	}

	public void setLblURLInt(JLabel lblURLInt) {
		this.lblURLInt = lblURLInt;
	}

	public void setLblFechaExpPublic(JLabel lblFechaExpPublic) {
		this.lblFechaExpPublic = lblFechaExpPublic;
	}

	public void setLblNombreEmpresa(JLabel lblNombreEmpresa) {
		this.lblNombreEmpresa = lblNombreEmpresa;
	}

	public void setLblDireccion(JLabel lblDireccion) {
		this.lblDireccion = lblDireccion;
	}

	public void setLblFaxCorreo(JLabel lblFaxCorreo) {
		this.lblFaxCorreo = lblFaxCorreo;
	}

	public void setLblCodPostal(JLabel lblCodPostal) {
		this.lblCodPostal = lblCodPostal;
	}

	public void setLblRolResponsab(JEditorPane lblRolResponsab) {
		this.lblRolResponsab = lblRolResponsab;
	}

	public JLabel getLblRequCualForm() {
		return lblRequCualForm;
	}

	public JLabel getLblAptitudesDeseables() {
		return lblAptitudesDeseables;
	}

	public JLabel getLblNotasAdicionales() {
		return lblNotasAdicionales;
	}

	public JLabel getLblRevisadoPor() {
		return lblRevisadoPor;
	}

	public JLabel getLblAprobadoPor() {
		return lblAprobadoPor;
	}

	public JLabel getLblFechaRevisado() {
		return lblFechaRevisado;
	}

	public JLabel getLblFechaAprob() {
		return lblFechaAprob;
	}

	public void setLblRequCualForm(JLabel lblRequCualForm) {
		this.lblRequCualForm = lblRequCualForm;
	}

	public void setLblAptitudesDeseables(JLabel lblAptitudesDeseables) {
		this.lblAptitudesDeseables = lblAptitudesDeseables;
	}

	public void setLblNotasAdicionales(JLabel lblNotasAdicionales) {
		this.lblNotasAdicionales = lblNotasAdicionales;
	}

	public void setLblRevisadoPor(JLabel lblRevisadoPor) {
		this.lblRevisadoPor = lblRevisadoPor;
	}

	public void setLblAprobadoPor(JLabel lblAprobadoPor) {
		this.lblAprobadoPor = lblAprobadoPor;
	}

	public void setLblFechaRevisado(JLabel lblFechaRevisado) {
		this.lblFechaRevisado = lblFechaRevisado;
	}

	public void setLblFechaAprob(JLabel lblFechaAprob) {
		this.lblFechaAprob = lblFechaAprob;
	}
}
