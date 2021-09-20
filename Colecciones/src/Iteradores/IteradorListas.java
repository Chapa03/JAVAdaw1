package Iteradores;
import java.util.*;

public class IteradorListas {
	static String[] ciudadesEspana = {"Madrid", "Barcelona", "Sevilla", "Leon", "Barajas", "Burgo de Osma"};
	static List<Ciudad> listaCiudades = new ArrayList<Ciudad>();
	static List<String> listaC = Arrays.asList(ciudadesEspana);
	
	private static void inicializacionCiudades() {
		Iterator it = listaC.iterator();
		int cod = 1;
		while (it.hasNext()) {
//			listaCiudades.add(new Ciudad(cod++, it.next(), "Espana"));
		}
	}
	
//	inicializacion de aeropuertos
	
		
	public static void main(String[] args) {
		
		
		//Iteradores
		Iterator<String> it = listaC.iterator();
		
//			HAS NEXT pregunta si hay un siguiente elemento. Devuelve booleano
//			NEXT devuelve el valor del siguiente elemento y se situa en el
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collections.sort(listaC);
		System.out.println(listaC);
		
//		Collections.sort(listaCiudades);
		listaCiudades.get(0).compareTo(listaCiudades.get(4));
		System.out.println(listaCiudades);
	}

}