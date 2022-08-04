package CuartoMedio.CalculoDeRemuneraciones.LibroRemuneraciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import CuartoMedio.CalculoDeRemuneraciones.LibroRemuneraciones.Imprimir.PanelImprimir;
import CuartoMedio.CalculoDeRemuneraciones.LibroRemuneraciones.Imprimir.VistaImprimir;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.AplicacionPresupuestoEntity;
import CuartoMedio.DotacionPersonal.AplicacionPresupTrabajo.Vista.Imprimir.VistaImprimirAplicacionPresup;
import CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto.Calendario;
import CuartoMedio.EmprendimientoYEmpleabilidad.CalendarioProyecto.CalendarioProyecto.VistaRegistrarProyecto.Proyecto;
import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.Producto;
import CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio.ProductoRepository;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControlLibroRemuneraciones implements ActionListener {

	private PanelImprimir pi;
	private VistaLibroRemuneraciones vista;
	private LibroRemuneracionesRepository repository;
	private VistaImprimir vi;

	public ControlLibroRemuneraciones(VistaLibroRemuneraciones vista) {
		// TODO Auto-generated constructor stub
		this.vista = vista;
		this.repository = new LibroRemuneracionesRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(vista.getBtnGuardar())) {

			if (vista.camposVacios()) {

				LibroRemuneraciones record = new LibroRemuneraciones();

				record.setNombre(vista.getTxtNomTra().getText());
				record.setRut(vista.getTxtRutTra().getText());
				record.setSueldoBase(Integer.parseInt(vista.getTxtSueBas().getText()));
				record.setHorasExtras(Integer.parseInt(vista.getTxtHorExt().getText()));
				record.setGratificacion(Integer.parseInt(vista.getTxtGra().getText()));
				record.setOtrosIngresos(Integer.parseInt(vista.getTxtOtrIng().getText()));
				record.setMovilizacion(Integer.parseInt(vista.getTxtMov().getText()));
				record.setColacion(Integer.parseInt(vista.getTxtCol().getText()));
				record.setGastoRep(Integer.parseInt(vista.getTxtGasRep().getText()));
				record.setColacion(Integer.parseInt(vista.getTxtCol().getText()));
				record.setAsigFamiliar(Integer.parseInt(vista.getTxtAsiFam().getText()));
				record.setAfp(Integer.parseInt(vista.getTxtAFP().getText()));
				record.setSalud(Integer.parseInt(vista.getTxtSal().getText()));
				record.setDifIsapre(Integer.parseInt(vista.getTxtDifIsa().getText()));
				record.setSeguroCes(Integer.parseInt(vista.getTxtSegCes().getText()));
				record.setImpDeter(Integer.parseInt(vista.getTxtImpDet().getText()));
				record.setImgAPag(Integer.parseInt(vista.getTxtImpPagar().getText()));
				record.setAnticipo(Integer.parseInt(vista.getTxtAnt().getText()));
				record.setOtroDesc(Integer.parseInt(vista.getTxtOtrDes().getText()));
				record.setImponble(Integer.parseInt(vista.getTxtImponible().getText()));
				record.setAcc(Integer.parseInt(vista.getTxtACC().getText()));
				record.setSis(Integer.parseInt(vista.getTxtSIS().getText()));
				record.setCesantia(Integer.parseInt(vista.getTextCesantia().getText()));

				// guarda
				if (vista.getId() <= 0 && vista.getId() != null) {
					this.agregar(record);
					// actualiza
				} else {
					record.setId(vista.getId());
					this.actualizar(record);
				}

				vista.actualizarVista();

			} else {
				Mensajes.CamposVacios();
			}

		} else if (e.getSource().equals(vista.getBtnModificar())) {
			Long id = getRow();
			if (id >= 0) {
				LibroRemuneraciones record = repository.find(id);
				vista.cargarForm(record);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource().equals(vista.getBtnEliminar())) {
			Long id = getRow();
			if (id != null) {
				LibroRemuneraciones record = repository.find(id);
				repository.delete(record);
				vista.actualizarVista();
			}
		}else if(e.getSource().equals(vista.getBtnImprimir())) {
			
			Long id = getRow();

			if(id >= 0) {
				
				vi = new VistaImprimir();
				
				LibroRemuneraciones ape = repository.find(id);
			   
			    
				pi = vi.getPi();
				pi.CargarForm(ape);
				
				vi.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
			
		}

	}

	private Long getRow() {
		int row = vista.getTableRemImp().getSelectedRow();
		
		if(row < 0) row = vista.getTableRemNoImp().getSelectedRow();
		
		if(row < 0) row = vista.getTableDesPre().getSelectedRow();
		
		if(row < 0) row = vista.getTableOtrosDes().getSelectedRow();
		
		if(row < 0) row = vista.getTableImposi().getSelectedRow();
		
		if (row >= 0) {
			Long id = Long.parseLong(String.valueOf(vista.getModelRemImp().getValueAt(row, 0)));
			return id;
		} else {
			JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);
			return null;
		}

	}

	public void agregar(LibroRemuneraciones record) {
		LibroRemuneraciones db = this.repository.create(record);

		if (db != null) {
			Mensajes.Creacion();
			vista.actualizarVista();
		}
	}

	public void actualizar(LibroRemuneraciones record) {
		LibroRemuneraciones db = this.repository.update(record);

		if (db != null) {
			vista.vaciarForm();
			Mensajes.Actualizacion();
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

		while (lista.hasNext()) {
			LibroRemuneraciones record = lista.next();
			this.vista.getModelRemImp()
					.addRow(new Object[] { record.getId(), record.getNombre(), record.getSueldoBase(),
							record.getHorasExtras(), record.getGratificacion(), record.getOtrosIngresos(),
							(record.getSueldoBase() + record.getHorasExtras() + record.getGratificacion()
									+ record.getOtrosIngresos()) });

			this.vista.getModelRemNoImp()
					.addRow(new Object[] { record.getId(), record.getNombre(), record.getMovilizacion(),
							record.getColacion(), record.getGastoRep(), record.getAsigFamiliar(),
							(record.getMovilizacion() + record.getColacion() + record.getGastoRep()
									+ record.getAsigFamiliar()) });

			this.vista.getModelDesPre()
					.addRow(new Object[] { record.getId(), record.getNombre(), record.getAfp(), record.getSalud(),
							record.getDifIsapre(), record.getSeguroCes(),
							(record.getAfp() + record.getSalud() + record.getDifIsapre() + record.getSeguroCes()) });

			this.vista.getModelOtrosDes().addRow(new Object[] { record.getId(), record.getNombre(),
					record.getImpDeter(), record.getImgAPag(), record.getAnticipo(), record.getOtroDesc(),
					(record.getImpDeter() + record.getImgAPag() + record.getAnticipo() + record.getOtroDesc()) });

			this.vista.getModelImposi()
					.addRow(new Object[] { record.getId(), record.getImponble(), record.getAcc(), record.getSis(),
							record.getCesantia(),
							(record.getImponble() + record.getAcc() + record.getSis() + record.getCesantia()) });
		}

	}
}
