package ui.Mensejes;

import javax.swing.JOptionPane;

public class Mensajes {
	
	
	
	public static void Information(String msg) {
		JOptionPane.showMessageDialog(null, msg, "Informacion", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void Creacion() {
		JOptionPane.showMessageDialog(null, "Creado de forma exitosa", "Informacion", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void CamposVacios() {
		JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Informacion", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void Actualizacion() {
		JOptionPane.showMessageDialog(null, "Actualizado de forma exitosa", "Informacion", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
