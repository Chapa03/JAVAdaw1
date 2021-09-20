package control;

import java.util.List;

import modelo.clases.Poblacion;
import modelo.dao.PoblacionDAO;

public class Main {

	public static void main(String[] args) {
		String ficheroLectura = "files/listadoCercaniasEstaciones.csv";
		String ficheroPoblaciones = "files/Poblaciones.txt";
		
//		-------------------LECTURADEUNAVEZ.LECTURAALISTA----
//		creamos una lista donde almacenar el retorno del metodo
//		de lectura a lista
		List<String> listaEstaciones = null;
		listaEstaciones = LecturaDeUnaVez.lecturaALista(ficheroLectura);
		
//		EJERCICIO 3a: Mostrar el contenido del fichero por consola.
		System.out.println("\nLECTURA FICHERO DESDE UNA LISTA:");
		for (String s : listaEstaciones) {
			System.out.println(s);
		}
//		-----------------------------------------------------
		System.out.println();
		
//		-----------------------ESCRITURACONVERTIDA.ESCRITURADESDELISTA-
		List<String> textoLeidoYEscrito = null;
		EscrituraConvertida.escrituraDesdeLista(ficheroLectura, ficheroPoblaciones);
//		---------------------------------------------------------------
		
		System.out.println("Lectura del nuevo fichero generado de Poblaciones:");
		List<String> poblacionesLeidas = null;
		poblacionesLeidas = LecturaDeUnaVez.lecturaALista(ficheroPoblaciones);
		for (String s : poblacionesLeidas) {
			System.out.println(s);
		}
		
		
		PoblacionDAO.insertarPoblacionAI(new Poblacion (0, "torrejon", "madrid"));
		List<Poblacion> listaP= PoblacionDAO.seleccionarPoblacion();
		for (Poblacion p: listaP) {
			System.out.println("- "+ p.getNombrePoblacion());
		}

	}

}
