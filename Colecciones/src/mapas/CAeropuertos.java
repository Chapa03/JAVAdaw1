package mapas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class CAeropuertos {
	
	public static void main(String[] args) {
//		Insertar 3 entradas en cada map
		Map<String, String> codigosIacc = new HashMap<String, String>();
		Map<Integer, String> codEntero = new HashMap<Integer, String>();
		Map<String, Aeropuerto> mapAeropuertos = new HashMap<String, Aeropuerto>();
		
		codigosIacc.put("GCLP", "Gran Canaria Airport");
		codigosIacc.put("LEJR", "Jerez Airport");
		codigosIacc.put("LEIB", "Ibiza Airport");
		
		codEntero.put(61, "Fuerteventura Airport");
		codEntero.put(75, "Santander Airport");
		codEntero.put(84, "Oulu Airport");
		
		mapAeropuertos.put("BER", new Aeropuerto("Berlin Brandeburgo Airport", "Alemania", "EDDB"));
		mapAeropuertos.put("MAD", new Aeropuerto("Madrid Barajas Airport", "Madrid", "LEMD"));
		mapAeropuertos.put("MAD", new Aeropuerto("Madrid Barajas Airport", "Madrid", "LEMD"));
		
//		el get() del objeto va a ir al toString() de la clase
		System.out.println(mapAeropuertos.get("BER"));
		
//		iterar sobre cada uno de los maps 
//		- obtener los valores de cada entrada
//		- obtener las claves de cada entrada
//		- obtener un conjunto por los paises que tenemos a partir de mapAeropuertos
		
		System.out.println("FOREACH de los tres mapas de aeropuertos:");
		codigosIacc.forEach((k,v) -> System.out.println("IACC: " + k + " - Aeropuerto: " + v));
		codEntero.forEach((k, v) -> System.out.println("Codigo en listado: " + k + " - Aeropuerto: " + v));
		mapAeropuertos.forEach((k, v) -> System.out.println("IANA: " + k + " - " + v));
		
//		conjunto a partir de mapAeropuertos
		Set conjAeropuertos = new HashSet();
		conjAeropuertos = mapAeropuertos.entrySet();
		
//		imprimir el conjunto con un iterator
		System.out.println("Impresion del conjunto conjAeropuertos de mapAeropuertos:");
		Iterator it = conjAeropuertos.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
