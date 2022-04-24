package CuartoMedio.LegislacionLaboral.Contratos.Modelo;

import java.io.IOException;

public class ModeloVerDocumentos {
	
	private static ModeloVerDocumentos mvd;
	private final String url = "src/DocumentosWord4toMedio/";
	private ProcessBuilder pb = new ProcessBuilder();
	
	private ModeloVerDocumentos() {
		
	}
	
	public static ModeloVerDocumentos getInstance() {
		if(mvd == null) mvd = new ModeloVerDocumentos();
		return mvd;
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


