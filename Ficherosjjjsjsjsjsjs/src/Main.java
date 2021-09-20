import java.util.List;

public class Main {
	
	

	public static void main(String[] args) {
//		1. Empezamos almacenando la direccion del fichero al que
//		queremos acceder en el string fichero
//		Como vamos a hacer una lectura por bytes
//		LECTURA POR BYTES
		String fichero = "files/aplicacionesIniciales.csv";
		String ficheroAeropuertos = "files/aeropuertos.csv";
		String ficheroNuevoAeropuertos = "files/aeropuertosConversion.txt";
		
//		---------------LECTURADEUNAVEZ.LECTURAPORBYTES------
//		array de bytes donde almacenaremos el return de la lectura
//		por bytes y llamada al metodo de lectura por bytes
		byte[] textoLeido;	
		textoLeido = LecturaDeUnaVez.lecturaPorBytes(fichero);
		
//		Lectura del contenido del array de bytes teniendo
//		que convertir los datos a char para poder leerlos
		System.out.println("LECTURA FICHERO POR BYTES:");
		for (byte b : textoLeido) {
			System.out.print("" + (char)b);
		}
		System.out.println();
//		----------------------------------------------------
		
		
//		-------------------LECTURADEUNAVEZ.LECTURAALISTA----
//		creamos una lista donde almacenar el retorno del metodo
//		de lectura a lista
		List<String> textoLeidoLista = null;
		textoLeidoLista = LecturaDeUnaVez.lecturaALista(fichero);
		
//		Mostramos la lista obtenida desde el fichero
		System.out.println("\nLECTURA FICHERO DESDE UNA LISTA:");
		for (String s : textoLeidoLista) {
			System.out.println(s);
		}
//		-----------------------------------------------------
		
//		--------------------ESCRITURA SECUENCIAL CON STREAMS--------
//		string que queremos escribir
		String paraEscribir = "e3e4e1eeeeeeeyyyyyyyyyyyyyyyquepasa"
				+ "\nsegunda línea con espacios y tildes a ver que pasa"
				+ "\ntercera línea";
//		llamada al metodo con el fichero que queremos escribir
//		y el string que vamos a escribir
//		EscrituraSecuencialStreams.escrituraSecuencial(fichero, paraEscribir);
//		------------------------------------------------------------
		
//		-----------------------ESCRITURACONVERTIDA.ESCRITURADESDELISTA-
		List<String> textoLeidoYEscrito = null;
		EscrituraConvertida.escrituraDesdeLista(ficheroAeropuertos, ficheroNuevoAeropuertos);
//		---------------------------------------------------------------
		
		System.out.println("Lectura del nuevo fichero generado de aeropuertos:");
		List<String> aeropuertosLeidos = null;
		aeropuertosLeidos = LecturaDeUnaVez.lecturaALista(ficheroNuevoAeropuertos);
		for (String s : aeropuertosLeidos) {
			System.out.println(s);
		}
	
		
//		NO FUNCIONA------------ESCRITURABUFFER.ESCRIBIR----------------
//		Escritura en fichero con el buffer (EscrituraBuffer)
//		SE BORRA EL CONTENIDO DEL FICHERO
//		String[] paraEscribir1 = {"hola", "quetal", "comolollevas", "quetalvas"};
//		EscrituraBuffer.escribir(fichero, paraEscribir1);
//		-------------------------------------------------------------
		
	}

}
