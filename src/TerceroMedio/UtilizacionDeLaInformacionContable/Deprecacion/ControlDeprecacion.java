package TerceroMedio.UtilizacionDeLaInformacionContable.Deprecacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ui.Mensejes.Mensajes;

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
				
				
				int[][] dataLineaRecta = model.CalcularDepreciacionLineaRecta(valorInicial, valorRescate, vidaUtil);
				int[][] dataAcelerado = model.CalcularDepreciacionAcelerada(valorInicial, valorRescate, vidaUtil);
				
				vista.clearTables();
				
				
				for(int i = 0; i<vidaUtil; i++) {
					this.vista.getModelRecta().addRow(new  Object[] {
							dataLineaRecta[i][0],
							dataLineaRecta[i][1],
							dataLineaRecta[i][2]+"%",
							dataLineaRecta[i][3],
							dataLineaRecta[i][4],
							dataLineaRecta[i][5],
					});
					
					this.vista.getModelAcelerado().addRow(new  Object[] {
							dataAcelerado[i][0],
							dataAcelerado[i][1],
							dataAcelerado[i][2]+"%",
							dataAcelerado[i][3],
							dataAcelerado[i][4],
							dataAcelerado[i][5],
					});
					
				}	
			}
			
			// campos vacios	
		} else {
			Mensajes.CamposVacios();
		}
	}

}
