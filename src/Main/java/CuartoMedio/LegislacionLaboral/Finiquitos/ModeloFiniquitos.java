package main.java.CuartoMedio.LegislacionLaboral.Finiquitos;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import main.java.Helpers.ImageUrls;

public class ModeloFiniquitos {

	private final String document = "MODELO DE FINIQUITO DE CONTRATO.docx";
	private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	private String[] urls = {
			"MODELO DE FINIQUITO DE CONTRATO_00001.jpg"
	};
	
	public ModeloFiniquitos() {
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
