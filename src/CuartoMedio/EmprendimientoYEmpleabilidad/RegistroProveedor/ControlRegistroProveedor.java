package CuartoMedio.EmprendimientoYEmpleabilidad.RegistroProveedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlRegistroProveedor implements ActionListener {
	
	private float total = 0, subTot = 0, Iva = 0;
	
	public VistaRegistroProveedor vrp;
	
	public ControlRegistroProveedor(VistaRegistroProveedor vrp) {
		this.vrp = vrp;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vrp.getBtnAgregar())) {
			
			AgregarProducto();
		}
		// TODO Auto-generated method stub
		
	}
	
	
	public void AgregarProducto() {
	
		String Nombre = vrp.getTxtNom().getText();
		String Direccion = vrp.getTxtDir().getText();
		String Correo = vrp.getTxtCor().getText();
		String Rubro = vrp.getTxtRub().getText();
		String AreaContacto = vrp.getTxtAreCon().getText();
		
		//double TotalMultip = Double.parseDouble(PreUnitario*Cantidad);
		
		String[] filas = new String[5];
		
		filas[0] = Nombre;
		filas[1] = Direccion;
		filas[2] = Correo;
		filas[3] = Rubro;
		filas[4] = AreaContacto;
		
				
		((DefaultTableModel) vrp.getTable().getModel()).addRow(new Object[]{
			filas[0],filas[1],filas[2],filas[3],filas[4]
				
		});
		
		vrp.getTable().setModel(vrp.getTable().getModel());
		
	}
	
	
	
	

}
