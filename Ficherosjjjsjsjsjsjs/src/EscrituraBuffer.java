import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscrituraBuffer {
//	creamos las variables charset para poder utilizarlas en los metodos de la clase
	static Charset charset1 = StandardCharsets.ISO_8859_1;
	static Charset charset2 = StandardCharsets.UTF_8;
	
	public static void escribir(String file, String[] textoAEscribir) {
//		Almacenamos la ruta del fichero a escribir
//		en la variable de tipo Path
//		Si el fichero no existe a la hora de escribir sobre el
//		se creara uno con el nombre y ruta especificado en la variable tipo Path
		Path fichero = Paths.get(file);
		
//		Creamos la variable writer de tipo BufferedWriter
//		que nos va a permitir ir escribiendo en nuestro
//		fichero por lineas
		BufferedWriter writer = null;
		
		try {
//			Cuando generamos esta linea, eclipse nos propone
//			meterla dentro de un try/catch para el contro de excepciones
//			Aqui ya estamos haciendo la conexion del bufer con el fichero
//			y dandole la configuracion del charset
			writer = Files.newBufferedWriter(fichero, charset2);
			for (int i = 0; i < textoAEscribir.length; i++) {
				writer.write(textoAEscribir[i], 0, textoAEscribir[i].length());
				if (i < textoAEscribir.length - 1)
					writer.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
