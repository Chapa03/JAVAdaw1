package ejemplos;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		String fichero="Files/Ejem.txt";
		byte[] textoLeido;
		
		textoLeido=LecturaDeUnaVez.lecturaBytes(fichero);
		String s=textoLeido.toString();
		System.out.println(s);
		LecturaDeUnaVez.lecturaLista();
		
		String textoAEscribir="Esto es lo que quiero que escribas en el fichero. \nY una segunda fila";
		LecturaSecuencialStreams.LecturaPorCaracteresStream("Files/Ejem.txt");
		EscrituraSecuencialStreams.escribirEnFicheroSecuencial("Files/nuevo.txt", textoAEscribir);
		String s1=LecturaBuffer.lecturaPorCaracteres("Files/copia.txt");
		System.out.println(s1);
		List<String> miListaLineas= new ArrayList<String> ();
		
		
	}
	
}
