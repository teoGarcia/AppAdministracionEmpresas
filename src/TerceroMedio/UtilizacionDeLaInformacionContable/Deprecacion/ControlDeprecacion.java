package TerceroMedio.UtilizacionDeLaInformacionContable.Deprecacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlDeprecacion implements ActionListener {
	
	private VistaDeprecacion vista;
	private Deprecacion model = new Deprecacion();

	public ControlDeprecacion(VistaDeprecacion vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vista.getBtnCalcular())) {
			if(vista.isCamposVacios()) {
				int valorInicial = Integer.parseInt(vista.getTxtInicial().getText()); 
				int valorRescate = Integer.parseInt(vista.getTxtRescate().getText());
				int vidaUtil = Integer.parseInt(vista.getTxtUtil().getText());
				
				
				int[][] data = model.CalcularDepreciacionLineaRecta(valorInicial, valorRescate, vidaUtil);
				
				this.vista.getModelRecta().getDataVector().removeAllElements();
				this.vista.getModelRecta().fireTableDataChanged();
				
				for(int i = 0; i<vidaUtil; i++) {
					this.vista.getModelRecta().addRow(new  Object[] {
							data[i][0],
							data[i][1],
							data[i][2]+"%",
							data[i][3],
							data[i][4],
							data[i][5],
				});
				}
			}
			
			// campos vacios	
		} else {
			
		}
	}

}
