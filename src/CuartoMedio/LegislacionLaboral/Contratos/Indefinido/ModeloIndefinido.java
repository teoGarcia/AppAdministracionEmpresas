package CuartoMedio.LegislacionLaboral.Contratos.Indefinido;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Helpers.ImageUrls;

public class ModeloIndefinido {

	private final String document = "MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1.docx";
	private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	private String[] urls = {
			"MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1_00001.jpg", 
			"MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1_00002.jpg",
			"MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1_00003.jpg",
			"MODELO DE CONTRATO DE TRABAJO INDEFINIDO 1_00004.jpg"	
	};
	
	public ModeloIndefinido() {
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
