package TerceroMedio.UtilizacionDeLaInformacionContable.BalanceGeneral;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JOptionPane;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;
import ui.imprimir.VistaImprimir;

public class ControlBalanceGeneral implements ActionListener {

	private VistaBalanceGeneral vista;
	private BalanceGeneralRepository repository;
	private VistaImprimir imprimir;
	private BalanceGeneralImprimir panelI;

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
				
				BalanceGeneralEntity record = new BalanceGeneralEntity();

				
				record.setNomEmp(vista.getTxtNomEmpre().getText());
				record.setFecha(vista.getDateFecha().getCalendar());
				
				// Activo Circulante
				record.setCaja(Integer.parseInt(vista.getTxtCaja().getText()));
				record.setBancos(Integer.parseInt(vista.getTxtBancos().getText()));
				record.setInvCorPla(Integer.parseInt(vista.getTxtInvCorPla().getText()));
				record.setCuenPorCob(Integer.parseInt(vista.getTxtCuentasCobrar().getText()));
				record.setInventario(Integer.parseInt(vista.getTxtInventario().getText()));
				
				// Activo Fijo
				record.setEdificio(Integer.parseInt(vista.getTxtEdificios().getText()));
				record.setTerreno(Integer.parseInt(vista.getTxtTerreno().getText()));
				record.setDepAcu1(Integer.parseInt(vista.getTxtDepAcum().getText()));
				record.setMobEq(Integer.parseInt(vista.getTxtMobYEq().getText()));
				record.setDepAcu2(Integer.parseInt(vista.getTxtDepA2().getText()));
				record.setEqTransp(Integer.parseInt(vista.getTxtEqTrans().getText()));
				record.setDepAcu3(Integer.parseInt(vista.getTxtDepA3().getText()));
				record.setEqComp(Integer.parseInt(vista.getTxtEqCompu().getText()));
				record.setDepAcu4(Integer.parseInt(vista.getTxtDepA4().getText()));
				
				// Activo Diferido
				record.setRentPagAnt(Integer.parseInt(vista.getTxtRentPag().getText()));
				record.setDepAcu5(Integer.parseInt(vista.getTxtOactDif().getText()));
				
				// Pasivo circulante
				record.setProveedores(Integer.parseInt(vista.getTxtProveedores().getText()));
				record.setAcreedores(Integer.parseInt(vista.getTxtAcreedores().getText()));
				record.setIntPorPagar(Integer.parseInt(vista.getTxtInteresesPorPagar().getText()));
				record.setISRporPagar(Integer.parseInt(vista.getTxtISRPorPagar().getText()));
				record.setAntiCliente(Integer.parseInt(vista.getTxtAnticipoCliente().getText()));
				
				
				// pasivo a largo plazo
				record.setDocPorPagar(Integer.parseInt(vista.getTxtDocPorPagar().getText()));
				
				
				// capital contable
				record.setCapSoc(Integer.parseInt(vista.getTxtCapSoc().getText()));
				record.setReservas(Integer.parseInt(vista.getTxtReser().getText()));
				record.setResEjeAnt(Integer.parseInt(vista.getTxtResEjeAnt().getText()));
				record.setResEje(Integer.parseInt(vista.getTxtReslEje().getText()));
				

				// guarda
				if (vista.getId() <= 0 && vista.getId() != null) {
					this.guardar(record);
					// actualiza
				} else {
					record.setId(vista.getId());
					this.actualizar(record);
				}

