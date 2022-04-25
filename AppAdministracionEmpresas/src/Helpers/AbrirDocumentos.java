package Helpers;

import java.io.IOException;

public class AbrirDocumentos {
	
	private static AbrirDocumentos ad;
	private final String url = "src/DocumentosWord4toMedio/";
	private ProcessBuilder pb = new ProcessBuilder();
	
	private AbrirDocumentos() {
		
	}
	
	public static AbrirDocumentos getInstance() {
		if(ad == null) ad = new AbrirDocumentos();
		return ad;
	}
	
	public void VerDocumento(String document) {
		String path = url+document;
		pb.command("cmd.exe", "/c", path);
		try {
			pb.start();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
