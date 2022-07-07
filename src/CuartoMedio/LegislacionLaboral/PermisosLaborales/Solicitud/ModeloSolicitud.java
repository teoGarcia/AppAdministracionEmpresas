package CuartoMedio.LegislacionLaboral.PermisosLaborales.Solicitud;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Helpers.ImageUrls;

public class ModeloSolicitud {

	private final String document = "SOLICITUD DE PERMISO LABORAL.docx";
	private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	private String[] urls = {
			"SOLICITUD DE PERMISO LABORAL.jpg"
	};
	
	public ModeloSolicitud() {
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
