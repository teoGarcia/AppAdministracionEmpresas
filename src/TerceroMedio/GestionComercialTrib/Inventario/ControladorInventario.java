package TerceroMedio.GestionComercialTrib.Inventario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import TerceroMedio.GestionComercialTrib.Inventario.Imprimir.PanelImprimir;
import TerceroMedio.GestionComercialTrib.Inventario.Imprimir.VistaImprimir;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;
import ui.TablaUi.TableStandard;

public class ControladorInventario implements ActionListener {

	private InventarioRepository3 repository;
	private VistaInventario vista;
	private VistaImprimir vi;
	private PanelImprimir pi;
	
	public ControladorInventario(VistaInventario vista) {
		
		this.repository = new InventarioRepository3();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(vista.getBtnGuardar())) {
			
			if(vista.getTxtId().getText().length() <= 0) {
				if(vista.camposVacios()) {
					
					InventarioEntity3 ie = new InventarioEntity3();
					
					ie.setTipoProducto(vista.getComboBoxTipoProducto().getSelectedIndex());
					ie.setInsumo(vista.getTxtInsumo().getText());
					ie.setUnidadMedida(vista.getComboBoxUM().getSelectedIndex());
					ie.setStockReal(Integer.parseInt(vista.getTxtStockReal().getText()));
					ie.setValorUnitario(Integer.parseInt(vista.getTxtValorUnitario().getText()));
					
					InventarioEntity3 db = this.repository.create(ie);
					
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
					
					InventarioEntity3 ie = new InventarioEntity3();
					
					ie.setId(Long.parseLong(vista.getTxtId().getText()));
					ie.setTipoProducto(vista.getComboBoxTipoProducto().getSelectedIndex());
					ie.setInsumo(vista.getTxtInsumo().getText());
					ie.setUnidadMedida(vista.getComboBoxUM().getSelectedIndex());
					ie.setStockReal(Integer.parseInt(vista.getTxtStockReal().getText()));
					ie.setValorUnitario(Integer.parseInt(vista.getTxtValorUnitario().getText()));
					
					InventarioEntity3 db = this.repository.update(ie);
					
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
				InventarioEntity3 ape = repository.find(id);
				vista.CargarFormAB(ape);
			
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
		
		}else if(e.getSource().equals(vista.getBtnEliminarAB())) {
			int row = vista.getTableAlimentosBebidas().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelAlimBebidas().getValueAt(row, 0)));
				InventarioEntity3 ape = repository.find(id);
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
				InventarioEntity3 ape = repository.find(id);
				vista.CargarFormAB(ape);
			
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
		
		}else if(e.getSource().equals(vista.getBtnEliminarMO())) {
			int row = vista.getTableMaterialesOficina().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelMatOficina().getValueAt(row, 0)));
				InventarioEntity3 ape = repository.find(id);
				repository.delete(ape);
				vista.ActualizarVista();
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		
		}//////////////////////////////////////////////////////////////////////
		
		else if(e.getSource().equals(vista.getBtnModificarME())) {
			int row = vista.getTableMaterialesElectricos().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vista.getModelMatElectricos().getValueAt(row, 0)));
				InventarioEntity3 ape = repository.find(id);
				vista.CargarFormAB(ape);
			
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
		
		}else if(e.getSource().equals(vista.getBtnEliminarME())) {
			int row = vista.getTableMaterialesElectricos().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelMatElectricos().getValueAt(row, 0)));
				InventarioEntity3 ape = repository.find(id);
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
				InventarioEntity3 ape = repository.find(id);
				vista.CargarFormAB(ape);
			
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
		
		}else if(e.getSource().equals(vista.getBtnEliminarMD())) {
			int row = vista.getTableMaterialesDiversos().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelMatDiversos().getValueAt(row, 0)));
				InventarioEntity3 ape = repository.find(id);
				repository.delete(ape);
				vista.ActualizarVista();
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		
		}else if(e.getSource().equals(vista.getBtnImprimirAB())) {
			
			Imprimir(vista.getTableAlimentosBebidas(), vista.getModelAlimBebidas(), "Alimentos y Bebidas");
			
		}else if(e.getSource().equals(vista.getBtnImprimirMO())) {
			
			Imprimir(vista.getTableMaterialesOficina(), vista.getModelMatOficina(), "Materiales de Oficina");
			
		}else if(e.getSource().equals(vista.getBtnImprimirME())) {
			
			Imprimir(vista.getTableMaterialesElectricos(), vista.getModelMatElectricos(), "Materiales Eléctricos");
			
		}else if(e.getSource().equals(vista.getBtnImprimirMD())) {
			
			Imprimir(vista.getTableMaterialesDiversos(), vista.getModelMatDiversos(), "Materiales, repuestos y útiles Diversos para mantención y reparación");
			
		}
		
	}
	
	public void LlenarTabla() {
		
		Iterator<InventarioEntity3> lista = this.repository.findAll().iterator();
		
		this.vista.getModelAlimBebidas().getDataVector().removeAllElements();
		this.vista.getModelAlimBebidas().fireTableDataChanged();
		
		this.vista.getModelMatOficina().getDataVector().removeAllElements();
		this.vista.getModelMatOficina().fireTableDataChanged();
		
		this.vista.getModelMatElectricos().getDataVector().removeAllElements();
		this.vista.getModelMatElectricos().fireTableDataChanged();
		
		this.vista.getModelMatDiversos().getDataVector().removeAllElements();
		this.vista.getModelMatDiversos().fireTableDataChanged();
		
		
		while(lista.hasNext()) {
			
			InventarioEntity3 ie = lista.next();

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
	
	public void Imprimir(TableStandard table, DefaultTableModel model, String TipoProducto) {
		
		int row = table.getSelectedRow();
		
		if(row >= 0) {
			
			String Total = table.getModel().getValueAt(table.getSelectedRow(), 6).toString();
			Long id = Long.parseLong(String.valueOf(model.getValueAt(row, 0)));
			
			vi = new VistaImprimir();
			
			InventarioEntity3 ape = repository.find(id);		   
			
			int seleccion1 = ape.getUnidadMedida();
			String UM = vista.getComboBoxUM().getItemAt(seleccion1).toString();
		    
			pi = vi.getPi();
			pi.CargarForm(ape);
			pi.getLblUM().setText(UM);
			pi.getLblTipoProducto().setText(TipoProducto);
			pi.getLblValorTotal().setText(Helpers.ponerPuntos(Total));
			
			vi.setVisible(true);
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}


}
