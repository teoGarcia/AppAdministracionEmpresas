package Helpers;

import java.io.IOException;

public class AbrirDocumentos {
	
	public void VerDocumento(String Url) {
		
		ProcessBuilder pb = new ProcessBuilder();
		pb.command("cmd.exe", "/c", Url);
		
		
		try {
			pb.start();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
