package TerceroMedio.UtilizacionDeLaInformacionContable.BalanceGeneral;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.LibroDiario;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlBalanceGeneral implements ActionListener {

	private VistaBalanceGeneral vista;
	private BalanceGeneralRepository repository;

	public ControlBalanceGeneral(VistaBalanceGeneral vista) {
		this.vista = vista;
		this.repository = new BalanceGeneralRepository();
		repository.setEm(ManagerDB.getEntityManager());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(vista.getBtnGuardar())) {
			if (vista.camposVacios()) {
				
				Mensajes.Information("Todo Funciona");
				
				/*BalanceGeneralEntity record = new BalanceGeneralEntity();

				// Campos
				record.setMes(vista.getMonthMesPeriodo().getMonth());
				record.setAnio(vista.getYearChooserPeriodo().getYear());
				record.setDenominacion(vista.getTxtDenominacion().getText());

				// guarda
				if (vista.getId() <= 0 && vista.getId() != null) {
					this.guardar(record);
					// actualiza
				} else {
					record.setId(vista.getId());
					this.actualizar(record);
				}

				vista.actualizarVista();*/

			} else {
				Mensajes.CamposVacios();
			}
		}
	}

}
