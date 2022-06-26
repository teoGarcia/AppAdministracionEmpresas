package CuartoMedio.GestionDeBodega.CodificacionProductos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.DesarolloBienestar.PresupuestoCapacitacion.PresupuestoCapacitacion;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlCodificacionProductos implements ActionListener {
	
	private VistaCodificacionProductos vcp;
	private CodificacionProdRepository repository;

	public ControlCodificacionProductos(VistaCodificacionProductos vcp) {
		this.repository = new CodificacionProdRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vcp = vcp;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vcp.getStndrbtnGuardar())) {
			
			if(vcp.CamposVacios()) {
				
				CodificacionProdEntity cpe = new CodificacionProdEntity();
				
				cpe.setProveedor(vcp.getTxtProveedor().getText());
				cpe.setProveedor(vcp.getTxtDescProducto().getText());
				cpe.setProveedor(vcp.getTxtCodInternoProd().getText());
				cpe.setProveedor(vcp.getTxtCodBarrasEAN13().getText());
				cpe.setProveedor(vcp.getTxtCodBarrasEAN14().getText());
				cpe.setProveedor(vcp.getTxtPaisAbaste().getText());
				cpe.setProveedor(vcp.getTxtPaisFabric().getText());
				cpe.setProveedor(vcp.getTxtMarca().getText());
				cpe.setProveedor(vcp.getTxtPrecSinImpuesto().getText());
				cpe.setProveedor(vcp.getTxtDescPermanente().getText());
				cpe.setProveedor(vcp.getTxtPrecioNeto().getText());
				cpe.setProveedor(vcp.getTxtDescuentoIntroduccion().getText());
				cpe.setProveedor(vcp.getTxtIVA().getText());
				cpe.setProveedor(vcp.getTxtPVP().getText());
				cpe.setProveedor(vcp.getTxtPrecioSugerido().getText());
				cpe.setProveedor(vcp.getTxtUniEmbalaje().getText());
				cpe.setProveedor(vcp.getTxtRegistroSanitario().getText());
				cpe.setProveedor(vcp.getTxtVidaUtil().getText());
				cpe.setProveedor(vcp.getTxtCajasxPlanchas().getText());
				cpe.setProveedor(vcp.getTxtPlanchasxPallet().getText());
				cpe.setProveedor(vcp.getTxtTipoEmbalaje().getText());
				cpe.setProveedor(vcp.getTxtPesoBrutoCaja().getText());
				cpe.setProveedor(vcp.getTxtPesoNetoCaja().getText());
				cpe.setProveedor(vcp.getTxtProfundidadCaja().getText());
				cpe.setProveedor(vcp.getTxtAnchoCaja().getText());
				cpe.setProveedor(vcp.getTxtAltoCaja().getText());
				cpe.setProveedor(vcp.getTxtVolumenCaja().getText());
				cpe.setProveedor(vcp.getTxtPesoBrutoUnidad().getText());
				cpe.setProveedor(vcp.getTxtPesoNetoUnidad().getText());
				cpe.setProveedor(vcp.getTxtProfundidadUnidad().getText());
				cpe.setProveedor(vcp.getTxtAnchoUnidad().getText());
				cpe.setProveedor(vcp.getTxtAltoUnidad().getText());
				cpe.setProveedor(vcp.getTxtVolumenUnidad().getText());
				
				
				CodificacionProdEntity db = this.repository.create(cpe);
				if(db != null) {
					Mensajes.Creacion();
					vcp.VaciarForm();
					//vcp.ActualizarVista();
				}
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
			}
			
		}
		// TODO Auto-generated method stub
		
	}

}
