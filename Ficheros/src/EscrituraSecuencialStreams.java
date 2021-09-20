import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EscrituraSecuencialStreams {
	
	public static void escrituraSecuencial(String file, String textoAEscribir) {
//		variable que se encargara de escribir en el fichero
		OutputStream oStream = null;
		
		try {
//			cuando generamos esta primera linea en la que vamos a 
//			inicializar nuestro objeto oStream vinculandolo al
//			fichero en el que queremos escribir, eclipse nos sugiere
//			introducirla en un bloque try/catch
			oStream = new FileOutputStream(file);
//			esta es la orden de escritura.
//			String pasado a bytes, indice inicial e indice final del string
			oStream.write(textoAEscribir.getBytes(), 0, textoAEscribir.length());

//			ejemplo en el que se modifica el String dado con la misma
//			sentencia de escritura:
//			oStream.write(textoAEscribir.substring(3,20).concat("\n").toUpperCase().getBytes(),0,18);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
