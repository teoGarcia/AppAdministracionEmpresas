package TerceroMedio.ProcesosAdministrativos.CartaGantt;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import ui.Buttons.StandarButton;
import ui.Labels.LabelSubtitulos;
import ui.Labels.LabelTitulos;
import ui.TablaUi.TableStandard;

public class VistaCartaGantt extends JPanel {

		private Long id;
		private JTextField txtActividad;
		private JTextField txtResponsable;
		private JTextField txtProyecto;
		private TableStandard table;
		private StandarButton btnGuardar;
		private StandarButton btnModificar;
		private StandarButton btnEliminar;
		private ControlCartaGantt control;
		private JDateChooser fechaI;
		private JDateChooser fechaT;
		private StandarButton btnImprimir;
		

		/**
		 * Create the panel.
		 */
		public VistaCartaGantt() {
			
			setBounds(0, 0, 722, 740);
			setOpaque(false);
			setLayout(null);
			
			control = new ControlCartaGantt(this);
			
			LabelTitulos lbltlsCartaGantt = new LabelTitulos((String) null);
			lbltlsCartaGantt.setHorizontalAlignment(SwingConstants.CENTER);
			lbltlsCartaGantt.setText("Carta Gantt");
			lbltlsCartaGantt.setBounds(0, 60, 722, 30);
			add(lbltlsCartaGantt);
			
			LabelSubtitulos lblsbtlsProyecto = new LabelSubtitulos((String) null);
			lblsbtlsProyecto.setText("Proyecto");
			lblsbtlsProyecto.setBounds(55, 129, 102, 23);
			add(lblsbtlsProyecto);
			
			txtProyecto = new JTextField();
			txtProyecto.setBounds(167, 130, 510, 22);
			add(txtProyecto);
			
			LabelSubtitulos lblsbtlsActividad = new LabelSubtitulos((String) null);
			lblsbtlsActividad.setText("Actividad");
			lblsbtlsActividad.setBounds(55, 183, 102, 23);
			add(lblsbtlsActividad);
			
			txtActividad = new JTextField();
			txtActividad.setBounds(167, 185, 185, 23);
			add(txtActividad);
			txtActividad.setColumns(10);
			
			LabelSubtitulos lblsbtlsResponsable = new LabelSubtitulos((String) null);
			lblsbtlsResponsable.setText("Responsable");
			lblsbtlsResponsable.setBounds(380, 183, 102, 23);
			add(lblsbtlsResponsable);
			
			txtResponsable = new JTextField();
			txtResponsable.setColumns(10);
			txtResponsable.setBounds(492, 185, 185, 23);
			add(txtResponsable);
			
			LabelSubtitulos lblsbtlsFechaInicio = new LabelSubtitulos((String) null);
			lblsbtlsFechaInicio.setText("Fecha Inicio");
			lblsbtlsFechaInicio.setBounds(55, 234, 102, 23);
			add(lblsbtlsFechaInicio);
			
			LabelSubtitulos lblsbtlsFechaTermino = new LabelSubtitulos((String) null);
			lblsbtlsFechaTermino.setText("Fecha Termino");
			lblsbtlsFechaTermino.setBounds(380, 234, 102, 23);
			add(lblsbtlsFechaTermino);
			
			fechaI = new JDateChooser();
			fechaI.setBounds(167, 237, 185, 23);
			add(fechaI);
			
			fechaT = new JDateChooser();
			fechaT.setBounds(492, 237, 185, 23);
			add(fechaT);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(55, 332, 621, 338);
			add(scrollPane);
			
			table = new TableStandard();
			String[] columns = new String[] {"Id", "Proyecto", "Actividad", "Responsable", "Fecha Inicio",  "Fecha terminado"};
			table.setColums(columns);
			
			table.getColumnModel().getColumn(0).setPreferredWidth(40);
			table.getColumnModel().getColumn(1).setPreferredWidth(150);
			table.getColumnModel().getColumn(2).setPreferredWidth(150);
			table.getColumnModel().getColumn(3).setPreferredWidth(100);
			table.getColumnModel().getColumn(4).setPreferredWidth(90);
			table.getColumnModel().getColumn(5).setPreferredWidth(90);
			
			scrollPane.setViewportView(table);
			
			btnGuardar = new StandarButton((String) null);
			btnGuardar.setText("Guardar");
			btnGuardar.setBounds(577, 280, 100, 30);
			btnGuardar.addActionListener(control);
			add(btnGuardar);
			
			btnModificar = new StandarButton((String) null);
			btnModificar.setText("Modificar");
			btnModificar.setBounds(55, 681, 111, 30);
			btnModificar.addActionListener(control);
			add(btnModificar);
			
			btnEliminar = new StandarButton((String) null);
			btnEliminar.setText("Eliminar");
			btnEliminar.setBounds(176, 681, 111, 30);
			btnEliminar.addActionListener(control);
			add(btnEliminar);
			
			btnImprimir = new StandarButton((String) null);
			btnImprimir.setText("Imprimir");
			btnImprimir.setBounds(297, 681, 111, 30);
			btnImprimir.addActionListener(control);
			add(btnImprimir);

			ActualizarVista();
		}
		
		
		public void ActualizarVista() {
			VaciarForm();
			control.LlenarTabla();
		}
		
