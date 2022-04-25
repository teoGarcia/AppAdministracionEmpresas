package CuartoMedio.LegislacionLaboral.Contratos.PlazoFijo;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Helpers.ImageUrls;

public class ModeloPlazoFijo {

	private final String document = "MODELO DE CONTRATO PLAZO FIJO.doc";
	private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	private String[] urls = {
			"MODELO DE CONTRATO HONORARIO_00001.jpg",
			"MODELO DE CONTRATO HONORARIO_00002.jpg"
	};
	
	public ModeloPlazoFijo() {
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
