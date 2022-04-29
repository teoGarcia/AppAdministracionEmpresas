package CuartoMedio.LegislacionLaboral.CertificadoVacaciones;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Helpers.ImageUrls;

public class ModeloCertificadoVacaciones {

	private final String document = "SOLICITUD DE PERMISO POR VACACIONES.docx";
	private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	private String[] urls = {
			"SOLICITUD DE PERMISO POR VACACIONES.jpg"
	};
	
	public ModeloCertificadoVacaciones() {
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
