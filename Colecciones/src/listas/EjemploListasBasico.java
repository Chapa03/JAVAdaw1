package listas;

import java.util.ArrayList;
import java.util.Collections;

public class EjemploListasBasico {

	public static void main(String[] args) {
//		Declaracion
//		Al llamar al constructor, no tenemos que darle tamanio,
//		como si teniamos que hacer en los arrays
//		El tamanio ademas es dinamico. Segun vamos aniadiendo o 
//		borrando elementos, la longitud del arraylist cambia
		ArrayList<String> primLista = new ArrayList<String>();
		
//		Insertar elementos
		primLista.add("uno");
		primLista.add("dos");
		primLista.add("tres");
		primLista.add("cuatro");
		primLista.add("uno");
//		primLista.add(3);
//		primLista.add(34);
		
//		Elimina el contenido anterior por el nuevo que le demos
		primLista.set(0,  "nuevo");
		
		System.out.println(primLista.indexOf("tres"));
		
		System.out.println("Escritura directa: ");
		System.out.println(primLista);

//		Recorrido (FOR EACH)
		for (String s: primLista) {
			System.out.print(s + " : ");
		}
		System.out.println();
		
//		Ordenacion
		Collections.sort(primLista);
		
//		Eliminacion de un objeto
		primLista.remove(3);
//		en este caso elimina solo la primera ocurrencia del elemento
		primLista.remove("uno");
		
		System.out.println("Longitud lista: " + primLista.size());
		System.out.println("Ultimo elemento: " + primLista.get(primLista.size() - 1));
		
		for (int i = 0; i < primLista.size(); i++) {
			System.out.print(primLista.get(i) + ", ");
		}
		System.out.println();
		
//		Busqueda de elementos
		System.out.println("Contiene el elemento? " + primLista.contains("cuatro"));
		
//		Desordenar
		Collections.shuffle(primLista);
		System.out.println(primLista);
		
//		Invertir
		Collections.reverse(primLista);
		System.out.println(primLista);
	}

}
