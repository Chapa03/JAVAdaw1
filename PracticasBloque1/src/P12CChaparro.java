
public class P12CChaparro {

	public static void main(String[] args) {
//		Partiendo de tres variables tipo String s1, s2 y s3:
//			Realizar una expresion que de verdadero si:

		String s1, s2, s3;
		char chars1, chars2;
		boolean pruebas;
		
		s1 = "Cerro";
		s2 = "Vendaval";
		s3 = "7398";
		
//		s1 y s2 son iguales
		pruebas = (s1.equals(s2));
		System.out.println(" - s1 y s2 son iguales? " + pruebas);
		
//		el segundo caracter de s1 es el mismo que el segundo de s2
		chars1 = s1.charAt(1);
		chars2 = s2.charAt(1);
		String mismoChar = (chars1 == chars2 ? (" - El segundo caracter de s1 y s2 es igual? true. La \'" + chars1 + "\' y la \'" + chars2 + "\' son iguales.") :
			(" - El segundo caracter de s1 y s2 es igual? false. La \'" + chars1 + "\' y la \'" + chars2 + "\' no son iguales."));
		System.out.println(mismoChar);
		
//		s1 es menor si ordenamos alfabeticamente hablando que s2
		boolean resultado = false;
		resultado = s1.compareTo(s2) < 0 ? true : false;
		System.out.println(resultado);
		
//		chars1 = s1.charAt(0);
//		chars2 = s2.charAt(0);
//		String orden = (chars1 < chars2 ? (" - s1 va antes en el abecedario que s2? true. La \'" + chars1 + "\' va antes que la \'" + chars2 + "\' en el abecedario.") :
//			(" - s1 va antes en el abecedario que s2? false. La \'" + chars1 + "\' va despues que la \'" + chars2 + "\' en el abecedario."));
//		System.out.println(orden);
//		
		System.out.println("Se muestra la variable s3: " + s3);
				
	}

}
