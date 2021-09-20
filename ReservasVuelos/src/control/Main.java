package control;

import java.util.*;

import modelo.Aeropuerto;
import modelo.Ciudad;
import modelo.Viaje;

public class Main {
	static String[] ciudadesEspana = {"Madrid", "Barcelona", "Sevilla", "Leon", "Barajas", "Burgo de Osma"};
	static List<Ciudad> listaCiudades = new ArrayList<Ciudad>();
	static List<String> listaC = Arrays.asList(ciudadesEspana);
	static List<Aeropuerto> aeropuertos = new ArrayList<Aeropuerto>();
	static Iterator<String> it = listaC.iterator();
	static Set<Viaje> viajesPlanificados = new HashSet<Viaje>();
	
	private static void inicializacionCiudades() {
		Iterator<String> it = listaC.iterator();
		int cod = 1;
		while (it.hasNext()) {
			listaCiudades.add(new Ciudad(cod++, it.next(), "Espana"));
		}
	}
	
//	inicializacion aeropuertos
	private static void inicializarAeropuertos() {
		aeropuertos.add(new Aeropuerto("0", "1", "Barajas", listaCiudades.get(0)));
		aeropuertos.add(new Aeropuerto("0", "1", "Prat", listaCiudades.get(1)));
		aeropuertos.add(new Aeropuerto("0", "1", "Rosalia de Castro", listaCiudades.get(2)));
		aeropuertos.add(new Aeropuerto("0", "1", "Costa del sol", listaCiudades.get(3)));
	}
	
//	inicializacion de viajes
	private static void inicializarViajes() {
		viajesPlanificados.add(new Viaje(aeropuertos.get(0), aeropuertos.get(1)));
	}

	public static void main(String[] args) {
//		HAS NEXT pregunta si hay un siguiente elemento. Devuelve booleano
//		NEXT devuelve el valor del siguiente elemento y se situa en el
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collections.sort(listaC);
		System.out.println(listaC);
		
		inicializacionCiudades();
		Collections.sort(listaCiudades);
		listaCiudades.get(0).compareTo(listaCiudades.get(4));
		System.out.println(listaCiudades);
		
		inicializarAeropuertos();
		Collections.sort(aeropuertos);
		System.out.println(aeropuertos);
		
		

	}

}
