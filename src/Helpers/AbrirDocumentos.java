package Helpers;

import java.beans.BeanProperty;
import java.io.IOException;

public class AbrirDocumentos {
	
	private static AbrirDocumentos ad;
	private ProcessBuilder pb = new ProcessBuilder();
	
	private AbrirDocumentos() {
		
	}
	
	public static AbrirDocumentos getInstance() {
		if(ad == null) ad = new AbrirDocumentos();
		return ad;
	}
	
	
	public void VerDocumento(Urls url, String document) {
		String path = url+document;

		pb.command("cmd.exe", "/c", path);
		try {
			pb.start();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public enum Urls {
		
		url4Doc("src/CuartoMedio/Resource/Word/"),
		url4Exc("src/CuartoMedio/Resource/Excel/"),
		url1PDF("src/CuartoMedio/Resource/PDF/"),
		url3Doc("src/TerceroMedio/Resources/Word/"),
		url3Exc("FOUR");

	    private final String url;

	    /**
	     * @param text
	     */
	    Urls(final String url) {
	        this.url = url;
	    }

	    /* (non-Javadoc)
	     * @see java.lang.Enum#toString()
	     */
	    @Override
	    public String toString() {
	        return url;
	    }
	}

}


