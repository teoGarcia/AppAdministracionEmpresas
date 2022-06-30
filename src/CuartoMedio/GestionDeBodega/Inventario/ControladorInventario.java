package CuartoMedio.GestionDeBodega.Inventario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacion;
import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacionRepository;
import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.ModeloHonorarios;
import CuartoMedio.LegislacionLaboral.Contratos.Honorarios.VistaHonorarios;
import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;
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
			
		}
		
		
	}

}
