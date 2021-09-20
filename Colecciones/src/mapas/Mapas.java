package mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapas {

	public static void main(String[] args) {
//		Definicion de hashmap indicando el tipo de contenido y de clave
		Map<String, String> global = new HashMap<String, String>();
		
//		insertar valores "key" - "value" al hashmap
		global.put("Laura", "667895789");
		global.put("Pepe", "667357789");
		global.put("Abelardo", "627555789");
		global.put("Daniel", "567777789");
		global.put("Arturo", "127880739");
		global.put("Arturo", "127880739");
		global.put("Arturo", "127880738");
		
//		imprimir el contenido del hashmap
		System.out.println(global);
		
//		recoger valor especifico con su clave
		System.out.println("El numero de PEPE es: " + global.get("Pepe"));

//		si se inserta algo con la misma clave, se sobrescribe el valor
		global.put("Laura", "654");
		System.out.println("Hashmap con laura actualizada: " + global);
		
//		tamanio de la hashmap
		System.out.println("Tamanio de la hash map: " + global.size());
		
//		booleano de si esta vacia o no
		System.out.println("La hashmap esta vacia?: " + global.isEmpty());
		
//		borrando a pepe de la tabla
//		remove te devuelve el valor que esta borrando
//		null si esa clave no existe
		System.out.println(global.remove("Pepe"));
		
//		containskey busca por la clave que le demos y nos arroja un booleano
		System.out.println("Existe Pepe?: " + global.containsKey("Pepe") + " - Existe Daniel?: " + global.containsKey("Daniel"));
		
//		contanisvalue busca por el valor que le demos y nos arroja un booleano
		System.out.println("Existe el numero 654? " + global.containsValue("654"));
		
		
//		Definir Iterador para extraer o imprimir valores
		for (Iterator<String> it = global.keySet().iterator(); it.hasNext();) {
			String s = (String) it.next();
			String s1 = (String) global.get(s);
			System.out.println("Alumno: " + s + " - " + "Telefono: " + s1);
		}
		
//		foreach con expresiones lambda
		global.forEach((k, v) -> System.out.println("Clave: " + k + " - Valor: " + v));
		
//		Generacion de una lista a partir de los valores de un map
//		values() devuelve una coleccion con los valores del map
		Collection<String> globalCollection = new ArrayList<String>(global.values());
		System.out.println("Escritura del arrayList a partir de los valores de global " + globalCollection);
		
//		generacion de un conjunto a partir de los valores de un map
//		entrySet() nos devuelve el conjunto de los valores de un map
		Set conjunto = new HashSet();
		conjunto = global.entrySet();
		Iterator it = conjunto.iterator();
		System.out.println("Impresion del conjunto con iterador:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
