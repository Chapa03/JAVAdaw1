package conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetBasico {

	public static void main(String[] args) {
		Set<Integer> conjunto = new HashSet<Integer>();
		
		for (int i = 0; i < 25; i++) {
			conjunto.add(i);
		}
		
		conjunto.add(12);
		
//		tamanio del conjunto?? contiene un valor??
		System.out.println(conjunto.size());
		System.out.println(conjunto.isEmpty());
		System.out.println("45 esta?? " + conjunto.contains(45) + " - y 20?? " + conjunto.contains(20));
		
//		recorrido de todo el conjunto
		System.out.println("Iterando");
		Iterator<Integer> i = conjunto.iterator();
		while(i.hasNext()) {
			System.out.println("- " + i.next());
		}
		System.out.println();
		
//		recorremos con expresion lambda
		conjunto.forEach(k->System.out.println("." + k));
		
//		la expresion anterior es qeuivalente al for each
		for (int elemento:conjunto) {
			System.out.println("*" + elemento);
		}
	}

}
