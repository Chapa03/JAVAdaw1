package clasesEspeciales;

import java.text.Collator;

public class Cadenas {

	public static void main(String[] args) {
//		la siguiente linea es igual a String s = "cadena"; pero java nos
//		permite simplificar las instancias de la clase String debido a su uso.
		String s = new String("cadena");
		System.out.println(s.toUpperCase());
		s = "1234";
		int ent = 0;
//		el parseo es la conversion de tipos
		ent = Integer.parseInt(s);
		System.out.println(ent + 89);
		String s1 = "usa";
		String s2 = "uña";
//		comparacion independientemente de las mayus y minus
		System.out.println(s1.equalsIgnoreCase(s2));
//		comparacion de cadenas alfabeticamente hablando. Nos devuelve un entero negativo si la cadena
//		con la que llamamos es MENOR que la que le pasamos por parametro en longitud o en diferencia
//		de posiciones en la tabla unicode. si son iguales, devuelve un 0.
		System.out.println(s1.compareTo(s2));
		
//		algunas clases requieren del metodo getInstance para instanciar la clase.
		Collator c = Collator.getInstance();
		System.out.println(c.compare(s1, s2));
		
	}

}
