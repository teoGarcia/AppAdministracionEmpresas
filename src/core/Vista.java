package core;

import ui.CrudTable.VistaCrudTable;

public interface Vista<T> {
	
	
	public void createForm();
	
	public boolean isCamposVacios();
	
	public void actualizarVista();
	
	public void cargarForm(T record);
	
	public void vaciarForm();
	
	public VistaCrudTable getCrud();
	
	public Long getId();

}
