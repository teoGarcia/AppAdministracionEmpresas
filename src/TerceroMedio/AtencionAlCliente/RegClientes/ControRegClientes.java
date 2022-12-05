package TerceroMedio.AtencionAlCliente.RegClientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JOptionPane;

import Helpers.AbrirDocumentos;
import Helpers.AbrirDocumentos.Urls;
import TerceroMedio.ProcesosAdministrativos.EvaluacionProyecto.ModeloEvaluacionProyecto;
import TerceroMedio.UtilizacionDeLaInformacionContable.Deprecacion.Deprecacion;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControRegClientes implements ActionListener {

	private VistaRegClientes vista;
	private RegClientesRepository repository;

	public ControRegClientes(VistaRegClientes vista) {
		this.repository = new RegClientesRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	if(e.getSource().equals(vista.getCrud().getBtnAgregar())) {
			
			if (vista.isCamposVacios()) {
				
				ModeloRegClientes record = new ModeloRegClientes();
				
				record.setCodigo(vista.getTxtCodigo().getText());
				record.setRut(vista.getTxtRut().getText());
				record.setComuna(vista.getTxtComuna().getText());
				record.setTelefono(vista.getTxtTelefono().getText());
				record.setTipo(vista.getTxtTipo().getText());
				record.setWeb(vista.getTxtWeb().getText());
				record.setNombre(vista.getTxtNombre().getText());
				record.setDireccion(vista.getTxtDirec().getText());
				record.setCiudad(vista.getTxtCiudad().getText());
				record.setRubro(vista.getTxtRubro().getText());
				record.setCorreo(vista.getTxtEmail().getText());

				// guarda
				if (vista.getId() <= 0 && vista.getId() != null) {
					this.guardar(record);
				
				// actualiza
				} else {
					record.setId(vista.getId());
					this.actualizar(record);
				}

				vista.actualizarVista();

			} else {
				Mensajes.CamposVacios();
			}
			
		}else if (e.getSource().equals(vista.getCrud().getBtnModificar())) {
			Long id = vista.getCrud().getRowId();
			if (id >= 0) {
				ModeloRegClientes record = repository.find(id);
				vista.cargarForm(record);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource().equals(vista.getCrud().getBtnEliminar())) {
			Long id = vista.getCrud().getRowId();
			if (id != null) {
				ModeloRegClientes record = repository.find(id);
				repository.delete(record);
				vista.actualizarVista();
			}
		}
		
	}

	private void actualizar(ModeloRegClientes record) {
		// TODO Auto-generated method stub
		ModeloRegClientes db = this.repository.update(record);

		if (db != null) {
			vista.vaciarForm();
			Mensajes.Actualizacion();
		}
	}

	private void guardar(ModeloRegClientes record) {
		// TODO Auto-generated method stub

		ModeloRegClientes db = this.repository.create(record);

		if (db != null) {
			vista.vaciarForm();
			Mensajes.Creacion();
		}
	}

	
	public void LlenarTabla() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				Iterator<ModeloRegClientes> lista = this.repository.findAll().iterator();
				
				
				this.vista.getCrud().getTable().getModel().getDataVector().removeAllElements();
				this.vista.getCrud().getTable().getModel().fireTableDataChanged();

				while (lista.hasNext()) {
					ModeloRegClientes records = lista.next();
					this.vista.getCrud().getTable().getModel().addRow(
							new Object[] { 
									records.getId(), 
									records.getCodigo(),
									records.getNombre(),
									records.getRut(),
									records.getTelefono()
							});
					}
	}

}