		public void CargarForm(CartaGantt3 record) {
			txtProyecto.setText(record.getProyecto());
			txtActividad.setText(record.getActividad());
			txtResponsable.setText(record.getResponsable());
			fechaI.setCalendar(record.getFechaI());
			fechaT.setCalendar(record.getFechaT());
			setId(record.getId());
		}
		
		public void VaciarForm() {
			txtProyecto.setText("");
			txtActividad.setText("");
			txtResponsable.setText("");
			fechaI.setCalendar(null);
			fechaT.setCalendar(null);
			setId(0L);
		}
		
		public boolean camposVacios() {
			
			if(txtProyecto.getText().length() <= 0 || 
				txtActividad.getText().length() <= 0  || 
				txtResponsable.getText().length() <= 0 || 
				fechaI.getCalendar() == null || 
				fechaT.getCalendar() == null) {
				return false;
			}
			
			return true;
		}
		
		public DefaultTableModel getModel() {
			return table.getModel();
		}


		public JTextField getTxtActividad() {
			return txtActividad;
		}


		public void setTxtActividad(JTextField txtActividad) {
			this.txtActividad = txtActividad;
		}


		public JTextField getTxtResponsable() {
			return txtResponsable;
		}


		public void setTxtResponsable(JTextField txtResponsable) {
			this.txtResponsable = txtResponsable;
		}


		public JTextField getTxtProyecto() {
			return txtProyecto;
		}


		public void setTxtProyecto(JTextField txtProyecto) {
			this.txtProyecto = txtProyecto;
		}


		public TableStandard getTable() {
			return table;
		}


		public void setTable(TableStandard table) {
			this.table = table;
		}


		public StandarButton getBtnGuardar() {
			return btnGuardar;
		}


		public void setBtnGuardar(StandarButton btnGuardar) {
			this.btnGuardar = btnGuardar;
		}


		public StandarButton getBtnModificar() {
			return btnModificar;
		}


		public void setBtnModificar(StandarButton btnModificar) {
			this.btnModificar = btnModificar;
		}


		public StandarButton getBtnEliminar() {
			return btnEliminar;
		}


		public void setBtnEliminar(StandarButton btnEliminar) {
			this.btnEliminar = btnEliminar;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public JDateChooser getFechaI() {
			return fechaI;
		}

		public void setFechaI(JDateChooser fechaI) {
			this.fechaI = fechaI;
		}

		public JDateChooser getFechaT() {
			return fechaT;
		}

		public void setFechaT(JDateChooser fechaT) {
			this.fechaT = fechaT;
		}


		public StandarButton getBtnImprimir() {
			return btnImprimir;
		}


		public void setBtnImprimir(StandarButton btnImprimir) {
			this.btnImprimir = btnImprimir;
		}

}
