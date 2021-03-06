package CuartoMedio.LegislacionLaboral.Contratos.Honorarios;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Helpers.ImageUrls;

public class ModeloHonorarios {

	private final String document = "MODELO DE CONTRATO HONORARIO.docx";
	private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	private String[] urls = {
			"MODELO DE CONTRATO HONORARIO_00001.jpg",
			"MODELO DE CONTRATO HONORARIO_00002.jpg",
			"MODELO DE CONTRATO HONORARIO_00003.jpg"
	};
	
	public ModeloHonorarios() {
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
