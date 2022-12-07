package TerceroMedio.GestionComercialTrib.DocumentacionMercantil;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import TerceroMedio.GestionComercialTrib.Cotizacion.EmpresaPersonaEntity;
import TerceroMedio.GestionComercialTrib.Cotizacion.RealizarCotizacionEntity;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlDocumentos implements ActionListener {
	
	private VistaDocumentos vista;
	private RegistrarDocumentosRepository repositoryRegDoc;
	private RealizarDocumentosRepository repositoryReaDoc;
	private RegistrarGuiasRepository repositoryRegGui;
	private RealizarGuiasRepository repositoryReaGui;

	public ControlDocumentos(VistaDocumentos vista) {
		this.repositoryRegDoc = new RegistrarDocumentosRepository();
		this.repositoryRegDoc.setEm(ManagerDB.getEntityManager());
		this.repositoryReaDoc = new RealizarDocumentosRepository();
		this.repositoryReaDoc.setEm(ManagerDB.getEntityManager());
		this.repositoryRegGui = new RegistrarGuiasRepository();
		this.repositoryRegGui.setEm(ManagerDB.getEntityManager());
		this.repositoryReaGui = new RealizarGuiasRepository();
		this.repositoryReaGui.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			// DOCUMENTOS //
		
		if(e.getSource().equals(vista.getBtnGuardarRegDoc())) {

			if(vista.getTxtIdRegDoc().getText().length() <= 0) {

				guardarRegDoc();
			}else{
				
				modificarRegDoc();
			}
		}else if(e.getSource().equals(vista.getBtnModificarRegDoc())) {
			
			btnModificarRegDoc();
			
		}else if(e.getSource().equals(vista.getBtnEliminarRegDoc())) {
			
			eliminarRegDoc();
			
		}else if(e.getSource().equals(vista.getBtnUsarDatosRegDoc())) {
			
			usarDatosRegDoc();
			LlenarTablaReaDoc();
			
		}else if(e.getSource().equals(vista.getBtnGuardarReaDoc())) {

			if(vista.getTxtIDReaDoc().getText().length() <= 0) {

				guardarReaDoc();
			}else{
				
				modificarReaDoc();
			}
		}else if(e.getSource().equals(vista.getBtnModificarReaDoc())) {
			
			btnModificarReaDoc();
			
		}else if(e.getSource().equals(vista.getBtnEliminarReaDoc())) {
			
			eliminarReaDoc();
			
		}else if(e.getSource().equals(vista.getBtnImprimirReaDoc())) {
			
			// GUIAS DE TRASLADO///
			
		}else if(e.getSource().equals(vista.getBtnGuardarRegGuia())) {

			if(vista.getTxtIDRegGui().getText().length() <= 0) {

				guardarRegGui();
			}else{
				
				modificarRegGui();
			}
		}else if(e.getSource().equals(vista.getBtnModificarRegGuia())) {
			
			btnModificarRegGui();
			
		}else if(e.getSource().equals(vista.getBtnEliminarRegGuia())) {
			
			eliminarRegGui();
			
		}else if(e.getSource().equals(vista.getBtnUsarDatosRegGui())) {
			
			usarDatosRegGui();
			LlenarTablaReaGui();
			
		}else if(e.getSource().equals(vista.getBtnGuardarReaGui())) {

			if(vista.getTxtIDReaGui().getText().length() <= 0) {

				guardarReaGui();
			}else{
				
				modificarReaGui();
			}
		}else if(e.getSource().equals(vista.getBtnModificarReaGui())) {
			
			btnModificarReaGui();
			
		}else if(e.getSource().equals(vista.getBtnEliminarReaGui())) {
			
			eliminarReaGui();
			
		}else if(e.getSource().equals(vista.getBtnImprimirReaGui())) {
			
			
		}
		
	}
	
		//  REGISTRAR DOCUMENTOS  //
	public void guardarRegDoc() {
		
			if(vista.camposVaciosRegDoc()) {
				
				RegistrarDocumentosEntity ie = new RegistrarDocumentosEntity();
				
				ie.setTipoDocumento(vista.getComboBoxTipoDoc().getSelectedIndex());
				ie.setNumeroDocumento(vista.getTxtNumDocumento().getText());
				ie.setRut(vista.getTxtRutRegDoc().getText());
				ie.setSenores(vista.getTxtSenoresRegDoc().getText());
				ie.setGiro(vista.getTxtGiro().getText());
				ie.setDireccion(vista.getTxtDireccion().getText());
				ie.setComuna(vista.getTxtComuna().getText());
				ie.setCiudad(vista.getTxtCiudad().getText());
				ie.setTelefono(vista.getTxtTelefono().getText());
				ie.setFechaEmision(vista.getFechaEmisionRegDoc().getCalendar());
				ie.setTipoCompra(vista.getTxtTipoCompraRegDoc().getText());
				
				RegistrarDocumentosEntity db = this.repositoryRegDoc.create(ie);
				
				if(db != null) {
					Mensajes.Creacion();
					vista.ActualizarVistaRegDoc();
				}
			}else {
				Mensajes.CamposVacios();
			}
		
	}
	
	public void modificarRegDoc(){

		
		if(vista.camposVaciosRegDoc()) {
			
			RegistrarDocumentosEntity ie = new RegistrarDocumentosEntity();
			
			ie.setId(Long.parseLong(vista.getTxtIdRegDoc().getText()));
			ie.setTipoDocumento(vista.getComboBoxTipoDoc().getSelectedIndex());
			ie.setNumeroDocumento(vista.getTxtNumDocumento().getText());
			ie.setRut(vista.getTxtRutRegDoc().getText());
			ie.setSenores(vista.getTxtSenoresRegDoc().getText());
			ie.setGiro(vista.getTxtGiro().getText());
			ie.setDireccion(vista.getTxtDireccion().getText());
			ie.setComuna(vista.getTxtComuna().getText());
			ie.setCiudad(vista.getTxtCiudad().getText());
			ie.setTelefono(vista.getTxtTelefono().getText());
			ie.setFechaEmision(vista.getFechaEmisionRegDoc().getCalendar());
			ie.setTipoCompra(vista.getTxtTipoCompraRegDoc().getText());
			
			RegistrarDocumentosEntity db = this.repositoryRegDoc.update(ie);
			
			if(db != null) {
				Mensajes.Actualizacion();
				vista.ActualizarVistaRegDoc();
			}
		}else {
			Mensajes.CamposVacios();
		}
	
	}
	
	public void btnModificarRegDoc() {
	
		int row = vista.getTableRegDoc().getSelectedRow();
		if(row >= 0) {
		
			Long id = Long.parseLong(String.valueOf(vista.getModelTableRegDoc().getValueAt(row, 0)));
			RegistrarDocumentosEntity ape = repositoryRegDoc.find(id);
			vista.CargarFormRegDoc(ape);
		
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void eliminarRegDoc() {
		
		int row = vista.getTableRegDoc().getSelectedRow();
		if(row >= 0) {
			
			Long id = Long.parseLong(String.valueOf(vista.getModelTableRegDoc().getValueAt(row, 0)));
			RegistrarDocumentosEntity ape = repositoryRegDoc.find(id);
			repositoryRegDoc.delete(ape);
			vista.ActualizarVistaRegDoc();
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void LlenarTablaRegDoc() {
			
		Iterator<RegistrarDocumentosEntity> lista = this.repositoryRegDoc.findAll().iterator();
		this.vista.getModelTableRegDoc().getDataVector().removeAllElements();
		this.vista.getModelTableRegDoc().fireTableDataChanged();
			
		while(lista.hasNext()) {
			RegistrarDocumentosEntity record = lista.next();
			String tipoDocumento = vista.getComboBoxTipoDoc().getItemAt(record.getTipoDocumento()).toString();
			this.vista.getModelTableRegDoc().addRow(new  Object[] {
					record.getId(),
					tipoDocumento,
					record.getSenores(),
					record.getRut(),
					record.getNumeroDocumento(),
					Helpers.getFechaFormat(record.getFechaEmision()),
					record.getGiro(),
					record.getDireccion(),
					record.getComuna(),
					record.getCiudad(),
					record.getTelefono(),
					record.getTipoCompra()
			});
		}
	}
	
	public void usarDatosRegDoc() {
		
		int row = vista.getTableRegDoc().getSelectedRow();
		
		if(row >= 0) {
			
			String id = String.valueOf(vista.getModelTableRegDoc().getValueAt(row, 0));
			String Senores = String.valueOf(vista.getModelTableRegDoc().getValueAt(row, 2));
			String TipoDoc = String.valueOf(vista.getModelTableRegDoc().getValueAt(row, 1));
			
			vista.getTxtIDDoc().setText(id);
			vista.getTxtSenoresReaDoc().setText(Senores);
			vista.getTxtTipoDocumento().setText(TipoDoc);
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}
		//  FIN REGISTRAR DOCUMENTOS  //
	
	
		//  REALIZAR DOCUMENTOS  //
	public void guardarReaDoc() {
		
			if(vista.camposVaciosReaDoc()) {
				
				RealizarDocumentosEntity ie = new RealizarDocumentosEntity();
				
				ie.setIdDocumento(Long.parseLong(vista.getTxtIDDoc().getText()));
				ie.setCodigo(vista.getTxtCodigoReaDoc().getText());
				ie.setDescripcion(vista.getTxtDescripcionReaDoc().getText());
				ie.setCantidad(Integer.parseInt(vista.getTxtCantidadReaDoc().getText()));
				ie.setPrecioUnitario(Integer.parseInt(vista.getTxtPrecioUniReaDoc().getText()));
				ie.setImpuestoAdicional(Integer.parseInt(vista.getTxtImpAdicionalReaDoc().getText()));
				
				RealizarDocumentosEntity db = this.repositoryReaDoc.create(ie);
				
				if(db != null) {
					Mensajes.Creacion();
					vista.ActualizarVistaReaDoc();
				}
			}else {
				Mensajes.CamposVacios();
			}
		
	}
	
	public void modificarReaDoc(){

		
		if(vista.camposVaciosReaDoc()) {
			
			RealizarDocumentosEntity ie = new RealizarDocumentosEntity();
			
			ie.setId(Long.parseLong(vista.getTxtIDReaDoc().getText()));
			ie.setIdDocumento(Long.parseLong(vista.getTxtIDDoc().getText()));
			ie.setCodigo(vista.getTxtCodigoReaDoc().getText());
			ie.setDescripcion(vista.getTxtDescripcionReaDoc().getText());
			ie.setCantidad(Integer.parseInt(vista.getTxtCantidadReaDoc().getText()));
			ie.setPrecioUnitario(Integer.parseInt(vista.getTxtPrecioUniReaDoc().getText()));
			ie.setImpuestoAdicional(Integer.parseInt(vista.getTxtImpAdicionalReaDoc().getText()));
			
			RealizarDocumentosEntity db = this.repositoryReaDoc.update(ie);
			
			if(db != null) {
				Mensajes.Actualizacion();
				vista.ActualizarVistaReaDoc();
			}
		}else {
			Mensajes.CamposVacios();
		}
	
	}
	
	public void btnModificarReaDoc() {
	
		int row = vista.getTableReaDoc().getSelectedRow();
		if(row >= 0) {
		
			Long id = Long.parseLong(String.valueOf(vista.getModelTableReaDoc().getValueAt(row, 0)));
			RealizarDocumentosEntity ape = repositoryReaDoc.find(id);
			vista.CargarFormReaDoc(ape);
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void eliminarReaDoc() {
		
		int row = vista.getTableReaDoc().getSelectedRow();
		if(row >= 0) {
			
			Long id = Long.parseLong(String.valueOf(vista.getModelTableReaDoc().getValueAt(row, 0)));
			RealizarDocumentosEntity ape = repositoryReaDoc.find(id);
			repositoryReaDoc.delete(ape);
			vista.ActualizarVistaReaDoc();
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void LlenarTablaReaDoc() {

		
		Long idReaDoc = Long.parseLong(vista.getTxtIDDoc().getText());
		
		if(idReaDoc > 0 && vista.getTxtIDDoc().getText() != null) {
			
			Iterator<RealizarDocumentosEntity> lista = this.repositoryReaDoc.findForReaDoc(idReaDoc).iterator();
			vista.getModelTableReaDoc().getDataVector().removeAllElements();
			vista.getModelTableReaDoc().fireTableDataChanged();	
			
			while (lista.hasNext()) {
				RealizarDocumentosEntity record = lista.next();
				int valorUnitario = record.getPrecioUnitario();
				int cantidad = record.getCantidad();
				int Total = valorUnitario * cantidad;
				//int Neto = (int) (Total / 1.19);
				//int IVA = Total - Neto;
				vista.getModelTableReaDoc()
						.addRow(new Object[] { 
								record.getId(),
								record.getCodigo(),
								record.getDescripcion(),
								record.getCantidad(),
								valorUnitario,
								record.getImpuestoAdicional(),
								Total
								
								});
			}
			
			vista.calcularTotalReaDoc();
			
		}
	}
		//  FIN REALIZAR DOCUMENTOS  //
	
	
		//  REGISTRAR GUIAS  //
	public void guardarRegGui() {
	
		if(vista.camposVaciosRegGui()) {
			
			RegistrarGuiasEntity ie = new RegistrarGuiasEntity();
			
			ie.setSenores(vista.getTextFieldSenoresRegGuia().getText());
			ie.setRut(vista.getTxtRutRegGuia().getText());
			ie.setNumeroDocumento(vista.getTxtNumDocRegGuia().getText());
			ie.setFechaEmision(vista.getFechaEmisionRegGuia().getCalendar());
			ie.setGiro(vista.getTxtGiroRegGuia().getText());
			ie.setDireccion(vista.getTxtDireccionRegGuia().getText());
			ie.setComuna(vista.getTxtComunaRegGuia().getText());
			ie.setCiudad(vista.getTxtCiudadRegGuia().getText());
			ie.setTelefono(vista.getTxtTelefonoRegGuia().getText());
			ie.setTipoTraslado(vista.getTxtTipoTrasladoRegGuia().getText());
			ie.setRutTransportista(vista.getTxtRutTranspRegGuia().getText());
			ie.setPatente(vista.getTxtPatente().getText());
			ie.setRutChofer(vista.getTxtRutChofer().getText());
			ie.setNombreChofer(vista.getTxtNombreChofer().getText());
			
			RegistrarGuiasEntity db = this.repositoryRegGui.create(ie);
			
			if(db != null) {
				Mensajes.Creacion();
				vista.ActualizarVistaRegGui();
			}
		}else {
			Mensajes.CamposVacios();
		}
	
	}

	public void modificarRegGui(){
	
		
		if(vista.camposVaciosRegGui()) {
			
			RegistrarGuiasEntity ie = new RegistrarGuiasEntity();
			
			ie.setId(Long.parseLong(vista.getTxtIDRegGui().getText()));
			ie.setSenores(vista.getTextFieldSenoresRegGuia().getText());
			ie.setRut(vista.getTxtRutRegGuia().getText());
			ie.setNumeroDocumento(vista.getTxtNumDocRegGuia().getText());
			ie.setFechaEmision(vista.getFechaEmisionRegGuia().getCalendar());
			ie.setGiro(vista.getTxtGiroRegGuia().getText());
			ie.setDireccion(vista.getTxtDireccionRegGuia().getText());
			ie.setComuna(vista.getTxtComunaRegGuia().getText());
			ie.setCiudad(vista.getTxtCiudadRegGuia().getText());
			ie.setTelefono(vista.getTxtTelefonoRegGuia().getText());
			ie.setTipoTraslado(vista.getTxtTipoTrasladoRegGuia().getText());
			ie.setRutTransportista(vista.getTxtRutTranspRegGuia().getText());
			ie.setPatente(vista.getTxtPatente().getText());
			ie.setRutChofer(vista.getTxtRutChofer().getText());
			ie.setNombreChofer(vista.getTxtNombreChofer().getText());
			
			RegistrarGuiasEntity db = this.repositoryRegGui.update(ie);
			
			if(db != null) {
				Mensajes.Actualizacion();
				vista.ActualizarVistaRegGui();
			}
		}else {
			Mensajes.CamposVacios();
		}
	
	}
	
	public void btnModificarRegGui() {
	
		int row = vista.getTableRegGuia().getSelectedRow();
		if(row >= 0) {
		
			Long id = Long.parseLong(String.valueOf(vista.getModelTableRegistrarGuia().getValueAt(row, 0)));
			RegistrarGuiasEntity ape = repositoryRegGui.find(id);
			vista.CargarFormRegGui(ape);
		
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void eliminarRegGui() {
		
		int row = vista.getTableRegGuia().getSelectedRow();
		if(row >= 0) {
			
			Long id = Long.parseLong(String.valueOf(vista.getModelTableRegistrarGuia().getValueAt(row, 0)));
			RegistrarGuiasEntity ape = repositoryRegGui.find(id);
			repositoryRegGui.delete(ape);
			vista.ActualizarVistaRegGui();
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void LlenarTablaRegGui() {
		
		Iterator<RegistrarGuiasEntity> lista = this.repositoryRegGui.findAll().iterator();
		this.vista.getModelTableRegistrarGuia().getDataVector().removeAllElements();
		this.vista.getModelTableRegistrarGuia().fireTableDataChanged();
			
		while(lista.hasNext()) {
			RegistrarGuiasEntity record = lista.next();
			this.vista.getModelTableRegistrarGuia().addRow(new  Object[] {
					record.getId(),
					record.getNumeroDocumento(),
					record.getSenores(),
					record.getRut(),
					Helpers.getFechaFormat(record.getFechaEmision()),
					record.getGiro(),
					record.getDireccion(),
					record.getComuna(),
					record.getCiudad(),
					record.getTelefono(),
					record.getTipoTraslado(),
					record.getRutTransportista(),
					record.getPatente(),
					record.getNombreChofer(),
					record.getRutChofer()
					
			});
		}
	}

	public void usarDatosRegGui() {
	
		int row = vista.getTableRegGuia().getSelectedRow();
		
		if(row >= 0) {
			
			String id = String.valueOf(vista.getModelTableRegistrarGuia().getValueAt(row, 0));
			String numeroDoc = String.valueOf(vista.getModelTableRegistrarGuia().getValueAt(row, 1));
			String Senores = String.valueOf(vista.getModelTableRegistrarGuia().getValueAt(row, 2));
			
			
			vista.getTxtIDGuia().setText(id);
			vista.getTxtSenoresReaGuia().setText(Senores);
			vista.getTxtNumeroDocumentoReaGuia().setText(numeroDoc);
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
}
		//  FIN REGISTRAR GUIAS  //
	
		//  REALIZAR GUIAS  //
	public void guardarReaGui() {
		
			if(vista.camposVaciosReaGui()) {
				
				RealizarGuiasEntity ie = new RealizarGuiasEntity();
				
				ie.setIdGuia(Long.parseLong(vista.getTxtIDGuia().getText()));
				ie.setCodigo(vista.getTxtCodReaGuia().getText());
				ie.setDescripcion(vista.getTxtDescripcionReaGui().getText());
				ie.setCantidad(Integer.parseInt(vista.getTxtCantidadReaGui().getText()));
				ie.setPrecioUnitario(Integer.parseInt(vista.getTxtPrecioUniReaGui().getText()));
				ie.setImpuestoAdicional(Integer.parseInt(vista.getTxtImpAdicionalReaGui().getText()));
				
				RealizarGuiasEntity db = this.repositoryReaGui.create(ie);
				
				if(db != null) {
					Mensajes.Creacion();
					vista.ActualizarVistaReaGui();
				}
			}else {
				Mensajes.CamposVacios();
			}
		
	}
	
	public void modificarReaGui(){

		
		if(vista.camposVaciosReaGui()) {
			
			RealizarGuiasEntity ie = new RealizarGuiasEntity();
			
			ie.setId(Long.parseLong(vista.getTxtIDReaGui().getText()));
			ie.setIdGuia(Long.parseLong(vista.getTxtIDGuia().getText()));
			ie.setCodigo(vista.getTxtCodReaGuia().getText());
			ie.setDescripcion(vista.getTxtDescripcionReaGui().getText());
			ie.setCantidad(Integer.parseInt(vista.getTxtCantidadReaGui().getText()));
			ie.setPrecioUnitario(Integer.parseInt(vista.getTxtPrecioUniReaGui().getText()));
			ie.setImpuestoAdicional(Integer.parseInt(vista.getTxtImpAdicionalReaGui().getText()));
			
			RealizarGuiasEntity db = this.repositoryReaGui.update(ie);
			
			if(db != null) {
				Mensajes.Actualizacion();
				vista.ActualizarVistaReaGui();
			}
		}else {
			Mensajes.CamposVacios();
		}
	
	}
	
	public void btnModificarReaGui() {
	
		int row = vista.getTableReaGui().getSelectedRow();
		if(row >= 0) {
		
			Long id = Long.parseLong(String.valueOf(vista.getModelTableRealizarGuia().getValueAt(row, 0)));
			RealizarGuiasEntity ape = repositoryReaGui.find(id);
			vista.CargarFormReaGui(ape);
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void eliminarReaGui() {
		
		int row = vista.getTableReaGui().getSelectedRow();
		if(row >= 0) {
			
			Long id = Long.parseLong(String.valueOf(vista.getModelTableRealizarGuia().getValueAt(row, 0)));
			RealizarGuiasEntity ape = repositoryReaGui.find(id);
			repositoryReaGui.delete(ape);
			vista.ActualizarVistaReaGui();
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void LlenarTablaReaGui() {

		
		Long idReaGui = Long.parseLong(vista.getTxtIDGuia().getText());
		
		if(idReaGui > 0 && vista.getTxtIDGuia().getText() != null) {
			
			Iterator<RealizarGuiasEntity> lista = this.repositoryReaGui.findForReaGui(idReaGui).iterator();
			vista.getModelTableRealizarGuia().getDataVector().removeAllElements();
			vista.getModelTableRealizarGuia().fireTableDataChanged();	
			
			while (lista.hasNext()) {
				RealizarGuiasEntity record = lista.next();
				int valorUnitario = record.getPrecioUnitario();
				int cantidad = record.getCantidad();
				int Total = valorUnitario * cantidad;
				//int Neto = (int) (Total / 1.19);
				//int IVA = Total - Neto;
				vista.getModelTableRealizarGuia()
						.addRow(new Object[] { 
								record.getId(),
								record.getCodigo(),
								record.getDescripcion(),
								record.getCantidad(),
								valorUnitario,
								record.getImpuestoAdicional(),
								Total
								
								});
			}
			
			vista.calcularTotalReaGui();
			
		}
	}
		//  FIN REALIZAR DOCUMENTOS  //

}


