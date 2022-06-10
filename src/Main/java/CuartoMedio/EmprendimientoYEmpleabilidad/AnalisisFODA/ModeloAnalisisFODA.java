package main.java.CuartoMedio.EmprendimientoYEmpleabilidad.AnalisisFODA;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import main.java.Helpers.ImageUrls;

public class ModeloAnalisisFODA {

	private final String document = "ANALISIS DAFO O FODA.xlsx";
	private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	private String[] urls = {
			"SOLICITUD DE PERMISO POR VACACIONES.jpg"
	};
	
	public ModeloAnalisisFODA() {
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
