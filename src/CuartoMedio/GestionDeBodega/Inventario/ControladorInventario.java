package CuartoMedio.GestionDeBodega.Inventario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacion;
import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacionRepository;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
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
					ie.setValorUnitario(Integer.parseInt(vista.getTxtValorUnitario().getText()));
					
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
					ie.setValorUnitario(Integer.parseInt(vista.getTxtValorUnitario().getText()));
					
					InventarioEntity db = this.repository.update(ie);
					
					if(db != null) {
						Mensajes.Actualizacion();
						vista.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
			}	
			
		}else if(e.getSource().equals(vista.getBtnModificarAB())) {
			int row = vista.getTableAlimentosBebidas().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vista.getModelAlimBebidas().getValueAt(row, 0)));
				InventarioEntity ape = repository.find(id);
				vista.CargarFormAB(ape);
			
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
		
		}else if(e.getSource().equals(vista.getBtnEliminarAB())) {
			int row = vista.getTableAlimentosBebidas().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelAlimBebidas().getValueAt(row, 0)));
				InventarioEntity ape = repository.find(id);
				repository.delete(ape);
				vista.ActualizarVista();
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
			///////////////////////////////////////////////////
		
		}else if(e.getSource().equals(vista.getBtnModificarMO())) {
			int row = vista.getTableMaterialesOficina().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vista.getModelMatOficina().getValueAt(row, 0)));
				InventarioEntity ape = repository.find(id);
				vista.CargarFormAB(ape);
			
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
		
		}else if(e.getSource().equals(vista.getBtnEliminarMO())) {
			int row = vista.getTableMaterialesOficina().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelMatOficina().getValueAt(row, 0)));
				InventarioEntity ape = repository.find(id);
				repository.delete(ape);
				vista.ActualizarVista();
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		
		}
		
			//////////////////////////////////////////////////////////////////////
		
		else if(e.getSource().equals(vista.getBtnModificarME())) {
			int row = vista.getTableMaterialesElectricos().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vista.getModelMatElectricos().getValueAt(row, 0)));
				InventarioEntity ape = repository.find(id);
				vista.CargarFormAB(ape);
			
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
		
		}else if(e.getSource().equals(vista.getBtnEliminarME())) {
			int row = vista.getTableMaterialesElectricos().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelMatElectricos().getValueAt(row, 0)));
				InventarioEntity ape = repository.find(id);
				repository.delete(ape);
				vista.ActualizarVista();
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		
		}
		
			/////////////////////////////////////////////////////////////////////////////////
		
		else if(e.getSource().equals(vista.getBtnModificarMD())) {
			int row = vista.getTableMaterialesDiversos().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vista.getModelMatDiversos().getValueAt(row, 0)));
				InventarioEntity ape = repository.find(id);
				vista.CargarFormAB(ape);
			
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
		
		}else if(e.getSource().equals(vista.getBtnEliminarMD())) {
			int row = vista.getTableMaterialesDiversos().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelMatDiversos().getValueAt(row, 0)));
				InventarioEntity ape = repository.find(id);
				repository.delete(ape);
				vista.ActualizarVista();
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		
		}
		
		
		
		/*else if(e.getSource().equals(vista.getBtnAgregarAB())) {
			
			InventarioEntity ie = new InventarioEntity();
			
			int filaSeleccionada = vista.getTableAlimentosBebidas().getSelectedRow();
			Long id = Long.parseLong(String.valueOf(vista.getModelAlimBebidas().getValueAt(filaSeleccionada, 0)));
			int Stock = Integer.parseInt(vista.getModelAlimBebidas().getValueAt(filaSeleccionada, 3).toString());
			String Insumo = vista.getModelAlimBebidas().getValueAt(filaSeleccionada, 3).toString();
			double ValorUnitario = Double.parseDouble(vista.getModelAlimBebidas().getValueAt(filaSeleccionada, 5).toString());
			int SalidaAB = Integer.parseInt(vista.getTxtSalidaMaterialAB().getText());
			int TotalStock = Stock - SalidaAB;
			
			
			ie.setId(id);
			ie.setInsumo(Insumo);
			ie.setStockReal(TotalStock);
			ie.setStockReal(Integer.parseInt(vista.getTxtStockReal().getText()));
			ie.setValorUnitario(ValorUnitario);
			
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

			int ComboUnidadMedida = ie.getUnidadMedida();
			String UnidadMedida = vista.getComboBoxUM().getItemAt(ComboUnidadMedida).toString();
			int ValorTotal = ie.getValorUnitario() * ie.getStockReal();
			
			if(ie.getTipoProducto() == 0) {
				
				this.vista.getModelAlimBebidas().addRow(new  Object[] {
						ie.getId(),
						ie.getInsumo(),
						UnidadMedida,
						ie.getStockReal(),
						ie.getStockReal(),
						ie.getValorUnitario(),
						""+ValorTotal
						
				});
				
			}else if(ie.getTipoProducto() == 1) {
				
				this.vista.getModelMatOficina().addRow(new  Object[] {
						ie.getId(),
						ie.getInsumo(),
						UnidadMedida,
						ie.getStockReal(),
						ie.getStockReal(),
						ie.getValorUnitario(),
						""+ValorTotal
						
				});
				
				
			}else if(ie.getTipoProducto() == 2) {
				
				this.vista.getModelMatElectricos().addRow(new  Object[] {
						ie.getId(),
						ie.getInsumo(),
						UnidadMedida,
						ie.getStockReal(),
						ie.getStockReal(),
						ie.getValorUnitario(),
						""+ValorTotal
						
				});
				
				
			}else if(ie.getTipoProducto() == 3) {
				
				this.vista.getModelMatDiversos().addRow(new  Object[] {
						ie.getId(),
						ie.getInsumo(),
						UnidadMedida,
						ie.getStockReal(),
						ie.getStockReal(),
						ie.getValorUnitario(),
						""+ValorTotal
						
				});
				
				
			}
			
			
		}
	}

}
