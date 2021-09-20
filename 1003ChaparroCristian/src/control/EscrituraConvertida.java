package control;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EscrituraConvertida {
	public static void escrituraDesdeLista(String readFile, String writeFile) {
//		Lista donde vamos a almacenar los Strings
		List<String> textoLista=null;
		
//		Codificacion para la lectura y escritura de archivos
		Charset charset1 = StandardCharsets.UTF_8;
		Charset charset2 = StandardCharsets.ISO_8859_1;
		
//		obtenemos la el fichero, directorio o link en la variable tipo Path
		Path fichero = Paths.get(readFile);
//		segundo archivo para probar la escritura
		Path ficheroEscritura = Paths.get(writeFile);
		
		try {
//			lectura y almacenamiento del contenido del fichero por
//			lineas en la lista textoLista
			textoLista = Files.readAllLines(fichero, charset2);
//			Escribiendo en el fichero 
			Files.write(ficheroEscritura, Conversiones.obtenerListaStrings(Conversiones.convertirTexto(textoLista)), charset2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
