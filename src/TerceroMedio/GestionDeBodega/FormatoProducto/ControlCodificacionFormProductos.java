package TerceroMedio.GestionDeBodega.FormatoProducto;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Menu.Side.SideMenu;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlCodificacionFormProductos implements ActionListener {
	
	private VistaFormatoProductos vcp;
	private VistaListaFormatoProductos vlp;
	private CodificacionFormProdRepository repository;
	private Long id = 0L;

	public ControlCodificacionFormProductos(VistaFormatoProductos vcp) {
		this.repository = new CodificacionFormProdRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vcp = vcp;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = e.getActionCommand();
		if(!SideMenu.isContentPanel(name)) lazinLoadView(e.getSource());
		SideMenu.changeContentPanel(name);
		
		
		
		if(e.getSource().equals(vcp.getStndrbtnGuardar())) { 
			
			if(vcp.CamposVacios()) {
				
				CodificacionFormProdEntity cpe = new CodificacionFormProdEntity();
				
				cpe.setProveedor(vcp.getTxtProveedor().getText());
				cpe.setDescripProducto(vcp.getTxtDescProducto().getText());
				cpe.setCodIntProducto(vcp.getTxtCodInternoProd().getText());
				cpe.setCodBarrasEAN13(vcp.getTxtCodBarrasEAN13().getText());
				cpe.setCodBarrasEAN14(vcp.getTxtCodBarrasEAN14().getText());
				cpe.setPaisAbastecimiento(vcp.getTxtPaisAbaste().getText());
				cpe.setPaisFabricacion(vcp.getTxtPaisFabric().getText());
				cpe.setMarca(vcp.getTxtMarca().getText());
				cpe.setPrecioSinImpuestos(vcp.getTxtPrecSinImpuesto().getText());
				cpe.setDescuentoPermanente(vcp.getTxtDescPermanente().getText());
				cpe.setPrecioNeto(vcp.getTxtPrecioNeto().getText());
				cpe.setDescuentoIntro(vcp.getTxtDescuentoIntroduccion().getText());
				cpe.setIVA(vcp.getTxtIVA().getText());
				cpe.setPVP(vcp.getTxtPVP().getText());
				cpe.setPrecioSugerido(vcp.getTxtPrecioSugerido().getText());
				cpe.setUnidadEmbalaje(vcp.getTxtUniEmbalaje().getText());
				cpe.setRegistroSanitario(vcp.getTxtRegistroSanitario().getText());
				cpe.setVidaUtil(vcp.getTxtVidaUtil().getText());
				cpe.setCajasxPlanchas(vcp.getTxtCajasxPlanchas().getText());
				cpe.setPlanchasxPallet(vcp.getTxtPlanchasxPallet().getText());
				cpe.setTipoEmbalaje(vcp.getTxtTipoEmbalaje().getText());
				cpe.setPesoBrutoCaja(vcp.getTxtPesoBrutoCaja().getText());
				cpe.setPesoNetoCaja(vcp.getTxtPesoNetoCaja().getText());
				cpe.setProfundidadCaja(vcp.getTxtProfundidadCaja().getText());
				cpe.setAnchoCaja(vcp.getTxtAnchoCaja().getText());
				cpe.setAltoCaja(vcp.getTxtAltoCaja().getText());
				cpe.setVolumenCaja(vcp.getTxtVolumenCaja().getText());
				cpe.setPesoBrutoUnidad(vcp.getTxtPesoBrutoUnidad().getText());
				cpe.setPesoNeto(vcp.getTxtPesoNetoUnidad().getText());
				cpe.setProfundidadUnidad(vcp.getTxtProfundidadUnidad().getText());
				cpe.setAnchoUnidad(vcp.getTxtAnchoUnidad().getText());
				cpe.setAltoUnidad(vcp.getTxtAltoUnidad().getText());
				cpe.setVolumenUnidad(vcp.getTxtVolumenUnidad().getText());
				
				
				// guarda
				if (this.getId() <= 0 && this.getId() != null) {
					CodificacionFormProdEntity db = this.repository.create(cpe);

					if (db != null) {
						Mensajes.Creacion();
						vcp.VaciarForm();
					}

					// actualiza
				} else {
					cpe.setId(this.getId());
					CodificacionFormProdEntity db = this.repository.update(cpe);
					if (db != null) {
						Mensajes.Actualizacion();
						vcp.VaciarForm();
					}
				}
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
			}
			
		}
		// TODO Auto-generated method stub
		
	}
	
	
	private void lazinLoadView(Object btn) {
		// TODO Auto-generated method stub
		
		 if(btn.equals(vcp.getBtnListaProductos())) { 
			 this.vlp = new VistaListaFormatoProductos(this);
			 SideMenu.registerContentPanel(vlp, vcp.getBtnListaProductos().getText()); 
		 } 
		 
	}

	public VistaFormatoProductos getVcp() {
		return vcp;
	}

	public void setVcp(VistaFormatoProductos vcp) {
		this.vcp = vcp;
	}

	public VistaListaFormatoProductos getVlp() {
		return vlp;
	}

	public void setVlp(VistaListaFormatoProductos vlp) {
		this.vlp = vlp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	


}
