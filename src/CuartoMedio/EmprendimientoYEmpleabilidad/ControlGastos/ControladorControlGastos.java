package CuartoMedio.EmprendimientoYEmpleabilidad.ControlGastos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import CuartoMedio.EmprendimientoYEmpleabilidad.ControlGastos.Imprimir.PanelImprimir;
import CuartoMedio.EmprendimientoYEmpleabilidad.ControlGastos.Imprimir.VistaImprimir;
import core.Helpers;
import core.ManagerDB;
import ui.Mensejes.Mensajes;

public class ControladorControlGastos implements ItemListener, ActionListener {

	private VistaControlGastos vista;
	private ControlGastosRepository repository;
	
	private VistaImprimir vi;
	private PanelImprimir pi;

	public ControladorControlGastos(VistaControlGastos vista) {
		this.repository = new ControlGastosRepository();
		this.repository.setEm(ManagerDB.getEntityManager());
		this.vista = vista;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource().equals(vista.getComCategoria())) {
		 vista.getComSubCategoria().setModel(new DefaultComboBoxModel(getLista(e.getItem().toString())));
		}
		
	}

	private String[] getLista(String item) {

		String[] lista = new String[] {};

		switch (item) {
		case "Supermercado":
			lista = new String[] { "Almacén", "Verdulería", "Carnicería", "Delivery", "Artículos Limpieza", "S-Otros" };
			break;
		case "Gastos Fijos":
			lista = new String[] { "Luz", "Gas", "Agua", "Internet", "Cable", "Celular", "G-Otros" };
			break;
		case "Formacion":
			lista = new String[] { "Colegio", "Material escolar", "Libros", "Excursiones", "Cursos", "F-Otros" };
			break;
		case "Ocio":
			lista = new String[] { "Vacaciones", "Paseos escolar", "Espectáculos", "Deporte", "Restaurantes", "Bares",
					"O-Otros" };
			break;
		case "Transporte":
			lista = new String[] { "Auto mantenimiento", "Combustible", "Garage", "Taxi/Bus/Tren", "T-Otros" };
			break;
		case "Vivienda":
			lista = new String[] { "Muebles", "Electrodomésticos", "Reparaciones", "Jardinero", "Decoración",
					"Limpieza", "V-Otros" };
			break;
		case "Salud":
			lista = new String[] { "Obra Social", "Farmacia", "Cuidado Personal", "Gimnasio", "SA-Otros" };
			break;
		case "Seguros":
			lista = new String[] { "Vivienda", "Jubilación", "Vehículo", "Vida", "SE-Otros" };
			break;
		case "Impuestos":
			lista = new String[] { "ABL", "Ingresos Brutos", "Riqueza", "Ganancias", "I-Otros" };
			break;
		default:
			lista = new String[] {};
			break;
		}

		return lista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(vista.getBtnGuardar())) {

			if (vista.camposVacios()) {

				ControlGastosEntity record = new ControlGastosEntity();

				record.setCategoria(vista.getComCategoria().getSelectedItem().toString());
				record.setSubCategoria(vista.getComSubCategoria().getSelectedItem().toString());

				record.setDetalle(vista.getTxtDetalles().getText());

				record.setMes(vista.getMonthMes().getMonth());
				record.setAnio(vista.getYearChooserPago().getYear());

				record.setImporte(Integer.parseInt(vista.getTxtImporte().getText()));

				// guarda
				if (vista.getId() <= 0 && vista.getId() != null) {
					
					agregar(record);
					
				// actualiza
				} else {
					
					record.setId(vista.getId());
					modificar(record);
				}

			} else {
				Mensajes.CamposVacios();
			}
		}else if(e.getSource().equals(vista.getStndrbtnBuscar())) {
			LlenarTablas();
		}else if(e.getSource().equals(vista.getBtnEliminar())) {
			Long id = getRowId();
			if(id != null && id > 0) {
				ControlGastosEntity record = repository.find(id);
				repository.delete(record);
				vista.actualizarVista();
			}else {
				JOptionPane.showMessageDialog(null, "Error al obtener el id", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource().equals(vista.getBtnModificar())) {
			
			Long id = getRowId();
			
			if(id != null && id > 0) {
				ControlGastosEntity record = repository.find(id);
				vista.cargarForm(record);
			}else {
				JOptionPane.showMessageDialog(null, "Error al obtener el id", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		} else if(e.getSource().equals(vista.getBtnImprimir())) {
			
				vi = new VistaImprimir();
				
				pi = vi.getPi();
				
				System.out.println("año: "+ vista.getYearBuscar().getYear());
				
				int anio = vista.getYearBuscar().getYear();

				pi.getLblTotalIngresos().setText(""+anio);
				
				Iterator<ControlGastosEntity> lista = this.repository.findForAnio(anio).iterator();
				
				while (lista.hasNext()) {
					ControlGastosEntity record = lista.next();
					
					pi.getModel().addRow(new Object[] { 
								record.getId(), 
								Helpers.getnombreMes(record.getMes()),
								record.getCategoria(),
								record.getSubCategoria(), 
								record.getDetalle(), 
								record.getImporte() 
						});
					
					
				}
				
				vi.setVisible(true);
		
		}
	}
	
	private Long getRowId() {
		
		int row = vista.getTableEnero().getSelectedRow();
		
		if(row <= -1) {
			row = vista.getTableFebrero().getSelectedRow();
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelFebrero().getValueAt(row, 0)));
				return id;
			}
		}
		
		if(row <= -1) {
			row = vista.getTableMarzo().getSelectedRow();
			
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelMarzo().getValueAt(row, 0)));
				return id;
			}
		}
		
		if(row <= -1) {
			row = vista.getTableAbril().getSelectedRow();
			
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelAbril().getValueAt(row, 0)));
				return id;
			}
		}
		
		if(row <= -1) {
			row = vista.getTableMayo().getSelectedRow();
			
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelMayo().getValueAt(row, 0)));
				return id;
			}
		}
		
		if(row <= -1) {
			row = vista.getTableJunio().getSelectedRow();
			
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelJunio().getValueAt(row, 0)));
				return id;
			}
		}
		
		if(row <= -1) {
			row = vista.getTableJulio().getSelectedRow();
			
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelJulio().getValueAt(row, 0)));
				return id;
			}
		}
		
		if(row <= -1) {
			row = vista.getTableAgosto().getSelectedRow();
			
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelAgosto().getValueAt(row, 0)));
				return id;
			}
		}
		
		if(row <= -1) {
			row = vista.getTableSeptiembre().getSelectedRow();
			
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelSeptiembre().getValueAt(row, 0)));
				return id;
			}
		}
		
		if(row <= -1) {
			row = vista.getTableOctubre().getSelectedRow();
			
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelOctubre().getValueAt(row, 0)));
				return id;
			}
		}
		
		if(row <= -1) {
			row = vista.getTableNoviembre().getSelectedRow();
			
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelNoviembre().getValueAt(row, 0)));
				return id;
			}
		}
		
		if(row <= -1) {
			row = vista.getTableDiciembre().getSelectedRow();
			
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelDiciembre().getValueAt(row, 0)));
				return id;
			}
		}else {
			if(row >= 0) {
				Long id = Long.parseLong(String.valueOf(vista.getModelEnero().getValueAt(row, 0)));
				return id;
			}else {
				JOptionPane.showMessageDialog(null, "Debe selecionar uno de la tabla", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		return null;
		
	}
	
	
	public void LlenarTablas() {
		
		int anio = vista.getYearBuscar().getYear();

		Iterator<ControlGastosEntity> lista = this.repository.findForAnio(anio).iterator();

		this.vista.getModelEnero().getDataVector().removeAllElements();
		this.vista.getModelEnero().fireTableDataChanged();

		this.vista.getModelFebrero().getDataVector().removeAllElements();
		this.vista.getModelFebrero().fireTableDataChanged();

		this.vista.getModelMarzo().getDataVector().removeAllElements();
		this.vista.getModelMarzo().fireTableDataChanged();

		this.vista.getModelAbril().getDataVector().removeAllElements();
		this.vista.getModelAbril().fireTableDataChanged();

		this.vista.getModelMayo().getDataVector().removeAllElements();
		this.vista.getModelMayo().fireTableDataChanged();

		this.vista.getModelJunio().getDataVector().removeAllElements();
		this.vista.getModelJunio().fireTableDataChanged();

		this.vista.getModelJulio().getDataVector().removeAllElements();
		this.vista.getModelJulio().fireTableDataChanged();

		this.vista.getModelAgosto().getDataVector().removeAllElements();
		this.vista.getModelAgosto().fireTableDataChanged();

		this.vista.getModelSeptiembre().getDataVector().removeAllElements();
		this.vista.getModelSeptiembre().fireTableDataChanged();

		this.vista.getModelOctubre().getDataVector().removeAllElements();
		this.vista.getModelOctubre().fireTableDataChanged();

		this.vista.getModelNoviembre().getDataVector().removeAllElements();
		this.vista.getModelNoviembre().fireTableDataChanged();

		this.vista.getModelDiciembre().getDataVector().removeAllElements();
		this.vista.getModelDiciembre().fireTableDataChanged();

		while (lista.hasNext()) {
			ControlGastosEntity record = lista.next();
			
			if(record.getMes() == 0) {
				this.vista.getModelEnero().addRow(new Object[] { record.getId(), record.getCategoria(),
						record.getSubCategoria(), record.getDetalle(), record.getImporte() });
			}
			
			if(record.getMes() == 1) {
				this.vista.getModelFebrero().addRow(new Object[] { record.getId(), record.getCategoria(),
						record.getSubCategoria(), record.getDetalle(), record.getImporte() });
			}

			if(record.getMes() == 2) {
				this.vista.getModelMarzo().addRow(new Object[] { record.getId(), record.getCategoria(),
						record.getSubCategoria(), record.getDetalle(), record.getImporte() });
			}
			
			if(record.getMes() == 3) {
				this.vista.getModelAbril().addRow(new Object[] { record.getId(), record.getCategoria(),
						record.getSubCategoria(), record.getDetalle(), record.getImporte() });
			}
			
			if(record.getMes() == 4) {
				this.vista.getModelMayo().addRow(new Object[] { record.getId(), record.getCategoria(),
						record.getSubCategoria(), record.getDetalle(), record.getImporte() });
			}
			
			if(record.getMes() == 5) {
				this.vista.getModelJunio().addRow(new Object[] { record.getId(), record.getCategoria(),
						record.getSubCategoria(), record.getDetalle(), record.getImporte() });
			}
			
			if(record.getMes() == 6) {
				this.vista.getModelJulio().addRow(new Object[] { record.getId(), record.getCategoria(),
						record.getSubCategoria(), record.getDetalle(), record.getImporte() });
			}
			
			if(record.getMes() == 7) {
				this.vista.getModelAgosto().addRow(new Object[] { record.getId(), record.getCategoria(),
						record.getSubCategoria(), record.getDetalle(), record.getImporte() });
			}
			
			if(record.getMes() == 8) {
				this.vista.getModelSeptiembre().addRow(new Object[] { record.getId(), record.getCategoria(),
						record.getSubCategoria(), record.getDetalle(), record.getImporte() });
			}
			
			if(record.getMes() == 9) {
				this.vista.getModelOctubre().addRow(new Object[] { record.getId(), record.getCategoria(),
						record.getSubCategoria(), record.getDetalle(), record.getImporte() });
			}
			
			if(record.getMes() == 10) {
				this.vista.getModelNoviembre().addRow(new Object[] { record.getId(), record.getCategoria(),
						record.getSubCategoria(), record.getDetalle(), record.getImporte() });
			}
			
			if(record.getMes() == 11) {
				this.vista.getModelDiciembre().addRow(new Object[] { record.getId(), record.getCategoria(),
						record.getSubCategoria(), record.getDetalle(), record.getImporte() });
			}
		}

	}

	
	
	private void agregar(ControlGastosEntity record) {
		ControlGastosEntity db = this.repository.create(record);

		if (db != null) {
			Mensajes.Creacion();
			vista.actualizarVista();
		}
	}
	
	
	private void modificar(ControlGastosEntity record) {
		
		ControlGastosEntity db = this.repository.update(record);

		if (db != null) {
			Mensajes.Actualizacion();
			vista.actualizarVista();
		}
	}

	
}
