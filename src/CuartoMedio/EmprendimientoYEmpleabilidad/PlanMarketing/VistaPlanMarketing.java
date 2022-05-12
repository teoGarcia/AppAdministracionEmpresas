package CuartoMedio.EmprendimientoYEmpleabilidad.PlanMarketing;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class VistaPlanMarketing extends JPanel {
	
	private ControlPlanMarketing cpm;
	
	private JTextField txtNomPro;
	private JTextField txtObjPro;
	private JTextField txtGruObj;
	private JTextField txtPro;
	private JTextField txtPre;
	private JTextField txtPla;
	private JTextField txtProm;
	private JTextField txtPer;
	private JTextField txtPosVen;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public VistaPlanMarketing() {
		
		cpm = new ControlPlanMarketing(this);
		
		setBounds(0, 0, 762, 740);
		setOpaque(false);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Plan de Marketing");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 21, 722, 43);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del proyecto");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(15, 85, 143, 20);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Objetivo del proyecto");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(15, 120, 143, 20);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Grupo Objetivo");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(15, 155, 143, 20);
		add(lblNewLabel_1_2);
		
		txtNomPro = new JTextField();
		txtNomPro.setBounds(207, 85, 543, 20);
		add(txtNomPro);
		txtNomPro.setColumns(10);
		
		txtObjPro = new JTextField();
		txtObjPro.setColumns(10);
		txtObjPro.setBounds(207, 120, 543, 20);
		add(txtObjPro);
		
		txtGruObj = new JTextField();
		txtGruObj.setColumns(10);
		txtGruObj.setBounds(207, 155, 543, 20);
		add(txtGruObj);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 300, 740, 378);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Producto", "Precio", "Plaza", "Promocion", "Persona", "Post Venta"
			}
		));
		table.getTableHeader().setBackground(Color.BLACK);
		table.getTableHeader().setForeground(Color.WHITE);
		table.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 12));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Producto");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(15, 190, 87, 20);
		add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Precio");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(276, 190, 87, 20);
		add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Plaza");
		lblNewLabel_1_2_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_3.setBounds(509, 190, 87, 20);
		add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Promocion");
		lblNewLabel_1_2_4.setForeground(Color.WHITE);
		lblNewLabel_1_2_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_4.setBounds(15, 225, 107, 20);
		add(lblNewLabel_1_2_4);
		
		JLabel lblNewLabel_1_2_5 = new JLabel("Persona");
		lblNewLabel_1_2_5.setForeground(Color.WHITE);
		lblNewLabel_1_2_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_5.setBounds(276, 225, 94, 20);
		add(lblNewLabel_1_2_5);
		
		JLabel lblNewLabel_1_2_6 = new JLabel("Post Venta");
		lblNewLabel_1_2_6.setForeground(Color.WHITE);
		lblNewLabel_1_2_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_6.setBounds(509, 225, 87, 20);
		add(lblNewLabel_1_2_6);
		
		txtPro = new JTextField();
		txtPro.setBounds(95, 190, 160, 20);
		add(txtPro);
		txtPro.setColumns(10);
		
		txtPre = new JTextField();
		txtPre.setColumns(10);
		txtPre.setBounds(339, 190, 160, 20);
		add(txtPre);
		
		txtPla = new JTextField();
		txtPla.setColumns(10);
		txtPla.setBounds(590, 191, 160, 20);
		add(txtPla);
		
		txtProm = new JTextField();
		txtProm.setColumns(10);
		txtProm.setBounds(95, 225, 160, 20);
		add(txtProm);
		
		txtPer = new JTextField();
		txtPer.setColumns(10);
		txtPer.setBounds(339, 225, 160, 20);
		add(txtPer);
		
		txtPosVen = new JTextField();
		txtPosVen.setColumns(10);
		txtPosVen.setBounds(590, 226, 160, 20);
		add(txtPosVen);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(627, 256, 123, 33);
		add(btnNewButton);

	}
}
