package TerceroMedio.UtilizacionDeLaInformacionContable.Deprecacion;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import ui.Texts.TextSoloNumeros;
import ui.Buttons.StandarButton;
import ui.CrudTable.VistaCrudTable;
import ui.TablaUi.TableStandard;

public class VistaDeprecacion extends JPanel {
	
	private Long id = 0L;
	
	private TextSoloNumeros txtInicial;
	private TextSoloNumeros txtRescate;
	private TextSoloNumeros txtUtil;
	
	private TableStandard tableLinealRecta;
	private TableStandard tableAcelerado;
	
	private StandarButton btnCalcular;
	
	private ControlDeprecacion control;
	
	private VistaCrudTable crudDepreciacion;
	

	
	public VistaDeprecacion() {
		inicializacion();
	}
	
	private void inicializacion() {
		// TODO Auto-generated method stub
		control = new ControlDeprecacion(this);
		
		setBounds(0, 0, 774, 731);
		setOpaque(false);
		setLayout(null); 
		
		
		JLabel lblTitle = new JLabel("CALCULADORA DE DEPRECIACION");
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(26, 34, 722, 48);
		add(lblTitle);
		
		JLabel lblNewLabel_1 = new JLabel("Valor Inicial");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 99, 89, 19);
		add(lblNewLabel_1);
		
		txtInicial = new TextSoloNumeros();
		txtInicial.setText("");
		txtInicial.setColumns(10);
		txtInicial.setBounds(84, 100, 140, 19);
		add(txtInicial);
		
		JLabel lblNewLabel_1_1 = new JLabel("Valor de Recate");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(234, 99, 89, 19);
		add(lblNewLabel_1_1);
		
		txtRescate = new TextSoloNumeros();
		txtRescate.setText("");
		txtRescate.setColumns(10);
		txtRescate.setBounds(333, 99, 135, 19);
		add(txtRescate);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Vida Util");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_4_1.setBounds(505, 99, 57, 19);
		add(lblNewLabel_1_4_1);
		
		txtUtil = new TextSoloNumeros();
		txtUtil.setText("");
		txtUtil.setColumns(10);
		txtUtil.setBounds(572, 99, 140, 19);
		add(txtUtil);
		
		
		crudDepreciacion = new VistaCrudTable();
		crudDepreciacion.setLocation(0, 130);
		crudDepreciacion.setColumnsTable(new String[] {"ID", "Valor Inicial", "Valor de Rescate", "Vida Util"});
		crudDepreciacion.addControllers(control);
		add(crudDepreciacion);
		
		btnCalcular = new StandarButton("Calcular");
		btnCalcular.setText("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCalcular.setBounds(619, 448, 130, 28);
		btnCalcular.addActionListener(control);
		add(btnCalcular);
		
		JTabbedPane tabbedPaneContratos = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneContratos.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPaneContratos.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		tabbedPaneContratos.setForeground(Color.GRAY);
		tabbedPaneContratos.setBackground(new Color(54, 54, 54));
		tabbedPaneContratos.setOpaque(true);
		tabbedPaneContratos.setBounds(5, 187+300, 754, 500);
		tabbedPaneContratos.setFont(new Font("Dialog", Font.BOLD, 14));
		add(tabbedPaneContratos);
		
		JScrollPane scrollPaneLinealRecta = new JScrollPane();
		scrollPaneLinealRecta.setBackground(new Color(54, 54, 54));
		
		String[] columns = new String[] {"Anio", "Monto a Depreciar", "Tasa de Deprecicacion",  "Depreciacion", "Depreciacion Acumulada", "Valor Libro"};
		
		tableLinealRecta = new TableStandard();
		tableLinealRecta.setColums(columns);
		scrollPaneLinealRecta.setViewportView(tableLinealRecta);
		
		tabbedPaneContratos.addTab("DEPRECIACION LINEA RECTA", null, scrollPaneLinealRecta, null);
		
		JScrollPane scrollPaneAcelerado = new JScrollPane();
		scrollPaneAcelerado.setBackground(new Color(54, 54, 54));
		
		tableAcelerado = new TableStandard();
		tableAcelerado.setColums(columns);
		scrollPaneAcelerado.setViewportView(tableAcelerado);
		
		tabbedPaneContratos.addTab("DEPRECIACION ACELERADA", null, scrollPaneAcelerado, null);
		
		 actualizarVista();
	}

	public boolean isCamposVacios() {
		if(txtInicial.getText().length() <= 0) {
			return false;
		}else if(txtRescate.getText().length() <= 0) {
			return false;
		}else if(txtUtil.getText().length() <= 0) {
			return false;
		}
		
		return true;
	}
	
	public void actualizarVista() {
		vaciarForm();
		control.LlenarTabla();
	}
	
	public void cargarForm(Deprecacion record) {
		txtInicial.setText(""+record.getValorInicial());
		txtRescate.setText(""+record.getValorRescate());
		txtUtil.setText(""+record.getVidaUtil());
		setId(record.getId());
	}
	
	public void vaciarForm() {
		txtInicial.setText("");
		txtRescate.setText("");
		txtUtil.setText("");
		setId(0L);
	}
	
	public void clearTables() {
		tableLinealRecta.getModel().getDataVector().removeAllElements();
		tableLinealRecta.getModel().fireTableDataChanged();
		
		tableAcelerado.getModel().getDataVector().removeAllElements();
		tableAcelerado.getModel().fireTableDataChanged();
	}
	
	public DefaultTableModel getModelRecta() {
		return tableLinealRecta.getModel();
	}
	
	public DefaultTableModel getModelAcelerado() {
		return tableAcelerado.getModel();
	}

	public TextSoloNumeros getTxtInicial() {
		return txtInicial;
	}

	public void setTxtInicial(TextSoloNumeros txtInicial) {
		this.txtInicial = txtInicial;
	}

	public TextSoloNumeros getTxtRescate() {
		return txtRescate;
	}

	public void setTxtRescate(TextSoloNumeros txtRescate) {
		this.txtRescate = txtRescate;
	}

	public TextSoloNumeros getTxtUtil() {
		return txtUtil;
	}

	public void setTxtUtil(TextSoloNumeros txtUtil) {
		this.txtUtil = txtUtil;
	}

	public StandarButton getBtnCalcular() {
		return btnCalcular;
	}

	public void setBtnCalcular(StandarButton btnCalcular) {
		this.btnCalcular = btnCalcular;
	}

	public VistaCrudTable getCrudDepreciacion() {
		return crudDepreciacion;
	}

	public void setCrudDepreciacion(VistaCrudTable crudDepreciacion) {
		this.crudDepreciacion = crudDepreciacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
