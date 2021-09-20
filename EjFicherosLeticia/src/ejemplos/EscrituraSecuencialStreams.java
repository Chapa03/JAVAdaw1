package ejemplos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class EscrituraSecuencialStreams {
	public static void escribirEnFicheroSecuencial(String file, String textoAEscribir) {
		
		OutputStream oStream=null;
		
		try {	
				oStream= new FileOutputStream(file);
				oStream.write(textoAEscribir.substring(0,20).concat("\n").toUpperCase().getBytes(),0,21);
				
				oStream.write(textoAEscribir.getBytes(),0, textoAEscribir.length());			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
