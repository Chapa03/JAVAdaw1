package sala;

import java.util.*;

public class Main {
	static String[] ciudadesEspana = {"Madrid, Sevilla, Barcelona, Leon, Barajas, Burgo de Osma"};
	
	public static void main(String[] args) {
		List<String> listaC = Arrays.asList(ciudadesEspana);
		
		//Iteradores
		Iterator<String> it = listaC.iterator();
		
//		HAS NEXT pregunta si hay un siguiente elemento. Devuelve booleano
//		NEXT devuelve el valor del siguiente elemento y se situa en el
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	

	}

}
