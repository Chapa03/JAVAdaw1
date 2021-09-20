package ejemplos;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LecturaDeUnaVez {
	
	//Lectura de un fichero completo obteniendo un array de bytes
	public static byte[] lecturaBytes(String file) {
		byte[] textoLeido=null;
		Path fichero= Paths.get(file);
		try {
			textoLeido=Files.readAllBytes(fichero);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (byte b: textoLeido) {
			System.out.print(""+ (char)b);
		}
		
		return textoLeido;
	}
	
	
	//Lectura de fichero completo obteniendo una lista de Strings
	public static void lecturaLista() {
		List<String> textoLista=null;
			
		Charset charset1=StandardCharsets.ISO_8859_1; 
		Charset charset2=StandardCharsets.UTF_8; 
		
		Path ficheroLectura= Paths.get("Files/aeropuertos.csv");
		Path fichEscritura= Paths.get("Files/copia.txt");
		Path fichEscAero= Paths.get("Files/copiaAerop.txt");
		
		
		try {
			textoLista= Files.readAllLines(ficheroLectura, charset1);
			
			Files.write(fichEscritura, textoLista, charset2);
			
			Files.write(fichEscAero,Conversiones.obtListaStrings(Conversiones.convertirTexto(textoLista)), charset2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(textoLista);
		
		 // for (String s: textoLista) { System.out.println(s); }
		 
		
		
	}
}
