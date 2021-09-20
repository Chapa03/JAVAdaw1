package ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LecturaBuffer {
//	generamos los charset para que lo utilicen los dos metodos
	static Charset charset1=StandardCharsets.ISO_8859_1; 
	static Charset charset2=StandardCharsets.UTF_8; 
	
//	-------------LECTURA POR CARACTERES-----------------------
//	obtenemos la lectura en un string
	public static String lecturaPorCaracteres(String fichero) {
		String textoLeido="";
		Path file=Paths.get(fichero);
		BufferedReader iBuffer=null;
		int car=0;
		
		try {
			iBuffer=Files.newBufferedReader(file, charset1);
			while ((car=iBuffer.read())!=-1) {
				textoLeido+=(char)car;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return textoLeido;
		
	}
	
//	-------------------------LECTURA POR LINEAS-----------------
//	obtenemos las lineas leidas para almacenarlas en una lista
	public static List<String> lecturaPorLineas(String fichero) {
		Path file=Paths.get(fichero);
		BufferedReader iBuffer=null;
		List<String> listaTextoLeido= new ArrayList<String>();
		String linea;
		
		try {
			iBuffer=Files.newBufferedReader(file, charset1);
			while ((linea=iBuffer.readLine())!=null) {
				listaTextoLeido.add(linea);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaTextoLeido;
		
	}
}
