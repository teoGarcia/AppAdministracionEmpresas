package CuartoMedio.LegislacionLaboral.PermisosLaborales.Comprobante;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Helpers.ImageUrls;

public class ModeloComprobante {

	private final String document = "COMPROBANTE DE FERIADO LEGAL O VACACIONES.docx";
	private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	private String[] urls = {
			"MODELO DE CONTRATO HONORARIO_00001.jpg",
			"MODELO DE CONTRATO HONORARIO_00002.jpg",
			"MODELO DE CONTRATO HONORARIO_00003.jpg"
	};
	
	public ModeloComprobante() {
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
