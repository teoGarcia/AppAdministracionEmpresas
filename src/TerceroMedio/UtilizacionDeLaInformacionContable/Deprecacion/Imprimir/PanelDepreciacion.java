package TerceroMedio.UtilizacionDeLaInformacionContable.Deprecacion.Imprimir;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import TerceroMedio.UtilizacionDeLaInformacionContable.Deprecacion.Deprecacion;
import ui.TablaUi.TableStandard;
import ui.imprimir.PanelImprimirI;
import javax.swing.SwingConstants;

public class PanelDepreciacion extends PanelImprimirI<Deprecacion>{

	private Color FontColor = Color.BLACK;
	private JLabel txtValIni;
	private JLabel txtValRes;
	private JLabel txtVidUtil;
	private TableStandard table;
	private TableStandard table1;
	
	public PanelDepreciacion() {
		super("Depreciacion");
		
		
		JLabel lblValIni = new JLabel("Valor Inicial");
		lblValIni.setForeground(FontColor);
		lblValIni.setFont(new Font("Dialog", Font.BOLD, 12));
		lblValIni.setBounds(20, 75, 78, 24);
		add(lblValIni);

		txtValIni = new JLabel();
		txtValIni.setForeground(FontColor);
		txtValIni.setBounds(108, 75, 99, 24);
		add(txtValIni);

		JLabel lblValRes = new JLabel("Valor de Rescate");
		lblValRes.setForeground(FontColor);
		lblValRes.setFont(new Font("Dialog", Font.BOLD, 12));
		lblValRes.setBounds(217, 75, 99, 24);
		add(lblValRes);

		txtValRes = new JLabel();
		txtValRes.setForeground(FontColor);
		txtValRes.setBounds(326, 75, 99, 24);
		add(txtValRes);

		JLabel lblVidUtil = new JLabel("Vida Util");
		lblVidUtil.setForeground(FontColor);
		lblVidUtil.setFont(new Font("Dialog", Font.BOLD, 12));
		lblVidUtil.setBounds(435, 75, 59, 24);
		add(lblVidUtil);

		txtVidUtil = new JLabel();
		txtVidUtil.setForeground(FontColor);
		txtVidUtil.setBounds(504, 75, 66, 24);
		add(txtVidUtil);
		
		JLabel lblDepreciacinLneaRecta = new JLabel("RECTA");
		lblDepreciacinLneaRecta.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepreciacinLneaRecta.setForeground(Color.BLACK);
		lblDepreciacinLneaRecta.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDepreciacinLneaRecta.setBounds(28, 110, 523, 24);
		add(lblDepreciacinLneaRecta);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 139, 526, 241);
		add(scrollPane);
		
		table = new TableStandard();
		table.setFont(new Font("Dialog", Font.PLAIN, 9));
		String[] columns = new String[] {"Anio", "Monto a Dep.", "Tasa De Dep.", "Depreciacion", "Dep. Acumulada", "Valor Libro"};
		table.setColums(columns);
		table.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 10));
		scrollPane.setViewportView(table);
		
		JLabel lblDepreciacionAcelerada = new JLabel("ACELERADA");
		lblDepreciacionAcelerada.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepreciacionAcelerada.setForeground(Color.BLACK);
		lblDepreciacionAcelerada.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDepreciacionAcelerada.setBounds(24, 391, 531, 24);
		add(lblDepreciacionAcelerada);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(27, 420, 526, 241);
		add(scrollPane_1);
		
		table1 = new TableStandard();
		table1.setFont(new Font("Dialog", Font.PLAIN, 9));
		table1.setColums(columns);
		table1.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 10));
		scrollPane_1.setViewportView(table1);
		

		
		
	}

	@Override
	public void CargarData(Deprecacion record) {
		
	}
	
	public DefaultTableModel getModelRecta() {
		return table.getModel();
	}
	
	public DefaultTableModel getModelAcelerado() {
		return table1.getModel();
	}

	public JLabel getTxtValIni() {
		return txtValIni;
	}

	public void setTxtValIni(JLabel txtValIni) {
		this.txtValIni = txtValIni;
	}

	public JLabel getTxtValRes() {
		return txtValRes;
	}

	public void setTxtValRes(JLabel txtValRes) {
		this.txtValRes = txtValRes;
	}

	public JLabel getTxtVidUtil() {
		return txtVidUtil;
	}

	public void setTxtVidUtil(JLabel txtVidUtil) {
		this.txtVidUtil = txtVidUtil;
	}
}
