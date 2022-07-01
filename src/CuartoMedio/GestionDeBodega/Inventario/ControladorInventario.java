package CuartoMedio.GestionDeBodega.Inventario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacion;
import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacionRepository;
import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.ModeloHonorarios;
import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.VistaHonorarios;
import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;
import core.Helpers;
import core.ManagerDB;
import ui.ImageGalery.VistaImageGalery;
import ui.Mensejes.Mensajes;

public class ControladorInventario implements ActionListener {

	private VistaInventario vista;
	private InventarioRepository repository;
	private AbrirDocumentos mvd = AbrirDocumentos.getInstance();  
	
	public ControladorInventario(VistaInventario vista) {
		this.repository = new InventarioRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		// TODO Auto-generated constructor stub
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(vista.getBtnGuardar())) {
			
			if(vista.getTxtId().getText().length() <= 0) {
				if(vista.camposVacios()) {
					
					InventarioEntity ie = new InventarioEntity();
					
					ie.setTipoProducto(vista.getComboBoxTipoProducto().getSelectedIndex());
					ie.setInsumo(vista.getTxtInsumo().getText());
					ie.setUnidadMedida(vista.getComboBoxUM().getSelectedIndex());
					ie.setStockReal(Integer.parseInt(vista.getTxtStockReal().getText()));
					ie.setValorUnitario(Double.parseDouble(vista.getTxtValorUnitario().getText()));
					
					InventarioEntity db = this.repository.create(ie);
					
					if(db != null) {
						Mensajes.Creacion();
						vista.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
				
			// ACTUALIZAR (MODIFICAR)
			}else{
				if(vista.camposVacios()) {
					
					InventarioEntity ie = new InventarioEntity();
					
					ie.setId(Long.parseLong(vista.getTxtId().getText()));
					ie.setTipoProducto(vista.getComboBoxTipoProducto().getSelectedIndex());
					ie.setInsumo(vista.getTxtInsumo().getText());
					ie.setUnidadMedida(vista.getComboBoxUM().getSelectedIndex());
					ie.setStockReal(Integer.parseInt(vista.getTxtStockReal().getText()));
					ie.setValorUnitario(Double.parseDouble(vista.getTxtValorUnitario().getText()));
					
					InventarioEntity db = this.repository.update(ie);
					
					if(db != null) {
						Mensajes.Actualizacion();
						vista.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
			}		
		}/*else if(e.getSource().equals(vista.getBtnAgregarAB())) {
			
			int filaSeleccionada = vista.getTableAlimentosBebidas().getSelectedRow();
			Long id = Long.parseLong(String.valueOf(vista.getModelAlimBebidas().getValueAt(filaSeleccionada, 0)));
			
			InventarioEntity ie = new InventarioEntity();
			
			ie.setSalidaMaterial(Integer.parseInt(vista.getTxtSalidaMaterialAB().getText()));
			
			InventarioEntity db = this.repository.update(ie);
			
			if(db != null) {
				Mensajes.Actualizacion();
				vista.ActualizarVista();
			}
		}*/
		
	}
	
	public void LlenarTabla() {
		
		Iterator<InventarioEntity> lista = this.repository.findAll().iterator();
		
		this.vista.getModelAlimBebidas().getDataVector().removeAllElements();
		this.vista.getModelAlimBebidas().fireTableDataChanged();
		
		this.vista.getModelMatOficina().getDataVector().removeAllElements();
		this.vista.getModelMatOficina().fireTableDataChanged();
		
		this.vista.getModelMatElectricos().getDataVector().removeAllElements();
		this.vista.getModelMatElectricos().fireTableDataChanged();
		
		this.vista.getModelMatDiversos().getDataVector().removeAllElements();
		this.vista.getModelMatDiversos().fireTableDataChanged();
		
		
		while(lista.hasNext()) {
			
			InventarioEntity ie = lista.next();
			
			int SalidaMaterial = 0;
			int ComboUnidadMedida = ie.getUnidadMedida();
			String UnidadMedida = vista.getComboBoxUM().getItemAt(ComboUnidadMedida).toString();
			double ValorTotal = ie.getValorUnitario() * ie.getStockReal();
			
			if(ie.getTipoProducto() == 0) {
				
				this.vista.getModelAlimBebidas().addRow(new  Object[] {
						ie.getId(),
						ie.getInsumo(),
						UnidadMedida,
						ie.getStockReal(),
						SalidaMaterial,
						ie.getStockReal(),
						ie.getValorUnitario(),
						ValorTotal
						
				});
				
			}else if(ie.getTipoProducto() == 1) {
				
				this.vista.getModelMatOficina().addRow(new  Object[] {
						ie.getId(),
						ie.getInsumo(),
						UnidadMedida,
						ie.getStockReal(),
						SalidaMaterial,
						ie.getStockReal(),
						ie.getValorUnitario(),
						ValorTotal
						
				});
				
				
			}else if(ie.getTipoProducto() == 2) {
				
				this.vista.getModelMatElectricos().addRow(new  Object[] {
						ie.getId(),
						ie.getInsumo(),
						UnidadMedida,
						ie.getStockReal(),
						SalidaMaterial,
						ie.getStockReal(),
						ie.getValorUnitario(),
						ValorTotal
						
				});
				
				
			}else if(ie.getTipoProducto() == 3) {
				
				this.vista.getModelMatDiversos().addRow(new  Object[] {
						ie.getId(),
						ie.getInsumo(),
						UnidadMedida,
						ie.getStockReal(),
						SalidaMaterial,
						ie.getStockReal(),
						ie.getValorUnitario(),
						ValorTotal
						
				});
				
				
			}
			
			
		}
	}

}
