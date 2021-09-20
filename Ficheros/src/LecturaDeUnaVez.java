import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LecturaDeUnaVez {
//	-------------------------------- LECTURA POR BYTES
//	La lectura es completa
//	El resultado lo vamos a guardar en un array de bytes
//	El argumento que recibe es la direccion del fichero
	public static byte[] lecturaPorBytes(String file) {
		byte[] textoLeido = null;
		
//		La variable fichero de tipo PATH se encarga de gestionar 
//		el directorio, el link o el fichero cuya direccion
//		le estamos indicando a traves de los argumentos del metodo
		Path fichero = Paths.get(file);
		
		try {
//			cuando generamos esta linea eclipse nos propone en un
//			try/catch para el manejo de excepciones
//			Estamos almacenando en el array de bytes la lectura
//			por bytes del fichero
			textoLeido = Files.readAllBytes(fichero);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return textoLeido;
	}
	
//	---------------------- LECTURA POR LINEAS A LISTA DE STRINGS
//	lectura completa del fichero y almacenamos en una lista
//	de strings
//	Cada linea sera un string diferente
	public static List<String> lecturaALista(String file) {
//		Lista donde vamos a almacenar los Strings
		List<String> textoLista=null;
		
//		Codificacion para la lectura y escritura de archivos
		Charset charset1 = StandardCharsets.UTF_8;
		Charset charset2 = StandardCharsets.ISO_8859_1;
		
//		obtenemos la el fichero, directorio o link en la variable tipo Path
		Path fichero = Paths.get(file);
//		segundo archivo para probar la escritura
		Path ficheroEscritura = Paths.get("files/primerEscrito.txt");
		
		try {
//			lectura y almacenamiento del contenido del fichero por
//			lineas en la lista textoLista
			textoLista = Files.readAllLines(fichero, charset2);
//			Probando la escritura de lo leido en un nuevo archivo 
			Files.write(ficheroEscritura, textoLista, charset2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return textoLista;
	}
	
}























