package CuartoMedio.EmprendimientoYEmpleabilidad.ControlGastos;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;

public class ControladorControlGastos implements ItemListener {
	
	private VistaControlGastos vista;

	public ControladorControlGastos(VistaControlGastos vista) {
		this.vista = vista;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		vista.getComSubCategoria().setModel(new DefaultComboBoxModel(getLista(e.getItem().toString())));
		
	}
	
	private String[] getLista(String item) {
		
		String[] lista = new String[] {};
		
		switch (item) {
		case "Supermercado":
			lista = new String[]{"Almac�n", "Verduler�a", "Carnicer�a", "Delivery", "Art�culos Limpieza", "S-Otros"};
			break;
		case "Gastos Fijos":
			lista = new String[]{"Luz", "Gas", "Agua", "Internet", "Cable", "Celular", "G-Otros"};
			break;
		case "Formacion":
			lista = new String[]{"Colegio", "Material escolar", "Libros", "Excursiones", "Cursos", "F-Otros"};
			break;
		case "Ocio":
			lista = new String[]{"Vacaciones", "Paseos escolar", "Espect�culos", "Deporte", "Restaurantes", "Bares", "O-Otros"};
			break;
		case "Transporte":
			lista = new String[]{"Auto mantenimiento", "Combustible", "Garage", "Taxi/Bus/Tren", "T-Otros"};
			break;
		case "Vivienda":
			lista = new String[]{"Muebles", "Electrodom�sticos", "Reparaciones", "Jardinero", "Decoraci�n", "Limpieza", "V-Otros"};
			break;
		case "Salud":
			lista = new String[]{"Obra Social", "Farmacia", "Cuidado Personal", "Gimnasio", "SA-Otros"};
			break;
		case "Seguros":
			lista = new String[]{"Vivienda", "Jubilaci�n", "Veh�culo", "Vida", "SE-Otros"};
			break;
		case "Impuestos":
			lista = new String[]{"ABL", "Ingresos Brutos", "Riqueza", "Ganancias", "I-Otros"};
			break;
		default:
			lista = new String[] {};
			break;
		}
		
		return lista;
	}
	
	
}
