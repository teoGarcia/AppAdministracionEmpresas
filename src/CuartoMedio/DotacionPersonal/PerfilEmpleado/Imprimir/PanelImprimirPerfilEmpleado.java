package CuartoMedio.DotacionPersonal.PerfilEmpleado.Imprimir;

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
import CuartoMedio.DotacionPersonal.PerfilEmpleado.PerfilEmpleadoEntity;
import core.Helpers;

public class PanelImprimirPerfilEmpleado extends JPanel implements Printable{

	private JLabel lblDependencia;
	private JLabel lblCodigo;
	private JLabel lblNivel;
	private JLabel lblSede;
	private JLabel lblGrado;
	private JLabel lblDenominacionEmpleo;
	private JLabel lblCargoJefeInmed;
	private JLabel lblDedicacion;
	private JLabel lblClaseCargo;
	private JLabel lblGrupoOcasional;
	private JEditorPane lblPropositoPrincipal;
	private JEditorPane lblFuncionesEspeciales;
	private JEditorPane lblCriterioDesempenio;
	private JEditorPane lblCriterioDesempeño;
	private JEditorPane lblConocimientosBasicEsenc;
	private JEditorPane lblOrganizacional;
	private JEditorPane lblIndividualesNivelArea;

	/**
	 * Create the panel.
	 */
	public PanelImprimirPerfilEmpleado() {
		// TODO Auto-generated constructor stub
		
		setBackground(Color.WHITE);
		
		setBounds(0, 40, 584, 700);
		setLayout(null);
		JLabel lblNewLabel_2 = new JLabel("Sede");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2.setBounds(52, 115, 93, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Perfil del Empleado");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 60, 584, 33);
		add(lblNewLabel_3);
		
		lblSede = new JLabel("Puesto");
		lblSede.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblSede.setBounds(150, 115, 391, 22);
		add(lblSede);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nivel");
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_2.setBounds(52, 139, 93, 22);
		add(lblNewLabel_2_2);
		
		lblNivel = new JLabel("Puesto");
		lblNivel.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNivel.setBounds(150, 139, 155, 22);
		add(lblNivel);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Denom. del empleo");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_1.setBounds(310, 139, 112, 22);
		add(lblNewLabel_2_1_1);
		
		lblDenominacionEmpleo = new JLabel("Categoria");
		lblDenominacionEmpleo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDenominacionEmpleo.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblDenominacionEmpleo.setBounds(413, 139, 128, 22);
		add(lblDenominacionEmpleo);
		
		JLabel lblNewLabel_2_3 = new JLabel("Codigo");
		lblNewLabel_2_3.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_3.setBounds(52, 163, 93, 22);
		add(lblNewLabel_2_3);
		
		lblCodigo = new JLabel("Puesto");
		lblCodigo.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCodigo.setBounds(150, 163, 155, 22);
		add(lblCodigo);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Grado");
		lblNewLabel_2_1_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_2.setBounds(310, 163, 80, 22);
		add(lblNewLabel_2_1_2);
		
		lblGrado = new JLabel("Categoria");
		lblGrado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGrado.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblGrado.setBounds(413, 163, 128, 22);
		add(lblGrado);
		
		JLabel lblNewLabel_2_4 = new JLabel("Dependencia");
		lblNewLabel_2_4.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_4.setBounds(52, 188, 93, 22);
		add(lblNewLabel_2_4);
		
		lblDependencia = new JLabel("Puesto");
		lblDependencia.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblDependencia.setBounds(150, 188, 155, 22);
		add(lblDependencia);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Cargo Jefe Inmediato");
		lblNewLabel_2_1_3.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_3.setBounds(310, 188, 104, 22);
		add(lblNewLabel_2_1_3);
		
		lblCargoJefeInmed = new JLabel("Categoria");
		lblCargoJefeInmed.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCargoJefeInmed.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCargoJefeInmed.setBounds(413, 188, 128, 22);
		add(lblCargoJefeInmed);
		
		JLabel lblNewLabel_2_5 = new JLabel("Dedicacion");
		lblNewLabel_2_5.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_5.setBounds(52, 213, 93, 22);
		add(lblNewLabel_2_5);
		
		lblDedicacion = new JLabel("Puesto");
		lblDedicacion.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblDedicacion.setBounds(150, 213, 155, 22);
		add(lblDedicacion);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Clase de cargo");
		lblNewLabel_2_1_4.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_4.setBounds(310, 213, 93, 22);
		add(lblNewLabel_2_1_4);
		
		lblClaseCargo = new JLabel("Categoria");
		lblClaseCargo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClaseCargo.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblClaseCargo.setBounds(413, 213, 128, 22);
		add(lblClaseCargo);
		
		JLabel lblNewLabel_2_6 = new JLabel("Grupo Ocasional");
		lblNewLabel_2_6.setToolTipText("Formaci\u00F3n de solicitantes");
		lblNewLabel_2_6.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_6.setBounds(52, 238, 93, 22);
		add(lblNewLabel_2_6);
		
		lblGrupoOcasional = new JLabel("Categoria");
		lblGrupoOcasional.setHorizontalAlignment(SwingConstants.LEFT);
		lblGrupoOcasional.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblGrupoOcasional.setBounds(150, 238, 391, 22);
		add(lblGrupoOcasional);
		
		JLabel lblNewLabel_2_1_5_1_1_1 = new JLabel("II. Prop\u00F3sito principal");
		lblNewLabel_2_1_5_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_5_1_1_1.setToolTipText("");
		lblNewLabel_2_1_5_1_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_1.setBounds(52, 268, 488, 22);
		add(lblNewLabel_2_1_5_1_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(52, 261, 488, 5);
		add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(52, 331, 488, 5);
		add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBounds(52, 331, 488, 5);
		add(separator_2_1);
		
		JLabel lblNewLabel_2_1_5_1_1_1_2 = new JLabel("I. Identificacion del Cargo");
		lblNewLabel_2_1_5_1_1_1_2.setToolTipText("");
		lblNewLabel_2_1_5_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_5_1_1_1_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_1_2.setBounds(52, 93, 488, 22);
		add(lblNewLabel_2_1_5_1_1_1_2);
		
		lblPropositoPrincipal = new JEditorPane();
		lblPropositoPrincipal.setEditable(false);
		lblPropositoPrincipal.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblPropositoPrincipal.setBounds(52, 295, 488, 30);
		add(lblPropositoPrincipal);
		
		JLabel lblNewLabel_2_1_5_1_1_1_1_1 = new JLabel("III. Funciones Especiales");
		lblNewLabel_2_1_5_1_1_1_1_1.setToolTipText("");
		lblNewLabel_2_1_5_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_5_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_1_1_1.setBounds(52, 338, 488, 22);
		add(lblNewLabel_2_1_5_1_1_1_1_1);
		
		lblFuncionesEspeciales = new JEditorPane();
		lblFuncionesEspeciales.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFuncionesEspeciales.setEditable(false);
		lblFuncionesEspeciales.setBounds(52, 365, 490, 30);
		add(lblFuncionesEspeciales);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setForeground(Color.BLACK);
		separator_2_1_1.setBounds(52, 401, 488, 5);
		add(separator_2_1_1);
		
		JLabel lblNewLabel_2_1_5_1_1_1_3 = new JLabel("IV. Criterios de Desempe\u00F1o");
		lblNewLabel_2_1_5_1_1_1_3.setToolTipText("");
		lblNewLabel_2_1_5_1_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_5_1_1_1_3.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_1_3.setBounds(52, 406, 488, 22);
		add(lblNewLabel_2_1_5_1_1_1_3);
		
		lblCriterioDesempenio = new JEditorPane();
		lblCriterioDesempenio.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCriterioDesempenio.setBounds(52, 433, 488, 30);
		add(lblCriterioDesempenio);

		lblCriterioDesempeño = new JEditorPane();
		lblCriterioDesempeño.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblCriterioDesempeño.setBounds(52, 433, 488, 30);
		add(lblCriterioDesempeño);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setForeground(Color.BLACK);
		separator_2_2.setBounds(52, 469, 488, 5);
		add(separator_2_2);
		
		JLabel lblNewLabel_2_1_5_1_1_1_1_2 = new JLabel("V. Conocimientos Basicos o Esenciales");
		lblNewLabel_2_1_5_1_1_1_1_2.setToolTipText("");
		lblNewLabel_2_1_5_1_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_5_1_1_1_1_2.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_1_1_2.setBounds(52, 476, 488, 22);
		add(lblNewLabel_2_1_5_1_1_1_1_2);
		
		lblConocimientosBasicEsenc = new JEditorPane();
		lblConocimientosBasicEsenc.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblConocimientosBasicEsenc.setEditable(false);
		lblConocimientosBasicEsenc.setBounds(52, 503, 490, 30);
		add(lblConocimientosBasicEsenc);
		
		JSeparator separator_2_1_2 = new JSeparator();
		separator_2_1_2.setForeground(Color.BLACK);
		separator_2_1_2.setBounds(52, 539, 488, 5);
		add(separator_2_1_2);
		
		JLabel lblNewLabel_2_1_5_1_1_1_1_1_1 = new JLabel("VI. Competencias");
		lblNewLabel_2_1_5_1_1_1_1_1_1.setToolTipText("");
		lblNewLabel_2_1_5_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_5_1_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 10));
		lblNewLabel_2_1_5_1_1_1_1_1_1.setBounds(52, 546, 488, 22);
		add(lblNewLabel_2_1_5_1_1_1_1_1_1);
		
		lblOrganizacional = new JEditorPane();
		lblOrganizacional.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblOrganizacional.setEditable(false);
		lblOrganizacional.setBounds(52, 581, 228, 38);
		add(lblOrganizacional);
		
		lblIndividualesNivelArea = new JEditorPane();
		lblIndividualesNivelArea.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblIndividualesNivelArea.setEditable(false);
		lblIndividualesNivelArea.setBounds(313, 581, 228, 38);
		add(lblIndividualesNivelArea);
		
		JLabel lblIndividualesNivel = new JLabel("Individuales Nivel - Area");
		lblIndividualesNivel.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndividualesNivel.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblIndividualesNivel.setBounds(356, 567, 155, 14);
		add(lblIndividualesNivel);
		
		JLabel lblOrganizacionales = new JLabel("Organizacional");
		lblOrganizacionales.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrganizacionales.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblOrganizacionales.setBounds(87, 567, 155, 14);
		add(lblOrganizacionales);
		
	}
	
	public void CargarForm(PerfilEmpleadoEntity ape) {
		
		lblSede.setText(ape.getSede());
		lblNivel.setText(ape.getNivel());
		lblDenominacionEmpleo.setText(ape.getDenominacionEmpleo());
		lblCodigo.setText(ape.getCodigo());
		lblGrado.setText(String.valueOf(ape.getGrado()));
		lblDependencia.setText(ape.getDependencia());
		lblCargoJefeInmed.setText(ape.getCargoJefeInmediato());
		lblDedicacion.setText(ape.getDedicacion());
		lblClaseCargo.setText(ape.getClaseCargo());
		lblGrupoOcasional.setText(ape.getGrupoOcasional());
		lblPropositoPrincipal.setText(ape.getPropositoPrincipal());
		lblFuncionesEspeciales.setText(ape.getFuncionesEsenciales());
		lblCriterioDesempenio.setText(ape.getCriteriosDesempenio());
		lblConocimientosBasicEsenc.setText(ape.getConocimientosBasicos());
		lblOrganizacional.setText(ape.getOrganizacionales());
		lblIndividualesNivelArea.setText(ape.getIndividuales());
		
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
}
