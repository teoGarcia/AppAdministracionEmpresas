package CuartoMedio.LegislacionLaboral.PermisosLaborales.DiasHoras;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Helpers.ImageUrls;

public class ModeloDiasHoras {

	private final String document = "SOLICITUD DE PERMISO POR DIAS O HORAS.docx";
	private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	private String[] urls = {
			"SOLICITUD DE PERMISO POR DIAS O HORAS.jpg"
	};
	
	public ModeloDiasHoras() {
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
