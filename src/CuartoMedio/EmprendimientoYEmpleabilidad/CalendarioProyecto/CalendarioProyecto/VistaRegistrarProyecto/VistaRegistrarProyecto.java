package CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto;

import javax.swing.JPanel;
import ui.Labels.LabelTitulos;
import javax.swing.SwingConstants;
import ui.Labels.LabelSubtitulos;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import ui.Buttons.StandarButton;

public class VistaRegistrarProyecto extends JPanel {
	private JTextField txtNomPro;
	private JTextField txtDiaPla;

	/**
	 * Create the panel.
	 */
	public VistaRegistrarProyecto() {
		
		setBounds(0, 0, 722, 740);
		setOpaque(false);
		setLayout(null);
		
		LabelTitulos lbltlsRegistrarProyecto = new LabelTitulos((String) null);
		lbltlsRegistrarProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsRegistrarProyecto.setText("Registrar Proyecto");
		lbltlsRegistrarProyecto.setBounds(0, 60, 722, 30);
		add(lbltlsRegistrarProyecto);
		
		LabelSubtitulos lblsbtlsNombreDelProyecto = new LabelSubtitulos((String) null);
		lblsbtlsNombreDelProyecto.setText("Nombre del Proyecto");
		lblsbtlsNombreDelProyecto.setBounds(171, 180, 165, 23);
		add(lblsbtlsNombreDelProyecto);
		
		LabelSubtitulos lblsbtlsFechaInicio = new LabelSubtitulos((String) null);
		lblsbtlsFechaInicio.setText("Fecha Inicio");
		lblsbtlsFechaInicio.setBounds(171, 240, 165, 23);
		add(lblsbtlsFechaInicio);
		
		LabelSubtitulos lblsbtlsFechaFinal = new LabelSubtitulos((String) null);
		lblsbtlsFechaFinal.setText("Fecha Final");
		lblsbtlsFechaFinal.setBounds(171, 304, 165, 23);
		add(lblsbtlsFechaFinal);
		
		LabelSubtitulos lblsbtlsNombreDelProyecto_1_1 = new LabelSubtitulos((String) null);
		lblsbtlsNombreDelProyecto_1_1.setText("Dias Planeados");
		lblsbtlsNombreDelProyecto_1_1.setBounds(171, 365, 165, 23);
		add(lblsbtlsNombreDelProyecto_1_1);
		
		JDateChooser dateInicio = new JDateChooser();
		dateInicio.setBounds(370, 243, 160, 23);
		add(dateInicio);
		
		JDateChooser dateFin = new JDateChooser();
		dateFin.setBounds(370, 304, 160, 23);
		add(dateFin);
		
		txtNomPro = new JTextField();
		txtNomPro.setBounds(370, 180, 260, 23);
		add(txtNomPro);
		txtNomPro.setColumns(10);
		
		txtDiaPla = new JTextField();
		txtDiaPla.setBounds(370, 367, 160, 23);
		add(txtDiaPla);
		txtDiaPla.setColumns(10);
		
		StandarButton stndrbtnGuardar = new StandarButton((String) null);
		stndrbtnGuardar.setText("Guardar");
		stndrbtnGuardar.setBounds(305, 487, 120, 30);
		add(stndrbtnGuardar);

	}
}
