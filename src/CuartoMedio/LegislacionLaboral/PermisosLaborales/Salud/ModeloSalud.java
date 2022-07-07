package CuartoMedio.LegislacionLaboral.PermisosLaborales.Salud;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Helpers.ImageUrls;

public class ModeloSalud {

	private final String document = "SOLICITUD PERMISO LABORAL DE SALUD.docx";
	private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	private String[] urls = {
			"SOLICITUD PERMISO LABORAL DE SALUD.jpg"
	};
	
	public ModeloSalud() {
		// TODO Auto-generated constructor stub
		buildingImages();
	}
	
	private  void buildingImages() {
		for (String el : urls) {
			images.add(new ImageIcon(this.getClass().getResource(ImageUrls.legislacionLaboral+el)));
		}
	}

	public String getDocument() {
		return document;
	}

	public ArrayList<ImageIcon> getImages() {
		return images;
	}
	
}
