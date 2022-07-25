package CuartoMedio.CalculoDeRemuneraciones.LibroRemuneraciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.Producto;
import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.ProductoRepository;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlLibroRemuneraciones implements ActionListener {
	
	private VistaLibroRemuneraciones vista;
	private LibroRemuneracionesRepository repository;

	public ControlLibroRemuneraciones(VistaLibroRemuneraciones vista) {
		// TODO Auto-generated constructor stub
		this.vista = vista;
		this.repository = new LibroRemuneracionesRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		agregar();
	}
	
	public void agregar() {
		if(vista.camposVacios()) {
			LibroRemuneraciones record = new LibroRemuneraciones();
			
			record.setNombre(vista.getTxtNomTra().getText());
			record.setRut(vista.getTxtRutTra().getText());
			record.setSueldoBase(Double.parseDouble(vista.getTxtSueBas().getText()));
			record.setHorasExtras(Integer.parseInt(vista.getTxtHorExt().getText()));
			record.setGratificacion(Double.parseDouble(vista.getTxtGra().getText()));
			record.setOtrosIngresos(Double.parseDouble(vista.getTxtOtrIng().getText()));
			record.setMovilizacion(Double.parseDouble(vista.getTxtMov().getText()));
			record.setColacion(Double.parseDouble(vista.getTxtCol().getText()));
			record.setGastoRep(Double.parseDouble(vista.getTxtGasRep().getText()));
			record.setColacion(Double.parseDouble(vista.getTxtCol().getText()));
			record.setAsigFamiliar(Double.parseDouble(vista.getTxtAsiFam().getText()));
			record.setAfp(Double.parseDouble(vista.getTxtAFP().getText()));
			record.setSalud(Double.parseDouble(vista.getTxtSal().getText()));
			record.setDifIsapre(Double.parseDouble(vista.getTxtDifIsa().getText()));
			record.setSeguroCes(Double.parseDouble(vista.getTxtSegCes().getText()));
			record.setImpDeter(Double.parseDouble(vista.getTxtImpDet().getText()));
			record.setImgAPag(Double.parseDouble(vista.getTxtImpPagar().getText()));
			record.setAnticipo(Double.parseDouble(vista.getTxtAnt().getText()));
			record.setOtroDesc(Double.parseDouble(vista.getTxtOtrDes().getText()));
			record.setImponble(Double.parseDouble(vista.getTxtImponible().getText()));
			record.setAcc(Double.parseDouble(vista.getTxtACC().getText()));
			record.setSis(Double.parseDouble(vista.getTxtSIS().getText()));
			record.setCesantia(Double.parseDouble(vista.getTextCesantia().getText()));
			
			LibroRemuneraciones db = this.repository.create(record);
			
			if(db != null) {
				Mensajes.Creacion();
				vista.ActualizarVista();
			}
		}else {
			Mensajes.CamposVacios();
		}
	}

	
	public void LlenarTablas() {
		
		Iterator<LibroRemuneraciones> lista = this.repository.findAll().iterator();
		
		this.vista.getModelRemImp().getDataVector().removeAllElements();
		this.vista.getModelRemImp().fireTableDataChanged();
		
		this.vista.getModelRemNoImp().getDataVector().removeAllElements();
		this.vista.getModelRemNoImp().fireTableDataChanged();
		
		this.vista.getModelDesPre().getDataVector().removeAllElements();
		this.vista.getModelDesPre().fireTableDataChanged();
		
		this.vista.getModelOtrosDes().getDataVector().removeAllElements();
		this.vista.getModelOtrosDes().fireTableDataChanged();
		
		this.vista.getModelImposi().getDataVector().removeAllElements();
		this.vista.getModelImposi().fireTableDataChanged();
		
		while(lista.hasNext()) {
			LibroRemuneraciones record = lista.next();
			this.vista.getModelRemImp().addRow(new  Object[] {
					record.getId(),
					record.getNombre(),
					record.getSueldoBase(),
					record.getHorasExtras(),
					record.getGratificacion(),
					record.getOtrosIngresos(),
					(record.getSueldoBase()+record.getHorasExtras()+record.getGratificacion()+record.getOtrosIngresos())
			});
			
			this.vista.getModelRemNoImp().addRow(new  Object[] {
					record.getId(),
					record.getNombre(),
					record.getMovilizacion(),
					record.getColacion(),
					record.getGastoRep(),
					record.getAsigFamiliar(),
					(record.getMovilizacion()+record.getColacion()+record.getGastoRep()+record.getAsigFamiliar())
			});
			
			
			
			this.vista.getModelDesPre().addRow(new  Object[] {
					record.getId(),
					record.getNombre(),
					record.getAfp(),
					record.getSalud(),
					record.getDifIsapre(),
					record.getSeguroCes(),
					(record.getAfp()+ record.getSalud() + record.getDifIsapre() + record.getSeguroCes())
			});
			
			this.vista.getModelOtrosDes().addRow(new  Object[] {
					record.getId(),
					record.getNombre(),
					record.getImpDeter(),
					record.getImgAPag(),
					record.getAnticipo(),
					record.getOtroDesc(),
					(record.getImpDeter() + record.getImgAPag() + record.getAnticipo() + record.getOtroDesc())
			});
			
			this.vista.getModelImposi().addRow(new  Object[] {
					record.getId(),
					record.getImponble(),
					record.getAcc(),
					record.getSis(),
					record.getCesantia(),
					(record.getImponble() + record.getAcc() + record.getSis() + record.getCesantia())
			});
		}
		
		
	}
}
