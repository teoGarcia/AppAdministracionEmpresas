package ui.userUI.list;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import ui.Labels.LabelTitulos;
import javax.swing.SwingConstants;
import java.awt.Color;
import ui.Buttons.StandarButton;

public class VistaUsuarios extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private final LabelTitulos lbltlsListadoDeUsuarios = new LabelTitulos((String) null);
	private DefaultTableModel model = new DefaultTableModel();
	private ControlUsuarios cu;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaUsuarios frame = new VistaUsuarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaUsuarios() {
		
		cu = new ControlUsuarios(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(54, 54, 54));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 86, 565, 200);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model.addColumn("Apellidos");
		model.addColumn("Nombres");
		model.addColumn("Seccion");
		table.setBounds(0, 0, 1, 1);
		
		
		scrollPane.setViewportView(table);
		lbltlsListadoDeUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lbltlsListadoDeUsuarios.setText("Listado de Usuarios");
		lbltlsListadoDeUsuarios.setBounds(0, 30, 584, 30);
		contentPane.add(lbltlsListadoDeUsuarios);
		
		StandarButton stndrbtnRegistrar = new StandarButton((String) null);
		stndrbtnRegistrar.setText("Agg. Nuevo Usuario");
		stndrbtnRegistrar.setBounds(10, 308, 143, 31);
		contentPane.add(stndrbtnRegistrar);
		
		StandarButton stndrbtnModificar = new StandarButton((String) null);
		stndrbtnModificar.setText("Modificar");
		stndrbtnModificar.setBounds(170, 308, 120, 31);
		contentPane.add(stndrbtnModificar);
		
		StandarButton stndrbtnEliminar = new StandarButton((String) null);
		stndrbtnEliminar.setText("Eliminar");
		stndrbtnEliminar.setBounds(308, 308, 120, 31);
		contentPane.add(stndrbtnEliminar);
		
		cu.LlenarTabla();
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}
	
	
	
	
	
}