				vista.actualizarVista();

			} else {
				Mensajes.CamposVacios();
			}
		}else if(e.getSource().equals(vista.getBtnModificar())) {
			Long id = getRow();
			if (id >= 0) {
				BalanceGeneralEntity record = repository.find(id);
				vista.cargarForm(record);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if(e.getSource().equals(vista.getBtnVaciarCampos())) {
			
			vista.vaciarAllForm();
			
		}  else if (e.getSource().equals(vista.getBtnEliminar())) {
			
			Long id = getRow();
			if (id != null) {
				BalanceGeneralEntity record = repository.find(id);
				repository.delete(record);
				vista.actualizarVista();
			}
			
		} else if (e.getSource().equals(vista.getBtnVerTodosLos())) {
			Long id = getRow();
			if (id >= 0) {
				BalanceGeneralEntity record = repository.find(id);
				vista.cargarForm(record);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource().equals(vista.getBtnTotalActCir())) {
			int calcular  = vista.CalcularTotal(vista.getFormActivoCirculante());
			vista.getTxtTotalActCir().setText(""+calcular);
			
		}else if (e.getSource().equals(vista.getBtnTotalActivoFijo())) {
			int calcular  = vista.CalcularTotal(vista.getFormActivoFijo());
			vista.getTxtTotalActivoFijo().setText(""+calcular);
		}else if (e.getSource().equals(vista.getBtnTotalActDif())) {
			int calcular  = vista.CalcularTotal(vista.getFormActivoDiferido());
			vista.getTxtTotalActDif().setText(""+calcular);
		}else if (e.getSource().equals(vista.getBtnSumaAct())) {
			if(vista.getTxtTotalActCir().getText().length() > 0 &&
			   vista.getTxtTotalActivoFijo().getText().length() > 0	&&
			   vista.getTxtTotalActDif().getText().length() > 0 ) {
				
				int calcular = Integer.parseInt(vista.getTxtTotalActCir().getText()) + 
						       Integer.parseInt(vista.getTxtTotalActivoFijo().getText()) +
						       Integer.parseInt(vista.getTxtTotalActDif().getText());
						
				vista.getTxtSumaAct().setText(""+ calcular);
			}else{
				Mensajes.Information("Calcular Los Totales de activos");
			}
			
		}else if (e.getSource().equals(vista.getBtnTotaPasCirc())) {
			int calcular  = vista.CalcularTotal(vista.getFormPasivoCiculante());
			vista.getTxtTotalPasCir().setText(""+calcular);
		}else if (e.getSource().equals(vista.getBtnTotaPasALargPlaz())) {
			int calcular  = vista.CalcularTotal(vista.getFormPasivoLargoPlazo());
			vista.getTxtTotPasALargoPlas().setText(""+calcular);
		}else if (e.getSource().equals(vista.getBtnSumaDelPasivo())) {
			if(vista.getTxtTotalPasCir().getText().length() > 0 &&
			   vista.getTxtTotPasALargoPlas().getText().length() > 0 ) {
						
						int calcular = Integer.parseInt(vista.getTxtTotalPasCir().getText()) + 
								       Integer.parseInt(vista.getTxtTotPasALargoPlas().getText());
								
						vista.getTxtSumaDelPasivo().setText(""+ calcular);
					}else{
						Mensajes.Information("Calcular Los Totales de pasivos");
					}
					
		}else if (e.getSource().equals(vista.getBtnTotaCapCon())) {
			int calcular  = vista.CalcularTotal(vista.getFormCapitalContable());
			vista.getTxtCapCon().setText(""+calcular);
		}else if (e.getSource().equals(vista.getBtnSumaCapCon())) {
			if(vista.getTxtCapCon().getText().length() > 0) {					
				vista.getTxtSumaCapCon().setText(vista.getTxtCapCon().getText());
			}else{
				Mensajes.Information("Calcular Los Totales de capital contable");
			}
							
		}else if (e.getSource().equals(vista.getBtnSumaCapConPas())) {
			if(vista.getTxtTotalPasCir().getText().length() > 0 &&
			   vista.getTxtTotPasALargoPlas().getText().length() > 0 &&
			   vista.getTxtCapCon().getText().length() > 0) {
								
								int calcular = Integer.parseInt(vista.getTxtTotalPasCir().getText()) + 
										       Integer.parseInt(vista.getTxtTotPasALargoPlas().getText())+
										       Integer.parseInt(vista.getTxtCapCon().getText());
										       ;
										
								vista.getTxtSumaCapConPas().setText(""+ calcular);
							}else{
								Mensajes.Information("Calcular Los Totales de pasivos y capital contable");
							}
							
		} else if (e.getSource().equals(vista.getBtnImprimir())) {
			
			Long id = getRow();
			
			if(id != null) {
				if(imprimir == null) imprimir = VistaImprimir.instance();
				
				BalanceGeneralEntity record = repository.find(id);
				
				if(panelI == null) panelI = new BalanceGeneralImprimir();
				panelI.CargarData(record);
				imprimir.setPi(panelI);
				imprimir.setVisible(true);
			}
			


		}
	}
	
	private Long getRow() {
		int row = vista.getTable().getSelectedRow();
		if (row >= 0) {
			Long id = Long.parseLong(String.valueOf(vista.getModel().getValueAt(row, 0)));
			return id;
		} else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);
			return null;
		}

	}
	
	
	public void guardar(BalanceGeneralEntity record) {
		BalanceGeneralEntity db = this.repository.create(record);

		if (db != null) {
			vista.vaciarAllForm();
			Mensajes.Creacion();
		}
	}
	
	public void actualizar(BalanceGeneralEntity record) {
		BalanceGeneralEntity db = this.repository.update(record);

		if (db != null) {
			vista.vaciarAllForm();
			Mensajes.Actualizacion();
		}
	}

	public void LlenarTabla() {
		
		Iterator<BalanceGeneralEntity> lista = this.repository.findAll().iterator();
		this.vista.getModel().getDataVector().removeAllElements();
		this.vista.getModel().fireTableDataChanged();
		 
			while (lista.hasNext()) {
				BalanceGeneralEntity records = lista.next();
				
				this.vista.getModel().addRow(
						new Object[] { 
								records.getId(), 
								records.getNomEmp(),
								Helpers.getFechaFormat(records.getFecha()),
						});
				}
		
		
	}

	
}