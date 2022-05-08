package CuartoMedio.EmprendimientoYEmpleabilidad.ListaPrecio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlListaPrecio implements ActionListener {
	
	private float total = 0, subTot = 0, Iva = 0;
	
	public VistaListaPrecio vlp;
	
	public ControlListaPrecio(VistaListaPrecio vlp) {
		
		this.vlp = vlp;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vlp.getBtnAgregar())) {
			
			AgregarProducto();
		}
		// TODO Auto-generated method stub
		
	}
	
	
	public void AgregarProducto() {
		
		JOptionPane.showMessageDialog(null, ""+vlp.getTxtCodPro().getText());
		String CodProducto = vlp.getTxtCodPro().getText();
		String Nombre = vlp.getTxtNom().getText();
		String Proveedor = vlp.getTxtPro().getText();
		float PreUnitario = Float.parseFloat(vlp.getTxtPreUni().getText());
		int Cantidad = Integer.parseInt(vlp.getTxtCan().getText());
		float Total= (float)(PreUnitario*Cantidad);
		
		//double TotalMultip = Double.parseDouble(PreUnitario*Cantidad);
		
		String[] filas = new String[6];
		
		filas[0] = CodProducto;
		filas[1] = Nombre;
		filas[2] = Proveedor;
		filas[3] = ""+PreUnitario;
		filas[4] = ""+Cantidad;
		filas[5] = ""+Total;
				
		((DefaultTableModel) vlp.getTable().getModel()).addRow(new Object[]{
			filas[0],filas[1],filas[2],filas[3],filas[4],filas[5]
				
		});
		
		vlp.getTable().setModel(vlp.getTable().getModel());
		
		total = total+Total;
		
		vlp.getTxtTotal().setText(""+total);
		
		
	}
	
	
	
	

}
