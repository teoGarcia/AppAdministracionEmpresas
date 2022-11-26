package TerceroMedio.GestionComercialTrib.OC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import TerceroMedio.GestionComercialTrib.Cotizacion.EmpresaPersonaEntity;
import TerceroMedio.GestionComercialTrib.Cotizacion.RealizarCotizacionEntity;
import TerceroMedio.GestionComercialTrib.Cotizacion.RegistrarCotizacionEntity;
import TerceroMedio.GestionComercialTrib.OC.Imprimir.PanelImprimir;
import TerceroMedio.GestionComercialTrib.OC.Imprimir.VistaImprimir;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlOC implements ActionListener {
	
	private VistaOC vista;
	private RegistrarOCRepository repository;
	private RealizarOCRepository repositoryReaOC;
	private PanelImprimir pi;
	private VistaImprimir vi;

	public ControlOC(VistaOC vista) {
		this.repository = new RegistrarOCRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.repositoryReaOC = new RealizarOCRepository();
		this.repositoryReaOC.setEm(ManagerDB.getEntityManager());
		
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		/////////   COMIENZO GUARDAR O.C.   ///////////////	
		if(e.getSource().equals(vista.getBtnGuardarRegistroOC())) {
			
			if(vista.getTxtIDRegOC().getText().length() <= 0) {
				if(vista.camposVaciosRegistroOC()) {
					
					RegistrarOCEntity ie = new RegistrarOCEntity();
					
					ie.setSenores(vista.getTxtSenores().getText());
					ie.setRut(vista.getTxtRut().getText());
					ie.setNombreOC(vista.getTxtNombreOC().getText());
					ie.setNumeroOC(vista.getTxtNumeroOC().getText());
					ie.setFechaEnvio(vista.getFechaEnvioOC().getCalendar());
					ie.setFechaEntregaProd(vista.getFechaEntregaProd().getCalendar());
					ie.setEstado(vista.getTxtEstado().getText());
					ie.setDireccionDespacho(vista.getTxtDireccionDespacho().getText());
					ie.setDireccionEnvioFact(vista.getTxtDireccionEnvFac().getText());
					ie.setMetodoDespacho(vista.getTxtMetodoDespacho().getText());
					ie.setFormaPago(vista.getTxtFormaPago().getText());
					ie.setObservacion(vista.getTxtObservacion().getText());
					
					RegistrarOCEntity db = this.repository.create(ie);
					
					if(db != null) {
						Mensajes.Creacion();
						vista.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
		////////FIN GUARDAR    ///////////////	
				
		////////COMIENZO // ACTUALIZAR REGISTRAR O.C. ///////////////
			
			}else{
				if(vista.camposVaciosRegistroOC()) {
					
					RegistrarOCEntity ie = new RegistrarOCEntity();
					
					ie.setId(Long.parseLong(vista.getTxtIDRegOC().getText()));
					ie.setSenores(vista.getTxtSenores().getText());
					ie.setRut(vista.getTxtRut().getText());
					ie.setNombreOC(vista.getTxtNombreOC().getText());
					ie.setNumeroOC(vista.getTxtNumeroOC().getText());
					ie.setFechaEnvio(vista.getFechaEnvioOC().getCalendar());
					ie.setFechaEntregaProd(vista.getFechaEntregaProd().getCalendar());
					ie.setEstado(vista.getTxtEstado().getText());
					ie.setDireccionDespacho(vista.getTxtDireccionDespacho().getText());
					ie.setDireccionEnvioFact(vista.getTxtDireccionEnvFac().getText());
					ie.setMetodoDespacho(vista.getTxtMetodoDespacho().getText());
					ie.setFormaPago(vista.getTxtFormaPago().getText());
					ie.setObservacion(vista.getTxtObservacion().getText());
					
					RegistrarOCEntity db = this.repository.update(ie);
					
					if(db != null) {
						Mensajes.Actualizacion();
						vista.ActualizarVista();
					}
				}else {
					Mensajes.CamposVacios();
				}
			}	
			
		}
		
		
		else if(e.getSource().equals(vista.getBtnModificaRegistroOC())) {
			int row = vista.getTableRegistrarOC().getSelectedRow();
			if(row >= 0) {
			
				
				Long id = Long.parseLong(String.valueOf(vista.getModelTableRegistrarOC().getValueAt(row, 0)));
				RegistrarOCEntity ape = repository.find(id);
				vista.CargarFormRegistrarCotizacion(ape);
			
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
		//////// FIN ACTUALIZAR (MODIFICAR)    ///////////////
			
		//////// COMIENZO ELIMINAR REGISTRAR O.C.  ///////////////
		}else if(e.getSource().equals(vista.getBtnEliminarRegistroOC())) {
			int row = vista.getTableRegistrarOC().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelTableRegistrarOC().getValueAt(row, 0)));
				RegistrarOCEntity ape = repository.find(id);
				repository.delete(ape);
				vista.ActualizarVista();
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		//////// FIN ELIMINAR ///////////
		}
		
		/////////////COMIENZO GUARDAR REALIZAR OC /////////////////
		
		else if(e.getSource().equals(vista.getBtnGuardarRealizarOC())) {
			
			if(vista.getTxtIDRealizarOC().getText().length() <= 0) {
				if(vista.camposVaciosRealizarOC()) {
					
					RealizarOCEntity ie = new RealizarOCEntity();
					
					ie.setIdOC(Long.parseLong(vista.getTxtIDOC().getText()));//(null);
					ie.setCodLicitacion(vista.getTxtCodLicitacion().getText());
					ie.setProducto(vista.getTxtProducto().getText());
					ie.setCantidad(Integer.parseInt(vista.getTxtCantidad().getText()));
					ie.setEspecifComprador(vista.getTxtEspecifComprador().getText());
					ie.setEspecifProveedor(vista.getTxtEspecifProveedor().getText());
					ie.setValorUnitario(Integer.parseInt(vista.getTxtValorUnitario().getText()));
					ie.setCargo(Integer.parseInt(vista.getTxtCargo().getText()));
					ie.setDescuento(Integer.parseInt(vista.getTxtDescuento().getText()));
					ie.setUM(vista.getComboBoxUM().getSelectedIndex());
					
					RealizarOCEntity db = this.repositoryReaOC.create(ie);
					
					if(db != null) {
						Mensajes.Creacion();
						vista.actualizarTablaReaCot();
					}
				}else {
					Mensajes.CamposVacios();
				}
		////////FIN GUARDAR    ///////////////	
				
		////////COMIENZO // ACTUALIZAR REALIZAR O.C. ///////////////
			
			}else{
				if(vista.camposVaciosRealizarOC()) {
					
					RealizarOCEntity ie = new RealizarOCEntity();
					
					ie.setId(Long.parseLong(vista.getTxtIDRealizarOC().getText()));
					ie.setIdOC(Long.parseLong(vista.getTxtIDOC().getText()));//(null);
					ie.setCodLicitacion(vista.getTxtCodLicitacion().getText());
					ie.setProducto(vista.getTxtProducto().getText());
					ie.setCantidad(Integer.parseInt(vista.getTxtCantidad().getText()));
					ie.setEspecifComprador(vista.getTxtEspecifComprador().getText());
					ie.setEspecifProveedor(vista.getTxtEspecifProveedor().getText());
					ie.setValorUnitario(Integer.parseInt(vista.getTxtValorUnitario().getText()));
					ie.setCargo(Integer.parseInt(vista.getTxtCargo().getText()));
					ie.setDescuento(Integer.parseInt(vista.getTxtDescuento().getText()));
					ie.setUM(vista.getComboBoxUM().getSelectedIndex());
					
					RealizarOCEntity db = this.repositoryReaOC.update(ie);
					
					if(db != null) {
						Mensajes.Actualizacion();
						vista.actualizarTablaReaCot();
					}
				}else {
					Mensajes.CamposVacios();
				}
			}	
			
		}
		
		
		else if(e.getSource().equals(vista.getBtnModificarRealizarOC())) {
			int row = vista.getTableRealizarOC().getSelectedRow();
			if(row >= 0) {
			
				Long id = Long.parseLong(String.valueOf(vista.getModelTableRealizarOC().getValueAt(row, 0)));
				RealizarOCEntity ape = repositoryReaOC.find(id);
				vista.CargarFormRealizarCotizacion(ape);
			
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}	
		//////// FIN ACTUALIZAR (MODIFICAR)    ///////////////
			
		}//////// COMIENZO ELIMINAR REALIZAR O.C.  ///////////////
		
		else if(e.getSource().equals(vista.getBtnEliminarRealizarOC())) {
			int row = vista.getTableRealizarOC().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelTableRealizarOC().getValueAt(row, 0)));
				RealizarOCEntity ape = repositoryReaOC.find(id);
				repositoryReaOC.delete(ape);
				vista.actualizarTablaReaCot();
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
	//////// FIN ELIMINAR REALIZAR  COTIZACION ///////////
			
			
			
	///////// USAR DATOS /////////////////
		
		}else if(e.getSource().equals(vista.getBtnUsarDatosRegistrarOC())) {
			
			UsarDatos();
			LlenarTablaReaOC();
			
			
	///////// IMPRIMIR /////////////////
		}else if(e.getSource().equals(vista.getBtnImprimirOC())) {
			
			
			if (vista.camposVaciosImprimir()) {
				vi = new VistaImprimir();
				pi = vi.getPi();
				imprimir();
				LlenarTablaImprimir();
				
				vi.setVisible(true);
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Los campos no deben estar vacios / No hay ningun item en la tabla");
			}
		}
	}
	
	
	
	///////// USAR DATOS /////////////////
	
	public void UsarDatos() {
		
		int row = vista.getTableRegistrarOC().getSelectedRow();
		
		if(row >= 0) {
			
			String idOC = String.valueOf(vista.getModelTableRegistrarOC().getValueAt(row, 0));
			
			vista.getTxtIDOC().setText(idOC);
			
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}
	
	////////COMIENZO LLENAR TABLA REGISTRAR O.C. ///////////////
	public void LlenarTablaRegistrarOC() {
			
		Iterator<RegistrarOCEntity> lista = this.repository.findAll().iterator();
		this.vista.getModelTableRegistrarOC().getDataVector().removeAllElements();
		this.vista.getModelTableRegistrarOC().fireTableDataChanged();
			
		while(lista.hasNext()) {
			RegistrarOCEntity record = lista.next();
			this.vista.getModelTableRegistrarOC().addRow(new  Object[] {
					record.getId(),
					record.getSenores(),
					record.getRut(),
					record.getNombreOC(),
					record.getNumeroOC(),
					Helpers.getFechaFormat(record.getFechaEnvio()),
					Helpers.getFechaFormat(record.getFechaEntregaProd()),
					record.getEstado(),
					record.getDireccionEnvioFact(),
					record.getDireccionDespacho(),
					record.getMetodoDespacho(),
					record.getFormaPago(),
					record.getObservacion(),
			});
		}
			
	//////// FIN LLENAR TABLA ///////////////	
	}
	
////////COMIENZO LLENAR TABLA RALIZAR O.C. ///////////////
	
	public void LlenarTablaReaOC() {
		
		Long idOC = Long.parseLong(vista.getTxtIDOC().getText());
		
		if(idOC > 0 && vista.getTxtIDOC().getText() != null) {
			
			Iterator<RealizarOCEntity> lista = this.repositoryReaOC.findForReaCot(idOC).iterator();
			vista.getModelTableRealizarOC().getDataVector().removeAllElements();
			vista.getModelTableRealizarOC().fireTableDataChanged();	
			
			while (lista.hasNext()) {
				int total = 0;
				RealizarOCEntity record = lista.next();
				Long idOCompra = record.getIdOC();
				RealizarOCEntity ape = repositoryReaOC.find(idOCompra);
				total = record.getCantidad() * record.getValorUnitario();
				int seleccion1 = record.getUM();
				String UM = vista.getComboBoxUM().getItemAt(seleccion1).toString();
				vista.getModelTableRealizarOC()
						.addRow(new Object[] { 
								record.getId(),
								record.getCodLicitacion(),
								record.getProducto(),
								record.getCantidad(),
								UM,
								record.getEspecifComprador(),
								record.getEspecifProveedor(),
								record.getValorUnitario(),
								record.getDescuento(),
								record.getCargo(),
								total
								});
			}
			
			vista.calcularTotal();
			
		}
	}
	
	//////// FIN LLENAR TABLA REALIZAR O.C. ///////////////
	
	
	//////////////////  IMPRIMIR  /////////////////////////
	
	
	public void imprimir() {
				
				Long id = Long.parseLong(vista.getTxtIDOC().getText());
				RegistrarOCEntity e = repository.find(id);
				
				
				String fechaEnvio = Helpers.getFechaFormat(e.getFechaEnvio());
				String estado = e.getEstado();
				String numOrdenCompra = e.getNumeroOC();
				String senores = e.getSenores();
				String rut = e.getRut();
				String nombreOC = e.getNombreOC();
				String fechaEntrega = Helpers.getFechaFormat(e.getFechaEntregaProd());
				String direccionEnvio = e.getDireccionEnvioFact();
				String direccionDespacho = e.getDireccionDespacho();
				String metodo = e.getMetodoDespacho();
				String formaPago = e.getFormaPago();
				String observacion = e.getObservacion();

				pi.getLblFechaEnvioOC().setText(fechaEnvio);
				pi.getLblEstado().setText(estado);
				pi.getLblNumOC().setText(numOrdenCompra);
				pi.getLblSenores().setText(senores);
				pi.getLblRut().setText(rut);
				pi.getLblNombreOC().setText(nombreOC);
				pi.getLblFechaEntregaProd().setText(fechaEntrega);
				pi.getLblDireccionEnvio().setText(direccionEnvio);
				pi.getLblDireccionDespacho().setText(direccionDespacho);
				pi.getLblMetodoDespacho().setText(metodo);
				pi.getLblFormaPago().setText(formaPago);
				pi.getTxtObservacion().setText(observacion);

			
			
	}
	
	public void LlenarTablaImprimir() {
		
		Long idReaOC = Long.parseLong(vista.getTxtIDOC().getText());
		
		Iterator<RealizarOCEntity> lista = this.repositoryReaOC.findForReaCot(idReaOC).iterator();
		pi.getModelTableImprimir().getDataVector().removeAllElements();
		pi.getModelTableImprimir().fireTableDataChanged();
		
		while(lista.hasNext()) {
			int total = 0;
			RealizarOCEntity record = lista.next();
			Long idOCompra = record.getIdOC();
			RealizarOCEntity ape = repositoryReaOC.find(idOCompra);
			total = record.getCantidad() * record.getValorUnitario();
			int seleccion1 = record.getUM();
			String UM = vista.getComboBoxUM().getItemAt(seleccion1).toString();
			
			pi.getModelTableImprimir().addRow(new  Object[] {
					record.getCodLicitacion(),
					record.getProducto(),
					record.getCantidad(),
					UM,
					record.getEspecifComprador(),
					record.getEspecifProveedor(),
					record.getValorUnitario(),
					record.getDescuento(),
					record.getCargo(),
					total
			});
		}
		
		pi.calcularTotalImprimir();
			
	}
	
	//////////////////   FIN  IMPRIMIR  /////////////////////////

}
