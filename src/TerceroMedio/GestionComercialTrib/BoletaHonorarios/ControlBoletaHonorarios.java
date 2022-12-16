package TerceroMedio.GestionComercialTrib.BoletaHonorarios;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import TerceroMedio.GestionComercialTrib.BoletaHonorarios.Imprimir.PanelImprimir;
import TerceroMedio.GestionComercialTrib.BoletaHonorarios.Imprimir.VistaImprimir;
import TerceroMedio.GestionComercialTrib.DocumentacionMercantil.RealizarDocumentosEntity;
import TerceroMedio.GestionComercialTrib.DocumentacionMercantil.RegistrarDocumentosEntity;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlBoletaHonorarios implements ActionListener {
	
	private VistaBoletaHonorarios vista;
	private VistaImprimir vi;
	private PanelImprimir pi;
	private RegBoletaHonorarioRepository repositoryRegBH;
	private ReaBoletaHonorariosRepository repositoryReaBH;
	
	public ControlBoletaHonorarios(VistaBoletaHonorarios vista) {
		this.repositoryRegBH = new RegBoletaHonorarioRepository();
		this.repositoryRegBH.setEm(ManagerDB.getEntityManager());
		this.repositoryReaBH = new ReaBoletaHonorariosRepository();
		this.repositoryReaBH.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(vista.getBtnGuardarRegistroBH())) {

			if(vista.getTxtIDRegBH().getText().length() <= 0) {

				guardarRegBH();
			}else{
				
				modificarRegBH();
			}
		}else if(e.getSource().equals(vista.getBtnModificaRegistroDatos())) {
			
			btnModificarRegBH();
			
		}else if(e.getSource().equals(vista.getBtnEliminarRegistroDatos())) {
			
			eliminarRegBH();
			
		}else if(e.getSource().equals(vista.getBtnUsarDatosRegistrarDatos())) {
			
			usarDatosRegBH();
			LlenarTablaReaBH();
			
		}else if(e.getSource().equals(vista.getBtnGuardarRealizarBH())) {

			if(vista.getTxtIDRealizarBH().getText().length() <= 0) {

				guardarReaBH();
			}else{
				
				modificarReaBH();
			}
		}else if(e.getSource().equals(vista.getBtnModificarRealizarBH())) {
			
			btnModificarReaBH();
			
		}else if(e.getSource().equals(vista.getBtnEliminarRealizarBH())) {
			
			eliminarReaBH();
			
		}else if(e.getSource().equals(vista.getBtnImprimirBH())) {
			
			if(vista.getTxtIDDatos().getText().length() > 0 && vista.getModelTableReaBH().getRowCount() >  0) {
				
				vi = new VistaImprimir();
				pi = vi.getPi();
				imprimirDocs();;
				LlenarTablaImprimirDocs();
					
				pi.setVisible(true);
				
				vi.setVisible(true);
			
			}else {
				
				JOptionPane.showMessageDialog(null, "Debe llenar los campos / Debe llenar la tabla");
			}
		}
	}
		
		
		public void imprimirDocs() {

			Long id = Long.parseLong(vista.getTxtIDDatos().getText());
			RegBoletaHonorariosEntity e = repositoryRegBH.find(id);
			String FechaEmision = Helpers.getFechaFormat(e.getFecha());
			pi.getLblNombreTitular().setText(e.getNombreTitular());
			
			pi.getLblNumeroDocBH().setText("Nro. "+e.getNumeroBH());
			
			pi.getLblRutTitular().setText(e.getRutTitular());
			pi.getLblGiroTitular().setText(e.getGiroTitular());
			pi.getLblDireccionTitular().setText(e.getDireccionTitular());
			pi.getLblTelefonoTitular().setText(e.getTelefonoTitular());
			pi.getLblSenoresEmpresa().setText(e.getNombreEmpresa());
			pi.getLblDireccionEmpresa().setText(e.getDireccionEmpresa());
			pi.getLblRutEmpresa().setText(e.getRutEmpresa());
			pi.getLblFechaE().setText(FechaEmision);
			
		}

		
		public void LlenarTablaImprimirDocs() {
		
			Long idReaDoc = Long.parseLong(vista.getTxtIDDatos().getText());
			
			if(idReaDoc > 0 && vista.getTxtIDDatos().getText() != null) {
				
				Iterator<ReaBoletaHonorariosEntity> lista = this.repositoryReaBH.findForReaBH(idReaDoc).iterator();
				pi.getModelTableImprimir().getDataVector().removeAllElements();
				pi.getModelTableImprimir().fireTableDataChanged();	
				
				while (lista.hasNext()) {
					ReaBoletaHonorariosEntity record = lista.next();
				
					
					pi.getModelTableImprimir()
							.addRow(new Object[] { 
									record.getId(),
									record.getDescripcion(),
									record.getValor()
									});
				}
				
				pi.calcularTotalImprimir();
				
			}
		}

	//  REGISTRAR BH  //
	public void guardarRegBH() {
		
			if(vista.camposVaciosRegistroBH()) {
				
				RegBoletaHonorariosEntity ie = new RegBoletaHonorariosEntity();
				
				ie.setNumeroBH(vista.getTxtNumeroBH().getText());
				ie.setNombreTitular(vista.getTxtNombreTitular().getText());
				ie.setRutTitular(vista.getTxtRutTitular().getText());
				ie.setGiroTitular(vista.getTxtGiroTitular().getText());
				ie.setDireccionTitular(vista.getTxtDireccionTitular().getText());
				ie.setTelefonoTitular(vista.getTxtTelefonoTitular().getText());
				ie.setNombreEmpresa(vista.getTxtNombreEmpresa().getText());
				ie.setRutEmpresa(vista.getTxtRutEmpresa().getText());
				ie.setDireccionEmpresa(vista.getTxtDireccionEmpresa().getText());
				ie.setFecha(vista.getFecha().getCalendar());
				
				RegBoletaHonorariosEntity db = this.repositoryRegBH.create(ie);
				
				if(db != null) {
					Mensajes.Creacion();
					vista.ActualizarRegVistaBH();;
				}
			}else {
				Mensajes.CamposVacios();
			}
		
	}

	public void modificarRegBH(){
	
		
		if(vista.camposVaciosRegistroBH()) {
			
			RegBoletaHonorariosEntity ie = new RegBoletaHonorariosEntity();
			
			ie.setId(Long.parseLong(vista.getTxtIDRegBH().getText()));
			ie.setNumeroBH(vista.getTxtNumeroBH().getText());
			ie.setNombreTitular(vista.getTxtNombreTitular().getText());
			ie.setRutTitular(vista.getTxtRutTitular().getText());
			ie.setGiroTitular(vista.getTxtGiroTitular().getText());
			ie.setDireccionTitular(vista.getTxtDireccionTitular().getText());
			ie.setTelefonoTitular(vista.getTxtTelefonoTitular().getText());
			ie.setNombreEmpresa(vista.getTxtNombreEmpresa().getText());
			ie.setRutEmpresa(vista.getTxtRutEmpresa().getText());
			ie.setDireccionEmpresa(vista.getTxtDireccionEmpresa().getText());
			ie.setFecha(vista.getFecha().getCalendar());
			
			RegBoletaHonorariosEntity db = this.repositoryRegBH.update(ie);
			
			if(db != null) {
				Mensajes.Actualizacion();
				vista.ActualizarRegVistaBH();
			}
		}else {
			Mensajes.CamposVacios();
		}
	
	}

	public void btnModificarRegBH() {
	
		int row = vista.getTableRegistrarBH().getSelectedRow();
		if(row >= 0) {
		
			Long id = Long.parseLong(String.valueOf(vista.getModelTableRegBH().getValueAt(row, 0)));
			RegBoletaHonorariosEntity ape = repositoryRegBH.find(id);
			vista.CargarFormRegistrarBH(ape);
		
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void eliminarRegBH() {
		
		int row = vista.getTableRegistrarBH().getSelectedRow();
		if(row >= 0) {
			
			Long id = Long.parseLong(String.valueOf(vista.getModelTableRegBH().getValueAt(row, 0)));
			RegBoletaHonorariosEntity ape = repositoryRegBH.find(id);
			repositoryRegBH.delete(ape);
			vista.ActualizarRegVistaBH();
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void LlenarTablaRegBH() {
		
		int row = vista.getTableRegistrarBH().getSelectedRow();
			
		if(row >= 0) {
			Iterator<RegBoletaHonorariosEntity> lista = this.repositoryRegBH.findAll().iterator();
			this.vista.getModelTableRegBH().getDataVector().removeAllElements();
			this.vista.getModelTableRegBH().fireTableDataChanged();
				
			while(lista.hasNext()) {
				RegBoletaHonorariosEntity record = lista.next();
				
				this.vista.getModelTableRegBH().addRow(new  Object[] {
						record.getId(),
						record.getNumeroBH(),
						record.getNombreTitular(),
						record.getRutTitular(),
						record.getGiroTitular(),
						record.getDireccionTitular(),
						record.getTelefonoTitular(),
						record.getNombreEmpresa(),
						record.getRutEmpresa(),
						record.getDireccionEmpresa(),
						Helpers.getFechaFormat(record.getFecha()),
						
				});
			}
		}
		
	
	}

	public void usarDatosRegBH() {
		
		int row = vista.getTableRegistrarBH().getSelectedRow();
		
		if(row >= 0) {
			
			String id = String.valueOf(vista.getModelTableRegBH().getValueAt(row, 0));
			String NomTitular = String.valueOf(vista.getModelTableRegBH().getValueAt(row, 2));
			
			vista.getTxtIDDatos().setText(id);
			vista.getTxtNombreTitularReaBH().setText(NomTitular);
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	//  FIN REGISTRAR BH  //


	//  REALIZAR BH  //
	public void guardarReaBH() {
	
		if(vista.camposVaciosRealizarBH()) {
			
			ReaBoletaHonorariosEntity ie = new ReaBoletaHonorariosEntity();
			
			ie.setIdDatos(Long.parseLong(vista.getTxtIDDatos().getText()));
			ie.setDescripcion(vista.getTxtDescripcion().getText());
			ie.setValor(Integer.parseInt(vista.getTxtValorUnitario().getText()));
			
			ReaBoletaHonorariosEntity db = this.repositoryReaBH.create(ie);
			
			if(db != null) {
				Mensajes.Creacion();
				vista.ActualizarTablaReaBH();;
			}
		}else {
			Mensajes.CamposVacios();
		}
	
	}

	public void modificarReaBH(){

	
		if(vista.camposVaciosRealizarBH()) {
			
			ReaBoletaHonorariosEntity ie = new ReaBoletaHonorariosEntity();
			
			ie.setId(Long.parseLong(vista.getTxtIDRealizarBH().getText()));
			ie.setIdDatos(Long.parseLong(vista.getTxtIDDatos().getText()));
			ie.setDescripcion(vista.getTxtDescripcion().getText());
			ie.setValor(Integer.parseInt(vista.getTxtValorUnitario().getText()));
			
			ReaBoletaHonorariosEntity db = this.repositoryReaBH.update(ie);
			
			if(db != null) {
				Mensajes.Actualizacion();
				vista.ActualizarTablaReaBH();
			}
		}else {
			Mensajes.CamposVacios();
		}

	}

	public void btnModificarReaBH() {

		int row = vista.getTableRealizarBH().getSelectedRow();
		if(row >= 0) {
		
			Long id = Long.parseLong(String.valueOf(vista.getModelTableReaBH().getValueAt(row, 0)));
			ReaBoletaHonorariosEntity ape = repositoryReaBH.find(id);
			vista.CargarFormRealizarBH(ape);
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
}

	public void eliminarReaBH() {
	
		int row = vista.getTableRealizarBH().getSelectedRow();
		if(row >= 0) {
			
			Long id = Long.parseLong(String.valueOf(vista.getModelTableReaBH().getValueAt(row, 0)));
			ReaBoletaHonorariosEntity ape = repositoryReaBH.find(id);
			repositoryReaBH.delete(ape);
			vista.ActualizarTablaReaBH();;
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void LlenarTablaReaBH() {

	
	Long idReaDatos = Long.parseLong(vista.getTxtIDDatos().getText());
	
	if(idReaDatos > 0 && vista.getTxtIDDatos().getText() != null) {
		
		Iterator<ReaBoletaHonorariosEntity> lista = this.repositoryReaBH.findForReaBH(idReaDatos).iterator();
		vista.getModelTableReaBH().getDataVector().removeAllElements();
		vista.getModelTableReaBH().fireTableDataChanged();	
		
		while (lista.hasNext()) {
			ReaBoletaHonorariosEntity record = lista.next();
			/*int valorUnitario = record.getValor();
			int cantidad = record.getCantidad();
			int Total = valorUnitario * cantidad;
			//int Neto = (int) (Total / 1.19);
			//int IVA = Total - Neto;*/
			vista.getModelTableReaBH()
					.addRow(new Object[] { 
							record.getId(),
							record.getDescripcion(),
							record.getValor()
							
							});
		}
		
		vista.calcularTotal();
		
	}
}
	//  FIN REALIZAR DOCUMENTOS  //

}
