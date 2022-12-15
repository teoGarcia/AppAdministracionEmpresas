package TerceroMedio.UtilizacionDeLaInformacionContable.Deprecacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import TerceroMedio.UtilizacionDeLaInformacionContable.Deprecacion.Imprimir.PanelDepreciacion;
import TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.Asientos;
import TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.AsientosRepository;
import TerceroMedio.UtilizacionDeLaInformacionContable.LibroDiarioYMayor.LibroDiario;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;
import ui.imprimir.VistaImprimir;

public class ControlDeprecacion implements ActionListener {
	
	
	
	private VistaDeprecacion vista;
	private DeprecacionRepository Repository;
	
	private VistaImprimir imprimir;

	public ControlDeprecacion(VistaDeprecacion vista) {
		
		this.Repository = new DeprecacionRepository();
		this.Repository.setEm(ManagerDB.getEntityManager());
		
		this.vista = vista;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(vista.getCrudDepreciacion().getBtnAgregar())) {
			
			if (vista.isCamposVacios()) {
				
				Deprecacion record = new Deprecacion();

				record.setValorInicial(Integer.parseInt(vista.getTxtInicial().getText()));
				record.setValorRescate(Integer.parseInt(vista.getTxtRescate().getText()));
				record.setVidaUtil(Integer.parseInt(vista.getTxtUtil().getText()));

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
			
		}else if (e.getSource().equals(vista.getCrudDepreciacion().getBtnModificar())) {
			Long id = vista.getCrudDepreciacion().getRowId();
			if (id >= 0) {
				Deprecacion record = Repository.find(id);
				vista.cargarForm(record);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource().equals(vista.getCrudDepreciacion().getBtnEliminar())) {
			Long id = vista.getCrudDepreciacion().getRowId();
			if (id != null) {
				Deprecacion record = Repository.find(id);
				Repository.delete(record);
				vista.actualizarVista();
			}
		} else if(e.getSource().equals(vista.getBtnCalcular())) {
			
			CalcularDepreciacion(this.vista.getModelRecta(), this.vista.getModelAcelerado());
				
		} else if(e.getSource().equals(vista.getCrudDepreciacion().getBtnImprimir())) {
			
			if(imprimir == null) imprimir = VistaImprimir.instance();
			imprimir.resetImprimir();
			
			PanelDepreciacion pi = new PanelDepreciacion();
			
			pi.getTxtValIni().setText(vista.getCrudDepreciacion().getSeledRow(1));
			pi.getTxtValRes().setText(vista.getCrudDepreciacion().getSeledRow(2));
			pi.getTxtVidUtil().setText(vista.getCrudDepreciacion().getSeledRow(3));
			
			CalcularDepreciacion(pi.getModelRecta(), pi.getModelAcelerado());
			
			imprimir.registerPanel(pi, "pi");
			
			imprimir.setVisible(true);
			
		}
	}
	
	
	private void CalcularDepreciacion(DefaultTableModel modelRecta, DefaultTableModel modelAcelerado) {
		
		int valorInicial = Integer.parseInt(vista.getCrudDepreciacion().getSeledRow(1)); 
		int valorRescate = Integer.parseInt(vista.getCrudDepreciacion().getSeledRow(2));
		int vidaUtil = Integer.parseInt(vista.getCrudDepreciacion().getSeledRow(3));
		

			int[][] dataLineaRecta = calcularDepreciacionLineaRecta(valorInicial, valorRescate, vidaUtil);
			int[][] dataAcelerado = calcularDepreciacionAcelerada(valorInicial, valorRescate, vidaUtil);
			
			vista.clearTables();
			
			
			for(int i = 0; i<vidaUtil; i++) {
				modelRecta.addRow(new  Object[] {
						dataLineaRecta[i][0],
						dataLineaRecta[i][1],
						dataLineaRecta[i][2]+"%",
						dataLineaRecta[i][3],
						dataLineaRecta[i][4],
						dataLineaRecta[i][5],
				});
				
				modelAcelerado.addRow(new  Object[] {
						dataAcelerado[i][0],
						dataAcelerado[i][1],
						dataAcelerado[i][2]+"%",
						dataAcelerado[i][3],
						dataAcelerado[i][4],
						dataAcelerado[i][5],
				});
				
			}
		
		
	}
	
	
	
	private void guardar(Deprecacion record) {

		Deprecacion db = this.Repository.create(record);

		if (db != null) {
			vista.vaciarForm();
			Mensajes.Creacion();
		}
	}
	
	private void actualizar(Deprecacion record) {

		Deprecacion db = this.Repository.update(record);

		if (db != null) {
			vista.vaciarForm();
			Mensajes.Actualizacion();
		}
	}
	
	public void LlenarTabla() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Iterator<Deprecacion> lista = this.Repository.findAll().iterator();
		
		
		this.vista.getCrudDepreciacion().getTable().getModel().getDataVector().removeAllElements();
		this.vista.getCrudDepreciacion().getTable().getModel().fireTableDataChanged();

		while (lista.hasNext()) {
			Deprecacion records = lista.next();
			this.vista.getCrudDepreciacion().getTable().getModel().addRow(
					new Object[] { 
							records.getId(), 
							records.getValorInicial(),
							records.getValorRescate(),
							records.getVidaUtil()
					});
			}
	}
	
	public int[][] calcularDepreciacionLineaRecta(int valorInicial, int valorRescate, int vidaUtil){
		int[][] data = new int[vidaUtil][6];
		int acumulador = 0;
		int depreciacion = ((100/vidaUtil));
		
		for(int i = 0; i<vidaUtil; i++) {
			data[i][0] = (i+1);
			data[i][1] = (valorInicial-valorRescate);
			data[i][2] = depreciacion;
			data[i][3] = ((data[i][1] * data[i][2])/100);
			data[i][4] = acumulador + data[i][3];
			acumulador +=   data[i][3];
			data[i][5] = (data[i][1] - data[i][4])+ valorRescate;
		}
		
		return data;
	}
	
	public int[][] calcularDepreciacionAcelerada(int valorInicial, int valorRescate, int vidaUtil){
		
		int[][] data = new int[vidaUtil][6];
		
		int acumulador = 0;
		int accLibro = 0;
		int depreciacion = (int) ((((100.0/vidaUtil)/100.0)*2)*100.0);
		
		
		for(int i = 0; i<vidaUtil; i++) {
			data[i][0] = (i+1);
			data[i][1] = accLibro>0?accLibro:valorInicial;
			data[i][2] = depreciacion;
			data[i][3] = ((data[i][1] * data[i][2])/100);
			data[i][4] = acumulador + data[i][3];
			acumulador +=   data[i][3];
			data[i][5] = (data[i][1] - data[i][3]);
			accLibro = data[i][5];
		}
		
		return data;
	}

}
